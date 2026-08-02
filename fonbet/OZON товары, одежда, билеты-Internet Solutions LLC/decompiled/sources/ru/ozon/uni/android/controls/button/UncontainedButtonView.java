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
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TVExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u0015J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001aR*\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010+\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00104\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u00107\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010+\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010:\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010+\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010=\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R.\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\u001f\u001a\u0004\u0018\u00010@8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR.\u0010G\u001a\u0004\u0018\u00010@2\b\u0010\u001f\u001a\u0004\u0018\u00010@8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010F¨\u0006J"}, d2 = {"Lru/ozon/uni/android/controls/button/UncontainedButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onButtonPressed", "()V", "onButtonDisabled", "onButtonEnabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "subtitle", "setSubtitle", "setSubTitleColor", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "transparent", "I", "titleColorDefault", "getTitleColorDefault$uni_release", "()I", "setTitleColorDefault$uni_release", "(I)V", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UncontainedButtonView extends ButtonWrapper<TitleSubtitleCellView> implements AtomView {

    @NotNull
    private final TitleSubtitleCellView mainView;

    @NotNull
    private UncontainedButtonDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;
    private final int transparent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UncontainedButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setSubTitleColor$default(UncontainedButtonView uncontainedButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        uncontainedButtonView.setSubTitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(UncontainedButtonView uncontainedButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        uncontainedButtonView.setTitleColor(i11, f7);
    }

    /* renamed from: getTitleColorDefault$uni_release, reason: from getter */
    public final int getTitleColorDefault() {
        return this.titleColorDefault;
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        setTitleColor(this.titleColorDisabled, 0.6f);
        setSubTitleColor(this.subTitleColorDisabled, 0.6f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor$default(this, this.titleColorActive, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorActive, 0.0f, 2, null);
    }

    public final void setPreset(@NotNull UncontainedButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().setPreset(this.preset.getMainPreset());
        setMinimumHeight(UiExtKt.toPx(this.preset.getMainPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
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

    public /* synthetic */ UncontainedButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionSecondary : i12);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UncontainedButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        UncontainedButtonDTO.Preset preset = UncontainedButtonDTO.Preset.SIZE_400;
        this.preset = preset;
        this.mainView = new TitleSubtitleCellView(context, attributeSet, i11, i12, this.preset.getMainPreset(), false, 32, null);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UncontainedButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((UncontainedButtonDTO.Preset[]) UncontainedButtonDTO.Preset.getEntries().toArray(new UncontainedButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedButtonView_uncontainedButtonSize, preset.ordinal())]);
        int color2 = obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color2;
        this.titleColorActive = obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_mainTextColorActive, color2);
        this.titleColorDisabled = obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_mainTextColorDisabled, this.titleColorDefault);
        this.subTitleColorDefault = obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_addonTextColor, this.titleColorDefault);
        this.subTitleColorActive = obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_addonTextColorActive, this.titleColorDefault);
        this.subTitleColorDisabled = obtainStyledAttributes.getColor(R$styleable.UncontainedButtonView_addonTextColorDisabled, this.titleColorDefault);
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.UncontainedButtonView_mainText);
        setTitle(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.UncontainedButtonView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedButtonView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.UncontainedButtonView_addonTruncatingMode, truncatingMode.ordinal())]);
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
    }
}
