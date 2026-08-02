package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import java.util.Set;
import xsna.epx;
import xsna.km50;
import xsna.qoy;
import xsna.ur;

/* compiled from: StoryStatisticsStickersState.kt */
/* loaded from: classes6.dex */
public final class k implements km50 {
    public final StoryEntry b;
    public final b c;
    public final c d;
    public final boolean e;
    public final Set<StoryQuestionEntry> f;

    /* compiled from: StoryStatisticsStickersState.kt */
    public static abstract class a {

        /* compiled from: StoryStatisticsStickersState.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.k$a$a, reason: collision with other inner class name */
        public static final class C1818a extends a {
            public final Throwable a;

            public C1818a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: StoryStatisticsStickersState.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1896212169;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: StoryStatisticsStickersState.kt */
    public static final class b {
        public final Poll a;
        public final a b;

        public b(Poll poll, a aVar) {
            this.a = poll;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            Poll poll = this.a;
            int hashCode = (poll == null ? 0 : poll.hashCode()) * 31;
            a aVar = this.b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "PollState(item=" + this.a + ", loadingState=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsStickersState.kt */
    public static final class c {
        public final VKList<StoryQuestionEntry> a;
        public final a b;
        public final a c;

        public c(VKList<StoryQuestionEntry> vKList, a aVar, a aVar2) {
            this.a = vKList;
            this.b = aVar;
            this.c = aVar2;
        }

        public static c a(c cVar, VKList vKList, a aVar, a aVar2, int i) {
            if ((i & 1) != 0) {
                vKList = cVar.a;
            }
            if ((i & 2) != 0) {
                aVar = cVar.b;
            }
            if ((i & 4) != 0) {
                aVar2 = cVar.c;
            }
            cVar.getClass();
            return new c(vKList, aVar, aVar2);
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
            VKList<StoryQuestionEntry> vKList = this.a;
            int hashCode = (vKList == null ? 0 : vKList.hashCode()) * 31;
            a aVar = this.b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.c;
            return hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public final String toString() {
            return "QuestionsState(items=" + this.a + ", firstPageLoadingState=" + this.b + ", nextPageLoadingState=" + this.c + ')';
        }
    }

    public k(StoryEntry storyEntry, b bVar, c cVar, boolean z, Set<StoryQuestionEntry> set) {
        this.b = storyEntry;
        this.c = bVar;
        this.d = cVar;
        this.e = z;
        this.f = set;
    }

    public static k a(k kVar, StoryEntry storyEntry, b bVar, c cVar, boolean z, Set set, int i) {
        if ((i & 1) != 0) {
            storyEntry = kVar.b;
        }
        StoryEntry storyEntry2 = storyEntry;
        if ((i & 2) != 0) {
            bVar = kVar.c;
        }
        b bVar2 = bVar;
        if ((i & 4) != 0) {
            cVar = kVar.d;
        }
        c cVar2 = cVar;
        if ((i & 8) != 0) {
            z = kVar.e;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            set = kVar.f;
        }
        kVar.getClass();
        return new k(storyEntry2, bVar2, cVar2, z2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d) && this.e == kVar.e && epx.f(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsStickersState(currentStoryEntry=");
        sb.append(this.b);
        sb.append(", poll=");
        sb.append(this.c);
        sb.append(", questions=");
        sb.append(this.d);
        sb.append(", isMultiSelectEnabled=");
        sb.append(this.e);
        sb.append(", selectedQuestions=");
        return ur.c(sb, this.f, ')');
    }
}
