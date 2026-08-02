package com.vk.antispam;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.zcl;

/* compiled from: SpammerModel.kt */
/* loaded from: classes14.dex */
public final class SpammerModel implements Parcelable {
    public static final Parcelable.Creator<SpammerModel> CREATOR = new a();
    public final String b;
    public final ImageList c;
    public final Peer d;
    public final Integer e;
    public final boolean f;

    /* compiled from: SpammerModel.kt */
    public static final class a implements Parcelable.Creator<SpammerModel> {
        @Override // android.os.Parcelable.Creator
        public final SpammerModel createFromParcel(Parcel parcel) {
            return new SpammerModel(parcel.readString(), (ImageList) parcel.readParcelable(SpammerModel.class.getClassLoader()), (Peer) parcel.readParcelable(SpammerModel.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpammerModel[] newArray(int i) {
            return new SpammerModel[i];
        }
    }

    public SpammerModel(String str, ImageList imageList, Peer peer, Integer num, boolean z) {
        this.b = str;
        this.c = imageList;
        this.d = peer;
        this.e = num;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpammerModel)) {
            return false;
        }
        SpammerModel spammerModel = (SpammerModel) obj;
        return epx.f(this.b, spammerModel.b) && epx.f(this.c, spammerModel.c) && epx.f(this.d, spammerModel.d) && epx.f(this.e, spammerModel.e) && this.f == spammerModel.f;
    }

    public final int hashCode() {
        int a2 = bh10.a(fw3.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d.b);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((a2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpammerModel(name=");
        sb.append(this.b);
        sb.append(", avatarImages=");
        sb.append(this.c);
        sb.append(", peer=");
        sb.append(this.d);
        sb.append(", forceBgColor=");
        sb.append(this.e);
        sb.append(", isNft=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ SpammerModel(String str, ImageList imageList, Peer peer, Integer num, boolean z, int i, zcl zclVar) {
        this(str, imageList, peer, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z);
    }
}
