package com.vk.movika.sdk.base.ui;

import android.view.View;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.epx;
import xsna.qlb0;
import xsna.wq;

/* loaded from: classes3.dex */
public interface d extends com.vk.movika.sdk.common.c {

    public static abstract class a {

        /* renamed from: com.vk.movika.sdk.base.ui.d$a$a, reason: collision with other inner class name */
        public static final class C1313a extends a {
            public final boolean a;

            public C1313a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1313a) && this.a == ((C1313a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("OnActiveExpectationPauseChanged(isPaused=", ")", this.a);
            }
        }

        public static final class b extends a {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return qlb0.a(this.a, "OnCurrentVideoPositionChanged(time=", ")");
            }
        }

        public static final class c extends a {
            public final long a;

            public c(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return qlb0.a(this.a, "OnPause(time=", ")");
            }
        }

        /* renamed from: com.vk.movika.sdk.base.ui.d$a$d, reason: collision with other inner class name */
        public static final class C1314d extends a {
            public final long a;

            public C1314d(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1314d) && this.a == ((C1314d) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return qlb0.a(this.a, "OnPlay(time=", ")");
            }
        }

        public static final class e extends a {
            public final long a;
            public final PlaybackStateListener.PlaybackState b;

            public e(long j, PlaybackStateListener.PlaybackState playbackState) {
                this.a = j;
                this.b = playbackState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a == eVar.a && this.b == eVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "OnPlaybackState(time=" + this.a + ", state=" + this.b + ")";
            }
        }

        public static final class f extends a {
            public final List<com.vk.movika.sdk.base.model.f> a;

            public f() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return wq.c("RemoveAllContainers(animateContainers=", ")", this.a);
            }

            public f(List<com.vk.movika.sdk.base.model.f> list) {
                this.a = list;
            }

            public f(int i) {
                this(EmptyList.b);
            }
        }

        public static final class g extends a {
            public final com.vk.movika.sdk.base.model.f a;
            public final boolean b;

            public g(com.vk.movika.sdk.base.model.f fVar, boolean z) {
                this.a = fVar;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && this.b == gVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "RemoveContainer(container=" + this.a + ", animate=" + this.b + ")";
            }
        }

        public static final class h extends a {
            public final com.vk.movika.sdk.base.model.f a;
            public final long b;
            public final com.vk.movika.sdk.base.ui.i c;
            public final com.vk.movika.sdk.base.model.o d;
            public final com.vk.movika.sdk.base.interactive.a e;

            public h(com.vk.movika.sdk.base.model.f fVar, long j, com.vk.movika.sdk.base.ui.i iVar, com.vk.movika.sdk.base.model.o oVar, com.vk.movika.sdk.base.interactive.a aVar) {
                this.a = fVar;
                this.b = j;
                this.c = iVar;
                this.d = oVar;
                this.e = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && this.b == hVar.b && epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d) && epx.f(this.e, hVar.e);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31;
                com.vk.movika.sdk.base.model.o oVar = this.d;
                return this.e.hashCode() + ((hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31);
            }

            public final String toString() {
                return "ShowContainer(container=" + this.a + ", currentTime=" + this.b + ", requestVideoLength=" + this.c + ", history=" + this.d + ", callback=" + this.e + ")";
            }
        }

        public static final class i extends a {
            public final boolean a;

            public i(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a == ((i) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("UpdateEnabled(isEnabled=", ")", this.a);
            }
        }
    }

    public static final class b {
        public final boolean a;
        public final View b;

        public b(View view, boolean z) {
            this.a = z;
            this.b = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "State(isEnabled=" + this.a + ", view=" + this.b + ")";
        }
    }

    void i(a aVar);

    void p();
}
