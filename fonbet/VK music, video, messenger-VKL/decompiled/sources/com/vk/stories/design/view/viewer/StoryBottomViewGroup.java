package com.vk.stories.design.view.viewer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.impl.R$styleable;
import com.vk.toggle.d;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.disposables.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.random.Random;
import xsna.a8j0;
import xsna.alj0;
import xsna.asu0;
import xsna.awt0;
import xsna.bek0;
import xsna.bi80;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c0f0;
import xsna.cn70;
import xsna.dhr0;
import xsna.dj60;
import xsna.e89;
import xsna.ebm0;
import xsna.epj0;
import xsna.eqy;
import xsna.fbm0;
import xsna.fl2;
import xsna.g5z;
import xsna.gg;
import xsna.hyt0;
import xsna.iah0;
import xsna.jd80;
import xsna.jsv;
import xsna.jzl0;
import xsna.l5m0;
import xsna.l7s;
import xsna.lnm0;
import xsna.lpj;
import xsna.lzl0;
import xsna.mkm0;
import xsna.msy;
import xsna.nzl0;
import xsna.odc0;
import xsna.p870;
import xsna.q7r;
import xsna.rwl0;
import xsna.ryc;
import xsna.s3q0;
import xsna.swl0;
import xsna.tu80;
import xsna.twl0;
import xsna.uwl0;
import xsna.vki0;
import xsna.vwl0;
import xsna.w4u0;
import xsna.w5k0;
import xsna.y730;
import xsna.yxt;
import xsna.zam0;
import xsna.zim0;
import xsna.zx20;

