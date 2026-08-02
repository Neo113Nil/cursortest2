package ru.ozon.app.android.search.widgets.suggestions.ui.common;

import WZ.e;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SuggestionsActionHandlerFactory$createActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ Function1<AtomAction.SendAnalytics, t> $getTokenizedEvent;
    final /* synthetic */ e $pageIdAnalyticModifier;
    final /* synthetic */ SuggestionsActionHandlerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SuggestionsActionHandlerFactory$createActionHandler$1(Function1<? super AtomAction.SendAnalytics, t> function1, SuggestionsActionHandlerFactory suggestionsActionHandlerFactory, e eVar) {
        super(1);
        this.$getTokenizedEvent = function1;
        this.this$0 = suggestionsActionHandlerFactory;
        this.$pageIdAnalyticModifier = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.ViewAction) {
            t invoke = this.$getTokenizedEvent.invoke(it);
            if (invoke != null) {
                SuggestionsActionHandlerFactory suggestionsActionHandlerFactory = this.this$0;
                e eVar = this.$pageIdAnalyticModifier;
                composerReferences2 = suggestionsActionHandlerFactory.refs;
                TokenizedAnalyticsExtensionsKt.processViewEvents(composerReferences2.getTokenizedAnalytics(), invoke, eVar);
            }
        } else {
            if (!(it instanceof AtomAction.Click)) {
                return Boolean.FALSE;
            }
            t invoke2 = this.$getTokenizedEvent.invoke(it);
            if (invoke2 != null) {
                SuggestionsActionHandlerFactory suggestionsActionHandlerFactory2 = this.this$0;
                e eVar2 = this.$pageIdAnalyticModifier;
                composerReferences = suggestionsActionHandlerFactory2.refs;
                TokenizedAnalyticsExtensionsKt.processClickEvents(composerReferences.getTokenizedAnalytics(), invoke2, eVar2);
            }
        }
        return Boolean.TRUE;
    }
}
