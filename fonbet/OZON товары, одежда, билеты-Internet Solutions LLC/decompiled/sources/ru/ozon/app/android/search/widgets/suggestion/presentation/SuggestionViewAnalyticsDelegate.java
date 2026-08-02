package ru.ozon.app.android.search.widgets.suggestion.presentation;

import WZ.e;
import WZ.l;
import WZ.t;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionViewAnalyticsDelegate;", "", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function0;", "", "isInVisibleBounds", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "pageIdModifier", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function0;LWZ/e;)V", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;", "item", "", "processViewEvent", "(Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;)V", "processViewEventOrDelay", "popDelayedViewEvents", "()V", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "LWZ/e;", "Ljava/util/LinkedList;", "viewAnalyticsEvents", "Ljava/util/LinkedList;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionViewAnalyticsDelegate {

    @NotNull
    private final Function0<Boolean> isInVisibleBounds;

    @NotNull
    private final e pageIdModifier;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final LinkedList<Function0<Unit>> viewAnalyticsEvents;

    public SuggestionViewAnalyticsDelegate(@NotNull l tokenizedAnalytics, @NotNull Function0<Boolean> isInVisibleBounds, @NotNull e pageIdModifier) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(isInVisibleBounds, "isInVisibleBounds");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isInVisibleBounds = isInVisibleBounds;
        this.pageIdModifier = pageIdModifier;
        this.viewAnalyticsEvents = new LinkedList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processViewEvent(SuggestionVO item) {
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent, this.pageIdModifier);
        }
    }

    public final void popDelayedViewEvents() {
        while (this.viewAnalyticsEvents.iterator().hasNext()) {
            this.viewAnalyticsEvents.pop().invoke();
        }
    }

    public final void processViewEventOrDelay(@NotNull SuggestionVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.isInVisibleBounds.invoke().booleanValue()) {
            processViewEvent(item);
        } else {
            this.viewAnalyticsEvents.push(new SuggestionViewAnalyticsDelegate$processViewEventOrDelay$1(this, item));
        }
    }
}
