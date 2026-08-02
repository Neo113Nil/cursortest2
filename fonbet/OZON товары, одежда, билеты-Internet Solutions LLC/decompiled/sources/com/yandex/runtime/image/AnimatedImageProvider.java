package com.yandex.runtime.image;

import Nk.a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import com.yandex.runtime.ByteBufferUtils;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes9.dex */
public abstract class AnimatedImageProvider {

    private static abstract class AnimatedImageProviderImpl extends AnimatedImageProvider {

        /* renamed from: id, reason: collision with root package name */
        private final String f60751id;
        private Object image;

        public AnimatedImageProviderImpl(String str) {
            this.f60751id = str;
        }

        @Override // com.yandex.runtime.image.AnimatedImageProvider
        public String getId() {
            return this.f60751id;
        }

        @Override // com.yandex.runtime.image.AnimatedImageProvider
        public Object getImage() {
            if (this.image == null) {
                this.image = loadImage();
            }
            return this.image;
        }

        protected abstract Object loadImage();
    }

    public static AnimatedImageProvider fromAnimatedImage(final AnimatedImage animatedImage) {
        final String str = "animation/image:" + UUID.randomUUID().toString();
        return new AnimatedImageProvider() { // from class: com.yandex.runtime.image.AnimatedImageProvider.5
            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public Object getImage() {
                return animatedImage;
            }
        };
    }

    public static AnimatedImageProvider fromAsset(Context context, final String str) {
        final AssetManager assets = context.getAssets();
        return new AnimatedImageProviderImpl(a.b("animation/asset:", str)) { // from class: com.yandex.runtime.image.AnimatedImageProvider.3
            @Override // com.yandex.runtime.image.AnimatedImageProvider.AnimatedImageProviderImpl
            protected Object loadImage() {
                try {
                    return ByteBufferUtils.fromAsset(assets, str);
                } catch (IOException e11) {
                    Log.e("yandex.maps", "Can't load animated image from asset: " + str, e11);
                    return null;
                }
            }
        };
    }

    public static AnimatedImageProvider fromByteArray(final byte[] bArr) {
        final String str = "animation/bytes:" + UUID.randomUUID().toString();
        return new AnimatedImageProvider() { // from class: com.yandex.runtime.image.AnimatedImageProvider.1
            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.image.AnimatedImageProvider
            public Object getImage() {
                return ByteBufferUtils.fromByteArray(bArr);
            }
        };
    }

    public static AnimatedImageProvider fromFile(final String str) {
        return new AnimatedImageProviderImpl(a.b("animation/file:", str)) { // from class: com.yandex.runtime.image.AnimatedImageProvider.4
            @Override // com.yandex.runtime.image.AnimatedImageProvider.AnimatedImageProviderImpl
            protected Object loadImage() {
                try {
                    return ByteBufferUtils.fromFile(str);
                } catch (IOException e11) {
                    Log.e("yandex.maps", "Can't load animated image from file: " + str, e11);
                    return null;
                }
            }
        };
    }

    public static AnimatedImageProvider fromResource(Context context, final int i11) {
        final Resources resources = context.getResources();
        return new AnimatedImageProviderImpl("animation/resource:" + String.valueOf(i11)) { // from class: com.yandex.runtime.image.AnimatedImageProvider.2
            @Override // com.yandex.runtime.image.AnimatedImageProvider.AnimatedImageProviderImpl
            protected Object loadImage() {
                try {
                    return ByteBufferUtils.fromResource(resources, i11);
                } catch (IOException e11) {
                    Log.e("yandex.maps", "Can't load animated image from resource: " + String.valueOf(i11), e11);
                    return null;
                }
            }
        };
    }

    public abstract String getId();

    public abstract Object getImage();
}
