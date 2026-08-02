package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdditionalReviewViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ AdditionalReviewViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReviewViewHolder$actionHandler$2(AdditionalReviewViewHolder additionalReviewViewHolder) {
        super(0);
        this.this$0 = additionalReviewViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        return new ActionHandler.Builder(composerReferences, this.this$0).buildHandler();
    }
}
