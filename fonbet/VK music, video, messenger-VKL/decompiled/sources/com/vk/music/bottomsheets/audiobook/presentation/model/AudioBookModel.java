package com.vk.music.bottomsheets.audiobook.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import com.vk.dto.music.audiobook.AudioBookPerson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: AudioBookModel.kt */
/* loaded from: classes3.dex */
public final class AudioBookModel implements Parcelable {
    public static final Parcelable.Creator<AudioBookModel> CREATOR = new a();
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final Image f;
    public final String g;
    public final String h;
    public final List<AudioBookPerson> i;
    public final List<AudioBookPerson> j;
    public final int k;

    /* compiled from: AudioBookModel.kt */
    public static final class a implements Parcelable.Creator<AudioBookModel> {
        @Override // android.os.Parcelable.Creator
        public final AudioBookModel createFromParcel(Parcel parcel) {
            int i;
            int i2;
            int readInt = parcel.readInt();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
                i2 = 1;
            } else {
                i = 0;
                i2 = 1;
            }
            String readString = parcel.readString();
            int i3 = i2;
            String readString2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(AudioBookModel.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i4 = i;
            while (i4 != readInt2) {
                i4 = bo.b(AudioBookModel.class, parcel, arrayList, i4, i3);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(AudioBookModel.class, parcel, arrayList2, i, i3);
            }
            return new AudioBookModel(readInt, z, readString, readString2, image, readString3, readString4, arrayList, arrayList2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBookModel[] newArray(int i) {
            return new AudioBookModel[i];
        }
    }

    public AudioBookModel(int i, boolean z, String str, String str2, Image image, String str3, String str4, List<AudioBookPerson> list, List<AudioBookPerson> list2, int i2) {
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = image;
        this.g = str3;
        this.h = str4;
        this.i = list;
        this.j = list2;
        this.k = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookModel)) {
            return false;
        }
        AudioBookModel audioBookModel = (AudioBookModel) obj;
        return this.b == audioBookModel.b && this.c == audioBookModel.c && epx.f(this.d, audioBookModel.d) && epx.f(this.e, audioBookModel.e) && epx.f(this.f, audioBookModel.f) && epx.f(this.g, audioBookModel.g) && epx.f(this.h, audioBookModel.h) && epx.f(this.i, audioBookModel.i) && epx.f(this.j, audioBookModel.j) && this.k == audioBookModel.k;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        Image image = this.f;
        return Integer.hashCode(this.k) + fw3.a(fw3.a(urd0.a(urd0.a((a2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookModel(id=");
        sb.append(this.b);
        sb.append(", isExplicit=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", authors=");
        sb.append(this.e);
        sb.append(", coverImage=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", linkToShare=");
        sb.append(this.h);
        sb.append(", authorList=");
        sb.append(this.i);
        sb.append(", narratorList=");
        sb.append(this.j);
        sb.append(", flagsContextMask=");
        return vu5.b(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        Iterator a2 = ao.a(parcel, this.i);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.j);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeInt(this.k);
    }
}
