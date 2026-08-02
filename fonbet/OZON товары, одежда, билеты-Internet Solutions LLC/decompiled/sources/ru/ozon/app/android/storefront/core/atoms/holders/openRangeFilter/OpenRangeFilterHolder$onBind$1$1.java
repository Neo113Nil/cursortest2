package ru.ozon.app.android.storefront.core.atoms.holders.openRangeFilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterViewData;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "data", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OpenRangeFilterHolder$onBind$1$1 extends AbstractC7737t implements Function1<OpenRangeFilterViewData, Unit> {
    final /* synthetic */ OpenRangeFilter $item;
    final /* synthetic */ OpenRangeFilterHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenRangeFilterHolder$onBind$1$1(OpenRangeFilter openRangeFilter, OpenRangeFilterHolder openRangeFilterHolder) {
        super(1);
        this.$item = openRangeFilter;
        this.this$0 = openRangeFilterHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OpenRangeFilterViewData openRangeFilterViewData) {
        invoke2(openRangeFilterViewData);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OpenRangeFilterViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AtomAction extractAction = OpenRangeFilterMapperKt.extractAction(this.$item, data);
        if (extractAction != null) {
            this.this$0.handleAction(extractAction);
        }
    }
}
