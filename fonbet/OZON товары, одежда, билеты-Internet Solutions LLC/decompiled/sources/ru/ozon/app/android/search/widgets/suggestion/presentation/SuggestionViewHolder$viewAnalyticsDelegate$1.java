package ru.ozon.app.android.search.widgets.suggestion.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class SuggestionViewHolder$viewAnalyticsDelegate$1 extends C7735q implements Function0<Boolean> {
    SuggestionViewHolder$viewAnalyticsDelegate$1(Object obj) {
        super(0, obj, SuggestionViewHolder.class, "isInVisibleBounds", "isInVisibleBounds()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((SuggestionViewHolder) this.receiver).isInVisibleBounds());
    }
}
