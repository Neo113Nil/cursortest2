package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: TooltipsData.kt */
/* loaded from: classes17.dex */
public final class TooltipsData implements Parcelable {
    public static final Parcelable.Creator<TooltipsData> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;

    /* compiled from: TooltipsData.kt */
    public static final class a implements Parcelable.Creator<TooltipsData> {
        @Override // android.os.Parcelable.Creator
        public final TooltipsData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z6 = false;
            boolean z7 = true;
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
                z4 = z;
            } else {
                z3 = z;
                z4 = z2;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = z3;
                z3 = z4;
            } else {
                z5 = z3;
            }
            if (parcel.readInt() == 0) {
                z4 = z5;
            }
            return new TooltipsData(readString, readString2, z8, z6, z7, z, readString3, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final TooltipsData[] newArray(int i) {
            return new TooltipsData[i];
        }
    }

    public TooltipsData() {
        this(null, null, false, false, false, false, null, false, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public static TooltipsData a(TooltipsData tooltipsData, int i) {
        String str = (i & 1) != 0 ? tooltipsData.b : null;
        String str2 = tooltipsData.c;
        boolean z = (i & 4) != 0 ? tooltipsData.d : false;
        boolean z2 = (i & 8) != 0 ? tooltipsData.e : false;
        boolean z3 = (i & 16) != 0 ? tooltipsData.f : false;
        boolean z4 = (i & 32) != 0 ? tooltipsData.g : false;
        String str3 = (i & 64) != 0 ? tooltipsData.h : null;
        boolean z5 = tooltipsData.i;
        boolean z6 = (i & 256) != 0 ? tooltipsData.j : false;
        tooltipsData.getClass();
        return new TooltipsData(str, str2, z, z2, z3, z4, str3, z5, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipsData)) {
            return false;
        }
        TooltipsData tooltipsData = (TooltipsData) obj;
        return epx.f(this.b, tooltipsData.b) && epx.f(this.c, tooltipsData.c) && this.d == tooltipsData.d && this.e == tooltipsData.e && this.f == tooltipsData.f && this.g == tooltipsData.g && epx.f(this.h, tooltipsData.h) && this.i == tooltipsData.i && this.j == tooltipsData.j;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str3 = this.h;
        return Boolean.hashCode(this.j) + qoy.b((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipsData(coauthorsTooltipText=");
        sb.append(this.b);
        sb.append(", newBcPostingOnboardingTooltipText=");
        sb.append(this.c);
        sb.append(", showEasyPromoteTooltip=");
        sb.append(this.d);
        sb.append(", showCtaMessageToBCTooltip=");
        sb.append(this.e);
        sb.append(", showCtaOnlineBookingTooltip=");
        sb.append(this.f);
        sb.append(", showCtaOpenChannelTooltip=");
        sb.append(this.g);
        sb.append(", trendingHashtagsBadgeTooltipText=");
        sb.append(this.h);
        sb.append(", mayShowPostingRedirectTooltip=");
        sb.append(this.i);
        sb.append(", showCtaDonutTooltip=");
        return q0.a(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public TooltipsData(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, boolean z5, boolean z6) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str3;
        this.i = z5;
        this.j = z6;
    }

    public /* synthetic */ TooltipsData(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, boolean z5, boolean z6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6);
    }
}
