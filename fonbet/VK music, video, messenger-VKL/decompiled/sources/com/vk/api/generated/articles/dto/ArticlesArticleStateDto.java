package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArticlesArticleStateDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesArticleStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ArticlesArticleStateDto[] $VALUES;

    @pmi0("available")
    public static final ArticlesArticleStateDto AVAILABLE;

    @pmi0("banned")
    public static final ArticlesArticleStateDto BANNED;
    public static final Parcelable.Creator<ArticlesArticleStateDto> CREATOR;

    @pmi0("deleted")
    public static final ArticlesArticleStateDto DELETED;

    @pmi0("paid")
    public static final ArticlesArticleStateDto PAID;

    @pmi0("protected")
    public static final ArticlesArticleStateDto PROTECTED;
    private final String value;

    /* compiled from: ArticlesArticleStateDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesArticleStateDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleStateDto createFromParcel(Parcel parcel) {
            return ArticlesArticleStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleStateDto[] newArray(int i) {
            return new ArticlesArticleStateDto[i];
        }
    }

    static {
        ArticlesArticleStateDto articlesArticleStateDto = new ArticlesArticleStateDto("AVAILABLE", 0, "available");
        AVAILABLE = articlesArticleStateDto;
        ArticlesArticleStateDto articlesArticleStateDto2 = new ArticlesArticleStateDto("DELETED", 1, "deleted");
        DELETED = articlesArticleStateDto2;
        ArticlesArticleStateDto articlesArticleStateDto3 = new ArticlesArticleStateDto("BANNED", 2, "banned");
        BANNED = articlesArticleStateDto3;
        ArticlesArticleStateDto articlesArticleStateDto4 = new ArticlesArticleStateDto("PROTECTED", 3, "protected");
        PROTECTED = articlesArticleStateDto4;
        ArticlesArticleStateDto articlesArticleStateDto5 = new ArticlesArticleStateDto("PAID", 4, "paid");
        PAID = articlesArticleStateDto5;
        ArticlesArticleStateDto[] articlesArticleStateDtoArr = {articlesArticleStateDto, articlesArticleStateDto2, articlesArticleStateDto3, articlesArticleStateDto4, articlesArticleStateDto5};
        $VALUES = articlesArticleStateDtoArr;
        $ENTRIES = new asp(articlesArticleStateDtoArr);
        CREATOR = new a();
    }

    private ArticlesArticleStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ArticlesArticleStateDto valueOf(String str) {
        return (ArticlesArticleStateDto) Enum.valueOf(ArticlesArticleStateDto.class, str);
    }

    public static ArticlesArticleStateDto[] values() {
        return (ArticlesArticleStateDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
