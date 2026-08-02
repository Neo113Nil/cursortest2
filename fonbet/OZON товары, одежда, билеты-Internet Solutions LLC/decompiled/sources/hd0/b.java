package hd0;

import Hb0.f;
import Je.InterfaceC3394a;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import dc0.C6144H;
import dc0.C6171q;
import id0.C7050a;
import java.net.URI;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.B;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fb0.f f65304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f65305b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<i> f65306c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f65307d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<B> f65308e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f65309f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f65310g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f65311h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f65312i;

    static final class a extends AbstractC7737t implements Function0<InterfaceC3394a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f65313b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC3394a invoke() {
            return Je.e.a();
        }
    }

    /* renamed from: hd0.b$b, reason: collision with other inner class name */
    static final class C1065b extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1065b f65314b = new C1065b(0);

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return td0.f.a();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.OzonIdTracker$trackUserIdDeSync$1", f = "OzonIdTracker.kt", l = {69, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC3394a f65315d;

        /* renamed from: e, reason: collision with root package name */
        b f65316e;

        /* renamed from: f, reason: collision with root package name */
        boolean f65317f;

        /* renamed from: g, reason: collision with root package name */
        int f65318g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f65320i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f65320i = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(this.f65320i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3394a a11;
            boolean z11;
            b bVar;
            InterfaceC3394a interfaceC3394a;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65318g;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    b bVar2 = b.this;
                    a11 = b.a(bVar2);
                    this.f65315d = a11;
                    this.f65316e = bVar2;
                    z11 = this.f65320i;
                    this.f65317f = z11;
                    this.f65318g = 1;
                    if (a11.a(this) != aVar) {
                        bVar = bVar2;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3394a = this.f65315d;
                    try {
                        s.b(obj);
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC3394a.c(null);
                        throw th;
                    }
                }
                boolean z12 = this.f65317f;
                bVar = this.f65316e;
                InterfaceC3394a interfaceC3394a2 = this.f65315d;
                s.b(obj);
                z11 = z12;
                a11 = interfaceC3394a2;
                this.f65315d = a11;
                this.f65316e = null;
                this.f65318g = 2;
                if (b.c(bVar, z11, this) != aVar) {
                    interfaceC3394a = a11;
                    Unit unit2 = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                }
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                interfaceC3394a = a11;
                interfaceC3394a.c(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<i> sso2MobileConfigRepository, @NotNull InterfaceC4008j<C7050a> composerTrackingRepository, @NotNull InterfaceC4008j<B> ozonIdTrackingManager, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f65304a = ozonIdConfig;
        this.f65305b = localCookieDataSource;
        this.f65306c = sso2MobileConfigRepository;
        this.f65307d = composerTrackingRepository;
        this.f65308e = ozonIdTrackingManager;
        this.f65309f = featureFlagsStore;
        this.f65311h = Sc.k.b(C1065b.f65314b);
        this.f65312i = Sc.k.b(a.f65313b);
    }

    public static final InterfaceC3394a a(b bVar) {
        return (InterfaceC3394a) bVar.f65312i.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        hd0.c cVar2;
        Object obj;
        int i11;
        b bVar2;
        boolean z12;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO;
        bVar.getClass();
        if (cVar instanceof hd0.c) {
            cVar2 = (hd0.c) cVar;
            int i12 = cVar2.f65325h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f65325h = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = cVar2.f65323f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f65325h;
                if (i11 != 0) {
                    s.b(obj);
                    if (!bVar.f65310g) {
                        Hb0.c value = bVar.f65309f.getValue();
                        f.o oVar = f.o.f10813a;
                        cVar2.f65321d = bVar;
                        cVar2.f65322e = z11;
                        cVar2.f65325h = 1;
                        obj = value.a(oVar, cVar2);
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = cVar2.f65322e;
                    bVar2 = cVar2.f65321d;
                    s.b(obj);
                    sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                    if (sso2MobileConfigResponseDTO == null ? sso2MobileConfigResponseDTO.getLogsEnabled() : true) {
                        URI create = URI.create(bVar2.f65304a.getPrimaryDomain().g());
                        URI create2 = URI.create(bVar2.f65304a.getPrimaryDomain().i());
                        Long n11 = C6171q.n(C6171q.m(C6144H.h(bVar2.f65305b.getValue(), create)));
                        Long n12 = C6171q.n(C6171q.m(C6144H.h(bVar2.f65305b.getValue(), create2)));
                        if (!Intrinsics.d(n11, n12)) {
                            bVar2.f65310g = true;
                            bVar2.f65307d.getValue().c(new d(bVar2, n11, n12, z12));
                        }
                        return Unit.f71690a;
                    }
                    return Unit.f71690a;
                }
                z11 = cVar2.f65322e;
                bVar = cVar2.f65321d;
                s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    i value2 = bVar.f65306c.getValue();
                    cVar2.f65321d = bVar;
                    cVar2.f65322e = z11;
                    cVar2.f65325h = 2;
                    obj = value2.f(cVar2);
                    if (obj != aVar) {
                        boolean z13 = z11;
                        bVar2 = bVar;
                        z12 = z13;
                        sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                        if (sso2MobileConfigResponseDTO == null ? sso2MobileConfigResponseDTO.getLogsEnabled() : true) {
                        }
                    }
                    return aVar;
                }
                return Unit.f71690a;
            }
        }
        cVar2 = new hd0.c(bVar, cVar);
        obj = cVar2.f65323f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f65325h;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.f71690a;
    }

    public final void d(boolean z11) {
        C10727i.c((M) this.f65311h.getValue(), null, null, new c(z11, null), 3);
    }
}
