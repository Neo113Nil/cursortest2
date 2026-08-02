package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter.LinesLayoutManager;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/LinesLayoutManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BadgeListWidgetViewHolder$linesLayoutManager$2 extends AbstractC7737t implements Function0<LinesLayoutManager> {
    final /* synthetic */ BadgeListWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeListWidgetViewHolder$linesLayoutManager$2(BadgeListWidgetViewHolder badgeListWidgetViewHolder) {
        super(0);
        this.this$0 = badgeListWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LinesLayoutManager invoke() {
        return new LinesLayoutManager(UiExtKt.toPx(8, this.this$0.getContext()));
    }
}
