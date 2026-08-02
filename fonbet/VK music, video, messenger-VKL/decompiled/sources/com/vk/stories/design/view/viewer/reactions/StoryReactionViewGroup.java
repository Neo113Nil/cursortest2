package com.vk.stories.design.view.viewer.reactions;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.viewer.reactions.StoryMainReactionButton;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.toggle.b;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.awt0;
import xsna.bwt0;
import xsna.bxq;
import xsna.dbm0;
import xsna.dhr0;
import xsna.e43;
import xsna.epx;
import xsna.fd90;
import xsna.ful0;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.l2f0;
import xsna.ou5;
import xsna.p210;
import xsna.p69;
import xsna.pj8;
import xsna.s3q0;
import xsna.sc4;
import xsna.tqf0;
import xsna.wzs;
import xsna.y0f0;
import xsna.z370;

/* compiled from: StoryReactionViewGroup.kt */
/* loaded from: classes6.dex */
public final class StoryReactionViewGroup extends FrameLayout {
    public static final int s = iah0.a(48);
    public static final int t = iah0.a(32);
    public final int b;
    public final StoryMainReactionButton c;
    public final ImageView d;
    public final z370 e;
    public final VkImage f;
    public final View g;
    public boolean h;
    public final ArrayList<l2f0> i;
    public final Rect j;
    public final Rect k;
    public float l;
    public float m;
    public y0f0 n;
    public izs<? super y0f0, s3q0> o;
    public wzs<? super y0f0, ? super Boolean, s3q0> p;
    public gzs<s3q0> q;
    public gzs<s3q0> r;

