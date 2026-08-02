package ru.ozon.uni.android.cell.icon;

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
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.icon.IconViewExtKt;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b\u0010\u0010!R*\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00105\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R.\u00109\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010@\u001a\u0004\u0018\u00010?2\b\u0010\"\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010F\u001a\u0004\u0018\u00010\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u00138\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010L\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R.\u0010O\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<\"\u0004\bQ\u0010>R*\u0010S\u001a\u00020R2\u0006\u0010\"\u001a\u00020R8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Y\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u00106\u001a\u0004\bZ\u00108\"\u0004\b[\u0010\\R.\u0010^\u001a\u0004\u0018\u00010]2\b\u0010\"\u001a\u0004\u0018\u00010]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR.\u0010d\u001a\u0004\u0018\u00010]2\b\u0010\"\u001a\u0004\u0018\u00010]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010_\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR.\u0010g\u001a\u0004\u0018\u00010R2\b\u0010\"\u001a\u0004\u0018\u00010R8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010T\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR*\u0010j\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u00106\u001a\u0004\bk\u00108\"\u0004\bl\u0010\\R*\u0010m\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010 \u001a\u0004\bm\u0010!\"\u0004\bn\u0010oR*\u0010p\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010 \u001a\u0004\bp\u0010!\"\u0004\bq\u0010oR(\u0010t\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010<\"\u0004\bs\u0010>¨\u0006u"}, d2 = {"Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellApi;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;Z)V", "Lru/ozon/uni/android/uikitsdk/Color;", "color", "", "alpha", "", "setIconColor", "(Lru/ozon/uni/android/uikitsdk/Color;F)V", "setTitleColor", "(IF)V", "setSubtitleColor", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "addonView", "Lru/ozon/uni/android/atom/icon/IconView;", "getAddonView", "()Lru/ozon/uni/android/atom/icon/IconView;", "setAddonView", "(Lru/ozon/uni/android/atom/icon/IconView;)V", "defaultIconColor", "I", "getDefaultIconColor", "()I", "iconRes", "Ljava/lang/Integer;", "getIconRes", "()Ljava/lang/Integer;", "setIconRes", "(Ljava/lang/Integer;)V", "", "iconText", "Ljava/lang/String;", "getIconText", "()Ljava/lang/String;", "setIconText", "(Ljava/lang/String;)V", "iconBackgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getIconBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setIconBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "iconBorderColor", "getIconBorderColor", "setIconBorderColor", "iconLabelColor", "getIconLabelColor", "setIconLabelColor", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "getTitleNumberOfLines", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "isSubtitleVisible", "setSubtitleVisible", "(Z)V", "isIconVisible", "setIconVisible", "getIconGraphicColor", "setIconGraphicColor", "iconGraphicColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconTitleSubtitleCellView extends MainAddonWrapperV3<TitleSubtitleCellView, IconView> implements IconTitleSubtitleCellApi, AtomView {

    @NotNull
    private IconView addonView;
    private final int defaultIconColor;
    private Color iconBackgroundColor;
    private Integer iconBorderColor;
    private Integer iconLabelColor;
    private Integer iconRes;
    private String iconText;
    private boolean isIconVisible;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private TitleSubtitleCellView mainView;

    @NotNull
    private IconTitleSubtitleWrapperPreset preset;
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
    public IconTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getDefaultIconColor() {
        return this.defaultIconColor;
    }

    public Color getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public Integer getIconBorderColor() {
        return this.iconBorderColor;
    }

    public Integer getIconGraphicColor() {
        return getAddonView().getGraphicColor();
    }

    public Integer getIconLabelColor() {
        return this.iconLabelColor;
    }

    public Integer getIconRes() {
        return this.iconRes;
    }

    public String getIconText() {
        return this.iconText;
    }

    @NotNull
    public final IconTitleSubtitleWrapperPreset getPreset() {
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

    /* renamed from: isIconVisible, reason: from getter */
    public boolean getIsIconVisible() {
        return this.isIconVisible;
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
        if (getIsIconVisible()) {
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

    public void setIconBackgroundColor(Color color) {
        this.iconBackgroundColor = color;
        getAddonView().setBackColor(this.iconBackgroundColor);
    }

    @Override // ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi
    public void setIconColor(@NotNull Color color, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        setIconBackgroundColor(color);
        getAddonView().setAlpha(alpha);
    }

    public void setIconRes(Integer num) {
        this.iconRes = num;
        getAddonView().setGraphic(this.iconRes);
        changeAddonVisibilityIfNeeded();
    }

    public void setIconVisible(boolean z11) {
        this.isIconVisible = z11;
        changeAddonVisibilityIfNeeded();
    }

    public final void setPreset(@NotNull IconTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setMinWrapperHeight(value.getIconAddonWrapperPreset().getMainAddonSettings().getMinWrapperHeight());
        IconViewExtKt.withIconViewPreset(getAddonView(), this.preset.getIconAddonWrapperPreset());
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getIconAddonWrapperPreset().getMainAddonSettings());
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

    public void setSubtitleVisible(boolean z11) {
        this.isSubtitleVisible = z11;
        getMainView().setSubtitleVisible(this.isSubtitleVisible);
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

    public /* synthetic */ IconTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, IconTitleSubtitleWrapperPreset iconTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? IconTitleSubtitleWrapperPresets.INSTANCE.getNoShape500TopStart500Default500() : iconTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public IconView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull IconTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getIconAddonWrapperPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        int i13 = 0;
        this.mainView = new TitleSubtitleCellView(context, attributeSet, i13, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 12, null);
        this.addonView = IconViewExtKt.withIconViewPreset(new IconView(context, null, i13, 6, null), this.preset.getIconAddonWrapperPreset());
        this.defaultIconColor = getMainView().getDefaultIconColor();
        this.iconRes = getAddonView().getGraphic();
        this.iconBackgroundColor = getAddonView().getBackColor();
        this.iconBorderColor = getAddonView().getBorderColor();
        this.iconLabelColor = getAddonView().getLabelColor();
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.isSubtitleVisible = getMainView().getIsSubtitleVisible();
        this.isIconVisible = true;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.IconTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.IconTitleSubtitleCellView_addonText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconTitleSubtitleCellView_graphic, -1);
            if (resourceId != -1) {
                setIconRes(Integer.valueOf(resourceId));
            }
            int color = obtainStyledAttributes.getColor(R$styleable.IconTitleSubtitleCellView_addonTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.IconTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
