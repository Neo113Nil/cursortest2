package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class SuggestionsBadgeTitleSubtitleViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction.SendAnalytics, t> {
    SuggestionsBadgeTitleSubtitleViewHolder$actionHandler$1(Object obj) {
        super(1, obj, SuggestionsBadgeTitleSubtitleViewHolder.class, "getTokenizedEvent", "getTokenizedEvent(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)Lru/ozon/composer/analytics/tokenized/TokenizedEvent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final t invoke(AtomAction.SendAnalytics p02) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(p02, "p0");
        tokenizedEvent = ((SuggestionsBadgeTitleSubtitleViewHolder) this.receiver).getTokenizedEvent(p02);
        return tokenizedEvent;
    }
}
