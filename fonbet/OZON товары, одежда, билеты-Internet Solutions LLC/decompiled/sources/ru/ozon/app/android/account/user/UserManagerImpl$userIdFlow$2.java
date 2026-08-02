package ru.ozon.app.android.account.user;

import Ae.C2399j;
import Ae.C2405m;
import Ae.I0;
import Ae.InterfaceC2395h;
import Be.n;
import Ob0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAe/h;", "", "invoke", "()LAe/h;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class UserManagerImpl$userIdFlow$2 extends AbstractC7737t implements Function0<InterfaceC2395h<? extends Long>> {
    final /* synthetic */ UserManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserManagerImpl$userIdFlow$2(UserManagerImpl userManagerImpl) {
        super(0);
        this.this$0 = userManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2395h<? extends Long> invoke() {
        a aVar;
        M m11;
        aVar = this.this$0.ozonIdAppApi;
        n F11 = C2399j.F(new C2405m(Long.valueOf(aVar.getUserId())), this.this$0.getUserIdChangedFlow());
        m11 = this.this$0.coroutineScope;
        int i11 = I0.f818a;
        return C2399j.c(C2399j.K(F11, m11, I0.a.b(3), 1), 1, EnumC11113a.DROP_OLDEST);
    }
}
