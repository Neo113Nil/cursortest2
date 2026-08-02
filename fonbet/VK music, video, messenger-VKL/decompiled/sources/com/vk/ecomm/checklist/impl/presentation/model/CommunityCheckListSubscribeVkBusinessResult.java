package com.vk.ecomm.checklist.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;

/* compiled from: CommunityCheckListSubscribeVkBusinessResult.kt */
/* loaded from: classes18.dex */
public final class CommunityCheckListSubscribeVkBusinessResult implements Parcelable {
    public static final Parcelable.Creator<CommunityCheckListSubscribeVkBusinessResult> CREATOR = new a();
    public final boolean b;
    public final CommunityCheckListTip.Type c;
    public final String d;

    /* compiled from: CommunityCheckListSubscribeVkBusinessResult.kt */
    public static final class a implements Parcelable.Creator<CommunityCheckListSubscribeVkBusinessResult> {
        @Override // android.os.Parcelable.Creator
        public final CommunityCheckListSubscribeVkBusinessResult createFromParcel(Parcel parcel) {
            return new CommunityCheckListSubscribeVkBusinessResult(parcel.readInt() != 0, CommunityCheckListTip.Type.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityCheckListSubscribeVkBusinessResult[] newArray(int i) {
            return new CommunityCheckListSubscribeVkBusinessResult[i];
        }
    }

    public CommunityCheckListSubscribeVkBusinessResult(boolean z, CommunityCheckListTip.Type type, String str) {
        this.b = z;
        this.c = type;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
    }
}
