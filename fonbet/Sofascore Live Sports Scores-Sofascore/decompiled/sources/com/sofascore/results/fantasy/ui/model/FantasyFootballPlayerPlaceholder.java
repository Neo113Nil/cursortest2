package com.sofascore.results.fantasy.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.oz6;
import defpackage.rz6;
import defpackage.wd;
import defpackage.wv8;
import defpackage.yy6;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/fantasy/ui/model/FantasyFootballPlayerPlaceholder;", "Loz6;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyFootballPlayerPlaceholder implements oz6, Parcelable {

    @NotNull
    public static final Parcelable.Creator<FantasyFootballPlayerPlaceholder> CREATOR = new wd(14);
    public final rz6 a;
    public final yy6 b;
    public final int c;
    public final boolean d;
    public final int e;

    public FantasyFootballPlayerPlaceholder(rz6 rz6Var, yy6 yy6Var, int i, boolean z, int i2) {
        rz6Var.getClass();
        this.a = rz6Var;
        this.b = yy6Var;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    public static FantasyFootballPlayerPlaceholder b(FantasyFootballPlayerPlaceholder fantasyFootballPlayerPlaceholder, yy6 yy6Var, boolean z, int i) {
        rz6 rz6Var = fantasyFootballPlayerPlaceholder.a;
        if ((i & 2) != 0) {
            yy6Var = fantasyFootballPlayerPlaceholder.b;
        }
        yy6 yy6Var2 = yy6Var;
        int i2 = fantasyFootballPlayerPlaceholder.c;
        if ((i & 8) != 0) {
            z = fantasyFootballPlayerPlaceholder.d;
        }
        int i3 = fantasyFootballPlayerPlaceholder.e;
        rz6Var.getClass();
        return new FantasyFootballPlayerPlaceholder(rz6Var, yy6Var2, i2, z, i3);
    }

    @Override // defpackage.oz6
    /* renamed from: a, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyFootballPlayerPlaceholder)) {
            return false;
        }
        FantasyFootballPlayerPlaceholder fantasyFootballPlayerPlaceholder = (FantasyFootballPlayerPlaceholder) obj;
        return this.a == fantasyFootballPlayerPlaceholder.a && this.b == fantasyFootballPlayerPlaceholder.b && this.c == fantasyFootballPlayerPlaceholder.c && this.d == fantasyFootballPlayerPlaceholder.d && this.e == fantasyFootballPlayerPlaceholder.e;
    }

    @Override // defpackage.oz6
    /* renamed from: getId, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // defpackage.oz6
    /* renamed from: getOrder, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // defpackage.oz6
    /* renamed from: getPosition, reason: from getter */
    public final rz6 getA() {
        return this.a;
    }

    @Override // defpackage.oz6
    /* renamed from: getState, reason: from getter */
    public final yy6 getB() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yy6 yy6Var = this.b;
        return Integer.hashCode(this.e) + dmi.e(wv8.a(this.c, (hashCode + (yy6Var == null ? 0 : yy6Var.hashCode())) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyFootballPlayerPlaceholder(position=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", order=");
        sb.append(this.c);
        sb.append(", isDisabled=");
        sb.append(this.d);
        sb.append(", id=");
        return fc6.h(this.e, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        yy6 yy6Var = this.b;
        if (yy6Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yy6Var.name());
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
    }

    public /* synthetic */ FantasyFootballPlayerPlaceholder(rz6 rz6Var, int i) {
        this(rz6Var, null, i, false, -((rz6Var.ordinal() * 100) + i));
    }
}
