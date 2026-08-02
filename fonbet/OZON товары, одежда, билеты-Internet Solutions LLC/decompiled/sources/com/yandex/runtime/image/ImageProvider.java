package com.yandex.runtime.image;

import Ej.b;
import Nk.a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* loaded from: classes9.dex */
public abstract class ImageProvider {
    private final boolean cacheable;

    private static abstract class ImageProviderImpl extends ImageProvider {

        /* renamed from: id, reason: collision with root package name */
        private final String f60752id;

        public ImageProviderImpl(String str, boolean z11) {
            super(z11);
            this.f60752id = str;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public String getId() {
            return this.f60752id;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public Bitmap getImage() {
            return loadBitmap();
        }

        protected abstract Bitmap loadBitmap();
    }

    public ImageProvider() {
        this(true);
    }

    public static ImageProvider fromAsset(Context context, String str) {
        return fromAsset(context, str, true);
    }

    public static ImageProvider fromBitmap(Bitmap bitmap) {
        return fromBitmap(bitmap, true, "bitmap:" + UUID.randomUUID().toString());
    }

    public static ImageProvider fromFile(String str) {
        return fromFile(str, true);
    }

    public static ImageProvider fromResource(Context context, int i11) {
        return fromResource(context, i11, true);
    }

    public abstract String getId();

    public abstract Bitmap getImage();

    public boolean isCacheable() {
        return this.cacheable;
    }

    public ImageProvider(boolean z11) {
        this.cacheable = z11;
    }

    public static ImageProvider fromAsset(Context context, final String str, boolean z11) {
        final AssetManager assets = context.getAssets();
        return new ImageProviderImpl(a.b("asset:", str), z11) { // from class: com.yandex.runtime.image.ImageProvider.2
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            protected Bitmap loadBitmap() {
                Bitmap bitmap = null;
                try {
                    InputStream open = assets.open(str);
                    try {
                        bitmap = BitmapFactory.decodeStream(open);
                        return bitmap;
                    } finally {
                        open.close();
                    }
                } catch (IOException e11) {
                    Log.e("yandex.maps", "Can't load image from asset: " + str, e11);
                    return bitmap;
                }
            }
        };
    }

    public static ImageProvider fromBitmap(final Bitmap bitmap, boolean z11, final String str) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return new ImageProvider(z11) { // from class: com.yandex.runtime.image.ImageProvider.1
                @Override // com.yandex.runtime.image.ImageProvider
                public String getId() {
                    return str;
                }

                @Override // com.yandex.runtime.image.ImageProvider
                public Bitmap getImage() {
                    return bitmap;
                }
            };
        }
        throw new IllegalArgumentException("Bitmap config value should be ARGB_8888");
    }

    public static ImageProvider fromFile(final String str, boolean z11) {
        return new ImageProviderImpl(a.b("file:", str), z11) { // from class: com.yandex.runtime.image.ImageProvider.4
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            protected Bitmap loadBitmap() {
                return BitmapFactory.decodeFile(str);
            }
        };
    }

    public static ImageProvider fromResource(Context context, final int i11, boolean z11) {
        final Resources resources = context.getResources();
        return new ImageProviderImpl(b.a(i11, "resource:"), z11) { // from class: com.yandex.runtime.image.ImageProvider.3
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            protected Bitmap loadBitmap() {
                return BitmapFactory.decodeResource(resources, i11);
            }
        };
    }
}
