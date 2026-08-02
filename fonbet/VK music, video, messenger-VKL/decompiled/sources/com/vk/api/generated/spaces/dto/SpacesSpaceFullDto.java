package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.iq;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SpacesSpaceFullDto.kt */
/* loaded from: classes15.dex */
public final class SpacesSpaceFullDto implements Parcelable {
    public static final Parcelable.Creator<SpacesSpaceFullDto> CREATOR = new a();

    @pmi0("cover")
    private final String cover;

    @pmi0("cover_thumb_hash")
    private final String coverThumbHash;

    @pmi0("default_room_id")
    private final Long defaultRoomId;

    @pmi0("description")
    private final String description;

    @pmi0("entity_version")
    private final int entityVersion;

    @pmi0("id")
    private final long id;

    @pmi0("is_private")
    private final Boolean isPrivate;

    @pmi0("level")
    private final LevelDto level;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("name")
    private final String name;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0(X3.i.L)
    private final String position;

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<SpacesRoleDto> roles;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    private final List<SpacesRoomDto> rooms;

    @pmi0("sections")
    private final List<SpacesSectionDto> sections;

    @pmi0("short_name")
    private final String shortName;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("thumb_hash")
    private final String thumbHash;

    @pmi0("viewer_data")
    private final SpacesViewerDataDto viewerData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpacesSpaceFullDto.kt */
    public static final class LevelDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LevelDto[] $VALUES;

        @pmi0("base")
        public static final LevelDto BASE;
        public static final Parcelable.Creator<LevelDto> CREATOR;
        private final String value;

        /* compiled from: SpacesSpaceFullDto.kt */
        public static final class a implements Parcelable.Creator<LevelDto> {
            @Override // android.os.Parcelable.Creator
            public final LevelDto createFromParcel(Parcel parcel) {
                return LevelDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LevelDto[] newArray(int i) {
                return new LevelDto[i];
            }
        }

        static {
            LevelDto levelDto = new LevelDto("BASE", 0, "base");
            BASE = levelDto;
            LevelDto[] levelDtoArr = {levelDto};
            $VALUES = levelDtoArr;
            $ENTRIES = new asp(levelDtoArr);
            CREATOR = new a();
        }

        private LevelDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LevelDto valueOf(String str) {
            return (LevelDto) Enum.valueOf(LevelDto.class, str);
        }

