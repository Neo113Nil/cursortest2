package io.intercom.android.sdk.m5.helpcenter;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1", f = "HelpCenterViewModel.kt", i = {0, 0, 0, 0, 1, 1}, l = {311, 314, 319}, m = "invokeSuspend", n = {"collectionDetailsContent", "collectionsContent", "shouldAddToCollectionDetails", "shouldAddToCollections", "collectionsContent", "shouldAddToCollections"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "I$0"})
/* loaded from: classes9.dex */
final class HelpCenterViewModel$onArticleClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$onArticleClicked$1(HelpCenterViewModel helpCenterViewModel, Continuation<? super HelpCenterViewModel$onArticleClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = helpCenterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterViewModel$onArticleClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterViewModel$onArticleClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean shouldAddSendMessageRow;
        MutableStateFlow mutableStateFlow;
        CollectionDetailsUiState.Content content;
        MutableStateFlow mutableStateFlow2;
        CollectionsUiState.Content content2;
        int i;
        int i2;
        MutableStateFlow mutableStateFlow3;
        Object ctaData;
        CollectionDetailsUiState.Content content3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        CollectionsUiState.Content content4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.hasClickedAtLeastOneArticle = true;
            shouldAddSendMessageRow = this.this$0.shouldAddSendMessageRow();
            if (shouldAddSendMessageRow) {
                mutableStateFlow = this.this$0._collectionDetailsState;
                Object value = mutableStateFlow.getValue();
                content = value instanceof CollectionDetailsUiState.Content ? (CollectionDetailsUiState.Content) value : null;
                mutableStateFlow2 = this.this$0._collectionsState;
                Object value2 = mutableStateFlow2.getValue();
                CollectionsUiState.Content content5 = value2 instanceof CollectionsUiState.Content ? (CollectionsUiState.Content) value2 : null;
                int i4 = 0;
                int i5 = (content == null || content.hasSendMessageRow()) ? 0 : 1;
                if (content5 != null && !content5.hasSendMessageRow()) {
                    i4 = 1;
                }
                if (i5 != 0 || i4 != 0) {
                    this.L$0 = content;
                    this.L$1 = content5;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.label = 1;
                    if (DelayKt.delay(2000L, this) != coroutine_suspended) {
                        int i6 = i4;
                        content2 = content5;
                        i = i6;
                        i2 = i5;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow6 = (MutableStateFlow) this.L$1;
                content4 = (CollectionsUiState.Content) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableStateFlow6.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                return Unit.INSTANCE;
            }
            i = this.I$0;
            mutableStateFlow4 = (MutableStateFlow) this.L$2;
            content3 = (CollectionDetailsUiState.Content) this.L$1;
            content2 = (CollectionsUiState.Content) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableStateFlow4.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
            if (i != 0 && content2 != null) {
                HelpCenterViewModel helpCenterViewModel = this.this$0;
                mutableStateFlow5 = helpCenterViewModel._collectionsState;
                this.L$0 = content2;
                this.L$1 = mutableStateFlow5;
                this.L$2 = null;
                this.label = 3;
                obj = helpCenterViewModel.getCtaData(this);
                if (obj != coroutine_suspended) {
                    mutableStateFlow6 = mutableStateFlow5;
                    content4 = content2;
                    mutableStateFlow6.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        i = this.I$1;
        i2 = this.I$0;
        content2 = (CollectionsUiState.Content) this.L$1;
        CollectionDetailsUiState.Content content6 = (CollectionDetailsUiState.Content) this.L$0;
        ResultKt.throwOnFailure(obj);
        content = content6;
        if (i2 != 0 && content != null) {
            HelpCenterViewModel helpCenterViewModel2 = this.this$0;
            mutableStateFlow3 = helpCenterViewModel2._collectionDetailsState;
            this.L$0 = content2;
            this.L$1 = content;
            this.L$2 = mutableStateFlow3;
            this.I$0 = i;
            this.label = 2;
            ctaData = helpCenterViewModel2.getCtaData(this);
            if (ctaData != coroutine_suspended) {
                content3 = content;
                obj = ctaData;
                mutableStateFlow4 = mutableStateFlow3;
                mutableStateFlow4.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
            }
            return coroutine_suspended;
        }
        if (i != 0) {
            HelpCenterViewModel helpCenterViewModel3 = this.this$0;
            mutableStateFlow5 = helpCenterViewModel3._collectionsState;
            this.L$0 = content2;
            this.L$1 = mutableStateFlow5;
            this.L$2 = null;
            this.label = 3;
            obj = helpCenterViewModel3.getCtaData(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
