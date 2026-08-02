package ru.ozon.uni.android.cell.selection.toggle;

import NC.a;
import NC.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.selection.SelectionTouchListenerKt;
import ru.ozon.uni.android.cell.selection.toggle.data.ToggleTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.selection.toggle.data.ToggleTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00052\u00020\u0006BO\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J,\u0010#\u001a\u00020\u00182\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b\u0011\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(R*\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00107\u001a\u0002062\u0006\u0010)\u001a\u0002068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010=\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR.\u0010D\u001a\u0004\u0018\u00010C2\b\u0010)\u001a\u0004\u0018\u00010C8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR.\u0010J\u001a\u0004\u0018\u00010C2\b\u0010)\u001a\u0004\u0018\u00010C8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR.\u0010M\u001a\u0004\u0018\u0001062\b\u0010)\u001a\u0004\u0018\u0001068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u00108\u001a\u0004\bN\u0010:\"\u0004\bO\u0010<R*\u0010P\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR*\u0010S\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010%\u001a\u0004\bS\u0010\u001d\"\u0004\bT\u0010 R*\u0010U\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010%\u001a\u0004\bU\u0010\u001d\"\u0004\bV\u0010 ¨\u0006W"}, d2 = {"Lru/ozon/uni/android/cell/selection/toggle/ToggleTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellApi;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "addonView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;ZLru/ozon/uni/android/atom/selectionControls/ToggleView;)V", "color", "", "alpha", "", "setTitleColor", "(IF)V", "setSubtitleColor", "performClick", "()Z", "enabled", "setTouchEnabled", "(Z)V", "Lkotlin/Function2;", "changeStateListener", "setOnStateChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Z", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "getAddonView", "()Lru/ozon/uni/android/atom/selectionControls/ToggleView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "isSubtitleVisible", "setSubtitleVisible", "isChecked", "setChecked", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleTitleSubtitleCellView extends MainAddonWrapperV3<TitleSubtitleCellView, ToggleView> implements TitleSubtitleCellApi, AtomView {

    @NotNull
    private final ToggleView addonView;
    private boolean isChecked;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private TitleSubtitleCellView mainView;

    @NotNull
    private ToggleTitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToggleTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, null, 124, null);
        Intrinsics.checkNotNullParameter(context, "context");
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

    public void setOnStateChangeListener(Function2<? super ToggleView, ? super Boolean, Unit> changeStateListener) {
        this.addonView.setOnStateChangeListener(changeStateListener);
    }

    public final void setPreset(@NotNull ToggleTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getToggleAddonWrapperPreset().getSettings());
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

    public final void setTouchEnabled(boolean enabled) {
        Object onTouchListener = enabled ? SelectionTouchListenerKt.getOnTouchListener(this) : ToggleTitleSubtitleCellView$setTouchEnabled$listener$1.INSTANCE;
        getAddonView().setEnabled(enabled);
        getAddonView().setOnTouchListener(new a(onTouchListener, 2));
        setOnTouchListener(new b(onTouchListener, 3));
    }

    public /* synthetic */ ToggleTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, ToggleTitleSubtitleWrapperPreset toggleTitleSubtitleWrapperPreset, boolean z11, ToggleView toggleView, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? ToggleTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500default500() : toggleTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? new ToggleView(context, null, 0, 6, null) : toggleView);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public ToggleView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull ToggleTitleSubtitleWrapperPreset defPreset, boolean z11, @NotNull ToggleView addonView) {
        super(context, attributeSet, i11, i12, defPreset.getToggleAddonWrapperPreset().getSettings(), z11);
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToggleTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.ToggleTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.ToggleTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ToggleTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ToggleTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.ToggleTitleSubtitleCellView_addonTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.ToggleTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
