package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000b\u001a\u00020\u0011*\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u000e*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u000b\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b\u000b\u0010!J\u0013\u0010\u000b\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b\u000b\u0010$J\u0013\u0010\u000b\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b\u000b\u0010'J\u0013\u0010\u000b\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b\u000b\u0010*J\u0013\u0010,\u001a\u00020+*\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J&\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "partialComponentsCells", "wholeComponentsCells", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;JLru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;", "withoutSauceComponents", "toComponents", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "changeTitle", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "retrieveSaucePresence", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Spacers;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Spacers;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$RoundedCorners;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "getState", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "state", "info", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpNutritionInfoMapper implements Function2<PdpNutritionInfoDTO, d, List<? extends PdpNutritionInfoVO>> {
    private final CellDTO changeTitle(CellDTO cellDTO, String str) {
        return CellDTO.copy$default(cellDTO, CellDTO.CenterBlock.copy$default(cellDTO.getCenterBlock(), CellDTO.CellText.copy$default(cellDTO.getCenterBlock().getTitle(), OzonSpannableStringKt.toOzonSpannableString(str), null, null, false, null, null, 62, null), null, null, null, null, null, 62, null), null, null, null, null, 30, null);
    }

    private final PdpNutritionInfoVO.PdpNutritionInfoState getState(PdpNutritionInfoDTO pdpNutritionInfoDTO) {
        if (pdpNutritionInfoDTO.getInfo() == null) {
            return PdpNutritionInfoVO.PdpNutritionInfoState.NONE;
        }
        PdpNutritionInfoDTO.SauceInfo sauceInfo = pdpNutritionInfoDTO.getSauceInfo();
        boolean retrieveSaucePresence = sauceInfo != null ? retrieveSaucePresence(sauceInfo) : false;
        Boolean isSelected = pdpNutritionInfoDTO.getInfo().getSwitch().getPartial().isSelected();
        boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
        return (retrieveSaucePresence && booleanValue) ? PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL_WITH_SAUCE : (!retrieveSaucePresence || booleanValue) ? (retrieveSaucePresence || !booleanValue) ? PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE : PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL : PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE_WITH_SAUCE;
    }

    private final boolean retrieveSaucePresence(PdpNutritionInfoDTO.SauceInfo sauceInfo) {
        CellDTO.RightBlock rightBlock;
        CellDTO textCheckbox = sauceInfo.getTextCheckbox();
        AtomDTO control = (textCheckbox == null || (rightBlock = textCheckbox.getRightBlock()) == null) ? null : rightBlock.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        return (checkBoxDTO != null ? checkBoxDTO.getStatus() : null) == CheckBoxDTO.CheckboxStatus.SELECTED;
    }

    private final PdpNutritionInfoDTO.Components toComponents(PdpNutritionInfoDTO.ComponentsLight componentsLight, PdpNutritionInfoDTO.Components components) {
        if (components != null) {
            return components.copy(changeTitle(components.getEnergy(), componentsLight.getEnergy()), changeTitle(components.getProtein(), componentsLight.getProtein()), changeTitle(components.getFat(), componentsLight.getFat()), changeTitle(components.getCarbohydrate(), componentsLight.getCarbohydrate()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PdpNutritionInfoVO toVO(PdpNutritionInfoDTO pdpNutritionInfoDTO, long j11) {
        ButtonV3DTO buttonV3DTO;
        PdpNutritionInfoVO.RoundedCorners roundedCorners;
        t tVar;
        ButtonV3DTO button = pdpNutritionInfoDTO.getButton();
        PdpNutritionInfoDTO.Info info = pdpNutritionInfoDTO.getInfo();
        PdpNutritionInfoVO.Info vo = info != null ? toVO(info) : null;
        String backgroundColor = pdpNutritionInfoDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_SECONDARY.getToken();
        }
        String str = backgroundColor;
        PdpNutritionInfoVO.ContainerPaddings vo2 = toVO(pdpNutritionInfoDTO.getPaddings());
        PdpNutritionInfoVO.RoundedCorners vo3 = toVO(pdpNutritionInfoDTO.getCorners());
        PdpNutritionInfoVO.Info info2 = vo;
        PdpNutritionInfoVO.PdpNutritionInfoState state = getState(pdpNutritionInfoDTO);
        Map<String, TokenizedTrackingInfo> trackingInfo = pdpNutritionInfoDTO.getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            buttonV3DTO = button;
            roundedCorners = vo3;
            tVar = x.b(trackingInfo, valueOf, null);
        } else {
            buttonV3DTO = button;
            roundedCorners = vo3;
            tVar = null;
        }
        PdpNutritionInfoDTO.SauceInfo sauceInfo = pdpNutritionInfoDTO.getSauceInfo();
        if (sauceInfo != null) {
            PdpNutritionInfoDTO.Info info3 = pdpNutritionInfoDTO.getInfo();
            PdpNutritionInfoDTO.Components partialComponents = info3 != null ? info3.getPartialComponents() : null;
            PdpNutritionInfoDTO.Info info4 = pdpNutritionInfoDTO.getInfo();
            r2 = toVO(sauceInfo, j11, partialComponents, info4 != null ? info4.getWholeComponents() : null);
        }
        return new PdpNutritionInfoVO(j11, buttonV3DTO, info2, str, roundedCorners, vo2, r2, state, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PdpNutritionInfoVO> invoke(@NotNull PdpNutritionInfoDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(info)));
    }

    private final PdpNutritionInfoVO.SauceInfo toVO(PdpNutritionInfoDTO.SauceInfo sauceInfo, long j11, PdpNutritionInfoDTO.Components components, PdpNutritionInfoDTO.Components components2) {
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CellDTO textCheckbox = sauceInfo.getTextCheckbox();
        PdpNutritionInfoDTO.ComponentsLight partialComponents = sauceInfo.getPartialComponents();
        t tVar = null;
        PdpNutritionInfoDTO.Components components3 = partialComponents != null ? toComponents(partialComponents, components) : null;
        PdpNutritionInfoDTO.ComponentsLight wholeComponents = sauceInfo.getWholeComponents();
        PdpNutritionInfoDTO.Components components4 = wholeComponents != null ? toComponents(wholeComponents, components2) : null;
        CellDTO textCheckbox2 = sauceInfo.getTextCheckbox();
        if (textCheckbox2 != null && (common = textCheckbox2.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new PdpNutritionInfoVO.SauceInfo(textCheckbox, components3, components4, tVar);
    }

    private final PdpNutritionInfoVO.Info toVO(PdpNutritionInfoDTO.Info info) {
        return new PdpNutritionInfoVO.Info(info.getSwitch(), info.getPartialComponents(), info.getWholeComponents(), toVO(info.getSpacers()));
    }

    private final PdpNutritionInfoVO.Info.Spacers toVO(PdpNutritionInfoDTO.Info.Spacers spacers) {
        return new PdpNutritionInfoVO.Info.Spacers(UiExtKt.toPx(spacers.getHorizontal().getPx()), UiExtKt.toPx(spacers.getVertical().getPx()), UiExtKt.toPx(spacers.getBetween().getPx()));
    }

    private final PdpNutritionInfoVO.ContainerPaddings toVO(PdpNutritionInfoDTO.ContainerPaddings containerPaddings) {
        return new PdpNutritionInfoVO.ContainerPaddings(UiExtKt.toPx(containerPaddings.getTop().getPx()), UiExtKt.toPx(containerPaddings.getBottom().getPx()), UiExtKt.toPx(containerPaddings.getBetween().getPx()), UiExtKt.toPx(containerPaddings.getInner().getPx()), UiExtKt.toPx(containerPaddings.getOuter().getPx()));
    }

    private final PdpNutritionInfoVO.RoundedCorners toVO(PdpNutritionInfoDTO.RoundedCorners roundedCorners) {
        return new PdpNutritionInfoVO.RoundedCorners(UiExtKt.toPxF(roundedCorners.getButtonRadius().getPx()), UiExtKt.toPxF(roundedCorners.getWidgetRadius().getPx()));
    }
}
