package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollOption;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import defpackage.q0;
import xsna.epx;
import xsna.gp;
import xsna.kj50;
import xsna.oq;
import xsna.vu5;

/* compiled from: StoryStatisticsStickersAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: StoryStatisticsStickersAction.kt */
    /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.a$a, reason: collision with other inner class name */
    public static final class C1811a extends a {
        public static final C1811a b = new C1811a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1811a);
        }

        public final int hashCode() {
            return -133702932;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: StoryStatisticsStickersAction.kt */
    public static abstract class b extends a {

        /* compiled from: StoryStatisticsStickersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C1812a extends b {
            public final PollOption b;

            public C1812a(PollOption pollOption) {
                this.b = pollOption;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1812a) && epx.f(this.b, ((C1812a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OptionClicked(pollOption=" + this.b + ')';
            }
        }
    }

    /* compiled from: StoryStatisticsStickersAction.kt */
    public static abstract class c extends a {

        /* compiled from: StoryStatisticsStickersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.a$c$a, reason: collision with other inner class name */
        public static final class C1813a extends c {
            public final int b;

            public C1813a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1813a) && this.b == ((C1813a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Deleted(questionId="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class b extends c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1949828000;
            }

            public final String toString() {
                return "DisableMultiSelectMode";
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.a$c$c, reason: collision with other inner class name */
        public static final class C1814c extends c {
            public static final C1814c b = new C1814c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1814c);
            }

            public final int hashCode() {
                return -635740711;
            }

            public final String toString() {
                return "HeaderButtonClick";
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class d extends c {
            public final StoryQuestionEntry b;

            public d(StoryQuestionEntry storyQuestionEntry) {
                this.b = storyQuestionEntry;
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
                return "ItemClick(question=" + this.b + ')';
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class e extends c {
            public final StoryQuestionEntry b;

            public e(StoryQuestionEntry storyQuestionEntry) {
                this.b = storyQuestionEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ItemLongClick(question=" + this.b + ')';
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class f extends c {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -779589657;
            }

            public final String toString() {
                return "MultiplePublishButtonClick";
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class g extends c {
            public final StoryQuestionEntry b;

            public g(StoryQuestionEntry storyQuestionEntry) {
                this.b = storyQuestionEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OptionsClick(question=" + this.b + ')';
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class h extends c {
            public final boolean b;
            public final Throwable c;

            public h(boolean z, Throwable th) {
                this.b = z;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.b == hVar.b && epx.f(this.c, hVar.c);
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

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class i extends c {
            public final VKList<StoryQuestionEntry> b;
            public final boolean c;

            public i(VKList<StoryQuestionEntry> vKList, boolean z) {
                this.b = vKList;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.b, iVar.b) && this.c == iVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageLoaded(questions=");
                sb.append(this.b);
                sb.append(", isReload=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class j extends c {
            public final boolean b;

            public j(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.b == ((j) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("PageLoading(isReload="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class k extends c {
            public final StoryQuestionEntry b;

            public k(StoryQuestionEntry storyQuestionEntry) {
                this.b = storyQuestionEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PublishClick(question=" + this.b + ')';
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class l extends c {
            public final int b;
            public final UserId c;

            public l(int i, UserId userId) {
                this.b = i;
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return this.b == lVar.b && epx.f(this.c, lVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                UserId userId = this.c;
                return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UserBlocked(questionId=");
                sb.append(this.b);
                sb.append(", authorId=");
                return gp.b(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersAction.kt */
        public static final class m extends c {
            public final int b;
            public final UserId c;

            public m(int i, UserId userId) {
                this.b = i;
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return this.b == mVar.b && epx.f(this.c, mVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                UserId userId = this.c;
                return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UserUnblocked(questionId=");
                sb.append(this.b);
                sb.append(", authorId=");
                return gp.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: StoryStatisticsStickersAction.kt */
    public static final class d extends a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1726372168;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: StoryStatisticsStickersAction.kt */
    public static final class e extends a {
        public final StoryEntry b;

        public e(StoryEntry storyEntry) {
            this.b = storyEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "StoryChanged(storyEntry=" + this.b + ')';
        }
    }
}
