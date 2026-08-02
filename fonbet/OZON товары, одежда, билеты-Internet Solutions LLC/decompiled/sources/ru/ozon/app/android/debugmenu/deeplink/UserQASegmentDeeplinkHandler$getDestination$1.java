package ru.ozon.app.android.debugmenu.deeplink;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import pZ.f;
import pZ.h;
import ru.ozon.app.android.debugmenu.R$string;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentInteractor;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentState;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.UserQASegmentDeeplinkHandler$getDestination$1", f = "UserQASegmentDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UserQASegmentDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    int label;
    final /* synthetic */ UserQASegmentDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserQASegmentDeeplinkHandler$getDestination$1(UserQASegmentDeeplinkHandler userQASegmentDeeplinkHandler, d<? super UserQASegmentDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.this$0 = userQASegmentDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new UserQASegmentDeeplinkHandler$getDestination$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        UserQASegmentInteractor userQASegmentInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        UserQASegmentDeeplinkHandler userQASegmentDeeplinkHandler = this.this$0;
        try {
            r.Companion companion = r.INSTANCE;
            userQASegmentInteractor = userQASegmentDeeplinkHandler.userQASegmentInteractor;
            a11 = (UserQASegmentState) userQASegmentInteractor.addUserToQASegment().d();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (r.b(a11) != null) {
            a11 = new UserQASegmentState(R$string.error_debugmenu_user_qa_failure);
        }
        UserQASegmentState userQASegmentState = (UserQASegmentState) a11;
        if (userQASegmentState != null) {
            return new h(StringProvider.getString(userQASegmentState.getMessage()));
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((UserQASegmentDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
