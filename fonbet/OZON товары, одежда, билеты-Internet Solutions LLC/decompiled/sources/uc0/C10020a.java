package uc0;

import De.C2862e;
import Fb0.f;
import Sc.s;
import Vb0.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6146J;
import dc0.C6151O;
import dc0.C6176v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc0.c;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;
import ru.ozon.id.nativeauth.crossApp.migration.data.model.PublicKeyBindMobileCredentials;
import tc0.EnumC9809a;
import xe.C10727i;
import xe.C10754w;
import xe.E0;
import xe.InterfaceC10750u;

/* renamed from: uc0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10020a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6151O f100605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f100606b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6176v f100607c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qc0.b f100608d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qc0.c f100609e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final sc0.c f100610f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final sc0.b f100611g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2862e f100612h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f100613i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<Unit> f100614j;

    /* renamed from: uc0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C2207a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f100615a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f100616b;

        /* renamed from: c, reason: collision with root package name */
        private final long f100617c;

        /* renamed from: d, reason: collision with root package name */
        private final long f100618d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f100619e;

        /* renamed from: f, reason: collision with root package name */
        private final String f100620f;

        /* renamed from: g, reason: collision with root package name */
        private final String f100621g;

        /* renamed from: h, reason: collision with root package name */
        private final String f100622h;

        public C2207a(@NotNull String authPublicKey, @NotNull String authPrivateKey, long j11, long j12, @NotNull String fromAppName, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(authPublicKey, "authPublicKey");
            Intrinsics.checkNotNullParameter(authPrivateKey, "authPrivateKey");
            Intrinsics.checkNotNullParameter(fromAppName, "fromAppName");
            this.f100615a = authPublicKey;
            this.f100616b = authPrivateKey;
            this.f100617c = j11;
            this.f100618d = j12;
            this.f100619e = fromAppName;
            this.f100620f = str;
            this.f100621g = str2;
            this.f100622h = str3;
        }

        public final String a() {
            return this.f100620f;
        }

        @NotNull
        public final String b() {
            return this.f100616b;
        }

        @NotNull
        public final String c() {
            return this.f100615a;
        }

        public final long d() {
            return this.f100618d;
        }

        @NotNull
        public final String e() {
            return this.f100619e;
        }

        public final String f() {
            return this.f100622h;
        }

        public final String g() {
            return this.f100621g;
        }

        public final long h() {
            return this.f100617c;
        }
    }

    public C10020a(C6151O ozonIdOldAccountManager, f ozonIdConfig, C6176v currentUserDataInteractor, qc0.b challengeKeyRepository, qc0.c crossAppChallengeKeySigner, sc0.c sharedStoreMigrationRepository, sc0.b keyBindRepository) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(ozonIdOldAccountManager, "ozonIdOldAccountManager");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(currentUserDataInteractor, "currentUserDataInteractor");
        Intrinsics.checkNotNullParameter(challengeKeyRepository, "challengeKeyRepository");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeySigner, "crossAppChallengeKeySigner");
        Intrinsics.checkNotNullParameter(sharedStoreMigrationRepository, "sharedStoreMigrationRepository");
        Intrinsics.checkNotNullParameter(keyBindRepository, "keyBindRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f100605a = ozonIdOldAccountManager;
        this.f100606b = ozonIdConfig;
        this.f100607c = currentUserDataInteractor;
        this.f100608d = challengeKeyRepository;
        this.f100609e = crossAppChallengeKeySigner;
        this.f100610f = sharedStoreMigrationRepository;
        this.f100611g = keyBindRepository;
        this.f100612h = coroutineScope;
        this.f100613i = new AtomicBoolean(false);
        this.f100614j = C10754w.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(kotlin.coroutines.jvm.internal.c cVar) {
        C10022c c10022c;
        int i11;
        C10020a c10020a;
        boolean z11;
        Long l11;
        if (cVar instanceof C10022c) {
            c10022c = (C10022c) cVar;
            int i12 = c10022c.f100632h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10022c.f100632h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10022c.f100630f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10022c.f100632h;
                if (i11 != 0) {
                    s.b(obj);
                    C6176v c6176v = this.f100607c;
                    boolean e11 = c6176v.e();
                    c10022c.f100628d = this;
                    c10022c.f100629e = e11;
                    c10022c.f100632h = 1;
                    obj = c6176v.c(c10022c);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c10020a = this;
                    z11 = e11;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = c10022c.f100629e;
                    c10020a = c10022c.f100628d;
                    s.b(obj);
                }
                l11 = (Long) obj;
                if (l11 == null) {
                    return Boolean.valueOf(z11 && !c10020a.f100608d.d(l11.longValue(), c10020a.f100606b.getAppName().a()));
                }
                return Boolean.FALSE;
            }
        }
        c10022c = new C10022c(this, cVar);
        Object obj2 = c10022c.f100630f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10022c.f100632h;
        if (i11 != 0) {
        }
        l11 = (Long) obj2;
        if (l11 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b A[LOOP:1: B:22:0x0135->B:24:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(List list, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        C10020a c10020a;
        ArrayList arrayList;
        Iterator it;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f100637h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f100637h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f100635f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f100637h;
                if (i11 != 0) {
                    s.b(obj);
                    List z02 = C7714v.z0(list);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    for (Object obj2 : z02) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        C6146J c6146j = (C6146J) obj2;
                        c.a a11 = this.f100609e.a();
                        String c11 = a11.c();
                        String b11 = a11.b();
                        long a12 = a11.a() + i13;
                        String a13 = c6146j.a();
                        Long h11 = c6146j.c().h();
                        C2207a c2207a = h11 != null ? new C2207a(c11, b11, h11.longValue(), a12, a13, c6146j.c().a(), c6146j.c().e(), c6146j.c().b()) : null;
                        if (c2207a != null) {
                            arrayList2.add(c2207a);
                        }
                        i13 = i14;
                    }
                    ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C2207a c2207a2 = (C2207a) it2.next();
                        arrayList3.add(new PublicKeyBindMobileCredentials(c2207a2.c(), c2207a2.e(), c2207a2.a(), c2207a2.g(), c2207a2.f()));
                    }
                    EnumC9809a enumC9809a = EnumC9809a.MIGRATE;
                    dVar.f100633d = this;
                    dVar.f100634e = arrayList2;
                    dVar.f100637h = 1;
                    obj = this.f100611g.a(arrayList3, enumC9809a, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c10020a = this;
                    arrayList = arrayList2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = dVar.f100634e;
                    c10020a = dVar.f100633d;
                    s.b(obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (list2.contains(((C2207a) obj3).c())) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C7714v.z(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    C2207a c2207a3 = (C2207a) it.next();
                    arrayList5.add(new AccountSignatureData(c2207a3.c(), c2207a3.b(), c2207a3.h(), c2207a3.e(), c2207a3.d()));
                }
                c10020a.f100608d.e(arrayList5);
                c10020a.f100610f.b();
                return Unit.f71690a;
            }
        }
        dVar = new d(this, cVar);
        Object obj4 = dVar.f100635f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f100637h;
        if (i11 != 0) {
        }
        List list22 = (List) obj4;
        ArrayList arrayList42 = new ArrayList();
        while (r3.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList(C7714v.z(arrayList42, 10));
        it = arrayList42.iterator();
        while (it.hasNext()) {
        }
        c10020a.f100608d.e(arrayList52);
        c10020a.f100610f.b();
        return Unit.f71690a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(7:18|19|20|(1:22)|23|24|25))(5:26|27|23|24|25))(3:28|(9:33|34|(4:37|(3:39|40|41)(1:43)|42|35)|44|45|(2:(2:53|(3:55|20|(0)))|51)(3:48|(1:50)|51)|23|24|25)(1:30)|32)))|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
    
        if (r10.s(r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0042, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[Catch: all -> 0x003f, Exception -> 0x0042, TRY_LEAVE, TryCatch #2 {Exception -> 0x0042, blocks: (B:19:0x003a, B:20:0x00ae, B:22:0x00b6, B:27:0x0047), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10021b c10021b;
        C10020a c10020a;
        C10020a c10020a2;
        C10020a c10020a3;
        ArrayList arrayList;
        try {
            if (cVar instanceof C10021b) {
                c10021b = (C10021b) cVar;
                int i11 = c10021b.f100627h;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c10021b.f100627h = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c10021b.f100625f;
                    Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                    c10020a = c10021b.f100627h;
                    if (c10020a == 0) {
                        if (c10020a == 1) {
                            C10020a c10020a4 = c10021b.f100623d;
                            s.b(obj);
                            c10020a2 = c10020a4;
                            c10020a2.f100614j.complete(Unit.f71690a);
                            return Unit.f71690a;
                        }
                        if (c10020a != 2) {
                            if (c10020a != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        arrayList = c10021b.f100624e;
                        C10020a c10020a5 = c10021b.f100623d;
                        s.b(obj);
                        c10020a3 = c10020a5;
                        c10020a2 = c10020a3;
                        if (((Boolean) obj).booleanValue()) {
                            c10020a3.getClass();
                            C10727i.c(c10020a3.f100612h, null, null, new e(c10020a3, arrayList, null), 3);
                            c10020a2 = c10020a3;
                        }
                        c10020a2.f100614j.complete(Unit.f71690a);
                        return Unit.f71690a;
                    }
                    s.b(obj);
                    if (this.f100613i.compareAndSet(false, true)) {
                        try {
                            boolean c11 = this.f100610f.c();
                            ArrayList b11 = this.f100605a.b();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = b11.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (!((C6146J) next).d()) {
                                    arrayList2.add(next);
                                }
                            }
                            if (arrayList2.isEmpty() || c11) {
                                if (c11) {
                                    c10021b.f100623d = this;
                                    c10021b.f100624e = arrayList2;
                                    c10021b.f100627h = 2;
                                    obj = f(c10021b);
                                    if (obj != obj2) {
                                        c10020a3 = this;
                                        arrayList = arrayList2;
                                        c10020a2 = c10020a3;
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                    }
                                }
                                c10020a2 = this;
                            } else {
                                c10021b.f100623d = this;
                                c10021b.f100627h = 1;
                                if (g(arrayList2, c10021b) == obj2) {
                                }
                                c10020a2 = this;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            c10020a = this;
                            E0.f(c10021b.getContext());
                            b.a.c(Vb0.b.f28514a, e);
                            c10020a2 = c10020a;
                            c10020a2.f100614j.complete(Unit.f71690a);
                            return Unit.f71690a;
                        } catch (Throwable th2) {
                            th = th2;
                            c10020a = this;
                            c10020a.f100614j.complete(Unit.f71690a);
                            throw th;
                        }
                        c10020a2.f100614j.complete(Unit.f71690a);
                        return Unit.f71690a;
                    }
                    InterfaceC10750u<Unit> interfaceC10750u = this.f100614j;
                    c10021b.f100627h = 3;
                    return obj2;
                }
            }
            if (c10020a == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c10021b = new C10021b(this, cVar);
        Object obj3 = c10021b.f100625f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        c10020a = c10021b.f100627h;
    }
}
