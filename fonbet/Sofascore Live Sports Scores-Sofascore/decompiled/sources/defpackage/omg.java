package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class omg implements Cloneable {
    public Float A;
    public xmg B;
    public Float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public long a = 0;
    public xmg b;
    public Float c;
    public xmg d;
    public Float e;
    public amg f;
    public Float g;
    public amg[] h;
    public amg i;
    public Float j;
    public rlg k;
    public ArrayList l;
    public amg m;
    public Integer n;
    public Boolean o;
    public g7h p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public xmg v;
    public Float w;
    public String x;
    public String y;
    public xmg z;

    public static omg a() {
        omg omgVar = new omg();
        omgVar.a = -1L;
        rlg rlgVar = rlg.b;
        omgVar.b = rlgVar;
        omgVar.D = 1;
        Float valueOf = Float.valueOf(1.0f);
        omgVar.c = valueOf;
        omgVar.d = null;
        omgVar.e = valueOf;
        omgVar.f = new amg(1.0f);
        omgVar.E = 1;
        omgVar.F = 1;
        omgVar.g = Float.valueOf(4.0f);
        omgVar.h = null;
        omgVar.i = new amg(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        omgVar.j = valueOf;
        omgVar.k = rlgVar;
        omgVar.l = null;
        omgVar.m = new amg(12.0f, 7);
        omgVar.n = 400;
        omgVar.G = 1;
        omgVar.H = 1;
        omgVar.I = 1;
        omgVar.J = 1;
        Boolean bool = Boolean.TRUE;
        omgVar.o = bool;
        omgVar.p = null;
        omgVar.q = null;
        omgVar.r = null;
        omgVar.s = null;
        omgVar.t = bool;
        omgVar.u = bool;
        omgVar.v = rlgVar;
        omgVar.w = valueOf;
        omgVar.x = null;
        omgVar.K = 1;
        omgVar.y = null;
        omgVar.z = null;
        omgVar.A = valueOf;
        omgVar.B = null;
        omgVar.C = valueOf;
        omgVar.L = 1;
        omgVar.M = 1;
        return omgVar;
    }

    public final Object clone() {
        omg omgVar = (omg) super.clone();
        amg[] amgVarArr = this.h;
        if (amgVarArr != null) {
            omgVar.h = (amg[]) amgVarArr.clone();
        }
        return omgVar;
    }
}
