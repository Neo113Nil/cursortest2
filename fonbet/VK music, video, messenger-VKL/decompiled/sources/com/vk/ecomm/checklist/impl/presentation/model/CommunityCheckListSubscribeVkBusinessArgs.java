package com.vk.ecomm.checklist.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;

/* compiled from: CommunityCheckListSubscribeVkBusinessArgs.kt */
/* loaded from: classes18.dex */
public final class CommunityCheckListSubscribeVkBusinessArgs implements Parcelable {
    public static final Parcelable.Creator<CommunityCheckListSubscribeVkBusinessArgs> CREATOR = new a();
    public final CommunityCheckListTip.Type b;
    public final String c;

    /* compiled from: CommunityCheckListSubscribeVkBusinessArgs.kt */
    public static final class a implements Parcelable.Creator<CommunityCheckListSubscribeVkBusinessArgs> {
        @Override // android.os.Parcelable.Creator
        public final CommunityCheckListSubscribeVkBusinessArgs createFromParcel(Parcel parcel) {
            return new CommunityCheckListSubscribeVkBusinessArgs(CommunityCheckListTip.Type.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityCheckListSubscribeVkBusinessArgs[] newArray(int i) {
            return new CommunityCheckListSubscribeVkBusinessArgs[i];
        }
    }

    public CommunityCheckListSubscribeVkBusinessArgs(CommunityCheckListTip.Type type, String str) {
        this.b = type;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
    }
}
