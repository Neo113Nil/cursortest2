package ru.ozon.uni.android.controls.button;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonState;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ%\u0010!\u001a\u00020\u00122\b\b\u0001\u0010\u001d\u001a\u00020\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b!\u0010$J!\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R\u001b\u00103\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R*\u00106\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010<\u001a\u00020\t2\u0006\u00105\u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR\"\u0010E\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR*\u0010H\u001a\u00020\t2\u0006\u00105\u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010=\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR\"\u0010K\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010N\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010=\u001a\u0004\bO\u0010?\"\u0004\bP\u0010AR.\u0010R\u001a\u0004\u0018\u00010Q2\b\u00105\u001a\u0004\u0018\u00010Q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR.\u0010X\u001a\u0004\u0018\u00010Q2\b\u00105\u001a\u0004\u0018\u00010Q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR$\u0010[\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^\"\u0004\bc\u0010`R$\u0010i\u001a\u00020d2\u0006\u00105\u001a\u00020d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010l\u001a\u0004\u0018\u00010d2\b\u00105\u001a\u0004\u0018\u00010d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010f\"\u0004\bk\u0010h¨\u0006m"}, d2 = {"Lru/ozon/uni/android/controls/button/ButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/android/controls/button/ButtonApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleIcon", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "titleIconPosition", "titleIconColor", "", "setTitleIcon", "(Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Integer;)V", "subtitleIcon", "subtitleIconPosition", "subtitleIconColor", "setSubtitleIcon", "onButtonEnabled", "()V", "onButtonDisabled", "onButtonPressed", "style", "iconTintColor", "applyStyle$uni_release", "(ILjava/lang/Integer;)V", "applyStyle", "Landroid/content/res/TypedArray;", "typedArray", "(Landroid/content/res/TypedArray;Ljava/lang/Integer;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "setSubTitleColor", "", "isDisabled", "setIconTintColor", "(Z)V", "mainView$delegate", "LSc/j;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "mainView", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;)V", "titleColorDefault", "I", "getTitleColorDefault$uni_release", "()I", "setTitleColorDefault$uni_release", "(I)V", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "iconTintColorDefault", "Ljava/lang/Integer;", "getIconTintColorDefault$uni_release", "()Ljava/lang/Integer;", "setIconTintColorDefault$uni_release", "(Ljava/lang/Integer;)V", "iconTintColorDisabled", "getIconTintColorDisabled$uni_release", "setIconTintColorDisabled$uni_release", "", "getTitleText", "()Ljava/lang/String;", "setTitleText", "(Ljava/lang/String;)V", "titleText", "getSubtitleText", "setSubtitleText", "subtitleText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonView extends ButtonWrapper<TitleSubtitleCellView> implements AtomView, ButtonApi {
    public static final int $stable = 8;
    private Integer iconTintColorDefault;
    private Integer iconTintColorDisabled;

    /* renamed from: mainView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mainView;

    @NotNull
    private ButtonDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyStyle(TypedArray typedArray, Integer iconTintColor) {
        Integer num;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColorDefault$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context, R$styleable.ButtonView_backgroundGradient, R$styleable.ButtonView_backgroundColor, getDefaultBackgroundColor()));
        setCurrentBackgroundColor(getBackgroundColorDefault());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColorActive$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context2, R$styleable.ButtonView_backgroundGradientActive, R$styleable.ButtonView_backgroundColorActive, getDefaultBackgroundColor()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackgroundColorDisabled$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context3, R$styleable.ButtonView_backgroundGradientDisabled, R$styleable.ButtonView_backgroundColorDisabled, getDefaultBackgroundColor()));
        setTitleColorDefault$uni_release(typedArray.getColor(R$styleable.ButtonView_mainTextColor, getDefaultBackgroundColor()));
        this.titleColorActive = typedArray.getColor(R$styleable.ButtonView_mainTextColorActive, this.titleColorDefault);
        this.titleColorDisabled = typedArray.getColor(R$styleable.ButtonView_mainTextColorDisabled, getDefaultBackgroundColor());
        setSubTitleColorDefault$uni_release(typedArray.getColor(R$styleable.ButtonView_addonTextColor, getDefaultBackgroundColor()));
        this.subTitleColorActive = typedArray.getColor(R$styleable.ButtonView_addonTextColorActive, this.subTitleColorDefault);
        this.subTitleColorDisabled = typedArray.getColor(R$styleable.ButtonView_addonTextColorDisabled, this.subTitleColorDefault);
        if (iconTintColor != null) {
            num = Integer.valueOf(a.getColor(getContext(), iconTintColor.intValue()));
        } else {
            num = null;
        }
        this.iconTintColorDefault = num;
        this.iconTintColorDisabled = Integer.valueOf(typedArray.getColor(R$styleable.ButtonView_addonTextColorDisabled, getDefaultBackgroundColor()));
    }

    static /* synthetic */ void applyStyle$default(ButtonView buttonView, TypedArray typedArray, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        buttonView.applyStyle(typedArray, num);
    }

    public static /* synthetic */ void applyStyle$uni_release$default(ButtonView buttonView, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = null;
        }
        buttonView.applyStyle$uni_release(i11, num);
    }

    private final void setIconTintColor(boolean isDisabled) {
        Integer num = isDisabled ? this.iconTintColorDisabled : this.iconTintColorDefault;
        if (num != null) {
            int intValue = num.intValue();
            getMainView().setTitleIconColorInt$uni_release(intValue);
            getMainView().setSubtitleIconColorInt$uni_release(intValue);
        }
    }

    private final void setSubTitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    static /* synthetic */ void setSubTitleColor$default(ButtonView buttonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        buttonView.setSubTitleColor(i11, f7);
    }

    private final void setTitleColor(int color, float alpha) {
        getMainView().setTitleColor(color, alpha);
    }

    static /* synthetic */ void setTitleColor$default(ButtonView buttonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        buttonView.setTitleColor(i11, f7);
    }

    public final void applyStyle$uni_release(int style, Integer iconTintColor) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] ButtonView = R$styleable.ButtonView;
        Intrinsics.checkNotNullExpressionValue(ButtonView, "ButtonView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, ButtonView);
        applyStyle(obtainStyledAttributes, iconTintColor);
        obtainStyledAttributes.recycle();
    }

    @NotNull
    public final ButtonDTO.Preset getPreset() {
        return this.preset;
    }

    public String getSubtitleText() {
        CharSequence subtitleText = getMainView().getSubtitleText();
        if (subtitleText != null) {
            return subtitleText.toString();
        }
        return null;
    }

    public CommonAtomLabelDTO.TruncatingMode getSubtitleTruncatingMode() {
        return this.subtitleTruncatingMode;
    }

    @NotNull
    public String getTitleText() {
        return getMainView().getTitleText().toString();
    }

    public CommonAtomLabelDTO.TruncatingMode getTitleTruncatingMode() {
        return this.titleTruncatingMode;
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        setTitleColor(this.titleColorDisabled, 0.6f);
        setSubTitleColor(this.subTitleColorDisabled, 0.6f);
        setIconTintColor(true);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
        setIconTintColor(false);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubTitleColor(this.subTitleColorActive, 0.4f);
    }

    public final void setPreset(@NotNull ButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setSettings(value.getBackgroundWrapperSettings());
        getMainView().setPreset(this.preset.getMainViewPreset());
        setButtonState(isEnabled() ? ButtonState.ENABLED : ButtonState.DISABLED);
        setMinimumHeight(UiExtKt.toPx(this.preset.getMainViewPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    public final void setSubTitleColorDefault$uni_release(int i11) {
        this.subTitleColorDefault = i11;
        setSubTitleColor$default(this, i11, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.controls.button.ButtonApi
    public void setSubtitleIcon(Integer subtitleIcon, @NotNull AddonSide subtitleIconPosition, Integer subtitleIconColor) {
        Intrinsics.checkNotNullParameter(subtitleIconPosition, "subtitleIconPosition");
        getMainView().setSubtitleIcon(subtitleIcon, subtitleIconPosition, subtitleIconColor);
    }

    public void setSubtitleText(String str) {
        getMainView().setSubtitleText(str);
    }

    public void setSubtitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.subtitleTruncatingMode = truncatingMode;
        getMainView().setSubtitleTruncatingMode(truncatingMode);
    }

    public final void setTitleColorDefault$uni_release(int i11) {
        this.titleColorDefault = i11;
        setTitleColor$default(this, i11, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.controls.button.ButtonApi
    public void setTitleIcon(Integer titleIcon, @NotNull AddonSide titleIconPosition, Integer titleIconColor) {
        Intrinsics.checkNotNullParameter(titleIconPosition, "titleIconPosition");
        getMainView().setTitleIcon(titleIcon, titleIconPosition, titleIconColor);
    }

    public void setTitleText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getMainView().setTitleText(value);
    }

    public void setTitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        getMainView().setTitleTruncatingMode(truncatingMode);
    }

    public /* synthetic */ ButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionPrimary_Dynamic : i12);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return (TitleSubtitleCellView) this.mainView.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mainView = k.a(n.NONE, new ButtonView$mainView$2(context, attributeSet, this));
        ButtonDTO.Preset preset = ButtonDTO.Preset.SIZE_400;
        this.preset = preset;
        this.titleColorActive = -1;
        this.titleColorDisabled = -1;
        this.subTitleColorActive = -1;
        this.subTitleColorDisabled = -1;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((ButtonDTO.Preset[]) ButtonDTO.Preset.getEntries().toArray(new ButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonView_buttonsSize, preset.ordinal())]);
        getMainView().setTitleNumberOfLines(1);
        getMainView().setSubtitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.ButtonView_mainText);
        setTitleText(string == null ? "" : string);
        setSubtitleText(obtainStyledAttributes.getString(R$styleable.ButtonView_addonText));
        setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonView_addonTruncatingMode, truncatingMode.ordinal())]);
        try {
            applyStyle$default(this, obtainStyledAttributes, null, 2, null);
        } catch (UnsupportedOperationException unused) {
            applyStyle$uni_release$default(this, R$style.Button_ActionPrimary, null, 2, null);
        }
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
    }
}
