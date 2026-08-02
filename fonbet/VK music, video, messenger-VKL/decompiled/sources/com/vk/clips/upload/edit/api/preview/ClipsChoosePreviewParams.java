package com.vk.clips.upload.edit.api.preview;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.models.VideoUrlPack;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.nr;
import xsna.zcl;

/* compiled from: ClipsChoosePreviewParams.kt */
/* loaded from: classes17.dex */
public final class ClipsChoosePreviewParams implements Parcelable {
    public static final Parcelable.Creator<ClipsChoosePreviewParams> CREATOR = new a();
    public final VideoUrlPack b;
    public final Uri c;
    public final int d;
    public final int e;
    public final long f;
    public final Integer g;
    public final PreviewThumbs h;
    public final Timeline i;
    public final List<ISerializableStickerSDK> j;

    /* compiled from: ClipsChoosePreviewParams.kt */
    public static final class a implements Parcelable.Creator<ClipsChoosePreviewParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsChoosePreviewParams createFromParcel(Parcel parcel) {
            VideoUrlPack videoUrlPack = (VideoUrlPack) parcel.readParcelable(ClipsChoosePreviewParams.class.getClassLoader());
            Uri uri = (Uri) parcel.readParcelable(ClipsChoosePreviewParams.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            long readLong = parcel.readLong();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PreviewThumbs createFromParcel = parcel.readInt() != 0 ? PreviewThumbs.CREATOR.createFromParcel(parcel) : null;
            Timeline timeline = (Timeline) parcel.readParcelable(ClipsChoosePreviewParams.class.getClassLoader());
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(ClipsChoosePreviewParams.class, parcel, arrayList, i, 1);
            }
            return new ClipsChoosePreviewParams(videoUrlPack, uri, readInt, readInt2, readLong, valueOf, createFromParcel, timeline, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsChoosePreviewParams[] newArray(int i) {
            return new ClipsChoosePreviewParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsChoosePreviewParams(VideoUrlPack videoUrlPack, Uri uri, int i, int i2, long j, Integer num, PreviewThumbs previewThumbs, Timeline timeline, List<? extends ISerializableStickerSDK> list) {
        this.b = videoUrlPack;
        this.c = uri;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = num;
        this.h = previewThumbs;
        this.i = timeline;
        this.j = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        PreviewThumbs previewThumbs = this.h;
        if (previewThumbs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            previewThumbs.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.i, i);
        Iterator a2 = ao.a(parcel, this.j);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }

    public ClipsChoosePreviewParams(VideoUrlPack videoUrlPack, Uri uri, int i, int i2, long j, Integer num, PreviewThumbs previewThumbs, Timeline timeline, List list, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? null : videoUrlPack, (i3 & 2) != 0 ? null : uri, i, i2, j, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : previewThumbs, (i3 & 128) != 0 ? null : timeline, (i3 & 256) != 0 ? EmptyList.b : list);
    }
}
