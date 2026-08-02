package id;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import fd.C4279a;
import hd.C4504b;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import jd.AbstractC5130a;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ti.E;
import ti.InterfaceC6480j;
import ti.t;

/* loaded from: classes4.dex */
public class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f49120a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f49121b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f49122c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f49124e;

    /* renamed from: f, reason: collision with root package name */
    public final gd.b f49125f;

    public b(Context context, Uri uri, Uri uri2, int i10, int i11, gd.b bVar) {
        this.f49120a = new WeakReference(context);
        this.f49121b = uri;
        this.f49122c = uri2;
        this.f49123d = i10;
        this.f49124e = i11;
        this.f49125f = bVar;
    }

    public final boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public final void b(Uri uri, Uri uri2) {
        InputStream inputStream;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        Context context = (Context) this.f49120a.get();
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                OutputStream openOutputStream = e(uri2) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        AbstractC5130a.c(openOutputStream);
                        AbstractC5130a.c(inputStream);
                        this.f49121b = this.f49122c;
                        return;
                    }
                    openOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC5130a.c(null);
                AbstractC5130a.c(inputStream);
                this.f49121b = this.f49122c;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = (Context) this.f49120a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f49121b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            i();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = AbstractC5130a.a(options, this.f49123d, this.f49124e);
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z10) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.f49121b);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        AbstractC5130a.c(openInputStream);
                    }
                } catch (IOException e10) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e10);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f49121b + "]", e10));
                } catch (OutOfMemoryError e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e11);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f49121b + "]"));
                }
                AbstractC5130a.c(openInputStream);
                if (!a(bitmap, options)) {
                    z10 = true;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f49121b + "]"));
            }
            int g10 = AbstractC5130a.g(context, this.f49121b);
            int e12 = AbstractC5130a.e(g10);
            int f10 = AbstractC5130a.f(g10);
            C4504b c4504b = new C4504b(g10, e12, f10);
            Matrix matrix = new Matrix();
            if (e12 != 0) {
                matrix.preRotate(e12);
            }
            if (f10 != 1) {
                matrix.postScale(f10, 1.0f);
            }
            return !matrix.isIdentity() ? new a(AbstractC5130a.i(bitmap, matrix), c4504b) : new a(bitmap, c4504b);
        } catch (IOException | NullPointerException e13) {
            return new a(e13);
        }
    }

    public final void d(Uri uri, Uri uri2) {
        Closeable closeable;
        Response response;
        InterfaceC6480j bodySource;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = (Context) this.f49120a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        OkHttpClient a10 = C4279a.f46604b.a();
        InterfaceC6480j interfaceC6480j = null;
        try {
            Response execute = a10.newCall(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                bodySource = execute.body().getBodySource();
            } catch (Throwable th2) {
                th = th2;
                response = execute;
                closeable = null;
            }
            try {
                OutputStream openOutputStream = e(this.f49122c) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                if (openOutputStream == null) {
                    throw new NullPointerException("OutputStream for given output Uri is null");
                }
                E g10 = t.g(openOutputStream);
                bodySource.K1(g10);
                AbstractC5130a.c(bodySource);
                AbstractC5130a.c(g10);
                AbstractC5130a.c(execute.body());
                a10.dispatcher().cancelAll();
                this.f49121b = this.f49122c;
            } catch (Throwable th3) {
                th = th3;
                response = execute;
                closeable = null;
                interfaceC6480j = bodySource;
                AbstractC5130a.c(interfaceC6480j);
                AbstractC5130a.c(closeable);
                if (response != null) {
                    AbstractC5130a.c(response.body());
                }
                a10.dispatcher().cancelAll();
                this.f49121b = this.f49122c;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            response = null;
        }
    }

    public final boolean e(Uri uri) {
        return uri.getScheme().equals("content");
    }

    public final boolean f(Uri uri) {
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    public final boolean g(Uri uri) {
        return uri.getScheme().equals("file");
    }

    @Override // android.os.AsyncTask
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.f49128c;
        if (exc == null) {
            this.f49125f.a(aVar.f49126a, aVar.f49127b, this.f49121b, this.f49122c);
        } else {
            this.f49125f.onFailure(exc);
        }
    }

    public final void i() {
        this.f49121b.getScheme();
        if (f(this.f49121b)) {
            try {
                d(this.f49121b, this.f49122c);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (e(this.f49121b)) {
            try {
                b(this.f49121b, this.f49122c);
                return;
            } catch (IOException | NullPointerException e11) {
                Log.e("BitmapWorkerTask", "Copying failed", e11);
                throw e11;
            }
        }
        if (g(this.f49121b)) {
            return;
        }
        String scheme = this.f49121b.getScheme();
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Bitmap f49126a;

        /* renamed from: b, reason: collision with root package name */
        public C4504b f49127b;

        /* renamed from: c, reason: collision with root package name */
        public Exception f49128c;

        public a(Bitmap bitmap, C4504b c4504b) {
            this.f49126a = bitmap;
            this.f49127b = c4504b;
        }

        public a(Exception exc) {
            this.f49128c = exc;
        }
    }
}
