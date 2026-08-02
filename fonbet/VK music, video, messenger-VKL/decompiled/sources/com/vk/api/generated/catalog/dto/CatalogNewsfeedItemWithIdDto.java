package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogNewsfeedItemWithIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogNewsfeedItemWithIdDto implements Parcelable {
    public static final Parcelable.Creator<CatalogNewsfeedItemWithIdDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final NewsfeedNewsfeedItemDto item;

    /* compiled from: CatalogNewsfeedItemWithIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogNewsfeedItemWithIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogNewsfeedItemWithIdDto createFromParcel(Parcel parcel) {
            return new CatalogNewsfeedItemWithIdDto(parcel.readString(), (NewsfeedNewsfeedItemDto) parcel.readParcelable(CatalogNewsfeedItemWithIdDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogNewsfeedItemWithIdDto[] newArray(int i) {
            return new CatalogNewsfeedItemWithIdDto[i];
        }
    }

    public CatalogNewsfeedItemWithIdDto(String str, NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto) {
        this.id = str;
        this.item = newsfeedNewsfeedItemDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogNewsfeedItemWithIdDto)) {
            return false;
        }
        CatalogNewsfeedItemWithIdDto catalogNewsfeedItemWithIdDto = (CatalogNewsfeedItemWithIdDto) obj;
        return epx.f(this.id, catalogNewsfeedItemWithIdDto.id) && epx.f(this.item, catalogNewsfeedItemWithIdDto.item);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto = this.item;
        return hashCode + (newsfeedNewsfeedItemDto == null ? 0 : newsfeedNewsfeedItemDto.hashCode());
    }

    public final String toString() {
        return "CatalogNewsfeedItemWithIdDto(id=" + this.id + ", item=" + this.item + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.item, i);
    }

    public /* synthetic */ CatalogNewsfeedItemWithIdDto(String str, NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedNewsfeedItemDto);
    }
}
