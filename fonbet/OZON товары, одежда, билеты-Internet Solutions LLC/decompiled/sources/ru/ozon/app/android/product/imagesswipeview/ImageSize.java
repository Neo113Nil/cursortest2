package ru.ozon.app.android.product.imagesswipeview;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/ImageSize;", "", "widthMeasureSpec", "", "heightMeasureSpec", "upscaleFactor", "", "<init>", "(IIF)V", "getWidthMeasureSpec", "()I", "getHeightMeasureSpec", "getUpscaleFactor", "()F", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ImageSize {
    private final int heightMeasureSpec;
    private final float upscaleFactor;
    private final int widthMeasureSpec;

    public ImageSize(int i11, int i12, float f7) {
        this.widthMeasureSpec = i11;
        this.heightMeasureSpec = i12;
        this.upscaleFactor = f7;
    }

    public final int getHeightMeasureSpec() {
        return this.heightMeasureSpec;
    }

    public final float getUpscaleFactor() {
        return this.upscaleFactor;
    }

    public final int getWidthMeasureSpec() {
        return this.widthMeasureSpec;
    }
}
