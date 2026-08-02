package ru.ozon.debugMenu.internal.core.ui.widgets.navBar.search;

import A0.h;
import B0.C2454a;
import B0.C2475h;
import B1.V;
import D1.InterfaceC2801g;
import K1.T;
import Nk.a;
import Q1.X;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import android.os.Build;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.K0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import t0.p;
import t0.q;
import u0.E;
import u0.InterfaceC9890C;
import y20.C10833a;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ai\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0015\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/e;", "modifier", "", "onFocusChanged", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "NavBarSearch", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LQ1/X;Lt0/q;LS0/k;II)V", "Lu0/C;", "LZ1/h;", "width", "SpacerWidth-ziNgDLE", "(Lu0/C;FLS0/k;I)V", "SpacerWidth", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBarSearchKt {
    public static final void NavBarSearch(@NotNull String value, String str, @NotNull Function1<? super String, Unit> onValueChange, e eVar, Function1<? super Boolean, Unit> function1, X x11, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function1<? super Boolean, Unit> function12;
        q qVar2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        interfaceC3967k.o(-1189446621);
        e eVar2 = (i12 & 8) != 0 ? e.f40358c0 : eVar;
        if ((i12 & 16) != 0) {
            interfaceC3967k.o(846487464);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = NavBarSearchKt$NavBarSearch$1$1.INSTANCE;
                interfaceC3967k.x(C11);
            }
            function12 = (Function1) C11;
            interfaceC3967k.k();
        } else {
            function12 = function1;
        }
        X a11 = (i12 & 32) != 0 ? X.a.a() : x11;
        if ((i12 & 64) != 0) {
            interfaceC3967k.o(846491661);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = p.a();
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            qVar2 = (q) C12;
        } else {
            qVar2 = qVar;
        }
        if (Build.VERSION.SDK_INT <= 27) {
            eVar2 = eVar2.l0(FocusableKt.a(e.f40358c0, true, null));
        }
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, eVar2);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        K0 k02 = new K0(C10833a.a(interfaceC3967k).a());
        T c11 = T.c(C10833a.b().d(), C10833a.a(interfaceC3967k).l(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
        e b11 = androidx.compose.foundation.e.b(a0.f(a0.e(e.f40358c0, 1.0f), 40), C10833a.a(interfaceC3967k).i(), h.b(12));
        interfaceC3967k.o(778436325);
        boolean z11 = (((57344 & i11) ^ 24576) > 16384 && interfaceC3967k.n(function12)) || (i11 & 24576) == 16384;
        Object C13 = interfaceC3967k.C();
        if (z11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new NavBarSearchKt$NavBarSearch$4$1$1(function12);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        C2475h.d(value, onValueChange, b.b(androidx.compose.ui.focus.a.a(b11, (Function1) C13), "DebugMenuNavBarSearch.Input"), false, false, c11, null, null, true, 0, 0, a11, null, qVar2, k02, a1.c.c(1567249152, new NavBarSearchKt$NavBarSearch$4$2(value, onValueChange, str), interfaceC3967k), interfaceC3967k, (i11 & 14) | 100663296 | ((i11 >> 3) & 112), ((i11 >> 12) & 112) | 196608 | ((i11 >> 9) & 7168), 5848);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SpacerWidth-ziNgDLE, reason: not valid java name */
    public static final void m1638SpacerWidthziNgDLE(InterfaceC9890C interfaceC9890C, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(343212890);
        E.a(interfaceC3967k, a0.r(e.f40358c0, f7));
        interfaceC3967k.k();
    }
}
