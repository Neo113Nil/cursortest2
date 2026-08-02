package com.vk.voip.ui.call_by_link.feature.events;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.gp;
import xsna.qoy;
import xsna.zrp;

/* compiled from: VoipCallByLinkNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class VoipCallByLinkNavigationEvent {

    /* compiled from: VoipCallByLinkNavigationEvent.kt */
    public static final class ToStartCall extends VoipCallByLinkNavigationEvent {
        public final UserId a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final MediaMicrophones e;
        public final MediaVideo f;
        public final boolean g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipCallByLinkNavigationEvent.kt */
        public static final class MediaMicrophones {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MediaMicrophones[] $VALUES;
            public static final MediaMicrophones DISABLED_ON_JOIN;
            public static final MediaMicrophones DISABLED_PERMANENT;
            public static final MediaMicrophones ENABLED;

            static {
                MediaMicrophones mediaMicrophones = new MediaMicrophones("ENABLED", 0);
                ENABLED = mediaMicrophones;
                MediaMicrophones mediaMicrophones2 = new MediaMicrophones("DISABLED_ON_JOIN", 1);
                DISABLED_ON_JOIN = mediaMicrophones2;
                MediaMicrophones mediaMicrophones3 = new MediaMicrophones("DISABLED_PERMANENT", 2);
                DISABLED_PERMANENT = mediaMicrophones3;
                MediaMicrophones[] mediaMicrophonesArr = {mediaMicrophones, mediaMicrophones2, mediaMicrophones3};
                $VALUES = mediaMicrophonesArr;
                $ENTRIES = new asp(mediaMicrophonesArr);
            }

            public MediaMicrophones() {
                throw null;
            }

            public static MediaMicrophones valueOf(String str) {
                return (MediaMicrophones) Enum.valueOf(MediaMicrophones.class, str);
            }

            public static MediaMicrophones[] values() {
                return (MediaMicrophones[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipCallByLinkNavigationEvent.kt */
        public static final class MediaVideo {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MediaVideo[] $VALUES;
            public static final MediaVideo DISABLED_ON_JOIN;
            public static final MediaVideo DISABLED_PERMANENT;
            public static final MediaVideo ENABLED;

            static {
                MediaVideo mediaVideo = new MediaVideo("ENABLED", 0);
                ENABLED = mediaVideo;
                MediaVideo mediaVideo2 = new MediaVideo("DISABLED_ON_JOIN", 1);
                DISABLED_ON_JOIN = mediaVideo2;
                MediaVideo mediaVideo3 = new MediaVideo("DISABLED_PERMANENT", 2);
                DISABLED_PERMANENT = mediaVideo3;
                MediaVideo[] mediaVideoArr = {mediaVideo, mediaVideo2, mediaVideo3};
                $VALUES = mediaVideoArr;
                $ENTRIES = new asp(mediaVideoArr);
            }

            public MediaVideo() {
                throw null;
            }

            public static MediaVideo valueOf(String str) {
                return (MediaVideo) Enum.valueOf(MediaVideo.class, str);
            }

            public static MediaVideo[] values() {
                return (MediaVideo[]) $VALUES.clone();
            }
        }

        public ToStartCall(UserId userId, boolean z, boolean z2, boolean z3, MediaMicrophones mediaMicrophones, MediaVideo mediaVideo, boolean z4) {
            this.a = userId;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = mediaMicrophones;
            this.f = mediaVideo;
            this.g = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToStartCall)) {
                return false;
            }
            ToStartCall toStartCall = (ToStartCall) obj;
            return epx.f(this.a, toStartCall.a) && this.b == toStartCall.b && this.c == toStartCall.c && this.d == toStartCall.d && this.e == toStartCall.e && this.f == toStartCall.f && this.g == toStartCall.g;
        }

        public final int hashCode() {
            UserId userId = this.a;
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + qoy.b(qoy.b(qoy.b((userId == null ? 0 : Long.hashCode(userId.b)) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToStartCall(groupId=");
            sb.append(this.a);
            sb.append(", isWaitingHallEnabled=");
            sb.append(this.b);
            sb.append(", isAnonymousJoinEnabled=");
            sb.append(this.c);
            sb.append(", isFeedbackEnabled=");
            sb.append(this.d);
            sb.append(", mediaMicrophones=");
            sb.append(this.e);
            sb.append(", mediaVideo=");
            sb.append(this.f);
            sb.append(", isWatchTogetherEnabled=");
            return q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: VoipCallByLinkNavigationEvent.kt */
    public static final class a extends VoipCallByLinkNavigationEvent {
        public static final a a = new a();
    }

    /* compiled from: VoipCallByLinkNavigationEvent.kt */
    public static final class b extends VoipCallByLinkNavigationEvent {
        public static final b a = new b();
    }

    /* compiled from: VoipCallByLinkNavigationEvent.kt */
    public static final class c extends VoipCallByLinkNavigationEvent {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            UserId userId = this.a;
            if (userId == null) {
                return 0;
            }
            return Long.hashCode(userId.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ToCallAsSelector(preselectedGroupId="), this.a, ')');
        }
    }
}
