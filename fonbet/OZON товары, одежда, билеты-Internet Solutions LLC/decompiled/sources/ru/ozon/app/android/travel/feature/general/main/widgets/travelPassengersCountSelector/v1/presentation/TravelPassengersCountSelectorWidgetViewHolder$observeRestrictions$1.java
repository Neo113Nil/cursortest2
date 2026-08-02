package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPassengersCountSelectorWidgetViewHolder$observeRestrictions$1 extends AbstractC7737t implements Function1<Restriction, Unit> {
    final /* synthetic */ TravelPassengersCountSelectorWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersCountSelectorWidgetViewHolder$observeRestrictions$1(TravelPassengersCountSelectorWidgetViewHolder travelPassengersCountSelectorWidgetViewHolder) {
        super(1);
        this.this$0 = travelPassengersCountSelectorWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Restriction restriction) {
        invoke2(restriction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Restriction restriction) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        viewGroup = this.this$0.flashBarRootView;
        if (viewGroup == null) {
            return;
        }
        RestrictionsFactory restrictionsFactory = RestrictionsFactory.INSTANCE;
        viewGroup2 = this.this$0.flashBarRootView;
        RestrictionsFactory.create$default(restrictionsFactory, viewGroup2, C7714v.m0(restriction), this.this$0, null, null, null, null, null, 248, null);
    }
}
