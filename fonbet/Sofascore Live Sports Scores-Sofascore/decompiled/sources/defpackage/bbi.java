package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class bbi implements Serializable {

    @NotNull
    public static final zai Companion = new zai();
    public static final joa[] l;
    public final int a;
    public final String b;
    public final StandingsTableRow c;
    public abi d;
    public cai e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;

    static {
        ysa ysaVar = ysa.b;
        l = new joa[]{null, null, null, ypa.a(ysaVar, new u9i(21)), ypa.a(ysaVar, new u9i(22)), ypa.a(ysaVar, new u9i(23)), ypa.a(ysaVar, new u9i(24)), null, null, null, null};
    }

    public /* synthetic */ bbi(int i, int i2, String str, StandingsTableRow standingsTableRow, abi abiVar, cai caiVar, List list, List list2, boolean z, boolean z2, int i3, boolean z3) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, yai.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = standingsTableRow;
        this.d = abiVar;
        this.e = caiVar;
        this.f = list;
        this.g = list2;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
        if ((i & 512) == 0) {
            this.j = -1;
        } else {
            this.j = i3;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z3;
        }
    }

    public static bbi a(bbi bbiVar, boolean z, int i) {
        int i2 = bbiVar.a;
        String str = bbiVar.b;
        StandingsTableRow standingsTableRow = bbiVar.c;
        abi abiVar = bbiVar.d;
        cai caiVar = bbiVar.e;
        List list = bbiVar.f;
        List list2 = bbiVar.g;
        boolean z2 = bbiVar.h;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z = bbiVar.i;
        }
        bbiVar.getClass();
        str.getClass();
        standingsTableRow.getClass();
        abiVar.getClass();
        caiVar.getClass();
        list.getClass();
        list2.getClass();
        return new bbi(i2, str, standingsTableRow, abiVar, caiVar, list, list2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbi)) {
            return false;
        }
        bbi bbiVar = (bbi) obj;
        return this.a == bbiVar.a && Intrinsics.c(this.b, bbiVar.b) && Intrinsics.c(this.c, bbiVar.c) && this.d == bbiVar.d && this.e == bbiVar.e && Intrinsics.c(this.f, bbiVar.f) && Intrinsics.c(this.g, bbiVar.g) && this.h == bbiVar.h && this.i == bbiVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + dmi.e(dmi.d(dmi.d((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        abi abiVar = this.d;
        cai caiVar = this.e;
        StringBuilder t = dmi.t(this.a, "StandingsTeamRow(tableId=", ", sport=", this.b, ", row=");
        t.append(this.c);
        t.append(", teamIndicator=");
        t.append(abiVar);
        t.append(", viewMode=");
        t.append(caiVar);
        t.append(", fullColumns=");
        t.append(this.f);
        t.append(", shortColumns=");
        t.append(this.g);
        t.append(", isHomeOrAway=");
        t.append(this.h);
        t.append(", isLastPromotion=");
        return wt3.p(t, this.i, ")");
    }

    public bbi(int i, String str, StandingsTableRow standingsTableRow, abi abiVar, cai caiVar, List list, List list2, boolean z, boolean z2) {
        str.getClass();
        standingsTableRow.getClass();
        list.getClass();
        list2.getClass();
        this.a = i;
        this.b = str;
        this.c = standingsTableRow;
        this.d = abiVar;
        this.e = caiVar;
        this.f = list;
        this.g = list2;
        this.h = z;
        this.i = z2;
        this.j = -1;
    }

    public /* synthetic */ bbi(int i, String str, StandingsTableRow standingsTableRow, abi abiVar, cai caiVar, List list, List list2, boolean z, int i2) {
        this(i, str, standingsTableRow, abiVar, caiVar, list, list2, (i2 & 128) != 0 ? false : z, false);
    }
}
