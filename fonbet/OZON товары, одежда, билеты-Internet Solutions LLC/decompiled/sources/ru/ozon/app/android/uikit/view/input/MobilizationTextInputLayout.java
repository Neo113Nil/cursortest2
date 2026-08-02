package ru.ozon.app.android.uikit.view.input;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.o;
import Xc.a;
import Xc.b;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import iw.C7231a;
import j.C7232a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$styleable;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$font;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;
import wx.C10570a;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 j2\u00020\u0001:\u0002jkB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J\u001b\u0010*\u001a\u00020\u0006*\u00020\u00062\u0006\u0010)\u001a\u00020#H\u0002¢\u0006\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u0010 R*\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b1\u0010.\"\u0004\b2\u0010 R(\u00103\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010-\u0012\u0004\b6\u00107\u001a\u0004\b4\u0010.\"\u0004\b5\u0010 R\"\u00108\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b9\u0010.\"\u0004\b:\u0010 R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010@R\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010NR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R$\u0010f\u001a\u00020O2\u0006\u00100\u001a\u00020O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/widget/TextView;", "setInputLayout", "(Landroid/widget/TextView;)V", "withAnimation", "updateLayout", "(Z)V", "riseHint", "centerHint", "", "sp", "spToPx", "(F)F", "dp", "dpToPx", "alpha", "changeAlpha", "(IF)I", "isEditable", "Z", "()Z", "setEditable", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isMultiline", "setMultiline", "showError", "getShowError", "setShowError", "getShowError$annotations", "()V", "autoClearError", "getAutoClearError", "setAutoClearError", "inputView", "Landroid/widget/TextView;", "isHintRisen", "Ljava/lang/Boolean;", "hintAnimationProgress", "F", "Landroid/animation/FloatEvaluator;", "floatEvaluator", "Landroid/animation/FloatEvaluator;", "focusedHintSize", "unfocusedHintSize", "enabledBgColor", "I", "bgCornerRadius", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "", "_hint", "Ljava/lang/String;", "Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout$HintPosition;", "hintPosition", "Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout$HintPosition;", "hintPaint", "Landroid/animation/ValueAnimator;", "hintAnimation", "Landroid/animation/ValueAnimator;", "Lru/ozon/app/android/uikit/view/input/ToggleImageView;", "passwordToggleView", "Lru/ozon/app/android/uikit/view/input/ToggleImageView;", "Landroid/content/res/ColorStateList;", "textColor$delegate", "LSc/j;", "getTextColor", "()Landroid/content/res/ColorStateList;", "textColor", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "hint", "getHintPaintColor", "()I", "hintPaintColor", "Companion", "HintPosition", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MobilizationTextInputLayout extends ConstraintLayout {

    @NotNull
    private String _hint;
    private boolean autoClearError;
    private final float bgCornerRadius;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final RectF bgRect;
    private final int enabledBgColor;

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

    /* renamed from: textColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textColor;
    private final float unfocusedHintSize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout$HintPosition;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "CENTER", "TOP", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HintPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HintPosition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int intValue;
        public static final HintPosition CENTER = new HintPosition("CENTER", 0, 0);
        public static final HintPosition TOP = new HintPosition("TOP", 1, 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout$HintPosition$Companion;", "", "<init>", "()V", "fromInt", "Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout$HintPosition;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public MobilizationTextInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(MobilizationTextInputLayout mobilizationTextInputLayout, Context context, View view) {
        TextView textView = mobilizationTextInputLayout.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        textView.requestFocus();
        Object systemService = context.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        TextView textView2 = mobilizationTextInputLayout.inputView;
        if (textView2 != null) {
            inputMethodManager.showSoftInput(textView2, 1);
        } else {
            Intrinsics.n("inputView");
            throw null;
        }
    }

    private final void centerHint(boolean withAnimation) {
        int i11 = 1;
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
        ofFloat.addUpdateListener(new C10570a(this, i11));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void centerHint$lambda$15$lambda$14(MobilizationTextInputLayout mobilizationTextInputLayout, ValueAnimator valueAnimator) {
        mobilizationTextInputLayout.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        mobilizationTextInputLayout.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int changeAlpha(int i11, float f7) {
        return (i11 & 16777215) | (((int) (h.d(f7, 0.0f, 1.0f) * 255)) << 24);
    }

    private final float dpToPx(float dp) {
        return TypedValue.applyDimension(1, dp, getContext().getResources().getDisplayMetrics());
    }

    private final int getHintPaintColor() {
        if (isEnabled()) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return styleParser.parseColor(context, UniColors.TEXT_TERTIARY.getToken(), R$color.oz_gray_60);
        }
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser2.parseColor(context2, UniColors.TEXT_TERTIARY.getToken());
        return parseColor != null ? changeAlpha(parseColor.intValue(), 0.4f) : androidx.core.content.a.getColor(getContext(), ru.ozon.app.android.uikit.R$color.mobilization_input_layout_hint_disable_color);
    }

    private final ColorStateList getTextColor() {
        return (ColorStateList) this.textColor.getValue();
    }

    private final void riseHint(boolean withAnimation) {
        int i11 = 1;
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
        ofFloat.addUpdateListener(new C7231a(this, i11));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void riseHint$lambda$13$lambda$12(MobilizationTextInputLayout mobilizationTextInputLayout, ValueAnimator valueAnimator) {
        mobilizationTextInputLayout.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        mobilizationTextInputLayout.invalidate();
    }

    private final void setInputLayout(TextView child) {
        this.inputView = child;
        if (child == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        child.addOnLayoutChangeListener(new AP.b(this, 3));
        child.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: yX.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                MobilizationTextInputLayout.updateLayout$default(MobilizationTextInputLayout.this, false, 1, null);
            }
        });
        child.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout$setInputLayout$1$3
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                MobilizationTextInputLayout.this.updateLayout(false);
            }
        });
        child.setInputType(child.getInputType() | 524288);
        child.setTextAppearance(R$style.TextStyle_Body_L);
        child.setTextColor(getTextColor());
        if (!this.isMultiline) {
            child.setMaxLines(1);
        }
        child.setBackground(null);
        child.setPadding(0, 0, 0, 0);
        child.setMinHeight(0);
        if (Build.VERSION.SDK_INT >= 29) {
            child.setTextCursorDrawable(g.d(child.getResources(), R$drawable.text_area_cursor, child.getContext().getTheme()));
        }
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
        d dVar = new d();
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
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
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
                        return;
                    } else {
                        centerHint(withAnimation);
                        return;
                    }
                }
                return;
            }
        }
        z11 = true;
        if (Boolean.valueOf(z11).equals(this.isHintRisen)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateLayout$default(MobilizationTextInputLayout mobilizationTextInputLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        mobilizationTextInputLayout.updateLayout(z11);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof TextView) {
            setInputLayout((TextView) child);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.bgRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.bgPaint.setColor(this.enabledBgColor);
        RectF rectF = this.bgRect;
        float f7 = this.bgCornerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.bgPaint);
        super.draw(canvas);
        this.hintPaint.setColor(getHintPaintColor());
        this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
        Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
        float abs = Math.abs(fontMetrics.descent + fontMetrics.ascent);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.hintPosition.ordinal()];
        if (i11 == 1) {
            height = (getHeight() / 2.0f) + (abs / 2);
        } else {
            if (i11 != 2) {
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
        this.showError = z11;
    }

    public /* synthetic */ MobilizationTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilizationTextInputLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        float dimensionPixelSize;
        Intrinsics.checkNotNullParameter(context, "context");
        this.isEditable = true;
        this.hintAnimationProgress = 1.0f;
        this.floatEvaluator = new FloatEvaluator();
        this.focusedHintSize = spToPx(12.0f);
        this.unfocusedHintSize = spToPx(18.0f);
        if (UniGlobalConfigKt.getRoundCornersFlag(context)) {
            dimensionPixelSize = ResourceExtKt.toPxF(16, context);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mobilization_input_bg_radius);
        }
        this.bgCornerRadius = dimensionPixelSize;
        this.bgRect = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.bgPaint = paint;
        this._hint = "";
        this.hintPosition = HintPosition.CENTER;
        Paint paint2 = new Paint(1);
        paint2.setColor(StyleParser.INSTANCE.parseColor(context, UniColors.BG_SECONDARY.getToken(), R$color.oz_gray_60));
        paint2.setTypeface(g.e(R$font.onest_regular, context));
        this.hintPaint = paint2;
        ToggleImageView toggleImageView = new ToggleImageView(context);
        toggleImageView.setId(R$id.passwordToggleView);
        try {
            toggleImageView.setImageDrawable(C7232a.a(context, ru.ozon.app.android.uikit.R$drawable.mobilization_password_toggle));
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        toggleImageView.setToggleListener(new MobilizationTextInputLayout$passwordToggleView$1$1(this));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_password_toggle_size);
        addView(toggleImageView, new ViewGroup.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
        d dVar = new d();
        dVar.p(this);
        dVar.s(toggleImageView.getId(), 7, 0, 7);
        dVar.s(toggleImageView.getId(), 3, 0, 3);
        dVar.s(toggleImageView.getId(), 4, 0, 4);
        dVar.f(this);
        this.passwordToggleView = toggleImageView;
        this.textColor = LazyUtilsKt.unsafeLazy(new MobilizationTextInputLayout$textColor$2(context, this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MobilizationTextInputLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.MobilizationTextInputLayout_mtil_hint);
        this._hint = string != null ? string : "";
        this.autoClearError = obtainStyledAttributes.getBoolean(R$styleable.MobilizationTextInputLayout_mtil_auto_clear_error, false);
        this.hintPosition = HintPosition.INSTANCE.fromInt(obtainStyledAttributes.getInteger(R$styleable.MobilizationTextInputLayout_mtil_hintPosition, HintPosition.CENTER.getIntValue()));
        boolean z11 = obtainStyledAttributes.getBoolean(R$styleable.MobilizationTextInputLayout_mtil_password_toggle, false);
        this.isEditable = obtainStyledAttributes.getBoolean(R$styleable.MobilizationTextInputLayout_mtil_isEditable, true);
        setMultiline(obtainStyledAttributes.getBoolean(R$styleable.MobilizationTextInputLayout_mtil_isMultiline, false));
        this.enabledBgColor = obtainStyledAttributes.getColor(R$styleable.MobilizationTextInputLayout_mtil_enabledBackgroundColor, StyleParser.INSTANCE.parseColor(context, UniColors.BG_SECONDARY.getToken(), R$color.oz_semantic_bg_primary));
        toggleImageView.setVisibility(z11 ? 0 : 8);
        obtainStyledAttributes.recycle();
        setOnClickListener(new GD.b(9, this, context));
        setWillNotDraw(false);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_side_padding);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_top_padding);
        setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        int minHeight = getMinHeight();
        Integer valueOf = minHeight == 0 ? null : Integer.valueOf(minHeight);
        setMinHeight(valueOf != null ? valueOf.intValue() : getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
        if (this.isMultiline) {
            return;
        }
        setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
    }
}
