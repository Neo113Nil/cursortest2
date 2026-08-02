package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.PrivacySetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: AlbumChooseState.kt */
/* loaded from: classes7.dex */
public final class VideoAlbumData implements Parcelable {
    public static final Parcelable.Creator<VideoAlbumData> CREATOR = new a();
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List<ImageSize> g;
    public final int h;
    public final int i;
    public final List<PrivacySetting.PrivacyRule> j;

    /* compiled from: AlbumChooseState.kt */
    public static final class a implements Parcelable.Creator<VideoAlbumData> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final VideoAlbumData createFromParcel(Parcel parcel) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            boolean z3 = false;
            boolean z4 = 1;
            if (parcel.readInt() != 0) {
                i = 0;
                z3 = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z4 = i;
            }
            if (parcel.readInt() != 0) {
                i2 = z ? 1 : 0;
                z2 = z;
            } else {
                i2 = z ? 1 : 0;
                z2 = i;
            }
            int readInt2 = parcel.readInt();
            int i3 = i2;
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i4 = i;
            while (i4 != readInt2) {
                i4 = bo.b(VideoAlbumData.class, parcel, arrayList2, i4, i3);
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(VideoAlbumData.class, parcel, arrayList3, i, i3);
                }
                arrayList = arrayList3;
            }
            return new VideoAlbumData(readInt, readString, z3, z4, z2, arrayList2, readInt3, readInt4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAlbumData[] newArray(int i) {
            return new VideoAlbumData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAlbumData(int i, String str, boolean z, boolean z2, boolean z3, List<ImageSize> list, int i2, int i3, List<? extends PrivacySetting.PrivacyRule> list2) {
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = list;
        this.h = i2;
        this.i = i3;
        this.j = list2;
    }

    public static VideoAlbumData a(VideoAlbumData videoAlbumData, boolean z) {
        int i = videoAlbumData.b;
        String str = videoAlbumData.c;
        boolean z2 = videoAlbumData.d;
        boolean z3 = videoAlbumData.e;
        List<ImageSize> list = videoAlbumData.g;
        int i2 = videoAlbumData.h;
        int i3 = videoAlbumData.i;
        List<PrivacySetting.PrivacyRule> list2 = videoAlbumData.j;
        videoAlbumData.getClass();
        return new VideoAlbumData(i, str, z2, z3, z, list, i2, i3, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAlbumData)) {
            return false;
        }
        VideoAlbumData videoAlbumData = (VideoAlbumData) obj;
        return this.b == videoAlbumData.b && epx.f(this.c, videoAlbumData.c) && this.d == videoAlbumData.d && this.e == videoAlbumData.e && this.f == videoAlbumData.f && epx.f(this.g, videoAlbumData.g) && this.h == videoAlbumData.h && this.i == videoAlbumData.i && epx.f(this.j, videoAlbumData.j);
    }

    public final int hashCode() {
        int a2 = shy.a(this.i, shy.a(this.h, fw3.a(qoy.b(qoy.b(qoy.b(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31);
        List<PrivacySetting.PrivacyRule> list = this.j;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAlbumData(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", isPrivate=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        sb.append(this.e);
        sb.append(", isSelected=");
        sb.append(this.f);
        sb.append(", images=");
        sb.append(this.g);
        sb.append(", updatedTime=");
        sb.append(this.h);
        sb.append(", videosCount=");
        sb.append(this.i);
        sb.append(", privacy=");
        return ms9.a(')', sb, this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.g);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        List<PrivacySetting.PrivacyRule> list = this.j;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }
}
