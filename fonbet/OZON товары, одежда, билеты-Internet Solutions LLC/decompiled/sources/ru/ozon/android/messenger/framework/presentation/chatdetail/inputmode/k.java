package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Sc.o;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.u;

/* loaded from: classes10.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f89863a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0 f89864b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.j f89865c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89866d;

    /* renamed from: e, reason: collision with root package name */
    private String f89867e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Ae.x0<b> f89868f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final M0<b> f89869g;

    public k(@NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull x0 issueMessagesHandler, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.j chatStartupDelegate, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89863a = messagesRepository;
        this.f89864b = issueMessagesHandler;
        this.f89865c = chatStartupDelegate;
        this.f89866d = repository;
        Ae.x0<b> a11 = O0.a(b.a.f89824a);
        this.f89868f = a11;
        this.f89869g = C2399j.b(a11);
    }

    public static final boolean g(k kVar, q qVar) {
        kVar.getClass();
        return kotlin.text.h.A(r.d(qVar), "/footer", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        if (r13.d(r2, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        String d11;
        int i12;
        String value;
        k kVar;
        String str;
        Iterator it;
        String str2;
        k kVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i13 = dVar.f89838k;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f89838k = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f89836i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f89838k;
                if (i11 != 0) {
                    s.b(obj);
                    x0 x0Var = this.f89864b;
                    v0 j11 = x0Var.j();
                    if (j11 == null) {
                        return Unit.f71690a;
                    }
                    d11 = r.d(j11.c());
                    i12 = j11.f() != null ? 1 : 0;
                    x0Var.k();
                    x0Var.n(null);
                    this.f89867e = null;
                    List<q> j12 = this.f89863a.j(e.f89839b);
                    value = this.f89865c.j().getValue();
                    if (value == null) {
                        kVar = this;
                        if (i12 != 0) {
                            return Unit.f71690a;
                        }
                        ru.ozon.android.messenger.framework.domain.repository.d dVar2 = kVar.f89863a;
                        dVar.f89831d = kVar;
                        dVar.f89832e = d11;
                        dVar.f89833f = null;
                        dVar.f89834g = null;
                        dVar.f89838k = 2;
                        if (dVar2.h(d11, dVar) != aVar) {
                            str2 = d11;
                            kVar2 = kVar;
                            ru.ozon.android.messenger.framework.domain.repository.b bVar = kVar2.f89866d;
                            dVar.f89831d = null;
                            dVar.f89832e = null;
                            dVar.f89838k = 3;
                        }
                        return aVar;
                    }
                    kVar = this;
                    str = d11;
                    it = j12.iterator();
                } else if (i11 == 1) {
                    i12 = dVar.f89835h;
                    it = dVar.f89834g;
                    value = dVar.f89833f;
                    str = dVar.f89832e;
                    kVar = dVar.f89831d;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    str2 = dVar.f89832e;
                    kVar2 = dVar.f89831d;
                    s.b(obj);
                    ru.ozon.android.messenger.framework.domain.repository.b bVar2 = kVar2.f89866d;
                    dVar.f89831d = null;
                    dVar.f89832e = null;
                    dVar.f89838k = 3;
                }
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    ru.ozon.android.messenger.framework.domain.repository.b bVar3 = kVar.f89866d;
                    String d12 = r.d(qVar);
                    dVar.f89831d = kVar;
                    dVar.f89832e = str;
                    dVar.f89833f = value;
                    dVar.f89834g = it;
                    dVar.f89835h = i12;
                    dVar.f89838k = 1;
                    if (bVar3.m(value, d12, dVar) == aVar) {
                        break;
                    }
                }
                d11 = str;
                if (i12 != 0) {
                }
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f89836i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f89838k;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        d11 = str;
        if (i12 != 0) {
        }
    }

    private final Object k(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object g10 = this.f89863a.g(new i(this, qVar), cVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    private static q n(q qVar) {
        List<u> b11 = qVar.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        for (u uVar : b11) {
            if (uVar.c() instanceof ru.ozon.android.messenger.blocks.input.d) {
                uVar = u.a(uVar, ru.ozon.android.messenger.blocks.input.d.a((ru.ozon.android.messenger.blocks.input.d) uVar.c(), null, null, null, true, null, 6143));
            }
            arrayList.add(uVar);
        }
        return q.a(qVar, arrayList, null, 2);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c
    public final Object a(@NotNull ru.ozon.android.messenger.framework.domain.model.j jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        q a11 = jVar.a();
        this.f89868f.setValue(new b.C1660b(a11, jVar.d(), this.f89867e));
        Object k11 = k(a11, (kotlin.coroutines.jvm.internal.c) dVar);
        return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r6 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (h(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z11, boolean z12, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        Wc.a aVar;
        int i11;
        k kVar;
        Object g10;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f89858h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f89858h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f89856f;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f89858h;
                if (i11 != 0) {
                    s.b(obj);
                    this.f89868f.setValue(b.a.f89824a);
                    if (z11) {
                        hVar.f89854d = this;
                        hVar.f89855e = z12;
                        hVar.f89858h = 1;
                    }
                    kVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    z12 = hVar.f89855e;
                    kVar = hVar.f89854d;
                    s.b(obj);
                }
                hVar.f89854d = null;
                hVar.f89858h = 2;
                kVar.getClass();
                g10 = kVar.f89863a.g(new j(kVar, z12), hVar);
                if (g10 != aVar) {
                    g10 = Unit.f71690a;
                }
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f89856f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f89858h;
        if (i11 != 0) {
        }
        hVar.f89854d = null;
        hVar.f89858h = 2;
        kVar.getClass();
        g10 = kVar.f89863a.g(new j(kVar, z12), hVar);
        if (g10 != aVar) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a
    public final q c() {
        b value = this.f89868f.getValue();
        if (value instanceof b.C1660b) {
            return ((b.C1660b) value).a();
        }
        if (value instanceof b.c) {
            return ((b.c) value).a();
        }
        if (Intrinsics.d(value, b.a.f89824a)) {
            return null;
        }
        throw new o();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a
    public final boolean d(@NotNull q item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return !(this.f89868f.getValue() instanceof b.a) && kotlin.text.h.A(r.d(item), "/footer", false);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c
    @NotNull
    public final M0<b> e() {
        return this.f89869g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r2.k(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull q qVar, @NotNull String str, String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        k kVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f89846j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f89846j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f89844h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f89846j;
                if (i11 != 0) {
                    s.b(obj);
                    fVar.f89840d = this;
                    fVar.f89841e = qVar;
                    fVar.f89842f = str;
                    fVar.f89843g = str2;
                    fVar.f89846j = 1;
                    if (h(fVar) != aVar) {
                        kVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                str2 = fVar.f89843g;
                str = fVar.f89842f;
                qVar = fVar.f89841e;
                kVar = fVar.f89840d;
                s.b(obj);
                kVar.f89868f.setValue(new b.C1660b(qVar, str, str2));
                kVar.f89867e = str2;
                fVar.f89840d = null;
                fVar.f89841e = null;
                fVar.f89842f = null;
                fVar.f89843g = null;
                fVar.f89846j = 2;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f89844h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f89846j;
        if (i11 != 0) {
        }
        kVar.f89868f.setValue(new b.C1660b(qVar, str, str2));
        kVar.f89867e = str2;
        fVar.f89840d = null;
        fVar.f89841e = null;
        fVar.f89842f = null;
        fVar.f89843g = null;
        fVar.f89846j = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r2.k(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(@NotNull q qVar, @NotNull String str, @NotNull BlockDTO blockDTO, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        k kVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f89853j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f89853j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f89851h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f89853j;
                if (i11 != 0) {
                    s.b(obj);
                    gVar.f89847d = this;
                    gVar.f89848e = qVar;
                    gVar.f89849f = str;
                    gVar.f89850g = blockDTO;
                    gVar.f89853j = 1;
                    if (h(gVar) != aVar) {
                        kVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                blockDTO = gVar.f89850g;
                str = gVar.f89849f;
                qVar = gVar.f89848e;
                kVar = gVar.f89847d;
                s.b(obj);
                kVar.f89868f.setValue(new b.c(qVar, str, blockDTO));
                gVar.f89847d = null;
                gVar.f89848e = null;
                gVar.f89849f = null;
                gVar.f89850g = null;
                gVar.f89853j = 2;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f89851h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f89853j;
        if (i11 != 0) {
        }
        kVar.f89868f.setValue(new b.c(qVar, str, blockDTO));
        gVar.f89847d = null;
        gVar.f89848e = null;
        gVar.f89849f = null;
        gVar.f89850g = null;
        gVar.f89853j = 2;
    }

    public final Object l(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b value = this.f89868f.getValue();
        if (value instanceof b.C1660b) {
            Object k11 = k(n(((b.C1660b) value).a()), (kotlin.coroutines.jvm.internal.c) dVar);
            return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : Unit.f71690a;
        }
        if (value instanceof b.c) {
            Object k12 = k(n(((b.c) value).a()), (kotlin.coroutines.jvm.internal.c) dVar);
            return k12 == Wc.a.COROUTINE_SUSPENDED ? k12 : Unit.f71690a;
        }
        if (Intrinsics.d(value, b.a.f89824a)) {
            return Unit.f71690a;
        }
        throw new o();
    }

    public final q m(@NotNull String newText) {
        String str;
        Intrinsics.checkNotNullParameter(newText, "newText");
        b value = this.f89868f.getValue();
        b.C1660b c1660b = value instanceof b.C1660b ? (b.C1660b) value : null;
        if (c1660b == null) {
            return null;
        }
        q a11 = c1660b.a();
        List<u> b11 = a11.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        for (u uVar : b11) {
            if (uVar.c() instanceof ru.ozon.android.messenger.blocks.input.d) {
                str = newText;
                uVar = u.a(uVar, ru.ozon.android.messenger.blocks.input.d.a((ru.ozon.android.messenger.blocks.input.d) uVar.c(), str, null, null, false, null, 8175));
            } else {
                str = newText;
            }
            arrayList.add(uVar);
            newText = str;
        }
        return q.a(a11, arrayList, null, 2);
    }
}
