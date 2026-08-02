package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.domain.model.c;
import ru.ozon.android.messenger.framework.domain.model.h;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f88995a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f88996b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.service.x f88997c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a f88998d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.alert.a f88999e;

    public O(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.domain.service.x failedMessagesStateProvider, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a chatLoadingDelegate, @NotNull ru.ozon.android.messenger.blocks.alert.a alertBlockFactory) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(failedMessagesStateProvider, "failedMessagesStateProvider");
        Intrinsics.checkNotNullParameter(chatLoadingDelegate, "chatLoadingDelegate");
        Intrinsics.checkNotNullParameter(alertBlockFactory, "alertBlockFactory");
        this.f88995a = chatRepository;
        this.f88996b = messagesRepository;
        this.f88997c = failedMessagesStateProvider;
        this.f88998d = chatLoadingDelegate;
        this.f88999e = alertBlockFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        M m11;
        Wc.a aVar;
        int i11;
        ru.ozon.android.messenger.framework.domain.service.x xVar;
        ru.ozon.android.messenger.framework.presentation.models.q d11;
        O o11;
        ru.ozon.android.messenger.framework.domain.repository.d dVar;
        N n11;
        ru.ozon.android.messenger.framework.domain.service.x xVar2;
        O o12;
        O o13;
        ArrayList arrayList;
        ru.ozon.android.messenger.framework.domain.service.x xVar3;
        if (cVar instanceof M) {
            m11 = (M) cVar;
            int i12 = m11.f88993i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                m11.f88993i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = m11.f88991g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = m11.f88993i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    xVar = this.f88997c;
                    if (xVar.a().isEmpty() || xVar.c()) {
                        return new i.b(h.a.f88844a);
                    }
                    d11 = xVar.d();
                    if (d11 == null) {
                        d11 = this.f88999e.f(this.f88995a.E().getValue());
                    }
                    m11.f88988d = this;
                    m11.f88989e = xVar;
                    m11.f88990f = d11;
                    m11.f88993i = 1;
                    if (this.f88996b.c(new ru.ozon.android.messenger.framework.presentation.models.q[]{d11}, m11) != aVar) {
                        o11 = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    d11 = m11.f88990f;
                    ru.ozon.android.messenger.framework.domain.service.x xVar4 = m11.f88989e;
                    o11 = (O) m11.f88988d;
                    Sc.s.b(obj);
                    xVar = xVar4;
                } else if (i11 == 2) {
                    xVar2 = m11.f88989e;
                    o12 = (O) m11.f88988d;
                    Sc.s.b(obj);
                    if (o12.f88995a.l().getValue() instanceof AbstractC9330a.C1590a) {
                        return new i.a.h(0);
                    }
                    if (o12.f88998d.O()) {
                        m11.f88988d = o12;
                        m11.f88989e = xVar2;
                        m11.f88993i = 3;
                        if (o12.f88996b.e(m11) != aVar) {
                            o13 = o12;
                            ArrayList a11 = xVar2.a();
                            arrayList = new ArrayList();
                            while (r12.hasNext()) {
                            }
                            if (!arrayList.isEmpty()) {
                            }
                        }
                        return aVar;
                    }
                    if (!xVar2.b()) {
                    }
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar3 = (ru.ozon.android.messenger.framework.domain.service.x) m11.f88988d;
                        Sc.s.b(obj);
                        xVar2 = xVar3;
                        if (!xVar2.b()) {
                            return new i.b(h.a.f88844a);
                        }
                        xVar2.e();
                        xVar2.g();
                        return new i.b(h.b.f88845a);
                    }
                    xVar2 = m11.f88989e;
                    o13 = (O) m11.f88988d;
                    Sc.s.b(obj);
                    ArrayList a112 = xVar2.a();
                    arrayList = new ArrayList();
                    for (Object obj2 : a112) {
                        if (((v0) obj2).f() == null) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ru.ozon.android.messenger.framework.domain.repository.d dVar2 = o13.f88996b;
                        c.a aVar2 = new c.a(false);
                        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((v0) it.next()).c());
                        }
                        m11.f88988d = xVar2;
                        m11.f88989e = null;
                        m11.f88993i = 4;
                        if (dVar2.a(aVar2, arrayList2, m11) != aVar) {
                            xVar3 = xVar2;
                            xVar2 = xVar3;
                        }
                        return aVar;
                    }
                    if (!xVar2.b()) {
                    }
                }
                dVar = o11.f88996b;
                n11 = new N(d11);
                m11.f88988d = o11;
                m11.f88989e = xVar;
                m11.f88990f = null;
                m11.f88993i = 2;
                if (dVar.g(n11, m11) != aVar) {
                    xVar2 = xVar;
                    o12 = o11;
                    if (o12.f88995a.l().getValue() instanceof AbstractC9330a.C1590a) {
                    }
                }
                return aVar;
            }
        }
        m11 = new M(this, cVar);
        Object obj3 = m11.f88991g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = m11.f88993i;
        if (i11 != 0) {
        }
        dVar = o11.f88996b;
        n11 = new N(d11);
        m11.f88988d = o11;
        m11.f88989e = xVar;
        m11.f88990f = null;
        m11.f88993i = 2;
        if (dVar.g(n11, m11) != aVar) {
        }
        return aVar;
    }
}
