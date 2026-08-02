package com.blaze.blazesdk.features.videos.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import defpackage.u0a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final boolean a;
    public final boolean b;
    public final BlazeVideosPlaybackConfiguration.BlazeVideosPipConfiguration c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readInt() != 0, parcel.readInt() != 0, BlazeVideosPlaybackConfiguration.BlazeVideosPipConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public i(boolean z, boolean z2, @NotNull BlazeVideosPlaybackConfiguration.BlazeVideosPipConfiguration blazeVideosPipConfiguration) {
        blazeVideosPipConfiguration.getClass();
        this.a = z;
        this.b = z2;
        this.c = blazeVideosPipConfiguration;
    }

    public static i copy$default(i iVar, boolean z, boolean z2, BlazeVideosPlaybackConfiguration.BlazeVideosPipConfiguration blazeVideosPipConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            z = iVar.a;
        }
        if ((i & 2) != 0) {
            z2 = iVar.b;
        }
        if ((i & 4) != 0) {
            blazeVideosPipConfiguration = iVar.c;
        }
        iVar.getClass();
        blazeVideosPipConfiguration.getClass();
        return new i(z, z2, blazeVideosPipConfiguration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && Intrinsics.c(this.c, iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u0a.t(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        return "InternalVideosPlaybackConfiguration(isMultiAspectRatio=" + this.a + ", shouldOpenOnLandscape=" + this.b + ", pip=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
    }
}
