package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PostEditableData.kt */
/* loaded from: classes4.dex */
public final class PostEditableData implements Parcelable {
    public static final Parcelable.Creator<PostEditableData> CREATOR = new a();
    public static final PostEditableData D = new PostEditableData(0, "", PostingTextRestriction.Invisible.b, null, null, null, null, PrivacyPostType.AllUsers.b, PhotoVideoAttachmentsCropData.f, PhotoVideoDisplayMode.Carousel, null, null, null, null, EmptyList.b, null, null, false, null, null, false, new LinksParsingMetaData(null, null, null, null, 15, null), null, null, false, false, false, null, 167772160, null);
    public final boolean A;
    public final boolean B;
    public final RepostToStoryOnboarding C;
    public final int b;
    public final String c;
    public final PostingTextRestriction d;
    public final PostingPollDto e;
    public final PostingPlaceDto f;
    public final PostingArticleDto g;
    public final PostingLinkDto h;
    public final PrivacyPostType i;
    public final PhotoVideoAttachmentsCropData j;
    public final PhotoVideoDisplayMode k;
    public final MusicAttachDto l;
    public final FileDto m;
    public final List<CoauthorDto> n;
    public final Date o;
    public final List<PostingAttachment> p;
    public final AdditionalSettingsConfiguration q;
    public final PhotoTagsData r;
    public final boolean s;
    public final ActionButton t;
    public final ActionButton u;
    public final boolean v;
    public final LinksParsingMetaData w;
    public final Date x;
    public final String y;
    public final boolean z;

