package com.vk.catalog2.common.ui.mvp.holder.video.assistant;

import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.tq;
import xsna.us2;

/* compiled from: AiAssistantCardViewState.kt */
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: AiAssistantCardViewState.kt */
    public static final class a implements b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return epx.f(null, null);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.video.assistant.c.b
        public final us2 getText() {
            return null;
        }

        public final int hashCode() {
            return (0 * 31) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonContent(text=");
            sb.append((Object) null);
            sb.append(", suggestions=");
            return tq.f(sb, "null", ')');
        }
    }

    /* compiled from: AiAssistantCardViewState.kt */
    public interface b extends c {
        us2 getText();
    }

    /* compiled from: AiAssistantCardViewState.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.holder.video.assistant.c$c, reason: collision with other inner class name */
    public static final class C0512c implements c {
        public static final C0512c a = new C0512c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0512c);
        }

        public final int hashCode() {
            return 1979309234;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: AiAssistantCardViewState.kt */
    public static final class d implements b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return epx.f(null, null) && epx.f(null, null);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.video.assistant.c.b
        public final us2 getText() {
            return null;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(((((0 * 31) + 0) * 31) + 0) * 31, 31, false);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicContent(text=");
            sb.append((Object) null);
            sb.append(", playlist=");
            sb.append((Object) null);
            sb.append(", reactions=");
            sb.append((Object) null);
            sb.append(", isHeaderChevronVisible=");
            sb.append(false);
            sb.append(", isPlaylistButtonVisible=");
            return q0.a(sb, false, ')');
        }
    }
}
