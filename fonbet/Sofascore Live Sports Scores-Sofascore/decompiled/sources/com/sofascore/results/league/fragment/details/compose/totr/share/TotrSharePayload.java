package com.sofascore.results.league.fragment.details.compose.totr.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.me4;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/details/compose/totr/share/TotrSharePayload;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TotrSharePayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TotrSharePayload> CREATOR = new dyh(12);
    public final TeamOfTheWeekFieldUIData a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public TotrSharePayload(TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, int i3, int i4) {
        teamOfTheWeekFieldUIData.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        me4.p(str5, str6, str7);
        this.a = teamOfTheWeekFieldUIData;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = i3;
        this.l = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotrSharePayload)) {
            return false;
        }
        TotrSharePayload totrSharePayload = (TotrSharePayload) obj;
        return Intrinsics.c(this.a, totrSharePayload.a) && Intrinsics.c(this.b, totrSharePayload.b) && Intrinsics.c(this.c, totrSharePayload.c) && Intrinsics.c(this.d, totrSharePayload.d) && this.e == totrSharePayload.e && this.f == totrSharePayload.f && Intrinsics.c(this.g, totrSharePayload.g) && Intrinsics.c(this.h, totrSharePayload.h) && Intrinsics.c(this.i, totrSharePayload.i) && Intrinsics.c(this.j, totrSharePayload.j) && this.k == totrSharePayload.k && this.l == totrSharePayload.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + wv8.a(this.k, dmi.c(dmi.c(dmi.c(dmi.c(wv8.a(this.f, wv8.a(this.e, dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotrSharePayload(fieldData=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tournamentName=");
        bf3.v(sb, this.c, ", bannerSubtitle=", this.d, ", uniqueTournamentId=");
        me4.q(sb, this.e, ", tournamentId=", this.f, ", analyticsCategory=");
        bf3.v(sb, this.g, ", sportSlug=", this.h, ", categorySlug=");
        bf3.v(sb, this.i, ", tournamentSlug=", this.j, ", seasonId=");
        return me4.i(sb, this.k, ", periodId=", this.l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
    }
}
