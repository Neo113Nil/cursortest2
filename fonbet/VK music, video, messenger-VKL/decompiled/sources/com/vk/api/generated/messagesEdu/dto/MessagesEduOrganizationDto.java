package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MessagesEduOrganizationDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduOrganizationDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduOrganizationDto> CREATOR = new a();

    @pmi0("organization_id")
    private final UserId organizationId;

    @pmi0("organization_name")
    private final String organizationName;

    @pmi0("organization_type")
    private final String organizationType;

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<MessagesEduRoleDto> roles;

    /* compiled from: MessagesEduOrganizationDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduOrganizationDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduOrganizationDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(MessagesEduOrganizationDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesEduRoleDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesEduOrganizationDto(userId, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduOrganizationDto[] newArray(int i) {
            return new MessagesEduOrganizationDto[i];
        }
    }

    public MessagesEduOrganizationDto(UserId userId, String str, String str2, List<MessagesEduRoleDto> list) {
        this.organizationId = userId;
        this.organizationType = str;
        this.organizationName = str2;
        this.roles = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduOrganizationDto)) {
            return false;
        }
        MessagesEduOrganizationDto messagesEduOrganizationDto = (MessagesEduOrganizationDto) obj;
        return epx.f(this.organizationId, messagesEduOrganizationDto.organizationId) && epx.f(this.organizationType, messagesEduOrganizationDto.organizationType) && epx.f(this.organizationName, messagesEduOrganizationDto.organizationName) && epx.f(this.roles, messagesEduOrganizationDto.roles);
    }

    public final int hashCode() {
        return this.roles.hashCode() + urd0.a(urd0.a(Long.hashCode(this.organizationId.b) * 31, 31, this.organizationType), 31, this.organizationName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduOrganizationDto(organizationId=");
        sb.append(this.organizationId);
        sb.append(", organizationType=");
        sb.append(this.organizationType);
        sb.append(", organizationName=");
        sb.append(this.organizationName);
        sb.append(", roles=");
        return ms9.a(')', sb, this.roles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.organizationId, i);
        parcel.writeString(this.organizationType);
        parcel.writeString(this.organizationName);
        Iterator a2 = ao.a(parcel, this.roles);
        while (a2.hasNext()) {
            ((MessagesEduRoleDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
