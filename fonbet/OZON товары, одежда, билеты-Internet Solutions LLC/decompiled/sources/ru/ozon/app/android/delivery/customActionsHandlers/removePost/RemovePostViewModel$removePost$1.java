package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostViewModel$removePost$1", f = "RemovePostViewModel.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class RemovePostViewModel$removePost$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $postInfo;
    int label;
    final /* synthetic */ RemovePostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemovePostViewModel$removePost$1(RemovePostViewModel removePostViewModel, String str, String str2, d<? super RemovePostViewModel$removePost$1> dVar) {
        super(2, dVar);
        this.this$0 = removePostViewModel;
        this.$actionName = str;
        this.$postInfo = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RemovePostViewModel$removePost$1(this.this$0, this.$actionName, this.$postInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PostRepository postRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            postRepository = this.this$0.repository;
            String str = this.$actionName;
            String str2 = this.$postInfo;
            this.label = 1;
            obj = postRepository.removePost(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.getRemovePostResult().postValue((Result) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RemovePostViewModel$removePost$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
