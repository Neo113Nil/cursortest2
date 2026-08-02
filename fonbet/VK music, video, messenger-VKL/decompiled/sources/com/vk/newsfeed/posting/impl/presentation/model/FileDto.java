package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vkontakte.android.attachments.DocumentAttachment;
import kotlin.NoWhenBranchMatchedException;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public abstract class FileDto implements Parcelable, UploadDto {
    public final int b;
    public final String c;
    public final Integer d;
    public final long e;
    public final UserId f;
    public final String g;

    public FileDto(int i, String str, Integer num, long j, UserId userId, String str2, zcl zclVar) {
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = j;
        this.f = userId;
        this.g = str2;
    }

    public static FileDto a(FileDto fileDto, Integer num, UploadDto.UploadState uploadState, int i) {
        int id = fileDto.getId();
        String title = fileDto.getTitle();
        if ((i & 4) != 0) {
            num = fileDto.f();
        }
        Integer num2 = num;
        long e = fileDto.e();
        UserId q = fileDto.q();
        String d = fileDto.d();
        if ((i & 64) != 0) {
            uploadState = fileDto.I4();
        }
        UploadDto.UploadState uploadState2 = uploadState;
        fileDto.getClass();
        if (fileDto instanceof Doc) {
            return new Doc(id, title, num2, e, q, d, uploadState2, ((Doc) fileDto).o);
        }
        if (!(fileDto instanceof Gif)) {
            throw new NoWhenBranchMatchedException();
        }
        Gif gif = (Gif) fileDto;
        return new Gif(id, title, num2, e, q, d, uploadState2, gif.o, gif.p);
    }

    public String d() {
        return this.g;
    }

    public long e() {
        return this.e;
    }

    public Integer f() {
        return this.d;
    }

    public int getId() {
        return this.b;
    }

    public String getTitle() {
        return this.c;
    }

    public UserId q() {
        return this.f;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final Object x2() {
        return null;
    }

    /* compiled from: PostingViewState.kt */
    public static final class Doc extends FileDto {
        public static final Parcelable.Creator<Doc> CREATOR = new a();
        public final int h;
        public final String i;
        public final Integer j;
        public final long k;
        public final UserId l;
        public final String m;
        public final UploadDto.UploadState n;
        public final long o;

        /* compiled from: PostingViewState.kt */
        public static final class a implements Parcelable.Creator<Doc> {
            @Override // android.os.Parcelable.Creator
            public final Doc createFromParcel(Parcel parcel) {
                return new Doc(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), (UserId) parcel.readParcelable(Doc.class.getClassLoader()), parcel.readString(), UploadDto.UploadState.CREATOR.createFromParcel(parcel), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Doc[] newArray(int i) {
                return new Doc[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Doc(int i, String str, Integer num, long j, UserId userId, String str2, UploadDto.UploadState uploadState, long j2, int i2, zcl zclVar) {
            this(i, str, num, j, r7, r8, r9, j2);
            UploadDto.UploadState uploadState2;
            UserId userId2 = (i2 & 16) != 0 ? UserId.d : userId;
            String str3 = (i2 & 32) != 0 ? null : str2;
            if ((i2 & 64) != 0) {
                UploadDto.b7.getClass();
                uploadState2 = UploadDto.a.b;
            } else {
                uploadState2 = uploadState;
            }
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
        public final UploadDto.UploadState I4() {
            return this.n;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final String d() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final long e() {
            return this.k;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
        public final long e9() {
            return this.o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Doc)) {
                return false;
            }
            Doc doc = (Doc) obj;
            return this.h == doc.h && epx.f(this.i, doc.i) && epx.f(this.j, doc.j) && this.k == doc.k && epx.f(this.l, doc.l) && epx.f(this.m, doc.m) && epx.f(this.n, doc.n) && this.o == doc.o;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final Integer f() {
            return this.j;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final int getId() {
            return this.h;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final String getTitle() {
            return this.i;
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.h) * 31, 31, this.i);
            Integer num = this.j;
            int a3 = bh10.a(bh10.a((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.k), 31, this.l.b);
            String str = this.m;
            return Long.hashCode(this.o) + ((this.n.hashCode() + ((a3 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final UserId q() {
            return this.l;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Doc(id=");
            sb.append(this.h);
            sb.append(", title=");
            sb.append(this.i);
            sb.append(", subtitle=");
            sb.append(this.j);
            sb.append(", size=");
            sb.append(this.k);
            sb.append(", ownerId=");
            sb.append(this.l);
            sb.append(", accessKey=");
            sb.append(this.m);
            sb.append(", uploadState=");
            sb.append(this.n);
            sb.append(", uploadSize=");
            return vu5.a(')', this.o, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h);
            parcel.writeString(this.i);
            Integer num = this.j;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeLong(this.k);
            parcel.writeParcelable(this.l, i);
            parcel.writeString(this.m);
            this.n.writeToParcel(parcel, i);
            parcel.writeLong(this.o);
        }

        public Doc(int i, String str, Integer num, long j, UserId userId, String str2, UploadDto.UploadState uploadState, long j2) {
            super(i, str, num, j, userId, str2, null);
            this.h = i;
            this.i = str;
            this.j = num;
            this.k = j;
            this.l = userId;
            this.m = str2;
            this.n = uploadState;
            this.o = j2;
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class Gif extends FileDto implements PostingAttachment {
        public static final Parcelable.Creator<Gif> CREATOR = new a();
        public final int h;
        public final String i;
        public final Integer j;
        public final long k;
        public final UserId l;
        public final String m;
        public final UploadDto.UploadState n;
        public final DocumentAttachment o;
        public final long p;
        public final AttachmentType q;

        /* compiled from: PostingViewState.kt */
        public static final class a implements Parcelable.Creator<Gif> {
            @Override // android.os.Parcelable.Creator
            public final Gif createFromParcel(Parcel parcel) {
                return new Gif(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), (UserId) parcel.readParcelable(Gif.class.getClassLoader()), parcel.readString(), UploadDto.UploadState.CREATOR.createFromParcel(parcel), (DocumentAttachment) parcel.readParcelable(Gif.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Gif[] newArray(int i) {
                return new Gif[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Gif(int i, String str, Integer num, long j, UserId userId, String str2, UploadDto.UploadState uploadState, DocumentAttachment documentAttachment, long j2, int i2, zcl zclVar) {
            this(i, str, num, j, r7, r8, r9, documentAttachment, j2);
            UploadDto.UploadState uploadState2;
            UserId userId2 = (i2 & 16) != 0 ? UserId.d : userId;
            String str3 = (i2 & 32) != 0 ? null : str2;
            if ((i2 & 64) != 0) {
                UploadDto.b7.getClass();
                uploadState2 = UploadDto.a.b;
            } else {
                uploadState2 = uploadState;
            }
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
        public final UploadDto.UploadState I4() {
            return this.n;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final String d() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final long e() {
            return this.k;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
        public final long e9() {
            return this.p;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gif)) {
                return false;
            }
            Gif gif = (Gif) obj;
            return this.h == gif.h && epx.f(this.i, gif.i) && epx.f(this.j, gif.j) && this.k == gif.k && epx.f(this.l, gif.l) && epx.f(this.m, gif.m) && epx.f(this.n, gif.n) && epx.f(this.o, gif.o) && this.p == gif.p;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final Integer f() {
            return this.j;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final int getId() {
            return this.h;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final String getTitle() {
            return this.i;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
        public final AttachmentType getType() {
            return this.q;
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.h) * 31, 31, this.i);
            Integer num = this.j;
            int a3 = bh10.a(bh10.a((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.k), 31, this.l.b);
            String str = this.m;
            return Long.hashCode(this.p) + ((this.o.hashCode() + ((this.n.hashCode() + ((a3 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment
        public final Attachment nb() {
            return this.o;
        }

        @Override // com.vk.newsfeed.posting.impl.presentation.model.FileDto
        public final UserId q() {
            return this.l;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gif(id=");
            sb.append(this.h);
            sb.append(", title=");
            sb.append(this.i);
            sb.append(", subtitle=");
            sb.append(this.j);
            sb.append(", size=");
            sb.append(this.k);
            sb.append(", ownerId=");
            sb.append(this.l);
            sb.append(", accessKey=");
            sb.append(this.m);
            sb.append(", uploadState=");
            sb.append(this.n);
            sb.append(", attachment=");
            sb.append(this.o);
            sb.append(", uploadSize=");
            return vu5.a(')', this.p, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h);
            parcel.writeString(this.i);
            Integer num = this.j;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeLong(this.k);
            parcel.writeParcelable(this.l, i);
            parcel.writeString(this.m);
            this.n.writeToParcel(parcel, i);
            parcel.writeParcelable(this.o, i);
            parcel.writeLong(this.p);
        }

        public Gif(int i, String str, Integer num, long j, UserId userId, String str2, UploadDto.UploadState uploadState, DocumentAttachment documentAttachment, long j2) {
            super(i, str, num, j, userId, str2, null);
            this.h = i;
            this.i = str;
            this.j = num;
            this.k = j;
            this.l = userId;
            this.m = str2;
            this.n = uploadState;
            this.o = documentAttachment;
            this.p = j2;
            this.q = AttachmentType.DOCUMENT;
        }
    }
}
