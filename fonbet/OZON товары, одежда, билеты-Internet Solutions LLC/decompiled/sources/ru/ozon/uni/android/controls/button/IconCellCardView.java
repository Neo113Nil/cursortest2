package ru.ozon.uni.android.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconCellCardDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010(\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00101\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\"\u00104\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\"\u00107\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\"\u0010:\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R\"\u0010=\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\"\u0010F\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010>\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR\u0017\u0010I\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010)\u001a\u0004\bJ\u0010+R.\u0010K\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR.\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\u001d\u001a\u0004\u0018\u00010Q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR.\u0010X\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010>\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR.\u0010[\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010N\"\u0004\b]\u0010PR.\u0010^\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010L\u001a\u0004\b_\u0010N\"\u0004\b`\u0010PR.\u0010a\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010L\u001a\u0004\bb\u0010N\"\u0004\bc\u0010PR*\u0010e\u001a\u00020d2\u0006\u0010\u001d\u001a\u00020d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010k\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010)\u001a\u0004\bl\u0010+\"\u0004\bm\u0010-R.\u0010o\u001a\u0004\u0018\u00010n2\b\u0010\u001d\u001a\u0004\u0018\u00010n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR.\u0010u\u001a\u0004\u0018\u00010n2\b\u0010\u001d\u001a\u0004\u0018\u00010n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bu\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR.\u0010x\u001a\u0004\u0018\u00010d2\b\u0010\u001d\u001a\u0004\u0018\u00010d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010f\u001a\u0004\by\u0010h\"\u0004\bz\u0010jR*\u0010{\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010)\u001a\u0004\b|\u0010+\"\u0004\b}\u0010-R.\u0010\u007f\u001a\u00020~2\u0006\u0010\u001d\u001a\u00020~8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u007f\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R1\u0010\u0084\u0001\u001a\u00020~2\u0006\u0010\u001d\u001a\u00020~8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0080\u0001\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001\"\u0006\b\u0085\u0001\u0010\u0083\u0001¨\u0006\u0086\u0001"}, d2 = {"Lru/ozon/uni/android/controls/button/IconCellCardView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/uni/android/uikitsdk/Color;", "color", "", "alpha", "", "setIconColor", "(Lru/ozon/uni/android/uikitsdk/Color;F)V", "setTitleColor", "(IF)V", "setSubtitleColor", "onButtonEnabled", "()V", "onButtonDisabled", "onButtonPressed", "Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO$Preset;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO$Preset;)V", "mainView", "Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellView;", "titleColorDefault", "I", "getTitleColorDefault$uni_release", "()I", "setTitleColorDefault$uni_release", "(I)V", "titleColorActive", "getTitleColorActive$uni_release", "setTitleColorActive$uni_release", "titleColorDisabled", "getTitleColorDisabled$uni_release", "setTitleColorDisabled$uni_release", "subTitleColorDefault", "getSubTitleColorDefault$uni_release", "setSubTitleColorDefault$uni_release", "subTitleColorActive", "getSubTitleColorActive$uni_release", "setSubTitleColorActive$uni_release", "subTitleColorDisabled", "getSubTitleColorDisabled$uni_release", "setSubTitleColorDisabled$uni_release", "iconBackgroundColorDefault", "Lru/ozon/uni/android/uikitsdk/Color;", "getIconBackgroundColorDefault$uni_release", "()Lru/ozon/uni/android/uikitsdk/Color;", "setIconBackgroundColorDefault$uni_release", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "iconBackgroundColorActive", "getIconBackgroundColorActive$uni_release", "setIconBackgroundColorActive$uni_release", "iconBackgroundColorDisabled", "getIconBackgroundColorDisabled$uni_release", "setIconBackgroundColorDisabled$uni_release", "defaultIconColor", "getDefaultIconColor", "iconRes", "Ljava/lang/Integer;", "getIconRes", "()Ljava/lang/Integer;", "setIconRes", "(Ljava/lang/Integer;)V", "", "iconText", "Ljava/lang/String;", "getIconText", "()Ljava/lang/String;", "setIconText", "(Ljava/lang/String;)V", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "iconBorderColor", "getIconBorderColor", "setIconBorderColor", "iconLabelColor", "getIconLabelColor", "setIconLabelColor", "iconGraphicColor", "getIconGraphicColor", "setIconGraphicColor", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "getTitleNumberOfLines", "setTitleNumberOfLines", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "", "isSubtitleVisible", "Z", "()Z", "setSubtitleVisible", "(Z)V", "isIconVisible", "setIconVisible", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconCellCardView extends ButtonWrapper<IconTitleSubtitleCellView> implements AtomView, IconTitleSubtitleCellApi {
    private final int defaultIconColor;
    private Color iconBackgroundColor;

    @NotNull
    private Color iconBackgroundColorActive;

    @NotNull
    private Color iconBackgroundColorDefault;

    @NotNull
    private Color iconBackgroundColorDisabled;
    private Integer iconBorderColor;
    private Integer iconGraphicColor;
    private Integer iconLabelColor;
    private Integer iconRes;
    private String iconText;
    private boolean isIconVisible;
    private boolean isSubtitleVisible;

    @NotNull
    private final IconTitleSubtitleCellView mainView;

    @NotNull
    private IconCellCardDTO.Preset preset;
    private int subTitleColorActive;
    private int subTitleColorDefault;
    private int subTitleColorDisabled;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleColorActive;
    private int titleColorDefault;
    private int titleColorDisabled;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ IconCellCardView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.IconCellCard_NeutralSecondary : i12);
    }

    @NotNull
    /* renamed from: getIconBackgroundColorDefault$uni_release, reason: from getter */
    public final Color getIconBackgroundColorDefault() {
        return this.iconBackgroundColorDefault;
    }

    /* renamed from: getTitleColorDefault$uni_release, reason: from getter */
    public final int getTitleColorDefault() {
        return this.titleColorDefault;
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonDisabled() {
        setTitleColor(this.titleColorDisabled, 0.6f);
        setSubtitleColor(this.subTitleColorDisabled, 0.6f);
        setIconColor(this.iconBackgroundColorDisabled, 0.6f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(this, this.titleColorDefault, 0.0f, 2, null);
        TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(this, this.subTitleColorDefault, 0.0f, 2, null);
        IconTitleSubtitleCellApi.DefaultImpls.setIconColor$default(this, this.iconBackgroundColorDefault, 0.0f, 2, null);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        setTitleColor(this.titleColorActive, 0.4f);
        setSubtitleColor(this.subTitleColorActive, 0.4f);
        setIconColor(this.iconBackgroundColorActive, 0.4f);
    }

    public final void setIconBackgroundColorActive$uni_release(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.iconBackgroundColorActive = color;
    }

    public final void setIconBackgroundColorDefault$uni_release(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.iconBackgroundColorDefault = color;
    }

    public final void setIconBackgroundColorDisabled$uni_release(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.iconBackgroundColorDisabled = color;
    }

    @Override // ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellApi
    public void setIconColor(@NotNull Color color, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        getMainView().setIconColor(color, alpha);
    }

    public void setIconRes(Integer num) {
        this.iconRes = num;
        getMainView().setIconRes(num);
    }

    public final void setPreset(@NotNull IconCellCardDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setSettings(value.getSettings());
        getMainView().setPreset(this.preset.getMainPreset());
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

    public final void setTitleColorActive$uni_release(int i11) {
        this.titleColorActive = i11;
    }

    public final void setTitleColorDefault$uni_release(int i11) {
        this.titleColorDefault = i11;
    }

    public final void setTitleColorDisabled$uni_release(int i11) {
        this.titleColorDisabled = i11;
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

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    @NotNull
    public IconTitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconCellCardView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IconCellCardDTO.Preset preset = IconCellCardDTO.Preset.SIZE_400;
        this.preset = preset;
        this.mainView = new IconTitleSubtitleCellView(context, attributeSet, 0, 0, null, true, 28, null);
        this.defaultIconColor = getMainView().getDefaultIconColor();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconCellCardView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((IconCellCardDTO.Preset[]) IconCellCardDTO.Preset.getEntries().toArray(new IconCellCardDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.IconCellCardView_iconCellCardSize, preset.ordinal())]);
        int color = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColor, getDefaultBackgroundColor());
        this.titleColorDefault = color;
        this.titleColorActive = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColorActive, color);
        this.titleColorDisabled = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColorDisabled, getDefaultBackgroundColor());
        this.subTitleColorDefault = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColor, getDefaultBackgroundColor());
        this.subTitleColorActive = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColorActive, getDefaultBackgroundColor());
        this.subTitleColorDisabled = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColorDisabled, getDefaultBackgroundColor());
        this.iconBackgroundColorDefault = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.IconCellCardView_iconBackgroundGradient, R$styleable.IconCellCardView_iconBackgroundColor, getDefaultBackgroundColor());
        this.iconBackgroundColorActive = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.IconCellCardView_iconBackgroundGradient, R$styleable.IconCellCardView_iconBackgroundColorActive, getDefaultBackgroundColor());
        this.iconBackgroundColorDisabled = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.IconCellCardView_iconBackgroundGradient, R$styleable.IconCellCardView_iconBackgroundColorDisabled, getDefaultBackgroundColor());
        getMainView().setTitleNumberOfLines(1);
        String string = obtainStyledAttributes.getString(R$styleable.IconCellCardView_mainText);
        setTitleText(string == null ? "" : string);
        getMainView().setSubtitleNumberOfLines(1);
        setSubtitleText(obtainStyledAttributes.getString(R$styleable.IconCellCardView_addonText));
        setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconCellCardView_mainTruncatingMode, truncatingMode.ordinal())]);
        setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.IconCellCardView_addonTruncatingMode, truncatingMode.ordinal())]);
        int color2 = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColor, -1);
        if (color2 != -1) {
            TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color2, 0.0f, 2, null);
        }
        int color3 = obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColor, -1);
        if (color3 != -1) {
            TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color3, 0.0f, 2, null);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconCellCardView_graphic, -1);
        if (resourceId != -1) {
            setIconRes(Integer.valueOf(resourceId));
        }
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
    }
}
