package ru.ozon.app.android.storage.auth;

import Nc.C3667a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNc/a;", "", "invoke", "()LNc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class AuthStateStorageImpl$authStateSubject$2 extends AbstractC7737t implements Function0<C3667a<Boolean>> {
    final /* synthetic */ OzonIdCookieEvents $ozonIdCookieEvents;
    final /* synthetic */ AuthStateStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthStateStorageImpl$authStateSubject$2(AuthStateStorageImpl authStateStorageImpl, OzonIdCookieEvents ozonIdCookieEvents) {
        super(0);
        this.this$0 = authStateStorageImpl;
        this.$ozonIdCookieEvents = ozonIdCookieEvents;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C3667a<Boolean> invoke() {
        C3667a<Boolean> createSubject;
        createSubject = this.this$0.createSubject(this.$ozonIdCookieEvents);
        return createSubject;
    }
}
