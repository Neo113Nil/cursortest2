package ru.ozon.fintech.analytic.worker;

import Sc.s;
import android.util.Log;
import androidx.work.n;
import com.squareup.moshi.Moshi;
import e30.C6288a;
import f30.InterfaceC6415a;
import i30.C7004a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q30.C8982b;
import retrofit2.Response;
import ru.ozon.fintech.analytic.models.GraylogData;
import ru.ozon.fintech.analytic.network.GraylogNetwork;
import xe.M;

@e(c = "ru.ozon.fintech.analytic.worker.GraylogSendWorker$doWork$2", f = "GraylogSendWorker.kt", l = {46, 48, 51, 116, 118}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super n.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f94920d;

    /* renamed from: e, reason: collision with root package name */
    Object f94921e;

    /* renamed from: f, reason: collision with root package name */
    Object f94922f;

    /* renamed from: g, reason: collision with root package name */
    C7004a f94923g;

    /* renamed from: h, reason: collision with root package name */
    Moshi f94924h;

    /* renamed from: i, reason: collision with root package name */
    List f94925i;

    /* renamed from: j, reason: collision with root package name */
    int f94926j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ GraylogSendWorker f94927k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(GraylogSendWorker graylogSendWorker, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f94927k = graylogSendWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f94927k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super n.a> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x018a, code lost:
    
        if (r11.f(r2, r22) == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0180 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x001a, B:16:0x0032, B:18:0x0175, B:20:0x0180, B:27:0x0162), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final C7004a M11;
        Object c11;
        final Moshi moshi;
        int i11;
        C8982b c8982b;
        GraylogNetwork graylogNetwork;
        Object b11;
        List<C6288a> list;
        Object d11;
        int i12;
        List<C6288a> list2;
        final int intValue;
        Object sendLogs;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f94926j;
        try {
        } catch (Exception e11) {
            L80.a.c("GraylogSendWorker", "Error while send graylog logs", e11);
            Unit unit = Unit.f71690a;
        }
        if (i13 == 0) {
            s.b(obj);
            GraylogSendWorker graylogSendWorker = this.f94927k;
            boolean b12 = graylogSendWorker.getInputData().b();
            int c12 = graylogSendWorker.getInputData().c("WORKER_PARAM_BATCH_MULT", 1);
            androidx.work.e inputData = graylogSendWorker.getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
            InterfaceC6415a interfaceC6415a = (InterfaceC6415a) O30.a.a(O30.c.b(inputData)).a(Y20.a.class);
            C8982b c13 = interfaceC6415a.c1();
            GraylogNetwork l02 = interfaceC6415a.l0();
            M11 = interfaceC6415a.M();
            Moshi e12 = interfaceC6415a.e();
            if (b12) {
                this.f94921e = c13;
                this.f94922f = l02;
                this.f94923g = M11;
                this.f94924h = e12;
                this.f94920d = c12;
                this.f94926j = 1;
                b11 = c13.b(this);
                if (b11 != aVar) {
                    moshi = e12;
                    i11 = c12;
                    c8982b = c13;
                    graylogNetwork = l02;
                    list = (List) b11;
                }
            } else {
                int b13 = M11.b() * c12;
                this.f94921e = c13;
                this.f94922f = l02;
                this.f94923g = M11;
                this.f94924h = e12;
                this.f94920d = c12;
                this.f94926j = 2;
                c11 = c13.c(b13, this);
                if (c11 != aVar) {
                    moshi = e12;
                    i11 = c12;
                    c8982b = c13;
                    graylogNetwork = l02;
                    list = (List) c11;
                }
            }
            return aVar;
        }
        if (i13 == 1) {
            i11 = this.f94920d;
            Moshi moshi2 = this.f94924h;
            C7004a c7004a = this.f94923g;
            graylogNetwork = (GraylogNetwork) this.f94922f;
            c8982b = (C8982b) this.f94921e;
            s.b(obj);
            M11 = c7004a;
            moshi = moshi2;
            b11 = obj;
            list = (List) b11;
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return new n.a.c();
                    }
                    list2 = (List) this.f94922f;
                    C8982b c8982b2 = (C8982b) this.f94921e;
                    s.b(obj);
                    c8982b = c8982b2;
                    sendLogs = obj;
                    if (((Response) sendLogs).code() == 200) {
                        this.f94921e = sendLogs;
                        this.f94922f = null;
                        this.f94926j = 5;
                    }
                    return new n.a.c();
                }
                int i14 = this.f94920d;
                List<C6288a> list3 = this.f94925i;
                Moshi moshi3 = this.f94924h;
                C7004a c7004a2 = this.f94923g;
                graylogNetwork = (GraylogNetwork) this.f94922f;
                c8982b = (C8982b) this.f94921e;
                s.b(obj);
                M11 = c7004a2;
                moshi = moshi3;
                i12 = i14;
                list2 = list3;
                d11 = obj;
                intValue = ((Number) d11).intValue();
                if (intValue > 0) {
                    Log.d("GraylogSendWorker", "try send logs count " + list2.size() + " with butchMultiplier " + i12);
                    String lineSeparator = System.lineSeparator();
                    Intrinsics.checkNotNullExpressionValue(lineSeparator, "lineSeparator(...)");
                    String V11 = C7714v.V(list2, lineSeparator, null, null, new Function1() { // from class: r30.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            C6288a c6288a = (C6288a) obj2;
                            String T11 = c6288a.T();
                            String a11 = c6288a.a();
                            String K11 = c6288a.K();
                            C7004a c7004a3 = C7004a.this;
                            if (K11 == null) {
                                K11 = c7004a3.c();
                            }
                            String R11 = c6288a.R();
                            String q11 = c6288a.q();
                            String Q11 = c6288a.Q();
                            String i15 = c6288a.i();
                            Integer j11 = c6288a.j();
                            String str = c7004a3.d() ? "stg" : "prod";
                            String U10 = c6288a.U();
                            String L11 = c6288a.L();
                            String P11 = c6288a.P();
                            String W11 = c6288a.W();
                            String S11 = c6288a.S();
                            Integer k11 = c6288a.k();
                            String l11 = c6288a.l();
                            String b14 = c6288a.b();
                            String N11 = c6288a.N();
                            Boolean m11 = c6288a.m();
                            String r11 = c6288a.r();
                            String p11 = c6288a.p();
                            Boolean w11 = c6288a.w();
                            Boolean x11 = c6288a.x();
                            Boolean y11 = c6288a.y();
                            Boolean z11 = c6288a.z();
                            Boolean A11 = c6288a.A();
                            String G11 = c6288a.G();
                            String B11 = c6288a.B();
                            String M12 = c6288a.M();
                            String F11 = c6288a.F();
                            Boolean I11 = c6288a.I();
                            String D11 = c6288a.D();
                            String C11 = c6288a.C();
                            String f7 = c6288a.f();
                            String valueOf = String.valueOf(intValue);
                            Boolean s11 = c6288a.s();
                            String O11 = c6288a.O();
                            String J11 = c6288a.J();
                            String n11 = c6288a.n();
                            String v11 = c6288a.v();
                            String E11 = c6288a.E();
                            Integer e13 = c6288a.e();
                            String d12 = c6288a.d();
                            Integer c14 = c6288a.c();
                            String str2 = K11;
                            String json = moshi.c(GraylogData.class).toJson(new GraylogData(T11, a11, str2, R11, q11, str, null, Q11, i15, j11, U10, L11, "fintech", P11, W11, S11, b14, l11, k11, N11, c6288a.V(), c6288a.t(), m11, r11, p11, y11, x11, w11, z11, A11, E11, c6288a.u(), G11, B11, M12, F11, I11, D11, C11, f7, valueOf, O11, s11, J11, n11, v11, e13, d12, c14, c6288a.h(), c6288a.H(), c6288a.g(), 64, 0, null));
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            return json;
                        }
                    }, 30);
                    this.f94921e = c8982b;
                    this.f94922f = list2;
                    this.f94923g = null;
                    this.f94924h = null;
                    this.f94925i = null;
                    this.f94926j = 4;
                    sendLogs = graylogNetwork.sendLogs(V11, this);
                    if (sendLogs == aVar) {
                        return aVar;
                    }
                    if (((Response) sendLogs).code() == 200) {
                    }
                }
                return new n.a.c();
            }
            i11 = this.f94920d;
            Moshi moshi4 = this.f94924h;
            C7004a c7004a3 = this.f94923g;
            graylogNetwork = (GraylogNetwork) this.f94922f;
            c8982b = (C8982b) this.f94921e;
            s.b(obj);
            M11 = c7004a3;
            moshi = moshi4;
            c11 = obj;
            list = (List) c11;
        }
        this.f94921e = c8982b;
        this.f94922f = graylogNetwork;
        this.f94923g = M11;
        this.f94924h = moshi;
        this.f94925i = list;
        this.f94920d = i11;
        this.f94926j = 3;
        d11 = c8982b.d(this);
        if (d11 != aVar) {
            List<C6288a> list4 = list;
            i12 = i11;
            list2 = list4;
            intValue = ((Number) d11).intValue();
            if (intValue > 0) {
            }
            return new n.a.c();
        }
        return aVar;
    }
}
