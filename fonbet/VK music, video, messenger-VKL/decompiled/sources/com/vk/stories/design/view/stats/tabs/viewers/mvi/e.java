package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import defpackage.q0;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.ms9;
import xsna.oq;
import xsna.shy;
import xsna.ur;
import xsna.vu5;
import xsna.xl50;
import xsna.zam0;

/* compiled from: StoryStatisticsViewersPatch.kt */
/* loaded from: classes6.dex */
public abstract class e implements xl50 {

    /* compiled from: StoryStatisticsViewersPatch.kt */
    public static abstract class a extends e {

        /* compiled from: StoryStatisticsViewersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C1825a extends a {
            public final UserId b;
            public final Set<UserId> c;

            public C1825a(UserId userId, Set<UserId> set) {
                this.b = userId;
                this.c = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1825a)) {
                    return false;
                }
                C1825a c1825a = (C1825a) obj;
                return epx.f(this.b, c1825a.b) && epx.f(this.c, c1825a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Changed(changedUserId=");
                sb.append(this.b);
                sb.append(", excludedUsersIds=");
                return ur.c(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class b extends a {
            public final Throwable b;

            public b(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("LoadFailed(throwable="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class c extends a {
            public final Set<UserId> b;

            public c(Set<UserId> set) {
                this.b = set;
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
                return ur.c(new StringBuilder("Loaded(usersIds="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class d extends a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -290428742;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: StoryStatisticsViewersPatch.kt */
    public static abstract class b extends e {

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class a extends b {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Cached(storyId="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.e$b$b, reason: collision with other inner class name */
        public static final class C1826b extends b {
            public static final C1826b b = new C1826b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1826b);
            }

            public final int hashCode() {
                return 610329884;
            }

            public final String toString() {
                return "ClearCachedList";
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class c extends b {
            public final Throwable b;

            public c(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("LoadFailed(throwable="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class d extends b {
            public final List<StoriesContainer> b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends StoriesContainer> list) {
                this.b = list;
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
                return ms9.a(')', new StringBuilder("Loaded(replies="), this.b);
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.e$b$e, reason: collision with other inner class name */
        public static final class C1827e extends b {
            public static final C1827e b = new C1827e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1827e);
            }

            public final int hashCode() {
                return -1778226613;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: StoryStatisticsViewersPatch.kt */
    public static final class c extends e {
        public final StoryEntry b;

        public c(StoryEntry storyEntry) {
            this.b = storyEntry;
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
            return "StoryChanged(storyEntry=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsViewersPatch.kt */
    public static abstract class d extends e {

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class a extends d {
            public final boolean b;
            public final Throwable c;

            public a(boolean z, Throwable th) {
                this.b = z;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageLoadFailed(isReload=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class b extends d {
            public final VKList<StoryUserProfile> b;
            public final int c;
            public final boolean d;

            public b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageLoaded(users=");
                sb.append(this.b);
                sb.append(", reactionsCount=");
                sb.append(this.c);
                sb.append(", isReload=");
                return q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        public static final class c extends d {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("PageLoading(isReload="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.e$d$d, reason: collision with other inner class name */
        public static final class C1828d extends d {
            public final List<zam0> b;

            public C1828d(List<zam0> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1828d) && epx.f(this.b, ((C1828d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("ReactionsLoaded(reactions="), this.b);
            }
        }
    }
}
