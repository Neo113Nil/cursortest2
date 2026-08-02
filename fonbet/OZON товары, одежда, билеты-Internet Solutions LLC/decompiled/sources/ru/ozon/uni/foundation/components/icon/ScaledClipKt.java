package ru.ozon.uni.foundation.components.icon;

import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.J0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "Ll1/J0;", "shape", "LZ1/h;", "inset", "scaledClip-wH6b6FI", "(Landroidx/compose/ui/e;Ll1/J0;F)Landroidx/compose/ui/e;", "scaledClip", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScaledClipKt {
    @NotNull
    /* renamed from: scaledClip-wH6b6FI, reason: not valid java name */
    public static final e m2996scaledClipwH6b6FI(@NotNull e scaledClip, @NotNull J0 shape, float f7) {
        Intrinsics.checkNotNullParameter(scaledClip, "$this$scaledClip");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return scaledClip.l0(new ScaledClipModifierElement(shape, f7, new ScaledClipKt$scaledClip$1(shape, f7), null));
    }
}
