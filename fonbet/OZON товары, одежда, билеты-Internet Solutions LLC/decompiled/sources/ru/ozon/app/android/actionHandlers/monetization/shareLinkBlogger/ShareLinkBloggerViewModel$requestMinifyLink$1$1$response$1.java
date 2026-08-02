package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

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
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1", f = "ShareLinkBloggerViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1 extends j implements Function2<M, d<? super ShareLinkBloggerResponse>, Object> {
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ ShareLinkBloggerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1(ShareLinkBloggerViewModel shareLinkBloggerViewModel, ActionV2Request actionV2Request, d<? super ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1> dVar) {
        super(2, dVar);
        this.this$0 = shareLinkBloggerViewModel;
        this.$request = actionV2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, ShareLinkBloggerResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return ((ActionV2Response) obj).getData();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ShareLinkBloggerResponse> dVar) {
        return ((ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
