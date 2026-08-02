package com.ironsource;

import android.os.Bundle;
import defpackage.dmi;
import defpackage.k13;
import defpackage.lm5;
import defpackage.sub;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O5 {

    @NotNull
    public static final O5 a = new O5();

    @NotNull
    public static final String b = "ext_";

    private O5() {
    }

    @NotNull
    public final Map<String, String> a(@Nullable Bundle bundle) {
        Set<String> keySet = bundle != null ? bundle.keySet() : null;
        if (keySet == null) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        int c = sub.c(k13.r(keySet, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (String str : keySet) {
            String q = dmi.q(b, str);
            Object obj = bundle.get(str);
            linkedHashMap.put(q, obj instanceof Iterable ? CollectionsKt.f0((Iterable) obj, ", ", null, null, null, 62) : obj == null ? null : obj.toString());
        }
        return linkedHashMap;
    }
}
