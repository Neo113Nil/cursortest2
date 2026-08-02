package ub0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.r;
import Sc.s;
import We.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import id0.C7050a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.B;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.antibot.FingerprintRequestDTO;
import ru.ozon.id.antibot.FingerprintResponseDTO;
import ru.ozon.id.antibot.challenge.mf.FingerprintApi;
import ub0.C10013a;
import wb0.C10469a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.U;
import xe.Y;
import xe.f1;

/* renamed from: ub0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10014b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10013a> f100512a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<FingerprintApi> f100513b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<B> f100514c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f100515d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<String> f100516e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f100517f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2862e f100518g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100519h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100520i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ub0.b$a */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a OnAuthAppLaunch;
        public static final a OnLogin;

        static {
            a aVar = new a("OnLogin", 0);
            OnLogin = aVar;
            a aVar2 = new a("OnAuthAppLaunch", 1);
            OnAuthAppLaunch = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    /* renamed from: ub0.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2206b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100521a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.OnLogin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.OnAuthAppLaunch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100521a = iArr;
        }
    }

    /* renamed from: ub0.b$c */
    static final class c extends AbstractC7737t implements Function0<A> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A invoke() {
            A.b bVar = A.f33515l;
            String str = C10014b.this.f100516e.getValue() + "/abt/result-mobile";
            bVar.getClass();
            A.a j11 = A.b.c(str).j();
            j11.d("isAsyncOnAuthAppLaunch", "true");
            return j11.e();
        }
    }

    /* renamed from: ub0.b$d */
    static final class d extends AbstractC7737t implements Function0<A> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A invoke() {
            A.a j11 = C10014b.a(C10014b.this).j();
            j11.o();
            j11.d("isAsyncOnLogin", "true");
            return j11.e();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.mf.FingerprintChecker$sendAsyncFingerprintAfterDelay$1", f = "FingerprintChecker.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: ub0.b$e */
    static final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f100524d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f100526f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f100526f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10014b.this.new e(this.f100526f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f100524d;
            if (i11 == 0) {
                s.b(obj);
                this.f100524d = 1;
                if (C10014b.e(C10014b.this, this.f100526f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10014b(@NotNull InterfaceC4008j<C10013a> fingerprintBuilder, @NotNull InterfaceC4008j<? extends FingerprintApi> fingerprintApi, @NotNull InterfaceC4008j<B> ozonIdTrackingManager, @NotNull InterfaceC4008j<C7050a> trackingRepository, @NotNull InterfaceC4008j<String> primaryRequestUrl, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(fingerprintBuilder, "fingerprintBuilder");
        Intrinsics.checkNotNullParameter(fingerprintApi, "fingerprintApi");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(primaryRequestUrl, "primaryRequestUrl");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f100512a = fingerprintBuilder;
        this.f100513b = fingerprintApi;
        this.f100514c = ozonIdTrackingManager;
        this.f100515d = trackingRepository;
        this.f100516e = primaryRequestUrl;
        this.f100517f = featureFlagsStore;
        this.f100518g = N.g(td0.f.a(), C10720e0.a());
        this.f100519h = k.b(new c());
        this.f100520i = k.b(new d());
    }

    public static final A a(C10014b c10014b) {
        return (A) c10014b.f100519h.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0066, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(C10014b c10014b, a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        C10015c c10015c;
        int i11;
        long longValue;
        C10014b c10014b2;
        a aVar2;
        C10014b c10014b3;
        int i12;
        A a11;
        int i13;
        C10013a.EnumC2205a enumC2205a;
        C10014b c10014b4;
        c10014b.getClass();
        if (cVar instanceof C10015c) {
            c10015c = (C10015c) cVar;
            int i14 = c10015c.f100531h;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10015c.f100531h = i14 - LinearLayoutManager.INVALID_OFFSET;
                C10015c c10015c2 = c10015c;
                Object obj = c10015c2.f100529f;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10015c2.f100531h;
                if (i11 != 0) {
                    s.b(obj);
                    Hb0.c value = c10014b.f100517f.getValue();
                    f.C0219f c0219f = f.C0219f.f10800a;
                    c10015c2.f100527d = c10014b;
                    c10015c2.f100528e = aVar;
                    c10015c2.f100531h = 1;
                    obj = value.a(c0219f, c10015c2);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = c10015c2.f100528e;
                            c10014b4 = c10015c2.f100527d;
                            s.b(obj);
                            c10014b4.f100515d.getValue().c(new C10016d(c10014b4, aVar2, (s.e) obj));
                            return Unit.f71690a;
                        }
                        aVar2 = c10015c2.f100528e;
                        c10014b3 = c10015c2.f100527d;
                        Sc.s.b(obj);
                        c10014b2 = c10014b3;
                        int[] iArr = C2206b.f100521a;
                        i12 = iArr[aVar2.ordinal()];
                        if (i12 == 1) {
                            a11 = (A) c10014b2.f100520i.getValue();
                        } else {
                            if (i12 != 2) {
                                throw new o();
                            }
                            a11 = (A) c10014b2.f100519h.getValue();
                        }
                        i13 = iArr[aVar2.ordinal()];
                        if (i13 == 1) {
                            enumC2205a = C10013a.EnumC2205a.AsyncOnLogin;
                        } else {
                            if (i13 != 2) {
                                throw new o();
                            }
                            enumC2205a = C10013a.EnumC2205a.AsyncOnAuthAppLaunch;
                        }
                        C10013a.EnumC2205a enumC2205a2 = enumC2205a;
                        c10015c2.f100527d = c10014b2;
                        c10015c2.f100528e = aVar2;
                        c10015c2.f100531h = 3;
                        obj = c10014b2.i(a11, enumC2205a2, null, null, c10015c2);
                        if (obj != aVar3) {
                            c10014b4 = c10014b2;
                            c10014b4.f100515d.getValue().c(new C10016d(c10014b4, aVar2, (s.e) obj));
                            return Unit.f71690a;
                        }
                        return aVar3;
                    }
                    aVar = c10015c2.f100528e;
                    c10014b = c10015c2.f100527d;
                    Sc.s.b(obj);
                }
                longValue = ((Number) obj).longValue();
                if (longValue > 0) {
                    c10014b2 = c10014b;
                    aVar2 = aVar;
                    int[] iArr2 = C2206b.f100521a;
                    i12 = iArr2[aVar2.ordinal()];
                    if (i12 == 1) {
                    }
                    i13 = iArr2[aVar2.ordinal()];
                    if (i13 == 1) {
                    }
                    C10013a.EnumC2205a enumC2205a22 = enumC2205a;
                    c10015c2.f100527d = c10014b2;
                    c10015c2.f100528e = aVar2;
                    c10015c2.f100531h = 3;
                    obj = c10014b2.i(a11, enumC2205a22, null, null, c10015c2);
                    if (obj != aVar3) {
                    }
                    return aVar3;
                }
                c10015c2.f100527d = c10014b;
                c10015c2.f100528e = aVar;
                c10015c2.f100531h = 2;
                if (Y.b(longValue, c10015c2) != aVar3) {
                    a aVar4 = aVar;
                    c10014b3 = c10014b;
                    aVar2 = aVar4;
                    c10014b2 = c10014b3;
                    int[] iArr22 = C2206b.f100521a;
                    i12 = iArr22[aVar2.ordinal()];
                    if (i12 == 1) {
                    }
                    i13 = iArr22[aVar2.ordinal()];
                    if (i13 == 1) {
                    }
                    C10013a.EnumC2205a enumC2205a222 = enumC2205a;
                    c10015c2.f100527d = c10014b2;
                    c10015c2.f100528e = aVar2;
                    c10015c2.f100531h = 3;
                    obj = c10014b2.i(a11, enumC2205a222, null, null, c10015c2);
                    if (obj != aVar3) {
                    }
                }
                return aVar3;
            }
        }
        c10015c = new C10015c(c10014b, cVar);
        C10015c c10015c22 = c10015c;
        Object obj2 = c10015c22.f100529f;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10015c22.f100531h;
        if (i11 != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (longValue > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(A a11, C10013a.EnumC2205a enumC2205a, String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        ub0.e eVar;
        int i11;
        String str3;
        A a12;
        long j11;
        C10013a.EnumC2205a enumC2205a2;
        String str4;
        C10014b c10014b;
        long longValue;
        Object a13;
        String str5;
        long j12;
        C10014b c10014b2;
        U a14;
        String str6;
        String str7;
        C10014b c10014b3;
        A a15;
        long j13;
        String str8;
        long j14;
        Object obj;
        C10014b c10014b4;
        long j15;
        r rVar;
        Object a16;
        s.f fVar;
        if (cVar instanceof ub0.e) {
            eVar = (ub0.e) cVar;
            int i12 = eVar.f100544m;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f100544m = i12 - LinearLayoutManager.INVALID_OFFSET;
                ub0.e eVar2 = eVar;
                Object obj2 = eVar2.f100542k;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar2.f100544m;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    long currentTimeMillis = System.currentTimeMillis();
                    Hb0.c value = this.f100517f.getValue();
                    f.e eVar3 = f.e.f10799a;
                    eVar2.f100535d = this;
                    eVar2.f100536e = a11;
                    eVar2.f100537f = enumC2205a;
                    eVar2.f100538g = str;
                    str3 = str2;
                    eVar2.f100539h = str3;
                    eVar2.f100540i = currentTimeMillis;
                    eVar2.f100544m = 1;
                    obj2 = value.a(eVar3, eVar2);
                    if (obj2 != aVar) {
                        a12 = a11;
                        j11 = currentTimeMillis;
                        enumC2205a2 = enumC2205a;
                        str4 = str;
                        c10014b = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j15 = eVar2.f100540i;
                        c10014b4 = eVar2.f100535d;
                        try {
                            Sc.s.b(obj2);
                            obj = null;
                            try {
                                a16 = (s.f) obj2;
                                r.Companion companion = r.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                r.Companion companion2 = r.INSTANCE;
                                a16 = Sc.s.a(th);
                                fVar = (s.f) (a16 instanceof r.b ? obj : a16);
                                if (fVar != null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = null;
                            r.Companion companion22 = r.INSTANCE;
                            a16 = Sc.s.a(th);
                            fVar = (s.f) (a16 instanceof r.b ? obj : a16);
                            if (fVar != null) {
                            }
                        }
                        fVar = (s.f) (a16 instanceof r.b ? obj : a16);
                        if (fVar != null) {
                            return new s.e(fVar, j15);
                        }
                        c10014b4.getClass();
                        return new s.e(s.f.FingerprintChallengeError, j15);
                    }
                    longValue = eVar2.f100541j;
                    j13 = eVar2.f100540i;
                    a14 = (U) eVar2.f100539h;
                    str7 = eVar2.f100538g;
                    str6 = (String) eVar2.f100537f;
                    a15 = eVar2.f100536e;
                    c10014b3 = eVar2.f100535d;
                    Sc.s.b(obj2);
                    rVar = (r) obj2;
                    if (rVar != null) {
                        a14.j(null);
                        return new s.e(s.f.FingerprintChallengeTimeout, longValue);
                    }
                    a13 = rVar.getF26106a();
                    c10014b2 = c10014b3;
                    str3 = str7;
                    j12 = j13;
                    str5 = str6;
                    a12 = a15;
                    long currentTimeMillis2 = System.currentTimeMillis() - j12;
                    r.Companion companion3 = r.INSTANCE;
                    if (a13 instanceof r.b) {
                        a13 = null;
                    }
                    str8 = (String) a13;
                    if (str8 != null) {
                        c10014b2.getClass();
                        return new s.e(s.f.FingerprintChallengeError, currentTimeMillis2);
                    }
                    try {
                        eVar2.f100535d = c10014b2;
                        obj = null;
                        try {
                            eVar2.f100536e = null;
                            eVar2.f100537f = null;
                            eVar2.f100538g = null;
                            eVar2.f100539h = null;
                            eVar2.f100540i = currentTimeMillis2;
                            eVar2.f100544m = 3;
                            j14 = currentTimeMillis2;
                            try {
                                obj2 = c10014b2.k(a12, str8, str5, str3, eVar2);
                            } catch (Throwable th4) {
                                th = th4;
                                c10014b4 = c10014b2;
                                j15 = j14;
                                r.Companion companion222 = r.INSTANCE;
                                a16 = Sc.s.a(th);
                                fVar = (s.f) (a16 instanceof r.b ? obj : a16);
                                if (fVar != null) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j14 = currentTimeMillis2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        j14 = currentTimeMillis2;
                        obj = null;
                    }
                    if (obj2 != aVar) {
                        c10014b4 = c10014b2;
                        j15 = j14;
                        a16 = (s.f) obj2;
                        r.Companion companion4 = r.INSTANCE;
                        fVar = (s.f) (a16 instanceof r.b ? obj : a16);
                        if (fVar != null) {
                        }
                    }
                    return aVar;
                }
                j11 = eVar2.f100540i;
                String str9 = (String) eVar2.f100539h;
                str4 = eVar2.f100538g;
                enumC2205a2 = (C10013a.EnumC2205a) eVar2.f100537f;
                a12 = eVar2.f100536e;
                c10014b = eVar2.f100535d;
                Sc.s.b(obj2);
                str3 = str9;
                long j16 = j11;
                longValue = ((Number) obj2).longValue();
                if (longValue <= 0) {
                    a14 = C10727i.a(c10014b.f100518g, null, null, new g(c10014b, enumC2205a2, str3, null), 3);
                    f fVar2 = new f(a14, null);
                    eVar2.f100535d = c10014b;
                    eVar2.f100536e = a12;
                    eVar2.f100537f = str4;
                    eVar2.f100538g = str3;
                    eVar2.f100539h = a14;
                    String str10 = str4;
                    eVar2.f100540i = j16;
                    eVar2.f100541j = longValue;
                    eVar2.f100544m = 2;
                    obj2 = f1.c(longValue, fVar2, eVar2);
                    if (obj2 != aVar) {
                        A a17 = a12;
                        str6 = str10;
                        str7 = str3;
                        c10014b3 = c10014b;
                        a15 = a17;
                        j13 = j16;
                        rVar = (r) obj2;
                        if (rVar != null) {
                        }
                    }
                    return aVar;
                }
                String str11 = str4;
                try {
                    r.Companion companion5 = r.INSTANCE;
                    a13 = c10014b.f100512a.getValue().a(enumC2205a2, str3);
                } catch (Throwable th7) {
                    r.Companion companion6 = r.INSTANCE;
                    a13 = Sc.s.a(th7);
                }
                str5 = str11;
                j12 = j16;
                c10014b2 = c10014b;
                long currentTimeMillis22 = System.currentTimeMillis() - j12;
                r.Companion companion32 = r.INSTANCE;
                if (a13 instanceof r.b) {
                }
                str8 = (String) a13;
                if (str8 != null) {
                }
            }
        }
        eVar = new ub0.e(this, cVar);
        ub0.e eVar22 = eVar;
        Object obj22 = eVar22.f100542k;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar22.f100544m;
        if (i11 != 0) {
        }
        long j162 = j11;
        longValue = ((Number) obj22).longValue();
        if (longValue <= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum k(A a11, String str, String str2, String str3, kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f100553f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f100553f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f100551d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f100553f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Integer num = new Integer(1);
                    if (str3 == null) {
                        num = null;
                    }
                    FingerprintRequestDTO fingerprintRequestDTO = new FingerprintRequestDTO(str, str2, num);
                    FingerprintApi value = this.f100513b.getValue();
                    hVar.f100553f = 1;
                    obj = value.sendFingerprint(a11, fingerprintRequestDTO, Ic0.j.f12234a, hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                Boolean isValid = ((FingerprintResponseDTO) obj).isValid();
                return !Intrinsics.d(isValid, Boolean.TRUE) ? s.f.FingerprintChallengeSuccess : Intrinsics.d(isValid, Boolean.FALSE) ? s.f.FingerprintChallengeBlock : s.f.FingerprintChallengeError;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f100551d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f100553f;
        if (i11 != 0) {
        }
        Boolean isValid2 = ((FingerprintResponseDTO) obj2).isValid();
        if (!Intrinsics.d(isValid2, Boolean.TRUE)) {
        }
    }

    public final Object h(@NotNull C10469a c10469a, @NotNull kotlin.coroutines.d<? super s.e> dVar) {
        if (!Intrinsics.d(c10469a.h(), Boolean.TRUE)) {
            return new s.e(s.f.FingerprintChallengeNoNeed);
        }
        A j11 = c10469a.i().L().j();
        A.a aVar = new A.a();
        aVar.s(j11.u());
        aVar.j(j11.h());
        aVar.f();
        return i(aVar.e(), C10013a.EnumC2205a.Antibot, c10469a.g(), c10469a.f(), (kotlin.coroutines.jvm.internal.c) dVar);
    }

    public final void j(@NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(this.f100518g, He.b.f10879b, null, new e(type, null), 2);
    }
}
