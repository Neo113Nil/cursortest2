package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.voicerooms.dto.VoiceroomsGuestSpeakerDto;
import com.vk.api.generated.voicerooms.dto.VoiceroomsPrivacyDto;
import com.vk.api.generated.voicerooms.dto.VoiceroomsStatusDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: SpacesTribuneDataDto.kt */
/* loaded from: classes15.dex */
public final class SpacesTribuneDataDto implements Parcelable {
    public static final Parcelable.Creator<SpacesTribuneDataDto> CREATOR = new a();

    @pmi0("active_participants_count")
    private final Integer activeParticipantsCount;

    @pmi0("audio_only")
    private final Boolean audioOnly;

    @pmi0("broadcast")
    private final SpacesCallBroadcastDto broadcast;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("created_time")
    private final Integer createdTime;

    @pmi0("description")
    private final String description;

    @pmi0("duration")
    private final Long duration;

    @pmi0("guest_speakers")
    private final List<String> guestSpeakers;

    @pmi0("guest_speakers_owners")
    private final List<UserId> guestSpeakersOwners;

    @pmi0("guest_speakers_statuses")
    private final List<VoiceroomsGuestSpeakerDto> guestSpeakersStatuses;

    @pmi0("has_wall_post")
    private final Boolean hasWallPost;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("links")
    private final List<String> links;

    @pmi0("name")
    private final String name;

    @pmi0("ok_join_link")
    private final String okJoinLink;

    @pmi0("only_auth_users")
    private final Boolean onlyAuthUsers;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("participants_count")
    private final Integer participantsCount;

    @pmi0("privacy")
    private final VoiceroomsPrivacyDto privacy;

    @pmi0("room_id")
    private final String roomId;

    @pmi0("speakers_in_room")
    private final List<String> speakersInRoom;

    @pmi0("speakers_in_room_owners")
    private final List<UserId> speakersInRoomOwners;

    @pmi0("start_time")
    private final Integer startTime;

    @pmi0("status")
    private final VoiceroomsStatusDto status;

    @pmi0("visible_participants")
    private final List<String> visibleParticipants;

    @pmi0("visible_participants_owners")
    private final List<UserId> visibleParticipantsOwners;

