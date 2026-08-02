package ru.ozon.uni.foundation.utils;

import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.b;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.C7990g;
import m0.T0;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0011\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Le1/b;", "targetAlignment", "Lm0/T0;", "", "animationSpec", "", "label", "animateAlignmentAsState", "(Le1/b;Lm0/T0;Ljava/lang/String;LS0/k;II)Le1/b;", "Landroidx/compose/ui/e;", "maxIntrinsicWidthIfInLazyRow", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "Lu0/x;", "ZeroPaddingValues", "Lu0/x;", "getZeroPaddingValues", "()Lu0/x;", "horizontal", "vertical", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModifierUtilsKt {

    @NotNull
    private static final InterfaceC9914x ZeroPaddingValues = T.a(0.0f, 3, 0.0f);

    @NotNull
    public static final InterfaceC6250b animateAlignmentAsState(@NotNull InterfaceC6250b targetAlignment, @NotNull T0<Float> animationSpec, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(targetAlignment, "targetAlignment");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        interfaceC3967k.o(1134359273);
        if ((i12 & 4) != 0) {
            str = "AlignmentAnimation";
        }
        String str2 = str;
        d dVar = (d) targetAlignment;
        int i13 = (i11 & 112) | ((i11 << 3) & 7168);
        d dVar2 = new d(animateAlignmentAsState$lambda$0(C7990g.b(dVar.b(), animationSpec, str2, interfaceC3967k, i13, 20)), animateAlignmentAsState$lambda$1(C7990g.b(dVar.c(), animationSpec, str2, interfaceC3967k, i13, 20)));
        interfaceC3967k.k();
        return dVar2;
    }

    private static final float animateAlignmentAsState$lambda$0(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private static final float animateAlignmentAsState$lambda$1(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    @NotNull
    public static final e maxIntrinsicWidthIfInLazyRow(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return b.a(ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1.INSTANCE, eVar);
    }
}
