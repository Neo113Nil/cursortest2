package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.l;
import defpackage.zzl;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {
    private String d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        this.d = a((j<IN, OUT>) in);
        l.a aVar = a().get(this.d);
        while (aVar != null) {
            List<h> list = aVar.a;
            try {
                Object a = c.a(list, ((i) bVar).a, this).a((b) in);
                return !l.a(list) ? a : bVar.a((b<OUT>) a);
            } catch (i.a e) {
                Throwable cause = e.getCause();
                new m(bVar);
                this.d = this.a(in, cause, this.d);
                aVar = this.a().get(this.d);
            } catch (Throwable th) {
                new m(bVar);
                this.d = this.a(in, th, this.d);
                aVar = this.a().get(this.d);
            }
        }
        zzl.i(this.d, "can not found branch，branch name is：");
        return null;
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th, String str);
}
