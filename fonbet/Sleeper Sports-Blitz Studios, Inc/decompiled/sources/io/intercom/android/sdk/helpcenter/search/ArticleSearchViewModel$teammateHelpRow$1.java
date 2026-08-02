package io.intercom.android.sdk.helpcenter.search;

import androidx.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ArticleSearchViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", i = {0}, l = {PsExtractor.VIDEO_STREAM_MASK}, m = "teammateHelpRow", n = {"teamPresenceState"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class ArticleSearchViewModel$teammateHelpRow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$teammateHelpRow$1(ArticleSearchViewModel articleSearchViewModel, Continuation<? super ArticleSearchViewModel$teammateHelpRow$1> continuation) {
        super(continuation);
        this.this$0 = articleSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object teammateHelpRow;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        teammateHelpRow = this.this$0.teammateHelpRow(this);
        return teammateHelpRow;
    }
}
