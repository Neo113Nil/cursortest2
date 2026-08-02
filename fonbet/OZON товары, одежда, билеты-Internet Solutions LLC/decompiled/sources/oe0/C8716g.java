package oe0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;
import oe0.C8711b;
import xe.B0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$selectBestFlowBySamples$1$onEachLocation$1", f = "FusedSubscribeLocationUpdates.kt", l = {182, 345}, m = "invokeSuspend")
/* renamed from: oe0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8716g extends kotlin.coroutines.jvm.internal.j implements Function2<Object, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Je.d f78172d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.I f78173e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC7737t f78174f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f78175g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f78176h;

    /* renamed from: i, reason: collision with root package name */
    Object f78177i;

    /* renamed from: j, reason: collision with root package name */
    M f78178j;

    /* renamed from: k, reason: collision with root package name */
    M f78179k;

    /* renamed from: l, reason: collision with root package name */
    int f78180l;

    /* renamed from: m, reason: collision with root package name */
    int f78181m;

    /* renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f78182n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ze.u<Object> f78183o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Je.d f78184p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f78185q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f78186r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ ArrayList<Object> f78187s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ ArrayList<Object> f78188t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Function2<List<Object>, List<Object>, C8711b.a> f78189u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ M<B0> f78190v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ M<B0> f78191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8716g(ze.u uVar, Je.d dVar, kotlin.jvm.internal.I i11, Function1 function1, ArrayList arrayList, ArrayList arrayList2, Function2 function2, M m11, M m12, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f78183o = uVar;
        this.f78184p = dVar;
        this.f78185q = i11;
        this.f78186r = (AbstractC7737t) function1;
        this.f78187s = arrayList;
        this.f78188t = arrayList2;
        this.f78189u = function2;
        this.f78190v = m11;
        this.f78191w = m12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        M<B0> m11 = this.f78190v;
        M<B0> m12 = this.f78191w;
        C8716g c8716g = new C8716g(this.f78183o, this.f78184p, this.f78185q, this.f78186r, this.f78187s, this.f78188t, this.f78189u, m11, m12, dVar);
        c8716g.f78182n = obj;
        return c8716g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8716g) create(obj, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (r20.f78183o.n(r2, r20) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:9:0x008b, B:11:0x008f, B:12:0x0098), top: B:8:0x008b }] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Je.d dVar;
        kotlin.jvm.internal.I i11;
        ArrayList<Object> arrayList;
        ArrayList<Object> arrayList2;
        Function2<List<Object>, List<Object>, C8711b.a> function2;
        M<B0> m11;
        M<B0> m12;
        int i12;
        ?? r72;
        kotlin.jvm.internal.I i13;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i14 = this.f78181m;
        if (i14 == 0) {
            Sc.s.b(obj);
            obj2 = this.f78182n;
            this.f78182n = obj2;
            this.f78181m = 1;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.f78180l;
                M<B0> m13 = this.f78179k;
                M<B0> m14 = this.f78178j;
                function2 = (Function2) this.f78177i;
                arrayList2 = this.f78176h;
                arrayList = this.f78175g;
                Function1 function1 = (Function1) this.f78174f;
                i11 = this.f78173e;
                dVar = this.f78172d;
                obj3 = this.f78182n;
                Sc.s.b(obj);
                i12 = i15;
                m12 = m13;
                m11 = m14;
                r72 = function1;
                Function2<List<Object>, List<Object>, C8711b.a> function22 = function2;
                ArrayList<Object> arrayList3 = arrayList2;
                ArrayList<Object> arrayList4 = arrayList;
                i13 = i11;
                try {
                    if (!i13.f71783a) {
                        r72.invoke(obj3);
                        C8714e.a(i13, arrayList4, i12, arrayList3, function22, m11, m12);
                    }
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                } catch (Throwable th2) {
                    dVar.c(null);
                    throw th2;
                }
            }
            obj2 = this.f78182n;
            Sc.s.b(obj);
        }
        obj3 = obj2;
        this.f78182n = obj3;
        dVar = this.f78184p;
        this.f78172d = dVar;
        i11 = this.f78185q;
        this.f78173e = i11;
        AbstractC7737t abstractC7737t = this.f78186r;
        this.f78174f = abstractC7737t;
        arrayList = this.f78187s;
        this.f78175g = arrayList;
        arrayList2 = this.f78188t;
        this.f78176h = arrayList2;
        function2 = this.f78189u;
        this.f78177i = function2;
        M<B0> m15 = this.f78190v;
        this.f78178j = m15;
        M<B0> m16 = this.f78191w;
        this.f78179k = m16;
        this.f78180l = 3;
        this.f78181m = 2;
        if (dVar.a(this) != aVar) {
            m11 = m15;
            m12 = m16;
            i12 = 3;
            r72 = abstractC7737t;
            Function2<List<Object>, List<Object>, C8711b.a> function222 = function2;
            ArrayList<Object> arrayList32 = arrayList2;
            ArrayList<Object> arrayList42 = arrayList;
            i13 = i11;
            if (!i13.f71783a) {
            }
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        }
        return aVar;
    }
}
