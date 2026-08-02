package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoRestrictionButtonDto.kt */
/* loaded from: classes15.dex */
public final class VideoRestrictionButtonDto implements Parcelable {
    public static final Parcelable.Creator<VideoRestrictionButtonDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0("action_url")
    private final String actionUrl;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRestrictionButtonDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("delete")
        public static final ActionDto DELETE;

        @pmi0("donat")
        public static final ActionDto DONAT;

        @pmi0("login")
        public static final ActionDto LOGIN;

        @pmi0("play")
        public static final ActionDto PLAY;

        @pmi0("subscribe")
        public static final ActionDto SUBSCRIBE;

        @pmi0("update")
        public static final ActionDto UPDATE;
        private final String value;

        /* compiled from: VideoRestrictionButtonDto.kt */
        public static final class a implements Parcelable.Creator<ActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionDto createFromParcel(Parcel parcel) {
                return ActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionDto[] newArray(int i) {
                return new ActionDto[i];
            }
        }

        static {
            ActionDto actionDto = new ActionDto("SUBSCRIBE", 0, "subscribe");
            SUBSCRIBE = actionDto;
            ActionDto actionDto2 = new ActionDto("LOGIN", 1, "login");
            LOGIN = actionDto2;
            ActionDto actionDto3 = new ActionDto("DONAT", 2, "donat");
            DONAT = actionDto3;
            ActionDto actionDto4 = new ActionDto("DELETE", 3, "delete");
            DELETE = actionDto4;
            ActionDto actionDto5 = new ActionDto("PLAY", 4, "play");
            PLAY = actionDto5;
            ActionDto actionDto6 = new ActionDto(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 5, "update");
            UPDATE = actionDto6;
            ActionDto[] actionDtoArr = {actionDto, actionDto2, actionDto3, actionDto4, actionDto5, actionDto6};
            $VALUES = actionDtoArr;
            $ENTRIES = new asp(actionDtoArr);
            CREATOR = new a();
        }

        private ActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoRestrictionButtonDto.kt */
    public static final class a implements Parcelable.Creator<VideoRestrictionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoRestrictionButtonDto createFromParcel(Parcel parcel) {
            return new VideoRestrictionButtonDto(ActionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRestrictionButtonDto[] newArray(int i) {
            return new VideoRestrictionButtonDto[i];
        }
    }

    public VideoRestrictionButtonDto(ActionDto actionDto, String str, String str2) {
        this.action = actionDto;
        this.title = str;
        this.actionUrl = str2;
    }

    public final ActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.actionUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRestrictionButtonDto)) {
            return false;
        }
        VideoRestrictionButtonDto videoRestrictionButtonDto = (VideoRestrictionButtonDto) obj;
        return this.action == videoRestrictionButtonDto.action && epx.f(this.title, videoRestrictionButtonDto.title) && epx.f(this.actionUrl, videoRestrictionButtonDto.actionUrl);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRestrictionButtonDto(action=");
        sb.append(this.action);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", actionUrl=");
        return ho8.a(sb, this.actionUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.actionUrl);
    }

    public /* synthetic */ VideoRestrictionButtonDto(ActionDto actionDto, String str, String str2, int i, zcl zclVar) {
        this(actionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
