package defpackage;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ry extends xka implements Function1 {
    public static final ry A;
    public static final ry B;
    public static final ry C;
    public static final ry D;
    public static final ry E;
    public static final ry F;
    public static final ry G;
    public static final ry H;
    public static final ry I;
    public static final ry J;
    public static final ry K;
    public static final ry L;
    public static final ry M;
    public static final ry j;
    public static final ry k;
    public static final ry l;
    public static final ry m;
    public static final ry n;
    public static final ry o;
    public static final ry p;
    public static final ry q;
    public static final ry r;
    public static final ry s;
    public static final ry t;
    public static final ry u;
    public static final ry v;
    public static final ry w;
    public static final ry x;
    public static final ry y;
    public static final ry z;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new ry(i, 0);
        k = new ry(i, 1);
        l = new ry(i, 2);
        m = new ry(i, 3);
        n = new ry(i, 4);
        o = new ry(i, 5);
        p = new ry(i, 6);
        q = new ry(i, 7);
        r = new ry(i, 8);
        s = new ry(i, 9);
        t = new ry(i, 10);
        u = new ry(i, 11);
        v = new ry(i, 12);
        w = new ry(i, 13);
        x = new ry(i, 14);
        y = new ry(i, 15);
        z = new ry(i, 16);
        A = new ry(i, 17);
        B = new ry(i, 18);
        C = new ry(i, 19);
        D = new ry(i, 20);
        E = new ry(i, 21);
        F = new ry(i, 22);
        G = new ry(i, 23);
        H = new ry(i, 24);
        I = new ry(i, 25);
        J = new ry(i, 26);
        K = new ry(i, 27);
        L = new ry(i, 28);
        M = new ry(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((s3h) obj).k().a.c(w3h.B));
            case 2:
                aee aeeVar = (aee) obj;
                ff5 ff5Var = nz.a;
                aeeVar.getClass();
                ktm.I(aeeVar, ff5Var);
                return ((Context) ktm.I(aeeVar, nz.b)).getResources();
            case 3:
                return Boolean.valueOf(((s3h) obj).k().a.c(w3h.B));
            case 4:
                KProperty[] kPropertyArr = y3h.a;
                a4h a4hVar = w3h.y;
                Unit unit = Unit.a;
                ((b4h) obj).a(a4hVar, unit);
                return unit;
            case 5:
                ((Number) obj).longValue();
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                KProperty[] kPropertyArr2 = y3h.a;
                a4h a4hVar2 = w3h.x;
                Unit unit2 = Unit.a;
                ((b4h) obj).a(a4hVar2, unit2);
                return unit2;
            case 8:
                return Unit.a;
            case 9:
                b50 b50Var = (b50) obj;
                b50Var.getHandler().post(new iy(4, b50Var.r));
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                return l98.l0(uo5.e(s02.h0(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).a(uo5.g(s02.h0(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 0.92f, 4)), uo5.f(s02.h0(90, 0, null, 6), 2));
            case 14:
                return obj;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 16:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 17:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 18:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 19:
                return (pzc) obj;
            case 20:
                return (pzc) obj;
            case 21:
                return Unit.a;
            case 22:
                return (sj0) obj;
            case 23:
                efa efaVar = (efa) obj;
                efaVar.getClass();
                efaVar.g = true;
                efaVar.b = false;
                efaVar.c = true;
                return Unit.a;
            case 24:
                long b = r13.b(((r13) obj).a, l23.x);
                return new i80(r13.d(b), r13.h(b), r13.g(b), r13.e(b));
            case 25:
                efa efaVar2 = (efa) obj;
                efaVar2.getClass();
                efaVar2.c = true;
                return Unit.a;
            case 26:
                ((Number) obj).longValue();
                return Unit.a;
            case 27:
                if3 if3Var = (if3) obj;
                wma wmaVar = if3Var instanceof wma ? (wma) if3Var : null;
                if (wmaVar != null && wmaVar.Q) {
                    r3a.b("Apply is called on deactivated node " + if3Var);
                }
                return Unit.a;
            case 28:
                return Boolean.valueOf(!(((vtc) obj) instanceof mf3));
            default:
                return obj;
        }
    }
}
