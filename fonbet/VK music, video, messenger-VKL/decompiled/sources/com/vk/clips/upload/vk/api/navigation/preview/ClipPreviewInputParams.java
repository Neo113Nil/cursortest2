package com.vk.clips.upload.vk.api.navigation.preview;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.zcl;

/* compiled from: ClipPreviewInputParams.kt */
/* loaded from: classes17.dex */
public final class ClipPreviewInputParams implements Parcelable {
    public static final Parcelable.Creator<ClipPreviewInputParams> CREATOR = new a();
    public final Timeline b;
    public final List<ISerializableStickerSDK> c;
    public final Size d;
    public final String e;
    public final boolean f;
    public final boolean g;

    /* compiled from: ClipPreviewInputParams.kt */
    public static final class a implements Parcelable.Creator<ClipPreviewInputParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipPreviewInputParams createFromParcel(Parcel parcel) {
            Timeline timeline = (Timeline) parcel.readParcelable(ClipPreviewInputParams.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ClipPreviewInputParams.class, parcel, arrayList, i, 1);
            }
            return new ClipPreviewInputParams(timeline, arrayList, parcel.readSize(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipPreviewInputParams[] newArray(int i) {
            return new ClipPreviewInputParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipPreviewInputParams(Timeline timeline, List<? extends ISerializableStickerSDK> list, Size size, String str, boolean z, boolean z2) {
        this.b = timeline;
        this.c = list;
        this.d = size;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeSize(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ ClipPreviewInputParams(Timeline timeline, List list, Size size, String str, boolean z, boolean z2, int i, zcl zclVar) {
        this(timeline, list, size, str, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }
}
