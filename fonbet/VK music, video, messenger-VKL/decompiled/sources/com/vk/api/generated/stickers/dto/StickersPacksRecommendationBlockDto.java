package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StickersPacksRecommendationBlockDto.kt */
/* loaded from: classes15.dex */
public final class StickersPacksRecommendationBlockDto implements Parcelable {
    public static final Parcelable.Creator<StickersPacksRecommendationBlockDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("next_block_id")
    private final String nextBlockId;

    @pmi0("pack_ids")
    private final List<Integer> packIds;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: StickersPacksRecommendationBlockDto.kt */
    public static final class a implements Parcelable.Creator<StickersPacksRecommendationBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPacksRecommendationBlockDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new StickersPacksRecommendationBlockDto(readString, readString2, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPacksRecommendationBlockDto[] newArray(int i) {
            return new StickersPacksRecommendationBlockDto[i];
        }
    }

    public StickersPacksRecommendationBlockDto(String str, String str2, List<Integer> list, String str3, String str4) {
        this.id = str;
        this.title = str2;
        this.packIds = list;
        this.type = str3;
        this.nextBlockId = str4;
    }

    public final String d() {
        return this.nextBlockId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.packIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPacksRecommendationBlockDto)) {
            return false;
        }
        StickersPacksRecommendationBlockDto stickersPacksRecommendationBlockDto = (StickersPacksRecommendationBlockDto) obj;
        return epx.f(this.id, stickersPacksRecommendationBlockDto.id) && epx.f(this.title, stickersPacksRecommendationBlockDto.title) && epx.f(this.packIds, stickersPacksRecommendationBlockDto.packIds) && epx.f(this.type, stickersPacksRecommendationBlockDto.type) && epx.f(this.nextBlockId, stickersPacksRecommendationBlockDto.nextBlockId);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.packIds);
        String str = this.type;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextBlockId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersPacksRecommendationBlockDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", packIds=");
        sb.append(this.packIds);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", nextBlockId=");
        return ho8.a(sb, this.nextBlockId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.packIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.type);
        parcel.writeString(this.nextBlockId);
    }

    public /* synthetic */ StickersPacksRecommendationBlockDto(String str, String str2, List list, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
