package com.vk.libvideo.offline.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.a900;
import xsna.asp;
import xsna.s9t0;
import xsna.t800;
import xsna.udy;
import xsna.upj0;
import xsna.zrp;

/* compiled from: VideoAnimatedDownloadingDelegate.kt */
/* loaded from: classes3.dex */
public final class VideoAnimatedDownloadingDelegate {
    public boolean a;
    public s9t0 b = s9t0.c.a;
    public boolean c;
    public boolean d;
    public VideoFile e;
    public VideoFile f;
    public VideoFile g;
    public float h;
    public ValueAnimator i;
    public final LottieAnimationView j;
    public final VkSpinner k;
    public final LottieAnimationView l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAnimatedDownloadingDelegate.kt */
    public static final class AnimationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType FINISH;
        public static final AnimationType PROGRESS;

        static {
            AnimationType animationType = new AnimationType("PROGRESS", 0);
            PROGRESS = animationType;
            AnimationType animationType2 = new AnimationType("FINISH", 1);
            FINISH = animationType2;
            AnimationType[] animationTypeArr = {animationType, animationType2};
            $VALUES = animationTypeArr;
            $ENTRIES = new asp(animationTypeArr);
        }

        public AnimationType() {
            throw null;
        }

        public static zrp<AnimationType> h() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAnimatedDownloadingDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            try {
                iArr[AnimationType.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationType.FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoAnimatedDownloadingDelegate(View view) {
        this.j = (LottieAnimationView) view.findViewById(R.id.finished_loading_animation_view);
        this.k = (VkSpinner) view.findViewById(R.id.custom_progress_bar);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.download_progress_animation_view);
        this.l = lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.U(new a());
        }
    }

    public final void a() {
        LottieAnimationView lottieAnimationView = this.l;
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.W();
        LottieAnimationView lottieAnimationView2 = this.j;
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.W();
        this.k.setVisibility(8);
    }

    public final void b(int i, Set<? extends AnimationType> set) {
        LottieAnimationView lottieAnimationView;
        VkSpinner vkSpinner = this.k;
        if (vkSpinner != null) {
            vkSpinner.setIndeterminateTintList(ColorStateList.valueOf(i));
        }
        if (vkSpinner != null) {
            vkSpinner.setProgressTintList(ColorStateList.valueOf(i));
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            int i2 = b.$EnumSwitchMapping$0[((AnimationType) it.next()).ordinal()];
            if (i2 == 1) {
                lottieAnimationView = this.l;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                lottieAnimationView = this.j;
            }
            if (lottieAnimationView != null) {
                upj0 upj0Var = new upj0(i);
                lottieAnimationView.V(new udy("**"), t800.I, new a900(upj0Var));
            }
        }
    }

    /* compiled from: VideoAnimatedDownloadingDelegate.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = VideoAnimatedDownloadingDelegate.this;
            if (videoAnimatedDownloadingDelegate.a) {
                VkSpinner vkSpinner = videoAnimatedDownloadingDelegate.k;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView = videoAnimatedDownloadingDelegate.j;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView2 = videoAnimatedDownloadingDelegate.j;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.m0();
                }
                videoAnimatedDownloadingDelegate.l.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
