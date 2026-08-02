package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantMessageDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<VideoAiAssistantMessageBlockDto> blocks;

    @pmi0("chat_id")
    private final String chatId;

    @pmi0("created_at")
    private final long createdAt;

    @pmi0("id")
    private final String id;

    @pmi0("reaction")
    private final VideoAiAssistantReactionDto reaction;

    @pmi0("role")
    private final RoleDto role;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantMessageDto.kt */
    public static final class RoleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RoleDto[] $VALUES;

        @pmi0("assistant")
        public static final RoleDto ASSISTANT;
        public static final Parcelable.Creator<RoleDto> CREATOR;

        @pmi0("unspecified")
        public static final RoleDto UNSPECIFIED;

        @pmi0("user")
        public static final RoleDto USER;
        private final String value;

        /* compiled from: VideoAiAssistantMessageDto.kt */
        public static final class a implements Parcelable.Creator<RoleDto> {
            @Override // android.os.Parcelable.Creator
            public final RoleDto createFromParcel(Parcel parcel) {
                return RoleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RoleDto[] newArray(int i) {
                return new RoleDto[i];
            }
        }

        static {
            RoleDto roleDto = new RoleDto("UNSPECIFIED", 0, "unspecified");
            UNSPECIFIED = roleDto;
            RoleDto roleDto2 = new RoleDto("USER", 1, "user");
            USER = roleDto2;
            RoleDto roleDto3 = new RoleDto("ASSISTANT", 2, "assistant");
            ASSISTANT = roleDto3;
            RoleDto[] roleDtoArr = {roleDto, roleDto2, roleDto3};
            $VALUES = roleDtoArr;
            $ENTRIES = new asp(roleDtoArr);
            CREATOR = new a();
        }

        private RoleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static RoleDto valueOf(String str) {
            return (RoleDto) Enum.valueOf(RoleDto.class, str);
        }

        public static RoleDto[] values() {
            return (RoleDto[]) $VALUES.clone();
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

    /* compiled from: VideoAiAssistantMessageDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            RoleDto createFromParcel = RoleDto.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            VideoAiAssistantReactionDto createFromParcel2 = parcel.readInt() == 0 ? null : VideoAiAssistantReactionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoAiAssistantMessageBlockDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new VideoAiAssistantMessageDto(readString, createFromParcel, readLong, readString2, readString3, createFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageDto[] newArray(int i) {
            return new VideoAiAssistantMessageDto[i];
        }
    }

    public VideoAiAssistantMessageDto(String str, RoleDto roleDto, long j, String str2, String str3, VideoAiAssistantReactionDto videoAiAssistantReactionDto, List<VideoAiAssistantMessageBlockDto> list) {
        this.id = str;
        this.role = roleDto;
        this.createdAt = j;
        this.chatId = str2;
        this.title = str3;
        this.reaction = videoAiAssistantReactionDto;
        this.blocks = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantMessageDto)) {
            return false;
        }
        VideoAiAssistantMessageDto videoAiAssistantMessageDto = (VideoAiAssistantMessageDto) obj;
        return epx.f(this.id, videoAiAssistantMessageDto.id) && this.role == videoAiAssistantMessageDto.role && this.createdAt == videoAiAssistantMessageDto.createdAt && epx.f(this.chatId, videoAiAssistantMessageDto.chatId) && epx.f(this.title, videoAiAssistantMessageDto.title) && epx.f(this.reaction, videoAiAssistantMessageDto.reaction) && epx.f(this.blocks, videoAiAssistantMessageDto.blocks);
    }

    public final int hashCode() {
        int a2 = bh10.a((this.role.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.createdAt);
        String str = this.chatId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = this.reaction;
        int hashCode3 = (hashCode2 + (videoAiAssistantReactionDto == null ? 0 : videoAiAssistantReactionDto.hashCode())) * 31;
        List<VideoAiAssistantMessageBlockDto> list = this.blocks;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAiAssistantMessageDto(id=");
        sb.append(this.id);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", chatId=");
        sb.append(this.chatId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", reaction=");
        sb.append(this.reaction);
        sb.append(", blocks=");
        return ms9.a(')', sb, this.blocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.role.writeToParcel(parcel, i);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.chatId);
        parcel.writeString(this.title);
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = this.reaction;
        if (videoAiAssistantReactionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantReactionDto.writeToParcel(parcel, i);
        }
        List<VideoAiAssistantMessageBlockDto> list = this.blocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoAiAssistantMessageBlockDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantMessageDto(String str, RoleDto roleDto, long j, String str2, String str3, VideoAiAssistantReactionDto videoAiAssistantReactionDto, List list, int i, zcl zclVar) {
        this(str, roleDto, j, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : videoAiAssistantReactionDto, (i & 64) != 0 ? null : list);
    }
}
