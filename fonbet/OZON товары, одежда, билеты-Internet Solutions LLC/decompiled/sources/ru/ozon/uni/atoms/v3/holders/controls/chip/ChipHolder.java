package ru.ozon.uni.atoms.v3.holders.controls.chip;

import HY.c;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipColorSettingsKt;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0014\u0010\u000f\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\r*\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010\u0014\u001a\u00020\r*\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/chip/ChipHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "Lru/ozon/uni/android/controls/chip/ChipView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/chip/ChipView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "bindSubtitle", "subtitle", "applyStyle", "style", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChipHolder extends AtomV3<ChipDTO, ChipView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipHolder(@NotNull ChipView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new c(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(ChipHolder chipHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        ChipDTO chipDTO = (ChipDTO) chipHolder.getData();
        CommonControlSettings common = chipDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, chipDTO.getTrackingInfo())) != null) {
            chipHolder.handleAction(atomAction);
            return;
        }
        Object parent = chipHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final void applyStyle(ChipView chipView, int i11) {
        TypedArray obtainStyledAttributes = chipView.getContext().obtainStyledAttributes(i11, R$styleable.ChipView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        chipView.setBackgroundColorEnabled$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_backgroundColor, chipView.getDefaultBackgroundColor()));
        chipView.setBackgroundColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_backgroundColorActive, chipView.getDefaultBackgroundColor()));
        chipView.setBackgroundColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_backgroundColorDisabled, chipView.getDefaultBackgroundColor()));
        chipView.setBackgroundColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_backgroundColorSelected, chipView.getDefaultBackgroundColor()));
        chipView.setChipBorderColor$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_chipBorderColor, chipView.getDefaultBackgroundColor()));
        chipView.setCurrentBorderColor(Integer.valueOf(chipView.getChipBorderColor()));
        chipView.setChipBorderColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_chipBorderColorActive, chipView.getDefaultBackgroundColor()));
        chipView.setChipBorderColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_chipBorderColorSelected, chipView.getDefaultBackgroundColor()));
        chipView.setTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColor, chipView.getDefaultBackgroundColor()));
        chipView.setTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColorActive, chipView.getTitleColorDefault()));
        chipView.setTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColorDisabled, chipView.getTitleColorDefault()));
        chipView.setTitleColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColorSelected, chipView.getTitleColorDefault()));
        chipView.setSubTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColor, chipView.getTitleColorDefault()));
        chipView.setSubTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColorActive, chipView.getSubTitleColorDefault()));
        chipView.setSubTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColorDisabled, chipView.getSubTitleColorDefault()));
        chipView.setSubTitleColorSelected$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColorSelected, chipView.getSubTitleColorDefault()));
        obtainStyledAttributes.recycle();
    }

    private final void bindSubtitle(ChipView chipView, CommonAtomLabelDTO commonAtomLabelDTO) {
        TestInfo testInfo;
        OzonSpannableString text;
        String str = null;
        chipView.setSubtitle((commonAtomLabelDTO == null || (text = commonAtomLabelDTO.getText()) == null) ? null : text.toString());
        chipView.setTitleTruncatingMode$uni_release(commonAtomLabelDTO != null ? commonAtomLabelDTO.getTruncatingMode() : null);
        SmartLabel addonView = chipView.getMainView().getAddonView();
        if (commonAtomLabelDTO != null && (testInfo = commonAtomLabelDTO.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        addonView.setContentDescription(str);
    }

    private final void bindTitle(ChipView chipView, CommonAtomLabelDTO commonAtomLabelDTO) {
        String obj = commonAtomLabelDTO.getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        chipView.setTitle(obj);
        chipView.setTitleTruncatingMode$uni_release(commonAtomLabelDTO.getTruncatingMode());
        SmartLabel mainView = chipView.getMainView().getMainView();
        TestInfo testInfo = commonAtomLabelDTO.getTestInfo();
        mainView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ChipDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ChipHolder) item);
        ChipView containerView = getContainerView();
        ChipDTO.Preset preset = item.getPreset();
        if (preset == null) {
            preset = ChipDTO.Preset.SIZE_400;
        }
        containerView.setChipPreset(preset);
        applyStyle(containerView, ChipColorSettingsKt.getStyleResource(item.getStyle()));
        bindTitle(containerView, item.getTitle());
        bindSubtitle(containerView, item.getSubtitle());
        ChipState state = item.getState();
        if (state == null) {
            state = ChipState.ENABLED;
        }
        containerView.setChipState(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipHolder(@NotNull Context context, String str) {
        this(new ChipView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
