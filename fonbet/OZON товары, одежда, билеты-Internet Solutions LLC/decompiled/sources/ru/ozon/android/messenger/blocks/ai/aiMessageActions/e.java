package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import f3.AbstractC6409a;
import f3.C6411c;
import g3.C6616a;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f83975b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f83976c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(androidx.compose.ui.e eVar, f fVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f83975b = eVar;
        this.f83976c = fVar;
        this.f83977d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e e11 = a0.e(this.f83975b, 1.0f);
            f fVar = this.f83976c;
            String a11 = fVar.getBlockId().a();
            interfaceC3967k2.o(-1336135355);
            ru.ozon.android.messenger.framework.core.d dVar = this.f83977d;
            boolean F11 = interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new d(dVar);
                interfaceC3967k2.x(C11);
            }
            Function1 function1 = (Function1) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.B(419377738);
            B0 a12 = C6616a.a(interfaceC3967k2);
            if (a12 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.reflect.d b11 = N.b(h.class);
            C6411c c6411c = new C6411c();
            c6411c.a(N.b(h.class), function1);
            w0 a13 = C6617b.a(b11, a12, a11, c6411c.b(), a12 instanceof InterfaceC5431s ? ((InterfaceC5431s) a12).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k2);
            interfaceC3967k2.K();
            ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.e.a(e11, fVar, (h) a13, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
