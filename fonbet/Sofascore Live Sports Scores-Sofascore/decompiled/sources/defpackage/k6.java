package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class k6 extends o8 {
    public final gqc d;
    public Event e;
    public final joa f;
    public final joa g;
    public final joa h;
    public final joa i;
    public final AnimatorSet j;
    public boolean k;
    public float l;
    public float m;
    public Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        View root = getRoot();
        int i2 = R.id.arrow_left_1;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow_left_1, root);
        if (imageView != null) {
            i2 = R.id.arrow_left_2;
            ImageView imageView2 = (ImageView) nq8.B(R.id.arrow_left_2, root);
            if (imageView2 != null) {
                i2 = R.id.arrow_right_1;
                ImageView imageView3 = (ImageView) nq8.B(R.id.arrow_right_1, root);
                if (imageView3 != null) {
                    i2 = R.id.arrow_right_2;
                    ImageView imageView4 = (ImageView) nq8.B(R.id.arrow_right_2, root);
                    if (imageView4 != null) {
                        i2 = R.id.arrows_group;
                        Group group = (Group) nq8.B(R.id.arrows_group, root);
                        if (group != null) {
                            i2 = R.id.logo_player_first;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.logo_player_first, root);
                            if (shapeableImageView != null) {
                                i2 = R.id.logo_player_second;
                                ShapeableImageView shapeableImageView2 = (ShapeableImageView) nq8.B(R.id.logo_player_second, root);
                                if (shapeableImageView2 != null) {
                                    i2 = R.id.progress_view_first;
                                    View B = nq8.B(R.id.progress_view_first, root);
                                    if (B != null) {
                                        i2 = R.id.progress_view_second;
                                        View B2 = nq8.B(R.id.progress_view_second, root);
                                        if (B2 != null) {
                                            i2 = R.id.slider;
                                            TextView textView = (TextView) nq8.B(R.id.slider, root);
                                            if (textView != null) {
                                                i2 = R.id.slider_container;
                                                ImageView imageView5 = (ImageView) nq8.B(R.id.slider_container, root);
                                                if (imageView5 != null) {
                                                    i2 = R.id.text_player_name_first;
                                                    TextView textView2 = (TextView) nq8.B(R.id.text_player_name_first, root);
                                                    if (textView2 != null) {
                                                        i2 = R.id.text_player_name_second;
                                                        TextView textView3 = (TextView) nq8.B(R.id.text_player_name_second, root);
                                                        if (textView3 != null) {
                                                            i2 = R.id.text_vote_result_first;
                                                            TextView textView4 = (TextView) nq8.B(R.id.text_vote_result_first, root);
                                                            if (textView4 != null) {
                                                                i2 = R.id.text_vote_result_second;
                                                                TextView textView5 = (TextView) nq8.B(R.id.text_vote_result_second, root);
                                                                if (textView5 != null) {
                                                                    i2 = R.id.text_vs;
                                                                    if (((TextView) nq8.B(R.id.text_vs, root)) != null) {
                                                                        i2 = R.id.text_your_vote_first;
                                                                        TextView textView6 = (TextView) nq8.B(R.id.text_your_vote_first, root);
                                                                        if (textView6 != null) {
                                                                            i2 = R.id.text_your_vote_second;
                                                                            TextView textView7 = (TextView) nq8.B(R.id.text_your_vote_second, root);
                                                                            if (textView7 != null) {
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) root;
                                                                                this.d = new gqc(constraintLayout, imageView, imageView2, imageView3, imageView4, group, shapeableImageView, shapeableImageView2, B, B2, textView, imageView5, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                                c6 c6Var = new c6(context, i);
                                                                                ysa ysaVar = ysa.c;
                                                                                this.f = ypa.a(ysaVar, c6Var);
                                                                                int i3 = 1;
                                                                                this.g = ypa.a(ysaVar, new c6(context, i3));
                                                                                this.h = ypa.a(ysaVar, new c6(context, 2));
                                                                                this.i = ypa.a(ysaVar, new j4(i3, context, this));
                                                                                this.j = new AnimatorSet();
                                                                                constraintLayout.getClass();
                                                                                constraintLayout.setVisibility(4);
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final u13 getColorInterpolator() {
        return (u13) this.i.getValue();
    }

    private final int getColorNeutralDefault() {
        return ((Number) this.h.getValue()).intValue();
    }

    private final int getColorPrimaryDefault() {
        return ((Number) this.f.getValue()).intValue();
    }

    private final int getColorSuccess() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final float getSliderContainerMiddle() {
        return (this.l + this.m) / 2.0f;
    }

    private final double getVotingPointsThreshold() {
        return ((this.m - this.l) / 4.0f) * 0.8d;
    }

    public static final u13 j(Context context, k6 k6Var) {
        return new u13(context, k6Var.getColorSuccess(), k6Var.getColorNeutralDefault(), k6Var.getColorSuccess());
    }

    public static final void p(final k6 k6Var, MotionEvent motionEvent) {
        gqc gqcVar = k6Var.d;
        int action = motionEvent.getAction();
        final int i = 1;
        if (action == 0) {
            float f = k6Var.l;
            AnimatorSet animatorSet = k6Var.j;
            float f2 = k6Var.m;
            float x = motionEvent.getX();
            if (f > x || x > f2) {
                return;
            }
            k6Var.k = true;
            gqcVar.a.requestDisallowInterceptTouchEvent(true);
            animatorSet.removeAllListeners();
            animatorSet.end();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (k6Var.k) {
                    k6Var.setDragValues(llf.b(motionEvent.getX(), k6Var.l, k6Var.m));
                    return;
                }
                return;
            } else if (action != 3) {
                return;
            }
        }
        if (k6Var.k) {
            final int i2 = 0;
            k6Var.k = false;
            TextView textView = gqcVar.k;
            TextView textView2 = gqcVar.k;
            Integer num = ((double) Math.abs(textView.getX() - k6Var.l)) < k6Var.getVotingPointsThreshold() ? 1 : ((double) Math.abs(textView2.getX() - k6Var.m)) < k6Var.getVotingPointsThreshold() ? 2 : ((double) Math.abs(textView2.getX() - k6Var.getSliderContainerMiddle())) < k6Var.getVotingPointsThreshold() ? 0 : null;
            if (num == null) {
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(textView2.getX(), k6Var.getSliderContainerMiddle());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i3 = i;
                        k6 k6Var2 = k6Var;
                        ValueAnimator valueAnimator2 = ofFloat;
                        switch (i3) {
                            case 0:
                                k6.q(valueAnimator2, k6Var2, valueAnimator);
                                break;
                            default:
                                k6.r(valueAnimator2, k6Var2, valueAnimator);
                                break;
                        }
                    }
                });
                ofFloat.addListener(new j6(k6Var, i2));
                ofFloat.start();
                return;
            }
            if (!k6Var.getCanChangeVote() && num.intValue() != 0) {
                gqcVar.a.setEnabled(false);
            }
            int intValue = num.intValue();
            final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(textView2.getX(), intValue != 1 ? intValue != 2 ? k6Var.getSliderContainerMiddle() : k6Var.m : k6Var.l);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    k6 k6Var2 = k6Var;
                    ValueAnimator valueAnimator2 = ofFloat2;
                    switch (i3) {
                        case 0:
                            k6.q(valueAnimator2, k6Var2, valueAnimator);
                            break;
                        default:
                            k6.r(valueAnimator2, k6Var2, valueAnimator);
                            break;
                    }
                }
            });
            ofFloat2.addListener(new i6(i2, num, k6Var));
            ofFloat2.start();
        }
    }

    public static final void q(ValueAnimator valueAnimator, k6 k6Var, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        k6Var.setDragValues(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final void r(ValueAnimator valueAnimator, k6 k6Var, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        k6Var.setDragValues(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private final void setDragValues(float f) {
        float f2;
        float f3;
        if (f < getSliderContainerMiddle()) {
            f2 = 1.0f - ((f - this.l) / (getSliderContainerMiddle() - this.l));
        } else if (f > getSliderContainerMiddle()) {
            float f4 = this.m;
            f2 = 1.0f - ((f4 - f) / (f4 - getSliderContainerMiddle()));
        } else {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        gqc gqcVar = this.d;
        TextView textView = gqcVar.k;
        TextView textView2 = gqcVar.q;
        TextView textView3 = gqcVar.n;
        ShapeableImageView shapeableImageView = gqcVar.h;
        TextView textView4 = gqcVar.r;
        TextView textView5 = gqcVar.m;
        ShapeableImageView shapeableImageView2 = gqcVar.g;
        ImageView imageView = gqcVar.c;
        ImageView imageView2 = gqcVar.b;
        ImageView imageView3 = gqcVar.e;
        ImageView imageView4 = gqcVar.d;
        TextView textView6 = gqcVar.k;
        textView.setTranslationX(f - getSliderContainerMiddle());
        Drawable mutate = textView6.getBackground().mutate();
        u13 colorInterpolator = getColorInterpolator();
        int i = colorInterpolator.c;
        int i2 = colorInterpolator.b;
        int i3 = colorInterpolator.d;
        Context context = colorInterpolator.a;
        if (-1.0f > f2 || f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (hkg.c0(context)) {
                i3 = i2;
            }
            f3 = f2;
        } else {
            f3 = f2 + 1.0f;
            if (!hkg.c0(context)) {
                i3 = i2;
            }
            i = i3;
            i3 = i;
        }
        int i4 = i3;
        float f5 = f2;
        mutate.setTint(Color.rgb(wzb.b((Color.red(i3) - r5) * f3) + Color.red(i), wzb.b((Color.green(i4) - r5) * f3) + Color.green(i), wzb.b(f3 * (Color.blue(i4) - r3)) + Color.blue(i)));
        boolean z = textView6.getTranslationX() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Context context2 = getContext();
        context2.getClass();
        if (z ^ hkg.c0(context2)) {
            imageView4.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            imageView3.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            imageView2.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            imageView.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            shapeableImageView2.setAlpha(1.0f - (Math.abs(f5) / 2.0f));
            textView5.setAlpha(1.0f - (Math.abs(f5) / 2.0f));
            textView4.setAlpha(Math.abs(f5));
            shapeableImageView.setAlpha(1.0f);
            textView3.setAlpha(1.0f);
            textView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        boolean z2 = textView6.getTranslationX() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Context context3 = getContext();
        context3.getClass();
        if (hkg.c0(context3) ^ z2) {
            imageView2.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            imageView.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            imageView4.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            imageView3.setAlpha(1.0f - (Math.abs(f5) * 2.0f));
            shapeableImageView.setAlpha(1.0f - (Math.abs(f5) / 2.0f));
            textView3.setAlpha(1.0f - (Math.abs(f5) / 2.0f));
            textView2.setAlpha(Math.abs(f5));
            shapeableImageView2.setAlpha(1.0f);
            textView5.setAlpha(1.0f);
            textView4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @NotNull
    public final gqc getBinding() {
        return this.d;
    }

    public abstract boolean getCanChangeVote();

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_post_match_voting_motion_view;
    }

    public abstract void n(MmaPostMatchVotingOptions mmaPostMatchVotingOptions);

    public final void o(Event event, Function1 function1, boolean z) {
        event.getClass();
        this.e = event;
        this.n = function1;
        final int i = 0;
        final int i2 = 1;
        gqc gqcVar = this.d;
        if (z) {
            ConstraintLayout constraintLayout = gqcVar.a;
            constraintLayout.setEnabled(true);
            constraintLayout.setAlpha(1.0f);
            ValueAnimator ofArgb = ValueAnimator.ofArgb(getColorNeutralDefault(), getColorPrimaryDefault(), getColorPrimaryDefault(), getColorNeutralDefault(), getColorNeutralDefault());
            ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d6
                public final /* synthetic */ k6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    k6 k6Var = this.b;
                    Object i4 = fn0.i(valueAnimator);
                    switch (i3) {
                        case 0:
                            int intValue = ((Integer) i4).intValue();
                            gqc gqcVar2 = k6Var.d;
                            gqcVar2.c.setColorFilter(intValue);
                            gqcVar2.e.setColorFilter(intValue);
                            break;
                        default:
                            int intValue2 = ((Integer) i4).intValue();
                            gqc gqcVar3 = k6Var.d;
                            gqcVar3.b.setColorFilter(intValue2);
                            gqcVar3.d.setColorFilter(intValue2);
                            break;
                    }
                }
            });
            ofArgb.setRepeatCount(-1);
            ofArgb.setRepeatMode(1);
            ofArgb.setDuration(1500L);
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(getColorNeutralDefault(), getColorNeutralDefault(), getColorPrimaryDefault(), getColorPrimaryDefault(), getColorNeutralDefault());
            ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d6
                public final /* synthetic */ k6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i;
                    k6 k6Var = this.b;
                    Object i4 = fn0.i(valueAnimator);
                    switch (i3) {
                        case 0:
                            int intValue = ((Integer) i4).intValue();
                            gqc gqcVar2 = k6Var.d;
                            gqcVar2.c.setColorFilter(intValue);
                            gqcVar2.e.setColorFilter(intValue);
                            break;
                        default:
                            int intValue2 = ((Integer) i4).intValue();
                            gqc gqcVar3 = k6Var.d;
                            gqcVar3.b.setColorFilter(intValue2);
                            gqcVar3.d.setColorFilter(intValue2);
                            break;
                    }
                }
            });
            ofArgb2.setRepeatCount(-1);
            ofArgb2.setRepeatMode(1);
            ofArgb2.setDuration(1500L);
            Animator[] animatorArr = {ofArgb, ofArgb2};
            AnimatorSet animatorSet = this.j;
            animatorSet.playTogether(animatorArr);
            animatorSet.start();
            gqcVar.a.setOnTouchListener(new f6(this, i));
            g6b t = qea.t(this);
            if (t != null) {
                t.a(new h6(t, this, this, i));
            }
        }
        gqcVar.a.getViewTreeObserver().addOnGlobalLayoutListener(new e6(0, this));
        ShapeableImageView shapeableImageView = gqcVar.g;
        Event event2 = this.e;
        if (event2 == null) {
            Intrinsics.i("event");
            throw null;
        }
        int id = Event.getHomeTeam$default(event2, null, 1, null).getId();
        Event event3 = this.e;
        if (event3 == null) {
            Intrinsics.i("event");
            throw null;
        }
        as9.d(shapeableImageView, id, Event.getHomeTeam$default(event3, null, 1, null).getGender(), false);
        ShapeableImageView shapeableImageView2 = gqcVar.h;
        Event event4 = this.e;
        if (event4 == null) {
            Intrinsics.i("event");
            throw null;
        }
        int id2 = Event.getAwayTeam$default(event4, null, 1, null).getId();
        Event event5 = this.e;
        if (event5 == null) {
            Intrinsics.i("event");
            throw null;
        }
        as9.d(shapeableImageView2, id2, Event.getAwayTeam$default(event5, null, 1, null).getGender(), false);
        TextView textView = gqcVar.m;
        Event event6 = this.e;
        if (event6 == null) {
            Intrinsics.i("event");
            throw null;
        }
        Team homeTeam$default = Event.getHomeTeam$default(event6, null, 1, null);
        Context context = getContext();
        context.getClass();
        textView.setText(tba.A(context, homeTeam$default));
        TextView textView2 = gqcVar.n;
        Event event7 = this.e;
        if (event7 == null) {
            Intrinsics.i("event");
            throw null;
        }
        Team awayTeam$default = Event.getAwayTeam$default(event7, null, 1, null);
        Context context2 = getContext();
        context2.getClass();
        textView2.setText(tba.A(context2, awayTeam$default));
        gqcVar.a.post(new y2(this, i2));
    }

    public void l() {
    }
}
