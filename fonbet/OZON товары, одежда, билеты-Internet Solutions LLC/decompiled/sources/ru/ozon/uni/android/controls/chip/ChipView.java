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
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.chip.ChipWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001VB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001cR*\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0017R*\u0010'\u001a\u00020&2\u0006\u0010 \u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00101\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010:\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010=\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R.\u0010A\u001a\u0004\u0018\u00010@2\b\u0010 \u001a\u0004\u0018\u00010@8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR.\u0010G\u001a\u0004\u0018\u00010@2\b\u0010 \u001a\u0004\u0018\u00010@8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010J\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u00102\u001a\u0004\bK\u00104\"\u0004\bL\u00106R*\u0010M\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u00102\u001a\u0004\bN\u00104\"\u0004\bO\u00106R\"\u0010P\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u00102\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R\"\u0010S\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u00102\u001a\u0004\bT\u00104\"\u0004\bU\u00106¨\u0006W"}, d2 = {"Lru/ozon/uni/android/controls/chip/ChipView;", "Lru/ozon/uni/android/wrappers/main/chip/ChipWrapper;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onChipEnabled", "()V", "onChipDisabled", "onChipPressed", "onChipSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "subtitle", "setSubtitle", "setSubTitleColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;", "chipPreset", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;", "getChipPreset", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;", "setChipPreset", "(Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "titleColorActive", "I", "getTitleColorActive$uni_release", "()I", "setTitleColorActive$uni_release", "(I)V", "titleColorDefault", "getTitleColorDefault$uni_release", "setTitleColorDefault$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "titleColorSelected", "getTitleColorSelected$uni_release", "setTitleColorSelected$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "subTitleColorSelected", "getSubTitleColorSelected$uni_release", "setSubTitleColorSelected$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChipView extends ChipWrapper<TitleSubtitleCellView> implements AtomView, AtomLocatableView {

    @NotNull
    private ChipDTO.Preset chipPreset;

    @NotNull
    private String locatorTag;

    @NotNull
    private final TitleSubtitleCellView mainView;
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

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/controls/chip/ChipView$Companion;", "", "<init>", "()V", "CHIP_LOCATOR_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setSubTitleColor$default(ChipView chipView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        chipView.setSubTitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(ChipView chipView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        chipView.setTitleColor(i11, f7);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
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
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubTitleColor(this.subTitleColorActive, 0.4f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    public void onChipSelected() {
        setTitleColor$default(this, this.titleColorSelected, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorSelected, 0.0f, 2, null);
    }

    public final void setChipPreset(@NotNull ChipDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.chipPreset = value;
        setSettings(value.getSettings());
        getMainView().setPreset(this.chipPreset.getMainPreset());
        setMinimumHeight(UiExtKt.toPx(this.chipPreset.getMainPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setSubTitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public final void setSubTitleColorActive$uni_release(int i11) {
        this.subTitleColorActive = i11;
    }

    public final void setSubTitleColorDefault$uni_release(int i11) {
        this.subTitleColorDefault = i11;
        setSubTitleColor$default(this, i11, 0.0f, 2, null);
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
        setTitleColor$default(this, i11, 0.0f, 2, null);
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

    public /* synthetic */ ChipView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Chip_AspectPrimary : i12);
    }

    @Override // ru.ozon.uni.android.wrappers.main.chip.ChipWrapper
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "chip";
        ChipDTO.Preset preset = ChipDTO.Preset.SIZE_400;
        this.chipPreset = preset;
        this.mainView = new TitleSubtitleCellView(context, attributeSet, 0, 0, this.chipPreset.getMainPreset(), false, 44, null);
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ChipView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setChipPreset(((ChipDTO.Preset[]) ChipDTO.Preset.getEntries().toArray(new ChipDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.ChipView_chipSize, preset.ordinal())]);
        setTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColor, getDefaultBackgroundColor()));
        this.titleColorActive = obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColorActive, this.titleColorDefault);
        this.titleColorDisabled = obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColorDisabled, this.titleColorDefault);
        this.titleColorSelected = obtainStyledAttributes.getColor(R$styleable.ChipView_mainTextColorSelected, this.titleColorDefault);
        setSubTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColor, this.titleColorDefault));
        this.subTitleColorActive = obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColorActive, this.subTitleColorDefault);
        this.subTitleColorDisabled = obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColorDisabled, this.subTitleColorDefault);
        this.subTitleColorSelected = obtainStyledAttributes.getColor(R$styleable.ChipView_addonTextColorSelected, this.subTitleColorDefault);
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.ChipView_mainText);
        setTitle(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.ChipView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ChipView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ChipView_addonTruncatingMode, truncatingMode.ordinal())]);
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
        ChipWrapper.setView$default(this, false, 1, null);
    }
}
