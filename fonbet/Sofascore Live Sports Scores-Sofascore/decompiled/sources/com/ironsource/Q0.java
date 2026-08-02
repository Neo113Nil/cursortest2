package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.k13;
import defpackage.sub;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q0 extends Z1 {

    @NotNull
    private final Map<String, L> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(@NotNull List<? extends NetworkSettings> list, int i) {
        super(list, i);
        list.getClass();
        int c = sub.c(k13.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((NetworkSettings) it.next()).getProviderName(), new L(i));
        }
        this.e = linkedHashMap;
    }

    public final void a(@NotNull Mg mg) {
        mg.getClass();
        List<B> b = mg.b();
        int c = sub.c(k13.r(b, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (B b2 : b) {
            linkedHashMap.put(b2.p(), b2.t());
        }
        a(linkedHashMap);
    }

    @Override // com.ironsource.Z1
    @NotNull
    public String a(@NotNull String str) {
        String d;
        str.getClass();
        L l = this.e.get(str);
        return (l == null || (d = l.d()) == null) ? "" : d;
    }

    private final void a(Map<String, J> map) {
        for (Map.Entry<String, L> entry : this.e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
