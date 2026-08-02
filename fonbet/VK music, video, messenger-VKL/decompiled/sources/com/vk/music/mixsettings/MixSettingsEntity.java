package com.vk.music.mixsettings;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.g5g;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;

/* compiled from: MixSettingsEntity.kt */
/* loaded from: classes3.dex */
public final class MixSettingsEntity implements Parcelable {
    public static final Parcelable.Creator<MixSettingsEntity> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final List<MixCategoryEntity> e;

    /* compiled from: MixSettingsEntity.kt */
    public static final class a implements Parcelable.Creator<MixSettingsEntity> {
        @Override // android.os.Parcelable.Creator
        public final MixSettingsEntity createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = en.a(MixCategoryEntity.CREATOR, parcel, arrayList, i, 1);
            }
            return new MixSettingsEntity(readString, readString2, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MixSettingsEntity[] newArray(int i) {
            return new MixSettingsEntity[i];
        }
    }

    public MixSettingsEntity(String str, String str2, boolean z, List<MixCategoryEntity> list) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MixSettingsEntity a(MixSettingsEntity mixSettingsEntity, ArrayList arrayList, int i) {
        String str = mixSettingsEntity.b;
        String str2 = mixSettingsEntity.c;
        boolean z = mixSettingsEntity.d;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = mixSettingsEntity.e;
        }
        mixSettingsEntity.getClass();
        return new MixSettingsEntity(str, str2, z, list);
    }

    public final List<MixCategoryEntity> d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MixOptionEntity e() {
        Object obj;
        List<MixCategoryEntity> list = this.e;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((MixCategoryEntity) it.next()).e, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((MixOptionEntity) obj).f) {
                break;
            }
        }
        return (MixOptionEntity) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixSettingsEntity)) {
            return false;
        }
        MixSettingsEntity mixSettingsEntity = (MixSettingsEntity) obj;
        return epx.f(this.b, mixSettingsEntity.b) && epx.f(this.c, mixSettingsEntity.c) && this.d == mixSettingsEntity.d && epx.f(this.e, mixSettingsEntity.e);
    }

    public final void f() {
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((MixCategoryEntity) it.next()).e.iterator();
            while (it2.hasNext()) {
                ((MixOptionEntity) it2.next()).f = false;
            }
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixSettingsEntity(title=");
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
            ((MixCategoryEntity) a2.next()).writeToParcel(parcel, i);
        }
    }
}
