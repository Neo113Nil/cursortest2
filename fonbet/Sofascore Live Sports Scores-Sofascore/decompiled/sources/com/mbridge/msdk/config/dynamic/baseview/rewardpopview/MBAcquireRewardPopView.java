package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {
    private final String a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private boolean g;
    private boolean h;
    private final View.OnClickListener i;
    private Runnable j;
    private Runnable k;
    private View.OnTouchListener l;
    private final View.OnClickListener m;
    private final View.OnClickListener n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = MBAcquireRewardPopView.this.f;
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            if (i <= 0) {
                MBAcquireRewardPopView.g(mBAcquireRewardPopView);
                throw null;
            }
            MBAcquireRewardPopView.j(mBAcquireRewardPopView);
            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.j, 1000L);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MBAcquireRewardPopView.this.b = motionEvent.getX();
                MBAcquireRewardPopView.this.c = motionEvent.getY();
            } else {
                if (action == 1) {
                    float f = MBAcquireRewardPopView.this.d;
                    float f2 = MBAcquireRewardPopView.this.b;
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    if (f <= f2) {
                        MBAcquireRewardPopView.g(mBAcquireRewardPopView);
                        throw null;
                    }
                    if (Math.abs(mBAcquireRewardPopView.d - MBAcquireRewardPopView.this.b) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.e - MBAcquireRewardPopView.this.c) >= 100.0f) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (MBAcquireRewardPopView.this.h) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.removeCallbacks(mBAcquireRewardPopView2.j);
                    MBAcquireRewardPopView.this.h = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                    throw null;
                }
                if (action == 2) {
                    MBAcquireRewardPopView.this.d = motionEvent.getX();
                    MBAcquireRewardPopView.this.e = motionEvent.getY();
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MBAcquireRewardPopView";
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = new b();
        this.j = new c();
        this.k = new d();
        this.l = new e();
        this.m = new f();
        this.n = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    public static /* synthetic */ com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getSlidePopView() {
        int a2 = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    public static /* synthetic */ int j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i = mBAcquireRewardPopView.f;
        mBAcquireRewardPopView.f = i - 1;
        return i;
    }

    public void init(com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a aVar) {
        q0.b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.j);
    }

    public void onPause() {
        if (!this.g || this.f <= 0) {
            return;
        }
        removeCallbacks(this.j);
    }

    public void onResume() {
        if (!this.g || this.f <= 0) {
            return;
        }
        post(this.j);
    }

    public void onStop() {
        if (!this.g || this.f <= 0) {
            return;
        }
        removeCallbacks(this.j);
    }

    public void onTimeLessThanReduce(int i) {
        throw null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }
    }
}
