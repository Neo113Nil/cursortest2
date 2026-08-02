package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import A20.c;
import S0.A1;
import S0.B1;
import S0.G0;
import S0.InterfaceC3967k;
import T20.a;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import i1.C6981a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellStartScope;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aó\u0001\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#*\b\u0012\u0004\u0012\u00020\u00050\u001f2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 H\u0001¢\u0006\u0004\b$\u0010%\"&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0#0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,²\u0006\f\u0010+\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "subtitleSingleLine", "isReversed", "Lkotlin/Function1;", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellStartScope;", "", "start", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;", "end", "Lkotlin/Function0;", "onStartClick", "onEndClick", "onClick", "isEnabled", "showSeparator", "LZ1/h;", "verticalPadding", "startPadding", "endPadding", "Lt0/q;", "interactionSource", "startInteractionSource", "endInteractionSource", "DebugMenuCell-pLOo_7s", "(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZZLfd/n;Lfd/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZFFFLt0/q;Lt0/q;Lt0/q;LS0/k;III)V", "DebugMenuCell", "Lm0/D0;", "", "enabledAlpha", "pressedAlpha", "LS0/A1;", "animateClickAlpha", "(Lm0/D0;FFLS0/k;II)LS0/A1;", "LS0/G0;", "LocalAddonAlpha", "LS0/G0;", "getLocalAddonAlpha", "()LS0/G0;", "alpha", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuCellKt {

    @NotNull
    private static final G0<A1<Float>> LocalAddonAlpha = new B1(DebugMenuCellKt$LocalAddonAlpha$1.INSTANCE);

    /* renamed from: DebugMenuCell-pLOo_7s, reason: not valid java name */
    public static final void m1611DebugMenuCellpLOo_7s(e eVar, @NotNull String title, String str, boolean z11, boolean z12, InterfaceC6511n<? super DebugMenuCellStartScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super DebugMenuCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z13, boolean z14, float f7, float f11, float f12, q qVar, q qVar2, q qVar3, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        float f13;
        q qVar4;
        float f14;
        q qVar5;
        float f15;
        q qVar6;
        boolean z15;
        Intrinsics.checkNotNullParameter(title, "title");
        interfaceC3967k.o(-1733640734);
        e eVar2 = (i13 & 1) != 0 ? e.f40358c0 : eVar;
        String str2 = (i13 & 4) != 0 ? null : str;
        boolean z16 = (i13 & 8) != 0 ? false : z11;
        boolean z17 = (i13 & 16) == 0 ? z12 : false;
        InterfaceC6511n<? super DebugMenuCellStartScope, ? super InterfaceC3967k, ? super Integer, Unit> m1609getLambda1$ozon_debug_menu_release = (i13 & 32) != 0 ? ComposableSingletons$DebugMenuCellKt.INSTANCE.m1609getLambda1$ozon_debug_menu_release() : interfaceC6511n;
        InterfaceC6511n<? super DebugMenuCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> m1610getLambda2$ozon_debug_menu_release = (i13 & 64) != 0 ? ComposableSingletons$DebugMenuCellKt.INSTANCE.m1610getLambda2$ozon_debug_menu_release() : interfaceC6511n2;
        Function0<Unit> function04 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : function0;
        Function0<Unit> function05 = (i13 & 256) != 0 ? null : function02;
        Function0<Unit> function06 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? function03 : null;
        boolean z18 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z13;
        boolean z19 = (i13 & 2048) == 0 ? z14 : true;
        float f16 = (i13 & 4096) != 0 ? 12 : f7;
        float b11 = (i13 & 8192) != 0 ? a.b() : f11;
        Function0<Unit> function07 = function06;
        float b12 = (i13 & 16384) != 0 ? a.b() : f12;
        if ((i13 & 32768) != 0) {
            interfaceC3967k.o(-243854443);
            Object C11 = interfaceC3967k.C();
            f13 = b12;
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar4 = (q) C11;
            interfaceC3967k.k();
        } else {
            f13 = b12;
            qVar4 = qVar;
        }
        if ((i13 & 65536) != 0) {
            interfaceC3967k.o(-243851371);
            Object C12 = interfaceC3967k.C();
            f14 = f16;
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = p.a();
                interfaceC3967k.x(C12);
            }
            qVar5 = (q) C12;
            interfaceC3967k.k();
        } else {
            f14 = f16;
            qVar5 = qVar2;
        }
        if ((i13 & 131072) != 0) {
            interfaceC3967k.o(-243848363);
            Object C13 = interfaceC3967k.C();
            f15 = b11;
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = p.a();
                interfaceC3967k.x(C13);
            }
            qVar6 = (q) C13;
            interfaceC3967k.k();
        } else {
            f15 = b11;
            qVar6 = qVar3;
        }
        A1<Float> animateClickAlpha = animateClickAlpha(c.a(qVar4, interfaceC3967k, (i12 >> 15) & 14), 0.0f, 0.6f, interfaceC3967k, 384, 1);
        q qVar7 = qVar4;
        A1<Float> animateClickAlpha2 = animateClickAlpha(c.a(qVar5, interfaceC3967k, (i12 >> 18) & 14), 0.0f, 0.6f, interfaceC3967k, 384, 1);
        A1<Float> animateClickAlpha3 = animateClickAlpha(c.a(qVar6, interfaceC3967k, (i12 >> 21) & 14), 0.0f, 0.6f, interfaceC3967k, 384, 1);
        e eVar3 = eVar2;
        C4912a c11 = a1.c.c(-1505152860, new DebugMenuCellKt$DebugMenuCell$4(animateClickAlpha2, m1609getLambda1$ozon_debug_menu_release), interfaceC3967k);
        C4912a c12 = a1.c.c(889897957, new DebugMenuCellKt$DebugMenuCell$5(z16, title, str2, z17), interfaceC3967k);
        C4912a c13 = a1.c.c(-1010018522, new DebugMenuCellKt$DebugMenuCell$6(animateClickAlpha3, m1610getLambda2$ozon_debug_menu_release), interfaceC3967k);
        C4912a c14 = a1.c.c(1385032295, new DebugMenuCellKt$DebugMenuCell$7(z19), interfaceC3967k);
        C4912a c15 = a1.c.c(-514884184, new DebugMenuCellKt$DebugMenuCell$8(function04, qVar5, z18), interfaceC3967k);
        C4912a c16 = a1.c.c(1880166633, new DebugMenuCellKt$DebugMenuCell$9(function05, qVar6, z18), interfaceC3967k);
        e e11 = a0.e(b.a(eVar3, DebugMenuCellTestTags.Container), 1.0f);
        if (function07 != null) {
            e.a aVar = e.f40358c0;
            Intrinsics.f(function07);
            boolean z21 = z18;
            z15 = z21;
            e11 = e11.l0(i.b(aVar, qVar7, null, z21, null, null, function07, 24));
        } else {
            z15 = z18;
        }
        if (!z15) {
            e11 = e11.l0(C6981a.a(e.f40358c0, 0.4f));
        }
        interfaceC3967k.o(-243754364);
        boolean n11 = interfaceC3967k.n(animateClickAlpha);
        Object C14 = interfaceC3967k.C();
        if (n11 || C14 == InterfaceC3967k.a.a()) {
            C14 = new DebugMenuCellKt$DebugMenuCell$12$1(animateClickAlpha);
            interfaceC3967k.x(C14);
        }
        interfaceC3967k.k();
        float f17 = f14;
        e j11 = T.j(androidx.compose.ui.graphics.a.a(e11, (Function1) C14), f15, f17, 0.0f, 0.0f, 12);
        interfaceC3967k.o(-243750520);
        Object C15 = interfaceC3967k.C();
        if (C15 == InterfaceC3967k.a.a()) {
            C15 = DebugMenuCellKt$DebugMenuCell$13$1.INSTANCE;
            interfaceC3967k.x(C15);
        }
        Function1 function1 = (Function1) C15;
        interfaceC3967k.k();
        interfaceC3967k.o(-243742738);
        Object C16 = interfaceC3967k.C();
        if (C16 == InterfaceC3967k.a.a()) {
            C16 = DebugMenuCellKt$DebugMenuCell$14$1.INSTANCE;
            interfaceC3967k.x(C16);
        }
        interfaceC3967k.k();
        FoundationCellKt.m1613FoundationCelleXZ4JBQ(c11, c12, c13, c14, c15, c16, f17, f13, j11, function1, (Function1) C16, interfaceC3967k, ((i12 << 12) & 3670016) | 805531062 | ((i12 << 9) & 29360128), 6, 0);
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DebugMenuCell_pLOo_7s$lambda$3(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    @NotNull
    public static final A1<Float> animateClickAlpha(@NotNull D0<Boolean> d02, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(d02, "<this>");
        interfaceC3967k.o(-2100555787);
        if ((i12 & 1) != 0) {
            f7 = 1.0f;
        }
        if ((i12 & 2) != 0) {
            f11 = 0.4f;
        }
        DebugMenuCellKt$animateClickAlpha$1 debugMenuCellKt$animateClickAlpha$1 = DebugMenuCellKt$animateClickAlpha$1.INSTANCE;
        U0 b11 = W0.b();
        int i13 = (((i11 & 14) | 384) & 14) | 3072;
        boolean booleanValue = d02.h().booleanValue();
        interfaceC3967k.o(-1982997347);
        float f12 = booleanValue ? f11 * f7 : f7;
        interfaceC3967k.k();
        Float valueOf = Float.valueOf(f12);
        boolean booleanValue2 = d02.n().booleanValue();
        interfaceC3967k.o(-1982997347);
        if (booleanValue2) {
            f7 *= f11;
        }
        interfaceC3967k.k();
        D0.d d11 = H0.d(d02, valueOf, Float.valueOf(f7), debugMenuCellKt$animateClickAlpha$1.invoke((DebugMenuCellKt$animateClickAlpha$1) d02.m(), (D0.b<Boolean>) interfaceC3967k, (InterfaceC3967k) 0), b11, interfaceC3967k, (i13 & 14) | 196608);
        interfaceC3967k.k();
        return d11;
    }

    @NotNull
    public static final G0<A1<Float>> getLocalAddonAlpha() {
        return LocalAddonAlpha;
    }
}
