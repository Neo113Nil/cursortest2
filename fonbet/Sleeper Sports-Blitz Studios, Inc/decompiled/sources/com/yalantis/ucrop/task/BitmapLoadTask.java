package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.yalantis.ucrop.OkHttpClientStore;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* loaded from: classes8.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final WeakReference<Context> mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(Bitmap bitmap, ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }

    public BitmapLoadTask(Context context, Uri uri, Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = new WeakReference<>(context);
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i;
        this.mRequiredHeight = i2;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public BitmapWorkerResult doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = this.mContext.get();
        if (context == null) {
            return new BitmapWorkerResult(new NullPointerException("context is null"));
        }
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        BitmapLoadUtils.close(openInputStream);
                    }
                } catch (IOException e) {
                    Log.e(TAG, "doInBackground: ImageDecoder.createSource: ", e);
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e));
                } catch (OutOfMemoryError e2) {
                    Log.e(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: ", e2);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                }
                BitmapLoadUtils.close(openInputStream);
                if (!checkSize(bitmap, options)) {
                    z = true;
                }
            }
            if (bitmap == null) {
                return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
            }
            int exifOrientation = BitmapLoadUtils.getExifOrientation(context, this.mInputUri);
            int exifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
            int exifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
            ExifInfo exifInfo = new ExifInfo(exifOrientation, exifToDegrees, exifToTranslation);
            Matrix matrix = new Matrix();
            if (exifToDegrees != 0) {
                matrix.preRotate(exifToDegrees);
            }
            if (exifToTranslation != 1) {
                matrix.postScale(exifToTranslation, 1.0f);
            }
            if (!matrix.isIdentity()) {
                return new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmap, matrix), exifInfo);
            }
            return new BitmapWorkerResult(bitmap, exifInfo);
        } catch (IOException | NullPointerException e3) {
            return new BitmapWorkerResult(e3);
        }
    }

    private void processInputUri() throws NullPointerException, IOException {
        Log.d(TAG, "Uri scheme: " + this.mInputUri.getScheme());
        if (isDownloadUri(this.mInputUri)) {
            try {
                downloadFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e) {
                Log.e(TAG, "Downloading failed", e);
                throw e;
            }
        }
        if (isContentUri(this.mInputUri)) {
            try {
                copyFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e2) {
                Log.e(TAG, "Copying failed", e2);
                throw e2;
            }
        }
        if (isFileUri(this.mInputUri)) {
            return;
        }
        String scheme = this.mInputUri.getScheme();
        Log.e(TAG, "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    private void copyFile(Uri uri, Uri uri2) throws NullPointerException, IOException {
        InputStream inputStream;
        OutputStream fileOutputStream;
        Log.d(TAG, "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        Context context = this.mContext.get();
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                if (isContentUri(uri2)) {
                    fileOutputStream = context.getContentResolver().openOutputStream(uri2);
                } else {
                    fileOutputStream = new FileOutputStream(new File(uri2.getPath()));
                }
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        BitmapLoadUtils.close(fileOutputStream);
                        BitmapLoadUtils.close(inputStream);
                        this.mInputUri = this.mOutputUri;
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                BitmapLoadUtils.close(null);
                BitmapLoadUtils.close(inputStream);
                this.mInputUri = this.mOutputUri;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private void downloadFile(Uri uri, Uri uri2) throws NullPointerException, IOException {
        Closeable closeable;
        Response response;
        OutputStream fileOutputStream;
        Log.d(TAG, "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.mContext.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        OkHttpClient client = OkHttpClientStore.INSTANCE.getClient();
        BufferedSource bufferedSource = null;
        try {
            Response execute = client.newCall(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                BufferedSource source = execute.body().getSource();
                try {
                    if (isContentUri(this.mOutputUri)) {
                        fileOutputStream = context.getContentResolver().openOutputStream(uri2);
                    } else {
                        fileOutputStream = new FileOutputStream(new File(uri2.getPath()));
                    }
                    if (fileOutputStream != null) {
                        Sink sink = Okio.sink(fileOutputStream);
                        source.readAll(sink);
                        BitmapLoadUtils.close(source);
                        BitmapLoadUtils.close(sink);
                        if (execute != null) {
                            BitmapLoadUtils.close(execute.body());
                        }
                        client.dispatcher().cancelAll();
                        this.mInputUri = this.mOutputUri;
                        return;
                    }
                    throw new NullPointerException("OutputStream for given output Uri is null");
                } catch (Throwable th) {
                    th = th;
                    response = execute;
                    closeable = null;
                    bufferedSource = source;
                    BitmapLoadUtils.close(bufferedSource);
                    BitmapLoadUtils.close(closeable);
                    if (response != null) {
                        BitmapLoadUtils.close(response.body());
                    }
                    client.dispatcher().cancelAll();
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                response = execute;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            response = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(BitmapWorkerResult bitmapWorkerResult) {
        if (bitmapWorkerResult.mBitmapWorkerException == null) {
            this.mBitmapLoadCallback.onBitmapLoaded(bitmapWorkerResult.mBitmapResult, bitmapWorkerResult.mExifInfo, this.mInputUri, this.mOutputUri);
        } else {
            this.mBitmapLoadCallback.onFailure(bitmapWorkerResult.mBitmapWorkerException);
        }
    }

    private boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= MAX_BITMAP_SIZE) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private boolean isDownloadUri(Uri uri) {
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    private boolean isContentUri(Uri uri) {
        return uri.getScheme().equals("content");
    }

    private boolean isFileUri(Uri uri) {
        return uri.getScheme().equals("file");
    }
}
