package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import com.facebook.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mz extends xka implements Function0 {
    public static final mz A;
    public static final mz B;
    public static final mz C;
    public static final mz D;
    public static final mz E;
    public static final mz F;
    public static final mz G;
    public static final mz H;
    public static final mz I;
    public static final mz J;
    public static final mz K;
    public static final mz L;
    public static final mz M;
    public static final mz j;
    public static final mz k;
    public static final mz l;
    public static final mz m;
    public static final mz n;
    public static final mz o;
    public static final mz p;
    public static final mz q;
    public static final mz r;
    public static final mz s;
    public static final mz t;
    public static final mz u;
    public static final mz v;
    public static final mz w;
    public static final mz x;
    public static final mz y;
    public static final mz z;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new mz(i, 0);
        k = new mz(i, 1);
        l = new mz(i, 2);
        m = new mz(i, 3);
        n = new mz(i, 4);
        o = new mz(i, 5);
        p = new mz(i, 6);
        q = new mz(i, 7);
        r = new mz(i, 8);
        s = new mz(i, 9);
        t = new mz(i, 10);
        u = new mz(i, 11);
        v = new mz(i, 12);
        w = new mz(i, 13);
        x = new mz(i, 14);
        y = new mz(i, 15);
        z = new mz(i, 16);
        A = new mz(i, 17);
        B = new mz(i, 18);
        C = new mz(i, 19);
        D = new mz(i, 20);
        E = new mz(i, 21);
        F = new mz(i, 22);
        G = new mz(i, 23);
        H = new mz(i, 24);
        I = new mz(i, 25);
        J = new mz(i, 26);
        K = new mz(i, 27);
        L = new mz(i, 28);
        M = new mz(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        rq3 rq3Var = null;
        switch (this.i) {
            case 0:
                nz.a("LocalConfiguration");
                throw null;
            case 1:
                nz.a("LocalContext");
                throw null;
            case 2:
                nz.a("LocalImageVectorCache");
                throw null;
            case 3:
                nz.a("LocalResourceIdCache");
                throw null;
            case 4:
                nz.a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                int i = 2;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    hs4 hs4Var = z45.a;
                    choreographer = (Choreographer) td4.t0(rob.a, new i40(i, rq3Var, 0));
                }
                l40 l40Var = new l40(choreographer, o1j.u(Looper.getMainLooper()));
                return l40Var.plus(l40Var.l);
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 14:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 15:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 16:
                return w.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            case 17:
                uhi uhiVar = uhi.a;
                return new q79(uhiVar, uhiVar, 1);
            case 18:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 19:
                return new htf(duf.a.getOrCreateKotlinClass(tm8.class), om8.a);
            case 20:
                return null;
            case 21:
                return new htf(duf.a.getOrCreateKotlinClass(hw9.class), cw9.a);
            case 22:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 23:
                uhi uhiVar2 = uhi.a;
                return new q79(uhiVar2, uhiVar2, 1);
            case 24:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 25:
                uhi uhiVar3 = uhi.a;
                return new q79(uhiVar3, new htf(duf.a.getOrCreateKotlinClass(String.class), uhiVar3), 1);
            case 26:
                uhi uhiVar4 = uhi.a;
                return new q79(uhiVar4, uhiVar4, 1);
            case 27:
                return new qq3(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, bz2.INSTANCE, new Annotation[0]);
            case 28:
                fuf fufVar = duf.a;
                return new zvg("com.adsbynimbus.render.mraid.Command", fufVar.getOrCreateKotlinClass(s33.class), new KClass[]{fufVar.getOrCreateKotlinClass(bz2.class), fufVar.getOrCreateKotlinClass(cy3.class), fufVar.getOrCreateKotlinClass(qh6.class), fufVar.getOrCreateKotlinClass(pj6.class), fufVar.getOrCreateKotlinClass(rtd.class), fufVar.getOrCreateKotlinClass(cke.class), fufVar.getOrCreateKotlinClass(x0g.class), fufVar.getOrCreateKotlinClass(h9h.class), fufVar.getOrCreateKotlinClass(k9h.class), fufVar.getOrCreateKotlinClass(n9h.class), fufVar.getOrCreateKotlinClass(qfi.class), fufVar.getOrCreateKotlinClass(bck.class)}, new KSerializer[]{new qq3(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, bz2.INSTANCE, new Annotation[0]), ay3.a, oh6.a, new qq3("exposureChange", pj6.INSTANCE, new Annotation[0]), ptd.a, ake.a, new qq3("resize", x0g.INSTANCE, new Annotation[0]), f9h.a, i9h.a, l9h.a, ofi.a, new qq3("unload", bck.INSTANCE, new Annotation[0])}, new Annotation[0]);
            default:
                return new jod();
        }
    }
}
