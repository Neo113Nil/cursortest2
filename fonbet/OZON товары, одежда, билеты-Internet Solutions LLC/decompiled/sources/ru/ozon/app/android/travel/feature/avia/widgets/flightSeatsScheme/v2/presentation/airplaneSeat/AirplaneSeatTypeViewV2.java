package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat;

import Am.C2438a;
import BC.a;
import Sc.o;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeViewV2;
import ru.ozon.app.android.travel.molecules.extensions.PathExtensionsKt;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0015¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b'\u0010\nJ\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u001f¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R0\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>R\u0014\u0010D\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0017\u0010E\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010GR\u0017\u0010J\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010GR\u0017\u0010M\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR$\u0010[\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b[\u0010\\\"\u0004\b]\u0010\u000fR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010>R\u0016\u0010d\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010>R\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006g"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeViewV2;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "", "drawBackground", "(Landroid/graphics/Canvas;)V", "drawSeatBackrestIfPresent", "", "color", "changeBackgroundColorWithAnimation", "(I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "item", "", "textSize", "bindSeatText", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;F)V", "bindSeatPrice", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;", "fuselageType", "applyFuselageType", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;)V", "bindSeatBackrest", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;)V", "getTextSize", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;)F", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDraw", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "shouldAnimateColorChange", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;Z)V", "", "delay", "highlight", "(J)V", "Lkotlin/Function1;", "onSeatClickListener", "Lkotlin/jvm/functions/Function1;", "getOnSeatClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnSeatClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "topRadiusWide", "F", "bottomRadiusWide", "topRadiusNarrow", "bottomRadiusNarrow", "topRadiusDefault", "bottomRadiusDefault", "backrestPath", "backrestHeight", "getBackrestHeight", "()F", "horizontalPaddingBackrest", "getHorizontalPaddingBackrest", "cornerRadiusBackrest", "getCornerRadiusBackrest", "", "radiiBackrest", "[F", "getRadiiBackrest", "()[F", "Landroidx/appcompat/widget/AppCompatTextView;", "textView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textView", "priceView$delegate", "getPriceView", "priceView", AppMeasurementSdk.ConditionalUserProperty.VALUE, "seatBackgroundColor", "I", "setSeatBackgroundColor", "Landroid/graphics/Paint;", "seatBackrestPaint", "Landroid/graphics/Paint;", "shouldNotDrawBackrest", "Z", "topRadius", "bottomRadius", "airplaneSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AirplaneSeatTypeViewV2 extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AirplaneSeatTypeViewV2.class, "textView", "getTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), C2438a.c(AirplaneSeatTypeViewV2.class, "priceView", "getPriceView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    public static final int $stable = 8;
    private AirplaneSeatTypeV2VI airplaneSeat;
    private final float backrestHeight;

    @NotNull
    private final Path backrestPath;
    private float bottomRadius;
    private final float bottomRadiusDefault;
    private final float bottomRadiusNarrow;
    private final float bottomRadiusWide;

    @NotNull
    private final Path clipPath;
    private final float cornerRadiusBackrest;
    private final float horizontalPaddingBackrest;
    private Function1<? super AirplaneSeatTypeV2VI, Unit> onSeatClickListener;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceView;

    @NotNull
    private final float[] radiiBackrest;
    private int seatBackgroundColor;

    @NotNull
    private final Paint seatBackrestPaint;
    private boolean shouldNotDrawBackrest;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate textView;
    private float topRadius;
    private final float topRadiusDefault;
    private final float topRadiusNarrow;
    private final float topRadiusWide;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AirplaneSeatTypeV2VI.FuselageType.values().length];
            try {
                iArr[AirplaneSeatTypeV2VI.FuselageType.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AirplaneSeatTypeV2VI.FuselageType.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AirplaneSeatTypeV2VI.FuselageType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirplaneSeatTypeViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clipPath = new Path();
        this.topRadiusWide = ResourceExtKt.toPxF(6, context);
        this.bottomRadiusWide = ResourceExtKt.toPxF(2, context);
        this.topRadiusNarrow = ResourceExtKt.toPxF(12, context);
        this.bottomRadiusNarrow = ResourceExtKt.toPxF(4, context);
        this.topRadiusDefault = ResourceExtKt.toPxF(8, context);
        this.bottomRadiusDefault = ResourceExtKt.toPxF(3, context);
        this.backrestPath = new Path();
        this.backrestHeight = ResourceExtKt.toPxF(2, context);
        this.horizontalPaddingBackrest = ResourceExtKt.toPxF(4, context);
        float pxF = ResourceExtKt.toPxF(2, context);
        this.cornerRadiusBackrest = pxF;
        this.radiiBackrest = new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f};
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.textView = new PreCreationViewPoolDelegate(context2, N.b(AppCompatTextView.class), new AirplaneSeatTypeViewV2$special$$inlined$preCreationViewPool$default$1(this), new AirplaneSeatTypeViewV2$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.priceView = new PreCreationViewPoolDelegate(context3, N.b(AppCompatTextView.class), new AirplaneSeatTypeViewV2$special$$inlined$preCreationViewPool$default$3(this), new AirplaneSeatTypeViewV2$special$$inlined$preCreationViewPool$default$4());
        this.seatBackgroundColor = ThemeExtKt.themeColor(context, R$attr.graphicPrimary);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.seatBackrestPaint = paint;
        this.shouldNotDrawBackrest = true;
        setOrientation(1);
        setGravity(17);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
        addView(getTextView());
        addView(getPriceView());
        super.setOnClickListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2, View view) {
        Function1<? super AirplaneSeatTypeV2VI, Unit> function1;
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI = airplaneSeatTypeViewV2.airplaneSeat;
        if (airplaneSeatTypeV2VI == null || !airplaneSeatTypeV2VI.getIsSelectable() || (function1 = airplaneSeatTypeViewV2.onSeatClickListener) == null) {
            return;
        }
        function1.invoke(airplaneSeatTypeV2VI);
    }

    private final void applyFuselageType(AirplaneSeatTypeV2VI.FuselageType fuselageType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[fuselageType.ordinal()];
        if (i11 == 1) {
            this.topRadius = this.topRadiusWide;
            this.bottomRadius = this.bottomRadiusWide;
        } else if (i11 == 2) {
            this.topRadius = this.topRadiusNarrow;
            this.bottomRadius = this.bottomRadiusNarrow;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            this.topRadius = this.topRadiusDefault;
            this.bottomRadius = this.bottomRadiusDefault;
        }
    }

    public static /* synthetic */ void bind$default(AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        airplaneSeatTypeViewV2.bind(airplaneSeatTypeV2VI, z11);
    }

    private final void bindSeatBackrest(AirplaneSeatTypeV2VI item) {
        this.shouldNotDrawBackrest = item.getSeatBackrestColor() == null;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getSeatBackrestColor());
        if (parseColor != null) {
            this.seatBackrestPaint.setColor(parseColor.intValue());
        }
    }

    private final void bindSeatPrice(AirplaneSeatTypeV2VI item, float textSize) {
        AppCompatTextView priceView = getPriceView();
        if (item.getIsPriceInvisible() || item.getPrice() == null) {
            ViewExtKt.gone(priceView);
            return;
        }
        ViewExtKt.show(priceView);
        priceView.setText(item.getPrice().getText());
        priceView.setTextSize(1, textSize);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = priceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        priceView.setTextColor(styleParser.parseColor(context, item.getPrice().getTextColor(), UniColors.TEXT_PRIMARY.getResId()));
    }

    private final void bindSeatText(AirplaneSeatTypeV2VI item, float textSize) {
        AppCompatTextView textView = getTextView();
        TextDTO text = item.getText();
        textView.setText(text != null ? text.getText() : null);
        textView.setVisibility(item.getText() != null ? 0 : 8);
        textView.setTextSize(1, textSize);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextDTO text2 = item.getText();
        textView.setTextColor(styleParser.parseColor(context, text2 != null ? text2.getTextColor() : null, UniColors.TEXT_PRIMARY.getResId()));
    }

    private final void changeBackgroundColorWithAnimation(int color) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(this.seatBackgroundColor, color);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: RM.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AirplaneSeatTypeViewV2.changeBackgroundColorWithAnimation$lambda$10$lambda$9(AirplaneSeatTypeViewV2.this, valueAnimator);
            }
        });
        ofArgb.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeBackgroundColorWithAnimation$lambda$10$lambda$9(AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2, ValueAnimator valueAnimator) {
        airplaneSeatTypeViewV2.setSeatBackgroundColor(((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    private final void drawBackground(Canvas canvas) {
        canvas.clipPath(this.clipPath);
        canvas.drawColor(this.seatBackgroundColor);
    }

    private final void drawSeatBackrestIfPresent(Canvas canvas) {
        if (this.shouldNotDrawBackrest) {
            return;
        }
        float f7 = this.horizontalPaddingBackrest;
        float height = getHeight() - this.backrestHeight;
        float width = getWidth() - this.horizontalPaddingBackrest;
        float height2 = getHeight();
        this.backrestPath.reset();
        this.backrestPath.addRoundRect(f7, height, width, height2, this.radiiBackrest, Path.Direction.CW);
        canvas.drawPath(this.backrestPath, this.seatBackrestPaint);
    }

    private final AppCompatTextView getPriceView() {
        return (AppCompatTextView) this.priceView.getValue(this, $$delegatedProperties[1]);
    }

    private final float getTextSize(AirplaneSeatTypeV2VI item) {
        if (!item.getIsSelectable() && item.getFuselageType() == AirplaneSeatTypeV2VI.FuselageType.WIDE) {
            return 14.0f;
        }
        if (!item.getIsSelectable()) {
            return 16.0f;
        }
        if (!item.getIsPriceInvisible() && item.getPrice() != null && item.getFuselageType() == AirplaneSeatTypeV2VI.FuselageType.WIDE) {
            return 10.0f;
        }
        if (!item.getIsPriceInvisible() && item.getPrice() != null) {
            return 12.0f;
        }
        if (item.getIsPriceInvisible() && item.getPrice() != null && item.getFuselageType() == AirplaneSeatTypeV2VI.FuselageType.WIDE) {
            return 14.0f;
        }
        return (!item.getIsPriceInvisible() || item.getPrice() == null) ? 16.0f : 20.0f;
    }

    private final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.textView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void highlight$lambda$7$lambda$6(AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        airplaneSeatTypeViewV2.setScaleX(floatValue);
        airplaneSeatTypeViewV2.setScaleY(floatValue);
    }

    private final void setSeatBackgroundColor(int i11) {
        this.seatBackgroundColor = i11;
        invalidate();
    }

    public final void bind(@NotNull AirplaneSeatTypeV2VI item, boolean shouldAnimateColorChange) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.airplaneSeat = item;
        setClickable(item.getIsSelectable());
        setFocusable(item.getIsSelectable());
        float textSize = getTextSize(item);
        bindSeatText(item, textSize);
        bindSeatPrice(item, textSize);
        applyFuselageType(item.getFuselageType());
        bindSeatBackrest(item);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getBackgroundColor(), this.seatBackgroundColor);
        if (shouldAnimateColorChange) {
            changeBackgroundColorWithAnimation(parseColor);
        } else {
            setSeatBackgroundColor(parseColor);
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
        duration.addUpdateListener(new RM.a(this, 0));
        duration.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
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

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        PathExtensionsKt.roundedRect(this.clipPath, right - left, bottom - top, this.topRadius, this.bottomRadius);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
    }

    public final void setOnSeatClickListener(Function1<? super AirplaneSeatTypeV2VI, Unit> function1) {
        this.onSeatClickListener = function1;
    }
}
