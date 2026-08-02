package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data;

import Sc.InterfaceC4008j;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5VO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006)²\u0006\f\u0010'\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "", "hasButtons", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;", "toButtonGroupMargins", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;Z)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$ButtonGroupMargins;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "determineBackgroundType", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "", "defaultHorizontalPadding$delegate", "LSc/j;", "getDefaultHorizontalPadding", "()I", "defaultHorizontalPadding", "defaultVerticalPadding$delegate", "getDefaultVerticalPadding", "defaultVerticalPadding", "horizontalMargin", "verticalMargin", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5Mapper implements Function2<HotelsPageButtonV5DTO, d, List<? extends HotelsPageButtonV5VO>>, AsyncWidgetStateMapper<HotelsPageButtonV5DTO, HotelsPageButtonV5VO.State> {

    @NotNull
    private final Context context;

    /* renamed from: defaultHorizontalPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultHorizontalPadding;

    /* renamed from: defaultVerticalPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultVerticalPadding;

    public HotelsPageButtonV5Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.defaultHorizontalPadding = LazyUtilsKt.unsafeLazy(new HotelsPageButtonV5Mapper$defaultHorizontalPadding$2(this));
        this.defaultVerticalPadding = LazyUtilsKt.unsafeLazy(new HotelsPageButtonV5Mapper$defaultVerticalPadding$2(this));
    }

    private final HotelsPageButtonV5VO.BackgroundType determineBackgroundType(HotelsPageButtonV5DTO state) {
        Boolean hasTopBorder = state.getHasTopBorder();
        boolean booleanValue = hasTopBorder != null ? hasTopBorder.booleanValue() : true;
        Boolean hasTopShadow = state.getHasTopShadow();
        return booleanValue ? HotelsPageButtonV5VO.BackgroundType.BorderedBackground.INSTANCE : hasTopShadow != null ? hasTopShadow.booleanValue() : false ? HotelsPageButtonV5VO.BackgroundType.ElevatedBackground.INSTANCE : HotelsPageButtonV5VO.BackgroundType.SolidBackground.INSTANCE;
    }

    private final HotelsPageButtonV5VO.State extractState(HotelsPageButtonV5DTO state) {
        List<ButtonV3DTO> buttons = state.getButtons();
        CellDTO dsCell = state.getDsCell();
        boolean isUpdateRequired = state.isUpdateRequired();
        Map<String, Object> asyncParameters = state.getAsyncParameters();
        HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetScrollAnchors = state.getWidgetScrollAnchors();
        HotelsPageButtonV5DTO.WidgetsBlockAnchors cellScrollAnchors = state.getCellScrollAnchors();
        String backgroundColor = state.getBackgroundColor();
        CornerRadius topCornerRadius = state.getTopCornerRadius();
        if (topCornerRadius == null) {
            topCornerRadius = CornerRadius.NO_RADIUS;
        }
        return new HotelsPageButtonV5VO.State(buttons, dsCell, isUpdateRequired, asyncParameters, widgetScrollAnchors, cellScrollAnchors, backgroundColor, ResourceExtKt.toPxF(topCornerRadius.getPx(), this.context), determineBackgroundType(state), toButtonGroupMargins(state.getButtonGroupPaddings(), !state.getButtons().isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDefaultHorizontalPadding() {
        return ((Number) this.defaultHorizontalPadding.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDefaultVerticalPadding() {
        return ((Number) this.defaultVerticalPadding.getValue()).intValue();
    }

    private final HotelsPageButtonV5VO.ButtonGroupMargins toButtonGroupMargins(TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting, boolean z11) {
        Paddings bottomPadding;
        Paddings rightPadding;
        Paddings topPadding;
        Paddings leftPadding;
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new HotelsPageButtonV5Mapper$toButtonGroupMargins$horizontalMargin$2(z11, this));
        InterfaceC4008j unsafeLazy2 = LazyUtilsKt.unsafeLazy(new HotelsPageButtonV5Mapper$toButtonGroupMargins$verticalMargin$2(z11, this));
        return new HotelsPageButtonV5VO.ButtonGroupMargins((paddingsSetting == null || (leftPadding = paddingsSetting.getLeftPadding()) == null) ? toButtonGroupMargins$lambda$1(unsafeLazy) : ResourceExtKt.toPx(leftPadding.getPx(), this.context), (paddingsSetting == null || (topPadding = paddingsSetting.getTopPadding()) == null) ? toButtonGroupMargins$lambda$2(unsafeLazy2) : ResourceExtKt.toPx(topPadding.getPx(), this.context), (paddingsSetting == null || (rightPadding = paddingsSetting.getRightPadding()) == null) ? toButtonGroupMargins$lambda$1(unsafeLazy) : ResourceExtKt.toPx(rightPadding.getPx(), this.context), (paddingsSetting == null || (bottomPadding = paddingsSetting.getBottomPadding()) == null) ? toButtonGroupMargins$lambda$2(unsafeLazy2) : ResourceExtKt.toPx(bottomPadding.getPx(), this.context));
    }

    private static final int toButtonGroupMargins$lambda$1(InterfaceC4008j<Integer> interfaceC4008j) {
        return interfaceC4008j.getValue().intValue();
    }

    private static final int toButtonGroupMargins$lambda$2(InterfaceC4008j<Integer> interfaceC4008j) {
        return interfaceC4008j.getValue().intValue();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageButtonV5VO> invoke(@NotNull HotelsPageButtonV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new HotelsPageButtonV5VO(widgetInfo.d().hashCode(), extractState(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsPageButtonV5VO.State mapAsyncState(@NotNull HotelsPageButtonV5DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}
