package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ArticlesArticleDonutPlaceholderDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesArticleDonutPlaceholderDto implements Parcelable {
    public static final Parcelable.Creator<ArticlesArticleDonutPlaceholderDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("description")
    private final String description;

    @pmi0("text")
    private final String text;

    /* compiled from: ArticlesArticleDonutPlaceholderDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesArticleDonutPlaceholderDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleDonutPlaceholderDto createFromParcel(Parcel parcel) {
            return new ArticlesArticleDonutPlaceholderDto(parcel.readString(), BaseLinkButtonDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleDonutPlaceholderDto[] newArray(int i) {
            return new ArticlesArticleDonutPlaceholderDto[i];
        }
    }

    public ArticlesArticleDonutPlaceholderDto(String str, BaseLinkButtonDto baseLinkButtonDto, String str2) {
        this.text = str;
        this.button = baseLinkButtonDto;
        this.description = str2;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesArticleDonutPlaceholderDto)) {
            return false;
        }
        ArticlesArticleDonutPlaceholderDto articlesArticleDonutPlaceholderDto = (ArticlesArticleDonutPlaceholderDto) obj;
        return epx.f(this.text, articlesArticleDonutPlaceholderDto.text) && epx.f(this.button, articlesArticleDonutPlaceholderDto.button) && epx.f(this.description, articlesArticleDonutPlaceholderDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = (this.button.hashCode() + (this.text.hashCode() * 31)) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticlesArticleDonutPlaceholderDto(text=");
        sb.append(this.text);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        this.button.writeToParcel(parcel, i);
        parcel.writeString(this.description);
    }

    public /* synthetic */ ArticlesArticleDonutPlaceholderDto(String str, BaseLinkButtonDto baseLinkButtonDto, String str2, int i, zcl zclVar) {
        this(str, baseLinkButtonDto, (i & 4) != 0 ? null : str2);
    }
}
