package ru.ozon.app.android.account.user;

import Sc.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0006\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSc/r;", "", "kotlin.jvm.PlatformType", "it", "invoke", "(LSc/r;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class UserManagerImpl$doOnSuccess$1 extends AbstractC7737t implements Function1<r<? extends Unit>, Unit> {
    final /* synthetic */ User $userValue;
    final /* synthetic */ UserManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserManagerImpl$doOnSuccess$1(UserManagerImpl userManagerImpl, User user) {
        super(1);
        this.this$0 = userManagerImpl;
        this.$userValue = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(r<? extends Unit> rVar) {
        invoke2(rVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(r<? extends Unit> rVar) {
        UserLocalDataStore userLocalDataStore;
        if (rVar.getF26106a() instanceof r.b) {
            return;
        }
        userLocalDataStore = this.this$0.userLocalDataStore;
        userLocalDataStore.saveUser(this.$userValue);
    }
}
