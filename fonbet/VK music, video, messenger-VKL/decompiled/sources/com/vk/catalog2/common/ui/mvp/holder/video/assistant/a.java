package com.vk.catalog2.common.ui.mvp.holder.video.assistant;

import xsna.epx;
import xsna.ho8;
import xsna.vu5;

/* compiled from: AiAssistantCardAction.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: AiAssistantCardAction.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.holder.video.assistant.a$a, reason: collision with other inner class name */
    public static final class C0511a implements a {
        public static final C0511a a = new C0511a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0511a);
        }

        public final int hashCode() {
            return -1570407131;
        }

        public final String toString() {
            return "AddPlaylistClick";
        }
    }

    /* compiled from: AiAssistantCardAction.kt */
    public static final class b implements a {
    }

    /* compiled from: AiAssistantCardAction.kt */
    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 122554642;
        }

        public final String toString() {
            return "HeaderIconClick";
        }
    }

    /* compiled from: AiAssistantCardAction.kt */
    public static final class d implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPlaylistClick(ownerId=");
            sb.append((Object) null);
            sb.append(", albumId=");
            return vu5.b(sb, 0, ')');
        }
    }

    /* compiled from: AiAssistantCardAction.kt */
    public static final class e implements a {
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
            throw null;
        }

        public final String toString() {
            return "ReactOnMessageClick(reactionState=" + ((Object) null) + ')';
        }
    }

    /* compiled from: AiAssistantCardAction.kt */
    public static final class f implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SuggestionClick(prompt=null)";
        }
    }

    /* compiled from: AiAssistantCardAction.kt */
    public static final class g implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoClick(videoId="), null, ')');
        }
    }
}
