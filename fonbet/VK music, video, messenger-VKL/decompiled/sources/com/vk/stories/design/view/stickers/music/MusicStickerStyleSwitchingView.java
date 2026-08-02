package com.vk.stories.design.view.stickers.music;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a850;
import xsna.bwt0;
import xsna.c850;
import xsna.d850;
import xsna.e850;
import xsna.epx;
import xsna.f4m;
import xsna.f850;
import xsna.fo2;
import xsna.j5g;
import xsna.x620;
import xsna.y750;
import xsna.z750;
import xsna.zo8;

/* compiled from: MusicStickerStyleSwitchingView.kt */
/* loaded from: classes6.dex */
public final class MusicStickerStyleSwitchingView extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public final MusicStickerStyle b;
    public boolean c;
    public boolean d;
    public StoryMusicInfo e;
    public List<? extends MusicStickerStyle> f;
    public MusicStickerStyle g;
    public final e850 h;
    public final LinkedHashMap i;
    public f850 j;

    public MusicStickerStyleSwitchingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static ValueAnimator a(MusicStickerStyleSwitchingView musicStickerStyleSwitchingView, final View view) {
        new x620(8);
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(0);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(100L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.b850
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = MusicStickerStyleSwitchingView.k;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = view;
                view2.setScaleX(floatValue);
                view2.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        duration.addListener(new c850());
        return duration;
    }

    private final void setCurrentView(f850 f850Var) {
        int i = 1;
        if (this.c || this.d) {
            View view = this.j.getView();
            View view2 = f850Var.getView();
            if (epx.f(view, view2)) {
                if (view2.getParent() == null) {
                    addView(view2);
                }
                a(this, view2).start();
            } else {
                zo8 zo8Var = new zo8(this, view, view2, 6);
                view.setAlpha(1.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L);
                duration.addUpdateListener(new fo2(view, i));
                duration.addListener(new d850(view, zo8Var));
                ValueAnimator a = a(this, view2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(duration, a);
                animatorSet.start();
            }
            performHapticFeedback(16, 1);
        } else {
            removeAllViews();
            bwt0.p0(f850Var.getView(), true);
            addView(f850Var.getView());
        }
        this.j = f850Var;
        f850Var.c(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.y750] */
    /* JADX WARN: Type inference failed for: r2v6, types: [xsna.z750] */
    public final f850 b(MusicStickerStyle musicStickerStyle) {
        a850 a850Var;
        LinkedHashMap linkedHashMap = this.i;
        f850 f850Var = (f850) linkedHashMap.get(musicStickerStyle);
        if (f850Var != null) {
            return f850Var;
        }
        Context context = getContext();
        this.h.getClass();
        int i = e850.a.$EnumSwitchMapping$0[musicStickerStyle.ordinal()];
        if (i == 1) {
            a850Var = new a850(context);
        } else if (i == 2) {
            a850Var = new y750(context);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a850Var = new z750(context);
        }
        bwt0.Q(a850Var, R.id.music_sticker_style_auto_test, musicStickerStyle);
        a850Var.getView().setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        f4m.m(17, a850Var.getView());
        a850Var.getView().setVisibility(8);
        linkedHashMap.put(musicStickerStyle, a850Var);
        return a850Var;
    }

    public final boolean getAnimateChanges() {
        return this.c;
    }

    public final List<MusicStickerStyle> getAvailableStyles() {
        return this.f;
    }

    public final StoryMusicInfo getCurrentInfo() {
        return this.e;
    }

    public final MusicStickerStyle getCurrentStyle() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.clear();
    }

    public final void setAnimateChanges(boolean z) {
        this.c = z;
    }

    public final void setAvailableStyles(List<? extends MusicStickerStyle> list) {
        List<? extends MusicStickerStyle> list2 = list;
        if (list2.isEmpty()) {
            list2 = Collections.singletonList(this.b);
        }
        this.f = list2;
        if (this.d) {
            removeAllViews();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                f850 b = b((MusicStickerStyle) it.next());
                addView(b.getView());
                b.c(this.e);
            }
        }
        setCurrentStyle(this.f.contains(this.g) ? this.g : (MusicStickerStyle) j5g.Y(this.f));
    }

    public final void setCurrentInfo(StoryMusicInfo storyMusicInfo) {
        this.e = storyMusicInfo;
        if (!this.d) {
            this.j.c(storyMusicInfo);
            return;
        }
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            b((MusicStickerStyle) it.next()).c(storyMusicInfo);
        }
    }

    public final void setCurrentStyle(MusicStickerStyle musicStickerStyle) {
        if (this.f.contains(this.g)) {
            this.g = musicStickerStyle;
            setCurrentView(b(musicStickerStyle));
            announceForAccessibility(this.j.getView().getContentDescription());
        }
    }

    public final void setPreloadStyles(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        setAvailableStyles(this.f);
    }

    public MusicStickerStyleSwitchingView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        MusicStickerStyle musicStickerStyle = MusicStickerStyle.Horizontal;
        this.b = musicStickerStyle;
        this.f = MusicStickerStyle.h();
        this.g = musicStickerStyle;
        this.h = new e850();
        this.i = new LinkedHashMap();
        this.j = b(this.g);
        bwt0.b0(17, this);
    }
}
