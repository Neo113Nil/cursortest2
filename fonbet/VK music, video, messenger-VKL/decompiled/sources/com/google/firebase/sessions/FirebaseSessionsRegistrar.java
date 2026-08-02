package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ad3;
import xsna.awf0;
import xsna.b1j0;
import xsna.b6o;
import xsna.csk;
import xsna.dui0;
import xsna.dyc0;
import xsna.dyi0;
import xsna.e43;
import xsna.e4r0;
import xsna.e9e0;
import xsna.eui0;
import xsna.f9e0;
import xsna.fkr;
import xsna.fti0;
import xsna.fuk;
import xsna.fvk;
import xsna.gzl;
import xsna.i7f0;
import xsna.i8i;
import xsna.izs;
import xsna.kkr;
import xsna.lkr;
import xsna.mkr;
import xsna.nkr;
import xsna.o6x;
import xsna.okr;
import xsna.ovj;
import xsna.pf7;
import xsna.pkr;
import xsna.rkr;
import xsna.rti0;
import xsna.rvz;
import xsna.toe0;
import xsna.top0;
import xsna.tti0;
import xsna.uir;
import xsna.uyc0;
import xsna.v2z;
import xsna.vhr;
import xsna.vu5;
import xsna.wv5;
import xsna.wvf0;
import xsna.wyp;
import xsna.x0g0;
import xsna.x0j0;
import xsna.x8i;
import xsna.ydj;
import xsna.yvj;
import xsna.yyp;
import xsna.zvf0;
import xsna.zxc0;
import xsna.zzs;

/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final b Companion = new b();
    private static final toe0<Context> appContext = toe0.a(Context.class);
    private static final toe0<vhr> firebaseApp = toe0.a(vhr.class);
    private static final toe0<uir> firebaseInstallationsApi = toe0.a(uir.class);
    private static final toe0<ovj> backgroundDispatcher = new toe0<>(wv5.class, ovj.class);
    private static final toe0<ovj> blockingDispatcher = new toe0<>(pf7.class, ovj.class);
    private static final toe0<top0> transportFactory = toe0.a(top0.class);
    private static final toe0<kkr> firebaseSessionsComponent = toe0.a(kkr.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements zzs<String, x0g0<uyc0>, izs<? super Context, ? extends List<? extends fuk<uyc0>>>, yvj, i7f0<? super Context, ? extends fvk<uyc0>>> {
        public static final a b = new a(4, zxc0.class, "preferencesDataStore", "preferencesDataStore(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;", 1);

        @Override // xsna.zzs
        public final i7f0<? super Context, ? extends fvk<uyc0>> invoke(String str, x0g0<uyc0> x0g0Var, izs<? super Context, ? extends List<? extends fuk<uyc0>>> izsVar, yvj yvjVar) {
            return new dyc0(str, x0g0Var, izsVar, yvjVar);
        }
    }

    /* compiled from: FirebaseSessionsRegistrar.kt */
    public static final class b {
    }

    static {
        try {
            a.b.getClass();
        } catch (NoClassDefFoundError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fkr getComponents$lambda$0(x8i x8iVar) {
        return ((kkr) x8iVar.c(firebaseSessionsComponent)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kkr getComponents$lambda$1(x8i x8iVar) {
        Context context = (Context) x8iVar.c(appContext);
        d dVar = (d) x8iVar.c(backgroundDispatcher);
        vhr vhrVar = (vhr) x8iVar.c(firebaseApp);
        uir uirVar = (uir) x8iVar.c(firebaseInstallationsApi);
        f9e0 d = x8iVar.d(transportFactory);
        csk cskVar = new csk();
        cskVar.a = o6x.a(vhrVar);
        o6x a2 = o6x.a(context);
        cskVar.b = a2;
        cskVar.c = b6o.a(new rvz(a2));
        cskVar.d = o6x.a(dVar);
        cskVar.e = o6x.a(uirVar);
        e9e0<ad3> a3 = b6o.a(new lkr(cskVar.a));
        cskVar.f = a3;
        cskVar.g = b6o.a(new zvf0(a3, cskVar.d));
        e9e0<fvk<uyc0>> a4 = b6o.a(new mkr(cskVar.b));
        cskVar.h = a4;
        e9e0<x0j0> a5 = b6o.a(new b1j0(a4));
        cskVar.i = a5;
        e9e0<wvf0> a6 = b6o.a(new awf0(cskVar.d, cskVar.e, cskVar.f, cskVar.g, a5));
        cskVar.j = a6;
        cskVar.k = b6o.a(new dyi0(cskVar.c, a6));
        e9e0<dui0> a7 = b6o.a(new eui0(cskVar.b));
        cskVar.l = a7;
        cskVar.m = b6o.a(new rkr(cskVar.a, cskVar.k, cskVar.d, a7));
        e9e0<fvk<uyc0>> a8 = b6o.a(new nkr(cskVar.b));
        cskVar.n = a8;
        cskVar.o = b6o.a(new fti0(cskVar.d, a8));
        e9e0<wyp> a9 = b6o.a(new yyp(o6x.a(d)));
        cskVar.p = a9;
        cskVar.q = b6o.a(new rti0(cskVar.a, cskVar.e, cskVar.k, a9, cskVar.d));
        cskVar.r = b6o.a(okr.a.a);
        e9e0<e4r0> a10 = b6o.a(pkr.a.a);
        cskVar.s = a10;
        cskVar.t = b6o.a(new tti0(cskVar.r, a10));
        return cskVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<? extends Object>> getComponents() {
        i8i.a a2 = i8i.a(fkr.class);
        a2.a = LIBRARY_NAME;
        a2.a(gzl.c(firebaseSessionsComponent));
        a2.f = new vu5(2);
        a2.c(2);
        i8i b2 = a2.b();
        i8i.a a3 = i8i.a(kkr.class);
        a3.a = "fire-sessions-component";
        a3.a(gzl.c(appContext));
        a3.a(gzl.c(backgroundDispatcher));
        a3.a(gzl.c(blockingDispatcher));
        a3.a(gzl.c(firebaseApp));
        a3.a(gzl.c(firebaseInstallationsApi));
        a3.a(new gzl(transportFactory, 1, 1));
        a3.f = new ydj(2);
        return e43.l(b2, a3.b(), v2z.a(LIBRARY_NAME, "2.1.2"));
    }
}
