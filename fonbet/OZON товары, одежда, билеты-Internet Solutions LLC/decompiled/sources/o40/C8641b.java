package o40;

import Ae.C2399j;
import Ae.C2414q0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import fd.InterfaceC6512o;
import g30.InterfaceC6618a;
import hd.C6915b;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import p40.EnumC8852a;
import p40.g;
import p40.h;
import p40.n;
import ru.ozon.fintech.settings.domain.a;
import xe.C10720e0;
import ze.u;

/* renamed from: o40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8641b implements InterfaceC8640a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q90.c f77671a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f77672b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f77673c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n f77674d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final n f77675e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f77676f;

    @e(c = "ru.ozon.fintech.features.appupdate.interactor.ForceUpdateInteractorImpl$getAvailableStore$1", f = "ForceUpdateInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: o40.b$a */
    static final class a extends j implements InterfaceC6512o<h, h, h, d<? super EnumC8852a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ h f77677d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ h f77678e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ h f77679f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f77681h;

        /* renamed from: o40.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1310a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77682a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.AVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.PROGRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f77682a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, d<? super a> dVar) {
            super(4, dVar);
            this.f77681h = z11;
        }

        @Override // fd.InterfaceC6512o
        public final Object invoke(h hVar, h hVar2, h hVar3, d<? super EnumC8852a> dVar) {
            a aVar = C8641b.this.new a(this.f77681h, dVar);
            aVar.f77677d = hVar;
            aVar.f77678e = hVar2;
            aVar.f77679f = hVar3;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, p40.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            h hVar = this.f77677d;
            h hVar2 = this.f77678e;
            h hVar3 = this.f77679f;
            M m11 = new M();
            m11.f71787a = EnumC8852a.NONE;
            InterfaceC6618a interfaceC6618a = C8641b.this.f77676f;
            String name = hVar.name();
            String name2 = hVar2.name();
            String name3 = hVar3.name();
            boolean z11 = this.f77681h;
            interfaceC6618a.G(name, name2, name3, z11);
            L80.a.a("ForceUpdateInteractorImpl", "getAvailableStore(isHardUpdate: " + z11 + ") rustoreResult = " + hVar + ", gmsUpdateService = " + hVar2 + ", ozonUpdateService = " + hVar3);
            int i11 = 0;
            for (Object obj2 : C7714v.b0(hVar, hVar2, hVar3)) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                int i13 = C1310a.f77682a[((h) obj2).ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        m11.f71787a = EnumC8852a.a().get(i11);
                    }
                } else if (m11.f71787a == EnumC8852a.NONE) {
                    m11.f71787a = EnumC8852a.a().get(i11);
                }
                i11 = i12;
            }
            return m11.f71787a;
        }
    }

    @e(c = "ru.ozon.fintech.features.appupdate.interactor.ForceUpdateInteractorImpl$startUpdate$1", f = "ForceUpdateInteractorImpl.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 105}, m = "invokeSuspend")
    /* renamed from: o40.b$b, reason: collision with other inner class name */
    static final class C1311b extends j implements Function2<u<? super Boolean>, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f77683d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f77684e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f77686g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ r f77687h;

        /* renamed from: o40.b$b$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8641b f77688a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f77689b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f77690c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ u<Boolean> f77691d;

            /* renamed from: o40.b$b$a$a, reason: collision with other inner class name */
            static final class C1312a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f77692a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ EnumC8852a f77693b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C8641b f77694c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ n f77695d;

                C1312a(boolean z11, EnumC8852a enumC8852a, C8641b c8641b, n nVar) {
                    this.f77692a = z11;
                    this.f77693b = enumC8852a;
                    this.f77694c = c8641b;
                    this.f77695d = nVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, d dVar) {
                    g gVar = (g) obj;
                    StringBuilder sb2 = new StringBuilder("startInAppUpdate(isHardUpdate: ");
                    boolean z11 = this.f77692a;
                    sb2.append(z11);
                    sb2.append(", enabledStore: ");
                    sb2.append(this.f77693b);
                    sb2.append("): result = ");
                    sb2.append(gVar);
                    L80.a.a("ForceUpdateInteractorImpl", sb2.toString());
                    this.f77694c.f77676f.v(gVar.name(), this.f77695d.b().name(), z11);
                    return Unit.f71690a;
                }
            }

            /* renamed from: o40.b$b$a$b, reason: collision with other inner class name */
            public /* synthetic */ class C1313b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f77696a;

                static {
                    int[] iArr = new int[EnumC8852a.values().length];
                    try {
                        iArr[EnumC8852a.RUSTORE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC8852a.GOOGLE_PLAY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC8852a.OZON_SDK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f77696a = iArr;
                }
            }

            @e(c = "ru.ozon.fintech.features.appupdate.interactor.ForceUpdateInteractorImpl$startUpdate$1$1", f = "ForceUpdateInteractorImpl.kt", l = {90}, m = "emit")
            /* renamed from: o40.b$b$a$c */
            static final class c extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                Object f77697d;

                /* renamed from: e, reason: collision with root package name */
                n f77698e;

                /* renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f77699f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ a<T> f77700g;

                /* renamed from: h, reason: collision with root package name */
                int f77701h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(a<? super T> aVar, d<? super c> dVar) {
                    super(dVar);
                    this.f77700g = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f77699f = obj;
                    this.f77701h |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f77700g.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(C8641b c8641b, boolean z11, r rVar, u<? super Boolean> uVar) {
                this.f77688a = c8641b;
                this.f77689b = z11;
                this.f77690c = rVar;
                this.f77691d = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0104  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // Ae.InterfaceC2397i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(EnumC8852a enumC8852a, d<? super Unit> dVar) {
                c cVar;
                int i11;
                n nVar;
                a<T> aVar;
                n nVar2;
                if (dVar instanceof c) {
                    cVar = (c) dVar;
                    int i12 = cVar.f77701h;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        cVar.f77701h = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = cVar.f77699f;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = cVar.f77701h;
                        if (i11 != 0) {
                            s.b(obj);
                            int i13 = C1313b.f77696a[enumC8852a.ordinal()];
                            C8641b c8641b = this.f77688a;
                            nVar = i13 != 1 ? i13 != 2 ? i13 != 3 ? null : c8641b.f77675e : c8641b.f77673c : c8641b.f77674d;
                            Double dictDouble = c8641b.f77671a.q(S90.c.MOB_APP_SHOW_REQUIRED_VERSION).b().getDictDouble("showFrequency");
                            double doubleValue = dictDouble != null ? dictDouble.doubleValue() : 1.0d;
                            boolean t2 = c8641b.f77672b.t();
                            StringBuilder sb2 = new StringBuilder("startUpdate(isHardUpdate: ");
                            boolean z11 = this.f77689b;
                            sb2.append(z11);
                            sb2.append(") enabledStore = ");
                            sb2.append(enumC8852a);
                            sb2.append(", isOpenInAppUpdateFlow = ");
                            sb2.append(t2);
                            sb2.append(", showFrequency = ");
                            sb2.append(doubleValue);
                            L80.a.a("ForceUpdateInteractorImpl", sb2.toString());
                            if (nVar == null || c8641b.f77672b.t() || !C8641b.d(c8641b, doubleValue)) {
                                aVar = this;
                                if (!aVar.f77691d.g()) {
                                    Boolean valueOf = Boolean.valueOf(nVar != null);
                                    u<Boolean> uVar = aVar.f77691d;
                                    uVar.b(valueOf);
                                    uVar.l(null);
                                }
                                return Unit.f71690a;
                            }
                            c8641b.f77672b.n();
                            c8641b.f77672b.B();
                            c8641b.f77676f.R(nVar.b().name(), z11);
                            InterfaceC2395h<g> c11 = nVar.c(this.f77690c, z11);
                            C1312a c1312a = new C1312a(z11, enumC8852a, c8641b, nVar);
                            cVar.f77697d = this;
                            cVar.f77698e = nVar;
                            cVar.f77701h = 1;
                            if (((AbstractC2635g) c11).collect(c1312a, cVar) == aVar2) {
                                return aVar2;
                            }
                            aVar = this;
                            nVar2 = nVar;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = cVar.f77698e;
                            aVar = (a) cVar.f77697d;
                            s.b(obj);
                        }
                        nVar = nVar2;
                        if (!aVar.f77691d.g()) {
                        }
                        return Unit.f71690a;
                    }
                }
                cVar = new c(this, dVar);
                Object obj2 = cVar.f77699f;
                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar.f77701h;
                if (i11 != 0) {
                }
                nVar = nVar2;
                if (!aVar.f77691d.g()) {
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1311b(boolean z11, r rVar, d<? super C1311b> dVar) {
            super(2, dVar);
            this.f77686g = z11;
            this.f77687h = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C1311b c1311b = C8641b.this.new C1311b(this.f77686g, this.f77687h, dVar);
            c1311b.f77684e = obj;
            return c1311b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super Boolean> uVar, d<? super Unit> dVar) {
            return ((C1311b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r9 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r5.collect(r6, r8) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u uVar;
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f77683d;
            if (i11 == 0) {
                s.b(obj);
                uVar = (u) this.f77684e;
                C8641b c8641b = C8641b.this;
                boolean z11 = this.f77686g;
                InterfaceC2395h<EnumC8852a> a12 = c8641b.a(z11);
                a aVar2 = new a(c8641b, z11, this.f77687h, uVar);
                this.f77684e = uVar;
                this.f77683d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                uVar = (u) this.f77684e;
                s.b(obj);
            }
            this.f77684e = null;
            this.f77683d = 2;
            a11 = ze.s.a(uVar, new Q90.b(2), this);
        }
    }

    public C8641b(@NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull n gmsUpdateService, @NotNull n rustoreUpdateService, @NotNull n ozonUpdateService, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(gmsUpdateService, "gmsUpdateService");
        Intrinsics.checkNotNullParameter(rustoreUpdateService, "rustoreUpdateService");
        Intrinsics.checkNotNullParameter(ozonUpdateService, "ozonUpdateService");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f77671a = featureToggles;
        this.f77672b = fintechSettings;
        this.f77673c = gmsUpdateService;
        this.f77674d = rustoreUpdateService;
        this.f77675e = ozonUpdateService;
        this.f77676f = fintechAnalyticInteractor;
    }

    public static final boolean d(C8641b c8641b, double d11) {
        c8641b.getClass();
        if (d11 <= 0.0d) {
            return false;
        }
        long epochDay = LocalDate.now().toEpochDay();
        a.C2128a l11 = c8641b.f77672b.l();
        StringBuilder e11 = Cm.e.e(d11, "canShowUpdateSheet(showFrequency: ", ") today = ");
        e11.append(epochDay);
        e11.append(", showInfo = ");
        e11.append(l11);
        L80.a.a("ForceUpdateInteractorImpl", e11.toString());
        if (d11 >= 1.0d) {
            int i11 = (int) d11;
            if (l11.b() == epochDay && l11.a() >= i11) {
                return false;
            }
        } else {
            int b11 = C6915b.b(1.0d / d11);
            if (b11 < 1) {
                b11 = 1;
            }
            if (l11.b() != -1 && epochDay - l11.b() < b11) {
                return false;
            }
        }
        return true;
    }

    @Override // o40.InterfaceC8640a
    @NotNull
    public final InterfaceC2395h<EnumC8852a> a(boolean z11) {
        C2414q0 i11 = C2399j.i(this.f77674d.a(z11), this.f77673c.a(z11), this.f77675e.a(z11), new a(z11, null));
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C2399j.B(i11, He.b.f10879b);
    }

    @Override // o40.InterfaceC8640a
    @NotNull
    public final InterfaceC2395h<Boolean> b(@NotNull r activity, boolean z11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C2399j.f(new C1311b(z11, activity, null));
    }

    @Override // o40.InterfaceC8640a
    public final boolean c() {
        boolean z11;
        ru.ozon.fintech.settings.domain.a aVar = this.f77672b;
        long parseLong = Long.parseLong(aVar.getVersionCode());
        S90.a q11 = this.f77671a.q(S90.c.MOB_APP_SHOW_REQUIRED_VERSION);
        if (aVar.isStandAloneIntegration() && q11.b().isEnabled()) {
            Long dictLong = q11.b().getDictLong("minVersion");
            long longValue = dictLong != null ? dictLong.longValue() : -1L;
            if (longValue > 0 && longValue > parseLong) {
                z11 = true;
                this.f77676f.o(z11);
                return z11;
            }
        }
        z11 = false;
        this.f77676f.o(z11);
        return z11;
    }
}
