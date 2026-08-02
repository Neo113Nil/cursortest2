package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.ms9;
import xsna.shy;
import xsna.ur;
import xsna.zam0;

/* compiled from: StoryStatisticsViewersState.kt */
/* loaded from: classes6.dex */
public final class j implements km50 {
    public final StoryEntry b;
    public final StoryOwner c;
    public final d d;
    public final a e;
    public final c f;
    public final Set<UserId> g;
    public final List<zam0> h;

    /* compiled from: StoryStatisticsViewersState.kt */
    public static final class a {
        public final Set<UserId> a;
        public final b b;

        public a(Set<UserId> set, b bVar) {
            this.a = set;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            Set<UserId> set = this.a;
            int hashCode = (set == null ? 0 : set.hashCode()) * 31;
            b bVar = this.b;
            return hashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "ExcludedViewersState(usersIds=" + this.a + ", loadingState=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsViewersState.kt */
    public static abstract class b {

        /* compiled from: StoryStatisticsViewersState.kt */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: StoryStatisticsViewersState.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.j$b$b, reason: collision with other inner class name */
        public static final class C1829b extends b {
            public final boolean a;

            public C1829b(boolean z) {
                this.a = z;
            }

            public C1829b() {
                this(true);
            }
        }
    }

    /* compiled from: StoryStatisticsViewersState.kt */
    public static final class c {
        public final List<StoriesContainer> a;
        public final b b;
        public final Set<Integer> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends StoriesContainer> list, b bVar, Set<Integer> set) {
            this.a = list;
            this.b = bVar;
            this.c = set;
        }

        public static c a(c cVar, List list, b bVar, Set set, int i) {
            if ((i & 1) != 0) {
                list = cVar.a;
            }
            if ((i & 2) != 0) {
                bVar = cVar.b;
            }
            if ((i & 4) != 0) {
                set = cVar.c;
            }
            cVar.getClass();
            return new c(list, bVar, set);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            List<StoriesContainer> list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            b bVar = this.b;
            return this.c.hashCode() + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RepliesState(items=");
            sb.append(this.a);
            sb.append(", loadingState=");
            sb.append(this.b);
            sb.append(", loadedAndCachedStoriesIds=");
            return ur.c(sb, this.c, ')');
        }
    }

    /* compiled from: StoryStatisticsViewersState.kt */
    public static final class d {
        public final VKList<StoryUserProfile> a;
        public final int b;
        public final b c;
        public final b d;

        public d(VKList<StoryUserProfile> vKList, int i, b bVar, b bVar2) {
            this.a = vKList;
            this.b = i;
            this.c = bVar;
            this.d = bVar2;
        }

        public static d a(d dVar, VKList vKList, b bVar, b bVar2, int i) {
            if ((i & 1) != 0) {
                vKList = dVar.a;
            }
            int i2 = dVar.b;
            if ((i & 4) != 0) {
                bVar = dVar.c;
            }
            if ((i & 8) != 0) {
                bVar2 = dVar.d;
            }
            dVar.getClass();
            return new d(vKList, i2, bVar, bVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            VKList<StoryUserProfile> vKList = this.a;
            int a = shy.a(this.b, (vKList == null ? 0 : vKList.hashCode()) * 31, 31);
            b bVar = this.c;
            int hashCode = (a + (bVar == null ? 0 : bVar.hashCode())) * 31;
            b bVar2 = this.d;
            return hashCode + (bVar2 != null ? bVar2.hashCode() : 0);
        }

        public final String toString() {
            return "UsersState(items=" + this.a + ", reactionsCount=" + this.b + ", firstPageLoadingState=" + this.c + ", nextPageLoadingState=" + this.d + ')';
        }
    }

    public j(StoryEntry storyEntry, StoryOwner storyOwner, d dVar, a aVar, c cVar, Set<UserId> set, List<zam0> list) {
        this.b = storyEntry;
        this.c = storyOwner;
        this.d = dVar;
        this.e = aVar;
        this.f = cVar;
        this.g = set;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j a(j jVar, StoryEntry storyEntry, d dVar, a aVar, c cVar, LinkedHashSet linkedHashSet, List list, int i) {
        if ((i & 1) != 0) {
            storyEntry = jVar.b;
        }
        StoryEntry storyEntry2 = storyEntry;
        StoryOwner storyOwner = jVar.c;
        if ((i & 4) != 0) {
            dVar = jVar.d;
        }
        d dVar2 = dVar;
        if ((i & 8) != 0) {
            aVar = jVar.e;
        }
        a aVar2 = aVar;
        if ((i & 16) != 0) {
            cVar = jVar.f;
        }
        c cVar2 = cVar;
        Set set = linkedHashSet;
        if ((i & 32) != 0) {
            set = jVar.g;
        }
        Set set2 = set;
        if ((i & 64) != 0) {
            list = jVar.h;
        }
        jVar.getClass();
        return new j(storyEntry2, storyOwner, dVar2, aVar2, cVar2, set2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e) && epx.f(this.f, jVar.f) && epx.f(this.g, jVar.g) && epx.f(this.h, jVar.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        StoryOwner storyOwner = this.c;
        return this.h.hashCode() + fw3.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (storyOwner == null ? 0 : storyOwner.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsViewersState(currentStoryEntry=");
        sb.append(this.b);
        sb.append(", storyOwner=");
        sb.append(this.c);
        sb.append(", users=");
        sb.append(this.d);
        sb.append(", excludedViewers=");
        sb.append(this.e);
        sb.append(", replies=");
        sb.append(this.f);
        sb.append(", changedPrivacyViewersIds=");
        sb.append(this.g);
        sb.append(", reactions=");
        return ms9.a(')', sb, this.h);
    }
}
