package ru.ozon.tracker.debug.menu.presentation;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Di0.b;
import P0.Z0;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.n1;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import ff0.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import mf0.C8140b;
import mf0.C8144f;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TrackerDebugMenuActivity f97761b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f97762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(TrackerDebugMenuActivity trackerDebugMenuActivity, String str) {
        super(2);
        this.f97761b = trackerDebugMenuActivity;
        this.f97762c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        C8140b c8140b;
        C8140b c8140b2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            TrackerDebugMenuActivity trackerDebugMenuActivity = this.f97761b;
            if (((Boolean) n1.b(TrackerDebugMenuActivity.H(trackerDebugMenuActivity).g0(), interfaceC3967k2).getValue()).booleanValue()) {
                interfaceC3967k2.o(-1174684006);
                b.C0144b c0144b = b.C0144b.f6732b;
                Function1 F11 = TrackerDebugMenuActivity.F(trackerDebugMenuActivity);
                c8140b = trackerDebugMenuActivity.f97741j;
                h.a(c0144b, null, null, null, c8140b, null, F11, interfaceC3967k2, 6, 46);
                String str = this.f97762c;
                if (str != null) {
                    c8140b2 = trackerDebugMenuActivity.f97741j;
                    c8140b2.e(str, C8144f.f74844b);
                    Unit unit = Unit.f71690a;
                }
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-1174334729);
                e d11 = a0.d(e.f40358c0);
                V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I11 = interfaceC3967k2.I();
                A0 d12 = interfaceC3967k2.d();
                e f11 = androidx.compose.ui.c.f(interfaceC3967k2, d11);
                InterfaceC2801g.f5440U.getClass();
                Function0 a11 = InterfaceC2801g.a.a();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(a11);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 d13 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d12);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(d13, I11, interfaceC3967k2, I11);
                }
                F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
                Z0.a(null, 0L, 0.0f, 0L, 0, interfaceC3967k2, 0, 31);
                interfaceC3967k2.f();
                interfaceC3967k2.k();
            }
        }
        return Unit.f71690a;
    }
}
