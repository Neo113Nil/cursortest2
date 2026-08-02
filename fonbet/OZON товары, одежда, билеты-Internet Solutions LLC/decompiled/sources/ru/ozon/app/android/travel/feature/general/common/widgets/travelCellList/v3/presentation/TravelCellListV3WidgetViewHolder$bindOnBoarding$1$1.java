package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3VO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelCellListV3WidgetViewHolder$bindOnBoarding$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ CellDTO $cell;
    final /* synthetic */ TravelCellListV3VO.LayoutModel $layoutModel;
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ TravelCellListV3WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$bindOnBoarding$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ CellDTO $cell;
        final /* synthetic */ TravelCellListV3VO.LayoutModel $layoutModel;
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ TravelCellListV3WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder, OnBoardingDTO onBoardingDTO, CellDTO cellDTO, TravelCellListV3VO.LayoutModel layoutModel) {
            super(0);
            this.this$0 = travelCellListV3WidgetViewHolder;
            this.$vo = onBoardingDTO;
            this.$cell = cellDTO;
            this.$layoutModel = layoutModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBoardingDelegate onBoardingDelegate;
            OnBoardingDelegate onBoardingDelegate2;
            Integer num;
            float f7;
            CommonCellSettings.LayoutPadding bottomPadding;
            int i11;
            CommonCellSettings.LayoutPadding rightPadding;
            CommonCellSettings.LayoutPadding leftPadding;
            CommonCellSettings.LayoutPadding topPadding;
            int i12;
            onBoardingDelegate = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$vo);
            }
            onBoardingDelegate2 = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate2 != null) {
                TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder = this.this$0;
                CellDTO.Settings settings = this.$cell.getSettings();
                Integer num2 = null;
                if (settings == null || (topPadding = settings.getTopPadding()) == null) {
                    num = null;
                } else {
                    int cellLayoutPadding = topPadding.getCellLayoutPadding();
                    TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder2 = this.this$0;
                    TravelCellListV3VO.LayoutModel layoutModel = this.$layoutModel;
                    int dimension = (int) travelCellListV3WidgetViewHolder2.getContext().getResources().getDimension(cellLayoutPadding);
                    i12 = travelCellListV3WidgetViewHolder2.onboardingTopOffset;
                    num = Integer.valueOf((dimension - i12) + (layoutModel != null ? layoutModel.getTopMargin() : 0));
                }
                CellDTO.Settings settings2 = this.$cell.getSettings();
                Integer valueOf = (settings2 == null || (leftPadding = settings2.getLeftPadding()) == null) ? null : Integer.valueOf((int) this.this$0.getContext().getResources().getDimension(leftPadding.getCellLayoutPadding()));
                CellDTO.Settings settings3 = this.$cell.getSettings();
                Integer valueOf2 = (settings3 == null || (rightPadding = settings3.getRightPadding()) == null) ? null : Integer.valueOf((int) this.this$0.getContext().getResources().getDimension(rightPadding.getCellLayoutPadding()));
                CellDTO.Settings settings4 = this.$cell.getSettings();
                if (settings4 != null && (bottomPadding = settings4.getBottomPadding()) != null) {
                    int cellLayoutPadding2 = bottomPadding.getCellLayoutPadding();
                    TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder3 = this.this$0;
                    TravelCellListV3VO.LayoutModel layoutModel2 = this.$layoutModel;
                    int dimension2 = (int) travelCellListV3WidgetViewHolder3.getContext().getResources().getDimension(cellLayoutPadding2);
                    i11 = travelCellListV3WidgetViewHolder3.onboardingBottomOffset;
                    num2 = Integer.valueOf((dimension2 - i11) + (layoutModel2 != null ? layoutModel2.getBottomMargin() : 0));
                }
                f7 = this.this$0.onboardingCornerRadius;
                OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, travelCellListV3WidgetViewHolder, new OnBoardingCutConfig(valueOf, num, valueOf2, num2, null, null, Float.valueOf(f7), false, 176, null), null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCellListV3WidgetViewHolder$bindOnBoarding$1$1(TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder, OnBoardingDTO onBoardingDTO, CellDTO cellDTO, TravelCellListV3VO.LayoutModel layoutModel) {
        super(1);
        this.this$0 = travelCellListV3WidgetViewHolder;
        this.$vo = onBoardingDTO;
        this.$cell = cellDTO;
        this.$layoutModel = layoutModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String pageTag) {
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        baseOnBoardingViewModel = this.this$0.onboardingViewModel;
        String onboardingKey = this.$vo.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "travel_cell_wlist_v3_onboarding_key";
        }
        baseOnBoardingViewModel.showIfNeed(pageTag, onboardingKey, new AnonymousClass1(this.this$0, this.$vo, this.$cell, this.$layoutModel));
    }
}
