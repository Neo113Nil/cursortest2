package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetVKPayNewCardBindingUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetVKPayNewCardBindingUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetVKPayNewCardBindingUrlResponseDto> CREATOR = new a();

    @pmi0("qid")
    private final Integer qid;

    @pmi0("url")
    private final String url;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: MoneyGetVKPayNewCardBindingUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetVKPayNewCardBindingUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetVKPayNewCardBindingUrlResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetVKPayNewCardBindingUrlResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UserId) parcel.readParcelable(MoneyGetVKPayNewCardBindingUrlResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetVKPayNewCardBindingUrlResponseDto[] newArray(int i) {
            return new MoneyGetVKPayNewCardBindingUrlResponseDto[i];
        }
    }

    public MoneyGetVKPayNewCardBindingUrlResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetVKPayNewCardBindingUrlResponseDto)) {
            return false;
        }
        MoneyGetVKPayNewCardBindingUrlResponseDto moneyGetVKPayNewCardBindingUrlResponseDto = (MoneyGetVKPayNewCardBindingUrlResponseDto) obj;
        return epx.f(this.qid, moneyGetVKPayNewCardBindingUrlResponseDto.qid) && epx.f(this.url, moneyGetVKPayNewCardBindingUrlResponseDto.url) && epx.f(this.userId, moneyGetVKPayNewCardBindingUrlResponseDto.userId);
    }

    public final int hashCode() {
        Integer num = this.qid;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.userId;
        return hashCode2 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetVKPayNewCardBindingUrlResponseDto(qid=");
        sb.append(this.qid);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", userId=");
        return gp.b(sb, this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.qid;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.url);
        parcel.writeParcelable(this.userId, i);
    }

    public MoneyGetVKPayNewCardBindingUrlResponseDto(Integer num, String str, UserId userId) {
        this.qid = num;
        this.url = str;
        this.userId = userId;
    }

    public /* synthetic */ MoneyGetVKPayNewCardBindingUrlResponseDto(Integer num, String str, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userId);
    }
}
