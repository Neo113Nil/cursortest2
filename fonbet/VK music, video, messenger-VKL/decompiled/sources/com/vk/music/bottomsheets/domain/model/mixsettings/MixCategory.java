package com.vk.music.bottomsheets.domain.model.mixsettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.music.mixsettings.MixCategoryType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: MixCategory.kt */
/* loaded from: classes3.dex */
public final class MixCategory implements Parcelable {
    public static final Parcelable.Creator<MixCategory> CREATOR = new a();
    public final String b;
    public final String c;
    public final MixCategoryType d;
    public final List<MixOption> e;

    /* compiled from: MixCategory.kt */
    public static final class a implements Parcelable.Creator<MixCategory> {
        @Override // android.os.Parcelable.Creator
        public final MixCategory createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            MixCategoryType valueOf = MixCategoryType.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MixOption.CREATOR, parcel, arrayList, i, 1);
            }
            return new MixCategory(readString, readString2, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MixCategory[] newArray(int i) {
            return new MixCategory[i];
        }
    }

    public MixCategory(String str, String str2, MixCategoryType mixCategoryType, List<MixOption> list) {
        this.b = str;
        this.c = str2;
        this.d = mixCategoryType;
        this.e = list;
    }

    public static MixCategory a(MixCategory mixCategory, ArrayList arrayList) {
        String str = mixCategory.b;
        String str2 = mixCategory.c;
        MixCategoryType mixCategoryType = mixCategory.d;
        mixCategory.getClass();
        return new MixCategory(str, str2, mixCategoryType, arrayList);
    }

    public final ArrayList d() {
        List<MixOption> list = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MixOption) obj).f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixCategory)) {
            return false;
        }
        MixCategory mixCategory = (MixCategory) obj;
        return epx.f(this.b, mixCategory.b) && epx.f(this.c, mixCategory.c) && this.d == mixCategory.d && epx.f(this.e, mixCategory.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixCategory(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", options=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((MixOption) a2.next()).writeToParcel(parcel, i);
        }
    }
}
