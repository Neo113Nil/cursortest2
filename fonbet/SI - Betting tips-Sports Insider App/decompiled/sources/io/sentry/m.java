package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16635a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16636b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16637c;

    public m(b6 b6Var) {
        this.f16635a = 1;
        this.f16636b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f16637c = b6Var;
    }

    public void a(h4 h4Var) {
        io.sentry.protocol.c cVar = h4Var.f16456b;
        if (cVar.h() == null) {
            cVar.t(new io.sentry.protocol.x());
        }
        io.sentry.protocol.x h10 = cVar.h();
        if (h10 != null && h10.f16927a == null && h10.f16928b == null) {
            h10.f16927a = (String) this.f16637c;
            h10.f16928b = (String) this.f16636b;
        }
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, h0 h0Var) {
        int i5 = this.f16635a;
        return d6Var;
    }

    @Override // io.sentry.c0
    public final t4 k(t4 t4Var, h0 h0Var) {
        io.sentry.protocol.u c2;
        String str;
        Long l6;
        int i5 = this.f16635a;
        Object obj = this.f16637c;
        Object obj2 = this.f16636b;
        switch (i5) {
            case 0:
                Map map = (Map) obj2;
                if (x6.class.isInstance(h0Var.b("sentry:typeCheckHint")) && (c2 = t4Var.c()) != null && (str = c2.f16915a) != null && (l6 = c2.f16918d) != null) {
                    Long l10 = (Long) map.get(str);
                    if (l10 != null && !l10.equals(l6)) {
                        ((b6) obj).getLogger().h(b5.INFO, "Event %s has been dropped due to multi-threaded deduplication", t4Var.f16455a);
                        h0Var.d(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                        break;
                    } else {
                        map.put(str, l6);
                        break;
                    }
                }
                break;
            case 1:
                Map map2 = (Map) obj2;
                b6 b6Var = (b6) obj;
                if (b6Var.isEnableDeduplication()) {
                    Throwable a7 = t4Var.a();
                    if (a7 != null) {
                        if (!map2.containsKey(a7)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable th2 = a7; th2.getCause() != null; th2 = th2.getCause()) {
                                arrayList.add(th2.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                }
                            }
                            map2.put(a7, null);
                            break;
                        }
                        b6Var.getLogger().h(b5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", t4Var.f16455a);
                        break;
                    }
                } else {
                    b6Var.getLogger().h(b5.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    break;
                }
                break;
            default:
                a(t4Var);
                break;
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, h0 h0Var) {
        switch (this.f16635a) {
            default:
                a(e0Var);
            case 0:
            case 1:
                return e0Var;
        }
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        int i5 = this.f16635a;
        return d5Var;
    }

    public m() {
        this.f16635a = 2;
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f16636b = property;
        this.f16637c = property2;
    }

    public m(SentryAndroidOptions sentryAndroidOptions) {
        this.f16635a = 0;
        this.f16636b = DesugarCollections.synchronizedMap(new HashMap());
        this.f16637c = sentryAndroidOptions;
    }
}
