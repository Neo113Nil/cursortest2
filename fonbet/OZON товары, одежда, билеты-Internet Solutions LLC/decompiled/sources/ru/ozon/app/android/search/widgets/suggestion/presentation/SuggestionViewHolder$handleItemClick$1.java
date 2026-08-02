package ru.ozon.app.android.search.widgets.suggestion.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SuggestionViewHolder$handleItemClick$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SuggestionVO $item;
    final /* synthetic */ SuggestionViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionViewHolder$handleItemClick$1(SuggestionViewHolder suggestionViewHolder, SuggestionVO suggestionVO) {
        super(0);
        this.this$0 = suggestionViewHolder;
        this.$item = suggestionVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), this.$item.getDeeplink(), null, 2, null);
    }
}
