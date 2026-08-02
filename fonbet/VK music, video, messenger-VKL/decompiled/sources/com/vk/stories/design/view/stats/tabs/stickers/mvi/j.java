package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.tlo0;

/* compiled from: StoryStatisticsStickersSideEffect.kt */
/* loaded from: classes6.dex */
public abstract class j {

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class a extends j {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeMultiplePublishButtonVisibility(isVisible="), this.a, ')');
        }
    }

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class b extends j {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 246137307;
        }

        public final String toString() {
            return "ClearCachedQuestions";
        }
    }

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class c extends j {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1582184194;
        }

        public final String toString() {
            return "CloseStatisticsOnBackPressed";
        }
    }

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class d extends j {
        public final Poll a;
        public final PollOption b;

        public d(Poll poll, PollOption pollOption) {
            this.a = poll;
            this.b = pollOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenPollOptionVoters(poll=" + this.a + ", pollOption=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class e extends j {
        public final StoryQuestionEntry a;
        public final StoryEntry b;

        public e(StoryQuestionEntry storyQuestionEntry, StoryEntry storyEntry) {
            this.a = storyQuestionEntry;
            this.b = storyEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenQuestionOptions(question=" + this.a + ", storyEntry=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class f extends j {
        public final List<StoryQuestionEntry> a;
        public final StoryEntry b;

        public f(List<StoryQuestionEntry> list, StoryEntry storyEntry) {
            this.a = list;
            this.b = storyEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PublishQuestionsInNewStory(questions=" + this.a + ", storyEntry=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsStickersSideEffect.kt */
    public static final class g extends j {
        public final tlo0.e a;

        public g(tlo0.e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(text=" + this.a + ')';
        }
    }
}
