package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.header.HeaderTooltip;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: Description.kt */
/* loaded from: classes18.dex */
public final class Description implements Serializer.StreamParcelable {
    public static final Serializer.c<Description> CREATOR = new a();
    public final Text b;
    public final ImagePhoto c;
    public final HeaderAction d;
    public final HeaderTooltip e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Description> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Description a(Serializer serializer) {
            return new Description((Text) serializer.G(Text.class.getClassLoader()), (ImagePhoto) serializer.G(ImagePhoto.class.getClassLoader()), (HeaderAction) serializer.G(HeaderAction.class.getClassLoader()), (HeaderTooltip) serializer.G(HeaderTooltip.class.getClassLoader()), serializer.H(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Description[i];
        }
    }

    public Description(Text text, ImagePhoto imagePhoto, HeaderAction headerAction, HeaderTooltip headerTooltip, String str, boolean z, boolean z2, boolean z3) {
        this.b = text;
        this.c = imagePhoto;
        this.d = headerAction;
        this.e = headerTooltip;
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Description)) {
            return false;
        }
        Description description = (Description) obj;
        return epx.f(this.b, description.b) && epx.f(this.c, description.c) && epx.f(this.d, description.d) && epx.f(this.e, description.e) && epx.f(this.f, description.f) && this.g == description.g && this.h == description.h && this.i == description.i;
    }

    public final int hashCode() {
        Text text = this.b;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        ImagePhoto imagePhoto = this.c;
        int hashCode2 = (hashCode + (imagePhoto == null ? 0 : imagePhoto.hashCode())) * 31;
        HeaderAction headerAction = this.d;
        int hashCode3 = (hashCode2 + (headerAction == null ? 0 : headerAction.hashCode())) * 31;
        HeaderTooltip headerTooltip = this.e;
        int hashCode4 = (hashCode3 + (headerTooltip == null ? 0 : headerTooltip.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.i) + qoy.b(qoy.b((hashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Description(text=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", tooltip=");
        sb.append(this.e);
        sb.append(", accessibilityText=");
        sb.append(this.f);
        sb.append(", isAnimable=");
        sb.append(this.g);
        sb.append(", isAudio=");
        sb.append(this.h);
        sb.append(", isTrending=");
        return q0.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ Description(Text text, ImagePhoto imagePhoto, HeaderAction headerAction, HeaderTooltip headerTooltip, String str, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(text, imagePhoto, headerAction, headerTooltip, str, z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3);
    }
}
