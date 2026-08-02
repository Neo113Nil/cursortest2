package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.framework.domain.model.h;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.u0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.service.z f89000a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89001b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0 f89002c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.service.c f89003d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f89004e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.a f89005f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC9383a f89006g;

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89007a;

        public a(@NotNull String extraMessage) {
            Intrinsics.checkNotNullParameter(extraMessage, "extraMessage");
            this.f89007a = extraMessage;
        }

        @Override // java.lang.Throwable
        @NotNull
        public final String getLocalizedMessage() {
            return this.f89007a;
        }
    }

    public P(@NotNull ru.ozon.android.messenger.framework.domain.service.z messageComposer, @NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, @NotNull x0 issueMessagesHandler, @NotNull ru.ozon.android.messenger.framework.domain.service.c chatSendMessageDelegate, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.domain.a alertManager, InterfaceC9383a interfaceC9383a) {
        Intrinsics.checkNotNullParameter(messageComposer, "messageComposer");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(chatSendMessageDelegate, "chatSendMessageDelegate");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(alertManager, "alertManager");
        this.f89000a = messageComposer;
        this.f89001b = chatRepository;
        this.f89002c = issueMessagesHandler;
        this.f89003d = chatSendMessageDelegate;
        this.f89004e = messagesRepository;
        this.f89005f = alertManager;
        this.f89006g = interfaceC9383a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r7.y(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(g.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        Q q11;
        int i11;
        if (cVar instanceof Q) {
            q11 = (Q) cVar;
            int i12 = q11.f89010f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                q11.f89010f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = q11.f89008d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = q11.f89010f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.domain.repository.b bVar2 = this.f89001b;
                    if (bVar2.l().getValue() instanceof AbstractC9330a.C1590a) {
                        String c11 = bVar.c();
                        q11.f89010f = 1;
                        Object k11 = k(c11, q11);
                        if (k11 != obj2) {
                            return k11;
                        }
                    } else {
                        this.f89002c.o(true);
                        q11.f89010f = 2;
                    }
                    return obj2;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    return obj;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return new i.a.h(0);
            }
        }
        q11 = new Q(this, cVar);
        Object obj3 = q11.f89008d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = q11.f89010f;
        if (i11 != 0) {
        }
        return new i.a.h(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r7.y(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(g.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        S s11;
        int i11;
        if (cVar2 instanceof S) {
            s11 = (S) cVar2;
            int i12 = s11.f89013f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                s11.f89013f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = s11.f89011d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = s11.f89013f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = this.f89001b;
                    if (bVar.l().getValue() instanceof AbstractC9330a.C1590a) {
                        String a11 = cVar.a();
                        if (a11 == null) {
                            return new i.a.c();
                        }
                        s11.f89013f = 2;
                        obj = j(a11, s11);
                    } else {
                        s11.f89013f = 1;
                    }
                    return obj2;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    return new i.a.h(0);
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    return new i.b(h.b.f88845a);
                }
                if (iVar instanceof i.a) {
                    return iVar;
                }
                throw new Sc.o();
            }
        }
        s11 = new S(this, cVar2);
        Object obj3 = s11.f89011d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = s11.f89013f;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(g.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        T t2;
        int i11;
        P p11;
        ru.ozon.android.messenger.framework.domain.model.e eVar;
        if (cVar instanceof T) {
            t2 = (T) cVar;
            int i12 = t2.f89018h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                t2.f89018h = i12 - LinearLayoutManager.INVALID_OFFSET;
                T t11 = t2;
                Object obj = t11.f89016f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = t11.f89018h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String a11 = aVar.a();
                    t11.f89014d = this;
                    t11.f89015e = aVar;
                    t11.f89018h = 1;
                    obj = this.f89000a.a(aVar, a11);
                    if (obj != obj2) {
                        p11 = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                aVar = t11.f89015e;
                p11 = t11.f89014d;
                Sc.s.b(obj);
                eVar = (ru.ozon.android.messenger.framework.domain.model.e) ((ru.ozon.android.messenger.utils.i) obj).a();
                if (eVar != null) {
                    return new i.a.j();
                }
                ru.ozon.android.messenger.framework.domain.service.c cVar2 = p11.f89003d;
                ru.ozon.android.messenger.framework.presentation.models.q a12 = eVar.a();
                ru.ozon.android.messenger.framework.data.remote.models.c b11 = eVar.b();
                boolean b12 = aVar.b();
                t11.f89014d = null;
                t11.f89015e = null;
                t11.f89018h = 2;
                Object a13 = cVar2.a(a12, b11, true, false, b12, t11);
                return a13 == obj2 ? obj2 : a13;
            }
        }
        t2 = new T(this, cVar);
        T t112 = t2;
        Object obj3 = t112.f89016f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = t112.f89018h;
        if (i11 != 0) {
        }
        eVar = (ru.ozon.android.messenger.framework.domain.model.e) ((ru.ozon.android.messenger.utils.i) obj3).a();
        if (eVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, kotlin.coroutines.jvm.internal.c cVar) {
        U u11;
        int i11;
        P p11;
        v0 j11;
        if (cVar instanceof U) {
            u11 = (U) cVar;
            int i12 = u11.f89023h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                u11.f89023h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = u11.f89021f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = u11.f89023h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    u11.f89019d = this;
                    u11.f89020e = str;
                    u11.f89023h = 1;
                    if (this.f89005f.a(str, u11) == aVar) {
                        return aVar;
                    }
                    p11 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = u11.f89020e;
                    p11 = u11.f89019d;
                    Sc.s.b(obj);
                    ((Sc.r) obj).getClass();
                }
                j11 = p11.f89002c.j();
                if (j11 == null) {
                    p11.f89003d.b(j11);
                    return new i.b(Unit.f71690a);
                }
                InterfaceC9383a interfaceC9383a = p11.f89006g;
                if (interfaceC9383a != null) {
                    interfaceC9383a.a(new a(Nk.a.b("SendMessage: resendMessageAfterConfirmation failed, ", str)));
                }
                return new i.a.j();
            }
        }
        u11 = new U(this, cVar);
        Object obj2 = u11.f89021f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = u11.f89023h;
        if (i11 != 0) {
        }
        j11 = p11.f89002c.j();
        if (j11 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0111, code lost:
    
        if (r3.a(r3, r1, false, true, true, r9) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r1 != r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, kotlin.coroutines.jvm.internal.c cVar) {
        V v11;
        V v12;
        Wc.a aVar;
        int i11;
        String str2;
        P p11;
        ru.ozon.android.messenger.framework.domain.repository.d dVar;
        String str3;
        P p12;
        String str4;
        ru.ozon.android.messenger.framework.presentation.models.s sVar;
        ru.ozon.android.messenger.framework.presentation.models.q qVar;
        ru.ozon.android.messenger.framework.presentation.models.s sVar2;
        InterfaceC9383a interfaceC9383a;
        if (cVar instanceof V) {
            v11 = (V) cVar;
            int i12 = v11.f89030j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                v11.f89030j = i12 - LinearLayoutManager.INVALID_OFFSET;
                v12 = v11;
                Object obj = v12.f89028h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = v12.f89030j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    v12.f89024d = this;
                    str2 = str;
                    v12.f89025e = str2;
                    v12.f89030j = 1;
                    if (this.f89005f.b() != aVar) {
                        p11 = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    String str5 = v12.f89025e;
                    p11 = v12.f89024d;
                    Sc.s.b(obj);
                    ((Sc.r) obj).getClass();
                    str2 = str5;
                } else if (i11 == 2) {
                    str3 = v12.f89025e;
                    p12 = v12.f89024d;
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = p12.f89001b;
                    v12.f89024d = p12;
                    v12.f89025e = str3;
                    v12.f89030j = 3;
                    obj = bVar.o(str3, v12);
                } else {
                    if (i11 == 3) {
                        str3 = v12.f89025e;
                        P p13 = v12.f89024d;
                        Sc.s.b(obj);
                        p12 = p13;
                        str4 = str3;
                        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
                        ru.ozon.android.messenger.framework.presentation.models.p c11 = qVar2 != null ? qVar2.c() : null;
                        sVar = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c11 : null;
                        ru.ozon.android.messenger.framework.domain.repository.b bVar2 = p12.f89001b;
                        v12.f89024d = p12;
                        v12.f89025e = str4;
                        v12.f89026f = qVar2;
                        v12.f89027g = sVar;
                        v12.f89030j = 4;
                        Object D11 = bVar2.D(str4, v12);
                        if (D11 != aVar) {
                            qVar = qVar2;
                            obj = D11;
                            sVar2 = sVar;
                            ru.ozon.android.messenger.framework.data.remote.models.c cVar2 = (ru.ozon.android.messenger.framework.data.remote.models.c) obj;
                            if (sVar2 != null) {
                            }
                            interfaceC9383a = p12.f89006g;
                            if (interfaceC9383a != null) {
                            }
                            return new i.a.j();
                        }
                        return aVar;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return new i.b(h.b.f88845a);
                    }
                    sVar = v12.f89027g;
                    qVar = v12.f89026f;
                    str4 = v12.f89025e;
                    p12 = v12.f89024d;
                    Sc.s.b(obj);
                    sVar2 = sVar;
                    ru.ozon.android.messenger.framework.data.remote.models.c cVar22 = (ru.ozon.android.messenger.framework.data.remote.models.c) obj;
                    if (sVar2 != null || cVar22 == null) {
                        interfaceC9383a = p12.f89006g;
                        if (interfaceC9383a != null) {
                            interfaceC9383a.a(new a(Nk.a.b("SendMessage: resendUndeliveredMessage failed, ", str4)));
                        }
                        return new i.a.j();
                    }
                    DateTime dateTime = new DateTime();
                    Intrinsics.checkNotNullExpressionValue(dateTime, "now(...)");
                    ru.ozon.android.messenger.framework.presentation.models.q a11 = ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, ru.ozon.android.messenger.framework.presentation.models.s.d(sVar2, null, null, dateTime, 0.0d, false, false, 0, null, 262127), 1);
                    ru.ozon.android.messenger.framework.domain.service.c cVar3 = p12.f89003d;
                    v12.f89024d = null;
                    v12.f89025e = null;
                    v12.f89026f = null;
                    v12.f89027g = null;
                    v12.f89030j = 5;
                }
                dVar = p11.f89004e;
                v12.f89024d = p11;
                v12.f89025e = str2;
                v12.f89030j = 2;
                if (dVar.h(str2, v12) != aVar) {
                    str3 = str2;
                    p12 = p11;
                    ru.ozon.android.messenger.framework.domain.repository.b bVar3 = p12.f89001b;
                    v12.f89024d = p12;
                    v12.f89025e = str3;
                    v12.f89030j = 3;
                    obj = bVar3.o(str3, v12);
                }
                return aVar;
            }
        }
        v11 = new V(this, cVar);
        v12 = v11;
        Object obj2 = v12.f89028h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = v12.f89030j;
        if (i11 != 0) {
        }
        dVar = p11.f89004e;
        v12.f89024d = p11;
        v12.f89025e = str2;
        v12.f89030j = 2;
        if (dVar.h(str2, v12) != aVar) {
        }
        return aVar;
    }

    public final Object i(@NotNull ru.ozon.android.messenger.framework.domain.model.g gVar, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object obj;
        if (gVar instanceof g.b) {
            return f((g.b) gVar, jVar);
        }
        if (gVar instanceof g.c) {
            return g((g.c) gVar, jVar);
        }
        if (gVar instanceof g.a) {
            Object h11 = h((g.a) gVar, jVar);
            return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : (ru.ozon.android.messenger.utils.i) h11;
        }
        boolean z11 = gVar instanceof g.e;
        ru.ozon.android.messenger.framework.domain.service.c cVar = this.f89003d;
        if (!z11) {
            if (gVar instanceof g.d) {
                return cVar.c(((g.d) gVar).c(), jVar);
            }
            throw new Sc.o();
        }
        g.e eVar = (g.e) gVar;
        Iterator<T> it = this.f89004e.b().getValue().a().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) obj), eVar.g())) {
                break;
            }
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
        if (qVar == null) {
            return new i.a.e(Nk.a.b("Message not found: ", eVar.g()));
        }
        String e11 = eVar.e();
        List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
        ArrayList blocks = new ArrayList(C7714v.z(b11, 10));
        for (ru.ozon.android.messenger.framework.presentation.models.u uVar : b11) {
            ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar.c();
            if (c11 instanceof ru.ozon.android.messenger.blocks.messagetext.f) {
                uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, ru.ozon.android.messenger.blocks.messagetext.f.c((ru.ozon.android.messenger.blocks.messagetext.f) c11, new OzonSpannableString(e11)));
            }
            blocks.add(uVar);
        }
        ru.ozon.android.messenger.framework.presentation.models.p c12 = qVar.c();
        ru.ozon.android.messenger.framework.presentation.models.s sVar = c12 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c12 : null;
        ru.ozon.android.messenger.framework.presentation.models.p itemInfo = sVar != null ? ru.ozon.android.messenger.framework.presentation.models.s.d(sVar, ((ru.ozon.android.messenger.framework.presentation.models.s) qVar.c()).getId(), null, null, 0.0d, false, true, 0, z.c.f91565a, 251901) : qVar.c();
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        return cVar.e(new ru.ozon.android.messenger.framework.domain.model.j(eVar.g(), qVar, new ru.ozon.android.messenger.framework.presentation.models.q(blocks, itemInfo), new ru.ozon.android.messenger.framework.data.remote.models.c(eVar.a(), eVar.d(), new y0.d(eVar.e(), null), ru.ozon.android.messenger.framework.data.remote.mapper.j.b(u0.a.a()), null, null, 224), eVar.c(), eVar.f()), null, jVar);
    }
}