    /* compiled from: PostEditableData.kt */
    public static final class a implements Parcelable.Creator<PostEditableData> {
        @Override // android.os.Parcelable.Creator
        public final PostEditableData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            String str;
            PostingPollDto postingPollDto;
            PostingPlaceDto postingPlaceDto;
            PostingLinkDto postingLinkDto;
            PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData;
            MusicAttachDto musicAttachDto;
            ArrayList arrayList2;
            PostingArticleDto postingArticleDto;
            PrivacyPostType privacyPostType;
            PhotoVideoDisplayMode photoVideoDisplayMode;
            FileDto fileDto;
            Date date;
            boolean z;
            boolean z2;
            int i2;
            ActionButton actionButton;
            PostingTextRestriction postingTextRestriction;
            boolean z3;
            boolean z4;
            Date date2;
            boolean z5;
            boolean z6;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            PostingTextRestriction postingTextRestriction2 = (PostingTextRestriction) parcel.readParcelable(PostEditableData.class.getClassLoader());
            PostingPollDto createFromParcel = parcel.readInt() == 0 ? null : PostingPollDto.CREATOR.createFromParcel(parcel);
            PostingPlaceDto createFromParcel2 = parcel.readInt() == 0 ? null : PostingPlaceDto.CREATOR.createFromParcel(parcel);
            PostingArticleDto createFromParcel3 = parcel.readInt() == 0 ? null : PostingArticleDto.CREATOR.createFromParcel(parcel);
            PostingLinkDto createFromParcel4 = parcel.readInt() == 0 ? null : PostingLinkDto.CREATOR.createFromParcel(parcel);
            PrivacyPostType privacyPostType2 = (PrivacyPostType) parcel.readParcelable(PostEditableData.class.getClassLoader());
            PhotoVideoAttachmentsCropData createFromParcel5 = PhotoVideoAttachmentsCropData.CREATOR.createFromParcel(parcel);
            PhotoVideoDisplayMode valueOf = PhotoVideoDisplayMode.valueOf(parcel.readString());
            MusicAttachDto musicAttachDto2 = (MusicAttachDto) parcel.readParcelable(PostEditableData.class.getClassLoader());
            FileDto fileDto2 = (FileDto) parcel.readParcelable(PostEditableData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                i = readInt;
                int i3 = 0;
                while (true) {
                    str = readString;
                    if (i3 == readInt2) {
                        break;
                    }
                    i3 = en.a(CoauthorDto.CREATOR, parcel, arrayList, i3, 1);
                    readString = str;
                    postingTextRestriction2 = postingTextRestriction2;
                }
            } else {
                i = readInt;
                arrayList = null;
                str = readString;
            }
            PostingTextRestriction postingTextRestriction3 = postingTextRestriction2;
            Date date3 = (Date) parcel.readSerializable();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = bo.b(PostEditableData.class, parcel, arrayList3, i4, 1);
            }
            AdditionalSettingsConfiguration createFromParcel6 = parcel.readInt() == 0 ? null : AdditionalSettingsConfiguration.CREATOR.createFromParcel(parcel);
            PhotoTagsData createFromParcel7 = parcel.readInt() == 0 ? null : PhotoTagsData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                postingPollDto = createFromParcel;
                postingPlaceDto = createFromParcel2;
                postingLinkDto = createFromParcel4;
                photoVideoAttachmentsCropData = createFromParcel5;
                musicAttachDto = musicAttachDto2;
                arrayList2 = arrayList;
                postingArticleDto = createFromParcel3;
                privacyPostType = privacyPostType2;
                photoVideoDisplayMode = valueOf;
                fileDto = fileDto2;
                date = date3;
                z = true;
            } else {
                postingPollDto = createFromParcel;
                postingPlaceDto = createFromParcel2;
                postingLinkDto = createFromParcel4;
                photoVideoAttachmentsCropData = createFromParcel5;
                musicAttachDto = musicAttachDto2;
                arrayList2 = arrayList;
                postingArticleDto = createFromParcel3;
                privacyPostType = privacyPostType2;
                photoVideoDisplayMode = valueOf;
                fileDto = fileDto2;
                date = date3;
                z = false;
            }
            ActionButton createFromParcel8 = parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel);
            ActionButton createFromParcel9 = parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z2 = false;
                i2 = i;
                actionButton = createFromParcel8;
                postingTextRestriction = postingTextRestriction3;
                z3 = true;
            } else {
                z2 = false;
                i2 = i;
                actionButton = createFromParcel8;
                postingTextRestriction = postingTextRestriction3;
                z3 = false;
            }
            String str2 = str;
            LinksParsingMetaData createFromParcel10 = LinksParsingMetaData.CREATOR.createFromParcel(parcel);
            Date date4 = (Date) parcel.readSerializable();
            int i5 = i2;
            boolean z7 = true;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z2;
                date2 = date4;
                z5 = true;
            } else {
                z4 = z2;
                date2 = date4;
                z5 = z4;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = true;
                z7 = z4;
            }
            if (parcel.readInt() != 0) {
                z4 = z6;
            }
            return new PostEditableData(i5, str2, postingTextRestriction, postingPollDto, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType, photoVideoAttachmentsCropData, photoVideoDisplayMode, musicAttachDto, fileDto, arrayList2, date, arrayList3, createFromParcel6, createFromParcel7, z, actionButton, createFromParcel9, z3, createFromParcel10, date2, readString2, z5, z7, z4, RepostToStoryOnboarding.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PostEditableData[] newArray(int i) {
            return new PostEditableData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostEditableData(int i, String str, PostingTextRestriction postingTextRestriction, PostingPollDto postingPollDto, PostingPlaceDto postingPlaceDto, PostingArticleDto postingArticleDto, PostingLinkDto postingLinkDto, PrivacyPostType privacyPostType, PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, PhotoVideoDisplayMode photoVideoDisplayMode, MusicAttachDto musicAttachDto, FileDto fileDto, List<CoauthorDto> list, Date date, List<? extends PostingAttachment> list2, AdditionalSettingsConfiguration additionalSettingsConfiguration, PhotoTagsData photoTagsData, boolean z, ActionButton actionButton, ActionButton actionButton2, boolean z2, LinksParsingMetaData linksParsingMetaData, Date date2, String str2, boolean z3, boolean z4, boolean z5, RepostToStoryOnboarding repostToStoryOnboarding) {
        this.b = i;
        this.c = str;
        this.d = postingTextRestriction;
        this.e = postingPollDto;
        this.f = postingPlaceDto;
        this.g = postingArticleDto;
        this.h = postingLinkDto;
        this.i = privacyPostType;
        this.j = photoVideoAttachmentsCropData;
        this.k = photoVideoDisplayMode;
        this.l = musicAttachDto;
        this.m = fileDto;
        this.n = list;
        this.o = date;
        this.p = list2;
        this.q = additionalSettingsConfiguration;
        this.r = photoTagsData;
        this.s = z;
        this.t = actionButton;
        this.u = actionButton2;
        this.v = z2;
        this.w = linksParsingMetaData;
        this.x = date2;
        this.y = str2;
        this.z = z3;
        this.A = z4;
        this.B = z5;
        this.C = repostToStoryOnboarding;
    }

    public static PostEditableData a(PostEditableData postEditableData, String str, PostingTextRestriction postingTextRestriction, PostingPollDto postingPollDto, PostingPlaceDto postingPlaceDto, PostingArticleDto postingArticleDto, PostingLinkDto postingLinkDto, PrivacyPostType privacyPostType, PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, PhotoVideoDisplayMode photoVideoDisplayMode, MusicAttachDto musicAttachDto, FileDto fileDto, List list, Date date, List list2, AdditionalSettingsConfiguration additionalSettingsConfiguration, PhotoTagsData photoTagsData, ActionButton actionButton, ActionButton actionButton2, LinksParsingMetaData linksParsingMetaData, Date date2, String str2, boolean z, RepostToStoryOnboarding repostToStoryOnboarding, int i) {
        boolean z2;
        ActionButton actionButton3;
        boolean z3;
        boolean z4;
        int i2 = postEditableData.b;
        String str3 = (i & 2) != 0 ? postEditableData.c : str;
        PostingTextRestriction postingTextRestriction2 = (i & 4) != 0 ? postEditableData.d : postingTextRestriction;
        PostingPollDto postingPollDto2 = (i & 8) != 0 ? postEditableData.e : postingPollDto;
        PostingPlaceDto postingPlaceDto2 = (i & 16) != 0 ? postEditableData.f : postingPlaceDto;
        PostingArticleDto postingArticleDto2 = (i & 32) != 0 ? postEditableData.g : postingArticleDto;
        PostingLinkDto postingLinkDto2 = (i & 64) != 0 ? postEditableData.h : postingLinkDto;
        PrivacyPostType privacyPostType2 = (i & 128) != 0 ? postEditableData.i : privacyPostType;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData2 = (i & 256) != 0 ? postEditableData.j : photoVideoAttachmentsCropData;
        PhotoVideoDisplayMode photoVideoDisplayMode2 = (i & 512) != 0 ? postEditableData.k : photoVideoDisplayMode;
        MusicAttachDto musicAttachDto2 = (i & 1024) != 0 ? postEditableData.l : musicAttachDto;
        FileDto fileDto2 = (i & 2048) != 0 ? postEditableData.m : fileDto;
        List list3 = (i & 4096) != 0 ? postEditableData.n : list;
        Date date3 = (i & 8192) != 0 ? postEditableData.o : date;
        List list4 = (i & 16384) != 0 ? postEditableData.p : list2;
        AdditionalSettingsConfiguration additionalSettingsConfiguration2 = (i & 32768) != 0 ? postEditableData.q : additionalSettingsConfiguration;
        PhotoTagsData photoTagsData2 = (i & 65536) != 0 ? postEditableData.r : photoTagsData;
        boolean z5 = postEditableData.s;
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            z2 = z5;
            actionButton3 = postEditableData.t;
        } else {
            z2 = z5;
            actionButton3 = actionButton;
        }
        ActionButton actionButton4 = (i & 524288) != 0 ? postEditableData.u : actionButton2;
        boolean z6 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? postEditableData.v : true;
        LinksParsingMetaData linksParsingMetaData2 = (i & 2097152) != 0 ? postEditableData.w : linksParsingMetaData;
        Date date4 = (i & 4194304) != 0 ? postEditableData.x : date2;
        String str4 = (i & 8388608) != 0 ? postEditableData.y : str2;
        boolean z7 = postEditableData.z;
        boolean z8 = postEditableData.A;
        if ((i & 67108864) != 0) {
            z3 = z8;
            z4 = postEditableData.B;
        } else {
            z3 = z8;
            z4 = z;
        }
        RepostToStoryOnboarding repostToStoryOnboarding2 = (i & 134217728) != 0 ? postEditableData.C : repostToStoryOnboarding;
        postEditableData.getClass();
        return new PostEditableData(i2, str3, postingTextRestriction2, postingPollDto2, postingPlaceDto2, postingArticleDto2, postingLinkDto2, privacyPostType2, photoVideoAttachmentsCropData2, photoVideoDisplayMode2, musicAttachDto2, fileDto2, list3, date3, list4, additionalSettingsConfiguration2, photoTagsData2, z2, actionButton3, actionButton4, z6, linksParsingMetaData2, date4, str4, z7, z3, z4, repostToStoryOnboarding2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostEditableData)) {
            return false;
        }
        PostEditableData postEditableData = (PostEditableData) obj;
        return this.b == postEditableData.b && epx.f(this.c, postEditableData.c) && epx.f(this.d, postEditableData.d) && epx.f(this.e, postEditableData.e) && epx.f(this.f, postEditableData.f) && epx.f(this.g, postEditableData.g) && epx.f(this.h, postEditableData.h) && epx.f(this.i, postEditableData.i) && epx.f(this.j, postEditableData.j) && this.k == postEditableData.k && epx.f(this.l, postEditableData.l) && epx.f(this.m, postEditableData.m) && epx.f(this.n, postEditableData.n) && epx.f(this.o, postEditableData.o) && epx.f(this.p, postEditableData.p) && epx.f(this.q, postEditableData.q) && epx.f(this.r, postEditableData.r) && this.s == postEditableData.s && epx.f(this.t, postEditableData.t) && epx.f(this.u, postEditableData.u) && this.v == postEditableData.v && epx.f(this.w, postEditableData.w) && epx.f(this.x, postEditableData.x) && epx.f(this.y, postEditableData.y) && this.z == postEditableData.z && this.A == postEditableData.A && this.B == postEditableData.B && this.C == postEditableData.C;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c)) * 31;
        PostingPollDto postingPollDto = this.e;
        int hashCode2 = (hashCode + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31;
        PostingPlaceDto postingPlaceDto = this.f;
        int hashCode3 = (hashCode2 + (postingPlaceDto == null ? 0 : postingPlaceDto.hashCode())) * 31;
        PostingArticleDto postingArticleDto = this.g;
        int hashCode4 = (hashCode3 + (postingArticleDto == null ? 0 : postingArticleDto.hashCode())) * 31;
        PostingLinkDto postingLinkDto = this.h;
        int hashCode5 = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((hashCode4 + (postingLinkDto == null ? 0 : postingLinkDto.hashCode())) * 31)) * 31)) * 31)) * 31;
        MusicAttachDto musicAttachDto = this.l;
        int hashCode6 = (hashCode5 + (musicAttachDto == null ? 0 : musicAttachDto.hashCode())) * 31;
        FileDto fileDto = this.m;
        int hashCode7 = (hashCode6 + (fileDto == null ? 0 : fileDto.hashCode())) * 31;
        List<CoauthorDto> list = this.n;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Date date = this.o;
        int a2 = fw3.a((hashCode8 + (date == null ? 0 : date.hashCode())) * 31, 31, this.p);
        AdditionalSettingsConfiguration additionalSettingsConfiguration = this.q;
        int hashCode9 = (a2 + (additionalSettingsConfiguration == null ? 0 : additionalSettingsConfiguration.hashCode())) * 31;
        PhotoTagsData photoTagsData = this.r;
        int b = qoy.b((hashCode9 + (photoTagsData == null ? 0 : photoTagsData.hashCode())) * 31, 31, this.s);
        ActionButton actionButton = this.t;
        int hashCode10 = (b + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        ActionButton actionButton2 = this.u;
        int hashCode11 = (this.w.hashCode() + qoy.b((hashCode10 + (actionButton2 == null ? 0 : actionButton2.hashCode())) * 31, 31, this.v)) * 31;
        Date date2 = this.x;
        int hashCode12 = (hashCode11 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.y;
        return this.C.hashCode() + qoy.b(qoy.b(qoy.b((hashCode12 + (str != null ? str.hashCode() : 0)) * 31, 31, this.z), 31, this.A), 31, this.B);
    }

    public final String toString() {
        return "PostEditableData(editPostId=" + this.b + ", text=" + this.c + ", textRestriction=" + this.d + ", poll=" + this.e + ", place=" + this.f + ", article=" + this.g + ", link=" + this.h + ", privacySettingsType=" + this.i + ", photoVideoCropData=" + this.j + ", photoVideoDisplayMode=" + this.k + ", music=" + this.l + ", file=" + this.m + ", coauthors=" + this.n + ", postponePublishDate=" + this.o + ", attachments=" + this.p + ", additionalSettingsConfiguration=" + this.q + ", photoTags=" + this.r + ", hasUnsupportedFields=" + this.s + ", actionButton=" + this.t + ", removedActionButton=" + this.u + ", rememberActionButton=" + this.v + ", linksParsingMetadata=" + this.w + ", openForAllDate=" + this.x + ", donutTeaserText=" + this.y + ", isPrivacyEditable=" + this.z + ", canPublishFreeCopy=" + this.A + ", isStoryRepostSwitchedOn=" + this.B + ", showRepostToStoryOnboarding=" + this.C + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        PostingPollDto postingPollDto = this.e;
        if (postingPollDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postingPollDto.writeToParcel(parcel, i);
        }
        PostingPlaceDto postingPlaceDto = this.f;
        if (postingPlaceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postingPlaceDto.writeToParcel(parcel, i);
        }
        PostingArticleDto postingArticleDto = this.g;
        if (postingArticleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postingArticleDto.writeToParcel(parcel, i);
        }
        PostingLinkDto postingLinkDto = this.h;
        if (postingLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postingLinkDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.i, i);
        this.j.writeToParcel(parcel, i);
        parcel.writeString(this.k.name());
        parcel.writeParcelable(this.l, i);
        parcel.writeParcelable(this.m, i);
        List<CoauthorDto> list = this.n;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CoauthorDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeSerializable(this.o);
        Iterator a2 = ao.a(parcel, this.p);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        AdditionalSettingsConfiguration additionalSettingsConfiguration = this.q;
        if (additionalSettingsConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalSettingsConfiguration.writeToParcel(parcel, i);
        }
        PhotoTagsData photoTagsData = this.r;
        if (photoTagsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Serializer.StreamParcelable.a.a(photoTagsData, parcel);
        }
        parcel.writeInt(this.s ? 1 : 0);
        ActionButton actionButton = this.t;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, i);
        }
        ActionButton actionButton2 = this.u;
        if (actionButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.v ? 1 : 0);
        this.w.writeToParcel(parcel, i);
        parcel.writeSerializable(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C.name());
    }

    public /* synthetic */ PostEditableData(int i, String str, PostingTextRestriction postingTextRestriction, PostingPollDto postingPollDto, PostingPlaceDto postingPlaceDto, PostingArticleDto postingArticleDto, PostingLinkDto postingLinkDto, PrivacyPostType privacyPostType, PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, PhotoVideoDisplayMode photoVideoDisplayMode, MusicAttachDto musicAttachDto, FileDto fileDto, List list, Date date, List list2, AdditionalSettingsConfiguration additionalSettingsConfiguration, PhotoTagsData photoTagsData, boolean z, ActionButton actionButton, ActionButton actionButton2, boolean z2, LinksParsingMetaData linksParsingMetaData, Date date2, String str2, boolean z3, boolean z4, boolean z5, RepostToStoryOnboarding repostToStoryOnboarding, int i2, zcl zclVar) {
        this(i, str, postingTextRestriction, postingPollDto, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType, photoVideoAttachmentsCropData, photoVideoDisplayMode, musicAttachDto, fileDto, list, date, list2, additionalSettingsConfiguration, photoTagsData, z, actionButton, actionButton2, z2, linksParsingMetaData, date2, str2, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? false : z3, (i2 & 33554432) != 0 ? true : z4, (i2 & 67108864) != 0 ? false : z5, (i2 & 134217728) != 0 ? RepostToStoryOnboarding.NONE : repostToStoryOnboarding);
    }
}
