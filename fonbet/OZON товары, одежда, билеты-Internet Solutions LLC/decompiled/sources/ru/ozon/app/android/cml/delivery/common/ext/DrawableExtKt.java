package ru.ozon.app.android.cml.delivery.common.ext;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0000¨\u0006\b"}, d2 = {"setCornerRadius", "", "Landroid/graphics/drawable/GradientDrawable;", "topLeft", "", "topRight", "bottomLeft", "bottomRight", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DrawableExtKt {
    public static final void setCornerRadius(@NotNull GradientDrawable gradientDrawable, float f7, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        gradientDrawable.setCornerRadii(new float[]{f7, f7, f11, f11, f13, f13, f12, f12});
    }

    public static /* synthetic */ void setCornerRadius$default(GradientDrawable gradientDrawable, float f7, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f7 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f13 = 0.0f;
        }
        setCornerRadius(gradientDrawable, f7, f11, f12, f13);
    }
}
