package com.vk.dto.uxpolls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: UxPoll.kt */
/* loaded from: classes18.dex */
public final class UxPoll implements Parcelable {
    public static final Parcelable.Creator<UxPoll> CREATOR = new a();
    public final int b;
    public final List<String> c;
    public final List<PollQuestion> d;
    public final String e;
    public final boolean f;
    public final int g;
    public final PollTranslations h;

    /* compiled from: UxPoll.kt */
    public static final class a implements Parcelable.Creator<UxPoll> {
        @Override // android.os.Parcelable.Creator
        public final UxPoll createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(UxPoll.class, parcel, arrayList, i, 1);
            }
            return new UxPoll(readInt, createStringArrayList, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt(), PollTranslations.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UxPoll[] newArray(int i) {
            return new UxPoll[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UxPoll(int i, List<String> list, List<? extends PollQuestion> list2, String str, boolean z, int i2, PollTranslations pollTranslations) {
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = str;
        this.f = z;
        this.g = i2;
        this.h = pollTranslations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPoll)) {
            return false;
        }
        UxPoll uxPoll = (UxPoll) obj;
        return this.b == uxPoll.b && epx.f(this.c, uxPoll.c) && epx.f(this.d, uxPoll.d) && epx.f(this.e, uxPoll.e) && this.f == uxPoll.f && this.g == uxPoll.g && epx.f(this.h, uxPoll.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + shy.a(this.g, qoy.b(urd0.a(fw3.a(fw3.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        return "UxPoll(id=" + this.b + ", triggers=" + this.c + ", questions=" + this.d + ", completionMessage=" + this.e + ", allowSkipOpenQuestion=" + this.f + ", initialHeight=" + this.g + ", translations=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeStringList(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
        this.h.writeToParcel(parcel, i);
    }
}
