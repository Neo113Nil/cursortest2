package ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat;

import Bi.a;
import DN.b;
import Lw.C3599b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import ca0.C5795b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.extensions.PathExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\fJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b6\u00107\"\u0004\b8\u0010\u0011R\u0014\u0010:\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010;R\u0016\u0010C\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R\u0018\u0010D\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "drawBackground", "(Landroid/graphics/Canvas;)V", "drawSeatBackrestIfPresent", "", "color", "changeBackgroundColorWithAnimation", "(I)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDraw", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "item", "shouldAnimateColorChange", "bind", "(Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;Z)V", "", "delay", "highlight", "(J)V", "Lkotlin/Function1;", "onSeatClickListener", "Lkotlin/jvm/functions/Function1;", "getOnSeatClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnSeatClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "seatBackgroundColor", "I", "setSeatBackgroundColor", "", "seatBackrestWidthRatio", "F", "seatBackrestBottomOffset", "Landroid/graphics/Paint;", "seatBackrestPaint", "Landroid/graphics/Paint;", "shouldNotDrawBackrest", "Z", "topRadius", "bottomRadius", "airplaneSeat", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AirplaneSeatView extends FrameLayout {
    private AirplaneSeatVO airplaneSeat;
    private float bottomRadius;

    @NotNull
    private final Path clipPath;
    private Function1<? super AirplaneSeatVO, Unit> onSeatClickListener;
    private int seatBackgroundColor;
    private final float seatBackrestBottomOffset;

    @NotNull
    private final Paint seatBackrestPaint;
    private final float seatBackrestWidthRatio;
    private boolean shouldNotDrawBackrest;

    @NotNull
    private final TextAtomView textView;
    private float topRadius;

    public /* synthetic */ AirplaneSeatView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(AirplaneSeatView airplaneSeatView, View view) {
        Function1<? super AirplaneSeatVO, Unit> function1;
        AirplaneSeatVO airplaneSeatVO = airplaneSeatView.airplaneSeat;
        if (airplaneSeatVO == null || !airplaneSeatVO.getIsSelectable() || (function1 = airplaneSeatView.onSeatClickListener) == null) {
            return;
        }
        function1.invoke(airplaneSeatVO);
    }

    public static /* synthetic */ void bind$default(AirplaneSeatView airplaneSeatView, AirplaneSeatVO airplaneSeatVO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        airplaneSeatView.bind(airplaneSeatVO, z11);
    }

    private final void changeBackgroundColorWithAnimation(int color) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(this.seatBackgroundColor, color);
        ofArgb.addUpdateListener(new C5795b(this, 1));
        ofArgb.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeBackgroundColorWithAnimation$lambda$11$lambda$10(AirplaneSeatView airplaneSeatView, ValueAnimator valueAnimator) {
        airplaneSeatView.setSeatBackgroundColor(((Integer) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    private final void drawBackground(Canvas canvas) {
        canvas.clipPath(this.clipPath);
        canvas.drawColor(this.seatBackgroundColor);
    }

    private final void drawSeatBackrestIfPresent(Canvas canvas) {
        if (this.shouldNotDrawBackrest) {
            return;
        }
        float width = getWidth() * this.seatBackrestWidthRatio;
        float f7 = 2;
        float width2 = (getWidth() / 2) - (width / f7);
        float height = (getHeight() - this.seatBackrestBottomOffset) - (this.seatBackrestPaint.getStrokeWidth() / f7);
        canvas.drawLine(width2, height, width2 + width, height, this.seatBackrestPaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void highlight$lambda$8$lambda$7(AirplaneSeatView airplaneSeatView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        airplaneSeatView.setScaleX(floatValue);
        airplaneSeatView.setScaleY(floatValue);
    }

    private final void setSeatBackgroundColor(int i11) {
        this.seatBackgroundColor = i11;
        invalidate();
    }

    public final void bind(@NotNull AirplaneSeatVO item, boolean shouldAnimateColorChange) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.airplaneSeat = item;
        setClickable(item.getIsSelectable());
        setFocusable(item.getIsSelectable());
        TextAtomHolderKt.bindOrGone$default(this.textView, item.getText(), null, 2, null);
        this.textView.setTextSize(1, 16.0f);
        this.shouldNotDrawBackrest = item.getSeatBackrestColor() == null;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getSeatBackrestColor());
        if (parseColor != null) {
            this.seatBackrestPaint.setColor(parseColor.intValue());
        }
        int topCornerRadius = item.getTopCornerRadius();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.topRadius = ResourceExtKt.toPxF(topCornerRadius, context2);
        int bottomCornerRadius = item.getBottomCornerRadius();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.bottomRadius = ResourceExtKt.toPxF(bottomCornerRadius, context3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context4, item.getBackgroundColor(), this.seatBackgroundColor);
        if (shouldAnimateColorChange) {
            changeBackgroundColorWithAnimation(parseColor2);
        } else {
            setSeatBackgroundColor(parseColor2);
        }
        requestLayout();
        invalidate();
    }

    public final void highlight(long delay) {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 1.2f).setDuration(200L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.setStartDelay(delay);
        duration.setRepeatMode(2);
        duration.setRepeatCount(1);
        duration.addUpdateListener(new C3599b(this, 1));
        duration.start();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        try {
            drawBackground(canvas);
            drawSeatBackrestIfPresent(canvas);
            canvas.restoreToCount(save);
            super.onDraw(canvas);
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        PathExtensionsKt.roundedRect(this.clipPath, right - left, bottom - top, this.topRadius, this.bottomRadius);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
    }

    public final void setOnSeatClickListener(Function1<? super AirplaneSeatVO, Unit> function1) {
        this.onSeatClickListener = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirplaneSeatView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clipPath = new Path();
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        textAtomView.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        textAtomView.setLayoutParams(layoutParams);
        this.textView = textAtomView;
        this.seatBackgroundColor = ThemeExtKt.themeColor(context, R$attr.graphicPrimary);
        this.seatBackrestWidthRatio = 0.72f;
        this.seatBackrestBottomOffset = ResourceExtKt.toPxF(4, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, context));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.seatBackrestPaint = paint;
        this.shouldNotDrawBackrest = true;
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
        addView(textAtomView);
        super.setOnClickListener(new b(this, 13));
    }
}
