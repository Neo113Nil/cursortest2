package io.intercom.android.sdk.helpcenter.search;

import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.objectweb.asm.Opcodes;

/* compiled from: ArticleSearchViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1", f = "ArticleSearchViewModel.kt", i = {0}, l = {Opcodes.INVOKESPECIAL, Opcodes.INVOKEINTERFACE}, m = "invokeSuspend", n = {"currentState"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class ArticleSearchViewModel$addTeammateHelpRow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$addTeammateHelpRow$1(ArticleSearchViewModel articleSearchViewModel, Continuation<? super ArticleSearchViewModel$addTeammateHelpRow$1> continuation) {
        super(2, continuation);
        this.this$0 = articleSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArticleSearchViewModel$addTeammateHelpRow$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArticleSearchViewModel$addTeammateHelpRow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(2000, r6) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean shouldAddSendMessageRow;
        ArticleSearchState articleSearchState;
        ArticleSearchState.Content content;
        Object teammateHelpRow;
        MutableStateFlow mutableStateFlow;
        Collection collection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.hasClickedAtLeastOneArticle = true;
            shouldAddSendMessageRow = this.this$0.shouldAddSendMessageRow();
            if (shouldAddSendMessageRow) {
                articleSearchState = (ArticleSearchState) this.this$0._state.getValue();
                if (articleSearchState instanceof ArticleSearchState.Content) {
                    List<ArticleSearchResultRow> searchResults = ((ArticleSearchState.Content) articleSearchState).getSearchResults();
                    if (!(searchResults instanceof Collection) || !searchResults.isEmpty()) {
                        Iterator<T> it = searchResults.iterator();
                        while (it.hasNext()) {
                            if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                                break;
                            }
                        }
                    }
                    this.L$0 = articleSearchState;
                    this.label = 1;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) this.L$2;
            content = (ArticleSearchState.Content) this.L$1;
            mutableStateFlow = (MutableStateFlow) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableStateFlow.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj)));
            return Unit.INSTANCE;
        }
        articleSearchState = (ArticleSearchState) this.L$0;
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow2 = this.this$0._state;
        content = (ArticleSearchState.Content) articleSearchState;
        List<ArticleSearchResultRow> searchResults2 = content.getSearchResults();
        this.L$0 = mutableStateFlow2;
        this.L$1 = content;
        this.L$2 = searchResults2;
        this.label = 2;
        teammateHelpRow = this.this$0.teammateHelpRow(this);
        if (teammateHelpRow != coroutine_suspended) {
            mutableStateFlow = mutableStateFlow2;
            obj = teammateHelpRow;
            collection = searchResults2;
            mutableStateFlow.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj)));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
