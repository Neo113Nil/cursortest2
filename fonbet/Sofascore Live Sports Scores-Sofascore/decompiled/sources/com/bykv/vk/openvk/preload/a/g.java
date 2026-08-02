package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import defpackage.a70;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class g<T> extends d<List<T>, T> {
    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(final b bVar, Object obj) throws Throwable {
        List list = (List) obj;
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        final CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        for (final Object obj2 : list) {
            com.bykv.vk.openvk.preload.geckox.b.t().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.a.g.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.CountDownLatch] */
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            try {
                                copyOnWriteArrayList.add(bVar.a((b) obj2));
                            } catch (i.a e) {
                                Throwable cause = e.getCause();
                                copyOnWriteArrayList2.add(cause);
                                g.this.d(cause);
                            }
                        } finally {
                            this = countDownLatch;
                            this.countDown();
                        }
                        this = countDownLatch;
                        this.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                    }
                }
            });
        }
        countDownLatch.await();
        if (copyOnWriteArrayList2.isEmpty()) {
            return copyOnWriteArrayList;
        }
        throw new com.bykv.vk.openvk.preload.a.a.a(copyOnWriteArrayList2);
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        if (objArr != null) {
            if (objArr.length == 1) {
                if (objArr[0] instanceof Executor) {
                    return;
                }
                a70.p("ParallelInterceptor args must be instance of Executor");
                return;
            }
            a70.p("ParallelInterceptor only need one param");
        }
    }
}
