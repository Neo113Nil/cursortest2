package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {
    private IN d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.d = in;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e) {
            return this.a((b) bVar, e.getCause());
        } catch (Throwable th) {
            return this.a((b) bVar, th);
        }
    }

    public abstract boolean a(Throwable th);

    public final IN g() {
        return this.d;
    }

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (this.a(th)) {
            try {
                return bVar.a((b<OUT>) this.a());
            } catch (i.a e) {
                th = e.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public OUT a() {
        return this.d;
    }
}
