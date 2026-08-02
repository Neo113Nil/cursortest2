package ru.ozon.uni.android.controls.button;

import Sc.InterfaceC3999a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.a;
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
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TVExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconSide;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u0015J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u000fR*\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b9\u0010:\"\u0004\b;\u0010 R\"\u0010<\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u0010:\"\u0004\b>\u0010 R\"\u0010?\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u00107\u001a\u0004\b@\u0010:\"\u0004\bA\u0010 R\"\u0010B\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u00107\u001a\u0004\bC\u0010:\"\u0004\bD\u0010 R\"\u0010E\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u00107\u001a\u0004\bF\u0010:\"\u0004\bG\u0010 R\"\u0010H\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u0010:\"\u0004\bJ\u0010 R\"\u0010K\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u00107\u001a\u0004\bL\u0010:\"\u0004\bM\u0010 R\"\u0010N\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u00107\u001a\u0004\bO\u0010:\"\u0004\bP\u0010 R\"\u0010Q\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bR\u0010:\"\u0004\bS\u0010 R.\u0010U\u001a\u0004\u0018\u00010T2\b\u0010$\u001a\u0004\u0018\u00010T8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR.\u0010[\u001a\u0004\u0018\u00010T2\b\u0010$\u001a\u0004\u0018\u00010T8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010Z¨\u0006^"}, d2 = {"Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onButtonEnabled", "()V", "onButtonPressed", "onButtonDisabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "subtitle", "setSubtitle", "setSubTitleColor", "icon", "setIcon", "(I)V", "setIconColor", "applyMainPreset", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;)V", "Lru/ozon/uni/atoms/data/controls/button/IconSide;", "iconSide", "Lru/ozon/uni/atoms/data/controls/button/IconSide;", "getIconSide", "()Lru/ozon/uni/atoms/data/controls/button/IconSide;", "setIconSide", "(Lru/ozon/uni/atoms/data/controls/button/IconSide;)V", "mainView", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "transparent", "I", "iconColor", "getIconColor$uni_release", "()I", "setIconColor$uni_release", "iconColorDisabled", "getIconColorDisabled$uni_release", "setIconColorDisabled$uni_release", "iconColorActive", "getIconColorActive$uni_release", "setIconColorActive$uni_release", "titleColorDefault", "getTitleColorDefault$uni_release", "setTitleColorDefault$uni_release", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UncontainedIconLabelButtonView extends ButtonWrapper<DisclosureTitleSubtitleCellView> implements AtomView {
    private int iconColor;
    private int iconColorActive;
    private int iconColorDisabled;

    @NotNull
    private IconSide iconSide;

    @NotNull
    private final DisclosureTitleSubtitleCellView mainView;

    @NotNull
    private UncontainedIconLabelButtonDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;
    private final int transparent;

    public /* synthetic */ UncontainedIconLabelButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionSecondary : i12);
    }

    private final void applyMainPreset() {
        getMainView().setPreset(this.iconSide == IconSide.START ? this.preset.getMainViewPresetStart() : this.preset.getMainViewPresetEnd());
    }

    public static /* synthetic */ void setIconColor$default(UncontainedIconLabelButtonView uncontainedIconLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        uncontainedIconLabelButtonView.setIconColor(i11, f7);
    }

    public static /* synthetic */ void setSubTitleColor$default(UncontainedIconLabelButtonView uncontainedIconLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        uncontainedIconLabelButtonView.setSubTitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(UncontainedIconLabelButtonView uncontainedIconLabelButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        uncontainedIconLabelButtonView.setTitleColor(i11, f7);
    }

    /* renamed from: getIconColor$uni_release, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* renamed from: getTitleColorDefault$uni_release, reason: from getter */
    public final int getTitleColorDefault() {
        return this.titleColorDefault;
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        if (this.iconColor == 0) {
            setTitleColor$default(this, this.titleColorDisabled, 0.0f, 2, null);
            setSubTitleColor$default(this, this.subTitleColorDisabled, 0.0f, 2, null);
            setIconColor(this.iconColor, 0.6f);
        } else {
            setTitleColor(this.titleColorDisabled, 0.6f);
            setSubTitleColor(this.subTitleColorDisabled, 0.6f);
            setIconColor(this.iconColorDisabled, 0.6f);
        }
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
        setIconColor$default(this, this.iconColor, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubTitleColor(this.subTitleColorActive, 0.4f);
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
        getMainView().setDisclosureIconColor(color, alpha);
    }

    public final void setIconColor$uni_release(int i11) {
        this.iconColor = i11;
    }

    public final void setIconColorActive$uni_release(int i11) {
        this.iconColorActive = i11;
    }

    public final void setIconColorDisabled$uni_release(int i11) {
        this.iconColorDisabled = i11;
    }

    public final void setIconSide(@NotNull IconSide iconSide) {
        Intrinsics.checkNotNullParameter(iconSide, "<set-?>");
        this.iconSide = iconSide;
    }

    public final void setPreset(@NotNull UncontainedIconLabelButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        applyMainPreset();
        setMinimumHeight(UiExtKt.toPx(this.preset.getMainViewPresetEnd().getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    public final void setSubTitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public final void setSubTitleColorActive$uni_release(int i11) {
        this.subTitleColorActive = i11;
    }

    public final void setSubTitleColorDefault$uni_release(int i11) {
        this.subTitleColorDefault = i11;
    }

    public final void setSubTitleColorDisabled$uni_release(int i11) {
        this.subTitleColorDisabled = i11;
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

    public final void setTitleColorActive$uni_release(int i11) {
        this.titleColorActive = i11;
    }

    public final void setTitleColorDefault$uni_release(int i11) {
        this.titleColorDefault = i11;
    }

    public final void setTitleColorDisabled$uni_release(int i11) {
        this.titleColorDisabled = i11;
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
    public UncontainedIconLabelButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        UncontainedIconLabelButtonDTO.Preset preset = UncontainedIconLabelButtonDTO.Preset.SIZE_400;
        this.preset = preset;
        IconSide iconSide = IconSide.END;
        this.iconSide = iconSide;
        this.mainView = new DisclosureTitleSubtitleCellView(context, attributeSet, 0, 0, this.iconSide == IconSide.START ? this.preset.getMainViewPresetStart() : this.preset.getMainViewPresetEnd(), false, 44, null);
        int color = a.getColor(context, R.color.transparent);
        this.transparent = color;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        if (!TVExtKt.isAppOpenOnTV(context)) {
            setCurrentBackgroundColor(new Color.Solid(color));
            setBackgroundColorActive$uni_release(new Color.Solid(color));
            setBackgroundColorDisabled$uni_release(new Color.Solid(color));
            setBackgroundColorDefault$uni_release(new Color.Solid(color));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UncontainedIconLabelButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((UncontainedIconLabelButtonDTO.Preset[]) UncontainedIconLabelButtonDTO.Preset.getEntries().toArray(new UncontainedIconLabelButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedIconLabelButtonView_uncontainedButtonSize, preset.ordinal())]);
        this.iconSide = ((IconSide[]) IconSide.getEntries().toArray(new IconSide[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedIconLabelButtonView_iconSide, iconSide.ordinal())];
        int color2 = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color2;
        this.titleColorActive = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_mainTextColorActive, color2);
        this.titleColorDisabled = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_mainTextColorDisabled, this.titleColorDefault);
        this.subTitleColorDefault = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_addonTextColor, this.titleColorDefault);
        this.subTitleColorActive = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_addonTextColorActive, this.titleColorDefault);
        this.subTitleColorDisabled = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_addonTextColorDisabled, this.titleColorDefault);
        int color3 = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_disclosureIconColor, 0);
        this.iconColor = color3;
        this.iconColorDisabled = color3 == 0 ? 0 : obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_disclosureIconColorDisabled, 0);
        this.iconColorActive = obtainStyledAttributes.getColor(R$styleable.UncontainedIconLabelButtonView_disclosureIconColorActive, this.iconColor);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.UncontainedIconLabelButtonView_graphic, -1);
        if (resourceId != -1) {
            setIcon(resourceId);
        }
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.UncontainedIconLabelButtonView_mainText);
        setTitle(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.UncontainedIconLabelButtonView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedIconLabelButtonView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedIconLabelButtonView_addonTruncatingMode, truncatingMode.ordinal())]);
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
    }
}
