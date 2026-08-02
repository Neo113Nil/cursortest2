package com.vk.music.bottomsheets.domain.model.mixsettings;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;

/* compiled from: MixSettings.kt */
/* loaded from: classes3.dex */
public final class MixSettings implements Parcelable {
    public static final Parcelable.Creator<MixSettings> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final List<MixCategory> e;

    /* compiled from: MixSettings.kt */
    public static final class a implements Parcelable.Creator<MixSettings> {
        @Override // android.os.Parcelable.Creator
        public final MixSettings createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = en.a(MixCategory.CREATOR, parcel, arrayList, i, 1);
            }
            return new MixSettings(readString, readString2, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MixSettings[] newArray(int i) {
            return new MixSettings[i];
        }
    }

    public MixSettings(String str, String str2, boolean z, List<MixCategory> list) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixSettings)) {
            return false;
        }
        MixSettings mixSettings = (MixSettings) obj;
        return epx.f(this.b, mixSettings.b) && epx.f(this.c, mixSettings.c) && this.d == mixSettings.d && epx.f(this.e, mixSettings.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixSettings(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", multiSelect=");
        sb.append(this.d);
        sb.append(", mixCategories=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((MixCategory) a2.next()).writeToParcel(parcel, i);
        }
    }
}
