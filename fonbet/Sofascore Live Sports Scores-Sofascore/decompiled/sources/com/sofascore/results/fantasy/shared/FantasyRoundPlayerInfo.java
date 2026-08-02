package com.sofascore.results.fantasy.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.aj7;
import defpackage.bf3;
import defpackage.bj7;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.wd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/shared/FantasyRoundPlayerInfo;", "Landroid/os/Parcelable;", "Companion", "bj7", "aj7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundPlayerInfo implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final FantasyPlayerFixtureUiModel f;
    public final FantasyPlayerFixtureUiModel g;

    @NotNull
    public static final bj7 Companion = new bj7();

    @NotNull
    public static final Parcelable.Creator<FantasyRoundPlayerInfo> CREATOR = new wd(20);
    public static final FantasyRoundPlayerInfo h = new FantasyRoundPlayerInfo("", "", "", "", "", null, null);

    public /* synthetic */ FantasyRoundPlayerInfo(int i, String str, String str2, String str3, String str4, String str5, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, aj7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = fantasyPlayerFixtureUiModel;
        this.g = fantasyPlayerFixtureUiModel2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyRoundPlayerInfo)) {
            return false;
        }
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo = (FantasyRoundPlayerInfo) obj;
        return Intrinsics.c(this.a, fantasyRoundPlayerInfo.a) && Intrinsics.c(this.b, fantasyRoundPlayerInfo.b) && Intrinsics.c(this.c, fantasyRoundPlayerInfo.c) && Intrinsics.c(this.d, fantasyRoundPlayerInfo.d) && Intrinsics.c(this.e, fantasyRoundPlayerInfo.e) && Intrinsics.c(this.f, fantasyRoundPlayerInfo.f) && Intrinsics.c(this.g, fantasyRoundPlayerInfo.g);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = this.f;
        int hashCode = (c + (fantasyPlayerFixtureUiModel == null ? 0 : fantasyPlayerFixtureUiModel.hashCode())) * 31;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = this.g;
        return hashCode + (fantasyPlayerFixtureUiModel2 != null ? fantasyPlayerFixtureUiModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("FantasyRoundPlayerInfo(fixtures=", this.a, ", price=", this.b, ", averagePoints=");
        bf3.v(s, this.c, ", expectedPoints=", this.d, ", upcomingFixtureTime=");
        s.append(this.e);
        s.append(", upcomingFixture=");
        s.append(this.f);
        s.append(", singleRoundFixture=");
        s.append(this.g);
        s.append(")");
        return s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = this.f;
        if (fantasyPlayerFixtureUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fantasyPlayerFixtureUiModel.writeToParcel(parcel, i);
        }
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = this.g;
        if (fantasyPlayerFixtureUiModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fantasyPlayerFixtureUiModel2.writeToParcel(parcel, i);
        }
    }

    public FantasyRoundPlayerInfo(String str, String str2, String str3, String str4, String str5, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = fantasyPlayerFixtureUiModel;
        this.g = fantasyPlayerFixtureUiModel2;
    }
}
