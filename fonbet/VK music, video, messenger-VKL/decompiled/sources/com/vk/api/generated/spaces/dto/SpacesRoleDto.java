package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SpacesRoleDto.kt */
/* loaded from: classes15.dex */
public final class SpacesRoleDto implements Parcelable {
    public static final Parcelable.Creator<SpacesRoleDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("entity_version")
    private final int entityVersion;

    @pmi0(CampaignEx.JSON_KEY_ICON_URL)
    private final String iconUrl;

    @pmi0("id")
    private final long id;

    @pmi0("is_available_for_mentions")
    private final boolean isAvailableForMentions;

    @pmi0("name")
    private final String name;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<Integer> permissions;

    /* compiled from: SpacesRoleDto.kt */
    public static final class a implements Parcelable.Creator<SpacesRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesRoleDto createFromParcel(Parcel parcel) {
            int i;
            int i2;
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
                i2 = 1;
            } else {
                i = 0;
                i2 = 1;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int i3 = i2;
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList, i, i3);
            }
            return new SpacesRoleDto(readLong, readString, readString2, z, readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesRoleDto[] newArray(int i) {
            return new SpacesRoleDto[i];
        }
    }

    public SpacesRoleDto(long j, String str, String str2, boolean z, int i, List<Integer> list, String str3) {
        this.id = j;
        this.name = str;
        this.color = str2;
        this.isAvailableForMentions = z;
        this.entityVersion = i;
        this.permissions = list;
        this.iconUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesRoleDto)) {
            return false;
        }
        SpacesRoleDto spacesRoleDto = (SpacesRoleDto) obj;
        return this.id == spacesRoleDto.id && epx.f(this.name, spacesRoleDto.name) && epx.f(this.color, spacesRoleDto.color) && this.isAvailableForMentions == spacesRoleDto.isAvailableForMentions && this.entityVersion == spacesRoleDto.entityVersion && epx.f(this.permissions, spacesRoleDto.permissions) && epx.f(this.iconUrl, spacesRoleDto.iconUrl);
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.entityVersion, qoy.b(urd0.a(urd0.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.color), 31, this.isAvailableForMentions), 31), 31, this.permissions);
        String str = this.iconUrl;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesRoleDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", isAvailableForMentions=");
        sb.append(this.isAvailableForMentions);
        sb.append(", entityVersion=");
        sb.append(this.entityVersion);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", iconUrl=");
        return ho8.a(sb, this.iconUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.color);
        parcel.writeInt(this.isAvailableForMentions ? 1 : 0);
        parcel.writeInt(this.entityVersion);
        Iterator a2 = ao.a(parcel, this.permissions);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.iconUrl);
    }

    public /* synthetic */ SpacesRoleDto(long j, String str, String str2, boolean z, int i, List list, String str3, int i2, zcl zclVar) {
        this(j, str, str2, z, i, list, (i2 & 64) != 0 ? null : str3);
    }
}
