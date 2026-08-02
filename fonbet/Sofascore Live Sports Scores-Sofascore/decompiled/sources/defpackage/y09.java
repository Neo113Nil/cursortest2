package defpackage;

import android.app.Application;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.firebase.AdType;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y09 extends hoi implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Integer B;
    public AdManagerAdRequest.Builder r;
    public fsf s;
    public Application t;
    public String u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Application x;
    public final /* synthetic */ z09 y;
    public final /* synthetic */ AdType.Interstitial z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y09(Application application, z09 z09Var, AdType.Interstitial interstitial, String str, Integer num, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = application;
        this.y = z09Var;
        this.z = interstitial;
        this.A = str;
        this.B = num;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        y09 y09Var = new y09(this.x, this.y, this.z, this.A, this.B, rq3Var);
        y09Var.w = obj;
        return y09Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y09) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdManagerAdRequest.Builder builder;
        fsf fsfVar;
        lu3 lu3Var;
        AdManagerAdRequest.Builder builder2;
        fsf fsfVar2;
        Object a;
        Object u2gVar;
        boolean z;
        fsf fsfVar3;
        boolean z2;
        Throwable a2;
        AdManagerAdRequest.Builder builder3;
        wcd wcdVar;
        String message;
        int i;
        lu3 lu3Var2 = lu3.a;
        int i2 = this.v;
        Application application = this.x;
        z09 z09Var = this.y;
        if (i2 == 0) {
            y6a.M(obj);
            builder = new AdManagerAdRequest.Builder();
            fsfVar = new fsf();
            yea yeaVar = j58.a;
            if (!j58.l(true)) {
                lu3Var = lu3Var2;
                application.getClass();
                nv.f(application, z09Var.b, this.z, ru.GOOGLE, this.A, null, 96);
                pk.a(builder, application);
                this.w = null;
                this.r = builder;
                this.s = fsfVar;
                this.t = application;
                String str = this.A;
                this.u = str;
                this.v = 2;
                oog oogVar = new oog(z9a.b(this));
                AdManagerInterstitialAd.load(application, str, builder.build(), new w09(str, (wcd) fsfVar.a, z09Var.b, this.B, this.z, new x09(oogVar, 0)));
                Object b = oogVar.b();
                lu3 lu3Var3 = lu3.a;
                lu3 lu3Var4 = lu3Var;
                return b != lu3Var4 ? lu3Var4 : b;
            }
            String str2 = this.A;
            AdType.Interstitial interstitial = this.z;
            try {
                p2g p2gVar = w2g.b;
                ucd g = tnf.g(str2);
                application.getClass();
                nv.f(application, z09Var.b, interstitial, ru.NIMBUS, str2, null, 64);
                jcd jcdVar = z09Var.a;
                this.w = null;
                this.r = builder;
                this.s = fsfVar;
                this.t = null;
                this.u = null;
                this.v = 1;
                a = jcdVar.a(application, g, this);
                if (a == lu3Var2) {
                    return lu3Var2;
                }
                builder2 = builder;
                fsfVar2 = fsfVar;
            } catch (Throwable th) {
                th = th;
                builder2 = builder;
                fsfVar2 = fsfVar;
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
                AdManagerAdRequest.Builder builder4 = builder2;
                z = u2gVar instanceof u2g;
                if (z) {
                }
                a2 = w2g.a(u2gVar);
                if (a2 == null) {
                }
                wcdVar = (wcd) (z2 ? null : u2gVar);
                if (wcdVar != null) {
                }
                fsfVar3.a = wcdVar;
                builder = builder3;
                fsfVar = fsfVar3;
                application.getClass();
                nv.f(application, z09Var.b, this.z, ru.GOOGLE, this.A, null, 96);
                pk.a(builder, application);
                this.w = null;
                this.r = builder;
                this.s = fsfVar;
                this.t = application;
                String str3 = this.A;
                this.u = str3;
                this.v = 2;
                oog oogVar2 = new oog(z9a.b(this));
                AdManagerInterstitialAd.load(application, str3, builder.build(), new w09(str3, (wcd) fsfVar.a, z09Var.b, this.B, this.z, new x09(oogVar2, 0)));
                Object b2 = oogVar2.b();
                lu3 lu3Var32 = lu3.a;
                lu3 lu3Var42 = lu3Var;
                if (b2 != lu3Var42) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fsfVar2 = this.s;
            builder2 = this.r;
            try {
                y6a.M(obj);
                a = obj;
            } catch (Throwable th2) {
                th = th2;
                p2g p2gVar22 = w2g.b;
                u2gVar = new u2g(th);
                AdManagerAdRequest.Builder builder42 = builder2;
                z = u2gVar instanceof u2g;
                if (z) {
                }
                a2 = w2g.a(u2gVar);
                if (a2 == null) {
                }
                wcdVar = (wcd) (z2 ? null : u2gVar);
                if (wcdVar != null) {
                }
                fsfVar3.a = wcdVar;
                builder = builder3;
                fsfVar = fsfVar3;
                application.getClass();
                nv.f(application, z09Var.b, this.z, ru.GOOGLE, this.A, null, 96);
                pk.a(builder, application);
                this.w = null;
                this.r = builder;
                this.s = fsfVar;
                this.t = application;
                String str32 = this.A;
                this.u = str32;
                this.v = 2;
                oog oogVar22 = new oog(z9a.b(this));
                AdManagerInterstitialAd.load(application, str32, builder.build(), new w09(str32, (wcd) fsfVar.a, z09Var.b, this.B, this.z, new x09(oogVar22, 0)));
                Object b22 = oogVar22.b();
                lu3 lu3Var322 = lu3.a;
                lu3 lu3Var422 = lu3Var;
                if (b22 != lu3Var422) {
                }
            }
        }
        u2gVar = (wcd) a;
        p2g p2gVar3 = w2g.b;
        AdManagerAdRequest.Builder builder422 = builder2;
        z = u2gVar instanceof u2g;
        if (z) {
            fsfVar3 = fsfVar2;
            z2 = z;
        } else {
            application.getClass();
            z2 = z;
            fsfVar3 = fsfVar2;
            nv.e(application, z09Var.b, this.z, ru.NIMBUS, this.A, new Double(((wcd) u2gVar).a.d / 100000.0d), null, null, PsExtractor.AUDIO_STREAM);
        }
        a2 = w2g.a(u2gVar);
        if (a2 == null) {
            lu3Var = lu3Var2;
            builder3 = builder422;
        } else {
            if (a2 instanceof CancellationException) {
                throw a2;
            }
            qcd qcdVar = a2 instanceof qcd ? (qcd) a2 : null;
            application.getClass();
            String str4 = z09Var.b;
            ru ruVar = ru.NIMBUS;
            int C = (qcdVar == null || (i = qcdVar.a) == 0) ? -1 : wt3.C(i);
            if ((qcdVar == null || (message = qcdVar.getMessage()) == null) && (message = a2.getMessage()) == null) {
                message = "";
            }
            lu3Var = lu3Var2;
            builder3 = builder422;
            nv.j(application, str4, this.z, ruVar, this.A, C, message, qu.LOAD, null, null, 768);
        }
        wcdVar = (wcd) (z2 ? null : u2gVar);
        if (wcdVar != null) {
            u09.a(builder3, wcdVar, ocd.a);
            Unit unit = Unit.a;
        } else {
            wcdVar = null;
        }
        fsfVar3.a = wcdVar;
        builder = builder3;
        fsfVar = fsfVar3;
        application.getClass();
        nv.f(application, z09Var.b, this.z, ru.GOOGLE, this.A, null, 96);
        pk.a(builder, application);
        this.w = null;
        this.r = builder;
        this.s = fsfVar;
        this.t = application;
        String str322 = this.A;
        this.u = str322;
        this.v = 2;
        oog oogVar222 = new oog(z9a.b(this));
        AdManagerInterstitialAd.load(application, str322, builder.build(), new w09(str322, (wcd) fsfVar.a, z09Var.b, this.B, this.z, new x09(oogVar222, 0)));
        Object b222 = oogVar222.b();
        lu3 lu3Var3222 = lu3.a;
        lu3 lu3Var4222 = lu3Var;
        if (b222 != lu3Var4222) {
        }
    }
}