    public StoryReactionViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = s;
        int i2 = t;
        this.b = (i - i2) / 2;
        this.i = new ArrayList<>(6);
        this.j = new Rect();
        this.k = new Rect();
        this.q = new fd90(9);
        this.r = new tqf0(4);
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setVisibility(8);
        view.setClickable(true);
        view.setImportantForAccessibility(2);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.cbm0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i3 = StoryReactionViewGroup.s;
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                StoryReactionViewGroup storyReactionViewGroup = StoryReactionViewGroup.this;
                if (!storyReactionViewGroup.h) {
                    return true;
                }
                storyReactionViewGroup.d();
                return true;
            }
        });
        this.g = view;
        addView(view);
        ImageView imageView = new ImageView(getContext());
        imageView.setForeground(e());
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setId(R.id.reactions_menu_button);
        imageView.setTranslationX(iah0.a(2));
        imageView.setImageResource(R.drawable.vk_icon_smile_outline_shadow_medium_48);
        imageView.setContentDescription(imageView.getContext().getString(R.string.story_reactions_accessibility));
        imageView.setOnClickListener(new pj8(this, 10));
        StoriesFeatures.ST_REACTION_STICKER.getClass();
        bwt0.p0(imageView, !b.A.a(r2));
        this.d = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = i;
        s3q0 s3q0Var = s3q0.a;
        addView(imageView, layoutParams);
        z370 z370Var = new z370(getContext());
        z370Var.setId(R.id.reactions_menu_container);
        z370Var.setOrientation(0);
        z370Var.setGravity(16);
        z370Var.setVisibility(4);
        z370Var.setPivotX(1.0f);
        z370Var.setPivotY(0.5f);
        z370Var.setClipToPadding(false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iah0.a(28));
        gradientDrawable.setColor(dhr0.Y(R.attr.vk_ui_background_content, getContext()));
        z370Var.setBackground(gradientDrawable);
        int a = iah0.a(8);
        z370Var.setPadding(a, a, a, a);
        this.e = z370Var;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.rightMargin = i;
        addView(z370Var, layoutParams2);
        VkImage vkImage = new VkImage(getContext(), null, 6, 0);
        vkImage.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        vkImage.setVisibility(8);
        vkImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f = vkImage;
        addView(vkImage);
        StoryMainReactionButton storyMainReactionButton = new StoryMainReactionButton(getContext());
        storyMainReactionButton.setId(R.id.reactions_main_button);
        storyMainReactionButton.setOnClickListener(new bxq(5, this, storyMainReactionButton));
        this.c = storyMainReactionButton;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i);
        layoutParams3.gravity = 8388693;
        addView(storyMainReactionButton, layoutParams3);
    }

    public static s3q0 a(StoryReactionViewGroup storyReactionViewGroup, FrameLayout frameLayout, y0f0 y0f0Var) {
        l2f0 l2f0Var;
        frameLayout.getGlobalVisibleRect(storyReactionViewGroup.j);
        storyReactionViewGroup.getGlobalVisibleRect(storyReactionViewGroup.k);
        storyReactionViewGroup.l = r0.left - r12.left;
        storyReactionViewGroup.m = r0.top - r12.top;
        int i = y0f0Var.a;
        ArrayList<l2f0> arrayList = storyReactionViewGroup.i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                l2f0Var = (l2f0) j5g.Y(arrayList);
                break;
            }
            if (arrayList.get(i2).a.a == i) {
                l2f0Var = arrayList.get(i2);
                break;
            }
            i2++;
        }
        ImageView imageView = l2f0Var.c;
        Drawable drawable = imageView.getDrawable();
        RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
        imageView.setImageDrawable(null);
        storyReactionViewGroup.setupFlyingEmojiState(rLottieDrawable);
        int i3 = storyReactionViewGroup.b;
        StoryMainReactionButton storyMainReactionButton = storyReactionViewGroup.c;
        if (storyMainReactionButton == null) {
            storyMainReactionButton = null;
        }
        float f = i3;
        float x = storyMainReactionButton.getX() + f;
        StoryMainReactionButton storyMainReactionButton2 = storyReactionViewGroup.c;
        if (storyMainReactionButton2 == null) {
            storyMainReactionButton2 = null;
        }
        float y = storyMainReactionButton2.getY() + f;
        AnimatorSet animatorSet = new AnimatorSet();
        VkImage vkImage = storyReactionViewGroup.f;
        if (vkImage == null) {
            vkImage = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkImage, (Property<VkImage, Float>) FrameLayout.TRANSLATION_X, storyReactionViewGroup.l, x);
        VkImage vkImage2 = storyReactionViewGroup.f;
        if (vkImage2 == null) {
            vkImage2 = null;
        }
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(vkImage2, (Property<VkImage, Float>) FrameLayout.TRANSLATION_Y, storyReactionViewGroup.m, y));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
        StoryMainReactionButton storyMainReactionButton3 = storyReactionViewGroup.c;
        if (storyMainReactionButton3 == null) {
            storyMainReactionButton3 = null;
        }
        storyMainReactionButton3.getClass();
        storyMainReactionButton3.d = StoryMainReactionButton.State.HIDDEN;
        storyMainReactionButton3.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).start();
        VkImage vkImage3 = storyReactionViewGroup.f;
        if (vkImage3 == null) {
            vkImage3 = null;
        }
        vkImage3.setLayerType(2, null);
        animatorSet.addListener(new dbm0(storyReactionViewGroup, rLottieDrawable, y0f0Var, l2f0Var));
        animatorSet.start();
        return s3q0.a;
    }

    public static void b(StoryReactionViewGroup storyReactionViewGroup, FrameLayout frameLayout, y0f0 y0f0Var) {
        storyReactionViewGroup.setReactionsInteractable(false);
        storyReactionViewGroup.r.invoke();
        storyReactionViewGroup.f(false);
        View view = storyReactionViewGroup.g;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        ImageView imageView = storyReactionViewGroup.d;
        if (imageView == null) {
            imageView = null;
        }
        imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        z370 z370Var = storyReactionViewGroup.e;
        (z370Var != null ? z370Var : null).animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new sc4(storyReactionViewGroup, 14)).start();
        y0f0 y0f0Var2 = storyReactionViewGroup.n;
        if (y0f0Var2 != null && y0f0Var2.a == y0f0Var.a) {
            wzs<? super y0f0, ? super Boolean, s3q0> wzsVar = storyReactionViewGroup.p;
            if (wzsVar != null) {
                wzsVar.invoke(y0f0Var2, Boolean.TRUE);
                return;
            }
            return;
        }
        izs<? super y0f0, s3q0> izsVar = storyReactionViewGroup.o;
        if (izsVar != null) {
            izsVar.invoke(y0f0Var);
        }
        storyReactionViewGroup.n = y0f0Var;
        awt0.i(storyReactionViewGroup, new p210(storyReactionViewGroup, frameLayout, y0f0Var, 2));
    }

    public static void c(StoryReactionViewGroup storyReactionViewGroup) {
        boolean z = storyReactionViewGroup.h;
        if (z) {
            storyReactionViewGroup.d();
            return;
        }
        ArrayList<l2f0> arrayList = storyReactionViewGroup.i;
        if (z) {
            return;
        }
        storyReactionViewGroup.h = true;
        storyReactionViewGroup.q.invoke();
        storyReactionViewGroup.setReactionsInteractable(true);
        storyReactionViewGroup.f(true);
        Iterator<l2f0> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            l2f0 next = it.next();
            FrameLayout frameLayout = next.b;
            if (epx.f(next.a, storyReactionViewGroup.n)) {
                GradientDrawable a = ful0.a(1);
                a.setColor(dhr0.Y(R.attr.vk_ui_background_secondary, storyReactionViewGroup.getContext()));
                frameLayout.setBackground(a);
            } else {
                frameLayout.setBackground(null);
            }
        }
        View view = storyReactionViewGroup.g;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        ImageView imageView = storyReactionViewGroup.d;
        if (imageView == null) {
            imageView = null;
        }
        imageView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(0.5f).scaleY(0.5f).setDuration(200L).start();
        z370 z370Var = storyReactionViewGroup.e;
        z370 z370Var2 = z370Var != null ? z370Var : null;
        z370Var2.setVisibility(0);
        z370Var2.setPivotX(z370Var2.getWidth());
        z370Var2.setPivotY(z370Var2.getHeight() / 2.0f);
        z370Var2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        z370Var2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        z370Var2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        z370Var2.animate().alpha(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.0f)).setDuration(300L).start();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FrameLayout frameLayout2 = arrayList.get(i).b;
            frameLayout2.setTranslationY(iah0.a(10));
            frameLayout2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            frameLayout2.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).alpha(1.0f).setStartDelay(i * 30).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    private final void setReactionsInteractable(boolean z) {
        ArrayList<l2f0> arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b.setClickable(z);
        }
    }

    private final void setupFlyingEmojiState(RLottieDrawable rLottieDrawable) {
        VkImage vkImage = this.f;
        if (vkImage == null) {
            vkImage = null;
        }
        vkImage.setVisibility(0);
        vkImage.setTranslationX(this.l);
        vkImage.setTranslationY(this.m);
        vkImage.setScaleX(1.0f);
        vkImage.setScaleY(1.0f);
        vkImage.setImageDrawable(rLottieDrawable);
        if (rLottieDrawable != null) {
            rLottieDrawable.k.s = false;
        }
    }

    public final void d() {
        if (this.h) {
            this.h = false;
            this.r.invoke();
            setReactionsInteractable(false);
            f(false);
            View view = this.g;
            if (view == null) {
                view = null;
            }
            view.setVisibility(8);
            ImageView imageView = this.d;
            if (imageView == null) {
                imageView = null;
            }
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
            z370 z370Var = this.e;
            (z370Var != null ? z370Var : null).animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ou5(this, 12)).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getActionMasked() == 0 && this.h && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final RippleDrawable e() {
        int Y = dhr0.Y(R.attr.vk_ui_separator_primary_alpha, getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(Y), null, gradientDrawable);
    }

    public final void f(boolean z) {
        ArrayList<l2f0> arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImageView imageView = arrayList.get(i).c;
            Drawable drawable = imageView.getDrawable();
            RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
            if (rLottieDrawable != null) {
                imageView.setVisibility(0);
                if (z) {
                    rLottieDrawable.j();
                } else {
                    rLottieDrawable.i();
                }
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public final void g(y0f0 y0f0Var, boolean z, boolean z2) {
        this.n = y0f0Var;
        if (y0f0Var != null) {
            StoryMainReactionButton storyMainReactionButton = this.c;
            (storyMainReactionButton != null ? storyMainReactionButton : null).b(y0f0Var, z2);
            return;
        }
        StoryMainReactionButton storyMainReactionButton2 = this.c;
        if (storyMainReactionButton2 == null) {
            storyMainReactionButton2 = null;
        }
        storyMainReactionButton2.e = null;
        storyMainReactionButton2.setContentDescription(storyMainReactionButton2.getContext().getString(R.string.story_reactions_add_reaction_accessibility));
        if (z) {
            storyMainReactionButton2.animate().cancel();
            storyMainReactionButton2.animate().scaleY(0.6f).scaleX(0.6f).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(75L).withEndAction(new p69(storyMainReactionButton2, 7)).start();
            return;
        }
        storyMainReactionButton2.d = StoryMainReactionButton.State.DEFAULT;
        storyMainReactionButton2.a();
        storyMainReactionButton2.setAlpha(1.0f);
        storyMainReactionButton2.setScaleY(1.0f);
        storyMainReactionButton2.setScaleX(1.0f);
        storyMainReactionButton2.invalidate();
    }

    public final wzs<y0f0, Boolean, s3q0> getOnLikeClicked() {
        return this.p;
    }

    public final izs<y0f0, s3q0> getOnReactionSelected() {
        return this.o;
    }

    public final gzs<s3q0> getOnReactionsClosed() {
        return this.r;
    }

    public final gzs<s3q0> getOnReactionsShowed() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList<l2f0> arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            ImageView imageView = arrayList.get(i).c;
            Drawable drawable = imageView.getDrawable();
            RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
            if (rLottieDrawable != null) {
                rLottieDrawable.k();
            }
            imageView.setImageDrawable(null);
            i++;
        }
        StoryMainReactionButton storyMainReactionButton = this.c;
        (storyMainReactionButton != null ? storyMainReactionButton : null).a();
    }

    public final void setOnLikeClicked(wzs<? super y0f0, ? super Boolean, s3q0> wzsVar) {
        this.p = wzsVar;
    }

    public final void setOnReactionSelected(izs<? super y0f0, s3q0> izsVar) {
        this.o = izsVar;
    }

    public final void setOnReactionsClosed(gzs<s3q0> gzsVar) {
        this.r = gzsVar;
    }

    public final void setOnReactionsShowed(gzs<s3q0> gzsVar) {
        this.q = gzsVar;
    }

    public final void setReactions(List<y0f0> list) {
        ArrayList<l2f0> arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImageView imageView = arrayList.get(i).c;
            Drawable drawable = imageView.getDrawable();
            RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
            if (rLottieDrawable != null) {
                rLottieDrawable.k();
            }
            imageView.setImageDrawable(null);
        }
        z370 z370Var = this.e;
        if (z370Var == null) {
            z370Var = null;
        }
        z370Var.removeAllViews();
        arrayList.clear();
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            final y0f0 y0f0Var = list.get(i2);
            final FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setContentDescription(frameLayout.getContext().getString(R.string.story_reactions_position_accessibility, Integer.valueOf(i2)));
            int i3 = t;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
            layoutParams.leftMargin = i2 == 0 ? 0 : iah0.a(4);
            layoutParams.rightMargin = i2 == e43.h(list) ? 0 : iah0.a(4);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setClickable(true);
            frameLayout.setFocusable(true);
            frameLayout.setForeground(e());
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: xsna.bbm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryReactionViewGroup.b(StoryReactionViewGroup.this, frameLayout, y0f0Var);
                }
            });
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setVisibility(8);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView2, new FrameLayout.LayoutParams(-1, -1));
            arrayList.add(new l2f0(y0f0Var, frameLayout, imageView2));
            z370 z370Var2 = this.e;
            if (z370Var2 == null) {
                z370Var2 = null;
            }
            z370Var2.addView(frameLayout);
            i2++;
        }
    }
}
