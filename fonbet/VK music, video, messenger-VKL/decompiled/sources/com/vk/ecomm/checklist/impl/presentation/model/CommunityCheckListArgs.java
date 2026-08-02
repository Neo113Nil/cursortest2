package com.vk.ecomm.checklist.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunityCheckListArgs.kt */
/* loaded from: classes18.dex */
public final class CommunityCheckListArgs implements Parcelable {
    public static final Parcelable.Creator<CommunityCheckListArgs> CREATOR = new a();
    public final UserId b;
    public final String c;

    /* compiled from: CommunityCheckListArgs.kt */
    public static final class a implements Parcelable.Creator<CommunityCheckListArgs> {
        @Override // android.os.Parcelable.Creator
        public final CommunityCheckListArgs createFromParcel(Parcel parcel) {
            return new CommunityCheckListArgs((UserId) parcel.readParcelable(CommunityCheckListArgs.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityCheckListArgs[] newArray(int i) {
            return new CommunityCheckListArgs[i];
        }
    }

    public CommunityCheckListArgs(UserId userId, String str) {
        this.b = userId;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
