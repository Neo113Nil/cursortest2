package ru.ozon.id.nativeauth.sso2;

import De.C2862e;
import Je.InterfaceC3394a;
import Sc.InterfaceC4008j;
import android.app.Activity;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import id0.C7050a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.C9551e;
import ru.ozon.id.nativeauth.sso2.s;
import ru.ozon.id.nativeauth.sso2.t;
import ru.ozon.id.nativeauth.sso2.u;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9551e> f97480a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<r> f97481b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f97482c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.B> f97483d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f97484e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2862e f97485f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97486g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97487h;

    /* renamed from: i, reason: collision with root package name */
    private volatile s f97488i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Close;
        public static final a NoNeed;
        public static final a Retry;

        static {
            a aVar = new a("NoNeed", 0);
            NoNeed = aVar;
            a aVar2 = new a("Close", 1);
            Close = aVar2;
            a aVar3 = new a("Retry", 2);
            Retry = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97489a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NoNeed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Retry.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97489a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler$closeError$1", f = "Sso2ReauthorizeHandler.kt", l = {210}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97490d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97490d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ze.h b11 = v.b(v.this);
                a aVar2 = a.Close;
                this.f97490d = 1;
                if (b11.n(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler$retry$1", f = "Sso2ReauthorizeHandler.kt", l = {214}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97492d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97492d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ze.h b11 = v.b(v.this);
                a aVar2 = a.Retry;
                this.f97492d = 1;
                if (b11.n(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler$showError$1", f = "Sso2ReauthorizeHandler.kt", l = {147}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97494d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super a> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97494d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ze.h b11 = v.b(v.this);
            this.f97494d = 1;
            Object i12 = b11.i(this);
            return i12 == aVar ? aVar : i12;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler$startFlowIfNeed$1", f = "Sso2ReauthorizeHandler.kt", l = {152, 154}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97496d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t f97498f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t tVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f97498f = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new f(this.f97498f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        
            if (r3.m(r2, r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97496d;
            t tVar = this.f97498f;
            v vVar = v.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9551e c9551e = (C9551e) vVar.f97480a.getValue();
                this.f97496d = 1;
                obj = c9551e.b(tVar, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            C9551e.a aVar2 = (C9551e.a) obj;
            if (!(aVar2 instanceof C9551e.a.c)) {
                this.f97496d = 2;
            }
            return Unit.f71690a;
        }
    }

    public v() {
        throw null;
    }

    public v(InterfaceC4008j sso2DomainValidator, InterfaceC4008j sso2DomainsAuthMobileInteractor, InterfaceC4008j composerTrackingRepository, InterfaceC4008j ozonIdTrackingManager, InterfaceC4008j featureFlagsStore) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(sso2DomainValidator, "sso2DomainValidator");
        Intrinsics.checkNotNullParameter(sso2DomainsAuthMobileInteractor, "sso2DomainsAuthMobileInteractor");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f97480a = sso2DomainValidator;
        this.f97481b = sso2DomainsAuthMobileInteractor;
        this.f97482c = composerTrackingRepository;
        this.f97483d = ozonIdTrackingManager;
        this.f97484e = featureFlagsStore;
        this.f97485f = coroutineScope;
        this.f97486g = Sc.k.b(w.f97499b);
        this.f97487h = Sc.k.b(C.f97337b);
    }

    public static final ze.h b(v vVar) {
        return (ze.h) vVar.f97487h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (r0.b() == true) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(t.c cVar, C9551e.a aVar, kotlin.coroutines.jvm.internal.c cVar2) {
        x xVar;
        Object obj;
        int i11;
        v vVar;
        t.c cVar3;
        InterfaceC3394a interfaceC3394a;
        v vVar2;
        s sVar;
        Object obj2;
        if (cVar2 instanceof x) {
            xVar = (x) cVar2;
            int i12 = xVar.f97506j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                xVar.f97506j = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = xVar.f97504h;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = xVar.f97506j;
                boolean z11 = true;
                Object obj3 = null;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    xVar.f97500d = this;
                    xVar.f97501e = cVar;
                    xVar.f97502f = aVar;
                    xVar.f97506j = 1;
                    obj = m(cVar, aVar, xVar);
                    if (obj != aVar2) {
                        vVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3394a = xVar.f97503g;
                    aVar = xVar.f97502f;
                    cVar3 = xVar.f97501e;
                    vVar2 = xVar.f97500d;
                    Sc.s.b(obj);
                    try {
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        vVar = vVar2;
                        cVar = cVar3;
                        sVar = vVar.f97488i;
                        if (sVar == null) {
                            throw new IOException("OzonID SDK SSO 2.0 Error! Cause: no domainsAuthResult");
                        }
                        if (!(aVar instanceof C9551e.a.d)) {
                            C9551e.a.b bVar = aVar instanceof C9551e.a.b ? (C9551e.a.b) aVar : null;
                            if (bVar != null) {
                                Iterator<T> it = bVar.a().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (Intrinsics.d(((C9551e.a.C2139a) obj2).a(), cVar.a())) {
                                        break;
                                    }
                                }
                                C9551e.a.C2139a c2139a = (C9551e.a.C2139a) obj2;
                                if (c2139a != null) {
                                }
                            }
                            z11 = false;
                        }
                        if (!(sVar instanceof s.d)) {
                            if (sVar instanceof s.c) {
                                return new u.c(cVar.a(), ((s.c) sVar).a(), z11);
                            }
                            if (sVar instanceof s.a) {
                                return new u.c(cVar.a(), null, z11);
                            }
                            if (sVar instanceof s.b) {
                                return new u.a(cVar.a(), ((s.b) sVar).a());
                            }
                            throw new Sc.o();
                        }
                        s.d dVar = (s.d) sVar;
                        Iterator<T> it2 = dVar.a().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.d(((u) next).a(), cVar.a())) {
                                obj3 = next;
                                break;
                            }
                        }
                        u uVar = (u) obj3;
                        if (uVar != null) {
                            return uVar;
                        }
                        throw new IOException(Nk.a.b("OzonID SDK SSO 2.0 Error! Cause: ", Sh.b.c("missed ", cVar.a(), "; reAuthed domains: ", C7714v.V(dVar.a(), null, null, null, y.f97507b, 31))));
                    } catch (Throwable th2) {
                        interfaceC3394a.c(null);
                        throw th2;
                    }
                }
                aVar = xVar.f97502f;
                cVar = xVar.f97501e;
                vVar = xVar.f97500d;
                Sc.s.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    InterfaceC3394a interfaceC3394a2 = (InterfaceC3394a) vVar.f97486g.getValue();
                    xVar.f97500d = vVar;
                    xVar.f97501e = cVar;
                    xVar.f97502f = aVar;
                    xVar.f97503g = interfaceC3394a2;
                    xVar.f97506j = 2;
                    if (interfaceC3394a2.a(xVar) != aVar2) {
                        cVar3 = cVar;
                        interfaceC3394a = interfaceC3394a2;
                        vVar2 = vVar;
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        vVar = vVar2;
                        cVar = cVar3;
                    }
                    return aVar2;
                }
                sVar = vVar.f97488i;
                if (sVar == null) {
                }
            }
        }
        xVar = new x(this, cVar2);
        obj = xVar.f97504h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = xVar.f97506j;
        boolean z112 = true;
        Object obj32 = null;
        if (i11 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        sVar = vVar.f97488i;
        if (sVar == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r13v5, types: [ru.ozon.id.nativeauth.sso2.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(t tVar, C9551e.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        int i11;
        ?? r22;
        v vVar;
        s sVar;
        a aVar2;
        int i12;
        Object obj;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i13 = zVar.f97513i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                zVar.f97513i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = zVar.f97511g;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = zVar.f97513i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    if (aVar instanceof C9551e.a.b) {
                        Set<C9551e.a.C2139a> a11 = ((C9551e.a.b) aVar).a();
                        r22 = new ArrayList(C7714v.z(a11, 10));
                        Iterator it = a11.iterator();
                        while (it.hasNext()) {
                            r22.add(((C9551e.a.C2139a) it.next()).a());
                        }
                    } else {
                        r22 = K.f71697a;
                    }
                    r value = this.f97481b.getValue();
                    zVar.f97508d = this;
                    zVar.f97509e = tVar;
                    zVar.f97510f = aVar;
                    zVar.f97513i = 1;
                    obj2 = value.h(tVar, r22, zVar);
                    if (obj2 != aVar3) {
                        vVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                aVar = zVar.f97510f;
                tVar = zVar.f97509e;
                vVar = zVar.f97508d;
                Sc.s.b(obj2);
                sVar = (s) obj2;
                if (!(sVar instanceof s.a) || (sVar instanceof s.b)) {
                    aVar2 = a.NoNeed;
                } else if (sVar instanceof s.c) {
                    C9551e.a.b bVar = aVar instanceof C9551e.a.b ? (C9551e.a.b) aVar : null;
                    boolean z11 = false;
                    if (bVar != null) {
                        Set<C9551e.a.C2139a> a12 = bVar.a();
                        if (!a12.isEmpty()) {
                            Iterator it2 = a12.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((C9551e.a.C2139a) it2.next()).b()) {
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                    }
                    aVar2 = ((aVar instanceof C9551e.a.d) || z11) ? vVar.j(((s.c) sVar).a()) : a.NoNeed;
                } else {
                    if (!(sVar instanceof s.d)) {
                        throw new Sc.o();
                    }
                    Iterator it3 = ((s.d) sVar).a().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        u uVar = (u) obj;
                        if ((uVar instanceof u.c) && ((u.c) uVar).c()) {
                            break;
                        }
                    }
                    u uVar2 = (u) obj;
                    if (uVar2 != null) {
                        u.c cVar2 = uVar2 instanceof u.c ? (u.c) uVar2 : null;
                        aVar2 = vVar.j(cVar2 != null ? cVar2.b() : null);
                    } else {
                        aVar2 = a.NoNeed;
                    }
                }
                i12 = b.f97489a[aVar2.ordinal()];
                if (i12 != 1 || i12 == 2) {
                    return sVar;
                }
                if (i12 != 3) {
                    throw new Sc.o();
                }
                zVar.f97508d = null;
                zVar.f97509e = null;
                zVar.f97510f = null;
                zVar.f97513i = 2;
                Object h11 = vVar.h(tVar, aVar, zVar);
                return h11 == aVar3 ? aVar3 : h11;
            }
        }
        zVar = new z(this, cVar);
        Object obj22 = zVar.f97511g;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = zVar.f97513i;
        if (i11 != 0) {
        }
        sVar = (s) obj22;
        if (sVar instanceof s.a) {
        }
        aVar2 = a.NoNeed;
        i12 = b.f97489a[aVar2.ordinal()];
        if (i12 != 1) {
        }
        return sVar;
    }

    private final a j(String str) {
        Kb0.K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        Activity activity = k11.k().getValue().d();
        if (activity == null) {
            return a.NoNeed;
        }
        int i11 = Sso2FullScreenErrorActivity.f97364i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) Sso2FullScreenErrorActivity.class);
        intent.putExtra("traceId", str);
        activity.startActivity(intent);
        return (a) C10727i.d(kotlin.coroutines.g.f71771a, new e(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(t tVar, C9551e.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        B b11;
        int i11;
        boolean tryLock;
        boolean z11;
        v vVar;
        v vVar2;
        if (cVar instanceof B) {
            b11 = (B) cVar;
            int i12 = b11.f97336i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                b11.f97336i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = b11.f97334g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = b11.f97336i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    tryLock = ((InterfaceC3394a) this.f97486g.getValue()).tryLock();
                    if (tryLock) {
                        b11.f97331d = this;
                        b11.f97332e = this;
                        b11.f97333f = tryLock;
                        b11.f97336i = 1;
                        Object h11 = h(tVar, aVar, b11);
                        if (h11 == aVar2) {
                            return aVar2;
                        }
                        obj = h11;
                        z11 = tryLock;
                        vVar = this;
                        vVar2 = vVar;
                    }
                    return Boolean.valueOf(tryLock);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = b11.f97333f;
                vVar = b11.f97332e;
                vVar2 = b11.f97331d;
                Sc.s.b(obj);
                vVar.f97488i = (s) obj;
                ((InterfaceC3394a) vVar2.f97486g.getValue()).c(null);
                tryLock = z11;
                return Boolean.valueOf(tryLock);
            }
        }
        b11 = new B(this, cVar);
        Object obj2 = b11.f97334g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = b11.f97336i;
        if (i11 != 0) {
        }
        vVar.f97488i = (s) obj2;
        ((InterfaceC3394a) vVar2.f97486g.getValue()).c(null);
        tryLock = z11;
        return Boolean.valueOf(tryLock);
    }

    public final void f() {
        C10727i.c(this.f97485f, null, null, new c(null), 3);
    }

    public final void i() {
        C10727i.c(this.f97485f, null, null, new d(null), 3);
    }

    public final void k(@NotNull t reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C10727i.c(this.f97485f, null, null, new f(reason, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(@NotNull t.c cVar, @NotNull kotlin.coroutines.jvm.internal.c cVar2) {
        A a11;
        int i11;
        v vVar;
        C9551e.a aVar;
        if (cVar2 instanceof A) {
            a11 = (A) cVar2;
            int i12 = a11.f97330h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a11.f97330h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = a11.f97328f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = a11.f97330h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C9551e value = this.f97480a.getValue();
                    Intrinsics.g(cVar, "null cannot be cast to non-null type ru.ozon.id.nativeauth.sso2.Sso2FlowStartReason");
                    a11.f97326d = this;
                    a11.f97327e = cVar;
                    a11.f97330h = 1;
                    obj = value.b(cVar, a11);
                    if (obj != aVar2) {
                        vVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                cVar = a11.f97327e;
                vVar = a11.f97326d;
                Sc.s.b(obj);
                aVar = (C9551e.a) obj;
                if (!(aVar instanceof C9551e.a.c)) {
                    return new u.b(cVar.a());
                }
                a11.f97326d = null;
                a11.f97327e = null;
                a11.f97330h = 2;
                Object g10 = vVar.g(cVar, aVar, a11);
                return g10 == aVar2 ? aVar2 : g10;
            }
        }
        a11 = new A(this, cVar2);
        Object obj2 = a11.f97328f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a11.f97330h;
        if (i11 != 0) {
        }
        aVar = (C9551e.a) obj2;
        if (!(aVar instanceof C9551e.a.c)) {
        }
    }
}
