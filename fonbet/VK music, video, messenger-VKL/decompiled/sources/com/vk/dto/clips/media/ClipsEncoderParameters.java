package com.vk.dto.clips.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.dto.clips.upload.ClipEditorSizeParams;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ClipsEncoderParameters.kt */
/* loaded from: classes18.dex */
public final class ClipsEncoderParameters implements Parcelable {
    public static final Parcelable.Creator<ClipsEncoderParameters> CREATOR = new a();
    public final Timeline b;
    public final VideoOutputSettings c;
    public final ClipEditorSizeParams d;
    public final MediaQuality e;
    public final File f;
    public final LicensedMusicInfo g;
    public final List<ISerializableStickerSDK> h;

    /* compiled from: ClipsEncoderParameters.kt */
    public static final class LicensedMusicInfo implements Parcelable {
        public static final Parcelable.Creator<LicensedMusicInfo> CREATOR = new a();
        public final File b;
        public final String c;
        public final String d;

        /* compiled from: ClipsEncoderParameters.kt */
        public static final class a implements Parcelable.Creator<LicensedMusicInfo> {
            @Override // android.os.Parcelable.Creator
            public final LicensedMusicInfo createFromParcel(Parcel parcel) {
                return new LicensedMusicInfo((File) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LicensedMusicInfo[] newArray(int i) {
                return new LicensedMusicInfo[i];
            }
        }

        public LicensedMusicInfo(File file, String str, String str2) {
            this.b = file;
            this.c = str;
            this.d = str2;
        }

        public final File d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LicensedMusicInfo)) {
                return false;
            }
            LicensedMusicInfo licensedMusicInfo = (LicensedMusicInfo) obj;
            return epx.f(this.b, licensedMusicInfo.b) && epx.f(this.c, licensedMusicInfo.c) && epx.f(this.d, licensedMusicInfo.d);
        }

        public final String getId() {
            return this.c;
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LicensedMusicInfo(file=");
            sb.append(this.b);
            sb.append(", id=");
            sb.append(this.c);
            sb.append(", uri=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: ClipsEncoderParameters.kt */
    public static final class VideoOutputSettings implements Parcelable {
        public static final Parcelable.Creator<VideoOutputSettings> CREATOR = new a();
        public final int b;
        public final int c;

        /* compiled from: ClipsEncoderParameters.kt */
        public static final class a implements Parcelable.Creator<VideoOutputSettings> {
            @Override // android.os.Parcelable.Creator
            public final VideoOutputSettings createFromParcel(Parcel parcel) {
                return new VideoOutputSettings(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoOutputSettings[] newArray(int i) {
                return new VideoOutputSettings[i];
            }
        }

        public VideoOutputSettings(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoOutputSettings)) {
                return false;
            }
            VideoOutputSettings videoOutputSettings = (VideoOutputSettings) obj;
            return this.b == videoOutputSettings.b && this.c == videoOutputSettings.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoOutputSettings(targetWidth=");
            sb.append(this.b);
            sb.append(", targetHeight=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    /* compiled from: ClipsEncoderParameters.kt */
    public static final class a implements Parcelable.Creator<ClipsEncoderParameters> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEncoderParameters createFromParcel(Parcel parcel) {
            Timeline timeline = (Timeline) parcel.readParcelable(ClipsEncoderParameters.class.getClassLoader());
            VideoOutputSettings createFromParcel = VideoOutputSettings.CREATOR.createFromParcel(parcel);
            ClipEditorSizeParams createFromParcel2 = ClipEditorSizeParams.CREATOR.createFromParcel(parcel);
            MediaQuality valueOf = MediaQuality.valueOf(parcel.readString());
            File file = (File) parcel.readSerializable();
            LicensedMusicInfo createFromParcel3 = parcel.readInt() == 0 ? null : LicensedMusicInfo.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ClipsEncoderParameters.class, parcel, arrayList, i, 1);
            }
            return new ClipsEncoderParameters(timeline, createFromParcel, createFromParcel2, valueOf, file, createFromParcel3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEncoderParameters[] newArray(int i) {
            return new ClipsEncoderParameters[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsEncoderParameters(Timeline timeline, VideoOutputSettings videoOutputSettings, ClipEditorSizeParams clipEditorSizeParams, MediaQuality mediaQuality, File file, LicensedMusicInfo licensedMusicInfo, List<? extends ISerializableStickerSDK> list) {
        this.b = timeline;
        this.c = videoOutputSettings;
        this.d = clipEditorSizeParams;
        this.e = mediaQuality;
        this.f = file;
        this.g = licensedMusicInfo;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ClipsEncoderParameters a(ClipsEncoderParameters clipsEncoderParameters, File file, ArrayList arrayList, int i) {
        Timeline timeline = clipsEncoderParameters.b;
        VideoOutputSettings videoOutputSettings = clipsEncoderParameters.c;
        ClipEditorSizeParams clipEditorSizeParams = clipsEncoderParameters.d;
        MediaQuality mediaQuality = clipsEncoderParameters.e;
        if ((i & 16) != 0) {
            file = clipsEncoderParameters.f;
        }
        File file2 = file;
        LicensedMusicInfo licensedMusicInfo = clipsEncoderParameters.g;
        List list = arrayList;
        if ((i & 64) != 0) {
            list = clipsEncoderParameters.h;
        }
        clipsEncoderParameters.getClass();
        return new ClipsEncoderParameters(timeline, videoOutputSettings, clipEditorSizeParams, mediaQuality, file2, licensedMusicInfo, list);
    }

    public final LicensedMusicInfo d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final File e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEncoderParameters)) {
            return false;
        }
        ClipsEncoderParameters clipsEncoderParameters = (ClipsEncoderParameters) obj;
        return epx.f(this.b, clipsEncoderParameters.b) && epx.f(this.c, clipsEncoderParameters.c) && epx.f(this.d, clipsEncoderParameters.d) && this.e == clipsEncoderParameters.e && epx.f(this.f, clipsEncoderParameters.f) && epx.f(this.g, clipsEncoderParameters.g) && epx.f(this.h, clipsEncoderParameters.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31;
        File file = this.f;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        LicensedMusicInfo licensedMusicInfo = this.g;
        return this.h.hashCode() + ((hashCode2 + (licensedMusicInfo != null ? licensedMusicInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEncoderParameters(timeline=");
        sb.append(this.b);
        sb.append(", outputVideoSettings=");
        sb.append(this.c);
        sb.append(", editorSizeParams=");
        sb.append(this.d);
        sb.append(", quality=");
        sb.append(this.e);
        sb.append(", previewFile=");
        sb.append(this.f);
        sb.append(", licensedMusicInfo=");
        sb.append(this.g);
        sb.append(", stickers=");
        return ms9.a(')', sb, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e.name());
        parcel.writeSerializable(this.f);
        LicensedMusicInfo licensedMusicInfo = this.g;
        if (licensedMusicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            licensedMusicInfo.writeToParcel(parcel, i);
        }
        Iterator a2 = ao.a(parcel, this.h);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }

    public ClipsEncoderParameters(Timeline timeline, VideoOutputSettings videoOutputSettings, ClipEditorSizeParams clipEditorSizeParams, MediaQuality mediaQuality, File file, LicensedMusicInfo licensedMusicInfo, List list, int i, zcl zclVar) {
        this(timeline, videoOutputSettings, clipEditorSizeParams, mediaQuality, file, licensedMusicInfo, (i & 64) != 0 ? EmptyList.b : list);
    }
}
