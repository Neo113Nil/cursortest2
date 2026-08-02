package ru.ozon.app.android.monetization.widgets.overlayButton.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.R$id;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonVO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.DrawableExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonViewGroup;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "width", "", "updatePath", "(F)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "createButtonView", "(Landroid/content/Context;)Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "model", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Paint;", "linePaint", "Landroid/graphics/Paint;", "cornerPaint", "Landroid/graphics/Path;", "linePath", "Landroid/graphics/Path;", "cornerPath", "topCornerRadius", "F", "firstButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "LSc/j;", "secondButton", "LSc/j;", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OverlayButtonViewGroup extends LinearLayout {

    @NotNull
    private final Paint cornerPaint;

    @NotNull
    private final Path cornerPath;

    @NotNull
    private final ButtonV3View firstButton;

    @NotNull
    private final Paint linePaint;

    @NotNull
    private final Path linePath;

    @NotNull
    private final InterfaceC4008j<ButtonV3View> secondButton;
    private final float topCornerRadius;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonViewGroup$Companion;", "", "<init>", "()V", "CORNER_POINT_FACTOR", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OverlayButtonViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View createButtonView(Context context) {
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginStart(dimens.getDP_8());
        layoutParams.topMargin = dimens.getDP_8();
        layoutParams.bottomMargin = dimens.getDP_4();
        buttonV3View.setLayoutParams(layoutParams);
        return buttonV3View;
    }

    private final void updatePath(float width) {
        this.linePath.reset();
        this.linePath.moveTo(this.topCornerRadius, 0.0f);
        this.linePath.lineTo(width - this.topCornerRadius, 0.0f);
        this.cornerPath.reset();
        this.cornerPath.moveTo(0.0f, this.topCornerRadius);
        Path path = this.cornerPath;
        float f7 = this.topCornerRadius;
        float f11 = 2;
        path.cubicTo(0.0f, (f7 / f11) * 0.8f, f7 / f11, 0.0f, f7, 0.0f);
        this.cornerPath.moveTo(width - this.topCornerRadius, 0.0f);
        Path path2 = this.cornerPath;
        float f12 = this.topCornerRadius;
        path2.cubicTo(width - (f12 / f11), 0.0f, width, (f12 / f11) * 0.8f, width, f12);
    }

    public final void bind(@NotNull OverlayButtonVO model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TestInfo testInfo = model.getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        OverlayButtonVO.ButtonWrapper buttonWrapper = model.getButtonWrapper();
        if (buttonWrapper instanceof OverlayButtonVO.ButtonWrapper.DoubleButton) {
            ButtonV3HolderKt.bind(this.firstButton, ((OverlayButtonVO.ButtonWrapper.DoubleButton) model.getButtonWrapper()).getFirstButton(), actionHandler);
            ButtonV3HolderKt.bindOrGone(this.secondButton.getValue(), ((OverlayButtonVO.ButtonWrapper.DoubleButton) model.getButtonWrapper()).getSecondButton(), actionHandler);
        } else {
            if (!(buttonWrapper instanceof OverlayButtonVO.ButtonWrapper.SingleButton)) {
                throw new o();
            }
            ButtonV3HolderKt.bind(this.firstButton, ((OverlayButtonVO.ButtonWrapper.SingleButton) model.getButtonWrapper()).getSingleButton(), actionHandler);
            if (this.secondButton.isInitialized()) {
                ViewExtKt.gone(this.secondButton.getValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.cornerPath, this.cornerPaint);
        canvas.drawPath(this.linePath, this.linePaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        updatePath(width);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        UniColors uniColors = UniColors.GRAPHIC_STROKE_STICKY;
        paint.setColor(a.getColor(context, uniColors.getResId()));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Dimens dimens = Dimens.INSTANCE;
        paint.setStrokeWidth(dimens.getDPF_1());
        this.linePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(a.getColor(context, uniColors.getResId()));
        paint2.setStyle(style);
        paint2.setStrokeWidth(dimens.getDPF_1() / 2);
        this.cornerPaint = paint2;
        this.linePath = new Path();
        this.cornerPath = new Path();
        float dpf_24 = dimens.getDPF_24();
        this.topCornerRadius = dpf_24;
        ButtonV3View createButtonView = createButtonView(context);
        createButtonView.setId(R$id.firstOverlayButtonView);
        this.firstButton = createButtonView;
        this.secondButton = DelegatesKt.lazyUnsafe(new OverlayButtonViewGroup$special$$inlined$lazyView$1(this, this, context));
        setId(R$id.overlayButtonRoot);
        setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(DrawableExtKt.createCornerRadii(dpf_24, dpf_24, 0.0f, 0.0f));
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setBackground(gradientDrawable);
        setPadding(0, 0, dimens.getDP_8(), 0);
        addView(createButtonView);
    }
}
