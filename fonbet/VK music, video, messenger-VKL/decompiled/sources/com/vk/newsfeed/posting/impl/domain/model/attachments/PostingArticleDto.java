package com.vk.newsfeed.posting.impl.domain.model.attachments;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.attachments.ArticleAttachment;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostingArticleDto.kt */
/* loaded from: classes4.dex */
public final class PostingArticleDto implements Parcelable {
    public static final Parcelable.Creator<PostingArticleDto> CREATOR = new a();
    public final ArticleAttachment b;
    public final String c;

    /* compiled from: PostingArticleDto.kt */
    public static final class a implements Parcelable.Creator<PostingArticleDto> {
        @Override // android.os.Parcelable.Creator
        public final PostingArticleDto createFromParcel(Parcel parcel) {
            return new PostingArticleDto((ArticleAttachment) parcel.readParcelable(PostingArticleDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingArticleDto[] newArray(int i) {
            return new PostingArticleDto[i];
        }
    }

    public PostingArticleDto(ArticleAttachment articleAttachment, String str) {
        this.b = articleAttachment;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingArticleDto)) {
            return false;
        }
        PostingArticleDto postingArticleDto = (PostingArticleDto) obj;
        return epx.f(this.b, postingArticleDto.b) && epx.f(this.c, postingArticleDto.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingArticleDto(attachment=");
        sb.append(this.b);
        sb.append(", sourceUrl=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
