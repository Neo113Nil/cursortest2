package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding.HotelsMapInfoOnboardingBinder;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ControlPanelBinder$togglePanel$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ ControlPanelBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlPanelBinder$togglePanel$1(boolean z11, ControlPanelBinder controlPanelBinder) {
        super(0);
        this.$isVisible = z11;
        this.this$0 = controlPanelBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r0 = r3.this$0.onboarding;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        OnBoardingDTO onBoardingDTO;
        HotelsMapInfoOnboardingBinder hotelsMapInfoOnboardingBinder;
        CellView cellView;
        if (!this.$isVisible || onBoardingDTO == null) {
            return;
        }
        ControlPanelBinder controlPanelBinder = this.this$0;
        hotelsMapInfoOnboardingBinder = controlPanelBinder.onboardingBinder;
        cellView = controlPanelBinder.cellView;
        hotelsMapInfoOnboardingBinder.bind(onBoardingDTO, cellView);
    }
}
