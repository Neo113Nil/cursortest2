package com.vk.auth.screendata;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.qoy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MultiAccountData.kt */
/* loaded from: classes.dex */
public final class MultiAccountData implements Parcelable {
    public static final Parcelable.Creator<MultiAccountData> CREATOR = new a();
    public static final MultiAccountData f = new MultiAccountData(EmptyList.b, false, new Bundle(), 0, 8, null);
    public final List<UserId> b;
    public final boolean c;
    public final Bundle d;
    public final int e;

    /* compiled from: MultiAccountData.kt */
    /* loaded from: classes15.dex */
    public static final class a implements Parcelable.Creator<MultiAccountData> {
        @Override // android.os.Parcelable.Creator
        public final MultiAccountData createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MultiAccountData.class, parcel, arrayList, i, 1);
            }
            return new MultiAccountData(arrayList, parcel.readInt() != 0, parcel.readBundle(MultiAccountData.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiAccountData[] newArray(int i) {
            return new MultiAccountData[i];
        }
    }

    public MultiAccountData(List<UserId> list, boolean z, Bundle bundle, int i) {
        this.b = list;
        this.c = z;
        this.d = bundle;
        this.e = i;
    }

    public static MultiAccountData a(MultiAccountData multiAccountData, Bundle bundle) {
        List<UserId> list = multiAccountData.b;
        boolean z = multiAccountData.c;
        int i = multiAccountData.e;
        multiAccountData.getClass();
        return new MultiAccountData(list, z, bundle, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiAccountData)) {
            return false;
        }
        MultiAccountData multiAccountData = (MultiAccountData) obj;
        return epx.f(this.b, multiAccountData.b) && this.c == multiAccountData.c && epx.f(this.d, multiAccountData.d) && this.e == multiAccountData.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiAccountData(usersInMultiAccount=");
        sb.append(this.b);
        sb.append(", openJustAuth=");
        sb.append(this.c);
        sb.append(", metadata=");
        sb.append(this.d);
        sb.append(", accountsLimit=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeBundle(this.d);
        parcel.writeInt(this.e);
    }

    public /* synthetic */ MultiAccountData(List list, boolean z, Bundle bundle, int i, int i2, zcl zclVar) {
        this(list, z, bundle, (i2 & 8) != 0 ? Integer.MAX_VALUE : i);
    }
}
