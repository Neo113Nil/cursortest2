package com.vk.uxpolls.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxPollsModels.kt */
/* loaded from: classes6.dex */
public final class UxPollsAnswer implements Parcelable {
    public static final Parcelable.Creator<UxPollsAnswer> CREATOR = new a();

    @pmi0("numeric")
    private final List<Integer> numeric;

    @pmi0("question_id")
    private final int questionId;

    @pmi0("text")
    private final String text;

    /* compiled from: UxPollsModels.kt */
    public static final class a implements Parcelable.Creator<UxPollsAnswer> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsAnswer createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UxPollsAnswer(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsAnswer[] newArray(int i) {
            return new UxPollsAnswer[i];
        }
    }

    public UxPollsAnswer(int i, List<Integer> list, String str) {
        this.questionId = i;
        this.numeric = list;
        this.text = str;
    }

    public final List<Integer> d() {
        return this.numeric;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.questionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollsAnswer)) {
            return false;
        }
        UxPollsAnswer uxPollsAnswer = (UxPollsAnswer) obj;
        return this.questionId == uxPollsAnswer.questionId && epx.f(this.numeric, uxPollsAnswer.numeric) && epx.f(this.text, uxPollsAnswer.text);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.questionId) * 31;
        List<Integer> list = this.numeric;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.text;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollsAnswer(questionId=");
        sb.append(this.questionId);
        sb.append(", numeric=");
        sb.append(this.numeric);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.questionId);
        List<Integer> list = this.numeric;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.text);
    }

    public /* synthetic */ UxPollsAnswer(int i, List list, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : str);
    }
}
