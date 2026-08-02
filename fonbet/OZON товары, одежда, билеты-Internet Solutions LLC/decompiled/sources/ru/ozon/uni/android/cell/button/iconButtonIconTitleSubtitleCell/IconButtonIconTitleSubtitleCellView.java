package ru.ozon.uni.android.cell.button.iconButtonIconTitleSubtitleCell;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.button.iconButtonIconTitleSubtitleCell.data.IconButtonIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.button.iconButtonIconTitleSubtitleCell.data.IconButtonIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b\u0010\u0010$R*\u0010\u001e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\"R\u001a\u0010*\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00103\u001a\u0002022\u0006\u0010%\u001a\u0002028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u00109\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010@\u001a\u0004\u0018\u00010?2\b\u0010%\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010F\u001a\u0004\u0018\u00010?2\b\u0010%\u001a\u0004\u0018\u00010?8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER.\u0010I\u001a\u0004\u0018\u0001022\b\u0010%\u001a\u0004\u0018\u0001028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u00104\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R*\u0010L\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R.\u0010O\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010V\u001a\u0004\u0018\u00010U2\b\u0010%\u001a\u0004\u0018\u00010U8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R.\u0010\\\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR.\u0010b\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010P\u001a\u0004\bc\u0010R\"\u0004\bd\u0010TR.\u0010e\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010P\u001a\u0004\bf\u0010R\"\u0004\bg\u0010TR.\u0010h\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010P\u001a\u0004\bi\u0010R\"\u0004\bj\u0010T¨\u0006k"}, d2 = {"Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/IconButtonIconTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "Lru/ozon/uni/android/controls/button/IconButtonView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/data/IconButtonIconTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/data/IconButtonIconTitleSubtitleWrapperPreset;Z)V", "color", "", "alpha", "", "setTitleColor", "(IF)V", "setSubtitleColor", "Lru/ozon/uni/android/uikitsdk/Color;", "setIconColor", "(Lru/ozon/uni/android/uikitsdk/Color;F)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO$Preset;", "preset", "withIconButtonPreset", "(Lru/ozon/uni/android/controls/button/IconButtonView;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO$Preset;)Lru/ozon/uni/android/controls/button/IconButtonView;", "setupMinHeight", "(Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/data/IconButtonIconTitleSubtitleWrapperPreset;)V", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/data/IconButtonIconTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/button/iconButtonIconTitleSubtitleCell/data/IconButtonIconTitleSubtitleWrapperPreset;", "setPreset", "mainView", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "addonView", "Lru/ozon/uni/android/controls/button/IconButtonView;", "getAddonView", "()Lru/ozon/uni/android/controls/button/IconButtonView;", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "iconRes", "Ljava/lang/Integer;", "getIconRes", "()Ljava/lang/Integer;", "setIconRes", "(Ljava/lang/Integer;)V", "", "iconText", "Ljava/lang/String;", "getIconText", "()Ljava/lang/String;", "setIconText", "(Ljava/lang/String;)V", "iconBackgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getIconBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setIconBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "iconBorderColor", "getIconBorderColor", "setIconBorderColor", "iconLabelColor", "getIconLabelColor", "setIconLabelColor", "iconGraphicColor", "getIconGraphicColor", "setIconGraphicColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconButtonIconTitleSubtitleCellView extends MainAddonWrapperV3<IconTitleSubtitleCellView, IconButtonView> implements IconTitleSubtitleCellApi, AtomView {

    @NotNull
    private final IconButtonView addonView;
    private Color iconBackgroundColor;
    private Integer iconBorderColor;
    private Integer iconGraphicColor;
    private Integer iconLabelColor;
    private Integer iconRes;
    private String iconText;
    private final boolean isRootWrapper;

    @NotNull
    private final IconTitleSubtitleCellView mainView;

    @NotNull
    private IconButtonIconTitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ IconButtonIconTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, IconButtonIconTitleSubtitleWrapperPreset iconButtonIconTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? IconButtonIconTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500NoShape500TopStart500Default500() : iconButtonIconTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    private final void setupMinHeight(IconButtonIconTitleSubtitleWrapperPreset preset) {
        setMinHeight(UiExtKt.toPx(preset.getIconTitleSubtitleWrapperPreset().getIconAddonWrapperPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    private final IconButtonView withIconButtonPreset(IconButtonView iconButtonView, IconButtonDTO.Preset preset) {
        iconButtonView.setPreset(preset);
        return iconButtonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    @Override // ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi
    public void setIconColor(@NotNull Color color, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        getMainView().setIconColor(color, alpha);
    }

    public final void setPreset(@NotNull IconButtonIconTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().setPreset(this.preset.getIconTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getButtonAddonPreset().getMainAddonSettings());
        withIconButtonPreset(getAddonView(), this.preset.getButtonAddonPreset().getButtonSize());
        setupMinHeight(this.preset);
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

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public IconButtonView getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public IconTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonIconTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull IconButtonIconTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getButtonAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        this.mainView = new IconTitleSubtitleCellView(context, null, 0, 0, defPreset.getIconTitleSubtitleWrapperPreset(), false, 14, null);
        this.addonView = withIconButtonPreset(new IconButtonView(context, null, 0, 0, null, 30, null), defPreset.getButtonAddonPreset().getButtonSize());
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.iconRes = getMainView().getIconRes();
        this.iconText = getMainView().getIconText();
        this.iconBackgroundColor = getMainView().getIconBackgroundColor();
        this.iconBorderColor = getMainView().getIconBorderColor();
        this.iconLabelColor = getMainView().getIconLabelColor();
        this.iconGraphicColor = getMainView().getIconGraphicColor();
        setViews();
        setupMinHeight(this.preset);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconButtonIconTitleSubtitleCellView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.IconButtonIconTitleSubtitleCellView_mainText);
        setTitleText(string == null ? "" : string);
        setSubtitleText(obtainStyledAttributes.getString(R$styleable.IconButtonIconTitleSubtitleCellView_addonText));
        setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconButtonIconTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconButtonIconTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
        int color = obtainStyledAttributes.getColor(R$styleable.IconButtonIconTitleSubtitleCellView_mainTextColor, -1);
        if (color != -1) {
            TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
        }
        int color2 = obtainStyledAttributes.getColor(R$styleable.IconButtonIconTitleSubtitleCellView_addonTextColor, -1);
        if (color2 != -1) {
            TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
        }
        obtainStyledAttributes.recycle();
    }
}
