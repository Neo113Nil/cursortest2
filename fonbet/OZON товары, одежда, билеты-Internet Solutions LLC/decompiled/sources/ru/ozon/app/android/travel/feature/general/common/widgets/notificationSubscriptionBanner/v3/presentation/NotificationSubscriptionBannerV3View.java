package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Am.C2438a;
import EW.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3VI;
import ru.ozon.app.android.travel.molecules.extensions.ThemeImageExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0014J\u0010\u0010I\u001a\u00020D2\u0006\u0010J\u001a\u00020KH\u0014J\u0010\u0010L\u001a\u00020D2\u0006\u0010J\u001a\u00020KH\u0016J5\u0010M\u001a\u00020D2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u0002032\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020D0Rj\u0002`TH\u0000¢\u0006\u0002\bUJ0\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u0002032\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020D0Rj\u0002`TH\u0007J\b\u0010Z\u001a\u00020DH\u0002J\b\u0010[\u001a\u00020DH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b-\u0010.R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00105R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010>R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp12", "", "dp16", "borderWidth", "", "defaultRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundOutlineProvider", "Lru/ozon/app/android/travel/utils/utils/RoundedOutlineProvider;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitleView", "getSubtitleView", "subtitleView$delegate", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView$delegate", "rightImageView", "Lru/ozon/uni/android/atom/image/Image;", "getRightImageView", "()Lru/ozon/uni/android/atom/image/Image;", "rightImageView$delegate", "endGuideline", "Landroidx/constraintlayout/widget/Guideline;", "backgroundImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getBackgroundImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImageView$delegate", "closeButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getCloseButtonView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "closeButtonView$delegate", "boundItem", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "useImageBackground", "", "getUseImageBackground", "()Z", "cornerRadius", "getCornerRadius", "()F", "hasBorder", "getHasBorder", "borderPaint", "Landroid/graphics/Paint;", "backgroundColor", "Ljava/lang/Integer;", "borderRectF", "Landroid/graphics/RectF;", "clipPath", "Landroid/graphics/Path;", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDrawForeground", "bind", "data", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "isClientSubscribed", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "bind$common_prodGoogleAllVendorsRelease", "updateButtonState", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "isLoading", "updateBorderAndClipping", "setupConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(NotificationSubscriptionBannerV3View.class, "titleView", "getTitleView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(NotificationSubscriptionBannerV3View.class, "subtitleView", "getSubtitleView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(NotificationSubscriptionBannerV3View.class, "buttonView", "getButtonView()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(NotificationSubscriptionBannerV3View.class, "rightImageView", "getRightImageView()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(NotificationSubscriptionBannerV3View.class, "backgroundImageView", "getBackgroundImageView()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(NotificationSubscriptionBannerV3View.class, "closeButtonView", "getCloseButtonView()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};
    public static final int $stable = 8;
    private Integer backgroundColor;

    /* renamed from: backgroundImageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate backgroundImageView;

    @NotNull
    private RoundedOutlineProvider backgroundOutlineProvider;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private final RectF borderRectF;
    private final float borderWidth;
    private NotificationSubscriptionBannerV3VI.WidgetContent boundItem;

    /* renamed from: buttonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate buttonView;

    @NotNull
    private final Path clipPath;

    /* renamed from: closeButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate closeButtonView;

    @NotNull
    private final CornerRadius defaultRadius;
    private final int dp12;
    private final int dp16;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final Guideline endGuideline;

    /* renamed from: rightImageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate rightImageView;

    /* renamed from: subtitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleView;

    /* renamed from: titleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionBannerV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dp12 = dimens$default.getMargin12();
        this.dp16 = dimens$default.getMargin16();
        this.borderWidth = ResourceExtKt.toPxF(2, context);
        this.defaultRadius = CornerRadius.RADIUS_550;
        this.backgroundOutlineProvider = new RoundedOutlineProvider(getCornerRadius());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$1(this), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitleView = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$3(this), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.buttonView = new PreCreationViewPoolDelegate(context4, N.b(ButtonV3View.class), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$5(this), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.rightImageView = new PreCreationViewPoolDelegate(context5, N.b(Image.class), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$7(this), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$8());
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41615V = 1;
        bVar.f41624c = 0.66f;
        guideline.setLayoutParams(bVar);
        this.endGuideline = guideline;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.backgroundImageView = new PreCreationViewPoolDelegate(context6, N.b(AppCompatImageView.class), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$9(this), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$10(this));
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.closeButtonView = new PreCreationViewPoolDelegate(context7, N.b(IconButtonV3View.class), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$11(this), new NotificationSubscriptionBannerV3View$special$$inlined$preCreationViewPool$default$12());
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint;
        this.borderRectF = new RectF();
        this.clipPath = new Path();
        setClipChildren(true);
        setClipToOutline(true);
        addView(getBackgroundImageView());
        addView(guideline);
        addView(getRightImageView());
        addView(getTitleView());
        addView(getSubtitleView());
        addView(getButtonView());
        addView(getCloseButtonView());
        setupConstraints();
        updateBorderAndClipping();
        setLayerType(2, null);
    }

    private final AppCompatImageView getBackgroundImageView() {
        return (AppCompatImageView) this.backgroundImageView.getValue(this, $$delegatedProperties[4]);
    }

    private final ButtonV3View getButtonView() {
        return (ButtonV3View) this.buttonView.getValue(this, $$delegatedProperties[2]);
    }

    private final IconButtonV3View getCloseButtonView() {
        return (IconButtonV3View) this.closeButtonView.getValue(this, $$delegatedProperties[5]);
    }

    private final float getCornerRadius() {
        CornerRadius cornerRadius;
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration;
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent = this.boundItem;
        if (widgetContent == null || (decoration = widgetContent.getDecoration()) == null || (cornerRadius = decoration.getCornerRadius()) == null) {
            cornerRadius = this.defaultRadius;
        }
        int px = cornerRadius.getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPxF(px, context);
    }

    private final boolean getHasBorder() {
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration;
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent = this.boundItem;
        return ((widgetContent == null || (decoration = widgetContent.getDecoration()) == null) ? null : decoration.getBorderColor()) != null;
    }

    private final Image getRightImageView() {
        return (Image) this.rightImageView.getValue(this, $$delegatedProperties[3]);
    }

    private final TextAtomV2View getSubtitleView() {
        return (TextAtomV2View) this.subtitleView.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTitleView() {
        return (TextAtomV2View) this.titleView.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean getUseImageBackground() {
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration;
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent = this.boundItem;
        return ((widgetContent == null || (decoration = widgetContent.getDecoration()) == null) ? null : decoration.getBackgroundImage()) != null;
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getBackgroundImageView());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getBackgroundImageView());
        ConstraintLayoutExtensionsKt.topToParent(dVar, getBackgroundImageView());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getBackgroundImageView());
        ConstraintLayoutExtensionsKt.topToParent(dVar, getRightImageView());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getRightImageView());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getRightImageView());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getRightImageView(), this.endGuideline);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getTitleView(), this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTitleView(), this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTitleView(), this.endGuideline);
        dVar.c0(0.0f, getTitleView().getId());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getSubtitleView(), getTitleView());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getSubtitleView(), this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getSubtitleView(), this.endGuideline);
        dVar.c0(0.0f, getSubtitleView().getId());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getButtonView(), this.dp16);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getButtonView(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getButtonView());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getButtonView(), getSubtitleView());
        dVar.f0(1.0f, getButtonView().getId());
        dVar.c0(0.0f, getButtonView().getId());
        ConstraintLayoutExtensionsKt.topToParent(dVar, getCloseButtonView(), this.dp12);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getCloseButtonView(), this.dp12);
        dVar.f(this);
    }

    private final void updateBorderAndClipping() {
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration;
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration2;
        Paint paint = this.borderPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent = this.boundItem;
        String str = null;
        Integer parseColor = styleParser.parseColor(context, (widgetContent == null || (decoration2 = widgetContent.getDecoration()) == null) ? null : decoration2.getBorderColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : 0);
        Paint paint2 = this.borderPaint;
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent2 = this.boundItem;
        if (widgetContent2 != null && (decoration = widgetContent2.getDecoration()) != null) {
            str = decoration.getBorderColor();
        }
        paint2.setStrokeWidth(str != null ? this.borderWidth : 0.0f);
        this.clipPath.reset();
        this.clipPath.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getCornerRadius(), getCornerRadius(), Path.Direction.CW);
        if (getHasBorder()) {
            RectF rectF = this.borderRectF;
            float f7 = this.borderWidth;
            float f11 = 2;
            rectF.set(f7 / f11, f7 / f11, getWidth() - (this.borderWidth / f11), getHeight() - (this.borderWidth / f11));
        }
        RoundedOutlineProvider roundedOutlineProvider = new RoundedOutlineProvider(getCornerRadius());
        this.backgroundOutlineProvider = roundedOutlineProvider;
        setOutlineProvider(roundedOutlineProvider);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateButtonState$lambda$13(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void bind$common_prodGoogleAllVendorsRelease(@NotNull NotificationSubscriptionBannerV3VI data, boolean isClientSubscribed, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        ThemeImageV1VO backgroundImage;
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.boundItem = data.getContent();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent = this.boundItem;
        String str = null;
        this.backgroundColor = styleParser.parseColor(context, (widgetContent == null || (decoration = widgetContent.getDecoration()) == null) ? null : decoration.getBackgroundColor());
        TextAtomV2View titleView = getTitleView();
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent2 = this.boundItem;
        TextHolderKt.bindOrGone$default(titleView, widgetContent2 != null ? widgetContent2.getTitle() : null, null, 2, null);
        TextAtomV2View subtitleView = getSubtitleView();
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent3 = this.boundItem;
        TextHolderKt.bindOrGone$default(subtitleView, widgetContent3 != null ? widgetContent3.getSubtitle() : null, null, 2, null);
        Image rightImageView = getRightImageView();
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent4 = this.boundItem;
        ImageHolderKt.bindOrGone$default(rightImageView, widgetContent4 != null ? widgetContent4.getRightImage() : null, null, 2, null);
        IconButtonV3View closeButtonView = getCloseButtonView();
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent5 = this.boundItem;
        IconButtonV3HolderKt.bindOrGone(closeButtonView, widgetContent5 != null ? widgetContent5.getCloseButton() : null, actionHandler);
        if (data.getContent().getOnlyButtonViewState()) {
            ViewExtensionsKt.safeUpdateMargins(getButtonView(), 0, 0, 0, 0);
        } else {
            ViewExtensionsKt.safeUpdateMargins(getButtonView(), 0, Integer.valueOf(this.dp16), Integer.valueOf(this.dp16), Integer.valueOf(this.dp16));
        }
        ButtonV3HolderKt.bindOrGone(getButtonView(), (isClientSubscribed && data.getIsBackendSubscribed()) ? data.getContent().getSubscriptionCompletedButton() : data.getContent().getSubscribeButton(), actionHandler);
        NotificationSubscriptionBannerV3VI.WidgetContent widgetContent6 = this.boundItem;
        NotificationSubscriptionBannerV3VI.WidgetContent.Decoration decoration2 = widgetContent6 != null ? widgetContent6.getDecoration() : null;
        AppCompatImageView backgroundImageView = getBackgroundImageView();
        if (decoration2 != null && (backgroundImage = decoration2.getBackgroundImage()) != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            str = ThemeImageExtKt.getUrlForTheme(backgroundImage, context2);
        }
        ImageViewExtKt.loadImageOrGone(backgroundImageView, str);
        ButtonV3View buttonView = getButtonView();
        ViewGroup.LayoutParams layoutParams = buttonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = (decoration2 == null || !decoration2.getIsFullWidthButton()) ? -2 : 0;
        buttonView.setLayoutParams(bVar);
        updateBorderAndClipping();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Integer num;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.clipPath;
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            if (!getUseImageBackground() && (num = this.backgroundColor) != null) {
                canvas.drawColor(num.intValue());
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onDrawForeground(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDrawForeground(canvas);
        if (getHasBorder()) {
            canvas.drawRoundRect(this.borderRectF, getCornerRadius(), getCornerRadius(), this.borderPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        updateBorderAndClipping();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void updateButtonState(@NotNull ButtonV3DTO button, boolean isLoading, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bindOrGone(getButtonView(), button, actionHandler);
        if (isLoading) {
            setOnTouchListener(new a(1));
            getButtonView().showLoader();
        } else {
            getButtonView().hideLoader();
            setOnTouchListener(null);
        }
    }
}
