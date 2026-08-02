package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f29651a;

        ImageType(boolean z10) {
            this.f29651a = z10;
        }

        public boolean hasAlpha() {
            return this.f29651a;
        }

        public boolean isWebp() {
            int i10 = a.$SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType;

        static {
            int[] iArr = new int[ImageType.values().length];
            $SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar);

    ImageType c(InputStream inputStream);

    int d(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar);
}
