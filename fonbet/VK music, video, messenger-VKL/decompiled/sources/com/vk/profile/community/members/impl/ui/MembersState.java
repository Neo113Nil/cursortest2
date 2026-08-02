package com.vk.profile.community.members.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.domain.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MembersState.kt */
/* loaded from: classes5.dex */
public final class MembersState implements lm50, Parcelable {
    public static final Parcelable.Creator<MembersState> CREATOR = new a();
    public final boolean b;
    public final List<User> c;
    public final boolean d;
    public final String e;
    public final MembersListBanner f;
    public final Error g;

    /* compiled from: MembersState.kt */
    public static final class Error implements Parcelable {
        public static final Parcelable.Creator<Error> CREATOR = new a();
        public final Cause b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MembersState.kt */
        public static final class Cause {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Cause[] $VALUES;
            public static final Cause ACCESS_TO_GROUP_DENIED;
            public static final Cause NETWORK_ERROR;

            static {
                Cause cause = new Cause("ACCESS_TO_GROUP_DENIED", 0);
                ACCESS_TO_GROUP_DENIED = cause;
                Cause cause2 = new Cause("NETWORK_ERROR", 1);
                NETWORK_ERROR = cause2;
                Cause[] causeArr = {cause, cause2};
                $VALUES = causeArr;
                $ENTRIES = new asp(causeArr);
            }

            public Cause() {
                throw null;
            }

            public static Cause valueOf(String str) {
                return (Cause) Enum.valueOf(Cause.class, str);
            }

            public static Cause[] values() {
                return (Cause[]) $VALUES.clone();
            }
        }

        /* compiled from: MembersState.kt */
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(Cause.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(Cause cause) {
            this.b = cause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.b == ((Error) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(cause=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
        }
    }

    /* compiled from: MembersState.kt */
    public static final class a implements Parcelable.Creator<MembersState> {
        @Override // android.os.Parcelable.Creator
        public final MembersState createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(User.CREATOR, parcel, arrayList, i, 1);
            }
            return new MembersState(z, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : MembersListBanner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MembersState[] newArray(int i) {
            return new MembersState[i];
        }
    }

    public MembersState(boolean z, List<User> list, boolean z2, String str, MembersListBanner membersListBanner, Error error) {
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = str;
        this.f = membersListBanner;
        this.g = error;
    }

    public static MembersState a(MembersState membersState, boolean z, List list, boolean z2, String str, MembersListBanner membersListBanner, Error error, int i) {
        if ((i & 1) != 0) {
            z = membersState.b;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            list = membersState.c;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z2 = membersState.d;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str = membersState.e;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            membersListBanner = membersState.f;
        }
        MembersListBanner membersListBanner2 = membersListBanner;
        if ((i & 32) != 0) {
            error = membersState.g;
        }
        membersState.getClass();
        return new MembersState(z3, list2, z4, str2, membersListBanner2, error);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembersState)) {
            return false;
        }
        MembersState membersState = (MembersState) obj;
        return this.b == membersState.b && epx.f(this.c, membersState.c) && this.d == membersState.d && epx.f(this.e, membersState.e) && epx.f(this.f, membersState.f) && epx.f(this.g, membersState.g);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        MembersListBanner membersListBanner = this.f;
        int hashCode2 = (hashCode + (membersListBanner == null ? 0 : membersListBanner.hashCode())) * 31;
        Error error = this.g;
        return hashCode2 + (error != null ? error.b.hashCode() : 0);
    }

    public final String toString() {
        return "MembersState(isRefreshing=" + this.b + ", members=" + this.c + ", hasNext=" + this.d + ", offset=" + this.e + ", banner=" + this.f + ", error=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((User) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        MembersListBanner membersListBanner = this.f;
        if (membersListBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            membersListBanner.writeToParcel(parcel, i);
        }
        Error error = this.g;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MembersState(boolean z, List list, boolean z2, String str, MembersListBanner membersListBanner, Error error, int i, zcl zclVar) {
        this(z, list, z2, str, (i & 16) != 0 ? null : membersListBanner, (i & 32) != 0 ? null : error);
    }
}
