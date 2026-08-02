package com.vk.dto.clips.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDuetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.xq;
import xsna.zcl;

/* compiled from: ClipsEditorInputData.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorInputData implements Parcelable {
    public static final Parcelable.Creator<ClipsEditorInputData> CREATOR = new a();
    public final List<ClipsEditorInputVideoItem> b;
    public final ClipsEditorInputAudioItem c;
    public final List<List<ClipsEditorInputAudioItem>> d;
    public final boolean e;
    public final boolean f;
    public final ClipsDuetInfo g;
    public final int h;
    public final String i;
    public final boolean j;
    public final float k;

    /* compiled from: ClipsEditorInputData.kt */
    public static final class a implements Parcelable.Creator<ClipsEditorInputData> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEditorInputData createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ClipsEditorInputVideoItem.CREATOR.createFromParcel(parcel));
            }
            ClipsEditorInputAudioItem createFromParcel = parcel.readInt() == 0 ? null : ClipsEditorInputAudioItem.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(ClipsEditorInputAudioItem.CREATOR, parcel, arrayList3, i3, 1);
                }
                arrayList2.add(arrayList3);
            }
            return new ClipsEditorInputData(arrayList, createFromParcel, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? ClipsDuetInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEditorInputData[] newArray(int i) {
            return new ClipsEditorInputData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsEditorInputData(List<ClipsEditorInputVideoItem> list, ClipsEditorInputAudioItem clipsEditorInputAudioItem, List<? extends List<ClipsEditorInputAudioItem>> list2, boolean z, boolean z2, ClipsDuetInfo clipsDuetInfo, int i, String str, boolean z3, float f) {
        this.b = list;
        this.c = clipsEditorInputAudioItem;
        this.d = list2;
        this.e = z;
        this.f = z2;
        this.g = clipsDuetInfo;
        this.h = i;
        this.i = str;
        this.j = z3;
        this.k = f;
    }

    public static ClipsEditorInputData a(ClipsEditorInputData clipsEditorInputData, List list, ClipsEditorInputAudioItem clipsEditorInputAudioItem, List list2, boolean z, boolean z2, ClipsDuetInfo clipsDuetInfo, int i, String str, float f, int i2) {
        if ((i2 & 1) != 0) {
            list = clipsEditorInputData.b;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            clipsEditorInputAudioItem = clipsEditorInputData.c;
        }
        ClipsEditorInputAudioItem clipsEditorInputAudioItem2 = clipsEditorInputAudioItem;
        if ((i2 & 4) != 0) {
            list2 = clipsEditorInputData.d;
        }
        List list4 = list2;
        if ((i2 & 8) != 0) {
            z = clipsEditorInputData.e;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 16) != 0 ? clipsEditorInputData.f : z2;
        ClipsDuetInfo clipsDuetInfo2 = (i2 & 32) != 0 ? clipsEditorInputData.g : clipsDuetInfo;
        int i3 = (i2 & 64) != 0 ? clipsEditorInputData.h : i;
        String str2 = (i2 & 128) != 0 ? clipsEditorInputData.i : str;
        boolean z5 = clipsEditorInputData.j;
        float f2 = (i2 & 512) != 0 ? clipsEditorInputData.k : f;
        clipsEditorInputData.getClass();
        return new ClipsEditorInputData(list3, clipsEditorInputAudioItem2, list4, z3, z4, clipsDuetInfo2, i3, str2, z5, f2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorInputData)) {
            return false;
        }
        ClipsEditorInputData clipsEditorInputData = (ClipsEditorInputData) obj;
        return epx.f(this.b, clipsEditorInputData.b) && epx.f(this.c, clipsEditorInputData.c) && epx.f(this.d, clipsEditorInputData.d) && this.e == clipsEditorInputData.e && this.f == clipsEditorInputData.f && epx.f(this.g, clipsEditorInputData.g) && this.h == clipsEditorInputData.h && epx.f(this.i, clipsEditorInputData.i) && this.j == clipsEditorInputData.j && Float.compare(this.k, clipsEditorInputData.k) == 0;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ClipsEditorInputAudioItem clipsEditorInputAudioItem = this.c;
        int b = qoy.b(qoy.b(fw3.a((hashCode + (clipsEditorInputAudioItem == null ? 0 : clipsEditorInputAudioItem.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        ClipsDuetInfo clipsDuetInfo = this.g;
        int a2 = shy.a(this.h, (b + (clipsDuetInfo == null ? 0 : clipsDuetInfo.hashCode())) * 31, 31);
        String str = this.i;
        return Float.hashCode(this.k) + qoy.b((a2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorInputData(videoDataList=");
        sb.append(this.b);
        sb.append(", licencedMusic=");
        sb.append(this.c);
        sb.append(", audioItems=");
        sb.append(this.d);
        sb.append(", fromCamera=");
        sb.append(this.e);
        sb.append(", fromDraft=");
        sb.append(this.f);
        sb.append(", duetInfo=");
        sb.append(this.g);
        sb.append(", maxDurationMs=");
        sb.append(this.h);
        sb.append(", description=");
        sb.append(this.i);
        sb.append(", isCameraFullHd=");
        sb.append(this.j);
        sb.append(", aspectRatio=");
        return xq.c(')', this.k, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) a2.next();
            clipsEditorInputVideoItem.getClass();
            Serializer.StreamParcelable.a.a(clipsEditorInputVideoItem, parcel);
        }
        ClipsEditorInputAudioItem clipsEditorInputAudioItem = this.c;
        if (clipsEditorInputAudioItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsEditorInputAudioItem.writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.d);
        while (a3.hasNext()) {
            Iterator a4 = ao.a(parcel, (List) a3.next());
            while (a4.hasNext()) {
                ((ClipsEditorInputAudioItem) a4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        ClipsDuetInfo clipsDuetInfo = this.g;
        if (clipsDuetInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Serializer.StreamParcelable.a.a(clipsDuetInfo, parcel);
        }
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeFloat(this.k);
    }

    public ClipsEditorInputData(List list, ClipsEditorInputAudioItem clipsEditorInputAudioItem, List list2, boolean z, boolean z2, ClipsDuetInfo clipsDuetInfo, int i, String str, boolean z3, float f, int i2, zcl zclVar) {
        this(list, (i2 & 2) != 0 ? null : clipsEditorInputAudioItem, (i2 & 4) != 0 ? EmptyList.b : list2, z, z2, (i2 & 32) != 0 ? null : clipsDuetInfo, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? true : z3, (i2 & 512) != 0 ? 0.5625f : f);
    }
}
