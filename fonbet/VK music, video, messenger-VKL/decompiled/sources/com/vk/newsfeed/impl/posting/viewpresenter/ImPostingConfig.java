package com.vk.newsfeed.impl.posting.viewpresenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ImPostingConfig.kt */
/* loaded from: classes4.dex */
public final class ImPostingConfig implements Parcelable {
    public static final Parcelable.Creator<ImPostingConfig> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    /* compiled from: ImPostingConfig.kt */
    public static final class a implements Parcelable.Creator<ImPostingConfig> {
        @Override // android.os.Parcelable.Creator
        public final ImPostingConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
                z4 = z;
            } else {
                z3 = z;
                z4 = z2;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z4;
            }
            return new ImPostingConfig(z7, z5, z6, z, readString, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final ImPostingConfig[] newArray(int i) {
            return new ImPostingConfig[i];
        }
    }

    public ImPostingConfig(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImPostingConfig)) {
            return false;
        }
        ImPostingConfig imPostingConfig = (ImPostingConfig) obj;
        return this.b == imPostingConfig.b && this.c == imPostingConfig.c && this.d == imPostingConfig.d && this.e == imPostingConfig.e && epx.f(this.f, imPostingConfig.f) && this.g == imPostingConfig.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + urd0.a(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImPostingConfig(isChannelsMethodsEnabled=");
        sb.append(this.b);
        sb.append(", isPostingRedesign=");
        sb.append(this.c);
        sb.append(", isOuterLinkAttach=");
        sb.append(this.d);
        sb.append(", isSuggestedHashTags=");
        sb.append(this.e);
        sb.append(", forcedLayout=");
        sb.append(this.f);
        sb.append(", cropZoomEnable=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
