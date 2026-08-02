package com.vk.voip.ui.prodstat.analytics.base.screen;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: VoipAnalyticsEventScreen.kt */
@vby
/* loaded from: classes7.dex */
public final class VoipAnalyticsEventScreen implements Parcelable {
    public static final Parcelable.Creator<VoipAnalyticsEventScreen> CREATOR = new a();
    public final String b;

    /* compiled from: VoipAnalyticsEventScreen.kt */
    public static final class a implements Parcelable.Creator<VoipAnalyticsEventScreen> {
        @Override // android.os.Parcelable.Creator
        public final VoipAnalyticsEventScreen createFromParcel(Parcel parcel) {
            return new VoipAnalyticsEventScreen(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoipAnalyticsEventScreen[] newArray(int i) {
            return new VoipAnalyticsEventScreen[i];
        }
    }

    public /* synthetic */ VoipAnalyticsEventScreen(String str) {
        this.b = str;
    }

    public static final /* synthetic */ VoipAnalyticsEventScreen a(String str) {
        return new VoipAnalyticsEventScreen(str);
    }

    public static final boolean b(String str) {
        return !epx.f(str, "");
    }

    public static String d(String str) {
        return air.b(')', "VoipAnalyticsEventScreen(screen=", str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VoipAnalyticsEventScreen) {
            return epx.f(this.b, ((VoipAnalyticsEventScreen) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return d(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
