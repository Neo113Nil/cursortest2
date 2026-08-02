package com.vk.posting.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.zcl;

/* compiled from: PickerRootParams.kt */
/* loaded from: classes5.dex */
public final class PickerRootParams implements Parcelable {
    public static final Parcelable.Creator<PickerRootParams> CREATOR = new a();
    public final UserId b;
    public final UserId c;
    public final PickerAttachType d;

    /* compiled from: PickerRootParams.kt */
    public static final class a implements Parcelable.Creator<PickerRootParams> {
        @Override // android.os.Parcelable.Creator
        public final PickerRootParams createFromParcel(Parcel parcel) {
            return new PickerRootParams((UserId) parcel.readParcelable(PickerRootParams.class.getClassLoader()), (UserId) parcel.readParcelable(PickerRootParams.class.getClassLoader()), (PickerAttachType) parcel.readParcelable(PickerRootParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PickerRootParams[] newArray(int i) {
            return new PickerRootParams[i];
        }
    }

    public PickerRootParams(UserId userId, UserId userId2, PickerAttachType pickerAttachType) {
        this.b = userId;
        this.c = userId2;
        this.d = pickerAttachType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickerRootParams)) {
            return false;
        }
        PickerRootParams pickerRootParams = (PickerRootParams) obj;
        return epx.f(this.b, pickerRootParams.b) && epx.f(this.c, pickerRootParams.c) && epx.f(this.d, pickerRootParams.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        UserId userId = this.c;
        return this.d.hashCode() + ((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31);
    }

    public final String toString() {
        return "PickerRootParams(firstTabUserId=" + this.b + ", secondTabUserId=" + this.c + ", type=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public /* synthetic */ PickerRootParams(UserId userId, UserId userId2, PickerAttachType pickerAttachType, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : userId2, pickerAttachType);
    }
}
