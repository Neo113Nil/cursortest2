package com.vk.core.fragments.internal.transition.impl;

import com.vk.core.fragments.internal.transition.TransitionAnimation;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransitionAnimationSimple.kt */
/* loaded from: classes17.dex */
public final class TransitionAnimationSimple$Companion$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TransitionAnimationSimple$Companion$Type[] $VALUES;
    public static final TransitionAnimationSimple$Companion$Type SLIDE_FROM_BOTTOM;
    public static final TransitionAnimationSimple$Companion$Type SLIDE_FROM_RIGHT;
    private final TransitionAnimation.Animations animations;

    static {
        int i = 0;
        int i2 = 0;
        TransitionAnimationSimple transitionAnimationSimple = new TransitionAnimationSimple(R.anim.fr_anim_slide_in_right, i2, 0, i, 14);
        TransitionAnimationSimple transitionAnimationSimple2 = new TransitionAnimationSimple(i2, R.anim.fr_anim_slide_out_right, i, 0, 13);
        int i3 = 0;
        TransitionAnimationSimple transitionAnimationSimple3 = new TransitionAnimationSimple(0, i, R.anim.fr_anim_slide_in_left_with_fade, i3, 11);
        int i4 = 0;
        TransitionAnimationSimple$Companion$Type transitionAnimationSimple$Companion$Type = new TransitionAnimationSimple$Companion$Type("SLIDE_FROM_RIGHT", 0, new TransitionAnimation.Animations(transitionAnimationSimple, transitionAnimationSimple2, transitionAnimationSimple3, new TransitionAnimationSimple(i, i4, i3, R.anim.fr_anim_slide_out_left_with_fade, 7)));
        SLIDE_FROM_RIGHT = transitionAnimationSimple$Companion$Type;
        int i5 = 0;
        int i6 = 0;
        TransitionAnimationSimple$Companion$Type transitionAnimationSimple$Companion$Type2 = new TransitionAnimationSimple$Companion$Type("SLIDE_FROM_BOTTOM", 1, new TransitionAnimation.Animations(new TransitionAnimationSimple(R.anim.fr_anim_slide_in_bottom, i5, i, i4, 14), new TransitionAnimationSimple(i5, R.anim.fr_anim_slide_out_bottom, i4, 0, 13), new TransitionAnimationSimple(0, i4, R.anim.fr_anim_fade_in, i6, 11), new TransitionAnimationSimple(i4, 0, i6, R.anim.fr_anim_fade_out, 7)));
        SLIDE_FROM_BOTTOM = transitionAnimationSimple$Companion$Type2;
        TransitionAnimationSimple$Companion$Type[] transitionAnimationSimple$Companion$TypeArr = {transitionAnimationSimple$Companion$Type, transitionAnimationSimple$Companion$Type2};
        $VALUES = transitionAnimationSimple$Companion$TypeArr;
        $ENTRIES = new asp(transitionAnimationSimple$Companion$TypeArr);
    }

    public TransitionAnimationSimple$Companion$Type(String str, int i, TransitionAnimation.Animations animations) {
        this.animations = animations;
    }

    public static TransitionAnimationSimple$Companion$Type valueOf(String str) {
        return (TransitionAnimationSimple$Companion$Type) Enum.valueOf(TransitionAnimationSimple$Companion$Type.class, str);
    }

    public static TransitionAnimationSimple$Companion$Type[] values() {
        return (TransitionAnimationSimple$Companion$Type[]) $VALUES.clone();
    }

    public final TransitionAnimation.Animations h() {
        return this.animations;
    }
}
