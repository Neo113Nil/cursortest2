package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV2WidgetHolder$onWidgetCreated$stopAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ boolean $isStatusBarInitialColorInDarkMode;
    final /* synthetic */ int $statusBarInitialColor;
    final /* synthetic */ HotelsMapInfoV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV2WidgetHolder$onWidgetCreated$stopAction$1(ComponentCallbacksC5392m componentCallbacksC5392m, HotelsMapInfoV2WidgetHolder hotelsMapInfoV2WidgetHolder, int i11, boolean z11) {
        super(0);
        this.$fragment = componentCallbacksC5392m;
        this.this$0 = hotelsMapInfoV2WidgetHolder;
        this.$statusBarInitialColor = i11;
        this.$isStatusBarInitialColorInDarkMode = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View view = this.$fragment.getView();
        if (view != null) {
            this.this$0.removeInsetsListener(view);
        }
        this.this$0.restoreStatusBarColor(this.$fragment, this.$statusBarInitialColor, this.$isStatusBarInitialColorInDarkMode);
    }
}
