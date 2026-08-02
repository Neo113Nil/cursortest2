package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import xsna.cl3;
import xsna.nr2;
import xsna.wr;

/* loaded from: classes12.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName(C.UTF8_NAME));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a(int i, byte[] bArr) throws IOException;

        int b() throws IOException;

        short c() throws IOException;

        long skip(long j) throws IOException;
    }

    public static final class a implements Reader {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.a;
            int min = Math.min(i, byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b() throws Reader.EndOfFileException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.a;
            int min = (int) Math.min(byteBuffer.remaining(), j);
            wr.c(min, byteBuffer);
            return min;
        }
    }

    public static final class b implements Reader {
        public final InputStream a;

        public b(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.a;
                long skip = inputStream.skip(j2);
                if (skip > 0) {
                    j2 -= skip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int e(Reader reader, cl3 cl3Var) throws IOException {
        int i;
        short c;
        try {
            int b2 = reader.b();
            if ((b2 & 65496) != 65496 && b2 != 19789 && b2 != 18761) {
                return -1;
            }
            while (reader.c() == 255 && (c = reader.c()) != 218 && c != 217) {
                i = reader.b() - 2;
                if (c == 225) {
                    break;
                }
                long j = i;
                if (reader.skip(j) != j) {
                    break;
                }
            }
            i = -1;
        } catch (Reader.EndOfFileException unused) {
        }
        if (i == -1) {
            return -1;
        }
        byte[] bArr = (byte[]) cl3Var.c(i, byte[].class);
        try {
            return g(reader, bArr, i);
        } finally {
            cl3Var.put(bArr);
        }
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(Reader reader) throws IOException {
        try {
            int b2 = reader.b();
            if (b2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c = (b2 << 8) | reader.c();
            if (c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c2 = (c << 8) | reader.c();
            if (c2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c2 == 1380533830) {
                reader.skip(4L);
                if (((reader.b() << 16) | reader.b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int b3 = (reader.b() << 16) | reader.b();
                if ((b3 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = b3 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short c3 = reader.c();
                    return (c3 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c3 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.b() << 16) | reader.b()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int b4 = (reader.b() << 16) | reader.b();
            if (b4 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = b4 == 1635150182;
            reader.skip(4L);
            int i3 = c2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int b5 = (reader.b() << 16) | reader.b();
                    if (b5 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (b5 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int g(Reader reader, byte[] bArr, int i) throws IOException {
        int i2;
        int i3;
        if (reader.a(i, bArr) == i) {
            byte[] bArr2 = a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i4 = 0;
                while (true) {
                    if (i4 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i4] != bArr2[i4]) {
                        z = false;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                byteBuffer.order(s != 18761 ? s != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                int i5 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i6 = i5 + 6;
                short s2 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                for (int i7 = 0; i7 < s2; i7++) {
                    int i8 = (i7 * 12) + i5 + 8;
                    if ((byteBuffer.remaining() - i8 >= 2 ? byteBuffer.getShort(i8) : (short) -1) == 274) {
                        int i9 = i8 + 2;
                        short s3 = byteBuffer.remaining() - i9 >= 2 ? byteBuffer.getShort(i9) : (short) -1;
                        if (s3 >= 1 && s3 <= 12) {
                            int i10 = i8 + 4;
                            int i11 = byteBuffer.remaining() - i10 >= 4 ? byteBuffer.getInt(i10) : -1;
                            if (i11 >= 0 && (i2 = i11 + b[s3]) <= 4 && (i3 = i8 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                                if (byteBuffer.remaining() - i3 >= 2) {
                                    return byteBuffer.getShort(i3);
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(@NonNull InputStream inputStream, @NonNull cl3 cl3Var) throws IOException {
        nr2.r(inputStream, "Argument must not be null");
        b bVar = new b(inputStream);
        nr2.r(cl3Var, "Argument must not be null");
        return e(bVar, cl3Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(@NonNull ByteBuffer byteBuffer, @NonNull cl3 cl3Var) throws IOException {
        nr2.r(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        nr2.r(cl3Var, "Argument must not be null");
        return e(aVar, cl3Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull ByteBuffer byteBuffer) throws IOException {
        nr2.r(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType d(@NonNull InputStream inputStream) throws IOException {
        nr2.r(inputStream, "Argument must not be null");
        return f(new b(inputStream));
    }
}
