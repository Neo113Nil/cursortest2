package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArticlesGetOwnerPublishedSortByDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesGetOwnerPublishedSortByDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ArticlesGetOwnerPublishedSortByDto[] $VALUES;
    public static final Parcelable.Creator<ArticlesGetOwnerPublishedSortByDto> CREATOR;

    @pmi0("date")
    public static final ArticlesGetOwnerPublishedSortByDto DATE;

    @pmi0("views")
    public static final ArticlesGetOwnerPublishedSortByDto VIEWS;
    private final String value;

    /* compiled from: ArticlesGetOwnerPublishedSortByDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesGetOwnerPublishedSortByDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesGetOwnerPublishedSortByDto createFromParcel(Parcel parcel) {
            return ArticlesGetOwnerPublishedSortByDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesGetOwnerPublishedSortByDto[] newArray(int i) {
            return new ArticlesGetOwnerPublishedSortByDto[i];
        }
    }

    static {
        ArticlesGetOwnerPublishedSortByDto articlesGetOwnerPublishedSortByDto = new ArticlesGetOwnerPublishedSortByDto("DATE", 0, "date");
        DATE = articlesGetOwnerPublishedSortByDto;
        ArticlesGetOwnerPublishedSortByDto articlesGetOwnerPublishedSortByDto2 = new ArticlesGetOwnerPublishedSortByDto("VIEWS", 1, "views");
        VIEWS = articlesGetOwnerPublishedSortByDto2;
        ArticlesGetOwnerPublishedSortByDto[] articlesGetOwnerPublishedSortByDtoArr = {articlesGetOwnerPublishedSortByDto, articlesGetOwnerPublishedSortByDto2};
        $VALUES = articlesGetOwnerPublishedSortByDtoArr;
        $ENTRIES = new asp(articlesGetOwnerPublishedSortByDtoArr);
        CREATOR = new a();
    }

    private ArticlesGetOwnerPublishedSortByDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ArticlesGetOwnerPublishedSortByDto valueOf(String str) {
        return (ArticlesGetOwnerPublishedSortByDto) Enum.valueOf(ArticlesGetOwnerPublishedSortByDto.class, str);
    }

    public static ArticlesGetOwnerPublishedSortByDto[] values() {
        return (ArticlesGetOwnerPublishedSortByDto[]) $VALUES.clone();
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
