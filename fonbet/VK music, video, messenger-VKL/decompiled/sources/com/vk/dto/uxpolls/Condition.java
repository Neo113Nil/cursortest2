package com.vk.dto.uxpolls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.vu5;

/* compiled from: Condition.kt */
/* loaded from: classes18.dex */
public interface Condition extends Parcelable {

    /* compiled from: Condition.kt */
    public static final class And implements Condition {
        public static final Parcelable.Creator<And> CREATOR = new a();
        public final List<Condition> b;

        /* compiled from: Condition.kt */
        public static final class a implements Parcelable.Creator<And> {
            @Override // android.os.Parcelable.Creator
            public final And createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(And.class, parcel, arrayList, i, 1);
                }
                return new And(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final And[] newArray(int i) {
                return new And[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public And(List<? extends Condition> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof And) && epx.f(this.b, ((And) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("And(items="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    /* compiled from: Condition.kt */
    public static final class Or implements Condition {
        public static final Parcelable.Creator<Or> CREATOR = new a();
        public final List<Condition> b;

        /* compiled from: Condition.kt */
        public static final class a implements Parcelable.Creator<Or> {
            @Override // android.os.Parcelable.Creator
            public final Or createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Or.class, parcel, arrayList, i, 1);
                }
                return new Or(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Or[] newArray(int i) {
                return new Or[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Or(List<? extends Condition> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Or) && epx.f(this.b, ((Or) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Or(items="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    /* compiled from: Condition.kt */
    public interface SimpleWithId extends Condition {

        /* compiled from: Condition.kt */
        public static final class AnswerIsEmpty implements SimpleWithId {
            public static final Parcelable.Creator<AnswerIsEmpty> CREATOR = new a();
            public final int b;

            /* compiled from: Condition.kt */
            public static final class a implements Parcelable.Creator<AnswerIsEmpty> {
                @Override // android.os.Parcelable.Creator
                public final AnswerIsEmpty createFromParcel(Parcel parcel) {
                    return new AnswerIsEmpty(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final AnswerIsEmpty[] newArray(int i) {
                    return new AnswerIsEmpty[i];
                }
            }

            public AnswerIsEmpty(int i) {
                this.b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnswerIsEmpty) && this.b == ((AnswerIsEmpty) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            @Override // com.vk.dto.uxpolls.Condition.SimpleWithId
            public final int n0() {
                return this.b;
            }

            public final String toString() {
                return vu5.b(new StringBuilder("AnswerIsEmpty(qId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
            }
        }

        /* compiled from: Condition.kt */
        public static final class HasAnswers implements SimpleWithId {
            public static final Parcelable.Creator<HasAnswers> CREATOR = new a();
            public final int b;
            public final List<Integer> c;

            /* compiled from: Condition.kt */
            public static final class a implements Parcelable.Creator<HasAnswers> {
                @Override // android.os.Parcelable.Creator
                public final HasAnswers createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = pm0.b(parcel, arrayList, i, 1);
                    }
                    return new HasAnswers(readInt, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final HasAnswers[] newArray(int i) {
                    return new HasAnswers[i];
                }
            }

            public HasAnswers(int i, List<Integer> list) {
                this.b = i;
                this.c = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HasAnswers)) {
                    return false;
                }
                HasAnswers hasAnswers = (HasAnswers) obj;
                return this.b == hasAnswers.b && epx.f(this.c, hasAnswers.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
            }

            @Override // com.vk.dto.uxpolls.Condition.SimpleWithId
            public final int n0() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HasAnswers(qId=");
                sb.append(this.b);
                sb.append(", answers=");
                return ms9.a(')', sb, this.c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                Iterator a2 = ao.a(parcel, this.c);
                while (a2.hasNext()) {
                    parcel.writeInt(((Number) a2.next()).intValue());
                }
            }
        }

        /* compiled from: Condition.kt */
        public static final class HasWords implements SimpleWithId {
            public static final Parcelable.Creator<HasWords> CREATOR = new a();
            public final int b;
            public final List<String> c;

            /* compiled from: Condition.kt */
            public static final class a implements Parcelable.Creator<HasWords> {
                @Override // android.os.Parcelable.Creator
                public final HasWords createFromParcel(Parcel parcel) {
                    return new HasWords(parcel.readInt(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final HasWords[] newArray(int i) {
                    return new HasWords[i];
                }
            }

            public HasWords(int i, List<String> list) {
                this.b = i;
                this.c = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HasWords)) {
                    return false;
                }
                HasWords hasWords = (HasWords) obj;
                return this.b == hasWords.b && epx.f(this.c, hasWords.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
            }

            @Override // com.vk.dto.uxpolls.Condition.SimpleWithId
            public final int n0() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HasWords(qId=");
                sb.append(this.b);
                sb.append(", words=");
                return ms9.a(')', sb, this.c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeStringList(this.c);
            }
        }

        int n0();
    }
}
