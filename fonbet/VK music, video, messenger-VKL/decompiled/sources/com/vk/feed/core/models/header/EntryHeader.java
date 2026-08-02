package com.vk.feed.core.models.header;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.SocialButtonType;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.OverlayImage;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;

/* compiled from: EntryHeader.kt */
/* loaded from: classes18.dex */
public final class EntryHeader implements Serializer.StreamParcelable {
    public static final Serializer.c<EntryHeader> CREATOR = new a();
    public final SourcePhoto b;
    public final HeaderTitle c;
    public final HeaderBadge d;
    public final List<Description> e;
    public final OverlayImage f;
    public final String g;
    public final Integer h;
    public final SocialButtonType i;
    public final HeaderIcon j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryHeader> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryHeader a(Serializer serializer) {
            SourcePhoto sourcePhoto = (SourcePhoto) serializer.G(SourcePhoto.class.getClassLoader());
            HeaderTitle headerTitle = (HeaderTitle) serializer.G(HeaderTitle.class.getClassLoader());
            HeaderBadge headerBadge = (HeaderBadge) serializer.G(HeaderBadge.class.getClassLoader());
            ArrayList k = serializer.k(Description.class);
            OverlayImage overlayImage = (OverlayImage) serializer.G(OverlayImage.class.getClassLoader());
            String H = serializer.H();
            Integer v = serializer.v();
            SocialButtonType.a aVar = SocialButtonType.Companion;
            String H2 = serializer.H();
            aVar.getClass();
            return new EntryHeader(sourcePhoto, headerTitle, headerBadge, k, overlayImage, H, v, SocialButtonType.a.a(H2), (HeaderIcon) serializer.G(HeaderIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryHeader[i];
        }
    }

    public EntryHeader(SourcePhoto sourcePhoto, HeaderTitle headerTitle, HeaderBadge headerBadge, List<Description> list, OverlayImage overlayImage, String str, Integer num, SocialButtonType socialButtonType, HeaderIcon headerIcon) {
        this.b = sourcePhoto;
        this.c = headerTitle;
        this.d = headerBadge;
        this.e = list;
        this.f = overlayImage;
        this.g = str;
        this.h = num;
        this.i = socialButtonType;
        this.j = headerIcon;
    }

    public static EntryHeader a(EntryHeader entryHeader, SourcePhoto sourcePhoto, HeaderTitle headerTitle, Integer num, int i) {
        if ((i & 1) != 0) {
            sourcePhoto = entryHeader.b;
        }
        SourcePhoto sourcePhoto2 = sourcePhoto;
        if ((i & 2) != 0) {
            headerTitle = entryHeader.c;
        }
        HeaderTitle headerTitle2 = headerTitle;
        HeaderBadge headerBadge = entryHeader.d;
        List<Description> list = entryHeader.e;
        OverlayImage overlayImage = entryHeader.f;
        String str = entryHeader.g;
        if ((i & 64) != 0) {
            num = entryHeader.h;
        }
        SocialButtonType socialButtonType = entryHeader.i;
        HeaderIcon headerIcon = entryHeader.j;
        entryHeader.getClass();
        return new EntryHeader(sourcePhoto2, headerTitle2, headerBadge, list, overlayImage, str, num, socialButtonType, headerIcon);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.W(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.V(this.h);
        SocialButtonType socialButtonType = this.i;
        serializer.j0(socialButtonType != null ? socialButtonType.name() : null);
        serializer.i0(this.j);
    }

    public final SourcePhoto d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryHeader)) {
            return false;
        }
        EntryHeader entryHeader = (EntryHeader) obj;
        return epx.f(this.b, entryHeader.b) && epx.f(this.c, entryHeader.c) && epx.f(this.d, entryHeader.d) && epx.f(this.e, entryHeader.e) && epx.f(this.f, entryHeader.f) && epx.f(this.g, entryHeader.g) && epx.f(this.h, entryHeader.h) && this.i == entryHeader.i && epx.f(this.j, entryHeader.j);
    }

    public final int hashCode() {
        SourcePhoto sourcePhoto = this.b;
        int hashCode = (sourcePhoto == null ? 0 : sourcePhoto.hashCode()) * 31;
        HeaderTitle headerTitle = this.c;
        int hashCode2 = (hashCode + (headerTitle == null ? 0 : headerTitle.hashCode())) * 31;
        HeaderBadge headerBadge = this.d;
        int hashCode3 = (hashCode2 + (headerBadge == null ? 0 : headerBadge.hashCode())) * 31;
        List<Description> list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        OverlayImage overlayImage = this.f;
        int hashCode5 = (hashCode4 + (overlayImage == null ? 0 : overlayImage.hashCode())) * 31;
        String str = this.g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.h;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        SocialButtonType socialButtonType = this.i;
        int hashCode8 = (hashCode7 + (socialButtonType == null ? 0 : socialButtonType.hashCode())) * 31;
        HeaderIcon headerIcon = this.j;
        return hashCode8 + (headerIcon != null ? headerIcon.hashCode() : 0);
    }

    public final String toString() {
        return "EntryHeader(photo=" + this.b + ", title=" + this.c + ", badge=" + this.d + ", descriptions=" + this.e + ", overlayImage=" + this.f + ", warning=" + this.g + ", date=" + this.h + ", socialButtonType=" + this.i + ", icon=" + this.j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
