package com.vk.profile.core.scheduled_clips;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.kj50;

/* compiled from: CommunityScheduledClipsGridAction.kt */
/* loaded from: classes5.dex */
public interface b extends kj50 {

    /* compiled from: CommunityScheduledClipsGridAction.kt */
    public static final class a implements b {
        public final UserId b;
        public final boolean c;

        public a(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(profileId=");
            sb.append(this.b);
            sb.append(", isReload=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityScheduledClipsGridAction.kt */
    /* renamed from: com.vk.profile.core.scheduled_clips.b$b, reason: collision with other inner class name */
    public static final class C1642b implements b {
        public static final C1642b b = new C1642b();
    }

    /* compiled from: CommunityScheduledClipsGridAction.kt */
    public static final class c implements b {
        public final ClipVideoFile b;

        public c(ClipVideoFile clipVideoFile) {
            this.b = clipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnClipClicked(clip=" + this.b + ')';
        }
    }

    /* compiled from: CommunityScheduledClipsGridAction.kt */
    public static final class d implements b {
        public final ClipVideoFile b;

        public d(ClipVideoFile clipVideoFile) {
            this.b = clipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnClipEdited(clip=" + this.b + ')';
        }
    }
}
