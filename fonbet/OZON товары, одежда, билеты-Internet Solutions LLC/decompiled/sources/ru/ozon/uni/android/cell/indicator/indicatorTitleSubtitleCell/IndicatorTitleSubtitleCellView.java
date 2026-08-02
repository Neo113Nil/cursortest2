package ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.cell.indicator.data.IndicatorViewExtKt;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.data.IndicatorTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.data.IndicatorTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u0010\u0010\"R*\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0017\u00106\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010;\u001a\u00020:2\u0006\u0010#\u001a\u00020:8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010DR.\u0010F\u001a\u0004\u0018\u00010E2\b\u0010#\u001a\u0004\u0018\u00010E8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010L\u001a\u0004\u0018\u00010E2\b\u0010#\u001a\u0004\u0018\u00010E8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR.\u0010O\u001a\u0004\u0018\u00010:2\b\u0010#\u001a\u0004\u0018\u00010:8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010<\u001a\u0004\bP\u0010>\"\u0004\bQ\u0010@R*\u0010R\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u00107\u001a\u0004\bS\u00109\"\u0004\bT\u0010DR*\u0010U\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010!\u001a\u0004\bU\u0010\"\"\u0004\bV\u0010WR*\u0010X\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010!\u001a\u0004\bX\u0010\"\"\u0004\bY\u0010W¨\u0006Z"}, d2 = {"Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/IndicatorTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;Z)V", "color", "", "alpha", "", "setTitleColor", "(IF)V", "setSubtitleColor", "indicatorPreset", "setIndicatorStyle", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "setIndicatorAlpha", "(F)V", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "addonView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "getAddonView", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "setAddonView", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;)V", "defaultIconColor", "I", "getDefaultIconColor", "()I", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "getTitleNumberOfLines", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "isSubtitleVisible", "setSubtitleVisible", "(Z)V", "isIndicatorVisible", "setIndicatorVisible", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorTitleSubtitleCellView extends MainAddonWrapperV3<TitleSubtitleCellView, IndicatorView> implements TitleSubtitleCellApi, AtomView {

    @NotNull
    private IndicatorView addonView;
    private final int defaultIconColor;
    private boolean isIndicatorVisible;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private TitleSubtitleCellView mainView;

    @NotNull
    private IndicatorTitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Axis.values().length];
            try {
                iArr[Axis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Axis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ IndicatorTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, IndicatorTitleSubtitleWrapperPreset indicatorTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? IndicatorTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500Default500() : indicatorTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    private final void setIndicatorAlpha(float alpha) {
        getAddonView().setAlpha(alpha);
    }

    public final int getDefaultIconColor() {
        return this.defaultIconColor;
    }

    @NotNull
    public final IndicatorTitleSubtitleWrapperPreset getPreset() {
        return this.preset;
    }

    public int getSubtitleNumberOfLines() {
        return this.subtitleNumberOfLines;
    }

    public CharSequence getSubtitleText() {
        return this.subtitleText;
    }

    public int getTitleNumberOfLines() {
        return this.titleNumberOfLines;
    }

    @NotNull
    public CharSequence getTitleText() {
        return this.titleText;
    }

    /* renamed from: isIndicatorVisible, reason: from getter */
    public boolean getIsIndicatorVisible() {
        return this.isIndicatorVisible;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    /* renamed from: isSubtitleVisible, reason: from getter */
    public boolean getIsSubtitleVisible() {
        return this.isSubtitleVisible;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    public void setAddonVisibility$uni_release() {
        Flow flowByViewId;
        super.setAddonVisibility$uni_release();
        Flow flowByViewId2 = getFlowByViewId(getAddonView().getId());
        if (flowByViewId2 == null || (flowByViewId = getFlowByViewId(flowByViewId2.getId())) == null) {
            return;
        }
        Axis axis = getMainAddonSettings().getAxis();
        if (getIsIndicatorVisible()) {
            ViewExtKt.show(getAddonView());
            ViewExtKt.show(flowByViewId2);
            int i11 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
            if (i11 == 1) {
                flowByViewId.setHorizontalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
                return;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                flowByViewId.setVerticalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
                return;
            }
        }
        ViewExtKt.gone(getAddonView());
        ViewExtKt.gone(flowByViewId2);
        int i12 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
        if (i12 == 1) {
            flowByViewId.setHorizontalGap(0);
        } else {
            if (i12 != 2) {
                throw new o();
            }
            flowByViewId.setVerticalGap(0);
        }
    }

    public final void setIndicatorStyle(int indicatorPreset, float alpha) {
        if (indicatorPreset != -1) {
            IndicatorHolderKt.applyStyle(getAddonView(), indicatorPreset);
        }
        setIndicatorAlpha(alpha);
    }

    public void setIndicatorVisible(boolean z11) {
        this.isIndicatorVisible = z11;
        changeAddonVisibilityIfNeeded();
    }

    public final void setPreset(@NotNull IndicatorTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        IndicatorViewExtKt.withIndicatorViewPreset(getAddonView(), this.preset.getIndicatorAddonWrapperPreset());
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getIndicatorAddonWrapperPreset().getMainAddonSettings());
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setSubtitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public void setSubtitleNumberOfLines(int i11) {
        this.subtitleNumberOfLines = i11;
        getMainView().setSubtitleNumberOfLines(this.subtitleNumberOfLines);
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

    public void setTitleNumberOfLines(int i11) {
        this.titleNumberOfLines = i11;
        getMainView().setTitleNumberOfLines(this.titleNumberOfLines);
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

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public IndicatorView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull IndicatorTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getIndicatorAddonWrapperPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        this.mainView = new TitleSubtitleCellView(context, null, 0, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 14, null);
        this.addonView = IndicatorViewExtKt.withIndicatorViewPreset(new IndicatorView(context, null, 0, 0, 14, null), this.preset.getIndicatorAddonWrapperPreset());
        this.defaultIconColor = getMainView().getDefaultIconColor();
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.isSubtitleVisible = getMainView().getIsSubtitleVisible();
        this.isIndicatorVisible = true;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IndicatorTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.IndicatorTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.IndicatorTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IndicatorTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.IndicatorTitleSubtitleCellView_mainTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.IndicatorTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IndicatorTitleSubtitleCellView_indicatorPreset, 0);
            if (resourceId != 0) {
                IndicatorHolderKt.applyStyle(getAddonView(), resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
