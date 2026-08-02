package com.vk.clips.uploader.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.clips.external.VideoToClipInfo;
import java.io.File;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ClipUploadJob.kt */
/* loaded from: classes17.dex */
public final class ClipUploadJob implements Parcelable {
    public static final Parcelable.Creator<ClipUploadJob> CREATOR = new a();
    public final int b;
    public final ClipUploaderData.Author c;
    public final Integer d;
    public final File e;
    public final Integer f;
    public final boolean g;
    public final String h;
    public final VideoToClipInfo i;
    public final File j;
    public final Boolean k;

    /* compiled from: ClipUploadJob.kt */
    public static final class a implements Parcelable.Creator<ClipUploadJob> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadJob createFromParcel(Parcel parcel) {
            Class cls;
            ClipUploaderData.Author author;
            Integer num;
            File file;
            boolean z;
            Boolean valueOf;
            int readInt = parcel.readInt();
            ClipUploaderData.Author author2 = (ClipUploaderData.Author) parcel.readParcelable(ClipUploadJob.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            File file2 = (File) parcel.readSerializable();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                cls = ClipUploadJob.class;
                author = author2;
                num = valueOf2;
                file = file2;
                z = true;
            } else {
                cls = ClipUploadJob.class;
                author = author2;
                num = valueOf2;
                file = file2;
                z = false;
            }
            Integer num2 = valueOf3;
            String readString = parcel.readString();
            VideoToClipInfo videoToClipInfo = (VideoToClipInfo) parcel.readParcelable(cls.getClassLoader());
            File file3 = (File) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClipUploadJob(readInt, author, num, file, num2, z, readString, videoToClipInfo, file3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadJob[] newArray(int i) {
            return new ClipUploadJob[i];
        }
    }

    public ClipUploadJob(int i, ClipUploaderData.Author author, Integer num, File file, Integer num2, boolean z, String str, VideoToClipInfo videoToClipInfo, File file2, Boolean bool) {
        this.b = i;
        this.c = author;
        this.d = num;
        this.e = file;
        this.f = num2;
        this.g = z;
        this.h = str;
        this.i = videoToClipInfo;
        this.j = file2;
        this.k = bool;
    }

    public static ClipUploadJob a(ClipUploadJob clipUploadJob, ClipUploaderData.Author author, Integer num, Integer num2, boolean z, String str, VideoToClipInfo videoToClipInfo, File file, Boolean bool, int i) {
        int i2 = clipUploadJob.b;
        if ((i & 2) != 0) {
            author = clipUploadJob.c;
        }
        ClipUploaderData.Author author2 = author;
        if ((i & 4) != 0) {
            num = clipUploadJob.d;
        }
        Integer num3 = num;
        File file2 = clipUploadJob.e;
        if ((i & 16) != 0) {
            num2 = clipUploadJob.f;
        }
        Integer num4 = num2;
        boolean z2 = (i & 32) != 0 ? clipUploadJob.g : z;
        String str2 = (i & 64) != 0 ? clipUploadJob.h : str;
        VideoToClipInfo videoToClipInfo2 = (i & 128) != 0 ? clipUploadJob.i : videoToClipInfo;
        File file3 = (i & 256) != 0 ? clipUploadJob.j : file;
        Boolean bool2 = (i & 512) != 0 ? clipUploadJob.k : bool;
        clipUploadJob.getClass();
        return new ClipUploadJob(i2, author2, num3, file2, num4, z2, str2, videoToClipInfo2, file3, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploadJob)) {
            return false;
        }
        ClipUploadJob clipUploadJob = (ClipUploadJob) obj;
        return this.b == clipUploadJob.b && epx.f(this.c, clipUploadJob.c) && epx.f(this.d, clipUploadJob.d) && epx.f(this.e, clipUploadJob.e) && epx.f(this.f, clipUploadJob.f) && this.g == clipUploadJob.g && epx.f(this.h, clipUploadJob.h) && epx.f(this.i, clipUploadJob.i) && epx.f(this.j, clipUploadJob.j) && epx.f(this.k, clipUploadJob.k);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        ClipUploaderData.Author author = this.c;
        int hashCode2 = (hashCode + (author == null ? 0 : author.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        File file = this.e;
        int hashCode4 = (hashCode3 + (file == null ? 0 : file.hashCode())) * 31;
        Integer num2 = this.f;
        int b = qoy.b((hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int hashCode5 = (b + (str == null ? 0 : str.hashCode())) * 31;
        VideoToClipInfo videoToClipInfo = this.i;
        int hashCode6 = (hashCode5 + (videoToClipInfo == null ? 0 : videoToClipInfo.hashCode())) * 31;
        File file2 = this.j;
        int hashCode7 = (hashCode6 + (file2 == null ? 0 : file2.hashCode())) * 31;
        Boolean bool = this.k;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadJob(id=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", videoId=");
        sb.append(this.d);
        sb.append(", previewFile=");
        sb.append(this.e);
        sb.append(", publicationDateSeconds=");
        sb.append(this.f);
        sb.append(", hasMusic=");
        sb.append(this.g);
        sb.append(", creationEntryPoint=");
        sb.append(this.h);
        sb.append(", videoToClipInfo=");
        sb.append(this.i);
        sb.append(", clientProcessorOutput=");
        sb.append(this.j);
        sb.append(", postToWall=");
        return tn.a(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeSerializable(this.e);
        Integer num2 = this.f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeSerializable(this.j);
        Boolean bool = this.k;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ClipUploadJob(int i, ClipUploaderData.Author author, Integer num, File file, Integer num2, boolean z, String str, VideoToClipInfo videoToClipInfo, File file2, Boolean bool, int i2, zcl zclVar) {
        this(i, author, num, file, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : videoToClipInfo, (i2 & 256) != 0 ? null : file2, (i2 & 512) != 0 ? null : bool);
    }
}
