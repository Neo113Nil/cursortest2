package ru.ozon.app.android.travel.molecules.extensions;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/graphics/Path;", "", "width", "height", "topRadius", "bottomRadius", "", "roundedRect", "(Landroid/graphics/Path;FFFF)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PathExtensionsKt {
    public static final void roundedRect(@NotNull Path path, float f7, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        path.rewind();
        float[] fArr = {f7 - f12, f7, f13, 0.0f};
        float f14 = f11 - f13;
        float[] fArr2 = {0.0f, f14, f11, f12};
        float[] fArr3 = {0.0f, f7, f7, 0.0f};
        float[] fArr4 = {0.0f, 0.0f, f11, f11};
        float[] fArr5 = {f12, f7, f7 - f13, 0.0f};
        float[] fArr6 = {0.0f, f12, f11, f14};
        path.moveTo(0.0f, f12);
        for (int i11 = 0; i11 < 4; i11++) {
            path.quadTo(fArr3[i11], fArr4[i11], fArr5[i11], fArr6[i11]);
            path.lineTo(fArr[i11], fArr2[i11]);
        }
        path.close();
    }
}
