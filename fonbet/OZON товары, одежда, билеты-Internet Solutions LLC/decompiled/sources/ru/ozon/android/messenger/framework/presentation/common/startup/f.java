package ru.ozon.android.messenger.framework.presentation.common.startup;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.usecases.C9391h;
import ru.ozon.android.messenger.framework.domain.usecases.e0;
import ru.ozon.android.messenger.framework.presentation.common.startup.a;
import ru.ozon.android.messenger.framework.presentation.models.responses.m;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public abstract class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e0 f91156a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9391h f91157b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Uri f91158c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<String> f91159d;

    public f(@NotNull e0 startOrGetChatUseCase, @NotNull C9391h chatEnterUseCase, @NotNull Uri deeplink, String str) {
        Intrinsics.checkNotNullParameter(startOrGetChatUseCase, "startOrGetChatUseCase");
        Intrinsics.checkNotNullParameter(chatEnterUseCase, "chatEnterUseCase");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f91156a = startOrGetChatUseCase;
        this.f91157b = chatEnterUseCase;
        this.f91158c = deeplink;
        this.f91159d = O0.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.k(null, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        f fVar;
        i iVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f91142g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f91142g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f91140e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f91142g;
                if (i11 != 0) {
                    s.b(obj);
                    ru.ozon.android.messenger.framework.data.requests.a aVar2 = new ru.ozon.android.messenger.framework.data.requests.a(str);
                    bVar.f91139d = this;
                    bVar.f91142g = 1;
                    obj = this.f91157b.b(aVar2, bVar);
                    if (obj != aVar) {
                        fVar = this;
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
                fVar = (f) bVar.f91139d;
                s.b(obj);
                iVar = (i) obj;
                if (iVar instanceof i.a) {
                    bVar.f91139d = iVar;
                    bVar.f91142g = 2;
                }
                return Unit.f71690a;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f91140e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f91142g;
        if (i11 != 0) {
        }
        iVar = (i) obj2;
        if (iVar instanceof i.a) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Map map, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        f fVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f91146g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f91146g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f91144e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f91146g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!map.isEmpty()) {
                        this.f91159d.setValue(null);
                    }
                    cVar2.f91143d = this;
                    cVar2.f91146g = 1;
                    obj = i(this.f91158c, map, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = cVar2.f91143d;
                    s.b(obj);
                }
                a.C1700a c1700a = (a.C1700a) obj;
                String a11 = c1700a != null ? c1700a.a() : null;
                fVar.f91159d.setValue(a11);
                return a11 != null ? new i.a.e("Chat id is null") : new i.b(c1700a);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f91144e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f91146g;
        if (i11 != 0) {
        }
        a.C1700a c1700a2 = (a.C1700a) obj2;
        if (c1700a2 != null) {
        }
        fVar.f91159d.setValue(a11);
        if (a11 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Uri uri, Map map, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        f fVar;
        i iVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f91151h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f91151h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f91149f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f91151h;
                Tc.d dVar2 = null;
                if (i11 != 0) {
                    s.b(obj);
                    ru.ozon.android.messenger.framework.data.requests.i iVar2 = new ru.ozon.android.messenger.framework.data.requests.i(uri, map);
                    dVar.f91147d = this;
                    dVar.f91148e = uri;
                    dVar.f91151h = 1;
                    obj = this.f91156a.b(iVar2, dVar);
                    if (obj != aVar) {
                        fVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return null;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return null;
                }
                uri = dVar.f91148e;
                fVar = dVar.f91147d;
                s.b(obj);
                iVar = (i) obj;
                if (!(iVar instanceof i.b)) {
                    m mVar = (m) ((i.b) iVar).b();
                    if (!(mVar instanceof m.a)) {
                        if (!(mVar instanceof m.b)) {
                            throw new o();
                        }
                        dVar.f91147d = null;
                        dVar.f91148e = null;
                        dVar.f91151h = 2;
                        if (fVar.k((m.b) mVar, dVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    }
                    m.a aVar2 = (m.a) mVar;
                    String b11 = aVar2.b();
                    ru.ozon.android.messenger.blocks.chat.common.b a11 = aVar2.a();
                    String a12 = a11 != null ? a11.a() : null;
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    Intrinsics.f(queryParameterNames);
                    if (queryParameterNames.isEmpty()) {
                        queryParameterNames = null;
                    }
                    if (queryParameterNames != null) {
                        Tc.d builder = new Tc.d();
                        for (String str : queryParameterNames) {
                            String queryParameter = uri.getQueryParameter(str);
                            if (queryParameter != null) {
                                Intrinsics.f(str);
                                builder.put(str, queryParameter);
                            }
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        dVar2 = builder.u();
                    }
                    return new a.C1700a(b11, a12, dVar2);
                }
                if (!(iVar instanceof i.a)) {
                    throw new o();
                }
                dVar.f91147d = null;
                dVar.f91148e = null;
                dVar.f91151h = 3;
                if (fVar.k(null, dVar) == aVar) {
                }
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f91149f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f91151h;
        Tc.d dVar22 = null;
        if (i11 != 0) {
        }
        iVar = (i) obj2;
        if (!(iVar instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object l(f fVar, Map map, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        String str;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f91155g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f91155g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f91153e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f91155g;
                if (i11 != 0) {
                    s.b(obj);
                    String value = fVar.f91159d.getValue();
                    if (value != null) {
                        eVar.f91152d = value;
                        eVar.f91155g = 1;
                        if (fVar.g(value, eVar) != obj2) {
                            str = value;
                        }
                    } else {
                        eVar.f91155g = 2;
                        Object h11 = fVar.h(map, eVar);
                        if (h11 != obj2) {
                            return h11;
                        }
                    }
                    return obj2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                str = eVar.f91152d;
                s.b(obj);
                return new i.b(new a.C1700a(str, null, null));
            }
        }
        eVar = new e(fVar, cVar);
        Object obj3 = eVar.f91153e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f91155g;
        if (i11 != 0) {
        }
        return new i.b(new a.C1700a(str, null, null));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.startup.a
    public final Object a(@NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super i<a.C1700a>> dVar) {
        return h(map, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.startup.a
    public final Object b(@NotNull Map map, @NotNull j jVar) {
        return l(this, map, jVar);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.startup.a
    public final M0 e() {
        return this.f91159d;
    }

    @NotNull
    public final x0<String> j() {
        return this.f91159d;
    }

    public abstract Object k(m.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar);
}
