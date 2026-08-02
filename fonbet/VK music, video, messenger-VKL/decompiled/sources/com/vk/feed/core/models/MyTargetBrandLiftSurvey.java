package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.ms9;
import xsna.shy;
import xsna.urd0;

/* compiled from: MyTargetBrandLiftSurvey.kt */
/* loaded from: classes18.dex */
public final class MyTargetBrandLiftSurvey implements Serializer.StreamParcelable {
    public static final Serializer.c<MyTargetBrandLiftSurvey> CREATOR = new a();
    public final List<Question> b;

    /* compiled from: MyTargetBrandLiftSurvey.kt */
    public static final class Answer implements Serializer.StreamParcelable {
        public static final Serializer.c<Answer> CREATOR = new a();
        public final String b;
        public final int c;
        public final List<Image> d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Answer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Answer a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                int u = serializer.u();
                ArrayList B = serializer.B(Image.class.getClassLoader());
                String H2 = serializer.H();
                return new Answer(H, u, B, H2 != null ? H2 : "");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Answer[i];
            }
        }

        public Answer(String str, int i, List<Image> list, String str2) {
            this.b = str;
            this.c = i;
            this.d = list;
            this.e = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c);
            serializer.f0(this.d);
            serializer.j0(this.e);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) obj;
            return epx.f(this.b, answer.b) && this.c == answer.c && epx.f(this.d, answer.d) && epx.f(this.e, answer.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Answer(id=");
            sb.append(this.b);
            sb.append(", answerType=");
            sb.append(this.c);
            sb.append(", logos=");
            sb.append(this.d);
            sb.append(", text=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: MyTargetBrandLiftSurvey.kt */
    public static final class Question implements Serializer.StreamParcelable {
        public static final Serializer.c<Question> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final List<Answer> e;
        public final List<Image> f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Question> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Question a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                return new Question(H, H2, H3 != null ? H3 : "", serializer.B(Answer.class.getClassLoader()), serializer.B(Image.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Question[i];
            }
        }

        public Question(String str, String str2, String str3, List<Answer> list, List<Image> list2) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = list;
            this.f = list2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.f0(this.e);
            serializer.f0(this.f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Question)) {
                return false;
            }
            Question question = (Question) obj;
            return epx.f(this.b, question.b) && epx.f(this.c, question.c) && epx.f(this.d, question.d) && epx.f(this.e, question.e) && epx.f(this.f, question.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Question(id=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", answers=");
            sb.append(this.e);
            sb.append(", images=");
            return ms9.a(')', sb, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MyTargetBrandLiftSurvey> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MyTargetBrandLiftSurvey a(Serializer serializer) {
            return new MyTargetBrandLiftSurvey(serializer.B(Question.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MyTargetBrandLiftSurvey[i];
        }
    }

    public MyTargetBrandLiftSurvey(List<Question> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyTargetBrandLiftSurvey) && epx.f(this.b, ((MyTargetBrandLiftSurvey) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MyTargetBrandLiftSurvey(questions="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
