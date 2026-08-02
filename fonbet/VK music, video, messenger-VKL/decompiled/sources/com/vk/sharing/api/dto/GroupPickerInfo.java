package com.vk.sharing.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import xsna.h330;

/* loaded from: classes5.dex */
public class GroupPickerInfo implements Parcelable {
    public static final Parcelable.Creator<GroupPickerInfo> CREATOR = new a();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public UserId g;
    public UserId h;
    public boolean i;
    public int j;
    public boolean p;
    public boolean q;
    public int r;
    public boolean s;
    public int k = 2;
    public int l = 2;
    public boolean m = false;
    public boolean n = false;
    public ArrayList<Target> o = new ArrayList<>();
    public ArrayList t = new ArrayList();

    public class a implements Parcelable.Creator<GroupPickerInfo> {
        @Override // android.os.Parcelable.Creator
        public final GroupPickerInfo createFromParcel(Parcel parcel) {
            GroupPickerInfo groupPickerInfo = new GroupPickerInfo();
            groupPickerInfo.k = 2;
            groupPickerInfo.l = 2;
            groupPickerInfo.m = false;
            groupPickerInfo.n = false;
            groupPickerInfo.o = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            groupPickerInfo.t = arrayList;
            groupPickerInfo.b = parcel.readInt() == 1;
            groupPickerInfo.d = parcel.readInt() == 1;
            groupPickerInfo.e = parcel.readInt() == 1;
            groupPickerInfo.f = parcel.readInt() == 1;
            groupPickerInfo.g = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            groupPickerInfo.h = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            groupPickerInfo.i = parcel.readInt() == 1;
            groupPickerInfo.j = parcel.readInt();
            groupPickerInfo.k = parcel.readInt();
            groupPickerInfo.l = parcel.readInt();
            groupPickerInfo.m = parcel.readInt() == 1;
            groupPickerInfo.n = parcel.readInt() == 1;
            groupPickerInfo.c = parcel.readInt() == 1;
            h330.a(parcel, groupPickerInfo.o, Target.class);
            groupPickerInfo.p = parcel.readInt() == 1;
            groupPickerInfo.q = parcel.readInt() == 1;
            groupPickerInfo.r = parcel.readInt();
            groupPickerInfo.s = parcel.readInt() == 1;
            h330.a(parcel, arrayList, UserId.class);
            return groupPickerInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final GroupPickerInfo[] newArray(int i) {
            return new GroupPickerInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        h330.c(parcel, this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s ? 1 : 0);
        h330.c(parcel, this.t);
    }
}
