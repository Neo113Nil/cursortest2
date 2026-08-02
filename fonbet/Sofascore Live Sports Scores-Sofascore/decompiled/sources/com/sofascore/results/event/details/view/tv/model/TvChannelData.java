package com.sofascore.results.event.details.view.tv.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.TvType;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.ljg;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/event/details/view/tv/model/TvChannelData;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TvChannelData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TvChannelData> CREATOR = new dyh(14);
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final List f;
    public final TvType g;

    public TvChannelData(int i, String str, long j, String str2, boolean z, List list, TvType tvType) {
        str.getClass();
        str2.getClass();
        tvType.getClass();
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = z;
        this.f = list;
        this.g = tvType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TvChannelData)) {
            return false;
        }
        TvChannelData tvChannelData = (TvChannelData) obj;
        return this.a == tvChannelData.a && Intrinsics.c(this.b, tvChannelData.b) && this.c == tvChannelData.c && Intrinsics.c(this.d, tvChannelData.d) && this.e == tvChannelData.e && Intrinsics.c(this.f, tvChannelData.f) && this.g == tvChannelData.g;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(ljg.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        return this.g.hashCode() + ((e + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TvChannelData(eventId=", ", statusType=", this.b, ", startTimestamp=");
        t.append(this.c);
        t.append(", channelName=");
        t.append(this.d);
        t.append(", hasBet365LiveStream=");
        t.append(this.e);
        t.append(", bet365ExcludedCountryCodes=");
        t.append(this.f);
        t.append(", tvType=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeStringList(this.f);
        parcel.writeString(this.g.name());
    }
}
