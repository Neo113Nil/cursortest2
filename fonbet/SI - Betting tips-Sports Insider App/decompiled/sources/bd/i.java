package bd;

import a4.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import cd.k;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.google.gson.reflect.TypeToken;
import com.sports.insider.MyApp;
import com.sports.insider.data.entity.prediction.GamesInfoData;
import com.sports.insider.data.entity.prediction.LastGames;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.views.CustomGradientButton;
import eg.c0;
import eg.m0;
import hg.d1;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import jg.q;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.g0;
import la.s0;
import la.w;
import le.f1;
import le.j0;
import le.n;
import le.p1;
import le.z;
import org.json.JSONObject;
import pc.u;
import q4.r;
import rc.b0;
import se.p;
import wc.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3162b;

    /* renamed from: c, reason: collision with root package name */
    public int f3163c;

    /* renamed from: d, reason: collision with root package name */
    public int f3164d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i5, int i10, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f3162b = i10;
        this.f3166f = obj;
        this.f3164d = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e9, code lost:
    
        if (r14.b(true, r13) == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        if (r14 == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004a, code lost:
    
        if (eg.c0.j(2000, r13) == r8) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj) {
        String str;
        int i5;
        Object A;
        int i10;
        int i11;
        z zVar = (z) this.f3165e;
        x xVar = zVar.f20027y;
        lf.a aVar = lf.a.f20034a;
        int i12 = this.f3164d;
        if (i12 == 0) {
            h8.b.B(obj);
            this.f3164d = 1;
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    h8.b.B(obj);
                    str = (String) obj;
                    i5 = 3;
                    String str2 = str;
                    Activity activity = (Activity) this.f3166f;
                    this.f3163c = i5;
                    this.f3164d = 3;
                    lg.e eVar = m0.f9201a;
                    A = c0.A(q.f18523a, new cd.j(zVar, i5, activity, str2, (Continuation) null, 5), this);
                    if (A != aVar) {
                        A = Unit.f19194a;
                    }
                    if (A != aVar) {
                        i10 = i5;
                        this.f3163c = i10;
                        this.f3164d = 4;
                        obj = xVar.A(this);
                        if (obj != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i12 == 3) {
                    i10 = this.f3163c;
                    h8.b.B(obj);
                    this.f3163c = i10;
                    this.f3164d = 4;
                    obj = xVar.A(this);
                    if (obj != aVar) {
                        i11 = i10;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return Unit.f19194a;
                    }
                    return aVar;
                }
                if (i12 != 4) {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                i11 = this.f3163c;
                h8.b.B(obj);
                if (((Boolean) obj).booleanValue()) {
                    m7.b bVar = new m7.b();
                    this.f3163c = i11;
                    this.f3164d = 5;
                }
                return Unit.f19194a;
            }
            h8.b.B(obj);
        }
        xVar.getClass();
        x.v().getClass();
        str = null;
        Object[] objArr = 0;
        if (((Number) u.n().f25819b.getValue()).intValue() != 3) {
            xVar.getClass();
            int intValue = ((Number) x.v().f21720v.getValue()).intValue();
            if (-1 <= intValue && intValue < 2) {
                return Unit.f19194a;
            }
            i5 = intValue;
            String str22 = str;
            Activity activity2 = (Activity) this.f3166f;
            this.f3163c = i5;
            this.f3164d = 3;
            lg.e eVar2 = m0.f9201a;
            A = c0.A(q.f18523a, new cd.j(zVar, i5, activity2, str22, (Continuation) null, 5), this);
            if (A != aVar) {
            }
            if (A != aVar) {
            }
            return aVar;
        }
        zc.j jVar = new zc.j();
        this.f3164d = 2;
        lg.e eVar3 = m0.f9201a;
        obj = c0.A(lg.d.f20063c, new r(jVar, objArr == true ? 1 : 0, 17), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f3, code lost:
    
        if (r13.b(true, r12) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00db, code lost:
    
        if (r13 != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r13 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        if (eg.c0.j(2000, r12) == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        String str;
        int i5;
        Object A;
        int i10;
        f1 f1Var = (f1) this.f3165e;
        lf.a aVar = lf.a.f20034a;
        int i11 = this.f3164d;
        if (i11 == 0) {
            h8.b.B(obj);
            this.f3164d = 1;
        } else if (i11 == 1) {
            h8.b.B(obj);
        } else {
            if (i11 == 2) {
                h8.b.B(obj);
                str = (String) obj;
                i5 = 3;
                String str2 = str;
                Activity activity = (Activity) this.f3166f;
                this.f3163c = i5;
                this.f3164d = 3;
                lg.e eVar = m0.f9201a;
                A = c0.A(q.f18523a, new cd.j(f1Var, i5, activity, str2, (Continuation) null, 7), this);
                if (A != aVar) {
                    A = Unit.f19194a;
                }
                if (A != aVar) {
                    i10 = i5;
                    d0 i12 = f1Var.i();
                    this.f3163c = i10;
                    this.f3164d = 4;
                    obj = i12.c(this);
                }
                return aVar;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                i10 = this.f3163c;
                h8.b.B(obj);
                if (((Boolean) obj).booleanValue()) {
                    m7.b bVar = new m7.b();
                    this.f3163c = i10;
                    this.f3164d = 5;
                }
                return Unit.f19194a;
            }
            i10 = this.f3163c;
            h8.b.B(obj);
            d0 i122 = f1Var.i();
            this.f3163c = i10;
            this.f3164d = 4;
            obj = i122.c(this);
        }
        f1Var.i().getClass();
        d0.b().getClass();
        str = null;
        Object[] objArr = 0;
        if (((Number) u.n().f25819b.getValue()).intValue() != 3) {
            f1Var.i().getClass();
            int intValue = ((Number) d0.b().f21720v.getValue()).intValue();
            if (-1 <= intValue && intValue < 2) {
                return Unit.f19194a;
            }
            i5 = intValue;
            String str22 = str;
            Activity activity2 = (Activity) this.f3166f;
            this.f3163c = i5;
            this.f3164d = 3;
            lg.e eVar2 = m0.f9201a;
            A = c0.A(q.f18523a, new cd.j(f1Var, i5, activity2, str22, (Continuation) null, 7), this);
            if (A != aVar) {
            }
            if (A != aVar) {
            }
            return aVar;
        }
        zc.j jVar = new zc.j();
        this.f3164d = 2;
        lg.e eVar3 = m0.f9201a;
        obj = c0.A(lg.d.f20063c, new r(jVar, objArr == true ? 1 : 0, 17), this);
    }

    private final Object g(Object obj) {
        int i5;
        int i10;
        VipAccessFragment vipAccessFragment = (VipAccessFragment) this.f3166f;
        lf.a aVar = lf.a.f20034a;
        int i11 = this.f3164d;
        if (i11 == 0) {
            h8.b.B(obj);
            try {
                i5 = aa.b.p((Context) this.f3165e);
            } catch (Exception unused) {
                i5 = 0;
            }
            int i12 = i5;
            Configuration configuration = vipAccessFragment.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Integer valueOf = Integer.valueOf(io.sentry.config.a.o(configuration.screenWidthDp));
            io.sentry.config.a.o(configuration.screenHeightDp);
            lg.e eVar = m0.f9201a;
            fg.e eVar2 = q.f18523a;
            k kVar = new k(vipAccessFragment, ((int) ((valueOf.intValue() * 178.5d) / 360)) + i12, i12, null, 7);
            this.f3163c = i12;
            this.f3164d = 1;
            if (c0.A(eVar2, kVar, this) == aVar) {
                return aVar;
            }
            i10 = i12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f3163c;
            h8.b.B(obj);
        }
        return new Integer(i10);
    }

    private final Object h(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        rb.g P0 = fb.b.P0();
        int i5 = this.f3163c;
        int i10 = this.f3164d;
        String msg = (String) this.f3166f;
        rb.e eVar = P0.f22382a;
        String str = (String) f3.x.n0(eVar.f22378a, true, false, new eb.b(i5, 14));
        if (str != null) {
            msg = str;
        }
        if (msg != null) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            ((Number) f3.x.n0(eVar.f22378a, false, true, new m3.h(i10, msg, 3))).longValue();
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r1.d(r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r7 == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        id.c cVar;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f3163c;
        if (i5 == 0) {
            h8.b.B(obj);
            cVar = new id.c(1);
            int i10 = this.f3164d;
            this.f3165e = cVar;
            this.f3163c = 1;
            la.b bVar = (la.b) y3.m(la.b.class, null, 6);
            Integer num = new Integer(i10);
            bVar.getClass();
            Object o3 = new y8.d().o(num, this);
            if (o3 != aVar) {
                o3 = Unit.f19194a;
            }
            if (o3 != aVar) {
                o3 = Unit.f19194a;
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return Unit.f19194a;
            }
            cVar = (id.c) this.f3165e;
            h8.b.B(obj);
        }
        if (((String) this.f3166f) != null) {
            this.f3165e = null;
            this.f3163c = 2;
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r11 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r11 == r4) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        ic.g gVar;
        int i5 = this.f3164d;
        p pVar = (p) this.f3166f;
        wc.i iVar = pVar.A;
        d1 d1Var = pVar.D;
        d1 d1Var2 = pVar.E;
        lf.a aVar = lf.a.f20034a;
        int i10 = this.f3163c;
        if (i10 == 0) {
            h8.b.B(obj);
            ic.g gVar2 = (ic.g) d1Var2.getValue();
            gVar = (ic.g) d1Var.getValue();
            if (gVar2 != null) {
                ic.c cVar = (ic.c) gVar2;
                ic.b bVar = cVar.f11085a;
                ic.b bVar2 = cVar.f11086b;
                Integer num = cVar.f11088d;
                this.f3165e = gVar;
                this.f3163c = 1;
                iVar.getClass();
                obj = wc.i.d(bVar, bVar2, i5, num, this);
            }
            if (gVar != null) {
                ic.c cVar2 = (ic.c) gVar;
                ic.b bVar3 = cVar2.f11085a;
                ic.b bVar4 = cVar2.f11086b;
                Integer num2 = cVar2.f11088d;
                this.f3165e = null;
                this.f3163c = 2;
                iVar.getClass();
                obj = wc.i.d(bVar3, bVar4, i5, num2, this);
            }
            return Unit.f19194a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            d1Var.j((ic.g) obj);
            return Unit.f19194a;
        }
        gVar = (ic.g) this.f3165e;
        h8.b.B(obj);
        d1Var2.j((ic.g) obj);
        if (gVar != null) {
        }
        return Unit.f19194a;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3162b) {
            case 0:
                return new i(this.f3164d, 0, (j) this.f3166f, continuation);
            case 1:
                return new i(this.f3164d, (Integer) this.f3165e, (cd.h) this.f3166f, continuation);
            case 2:
                return new i((cd.d) this.f3165e, this.f3164d, (Integer) this.f3166f, continuation, 2);
            case 3:
                return new i((l1.a) this.f3165e, this.f3164d, (Integer) this.f3166f, continuation, 3);
            case 4:
                return new i((id.x) this.f3165e, this.f3164d, (mc.a) this.f3166f, continuation, 4);
            case 5:
                return new i(this.f3164d, 5, (la.d) this.f3166f, continuation);
            case 6:
                return new i((w) this.f3166f, continuation);
            case 7:
                return new i((g0) this.f3165e, (String) this.f3166f, this.f3164d, continuation, 7);
            case 8:
                return new i(this.f3164d, 8, (g0) this.f3166f, continuation);
            case 9:
                return new i(this.f3164d, 9, (la.m0) this.f3166f, continuation);
            case 10:
                return new i((s0) this.f3165e, (String) this.f3166f, this.f3164d, continuation, 10);
            case 11:
                return new i(this.f3164d, 11, (s0) this.f3166f, continuation);
            case 12:
                return new i((LivePayFragment) this.f3165e, this.f3163c, this.f3164d, (String) this.f3166f, continuation, 12);
            case 13:
                return new i((Context) this.f3165e, (LivePayFragment) this.f3166f, continuation, 13);
            case 14:
                return new i((z) this.f3165e, (Activity) this.f3166f, continuation, 14);
            case 15:
                return new i((Context) this.f3165e, (PayExpressFragment) this.f3166f, continuation, 15);
            case 16:
                return new i((f1) this.f3165e, (Activity) this.f3166f, continuation, 16);
            case 17:
                return new i((Context) this.f3165e, (PayPremiumFragment) this.f3166f, continuation, 17);
            case 18:
                return new i((Context) this.f3165e, (VipAccessFragment) this.f3166f, continuation, 18);
            case 19:
                return new i((fb.b) this.f3165e, this.f3163c, this.f3164d, (String) this.f3166f, continuation, 19);
            case 20:
                return new i(this.f3164d, (String) this.f3166f, continuation);
            case 21:
                return new i(this.f3164d, 21, (p) this.f3166f, continuation);
            default:
                return new i((p) this.f3165e, (Activity) this.f3166f, continuation, 22);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3162b) {
        }
        return ((i) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:412:0x074a, code lost:
    
        if (r1 == r15) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x076a, code lost:
    
        if (r1 == r15) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0722, code lost:
    
        if (r13.A0(r25) == r15) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x070a, code lost:
    
        if (r0 == r15) goto L416;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0308 A[Catch: Exception -> 0x0286, TryCatch #5 {Exception -> 0x0286, blocks: (B:145:0x0281, B:147:0x0336, B:153:0x0293, B:154:0x0302, B:156:0x0308, B:158:0x030e, B:161:0x0315, B:166:0x0330, B:168:0x029b, B:169:0x02e9, B:171:0x02f1, B:175:0x02a5, B:177:0x02bd, B:179:0x02c3, B:181:0x02ca, B:186:0x02ae), top: B:138:0x0273 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f1 A[Catch: Exception -> 0x0286, TryCatch #5 {Exception -> 0x0286, blocks: (B:145:0x0281, B:147:0x0336, B:153:0x0293, B:154:0x0302, B:156:0x0308, B:158:0x030e, B:161:0x0315, B:166:0x0330, B:168:0x029b, B:169:0x02e9, B:171:0x02f1, B:175:0x02a5, B:177:0x02bd, B:179:0x02c3, B:181:0x02ca, B:186:0x02ae), top: B:138:0x0273 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07db A[Catch: Exception -> 0x07de, TRY_LEAVE, TryCatch #1 {Exception -> 0x07de, blocks: (B:439:0x077f, B:441:0x07d6, B:443:0x07db, B:449:0x078b, B:451:0x07b8, B:456:0x0794), top: B:435:0x0779 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0987 A[Catch: Exception -> 0x08fe, TryCatch #0 {Exception -> 0x08fe, blocks: (B:513:0x08f7, B:515:0x0983, B:517:0x0987, B:518:0x0989, B:524:0x0907, B:525:0x0948, B:527:0x0958, B:529:0x095e, B:530:0x0967, B:538:0x090b, B:540:0x092a, B:542:0x0932, B:547:0x0914), top: B:507:0x08eb }] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x095e A[Catch: Exception -> 0x08fe, TryCatch #0 {Exception -> 0x08fe, blocks: (B:513:0x08f7, B:515:0x0983, B:517:0x0987, B:518:0x0989, B:524:0x0907, B:525:0x0948, B:527:0x0958, B:529:0x095e, B:530:0x0967, B:538:0x090b, B:540:0x092a, B:542:0x0932, B:547:0x0914), top: B:507:0x08eb }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x094e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.String] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object A;
        jd.a a7;
        dd.a d10;
        io.sentry.hints.j jVar;
        Object A2;
        Object A3;
        Object A4;
        Object C0;
        lf.a aVar;
        Object r02;
        Pair pair;
        Pair pair2;
        int intValue;
        Object b10;
        String str;
        Object a10;
        String str2;
        Object obj2;
        Object q02;
        int intValue2;
        Object C02;
        g0 g0Var;
        Object A5;
        l lVar;
        v3.b httpException;
        v3.a msg4xx;
        String msg;
        l lVar2;
        Object C03;
        Object A6;
        int statusCode;
        ArrayList arrayList;
        GamesInfoData gamesInfoData;
        a4.f fVar;
        Object C04;
        s0 s0Var;
        Continuation continuation;
        Object A7;
        l lVar3;
        l lVar4;
        int i5;
        int i10;
        int i11;
        Object A8;
        int intValue3;
        Object A9;
        int i12;
        Object e7;
        int i13 = 400;
        int i14 = 0;
        Continuation continuation2 = null;
        continuation2 = null;
        int i15 = 2;
        int i16 = 1;
        switch (this.f3162b) {
            case 0:
                int i17 = this.f3164d;
                j jVar2 = (j) this.f3166f;
                lf.a aVar2 = lf.a.f20034a;
                int i18 = this.f3163c;
                try {
                } catch (Exception e9) {
                    zc.d.b(6, null, e9);
                }
                if (i18 == 0) {
                    h8.b.B(obj);
                    this.f3163c = 1;
                    jVar2.getClass();
                    lg.e eVar = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new d(jVar2, i17, null, i14), this);
                    if (A == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jVar = (io.sentry.hints.j) this.f3165e;
                            h8.b.B(obj);
                            A2 = obj;
                            ga.a aVar3 = (ga.a) A2;
                            jVar.C(aVar3 != null ? aVar3.f9909a : -1);
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        a7 = j.a(jVar2);
                        if (a7 != null) {
                            try {
                                a7.a().f3273b.cancel(null, i17);
                            } catch (Exception unused) {
                            }
                        }
                        d10 = jVar2.d();
                        if (d10 != null) {
                            d10.g("LiveViewed", String.valueOf(i17));
                        }
                        jVar = new io.sentry.hints.j(28);
                        this.f3165e = jVar;
                        this.f3163c = 3;
                        lg.e eVar2 = m0.f9201a;
                        A2 = c0.A(lg.d.f20063c, new b(i15, null, i14), this);
                        if (A2 == aVar2) {
                            return aVar2;
                        }
                        ga.a aVar32 = (ga.a) A2;
                        jVar.C(aVar32 != null ? aVar32.f9909a : -1);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                if (!((Boolean) A).booleanValue()) {
                    this.f3163c = 2;
                    jVar2.getClass();
                    lg.e eVar3 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new d(jVar2, i17, null, i16), this) == aVar2) {
                        return aVar2;
                    }
                    a7 = j.a(jVar2);
                    if (a7 != null) {
                    }
                    d10 = jVar2.d();
                    if (d10 != null) {
                    }
                    jVar = new io.sentry.hints.j(28);
                    this.f3165e = jVar;
                    this.f3163c = 3;
                    lg.e eVar22 = m0.f9201a;
                    A2 = c0.A(lg.d.f20063c, new b(i15, null, i14), this);
                    if (A2 == aVar2) {
                    }
                    ga.a aVar322 = (ga.a) A2;
                    jVar.C(aVar322 != null ? aVar322.f9909a : -1);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar4 = lf.a.f20034a;
                int i19 = this.f3163c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("funcName", "FavoriteChangePrediction").put("id", this.f3164d);
                    Integer num = (Integer) this.f3165e;
                    if (num != null) {
                        put.put("type", num.intValue());
                    }
                    cd.h hVar = (cd.h) this.f3166f;
                    this.f3163c = 1;
                    if (hVar.e("FAVORITE_FUNC_USES", put, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                Integer num2 = (Integer) this.f3166f;
                lf.a aVar5 = lf.a.f20034a;
                int i20 = this.f3163c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    cd.d dVar = (cd.d) this.f3165e;
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f3164d);
                    sb2.append(", \"MODE\":" + num2.intValue());
                    JSONObject put2 = jSONObject.put("googleRcAppUpdate", sb2.toString());
                    Intrinsics.checkNotNullExpressionValue(put2, "put(...)");
                    this.f3163c = 1;
                    if (dVar.d(put2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                int i21 = this.f3164d;
                l1.a aVar6 = (l1.a) this.f3165e;
                lf.a aVar7 = lf.a.f20034a;
                int i22 = this.f3163c;
                try {
                    if (i22 == 0) {
                        h8.b.B(obj);
                        aVar6.getClass();
                        la.m0 r5 = l1.a.r();
                        this.f3163c = 1;
                        r5.getClass();
                        fb.b bVar = new fb.b();
                        lg.e eVar4 = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new kb.b(bVar, i21, null, i14), this) == aVar7) {
                            return aVar7;
                        }
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    cd.h e10 = l1.a.e(aVar6);
                    if (e10 != null) {
                        c0.t(MyApp.f6830c, b0.b(), null, new i(i21, (Integer) this.f3166f, e10, (Continuation) null), 2);
                    }
                } catch (Exception unused2) {
                }
                return Unit.f19194a;
            case 4:
                id.x xVar = (id.x) this.f3165e;
                lf.a aVar8 = lf.a.f20034a;
                int i23 = this.f3163c;
                try {
                    if (i23 == 0) {
                        h8.b.B(obj);
                        xVar.getClass();
                        s0 d11 = id.x.d();
                        int i24 = this.f3164d;
                        this.f3163c = 1;
                        d11.getClass();
                        fb.b bVar2 = new fb.b();
                        lg.e eVar5 = m0.f9201a;
                        A3 = c0.A(lg.d.f20063c, new lb.b(bVar2, i24, null, i15), this);
                        if (A3 == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (i23 != 1) {
                            if (i23 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            A4 = obj;
                            List list = (List) A4;
                            return list != null ? e0.f19204a : list;
                        }
                        h8.b.B(obj);
                        A3 = obj;
                    }
                    ArrayList D = CollectionsKt.D((Iterable) A3);
                    mc.a aVar9 = (mc.a) this.f3166f;
                    this.f3163c = 2;
                    xVar.getClass();
                    A4 = c0.A(m0.f9201a, new id.q(D, xVar, aVar9, null), this);
                    if (A4 == aVar8) {
                        return aVar8;
                    }
                    List list2 = (List) A4;
                    if (list2 != null) {
                    }
                } catch (Exception unused3) {
                    return e0.f19204a;
                }
            case 5:
                la.d dVar2 = (la.d) this.f3166f;
                lf.a aVar10 = lf.a.f20034a;
                int i25 = this.f3163c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    this.f3163c = 1;
                    C0 = dVar2.C0(this);
                    if (C0 == aVar10) {
                        aVar = aVar10;
                        return aVar;
                    }
                } else if (i25 == 1) {
                    h8.b.B(obj);
                    C0 = obj;
                } else if (i25 == 2) {
                    h8.b.B(obj);
                    aVar = aVar10;
                    r02 = obj;
                    pair = (Pair) r02;
                    if (((Number) pair.f19192a).intValue() == 401) {
                        this.f3165e = pair;
                        this.f3163c = 3;
                        break;
                    }
                    pair2 = pair;
                    intValue = ((Number) pair2.f19192a).intValue();
                    if (intValue != 200) {
                    }
                } else if (i25 == 3) {
                    pair = (Pair) this.f3165e;
                    h8.b.B(obj);
                    aVar = aVar10;
                    pair2 = pair;
                    intValue = ((Number) pair2.f19192a).intValue();
                    if (intValue != 200) {
                        String str3 = (String) pair2.f19193b;
                        int i26 = this.f3164d;
                        this.f3165e = pair2;
                        this.f3163c = 4;
                        lg.e eVar6 = m0.f9201a;
                        Object A10 = c0.A(lg.d.f20063c, new kd.e(dVar2, str3, i26, (Continuation) null), this);
                        if (A10 != aVar) {
                            A10 = Unit.f19194a;
                            break;
                        }
                    } else {
                        if (intValue == 404) {
                            this.f3165e = pair2;
                            this.f3163c = 5;
                            lg.e eVar7 = m0.f9201a;
                            Object A11 = c0.A(lg.d.f20063c, new kd.e(dVar2, (String) null, 0, (Continuation) null), this);
                            if (A11 != aVar) {
                                A11 = Unit.f19194a;
                                break;
                            }
                        }
                        return pair2.f19192a;
                    }
                } else {
                    if (i25 != 4 && i25 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair2 = (Pair) this.f3165e;
                    h8.b.B(obj);
                    return pair2.f19192a;
                }
                String str4 = (String) C0;
                if (str4 != null) {
                    na.b bVar3 = new na.b();
                    int i27 = this.f3164d;
                    String str5 = gc.d.f9945a;
                    String c2 = d2.i.c();
                    aVar = aVar10;
                    String d12 = d2.i.d();
                    this.f3163c = 2;
                    r02 = bVar3.r0(str4, i27, c2, d12, this);
                    break;
                } else {
                    return new Integer(401);
                }
                break;
            case 6:
                w wVar = (w) this.f3166f;
                lf.a aVar11 = lf.a.f20034a;
                int i28 = this.f3164d;
                if (i28 == 0) {
                    h8.b.B(obj);
                    this.f3164d = 1;
                    b10 = wVar.b(this);
                    if (b10 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                if (i28 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                intValue2 = this.f3163c;
                                h8.b.B(obj);
                                return new Integer(intValue2);
                            }
                            h8.b.B(obj);
                            q02 = obj;
                            obj2 = null;
                            intValue2 = ((Number) q02).intValue();
                            if (intValue2 == 401) {
                                this.f3165e = obj2;
                                this.f3163c = intValue2;
                                this.f3164d = 4;
                                if (wVar.c(this) == aVar11) {
                                    return aVar11;
                                }
                            }
                            return new Integer(intValue2);
                        }
                        str = (String) this.f3165e;
                        h8.b.B(obj);
                        a10 = obj;
                        String str6 = str;
                        str2 = (String) a10;
                        if (str2 != null) {
                            return new Integer(400);
                        }
                        na.b bVar4 = new na.b();
                        String str7 = gc.d.f9945a;
                        String c8 = d2.i.c();
                        String d13 = d2.i.d();
                        obj2 = null;
                        this.f3165e = null;
                        this.f3164d = 3;
                        q02 = bVar4.q0(str2, c8, d13, str6, this);
                        if (q02 == aVar11) {
                            return aVar11;
                        }
                        intValue2 = ((Number) q02).intValue();
                        if (intValue2 == 401) {
                        }
                        return new Integer(intValue2);
                    }
                    h8.b.B(obj);
                    b10 = obj;
                }
                str = (String) b10;
                if (str == null) {
                    return new Integer(401);
                }
                this.f3165e = str;
                this.f3164d = 2;
                a10 = w.a(wVar, this);
                if (a10 == aVar11) {
                    return aVar11;
                }
                String str62 = str;
                str2 = (String) a10;
                if (str2 != null) {
                }
            case 7:
                lf.a aVar12 = lf.a.f20034a;
                int i29 = this.f3163c;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                na.b bVar5 = new na.b();
                String str8 = (String) this.f3166f;
                int i30 = this.f3164d;
                String str9 = gc.d.f9945a;
                String c10 = d2.i.c();
                String d14 = d2.i.d();
                this.f3163c = 1;
                Object z0 = bVar5.z0(str8, i30, c10, d14, this);
                return z0 == aVar12 ? aVar12 : z0;
            case 8:
                g0 g0Var2 = (g0) this.f3166f;
                lf.a aVar13 = lf.a.f20034a;
                int i31 = this.f3163c;
                if (i31 == 0) {
                    h8.b.B(obj);
                    fb.b bVar6 = new fb.b();
                    this.f3163c = 1;
                    C02 = bVar6.C0(this);
                    if (C02 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            h8.b.B(obj);
                            A5 = obj;
                            g0Var = g0Var2;
                            lVar = (l) A5;
                            httpException = lVar.getHttpException();
                            if (httpException == null && (msg4xx = httpException.getMsg4xx()) != null && (msg = msg4xx.getMsg()) != null) {
                                throw new Exception(msg);
                            }
                            if (lVar.getStatusCode() == 401) {
                                fb.b bVar7 = new fb.b();
                                this.f3165e = lVar;
                                this.f3163c = 3;
                                if (bVar7.A0(this) == aVar13) {
                                    return aVar13;
                                }
                            }
                            if (lVar.getStatusCode() == 200) {
                            }
                            return new Integer(lVar.getStatusCode());
                        }
                        if (i31 != 3) {
                            if (i31 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar2 = (l) this.f3165e;
                            h8.b.B(obj);
                            lVar = lVar2;
                            return new Integer(lVar.getStatusCode());
                        }
                        lVar = (l) this.f3165e;
                        h8.b.B(obj);
                        g0Var = g0Var2;
                        if (lVar.getStatusCode() == 200) {
                            List predictions = lVar.getPredictions();
                            if (predictions == null || predictions.isEmpty()) {
                                return new Integer(204);
                            }
                            List predictions2 = lVar.getPredictions();
                            this.f3165e = lVar;
                            this.f3163c = 4;
                            if (g0.a(g0Var, predictions2, this) == aVar13) {
                                return aVar13;
                            }
                            lVar2 = lVar;
                            lVar = lVar2;
                        }
                        return new Integer(lVar.getStatusCode());
                    }
                    h8.b.B(obj);
                    C02 = obj;
                }
                String str10 = (String) C02;
                if (str10 == null) {
                    return new Integer(401);
                }
                lg.e eVar8 = m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                i iVar = new i(g0Var2, str10, this.f3164d, (Continuation) null, 7);
                g0Var = g0Var2;
                this.f3163c = 2;
                A5 = c0.A(dVar3, iVar, this);
                if (A5 == aVar13) {
                    return aVar13;
                }
                lVar = (l) A5;
                httpException = lVar.getHttpException();
                if (httpException == null) {
                }
                if (lVar.getStatusCode() == 401) {
                }
                if (lVar.getStatusCode() == 200) {
                }
                return new Integer(lVar.getStatusCode());
            case 9:
                int i32 = this.f3164d;
                la.m0 m0Var = (la.m0) this.f3166f;
                lf.a aVar14 = lf.a.f20034a;
                int i33 = this.f3163c;
                if (i33 == 0) {
                    h8.b.B(obj);
                    fb.b bVar8 = new fb.b();
                    this.f3163c = 1;
                    C03 = bVar8.C0(this);
                    if (C03 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i33 != 1) {
                        if (i33 != 2) {
                            if (i33 != 3 && i33 != 4 && i33 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fVar = (a4.f) this.f3165e;
                            h8.b.B(obj);
                            r1 = fVar;
                            return new Integer(r1.getStatusCode());
                        }
                        h8.b.B(obj);
                        A6 = obj;
                        a4.f fVar2 = (a4.f) A6;
                        statusCode = fVar2.getStatusCode();
                        if (statusCode != 401) {
                            fb.b bVar9 = new fb.b();
                            this.f3165e = fVar2;
                            this.f3163c = 3;
                            if (bVar9.A0(this) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (statusCode != 204 && statusCode != 404) {
                                if (200 <= statusCode && statusCode < 400) {
                                    if (fVar2.getGamesData() == null && fVar2.getHomeTeamData() == null && fVar2.getGuestTeamData() == null) {
                                        gamesInfoData = null;
                                    } else {
                                        List gamesData = fVar2.getGamesData();
                                        if (gamesData != null) {
                                            arrayList = new ArrayList(v.k(gamesData, 10));
                                            Iterator it = gamesData.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(la.m0.c((a4.c) it.next()));
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        a4.d homeTeamData = fVar2.getHomeTeamData();
                                        LastGames d15 = homeTeamData != null ? la.m0.d(homeTeamData) : null;
                                        a4.d guestTeamData = fVar2.getGuestTeamData();
                                        gamesInfoData = new GamesInfoData(arrayList, d15, guestTeamData != null ? la.m0.d(guestTeamData) : null);
                                    }
                                    if (gamesInfoData != null) {
                                        String f6 = new com.google.gson.j().f(gamesInfoData, new TypeToken<GamesInfoData>() { // from class: com.sports.insider.data.repository.PredictionRepository$predictionInfo$2$type$1
                                        }.getType());
                                        Intrinsics.checkNotNull(f6);
                                        this.f3165e = fVar2;
                                        this.f3163c = 5;
                                        if (la.m0.a(m0Var, i32, f6, this) == aVar14) {
                                            return aVar14;
                                        }
                                    }
                                }
                                return new Integer(fVar2.getStatusCode());
                            }
                            this.f3165e = fVar2;
                            this.f3163c = 4;
                            if (la.m0.a(m0Var, i32, "", this) == aVar14) {
                                return aVar14;
                            }
                        }
                        fVar = fVar2;
                        fVar2 = fVar;
                        return new Integer(fVar2.getStatusCode());
                    }
                    h8.b.B(obj);
                    C03 = obj;
                }
                String str11 = (String) C03;
                if (str11 == null) {
                    return new Integer(401);
                }
                na.b bVar10 = new na.b();
                int i34 = this.f3164d;
                String str12 = gc.d.f9945a;
                String c11 = d2.i.c();
                String d16 = d2.i.d();
                this.f3163c = 2;
                lg.e eVar9 = m0.f9201a;
                A6 = c0.A(lg.d.f20063c, new sa.a(bVar10, c11, d16, str11, i34, null, 0), this);
                if (A6 == aVar14) {
                    return aVar14;
                }
                a4.f fVar22 = (a4.f) A6;
                statusCode = fVar22.getStatusCode();
                if (statusCode != 401) {
                }
                fVar = fVar22;
                fVar22 = fVar;
                return new Integer(fVar22.getStatusCode());
            case 10:
                lf.a aVar15 = lf.a.f20034a;
                int i35 = this.f3163c;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                na.b bVar11 = new na.b();
                String str13 = gc.d.f9945a;
                String c12 = d2.i.c();
                String d17 = d2.i.d();
                String str14 = (String) this.f3166f;
                int i36 = this.f3164d;
                this.f3163c = 1;
                Object A0 = bVar11.A0(str14, i36, c12, d17, this);
                return A0 == aVar15 ? aVar15 : A0;
            case 11:
                s0 s0Var2 = (s0) this.f3166f;
                lf.a aVar16 = lf.a.f20034a;
                int i37 = this.f3163c;
                Continuation continuation3 = null;
                try {
                } catch (Exception e11) {
                    if (!(e11 instanceof CancellationException) && !(e11 instanceof nh.a) && !(e11 instanceof nh.d0) && !(e11 instanceof ConnectException) && !(e11 instanceof SocketException) && !(e11 instanceof SSLPeerUnverifiedException) && !(e11 instanceof SSLHandshakeException) && !(e11 instanceof SSLException) && !(e11 instanceof TimeoutException) && !(e11 instanceof SocketTimeoutException) && !(e11 instanceof UnknownHostException) && !(e11 instanceof IOException)) {
                        zc.d.b(4, "downloadPrediction", e11);
                    }
                }
                if (i37 == 0) {
                    h8.b.B(obj);
                    fb.b bVar12 = new fb.b();
                    this.f3163c = 1;
                    C04 = bVar12.C0(this);
                    if (C04 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i37 != 1) {
                        if (i37 == 2) {
                            h8.b.B(obj);
                            A7 = obj;
                            s0Var = s0Var2;
                            continuation = null;
                            lVar3 = (l) A7;
                            if (lVar3.getStatusCode() == 401) {
                                fb.b bVar13 = new fb.b();
                                this.f3165e = lVar3;
                                this.f3163c = 3;
                                if (bVar13.A0(this) == aVar16) {
                                    return aVar16;
                                }
                            }
                            if (lVar3.getStatusCode() == 200) {
                            }
                            i13 = lVar3.getStatusCode();
                            return new Integer(i13);
                        }
                        if (i37 != 3) {
                            if (i37 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar4 = (l) this.f3165e;
                            h8.b.B(obj);
                            lVar3 = lVar4;
                            i13 = lVar3.getStatusCode();
                            return new Integer(i13);
                        }
                        lVar3 = (l) this.f3165e;
                        h8.b.B(obj);
                        s0Var = s0Var2;
                        continuation = null;
                        if (lVar3.getStatusCode() == 200) {
                            List predictions3 = lVar3.getPredictions();
                            if (predictions3 != null && !predictions3.isEmpty()) {
                                List predictions4 = lVar3.getPredictions();
                                this.f3165e = lVar3;
                                this.f3163c = 4;
                                lg.e eVar10 = m0.f9201a;
                                if (c0.A(lg.d.f20063c, new la.f(predictions4, s0Var, continuation, i16), this) == aVar16) {
                                    return aVar16;
                                }
                                lVar4 = lVar3;
                                lVar3 = lVar4;
                            }
                            return new Integer(204);
                        }
                        i13 = lVar3.getStatusCode();
                        return new Integer(i13);
                    }
                    h8.b.B(obj);
                    C04 = obj;
                }
                String str15 = (String) C04;
                if (str15 == null) {
                    return new Integer(401);
                }
                lg.e eVar11 = m0.f9201a;
                lg.d dVar4 = lg.d.f20063c;
                i iVar2 = new i(s0Var2, str15, this.f3164d, continuation3, 10);
                s0Var = s0Var2;
                continuation = null;
                this.f3163c = 2;
                A7 = c0.A(dVar4, iVar2, this);
                if (A7 == aVar16) {
                    return aVar16;
                }
                lVar3 = (l) A7;
                if (lVar3.getStatusCode() == 401) {
                }
                if (lVar3.getStatusCode() == 200) {
                }
                i13 = lVar3.getStatusCode();
                return new Integer(i13);
            case 12:
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                LivePayFragment livePayFragment = (LivePayFragment) this.f3165e;
                ec.c0 c0Var = (ec.c0) livePayFragment.f22459a;
                if (c0Var != null) {
                    CustomGradientButton customGradientButton = c0Var.f8888d;
                    DisplayMetrics displayMetrics = customGradientButton.F;
                    if (displayMetrics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("metrics");
                        displayMetrics = null;
                    }
                    Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
                    int i38 = Build.VERSION.SDK_INT;
                    customGradientButton.f7327s = i38 >= 34 ? TypedValue.applyDimension(2, 19.0f, displayMetrics) : displayMetrics.scaledDensity * 19.0f;
                    DisplayMetrics displayMetrics2 = customGradientButton.F;
                    if (displayMetrics2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("metrics");
                        displayMetrics2 = null;
                    }
                    Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
                    customGradientButton.f7328t = i38 >= 34 ? TypedValue.applyDimension(2, 12.0f, displayMetrics2) : displayMetrics2.scaledDensity * 12.0f;
                    customGradientButton.requestLayout();
                    customGradientButton.invalidate();
                }
                ec.c0 c0Var2 = (ec.c0) livePayFragment.f22459a;
                if (c0Var2 != null) {
                    c0Var2.f8888d.d(this.f3163c, this.f3164d);
                }
                ec.c0 c0Var3 = (ec.c0) livePayFragment.f22459a;
                if (c0Var3 == null) {
                    return null;
                }
                c0Var3.f8888d.setButtonText((String) this.f3166f);
                return Unit.f19194a;
            case 13:
                lf.a aVar18 = lf.a.f20034a;
                int i39 = this.f3164d;
                if (i39 == 0) {
                    h8.b.B(obj);
                    try {
                        i14 = aa.b.p((Context) this.f3165e);
                    } catch (Exception unused4) {
                    }
                    lg.e eVar12 = m0.f9201a;
                    fg.e eVar13 = q.f18523a;
                    n nVar = new n((LivePayFragment) this.f3166f, i14, (Continuation) null);
                    this.f3163c = i14;
                    this.f3164d = 1;
                    if (c0.A(eVar13, nVar, this) == aVar18) {
                        return aVar18;
                    }
                    i5 = i14;
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.f3163c;
                    h8.b.B(obj);
                }
                return new Integer(i5);
            case 14:
                return c(obj);
            case 15:
                lf.a aVar19 = lf.a.f20034a;
                int i40 = this.f3164d;
                if (i40 == 0) {
                    h8.b.B(obj);
                    try {
                        i14 = aa.b.p((Context) this.f3165e);
                    } catch (Exception unused5) {
                    }
                    float f10 = i14;
                    lg.e eVar14 = m0.f9201a;
                    fg.e eVar15 = q.f18523a;
                    j0 j0Var = new j0((PayExpressFragment) this.f3166f, (int) ((f10 * 0.5f) + f10), i14, (Continuation) null);
                    this.f3163c = i14;
                    this.f3164d = 1;
                    if (c0.A(eVar15, j0Var, this) == aVar19) {
                        return aVar19;
                    }
                    i10 = i14;
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f3163c;
                    h8.b.B(obj);
                }
                return new Integer(i10);
            case 16:
                return e(obj);
            case 17:
                lf.a aVar20 = lf.a.f20034a;
                int i41 = this.f3164d;
                if (i41 == 0) {
                    h8.b.B(obj);
                    try {
                        i14 = aa.b.p((Context) this.f3165e);
                    } catch (Exception unused6) {
                    }
                    float f11 = i14;
                    lg.e eVar16 = m0.f9201a;
                    fg.e eVar17 = q.f18523a;
                    p1 p1Var = new p1((PayPremiumFragment) this.f3166f, (int) ((f11 * 0.5f) + f11), i14, (Continuation) null);
                    this.f3163c = i14;
                    this.f3164d = 1;
                    if (c0.A(eVar17, p1Var, this) == aVar20) {
                        return aVar20;
                    }
                    i11 = i14;
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f3163c;
                    h8.b.B(obj);
                }
                return new Integer(i11);
            case 18:
                return g(obj);
            case 19:
                return h(obj);
            case 20:
                return j(obj);
            case 21:
                return k(obj);
            default:
                p pVar = (p) this.f3165e;
                wc.i iVar3 = pVar.A;
                lf.a aVar21 = lf.a.f20034a;
                int i42 = this.f3164d;
                if (i42 == 0) {
                    h8.b.B(obj);
                    this.f3164d = 1;
                    if (c0.j(2000L, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i42 != 1) {
                        if (i42 == 2) {
                            h8.b.B(obj);
                            A8 = obj;
                            intValue3 = 3;
                            continuation2 = (String) A8;
                            ?? r20 = continuation2;
                            Activity activity = (Activity) this.f3166f;
                            this.f3163c = intValue3;
                            this.f3164d = 3;
                            lg.e eVar18 = m0.f9201a;
                            int i43 = intValue3;
                            A9 = c0.A(q.f18523a, new cd.j(pVar, i43, activity, (String) r20, (Continuation) null, 11), this);
                            if (A9 != aVar21) {
                                A9 = Unit.f19194a;
                            }
                            if (A9 == aVar21) {
                                return aVar21;
                            }
                            i12 = i43;
                            this.f3163c = i12;
                            this.f3164d = 4;
                            e7 = iVar3.e(this);
                            if (e7 == aVar21) {
                            }
                            if (((Boolean) e7).booleanValue()) {
                            }
                            return Unit.f19194a;
                        }
                        if (i42 == 3) {
                            i12 = this.f3163c;
                            h8.b.B(obj);
                            this.f3163c = i12;
                            this.f3164d = 4;
                            e7 = iVar3.e(this);
                            if (e7 == aVar21) {
                                return aVar21;
                            }
                            if (((Boolean) e7).booleanValue()) {
                            }
                            return Unit.f19194a;
                        }
                        if (i42 != 4) {
                            if (i42 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        i12 = this.f3163c;
                        h8.b.B(obj);
                        e7 = obj;
                        if (((Boolean) e7).booleanValue()) {
                            m7.b bVar14 = new m7.b();
                            this.f3163c = i12;
                            this.f3164d = 5;
                            if (bVar14.b(true, this) == aVar21) {
                                return aVar21;
                            }
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                iVar3.getClass();
                wc.i.a().getClass();
                if (((Number) u.n().f25819b.getValue()).intValue() != 3) {
                    iVar3.getClass();
                    intValue3 = ((Number) wc.i.a().f21720v.getValue()).intValue();
                    if (-1 <= intValue3 && intValue3 < 2) {
                        return Unit.f19194a;
                    }
                    ?? r202 = continuation2;
                    Activity activity2 = (Activity) this.f3166f;
                    this.f3163c = intValue3;
                    this.f3164d = 3;
                    lg.e eVar182 = m0.f9201a;
                    int i432 = intValue3;
                    A9 = c0.A(q.f18523a, new cd.j(pVar, i432, activity2, (String) r202, (Continuation) null, 11), this);
                    if (A9 != aVar21) {
                    }
                    if (A9 == aVar21) {
                    }
                } else {
                    zc.j jVar3 = new zc.j();
                    this.f3164d = 2;
                    lg.e eVar19 = m0.f9201a;
                    A8 = c0.A(lg.d.f20063c, new r(jVar3, continuation2, 17), this);
                    if (A8 == aVar21) {
                        return aVar21;
                    }
                    intValue3 = 3;
                    continuation2 = (String) A8;
                    ?? r2022 = continuation2;
                    Activity activity22 = (Activity) this.f3166f;
                    this.f3163c = intValue3;
                    this.f3164d = 3;
                    lg.e eVar1822 = m0.f9201a;
                    int i4322 = intValue3;
                    A9 = c0.A(q.f18523a, new cd.j(pVar, i4322, activity22, (String) r2022, (Continuation) null, 11), this);
                    if (A9 != aVar21) {
                    }
                    if (A9 == aVar21) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i5, Integer num, cd.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f3162b = 1;
        this.f3164d = i5;
        this.f3165e = num;
        this.f3166f = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i5, String str, Continuation continuation) {
        super(2, continuation);
        this.f3162b = 20;
        this.f3164d = i5;
        this.f3166f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i5, int i10, String str, Continuation continuation, int i11) {
        super(2, continuation);
        this.f3162b = i11;
        this.f3165e = obj;
        this.f3163c = i5;
        this.f3164d = i10;
        this.f3166f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i5, Object obj2, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3162b = i10;
        this.f3165e = obj;
        this.f3164d = i5;
        this.f3166f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3162b = i5;
        this.f3165e = obj;
        this.f3166f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, String str, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3162b = i10;
        this.f3165e = obj;
        this.f3166f = str;
        this.f3164d = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f3162b = 6;
        this.f3166f = wVar;
    }
}
