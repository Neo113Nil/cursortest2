package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArticlesGetOwnerPublishedExtendedSortByDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesGetOwnerPublishedExtendedSortByDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ArticlesGetOwnerPublishedExtendedSortByDto[] $VALUES;
    public static final Parcelable.Creator<ArticlesGetOwnerPublishedExtendedSortByDto> CREATOR;

    @pmi0("date")
    public static final ArticlesGetOwnerPublishedExtendedSortByDto DATE;

    @pmi0("views")
    public static final ArticlesGetOwnerPublishedExtendedSortByDto VIEWS;
    private final String value;

    /* compiled from: ArticlesGetOwnerPublishedExtendedSortByDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesGetOwnerPublishedExtendedSortByDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesGetOwnerPublishedExtendedSortByDto createFromParcel(Parcel parcel) {
            return ArticlesGetOwnerPublishedExtendedSortByDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesGetOwnerPublishedExtendedSortByDto[] newArray(int i) {
            return new ArticlesGetOwnerPublishedExtendedSortByDto[i];
        }
    }

    static {
        ArticlesGetOwnerPublishedExtendedSortByDto articlesGetOwnerPublishedExtendedSortByDto = new ArticlesGetOwnerPublishedExtendedSortByDto("DATE", 0, "date");
        DATE = articlesGetOwnerPublishedExtendedSortByDto;
        ArticlesGetOwnerPublishedExtendedSortByDto articlesGetOwnerPublishedExtendedSortByDto2 = new ArticlesGetOwnerPublishedExtendedSortByDto("VIEWS", 1, "views");
        VIEWS = articlesGetOwnerPublishedExtendedSortByDto2;
        ArticlesGetOwnerPublishedExtendedSortByDto[] articlesGetOwnerPublishedExtendedSortByDtoArr = {articlesGetOwnerPublishedExtendedSortByDto, articlesGetOwnerPublishedExtendedSortByDto2};
        $VALUES = articlesGetOwnerPublishedExtendedSortByDtoArr;
        $ENTRIES = new asp(articlesGetOwnerPublishedExtendedSortByDtoArr);
        CREATOR = new a();
    }

    private ArticlesGetOwnerPublishedExtendedSortByDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ArticlesGetOwnerPublishedExtendedSortByDto valueOf(String str) {
        return (ArticlesGetOwnerPublishedExtendedSortByDto) Enum.valueOf(ArticlesGetOwnerPublishedExtendedSortByDto.class, str);
    }

    public static ArticlesGetOwnerPublishedExtendedSortByDto[] values() {
        return (ArticlesGetOwnerPublishedExtendedSortByDto[]) $VALUES.clone();
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
