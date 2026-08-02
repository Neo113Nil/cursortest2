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
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconSide;

@InterfaceC3999a
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000e¢\u0006\u0004\b#\u0010\u0010J\u0019\u0010&\u001a\u00020\u000e2\b\b\u0001\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b&\u0010)R*\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010=\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\"R\"\u0010B\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010\"R\"\u0010E\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@\"\u0004\bG\u0010\"R\"\u0010H\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010\"R\"\u0010K\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010>\u001a\u0004\bL\u0010@\"\u0004\bM\u0010\"R\"\u0010N\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010>\u001a\u0004\bO\u0010@\"\u0004\bP\u0010\"R\"\u0010Q\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010@\"\u0004\bS\u0010\"R\"\u0010T\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\bV\u0010\"R\"\u0010W\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010>\u001a\u0004\bX\u0010@\"\u0004\bY\u0010\"R.\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010+\u001a\u0004\u0018\u00010Z8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R.\u0010a\u001a\u0004\u0018\u00010Z2\b\u0010+\u001a\u0004\u0018\u00010Z8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^\"\u0004\bc\u0010`¨\u0006d"}, d2 = {"Lru/ozon/uni/android/controls/button/IconLabelButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onButtonEnabled", "()V", "onButtonDisabled", "onButtonPressed", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "setSubtitleColor", "subtitle", "setSubtitle", "setIconColor", "icon", "setIcon", "(I)V", "applyMainPreset", "style", "applyStyle$uni_release", "applyStyle", "Landroid/content/res/TypedArray;", "typedArray", "(Landroid/content/res/TypedArray;)V", "Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO$Preset;)V", "Lru/ozon/uni/atoms/data/controls/button/IconSide;", "iconSide", "Lru/ozon/uni/atoms/data/controls/button/IconSide;", "getIconSide", "()Lru/ozon/uni/atoms/data/controls/button/IconSide;", "setIconSide", "(Lru/ozon/uni/atoms/data/controls/button/IconSide;)V", "mainView", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "iconColor", "I", "getIconColor$uni_release", "()I", "setIconColor$uni_release", "iconColorDisabled", "getIconColorDisabled$uni_release", "setIconColorDisabled$uni_release", "iconColorActive", "getIconColorActive$uni_release", "setIconColorActive$uni_release", "titleColorDefault", "getTitleColorDefault$uni_release", "setTitleColorDefault$uni_release", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconLabelButtonView extends ButtonWrapper<DisclosureTitleSubtitleCellView> implements AtomView {
    private int iconColor;
    private int iconColorActive;
    private int iconColorDisabled;

    @NotNull
    private IconSide iconSide;

    @NotNull
    private final DisclosureTitleSubtitleCellView mainView;

    @NotNull
    private IconLabelButtonDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ IconLabelButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionPrimary_Dynamic : i12);
    }

    private final void applyStyle(TypedArray typedArray) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColorDefault$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context, R$styleable.IconLabelButtonView_backgroundGradient, R$styleable.IconLabelButtonView_backgroundColor, getDefaultBackgroundColor()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColorActive$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context2, R$styleable.IconLabelButtonView_backgroundGradientActive, R$styleable.IconLabelButtonView_backgroundColorActive, getDefaultBackgroundColor()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackgroundColorDisabled$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context3, R$styleable.IconLabelButtonView_backgroundGradientDisabled, R$styleable.IconLabelButtonView_backgroundColorDisabled, getDefaultBackgroundColor()));
        int color = typedArray.getColor(R$styleable.IconLabelButtonView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color;
        this.titleColorActive = typedArray.getColor(R$styleable.IconLabelButtonView_mainTextColorActive, color);
        this.titleColorDisabled = typedArray.getColor(R$styleable.IconLabelButtonView_mainTextColorDisabled, this.titleColorDefault);
        this.subTitleColorDefault = typedArray.getColor(R$styleable.IconLabelButtonView_addonTextColor, this.titleColorDefault);
        this.subTitleColorActive = typedArray.getColor(R$styleable.IconLabelButtonView_addonTextColorActive, this.titleColorDefault);
        this.subTitleColorDisabled = typedArray.getColor(R$styleable.IconLabelButtonView_addonTextColorDisabled, this.titleColorDefault);
        int color2 = typedArray.getColor(R$styleable.IconLabelButtonView_disclosureIconColor, 0);
        this.iconColor = color2;
        this.iconColorDisabled = typedArray.getColor(R$styleable.IconLabelButtonView_disclosureIconColorDisabled, color2);
        this.iconColorActive = typedArray.getColor(R$styleable.IconLabelButtonView_disclosureIconColorActive, this.iconColor);
    }

    public static /* synthetic */ void setIconColor$default(IconLabelButtonView iconLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        iconLabelButtonView.setIconColor(i11, f7);
    }

    public static /* synthetic */ void setSubtitleColor$default(IconLabelButtonView iconLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        iconLabelButtonView.setSubtitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(IconLabelButtonView iconLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        iconLabelButtonView.setTitleColor(i11, f7);
    }

    public final void applyMainPreset() {
        getMainView().setPreset(getIconSide() == IconSide.START ? this.preset.getMainViewPresetStart() : this.preset.getMainViewPresetEnd());
    }

    public final void applyStyle$uni_release(int style) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] IconLabelButtonView = R$styleable.IconLabelButtonView;
        Intrinsics.checkNotNullExpressionValue(IconLabelButtonView, "IconLabelButtonView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, IconLabelButtonView);
        applyStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    @NotNull
    public IconSide getIconSide() {
        return this.iconSide;
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        if (this.iconColor == 0) {
            setTitleColor$default(this, this.titleColorDisabled, 0.0f, 2, null);
            setSubtitleColor$default(this, this.subTitleColorDisabled, 0.0f, 2, null);
            setIconColor(this.iconColor, 0.6f);
        } else {
            setTitleColor(this.titleColorDisabled, 0.6f);
            setSubtitleColor(this.subTitleColorDisabled, 0.6f);
            setIconColor(this.iconColorDisabled, 0.6f);
        }
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubtitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
        setIconColor$default(this, this.iconColor, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubtitleColor(this.subTitleColorActive, 0.4f);
        if (this.iconColor == 0) {
            setIconColor(0, 0.4f);
        } else {
            setIconColor(this.iconColorActive, 0.4f);
        }
    }

    public final void setIcon(int icon) {
        getMainView().setDisclosureIcon(Integer.valueOf(icon));
    }

    public final void setIconColor(int color, float alpha) {
        if (color == 0) {
            getMainView().setAlpha(alpha);
        } else {
            getMainView().setDisclosureIconColor(color, alpha);
        }
    }

    public void setIconSide(@NotNull IconSide iconSide) {
        Intrinsics.checkNotNullParameter(iconSide, "<set-?>");
        this.iconSide = iconSide;
    }

    public final void setPreset(@NotNull IconLabelButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setSettings(value.getBackgroundWrapperSettings());
        applyMainPreset();
        setMinimumHeight(UiExtKt.toPx(this.preset.getMainViewPresetEnd().getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    public final void setSubtitle(String subtitle) {
        getMainView().setSubtitleText(subtitle);
    }

    public final void setSubtitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
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
    public DisclosureTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconLabelButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.preset = IconLabelButtonDTO.Preset.SIZE_400;
        IconSide iconSide = IconSide.END;
        this.iconSide = iconSide;
        this.mainView = new DisclosureTitleSubtitleCellView(context, attributeSet, 0, 0, getIconSide() == IconSide.START ? this.preset.getMainViewPresetStart() : this.preset.getMainViewPresetEnd(), false, 44, null);
        this.iconColor = -1;
        this.iconColorDisabled = -1;
        this.iconColorActive = -1;
        this.titleColorDefault = -1;
        this.titleColorActive = -1;
        this.titleColorDisabled = -1;
        this.subTitleColorDefault = -1;
        this.subTitleColorActive = -1;
        this.subTitleColorDisabled = -1;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconLabelButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((IconLabelButtonDTO.Preset[]) IconLabelButtonDTO.Preset.getEntries().toArray(new IconLabelButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.IconLabelButtonView_iconLabelButtonSize, IconLabelButtonDTO.Preset.SIZE_500.ordinal())]);
        setIconSide(((IconSide[]) IconSide.getEntries().toArray(new IconSide[0]))[obtainStyledAttributes.getInt(R$styleable.IconLabelButtonView_iconSide, iconSide.ordinal())]);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconLabelButtonView_graphic, -1);
        if (resourceId != -1) {
            setIcon(resourceId);
        }
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.IconLabelButtonView_mainText);
        setTitle(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.IconLabelButtonView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconLabelButtonView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconLabelButtonView_addonTruncatingMode, truncatingMode.ordinal())]);
        try {
            applyStyle(obtainStyledAttributes);
        } catch (UnsupportedOperationException unused) {
            applyStyle$uni_release(R$style.Button_ActionPrimary);
        }
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
    }
}
