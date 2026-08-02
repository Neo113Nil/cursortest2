package ru.ozon.uni.atoms.v3.holders.controls.chip;

import Bs.ViewOnClickListenerC2671b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.controls.chip.IndicatorLabelChipView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipColorSettingsKt;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.cell.indicatorCell.IndicatorTitleSubtitleCellHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0016\u0010\u000f\u001a\u00020\r*\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/chip/IndicatorLabelChipHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO;", "Lru/ozon/uni/android/controls/chip/IndicatorLabelChipView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/chip/IndicatorLabelChipView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "applyStyle", "style", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorLabelChipHolder extends AtomV3<IndicatorLabelChipDTO, IndicatorLabelChipView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLabelChipHolder(@NotNull IndicatorLabelChipView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new ViewOnClickListenerC2671b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(IndicatorLabelChipHolder indicatorLabelChipHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        IndicatorLabelChipDTO indicatorLabelChipDTO = (IndicatorLabelChipDTO) indicatorLabelChipHolder.getData();
        CommonControlSettings common = indicatorLabelChipDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, indicatorLabelChipDTO.getTrackingInfo())) != null) {
            indicatorLabelChipHolder.handleAction(atomAction);
            return;
        }
        Object parent = indicatorLabelChipHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final void applyStyle(IndicatorLabelChipView indicatorLabelChipView, int i11) {
        TypedArray obtainStyledAttributes = indicatorLabelChipView.getContext().obtainStyledAttributes(i11, R$styleable.IndicatorLabelChipView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        indicatorLabelChipView.setBackgroundColorEnabled$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_backgroundColor, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setCurrentBackgroundColor(new Color.Solid(indicatorLabelChipView.getBackgroundColorEnabled()));
        indicatorLabelChipView.setBackgroundColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_backgroundColorActive, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setBackgroundColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_backgroundColorDisabled, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setBackgroundColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_backgroundColorSelected, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setChipBorderColor$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_chipBorderColor, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setCurrentBorderColor(Integer.valueOf(indicatorLabelChipView.getChipBorderColor()));
        indicatorLabelChipView.setChipBorderColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_chipBorderColorActive, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setChipBorderColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_chipBorderColorSelected, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColor, indicatorLabelChipView.getDefaultBackgroundColor()));
        indicatorLabelChipView.setTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColorActive, indicatorLabelChipView.getTitleColorDefault()));
        indicatorLabelChipView.setTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColorDisabled, indicatorLabelChipView.getTitleColorDefault()));
        indicatorLabelChipView.setTitleColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColorSelected, indicatorLabelChipView.getTitleColorDefault()));
        indicatorLabelChipView.setSubTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColor, indicatorLabelChipView.getTitleColorDefault()));
        indicatorLabelChipView.setSubTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColorActive, indicatorLabelChipView.getSubTitleColorDefault()));
        indicatorLabelChipView.setSubTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColorDisabled, indicatorLabelChipView.getSubTitleColorDefault()));
        indicatorLabelChipView.setSubTitleColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColorSelected, indicatorLabelChipView.getSubTitleColorDefault()));
        indicatorLabelChipView.setIndicatorPreset$uni_release(obtainStyledAttributes.getResourceId(R$styleable.IndicatorLabelChipView_indicatorPreset, -1));
        indicatorLabelChipView.setIndicatorDisabledPreset$uni_release(obtainStyledAttributes.getResourceId(R$styleable.IndicatorLabelChipView_disabledIndicatorPreset, -1));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull IndicatorLabelChipDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((IndicatorLabelChipHolder) item);
        IndicatorLabelChipView containerView = getContainerView();
        IndicatorLabelChipDTO.IndicatorType indicatorType = item.getIndicatorType();
        if (indicatorType == null) {
            indicatorType = IndicatorLabelChipDTO.IndicatorType.INDICATOR;
        }
        containerView.setIndicatorType(indicatorType);
        IndicatorLabelChipDTO.Preset preset = item.getPreset();
        if (preset == null) {
            preset = IndicatorLabelChipDTO.Preset.SIZE_500;
        }
        containerView.setChipPreset(preset);
        applyStyle(containerView, ChipColorSettingsKt.getStyleResource(item.getStyle()));
        IndicatorTitleSubtitleCellHolderKt.bindCellData(containerView.getMainView(), item.getTitle(), item.getSubtitle(), item.getIndicator());
        ChipState state = item.getState();
        if (state == null) {
            state = ChipState.ENABLED;
        }
        containerView.setChipState(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorLabelChipHolder(@NotNull Context context, String str) {
        this(new IndicatorLabelChipView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
