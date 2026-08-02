package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesAdsDataV5113Dto.kt */
/* loaded from: classes15.dex */
public final class StoriesAdsDataV5113Dto implements Parcelable {
    public static final Parcelable.Creator<StoriesAdsDataV5113Dto> CREATOR = new a();

    @pmi0("items")
    private final List<StoriesFeedItemDto> items;

    @pmi0("settings")
    private final StoriesAdsSettingsDto settings;

    /* compiled from: StoriesAdsDataV5113Dto.kt */
    public static final class a implements Parcelable.Creator<StoriesAdsDataV5113Dto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesAdsDataV5113Dto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            StoriesAdsSettingsDto createFromParcel = parcel.readInt() == 0 ? null : StoriesAdsSettingsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StoriesFeedItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoriesAdsDataV5113Dto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesAdsDataV5113Dto[] newArray(int i) {
            return new StoriesAdsDataV5113Dto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesAdsDataV5113Dto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<StoriesFeedItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StoriesAdsSettingsDto e() {
        return this.settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesAdsDataV5113Dto)) {
            return false;
        }
        StoriesAdsDataV5113Dto storiesAdsDataV5113Dto = (StoriesAdsDataV5113Dto) obj;
        return epx.f(this.settings, storiesAdsDataV5113Dto.settings) && epx.f(this.items, storiesAdsDataV5113Dto.items);
    }

    public final int hashCode() {
        StoriesAdsSettingsDto storiesAdsSettingsDto = this.settings;
        int hashCode = (storiesAdsSettingsDto == null ? 0 : storiesAdsSettingsDto.hashCode()) * 31;
        List<StoriesFeedItemDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesAdsDataV5113Dto(settings=");
        sb.append(this.settings);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StoriesAdsSettingsDto storiesAdsSettingsDto = this.settings;
        if (storiesAdsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesAdsSettingsDto.writeToParcel(parcel, i);
        }
        List<StoriesFeedItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((StoriesFeedItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public StoriesAdsDataV5113Dto(StoriesAdsSettingsDto storiesAdsSettingsDto, List<StoriesFeedItemDto> list) {
        this.settings = storiesAdsSettingsDto;
        this.items = list;
    }

    public /* synthetic */ StoriesAdsDataV5113Dto(StoriesAdsSettingsDto storiesAdsSettingsDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : storiesAdsSettingsDto, (i & 2) != 0 ? null : list);
    }
}
