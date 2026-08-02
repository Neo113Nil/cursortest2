package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.zcl;

/* compiled from: PostEditableData.kt */
/* loaded from: classes4.dex */
public final class LinksParsingMetaData implements Parcelable {
    public static final Parcelable.Creator<LinksParsingMetaData> CREATOR = new a();
    public final List<String> b;
    public final List<ParsedAttachment> c;
    public final PostingLinkDto d;
    public final PostingArticleDto e;

    /* compiled from: PostEditableData.kt */
    public static final class a implements Parcelable.Creator<LinksParsingMetaData> {
        @Override // android.os.Parcelable.Creator
        public final LinksParsingMetaData createFromParcel(Parcel parcel) {
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ParsedAttachment.CREATOR, parcel, arrayList, i, 1);
            }
            return new LinksParsingMetaData(createStringArrayList, arrayList, parcel.readInt() == 0 ? null : PostingLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PostingArticleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LinksParsingMetaData[] newArray(int i) {
            return new LinksParsingMetaData[i];
        }
    }

    public LinksParsingMetaData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinksParsingMetaData a(LinksParsingMetaData linksParsingMetaData, ArrayList arrayList, ArrayList arrayList2, PostingLinkDto postingLinkDto, PostingArticleDto postingArticleDto, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = linksParsingMetaData.b;
        }
        List list2 = arrayList2;
        if ((i & 2) != 0) {
            list2 = linksParsingMetaData.c;
        }
        if ((i & 4) != 0) {
            postingLinkDto = linksParsingMetaData.d;
        }
        if ((i & 8) != 0) {
            postingArticleDto = linksParsingMetaData.e;
        }
        linksParsingMetaData.getClass();
        return new LinksParsingMetaData(list, list2, postingLinkDto, postingArticleDto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinksParsingMetaData)) {
            return false;
        }
        LinksParsingMetaData linksParsingMetaData = (LinksParsingMetaData) obj;
        return epx.f(this.b, linksParsingMetaData.b) && epx.f(this.c, linksParsingMetaData.c) && epx.f(this.d, linksParsingMetaData.d) && epx.f(this.e, linksParsingMetaData.e);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
        PostingLinkDto postingLinkDto = this.d;
        int hashCode = (a2 + (postingLinkDto == null ? 0 : postingLinkDto.hashCode())) * 31;
        PostingArticleDto postingArticleDto = this.e;
        return hashCode + (postingArticleDto != null ? postingArticleDto.hashCode() : 0);
    }

    public final String toString() {
        return "LinksParsingMetaData(parsedUrls=" + this.b + ", parsedLinksAttachments=" + this.c + ", removedLink=" + this.d + ", removedArticle=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((ParsedAttachment) a2.next()).writeToParcel(parcel, i);
        }
        PostingLinkDto postingLinkDto = this.d;
        if (postingLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postingLinkDto.writeToParcel(parcel, i);
        }
        PostingArticleDto postingArticleDto = this.e;
        if (postingArticleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postingArticleDto.writeToParcel(parcel, i);
        }
    }

    public LinksParsingMetaData(List list, List list2, PostingLinkDto postingLinkDto, PostingArticleDto postingArticleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? null : postingLinkDto, (i & 8) != 0 ? null : postingArticleDto);
    }

    public LinksParsingMetaData(List<String> list, List<ParsedAttachment> list2, PostingLinkDto postingLinkDto, PostingArticleDto postingArticleDto) {
        this.b = list;
        this.c = list2;
        this.d = postingLinkDto;
        this.e = postingArticleDto;
    }
}