/* compiled from: StoryBottomViewGroup.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public final class StoryBottomViewGroup extends ConstraintLayout {
    public static final int P = cn70.b(8);
    public static final int Q = cn70.b(64);
    public final AnimatedReactionsView A;
    public final jzl0 B;
    public final rwl0 C;
    public nzl0 D;
    public int E;
    public List<? extends StoryUserProfile> F;
    public List<zam0> G;
    public final w4u0 H;
    public final b I;
    public final ArrayList J;
    public int K;
    public boolean L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final bpn0 t;
    public final boolean u;
    public final int v;
    public final int w;
    public final RecyclerView x;
    public final ShimmerFrameLayout y;
    public final ImageView z;

    /* compiled from: StoryBottomViewGroup.kt */
    public static final class a {
        public static int a(StoryBottomViewGroup storyBottomViewGroup) {
            int i = StoryBottomViewGroup.P;
            int i2 = StoryBottomViewGroup.P;
            if (storyBottomViewGroup == null) {
                return StoryBottomViewGroup.Q + i2;
            }
            int i3 = storyBottomViewGroup.E;
            int height = storyBottomViewGroup.x.getHeight();
            if (i3 < height) {
                i3 = height;
            }
            return i3 + i2;
        }
    }

    public StoryBottomViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        int i = obtainStyledAttributes.getBoolean(0, false) ? R.layout.view_story_bottom_my_target : R.layout.view_story_reactions;
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        LayoutInflater.from((valueOf != null && valueOf.intValue() == dhr0.u().c) ? context : new l7s(context, dhr0.u().c)).inflate(i, this);
        obtainStyledAttributes.recycle();
        this.t = new bpn0(new tu80(this, 25));
        eqy<bek0> eqyVar = d.a;
        this.u = true;
        this.v = R.drawable.vk_icon_like_outline_shadow_medium_48;
        this.w = R.drawable.vk_icon_like_shadow_medium_red_48;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_reactions_action);
        setMinHeight(Q);
        recyclerView.setItemAnimator(null);
        StoryBottomViewGroup$rvActions$1$1 storyBottomViewGroup$rvActions$1$1 = new StoryBottomViewGroup$rvActions$1$1();
        storyBottomViewGroup$rvActions$1$1.setOrientation(0);
        recyclerView.setLayoutManager(storyBottomViewGroup$rvActions$1$1);
        this.x = recyclerView;
        this.y = (ShimmerFrameLayout) findViewById(R.id.skeleton_button);
        this.z = (ImageView) findViewById(R.id.iv_like);
        this.A = (AnimatedReactionsView) findViewById(R.id.likes_animation);
        twl0 twl0Var = new twl0(context);
        jzl0 jzl0Var = new jzl0(this, twl0Var);
        this.B = jzl0Var;
        rwl0 rwl0Var = new rwl0(jzl0Var, twl0Var);
        this.C = rwl0Var;
        this.H = new w4u0(this, new dj60(this, 28), new bi80(this, 24), 6);
        this.I = new b();
        this.J = new ArrayList();
        w5k0 w5k0Var = new w5k0(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.M = msy.a(lazyThreadSafetyMode, w5k0Var);
        this.N = msy.a(lazyThreadSafetyMode, new a8j0(3));
        this.O = msy.a(lazyThreadSafetyMode, new zx20(context, 2));
        recyclerView.setAdapter(rwl0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 Q4(int i, StoryBottomViewGroup storyBottomViewGroup, StoryUserProfile storyUserProfile) {
        Object obj;
        Drawable drawable;
        AnimatedReactionsView animatedReactionsView;
        String str;
        float f;
        long j;
        VkAvatar vkAvatar;
        if (i == storyBottomViewGroup.K) {
            if (storyBottomViewGroup.getNewReactionsEnabled() || storyBottomViewGroup.getReactionSticker()) {
                List<zam0> list = storyBottomViewGroup.G;
                if (list != null) {
                    if (!storyUserProfile.h0) {
                        list = null;
                    }
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            int i2 = ((zam0) obj).a;
                            Integer num = storyUserProfile.i0;
                            if (num != null && i2 == num.intValue()) {
                                break;
                            }
                        }
                        zam0 zam0Var = (zam0) obj;
                        if (zam0Var != null) {
                            drawable = zam0Var.b;
                            animatedReactionsView = storyBottomViewGroup.A;
                            str = storyUserProfile.g;
                            if (str == null) {
                                str = storyUserProfile.h;
                            }
                            int i3 = AnimatedReactionsView.e;
                            f = animatedReactionsView.c;
                            j = animatedReactionsView.b;
                            if (str != null) {
                                str.length();
                            }
                            vkAvatar = new VkAvatar(animatedReactionsView.getContext(), null, 6, 0);
                            int a2 = iah0.a(44);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
                            layoutParams.gravity = 8388691;
                            vkAvatar.setLayoutParams(layoutParams);
                            vkAvatar.o0(str, null);
                            animatedReactionsView.addView(vkAvatar);
                            if (drawable != null) {
                                vkAvatar.Q0(new c0f0(drawable, VkAvatarBadge.Alignment.BottomRight));
                            }
                            if (animatedReactionsView.getHeight() != 0 && animatedReactionsView.getWidth() != 0) {
                                AnimationSet animationSet = new AnimationSet(true);
                                Random.Default r8 = Random.b;
                                int i4 = (-animatedReactionsView.getWidth()) / 3;
                                int width = animatedReactionsView.getWidth() / 3;
                                r8.getClass();
                                gg ggVar = Random.c;
                                int l = ggVar.l(i4, width);
                                int l2 = ggVar.l((-animatedReactionsView.getWidth()) / 6, animatedReactionsView.getWidth() / 6);
                                TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(animatedReactionsView.getHeight() * 1.0f));
                                translateAnimation.setDuration(j);
                                translateAnimation.setInterpolator(new DecelerateInterpolator());
                                TranslateAnimation translateAnimation2 = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                translateAnimation2.setDuration(750L);
                                translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
                                TranslateAnimation translateAnimation3 = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                translateAnimation3.setDuration(750L);
                                translateAnimation3.setStartTime(750L);
                                translateAnimation3.setInterpolator(new AccelerateDecelerateInterpolator());
                                float f2 = animatedReactionsView.d;
                                ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2);
                                scaleAnimation.setDuration(400L);
                                scaleAnimation.setInterpolator(new DecelerateInterpolator());
                                animationSet.setFillEnabled(true);
                                animationSet.setFillAfter(true);
                                animationSet.addAnimation(translateAnimation);
                                animationSet.addAnimation(translateAnimation2);
                                animationSet.addAnimation(translateAnimation3);
                                animationSet.addAnimation(scaleAnimation);
                                vkAvatar.startAnimation(animationSet);
                            }
                            vkAvatar.animate().scaleX(f).scaleY(f).setStartDelay(j - 400).setDuration(400L).setInterpolator(new AccelerateInterpolator()).setListener(new fl2(vkAvatar, animatedReactionsView));
                        }
                    }
                }
                drawable = null;
                animatedReactionsView = storyBottomViewGroup.A;
                str = storyUserProfile.g;
                if (str == null) {
                }
                int i32 = AnimatedReactionsView.e;
                f = animatedReactionsView.c;
                j = animatedReactionsView.b;
                if (str != null) {
                }
                vkAvatar = new VkAvatar(animatedReactionsView.getContext(), null, 6, 0);
                int a22 = iah0.a(44);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a22, a22);
                layoutParams2.gravity = 8388691;
                vkAvatar.setLayoutParams(layoutParams2);
                vkAvatar.o0(str, null);
                animatedReactionsView.addView(vkAvatar);
                if (drawable != null) {
                }
                if (animatedReactionsView.getHeight() != 0) {
                    AnimationSet animationSet2 = new AnimationSet(true);
                    Random.Default r82 = Random.b;
                    int i42 = (-animatedReactionsView.getWidth()) / 3;
                    int width2 = animatedReactionsView.getWidth() / 3;
                    r82.getClass();
                    gg ggVar2 = Random.c;
                    int l3 = ggVar2.l(i42, width2);
                    int l22 = ggVar2.l((-animatedReactionsView.getWidth()) / 6, animatedReactionsView.getWidth() / 6);
                    TranslateAnimation translateAnimation4 = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(animatedReactionsView.getHeight() * 1.0f));
                    translateAnimation4.setDuration(j);
                    translateAnimation4.setInterpolator(new DecelerateInterpolator());
                    TranslateAnimation translateAnimation22 = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    translateAnimation22.setDuration(750L);
                    translateAnimation22.setInterpolator(new AccelerateDecelerateInterpolator());
                    TranslateAnimation translateAnimation32 = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    translateAnimation32.setDuration(750L);
                    translateAnimation32.setStartTime(750L);
                    translateAnimation32.setInterpolator(new AccelerateDecelerateInterpolator());
                    float f22 = animatedReactionsView.d;
                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(f, f22, f, f22);
                    scaleAnimation2.setDuration(400L);
                    scaleAnimation2.setInterpolator(new DecelerateInterpolator());
                    animationSet2.setFillEnabled(true);
                    animationSet2.setFillAfter(true);
                    animationSet2.addAnimation(translateAnimation4);
                    animationSet2.addAnimation(translateAnimation22);
                    animationSet2.addAnimation(translateAnimation32);
                    animationSet2.addAnimation(scaleAnimation2);
                    vkAvatar.startAnimation(animationSet2);
                }
                vkAvatar.animate().scaleX(f).scaleY(f).setStartDelay(j - 400).setDuration(400L).setInterpolator(new AccelerateInterpolator()).setListener(new fl2(vkAvatar, animatedReactionsView));
            } else {
                if (storyUserProfile.h0) {
                    drawable = storyBottomViewGroup.getDefaultDrawable();
                    animatedReactionsView = storyBottomViewGroup.A;
                    str = storyUserProfile.g;
                    if (str == null) {
                    }
                    int i322 = AnimatedReactionsView.e;
                    f = animatedReactionsView.c;
                    j = animatedReactionsView.b;
                    if (str != null) {
                    }
                    vkAvatar = new VkAvatar(animatedReactionsView.getContext(), null, 6, 0);
                    int a222 = iah0.a(44);
                    FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(a222, a222);
                    layoutParams22.gravity = 8388691;
                    vkAvatar.setLayoutParams(layoutParams22);
                    vkAvatar.o0(str, null);
                    animatedReactionsView.addView(vkAvatar);
                    if (drawable != null) {
                    }
                    if (animatedReactionsView.getHeight() != 0) {
                    }
                    vkAvatar.animate().scaleX(f).scaleY(f).setStartDelay(j - 400).setDuration(400L).setInterpolator(new AccelerateInterpolator()).setListener(new fl2(vkAvatar, animatedReactionsView));
                }
                drawable = null;
                animatedReactionsView = storyBottomViewGroup.A;
                str = storyUserProfile.g;
                if (str == null) {
                }
                int i3222 = AnimatedReactionsView.e;
                f = animatedReactionsView.c;
                j = animatedReactionsView.b;
                if (str != null) {
                }
                vkAvatar = new VkAvatar(animatedReactionsView.getContext(), null, 6, 0);
                int a2222 = iah0.a(44);
                FrameLayout.LayoutParams layoutParams222 = new FrameLayout.LayoutParams(a2222, a2222);
                layoutParams222.gravity = 8388691;
                vkAvatar.setLayoutParams(layoutParams222);
                vkAvatar.o0(str, null);
                animatedReactionsView.addView(vkAvatar);
                if (drawable != null) {
                }
                if (animatedReactionsView.getHeight() != 0) {
                }
                vkAvatar.animate().scaleX(f).scaleY(f).setStartDelay(j - 400).setDuration(400L).setInterpolator(new AccelerateInterpolator()).setListener(new fl2(vkAvatar, animatedReactionsView));
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getDefaultDrawable() {
        return (Drawable) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getNewReactionsEnabled() {
        return ((Boolean) this.M.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getReactionSticker() {
        return ((Boolean) this.N.getValue()).booleanValue();
    }

    private final fbm0 getReactionsInteractor() {
        return (fbm0) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setActionItems$lambda$16(StoryBottomViewGroup storyBottomViewGroup) {
        storyBottomViewGroup.x.scrollToPosition(0);
        storyBottomViewGroup.x.invalidateItemDecorations();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, xsna.wzs] */
    public final void T4() {
        this.K++;
        ArrayList arrayList = this.J;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeCallbacks((Runnable) it.next());
        }
        arrayList.clear();
        AnimatedReactionsView animatedReactionsView = this.A;
        vki0 b = g5z.b(hyt0.b(animatedReactionsView).a);
        while (b.hasNext()) {
            ((View) b.next()).clearAnimation();
        }
        animatedReactionsView.removeAllViews();
        this.L = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012b, code lost:
    
        if (r0.g != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4(yxt yxtVar, StoryEntry storyEntry, q7r q7rVar) {
        VKList<StoryUserProfile> vKList;
        ViewParent parent;
        jzl0 jzl0Var = this.B;
        StoryBottomViewGroup storyBottomViewGroup = jzl0Var.a;
        StoryBottomViewGroup storyBottomViewGroup2 = jzl0Var.a;
        jzl0Var.j = yxtVar;
        mkm0 mkm0Var = q7rVar.i0;
        jzl0Var.i = mkm0Var.getStoriesContainer();
        lnm0 lnm0Var = mkm0Var.getDependencies().r;
        jzl0Var.z = mkm0Var.getDependencies().q;
        jzl0Var.k = new vwl0(new e89(jzl0Var, 8), yxtVar);
        jzl0Var.h = storyEntry;
        StoriesContainer storiesContainer = jzl0Var.i;
        if (storiesContainer == null) {
            storiesContainer = null;
        }
        HashMap<Integer, VKList<StoryUserProfile>> hashMap = storiesContainer.h;
        if (hashMap == null || (vKList = hashMap.get(Integer.valueOf(storyEntry.c))) == null) {
            vKList = new VKList<>();
        }
        jzl0Var.o = vKList;
        StoriesContainer storiesContainer2 = jzl0Var.i;
        if (storiesContainer2 == null) {
            storiesContainer2 = null;
        }
        Integer num = storiesContainer2.i.get(Integer.valueOf(storyEntry.c));
        jzl0Var.p = num != null ? num.intValue() : 0;
        l5m0 l5m0Var = new l5m0(storyBottomViewGroup);
        ImageView imageView = storyBottomViewGroup.z;
        jzl0Var.n = l5m0Var;
        StoriesContainer storiesContainer3 = jzl0Var.i;
        if (storiesContainer3 == null) {
            storiesContainer3 = null;
        }
        List<uwl0> g = jzl0Var.g(storyEntry, storiesContainer3, jzl0Var.o, jzl0Var.p, false);
        jzl0Var.r = g;
        storyBottomViewGroup.setActionItems(g);
        jzl0Var.l = new zim0(mkm0Var.getDependencies().l, storyBottomViewGroup2, storyEntry, yxtVar.getViewEntryPoint(), yxtVar.p(), yxtVar);
        StoriesContainer storiesContainer4 = jzl0Var.i;
        jzl0Var.m = new ebm0(storyBottomViewGroup2, yxtVar, storiesContainer4 == null ? null : storiesContainer4, mkm0Var.getDependencies().q, storyEntry, mkm0Var.getViewEntryPoint());
        StoriesContainer storiesContainer5 = jzl0Var.i;
        if (storiesContainer5 == null) {
            storiesContainer5 = null;
        }
        boolean z = true;
        boolean z2 = (!storiesContainer5.Rb() || storyEntry.b || yxtVar.e()) ? false : true;
        if (!jzl0Var.s && !mkm0Var.f && z2) {
            StoriesContainer storiesContainer6 = jzl0Var.i;
            if (storiesContainer6 == null) {
                storiesContainer6 = null;
            }
            jzl0Var.k(storiesContainer6, storyEntry);
            jzl0Var.s = true;
        }
        jd80 jd80Var = new jd80(yxtVar, imageView, new odc0(jzl0Var, 17));
        yxtVar.g(jd80Var.j);
        jzl0Var.C = jd80Var;
        StoriesContainer storiesContainer7 = jzl0Var.i;
        if (storiesContainer7 == null) {
            storiesContainer7 = null;
        }
        if (storyEntry.d0 && !storiesContainer7.Rb() && !storyEntry.F) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_REACTIONS;
            storiesFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (!bVar.a(storiesFeatures)) {
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_REACTION_STICKER;
                storiesFeatures2.getClass();
                if (!bVar.a(storiesFeatures2)) {
                }
            }
        }
        z = false;
        boolean z3 = storyEntry.c0;
        bwt0.p0(imageView, z);
        storyBottomViewGroup.V4(z3);
        p870 p870Var = jzl0Var.z;
        if (p870Var != null) {
            p870Var.b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, jzl0Var.A);
            p870Var.b(128, jzl0Var.B);
        }
        this.D = yxtVar;
        boolean z4 = this.u;
        ImageView imageView2 = this.z;
        if (z4) {
            StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_NEW_REACTIONS;
            storiesFeatures3.getClass();
            com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
            if (!bVar2.a(storiesFeatures3)) {
                StoriesFeatures storiesFeatures4 = StoriesFeatures.ST_REACTION_STICKER;
                storiesFeatures4.getClass();
                if (!bVar2.a(storiesFeatures4)) {
                    imageView2.setImageTintList(null);
                    setClipChildren(false);
                    setClipToPadding(false);
                    parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    bwt0.g0(imageView2, new lzl0(this, 0));
                    this.I.b(getReactionsInteractor().a().m(asu0.a.d()).subscribe(new y730(new alj0(this, 6), 14), new jsv(new epj0(1), 26)));
                }
            }
        }
        bwt0.p0(imageView2, false);
        setClipChildren(false);
        setClipToPadding(false);
        parent = getParent();
        if (parent instanceof ViewGroup) {
        }
        bwt0.g0(imageView2, new lzl0(this, 0));
        this.I.b(getReactionsInteractor().a().m(asu0.a.d()).subscribe(new y730(new alj0(this, 6), 14), new jsv(new epj0(1), 26)));
    }

    public final void V4(boolean z) {
        ImageView imageView = this.z;
        if (z) {
            imageView.setContentDescription(imageView.getContext().getString(R.string.story_accessibility_remove_like));
            imageView.setImageResource(this.w);
        } else {
            imageView.setContentDescription(imageView.getContext().getString(R.string.story_accessibility_add_like));
            imageView.setImageResource(this.v);
        }
    }

    public final List<View> getAllViewsExcludeAnimation() {
        View[] d = awt0.d(this);
        ArrayList arrayList = new ArrayList();
        for (View view : d) {
            if (view != this.A) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    public final int getControlsHeight() {
        int measuredHeight = this.x.getMeasuredHeight();
        int i = Q;
        return measuredHeight < i ? i : measuredHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.a();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jzl0 jzl0Var = this.B;
        jzl0Var.d.dispose();
        jzl0Var.e.dispose();
        jzl0Var.f.dispose();
        zim0 zim0Var = jzl0Var.l;
        if (zim0Var != null) {
            w4u0 w4u0Var = zim0Var.n;
            View view = w4u0Var.b;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(w4u0Var);
                viewTreeObserver.removeOnScrollChangedListener(w4u0Var);
                viewTreeObserver.removeOnGlobalLayoutListener(w4u0Var);
            }
            view.removeOnAttachStateChangeListener(w4u0Var);
            zim0Var.g.dispose();
            zim0Var.h.dispose();
        }
        ebm0 ebm0Var = jzl0Var.m;
        if (ebm0Var != null) {
            ebm0Var.d.g(ebm0Var.l);
            ebm0Var.i.dispose();
            nzl0 nzl0Var = ebm0Var.b;
            nzl0Var.w(ebm0Var.m);
            nzl0Var.w(((jd80) ebm0Var.n.getValue()).j);
        }
        p870 p870Var = jzl0Var.z;
        if (p870Var != null) {
            p870Var.g(jzl0Var.A);
            p870Var.g(jzl0Var.B);
        }
        jd80 jd80Var = jzl0Var.C;
        if (jd80Var != null) {
            nzl0 nzl0Var2 = jzl0Var.j;
            if (nzl0Var2 == null) {
                nzl0Var2 = null;
            }
            nzl0Var2.w(jd80Var.j);
        }
        this.I.dispose();
        w4u0 w4u0Var2 = this.H;
        View view2 = w4u0Var2.b;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.removeOnPreDrawListener(w4u0Var2);
            viewTreeObserver2.removeOnScrollChangedListener(w4u0Var2);
            viewTreeObserver2.removeOnGlobalLayoutListener(w4u0Var2);
        }
        view2.removeOnAttachStateChangeListener(w4u0Var2);
        T4();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setActionItems(List<? extends uwl0> list) {
        rwl0 rwl0Var = this.C;
        List<? extends uwl0> list2 = rwl0Var.f;
        rwl0Var.f = list;
        m.a(new swl0(list2, list), true).b(rwl0Var);
        post(new ryc(this, 9));
    }

    public final void setCadreBottomOffset(int i) {
        this.E = i;
    }

    public final void setRunLikesAnimation(List<? extends StoryUserProfile> list) {
        this.F = list;
        w4u0 w4u0Var = this.H;
        w4u0Var.i = true;
        w4u0Var.b();
    }
}
