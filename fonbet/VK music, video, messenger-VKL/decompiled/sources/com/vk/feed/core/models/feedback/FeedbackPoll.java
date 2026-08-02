package com.vk.feed.core.models.feedback;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.ck70;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;

/* compiled from: FeedbackPoll.kt */
/* loaded from: classes18.dex */
public final class FeedbackPoll extends NewsEntry {
    public static final Serializer.c<FeedbackPoll> CREATOR = new a();
    public final Banner i;
    public final Poll j;
    public final String k;

    /* compiled from: FeedbackPoll.kt */
    public static final class Answer extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Answer> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Answer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Answer a(Serializer serializer) {
                return new Answer(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Answer[i];
            }
        }

        public Answer(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) obj;
            return epx.f(this.b, answer.b) && epx.f(this.c, answer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Answer(id=");
            sb.append(this.b);
            sb.append(", text=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: FeedbackPoll.kt */
    public static final class Banner extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Banner> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Banner> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Banner a(Serializer serializer) {
                return new Banner(serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Banner[i];
            }
        }

        public Banner(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return epx.f(this.b, banner.b) && epx.f(this.c, banner.c) && epx.f(this.d, banner.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Banner(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", buttonText=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: FeedbackPoll.kt */
    public static final class Gratitude extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Gratitude> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Gratitude> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Gratitude a(Serializer serializer) {
                return new Gratitude(serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gratitude[i];
            }
        }

        public Gratitude(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gratitude)) {
                return false;
            }
            Gratitude gratitude = (Gratitude) obj;
            return epx.f(this.b, gratitude.b) && epx.f(this.c, gratitude.c) && epx.f(this.d, gratitude.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gratitude(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", buttonText=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: FeedbackPoll.kt */
    public static final class Poll extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Poll> CREATOR = new a();
        public final String b;
        public final List<Question> c;
        public final Gratitude d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Poll> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Poll a(Serializer serializer) {
                return new Poll(serializer.H(), serializer.j(Question.CREATOR), (Gratitude) serializer.G(Gratitude.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Poll[i];
            }
        }

        public Poll(String str, List<Question> list, Gratitude gratitude) {
            this.b = str;
            this.c = list;
            this.d = gratitude;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.o0(this.c);
            serializer.i0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Poll)) {
                return false;
            }
            Poll poll = (Poll) obj;
            return epx.f(this.b, poll.b) && epx.f(this.c, poll.c) && epx.f(this.d, poll.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "Poll(title=" + this.b + ", questions=" + this.c + ", gratitude=" + this.d + ')';
        }
    }

    /* compiled from: FeedbackPoll.kt */
    public static final class Question extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Question> CREATOR = new a();
        public final String b;
        public final List<QuestionEntry> c;
        public final List<Answer> d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Question> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Question a(Serializer serializer) {
                return new Question(serializer.H(), serializer.j(QuestionEntry.CREATOR), serializer.j(Answer.CREATOR), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Question[i];
            }
        }

        public Question(String str, List<QuestionEntry> list, List<Answer> list2, String str2) {
            this.b = str;
            this.c = list;
            this.d = list2;
            this.e = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.o0(this.c);
            serializer.o0(this.d);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Question)) {
                return false;
            }
            Question question = (Question) obj;
            return epx.f(this.b, question.b) && epx.f(this.c, question.c) && epx.f(this.d, question.d) && epx.f(this.e, question.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Question(text=");
            sb.append(this.b);
            sb.append(", entries=");
            sb.append(this.c);
            sb.append(", answers=");
            sb.append(this.d);
            sb.append(", nextButtonText=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: FeedbackPoll.kt */
    public static final class QuestionEntry extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<QuestionEntry> CREATOR = new a();
        public final String b;
        public final NewsEntry c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<QuestionEntry> {
            @Override // com.vk.core.serialize.Serializer.c
            public final QuestionEntry a(Serializer serializer) {
                return new QuestionEntry(serializer.H(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuestionEntry[i];
            }
        }

        public QuestionEntry(String str, NewsEntry newsEntry) {
            this.b = str;
            this.c = newsEntry;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuestionEntry)) {
                return false;
            }
            QuestionEntry questionEntry = (QuestionEntry) obj;
            return epx.f(this.b, questionEntry.b) && epx.f(this.c, questionEntry.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuestionEntry(title=");
            sb.append(this.b);
            sb.append(", entry=");
            return ck70.a(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FeedbackPoll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FeedbackPoll a(Serializer serializer) {
            return new FeedbackPoll((Banner) serializer.G(Banner.class.getClassLoader()), (Poll) serializer.G(Poll.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedbackPoll[i];
        }
    }

    public FeedbackPoll(Banner banner, Poll poll, String str) {
        super(new NewsEntry.TrackData(str, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = banner;
        this.j = poll;
        this.k = str;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "feedback_poll";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.i0(this.j);
        serializer.j0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return FeedbackPoll.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.k, ((FeedbackPoll) obj).k);
    }

    public final int hashCode() {
        String str = this.k;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackPoll(banner=");
        sb.append(this.i);
        sb.append(", poll=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 28;
    }
}
