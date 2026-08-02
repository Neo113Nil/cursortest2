package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class o implements ImageHeaderParser {
    static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f30038a;

        public a(ByteBuffer byteBuffer) {
            this.f30038a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int b(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f30038a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f30038a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public short c() {
            if (this.f30038a.remaining() >= 1) {
                return (short) (this.f30038a.get() & UByte.MAX_VALUE);
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public long skip(long j10) {
            int min = (int) Math.min(this.f30038a.remaining(), j10);
            ByteBuffer byteBuffer = this.f30038a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f30039a;

        public b(byte[] bArr, int i10) {
            this.f30039a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (c(i10, 2)) {
                return this.f30039a.getShort(i10);
            }
            return (short) -1;
        }

        public int b(int i10) {
            if (c(i10, 4)) {
                return this.f30039a.getInt(i10);
            }
            return -1;
        }

        public final boolean c(int i10, int i11) {
            return this.f30039a.remaining() - i10 >= i11;
        }

        public int d() {
            return this.f30039a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f30039a.order(byteOrder);
        }
    }

    public interface c {

        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f30040a;

        public d(InputStream inputStream) {
            this.f30040a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int b(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f30040a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public short c() {
            int read = this.f30040a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f30040a.skip(j11);
                if (skip <= 0) {
                    if (this.f30040a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    public static boolean h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int k(b bVar) {
        ByteOrder byteOrder;
        short a10 = bVar.a(6);
        if (a10 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a10 != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b10 = bVar.b(10) + 6;
        short a11 = bVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int e10 = e(b10, i10);
            if (bVar.a(e10) == 274) {
                short a12 = bVar.a(e10 + 2);
                if (a12 < 1 || a12 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int b11 = bVar.b(e10 + 4);
                    if (b11 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i11 = b11 + BYTES_PER_FORMAT[a12];
                        if (i11 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i12 = e10 + 8;
                            if (i12 < 0 || i12 > bVar.d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) com.bumptech.glide.util.k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return f(new a((ByteBuffer) com.bumptech.glide.util.k.d(byteBuffer)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new d((InputStream) com.bumptech.glide.util.k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return f(new d((InputStream) com.bumptech.glide.util.k.d(inputStream)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar));
    }

    public final int f(c cVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        try {
            if (!h(cVar.a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int j10 = j(cVar);
            if (j10 == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(j10, byte[].class);
            try {
                return l(cVar, bArr, j10);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType g(c cVar) {
        try {
            int a10 = cVar.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c10 = (a10 << 8) | cVar.c();
            if (c10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c11 = (c10 << 8) | cVar.c();
            if (c11 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c11 != 1380533830) {
                return m(cVar, c11);
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a11 = (cVar.a() << 16) | cVar.a();
            if ((a11 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = a11 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                short c12 = cVar.c();
                return (c12 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c12 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
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

    public final int j(c cVar) {
        while (cVar.c() == 255) {
            short c10 = cVar.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int a10 = cVar.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            long j10 = a10;
            if (cVar.skip(j10) != j10) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    public final int l(c cVar, byte[] bArr, int i10) {
        if (cVar.b(bArr, i10) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (i(bArr, i10)) {
            return k(new b(bArr, i10));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    public final ImageHeaderParser.ImageType m(c cVar, int i10) {
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a10 = (cVar.a() << 16) | cVar.a();
        if (a10 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = a10 == 1635150182;
        cVar.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int a11 = (cVar.a() << 16) | cVar.a();
                if (a11 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a11 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
