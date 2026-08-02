package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import defpackage.q0;
import xsna.epx;
import xsna.oq;
import xsna.vu5;
import xsna.xl50;

/* compiled from: StoryStatisticsStickersPatch.kt */
/* loaded from: classes6.dex */
public abstract class f implements xl50 {

    /* compiled from: StoryStatisticsStickersPatch.kt */
    public static abstract class a extends f {

        /* compiled from: StoryStatisticsStickersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C1815a extends a {
            public final Throwable b;

            public C1815a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1815a) && epx.f(this.b, ((C1815a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("LoadFailed(throwable="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersPatch.kt */
        public static final class b extends a {
            public final Poll b;

            public b(Poll poll) {
                this.b = poll;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                Poll poll = this.b;
                if (poll == null) {
                    return 0;
                }
                return poll.hashCode();
            }

            public final String toString() {
                return "Loaded(poll=" + this.b + ')';
            }
        }
    }

    /* compiled from: StoryStatisticsStickersPatch.kt */
    public static abstract class b extends f {

        /* compiled from: StoryStatisticsStickersPatch.kt */
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
                return vu5.b(new StringBuilder("Deleted(questionId="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.f$b$b, reason: collision with other inner class name */
        public static final class C1816b extends b {
            public final StoryQuestionEntry b;
            public final boolean c;

            public C1816b(StoryQuestionEntry storyQuestionEntry, boolean z) {
                this.b = storyQuestionEntry;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1816b)) {
                    return false;
                }
                C1816b c1816b = (C1816b) obj;
                return epx.f(this.b, c1816b.b) && this.c == c1816b.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ItemClick(question=");
                sb.append(this.b);
                sb.append(", isAdding=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersPatch.kt */
        public static final class c extends b {
            public final StoryQuestionEntry b;

            public c(StoryQuestionEntry storyQuestionEntry) {
                this.b = storyQuestionEntry;
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
                return "ItemLongClick(question=" + this.b + ')';
            }
        }

        /* compiled from: StoryStatisticsStickersPatch.kt */
        public static final class d extends b {
            public final boolean b;
            public final Throwable c;

            public d(boolean z, Throwable th) {
                this.b = z;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b == dVar.b && epx.f(this.c, dVar.c);
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

        /* compiled from: StoryStatisticsStickersPatch.kt */
        public static final class e extends b {
            public final VKList<StoryQuestionEntry> b;
            public final boolean c;

            public e(VKList<StoryQuestionEntry> vKList, boolean z) {
                this.b = vKList;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && this.c == eVar.c;
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

        /* compiled from: StoryStatisticsStickersPatch.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.f$b$f, reason: collision with other inner class name */
        public static final class C1817f extends b {
            public final boolean b;

            public C1817f(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1817f) && this.b == ((C1817f) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("PageLoading(isReload="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersPatch.kt */
        public static final class g extends b {
            public final boolean b;

            public g(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.b == ((g) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ToggleMultiSelectMode(isEnabled="), this.b, ')');
            }
        }

        /* compiled from: StoryStatisticsStickersPatch.kt */
        public static final class h extends b {
            public final Integer b;
            public final UserId c;
            public final boolean d;

            public h(UserId userId, boolean z, Integer num) {
                this.b = num;
                this.c = userId;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d;
            }

            public final int hashCode() {
                Integer num = this.b;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                UserId userId = this.c;
                return Boolean.hashCode(this.d) + ((hashCode + (userId != null ? Long.hashCode(userId.b) : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UserStateChanged(questionId=");
                sb.append(this.b);
                sb.append(", authorId=");
                sb.append(this.c);
                sb.append(", isBlocked=");
                return q0.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: StoryStatisticsStickersPatch.kt */
    public static final class c extends f {
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
}
