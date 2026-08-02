package ru.ozon.uni.android.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.dataAddon.DataTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001qB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001aJ\u0019\u0010%\u001a\u00020\u000e2\b\b\u0001\u0010#\u001a\u00020\tH\u0000¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b%\u0010)R*\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u001eR*\u00101\u001a\u0002002\u0006\u0010*\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u00105R*\u00107\u001a\u0002062\u0006\u0010*\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010A\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0015R\"\u0010F\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010B\u001a\u0004\bG\u0010D\"\u0004\bH\u0010\u0015R\"\u0010I\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010\u0015R\"\u0010L\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u0004\bN\u0010\u0015R\"\u0010O\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010B\u001a\u0004\bP\u0010D\"\u0004\bQ\u0010\u0015R\"\u0010R\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010B\u001a\u0004\bS\u0010D\"\u0004\bT\u0010\u0015R\"\u0010U\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010B\u001a\u0004\bV\u0010D\"\u0004\bW\u0010\u0015R\"\u0010X\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010B\u001a\u0004\bY\u0010D\"\u0004\bZ\u0010\u0015R\"\u0010[\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010B\u001a\u0004\b\\\u0010D\"\u0004\b]\u0010\u0015R\"\u0010^\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010B\u001a\u0004\b_\u0010D\"\u0004\b`\u0010\u0015R\"\u0010a\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010B\u001a\u0004\bb\u0010D\"\u0004\bc\u0010\u0015R\"\u0010d\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010B\u001a\u0004\be\u0010D\"\u0004\bf\u0010\u0015R.\u0010h\u001a\u0004\u0018\u00010g2\b\u0010*\u001a\u0004\u0018\u00010g8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR.\u0010n\u001a\u0004\u0018\u00010g2\b\u0010*\u001a\u0004\u0018\u00010g8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010i\u001a\u0004\bo\u0010k\"\u0004\bp\u0010m¨\u0006r"}, d2 = {"Lru/ozon/uni/android/controls/button/DataButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/dataAddon/DataTitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onButtonEnabled", "()V", "onButtonDisabled", "onButtonPressed", "color", "setDataBackgroundColor", "(I)V", "textColor", "", "alpha", "setDataTextColor", "(IF)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "setTitleColor", "subtitle", "setSubtitle", "setSubTitleColor", "style", "applyStyle$uni_release", "applyStyle", "invalidateMainView", "Landroid/content/res/TypedArray;", "typedArray", "(Landroid/content/res/TypedArray;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "", "isContentCentered", "Z", "()Z", "setContentCentered", "(Z)V", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;", "preset", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;)V", "mainView", "Lru/ozon/uni/android/cell/dataAddon/DataTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/dataAddon/DataTitleSubtitleCellView;", "titleColorDefault", "I", "getTitleColorDefault$uni_release", "()I", "setTitleColorDefault$uni_release", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "dataTextColorDefault", "getDataTextColorDefault$uni_release", "setDataTextColorDefault$uni_release", "dataTextColorActive", "getDataTextColorActive$uni_release", "setDataTextColorActive$uni_release", "dataTextColorDisabled", "getDataTextColorDisabled$uni_release", "setDataTextColorDisabled$uni_release", "dataBackgroundColorDefault", "getDataBackgroundColorDefault$uni_release", "setDataBackgroundColorDefault$uni_release", "dataBackgroundColorActive", "getDataBackgroundColorActive$uni_release", "setDataBackgroundColorActive$uni_release", "dataBackgroundColorDisabled", "getDataBackgroundColorDisabled$uni_release", "setDataBackgroundColorDisabled$uni_release", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode$uni_release", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode$uni_release", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode$uni_release", "setSubtitleTruncatingMode$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataButtonView extends ButtonWrapper<DataTitleSubtitleCellView> implements AtomView, AtomLocatableView {
    private int dataBackgroundColorActive;
    private int dataBackgroundColorDefault;
    private int dataBackgroundColorDisabled;
    private int dataTextColorActive;
    private int dataTextColorDefault;
    private int dataTextColorDisabled;
    private boolean isContentCentered;

    @NotNull
    private String locatorTag;

    @NotNull
    private final DataTitleSubtitleCellView mainView;

    @NotNull
    private DataButtonDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/controls/button/DataButtonView$Companion;", "", "<init>", "()V", "DATA_BUTTON_LOCATOR_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyStyle(TypedArray typedArray) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColorDefault$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context, R$styleable.DataButtonView_backgroundGradient, R$styleable.DataButtonView_backgroundColor, getDefaultBackgroundColor()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColorActive$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context2, R$styleable.DataButtonView_backgroundGradientActive, R$styleable.DataButtonView_backgroundColorActive, getDefaultBackgroundColor()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackgroundColorDisabled$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context3, R$styleable.DataButtonView_backgroundGradientDisabled, R$styleable.DataButtonView_backgroundColorDisabled, getDefaultBackgroundColor()));
        int color = typedArray.getColor(R$styleable.DataButtonView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color;
        this.titleColorActive = typedArray.getColor(R$styleable.DataButtonView_mainTextColorActive, color);
        this.titleColorDisabled = typedArray.getColor(R$styleable.DataButtonView_mainTextColorDisabled, this.titleColorDefault);
        this.subTitleColorDefault = typedArray.getColor(R$styleable.DataButtonView_addonTextColor, this.titleColorDefault);
        this.subTitleColorActive = typedArray.getColor(R$styleable.DataButtonView_addonTextColorActive, this.titleColorDefault);
        this.subTitleColorDisabled = typedArray.getColor(R$styleable.DataButtonView_addonTextColorDisabled, this.titleColorDefault);
        this.dataTextColorDefault = typedArray.getColor(R$styleable.DataButtonView_dataTextColor, this.titleColorDefault);
        this.dataTextColorActive = typedArray.getColor(R$styleable.DataButtonView_dataTextColorActive, this.titleColorDefault);
        this.dataTextColorDisabled = typedArray.getColor(R$styleable.DataButtonView_dataTextColorDisabled, this.titleColorDefault);
        this.dataBackgroundColorDefault = typedArray.getColor(R$styleable.DataButtonView_dataBackgroundColor, getDefaultBackgroundColor());
        this.dataBackgroundColorActive = typedArray.getColor(R$styleable.DataButtonView_dataBackgroundColorActive, getDefaultBackgroundColor());
        this.dataBackgroundColorDisabled = typedArray.getColor(R$styleable.DataButtonView_dataBackgroundColorDisabled, getDefaultBackgroundColor());
    }

    private final void invalidateMainView() {
        ViewGroup.LayoutParams layoutParams = getMainView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = Intrinsics.d(getMainView().getPreset(), this.preset.getMainPresetCentered()) ? -2 : -1;
            getMainView().setLayoutParams(layoutParams);
        }
    }

    public static /* synthetic */ void setDataTextColor$default(DataButtonView dataButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        dataButtonView.setDataTextColor(i11, f7);
    }

    public static /* synthetic */ void setSubTitleColor$default(DataButtonView dataButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        dataButtonView.setSubTitleColor(i11, f7);
    }

    public static /* synthetic */ void setTitleColor$default(DataButtonView dataButtonView, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 1.0f;
        }
        dataButtonView.setTitleColor(i11, f7);
    }

    public final void applyStyle$uni_release(int style) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] DataButtonView = R$styleable.DataButtonView;
        Intrinsics.checkNotNullExpressionValue(DataButtonView, "DataButtonView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, DataButtonView);
        applyStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        setTitleColor(this.titleColorDisabled, 0.6f);
        setSubTitleColor(this.subTitleColorDisabled, 0.6f);
        setDataBackgroundColor(this.dataBackgroundColorDisabled);
        setDataTextColor(this.dataTextColorDisabled, 0.6f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        setSubTitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
        setDataBackgroundColor(this.dataBackgroundColorDefault);
        setDataTextColor$default(this, this.dataTextColorDefault, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubTitleColor(this.subTitleColorActive, 0.4f);
        setDataBackgroundColor(this.dataBackgroundColorActive);
        setDataTextColor(this.dataTextColorActive, 0.4f);
    }

    public final void setContentCentered(boolean z11) {
        this.isContentCentered = z11;
        setSettings(z11 ? this.preset.getBackgroundWrapperCentered() : this.preset.getBackgroundWrapperFilled());
        getMainView().setPreset(this.isContentCentered ? this.preset.getMainPresetCentered() : this.preset.getMainPresetFilled());
        invalidateMainView();
    }

    public final void setDataBackgroundColor(int color) {
        getMainView().setDataBackgroundColor(color);
    }

    public final void setDataTextColor(int textColor, float alpha) {
        getMainView().setDataTextColor(textColor, alpha);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setPreset(@NotNull DataButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setSettings(this.isContentCentered ? value.getBackgroundWrapperCentered() : value.getBackgroundWrapperFilled());
        getMainView().setPreset(this.isContentCentered ? this.preset.getMainPresetCentered() : this.preset.getMainPresetFilled());
        setMinimumHeight(UiExtKt.toPx(this.preset.getMainPresetCentered().getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    public final void setSubTitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public final void setSubtitle(String subtitle) {
        getMainView().setSubtitle(subtitle);
    }

    public final void setSubtitleTruncatingMode$uni_release(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.subtitleTruncatingMode = truncatingMode;
        getMainView().setSubtitleTruncatingMode(this.subtitleTruncatingMode);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getMainView().setTitle(title);
    }

    public final void setTitleColor(int color, float alpha) {
        getMainView().setTitleColor(color, alpha);
    }

    public final void setTitleTruncatingMode$uni_release(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        getMainView().setTitleTruncatingMode(this.titleTruncatingMode);
    }

    public /* synthetic */ DataButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionPrimary_Dynamic : i12);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    @NotNull
    public DataTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "dataButton";
        this.isContentCentered = true;
        DataButtonDTO.Preset preset = DataButtonDTO.Preset.SIZE_600;
        this.preset = preset;
        this.mainView = new DataTitleSubtitleCellView(context, attributeSet, 0, 0, this.isContentCentered ? this.preset.getMainPresetCentered() : this.preset.getMainPresetFilled(), false, 44, null);
        this.titleColorDefault = -1;
        this.titleColorActive = -1;
        this.titleColorDisabled = -1;
        this.subTitleColorDefault = -1;
        this.subTitleColorActive = -1;
        this.subTitleColorDisabled = -1;
        this.dataTextColorDefault = -1;
        this.dataTextColorActive = -1;
        this.dataTextColorDisabled = -1;
        this.dataBackgroundColorDefault = -1;
        this.dataBackgroundColorActive = -1;
        this.dataBackgroundColorDisabled = -1;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DataButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((DataButtonDTO.Preset[]) DataButtonDTO.Preset.getEntries().toArray(new DataButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.DataButtonView_dataButtonSize, preset.ordinal())]);
        setContentCentered(obtainStyledAttributes.getBoolean(R$styleable.DataButtonView_isContentCentered, true));
        getMainView().setTitleNumberOfLines(1);
        getMainView().setSubtitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.DataButtonView_mainText);
        setTitle(string == null ? "" : string);
        setSubtitle(obtainStyledAttributes.getString(R$styleable.DataButtonView_addonText));
        setTitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.DataButtonView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode$uni_release(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.DataButtonView_addonTruncatingMode, truncatingMode.ordinal())]);
        setContentDescription(getLocatorTag());
        try {
            applyStyle(obtainStyledAttributes);
        } catch (UnsupportedOperationException unused) {
            applyStyle$uni_release(R$style.Button_ActionPrimary);
        }
        obtainStyledAttributes.recycle();
        setView(this.isContentCentered);
    }
}
