package com.vk.core.fragments.transition;

import com.vk.core.fragments.internal.transition.TransitionAnimation;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransitionOption.kt */
/* loaded from: classes17.dex */
public final class TransitionOption$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TransitionOption$Type[] $VALUES;
    public static final TransitionOption$Type TRANSITION_SLIDE_FROM_BOTTOM;
    public static final TransitionOption$Type TRANSITION_SLIDE_FROM_RIGHT;
    private final TransitionAnimation.Animations type;

    static {
        TransitionOption$Type transitionOption$Type = new TransitionOption$Type("TRANSITION_SLIDE_FROM_RIGHT", 0, TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
        TRANSITION_SLIDE_FROM_RIGHT = transitionOption$Type;
        TransitionOption$Type transitionOption$Type2 = new TransitionOption$Type("TRANSITION_SLIDE_FROM_BOTTOM", 1, TransitionAnimationSimple$Companion$Type.SLIDE_FROM_BOTTOM.h());
        TRANSITION_SLIDE_FROM_BOTTOM = transitionOption$Type2;
        TransitionOption$Type[] transitionOption$TypeArr = {transitionOption$Type, transitionOption$Type2};
        $VALUES = transitionOption$TypeArr;
        $ENTRIES = new asp(transitionOption$TypeArr);
    }

    public TransitionOption$Type(String str, int i, TransitionAnimation.Animations animations) {
        this.type = animations;
    }

    public static TransitionOption$Type valueOf(String str) {
        return (TransitionOption$Type) Enum.valueOf(TransitionOption$Type.class, str);
    }

    public static TransitionOption$Type[] values() {
        return (TransitionOption$Type[]) $VALUES.clone();
    }

    public final TransitionAnimation.Animations h() {
        return this.type;
    }
}
