package com.vk.im.ui.calls;

import defpackage.q0;
import xsna.asp;
import xsna.zrp;

/* compiled from: CallStartAction.kt */
/* loaded from: classes2.dex */
public abstract class CallStartAction {

    /* compiled from: CallStartAction.kt */
    public static final class SetupMediaOptions extends CallStartAction {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallStartAction.kt */
        public static final class MediaOptionState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MediaOptionState[] $VALUES;
            public static final MediaOptionState MUTED_PERMANENT;
            public static final MediaOptionState UNMUTED;
            public static final MediaOptionState UNMUTED_BUT_MUTED_ONCE;

            static {
                MediaOptionState mediaOptionState = new MediaOptionState("UNMUTED", 0);
                UNMUTED = mediaOptionState;
                MediaOptionState mediaOptionState2 = new MediaOptionState("UNMUTED_BUT_MUTED_ONCE", 1);
                UNMUTED_BUT_MUTED_ONCE = mediaOptionState2;
                MediaOptionState mediaOptionState3 = new MediaOptionState("MUTED_PERMANENT", 2);
                MUTED_PERMANENT = mediaOptionState3;
                MediaOptionState[] mediaOptionStateArr = {mediaOptionState, mediaOptionState2, mediaOptionState3};
                $VALUES = mediaOptionStateArr;
                $ENTRIES = new asp(mediaOptionStateArr);
            }

            public MediaOptionState() {
                throw null;
            }

            public static MediaOptionState valueOf(String str) {
                return (MediaOptionState) Enum.valueOf(MediaOptionState.class, str);
            }

            public static MediaOptionState[] values() {
                return (MediaOptionState[]) $VALUES.clone();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupMediaOptions)) {
                return false;
            }
            ((SetupMediaOptions) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SetupMediaOptions(audioState=null, videoState=null)";
        }
    }

    /* compiled from: CallStartAction.kt */
    public static final class a extends CallStartAction {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SetupAnonymousJoin(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: CallStartAction.kt */
    public static final class b extends CallStartAction {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SetupFeedback(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: CallStartAction.kt */
    public static final class c extends CallStartAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SetupRecord(isEnabled=false)";
        }
    }

    /* compiled from: CallStartAction.kt */
    public static final class d extends CallStartAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SetupScreenShare(isEnabled=false)";
        }
    }

    /* compiled from: CallStartAction.kt */
    public static final class e extends CallStartAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SetupWaitingRoom(isEnabled=false)";
        }
    }

    /* compiled from: CallStartAction.kt */
    public static final class f extends CallStartAction {
        public static final f a = new f();
    }
}
