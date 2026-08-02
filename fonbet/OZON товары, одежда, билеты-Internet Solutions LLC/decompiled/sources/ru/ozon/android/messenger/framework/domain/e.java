package ru.ozon.android.messenger.framework.domain;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f88792a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f88793b;

    public e(@NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f88792a = messagesRepository;
        this.f88793b = repository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(3:10|11|12)(2:34|35))(2:36|37)|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|(1:26)|27|(2:29|30)(2:31|32)))|42|6|7|(0)(0)|13|(1:14)|22|23|24|(0)|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0030, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        r8 = Sc.r.INSTANCE;
        r7 = Sc.s.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: all -> 0x002e, CancellationException -> 0x0030, TryCatch #2 {CancellationException -> 0x0030, all -> 0x002e, blocks: (B:11:0x0029, B:14:0x0052, B:16:0x0058, B:23:0x0073, B:37:0x003e), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        Throwable b11;
        Throwable b12;
        String str2;
        Iterator it;
        e eVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f88790i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f88790i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f88788g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f88790i;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    str2 = str;
                    it = this.f88792a.j(d.f88791b).iterator();
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = cVar2.f88787f;
                    eVar = cVar2.f88786e;
                    String str3 = cVar2.f88785d;
                    s.b(obj);
                    str2 = str3;
                }
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = eVar.f88793b;
                    String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(qVar);
                    cVar2.f88785d = str2;
                    cVar2.f88786e = eVar;
                    cVar2.f88787f = it;
                    cVar2.f88790i = 1;
                    if (bVar.m(str2, d11, cVar2) == aVar) {
                        return aVar;
                    }
                }
                Object a11 = r.a(Unit.f71690a);
                b11 = r.b(a11);
                if (b11 != null) {
                    a11 = r.a(s.a(b11));
                }
                Object f26106a = ((r) a11).getF26106a();
                b12 = r.b(f26106a);
                if (b12 == null) {
                    return s.a(b12);
                }
                return Unit.f71690a;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f88788g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f88790i;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        Object a112 = r.a(Unit.f71690a);
        b11 = r.b(a112);
        if (b11 != null) {
        }
        Object f26106a2 = ((r) a112).getF26106a();
        b12 = r.b(f26106a2);
        if (b12 == null) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.a
    public final Object b() {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = r.a(this.f88792a.j(b.f88784b));
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            a11 = r.a(s.a(b11));
        }
        Object f26106a = ((r) a11).getF26106a();
        Throwable b12 = r.b(f26106a);
        return b12 == null ? (List) f26106a : s.a(b12);
    }
}
