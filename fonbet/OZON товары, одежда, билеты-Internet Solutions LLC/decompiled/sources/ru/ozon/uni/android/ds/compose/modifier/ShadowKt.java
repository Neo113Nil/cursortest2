package ru.ozon.uni.android.ds.compose.modifier;

import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.J0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aK\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/e;", "Ll1/J0;", "shape", "", "alpha", "Ll1/Z;", "color", "LZ1/h;", "blur", "offsetX", "offsetY", "spread", "shadow-KolsjDY", "(Landroidx/compose/ui/e;Ll1/J0;FJFFFF)Landroidx/compose/ui/e;", "shadow", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShadowKt {
    @NotNull
    /* renamed from: shadow-KolsjDY, reason: not valid java name */
    public static final e m1837shadowKolsjDY(@NotNull e shadow, @NotNull J0 shape, float f7, long j11, float f11, float f12, float f13, float f14) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return c.b(shadow, new ShadowKt$shadow$1(f14, shape, f11, j11, f7, f12, f13));
    }
}
