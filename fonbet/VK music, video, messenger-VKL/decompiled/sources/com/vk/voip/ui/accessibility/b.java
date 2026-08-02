package com.vk.voip.ui.accessibility;

import android.content.Context;
import com.vk.voip.ui.accessibility.AccessibilityEvents;

/* compiled from: AccessibilityMessages.kt */
/* loaded from: classes7.dex */
public final class b {
    public final Context a;

    /* compiled from: AccessibilityMessages.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessibilityEvents.Event.values().length];
            try {
                iArr[AccessibilityEvents.Event.REACTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessibilityEvents.Event.USER_JOINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessibilityEvents.Event.USER_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccessibilityEvents.Event.HAND_RAISED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccessibilityEvents.Event.HAND_LOWERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccessibilityEvents.Event.SCREEN_CAST_STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccessibilityEvents.Event.SCREEN_CAST_STOPPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccessibilityEvents.Event.MOVIE_STARTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccessibilityEvents.Event.MOVIE_STOPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccessibilityEvents.Event.RECORD_STARTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccessibilityEvents.Event.RECORD_STOPPED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccessibilityEvents.Event.STREAMING_STARTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccessibilityEvents.Event.STREAMING_STOPPED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AccessibilityEvents.Event.ASR_STARTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AccessibilityEvents.Event.ASR_STOPPED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(Context context) {
        this.a = context;
    }
}
