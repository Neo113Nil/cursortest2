package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.statistics.PlayerHand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class pl0 {

    @NotNull
    public static final ol0 Companion = new ol0();
    public static final joa[] k;
    public final int a;
    public final String b;
    public final BaseballInningInfo c;
    public final String d;
    public final BaseballActionOutcome e;
    public final int f;
    public final int g;
    public final PlayerHand h;
    public final Float i;
    public final Float j;

    static {
        ysa ysaVar = ysa.b;
        k = new joa[]{null, null, null, null, ypa.a(ysaVar, new st(23)), null, null, ypa.a(ysaVar, new st(24)), null, null};
    }

    public /* synthetic */ pl0(int i, int i2, String str, BaseballInningInfo baseballInningInfo, String str2, BaseballActionOutcome baseballActionOutcome, int i3, int i4, PlayerHand playerHand, Float f, Float f2) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, nl0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = baseballInningInfo;
        this.d = str2;
        this.e = baseballActionOutcome;
        this.f = i3;
        this.g = i4;
        this.h = playerHand;
        this.i = f;
        this.j = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl0)) {
            return false;
        }
        pl0 pl0Var = (pl0) obj;
        return this.a == pl0Var.a && Intrinsics.c(this.b, pl0Var.b) && Intrinsics.c(this.c, pl0Var.c) && Intrinsics.c(this.d, pl0Var.d) && this.e == pl0Var.e && this.f == pl0Var.f && this.g == pl0Var.g && this.h == pl0Var.h && Intrinsics.c(this.i, pl0Var.i) && Intrinsics.c(this.j, pl0Var.j);
    }

    public final int hashCode() {
        int a = wv8.a(this.g, wv8.a(this.f, (this.e.hashCode() + dmi.c((this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31), 31);
        PlayerHand playerHand = this.h;
        int hashCode = (a + (playerHand == null ? 0 : playerHand.hashCode())) * 31;
        Float f = this.i;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.j;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "AtBatInfo(teamId=", ", teamDisplayName=", this.b, ", inningInfo=");
        t.append(this.c);
        t.append(", commentText=");
        t.append(this.d);
        t.append(", actionOutcome=");
        t.append(this.e);
        t.append(", homeScore=");
        t.append(this.f);
        t.append(", awayScore=");
        t.append(this.g);
        t.append(", hitterHand=");
        t.append(this.h);
        t.append(", winProbability=");
        t.append(this.i);
        t.append(", winProbabilityChange=");
        t.append(this.j);
        t.append(")");
        return t.toString();
    }

    public pl0(int i, String str, BaseballInningInfo baseballInningInfo, String str2, BaseballActionOutcome baseballActionOutcome, int i2, int i3, PlayerHand playerHand, Float f, Float f2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = baseballInningInfo;
        this.d = str2;
        this.e = baseballActionOutcome;
        this.f = i2;
        this.g = i3;
        this.h = playerHand;
        this.i = f;
        this.j = f2;
    }
}
