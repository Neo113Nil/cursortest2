package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import defpackage.q0;
import xsna.epx;
import xsna.iim0;
import xsna.kj50;
import xsna.oq;
import xsna.shy;
import xsna.vu5;

/* compiled from: StoryStatisticsViewersAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: StoryStatisticsViewersAction.kt */
    /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.a$a, reason: collision with other inner class name */
    public static final class C1820a extends a {
        public static final C1820a b = new C1820a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1820a);
        }

        public final int hashCode() {
            return -1025390260;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: StoryStatisticsViewersAction.kt */
    public static abstract class b extends a {

        /* compiled from: StoryStatisticsViewersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C1821a extends b {
            public final UserId b;
            public final int c;

            public C1821a(UserId userId, int i) {
                this.b = userId;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1821a)) {
                    return false;
                }
                C1821a c1821a = (C1821a) obj;
                return epx.f(this.b, c1821a.b) && this.c == c1821a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AllHidden(parentOwnerId=");
                sb.append(this.b);
                sb.append(", parentStoryId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.a$b$b, reason: collision with other inner class name */
        public static final class C1822b extends b {
            public final UserId b;
            public final int c;

            public C1822b(UserId userId, int i) {
                this.b = userId;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1822b)) {
                    return false;
                }
                C1822b c1822b = (C1822b) obj;
                return epx.f(this.b, c1822b.b) && this.c == c1822b.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SingleHidden(ownerId=");
                sb.append(this.b);
                sb.append(", storyId=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: StoryStatisticsViewersAction.kt */
    public static final class c extends a {
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

    /* compiled from: StoryStatisticsViewersAction.kt */
    public static abstract class d extends a {

        /* compiled from: StoryStatisticsViewersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.a$d$a, reason: collision with other inner class name */
        public static final class C1823a extends d {
            public final boolean b;
            public final Throwable c;

            public C1823a(boolean z, Throwable th) {
                this.b = z;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1823a)) {
                    return false;
                }
                C1823a c1823a = (C1823a) obj;
                return this.b == c1823a.b && epx.f(this.c, c1823a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageLoadFailed(isReload=");
                sb.append(this.b);
                sb.append(", throwable=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsViewersAction.kt */
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

        /* compiled from: StoryStatisticsViewersAction.kt */
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

        /* compiled from: StoryStatisticsViewersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.a$d$d, reason: collision with other inner class name */
        public static final class C1824d extends d {
            public final iim0 b;
            public final StoryUserViewer c;

            public C1824d(iim0 iim0Var, StoryUserViewer storyUserViewer) {
                this.b = iim0Var;
                this.c = storyUserViewer;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1824d)) {
                    return false;
                }
                C1824d c1824d = (C1824d) obj;
                return epx.f(this.b, c1824d.b) && epx.f(this.c, c1824d.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "PopupMenuItemClicked(item=" + this.b + ", storyUserViewer=" + this.c + ')';
            }
        }
    }
}
