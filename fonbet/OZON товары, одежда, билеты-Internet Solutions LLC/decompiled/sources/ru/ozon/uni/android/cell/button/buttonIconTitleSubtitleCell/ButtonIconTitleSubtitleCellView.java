package ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell.data.ButtonIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell.data.ButtonIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b%\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u0003*\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b\u0010\u0010'R*\u0010!\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010%R\u001a\u0010-\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R*\u00106\u001a\u0002052\u0006\u0010(\u001a\u0002058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010<\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR.\u0010C\u001a\u0004\u0018\u00010B2\b\u0010(\u001a\u0004\u0018\u00010B8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR.\u0010I\u001a\u0004\u0018\u00010B2\b\u0010(\u001a\u0004\u0018\u00010B8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR.\u0010L\u001a\u0004\u0018\u0001052\b\u0010(\u001a\u0004\u0018\u0001058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u00107\u001a\u0004\bM\u00109\"\u0004\bN\u0010;R*\u0010O\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010=\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR.\u0010R\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR.\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010(\u001a\u0004\u0018\u00010X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R.\u0010_\u001a\u0004\u0018\u00010\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010e\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010S\u001a\u0004\bf\u0010U\"\u0004\bg\u0010WR.\u0010h\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010S\u001a\u0004\bi\u0010U\"\u0004\bj\u0010WR.\u0010k\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010S\u001a\u0004\bl\u0010U\"\u0004\bm\u0010WR*\u0010n\u001a\u00020X2\u0006\u0010(\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010Z\u001a\u0004\bo\u0010\\\"\u0004\bp\u0010^R.\u0010q\u001a\u0004\u0018\u00010X2\b\u0010(\u001a\u0004\u0018\u00010X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010Z\u001a\u0004\br\u0010\\\"\u0004\bs\u0010^R.\u0010t\u001a\u0004\u0018\u00010B2\b\u0010(\u001a\u0004\u0018\u00010B8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010D\u001a\u0004\bu\u0010F\"\u0004\bv\u0010HR.\u0010w\u001a\u0004\u0018\u00010B2\b\u0010(\u001a\u0004\u0018\u00010B8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010D\u001a\u0004\bx\u0010F\"\u0004\by\u0010HR*\u0010z\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010&\u001a\u0004\bz\u0010'\"\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/ButtonIconTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "Lru/ozon/uni/android/controls/button/ButtonView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;Z)V", "", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "color", "", "alpha", "setTitleColor", "(IF)V", "setSubtitleColor", "Lru/ozon/uni/android/uikitsdk/Color;", "setIconColor", "(Lru/ozon/uni/android/uikitsdk/Color;F)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "preset", "withButtonPreset", "(Lru/ozon/uni/android/controls/button/ButtonView;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;)Lru/ozon/uni/android/controls/button/ButtonView;", "setupMinHeight", "(Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;)V", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "setPreset", "mainView", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "addonView", "Lru/ozon/uni/android/controls/button/ButtonView;", "getAddonView", "()Lru/ozon/uni/android/controls/button/ButtonView;", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "iconRes", "Ljava/lang/Integer;", "getIconRes", "()Ljava/lang/Integer;", "setIconRes", "(Ljava/lang/Integer;)V", "", "iconText", "Ljava/lang/String;", "getIconText", "()Ljava/lang/String;", "setIconText", "(Ljava/lang/String;)V", "iconBackgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getIconBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setIconBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "iconBorderColor", "getIconBorderColor", "setIconBorderColor", "iconLabelColor", "getIconLabelColor", "setIconLabelColor", "iconGraphicColor", "getIconGraphicColor", "setIconGraphicColor", "buttonTitleText", "getButtonTitleText", "setButtonTitleText", "buttonSubtitleText", "getButtonSubtitleText", "setButtonSubtitleText", "buttonTitleTruncatingMode", "getButtonTitleTruncatingMode", "setButtonTitleTruncatingMode", "buttonSubtitleTruncatingMode", "getButtonSubtitleTruncatingMode", "setButtonSubtitleTruncatingMode", "isButtonVisible", "setButtonVisible", "(Z)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonIconTitleSubtitleCellView extends MainAddonWrapperV3<IconTitleSubtitleCellView, ButtonView> implements IconTitleSubtitleCellApi, AtomView {

    @NotNull
    private final ButtonView addonView;
    private String buttonSubtitleText;
    private CommonAtomLabelDTO.TruncatingMode buttonSubtitleTruncatingMode;

    @NotNull
    private String buttonTitleText;
    private CommonAtomLabelDTO.TruncatingMode buttonTitleTruncatingMode;
    private Color iconBackgroundColor;
    private Integer iconBorderColor;
    private Integer iconGraphicColor;
    private Integer iconLabelColor;
    private Integer iconRes;
    private String iconText;
    private boolean isButtonVisible;
    private final boolean isRootWrapper;

    @NotNull
    private final IconTitleSubtitleCellView mainView;

    @NotNull
    private ButtonIconTitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Axis.values().length];
            try {
                iArr[Axis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Axis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ButtonIconTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, ButtonIconTitleSubtitleWrapperPreset buttonIconTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? ButtonIconTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500NoShape500TopStart500Default500() : buttonIconTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    private final void setupMinHeight(ButtonIconTitleSubtitleWrapperPreset preset) {
        setMinHeight(UiExtKt.toPx(preset.getIconTitleSubtitleWrapperPreset().getIconAddonWrapperPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    private final ButtonView withButtonPreset(ButtonView buttonView, ButtonDTO.Preset preset) {
        buttonView.setPreset(preset);
        return buttonView;
    }

    /* renamed from: isButtonVisible, reason: from getter */
    public boolean getIsButtonVisible() {
        return this.isButtonVisible;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    public void setAddonVisibility$uni_release() {
        Flow flowByViewId;
        super.setAddonVisibility$uni_release();
        Flow flowByViewId2 = getFlowByViewId(getAddonView().getId());
        if (flowByViewId2 == null || (flowByViewId = getFlowByViewId(flowByViewId2.getId())) == null) {
            return;
        }
        Axis axis = getMainAddonSettings().getAxis();
        if (getIsButtonVisible()) {
            ViewExtKt.show(getAddonView());
            ViewExtKt.show(flowByViewId2);
            int i11 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
            if (i11 == 1) {
                flowByViewId.setHorizontalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
                return;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                flowByViewId.setVerticalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
                return;
            }
        }
        ViewExtKt.gone(getAddonView());
        ViewExtKt.gone(flowByViewId2);
        int i12 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
        if (i12 == 1) {
            flowByViewId.setHorizontalGap(0);
        } else {
            if (i12 != 2) {
                throw new o();
            }
            flowByViewId.setVerticalGap(0);
        }
    }

    @Override // ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi
    public void setIconColor(@NotNull Color color, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        getMainView().setIconColor(color, alpha);
    }

    public final void setPreset(@NotNull ButtonIconTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().setPreset(this.preset.getIconTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getButtonAddonPreset().getMainAddonSettings());
        withButtonPreset(getAddonView(), this.preset.getButtonAddonPreset().getButtonSize());
        setupMinHeight(this.preset);
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setSubtitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public void setSubtitleText(CharSequence charSequence) {
        this.subtitleText = charSequence;
        getMainView().setSubtitleText(this.subtitleText);
    }

    public void setSubtitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.subtitleTruncatingMode = truncatingMode;
        getMainView().setSubtitleTruncatingMode(this.subtitleTruncatingMode);
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setTitleColor(int color, float alpha) {
        getMainView().setTitleColor(color, alpha);
    }

    public void setTitleText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.titleText = value;
        getMainView().setTitleText(this.titleText);
    }

    public void setTitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        getMainView().setTitleTruncatingMode(this.titleTruncatingMode);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public ButtonView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public IconTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonIconTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull ButtonIconTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getButtonAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        this.mainView = new IconTitleSubtitleCellView(context, null, 0, 0, defPreset.getIconTitleSubtitleWrapperPreset(), false, 14, null);
        this.addonView = withButtonPreset(new ButtonView(context, null, 0, 0, 14, null), defPreset.getButtonAddonPreset().getButtonSize());
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.iconRes = getMainView().getIconRes();
        this.iconText = getMainView().getIconText();
        this.iconBackgroundColor = getMainView().getIconBackgroundColor();
        this.iconBorderColor = getMainView().getIconBorderColor();
        this.iconLabelColor = getMainView().getIconLabelColor();
        this.iconGraphicColor = getMainView().getIconGraphicColor();
        this.buttonTitleText = getAddonView().getTitleText();
        this.buttonSubtitleText = getAddonView().getSubtitleText();
        this.buttonTitleTruncatingMode = getAddonView().getTitleTruncatingMode();
        this.buttonSubtitleTruncatingMode = getAddonView().getSubtitleTruncatingMode();
        this.isButtonVisible = true;
        setViews();
        setupMinHeight(this.preset);
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonIconTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.ButtonIconTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.ButtonIconTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonIconTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonIconTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.ButtonIconTitleSubtitleCellView_mainTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.ButtonIconTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
