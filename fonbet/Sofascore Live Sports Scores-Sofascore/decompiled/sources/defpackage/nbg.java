package defpackage;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nbg {
    public final mcg a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final mbg l;
    public final lbg m;

    public nbg(mcg mcgVar, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, mbg mbgVar, lbg lbgVar, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        boolean z8 = (i3 & 16) == 0;
        z2 = (i3 & 32) != 0 ? false : z2;
        boolean z9 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z5;
        boolean z10 = (i3 & 512) != 0 ? false : z6;
        boolean z11 = (i3 & 1024) == 0 ? z7 : false;
        this.a = mcgVar;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = z8;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = mbgVar;
        this.m = lbgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbg)) {
            return false;
        }
        nbg nbgVar = (nbg) obj;
        return this.a == nbgVar.a && this.b == nbgVar.b && this.c == nbgVar.c && this.d == nbgVar.d && this.e == nbgVar.e && this.f == nbgVar.f && this.g == nbgVar.g && this.h == nbgVar.h && this.i == nbgVar.i && this.j == nbgVar.j && this.k == nbgVar.k && this.l == nbgVar.l && this.m == nbgVar.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(wv8.a(this.d, wv8.a(this.c, dmi.e(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SASAdRendererConfiguration(mraidPlacementType=");
        sb.append(this.a);
        sb.append(", isCallToActionEnabled=");
        sb.append(this.b);
        sb.append(", closeButtonCountDownDuration=");
        me4.q(sb, this.c, ", durationBeforeAutoClose=", this.d, ", isProgressBarEnabled=");
        vxd.t(", isFullscreenButtonEnabled=", ", isSoundIndicatorEnabled=", sb, this.e, this.f);
        vxd.t(", isMuteButtonEnabled=", ", autoCloseWhenVideoEnds=", sb, this.g, this.h);
        vxd.t(", loopWhenVideoEnds=", ", redirectOnFirstClick=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", skippableMode=");
        sb.append(this.l);
        sb.append(", customerFeedbackButtonVisibility=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
