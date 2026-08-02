package com.vk.music.mixsettings;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: MixCategoryEntity.kt */
/* loaded from: classes3.dex */
public final class MixCategoryEntity implements Parcelable {
    public static final Parcelable.Creator<MixCategoryEntity> CREATOR = new a();
    public final String b;
    public final String c;
    public final MixCategoryType d;
    public final List<MixOptionEntity> e;

    /* compiled from: MixCategoryEntity.kt */
    public static final class a implements Parcelable.Creator<MixCategoryEntity> {
        @Override // android.os.Parcelable.Creator
        public final MixCategoryEntity createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            MixCategoryType valueOf = MixCategoryType.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MixOptionEntity.CREATOR, parcel, arrayList, i, 1);
            }
            return new MixCategoryEntity(readString, readString2, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MixCategoryEntity[] newArray(int i) {
            return new MixCategoryEntity[i];
        }
    }

    public MixCategoryEntity(String str, String str2, MixCategoryType mixCategoryType, List<MixOptionEntity> list) {
        this.b = str;
        this.c = str2;
        this.d = mixCategoryType;
        this.e = list;
    }

    public final List<MixOptionEntity> d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixCategoryEntity)) {
            return false;
        }
        MixCategoryEntity mixCategoryEntity = (MixCategoryEntity) obj;
        return epx.f(this.b, mixCategoryEntity.b) && epx.f(this.c, mixCategoryEntity.c) && this.d == mixCategoryEntity.d && epx.f(this.e, mixCategoryEntity.e);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixCategoryEntity(id=");
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
            ((MixOptionEntity) a2.next()).writeToParcel(parcel, i);
        }
    }
}
