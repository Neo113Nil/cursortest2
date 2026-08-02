package com.vk.attachpicker.impl.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.permission.PermissionHelper;
import com.vk.story.viewer.api.models.Action;
import com.vk.story.viewer.api.models.AttachType;
import com.vk.story.viewer.api.models.Gesture;
import com.vkontakte.android.R;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import xsna.a72;
import xsna.anm0;
import xsna.b3m0;
import xsna.bi80;
import xsna.bn10;
import xsna.bwt0;
import xsna.d1m0;
import xsna.dj60;
import xsna.e43;
import xsna.l8g;
import xsna.msy;
import xsna.rwi;
import xsna.u1u0;
import xsna.vlc0;
import xsna.w1u0;
import xsna.w8i;
import xsna.yh9;

/* compiled from: StoryFragment.kt */
/* loaded from: classes15.dex */
public final class StoryFragment extends FragmentImpl implements w8i {
    public static final int X;
    public static final int Y;
    public ImageView O;
    public ImageView P;
    public long Q;
    public boolean S;
    public float T;
    public boolean U;
    public ShapeDrawable W;
    public final Handler N = new Handler(Looper.getMainLooper());
    public Gesture R = Gesture.SWIPE;
    public final Object V = msy.a(LazyThreadSafetyMode.NONE, new dj60(this, 29));

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        X = context.getResources().getColor(R.color.vk_gray_300);
        Context context2 = e43.a;
        Y = (context2 != null ? context2 : null).getResources().getColor(R.color.vk_blue_300);
    }

    public final void eo() {
        this.N.removeCallbacksAndMessages(null);
        this.U = true;
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity activity = getActivity();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.t, R.string.vk_permissions_intent_story, R.string.vk_permissions_intent_story_settings, new bi80(this, 25), new vlc0(this, 15), 64);
    }

    public final boolean fo(float f, int i) {
        if (getView() != null) {
            ImageView imageView = this.O;
            if (imageView == null) {
                imageView = null;
            }
            float f2 = 3 - (2 * f);
            imageView.setScaleX(f2);
            ImageView imageView2 = this.O;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setScaleY(f2);
            ImageView imageView3 = this.O;
            if (imageView3 == null) {
                imageView3 = null;
            }
            float f3 = i / 2;
            imageView3.setTranslationX(f3);
            ImageView imageView4 = this.P;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setTranslationX(f3);
            ImageView imageView5 = this.P;
            if (imageView5 == null) {
                imageView5 = null;
            }
            imageView5.setAlpha(Math.min(1.0f, (1 - f) * 4));
            ImageView imageView6 = this.P;
            if (imageView6 == null) {
                imageView6 = null;
            }
            imageView6.invalidate();
            double b = bn10.b((20 * f) - 13.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ShapeDrawable shapeDrawable = this.W;
            if (shapeDrawable == null) {
                shapeDrawable = null;
            }
            shapeDrawable.getPaint().setColor(l8g.a((float) Math.sqrt(b), Y, X));
            boolean z = this.T - f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.T = f;
            if (!this.U) {
                Handler handler = this.N;
                if (f >= 0.65f || !z) {
                    if (!z) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } else if (this.R == Gesture.TAP) {
                    if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        eo();
                    }
                } else if (!this.S) {
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new yh9(this, 9), 200L);
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            return;
        }
        if (i2 == -1) {
            ((anm0) this.V.getValue()).B(Action.SEND_MESSAGE, AttachType.STORY, this.R, this.Q);
            Mf(-1, intent);
        } else {
            this.U = false;
            d1m0 f = rwi.d().p().f(this);
            if (f != null) {
                f.rh();
            }
        }
        this.R = Gesture.SWIPE;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = getView();
        a72 a72Var = new a72(view, 17);
        int[] iArr = u1u0.a;
        view.getViewTreeObserver().addOnPreDrawListener(new w1u0(view, a72Var));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Q = requireArguments().getLong("peer_id", 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View I = bwt0.I(R.layout.picker_story_fragment, viewGroup, false);
        viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.a3m0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = StoryFragment.X;
                StoryFragment.this.S = motionEvent.getAction() == 2 || motionEvent.getAction() == 0;
                return false;
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.W = shapeDrawable;
        shapeDrawable.getPaint().setColor(X);
        this.O = (ImageView) I.findViewById(R.id.growing_circle);
        ImageView imageView = (ImageView) I.findViewById(R.id.steady_circle);
        this.P = imageView;
        ShapeDrawable shapeDrawable2 = this.W;
        if (shapeDrawable2 == null) {
            shapeDrawable2 = null;
        }
        imageView.setBackground(shapeDrawable2);
        bwt0.i0(I, new b3m0(this, i));
        a72 a72Var = new a72(I, 17);
        int[] iArr = u1u0.a;
        I.getViewTreeObserver().addOnPreDrawListener(new w1u0(I, a72Var));
        return I;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.N.removeCallbacksAndMessages(null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("gesture", this.R);
        bundle.putFloat("lastOffset", this.T);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("gesture");
            Gesture gesture = serializable instanceof Gesture ? (Gesture) serializable : null;
            if (gesture == null) {
                gesture = Gesture.SWIPE;
            }
            this.R = gesture;
            this.T = bundle.getFloat("lastOffset");
        }
    }
}
