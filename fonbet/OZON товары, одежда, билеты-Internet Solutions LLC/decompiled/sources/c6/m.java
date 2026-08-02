package c6;

import Am.C2438a;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class m implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f56556a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f56557b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f56558a;

        a(ByteBuffer byteBuffer) {
            this.f56558a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // c6.m.c
        public final int b() throws c.a {
            return (d() << 8) | d();
        }

        @Override // c6.m.c
        public final int c(int i11, byte[] bArr) {
            ByteBuffer byteBuffer = this.f56558a;
            int min = Math.min(i11, byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, min);
            return min;
        }

        @Override // c6.m.c
        public final short d() throws c.a {
            ByteBuffer byteBuffer = this.f56558a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new c.a();
        }

        @Override // c6.m.c
        public final long skip(long j11) {
            ByteBuffer byteBuffer = this.f56558a;
            int min = (int) Math.min(byteBuffer.remaining(), j11);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes8.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f56559a;

        b(int i11, byte[] bArr) {
            this.f56559a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
        }

        final short a(int i11) {
            ByteBuffer byteBuffer = this.f56559a;
            if (byteBuffer.remaining() - i11 >= 2) {
                return byteBuffer.getShort(i11);
            }
            return (short) -1;
        }

        final int b(int i11) {
            ByteBuffer byteBuffer = this.f56559a;
            if (byteBuffer.remaining() - i11 >= 4) {
                return byteBuffer.getInt(i11);
            }
            return -1;
        }

        final int c() {
            return this.f56559a.remaining();
        }

        final void d(ByteOrder byteOrder) {
            this.f56559a.order(byteOrder);
        }
    }

    private interface c {

        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int b() throws IOException;

        int c(int i11, byte[] bArr) throws IOException;

        short d() throws IOException;

        long skip(long j11) throws IOException;
    }

    /* loaded from: classes8.dex */
    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f56560a;

        d(InputStream inputStream) {
            this.f56560a = inputStream;
        }

        @Override // c6.m.c
        public final int b() throws IOException {
            return (d() << 8) | d();
        }

        @Override // c6.m.c
        public final int c(int i11, byte[] bArr) throws IOException {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11 && (i13 = this.f56560a.read(bArr, i12, i11 - i12)) != -1) {
                i12 += i13;
            }
            if (i12 == 0 && i13 == -1) {
                throw new c.a();
            }
            return i12;
        }

        @Override // c6.m.c
        public final short d() throws IOException {
            int read = this.f56560a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // c6.m.c
        public final long skip(long j11) throws IOException {
            if (j11 < 0) {
                return 0L;
            }
            long j12 = j11;
            while (j12 > 0) {
                InputStream inputStream = this.f56560a;
                long skip = inputStream.skip(j12);
                if (skip > 0) {
                    j12 -= skip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j12--;
                }
            }
            return j11 - j12;
        }
    }

    private static int e(c cVar, W5.b bVar) throws IOException {
        try {
            int b11 = cVar.b();
            if ((b11 & 65496) == 65496 || b11 == 19789 || b11 == 18761) {
                int g10 = g(cVar);
                if (g10 != -1) {
                    byte[] bArr = (byte[]) bVar.b(g10, byte[].class);
                    try {
                        return h(cVar, bArr, g10);
                    } finally {
                        bVar.a(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + b11);
                return -1;
            }
        } catch (c.a unused) {
        }
        return -1;
    }

    @NonNull
    private static ImageHeaderParser.ImageType f(c cVar) throws IOException {
        try {
            int b11 = cVar.b();
            if (b11 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int d11 = (b11 << 8) | cVar.d();
            if (d11 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int d12 = (d11 << 8) | cVar.d();
            if (d12 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (d12 == 1380533830) {
                cVar.skip(4L);
                if (((cVar.b() << 16) | cVar.b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int b12 = (cVar.b() << 16) | cVar.b();
                if ((b12 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i11 = b12 & 255;
                if (i11 == 88) {
                    cVar.skip(4L);
                    short d13 = cVar.d();
                    return (d13 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (d13 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i11 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                cVar.skip(4L);
                return (cVar.d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((cVar.b() << 16) | cVar.b()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int b13 = (cVar.b() << 16) | cVar.b();
            if (b13 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i12 = 0;
            boolean z11 = b13 == 1635150182;
            cVar.skip(4L);
            int i13 = d12 - 16;
            if (i13 % 4 == 0) {
                while (i12 < 5 && i13 > 0) {
                    int b14 = (cVar.b() << 16) | cVar.b();
                    if (b14 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (b14 == 1635150182) {
                        z11 = true;
                    }
                    i12++;
                    i13 -= 4;
                }
            }
            return z11 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int g(c cVar) throws IOException {
        while (true) {
            short d11 = cVar.d();
            if (d11 == 255) {
                short d12 = cVar.d();
                if (d12 == 218) {
                    break;
                }
                if (d12 != 217) {
                    int b11 = cVar.b() - 2;
                    if (d12 == 225) {
                        return b11;
                    }
                    long j11 = b11;
                    long skip = cVar.skip(j11);
                    if (skip != j11) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder a11 = C2438a.a("Unable to skip enough data, type: ", d12, ", wanted to skip: ", ", but actually skipped: ", b11);
                            a11.append(skip);
                            Log.d("DfltImageHeaderParser", a11.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) d11));
                return -1;
            }
        }
    }

    private static int h(c cVar, byte[] bArr, int i11) throws IOException {
        ByteOrder byteOrder;
        int c11 = cVar.c(i11, bArr);
        if (c11 == i11) {
            byte[] bArr2 = f56556a;
            boolean z11 = bArr != null && i11 > bArr2.length;
            if (z11) {
                int i12 = 0;
                while (true) {
                    if (i12 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i12] != bArr2[i12]) {
                        z11 = false;
                        break;
                    }
                    i12++;
                }
            }
            if (z11) {
                b bVar = new b(i11, bArr);
                short a11 = bVar.a(6);
                if (a11 == 18761) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else if (a11 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a11));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                bVar.d(byteOrder);
                int b11 = bVar.b(10);
                short a12 = bVar.a(b11 + 6);
                for (int i13 = 0; i13 < a12; i13++) {
                    int i14 = (i13 * 12) + b11 + 8;
                    short a13 = bVar.a(i14);
                    if (a13 == 274) {
                        short a14 = bVar.a(i14 + 2);
                        if (a14 >= 1 && a14 <= 12) {
                            int b12 = bVar.b(i14 + 4);
                            if (b12 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder a15 = C2438a.a("Got tagIndex=", i13, " tagType=", " formatCode=", a13);
                                    a15.append((int) a14);
                                    a15.append(" componentCount=");
                                    a15.append(b12);
                                    Log.d("DfltImageHeaderParser", a15.toString());
                                }
                                int i15 = b12 + f56557b[a14];
                                if (i15 <= 4) {
                                    int i16 = i14 + 8;
                                    if (i16 >= 0 && i16 <= bVar.c()) {
                                        if (i15 >= 0 && i15 + i16 <= bVar.c()) {
                                            return bVar.a(i16);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a13));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i16 + " tagType=" + ((int) a13));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a14));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a14));
                        }
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i11 + ", actually read: " + c11);
            return -1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(@NonNull ByteBuffer byteBuffer, @NonNull W5.b bVar) throws IOException {
        p6.k.c(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        p6.k.c(bVar, "Argument must not be null");
        return e(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType b(@NonNull InputStream inputStream) throws IOException {
        p6.k.c(inputStream, "Argument must not be null");
        return f(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull ByteBuffer byteBuffer) throws IOException {
        p6.k.c(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(@NonNull InputStream inputStream, @NonNull W5.b bVar) throws IOException {
        p6.k.c(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        p6.k.c(bVar, "Argument must not be null");
        return e(dVar, bVar);
    }
}
