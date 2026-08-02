package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.loyaltyTeen.dto.LoyaltyTeenPartnerAchievementDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesGetUserAchievementsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetUserAchievementsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetUserAchievementsResponseDto> CREATOR = new a();

    @pmi0("achievements")
    private final List<LoyaltyTeenPartnerAchievementDto> achievements;

    @pmi0("count")
    private final Integer count;

    @pmi0("has_more")
    private final Boolean hasMore;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final Integer offset;

    /* compiled from: MessagesGetUserAchievementsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetUserAchievementsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetUserAchievementsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(LoyaltyTeenPartnerAchievementDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesGetUserAchievementsResponseDto(arrayList, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetUserAchievementsResponseDto[] newArray(int i) {
            return new MessagesGetUserAchievementsResponseDto[i];
        }
    }

    public MessagesGetUserAchievementsResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<LoyaltyTeenPartnerAchievementDto> d() {
        return this.achievements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetUserAchievementsResponseDto)) {
            return false;
        }
        MessagesGetUserAchievementsResponseDto messagesGetUserAchievementsResponseDto = (MessagesGetUserAchievementsResponseDto) obj;
        return epx.f(this.achievements, messagesGetUserAchievementsResponseDto.achievements) && epx.f(this.hasMore, messagesGetUserAchievementsResponseDto.hasMore) && epx.f(this.count, messagesGetUserAchievementsResponseDto.count) && epx.f(this.offset, messagesGetUserAchievementsResponseDto.offset);
    }

    public final int hashCode() {
        List<LoyaltyTeenPartnerAchievementDto> list = this.achievements;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetUserAchievementsResponseDto(achievements=");
        sb.append(this.achievements);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", offset=");
        return uqi.b(sb, this.offset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LoyaltyTeenPartnerAchievementDto> list = this.achievements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((LoyaltyTeenPartnerAchievementDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.offset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public MessagesGetUserAchievementsResponseDto(List<LoyaltyTeenPartnerAchievementDto> list, Boolean bool, Integer num, Integer num2) {
        this.achievements = list;
        this.hasMore = bool;
        this.count = num;
        this.offset = num2;
    }

    public /* synthetic */ MessagesGetUserAchievementsResponseDto(List list, Boolean bool, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
