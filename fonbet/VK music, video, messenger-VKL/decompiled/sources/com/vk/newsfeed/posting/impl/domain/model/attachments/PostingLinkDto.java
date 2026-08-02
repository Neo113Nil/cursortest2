package com.vk.newsfeed.posting.impl.domain.model.attachments;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.attachments.SnippetAttachment;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostingLinkDto.kt */
/* loaded from: classes4.dex */
public final class PostingLinkDto implements Parcelable {
    public static final Parcelable.Creator<PostingLinkDto> CREATOR = new a();
    public final SnippetAttachment b;
    public final String c;

    /* compiled from: PostingLinkDto.kt */
    public static final class a implements Parcelable.Creator<PostingLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final PostingLinkDto createFromParcel(Parcel parcel) {
            return new PostingLinkDto((SnippetAttachment) parcel.readParcelable(PostingLinkDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingLinkDto[] newArray(int i) {
            return new PostingLinkDto[i];
        }
    }

    public PostingLinkDto(SnippetAttachment snippetAttachment, String str) {
        this.b = snippetAttachment;
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
        if (!(obj instanceof PostingLinkDto)) {
            return false;
        }
        PostingLinkDto postingLinkDto = (PostingLinkDto) obj;
        return epx.f(this.b, postingLinkDto.b) && epx.f(this.c, postingLinkDto.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingLinkDto(attachment=");
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
