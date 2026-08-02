package com.vk.clips.upload.vk.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipsUploadScreenStaticConfig.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadScreenStaticConfig implements Parcelable {
    public static final Parcelable.Creator<ClipsUploadScreenStaticConfig> CREATOR = new a();
    public static final ClipsUploadScreenStaticConfig m = new ClipsUploadScreenStaticConfig(false, false, false, false, false, false, false, false, false, false, false, 2047, null);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    /* compiled from: ClipsUploadScreenStaticConfig.kt */
    public static final class a implements Parcelable.Creator<ClipsUploadScreenStaticConfig> {
        @Override // android.os.Parcelable.Creator
        public final ClipsUploadScreenStaticConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z10 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            if (parcel.readInt() != 0) {
                z5 = z3;
                z3 = z4;
            } else {
                z5 = z3;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z5;
            }
            if (parcel.readInt() != 0) {
                z7 = z5;
                z5 = z6;
            } else {
                z7 = z5;
            }
            if (parcel.readInt() != 0) {
                z8 = z6;
            } else {
                z8 = z6;
                z6 = z7;
            }
            if (parcel.readInt() != 0) {
                z9 = z7;
                z7 = z8;
            } else {
                z9 = z7;
            }
            if (parcel.readInt() == 0) {
                z8 = z9;
            }
            return new ClipsUploadScreenStaticConfig(z12, z10, z11, z, z2, z3, z4, z5, z6, z7, z8);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadScreenStaticConfig[] newArray(int i) {
            return new ClipsUploadScreenStaticConfig[i];
        }
    }

    public ClipsUploadScreenStaticConfig() {
        this(false, false, false, false, false, false, false, false, false, false, false, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsUploadScreenStaticConfig)) {
            return false;
        }
        ClipsUploadScreenStaticConfig clipsUploadScreenStaticConfig = (ClipsUploadScreenStaticConfig) obj;
        return this.b == clipsUploadScreenStaticConfig.b && this.c == clipsUploadScreenStaticConfig.c && this.d == clipsUploadScreenStaticConfig.d && this.e == clipsUploadScreenStaticConfig.e && this.f == clipsUploadScreenStaticConfig.f && this.g == clipsUploadScreenStaticConfig.g && this.h == clipsUploadScreenStaticConfig.h && this.i == clipsUploadScreenStaticConfig.i && this.j == clipsUploadScreenStaticConfig.j && this.k == clipsUploadScreenStaticConfig.k && this.l == clipsUploadScreenStaticConfig.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadScreenStaticConfig(showCanSaveDraft=");
        sb.append(this.b);
        sb.append(", showAddToPlaylistButton=");
        sb.append(this.c);
        sb.append(", showAddMarketProductButton=");
        sb.append(this.d);
        sb.append(", showEditPublicationTimeButton=");
        sb.append(this.e);
        sb.append(", showEasyPromote=");
        sb.append(this.f);
        sb.append(", showTrendingHashtags=");
        sb.append(this.g);
        sb.append(", showTrendsLanding=");
        sb.append(this.h);
        sb.append(", publishOnlyFromGroups=");
        sb.append(this.i);
        sb.append(", autoRepostToStory=");
        sb.append(this.j);
        sb.append(", broadcastEventOnDraftSavedByUser=");
        sb.append(this.k);
        sb.append(", openChannelFromClip=");
        return q0.a(sb, this.l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public ClipsUploadScreenStaticConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
    }

    public /* synthetic */ ClipsUploadScreenStaticConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? true : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? true : z9, (i & 512) != 0 ? true : z10, (i & 1024) != 0 ? true : z11);
    }
}
