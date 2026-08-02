package ru.ozon.uni.android.cell.button.buttonTitleSubtitleCell;

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
import ru.ozon.uni.android.cell.button.buttonTitleSubtitleCell.data.ButtonTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.button.buttonTitleSubtitleCell.data.ButtonTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b\u0010\u0010$R*\u0010\u001e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\"R\u001a\u0010*\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00103\u001a\u0002022\u0006\u0010%\u001a\u0002028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u00109\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010@\u001a\u0004\u0018\u00010?2\b\u0010%\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010F\u001a\u0004\u0018\u00010?2\b\u0010%\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER.\u0010I\u001a\u0004\u0018\u0001022\b\u0010%\u001a\u0004\u0018\u0001028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u00104\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R*\u0010L\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R*\u0010P\u001a\u00020O2\u0006\u0010%\u001a\u00020O8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR.\u0010V\u001a\u0004\u0018\u00010O2\b\u0010%\u001a\u0004\u0018\u00010O8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR.\u0010Y\u001a\u0004\u0018\u00010?2\b\u0010%\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010A\u001a\u0004\bZ\u0010C\"\u0004\b[\u0010ER.\u0010\\\u001a\u0004\u0018\u00010?2\b\u0010%\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010A\u001a\u0004\b]\u0010C\"\u0004\b^\u0010ER*\u0010_\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010#\u001a\u0004\b_\u0010$\"\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/ButtonTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/controls/button/ButtonView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;Z)V", "", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "color", "", "alpha", "setTitleColor", "(IF)V", "setSubtitleColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "preset", "withButtonPreset", "(Lru/ozon/uni/android/controls/button/ButtonView;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;)Lru/ozon/uni/android/controls/button/ButtonView;", "setupMinHeight", "(Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;)V", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/button/buttonTitleSubtitleCell/data/ButtonTitleSubtitleWrapperPreset;", "setPreset", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "addonView", "Lru/ozon/uni/android/controls/button/ButtonView;", "getAddonView", "()Lru/ozon/uni/android/controls/button/ButtonView;", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "", "buttonTitleText", "Ljava/lang/String;", "getButtonTitleText", "()Ljava/lang/String;", "setButtonTitleText", "(Ljava/lang/String;)V", "buttonSubtitleText", "getButtonSubtitleText", "setButtonSubtitleText", "buttonTitleTruncatingMode", "getButtonTitleTruncatingMode", "setButtonTitleTruncatingMode", "buttonSubtitleTruncatingMode", "getButtonSubtitleTruncatingMode", "setButtonSubtitleTruncatingMode", "isButtonVisible", "setButtonVisible", "(Z)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonTitleSubtitleCellView extends MainAddonWrapperV3<TitleSubtitleCellView, ButtonView> implements TitleSubtitleCellApi, AtomView {

    @NotNull
    private final ButtonView addonView;
    private String buttonSubtitleText;
    private CommonAtomLabelDTO.TruncatingMode buttonSubtitleTruncatingMode;

    @NotNull
    private String buttonTitleText;
    private CommonAtomLabelDTO.TruncatingMode buttonTitleTruncatingMode;
    private boolean isButtonVisible;
    private final boolean isRootWrapper;

    @NotNull
    private final TitleSubtitleCellView mainView;

    @NotNull
    private ButtonTitleSubtitleWrapperPreset preset;
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

    public /* synthetic */ ButtonTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, ButtonTitleSubtitleWrapperPreset buttonTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? ButtonTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500Default500() : buttonTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    private final void setupMinHeight(ButtonTitleSubtitleWrapperPreset preset) {
        setMinHeight(UiExtKt.toPx(preset.getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
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

    public final void setPreset(@NotNull ButtonTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        withButtonPreset(getAddonView(), this.preset.getButtonAddonPreset().getButtonSize());
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getButtonAddonPreset().getMainAddonSettings());
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
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull ButtonTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getButtonAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        this.mainView = new TitleSubtitleCellView(context, attributeSet, 0, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 12, null);
        this.addonView = withButtonPreset(new ButtonView(context, null, 0, 0, 14, null), defPreset.getButtonAddonPreset().getButtonSize());
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.buttonTitleText = getAddonView().getTitleText();
        this.buttonSubtitleText = getAddonView().getSubtitleText();
        this.buttonTitleTruncatingMode = getAddonView().getTitleTruncatingMode();
        this.buttonSubtitleTruncatingMode = getAddonView().getSubtitleTruncatingMode();
        this.isButtonVisible = true;
        setViews();
        setupMinHeight(this.preset);
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.ButtonTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.ButtonTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.ButtonTitleSubtitleCellView_mainTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.ButtonTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
