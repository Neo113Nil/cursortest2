package com.vk.newsfeed.common.recycler.holders.zhukov;

import xsna.asp;
import xsna.zrp;

/* compiled from: CropZoomGestureRecognizer.kt */
/* loaded from: classes4.dex */
public final class CropZoomGestureRecognizer {
    public InteractionType a;
    public long b;
    public float c;
    public float d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropZoomGestureRecognizer.kt */
    public static final class InteractionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InteractionType[] $VALUES;
        public static final InteractionType DRAGGING;
        public static final InteractionType SCALING;

        static {
            InteractionType interactionType = new InteractionType("SCALING", 0);
            SCALING = interactionType;
            InteractionType interactionType2 = new InteractionType("DRAGGING", 1);
            DRAGGING = interactionType2;
            InteractionType[] interactionTypeArr = {interactionType, interactionType2};
            $VALUES = interactionTypeArr;
            $ENTRIES = new asp(interactionTypeArr);
        }

        public InteractionType() {
            throw null;
        }

        public static InteractionType valueOf(String str) {
            return (InteractionType) Enum.valueOf(InteractionType.class, str);
        }

        public static InteractionType[] values() {
            return (InteractionType[]) $VALUES.clone();
        }
    }
}
