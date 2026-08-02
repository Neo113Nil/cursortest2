package com.vk.superapp.api.dto.app.catalog.footer;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.ProfileItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: UserStackFooter.kt */
/* loaded from: classes6.dex */
public final class UserStackFooter extends SectionFooter {
    public static final Parcelable.Creator<UserStackFooter> CREATOR = new a();
    public final String c;
    public final List<ProfileItem> d;

    /* compiled from: UserStackFooter.kt */
    public static final class a implements Parcelable.Creator<UserStackFooter> {
        @Override // android.os.Parcelable.Creator
        public final UserStackFooter createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(UserStackFooter.class, parcel, arrayList, i, 1);
            }
            return new UserStackFooter(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UserStackFooter[] newArray(int i) {
            return new UserStackFooter[i];
        }
    }

    public UserStackFooter(String str, List<ProfileItem> list) {
        super("user_stack");
        this.c = str;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStackFooter)) {
            return false;
        }
        UserStackFooter userStackFooter = (UserStackFooter) obj;
        return epx.f(this.c, userStackFooter.c) && epx.f(this.d, userStackFooter.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStackFooter(description=");
        sb.append(this.c);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
