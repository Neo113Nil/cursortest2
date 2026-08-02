package com.vk.uxpolls.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxPollsModels.kt */
/* loaded from: classes6.dex */
public final class UxPollsPoll implements Parcelable {
    public static final Parcelable.Creator<UxPollsPoll> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("initial_height")
    private final Integer initialHeight;

    @pmi0("metadata")
    private final String metadata;

    @pmi0("triggers")
    private final List<String> triggers;

    /* compiled from: UxPollsModels.kt */
    public static final class a implements Parcelable.Creator<UxPollsPoll> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsPoll createFromParcel(Parcel parcel) {
            return new UxPollsPoll(parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsPoll[] newArray(int i) {
            return new UxPollsPoll[i];
        }
    }

    public /* synthetic */ UxPollsPoll(int i, List list, Integer num, String str, zcl zclVar) {
        this(i, list, num, str);
    }

    public final Integer d() {
        return this.initialHeight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollsPoll)) {
            return false;
        }
        UxPollsPoll uxPollsPoll = (UxPollsPoll) obj;
        return this.id == uxPollsPoll.id && epx.f(this.triggers, uxPollsPoll.triggers) && epx.f(this.initialHeight, uxPollsPoll.initialHeight) && epx.f(this.metadata, uxPollsPoll.metadata);
    }

    public final List<String> f() {
        return this.triggers;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.id) * 31, 31, this.triggers);
        Integer num = this.initialHeight;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.metadata;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollsPoll(id=");
        sb.append(this.id);
        sb.append(", triggers=");
        sb.append(this.triggers);
        sb.append(", initialHeight=");
        sb.append(this.initialHeight);
        sb.append(", metadata=");
        return ho8.a(sb, this.metadata, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeStringList(this.triggers);
        Integer num = this.initialHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.metadata);
    }

    private UxPollsPoll(int i, List<String> list, Integer num, String str) {
        this.id = i;
        this.triggers = list;
        this.initialHeight = num;
        this.metadata = str;
    }

    public /* synthetic */ UxPollsPoll(int i, List list, Integer num, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}
