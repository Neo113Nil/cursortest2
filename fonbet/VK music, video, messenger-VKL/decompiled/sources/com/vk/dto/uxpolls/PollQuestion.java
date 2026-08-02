package com.vk.dto.uxpolls;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: PollQuestion.kt */
/* loaded from: classes18.dex */
public interface PollQuestion extends Parcelable {

    /* compiled from: PollQuestion.kt */
    public static final class Chips implements PollQuestion {
        public static final Parcelable.Creator<Chips> CREATOR = new a();
        public final int b;
        public final String c;
        public final Condition d;
        public final List<ChipOption> e;

        /* compiled from: PollQuestion.kt */
        public static final class a implements Parcelable.Creator<Chips> {
            @Override // android.os.Parcelable.Creator
            public final Chips createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                Condition condition = (Condition) parcel.readParcelable(Chips.class.getClassLoader());
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(ChipOption.CREATOR, parcel, arrayList, i, 1);
                }
                return new Chips(readInt, readString, condition, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Chips[] newArray(int i) {
                return new Chips[i];
            }
        }

        public Chips(int i, String str, Condition condition, List<ChipOption> list) {
            this.b = i;
            this.c = str;
            this.d = condition;
            this.e = list;
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final Condition D2() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chips)) {
                return false;
            }
            Chips chips = (Chips) obj;
            return this.b == chips.b && epx.f(this.c, chips.c) && epx.f(this.d, chips.d) && epx.f(this.e, chips.e);
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final int getId() {
            return this.b;
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Condition condition = this.d;
            return this.e.hashCode() + ((a2 + (condition == null ? 0 : condition.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Chips(id=");
            sb.append(this.b);
            sb.append(", statement=");
            sb.append(this.c);
            sb.append(", conditions=");
            sb.append(this.d);
            sb.append(", options=");
            return ms9.a(')', sb, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            Iterator a2 = ao.a(parcel, this.e);
            while (a2.hasNext()) {
                ((ChipOption) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: PollQuestion.kt */
    public static final class Grade implements PollQuestion {
        public static final Parcelable.Creator<Grade> CREATOR = new a();
        public final int b;
        public final String c;
        public final Condition d;
        public final int e;
        public final String f;
        public final String g;

        /* compiled from: PollQuestion.kt */
        public static final class a implements Parcelable.Creator<Grade> {
            @Override // android.os.Parcelable.Creator
            public final Grade createFromParcel(Parcel parcel) {
                return new Grade(parcel.readInt(), parcel.readString(), (Condition) parcel.readParcelable(Grade.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Grade[] newArray(int i) {
                return new Grade[i];
            }
        }

        public Grade(int i, String str, Condition condition, int i2, String str2, String str3) {
            this.b = i;
            this.c = str;
            this.d = condition;
            this.e = i2;
            this.f = str2;
            this.g = str3;
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final Condition D2() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Grade)) {
                return false;
            }
            Grade grade = (Grade) obj;
            return this.b == grade.b && epx.f(this.c, grade.c) && epx.f(this.d, grade.d) && this.e == grade.e && epx.f(this.f, grade.f) && epx.f(this.g, grade.g);
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final int getId() {
            return this.b;
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Condition condition = this.d;
            return this.g.hashCode() + urd0.a(shy.a(this.e, (a2 + (condition == null ? 0 : condition.hashCode())) * 31, 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Grade(id=");
            sb.append(this.b);
            sb.append(", statement=");
            sb.append(this.c);
            sb.append(", conditions=");
            sb.append(this.d);
            sb.append(", maxGrade=");
            sb.append(this.e);
            sb.append(", minDescription=");
            sb.append(this.f);
            sb.append(", maxDescription=");
            return ho8.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }
    }

    /* compiled from: PollQuestion.kt */
    public static final class Open implements PollQuestion {
        public static final Parcelable.Creator<Open> CREATOR = new a();
        public final int b;
        public final String c;
        public final Condition d;
        public final OpenFeedback e;

        /* compiled from: PollQuestion.kt */
        public static final class OpenFeedback implements Parcelable {
            public static final Parcelable.Creator<OpenFeedback> CREATOR = new a();
            public final String b;
            public final boolean c;
            public final boolean d;

            /* compiled from: PollQuestion.kt */
            public static final class a implements Parcelable.Creator<OpenFeedback> {
                @Override // android.os.Parcelable.Creator
                public final OpenFeedback createFromParcel(Parcel parcel) {
                    return new OpenFeedback(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final OpenFeedback[] newArray(int i) {
                    return new OpenFeedback[i];
                }
            }

            public OpenFeedback(String str, boolean z, boolean z2) {
                this.b = str;
                this.c = z;
                this.d = z2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenFeedback)) {
                    return false;
                }
                OpenFeedback openFeedback = (OpenFeedback) obj;
                return epx.f(this.b, openFeedback.b) && this.c == openFeedback.c && this.d == openFeedback.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenFeedback(placeHolder=");
                sb.append(this.b);
                sb.append(", isCommentOpen=");
                sb.append(this.c);
                sb.append(", isCommentRequired=");
                return q0.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeInt(this.c ? 1 : 0);
                parcel.writeInt(this.d ? 1 : 0);
            }
        }

        /* compiled from: PollQuestion.kt */
        public static final class a implements Parcelable.Creator<Open> {
            @Override // android.os.Parcelable.Creator
            public final Open createFromParcel(Parcel parcel) {
                return new Open(parcel.readInt(), parcel.readString(), (Condition) parcel.readParcelable(Open.class.getClassLoader()), parcel.readInt() == 0 ? null : OpenFeedback.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Open[] newArray(int i) {
                return new Open[i];
            }
        }

        public Open(int i, String str, Condition condition, OpenFeedback openFeedback) {
            this.b = i;
            this.c = str;
            this.d = condition;
            this.e = openFeedback;
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final Condition D2() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Open)) {
                return false;
            }
            Open open = (Open) obj;
            return this.b == open.b && epx.f(this.c, open.c) && epx.f(this.d, open.d) && epx.f(this.e, open.e);
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final int getId() {
            return this.b;
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Condition condition = this.d;
            int hashCode = (a2 + (condition == null ? 0 : condition.hashCode())) * 31;
            OpenFeedback openFeedback = this.e;
            return hashCode + (openFeedback != null ? openFeedback.hashCode() : 0);
        }

        public final String toString() {
            return "Open(id=" + this.b + ", statement=" + this.c + ", conditions=" + this.d + ", openFeedback=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            OpenFeedback openFeedback = this.e;
            if (openFeedback == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                openFeedback.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: PollQuestion.kt */
    public static final class RatingStar implements PollQuestion {
        public static final Parcelable.Creator<RatingStar> CREATOR = new a();
        public final int b;
        public final String c;
        public final Condition d;
        public final int e;

        /* compiled from: PollQuestion.kt */
        public static final class a implements Parcelable.Creator<RatingStar> {
            @Override // android.os.Parcelable.Creator
            public final RatingStar createFromParcel(Parcel parcel) {
                return new RatingStar(parcel.readInt(), parcel.readString(), (Condition) parcel.readParcelable(RatingStar.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final RatingStar[] newArray(int i) {
                return new RatingStar[i];
            }
        }

        public RatingStar(int i, String str, Condition condition, int i2) {
            this.b = i;
            this.c = str;
            this.d = condition;
            this.e = i2;
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final Condition D2() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingStar)) {
                return false;
            }
            RatingStar ratingStar = (RatingStar) obj;
            return this.b == ratingStar.b && epx.f(this.c, ratingStar.c) && epx.f(this.d, ratingStar.d) && this.e == ratingStar.e;
        }

        @Override // com.vk.dto.uxpolls.PollQuestion
        public final int getId() {
            return this.b;
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Condition condition = this.d;
            return Integer.hashCode(this.e) + ((a2 + (condition == null ? 0 : condition.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RatingStar(id=");
            sb.append(this.b);
            sb.append(", statement=");
            sb.append(this.c);
            sb.append(", conditions=");
            sb.append(this.d);
            sb.append(", ratingMax=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.e);
        }
    }

    Condition D2();

    int getId();
}
