package oe0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;
import kotlin.time.b;
import oe0.C8711b;
import te0.C9867b;
import ve.EnumC10311b;
import xe.B0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$selectBestFlowBySamples$1", f = "FusedSubscribeLocationUpdates.kt", l = {}, m = "invokeSuspend")
/* renamed from: oe0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8714e extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f78155d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f78156e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f78157f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<List<Object>, List<Object>, C8711b.a> f78158g;

    /* renamed from: oe0.e$a */
    static final class a extends AbstractC7737t implements Function1<Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<Object> f78159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f78159b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            ArrayList<Object> arrayList = this.f78159b;
            if (arrayList.size() < 3) {
                arrayList.add(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: oe0.e$b */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<Object> f78160b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList<Object> arrayList) {
            super(0);
            this.f78160b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f78160b.clear();
            return Unit.f71690a;
        }
    }

    /* renamed from: oe0.e$c */
    static final class c extends AbstractC7737t implements Function1<Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<Object> f78161b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList) {
            super(1);
            this.f78161b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            ArrayList<Object> arrayList = this.f78161b;
            if (arrayList.size() < 3) {
                arrayList.add(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: oe0.e$d */
    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<Object> f78162b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ArrayList<Object> arrayList) {
            super(0);
            this.f78162b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f78162b.clear();
            return Unit.f71690a;
        }
    }

    /* renamed from: oe0.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C1323e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78163a;

        static {
            int[] iArr = new int[C8711b.a.values().length];
            try {
                iArr[C8711b.a.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8711b.a.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78163a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8714e(InterfaceC2395h interfaceC2395h, InterfaceC2395h interfaceC2395h2, Function2 function2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f78156e = interfaceC2395h;
        this.f78157f = interfaceC2395h2;
        this.f78158g = function2;
    }

    public static final void a(kotlin.jvm.internal.I i11, ArrayList arrayList, int i12, ArrayList arrayList2, Function2 function2, M m11, M m12) {
        if (!i11.f71783a && arrayList.size() >= i12 && arrayList2.size() >= i12) {
            i11.f71783a = true;
            C8711b.a aVar = (C8711b.a) function2.invoke(arrayList, arrayList2);
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("Winner: " + aVar, null, 6);
            int i13 = C1323e.f78163a[aVar.ordinal()];
            if (i13 == 1) {
                B0 b02 = (B0) m11.f71787a;
                if (b02 != null) {
                    b02.j(null);
                }
                arrayList2.clear();
                arrayList.clear();
                return;
            }
            if (i13 != 2) {
                throw new Sc.o();
            }
            B0 b03 = (B0) m12.f71787a;
            if (b03 != null) {
                b03.j(null);
            }
            arrayList.clear();
            arrayList2.clear();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8714e c8714e = new C8714e(this.f78156e, this.f78157f, this.f78158g, dVar);
        c8714e.f78155d = obj;
        return c8714e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<Object> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8714e) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, xe.B0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, xe.B0] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ze.u uVar = (ze.u) this.f78155d;
        Je.d a11 = Je.e.a();
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        kotlin.jvm.internal.I i11 = new kotlin.jvm.internal.I();
        M m11 = new M();
        M m12 = new M();
        a aVar2 = new a(arrayList);
        Function2<List<Object>, List<Object>, C8711b.a> function2 = this.f78158g;
        C2408n0 c2408n0 = new C2408n0(this.f78156e, new C8716g(uVar, a11, i11, aVar2, arrayList, arrayList2, function2, m12, m11, null));
        b.Companion companion = kotlin.time.b.INSTANCE;
        EnumC10311b enumC10311b = EnumC10311b.MILLISECONDS;
        m11.f71787a = C2399j.C(new Ae.C(C2399j.P(c2408n0, kotlin.time.c.h(15000L, enumC10311b)), new C8715f("firsFlow", a11, i11, new b(arrayList), null)), uVar);
        m12.f71787a = C2399j.C(new Ae.C(C2399j.P(new C2408n0(this.f78157f, new C8716g(uVar, a11, i11, new c(arrayList2), arrayList, arrayList2, function2, m12, m11, null)), kotlin.time.c.h(15000L, enumC10311b)), new C8715f("secondFlow", a11, i11, new d(arrayList2), null)), uVar);
        return Unit.f71690a;
    }
}
