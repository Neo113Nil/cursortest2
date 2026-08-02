package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.data.HasUnreadMessagesInBloggerChatsResponse;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewModel$fetchAction$1", f = "UnreadMessageIndicatorViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30, 38}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class UnreadMessageIndicatorViewModel$fetchAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UnreadMessageIndicatorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnreadMessageIndicatorViewModel$fetchAction$1(UnreadMessageIndicatorViewModel unreadMessageIndicatorViewModel, String str, d<? super UnreadMessageIndicatorViewModel$fetchAction$1> dVar) {
        super(2, dVar);
        this.this$0 = unreadMessageIndicatorViewModel;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UnreadMessageIndicatorViewModel$fetchAction$1 unreadMessageIndicatorViewModel$fetchAction$1 = new UnreadMessageIndicatorViewModel$fetchAction$1(this.this$0, this.$actionName, dVar);
        unreadMessageIndicatorViewModel$fetchAction$1.L$0 = obj;
        return unreadMessageIndicatorViewModel$fetchAction$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r0.emit(r3, r10) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        HasUnreadMessagesInBloggerChatsResponse hasUnreadMessagesInBloggerChatsResponse;
        w0 w0Var;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            UnreadMessageIndicatorViewModel unreadMessageIndicatorViewModel = this.this$0;
            String str = this.$actionName;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = unreadMessageIndicatorViewModel.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(null, str, false, 5, null);
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, HasUnreadMessagesInBloggerChatsResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (HasUnreadMessagesInBloggerChatsResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        UnreadMessageIndicatorViewModel unreadMessageIndicatorViewModel2 = this.this$0;
        if (!(a11 instanceof r.b) && (hasUnreadMessagesInBloggerChatsResponse = (HasUnreadMessagesInBloggerChatsResponse) a11) != null) {
            w0Var = unreadMessageIndicatorViewModel2._hasUnreadMessages;
            Boolean valueOf = Boolean.valueOf(hasUnreadMessagesInBloggerChatsResponse.getHasUnreadMessages());
            this.L$0 = a11;
            this.label = 2;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UnreadMessageIndicatorViewModel$fetchAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
