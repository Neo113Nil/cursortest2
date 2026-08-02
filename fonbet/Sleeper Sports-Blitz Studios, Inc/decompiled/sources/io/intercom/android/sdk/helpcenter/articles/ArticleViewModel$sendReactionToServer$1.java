package io.intercom.android.sdk.helpcenter.articles;

import com.facebook.imagepipeline.common.RotationOptions;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ArticleViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1", f = "ArticleViewModel.kt", i = {}, l = {RotationOptions.ROTATE_270}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ArticleViewModel$sendReactionToServer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $articleContentId;
    final /* synthetic */ String $articleId;
    final /* synthetic */ int $reactionIndex;
    int label;
    final /* synthetic */ ArticleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleViewModel$sendReactionToServer$1(ArticleViewModel articleViewModel, String str, int i, String str2, Continuation<? super ArticleViewModel$sendReactionToServer$1> continuation) {
        super(2, continuation);
        this.this$0 = articleViewModel;
        this.$articleId = str;
        this.$reactionIndex = i;
        this.$articleContentId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArticleViewModel$sendReactionToServer$1(this.this$0, this.$articleId, this.$reactionIndex, this.$articleContentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArticleViewModel$sendReactionToServer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HelpCenterApi helpCenterApi;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            helpCenterApi = this.this$0.helpCenterApi;
            String str = this.$articleId;
            int i2 = this.$reactionIndex;
            String str2 = this.$articleContentId;
            z = this.this$0.isFromSearchBrowse;
            String str3 = z ? "search_browse" : null;
            this.label = 1;
            if (HelpCenterApi.DefaultImpls.reactToArticle$default(helpCenterApi, str, i2, str2, false, str3, null, this, 40, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
