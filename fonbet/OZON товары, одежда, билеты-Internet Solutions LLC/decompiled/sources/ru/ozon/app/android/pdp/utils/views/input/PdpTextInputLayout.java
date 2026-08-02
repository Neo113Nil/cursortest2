package ru.ozon.app.android.pdp.utils.views.input;

import JC.c;
import JC.d;
import Sc.o;
import Xc.a;
import Xc.b;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.common.utils.R$color;
import ru.ozon.app.android.feature.common.utils.R$styleable;
import ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.view.input.ToggleImageView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$font;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 n2\u00020\u0001:\u0003nopB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&R*\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u0010 R*\u00105\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b5\u00103\"\u0004\b6\u0010 R*\u00107\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00103\"\u0004\b9\u0010 R\"\u0010:\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00103\"\u0004\b<\u0010 R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u0014\u0010G\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010BR\u0016\u0010H\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010BR\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010JR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010JR\u0016\u0010O\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010BR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u0014\u0010W\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0014\u0010X\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010JR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010UR\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010j\u001a\u00020Y2\u0006\u0010*\u001a\u00020Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006q"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/widget/TextView;", "setInputLayout", "(Landroid/widget/TextView;)V", "withAnimation", "updateLayout", "(Z)V", "riseHint", "centerHint", "", "sp", "spToPx", "(F)F", "dp", "dpToPx", "Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$Style;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "style", "Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$Style;", "getStyle", "()Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$Style;", "setStyle", "(Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$Style;)V", "isEditable", "Z", "()Z", "setEditable", "isMultiline", "setMultiline", "showError", "getShowError", "setShowError", "autoClearError", "getAutoClearError", "setAutoClearError", "inputView", "Landroid/widget/TextView;", "isHintRisen", "Ljava/lang/Boolean;", "hintAnimationProgress", "F", "Landroid/animation/FloatEvaluator;", "floatEvaluator", "Landroid/animation/FloatEvaluator;", "strokeWidth", "focusedHintSize", "unfocusedHintSize", "enabledBgColor", "I", "disabledBgColor", "enabledHintColor", "strokeUnfocusedColor", "strokeFocusedColor", "bgCornerRadius", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "errorBgPaint", "strokeBgPaint", "errorHeight", "", "_hint", "Ljava/lang/String;", "Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$HintPosition;", "hintPosition", "Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$HintPosition;", "hintPaint", "Landroid/animation/ValueAnimator;", "hintAnimation", "Landroid/animation/ValueAnimator;", "Lru/ozon/app/android/uikit/view/input/ToggleImageView;", "passwordToggleView", "Lru/ozon/app/android/uikit/view/input/ToggleImageView;", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "hint", "getHintPaintColor", "()I", "hintPaintColor", "Companion", "HintPosition", "Style", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTextInputLayout extends ConstraintLayout {

    @NotNull
    private String _hint;
    private boolean autoClearError;
    private float bgCornerRadius;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final RectF bgRect;
    private final int disabledBgColor;
    private final int enabledBgColor;
    private final int enabledHintColor;

    @NotNull
    private final Paint errorBgPaint;
    private final int errorHeight;

    @NotNull
    private final FloatEvaluator floatEvaluator;
    private final float focusedHintSize;
    private ValueAnimator hintAnimation;
    private float hintAnimationProgress;

    @NotNull
    private final Paint hintPaint;

    @NotNull
    private HintPosition hintPosition;
    private TextView inputView;
    private boolean isEditable;
    private Boolean isHintRisen;
    private boolean isMultiline;

    @NotNull
    private final ToggleImageView passwordToggleView;
    private boolean showError;

    @NotNull
    private final Paint strokeBgPaint;
    private final int strokeFocusedColor;
    private final int strokeUnfocusedColor;
    private final float strokeWidth;

    @NotNull
    private Style style;
    private float unfocusedHintSize;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$HintPosition;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "CENTER", "TOP", "Companion", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HintPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HintPosition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int intValue;
        public static final HintPosition CENTER = new HintPosition("CENTER", 0, 0);
        public static final HintPosition TOP = new HintPosition("TOP", 1, 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$HintPosition$Companion;", "", "<init>", "()V", "fromInt", "Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$HintPosition;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final HintPosition fromInt(int value) {
                for (HintPosition hintPosition : HintPosition.values()) {
                    if (hintPosition.getIntValue() == value) {
                        return hintPosition;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ HintPosition[] $values() {
            return new HintPosition[]{CENTER, TOP};
        }

        static {
            HintPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private HintPosition(String str, int i11, int i12) {
            this.intValue = i12;
        }

        public static HintPosition valueOf(String str) {
            return (HintPosition) Enum.valueOf(HintPosition.class, str);
        }

        public static HintPosition[] values() {
            return (HintPosition[]) $VALUES.clone();
        }

        public final int getIntValue() {
            return this.intValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/input/PdpTextInputLayout$Style;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "STROKE", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style DEFAULT = new Style("DEFAULT", 0);
        public static final Style STROKE = new Style("STROKE", 1);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{DEFAULT, STROKE};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HintPosition.values().length];
            try {
                iArr[HintPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HintPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdpTextInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(PdpTextInputLayout pdpTextInputLayout, Context context, View view) {
        TextView textView = pdpTextInputLayout.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        textView.requestFocus();
        Object systemService = context.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        TextView textView2 = pdpTextInputLayout.inputView;
        if (textView2 != null) {
            inputMethodManager.showSoftInput(textView2, 1);
        } else {
            Intrinsics.n("inputView");
            throw null;
        }
    }

    private final void centerHint(boolean withAnimation) {
        if (!withAnimation) {
            this.hintAnimationProgress = 0.0f;
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.hintAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.hintAnimationProgress, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: JC.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PdpTextInputLayout.centerHint$lambda$17$lambda$16(PdpTextInputLayout.this, valueAnimator2);
            }
        });
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void centerHint$lambda$17$lambda$16(PdpTextInputLayout pdpTextInputLayout, ValueAnimator valueAnimator) {
        pdpTextInputLayout.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        pdpTextInputLayout.invalidate();
    }

    private final float dpToPx(float dp) {
        return TypedValue.applyDimension(1, dp, getContext().getResources().getDisplayMetrics());
    }

    private final int getHintPaintColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextView textView = this.inputView;
        if (textView != null) {
            return ThemeExtKt.themeColor(context, textView.isEnabled() ? R$attr.textSecondary : R$attr.textOriginalpriceAvailable);
        }
        Intrinsics.n("inputView");
        throw null;
    }

    private final void riseHint(boolean withAnimation) {
        int i11 = 0;
        ValueAnimator valueAnimator = this.hintAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!withAnimation) {
            this.hintAnimationProgress = 1.0f;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.hintAnimationProgress, 1.0f);
        ofFloat.addUpdateListener(new d(this, i11));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void riseHint$lambda$15$lambda$14(PdpTextInputLayout pdpTextInputLayout, ValueAnimator valueAnimator) {
        pdpTextInputLayout.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        pdpTextInputLayout.invalidate();
    }

    private final void setInputLayout(TextView child) {
        this.inputView = child;
        if (child == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        child.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: JC.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                PdpTextInputLayout.updateLayout$default(PdpTextInputLayout.this, false, 1, null);
            }
        });
        child.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: JC.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PdpTextInputLayout.updateLayout$default(PdpTextInputLayout.this, false, 1, null);
            }
        });
        child.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout$setInputLayout$1$3
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable text) {
                Intrinsics.checkNotNullParameter(text, "text");
                PdpTextInputLayout.this.updateLayout(false);
                if (PdpTextInputLayout.this.getAutoClearError()) {
                    PdpTextInputLayout.this.setShowError(false);
                }
            }
        });
        child.setInputType(child.getInputType() | 524288);
        child.setTextAppearance(R$style.TextStyle_Body_L);
        child.setTextColor(androidx.core.content.a.getColorStateList(child.getContext(), R$color.pdp_input_text_color_edit_text));
        if (!this.isMultiline) {
            child.setMaxLines(1);
        }
        child.setBackground(null);
        child.setPadding(0, 0, 0, 0);
        child.setMinHeight(0);
        if (this.passwordToggleView.getVisibility() == 0) {
            this.passwordToggleView.setChecked(true);
        }
        this.hintPaint.setTextSize(this.focusedHintSize);
        Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
        float abs = Math.abs((fontMetrics.descent + fontMetrics.ascent) - fontMetrics.bottom);
        TextView textView = this.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) abs;
        TextView textView2 = this.inputView;
        if (textView2 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        textView2.getLayoutParams().width = 0;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        TextView textView3 = this.inputView;
        if (textView3 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView3.getId(), 6, 0, 6);
        TextView textView4 = this.inputView;
        if (textView4 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView4.getId(), 7, this.passwordToggleView.getId(), 6);
        TextView textView5 = this.inputView;
        if (textView5 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView5.getId(), 3, 0, 3);
        dVar.f(this);
        updateLayout(false);
    }

    private final float spToPx(float sp) {
        return TypedValue.applyDimension(2, sp, getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateLayout(boolean withAnimation) {
        boolean z11;
        TextView textView = this.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        if (!textView.isFocused()) {
            TextView textView2 = this.inputView;
            if (textView2 == null) {
                Intrinsics.n("inputView");
                throw null;
            }
            CharSequence text = textView2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() <= 0) {
                z11 = false;
                if (Boolean.valueOf(z11).equals(this.isHintRisen)) {
                    this.isHintRisen = Boolean.valueOf(z11);
                    if (z11) {
                        riseHint(withAnimation);
                    } else {
                        centerHint(withAnimation);
                    }
                    if (this.style == Style.STROKE) {
                        Paint paint = this.strokeBgPaint;
                        TextView textView3 = this.inputView;
                        if (textView3 != null) {
                            paint.setColor(textView3.isFocused() ? this.strokeFocusedColor : this.strokeUnfocusedColor);
                            return;
                        } else {
                            Intrinsics.n("inputView");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
        }
        z11 = true;
        if (Boolean.valueOf(z11).equals(this.isHintRisen)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateLayout$default(PdpTextInputLayout pdpTextInputLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        pdpTextInputLayout.updateLayout(z11);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof TextView) {
            setInputLayout((TextView) child);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(@NotNull Canvas canvas) {
        int i11;
        int i12;
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float width = getWidth();
        float height2 = getHeight();
        RectF rectF = this.bgRect;
        Style style = this.style;
        Style style2 = Style.STROKE;
        float f7 = style == style2 ? this.strokeWidth : 0.0f;
        float f11 = style == style2 ? this.strokeWidth : 0.0f;
        if (style == style2) {
            width -= this.strokeWidth;
        }
        if (style == style2) {
            height2 -= this.strokeWidth;
        }
        rectF.set(f7, f11, width, height2);
        Paint paint = this.bgPaint;
        if (isEnabled()) {
            TextView textView = this.inputView;
            if (textView == null) {
                Intrinsics.n("inputView");
                throw null;
            }
            if (textView.isEnabled()) {
                i11 = this.enabledBgColor;
                paint.setColor(i11);
                RectF rectF2 = this.bgRect;
                float f12 = this.bgCornerRadius;
                canvas.drawRoundRect(rectF2, f12, f12, this.style != Style.DEFAULT ? this.bgPaint : this.strokeBgPaint);
                if (this.showError) {
                    canvas.save();
                    this.bgRect.top = getHeight() - this.errorHeight;
                    canvas.clipRect(this.bgRect);
                    RectF rectF3 = this.bgRect;
                    rectF3.top = 0.0f;
                    float f13 = this.bgCornerRadius;
                    canvas.drawRoundRect(rectF3, f13, f13, this.errorBgPaint);
                    canvas.restore();
                }
                super.draw(canvas);
                this.hintPaint.setColor(getHintPaintColor());
                this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
                Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
                float abs = Math.abs(fontMetrics.descent + fontMetrics.ascent);
                i12 = WhenMappings.$EnumSwitchMapping$0[this.hintPosition.ordinal()];
                if (i12 != 1) {
                    height = (getHeight() / 2.0f) + (abs / 2);
                } else {
                    if (i12 != 2) {
                        throw new o();
                    }
                    height = dpToPx(13.0f) + abs;
                }
                Float evaluate = this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(height), (Number) Float.valueOf(abs + getPaddingTop()));
                String str = this._hint;
                int length = get_hint().length();
                float paddingLeft = getPaddingLeft();
                Intrinsics.f(evaluate);
                canvas.drawText(str, 0, length, paddingLeft, evaluate.floatValue(), this.hintPaint);
            }
        }
        i11 = this.disabledBgColor;
        paint.setColor(i11);
        RectF rectF22 = this.bgRect;
        float f122 = this.bgCornerRadius;
        canvas.drawRoundRect(rectF22, f122, f122, this.style != Style.DEFAULT ? this.bgPaint : this.strokeBgPaint);
        if (this.showError) {
        }
        super.draw(canvas);
        this.hintPaint.setColor(getHintPaintColor());
        this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
        Paint.FontMetrics fontMetrics2 = this.hintPaint.getFontMetrics();
        float abs2 = Math.abs(fontMetrics2.descent + fontMetrics2.ascent);
        i12 = WhenMappings.$EnumSwitchMapping$0[this.hintPosition.ordinal()];
        if (i12 != 1) {
        }
        Float evaluate2 = this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(height), (Number) Float.valueOf(abs2 + getPaddingTop()));
        String str2 = this._hint;
        int length2 = get_hint().length();
        float paddingLeft2 = getPaddingLeft();
        Intrinsics.f(evaluate2);
        canvas.drawText(str2, 0, length2, paddingLeft2, evaluate2.floatValue(), this.hintPaint);
    }

    public final boolean getAutoClearError() {
        return this.autoClearError;
    }

    @NotNull
    /* renamed from: getHint, reason: from getter */
    public final String get_hint() {
        return this._hint;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return !this.isEditable;
    }

    public final void setEditable(boolean z11) {
        this.isEditable = z11;
    }

    public final void setHint(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._hint = value;
        invalidate();
    }

    public final void setMultiline(boolean z11) {
        if (this.isMultiline != z11) {
            this.isMultiline = z11;
            if (z11) {
                TextView textView = this.inputView;
                if (textView != null) {
                    if (textView == null) {
                        Intrinsics.n("inputView");
                        throw null;
                    }
                    textView.setMaxLines(Integer.MAX_VALUE);
                }
                setMaxHeight(Integer.MAX_VALUE);
            } else {
                TextView textView2 = this.inputView;
                if (textView2 != null) {
                    if (textView2 == null) {
                        Intrinsics.n("inputView");
                        throw null;
                    }
                    textView2.setMaxLines(1);
                }
                setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
            }
            requestLayout();
        }
    }

    public final void setShowError(boolean z11) {
        if (z11 != this.showError) {
            this.showError = z11;
            invalidate();
        }
    }

    public /* synthetic */ PdpTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpTextInputLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.style = Style.DEFAULT;
        this.isEditable = true;
        this.hintAnimationProgress = 1.0f;
        this.floatEvaluator = new FloatEvaluator();
        float dpToPx = dpToPx(1.0f);
        this.strokeWidth = dpToPx;
        this.focusedHintSize = spToPx(12.0f);
        this.unfocusedHintSize = spToPx(18.0f);
        int themeColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        this.strokeUnfocusedColor = themeColor;
        this.strokeFocusedColor = ThemeExtKt.themeColor(context, R$attr.bgActionPrimary);
        this.bgRect = new RectF();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(themeColor);
        paint2.setStyle(style);
        this.errorBgPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(dpToPx);
        this.strokeBgPaint = paint3;
        this.errorHeight = context.getResources().getDimensionPixelSize(R$dimen.mobilization_input_error_width_selected);
        this._hint = "";
        this.hintPosition = HintPosition.CENTER;
        Paint paint4 = new Paint(1);
        paint4.setColor(ThemeExtKt.themeColor(context, R$attr.textSecondary));
        paint4.setTypeface(g.e(R$font.onest_regular, context));
        this.hintPaint = paint4;
        ToggleImageView toggleImageView = new ToggleImageView(context);
        toggleImageView.setId(R$id.passwordToggleView);
        try {
            toggleImageView.setImageDrawable(C7232a.a(context, R$drawable.mobilization_password_toggle));
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        toggleImageView.setToggleListener(new PdpTextInputLayout$passwordToggleView$1$1(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_password_toggle_size);
        addView(toggleImageView, new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        dVar.s(toggleImageView.getId(), 7, 0, 7);
        dVar.s(toggleImageView.getId(), 3, 0, 3);
        dVar.s(toggleImageView.getId(), 4, 0, 4);
        dVar.f(this);
        this.passwordToggleView = toggleImageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PdpTextInputLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.PdpTextInputLayout_pdptil_hint);
        this._hint = string != null ? string : "";
        this.autoClearError = obtainStyledAttributes.getBoolean(R$styleable.PdpTextInputLayout_pdptil_auto_clear_error, false);
        this.hintPosition = HintPosition.INSTANCE.fromInt(obtainStyledAttributes.getInteger(R$styleable.PdpTextInputLayout_pdptil_hintPosition, HintPosition.CENTER.getIntValue()));
        boolean z11 = obtainStyledAttributes.getBoolean(R$styleable.PdpTextInputLayout_pdptil_password_toggle, false);
        this.isEditable = obtainStyledAttributes.getBoolean(R$styleable.PdpTextInputLayout_pdptil_isEditable, true);
        setMultiline(obtainStyledAttributes.getBoolean(R$styleable.PdpTextInputLayout_pdptil_isMultiline, false));
        this.disabledBgColor = obtainStyledAttributes.getColor(R$styleable.PdpTextInputLayout_pdptil_disabledBackgroundColor, ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.enabledBgColor = obtainStyledAttributes.getColor(R$styleable.PdpTextInputLayout_pdptil_enabledBackgroundColor, ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.bgCornerRadius = obtainStyledAttributes.getDimension(R$styleable.PdpTextInputLayout_pdptil_corner_radius, dpToPx(6.0f));
        this.enabledHintColor = obtainStyledAttributes.getColor(R$styleable.PdpTextInputLayout_pdptil_enabledHintColor, ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.unfocusedHintSize = spToPx(obtainStyledAttributes.getFloat(R$styleable.PdpTextInputLayout_pdptil_unfocusedHintSize, 18.0f));
        toggleImageView.setVisibility(z11 ? 0 : 8);
        obtainStyledAttributes.recycle();
        setOnClickListener(new c(0, this, context));
        setWillNotDraw(false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_side_padding);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_top_padding);
        setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
        int minHeight = getMinHeight();
        Integer valueOf = minHeight == 0 ? null : Integer.valueOf(minHeight);
        setMinHeight(valueOf != null ? valueOf.intValue() : getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
        if (this.isMultiline) {
            return;
        }
        setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
    }
}
