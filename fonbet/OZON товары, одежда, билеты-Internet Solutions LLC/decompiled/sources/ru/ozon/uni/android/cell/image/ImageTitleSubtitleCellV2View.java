package ru.ozon.uni.android.cell.image;

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
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.cell.image.data.ImageFixedExtKt;
import ru.ozon.uni.android.cell.image.data.ImageTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.image.data.ImageTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR*\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R*\u0010.\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00104\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R.\u00108\u001a\u0004\u0018\u0001072\b\u0010\u001f\u001a\u0004\u0018\u0001078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010>\u001a\u0004\u0018\u0001072\b\u0010\u001f\u001a\u0004\u0018\u0001078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R*\u0010A\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001d\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010DR*\u0010E\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001d\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010DR*\u0010I\u001a\u00020H2\u0006\u0010\u001f\u001a\u00020H8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR.\u0010O\u001a\u0004\u0018\u00010H2\b\u0010\u001f\u001a\u0004\u0018\u00010H8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010J\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR*\u0010R\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010\u001d\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010DR*\u0010T\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010\u001d\u001a\u0004\bT\u0010\u001e\"\u0004\bU\u0010D¨\u0006V"}, d2 = {"Lru/ozon/uni/android/cell/image/ImageTitleSubtitleCellV2View;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/atom/image/Image;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/image/data/ImageTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/image/data/ImageTitleSubtitleWrapperPreset;Z)V", "", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "color", "", "alpha", "setTitleColor", "(IF)V", "setSubtitleColor", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/image/data/ImageTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/image/data/ImageTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/image/data/ImageTitleSubtitleWrapperPreset;)V", "addonView", "Lru/ozon/uni/android/atom/image/Image;", "getAddonView", "()Lru/ozon/uni/android/atom/image/Image;", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "titleTagSupported", "getTitleTagSupported", "setTitleTagSupported", "(Z)V", "subtitleTagSupported", "getSubtitleTagSupported", "setSubtitleTagSupported", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "subtitleText", "getSubtitleText", "setSubtitleText", "isSubtitleVisible", "setSubtitleVisible", "isImageVisible", "setImageVisible", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageTitleSubtitleCellV2View extends MainAddonWrapperV3<TitleSubtitleCellView, Image> implements TitleSubtitleCellApi, AtomView {

    @NotNull
    private final Image addonView;
    private boolean isImageVisible;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private final TitleSubtitleCellView mainView;

    @NotNull
    private ImageTitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private boolean subtitleTagSupported;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;
    private boolean titleTagSupported;

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
    public ImageTitleSubtitleCellV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ImageTitleSubtitleWrapperPreset getPreset() {
        return this.preset;
    }

    /* renamed from: isImageVisible, reason: from getter */
    public boolean getIsImageVisible() {
        return this.isImageVisible;
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
        if (getIsImageVisible()) {
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

    public void setImageVisible(boolean z11) {
        this.isImageVisible = z11;
        changeAddonVisibilityIfNeeded();
    }

    public final void setPreset(@NotNull ImageTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        ImageFixedExtKt.withImageFixedPreset(getAddonView(), this.preset.getImageAddonPreset());
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getImageAddonPreset().getMainAddonSettings());
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

    public /* synthetic */ ImageTitleSubtitleCellV2View(Context context, AttributeSet attributeSet, int i11, int i12, ImageTitleSubtitleWrapperPreset imageTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? ImageTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500ContentControl500() : imageTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public Image getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTitleSubtitleCellV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull ImageTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getImageAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        this.addonView = ImageFixedExtKt.withImageFixedPreset(new Image(context, null, 0, 6, null), this.preset.getImageAddonPreset());
        this.mainView = new TitleSubtitleCellView(context, null, 0, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 14, null);
        this.titleNumberOfLines = getMainView().getTitleNumberOfLines();
        this.subtitleNumberOfLines = getMainView().getSubtitleNumberOfLines();
        this.titleTruncatingMode = getMainView().getTitleTruncatingMode();
        this.subtitleTruncatingMode = getMainView().getSubtitleTruncatingMode();
        this.titleTagSupported = getMainView().getTitleTagSupported();
        this.subtitleTagSupported = getMainView().getSubtitleTagSupported();
        this.titleText = getMainView().getTitleText();
        this.subtitleText = getMainView().getSubtitleText();
        this.isSubtitleVisible = getMainView().getIsSubtitleVisible();
        this.isImageVisible = true;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ImageTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.ImageTitleSubtitleCellView_mainText);
            setTitleText(string == null ? "" : string);
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.ImageTitleSubtitleCellView_addonText));
            CommonAtomLabelDTO.TruncatingMode[] truncatingModeArr = (CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]);
            int i13 = R$styleable.ImageTitleSubtitleCellView_mainTruncatingMode;
            CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
            setTitleTruncatingMode(truncatingModeArr[obtainStyledAttributes.getInt(i13, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.ImageTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.ImageTitleSubtitleCellView_mainTextColor, -1);
            if (color != -1) {
                TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.ImageTitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
