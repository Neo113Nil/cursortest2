package spay.sdk.view;

import H2.b;
import JL.a;
import Ve.De;
import Ve.E;
import Ve.Ni;
import Ve.ViewTreeObserverOnGlobalLayoutListenerC4447mi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;
import spay.sdk.R;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lspay/sdk/view/SpayDotsLoaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/animation/TranslateAnimation;", "getTranslateAnim", "()Landroid/view/animation/TranslateAnimation;", "d", "I", "getDotsColor", "()I", "setDotsColor", "(I)V", "dotsColor", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpayDotsLoaderView extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f98884m = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f98885a;

    /* renamed from: b, reason: collision with root package name */
    public int f98886b;

    /* renamed from: c, reason: collision with root package name */
    public int f98887c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int dotsColor;

    /* renamed from: e, reason: collision with root package name */
    public int f98889e;

    /* renamed from: f, reason: collision with root package name */
    public int f98890f;

    /* renamed from: g, reason: collision with root package name */
    public int f98891g;

    /* renamed from: h, reason: collision with root package name */
    public De f98892h;

    /* renamed from: i, reason: collision with root package name */
    public De f98893i;

    /* renamed from: j, reason: collision with root package name */
    public De f98894j;

    /* renamed from: k, reason: collision with root package name */
    public int f98895k;

    /* renamed from: l, reason: collision with root package name */
    public int f98896l;

    public SpayDotsLoaderView(Context context) {
        super(context);
        this.f98885a = CounterView.COUNTER_MAX_DEFAULT;
        new LinearInterpolator();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        this.dotsColor = E.b(resources, R.color.spay_loader_dot_default);
        this.f98895k = 100;
        this.f98896l = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        a();
    }

    private final TranslateAnimation getTranslateAnim() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -(this.f98886b * 3));
        translateAnimation.setDuration(this.f98885a);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(1);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setInterpolator(translateAnimation.getInterpolator());
        return translateAnimation;
    }

    public final void a(AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.SpayDotsLoaderView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…SpayDotsLoaderView, 0, 0)");
        this.f98886b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_radius, getResources().getDimensionPixelSize(R.dimen.spay_loader_dot_size));
        this.f98887c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_dist, getResources().getDimensionPixelSize(R.dimen.spay_loader_dot_distance));
        int i11 = R.styleable.SpayDotsLoaderView_spay_loader_first_dot_color;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        this.f98889e = obtainStyledAttributes.getColor(i11, E.b(resources, R.color.spay_loader_dot_default));
        int i12 = R.styleable.SpayDotsLoaderView_spay_loader_second_dot_color;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        this.f98890f = obtainStyledAttributes.getColor(i12, E.b(resources2, R.color.spay_loader_dot_default));
        int i13 = R.styleable.SpayDotsLoaderView_spay_loader_third_dot_color;
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "resources");
        this.f98891g = obtainStyledAttributes.getColor(i13, E.b(resources3, R.color.spay_loader_dot_default));
        obtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_view_height, getResources().getDimensionPixelSize(R.dimen.spay_loader_dots_view_height));
        obtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_view_width, getResources().getDimensionPixelSize(R.dimen.spay_loader_dots_view_width));
        this.f98885a = obtainStyledAttributes.getInt(R.styleable.SpayDotsLoaderView_spay_loader_anim_duration, CounterView.COUNTER_MAX_DEFAULT);
        Intrinsics.checkNotNullExpressionValue(AnimationUtils.loadInterpolator(getContext(), obtainStyledAttributes.getResourceId(R.styleable.SpayDotsLoaderView_spay_loader_interpolator, android.R.anim.linear_interpolator)), "loadInterpolator(\n      …r\n            )\n        )");
        this.f98895k = obtainStyledAttributes.getInt(R.styleable.SpayDotsLoaderView_spay_loader_first_delay_duration, 100);
        this.f98896l = obtainStyledAttributes.getInt(R.styleable.SpayDotsLoaderView_spay_loader_second_delay_duration, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        obtainStyledAttributes.recycle();
    }

    public final void b() {
        TranslateAnimation translateAnim = getTranslateAnim();
        De de2 = this.f98892h;
        if (de2 == null) {
            Intrinsics.n("firstCircle");
            throw null;
        }
        de2.startAnimation(translateAnim);
        new Handler(Looper.getMainLooper()).postDelayed(new a(1, this, getTranslateAnim()), this.f98895k);
        TranslateAnimation translateAnim2 = getTranslateAnim();
        new Handler(Looper.getMainLooper()).postDelayed(new b(1, this, translateAnim2), this.f98896l);
        translateAnim2.setAnimationListener(new Ni(this));
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int i13 = this.f98886b;
        setMeasuredDimension(((this.f98887c * 2) + (i13 * 7)) * 2, i13 * 14);
    }

    public final void setDotsColor(int i11) {
        this.dotsColor = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayDotsLoaderView(Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f98885a = CounterView.COUNTER_MAX_DEFAULT;
        new LinearInterpolator();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        this.dotsColor = E.b(resources, R.color.spay_loader_dot_default);
        this.f98895k = 100;
        this.f98896l = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        a(attrs);
        a();
    }

    public static final void b(SpayDotsLoaderView this$0, TranslateAnimation trans3Anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trans3Anim, "$trans3Anim");
        De de2 = this$0.f98894j;
        if (de2 != null) {
            de2.startAnimation(trans3Anim);
        } else {
            Intrinsics.n("thirdCircle");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayDotsLoaderView(Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f98885a = CounterView.COUNTER_MAX_DEFAULT;
        new LinearInterpolator();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        this.dotsColor = E.b(resources, R.color.spay_loader_dot_default);
        this.f98895k = 100;
        this.f98896l = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        a(attrs);
        a();
    }

    public final void a() {
        removeAllViews();
        removeAllViewsInLayout();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f98892h = new De(context, this.f98886b, this.f98889e);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f98893i = new De(context2, this.f98886b, this.f98890f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        this.f98894j = new De(context3, this.f98886b, this.f98891g);
        int i11 = this.f98886b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11 * 2, i11 * 3);
        layoutParams.leftMargin = this.f98887c;
        setVerticalGravity(80);
        View view = this.f98892h;
        if (view != null) {
            addView(view);
            View view2 = this.f98893i;
            if (view2 != null) {
                addView(view2, layoutParams);
                View view3 = this.f98894j;
                if (view3 != null) {
                    addView(view3, layoutParams);
                    getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4447mi(this, this));
                    return;
                } else {
                    Intrinsics.n("thirdCircle");
                    throw null;
                }
            }
            Intrinsics.n("secondCircle");
            throw null;
        }
        Intrinsics.n("firstCircle");
        throw null;
    }

    public static final void a(SpayDotsLoaderView this$0, TranslateAnimation trans2Anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trans2Anim, "$trans2Anim");
        De de2 = this$0.f98893i;
        if (de2 != null) {
            de2.startAnimation(trans2Anim);
        } else {
            Intrinsics.n("secondCircle");
            throw null;
        }
    }
}
