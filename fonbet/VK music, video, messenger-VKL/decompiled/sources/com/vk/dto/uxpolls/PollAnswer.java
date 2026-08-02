package com.vk.dto.uxpolls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.zcl;

/* compiled from: PollAnswer.kt */
/* loaded from: classes18.dex */
public final class PollAnswer implements Parcelable {
    public static final Parcelable.Creator<PollAnswer> CREATOR = new a();
    public final List<Integer> b;
    public final String c;

    /* compiled from: PollAnswer.kt */
    public static final class a implements Parcelable.Creator<PollAnswer> {
        @Override // android.os.Parcelable.Creator
        public final PollAnswer createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new PollAnswer(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollAnswer[] newArray(int i) {
            return new PollAnswer[i];
        }
    }

    public PollAnswer() {
        this(null, null, 3, null);
    }

    public static PollAnswer a(PollAnswer pollAnswer, List list, String str, int i) {
        if ((i & 1) != 0) {
            list = pollAnswer.b;
        }
        if ((i & 2) != 0) {
            str = pollAnswer.c;
        }
        pollAnswer.getClass();
        return new PollAnswer(list, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollAnswer)) {
            return false;
        }
        PollAnswer pollAnswer = (PollAnswer) obj;
        return epx.f(this.b, pollAnswer.b) && epx.f(this.c, pollAnswer.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollAnswer(numbers=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.c);
    }

    public PollAnswer(List<Integer> list, String str) {
        this.b = list;
        this.c = str;
    }

    public PollAnswer(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? null : str);
    }
}
