package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation;

import Gw.ViewOnClickListenerC3131a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$color;
import ru.ozon.app.android.fresh.main.databinding.LayoutCouponGoalV2Binding;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.GradientUtilsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010%J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\"¢\u0006\u0004\b1\u0010%J\u0017\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u00020\fH\u0000¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010H\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bH\u0010J\"\u0004\bK\u0010LR*\u0010M\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bM\u0010J\"\u0004\bN\u0010L¨\u0006P"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalViewV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "drawPerforation", "(Landroid/graphics/Canvas;)V", "drawCouponBackground", "drawActiveGoalBackground", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "dispatchDraw", "", ImagesContract.URL, "bindImage", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "description", "bindDescription", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lkotlin/Function0;", "action", "bindAction", "(Lkotlin/jvm/functions/Function0;)V", "actionText", "bindActionText", "progressBar", "bindProgress", "(Ljava/lang/Integer;)V", "disableTextCopyable$widgets_main_prodGoogleAllVendorsRelease", "()V", "disableTextCopyable", "Lru/ozon/app/android/fresh/main/databinding/LayoutCouponGoalV2Binding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/LayoutCouponGoalV2Binding;", "gradientColorStart", "I", "gradientColorEnd", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "Landroid/graphics/drawable/PaintDrawable;", "couponBackground", "Landroid/graphics/drawable/PaintDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "activeGoalBackground", "Landroid/graphics/drawable/GradientDrawable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isCompleted", "Z", "()Z", "setCompleted", "(Z)V", "isSingle", "setSingle", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalViewV2 extends ConstraintLayout {

    @NotNull
    private final GradientDrawable activeGoalBackground;

    @NotNull
    private final LayoutCouponGoalV2Binding binding;

    @NotNull
    private final PaintDrawable couponBackground;

    @NotNull
    private final Paint dividerPaint;
    private final int gradientColorEnd;
    private final int gradientColorStart;
    private boolean isCompleted;
    private boolean isSingle;
    private static final float DOT_RADIUS = UiExtKt.toPxF(3);
    private static final float CORNER_RADIUS = UiExtKt.toPxF(16);
    private static final int VERTICAL_SHIFT = ResourceExtKt.toPx(9);
    private static final float PERFORATION_CONTAINER_WIDTH = UiExtKt.toPxF(105.5f);

    public /* synthetic */ CouponGoalViewV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void drawActiveGoalBackground(Canvas canvas) {
        this.activeGoalBackground.draw(canvas);
    }

    private final void drawCouponBackground(Canvas canvas) {
        this.couponBackground.draw(canvas);
    }

    private final void drawPerforation(Canvas canvas) {
        float width = getWidth() - PERFORATION_CONTAINER_WIDTH;
        float dp = ResourceExtKt.toDp(1);
        while (true) {
            int measuredHeight = getMeasuredHeight();
            int i11 = VERTICAL_SHIFT;
            if (dp >= measuredHeight + i11) {
                return;
            }
            canvas.drawCircle(width, dp, DOT_RADIUS, this.dividerPaint);
            dp += i11;
        }
    }

    public final void bindAction(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        LayoutCouponGoalV2Binding layoutCouponGoalV2Binding = this.binding;
        Iterator it = C7714v.b0(layoutCouponGoalV2Binding.getConstraintLayout(), layoutCouponGoalV2Binding.couponTitle, layoutCouponGoalV2Binding.couponDescription, layoutCouponGoalV2Binding.actionText).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new ViewOnClickListenerC3131a(action, 7));
        }
    }

    public final void bindActionText(@NotNull TextDTO actionText) {
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        TextAtomV2View actionText2 = this.binding.actionText;
        Intrinsics.checkNotNullExpressionValue(actionText2, "actionText");
        TextHolderKt.bind$default(actionText2, actionText, null, 2, null);
    }

    public final void bindBadge(@NotNull BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        BadgeView couponBadge = this.binding.couponBadge;
        Intrinsics.checkNotNullExpressionValue(couponBadge, "couponBadge");
        BadgeHolderKt.bind$default(couponBadge, badge, (Function1) null, 2, (Object) null);
    }

    public final void bindDescription(@NotNull TextDTO description) {
        Intrinsics.checkNotNullParameter(description, "description");
        TextAtomV2View couponDescription = this.binding.couponDescription;
        Intrinsics.checkNotNullExpressionValue(couponDescription, "couponDescription");
        TextHolderKt.bind$default(couponDescription, description, null, 2, null);
    }

    public final void bindImage(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Image couponIv = this.binding.couponIv;
        Intrinsics.checkNotNullExpressionValue(couponIv, "couponIv");
        ImageViewExtKt.load$default(couponIv, url, null, null, null, null, false, null, 126, null);
    }

    public final void bindProgress(Integer progressBar) {
        ProgressBar couponProgress = this.binding.couponProgress;
        Intrinsics.checkNotNullExpressionValue(couponProgress, "couponProgress");
        ViewExtKt.gone(couponProgress);
        if (progressBar != null) {
            int intValue = progressBar.intValue();
            ProgressBar couponProgress2 = this.binding.couponProgress;
            Intrinsics.checkNotNullExpressionValue(couponProgress2, "couponProgress");
            ViewExtKt.show(couponProgress2);
            this.binding.couponProgress.setProgress(intValue);
        }
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextAtomV2View couponTitle = this.binding.couponTitle;
        Intrinsics.checkNotNullExpressionValue(couponTitle, "couponTitle");
        TextHolderKt.bind$default(couponTitle, title, null, 2, null);
    }

    public final void disableTextCopyable$widgets_main_prodGoogleAllVendorsRelease() {
        LayoutCouponGoalV2Binding layoutCouponGoalV2Binding = this.binding;
        TextAtomV2View couponTitle = layoutCouponGoalV2Binding.couponTitle;
        Intrinsics.checkNotNullExpressionValue(couponTitle, "couponTitle");
        TextViewExtKt.setTextCopyable(couponTitle, false);
        TextAtomV2View couponDescription = layoutCouponGoalV2Binding.couponDescription;
        Intrinsics.checkNotNullExpressionValue(couponDescription, "couponDescription");
        TextViewExtKt.setTextCopyable(couponDescription, false);
        TextAtomV2View actionText = layoutCouponGoalV2Binding.actionText;
        Intrinsics.checkNotNullExpressionValue(actionText, "actionText");
        TextViewExtKt.setTextCopyable(actionText, false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isCompleted) {
            drawCouponBackground(canvas);
        } else {
            drawActiveGoalBackground(canvas);
        }
        super.dispatchDraw(canvas);
        drawPerforation(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isCompleted) {
            this.couponBackground.setBounds(0, 0, getWidth(), getHeight());
            this.couponBackground.setCornerRadius(CORNER_RADIUS);
        } else {
            this.activeGoalBackground.setBounds(0, 0, getWidth(), getHeight());
            this.activeGoalBackground.setCornerRadius(CORNER_RADIUS);
        }
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 0.85d), View.MeasureSpec.getMode(widthMeasureSpec));
        if (!this.isSingle) {
            widthMeasureSpec = makeMeasureSpec;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setCompleted(boolean z11) {
        this.isCompleted = z11;
        requestLayout();
        invalidate();
    }

    public final void setSingle(boolean z11) {
        this.isSingle = z11;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponGoalViewV2(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutCouponGoalV2Binding inflate = LayoutCouponGoalV2Binding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.gradientColorStart = getResources().getColor(R$color.coupon_goal_gradient_start, context.getTheme());
        this.gradientColorEnd = getResources().getColor(R$color.coupon_goal_gradient_end, context.getTheme());
        Paint paint = new Paint(1);
        paint.setColor(getResources().getColor(ru.ozon.uni.R$color.transparent, context.getTheme()));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        this.dividerPaint = paint;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalViewV2$couponBackground$1$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                int i12;
                int i13;
                float[] gradientCoordinates = GradientUtilsKt.getGradientCoordinates(width, height, -80.0f);
                float f7 = gradientCoordinates[0];
                float f11 = gradientCoordinates[1];
                float f12 = gradientCoordinates[2];
                float f13 = gradientCoordinates[3];
                i12 = CouponGoalViewV2.this.gradientColorStart;
                i13 = CouponGoalViewV2.this.gradientColorEnd;
                return new LinearGradient(f7, f11, f12, f13, new int[]{i12, i13}, (float[]) null, Shader.TileMode.CLAMP);
            }
        });
        this.couponBackground = paintDrawable;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(CORNER_RADIUS);
        gradientDrawable.setColor(ResourceExtKt.color(context, ru.ozon.uni.R$color.bg_primary));
        this.activeGoalBackground = gradientDrawable;
        setLayerType(2, null);
    }
}
