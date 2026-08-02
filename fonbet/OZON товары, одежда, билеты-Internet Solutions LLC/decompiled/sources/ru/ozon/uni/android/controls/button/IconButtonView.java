package ru.ozon.uni.android.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001IB;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0015\u001a\u00020\u00102\b\b\u0001\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00100%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00102\u001a\u0002012\u0006\u0010*\u001a\u0002018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u00108\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010!R\"\u0010C\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010?\u001a\u0004\bD\u0010A\"\u0004\bE\u0010!R\"\u0010F\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010?\u001a\u0004\bG\u0010A\"\u0004\bH\u0010!¨\u0006J"}, d2 = {"Lru/ozon/uni/android/controls/button/IconButtonView;", "Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Landroid/widget/ImageView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "mainView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/widget/ImageView;)V", "size", "", "applySize", "(Landroid/widget/ImageView;I)V", "Landroid/content/res/TypedArray;", "typedArray", "applyStyle", "(Landroid/content/res/TypedArray;)V", "onButtonEnabled", "()V", "onButtonPressed", "onButtonDisabled", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "style", "applyStyle$uni_release", "(I)V", "Landroid/widget/ImageView;", "getMainView", "()Landroid/widget/ImageView;", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializer", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO$Preset;", "preset", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO$Preset;", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO$Preset;", "setPreset", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO$Preset;)V", "icon", "Ljava/lang/Integer;", "getIcon", "()Ljava/lang/Integer;", "setIcon", "(Ljava/lang/Integer;)V", "iconColor", "I", "getIconColor$uni_release", "()I", "setIconColor$uni_release", "iconColorDisabled", "getIconColorDisabled$uni_release", "setIconColorDisabled$uni_release", "iconColorActive", "getIconColorActive$uni_release", "setIconColorActive$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconButtonView extends ButtonWrapper<ImageView> implements AtomView, AtomLocatableView {
    private Integer icon;
    private int iconColor;
    private int iconColorActive;
    private int iconColorDisabled;

    @NotNull
    private final Function1<View, Unit> locatorInitializer;

    @NotNull
    private String locatorTag;

    @NotNull
    private final ImageView mainView;

    @NotNull
    private IconButtonDTO.Preset preset;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/controls/button/IconButtonView$Companion;", "", "<init>", "()V", "ICON_BUTTON_LOCATOR_TAG", "", "ICON_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applySize(ImageView imageView, int i11) {
        if (imageView != null) {
            imageView.setLayoutParams(new FrameLayout.LayoutParams(i11, i11, 17));
        }
    }

    private final void applyStyle(TypedArray typedArray) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColorDefault$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context, R$styleable.IconButtonView_backgroundGradient, R$styleable.IconButtonView_backgroundColor, getDefaultBackgroundColor()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColorActive$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context2, R$styleable.IconButtonView_backgroundGradientActive, R$styleable.IconButtonView_backgroundColorActive, getDefaultBackgroundColor()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackgroundColorDisabled$uni_release(TypedArrayExtKt.getGradientOrColor(typedArray, context3, R$styleable.IconButtonView_backgroundGradientDisabled, R$styleable.IconButtonView_backgroundColorDisabled, getDefaultBackgroundColor()));
        int color = typedArray.getColor(R$styleable.IconButtonView_disclosureIconColor, -1);
        this.iconColor = color;
        this.iconColorDisabled = typedArray.getColor(R$styleable.IconButtonView_disclosureIconColorDisabled, color);
        this.iconColorActive = typedArray.getColor(R$styleable.IconButtonView_disclosureIconColorActive, this.iconColor);
    }

    public final void applyStyle$uni_release(int style) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] IconButtonView = R$styleable.IconButtonView;
        Intrinsics.checkNotNullExpressionValue(IconButtonView, "IconButtonView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, IconButtonView);
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
        ImageView mainView = getMainView();
        mainView.setColorFilter(this.iconColorDisabled, PorterDuff.Mode.SRC_IN);
        mainView.setAlpha(0.6f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonEnabled() {
        ImageView mainView = getMainView();
        mainView.setColorFilter(this.iconColor, PorterDuff.Mode.SRC_IN);
        mainView.setAlpha(1.0f);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    public void onButtonPressed() {
        ImageView mainView = getMainView();
        mainView.setColorFilter(this.iconColorActive, PorterDuff.Mode.SRC_IN);
        mainView.setAlpha(0.4f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(UiExtKt.toPx(this.preset.getContainerSize()), UiExtKt.toPx(this.preset.getContainerSize()));
    }

    public final void setIcon(Integer num) {
        this.icon = num;
        if (num != null) {
            getMainView().setImageResource(num.intValue());
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        this.locatorInitializer.invoke(getMainView());
    }

    public final void setPreset(@NotNull IconButtonDTO.Preset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        setSettings(value.getSettings());
        applySize(getMainView(), UiExtKt.toPx(this.preset.getImageSize()));
    }

    public /* synthetic */ IconButtonView(Context context, AttributeSet attributeSet, int i11, int i12, ImageView imageView, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Button_ActionPrimary_Dynamic : i12, (i13 & 16) != 0 ? new AppCompatImageView(context) : imageView);
    }

    @Override // ru.ozon.uni.android.wrappers.main.button.ButtonWrapper
    @NotNull
    public ImageView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull ImageView mainView) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        this.mainView = mainView;
        this.locatorInitializer = new IconButtonView$locatorInitializer$1(this);
        this.locatorTag = "iconButton";
        IconButtonDTO.Preset preset = IconButtonDTO.Preset.SIZE_400;
        this.preset = preset;
        this.iconColor = -1;
        this.iconColorDisabled = -1;
        this.iconColorActive = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setPreset(((IconButtonDTO.Preset[]) IconButtonDTO.Preset.getEntries().toArray(new IconButtonDTO.Preset[0]))[obtainStyledAttributes.getInt(R$styleable.IconButtonView_iconButtonSize, preset.ordinal())]);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconButtonView_graphic, -1);
        if (resourceId != -1) {
            getMainView().setImageResource(resourceId);
        }
        try {
            applyStyle(obtainStyledAttributes);
        } catch (UnsupportedOperationException unused) {
            applyStyle$uni_release(R$style.Button_ActionPrimary);
        }
        obtainStyledAttributes.recycle();
        ButtonWrapper.setView$default(this, false, 1, null);
        setContentDescription(getLocatorTag());
        applySize(getMainView(), UiExtKt.toPx(this.preset.getImageSize()));
        this.locatorInitializer.invoke(getMainView());
    }
}
