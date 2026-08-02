package com.vk.superapp.api.dto.app.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.ProfileItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;

/* compiled from: UserStack.kt */
/* loaded from: classes6.dex */
public final class UserStack implements Parcelable {
    public static final Parcelable.Creator<UserStack> CREATOR = new a();
    public final String b;
    public final List<ProfileItem> c;

    /* compiled from: UserStack.kt */
    public static final class a implements Parcelable.Creator<UserStack> {
        @Override // android.os.Parcelable.Creator
        public final UserStack createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(UserStack.class, parcel, arrayList, i, 1);
            }
            return new UserStack(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UserStack[] newArray(int i) {
            return new UserStack[i];
        }
    }

    public UserStack(String str, List<ProfileItem> list) {
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
