package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$2 extends AbstractC7737t implements Function1<Restriction, Unit> {
    final /* synthetic */ TouristCountSelectorV3ConfigWidgetHolder $lifecycle;
    final /* synthetic */ TouristCountSelectorV3ConfigWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$2(TouristCountSelectorV3ConfigWidgetHolder touristCountSelectorV3ConfigWidgetHolder, TouristCountSelectorV3ConfigWidgetHolder touristCountSelectorV3ConfigWidgetHolder2) {
        super(1);
        this.this$0 = touristCountSelectorV3ConfigWidgetHolder;
        this.$lifecycle = touristCountSelectorV3ConfigWidgetHolder2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Restriction restriction) {
        invoke2(restriction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Restriction restriction) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        componentCallbacksC5392m = this.this$0.composerFragment;
        ViewGroup rootView = ContextExtKt.getRootView(componentCallbacksC5392m);
        if (rootView != null) {
            RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(restriction), this.$lifecycle, null, null, null, null, null, 248, null);
        }
    }
}
