package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StickersStickersRecommendationBlockDto.kt */
/* loaded from: classes15.dex */
public final class StickersStickersRecommendationBlockDto implements Parcelable {
    public static final Parcelable.Creator<StickersStickersRecommendationBlockDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("next_block_id")
    private final String nextBlockId;

    @pmi0("stickers")
    private final List<StickersStickersRecommendationBlockStickerDto> stickers;

    @pmi0("title")
    private final String title;

    /* compiled from: StickersStickersRecommendationBlockDto.kt */
    public static final class a implements Parcelable.Creator<StickersStickersRecommendationBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStickersRecommendationBlockDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersStickersRecommendationBlockStickerDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersStickersRecommendationBlockDto(readString, readString2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStickersRecommendationBlockDto[] newArray(int i) {
            return new StickersStickersRecommendationBlockDto[i];
        }
    }

    public StickersStickersRecommendationBlockDto(String str, String str2, List<StickersStickersRecommendationBlockStickerDto> list, String str3) {
        this.id = str;
        this.title = str2;
        this.stickers = list;
        this.nextBlockId = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStickersRecommendationBlockDto)) {
            return false;
        }
        StickersStickersRecommendationBlockDto stickersStickersRecommendationBlockDto = (StickersStickersRecommendationBlockDto) obj;
        return epx.f(this.id, stickersStickersRecommendationBlockDto.id) && epx.f(this.title, stickersStickersRecommendationBlockDto.title) && epx.f(this.stickers, stickersStickersRecommendationBlockDto.stickers) && epx.f(this.nextBlockId, stickersStickersRecommendationBlockDto.nextBlockId);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.stickers);
        String str = this.nextBlockId;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStickersRecommendationBlockDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", nextBlockId=");
        return ho8.a(sb, this.nextBlockId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.stickers);
        while (a2.hasNext()) {
            ((StickersStickersRecommendationBlockStickerDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextBlockId);
    }

    public /* synthetic */ StickersStickersRecommendationBlockDto(String str, String str2, List list, String str3, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : str3);
    }
}
