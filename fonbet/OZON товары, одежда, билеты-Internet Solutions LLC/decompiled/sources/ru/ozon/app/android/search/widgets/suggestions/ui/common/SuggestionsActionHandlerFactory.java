package ru.ozon.app.android.search.widgets.suggestions.ui.common;

import Vg.c;
import WZ.e;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u00030\tj\u0006\u0012\u0002\b\u0003`\n2\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customHandlers", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LVg/c;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "LWZ/e;", "pageIdAnalyticModifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "LWZ/t;", "getTokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "(Lru/ozon/composer/ui/widget/k;LWZ/e;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/c;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsActionHandlerFactory {

    @NotNull
    private final c customHandlers;

    @NotNull
    private final ComposerReferences refs;

    public SuggestionsActionHandlerFactory(@NotNull ComposerReferences refs, @NotNull c customHandlers) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customHandlers, "customHandlers");
        this.refs = refs;
        this.customHandlers = customHandlers;
    }

    @NotNull
    public final Function1<AtomAction, Unit> createActionHandler(@NotNull k<?> vh2, @NotNull e pageIdAnalyticModifier, @NotNull Function1<? super AtomAction.SendAnalytics, t> getTokenizedEvent) {
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(pageIdAnalyticModifier, "pageIdAnalyticModifier");
        Intrinsics.checkNotNullParameter(getTokenizedEvent, "getTokenizedEvent");
        return new ActionHandler.Builder(this.refs, vh2).customAnalyticHandler(new SuggestionsActionHandlerFactory$createActionHandler$1(getTokenizedEvent, this, pageIdAnalyticModifier)).customActionHandlers(new SuggestionsActionHandlerFactory$createActionHandler$2(this)).buildHandler();
    }
}
