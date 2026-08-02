package x9;

import aa.l;
import android.os.Handler;
import android.os.Looper;
import ch.f;
import com.logrocket.core.g;
import io.sentry.hints.j;
import j$.util.DesugarCollections;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f25427b;

    public /* synthetic */ c(d dVar, int i5) {
        this.f25426a = i5;
        this.f25427b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (((ch.f) r0.f25433f.f6816b).u() < r0.f25431d) goto L34;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.f25426a) {
            case 0:
                d dVar = this.f25427b;
                if (!dVar.f25430c) {
                    j jVar = dVar.j;
                    AtomicLong atomicLong = dVar.f25435h;
                    if (atomicLong.get() > 0) {
                        g gVar = (g) dVar.f25428a.get();
                        if (gVar == null) {
                            dVar.f25430c = true;
                            aa.g gVar2 = dVar.f25429b;
                            if (gVar2 != null) {
                                gVar2.d();
                            }
                            ch.d dVar2 = dVar.f25433f;
                            dVar2.d();
                            f.r((f) dVar2.f6816b);
                        }
                        if (gVar != null) {
                            String c2 = gVar.f6462a.c();
                            String str = (String) DesugarCollections.unmodifiableMap(((f) dVar.f25433f.f6816b).t()).get("url");
                            if (str == null || str.isEmpty()) {
                                ch.d dVar3 = dVar.f25433f;
                                dVar3.getClass();
                                c2.getClass();
                                dVar3.d();
                                f.s((f) dVar3.f6816b).put("url", c2);
                            } else {
                                if (c2.equals(str)) {
                                    jVar.getClass();
                                    if (System.currentTimeMillis() - dVar.f25436i <= dVar.f25432e) {
                                        break;
                                    }
                                }
                                if (((f) dVar.f25433f.f6816b).u() > 0) {
                                    gVar.a(28, dVar.f25433f);
                                    ch.d v5 = f.v();
                                    dVar.f25433f = v5;
                                    v5.d();
                                    f.p((f) v5.f6816b);
                                }
                                jVar.getClass();
                                dVar.f25436i = System.currentTimeMillis();
                                ch.d dVar4 = dVar.f25433f;
                                dVar4.getClass();
                                dVar4.d();
                                f.s((f) dVar4.f6816b).put("url", c2);
                            }
                        }
                        long andSet = atomicLong.getAndSet(0L) - dVar.f25434g;
                        if (andSet > dVar.f25437k) {
                            ch.b r5 = ch.c.r();
                            long j = dVar.f25434g;
                            r5.d();
                            ch.c.q((ch.c) r5.f6816b, j);
                            r5.d();
                            ch.c.p((ch.c) r5.f6816b, andSet);
                            ch.d dVar5 = dVar.f25433f;
                            dVar5.d();
                            f.q((f) dVar5.f6816b, (ch.c) r5.a());
                        }
                        dVar.f25434g = 0L;
                    }
                    if (dVar.f25434g == 0) {
                        jVar.getClass();
                        dVar.f25434g = System.currentTimeMillis();
                        c cVar = new c(dVar, 1);
                        AtomicReference atomicReference = l.f112a;
                        Handler handler = (Handler) atomicReference.get();
                        if (handler == null) {
                            handler = new Handler(Looper.getMainLooper());
                            atomicReference.set(handler);
                        }
                        handler.postAtFrontOfQueue(cVar);
                        break;
                    }
                }
                break;
            default:
                d dVar6 = this.f25427b;
                AtomicLong atomicLong2 = dVar6.f25435h;
                dVar6.j.getClass();
                atomicLong2.set(System.currentTimeMillis());
                break;
        }
    }
}
