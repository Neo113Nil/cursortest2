package androidx.media3.exoplayer.hls;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ad9;
import defpackage.cp4;
import defpackage.dad;
import defpackage.dti;
import defpackage.fp4;
import defpackage.h6c;
import defpackage.hd9;
import defpackage.it7;
import defpackage.kc5;
import defpackage.oe4;
import defpackage.pp4;
import defpackage.qcc;
import defpackage.sx2;
import defpackage.tnf;
import defpackage.tp4;
import defpackage.vcc;
import defpackage.zic;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements qcc {
    public final dad a;
    public pp4 b;
    public zic c;
    public final sx2 i = new sx2(7, false);
    public final dti f = new dti(20);
    public final cp4 g = tp4.t;
    public final it7 j = new it7(21);
    public final tnf h = new tnf(20);
    public final int l = 1;
    public final long m = C.TIME_UNSET;
    public final boolean k = true;
    public int e = 3;
    public boolean d = true;

    public HlsMediaSource$Factory(oe4 oe4Var) {
        this.a = new dad(oe4Var, 19);
    }

    @Override // defpackage.qcc
    public final vcc a(h6c h6cVar) {
        h6cVar.b.getClass();
        pp4 pp4Var = this.b;
        if (pp4Var == null) {
            pp4Var = new pp4((byte) 0, 0);
            pp4Var.d = new zic(21);
            pp4Var.c = 3;
            this.b = pp4Var;
        }
        pp4 pp4Var2 = pp4Var;
        zic zicVar = this.c;
        if (zicVar != null) {
            pp4Var2.d = zicVar;
        }
        pp4Var2.b = this.d;
        pp4Var2.c = this.e;
        List list = h6cVar.b.e;
        boolean isEmpty = list.isEmpty();
        hd9 hd9Var = this.f;
        if (!isEmpty) {
            hd9Var = new fp4(20, hd9Var, list);
        }
        kc5 s = this.i.s(h6cVar);
        this.g.getClass();
        dad dadVar = this.a;
        it7 it7Var = this.j;
        return new ad9(h6cVar, dadVar, pp4Var2, this.h, s, it7Var, new tp4(dadVar, it7Var, hd9Var), this.m, this.k, this.l);
    }

    @Override // defpackage.qcc
    public final void b() {
        this.d = true;
    }

    @Override // defpackage.qcc
    public final void c(zic zicVar) {
        this.c = zicVar;
    }

    @Override // defpackage.qcc
    public final void d() {
        this.e = 3;
    }

    @Override // defpackage.qcc
    public final int[] getSupportedTypes() {
        return new int[]{2};
    }
}
