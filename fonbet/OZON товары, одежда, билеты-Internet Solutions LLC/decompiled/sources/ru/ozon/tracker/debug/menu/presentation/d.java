package ru.ozon.tracker.debug.menu.presentation;

import S0.B1;
import S0.C3996z;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ui0.C10063b;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TrackerDebugMenuActivity f97763b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f97764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(TrackerDebugMenuActivity trackerDebugMenuActivity, String str) {
        super(2);
        this.f97763b = trackerDebugMenuActivity;
        this.f97764c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            B1 a11 = C10063b.a();
            TrackerDebugMenuActivity trackerDebugMenuActivity = this.f97763b;
            C3996z.a(a11.c(TrackerDebugMenuActivity.H(trackerDebugMenuActivity).h0()), a1.c.c(-129356574, new c(trackerDebugMenuActivity, this.f97764c), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
