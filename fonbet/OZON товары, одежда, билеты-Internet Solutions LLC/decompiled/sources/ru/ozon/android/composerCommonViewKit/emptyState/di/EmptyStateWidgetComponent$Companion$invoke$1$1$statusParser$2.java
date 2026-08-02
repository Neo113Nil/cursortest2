package ru.ozon.android.composerCommonViewKit.emptyState.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core.StatusWidgetParser;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateWidgetComponent$Companion$invoke$1$1$statusParser$2 extends AbstractC7737t implements Function0<StatusWidgetParser> {
    final /* synthetic */ EmptyStateWidgetComponent$Companion$invoke$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateWidgetComponent$Companion$invoke$1$1$statusParser$2(EmptyStateWidgetComponent$Companion$invoke$1$1 emptyStateWidgetComponent$Companion$invoke$1$1) {
        super(0);
        this.this$0 = emptyStateWidgetComponent$Companion$invoke$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StatusWidgetParser invoke() {
        JsonParser jsonParser;
        jsonParser = this.this$0.getJsonParser();
        return new StatusWidgetParser(jsonParser);
    }
}
