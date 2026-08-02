package ru.ozon.uni.android.controls.chip;

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
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.chip.ChipWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u000fR*\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R.\u00106\u001a\u0004\u0018\u0001052\b\u0010#\u001a\u0004\u0018\u0001058\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R.\u0010<\u001a\u0004\u0018\u0001052\b\u0010#\u001a\u0004\u0018\u0001058\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010?\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010H\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010K\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR\"\u0010N\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\"\u0010Q\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010B\"\u0004\bS\u0010DR\"\u0010T\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010@\u001a\u0004\bU\u0010B\"\u0004\bV\u0010DR\"\u0010W\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010DR\"\u0010\u001f\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010@\u001a\u0004\bZ\u0010B\"\u0004\b[\u0010DR\"\u0010\\\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010@\u001a\u0004\b]\u0010B\"\u0004\b^\u0010D¨\u0006_"}, d2 = {"Lru/ozon/uni/android/controls/chip/IndicatorLabelChipView;", "Lru/ozon/uni/android/wrappers/main/chip/ChipWrapper;", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onChipEnabled", "()V", "onChipDisabled", "onChipPressed", "onChipSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "subtitle", "setSubtitle", "setSubTitleColor", "indicatorPreset", "setIndicatorStyle", "applyMainPreset", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "chipPreset", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "getChipPreset", "()Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "setChipPreset", "(Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;)V", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "indicatorType", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "getIndicatorType", "()Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "setIndicatorType", "(Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;)V", "mainView", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "titleColorActive", "I", "getTitleColorActive$uni_release", "()I", "setTitleColorActive$uni_release", "(I)V", "titleColorDefault", "getTitleColorDefault$uni_release", "setTitleColorDefault$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "titleColorSelected", "getTitleColorSelected$uni_release", "setTitleColorSelected$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "subTitleColorSelected", "getSubTitleColorSelected$uni_release", "setSubTitleColorSelected$uni_release", "getIndicatorPreset$uni_release", "setIndicatorPreset$uni_release", "indicatorDisabledPreset", "getIndicatorDisabledPreset$uni_release", "setIndicatorDisabledPreset$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorLabelChipView extends ChipWrapper<IndicatorTitleSubtitleCellView> implements AtomView {

    @NotNull
    private IndicatorLabelChipDTO.Preset chipPreset;
    private int indicatorDisabledPreset;
    private int indicatorPreset;

    @NotNull
    private IndicatorLabelChipDTO.IndicatorType indicatorType;

    @NotNull
    private final IndicatorTitleSubtitleCellView mainView;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private int subTitleColorSelected;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private int titleColorSelected;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ IndicatorLabelChipView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Chip_AspectPrimary : i12);
    }

    private final void applyMainPreset() {
        getMainView().setPreset(this.indicatorType == IndicatorLabelChipDTO.IndicatorType.INDICATOR ? this.chipPreset.getMainPresetIndicator() : this.chipPreset.getMainPresetMarker());
    }

    private final void setIndicatorStyle(int indicatorPreset, float alpha) {
        getMainView().setIndicatorStyle(indicatorPreset, alpha);
    }

    public static /* synthetic */ void setSubTitleColor$default(IndicatorLabelChipView indicatorLabelChipView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        indicatorLabelChipView.setSubTitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(IndicatorLabelChipView indicatorLabelChipView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        indicatorLabelChipView.setTitleColor(i11, f7);
    }

    /* renamed from: getSubTitleColorDefault$uni_release, reason: from getter */
    public final int getSubTitleColorDefault() {
        return this.subTitleColorDefault;
    }

    /* renamed from: getTitleColorDefault$uni_release, reason: from getter */
    public final int getTitleColorDefault() {
        return this.titleColorDefault;
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipDisabled() {
        setTitleColor$default(this, this.titleColorDisabled, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDisabled, 0.0f, 2, null);
        setIndicatorStyle(this.indicatorDisabledPreset, 1.0f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setIndicatorStyle(this.indicatorPreset, 1.0f);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubTitleColor(this.subTitleColorActive, 0.4f);
        setIndicatorStyle(this.indicatorPreset, 0.4f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipSelected() {
        setTitleColor$default(this, this.titleColorSelected, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorSelected, 0.0f, 2, null);
        setIndicatorStyle(this.indicatorPreset, 1.0f);
    }

    public final void setChipPreset(@NotNull IndicatorLabelChipDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.chipPreset = value;
        setSettings(value.getSettings());
        applyMainPreset();
        setMinimumHeight(UiExtKt.toPx(this.chipPreset.getMainPresetIndicator().getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    public final void setIndicatorDisabledPreset$uni_release(int i11) {
        this.indicatorDisabledPreset = i11;
    }

    public final void setIndicatorPreset$uni_release(int i11) {
        this.indicatorPreset = i11;
    }

    public final void setIndicatorType(@NotNull IndicatorLabelChipDTO.IndicatorType indicatorType) {
        Intrinsics.checkNotNullParameter(indicatorType, "<set-?>");
        this.indicatorType = indicatorType;
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

    public final void setSubTitleColorSelected$uni_release(int i11) {
        this.subTitleColorSelected = i11;
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

    public final void setTitleColorSelected$uni_release(int i11) {
        this.titleColorSelected = i11;
    }

    public final void setTitleTruncatingMode$uni_release(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        getMainView().setTitleTruncatingMode(truncatingMode);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    @NotNull
    public IndicatorTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLabelChipView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IndicatorLabelChipDTO.Preset preset = IndicatorLabelChipDTO.Preset.SIZE_400;
        this.chipPreset = preset;
        IndicatorLabelChipDTO.IndicatorType indicatorType = IndicatorLabelChipDTO.IndicatorType.INDICATOR;
        this.indicatorType = indicatorType;
        this.mainView = new IndicatorTitleSubtitleCellView(context, attributeSet, 0, 0, this.indicatorType == IndicatorLabelChipDTO.IndicatorType.MARKER ? this.chipPreset.getMainPresetMarker() : this.chipPreset.getMainPresetIndicator(), false, 44, null);
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IndicatorLabelChipView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setChipPreset(((IndicatorLabelChipDTO.Preset[]) IndicatorLabelChipDTO.Preset.getEntries().toArray(new IndicatorLabelChipDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelChipView_chipSize, preset.ordinal())]);
        this.indicatorType = ((IndicatorLabelChipDTO.IndicatorType[]) IndicatorLabelChipDTO.IndicatorType.getEntries().toArray(new IndicatorLabelChipDTO.IndicatorType[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelChipView_indicatorType, indicatorType.ordinal())];
        int color = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color;
        this.titleColorActive = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColorActive, color);
        this.titleColorDisabled = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColorDisabled, this.titleColorDefault);
        this.titleColorSelected = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_mainTextColorSelected, this.titleColorDefault);
        int color2 = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColor, this.titleColorDefault);
        this.subTitleColorDefault = color2;
        this.subTitleColorActive = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColorActive, color2);
        this.subTitleColorDisabled = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColorDisabled, this.subTitleColorDefault);
        this.subTitleColorSelected = obtainStyledAttributes.getColor(R$styleable.IndicatorLabelChipView_addonTextColorSelected, this.subTitleColorDefault);
        this.indicatorPreset = obtainStyledAttributes.getResourceId(R$styleable.IndicatorLabelChipView_indicatorPreset, -1);
        this.indicatorDisabledPreset = obtainStyledAttributes.getResourceId(R$styleable.IndicatorLabelChipView_disabledIndicatorPreset, -1);
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.IndicatorLabelChipView_mainText);
        setTitle(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.IndicatorLabelChipView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelChipView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorLabelChipView_addonTruncatingMode, truncatingMode.ordinal())]);
        obtainStyledAttributes.recycle();
        ChipWrapper.setView$default(this, false, 1, null);
    }
}
