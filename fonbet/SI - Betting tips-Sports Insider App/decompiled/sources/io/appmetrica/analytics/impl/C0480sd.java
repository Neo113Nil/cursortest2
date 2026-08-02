package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480sd {
    public static ArrayList a() {
        C0049bd c0049bd;
        List<String> a7 = C0040b4.l().f13383m.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(a7, 10));
        for (String str : a7) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0049bd = new C0049bd(str, false);
            } else {
                C0040b4.l().m().f13205b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0049bd = new C0049bd(str, true);
            }
            arrayList.add(c0049bd);
        }
        return arrayList;
    }
}
