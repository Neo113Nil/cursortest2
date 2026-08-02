package com.zoho.livechat.android.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.view.View;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import lb.C5444x;
import rd.C6218a;

/* loaded from: classes4.dex */
public enum y {
    INSTANCE;

    private C3946o fileCache;

    public int calculateSize(BitmapFactory.Options options, int i10, int i11, int i12) {
        int ceil;
        int i13 = options.outHeight;
        int i14 = options.outWidth;
        if (i12 > 0) {
            i13 = i14;
            i14 = i13;
        }
        if (i13 > i11 || i14 > i10) {
            ceil = (int) Math.ceil(i13 / i11);
            int ceil2 = (int) Math.ceil(i14 / i10);
            if (ceil <= ceil2) {
                ceil = ceil2;
            }
        } else {
            ceil = 1;
        }
        while ((i14 * i13) / (ceil * ceil) > i10 * i11 * 2) {
            ceil++;
        }
        if (ceil == 1) {
            return 0;
        }
        return ceil;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File checkImageDimension(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (file != null && file.exists() && file.length() > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                options.inInputShareable = false;
                fileInputStream = new FileInputStream(file.getAbsolutePath());
                try {
                    BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
                    WeakReference weakReference = new WeakReference(getBitmapFromDimension(file.getAbsolutePath(), options.outWidth, options.outHeight));
                    File fileFromDisk = getFileFromDisk(str);
                    if (fileFromDisk.exists()) {
                        C3946o.d(fileFromDisk);
                    }
                    C3946o.c(fileFromDisk);
                    fileOutputStream = new FileOutputStream(fileFromDisk.getAbsolutePath());
                    try {
                        try {
                            ((Bitmap) weakReference.get()).compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            C3946o.d(file);
                            try {
                                fileOutputStream.close();
                            } catch (IOException e10) {
                                LiveChatUtil.log(e10);
                            }
                            try {
                                fileInputStream.close();
                            } catch (IOException e11) {
                                LiveChatUtil.log(e11);
                            }
                            return fileFromDisk;
                        } catch (Exception e12) {
                            e = e12;
                            LiveChatUtil.log(e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e13) {
                                    LiveChatUtil.log(e13);
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e14) {
                                    LiveChatUtil.log(e14);
                                }
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e15) {
                                LiveChatUtil.log(e15);
                            }
                        }
                        if (fileInputStream != null) {
                            throw th;
                        }
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (IOException e16) {
                            LiveChatUtil.log(e16);
                            throw th;
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream2 != null) {
                    }
                    if (fileInputStream != null) {
                    }
                }
            } catch (Exception e18) {
                e = e18;
                fileOutputStream = null;
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
        }
        return null;
    }

    public void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            try {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            inputStream.close();
                            outputStream.close();
                            return;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    inputStream.close();
                    outputStream.close();
                }
            } catch (IOException e11) {
                LiveChatUtil.log(e11);
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e12) {
                LiveChatUtil.log(e12);
            }
            throw th2;
        }
    }

    public Bitmap getBitmapFromDimension(String str, int i10, int i11) {
        try {
            File file = new File(str);
            if (file.length() <= 0) {
                return null;
            }
            String dimensionstoUpload = getDimensionstoUpload(file, i10, i11);
            Bitmap resizeBitmap = resizeBitmap(file, Integer.valueOf(dimensionstoUpload.split(C5444x.f55808b)[0]).intValue(), Integer.valueOf(dimensionstoUpload.split(C5444x.f55808b)[1]).intValue());
            if (resizeBitmap != null) {
                return resizeBitmap;
            }
            return null;
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public Message.Attachment.Dimension getDimensions(int i10, int i11) {
        int r10 = C6218a.r() < C6218a.p() ? C6218a.r() / 3 : C6218a.p() / 3;
        double d10 = i10;
        double d11 = i11;
        while (true) {
            double d12 = d10 / 2.0d;
            double d13 = r10;
            if (d12 < d13) {
                break;
            }
            double d14 = d11 / 2.0d;
            if (d14 < d13) {
                break;
            }
            d11 = d14;
            d10 = d12;
        }
        return new Message.Attachment.Dimension(Double.valueOf(d11), Double.valueOf(d10));
    }

    public String getDimensionstoUpload(File file, int i10, int i11) {
        int imageRotatedValue = (file == null || !file.exists()) ? 0 : getImageRotatedValue(file.getAbsolutePath());
        if (i10 > C6218a.r() || i11 > C6218a.p()) {
            i10 = C6218a.r();
            i11 = C6218a.p();
        }
        if (imageRotatedValue == 90 || imageRotatedValue == 270) {
            return String.valueOf(i11) + C5444x.f55808b + String.valueOf(i10);
        }
        return String.valueOf(i10) + C5444x.f55808b + String.valueOf(i11);
    }

    public C3946o getFileCache() {
        if (this.fileCache == null) {
            this.fileCache = new C3946o(MobilistenInitProvider.k());
        }
        return this.fileCache;
    }

    public File getFileFromDisk(String str) {
        return new File(INSTANCE.fileCache.e(), str);
    }

    public String getFileName(String str, long j10) {
        String replace = str.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(":", "-").replace(' ', '_');
        int lastIndexOf = replace.lastIndexOf(".");
        if (lastIndexOf == -1 || lastIndexOf == 0) {
            return replace + "_" + j10;
        }
        return replace.substring(0, lastIndexOf) + "_" + j10 + "." + replace.substring(lastIndexOf + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getFileNameFromUri(Uri uri) {
        Uri uri2;
        String str = null;
        if (uri.getScheme() == null || !uri.getScheme().equals("content")) {
            uri2 = uri;
        } else {
            uri2 = uri;
            Cursor query = MobilistenInitProvider.k().getContentResolver().query(uri2, null, null, null, null);
            if (query != null) {
                try {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndex("_display_name"));
                        }
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                        if (str == null) {
                        }
                    }
                } finally {
                    query.close();
                }
            }
        }
        if (str == null) {
            return str;
        }
        String path = uri2.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public int getImageRotatedValue(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return 0;
        }
    }

    public void initialize(Context context) {
        this.fileCache = new C3946o(context);
    }

    public String putFileinCache(InputStream inputStream, String str) {
        File fileFromDisk;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileFromDisk = getFileFromDisk(str);
                fileOutputStream = new FileOutputStream(fileFromDisk);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            copyStream(inputStream, fileOutputStream);
            String absolutePath = fileFromDisk.getAbsolutePath();
            try {
                fileOutputStream.close();
                return absolutePath;
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
                return absolutePath;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            LiveChatUtil.log(e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e13) {
                    LiveChatUtil.log(e13);
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e14) {
                    LiveChatUtil.log(e14);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public File putImageInSdcard(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        ?? r02 = 0;
        r02 = 0;
        if (file != null && file.exists()) {
            try {
                if (file.length() > 0) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        options.inInputShareable = false;
                        fileInputStream = new FileInputStream(file.getAbsolutePath());
                        try {
                            BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
                            WeakReference weakReference = new WeakReference(getBitmapFromDimension(file.getAbsolutePath(), options.outWidth, options.outHeight));
                            File file2 = new File(this.fileCache.e(), str);
                            if (file2.exists()) {
                                C3946o.d(file2);
                            }
                            C3946o.c(file2);
                            fileOutputStream = new FileOutputStream(file2.getAbsolutePath());
                            try {
                                ((Bitmap) weakReference.get()).compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e10) {
                                    LiveChatUtil.log(e10);
                                }
                                try {
                                    fileInputStream.close();
                                } catch (IOException e11) {
                                    LiveChatUtil.log(e11);
                                }
                                return file2;
                            } catch (Exception e12) {
                                e = e12;
                                LiveChatUtil.log(e);
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e13) {
                                        LiveChatUtil.log(e13);
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e14) {
                                        LiveChatUtil.log(e14);
                                    }
                                }
                                return null;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            fileOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r02 != 0) {
                                try {
                                    r02.close();
                                } catch (IOException e16) {
                                    LiveChatUtil.log(e16);
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (IOException e17) {
                                LiveChatUtil.log(e17);
                                throw th;
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        fileOutputStream = null;
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r02 = str;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        if (r4 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        if (r4 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f3, code lost:
    
        if (r4 == null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap resizeBitmap(File file, float f10, float f11) {
        Throwable th2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        BitmapFactory.Options options;
        int imageRotatedValue;
        Bitmap decodeFileDescriptor;
        float f12 = f11;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                options.inInputShareable = false;
                fileInputStream3 = new FileInputStream(file.getAbsolutePath());
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                BitmapFactory.decodeFileDescriptor(fileInputStream3.getFD(), null, options);
                int i10 = options.outWidth;
                int i11 = options.outHeight;
                fileInputStream3.close();
                imageRotatedValue = getImageRotatedValue(file.getAbsolutePath());
                if (imageRotatedValue > 0) {
                    i11 = i10;
                    i10 = i11;
                }
                float f13 = i10;
                float f14 = i11;
                float f15 = f13 / f14;
                float f16 = f10 / f12;
                if (f14 > f12 || f13 > f10) {
                    if (f15 < f16) {
                        i10 = (int) ((f12 / f14) * f13);
                        i11 = (int) f12;
                    } else {
                        if (f15 > f16) {
                            f12 = (f10 / f13) * f14;
                        }
                        i11 = (int) f12;
                        i10 = (int) f10;
                    }
                }
                int calculateSize = calculateSize(options, i10, i11, imageRotatedValue);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.outWidth = i10;
                options2.outHeight = i11;
                if (calculateSize > 0) {
                    options2.inSampleSize = calculateSize;
                }
                fileInputStream2 = new FileInputStream(file.getAbsolutePath());
                try {
                    decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream2.getFD(), null, options2);
                } catch (FileNotFoundException e10) {
                    e = e10;
                    LiveChatUtil.log(e);
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException e11) {
                            LiveChatUtil.log(e11);
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    LiveChatUtil.log(e);
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException e13) {
                            LiveChatUtil.log(e13);
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    LiveChatUtil.log(e);
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException e15) {
                            LiveChatUtil.log(e15);
                        }
                    }
                }
            } catch (FileNotFoundException e16) {
                e = e16;
                fileInputStream2 = null;
            } catch (IOException e17) {
                e = e17;
                fileInputStream2 = null;
            } catch (Exception e18) {
                e = e18;
                fileInputStream2 = null;
            } catch (Throwable th4) {
                th2 = th4;
                fileInputStream = null;
                fileInputStream4 = fileInputStream3;
                if (fileInputStream4 != null) {
                    try {
                        fileInputStream4.close();
                    } catch (IOException e19) {
                        LiveChatUtil.log(e19);
                    }
                }
                if (fileInputStream != null) {
                    throw th2;
                }
                try {
                    fileInputStream.close();
                    throw th2;
                } catch (IOException e20) {
                    LiveChatUtil.log(e20);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e21) {
            e = e21;
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (IOException e22) {
            e = e22;
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (Exception e23) {
            e = e23;
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (Throwable th5) {
            th2 = th5;
            fileInputStream = null;
            if (fileInputStream4 != null) {
            }
            if (fileInputStream != null) {
            }
        }
        if (decodeFileDescriptor == null) {
            try {
                fileInputStream3.close();
            } catch (IOException e24) {
                LiveChatUtil.log(e24);
            }
            try {
                fileInputStream2.close();
            } catch (IOException e25) {
                LiveChatUtil.log(e25);
            }
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(imageRotatedValue);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFileDescriptor, 0, 0, decodeFileDescriptor.getWidth(), decodeFileDescriptor.getHeight(), matrix, false);
        try {
            fileInputStream3.close();
        } catch (IOException e26) {
            LiveChatUtil.log(e26);
        }
        try {
            fileInputStream2.close();
        } catch (IOException e27) {
            LiveChatUtil.log(e27);
        }
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File takeScreenshot(View view, int i10) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            view.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), i10, Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            long f10 = rd.b.f();
            File fileFromDisk = getFileFromDisk("screenshot_" + f10 + "_" + f10 + ".jpg");
            fileOutputStream = new FileOutputStream(fileFromDisk);
            try {
                try {
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    try {
                        fileOutputStream.close();
                        return fileFromDisk;
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                        return fileFromDisk;
                    }
                } catch (Exception e11) {
                    e = e11;
                    LiveChatUtil.log(e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            LiveChatUtil.log(e12);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e13) {
                        LiveChatUtil.log(e13);
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream2 != null) {
            }
            throw th;
        }
    }

    public File writeFileToCacheDirectory(InputStream inputStream, String str) {
        File file;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                file = new File(INSTANCE.fileCache.e(), str);
                try {
                    if (!file.exists()) {
                        C3946o.c(file);
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                file = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            copyStream(inputStream, fileOutputStream);
            fileOutputStream.close();
            return file;
        } catch (Exception e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            LiveChatUtil.log(e);
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return file;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }
}
