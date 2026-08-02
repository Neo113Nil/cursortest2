package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaGrantedPermissionsDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGrantedPermissionsDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGrantedPermissionsDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<String> permissions;

    /* compiled from: MarusiaGrantedPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGrantedPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGrantedPermissionsDto createFromParcel(Parcel parcel) {
            return new MarusiaGrantedPermissionsDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGrantedPermissionsDto[] newArray(int i) {
            return new MarusiaGrantedPermissionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarusiaGrantedPermissionsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarusiaGrantedPermissionsDto) && epx.f(this.permissions, ((MarusiaGrantedPermissionsDto) obj).permissions);
    }

    public final int hashCode() {
        List<String> list = this.permissions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarusiaGrantedPermissionsDto(permissions="), this.permissions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.permissions);
    }

    public MarusiaGrantedPermissionsDto(List<String> list) {
        this.permissions = list;
    }

    public /* synthetic */ MarusiaGrantedPermissionsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
