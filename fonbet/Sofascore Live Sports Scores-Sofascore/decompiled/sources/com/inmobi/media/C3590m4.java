package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import defpackage.b98;
import defpackage.rq3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3590m4 implements b98 {
    public final /* synthetic */ C3694q4 a;

    public C3590m4(C3694q4 c3694q4) {
        this.a = c3694q4;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        Config config = (Config) obj;
        this.a.a.b.put(config.getType(), config);
        C3694q4 c3694q4 = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c3694q4.a.c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                A4 a4 = (A4) ((WeakReference) it.next()).get();
                if (a4 != null) {
                    a4.a(config);
                }
            }
        }
        c3694q4.a.c.remove(config.getType());
        return Unit.a;
    }
}
