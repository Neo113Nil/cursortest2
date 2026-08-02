package defpackage;

import androidx.glance.session.SessionWorker;
import java.io.File;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ptj extends xka implements Function0 {
    public static final ptj j;
    public static final ptj k;
    public static final ptj l;
    public static final ptj m;
    public static final ptj n;
    public static final ptj o;
    public static final ptj p;
    public static final ptj q;
    public static final ptj r;
    public static final ptj s;
    public static final ptj t;
    public static final ptj u;
    public static final ptj v;
    public static final ptj w;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new ptj(i, 0);
        k = new ptj(i, 1);
        l = new ptj(i, 2);
        m = new ptj(i, 3);
        n = new ptj(i, 4);
        o = new ptj(i, 5);
        p = new ptj(i, 6);
        q = new ptj(i, 7);
        r = new ptj(i, 8);
        s = new ptj(i, 9);
        t = new ptj(i, 10);
        u = new ptj(i, 11);
        v = new ptj(i, 12);
        w = new ptj(i, 13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptj(SessionWorker sessionWorker) {
        super(0);
        this.i = 16;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.i) {
            case 0:
                return ByteBuffer.allocateDirect(1024);
            case 1:
                uhi uhiVar = uhi.a;
                return new q79(uhiVar, uhiVar, 1);
            case 2:
                return new qq3("unload", bck.INSTANCE, new Annotation[0]);
            case 3:
                return new htf(duf.a.getOrCreateKotlinClass(nd4.class), kd4.a);
            case 4:
                return new xg0(uf5.a, 2);
            case 5:
                uhi uhiVar2 = uhi.a;
                return new q79(uhiVar2, uhiVar2, 1);
            case 6:
                uhi uhiVar3 = uhi.a;
                return new q79(uhiVar3, uhiVar3, 1);
            case 7:
                return fc6.C();
            case 8:
                pe2 pe2Var = new pe2();
                up4 up4Var = new up4();
                String str = gcd.a;
                iie iieVar = iie.a;
                up4Var.b = iie.b();
                pe2Var.f = up4Var;
                pe2Var.a = new ghh(new File(oie.a().getCacheDir(), "nimbus-vast-cache"), new h5b(31457280L), new h9i(oie.a()));
                pe2Var.g = 2;
                return pe2Var;
            case 9:
                plk plkVar = plk.a;
                return new hr4((pe2) plk.b.getValue());
            case 10:
                return Unit.a;
            case 11:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 12:
                return new htf(duf.a.getOrCreateKotlinClass(mz0.class), kz0.a);
            case 13:
                return new q79(uhi.a, qb2.a, 1);
            case 14:
                int i = nv2.b;
                return new ok5();
            case 15:
                int i2 = er9.b;
                return new qk5();
            default:
                return bea.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptj(int i, int i2) {
        super(i);
        this.i = i2;
    }
}
