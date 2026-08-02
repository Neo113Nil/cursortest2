package ru.ozon.app.android.common.actionHandlers.shareLink;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkViewModel$onClickShare$1", f = "ShareLinkViewModel.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareLinkViewModel$onClickShare$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ShareRequestLink $action;
    final /* synthetic */ Function1<String, Unit> $showLink;
    Object L$0;
    int label;
    final /* synthetic */ ShareLinkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ShareLinkViewModel$onClickShare$1(Function1<? super String, Unit> function1, ShareLinkViewModel shareLinkViewModel, ShareRequestLink shareRequestLink, d<? super ShareLinkViewModel$onClickShare$1> dVar) {
        super(2, dVar);
        this.$showLink = function1;
        this.this$0 = shareLinkViewModel;
        this.$action = shareRequestLink;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShareLinkViewModel$onClickShare$1(this.$showLink, this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ShareButtonRepository shareButtonRepository;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Function1<String, Unit> function12 = this.$showLink;
            shareButtonRepository = this.this$0.shareButtonRepository;
            ShareRequestLink shareRequestLink = this.$action;
            this.L$0 = function12;
            this.label = 1;
            Object fetchLinkShare = shareButtonRepository.fetchLinkShare(shareRequestLink, this);
            if (fetchLinkShare == aVar) {
                return aVar;
            }
            function1 = function12;
            obj = fetchLinkShare;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.L$0;
            s.b(obj);
        }
        function1.invoke(obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShareLinkViewModel$onClickShare$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
