package ru.ozon.uni.android.atom.text.expandable;

import QI.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.core.graphics.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.R$string;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.util.ContextsKt;
import ru.ozon.uni.android.util.movement.LinkOnlyMovementMethod;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001uB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u0011J7\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010\u0014J\u001b\u0010(\u001a\u00020\u000f*\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u000f*\u00020#2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-R*\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00106\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R*\u0010@\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b@\u0010\u0014\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00107\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00107R*\u0010K\u001a\u00020J2\u0006\u0010/\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bR\u0010F\"\u0004\bS\u0010HR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u00107R\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010X\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u00107\u001a\u0004\bY\u0010F\"\u0004\bZ\u0010HR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u00107\u001a\u0004\b_\u0010F\"\u0004\b`\u0010HR*\u0010a\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u00107\u001a\u0004\bb\u0010F\"\u0004\bc\u0010HR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010AR\u0016\u0010n\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010AR\u0014\u0010p\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010FR\u0014\u0010r\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010FR\u0014\u0010t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010F¨\u0006v"}, d2 = {"Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "x", "y", "", "scrollTo", "(II)V", "", "performLongClick", "()Z", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "changeSelectableState", "drawBacking", "(Landroid/graphics/Canvas;Landroid/graphics/Canvas;)V", "", "text", "drawText", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "moreTextColor", "I", "Lkotlin/Function0;", "onClickListener", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "defBackingColor", "isExpanded", "Z", "setExpanded", "(Z)V", "collapsedLines", "getCollapsedLines", "()I", "setCollapsedLines", "(I)V", "expandedLines", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "moreText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMoreText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "setMoreText", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "moreTextBottomPadding", "getMoreTextBottomPadding", "setMoreTextBottomPadding", "moreTextBoundsLeftPadding", "Landroid/graphics/Rect;", "moreTextBounds", "Landroid/graphics/Rect;", "moreTextStyle", "getMoreTextStyle", "setMoreTextStyle", "Landroid/text/TextPaint;", "moreTextPaint", "Landroid/text/TextPaint;", "moreBackingHeight", "getMoreBackingHeight", "setMoreBackingHeight", "moreBackgroundColor", "getMoreBackgroundColor", "setMoreBackgroundColor", "Landroid/graphics/drawable/GradientDrawable;", "moreBackingGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/view/animation/Interpolator;", "expandableInterpolator", "Landroid/view/animation/Interpolator;", "Landroid/animation/ValueAnimator;", "expandableAnimator", "Landroid/animation/ValueAnimator;", "areListenersInitialized", "hasLongClickPerformed", "getCollapsedHeight", "collapsedHeight", "getExpandedHeight", "expandedHeight", "getMoreTextWidth", "moreTextWidth", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpandableTextAtomView extends AppCompatTextView implements AtomView, AtomLocatableView {
    private boolean areListenersInitialized;
    private int collapsedLines;
    private final int defBackingColor;

    @NotNull
    private final ValueAnimator expandableAnimator;

    @NotNull
    private final Interpolator expandableInterpolator;
    private int expandedLines;
    private boolean hasLongClickPerformed;
    private boolean isExpanded;

    @NotNull
    private String locatorTag;
    private int moreBackgroundColor;

    @NotNull
    private final GradientDrawable moreBackingGradientDrawable;
    private int moreBackingHeight;

    @NotNull
    private OzonSpannableString moreText;
    private int moreTextBottomPadding;

    @NotNull
    private final Rect moreTextBounds;
    private int moreTextBoundsLeftPadding;
    private final int moreTextColor;

    @NotNull
    private final TextPaint moreTextPaint;
    private int moreTextStyle;
    private Function0<Unit> onClickListener;
    public static final int $stable = 8;

    public /* synthetic */ ExpandableTextAtomView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.ExpandableTextAtom_H1 : i12);
    }

    private final boolean changeSelectableState() {
        return post(new b(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeSelectableState$lambda$6(ExpandableTextAtomView expandableTextAtomView) {
        expandableTextAtomView.setTextIsSelectable(expandableTextAtomView.isExpanded || expandableTextAtomView.expandedLines <= expandableTextAtomView.collapsedLines);
        expandableTextAtomView.setClickable(true);
    }

    private final void drawBacking(Canvas canvas, Canvas canvas2) {
        this.moreBackingGradientDrawable.setBounds(((canvas.getWidth() - getMoreTextWidth()) - this.moreTextBoundsLeftPadding) - getPaddingRight(), (canvas.getHeight() - this.moreBackingHeight) - getPaddingBottom(), canvas.getWidth() - getPaddingRight(), (canvas.getHeight() - getPaddingBottom()) - ((int) getLineSpacingExtra()));
        this.moreBackingGradientDrawable.draw(canvas2);
    }

    private final void drawText(Canvas canvas, CharSequence charSequence) {
        canvas.drawText(charSequence, 0, charSequence.length(), (canvas.getWidth() - getMoreTextWidth()) - getPaddingRight(), getFirstBaselineToTopHeight() + ((this.collapsedLines - 1) * getLineHeight()), this.moreTextPaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandableAnimator$lambda$3$lambda$2(ExpandableTextAtomView expandableTextAtomView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getAnimatedValue() instanceof Integer) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            expandableTextAtomView.setHeight(((Integer) animatedValue).intValue());
        }
    }

    private final int getCollapsedHeight() {
        return Math.min(getExpandedHeight(), getPaddingBottom() + getPaddingTop() + (getLineHeight() * this.collapsedLines));
    }

    private final int getExpandedHeight() {
        return getPaddingBottom() + getPaddingTop() + (getLineHeight() * this.expandedLines);
    }

    private final int getMoreTextWidth() {
        return (int) this.moreTextPaint.measureText(this.moreText.toString());
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.isExpanded || getLineCount() <= this.collapsedLines) {
            return;
        }
        drawBacking(canvas, canvas);
        String obj = this.moreText.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        drawText(canvas, obj);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.areListenersInitialized) {
            return;
        }
        this.areListenersInitialized = true;
        addTextChangedListener(new TextWatcher() { // from class: ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView$onLayout$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                ExpandableTextAtomView expandableTextAtomView = ExpandableTextAtomView.this;
                expandableTextAtomView.expandedLines = expandableTextAtomView.getLineCount();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.expandedLines = getLineCount();
        setMeasuredDimension(widthMeasureSpec, this.isExpanded ? getExpandedHeight() : getCollapsedHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        LinkOnlyMovementMethod linkOnlyMovementMethod = LinkOnlyMovementMethod.INSTANCE;
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        boolean onTouchEvent = linkOnlyMovementMethod.onTouchEvent(this, OzonSpannableStringKt.toOzonSpannableString(text), event);
        boolean onTouchEvent2 = super.onTouchEvent(event);
        if (!onTouchEvent) {
            Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                if (!this.hasLongClickPerformed) {
                    setExpanded(!this.isExpanded);
                    Function0<Unit> function0 = this.onClickListener;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                this.hasLongClickPerformed = false;
            }
        }
        return onTouchEvent || onTouchEvent2;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        this.hasLongClickPerformed = true;
        return super.performLongClick();
    }

    @Override // android.view.View
    public void scrollTo(int x11, int y11) {
    }

    public final void setCollapsedLines(int i11) {
        this.collapsedLines = i11;
    }

    public final void setExpanded(boolean z11) {
        if (this.isExpanded == z11) {
            changeSelectableState();
            return;
        }
        this.isExpanded = z11;
        requestLayout();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ContextsKt.isAppOpenOnTV(context) || z11 == isTextSelectable()) {
            return;
        }
        changeSelectableState();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setMoreBackgroundColor(int i11) {
        this.moreBackgroundColor = i11;
        GradientDrawable gradientDrawable = this.moreBackingGradientDrawable;
        int f7 = c.f(i11, 0);
        int f11 = c.f(this.moreBackgroundColor, UserVerificationMethods.USER_VERIFY_PATTERN);
        int i12 = this.moreBackgroundColor;
        gradientDrawable.setColors(new int[]{f7, f11, i12, i12, i12});
        invalidate();
    }

    public final void setMoreBackingHeight(int i11) {
        this.moreBackingHeight = i11;
    }

    public final void setMoreText(@NotNull OzonSpannableString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.moreText = value;
        this.moreTextPaint.getTextBounds(value.toString(), 0, this.moreText.length(), this.moreTextBounds);
        this.moreTextPaint.setColor(this.moreTextColor);
    }

    public final void setMoreTextBottomPadding(int i11) {
        this.moreTextBottomPadding = i11;
    }

    public final void setMoreTextStyle(int i11) {
        this.moreTextStyle = i11;
        TextPaint textPaint = this.moreTextPaint;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextPaintExtKt.applyStyle(textPaint, context, this.moreTextStyle);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextAtomView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME;
        this.moreTextColor = a.getColor(context, R$color.text_tertiary);
        int color = a.getColor(context, R$color.layer_floor_1);
        this.defBackingColor = color;
        this.collapsedLines = 1;
        this.expandedLines = getLineCount();
        this.moreText = new OzonSpannableString();
        this.moreTextBoundsLeftPadding = UiExtKt.toPx(40);
        this.moreTextBounds = new Rect();
        this.moreTextStyle = -1;
        this.moreTextPaint = new TextPaint(1);
        this.moreBackgroundColor = color;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        int f7 = c.f(this.moreBackgroundColor, 0);
        int f11 = c.f(this.moreBackgroundColor, UserVerificationMethods.USER_VERIFY_PATTERN);
        int i13 = this.moreBackgroundColor;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{f7, f11, i13, i13, i13});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        this.moreBackingGradientDrawable = gradientDrawable;
        Interpolator a11 = androidx.core.view.animation.a.a(0.55f, 0.0f, 1.0f, 0.45f);
        Intrinsics.checkNotNullExpressionValue(a11, "create(...)");
        this.expandableInterpolator = a11;
        ValueAnimator ofInt = ValueAnimator.ofInt(getCollapsedHeight(), getExpandedHeight());
        ofInt.setDuration(200L);
        ofInt.setInterpolator(a11);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qk0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandableTextAtomView.expandableAnimator$lambda$3$lambda$2(ExpandableTextAtomView.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        this.expandableAnimator = ofInt;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextAtomView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setExpanded(obtainStyledAttributes.getBoolean(R$styleable.ExpandableTextAtomView_isExpanded, false));
        this.collapsedLines = obtainStyledAttributes.getInteger(R$styleable.ExpandableTextAtomView_collapsedLines, 1);
        String string = obtainStyledAttributes.getString(R$styleable.ExpandableTextAtomView_moreText);
        if (string == null) {
            string = context.getString(R$string.design_system_expandable_text_more);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        setMoreText(new OzonSpannableString(string));
        setMoreTextStyle(obtainStyledAttributes.getResourceId(R$styleable.ExpandableTextAtomView_moreTextAppearance, 0));
        this.moreBackingHeight = (int) obtainStyledAttributes.getDimension(R$styleable.ExpandableTextAtomView_moreBackingHeight, 0.0f);
        this.moreTextBottomPadding = (int) obtainStyledAttributes.getDimension(R$styleable.ExpandableTextAtomView_morePaddingBottom, 0.0f);
        setMoreBackgroundColor(obtainStyledAttributes.getColor(R$styleable.ExpandableTextAtomView_moreBackingColor, color));
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
    }
}
