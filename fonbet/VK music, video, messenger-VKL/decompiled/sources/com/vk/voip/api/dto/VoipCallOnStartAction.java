package com.vk.voip.api.dto;

import defpackage.q0;
import xsna.asp;
import xsna.zrp;

/* compiled from: VoipCallOnStartAction.kt */
/* loaded from: classes7.dex */
public abstract class VoipCallOnStartAction {

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class SetupMediaOptions extends VoipCallOnStartAction {
        public final MediaOptionState a;
        public final MediaOptionState b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipCallOnStartAction.kt */
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

        public SetupMediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2) {
            this.a = mediaOptionState;
            this.b = mediaOptionState2;
        }

        public final MediaOptionState a() {
            return this.a;
        }

        public final MediaOptionState b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupMediaOptions)) {
                return false;
            }
            SetupMediaOptions setupMediaOptions = (SetupMediaOptions) obj;
            return this.a == setupMediaOptions.a && this.b == setupMediaOptions.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SetupMediaOptions(audioOptionState=" + this.a + ", videoOptionState=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class a extends VoipCallOnStartAction {
        public static final a a = new a();
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class b extends VoipCallOnStartAction {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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
            return q0.a(new StringBuilder("SetupAnonymousJoin(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class c extends VoipCallOnStartAction {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SetupFeedback(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class d extends VoipCallOnStartAction {
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
            return "SetupRecord(isEnabled=false)";
        }
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class e extends VoipCallOnStartAction {
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
            return "SetupScreenShare(isEnabled=false)";
        }
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class f extends VoipCallOnStartAction {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SetupWaitingRoom(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipCallOnStartAction.kt */
    public static final class g extends VoipCallOnStartAction {
        public static final g a = new g();
    }
}
