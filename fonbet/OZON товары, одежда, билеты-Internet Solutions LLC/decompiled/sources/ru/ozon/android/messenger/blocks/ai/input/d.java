package ru.ozon.android.messenger.blocks.ai.input;

import S0.InterfaceC3967k;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import f3.C6411c;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.android.messenger.blocks.ai.input.presentation.view.i;
import ru.ozon.android.messenger.blocks.ai.input.presentation.view.o;
import ru.ozon.android.messenger.framework.presentation.ai.J0;
import ru.ozon.android.messenger.framework.presentation.ai.K0;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.input.presentation.a f84196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar) {
        super(2);
        this.f84195b = dVar;
        this.f84196c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.core.d dVar = this.f84195b;
            InterfaceC5431s d11 = dVar.d();
            J0 j02 = d11 instanceof J0 ? (J0) d11 : null;
            K0 f89424h = j02 != null ? j02.getF89424h() : null;
            ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
            ComponentCallbacksC5392m d12 = dVar.d();
            interfaceC3967k2.o(-1818453225);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = c.f84194b;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            interfaceC3967k2.B(419377738);
            kotlin.reflect.d b11 = N.b(o.class);
            C6411c c6411c = new C6411c();
            c6411c.a(N.b(o.class), (Function1) C11);
            w0 a11 = C6617b.a(b11, d12, null, c6411c.b(), d12.getDefaultViewModelCreationExtras(), interfaceC3967k2);
            interfaceC3967k2.K();
            i.a(c11, this.f84196c, f89424h, (o) a11, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
