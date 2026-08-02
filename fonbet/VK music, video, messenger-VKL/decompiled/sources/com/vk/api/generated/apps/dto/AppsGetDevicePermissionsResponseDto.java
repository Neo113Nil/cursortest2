package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGetDevicePermissionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetDevicePermissionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetDevicePermissionsResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<String> permissions;

    @pmi0("privacy_policy")
    private final String privacyPolicy;

    @pmi0("terms")
    private final String terms;

    @pmi0("vk_connect_permissions")
    private final List<AppsConnectPermissionsDto> vkConnectPermissions;

    /* compiled from: AppsGetDevicePermissionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetDevicePermissionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetDevicePermissionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsGetDevicePermissionsResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsGetDevicePermissionsResponseDto(createStringArrayList, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetDevicePermissionsResponseDto[] newArray(int i) {
            return new AppsGetDevicePermissionsResponseDto[i];
        }
    }

    public AppsGetDevicePermissionsResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<String> d() {
        return this.permissions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.privacyPolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetDevicePermissionsResponseDto)) {
            return false;
        }
        AppsGetDevicePermissionsResponseDto appsGetDevicePermissionsResponseDto = (AppsGetDevicePermissionsResponseDto) obj;
        return epx.f(this.permissions, appsGetDevicePermissionsResponseDto.permissions) && epx.f(this.vkConnectPermissions, appsGetDevicePermissionsResponseDto.vkConnectPermissions) && epx.f(this.privacyPolicy, appsGetDevicePermissionsResponseDto.privacyPolicy) && epx.f(this.terms, appsGetDevicePermissionsResponseDto.terms);
    }

    public final String f() {
        return this.terms;
    }

    public final List<AppsConnectPermissionsDto> g() {
        return this.vkConnectPermissions;
    }

    public final int hashCode() {
        List<String> list = this.permissions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AppsConnectPermissionsDto> list2 = this.vkConnectPermissions;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.privacyPolicy;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.terms;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetDevicePermissionsResponseDto(permissions=");
        sb.append(this.permissions);
        sb.append(", vkConnectPermissions=");
        sb.append(this.vkConnectPermissions);
        sb.append(", privacyPolicy=");
        sb.append(this.privacyPolicy);
        sb.append(", terms=");
        return ho8.a(sb, this.terms, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.permissions);
        List<AppsConnectPermissionsDto> list = this.vkConnectPermissions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.privacyPolicy);
        parcel.writeString(this.terms);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsGetDevicePermissionsResponseDto(List<String> list, List<? extends AppsConnectPermissionsDto> list2, String str, String str2) {
        this.permissions = list;
        this.vkConnectPermissions = list2;
        this.privacyPolicy = str;
        this.terms = str2;
    }

    public /* synthetic */ AppsGetDevicePermissionsResponseDto(List list, List list2, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
