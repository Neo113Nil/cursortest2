package com.vk.odnoklassniki.registration.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.vk.api.generated.auth.dto.AuthOnSuccessValidationProfileDto;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OkItsMeFragmentData.kt */
/* loaded from: classes4.dex */
public final class OkItsMeFragmentData implements Parcelable {
    public static final Parcelable.Creator<OkItsMeFragmentData> CREATOR = new a();

    @pmi0("phone")
    private final String phone;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final AuthOnSuccessValidationProfileDto profile;

    @pmi0(O6.e1)
    private final String sid;

    /* compiled from: OkItsMeFragmentData.kt */
    public static final class a implements Parcelable.Creator<OkItsMeFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final OkItsMeFragmentData createFromParcel(Parcel parcel) {
            return new OkItsMeFragmentData(parcel.readString(), (AuthOnSuccessValidationProfileDto) parcel.readParcelable(OkItsMeFragmentData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OkItsMeFragmentData[] newArray(int i) {
            return new OkItsMeFragmentData[i];
        }
    }

    public OkItsMeFragmentData(String str, AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto, String str2) {
        this.sid = str;
        this.profile = authOnSuccessValidationProfileDto;
        this.phone = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeParcelable(this.profile, i);
        parcel.writeString(this.phone);
    }

    public /* synthetic */ OkItsMeFragmentData(String str, AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : authOnSuccessValidationProfileDto, str2);
    }
}
