package com.bumptech.glide.integration.webp;

import c6.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes8.dex */
    private static final class a implements InterfaceC0873c {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f57593a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57594b;

        /* renamed from: c, reason: collision with root package name */
        private final int f57595c;

        /* renamed from: d, reason: collision with root package name */
        private int f57596d;

        a(byte[] bArr, int i11, int i12) {
            this.f57593a = bArr;
            this.f57594b = i11;
            this.f57595c = i12;
            this.f57596d = i11;
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final long a() throws IOException {
            int min = (int) Math.min((this.f57594b + this.f57595c) - this.f57596d, 4L);
            this.f57596d += min;
            return min;
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final int b() throws IOException {
            return ((c() << 8) & 65280) | (c() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final int c() throws IOException {
            int i11 = this.f57596d;
            if (i11 >= this.f57594b + this.f57595c) {
                return -1;
            }
            this.f57596d = i11 + 1;
            return this.f57593a[i11];
        }
    }

    private static final class b implements InterfaceC0873c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f57597a;

        b(ByteBuffer byteBuffer) {
            this.f57597a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final long a() throws IOException {
            ByteBuffer byteBuffer = this.f57597a;
            int min = (int) Math.min(byteBuffer.remaining(), 4L);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final int b() throws IOException {
            return ((c() << 8) & 65280) | (c() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final int c() throws IOException {
            ByteBuffer byteBuffer = this.f57597a;
            if (byteBuffer.remaining() < 1) {
                return -1;
            }
            return byteBuffer.get();
        }
    }

    /* renamed from: com.bumptech.glide.integration.webp.c$c, reason: collision with other inner class name */
    private interface InterfaceC0873c {
        long a() throws IOException;

        int b() throws IOException;

        int c() throws IOException;
    }

    /* loaded from: classes8.dex */
    private static final class d implements InterfaceC0873c {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f57598a;

        d(InputStream inputStream) {
            this.f57598a = inputStream;
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final long a() throws IOException {
            long j11 = 4;
            while (j11 > 0) {
                InputStream inputStream = this.f57598a;
                long skip = inputStream.skip(j11);
                if (skip > 0) {
                    j11 -= skip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j11--;
                }
            }
            return 4 - j11;
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final int b() throws IOException {
            InputStream inputStream = this.f57598a;
            return (inputStream.read() & 255) | ((inputStream.read() << 8) & 65280);
        }

        @Override // com.bumptech.glide.integration.webp.c.InterfaceC0873c
        public final int c() throws IOException {
            return this.f57598a.read();
        }
    }

    public enum e {
        WEBP_SIMPLE("WEBP_SIMPLE", 0),
        WEBP_LOSSLESS("WEBP_LOSSLESS", 1),
        WEBP_LOSSLESS_WITH_ALPHA("WEBP_LOSSLESS_WITH_ALPHA", 2),
        WEBP_EXTENDED("WEBP_EXTENDED", 3),
        WEBP_EXTENDED_WITH_ALPHA("WEBP_EXTENDED_WITH_ALPHA", 4),
        WEBP_EXTENDED_ANIMATED("WEBP_EXTENDED_ANIMATED", 5),
        NONE_WEBP("NONE_WEBP", 6);

        private final boolean hasAlpha;
        private final boolean hasAnimation;

        e(String str, int i11) {
            this.hasAlpha = r1;
            this.hasAnimation = r2;
        }
    }

    public static e a(int i11, int i12, byte[] bArr) throws IOException {
        return b(new a(bArr, i11, i12));
    }

    private static e b(InterfaceC0873c interfaceC0873c) throws IOException {
        if ((((interfaceC0873c.b() << 16) & (-65536)) | (interfaceC0873c.b() & 65535)) != 1380533830) {
            return e.NONE_WEBP;
        }
        interfaceC0873c.a();
        if ((((interfaceC0873c.b() << 16) & (-65536)) | (interfaceC0873c.b() & 65535)) != 1464156752) {
            return e.NONE_WEBP;
        }
        int b11 = ((interfaceC0873c.b() << 16) & (-65536)) | (interfaceC0873c.b() & 65535);
        if (b11 == 1448097824) {
            return e.WEBP_SIMPLE;
        }
        if (b11 == 1448097868) {
            interfaceC0873c.a();
            return (interfaceC0873c.c() & 8) != 0 ? e.WEBP_LOSSLESS_WITH_ALPHA : e.WEBP_LOSSLESS;
        }
        if (b11 != 1448097880) {
            return e.NONE_WEBP;
        }
        interfaceC0873c.a();
        int c11 = interfaceC0873c.c();
        return (c11 & 2) != 0 ? e.WEBP_EXTENDED_ANIMATED : (c11 & 16) != 0 ? e.WEBP_EXTENDED_WITH_ALPHA : e.WEBP_EXTENDED;
    }

    public static e c(InputStream inputStream, W5.b bVar) throws IOException {
        if (inputStream == null) {
            return e.NONE_WEBP;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(21);
        try {
            return b(new d(inputStream));
        } finally {
            inputStream.reset();
        }
    }

    public static e d(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? e.NONE_WEBP : b(new b(byteBuffer));
    }

    public static boolean e(e eVar) {
        return eVar == e.WEBP_SIMPLE || eVar == e.WEBP_LOSSLESS || eVar == e.WEBP_LOSSLESS_WITH_ALPHA || eVar == e.WEBP_EXTENDED || eVar == e.WEBP_EXTENDED_WITH_ALPHA;
    }
}
