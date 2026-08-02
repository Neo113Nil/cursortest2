package com.vk.sharing.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes5.dex */
public final class ActionsInfo implements Parcelable {
    public static final Parcelable.Creator<ActionsInfo> CREATOR = new a();
    public final int b;

    @NonNull
    public final String c;

    @NonNull
    public final ArrayList<Integer> d;
    public final boolean e;

    @NonNull
    public final String f;
    public final String g;
    public boolean h;
    public final Integer i;

    public class a implements Parcelable.Creator<ActionsInfo> {
        @Override // android.os.Parcelable.Creator
        public final ActionsInfo createFromParcel(Parcel parcel) {
            return new ActionsInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionsInfo[] newArray(int i) {
            return new ActionsInfo[i];
        }
    }

    public ActionsInfo(int i, String str, String str2, String str3, boolean z, Set<Integer> set, Integer num, boolean z2) {
        this.d = new ArrayList<>();
        this.e = false;
        this.b = i;
        this.c = str == null ? "" : str;
        this.f = str2 == null ? "" : str2;
        this.g = str3;
        this.h = z;
        this.d = new ArrayList<>(set);
        this.e = z2;
        this.i = num;
    }

    public final boolean a(boolean z) {
        int i = this.b;
        if ((i & 1) <= 0 && (i & 2) <= 0 && (i & 32) <= 0 && (i & 4) <= 0 && (262144 & i) <= 0 && (i & 8) <= 0 && (i & 16) <= 0 && (i & 64) <= 0) {
            return (!z && (i & 128) > 0) || (i & 256) > 0 || (i & 512) > 0 || (i & 1024) > 0;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeList(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.i.intValue());
    }

    public ActionsInfo(Parcel parcel) {
        this.d = new ArrayList<>();
        this.e = false;
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt() == 1;
        this.d = parcel.readArrayList(null);
        this.e = parcel.readInt() == 1;
        this.i = Integer.valueOf(parcel.readInt());
    }
}
