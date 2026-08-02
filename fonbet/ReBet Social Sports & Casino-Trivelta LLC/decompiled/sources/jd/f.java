package jd;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f53965a;
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f53966a;

        public a(byte[] bArr, int i10) {
            this.f53966a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            return this.f53966a.getShort(i10);
        }

        public int b(int i10) {
            return this.f53966a.getInt(i10);
        }

        public int c() {
            return this.f53966a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.f53966a.order(byteOrder);
        }
    }

    public interface b {
        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f53967a;

        public c(InputStream inputStream) {
            this.f53967a = inputStream;
        }

        @Override // jd.f.b
        public int a() {
            return ((this.f53967a.read() << 8) & 65280) | (this.f53967a.read() & 255);
        }

        @Override // jd.f.b
        public int b(byte[] bArr, int i10) {
            int i11 = i10;
            while (i11 > 0) {
                int read = this.f53967a.read(bArr, i10 - i11, i11);
                if (read == -1) {
                    break;
                }
                i11 -= read;
            }
            return i10 - i11;
        }

        @Override // jd.f.b
        public short c() {
            return (short) (this.f53967a.read() & 255);
        }

        @Override // jd.f.b
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f53967a.skip(j11);
                if (skip <= 0) {
                    if (this.f53967a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public f(InputStream inputStream) {
        this.f53965a = new c(inputStream);
    }

    public static int a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0036 -> B:12:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, int i10, int i11, Uri uri, Uri uri2) {
        ParcelFileDescriptor parcelFileDescriptor;
        InputStream openInputStream;
        if (context == null) {
            return;
        }
        InputStream inputStream = null;
        r0 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        inputStream = null;
        try {
            try {
                openInputStream = context.getContentResolver().openInputStream(uri);
            } catch (IOException e10) {
                e10.getMessage();
            }
        } catch (IOException e11) {
            e = e11;
            parcelFileDescriptor = null;
        } catch (Throwable th2) {
            th = th2;
            parcelFileDescriptor = null;
        }
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(openInputStream);
            parcelFileDescriptor2 = context.getContentResolver().openFileDescriptor(uri2, "rw");
            f(aVar, new androidx.exifinterface.media.a(parcelFileDescriptor2.getFileDescriptor()), i10, i11);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException e12) {
                    e12.getMessage();
                }
            }
            parcelFileDescriptor2.close();
        } catch (IOException e13) {
            e = e13;
            parcelFileDescriptor = parcelFileDescriptor2;
            inputStream = openInputStream;
            try {
                e.getMessage();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e14) {
                        e14.getMessage();
                    }
                }
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e15) {
                        e15.getMessage();
                    }
                }
                if (parcelFileDescriptor != null) {
                    throw th;
                }
                try {
                    parcelFileDescriptor.close();
                    throw th;
                } catch (IOException e16) {
                    e16.getMessage();
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = parcelFileDescriptor2;
            inputStream = openInputStream;
            if (inputStream != null) {
            }
            if (parcelFileDescriptor != null) {
            }
        }
    }

    public static void c(Context context, int i10, int i11, Uri uri, String str) {
        if (context == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    f(new androidx.exifinterface.media.a(inputStream), new androidx.exifinterface.media.a(str), i10, i11);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            e10.getMessage();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e11.getMessage();
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IOException e12) {
            e12.getMessage();
        }
    }

    public static void d(Context context, androidx.exifinterface.media.a aVar, int i10, int i11, Uri uri) {
        if (context == null) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    f(aVar, new androidx.exifinterface.media.a(parcelFileDescriptor.getFileDescriptor()), i10, i11);
                    parcelFileDescriptor.close();
                } catch (Throwable th2) {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e10) {
                            e10.getMessage();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e11.getMessage();
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
            }
        } catch (IOException e12) {
            e12.getMessage();
        }
    }

    public static void e(androidx.exifinterface.media.a aVar, int i10, int i11, String str) {
        try {
            f(aVar, new androidx.exifinterface.media.a(str), i10, i11);
        } catch (IOException e10) {
            e10.getMessage();
        }
    }

    public static void f(androidx.exifinterface.media.a aVar, androidx.exifinterface.media.a aVar2, int i10, int i11) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String h10 = aVar.h(str);
            if (!TextUtils.isEmpty(h10)) {
                aVar2.a0(str, h10);
            }
        }
        aVar2.a0("ImageWidth", String.valueOf(i10));
        aVar2.a0("ImageLength", String.valueOf(i11));
        aVar2.a0("Orientation", "0");
        aVar2.W();
    }

    public static boolean h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int k(a aVar) {
        ByteOrder byteOrder;
        short a10 = aVar.a(6);
        if (a10 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a10 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            Log.isLoggable("ImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.d(byteOrder);
        int b10 = aVar.b(10) + 6;
        short a11 = aVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int a12 = a(b10, i10);
            if (aVar.a(a12) == 274) {
                short a13 = aVar.a(a12 + 2);
                if (a13 < 1 || a13 > 12) {
                    Log.isLoggable("ImageHeaderParser", 3);
                } else {
                    int b11 = aVar.b(a12 + 4);
                    if (b11 < 0) {
                        Log.isLoggable("ImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("ImageHeaderParser", 3);
                        int i11 = b11 + BYTES_PER_FORMAT[a13];
                        if (i11 > 4) {
                            Log.isLoggable("ImageHeaderParser", 3);
                        } else {
                            int i12 = a12 + 8;
                            if (i12 < 0 || i12 > aVar.c()) {
                                Log.isLoggable("ImageHeaderParser", 3);
                            } else {
                                if (i11 >= 0 && i11 + i12 <= aVar.c()) {
                                    return aVar.a(i12);
                                }
                                Log.isLoggable("ImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public int g() {
        if (!h(this.f53965a.a())) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        int j10 = j();
        if (j10 != -1) {
            return l(new byte[j10], j10);
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    public final boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    public final int j() {
        while (this.f53965a.c() == 255) {
            short c10 = this.f53965a.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
            int a10 = this.f53965a.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            long j10 = a10;
            if (this.f53965a.skip(j10) != j10) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    public final int l(byte[] bArr, int i10) {
        if (this.f53965a.b(bArr, i10) != i10) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        if (i(bArr, i10)) {
            return k(new a(bArr, i10));
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }
}
