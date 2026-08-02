package ru.ozon.uni.android.cell.selection.radiobutton;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.selection.SelectionTouchListenerKt;
import ru.ozon.uni.android.cell.selection.radiobutton.RadioTitleSubtitleCellView;
import ru.ozon.uni.android.cell.selection.radiobutton.data.RadioTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.selection.radiobutton.data.RadioTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007BO\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R*\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00104\u001a\u0002032\u0006\u0010&\u001a\u0002038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010:\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010A\u001a\u0004\u0018\u00010@2\b\u0010&\u001a\u0004\u0018\u00010@8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR.\u0010G\u001a\u0004\u0018\u00010@2\b\u0010&\u001a\u0004\u0018\u00010@8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR.\u0010J\u001a\u0004\u0018\u0001032\b\u0010&\u001a\u0004\u0018\u0001038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u00105\u001a\u0004\bK\u00107\"\u0004\bL\u00109R*\u0010M\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010;\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R*\u0010P\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010\"\u001a\u0004\bP\u0010\u001e\"\u0004\bQ\u0010!R*\u0010R\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010\"\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010!¨\u0006T"}, d2 = {"Lru/ozon/uni/android/cell/selection/radiobutton/RadioTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellApi;", "", "Lru/ozon/uni/android/cell/selection/radiobutton/RadioTitleSubtitleCellApi;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "addonView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;ZLru/ozon/uni/android/atom/selectionControls/RadioButtonView;)V", "color", "", "alpha", "", "setTitleColor", "(IF)V", "setSubtitleColor", "performClick", "()Z", "enabled", "setTouchEnabled", "(Z)V", "Z", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "getAddonView", "()Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/selection/radiobutton/data/RadioTitleSubtitleWrapperPreset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "isSubtitleVisible", "setSubtitleVisible", "isChecked", "setChecked", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RadioTitleSubtitleCellView extends MainAddonWrapperV3<TitleSubtitleCellView, RadioButtonView> implements TitleSubtitleCellApi, RadioTitleSubtitleCellApi, AtomView {

    @NotNull
    private final RadioButtonView addonView;
    private boolean isChecked;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private TitleSubtitleCellView mainView;

    @NotNull
    private RadioTitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ RadioTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, RadioTitleSubtitleWrapperPreset radioTitleSubtitleWrapperPreset, boolean z11, RadioButtonView radioButtonView, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? RadioTitleSubtitleWrapperPresets.INSTANCE.getNoShape500TopStart500Default500() : radioTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? new RadioButtonView(context, null, 0, 6, null) : radioButtonView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTouchEnabled$lambda$0(Function2 function2, View view, MotionEvent motionEvent) {
        return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTouchEnabled$lambda$1(Function2 function2, View view, MotionEvent motionEvent) {
        return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    @Override // android.view.View
    public boolean performClick() {
        getAddonView().performClick();
        return super.performClick();
    }

    @Override // ru.ozon.uni.android.cell.selection.radiobutton.RadioTitleSubtitleCellApi
    public void setChecked(boolean z11) {
        this.isChecked = z11;
        getAddonView().setChecked(this.isChecked);
    }

    public final void setPreset(@NotNull RadioTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getRadioAddonWrapperPreset().getMainAddonSettings());
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

    public void setSubtitleVisible(boolean z11) {
        this.isSubtitleVisible = z11;
        getMainView().setSubtitleVisible(this.isSubtitleVisible);
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

    public final void setTouchEnabled(boolean enabled) {
        final Function2 onTouchListener = enabled ? SelectionTouchListenerKt.getOnTouchListener(this) : RadioTitleSubtitleCellView$setTouchEnabled$listener$1.INSTANCE;
        getAddonView().setEnabled(enabled);
        getAddonView().setOnTouchListener(new View.OnTouchListener() { // from class: tk0.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean touchEnabled$lambda$0;
                touchEnabled$lambda$0 = RadioTitleSubtitleCellView.setTouchEnabled$lambda$0(Function2.this, view, motionEvent);
                return touchEnabled$lambda$0;
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: tk0.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean touchEnabled$lambda$1;
                touchEnabled$lambda$1 = RadioTitleSubtitleCellView.setTouchEnabled$lambda$1(Function2.this, view, motionEvent);
                return touchEnabled$lambda$1;
            }
        });
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public RadioButtonView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull RadioTitleSubtitleWrapperPreset defPreset, boolean z11, @NotNull RadioButtonView addonView) {
        super(context, attributeSet, i11, i12, defPreset.getRadioAddonWrapperPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        Intrinsics.checkNotNullParameter(addonView, "addonView");
        this.isRootWrapper = z11;
        this.addonView = addonView;
        this.preset = defPreset;
        this.mainView = new TitleSubtitleCellView(context, null, 0, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 14, null);
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.isSubtitleVisible = getMainView().getIsSubtitleVisible();
        this.isChecked = getAddonView().isChecked();
        setViews();
        setTouchEnabled(true);
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadioTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.RadioTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.RadioTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.RadioTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.RadioTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.RadioTitleSubtitleCellView_addonTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.RadioTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
