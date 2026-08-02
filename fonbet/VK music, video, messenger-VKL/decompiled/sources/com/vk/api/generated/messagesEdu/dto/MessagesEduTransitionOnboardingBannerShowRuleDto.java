package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesEduTransitionOnboardingBannerShowRuleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduTransitionOnboardingBannerShowRuleDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduTransitionOnboardingBannerShowRuleDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("date_start")
    private final Integer dateStart;

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("period")
    private final Integer period;

    @pmi0("screen")
    private final ScreenDto screen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEduTransitionOnboardingBannerShowRuleDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;

        @pmi0("count")
        public static final KindDto COUNT;
        public static final Parcelable.Creator<KindDto> CREATOR;

        @pmi0("time")
        public static final KindDto TIME;
        private final String value;

        /* compiled from: MessagesEduTransitionOnboardingBannerShowRuleDto.kt */
        public static final class a implements Parcelable.Creator<KindDto> {
            @Override // android.os.Parcelable.Creator
            public final KindDto createFromParcel(Parcel parcel) {
                return KindDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final KindDto[] newArray(int i) {
                return new KindDto[i];
            }
        }

        static {
            KindDto kindDto = new KindDto("TIME", 0, "time");
            TIME = kindDto;
            KindDto kindDto2 = new KindDto("COUNT", 1, "count");
            COUNT = kindDto2;
            KindDto[] kindDtoArr = {kindDto, kindDto2};
            $VALUES = kindDtoArr;
            $ENTRIES = new asp(kindDtoArr);
            CREATOR = new a();
        }

        private KindDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static KindDto valueOf(String str) {
            return (KindDto) Enum.valueOf(KindDto.class, str);
        }

        public static KindDto[] values() {
            return (KindDto[]) $VALUES.clone();
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
    /* compiled from: MessagesEduTransitionOnboardingBannerShowRuleDto.kt */
    public static final class ScreenDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenDto[] $VALUES;

        @pmi0("calls")
        public static final ScreenDto CALLS;

        @pmi0("chats")
        public static final ScreenDto CHATS;

        @pmi0("contacts")
        public static final ScreenDto CONTACTS;
        public static final Parcelable.Creator<ScreenDto> CREATOR;

        @pmi0("group_chat")
        public static final ScreenDto GROUP_CHAT;

        @pmi0("group_chat_info")
        public static final ScreenDto GROUP_CHAT_INFO;

        @pmi0("p2p_chat_info")
        public static final ScreenDto P2P_CHAT_INFO;

        @pmi0("settings")
        public static final ScreenDto SETTINGS;
        private final String value;

        /* compiled from: MessagesEduTransitionOnboardingBannerShowRuleDto.kt */
        public static final class a implements Parcelable.Creator<ScreenDto> {
            @Override // android.os.Parcelable.Creator
            public final ScreenDto createFromParcel(Parcel parcel) {
                return ScreenDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ScreenDto[] newArray(int i) {
                return new ScreenDto[i];
            }
        }

        static {
            ScreenDto screenDto = new ScreenDto("CHATS", 0, "chats");
            CHATS = screenDto;
            ScreenDto screenDto2 = new ScreenDto("CONTACTS", 1, "contacts");
            CONTACTS = screenDto2;
            ScreenDto screenDto3 = new ScreenDto("CALLS", 2, "calls");
            CALLS = screenDto3;
            ScreenDto screenDto4 = new ScreenDto("SETTINGS", 3, "settings");
            SETTINGS = screenDto4;
            ScreenDto screenDto5 = new ScreenDto("GROUP_CHAT", 4, "group_chat");
            GROUP_CHAT = screenDto5;
            ScreenDto screenDto6 = new ScreenDto("GROUP_CHAT_INFO", 5, "group_chat_info");
            GROUP_CHAT_INFO = screenDto6;
            ScreenDto screenDto7 = new ScreenDto("P2P_CHAT_INFO", 6, "p2p_chat_info");
            P2P_CHAT_INFO = screenDto7;
            ScreenDto[] screenDtoArr = {screenDto, screenDto2, screenDto3, screenDto4, screenDto5, screenDto6, screenDto7};
            $VALUES = screenDtoArr;
            $ENTRIES = new asp(screenDtoArr);
            CREATOR = new a();
        }

        private ScreenDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ScreenDto valueOf(String str) {
            return (ScreenDto) Enum.valueOf(ScreenDto.class, str);
        }

        public static ScreenDto[] values() {
            return (ScreenDto[]) $VALUES.clone();
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

    /* compiled from: MessagesEduTransitionOnboardingBannerShowRuleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduTransitionOnboardingBannerShowRuleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduTransitionOnboardingBannerShowRuleDto createFromParcel(Parcel parcel) {
            return new MessagesEduTransitionOnboardingBannerShowRuleDto(KindDto.CREATOR.createFromParcel(parcel), ScreenDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduTransitionOnboardingBannerShowRuleDto[] newArray(int i) {
            return new MessagesEduTransitionOnboardingBannerShowRuleDto[i];
        }
    }

    public MessagesEduTransitionOnboardingBannerShowRuleDto(KindDto kindDto, ScreenDto screenDto, Integer num, Integer num2, Integer num3) {
        this.kind = kindDto;
        this.screen = screenDto;
        this.dateStart = num;
        this.period = num2;
        this.count = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduTransitionOnboardingBannerShowRuleDto)) {
            return false;
        }
        MessagesEduTransitionOnboardingBannerShowRuleDto messagesEduTransitionOnboardingBannerShowRuleDto = (MessagesEduTransitionOnboardingBannerShowRuleDto) obj;
        return this.kind == messagesEduTransitionOnboardingBannerShowRuleDto.kind && this.screen == messagesEduTransitionOnboardingBannerShowRuleDto.screen && epx.f(this.dateStart, messagesEduTransitionOnboardingBannerShowRuleDto.dateStart) && epx.f(this.period, messagesEduTransitionOnboardingBannerShowRuleDto.period) && epx.f(this.count, messagesEduTransitionOnboardingBannerShowRuleDto.count);
    }

    public final int hashCode() {
        int hashCode = (this.screen.hashCode() + (this.kind.hashCode() * 31)) * 31;
        Integer num = this.dateStart;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.period;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.count;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduTransitionOnboardingBannerShowRuleDto(kind=");
        sb.append(this.kind);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(", dateStart=");
        sb.append(this.dateStart);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        this.screen.writeToParcel(parcel, i);
        Integer num = this.dateStart;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.period;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.count;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ MessagesEduTransitionOnboardingBannerShowRuleDto(KindDto kindDto, ScreenDto screenDto, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this(kindDto, screenDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3);
    }
}
