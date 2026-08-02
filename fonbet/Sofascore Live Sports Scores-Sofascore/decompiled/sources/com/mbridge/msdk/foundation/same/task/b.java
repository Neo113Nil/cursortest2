package com.mbridge.msdk.foundation.same.task;

import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    ThreadPoolExecutor a;
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> b;
    WeakReference<Context> c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements a.InterfaceC1258a {
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a a;
        final /* synthetic */ a.InterfaceC1258a b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC1258a interfaceC1258a) {
            this.a = aVar;
            this.b = interfaceC1258a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC1258a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL) {
                b.this.b.remove(Long.valueOf(this.a.getId()));
            } else if (bVar == a.b.FINISH) {
                b.this.b.remove(Long.valueOf(this.a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.c.get() == null) {
                b.this.a();
            }
            a.InterfaceC1258a interfaceC1258a = this.b;
            if (interfaceC1258a != null) {
                interfaceC1258a.a(bVar);
            }
        }
    }

    public b(Context context) {
        ThreadPoolExecutor threadPoolExecutor;
        if (s0.a().a("c_t_l_t_p", true)) {
            this.a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                this.a = threadPoolExecutor;
            } else {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                this.a = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC1258a interfaceC1258a) {
        a(aVar, interfaceC1258a);
        this.a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC1258a interfaceC1258a) {
        this.b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC1258a));
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.a.execute(aVar);
    }

    public b(Context context, int i) {
        ThreadPoolExecutor threadPoolExecutor;
        if (s0.a().a("c_t_l_t_p", true)) {
            this.a = c.b();
        } else {
            if (i == 0) {
                threadPoolExecutor = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                this.a = threadPoolExecutor;
            } else {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                this.a = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }
}