        public static LevelDto[] values() {
            return (LevelDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpacesSpaceFullDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;
        private final String value;

        /* compiled from: SpacesSpaceFullDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto;
            StatusDto[] statusDtoArr = {statusDto};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SpacesSpaceFullDto.kt */
    public static final class a implements Parcelable.Creator<SpacesSpaceFullDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesSpaceFullDto createFromParcel(Parcel parcel) {
            long j;
            Boolean valueOf;
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            LevelDto createFromParcel = LevelDto.CREATOR.createFromParcel(parcel);
            StatusDto createFromParcel2 = StatusDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            SpacesViewerDataDto createFromParcel3 = SpacesViewerDataDto.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(SpacesRoomDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt4);
            int i2 = 0;
            while (i2 != readInt4) {
                i2 = en.a(SpacesSectionDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt5);
            int i3 = 0;
            while (true) {
                j = readLong;
                if (i3 == readInt5) {
                    break;
                }
                i3 = en.a(SpacesRoleDto.CREATOR, parcel, arrayList3, i3, 1);
                readLong = j;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z = false;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf = Boolean.valueOf(z);
            }
            return new SpacesSpaceFullDto(j, readInt, readString, createFromParcel, createFromParcel2, readInt2, readString2, createFromParcel3, arrayList, arrayList2, arrayList3, readString3, readString4, readString5, readString6, readString7, readString8, valueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesSpaceFullDto[] newArray(int i) {
            return new SpacesSpaceFullDto[i];
        }
    }

    public SpacesSpaceFullDto(long j, int i, String str, LevelDto levelDto, StatusDto statusDto, int i2, String str2, SpacesViewerDataDto spacesViewerDataDto, List<SpacesRoomDto> list, List<SpacesSectionDto> list2, List<SpacesRoleDto> list3, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Long l) {
        this.id = j;
        this.entityVersion = i;
        this.name = str;
        this.level = levelDto;
        this.status = statusDto;
        this.membersCount = i2;
        this.position = str2;
        this.viewerData = spacesViewerDataDto;
        this.rooms = list;
        this.sections = list2;
        this.roles = list3;
        this.shortName = str3;
        this.photoBase = str4;
        this.thumbHash = str5;
        this.cover = str6;
        this.coverThumbHash = str7;
        this.description = str8;
        this.isPrivate = bool;
        this.defaultRoomId = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesSpaceFullDto)) {
            return false;
        }
        SpacesSpaceFullDto spacesSpaceFullDto = (SpacesSpaceFullDto) obj;
        return this.id == spacesSpaceFullDto.id && this.entityVersion == spacesSpaceFullDto.entityVersion && epx.f(this.name, spacesSpaceFullDto.name) && this.level == spacesSpaceFullDto.level && this.status == spacesSpaceFullDto.status && this.membersCount == spacesSpaceFullDto.membersCount && epx.f(this.position, spacesSpaceFullDto.position) && epx.f(this.viewerData, spacesSpaceFullDto.viewerData) && epx.f(this.rooms, spacesSpaceFullDto.rooms) && epx.f(this.sections, spacesSpaceFullDto.sections) && epx.f(this.roles, spacesSpaceFullDto.roles) && epx.f(this.shortName, spacesSpaceFullDto.shortName) && epx.f(this.photoBase, spacesSpaceFullDto.photoBase) && epx.f(this.thumbHash, spacesSpaceFullDto.thumbHash) && epx.f(this.cover, spacesSpaceFullDto.cover) && epx.f(this.coverThumbHash, spacesSpaceFullDto.coverThumbHash) && epx.f(this.description, spacesSpaceFullDto.description) && epx.f(this.isPrivate, spacesSpaceFullDto.isPrivate) && epx.f(this.defaultRoomId, spacesSpaceFullDto.defaultRoomId);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a((this.viewerData.hashCode() + urd0.a(shy.a(this.membersCount, (this.status.hashCode() + ((this.level.hashCode() + urd0.a(shy.a(this.entityVersion, Long.hashCode(this.id) * 31, 31), 31, this.name)) * 31)) * 31, 31), 31, this.position)) * 31, 31, this.rooms), 31, this.sections), 31, this.roles);
        String str = this.shortName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoBase;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbHash;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cover;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.coverThumbHash;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isPrivate;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.defaultRoomId;
        return hashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesSpaceFullDto(id=");
        sb.append(this.id);
        sb.append(", entityVersion=");
        sb.append(this.entityVersion);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", viewerData=");
        sb.append(this.viewerData);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(", sections=");
        sb.append(this.sections);
        sb.append(", roles=");
        sb.append(this.roles);
        sb.append(", shortName=");
        sb.append(this.shortName);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", thumbHash=");
        sb.append(this.thumbHash);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", coverThumbHash=");
        sb.append(this.coverThumbHash);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isPrivate=");
        sb.append(this.isPrivate);
        sb.append(", defaultRoomId=");
        return iq.b(sb, this.defaultRoomId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.entityVersion);
        parcel.writeString(this.name);
        this.level.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.membersCount);
        parcel.writeString(this.position);
        this.viewerData.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.rooms);
        while (a2.hasNext()) {
            ((SpacesRoomDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.sections);
        while (a3.hasNext()) {
            ((SpacesSectionDto) a3.next()).writeToParcel(parcel, i);
        }
        Iterator a4 = ao.a(parcel, this.roles);
        while (a4.hasNext()) {
            ((SpacesRoleDto) a4.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.shortName);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.thumbHash);
        parcel.writeString(this.cover);
        parcel.writeString(this.coverThumbHash);
        parcel.writeString(this.description);
        Boolean bool = this.isPrivate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Long l = this.defaultRoomId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ SpacesSpaceFullDto(long j, int i, String str, LevelDto levelDto, StatusDto statusDto, int i2, String str2, SpacesViewerDataDto spacesViewerDataDto, List list, List list2, List list3, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Long l, int i3, zcl zclVar) {
        this(j, i, str, levelDto, statusDto, i2, str2, spacesViewerDataDto, list, list2, list3, (i3 & 2048) != 0 ? null : str3, (i3 & 4096) != 0 ? null : str4, (i3 & 8192) != 0 ? null : str5, (i3 & 16384) != 0 ? null : str6, (32768 & i3) != 0 ? null : str7, (65536 & i3) != 0 ? null : str8, (131072 & i3) != 0 ? null : bool, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : l);
    }
}
