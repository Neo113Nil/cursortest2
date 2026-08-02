package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VoiceroomsRoomDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsRoomDto implements Parcelable {
    public static final Parcelable.Creator<VoiceroomsRoomDto> CREATOR = new a();

    @pmi0("active_participants_count")
    private final Integer activeParticipantsCount;

    @pmi0("audio_only")
    private final Boolean audioOnly;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("cover")
    private final VoiceroomsCoverDto cover;

    @pmi0("created_time")
    private final Integer createdTime;

    @pmi0("creator_id")
    private final UserId creatorId;

    @pmi0("description")
    private final String description;

    @pmi0("duration")
    private final Long duration;

    @pmi0("force_broadcast")
    private final Boolean forceBroadcast;

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

    @pmi0("status")
    private final VoiceroomsStatusDto status;

    @pmi0("subscribed")
    private final Boolean subscribed;

    @pmi0("time")
    private final Integer time;

    @pmi0("video_id")
    private final String videoId;

    @pmi0("visible_participants")
    private final List<String> visibleParticipants;

    @pmi0("visible_participants_owners")
    private final List<UserId> visibleParticipantsOwners;

    /* compiled from: VoiceroomsRoomDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsRoomDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsRoomDto createFromParcel(Parcel parcel) {
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
            Integer num;
            VoiceroomsCoverDto createFromParcel;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(VoiceroomsRoomDto.class.getClassLoader());
            VoiceroomsStatusDto createFromParcel2 = parcel.readInt() == 0 ? null : VoiceroomsStatusDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(VoiceroomsRoomDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(VoiceroomsGuestSpeakerDto.CREATOR, parcel, arrayList2, i3, 1);
                }
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
                ArrayList arrayList5 = new ArrayList(readInt3);
                str = readString;
                int i4 = 0;
                while (true) {
                    str2 = readString2;
                    i = 1;
                    if (i4 == readInt3) {
                        break;
                    }
                    i4 = bo.b(VoiceroomsRoomDto.class, parcel, arrayList5, i4, 1);
                    readString2 = str2;
                }
                arrayList3 = arrayList5;
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
                    i5 = bo.b(VoiceroomsRoomDto.class, parcel, arrayList4, i5, i);
                }
            }
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VoiceroomsPrivacyDto createFromParcel3 = parcel.readInt() == 0 ? null : VoiceroomsPrivacyDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf10 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num2 = valueOf8;
            String str4 = str3;
            Boolean bool = valueOf;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                num = valueOf7;
                createFromParcel = null;
            } else {
                num = valueOf7;
                createFromParcel = VoiceroomsCoverDto.CREATOR.createFromParcel(parcel);
            }
            VoiceroomsCoverDto voiceroomsCoverDto = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId2 = (UserId) parcel.readParcelable(VoiceroomsRoomDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VoiceroomsRoomDto(str, str2, str4, userId, createFromParcel2, readString4, createStringArrayList, readString5, arrayList, arrayList2, createStringArrayList2, createStringArrayList3, arrayList3, arrayList4, num, num2, createFromParcel3, bool, valueOf9, valueOf10, valueOf11, createStringArrayList4, valueOf2, voiceroomsCoverDto, valueOf3, valueOf4, valueOf5, userId2, valueOf6);
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsRoomDto[] newArray(int i) {
            return new VoiceroomsRoomDto[i];
        }
    }

    public VoiceroomsRoomDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceroomsRoomDto)) {
            return false;
        }
        VoiceroomsRoomDto voiceroomsRoomDto = (VoiceroomsRoomDto) obj;
        return epx.f(this.roomId, voiceroomsRoomDto.roomId) && epx.f(this.name, voiceroomsRoomDto.name) && epx.f(this.description, voiceroomsRoomDto.description) && epx.f(this.ownerId, voiceroomsRoomDto.ownerId) && this.status == voiceroomsRoomDto.status && epx.f(this.joinLink, voiceroomsRoomDto.joinLink) && epx.f(this.guestSpeakers, voiceroomsRoomDto.guestSpeakers) && epx.f(this.videoId, voiceroomsRoomDto.videoId) && epx.f(this.guestSpeakersOwners, voiceroomsRoomDto.guestSpeakersOwners) && epx.f(this.guestSpeakersStatuses, voiceroomsRoomDto.guestSpeakersStatuses) && epx.f(this.visibleParticipants, voiceroomsRoomDto.visibleParticipants) && epx.f(this.speakersInRoom, voiceroomsRoomDto.speakersInRoom) && epx.f(this.visibleParticipantsOwners, voiceroomsRoomDto.visibleParticipantsOwners) && epx.f(this.speakersInRoomOwners, voiceroomsRoomDto.speakersInRoomOwners) && epx.f(this.participantsCount, voiceroomsRoomDto.participantsCount) && epx.f(this.activeParticipantsCount, voiceroomsRoomDto.activeParticipantsCount) && this.privacy == voiceroomsRoomDto.privacy && epx.f(this.onlyAuthUsers, voiceroomsRoomDto.onlyAuthUsers) && epx.f(this.time, voiceroomsRoomDto.time) && epx.f(this.duration, voiceroomsRoomDto.duration) && epx.f(this.createdTime, voiceroomsRoomDto.createdTime) && epx.f(this.links, voiceroomsRoomDto.links) && epx.f(this.audioOnly, voiceroomsRoomDto.audioOnly) && epx.f(this.cover, voiceroomsRoomDto.cover) && epx.f(this.canEdit, voiceroomsRoomDto.canEdit) && epx.f(this.hasWallPost, voiceroomsRoomDto.hasWallPost) && epx.f(this.subscribed, voiceroomsRoomDto.subscribed) && epx.f(this.creatorId, voiceroomsRoomDto.creatorId) && epx.f(this.forceBroadcast, voiceroomsRoomDto.forceBroadcast);
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
        List<String> list = this.guestSpeakers;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.videoId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
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
        Integer num3 = this.time;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.duration;
        int hashCode20 = (hashCode19 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.createdTime;
        int hashCode21 = (hashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list8 = this.links;
        int hashCode22 = (hashCode21 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool2 = this.audioOnly;
        int hashCode23 = (hashCode22 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VoiceroomsCoverDto voiceroomsCoverDto = this.cover;
        int hashCode24 = (hashCode23 + (voiceroomsCoverDto == null ? 0 : voiceroomsCoverDto.hashCode())) * 31;
        Boolean bool3 = this.canEdit;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasWallPost;
        int hashCode26 = (hashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.subscribed;
        int hashCode27 = (hashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        UserId userId2 = this.creatorId;
        int hashCode28 = (hashCode27 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Boolean bool6 = this.forceBroadcast;
        return hashCode28 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceroomsRoomDto(roomId=");
        sb.append(this.roomId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", joinLink=");
        sb.append(this.joinLink);
        sb.append(", guestSpeakers=");
        sb.append(this.guestSpeakers);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", guestSpeakersOwners=");
        sb.append(this.guestSpeakersOwners);
        sb.append(", guestSpeakersStatuses=");
        sb.append(this.guestSpeakersStatuses);
        sb.append(", visibleParticipants=");
        sb.append(this.visibleParticipants);
        sb.append(", speakersInRoom=");
        sb.append(this.speakersInRoom);
        sb.append(", visibleParticipantsOwners=");
        sb.append(this.visibleParticipantsOwners);
        sb.append(", speakersInRoomOwners=");
        sb.append(this.speakersInRoomOwners);
        sb.append(", participantsCount=");
        sb.append(this.participantsCount);
        sb.append(", activeParticipantsCount=");
        sb.append(this.activeParticipantsCount);
        sb.append(", privacy=");
        sb.append(this.privacy);
        sb.append(", onlyAuthUsers=");
        sb.append(this.onlyAuthUsers);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(", audioOnly=");
        sb.append(this.audioOnly);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", hasWallPost=");
        sb.append(this.hasWallPost);
        sb.append(", subscribed=");
        sb.append(this.subscribed);
        sb.append(", creatorId=");
        sb.append(this.creatorId);
        sb.append(", forceBroadcast=");
        return tn.a(sb, this.forceBroadcast, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.roomId);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.ownerId, i);
        VoiceroomsStatusDto voiceroomsStatusDto = this.status;
        if (voiceroomsStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voiceroomsStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.joinLink);
        parcel.writeStringList(this.guestSpeakers);
        parcel.writeString(this.videoId);
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
                ((VoiceroomsGuestSpeakerDto) f2.next()).writeToParcel(parcel, i);
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
        VoiceroomsPrivacyDto voiceroomsPrivacyDto = this.privacy;
        if (voiceroomsPrivacyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voiceroomsPrivacyDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.onlyAuthUsers;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.time;
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
        VoiceroomsCoverDto voiceroomsCoverDto = this.cover;
        if (voiceroomsCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voiceroomsCoverDto.writeToParcel(parcel, i);
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
        Boolean bool5 = this.subscribed;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.creatorId, i);
        Boolean bool6 = this.forceBroadcast;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
    }

    public VoiceroomsRoomDto(String str, String str2, String str3, UserId userId, VoiceroomsStatusDto voiceroomsStatusDto, String str4, List<String> list, String str5, List<UserId> list2, List<VoiceroomsGuestSpeakerDto> list3, List<String> list4, List<String> list5, List<UserId> list6, List<UserId> list7, Integer num, Integer num2, VoiceroomsPrivacyDto voiceroomsPrivacyDto, Boolean bool, Integer num3, Long l, Integer num4, List<String> list8, Boolean bool2, VoiceroomsCoverDto voiceroomsCoverDto, Boolean bool3, Boolean bool4, Boolean bool5, UserId userId2, Boolean bool6) {
        this.roomId = str;
        this.name = str2;
        this.description = str3;
        this.ownerId = userId;
        this.status = voiceroomsStatusDto;
        this.joinLink = str4;
        this.guestSpeakers = list;
        this.videoId = str5;
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
        this.time = num3;
        this.duration = l;
        this.createdTime = num4;
        this.links = list8;
        this.audioOnly = bool2;
        this.cover = voiceroomsCoverDto;
        this.canEdit = bool3;
        this.hasWallPost = bool4;
        this.subscribed = bool5;
        this.creatorId = userId2;
        this.forceBroadcast = bool6;
    }

    public /* synthetic */ VoiceroomsRoomDto(String str, String str2, String str3, UserId userId, VoiceroomsStatusDto voiceroomsStatusDto, String str4, List list, String str5, List list2, List list3, List list4, List list5, List list6, List list7, Integer num, Integer num2, VoiceroomsPrivacyDto voiceroomsPrivacyDto, Boolean bool, Integer num3, Long l, Integer num4, List list8, Boolean bool2, VoiceroomsCoverDto voiceroomsCoverDto, Boolean bool3, Boolean bool4, Boolean bool5, UserId userId2, Boolean bool6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : voiceroomsStatusDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : list5, (i & 4096) != 0 ? null : list6, (i & 8192) != 0 ? null : list7, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : voiceroomsPrivacyDto, (i & 131072) != 0 ? null : bool, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num3, (i & 524288) != 0 ? null : l, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num4, (i & 2097152) != 0 ? null : list8, (i & 4194304) != 0 ? null : bool2, (i & 8388608) != 0 ? null : voiceroomsCoverDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool3, (i & 33554432) != 0 ? null : bool4, (i & 67108864) != 0 ? null : bool5, (i & 134217728) != 0 ? null : userId2, (i & 268435456) != 0 ? null : bool6);
    }
}
