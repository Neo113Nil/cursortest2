package ru.ozon.app.android.travel.utils.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"createCornerRadii", "", "topLeft", "", "topRight", "bottomLeft", "bottomRight", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CornerRadiiCreationKt {
    @NotNull
    public static final float[] createCornerRadii(float f7, float f11, float f12, float f13) {
        return new float[]{f7, f7, f11, f11, f12, f12, f13, f13};
    }

    public static /* synthetic */ float[] createCornerRadii$default(float f7, float f11, float f12, float f13, int i11, Object obj) {
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
        return createCornerRadii(f7, f11, f12, f13);
    }
}
