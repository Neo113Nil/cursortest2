package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J5 implements Callable {
    public final /* synthetic */ P5 a;

    public J5(P5 p5) {
        this.a = p5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                P5 p5 = this.a;
                if (p5.l == null) {
                    return null;
                }
                while (p5.k > p5.j) {
                    p5.d((String) ((Map.Entry) p5.i.entrySet().iterator().next()).getKey());
                }
                P5 p52 = this.a;
                int i = p52.m;
                if (i >= 2000 && i >= p52.i.size()) {
                    this.a.c();
                    this.a.m = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
