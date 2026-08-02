package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StickersUgcPackDto.kt */
/* loaded from: classes15.dex */
public final class StickersUgcPackDto implements Parcelable {
    public static final Parcelable.Creator<StickersUgcPackDto> CREATOR = new a();

    @pmi0("edit_data")
    private final StickersUgcPackEditDataDto editData;

    @pmi0("has_hidden_stickers")
    private final Boolean hasHiddenStickers;

    @pmi0("hash")
    private final String hash;

    @pmi0("id")
    private final long id;

    @pmi0("is_claimed")
    private final Boolean isClaimed;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("stickers")
    private final List<StickersUgcStickerDto> stickers;

    /* compiled from: StickersUgcPackDto.kt */
    public static final class a implements Parcelable.Creator<StickersUgcPackDto> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // android.os.Parcelable.Creator
        public final StickersUgcPackDto createFromParcel(Parcel parcel) {
            ?? r0;
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(StickersUgcPackDto.class.getClassLoader());
            long readLong = parcel.readLong();
            boolean z = true;
            if (parcel.readInt() != 0) {
                r0 = 1;
            } else {
                r0 = 1;
                z = false;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersUgcStickerDto.CREATOR, parcel, arrayList, i, r0);
            }
            String readString = parcel.readString();
            Boolean bool = null;
            StickersUgcPackEditDataDto createFromParcel = parcel.readInt() == 0 ? null : StickersUgcPackEditDataDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? r0 : false);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0 ? r0 : false);
            }
            return new StickersUgcPackDto(userId, readLong, z, arrayList, readString, createFromParcel, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUgcPackDto[] newArray(int i) {
            return new StickersUgcPackDto[i];
        }
    }

    public StickersUgcPackDto(UserId userId, long j, boolean z, List<StickersUgcStickerDto> list, String str, StickersUgcPackEditDataDto stickersUgcPackEditDataDto, Boolean bool, Boolean bool2) {
        this.ownerId = userId;
        this.id = j;
        this.isEnabled = z;
        this.stickers = list;
        this.hash = str;
        this.editData = stickersUgcPackEditDataDto;
        this.isClaimed = bool;
        this.hasHiddenStickers = bool2;
    }

    public final StickersUgcPackEditDataDto d() {
        return this.editData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.hash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersUgcPackDto)) {
            return false;
        }
        StickersUgcPackDto stickersUgcPackDto = (StickersUgcPackDto) obj;
        return epx.f(this.ownerId, stickersUgcPackDto.ownerId) && this.id == stickersUgcPackDto.id && this.isEnabled == stickersUgcPackDto.isEnabled && epx.f(this.stickers, stickersUgcPackDto.stickers) && epx.f(this.hash, stickersUgcPackDto.hash) && epx.f(this.editData, stickersUgcPackDto.editData) && epx.f(this.isClaimed, stickersUgcPackDto.isClaimed) && epx.f(this.hasHiddenStickers, stickersUgcPackDto.hasHiddenStickers);
    }

    public final long f() {
        return this.id;
    }

    public final List<StickersUgcStickerDto> g() {
        return this.stickers;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(qoy.b(bh10.a(Long.hashCode(this.ownerId.b) * 31, 31, this.id), 31, this.isEnabled), 31, this.stickers), 31, this.hash);
        StickersUgcPackEditDataDto stickersUgcPackEditDataDto = this.editData;
        int hashCode = (a2 + (stickersUgcPackEditDataDto == null ? 0 : stickersUgcPackEditDataDto.hashCode())) * 31;
        Boolean bool = this.isClaimed;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasHiddenStickers;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersUgcPackDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", editData=");
        sb.append(this.editData);
        sb.append(", isClaimed=");
        sb.append(this.isClaimed);
        sb.append(", hasHiddenStickers=");
        return tn.a(sb, this.hasHiddenStickers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeLong(this.id);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.stickers);
        while (a2.hasNext()) {
            ((StickersUgcStickerDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.hash);
        StickersUgcPackEditDataDto stickersUgcPackEditDataDto = this.editData;
        if (stickersUgcPackEditDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersUgcPackEditDataDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isClaimed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasHiddenStickers;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ StickersUgcPackDto(UserId userId, long j, boolean z, List list, String str, StickersUgcPackEditDataDto stickersUgcPackEditDataDto, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(userId, j, z, list, str, (i & 32) != 0 ? null : stickersUgcPackEditDataDto, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2);
    }
}
