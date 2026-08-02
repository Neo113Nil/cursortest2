package ig;

import eg.c0;
import eg.m0;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.e1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11271b;

    /* renamed from: c, reason: collision with root package name */
    public int f11272c;

    /* renamed from: d, reason: collision with root package name */
    public int f11273d;

    /* renamed from: e, reason: collision with root package name */
    public int f11274e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11275f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11276g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f11278i;
    public final /* synthetic */ Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Serializable f11279k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f11280l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Serializable serializable, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f11271b = i5;
        this.f11278i = obj;
        this.j = obj2;
        this.f11279k = serializable;
        this.f11280l = obj3;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11271b) {
            case 0:
                o oVar = new o((hg.g[]) this.f11278i, (i3.i) this.j, (i3.j) this.f11279k, (hg.h) this.f11280l, continuation, 0);
                oVar.f11277h = obj;
                return oVar;
            default:
                return new o((e1) this.f11278i, (String) this.j, (String) this.f11279k, (String) this.f11280l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f11271b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a7, code lost:
    
        if (r8 != 0) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e A[LOOP:0: B:91:0x025e->B:101:0x0281, LOOP_START, PHI: r8 r15
      0x025e: PHI (r8v5 int) = (r8v4 int), (r8v6 int) binds: [B:88:0x0259, B:101:0x0281] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r15v7 kotlin.collections.IndexedValue) = (r15v6 kotlin.collections.IndexedValue), (r15v10 kotlin.collections.IndexedValue) binds: [B:88:0x0259, B:101:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02a4 -> B:74:0x02a7). Please report as a decompilation issue!!! */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        byte[] bArr;
        int i5;
        int i10;
        gg.l lVar;
        Object obj2;
        IndexedValue indexedValue;
        Object C0;
        String str;
        int i11;
        Object A;
        ha.a aVar;
        ha.d dVar;
        ha.a aVar2;
        int i12;
        ha.a aVar3;
        Object A2;
        e1 e1Var;
        Object A3;
        int i13 = this.f11271b;
        Object obj3 = this.f11280l;
        Serializable serializable = this.f11279k;
        Object obj4 = this.j;
        int i14 = 1;
        Continuation continuation = null;
        ha.a aVar4 = null;
        continuation = null;
        continuation = null;
        int i15 = 0;
        Object obj5 = this.f11278i;
        switch (i13) {
            case 0:
                Object obj6 = (hg.h) obj3;
                i3.j jVar = (i3.j) serializable;
                com.android.billingclient.api.a aVar5 = c.f11246c;
                Object obj7 = lf.a.f20034a;
                int i16 = this.f11274e;
                if (i16 == 0) {
                    h8.b.B(obj);
                    eg.z zVar = (eg.z) this.f11277h;
                    int length = ((hg.g[]) obj5).length;
                    if (length == 0) {
                        return Unit.f19194a;
                    }
                    objArr = new Object[length];
                    kotlin.collections.o.k(objArr, aVar5, 0, length);
                    gg.h a7 = k2.x.a(length, 6, null);
                    AtomicInteger atomicInteger = new AtomicInteger(length);
                    int i17 = 0;
                    while (i17 < length) {
                        int i18 = i17;
                        c0.t(zVar, null, null, new cd.j((hg.g[]) obj5, i18, atomicInteger, a7, null), 3);
                        i17 = i18 + 1;
                    }
                    bArr = new byte[length];
                    i5 = 0;
                    i10 = length;
                    lVar = a7;
                } else if (i16 == 1) {
                    i5 = this.f11273d;
                    i10 = this.f11272c;
                    bArr = (byte[]) this.f11276g;
                    lVar = (gg.l) this.f11275f;
                    objArr = (Object[]) this.f11277h;
                    h8.b.B(obj);
                    obj2 = ((gg.o) obj).f10095a;
                    if (obj2 instanceof gg.n) {
                        obj2 = continuation;
                    }
                    indexedValue = (IndexedValue) obj2;
                    if (indexedValue != null) {
                        return Unit.f19194a;
                    }
                    while (true) {
                        int i19 = indexedValue.f19195a;
                        Object obj8 = objArr[i19];
                        objArr[i19] = indexedValue.f19196b;
                        if (obj8 == aVar5) {
                            i10--;
                        }
                        if (bArr[i19] != i5) {
                            bArr[i19] = (byte) i5;
                            Object e7 = lVar.e();
                            if (e7 instanceof gg.n) {
                                e7 = null;
                            }
                            indexedValue = (IndexedValue) e7;
                            if (indexedValue != null) {
                            }
                        }
                        if (i10 == 0) {
                            i3.c[] cVarArr = new i3.c[((hg.g[]) ((i3.i) obj4).f10918b).length];
                            kotlin.collections.o.g(0, 0, 14, objArr, cVarArr);
                            this.f11277h = objArr;
                            this.f11275f = lVar;
                            this.f11276g = bArr;
                            this.f11272c = i10;
                            this.f11273d = i5;
                            this.f11274e = 3;
                            if (jVar.invoke(obj6, cVarArr, this) == obj7) {
                                return obj7;
                            }
                        }
                    }
                    i14 = 1;
                    continuation = null;
                } else if (i16 == 2) {
                    i5 = this.f11273d;
                    i10 = this.f11272c;
                    bArr = (byte[]) this.f11276g;
                    lVar = (gg.l) this.f11275f;
                    objArr = (Object[]) this.f11277h;
                    h8.b.B(obj);
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.f11273d;
                    i10 = this.f11272c;
                    bArr = (byte[]) this.f11276g;
                    lVar = (gg.l) this.f11275f;
                    objArr = (Object[]) this.f11277h;
                    h8.b.B(obj);
                    i14 = 1;
                    continuation = null;
                }
                i5 = (byte) (i5 + i14);
                this.f11277h = objArr;
                this.f11275f = lVar;
                this.f11276g = bArr;
                this.f11272c = i10;
                this.f11273d = i5;
                this.f11274e = i14;
                obj2 = lVar.b(this);
                if (obj2 == obj7) {
                    return obj7;
                }
                if (obj2 instanceof gg.n) {
                }
                indexedValue = (IndexedValue) obj2;
                if (indexedValue != null) {
                }
                break;
            default:
                e1 e1Var2 = (e1) obj5;
                lf.a aVar6 = lf.a.f20034a;
                switch (this.f11274e) {
                    case 0:
                        h8.b.B(obj);
                        bb.b bVar = new bb.b();
                        this.f11274e = 1;
                        C0 = bVar.C0(this);
                        if (C0 == aVar6) {
                            return aVar6;
                        }
                        str = (String) C0;
                        if (str != null) {
                            return new Integer(401);
                        }
                        lg.e eVar = m0.f9201a;
                        lg.d dVar2 = lg.d.f20063c;
                        i11 = 401;
                        c4.u uVar = new c4.u(e1Var2, str, (String) obj4, (String) serializable, (String) obj3, null, 2);
                        this.f11274e = 2;
                        A = c0.A(dVar2, uVar, this);
                        if (A == aVar6) {
                            return aVar6;
                        }
                        aVar = (ha.a) A;
                        if (aVar != null) {
                            int i20 = aVar.f10431a;
                            if (i20 == 200) {
                                ha.d dVar3 = aVar.f10433c;
                                if (dVar3 != null) {
                                    bb.b bVar2 = new bb.b();
                                    int i21 = dVar3.f10457g;
                                    int i22 = dVar3.f10458h;
                                    this.f11275f = aVar;
                                    this.f11276g = e1Var2;
                                    this.f11277h = dVar3;
                                    this.f11272c = 0;
                                    this.f11273d = 0;
                                    this.f11274e = 4;
                                    if (bVar2.Q0(i21, i22, this) == aVar6) {
                                        return aVar6;
                                    }
                                    dVar = dVar3;
                                    aVar2 = aVar;
                                    i12 = 0;
                                    e1 e1Var3 = e1Var2;
                                    this.f11275f = aVar2;
                                    this.f11276g = e1Var3;
                                    this.f11277h = dVar;
                                    this.f11272c = i15;
                                    this.f11273d = i12;
                                    this.f11274e = 5;
                                    e1Var3.getClass();
                                    Long l6 = dVar.q;
                                    int longValue = (int) (l6 == null ? l6.longValue() : 0L);
                                    Long l10 = dVar.f10465p;
                                    int longValue2 = (int) (l10 == null ? l10.longValue() : 0L);
                                    Long l11 = dVar.f10464o;
                                    int longValue3 = (int) (l11 == null ? l11.longValue() : 0L);
                                    Long l12 = dVar.f10463n;
                                    int longValue4 = (int) (l12 == null ? l12.longValue() : 0L);
                                    lg.e eVar2 = m0.f9201a;
                                    A2 = c0.A(lg.d.f20063c, new cd.u(e1Var3, longValue, longValue2, longValue3, longValue4, null, 3), this);
                                    if (A2 != aVar6) {
                                        A2 = Unit.f19194a;
                                    }
                                    if (A2 != aVar6) {
                                        return aVar6;
                                    }
                                    e1Var = e1Var3;
                                    this.f11275f = aVar2;
                                    this.f11276g = null;
                                    this.f11277h = null;
                                    this.f11272c = i15;
                                    this.f11273d = i12;
                                    this.f11274e = 6;
                                    e1Var.getClass();
                                    lg.e eVar3 = m0.f9201a;
                                    A3 = c0.A(lg.d.f20063c, new hd.a(dVar, e1Var, continuation, 2), this);
                                    if (A3 != aVar6) {
                                        A3 = Unit.f19194a;
                                    }
                                    if (A3 != aVar6) {
                                        return aVar6;
                                    }
                                    aVar3 = aVar2;
                                    aVar4 = aVar3;
                                }
                            } else if (i20 == i11) {
                                bb.b bVar3 = new bb.b();
                                this.f11275f = aVar;
                                this.f11276g = null;
                                this.f11272c = 0;
                                this.f11274e = 3;
                                if (bVar3.A0(this) == aVar6) {
                                    return aVar6;
                                }
                                aVar3 = aVar;
                                aVar4 = aVar3;
                            }
                            aVar4 = aVar;
                        }
                        return new Integer(aVar4 != null ? aVar4.f10431a : 400);
                    case 1:
                        h8.b.B(obj);
                        C0 = obj;
                        str = (String) C0;
                        if (str != null) {
                        }
                        break;
                    case 2:
                        h8.b.B(obj);
                        A = obj;
                        i11 = 401;
                        aVar = (ha.a) A;
                        if (aVar != null) {
                        }
                        return new Integer(aVar4 != null ? aVar4.f10431a : 400);
                    case 3:
                    case 6:
                        aVar3 = (ha.a) this.f11275f;
                        h8.b.B(obj);
                        aVar4 = aVar3;
                        return new Integer(aVar4 != null ? aVar4.f10431a : 400);
                    case 4:
                        int i23 = this.f11273d;
                        int i24 = this.f11272c;
                        ha.d dVar4 = (ha.d) this.f11277h;
                        e1Var2 = (e1) this.f11276g;
                        ha.a aVar7 = (ha.a) this.f11275f;
                        h8.b.B(obj);
                        i15 = i24;
                        aVar2 = aVar7;
                        dVar = dVar4;
                        i12 = i23;
                        e1 e1Var32 = e1Var2;
                        this.f11275f = aVar2;
                        this.f11276g = e1Var32;
                        this.f11277h = dVar;
                        this.f11272c = i15;
                        this.f11273d = i12;
                        this.f11274e = 5;
                        e1Var32.getClass();
                        Long l62 = dVar.q;
                        int longValue5 = (int) (l62 == null ? l62.longValue() : 0L);
                        Long l102 = dVar.f10465p;
                        int longValue22 = (int) (l102 == null ? l102.longValue() : 0L);
                        Long l112 = dVar.f10464o;
                        int longValue32 = (int) (l112 == null ? l112.longValue() : 0L);
                        Long l122 = dVar.f10463n;
                        int longValue42 = (int) (l122 == null ? l122.longValue() : 0L);
                        lg.e eVar22 = m0.f9201a;
                        A2 = c0.A(lg.d.f20063c, new cd.u(e1Var32, longValue5, longValue22, longValue32, longValue42, null, 3), this);
                        if (A2 != aVar6) {
                        }
                        if (A2 != aVar6) {
                        }
                        break;
                    case 5:
                        int i25 = this.f11273d;
                        int i26 = this.f11272c;
                        dVar = (ha.d) this.f11277h;
                        e1Var = (e1) this.f11276g;
                        ha.a aVar8 = (ha.a) this.f11275f;
                        h8.b.B(obj);
                        i15 = i26;
                        i12 = i25;
                        aVar2 = aVar8;
                        this.f11275f = aVar2;
                        this.f11276g = null;
                        this.f11277h = null;
                        this.f11272c = i15;
                        this.f11273d = i12;
                        this.f11274e = 6;
                        e1Var.getClass();
                        lg.e eVar32 = m0.f9201a;
                        A3 = c0.A(lg.d.f20063c, new hd.a(dVar, e1Var, continuation, 2), this);
                        if (A3 != aVar6) {
                        }
                        if (A3 != aVar6) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }
}
