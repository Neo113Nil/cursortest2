package ag;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;

/* renamed from: ag.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1968g0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public TextView f15639Q4;

    /* renamed from: R4, reason: collision with root package name */
    public View f15640R4;

    /* renamed from: S4, reason: collision with root package name */
    public View f15641S4;

    /* renamed from: T4, reason: collision with root package name */
    public View f15642T4;

    /* renamed from: U4, reason: collision with root package name */
    public AnimatorSet f15643U4;

    public C1968g0(View view, ViewGroup viewGroup) {
        super(view);
        K1(viewGroup);
        this.f15640R4 = view.findViewById(od.q.f60308K8);
        this.f15641S4 = view.findViewById(od.q.f60318L8);
        this.f15642T4 = view.findViewById(od.q.f60328M8);
        GradientDrawable c10 = com.zoho.livechat.android.utils.P.c(1, com.zoho.livechat.android.utils.P.e(this.f15640R4.getContext(), R.attr.textColorTertiary));
        this.f15640R4.setBackground(c10);
        this.f15641S4.setBackground(c10);
        this.f15642T4.setBackground(c10);
        if (com.zoho.livechat.android.utils.P.k(this.f15640R4.getContext()) == 1) {
            this.f15639Q4 = (TextView) view.findViewById(od.q.f60338N8);
            String string = d0().getResources().getString(od.t.f61126v0);
            this.f15639Q4.setText(string.substring(0, 1).toUpperCase() + string.substring(1));
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        AnimatorSet animatorSet = this.f15643U4;
        if (animatorSet != null && animatorSet.isRunning()) {
            Z1();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f15640R4, ViewProps.SCALE_X, 1.0f, 1.6f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f15640R4, ViewProps.SCALE_Y, 1.0f, 1.6f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f15641S4, ViewProps.SCALE_X, 1.0f, 1.6f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f15641S4, ViewProps.SCALE_Y, 1.0f, 1.6f, 1.0f);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ofFloat3, ofFloat4);
        animatorSet3.setStartDelay(250L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f15642T4, ViewProps.SCALE_X, 1.0f, 1.6f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f15642T4, ViewProps.SCALE_Y, 1.0f, 1.6f, 1.0f);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ofFloat5, ofFloat6);
        animatorSet4.setStartDelay(500L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f15643U4 = animatorSet5;
        animatorSet5.playTogether(animatorSet2, animatorSet3, animatorSet4);
        this.f15643U4.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f15643U4.setDuration(500L);
        this.f15643U4.addListener(new a());
        this.f15643U4.start();
    }

    public void Z1() {
        this.f15643U4.cancel();
        this.f15640R4.setScaleX(1.0f);
        this.f15640R4.setScaleY(1.0f);
        this.f15641S4.setScaleX(1.0f);
        this.f15641S4.setScaleY(1.0f);
        this.f15642T4.setScaleX(1.0f);
        this.f15642T4.setScaleY(1.0f);
    }

    /* renamed from: ag.g0$a */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1968g0.this.f15643U4.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
