package ru.ozon.app.android.geo.map.clusterization;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "", "bitmap", "Landroid/graphics/Bitmap;", "anchor", "Landroid/graphics/PointF;", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getAnchor", "()Landroid/graphics/PointF;", "size", "", "getSize", "()I", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BitmapContainer {

    @NotNull
    private final PointF anchor;

    @NotNull
    private final Bitmap bitmap;
    private final int size;

    public BitmapContainer(@NotNull Bitmap bitmap, @NotNull PointF anchor) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.bitmap = bitmap;
        this.anchor = anchor;
        this.size = bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
    }

    @NotNull
    public final PointF getAnchor() {
        return this.anchor;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getSize() {
        return this.size;
    }
}
