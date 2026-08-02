package rc;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import te.h0;
import te.l0;
import wc.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22403b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f22404c;

    /* renamed from: d, reason: collision with root package name */
    public long f22405d;

    /* renamed from: e, reason: collision with root package name */
    public int f22406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f22407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f22408g;

    /* renamed from: h, reason: collision with root package name */
    public Object f22409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f22410i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, g gVar, String str2, long j, Continuation continuation) {
        super(2, continuation);
        this.f22407f = str;
        this.f22410i = gVar;
        this.f22408g = str2;
        this.f22405d = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22403b) {
            case 0:
                return new f(this.f22407f, (g) this.f22410i, this.f22408g, this.f22405d, continuation);
            default:
                return new f((l0) this.f22409h, this.f22407f, this.f22408g, (String) this.f22410i, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22403b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        Object l6;
        Object j;
        w0 w0Var2;
        String str;
        Object i5;
        Object k6;
        String b02;
        Object A;
        String b03;
        Object e7;
        long longValue;
        Object A2;
        long j6;
        int i10 = this.f22403b;
        String str2 = this.f22407f;
        Continuation continuation = null;
        Object obj2 = this.f22410i;
        int i11 = 1;
        int i12 = 3;
        int i13 = 2;
        switch (i10) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i14 = this.f22406e;
                if (i14 == 0) {
                    h8.b.B(obj);
                    w0Var = new w0();
                    this.f22409h = w0Var;
                    this.f22406e = 1;
                    l6 = w0Var.l(str2, this);
                    if (l6 == aVar) {
                        return aVar;
                    }
                } else if (i14 == 1) {
                    w0Var = (w0) this.f22409h;
                    h8.b.B(obj);
                    l6 = obj;
                } else if (i14 == 2) {
                    str = this.f22404c;
                    w0Var2 = (w0) this.f22409h;
                    h8.b.B(obj);
                    j = obj;
                    if (((Boolean) j).booleanValue()) {
                        str = "express_sub";
                    }
                    this.f22409h = w0Var2;
                    this.f22404c = str;
                    this.f22406e = 3;
                    i5 = w0Var2.i(str2, this);
                    if (i5 == aVar) {
                        return aVar;
                    }
                    if (((Boolean) i5).booleanValue()) {
                    }
                    this.f22409h = null;
                    this.f22404c = str;
                    this.f22406e = 4;
                    k6 = w0Var2.k(str2, this);
                    if (k6 == aVar) {
                    }
                    if (((Boolean) k6).booleanValue()) {
                    }
                    if (str != null) {
                    }
                } else {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        String str3 = this.f22404c;
                        h8.b.B(obj);
                        str = str3;
                        k6 = obj;
                        if (((Boolean) k6).booleanValue()) {
                            str = "live_sub";
                        }
                        if (str != null) {
                            return Unit.f19194a;
                        }
                        JSONObject put = new JSONObject(this.f22408g).put("purchaseDate", io.sentry.config.a.u(this.f22405d));
                        this.f22409h = null;
                        this.f22404c = null;
                        this.f22406e = 5;
                        if (((g) obj2).e(str, put, this) == aVar) {
                            return aVar;
                        }
                        return Unit.f19194a;
                    }
                    str = this.f22404c;
                    w0Var2 = (w0) this.f22409h;
                    h8.b.B(obj);
                    i5 = obj;
                    if (((Boolean) i5).booleanValue()) {
                        str = "diamond_sub";
                    }
                    this.f22409h = null;
                    this.f22404c = str;
                    this.f22406e = 4;
                    k6 = w0Var2.k(str2, this);
                    if (k6 == aVar) {
                        return aVar;
                    }
                    if (((Boolean) k6).booleanValue()) {
                    }
                    if (str != null) {
                    }
                }
                String str4 = ((Boolean) l6).booleanValue() ? "Start_Trial" : null;
                this.f22409h = w0Var;
                this.f22404c = str4;
                this.f22406e = 2;
                j = w0Var.j(str2, this);
                if (j == aVar) {
                    return aVar;
                }
                String str5 = str4;
                w0Var2 = w0Var;
                str = str5;
                if (((Boolean) j).booleanValue()) {
                }
                this.f22409h = w0Var2;
                this.f22404c = str;
                this.f22406e = 3;
                i5 = w0Var2.i(str2, this);
                if (i5 == aVar) {
                }
                if (((Boolean) i5).booleanValue()) {
                }
                this.f22409h = null;
                this.f22404c = str;
                this.f22406e = 4;
                k6 = w0Var2.k(str2, this);
                if (k6 == aVar) {
                }
                if (((Boolean) k6).booleanValue()) {
                }
                if (str != null) {
                }
            default:
                String str6 = (String) obj2;
                l0 l0Var = (l0) this.f22409h;
                md.m mVar = l0Var.f23900d;
                lf.a aVar2 = lf.a.f20034a;
                int i15 = this.f22406e;
                String str7 = this.f22408g;
                if (i15 == 0) {
                    h8.b.B(obj);
                    b02 = (str2 == null || (b03 = StringsKt.b0(str2, ' ', '\n')) == null) ? null : StringsKt.b0(b03, ' ', '\n');
                    if (b02 == null || b02.length() == 0) {
                        b02 = null;
                    }
                    if (b02 == null || b02.length() == 0) {
                        return new Long(-1L);
                    }
                    if (str7 != null) {
                        this.f22404c = b02;
                        this.f22406e = 1;
                        mVar.getClass();
                        lg.e eVar = m0.f9201a;
                        A = c0.A(lg.d.f20063c, new ab.b(str7, mVar, (Continuation) null), this);
                        if (A == aVar2) {
                            return aVar2;
                        }
                    }
                    c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), continuation, i12), 2);
                    this.f22404c = b02;
                    this.f22406e = 3;
                    e7 = mVar.e(b02, str6, str7, this);
                    if (e7 == aVar2) {
                        return aVar2;
                    }
                    String str8 = b02;
                    longValue = ((Number) e7).longValue();
                    this.f22404c = null;
                    this.f22405d = longValue;
                    this.f22406e = 4;
                    if (longValue <= 0) {
                    }
                    if (A2 == aVar2) {
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            h8.b.B(obj);
                            return new Long(-2L);
                        }
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = this.f22405d;
                            h8.b.B(obj);
                            return new Long(j6);
                        }
                        b02 = this.f22404c;
                        h8.b.B(obj);
                        e7 = obj;
                        String str82 = b02;
                        longValue = ((Number) e7).longValue();
                        this.f22404c = null;
                        this.f22405d = longValue;
                        this.f22406e = 4;
                        if (longValue <= 0) {
                            A2 = Unit.f19194a;
                        } else {
                            mVar.getClass();
                            c0.t(MyApp.f6830c, mVar.f20574c, null, new la.f(mVar, (int) longValue, str82, str7, str6, null), 2);
                            A2 = c0.A(jg.q.f18523a, new h0(l0Var, continuation, i13), this);
                            if (A2 != aVar2) {
                                A2 = Unit.f19194a;
                            }
                        }
                        if (A2 == aVar2) {
                            return aVar2;
                        }
                        j6 = longValue;
                        return new Long(j6);
                    }
                    b02 = this.f22404c;
                    h8.b.B(obj);
                    A = obj;
                }
                if (!((Boolean) A).booleanValue()) {
                    lg.e eVar2 = m0.f9201a;
                    fg.e eVar3 = jg.q.f18523a;
                    h0 h0Var = new h0(l0Var, continuation, i11);
                    this.f22404c = null;
                    this.f22406e = 2;
                    if (c0.A(eVar3, h0Var, this) == aVar2) {
                        return aVar2;
                    }
                    return new Long(-2L);
                }
                c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), continuation, i12), 2);
                this.f22404c = b02;
                this.f22406e = 3;
                e7 = mVar.e(b02, str6, str7, this);
                if (e7 == aVar2) {
                }
                String str822 = b02;
                longValue = ((Number) e7).longValue();
                this.f22404c = null;
                this.f22405d = longValue;
                this.f22406e = 4;
                if (longValue <= 0) {
                }
                if (A2 == aVar2) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l0 l0Var, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f22409h = l0Var;
        this.f22407f = str;
        this.f22408g = str2;
        this.f22410i = str3;
    }
}
