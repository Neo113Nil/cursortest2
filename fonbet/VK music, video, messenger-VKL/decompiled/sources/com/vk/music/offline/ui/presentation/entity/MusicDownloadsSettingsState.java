package com.vk.music.offline.ui.presentation.entity;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.lm50;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MusicDownloadsSettingsState.kt */
/* loaded from: classes3.dex */
public final class MusicDownloadsSettingsState implements lm50, Parcelable {
    public static final Parcelable.Creator<MusicDownloadsSettingsState> CREATOR = new a();
    public final boolean b;
    public final long c;

    /* compiled from: MusicDownloadsSettingsState.kt */
    public static final class a implements Parcelable.Creator<MusicDownloadsSettingsState> {
        @Override // android.os.Parcelable.Creator
        public final MusicDownloadsSettingsState createFromParcel(Parcel parcel) {
            return new MusicDownloadsSettingsState(parcel.readInt() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicDownloadsSettingsState[] newArray(int i) {
            return new MusicDownloadsSettingsState[i];
        }
    }

    public MusicDownloadsSettingsState() {
        this(false, 0L, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDownloadsSettingsState)) {
            return false;
        }
        MusicDownloadsSettingsState musicDownloadsSettingsState = (MusicDownloadsSettingsState) obj;
        return this.b == musicDownloadsSettingsState.b && this.c == musicDownloadsSettingsState.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDownloadsSettingsState(isMobileNetworkDownloadEnabled=");
        sb.append(this.b);
        sb.append(", downloadsSizeBytes=");
        return vu5.a(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
    }

    public MusicDownloadsSettingsState(boolean z, long j) {
        this.b = z;
        this.c = j;
    }

    public /* synthetic */ MusicDownloadsSettingsState(boolean z, long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
