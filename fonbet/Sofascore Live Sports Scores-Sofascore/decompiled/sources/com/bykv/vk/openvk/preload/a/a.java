package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.l;
import defpackage.a70;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        String a = a((a<IN, OUT>) in);
        l.a aVar = a().get(a);
        if (aVar == null) {
            a70.p("can not found branch, branch name is：".concat(String.valueOf(a)));
            return null;
        }
        List<h> list = aVar.a;
        Object a2 = c.a(list, ((i) bVar).a, this).a((b) in);
        return !l.a(list) ? a2 : bVar.a((b<OUT>) a2);
    }

    public abstract String a(IN in);
}