    /* compiled from: SpacesTribuneDataDto.kt */
    public static final class a implements Parcelable.Creator<SpacesTribuneDataDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final SpacesTribuneDataDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            String str2;
            int i;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            String str4;
            SpacesCallBroadcastDto createFromParcel;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(SpacesTribuneDataDto.class.getClassLoader());
            VoiceroomsStatusDto voiceroomsStatusDto = (VoiceroomsStatusDto) parcel.readParcelable(SpacesTribuneDataDto.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(SpacesTribuneDataDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(SpacesTribuneDataDto.class, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                str = readString;
                str2 = readString2;
                i = 1;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                str = readString;
                int i4 = 0;
                while (true) {
                    str2 = readString2;
                    i = 1;
                    if (i4 == readInt3) {
                        break;
                    }
                    i4 = bo.b(SpacesTribuneDataDto.class, parcel, arrayList6, i4, 1);
                    readString2 = str2;
                }
                arrayList3 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                str3 = readString3;
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                str3 = readString3;
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(SpacesTribuneDataDto.class, parcel, arrayList4, i5, i);
                }
            }
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VoiceroomsPrivacyDto voiceroomsPrivacyDto = (VoiceroomsPrivacyDto) parcel.readParcelable(SpacesTribuneDataDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? i : 0);
            }
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf8 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList7 = arrayList;
            ArrayList arrayList8 = arrayList4;
            Integer num = valueOf5;
            String str5 = str;
            Integer num2 = valueOf7;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? i : 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? i : 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? i : 0);
            }
            if (parcel.readInt() == 0) {
                str4 = str5;
                createFromParcel = null;
            } else {
                str4 = str5;
                createFromParcel = SpacesCallBroadcastDto.CREATOR.createFromParcel(parcel);
            }
            return new SpacesTribuneDataDto(str4, str2, str3, userId, voiceroomsStatusDto, readString4, readString5, createStringArrayList, arrayList7, arrayList2, createStringArrayList2, createStringArrayList3, arrayList3, arrayList8, num, valueOf6, voiceroomsPrivacyDto, valueOf, num2, valueOf8, valueOf9, createStringArrayList4, valueOf2, valueOf3, valueOf4, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesTribuneDataDto[] newArray(int i) {
            return new SpacesTribuneDataDto[i];
        }
    }

    public SpacesTribuneDataDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesTribuneDataDto)) {
            return false;
        }
        SpacesTribuneDataDto spacesTribuneDataDto = (SpacesTribuneDataDto) obj;
        return epx.f(this.roomId, spacesTribuneDataDto.roomId) && epx.f(this.name, spacesTribuneDataDto.name) && epx.f(this.description, spacesTribuneDataDto.description) && epx.f(this.ownerId, spacesTribuneDataDto.ownerId) && this.status == spacesTribuneDataDto.status && epx.f(this.joinLink, spacesTribuneDataDto.joinLink) && epx.f(this.okJoinLink, spacesTribuneDataDto.okJoinLink) && epx.f(this.guestSpeakers, spacesTribuneDataDto.guestSpeakers) && epx.f(this.guestSpeakersOwners, spacesTribuneDataDto.guestSpeakersOwners) && epx.f(this.guestSpeakersStatuses, spacesTribuneDataDto.guestSpeakersStatuses) && epx.f(this.visibleParticipants, spacesTribuneDataDto.visibleParticipants) && epx.f(this.speakersInRoom, spacesTribuneDataDto.speakersInRoom) && epx.f(this.visibleParticipantsOwners, spacesTribuneDataDto.visibleParticipantsOwners) && epx.f(this.speakersInRoomOwners, spacesTribuneDataDto.speakersInRoomOwners) && epx.f(this.participantsCount, spacesTribuneDataDto.participantsCount) && epx.f(this.activeParticipantsCount, spacesTribuneDataDto.activeParticipantsCount) && this.privacy == spacesTribuneDataDto.privacy && epx.f(this.onlyAuthUsers, spacesTribuneDataDto.onlyAuthUsers) && epx.f(this.startTime, spacesTribuneDataDto.startTime) && epx.f(this.duration, spacesTribuneDataDto.duration) && epx.f(this.createdTime, spacesTribuneDataDto.createdTime) && epx.f(this.links, spacesTribuneDataDto.links) && epx.f(this.audioOnly, spacesTribuneDataDto.audioOnly) && epx.f(this.canEdit, spacesTribuneDataDto.canEdit) && epx.f(this.hasWallPost, spacesTribuneDataDto.hasWallPost) && epx.f(this.broadcast, spacesTribuneDataDto.broadcast);
    }

    public final int hashCode() {
        String str = this.roomId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        VoiceroomsStatusDto voiceroomsStatusDto = this.status;
        int hashCode5 = (hashCode4 + (voiceroomsStatusDto == null ? 0 : voiceroomsStatusDto.hashCode())) * 31;
        String str4 = this.joinLink;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.okJoinLink;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.guestSpeakers;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<UserId> list2 = this.guestSpeakersOwners;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VoiceroomsGuestSpeakerDto> list3 = this.guestSpeakersStatuses;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.visibleParticipants;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.speakersInRoom;
        int hashCode12 = (hashCode11 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<UserId> list6 = this.visibleParticipantsOwners;
        int hashCode13 = (hashCode12 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<UserId> list7 = this.speakersInRoomOwners;
        int hashCode14 = (hashCode13 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num = this.participantsCount;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.activeParticipantsCount;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        VoiceroomsPrivacyDto voiceroomsPrivacyDto = this.privacy;
        int hashCode17 = (hashCode16 + (voiceroomsPrivacyDto == null ? 0 : voiceroomsPrivacyDto.hashCode())) * 31;
        Boolean bool = this.onlyAuthUsers;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.startTime;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.duration;
        int hashCode20 = (hashCode19 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.createdTime;
        int hashCode21 = (hashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list8 = this.links;
        int hashCode22 = (hashCode21 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool2 = this.audioOnly;
        int hashCode23 = (hashCode22 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canEdit;
        int hashCode24 = (hashCode23 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasWallPost;
        int hashCode25 = (hashCode24 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        SpacesCallBroadcastDto spacesCallBroadcastDto = this.broadcast;
        return hashCode25 + (spacesCallBroadcastDto != null ? spacesCallBroadcastDto.hashCode() : 0);
    }

    public final String toString() {
        return "SpacesTribuneDataDto(roomId=" + this.roomId + ", name=" + this.name + ", description=" + this.description + ", ownerId=" + this.ownerId + ", status=" + this.status + ", joinLink=" + this.joinLink + ", okJoinLink=" + this.okJoinLink + ", guestSpeakers=" + this.guestSpeakers + ", guestSpeakersOwners=" + this.guestSpeakersOwners + ", guestSpeakersStatuses=" + this.guestSpeakersStatuses + ", visibleParticipants=" + this.visibleParticipants + ", speakersInRoom=" + this.speakersInRoom + ", visibleParticipantsOwners=" + this.visibleParticipantsOwners + ", speakersInRoomOwners=" + this.speakersInRoomOwners + ", participantsCount=" + this.participantsCount + ", activeParticipantsCount=" + this.activeParticipantsCount + ", privacy=" + this.privacy + ", onlyAuthUsers=" + this.onlyAuthUsers + ", startTime=" + this.startTime + ", duration=" + this.duration + ", createdTime=" + this.createdTime + ", links=" + this.links + ", audioOnly=" + this.audioOnly + ", canEdit=" + this.canEdit + ", hasWallPost=" + this.hasWallPost + ", broadcast=" + this.broadcast + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.roomId);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.status, i);
        parcel.writeString(this.joinLink);
        parcel.writeString(this.okJoinLink);
        parcel.writeStringList(this.guestSpeakers);
        List<UserId> list = this.guestSpeakersOwners;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<VoiceroomsGuestSpeakerDto> list2 = this.guestSpeakersStatuses;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeStringList(this.visibleParticipants);
        parcel.writeStringList(this.speakersInRoom);
        List<UserId> list3 = this.visibleParticipantsOwners;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<UserId> list4 = this.speakersInRoomOwners;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        Integer num = this.participantsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.activeParticipantsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.privacy, i);
        Boolean bool = this.onlyAuthUsers;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.startTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Long l = this.duration;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Integer num4 = this.createdTime;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeStringList(this.links);
        Boolean bool2 = this.audioOnly;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canEdit;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.hasWallPost;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        SpacesCallBroadcastDto spacesCallBroadcastDto = this.broadcast;
        if (spacesCallBroadcastDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacesCallBroadcastDto.writeToParcel(parcel, i);
        }
    }

    public SpacesTribuneDataDto(String str, String str2, String str3, UserId userId, VoiceroomsStatusDto voiceroomsStatusDto, String str4, String str5, List<String> list, List<UserId> list2, List<VoiceroomsGuestSpeakerDto> list3, List<String> list4, List<String> list5, List<UserId> list6, List<UserId> list7, Integer num, Integer num2, VoiceroomsPrivacyDto voiceroomsPrivacyDto, Boolean bool, Integer num3, Long l, Integer num4, List<String> list8, Boolean bool2, Boolean bool3, Boolean bool4, SpacesCallBroadcastDto spacesCallBroadcastDto) {
        this.roomId = str;
        this.name = str2;
        this.description = str3;
        this.ownerId = userId;
        this.status = voiceroomsStatusDto;
        this.joinLink = str4;
        this.okJoinLink = str5;
        this.guestSpeakers = list;
        this.guestSpeakersOwners = list2;
        this.guestSpeakersStatuses = list3;
        this.visibleParticipants = list4;
        this.speakersInRoom = list5;
        this.visibleParticipantsOwners = list6;
        this.speakersInRoomOwners = list7;
        this.participantsCount = num;
        this.activeParticipantsCount = num2;
        this.privacy = voiceroomsPrivacyDto;
        this.onlyAuthUsers = bool;
        this.startTime = num3;
        this.duration = l;
        this.createdTime = num4;
        this.links = list8;
        this.audioOnly = bool2;
        this.canEdit = bool3;
        this.hasWallPost = bool4;
        this.broadcast = spacesCallBroadcastDto;
    }

    public /* synthetic */ SpacesTribuneDataDto(String str, String str2, String str3, UserId userId, VoiceroomsStatusDto voiceroomsStatusDto, String str4, String str5, List list, List list2, List list3, List list4, List list5, List list6, List list7, Integer num, Integer num2, VoiceroomsPrivacyDto voiceroomsPrivacyDto, Boolean bool, Integer num3, Long l, Integer num4, List list8, Boolean bool2, Boolean bool3, Boolean bool4, SpacesCallBroadcastDto spacesCallBroadcastDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : voiceroomsStatusDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : list5, (i & 4096) != 0 ? null : list6, (i & 8192) != 0 ? null : list7, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : voiceroomsPrivacyDto, (i & 131072) != 0 ? null : bool, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num3, (i & 524288) != 0 ? null : l, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num4, (i & 2097152) != 0 ? null : list8, (i & 4194304) != 0 ? null : bool2, (i & 8388608) != 0 ? null : bool3, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool4, (i & 33554432) != 0 ? null : spacesCallBroadcastDto);
    }
}
