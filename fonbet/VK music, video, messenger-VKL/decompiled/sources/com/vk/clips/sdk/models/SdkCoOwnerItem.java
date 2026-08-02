package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.uqi;
import xsna.zrp;

/* compiled from: SdkCoOwnerItem.kt */
/* loaded from: classes17.dex */
public final class SdkCoOwnerItem implements Parcelable {
    public static final Parcelable.Creator<SdkCoOwnerItem> CREATOR = new a();
    public final UserId b;
    public final SdkOwner c;
    public final boolean d;
    public final Status e;
    public final Integer f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SdkCoOwnerItem.kt */
    public static final class Status implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status APPROVED;
        public static final Parcelable.Creator<Status> CREATOR;
        public static final Status PENDING;
        private final String value;

        /* compiled from: SdkCoOwnerItem.kt */
        public static final class a implements Parcelable.Creator<Status> {
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                return Status.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i) {
                return new Status[i];
            }
        }

        static {
            Status status = new Status("PENDING", 0, "pending");
            PENDING = status;
            Status status2 = new Status("APPROVED", 1, "approved");
            APPROVED = status2;
            Status[] statusArr = {status, status2};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
            CREATOR = new a();
        }

        public Status(String str, int i, String str2) {
            this.value = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SdkCoOwnerItem.kt */
    public static final class a implements Parcelable.Creator<SdkCoOwnerItem> {
        @Override // android.os.Parcelable.Creator
        public final SdkCoOwnerItem createFromParcel(Parcel parcel) {
            return new SdkCoOwnerItem((UserId) parcel.readParcelable(SdkCoOwnerItem.class.getClassLoader()), SdkOwner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, Status.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SdkCoOwnerItem[] newArray(int i) {
            return new SdkCoOwnerItem[i];
        }
    }

    public SdkCoOwnerItem(UserId userId, SdkOwner sdkOwner, boolean z, Status status, Integer num) {
        this.b = userId;
        this.c = sdkOwner;
        this.d = z;
        this.e = status;
        this.f = num;
    }

    public final boolean d() {
        if (this.e != Status.APPROVED) {
            return false;
        }
        Parcelable.Creator<SdkOwner> creator = SdkOwner.CREATOR;
        return !epx.f(this.c, SdkOwner.r);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkCoOwnerItem)) {
            return false;
        }
        SdkCoOwnerItem sdkCoOwnerItem = (SdkCoOwnerItem) obj;
        return epx.f(this.b, sdkCoOwnerItem.b) && epx.f(this.c, sdkCoOwnerItem.c) && this.d == sdkCoOwnerItem.d && this.e == sdkCoOwnerItem.e && epx.f(this.f, sdkCoOwnerItem.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + qoy.b((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d)) * 31;
        Integer num = this.f;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkCoOwnerItem(ownerId=");
        sb.append(this.b);
        sb.append(", owner=");
        sb.append(this.c);
        sb.append(", canSetStatus=");
        sb.append(this.d);
        sb.append(", status=");
        sb.append(this.e);
        sb.append(", mainTabState=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
