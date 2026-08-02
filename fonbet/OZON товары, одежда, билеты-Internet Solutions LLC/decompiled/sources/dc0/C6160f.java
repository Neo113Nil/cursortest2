package dc0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8492c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.t;
import ub0.C10014b;
import xe.C10727i;
import zb0.c;

/* renamed from: dc0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6160f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6178x> f61542a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f61543b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8492c> f61544c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.k> f61545d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.v> f61546e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6151O> f61547f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10014b> f61548g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6170p> f61549h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2862e f61550i;

    /* renamed from: dc0.f$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends zb0.c {
    }

    /* renamed from: dc0.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends c.e {
        b() {
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.AuthCookieHandler$onAuthCookiesCleared$1", f = "AuthCookieHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dc0.f$c */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: dc0.f$c$a */
        public static final class a extends c.a {
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6160f.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ((Cb0.k) C6160f.this.f61545d.getValue()).a(new a(), null);
            return Unit.f71690a;
        }
    }

    public C6160f() {
        throw null;
    }

    public C6160f(InterfaceC4008j currentUserRepository, InterfaceC4008j featureFlagsStore, InterfaceC4008j bindCrossAppPublicKeyUseCase, InterfaceC4008j authCookieEventHandler, InterfaceC4008j sso2ReauthorizeHandler, InterfaceC4008j ozonIdOldAccountManager, InterfaceC4008j fingerprintChecker, InterfaceC4008j cookieCleaner) {
        C2862e safeScope = td0.f.a();
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(bindCrossAppPublicKeyUseCase, "bindCrossAppPublicKeyUseCase");
        Intrinsics.checkNotNullParameter(authCookieEventHandler, "authCookieEventHandler");
        Intrinsics.checkNotNullParameter(sso2ReauthorizeHandler, "sso2ReauthorizeHandler");
        Intrinsics.checkNotNullParameter(ozonIdOldAccountManager, "ozonIdOldAccountManager");
        Intrinsics.checkNotNullParameter(fingerprintChecker, "fingerprintChecker");
        Intrinsics.checkNotNullParameter(cookieCleaner, "cookieCleaner");
        Intrinsics.checkNotNullParameter(safeScope, "safeScope");
        this.f61542a = currentUserRepository;
        this.f61543b = featureFlagsStore;
        this.f61544c = bindCrossAppPublicKeyUseCase;
        this.f61545d = authCookieEventHandler;
        this.f61546e = sso2ReauthorizeHandler;
        this.f61547f = ozonIdOldAccountManager;
        this.f61548g = fingerprintChecker;
        this.f61549h = cookieCleaner;
        this.f61550i = safeScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a1, code lost:
    
        if (r12 != r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C6160f c6160f, C6154S c6154s, C6154S c6154s2, ArrayList arrayList, kotlin.coroutines.jvm.internal.c cVar) {
        C6166l c6166l;
        Object obj;
        Wc.a aVar;
        int i11;
        C6160f c6160f2;
        zb0.c cVar2;
        C6154S c6154s3;
        C6154S c6154s4;
        C6154S c6154s5;
        C6154S c6154s6;
        c6160f.getClass();
        if (cVar instanceof C6166l) {
            c6166l = (C6166l) cVar;
            int i12 = c6166l.f61562j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6166l.f61562j = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c6166l.f61560h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6166l.f61562j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    zb0.c c6161g = (c6154s.i() && c6154s2.j()) ? new C6161g() : (c6154s.j() && c6154s2.i()) ? new C6162h() : !Intrinsics.d(c6154s.h(), c6154s2.h()) ? new C6163i() : (Intrinsics.d(c6154s.a(), c6154s2.a()) && Intrinsics.d(c6154s.b(), c6154s2.b())) ? null : new C6164j();
                    if (c6161g == null) {
                        c6160f.d(c6154s, c6154s2);
                        return Unit.f71690a;
                    }
                    if (!arrayList.isEmpty()) {
                        c6160f.f61547f.getValue().d(c6154s2, arrayList, c6161g);
                    }
                    if (c6161g instanceof c.AbstractC2326c) {
                        c6160f.f61544c.getValue().b();
                    }
                    Hb0.c value = c6160f.f61543b.getValue();
                    f.g gVar = f.g.f10802a;
                    c6166l.f61556d = c6160f;
                    c6166l.f61557e = c6154s;
                    c6166l.f61558f = c6154s2;
                    c6166l.f61559g = c6161g;
                    c6166l.f61562j = 1;
                    Object a11 = value.a(gVar, c6166l);
                    if (a11 != aVar) {
                        c6160f2 = c6160f;
                        cVar2 = c6161g;
                        obj = a11;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    cVar2 = c6166l.f61559g;
                    c6154s2 = c6166l.f61558f;
                    c6154s = c6166l.f61557e;
                    c6160f2 = c6166l.f61556d;
                    Sc.s.b(obj);
                } else {
                    if (i11 == 2) {
                        cVar2 = c6166l.f61559g;
                        c6154s4 = c6166l.f61558f;
                        c6154s3 = c6166l.f61557e;
                        c6160f2 = c6166l.f61556d;
                        Sc.s.b(obj);
                        C6154S c6154s7 = c6154s3;
                        c6154s2 = c6154s4;
                        c6154s = c6154s7;
                        Hb0.c value2 = c6160f2.f61543b.getValue();
                        f.o oVar = f.o.f10813a;
                        c6166l.f61556d = c6160f2;
                        c6166l.f61557e = c6154s;
                        c6166l.f61558f = c6154s2;
                        c6166l.f61559g = cVar2;
                        c6166l.f61562j = 3;
                        obj = value2.a(oVar, c6166l);
                        if (obj != aVar) {
                            C6154S c6154s8 = c6154s2;
                            c6154s5 = c6154s;
                            c6154s6 = c6154s8;
                            if (((Boolean) obj).booleanValue()) {
                                c6160f2.f61546e.getValue().k(t.a.f97469a);
                            }
                            Hb0.c value3 = c6160f2.f61543b.getValue();
                            f.o oVar2 = f.o.f10813a;
                            c6166l.f61556d = c6160f2;
                            c6166l.f61557e = c6154s5;
                            c6166l.f61558f = c6154s6;
                            c6166l.f61559g = cVar2;
                            c6166l.f61562j = 4;
                            obj = value3.a(oVar2, c6166l);
                        }
                        return aVar;
                    }
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = c6166l.f61559g;
                        c6154s6 = c6166l.f61558f;
                        c6154s5 = c6166l.f61557e;
                        c6160f2 = c6166l.f61556d;
                        Sc.s.b(obj);
                        if (!((Boolean) obj).booleanValue() || !(cVar2 instanceof a)) {
                            c6160f2.f61545d.getValue().a(cVar2, c6154s6);
                        }
                        c6160f2.d(c6154s5, c6154s6);
                        return Unit.f71690a;
                    }
                    cVar2 = c6166l.f61559g;
                    c6154s6 = c6166l.f61558f;
                    c6154s5 = c6166l.f61557e;
                    c6160f2 = c6166l.f61556d;
                    Sc.s.b(obj);
                    if (((Boolean) obj).booleanValue() && ((cVar2 instanceof c.AbstractC2326c) || (cVar2 instanceof c.d))) {
                        c6160f2.f61546e.getValue().k(t.a.f97469a);
                    }
                    Hb0.c value32 = c6160f2.f61543b.getValue();
                    f.o oVar22 = f.o.f10813a;
                    c6166l.f61556d = c6160f2;
                    c6166l.f61557e = c6154s5;
                    c6166l.f61558f = c6154s6;
                    c6166l.f61559g = cVar2;
                    c6166l.f61562j = 4;
                    obj = value32.a(oVar22, c6166l);
                }
                if (((Boolean) obj).booleanValue() && (cVar2 instanceof c.AbstractC2326c)) {
                    c6160f2.f61548g.getValue().j(C10014b.a.OnLogin);
                }
                if (!(cVar2 instanceof a)) {
                    C6170p value4 = c6160f2.f61549h.getValue();
                    c6166l.f61556d = c6160f2;
                    c6166l.f61557e = c6154s;
                    c6166l.f61558f = c6154s2;
                    c6166l.f61559g = cVar2;
                    c6166l.f61562j = 2;
                    if (value4.f(c6166l) != aVar) {
                        C6154S c6154s9 = c6154s2;
                        c6154s3 = c6154s;
                        c6154s4 = c6154s9;
                        C6154S c6154s72 = c6154s3;
                        c6154s2 = c6154s4;
                        c6154s = c6154s72;
                    }
                    return aVar;
                }
                Hb0.c value22 = c6160f2.f61543b.getValue();
                f.o oVar3 = f.o.f10813a;
                c6166l.f61556d = c6160f2;
                c6166l.f61557e = c6154s;
                c6166l.f61558f = c6154s2;
                c6166l.f61559g = cVar2;
                c6166l.f61562j = 3;
                obj = value22.a(oVar3, c6166l);
                if (obj != aVar) {
                }
                return aVar;
            }
        }
        c6166l = new C6166l(c6160f, cVar);
        obj = c6166l.f61560h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6166l.f61562j;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
            c6160f2.f61548g.getValue().j(C10014b.a.OnLogin);
        }
        if (!(cVar2 instanceof a)) {
        }
        Hb0.c value222 = c6160f2.f61543b.getValue();
        f.o oVar32 = f.o.f10813a;
        c6166l.f61556d = c6160f2;
        c6166l.f61557e = c6154s;
        c6166l.f61558f = c6154s2;
        c6166l.f61559g = cVar2;
        c6166l.f61562j = 3;
        obj = value222.a(oVar32, c6166l);
        if (obj != aVar) {
        }
        return aVar;
    }

    private final void d(C6154S c6154s, C6154S c6154s2) {
        if (Intrinsics.d(c6154s.f(), c6154s2.f()) && Intrinsics.d(c6154s.g(), c6154s2.g())) {
            return;
        }
        this.f61545d.getValue().a(new b(), null);
    }

    public final void e(@NotNull String host, @NotNull ArrayList newCookies) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(newCookies, "newCookies");
        C10727i.c(this.f61550i, null, null, new C6165k(this, newCookies, host, null), 3);
    }

    public final void f() {
        C10727i.c(this.f61550i, null, null, new c(null), 3);
    }
}
