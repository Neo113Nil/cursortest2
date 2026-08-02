package com.vk.odnoklassniki.registration.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.vkidok.dto.VkidokStartRegistrationResponseDto;
import java.util.List;
import xsna.pmi0;

/* compiled from: OkPermissionsFragmentData.kt */
/* loaded from: classes4.dex */
public final class OkPermissionsFragmentData implements Parcelable {
    public static final Parcelable.Creator<OkPermissionsFragmentData> CREATOR = new a();

    @pmi0("required_permissions")
    private final List<String> requiredPermissions;

    @pmi0("start_registration_response")
    private final VkidokStartRegistrationResponseDto startRegistrationResponse;

    /* compiled from: OkPermissionsFragmentData.kt */
    public static final class a implements Parcelable.Creator<OkPermissionsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final OkPermissionsFragmentData createFromParcel(Parcel parcel) {
            return new OkPermissionsFragmentData(parcel.createStringArrayList(), (VkidokStartRegistrationResponseDto) parcel.readParcelable(OkPermissionsFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OkPermissionsFragmentData[] newArray(int i) {
            return new OkPermissionsFragmentData[i];
        }
    }

    public OkPermissionsFragmentData(List<String> list, VkidokStartRegistrationResponseDto vkidokStartRegistrationResponseDto) {
        this.requiredPermissions = list;
        this.startRegistrationResponse = vkidokStartRegistrationResponseDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.requiredPermissions);
        parcel.writeParcelable(this.startRegistrationResponse, i);
    }
}
