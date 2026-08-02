package je;

import com.sports.insider.R;
import eg.b2;
import eg.c0;
import eg.m0;
import eg.z;
import fd.d;
import hg.d1;
import hg.t0;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLHandshakeException;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.j1;
import lg.e;
import md.f;
import md.m;
import me.y;
import mf.i;
import org.json.JSONObject;
import pd.s;
import rc.g;
import rc.p;
import rc.r;
import rc.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18461b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18462c;

    /* renamed from: d, reason: collision with root package name */
    public int f18463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f18461b = i5;
        this.f18464e = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f18461b) {
            case 0:
                return new a((b) this.f18464e, this.f18462c, continuation, 0);
            case 1:
                return new a((m) this.f18464e, continuation, 1);
            case 2:
                return new a((com.sports.insider.ui.activities.a) this.f18464e, continuation, 2);
            case 3:
                return new a((g) this.f18464e, this.f18462c, continuation, 3);
            default:
                return new a((r) this.f18464e, this.f18462c, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f18461b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0 A[Catch: Exception -> 0x0105, TRY_ENTER, TryCatch #2 {Exception -> 0x0105, blocks: (B:51:0x00bd, B:52:0x0102, B:65:0x00f0), top: B:39:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0187 A[Catch: all -> 0x014b, TryCatch #1 {all -> 0x014b, blocks: (B:90:0x0147, B:92:0x0194, B:95:0x014d, B:96:0x017f, B:98:0x0187, B:103:0x0151, B:104:0x016f, B:109:0x0158, B:115:0x016a), top: B:78:0x0130 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        boolean z5;
        com.google.android.play.core.appupdate.a aVar;
        boolean z7;
        boolean booleanValue2;
        ?? r32 = 2;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i5 = 1;
        switch (this.f18461b) {
            case 0:
                b bVar = (b) this.f18464e;
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f18463d;
                try {
                    try {
                        if (i10 == 0) {
                            h8.b.B(obj);
                            bVar.f18466c.h(Boolean.TRUE);
                            d dVar = (d) bVar.f18471h.getValue();
                            boolean z15 = this.f18462c;
                            this.f18463d = 1;
                            obj = dVar.b(z15, this);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                        }
                        List list = (List) obj;
                        if (list != null && !list.isEmpty()) {
                            d1 d1Var = bVar.f18468e;
                            d1Var.getClass();
                            d1Var.k(null, list);
                        }
                    } catch (CancellationException unused) {
                    } catch (Exception e7) {
                        t0 t0Var = x.f22455a;
                        x.a(R.string.error_loading_news, true);
                        zc.d.b(4, "loadNVM", e7);
                    }
                    return Unit.f19194a;
                } finally {
                    bVar.f18466c.h(Boolean.FALSE);
                }
            case 1:
                m mVar = (m) this.f18464e;
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f18463d;
                try {
                } catch (Throwable th2) {
                    if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectException) && !(th2 instanceof SocketException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof SSLHandshakeException)) {
                        zc.d.b(4, "downloadMessages", th2);
                    }
                    this.f18463d = 4;
                    if (m.a(mVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f18463d = 1;
                    e eVar = m0.f9201a;
                    Object A = c0.A(lg.d.f20063c, new f(i5, z10 ? 1 : 0, mVar), this);
                    if (A != aVar3) {
                        A = Unit.f19194a;
                    }
                    if (A == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                return Boolean.FALSE;
                            }
                            z5 = this.f18462c;
                            h8.b.B(obj);
                            booleanValue = z5;
                            return Boolean.valueOf(booleanValue);
                        }
                        h8.b.B(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (!booleanValue) {
                            this.f18462c = booleanValue;
                            this.f18463d = 3;
                            if (m.a(mVar, this) == aVar3) {
                                return aVar3;
                            }
                            z5 = booleanValue;
                            booleanValue = z5;
                        }
                        return Boolean.valueOf(booleanValue);
                    }
                    h8.b.B(obj);
                }
                mVar.getClass();
                j1 g10 = m.g();
                this.f18463d = 2;
                obj = g10.d(this);
                if (obj == aVar3) {
                    return aVar3;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                }
                return Boolean.valueOf(booleanValue);
            case 2:
                com.sports.insider.ui.activities.a aVar4 = (com.sports.insider.ui.activities.a) this.f18464e;
                lf.a aVar5 = lf.a.f20034a;
                int i12 = this.f18463d;
                try {
                } catch (Exception unused2) {
                    aVar = null;
                    z7 = r32;
                }
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f18463d = 1;
                    if (c0.j(1000L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            h8.b.B(obj);
                            booleanValue2 = ((Boolean) obj).booleanValue();
                            if (booleanValue2) {
                                s sVar = new s(i5, aVar4, z11 ? 1 : 0);
                                this.f18462c = booleanValue2;
                                this.f18463d = 3;
                                obj = b2.b(3000L, sVar, this);
                                r32 = booleanValue2;
                                if (obj == aVar5) {
                                    return aVar5;
                                }
                                aVar = (com.google.android.play.core.appupdate.a) obj;
                                z7 = r32;
                                if (aVar != null) {
                                }
                            }
                            return Unit.f19194a;
                        }
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        boolean z16 = this.f18462c;
                        h8.b.B(obj);
                        r32 = z16;
                        aVar = (com.google.android.play.core.appupdate.a) obj;
                        z7 = r32;
                        if (aVar != null) {
                            return Unit.f19194a;
                        }
                        if (aVar.f5989b == 3) {
                            e eVar2 = m0.f9201a;
                            fg.e eVar3 = q.f18523a;
                            y yVar = new y(aVar4, aVar, z12 ? 1 : 0, 8);
                            this.f18462c = z7;
                            this.f18463d = 4;
                            if (c0.A(eVar3, yVar, this) == aVar5) {
                                return aVar5;
                            }
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                int i13 = com.sports.insider.ui.activities.a.G;
                io.sentry.util.network.b bVar2 = new io.sentry.util.network.b(7);
                this.f18463d = 2;
                obj = bVar2.i(this);
                if (obj == aVar5) {
                    return aVar5;
                }
                booleanValue2 = ((Boolean) obj).booleanValue();
                if (booleanValue2) {
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar6 = lf.a.f20034a;
                int i14 = this.f18463d;
                if (i14 == 0) {
                    h8.b.B(obj);
                    g gVar = (g) this.f18464e;
                    JSONObject put = this.f18462c ? new JSONObject().put("onClick", "Начать") : null;
                    this.f18463d = 1;
                    if (gVar.e("stat", put, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                boolean z17 = this.f18462c;
                r rVar = (r) this.f18464e;
                lf.a aVar7 = lf.a.f20034a;
                int i15 = this.f18463d;
                if (i15 == 0) {
                    h8.b.B(obj);
                    String str = gc.d.f9945a;
                    String c2 = d2.i.c();
                    if (z17) {
                        this.f18463d = 1;
                        obj = c0.i(new p(c2, rVar, z14 ? 1 : 0, i5), this);
                        if (obj == aVar7) {
                            return aVar7;
                        }
                    } else {
                        this.f18463d = 2;
                        obj = c0.i(new p(c2, rVar, z13 ? 1 : 0, 0), this);
                        if (obj == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i15 != 1 && i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                if (booleanValue3) {
                    r.d().b("push_on_channel_live_passed", z17);
                }
                return Boolean.valueOf(booleanValue3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, boolean z5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f18461b = i5;
        this.f18464e = obj;
        this.f18462c = z5;
    }
}
