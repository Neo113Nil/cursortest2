package ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureCellApi;
import ru.ozon.uni.android.cell.disclosure.data.ImageViewExtKt;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.data.DisclosureIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.data.DisclosureIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.core.R$drawable;

@InterfaceC3999a
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u0010\u0010\"R*\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0017\u00106\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R.\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010A\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R.\u0010E\u001a\u0004\u0018\u00010D2\b\u0010#\u001a\u0004\u0018\u00010D8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR.\u0010K\u001a\u0004\u0018\u00010\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u001b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR.\u0010Q\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010>\"\u0004\bS\u0010@R.\u0010T\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010<\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R.\u0010W\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010<\u001a\u0004\bX\u0010>\"\u0004\bY\u0010@R*\u0010[\u001a\u00020Z2\u0006\u0010#\u001a\u00020Z8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010a\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u00107\u001a\u0004\bb\u00109\"\u0004\bc\u0010dR.\u0010f\u001a\u0004\u0018\u00010e2\b\u0010#\u001a\u0004\u0018\u00010e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR.\u0010l\u001a\u0004\u0018\u00010e2\b\u0010#\u001a\u0004\u0018\u00010e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010g\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR.\u0010o\u001a\u0004\u0018\u00010Z2\b\u0010#\u001a\u0004\u0018\u00010Z8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010\\\u001a\u0004\bp\u0010^\"\u0004\bq\u0010`R*\u0010r\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u00107\u001a\u0004\bs\u00109\"\u0004\bt\u0010dR*\u0010u\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bu\u0010!\u001a\u0004\bu\u0010\"\"\u0004\bv\u0010wR*\u0010x\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010!\u001a\u0004\bx\u0010\"\"\u0004\by\u0010wR*\u0010z\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010!\u001a\u0004\bz\u0010\"\"\u0004\b{\u0010w¨\u0006|"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;Z)V", "color", "", "alpha", "", "setDisclosureIconColor", "(IF)V", "setTitleColor", "setSubtitleColor", "Lru/ozon/uni/android/uikitsdk/Color;", "setIconColor", "(Lru/ozon/uni/android/uikitsdk/Color;F)V", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;)V", "mainView", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;)V", "addonView", "Landroidx/appcompat/widget/AppCompatImageView;", "getAddonView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setAddonView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "defaultIconColor", "I", "getDefaultIconColor", "()I", "defaultIcon", "disclosureIcon", "Ljava/lang/Integer;", "getDisclosureIcon", "()Ljava/lang/Integer;", "setDisclosureIcon", "(Ljava/lang/Integer;)V", "iconRes", "getIconRes", "setIconRes", "", "iconText", "Ljava/lang/String;", "getIconText", "()Ljava/lang/String;", "setIconText", "(Ljava/lang/String;)V", "iconBackgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getIconBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setIconBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "iconBorderColor", "getIconBorderColor", "setIconBorderColor", "iconLabelColor", "getIconLabelColor", "setIconLabelColor", "iconGraphicColor", "getIconGraphicColor", "setIconGraphicColor", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "getTitleNumberOfLines", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "isSubtitleVisible", "setSubtitleVisible", "(Z)V", "isIconVisible", "setIconVisible", "isDisclosureVisible", "setDisclosureVisible", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureIconTitleSubtitleCellView extends MainAddonWrapperV3<IconTitleSubtitleCellView, AppCompatImageView> implements DisclosureCellApi, IconTitleSubtitleCellApi, AtomView {

    @NotNull
    private AppCompatImageView addonView;
    private final int defaultIcon;
    private final int defaultIconColor;
    private Integer disclosureIcon;
    private Color iconBackgroundColor;
    private Integer iconBorderColor;
    private Integer iconGraphicColor;
    private Integer iconLabelColor;
    private Integer iconRes;
    private String iconText;
    private boolean isDisclosureVisible;
    private boolean isIconVisible;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private IconTitleSubtitleCellView mainView;

    @NotNull
    private DisclosureIconTitleSubtitleWrapperPreset preset;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclosureIconTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public Integer getDisclosureIcon() {
        return this.disclosureIcon;
    }

    /* renamed from: isDisclosureVisible, reason: from getter */
    public boolean getIsDisclosureVisible() {
        return this.isDisclosureVisible;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
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
        if (!getIsDisclosureVisible() || getDisclosureIcon() == null) {
            ViewExtKt.gone(getAddonView());
            ViewExtKt.gone(flowByViewId2);
            int i11 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
            if (i11 == 1) {
                flowByViewId.setHorizontalGap(0);
                return;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                flowByViewId.setVerticalGap(0);
                return;
            }
        }
        ViewExtKt.show(getAddonView());
        ViewExtKt.show(flowByViewId2);
        int i12 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
        if (i12 == 1) {
            flowByViewId.setHorizontalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
        } else {
            if (i12 != 2) {
                throw new o();
            }
            flowByViewId.setVerticalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
        }
    }

    public void setDisclosureIcon(Integer num) {
        this.disclosureIcon = num;
        if (num != null) {
            getAddonView().setImageResource(num.intValue());
        }
        changeAddonVisibilityIfNeeded();
    }

    @Override // ru.ozon.uni.android.cell.disclosure.data.DisclosureCellApi
    public void setDisclosureIconColor(int color, float alpha) {
        AppCompatImageView addonView = getAddonView();
        addonView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        addonView.setAlpha(alpha);
    }

    public void setDisclosureVisible(boolean z11) {
        this.isDisclosureVisible = z11;
        changeAddonVisibilityIfNeeded();
    }

    @Override // ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi
    public void setIconColor(@NotNull Color color, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        getMainView().setIconColor(color, alpha);
    }

    public final void setPreset(@NotNull DisclosureIconTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setMinWrapperHeight(value.getIconTitleSubtitleWrapperPreset().getTitleSubtitleWrapperPreset().getAddonPreset().getMainAddonSettings().getMinWrapperHeight());
        ImageViewExtKt.withDisclosureViewPreset(getAddonView(), this.preset.getDisclosureAddonWrapperPreset());
        getMainView().setPreset(this.preset.getIconTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getDisclosureAddonWrapperPreset().getMainAddonSettings());
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

    public /* synthetic */ DisclosureIconTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, DisclosureIconTitleSubtitleWrapperPreset disclosureIconTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? DisclosureIconTitleSubtitleWrapperPresets.INSTANCE.getNoShape500TopStart500Default500() : disclosureIconTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public AppCompatImageView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public IconTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureIconTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull DisclosureIconTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getDisclosureAddonWrapperPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        this.mainView = new IconTitleSubtitleCellView(context, null, 0, 0, defPreset.getIconTitleSubtitleWrapperPreset(), false, 14, null);
        this.addonView = ImageViewExtKt.withDisclosureViewPreset(new AppCompatImageView(context), this.preset.getDisclosureAddonWrapperPreset());
        this.defaultIconColor = getMainView().getDefaultIconColor();
        int i13 = R$drawable.ic_m_chevron_right;
        this.defaultIcon = i13;
        this.disclosureIcon = Integer.valueOf(i13);
        this.iconRes = getMainView().getIconRes();
        this.iconText = getMainView().getIconText();
        this.iconBackgroundColor = getMainView().getIconBackgroundColor();
        this.iconBorderColor = getMainView().getIconBorderColor();
        this.iconLabelColor = getMainView().getIconLabelColor();
        this.iconGraphicColor = getMainView().getIconGraphicColor();
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.isSubtitleVisible = getMainView().getIsSubtitleVisible();
        this.isIconVisible = getMainView().getIsIconVisible();
        this.isDisclosureVisible = true;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DisclosureIconTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.DisclosureIconTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.DisclosureIconTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.DisclosureIconTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.DisclosureIconTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.DisclosureIconTitleSubtitleCellView_mainTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.DisclosureIconTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            int color3 = obtainStyledAttributes.getColor(R$styleable.DisclosureIconTitleSubtitleCellView_disclosureIconColor, -1);
            if (color3 != -1) {
                setDisclosureIconColor(color3, getAlpha());
            }
            obtainStyledAttributes.recycle();
        }
    }
}
