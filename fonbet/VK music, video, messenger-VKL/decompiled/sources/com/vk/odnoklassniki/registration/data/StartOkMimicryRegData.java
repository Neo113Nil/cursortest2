package com.vk.odnoklassniki.registration.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.vkidok.dto.VkidokStartRegistrationResponseDto;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StartOkMimicryRegData.kt */
/* loaded from: classes.dex */
public final class StartOkMimicryRegData implements Parcelable {
    public static final Parcelable.Creator<StartOkMimicryRegData> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<String> permissions;

    @pmi0("start_registration_response")
    private final VkidokStartRegistrationResponseDto startRegistrationResponse;

    /* compiled from: StartOkMimicryRegData.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator<StartOkMimicryRegData> {
        @Override // android.os.Parcelable.Creator
        public final StartOkMimicryRegData createFromParcel(Parcel parcel) {
            return new StartOkMimicryRegData(parcel.createStringArrayList(), (VkidokStartRegistrationResponseDto) parcel.readParcelable(StartOkMimicryRegData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StartOkMimicryRegData[] newArray(int i) {
            return new StartOkMimicryRegData[i];
        }
    }

    public StartOkMimicryRegData(List<String> list, VkidokStartRegistrationResponseDto vkidokStartRegistrationResponseDto) {
        this.permissions = list;
        this.startRegistrationResponse = vkidokStartRegistrationResponseDto;
    }

    public final List<String> d() {
        return this.permissions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VkidokStartRegistrationResponseDto e() {
        return this.startRegistrationResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartOkMimicryRegData)) {
            return false;
        }
        StartOkMimicryRegData startOkMimicryRegData = (StartOkMimicryRegData) obj;
        return epx.f(this.permissions, startOkMimicryRegData.permissions) && epx.f(this.startRegistrationResponse, startOkMimicryRegData.startRegistrationResponse);
    }

    public final int hashCode() {
        return this.startRegistrationResponse.hashCode() + (this.permissions.hashCode() * 31);
    }

    public final String toString() {
        return "StartOkMimicryRegData(permissions=" + this.permissions + ", startRegistrationResponse=" + this.startRegistrationResponse + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.permissions);
        parcel.writeParcelable(this.startRegistrationResponse, i);
    }
}
