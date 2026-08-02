package ru.ozon.app.android.regulardraw.ui;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.c;
import android.os.Build;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "content", "CompatibleGraphicsLayer", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "SoftwareLayerComposable", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompatibleGraphicsLayerKt {
    public static final void CompatibleGraphicsLayer(e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(535418571);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(content) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            if (Build.VERSION.SDK_INT < 28) {
                u11.o(1467801732);
                SoftwareLayerComposable(eVar, c.c(-495714139, new CompatibleGraphicsLayerKt$CompatibleGraphicsLayer$1(content), u11), u11, (i13 & 14) | 48, 0);
                u11.k();
            } else {
                u11.o(1467889400);
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = androidx.compose.ui.c.f(u11, eVar);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                content.invoke(u11, Integer.valueOf((i13 >> 3) & 14));
                u11.f();
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CompatibleGraphicsLayerKt$CompatibleGraphicsLayer$3(eVar, content, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SoftwareLayerComposable(e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1701481754);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function2) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(1515531006);
            boolean z11 = (i13 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CompatibleGraphicsLayerKt$SoftwareLayerComposable$1$1(function2);
                u11.x(C11);
            }
            u11.k();
            e eVar2 = eVar;
            androidx.compose.ui.viewinterop.a.a((Function1) C11, eVar2, null, u11, (i13 << 3) & 112, 4);
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CompatibleGraphicsLayerKt$SoftwareLayerComposable$2(eVar, function2, i11, i12));
        }
    }
}
