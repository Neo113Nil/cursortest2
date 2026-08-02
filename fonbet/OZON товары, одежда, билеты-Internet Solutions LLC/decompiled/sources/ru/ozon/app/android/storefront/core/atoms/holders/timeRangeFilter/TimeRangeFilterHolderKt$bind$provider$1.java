package ru.ozon.app.android.storefront.core.atoms.holders.timeRangeFilter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.core.atoms.views.TimeRangeFilterView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/core/atoms/holders/timeRangeFilter/TimeRangeFilterHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimeRangeFilterHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<TimeRangeFilterHolder> {
    final /* synthetic */ TimeRangeFilterView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeRangeFilterHolderKt$bind$provider$1(TimeRangeFilterView timeRangeFilterView) {
        super(0);
        this.$this_bind = timeRangeFilterView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TimeRangeFilterHolder invoke() {
        return new TimeRangeFilterHolder(this.$this_bind, (String) null);
    }
}
