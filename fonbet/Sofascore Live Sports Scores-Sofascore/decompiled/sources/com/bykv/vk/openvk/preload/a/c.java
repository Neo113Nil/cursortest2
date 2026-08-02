package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.e;
import defpackage.a70;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    public static <IN> b<IN> a(List<h> list, e eVar, d dVar) {
        if (list == null) {
            a70.p("interceptors == null !");
            return null;
        }
        if (eVar == null) {
            eVar = new e.a();
        }
        return new i(Collections.unmodifiableList(new ArrayList(list)), 0, eVar, dVar);
    }

    public static <IN> b<IN> a(List<h> list, e eVar) {
        return a(list, eVar, null);
    }
}
