package ru.ozon.id.nativeauth.sso2;

import Sc.InterfaceC4008j;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6144H;
import dc0.C6154S;
import dc0.C6171q;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.t;

/* renamed from: ru.ozon.id.nativeauth.sso2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9551e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f97395a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.i> f97396b;

    /* renamed from: ru.ozon.id.nativeauth.sso2.e$a */
    public interface a {

        /* renamed from: ru.ozon.id.nativeauth.sso2.e$a$a, reason: collision with other inner class name */
        public static final class C2139a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97397a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f97398b;

            public C2139a(@NotNull String value, boolean z11) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f97397a = value;
                this.f97398b = z11;
            }

            @NotNull
            public final String a() {
                return this.f97397a;
            }

            public final boolean b() {
                return this.f97398b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2139a)) {
                    return false;
                }
                C2139a c2139a = (C2139a) obj;
                return Intrinsics.d(this.f97397a, c2139a.f97397a) && this.f97398b == c2139a.f97398b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f97398b) + (this.f97397a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Domain(value=");
                sb2.append(this.f97397a);
                sb2.append(", isRequired=");
                return Pk0.a.a(")", sb2, this.f97398b);
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.sso2.e$a$b */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final LinkedHashSet f97399a;

            public b(@NotNull LinkedHashSet domains) {
                Intrinsics.checkNotNullParameter(domains, "domains");
                this.f97399a = domains;
            }

            @NotNull
            public final Set<C2139a> a() {
                return this.f97399a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f97399a.equals(((b) obj).f97399a);
            }

            public final int hashCode() {
                return this.f97399a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ListDomains(domains=" + this.f97399a + ")";
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.sso2.e$a$c */
        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f97400a = new c();
        }

        /* renamed from: ru.ozon.id.nativeauth.sso2.e$a$d */
        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f97401a = new d();
        }
    }

    public C9551e(@NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<hd0.i> sso2MobileConfigRepository) {
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        this.f97395a = localCookieDataSource;
        this.f97396b = sso2MobileConfigRepository;
    }

    private static void a(LinkedHashSet linkedHashSet, String str, Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO) {
        boolean z11 = false;
        if (sso2MobileConfigResponseDTO != null) {
            List<String> requiredDomains = sso2MobileConfigResponseDTO.getRequiredDomains();
            if (!(requiredDomains instanceof Collection) || !requiredDomains.isEmpty()) {
                Iterator<T> it = requiredDomains.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.d((String) it.next(), str)) {
                        z11 = true;
                        break;
                    }
                }
            }
        }
        linkedHashSet.add(new a.C2139a(str, z11));
    }

    private static boolean c(C6154S c6154s, C6154S c6154s2) {
        if (Intrinsics.d(c6154s != null ? c6154s.d() : null, c6154s2.h())) {
            return (c6154s != null ? c6154s.f() : null) == null && c6154s2.f() != null;
        }
        return true;
    }

    private final boolean d(String str, C6154S c6154s) {
        if (cc0.c.e(str) == null) {
            return false;
        }
        return !c(C6171q.C(C6171q.m(C6144H.h(this.f97395a.getValue(), r2))), c6154s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r0.d(r4.a(), r6) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull t tVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9552f c9552f;
        int i11;
        boolean z11;
        C9551e c9551e;
        boolean z12;
        if (cVar instanceof C9552f) {
            c9552f = (C9552f) cVar;
            int i12 = c9552f.f97406h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9552f.f97406h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9552f.f97404f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9552f.f97406h;
                z11 = true;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (Intrinsics.d(tVar, t.a.f97469a)) {
                        return a.d.f97401a;
                    }
                    hd0.i value = this.f97396b.getValue();
                    c9552f.f97402d = this;
                    c9552f.f97403e = tVar;
                    c9552f.f97406h = 1;
                    obj = value.f(c9552f);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c9551e = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c9552f.f97403e;
                    c9551e = c9552f.f97402d;
                    Sc.s.b(obj);
                }
                Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                Set<String> allDomains = sso2MobileConfigResponseDTO == null ? sso2MobileConfigResponseDTO.getAllDomains() : null;
                z12 = tVar instanceof t.c.a;
                a.c cVar2 = a.c.f97400a;
                if ((!z12 && !(tVar instanceof t.c.d)) || (allDomains != null && allDomains.contains(((t.c) tVar).a()))) {
                    C6154S C11 = C6171q.C(c9551e.f97395a.getValue().i());
                    if (!(tVar instanceof t.a) && !(tVar instanceof t.b) && !(tVar instanceof t.c.b) && !(tVar instanceof t.c.C2140c)) {
                        if (!z12) {
                            t.c.a aVar2 = (t.c.a) tVar;
                            String d11 = aVar2.b().d("Cookie");
                            if (c(d11 != null ? C6171q.C(C6171q.B(d11)) : null, C11)) {
                            }
                        } else {
                            if (!(tVar instanceof t.c.d)) {
                                throw new Sc.o();
                            }
                            z11 = c9551e.d(((t.c) tVar).a(), C11);
                        }
                        if (!z11) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            if ((tVar instanceof t.c.b) || (tVar instanceof t.c.C2140c)) {
                                a(linkedHashSet, ((t.c) tVar).a(), sso2MobileConfigResponseDTO);
                            }
                            if (allDomains != null) {
                                for (String str : allDomains) {
                                    if (!c9551e.d(str, C11)) {
                                        a(linkedHashSet, str, sso2MobileConfigResponseDTO);
                                    }
                                }
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new a.b(linkedHashSet);
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                return cVar2;
            }
        }
        c9552f = new C9552f(this, cVar);
        Object obj2 = c9552f.f97404f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9552f.f97406h;
        z11 = true;
        if (i11 != 0) {
        }
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO2 = (Sso2MobileConfigResponseDTO) obj2;
        if (sso2MobileConfigResponseDTO2 == null) {
        }
        z12 = tVar instanceof t.c.a;
        a.c cVar22 = a.c.f97400a;
        if (!z12) {
            C6154S C112 = C6171q.C(c9551e.f97395a.getValue().i());
            if (!(tVar instanceof t.a)) {
                if (!z12) {
                }
                if (!z11) {
                }
                return cVar22;
            }
            z11 = false;
            if (!z11) {
            }
            return cVar22;
        }
        C6154S C1122 = C6171q.C(c9551e.f97395a.getValue().i());
        if (!(tVar instanceof t.a)) {
        }
        z11 = false;
        if (!z11) {
        }
        return cVar22;
    }
}
