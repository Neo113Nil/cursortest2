package ru.ozon.fintech.analytic.worker;

import Sc.s;
import We.J;
import We.z;
import androidx.work.n;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import e30.C6289b;
import f30.InterfaceC6415a;
import i30.C7005b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import ru.ozon.fintech.analytic.network.MobileHealthNetwork;
import xe.M;

@e(c = "ru.ozon.fintech.analytic.worker.MobileHealthSendWorker$doWork$2", f = "MobileHealthSendWorker.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 48, 51, 54, 61, UserVerificationMethods.USER_VERIFY_EYEPRINT, 76, 97}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super n.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC6415a f94931d;

    /* renamed from: e, reason: collision with root package name */
    Object f94932e;

    /* renamed from: f, reason: collision with root package name */
    Object f94933f;

    /* renamed from: g, reason: collision with root package name */
    Object f94934g;

    /* renamed from: h, reason: collision with root package name */
    int f94935h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ MobileHealthSendWorker f94936i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(MobileHealthSendWorker mobileHealthSendWorker, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f94936i = mobileHealthSendWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f94936i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super n.a> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0302, code lost:
    
        if (ru.ozon.fintech.analytic.worker.MobileHealthSendWorker.g(r13, r9, r4, r3, r4, r20) == r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x032d, code lost:
    
        if (ru.ozon.fintech.analytic.worker.MobileHealthSendWorker.j(r7, r2, r0, r1, r20) == r6) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0056: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:91:0x0056 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0195 A[Catch: IOException -> 0x01bd, TryCatch #2 {IOException -> 0x01bd, blocks: (B:19:0x018a, B:21:0x0195, B:22:0x01a4, B:24:0x01aa, B:26:0x01c1, B:30:0x01dd, B:32:0x01e3, B:33:0x01e9, B:34:0x01fc, B:36:0x0202, B:41:0x021b, B:43:0x021f, B:44:0x0227, B:45:0x029c, B:47:0x02a2, B:49:0x02d8), top: B:18:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dd A[Catch: IOException -> 0x01bd, TRY_ENTER, TryCatch #2 {IOException -> 0x01bd, blocks: (B:19:0x018a, B:21:0x0195, B:22:0x01a4, B:24:0x01aa, B:26:0x01c1, B:30:0x01dd, B:32:0x01e3, B:33:0x01e9, B:34:0x01fc, B:36:0x0202, B:41:0x021b, B:43:0x021f, B:44:0x0227, B:45:0x029c, B:47:0x02a2, B:49:0x02d8), top: B:18:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[Catch: IOException -> 0x0055, TryCatch #1 {IOException -> 0x0055, blocks: (B:16:0x004b, B:62:0x0141, B:64:0x014a, B:65:0x015a, B:67:0x0160, B:69:0x016e), top: B:2:0x000e }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [i30.b] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f30.a] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InterfaceC6415a interfaceC6415a;
        q30.c s02;
        MobileHealthNetwork x02;
        Object c11;
        C7005b c7005b;
        Object c12;
        Object b11;
        List list;
        Object sendEventsRaw;
        C7005b c7005b2;
        q30.c cVar;
        Response response;
        Pair<? extends String, ? extends String> pair;
        ?? r12 = 1;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        ?? r22 = this.f94935h;
        MobileHealthSendWorker mobileHealthSendWorker = this.f94936i;
        try {
            try {
            } catch (IOException e11) {
                e = e11;
                L80.a.c("MobileHealthSendWorker", "Ошибка при отправке событий жизни приложения", e);
                j30.c O02 = r22.O0();
                String b12 = Nk.a.b("Ошибка при отправке логов событий жизни приложения (try/catch): ", e.getLocalizedMessage());
                String d11 = r12.d();
                this.f94931d = null;
                this.f94932e = null;
                this.f94933f = null;
                this.f94934g = null;
                this.f94935h = 8;
            }
        } catch (IOException e12) {
            e = e12;
            r12 = obj2;
        }
        switch (r22) {
            case 0:
                s.b(obj);
                boolean b13 = mobileHealthSendWorker.getInputData().b();
                int c13 = mobileHealthSendWorker.getInputData().c("WORKER_PARAM_BATCH_MULT", 1);
                androidx.work.e inputData = mobileHealthSendWorker.getInputData();
                Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                interfaceC6415a = (InterfaceC6415a) O30.a.a(O30.c.b(inputData)).a(Y20.a.class);
                s02 = interfaceC6415a.s0();
                C7005b I11 = interfaceC6415a.I();
                x02 = interfaceC6415a.x0();
                if (b13) {
                    this.f94931d = interfaceC6415a;
                    this.f94932e = s02;
                    this.f94933f = I11;
                    this.f94934g = x02;
                    this.f94935h = 1;
                    b11 = s02.b(this);
                    if (b11 != aVar) {
                        c7005b = I11;
                        list = (List) b11;
                        if (!list.isEmpty()) {
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C6289b) it.next()).b());
                            }
                            J h11 = MobileHealthSendWorker.h(mobileHealthSendWorker, arrayList);
                            this.f94931d = interfaceC6415a;
                            this.f94932e = s02;
                            this.f94933f = c7005b;
                            this.f94934g = list;
                            this.f94935h = 5;
                            sendEventsRaw = x02.sendEventsRaw(h11, this);
                            if (sendEventsRaw != aVar) {
                                q30.c cVar2 = s02;
                                c7005b2 = c7005b;
                                cVar = cVar2;
                                try {
                                    MobileHealthSendWorker mobileHealthSendWorker2 = this.f94936i;
                                    response = (Response) sendEventsRaw;
                                    if (response.isSuccessful()) {
                                        We.M errorBody = response.errorBody();
                                        String valueOf = String.valueOf(errorBody != null ? errorBody.string() : null);
                                        z headers = response.headers();
                                        Intrinsics.checkNotNullExpressionValue(headers, "headers(...)");
                                        Iterator<Pair<? extends String, ? extends String>> it2 = headers.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                pair = it2.next();
                                                if (Intrinsics.d(pair.e(), "x-o3-trace-id")) {
                                                }
                                            } else {
                                                pair = null;
                                            }
                                        }
                                        Pair<? extends String, ? extends String> pair2 = pair;
                                        String f7 = pair2 != null ? pair2.f() : null;
                                        L80.a.b("MobileHealthSendWorker", "Ошибка API при отправке событий: код=" + response.code() + ", тело=" + valueOf);
                                        JsonAdapter d12 = interfaceC6415a.e().d(D.e(Map.class, String.class, Object.class));
                                        j30.c O03 = interfaceC6415a.O0();
                                        String d13 = c7005b2.d();
                                        List list3 = list;
                                        Pair pair3 = new Pair("traceId", f7);
                                        Pair pair4 = new Pair("code", new Integer(response.code()));
                                        List list4 = list3;
                                        ArrayList arrayList2 = new ArrayList(C7714v.z(list4, 10));
                                        Iterator it3 = list4.iterator();
                                        while (it3.hasNext()) {
                                            Pair d14 = MobileHealthSendWorker.d(mobileHealthSendWorker2, ((C6289b) it3.next()).b());
                                            Iterator it4 = it3;
                                            arrayList2.add(d14.e() + "." + d14.f());
                                            it3 = it4;
                                            O03 = O03;
                                        }
                                        String json = d12.toJson(U.j(pair3, pair4, new Pair("logs", arrayList2)));
                                        this.f94931d = interfaceC6415a;
                                        this.f94932e = c7005b2;
                                        this.f94933f = sendEventsRaw;
                                        this.f94934g = null;
                                        this.f94935h = 7;
                                        break;
                                    } else {
                                        List list5 = list;
                                        ArrayList arrayList3 = new ArrayList(C7714v.z(list5, 10));
                                        Iterator it5 = list5.iterator();
                                        while (it5.hasNext()) {
                                            arrayList3.add(new Long(((C6289b) it5.next()).c()));
                                        }
                                        this.f94931d = interfaceC6415a;
                                        this.f94932e = c7005b2;
                                        this.f94933f = sendEventsRaw;
                                        this.f94934g = arrayList3;
                                        this.f94935h = 6;
                                        if (cVar.a(arrayList3, this) != aVar) {
                                            L80.a.a("MobileHealthSendWorker", "События успешно отправлены");
                                        }
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    r12 = c7005b2;
                                    r22 = interfaceC6415a;
                                    L80.a.c("MobileHealthSendWorker", "Ошибка при отправке событий жизни приложения", e);
                                    j30.c O022 = r22.O0();
                                    String b122 = Nk.a.b("Ошибка при отправке логов событий жизни приложения (try/catch): ", e.getLocalizedMessage());
                                    String d112 = r12.d();
                                    this.f94931d = null;
                                    this.f94932e = null;
                                    this.f94933f = null;
                                    this.f94934g = null;
                                    this.f94935h = 8;
                                    break;
                                }
                            }
                        }
                        return new n.a.c();
                    }
                } else if (c13 > 1) {
                    int c14 = I11.c() * c13;
                    this.f94931d = interfaceC6415a;
                    this.f94932e = s02;
                    this.f94933f = I11;
                    this.f94934g = x02;
                    this.f94935h = 2;
                    c12 = s02.c(c14, this);
                    if (c12 != aVar) {
                        c7005b = I11;
                        list = (List) c12;
                        if (!list.isEmpty()) {
                        }
                        return new n.a.c();
                    }
                } else {
                    I11.getClass();
                    int c15 = I11.c();
                    this.f94931d = interfaceC6415a;
                    this.f94932e = s02;
                    this.f94933f = I11;
                    this.f94934g = x02;
                    this.f94935h = 4;
                    c11 = s02.c(c15, this);
                    if (c11 != aVar) {
                        c7005b = I11;
                        list = (List) c11;
                        if (!list.isEmpty()) {
                        }
                        return new n.a.c();
                    }
                }
                return aVar;
            case 1:
                MobileHealthNetwork mobileHealthNetwork = (MobileHealthNetwork) this.f94934g;
                c7005b = (C7005b) this.f94933f;
                s02 = (q30.c) this.f94932e;
                interfaceC6415a = this.f94931d;
                s.b(obj);
                x02 = mobileHealthNetwork;
                b11 = obj;
                list = (List) b11;
                if (!list.isEmpty()) {
                }
                return new n.a.c();
            case 2:
                MobileHealthNetwork mobileHealthNetwork2 = (MobileHealthNetwork) this.f94934g;
                c7005b = (C7005b) this.f94933f;
                s02 = (q30.c) this.f94932e;
                interfaceC6415a = this.f94931d;
                s.b(obj);
                x02 = mobileHealthNetwork2;
                c12 = obj;
                list = (List) c12;
                if (!list.isEmpty()) {
                }
                return new n.a.c();
            case 3:
                MobileHealthNetwork mobileHealthNetwork3 = (MobileHealthNetwork) this.f94934g;
                c7005b = (C7005b) this.f94933f;
                s02 = (q30.c) this.f94932e;
                interfaceC6415a = this.f94931d;
                s.b(obj);
                x02 = mobileHealthNetwork3;
                list = (List) obj;
                if (!list.isEmpty()) {
                }
                return new n.a.c();
            case 4:
                MobileHealthNetwork mobileHealthNetwork4 = (MobileHealthNetwork) this.f94934g;
                c7005b = (C7005b) this.f94933f;
                s02 = (q30.c) this.f94932e;
                interfaceC6415a = this.f94931d;
                s.b(obj);
                x02 = mobileHealthNetwork4;
                c11 = obj;
                list = (List) c11;
                if (!list.isEmpty()) {
                }
                return new n.a.c();
            case 5:
                list = (List) this.f94934g;
                C7005b c7005b3 = (C7005b) this.f94933f;
                q30.c cVar3 = (q30.c) this.f94932e;
                interfaceC6415a = this.f94931d;
                s.b(obj);
                c7005b2 = c7005b3;
                cVar = cVar3;
                sendEventsRaw = obj;
                MobileHealthSendWorker mobileHealthSendWorker22 = this.f94936i;
                response = (Response) sendEventsRaw;
                if (response.isSuccessful()) {
                }
                return aVar;
            case 6:
                InterfaceC6415a interfaceC6415a2 = this.f94931d;
                s.b(obj);
                L80.a.a("MobileHealthSendWorker", "События успешно отправлены");
                return new n.a.c();
            case 7:
                InterfaceC6415a interfaceC6415a3 = this.f94931d;
                s.b(obj);
                return new n.a.c();
            case 8:
                s.b(obj);
                return new n.a.c();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
