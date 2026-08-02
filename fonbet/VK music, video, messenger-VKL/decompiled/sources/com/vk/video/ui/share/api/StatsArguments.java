package com.vk.video.ui.share.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.zcl;

/* compiled from: VideoShareArguments.kt */
/* loaded from: classes7.dex */
public final class StatsArguments implements Parcelable {
    public static final Parcelable.Creator<StatsArguments> CREATOR = new a();
    public final ShareItemType b;
    public final long c;
    public final long d;
    public final String e;
    public final ScreenMode f;
    public final ShareSource g;

    /* compiled from: VideoShareArguments.kt */
    public static final class a implements Parcelable.Creator<StatsArguments> {
        @Override // android.os.Parcelable.Creator
        public final StatsArguments createFromParcel(Parcel parcel) {
            return new StatsArguments(ShareItemType.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : ScreenMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? ShareSource.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsArguments[] newArray(int i) {
            return new StatsArguments[i];
        }
    }

    public StatsArguments(ShareItemType shareItemType, long j, long j2, String str, ScreenMode screenMode, ShareSource shareSource) {
        this.b = shareItemType;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = screenMode;
        this.g = shareSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsArguments)) {
            return false;
        }
        StatsArguments statsArguments = (StatsArguments) obj;
        return this.b == statsArguments.b && this.c == statsArguments.c && this.d == statsArguments.d && epx.f(this.e, statsArguments.e) && this.f == statsArguments.f && this.g == statsArguments.g;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        ScreenMode screenMode = this.f;
        int hashCode2 = (hashCode + (screenMode == null ? 0 : screenMode.hashCode())) * 31;
        ShareSource shareSource = this.g;
        return hashCode2 + (shareSource != null ? shareSource.hashCode() : 0);
    }

    public final String toString() {
        return "StatsArguments(shareItemType=" + this.b + ", ownerId=" + this.c + ", itemId=" + this.d + ", trackCode=" + this.e + ", screenMode=" + this.f + ", shareSource=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        ScreenMode screenMode = this.f;
        if (screenMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenMode.name());
        }
        ShareSource shareSource = this.g;
        if (shareSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareSource.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StatsArguments(ShareItemType shareItemType, long j, long j2, String str, ScreenMode screenMode, ShareSource shareSource, int i, zcl zclVar) {
        this(shareItemType, j, j2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : screenMode, (i & 32) != 0 ? null : shareSource);
    }
}
