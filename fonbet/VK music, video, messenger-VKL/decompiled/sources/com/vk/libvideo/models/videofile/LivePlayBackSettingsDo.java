package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.bh10;
import xsna.qoy;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class LivePlayBackSettingsDo implements Parcelable {
    public static final Parcelable.Creator<LivePlayBackSettingsDo> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<LivePlayBackSettingsDo> {
        @Override // android.os.Parcelable.Creator
        public final LivePlayBackSettingsDo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            return new LivePlayBackSettingsDo(z5, z3, z4, parcel.readLong(), parcel.readInt() != 0 ? z2 : z);
        }

        @Override // android.os.Parcelable.Creator
        public final LivePlayBackSettingsDo[] newArray(int i) {
            return new LivePlayBackSettingsDo[i];
        }
    }

    public LivePlayBackSettingsDo(boolean z, boolean z2, boolean z3, long j, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = z4;
    }

    public final boolean d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePlayBackSettingsDo)) {
            return false;
        }
        LivePlayBackSettingsDo livePlayBackSettingsDo = (LivePlayBackSettingsDo) obj;
        return this.b == livePlayBackSettingsDo.b && this.c == livePlayBackSettingsDo.c && this.d == livePlayBackSettingsDo.d && this.e == livePlayBackSettingsDo.e && this.f == livePlayBackSettingsDo.f;
    }

    public final long f() {
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + bh10.a(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final boolean i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LivePlayBackSettingsDo(endless=");
        sb.append(this.b);
        sb.append(", canRewind=");
        sb.append(this.c);
        sb.append(", isClipsLive=");
        sb.append(this.d);
        sb.append(", maxDurationSeekMs=");
        sb.append(this.e);
        sb.append(", showChat=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
