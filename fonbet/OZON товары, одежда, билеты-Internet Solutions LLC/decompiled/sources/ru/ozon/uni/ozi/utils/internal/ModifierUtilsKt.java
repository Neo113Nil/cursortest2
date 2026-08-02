package ru.ozon.uni.ozi.utils.internal;

import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "maxIntrinsicWidthIfInLazyRow", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "Lu0/x;", "ZeroPaddingValues", "Lu0/x;", "getZeroPaddingValues", "()Lu0/x;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModifierUtilsKt {

    @NotNull
    private static final InterfaceC9914x ZeroPaddingValues = T.a(0.0f, 3, 0.0f);

    @NotNull
    public static final e maxIntrinsicWidthIfInLazyRow(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return b.a(ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1.INSTANCE, eVar);
    }
}
