package ru.ozon.uni.android.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.IndicatorTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IndicatorLabelButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u0015J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001aJ\u0019\u0010!\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b!\u0010&R*\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00103\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010 R\"\u00108\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u0010 R\"\u0010;\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u00106\"\u0004\b=\u0010 R\"\u0010>\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u0010 R\"\u0010A\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00104\u001a\u0004\bB\u00106\"\u0004\bC\u0010 R\"\u0010D\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u00104\u001a\u0004\bE\u00106\"\u0004\bF\u0010 R\"\u0010\"\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u00104\u001a\u0004\bG\u00106\"\u0004\bH\u0010 R\"\u0010I\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u00104\u001a\u0004\bJ\u00106\"\u0004\bK\u0010 R.\u0010M\u001a\u0004\u0018\u00010L2\b\u0010(\u001a\u0004\u0018\u00010L8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR.\u0010S\u001a\u0004\u0018\u00010L2\b\u0010(\u001a\u0004\u0018\u00010L8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010N\u001a\u0004\bT\u0010P\"\u0004\bU\u0010R¨\u0006V"}, d2 = {"Lru/ozon/uni/android/controls/button/IndicatorLabelButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onButtonEnabled", "()V", "onButtonDisabled", "onButtonPressed", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "subtitle", "setSubtitle", "setSubTitleColor", "style", "applyStyle$uni_release", "(I)V", "applyStyle", "indicatorPreset", "setIndicatorStyle", "Landroid/content/res/TypedArray;", "typedArray", "(Landroid/content/res/TypedArray;)V", "Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO$Preset;)V", "mainView", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "titleColorDefault", "I", "getTitleColorDefault$uni_release", "()I", "setTitleColorDefault$uni_release", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "getIndicatorPreset$uni_release", "setIndicatorPreset$uni_release", "indicatorDisabledPreset", "getIndicatorDisabledPreset$uni_release", "setIndicatorDisabledPreset$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorLabelButtonView extends ButtonWrapper<IndicatorTitleSubtitleCellView> implements AtomView {
    private int indicatorDisabledPreset;
    private int indicatorPreset;

    @NotNull
    private final IndicatorTitleSubtitleCellView mainView;

    @NotNull
    private IndicatorLabelButtonDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ IndicatorLabelButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionPrimary_Dynamic : i12);
    }

    private final void applyStyle(TypedArray typedArray) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColorDefault$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context, R$styleable.IndicatorLabelButtonView_backgroundGradient, R$styleable.IndicatorLabelButtonView_backgroundColor, getDefaultBackgroundColor()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColorActive$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context2, R$styleable.IndicatorLabelButtonView_backgroundGradientActive, R$styleable.IndicatorLabelButtonView_backgroundColorActive, getDefaultBackgroundColor()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackgroundColorDisabled$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context3, R$styleable.IndicatorLabelButtonView_backgroundGradientDisabled, R$styleable.IndicatorLabelButtonView_backgroundColorDisabled, getDefaultBackgroundColor()));
        int color = typedArray.getColor(R$styleable.IndicatorLabelButtonView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color;
        this.titleColorActive = typedArray.getColor(R$styleable.IndicatorLabelButtonView_mainTextColorActive, color);
        this.titleColorDisabled = typedArray.getColor(R$styleable.IndicatorLabelButtonView_mainTextColorDisabled, this.titleColorDefault);
        this.subTitleColorDefault = typedArray.getColor(R$styleable.IndicatorLabelButtonView_addonTextColor, this.titleColorDefault);
        this.subTitleColorActive = typedArray.getColor(R$styleable.IndicatorLabelButtonView_addonTextColorActive, this.titleColorDefault);
        this.subTitleColorDisabled = typedArray.getColor(R$styleable.IndicatorLabelButtonView_addonTextColorDisabled, this.titleColorDefault);
        this.indicatorPreset = typedArray.getResourceId(R$styleable.IndicatorLabelButtonView_indicatorPreset, -1);
        this.indicatorDisabledPreset = typedArray.getResourceId(R$styleable.IndicatorLabelButtonView_disabledIndicatorPreset, -1);
    }

    private final void setIndicatorStyle(int indicatorPreset, float alpha) {
        getMainView().setIndicatorStyle(indicatorPreset, alpha);
    }

    static /* synthetic */ void setIndicatorStyle$default(IndicatorLabelButtonView indicatorLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        indicatorLabelButtonView.setIndicatorStyle(i11, f7);
    }

    public static /* synthetic */ void setSubTitleColor$default(IndicatorLabelButtonView indicatorLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        indicatorLabelButtonView.setSubTitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(IndicatorLabelButtonView indicatorLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        indicatorLabelButtonView.setTitleColor(i11, f7);
    }

    public final void applyStyle$uni_release(int style) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] IndicatorLabelButtonView = R$styleable.IndicatorLabelButtonView;
        Intrinsics.checkNotNullExpressionValue(IndicatorLabelButtonView, "IndicatorLabelButtonView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, IndicatorLabelButtonView);
        applyStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        setTitleColor(this.titleColorDisabled, 0.6f);
        setSubTitleColor(this.subTitleColorDisabled, 0.6f);
        setIndicatorStyle(this.indicatorDisabledPreset, 0.6f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
        setIndicatorStyle$default(this, this.indicatorPreset, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubTitleColor(this.subTitleColorActive, 0.4f);
        setIndicatorStyle(this.indicatorPreset, 0.4f);
    }

    public final void setPreset(@NotNull IndicatorLabelButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setSettings(value.getBackgroundWrapperSettings());
        getMainView().setPreset(this.preset.getMainViewPreset());
        setMinimumHeight(UiExtKt.toPx(this.preset.getMainViewPreset().getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    public final void setSubTitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public final void setSubtitle(String subtitle) {
        getMainView().setSubtitleText(subtitle);
    }

    public final void setSubtitleTruncatingMode$uni_release(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.subtitleTruncatingMode = truncatingMode;
        getMainView().setSubtitleTruncatingMode(truncatingMode);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getMainView().setTitleText(title);
    }

    public final void setTitleColor(int color, float alpha) {
        getMainView().setTitleColor(color, alpha);
    }

    public final void setTitleTruncatingMode$uni_release(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        getMainView().setTitleTruncatingMode(truncatingMode);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    @NotNull
    public IndicatorTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLabelButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IndicatorLabelButtonDTO.Preset preset = IndicatorLabelButtonDTO.Preset.SIZE_400;
        this.preset = preset;
        this.mainView = new IndicatorTitleSubtitleCellView(context, attributeSet, 0, 0, this.preset.getMainViewPreset(), false, 44, null);
        this.titleColorDefault = -1;
        this.titleColorActive = -1;
        this.titleColorDisabled = -1;
        this.subTitleColorDefault = -1;
        this.subTitleColorActive = -1;
        this.subTitleColorDisabled = -1;
        this.indicatorPreset = -1;
        this.indicatorDisabledPreset = -1;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IndicatorLabelButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((IndicatorLabelButtonDTO.Preset[]) IndicatorLabelButtonDTO.Preset.getEntries().toArray(new IndicatorLabelButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelButtonView_indicatorLabelButtonSize, preset.ordinal())]);
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.IndicatorLabelButtonView_mainText);
        setTitle(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.IndicatorLabelButtonView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelButtonView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelButtonView_addonTruncatingMode, truncatingMode.ordinal())]);
        try {
            applyStyle(obtainStyledAttributes);
        } catch (UnsupportedOperationException unused) {
            applyStyle$uni_release(R$style.Button_ActionPrimary);
        }
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
    }
}
