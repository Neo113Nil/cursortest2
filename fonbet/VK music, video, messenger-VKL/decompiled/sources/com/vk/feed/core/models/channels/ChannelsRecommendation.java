package com.vk.feed.core.models.channels;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: ChannelsRecommendation.kt */
/* loaded from: classes18.dex */
public final class ChannelsRecommendation implements Serializer.StreamParcelable {
    public static final Serializer.c<ChannelsRecommendation> CREATOR = new a();
    public final long b;
    public final String c;
    public final Image d;
    public final String e;
    public final String f;
    public boolean g;
    public boolean h;

    /* compiled from: ChannelsRecommendation.kt */
    public static final class a extends Serializer.c<ChannelsRecommendation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChannelsRecommendation a(Serializer serializer) {
            return new ChannelsRecommendation(serializer.w(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChannelsRecommendation[i];
        }
    }

    public ChannelsRecommendation(long j, String str, Image image, String str2, String str3, boolean z, boolean z2) {
        this.b = j;
        this.c = str;
        this.d = image;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsRecommendation)) {
            return false;
        }
        ChannelsRecommendation channelsRecommendation = (ChannelsRecommendation) obj;
        return this.b == channelsRecommendation.b && epx.f(this.c, channelsRecommendation.c) && epx.f(this.d, channelsRecommendation.d) && epx.f(this.e, channelsRecommendation.e) && epx.f(this.f, channelsRecommendation.f) && this.g == channelsRecommendation.g && this.h == channelsRecommendation.h;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.d;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.h) + qoy.b((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsRecommendation(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", isMember=");
        sb.append(this.g);
        sb.append(", isJoinInProgress=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
