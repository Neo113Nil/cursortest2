package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.epx;
import xsna.iq;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SpacesRoomDto.kt */
/* loaded from: classes15.dex */
public final class SpacesRoomDto implements Parcelable {
    public static final Parcelable.Creator<SpacesRoomDto> CREATOR = new a();

    @pmi0("entity_version")
    private final int entityVersion;

    @pmi0("id")
    private final long id;

    @pmi0("is_member")
    private final Boolean isMember;

    @pmi0("is_private")
    private final Boolean isPrivate;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<Integer> permissions;

    @pmi0(X3.i.L)
    private final String position;

    @pmi0("related_entity")
    private final SpacesRelatedEntityDto relatedEntity;

    @pmi0("section_id")
    private final Long sectionId;

    /* compiled from: SpacesRoomDto.kt */
    public static final class a implements Parcelable.Creator<SpacesRoomDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesRoomDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            SpacesRelatedEntityDto spacesRelatedEntityDto = (SpacesRelatedEntityDto) parcel.readParcelable(SpacesRoomDto.class.getClassLoader());
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            return new SpacesRoomDto(readLong, readInt, readString, spacesRelatedEntityDto, valueOf, valueOf2, arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesRoomDto[] newArray(int i) {
            return new SpacesRoomDto[i];
        }
    }

    public SpacesRoomDto(long j, int i, String str, SpacesRelatedEntityDto spacesRelatedEntityDto, Boolean bool, Boolean bool2, List<Integer> list, Long l) {
        this.id = j;
        this.entityVersion = i;
        this.position = str;
        this.relatedEntity = spacesRelatedEntityDto;
        this.isPrivate = bool;
        this.isMember = bool2;
        this.permissions = list;
        this.sectionId = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesRoomDto)) {
            return false;
        }
        SpacesRoomDto spacesRoomDto = (SpacesRoomDto) obj;
        return this.id == spacesRoomDto.id && this.entityVersion == spacesRoomDto.entityVersion && epx.f(this.position, spacesRoomDto.position) && epx.f(this.relatedEntity, spacesRoomDto.relatedEntity) && epx.f(this.isPrivate, spacesRoomDto.isPrivate) && epx.f(this.isMember, spacesRoomDto.isMember) && epx.f(this.permissions, spacesRoomDto.permissions) && epx.f(this.sectionId, spacesRoomDto.sectionId);
    }

    public final int hashCode() {
        int hashCode = (this.relatedEntity.hashCode() + urd0.a(shy.a(this.entityVersion, Long.hashCode(this.id) * 31, 31), 31, this.position)) * 31;
        Boolean bool = this.isPrivate;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isMember;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list = this.permissions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.sectionId;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesRoomDto(id=");
        sb.append(this.id);
        sb.append(", entityVersion=");
        sb.append(this.entityVersion);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", relatedEntity=");
        sb.append(this.relatedEntity);
        sb.append(", isPrivate=");
        sb.append(this.isPrivate);
        sb.append(", isMember=");
        sb.append(this.isMember);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", sectionId=");
        return iq.b(sb, this.sectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.entityVersion);
        parcel.writeString(this.position);
        parcel.writeParcelable(this.relatedEntity, i);
        Boolean bool = this.isPrivate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isMember;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<Integer> list = this.permissions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Long l = this.sectionId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ SpacesRoomDto(long j, int i, String str, SpacesRelatedEntityDto spacesRelatedEntityDto, Boolean bool, Boolean bool2, List list, Long l, int i2, zcl zclVar) {
        this(j, i, str, spacesRelatedEntityDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : l);
    }
}
