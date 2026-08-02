package ru.ozon.android.messenger.blocks.chat.ai;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.y0;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f84484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar) {
        super(2);
        this.f84484b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        long j11;
        e b11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e e11 = a0.e(a0.f(this.f84484b, 20), 1.0f);
            j11 = C7807Z.f72252f;
            b11 = androidx.compose.foundation.e.b(e11, j11, y0.a());
            C5185h.a(b11, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
