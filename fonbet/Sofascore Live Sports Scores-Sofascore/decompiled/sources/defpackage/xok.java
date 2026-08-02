package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class xok {

    @NotNull
    public static final wok Companion = new wok();
    public static final joa[] w;
    public float a;
    public String[] b;
    public int c;
    public int d;
    public byte[] e;
    public int f;
    public int g;
    public int h;
    public byte i;
    public byte j;
    public byte k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public byte q;
    public byte[] r;
    public byte[] s;
    public mz0[] t;
    public byte[] u;
    public Map v;

    static {
        ysa ysaVar = ysa.b;
        w = new joa[]{null, ypa.a(ysaVar, ptj.u), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, ptj.v), null, ypa.a(ysaVar, ptj.w)};
    }

    public xok(byte[] bArr, byte[] bArr2) {
        LinkedHashMap i = tub.i(new Pair("is_rewarded", (byte) 0));
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = null;
        this.c = 0;
        this.d = 60;
        this.e = bArr;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = (byte) 0;
        this.j = (byte) 0;
        this.k = (byte) 0;
        this.l = null;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = (byte) 7;
        this.r = null;
        this.s = bArr2;
        this.t = null;
        this.u = null;
        this.v = i;
    }
}
