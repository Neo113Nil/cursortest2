package com.vk.movika.sdk.base.logic.processor;

import com.vk.movika.sdk.base.model.o;
import java.util.Set;
import xsna.epx;
import xsna.zr;

/* loaded from: classes3.dex */
public abstract class e {

    public static final class a extends e {
    }

    public static final class b extends e {
        public final Set<com.vk.movika.sdk.base.model.d> a;

        public b(Set<com.vk.movika.sdk.base.model.d> set) {
            this.a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CompleteContainersForCurrentChapter(completedContainers=" + this.a + ")";
        }
    }

    public static final class c extends e {
        public final Set<String> a;

        public c(Set<String> set) {
            this.a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CompleteEpisodes(episodeIds=" + this.a + ")";
        }
    }

    public static final class d extends e {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return zr.a("OpenURI(uri=", this.a, ")");
        }
    }

    /* renamed from: com.vk.movika.sdk.base.logic.processor.e$e, reason: collision with other inner class name */
    public static final class C1304e extends e {
        public static final C1304e a = new C1304e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1304e);
        }

        public final int hashCode() {
            return 1084650010;
        }

        public final String toString() {
            return "PausePlayback";
        }
    }

    public static final class f extends e {
        public final Set<String> a;

        public f(Set<String> set) {
            this.a = set;
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
            return "RemoveShowingContainers(showingContainerIds=" + this.a + ")";
        }
    }

    public static final class g extends e {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -103671137;
        }

        public final String toString() {
            return "ResumePlayback";
        }
    }

    public static final class h extends e {
        public final com.vk.movika.sdk.base.model.a a;
        public final boolean b;

        public h(com.vk.movika.sdk.base.model.a aVar, boolean z) {
            this.a = aVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SetNextBranch(branch=" + this.a + ", shouldOpenNow=" + this.b + ")";
        }
    }

    public static final class i extends e {
        public final Set<String> a;

        public i(Set<String> set) {
            this.a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetShowingContainers(showingContainerIds=" + this.a + ")";
        }
    }

    public static final class j extends e {
        public final Set<String> a;

        public j(Set<String> set) {
            this.a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SkipContainersForCurrentChapter(containerIds=" + this.a + ")";
        }
    }

    public static final class k extends e {
        public final o a;

        public k(o oVar) {
            this.a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateHistory(history=" + this.a + ")";
        }
    }
}
