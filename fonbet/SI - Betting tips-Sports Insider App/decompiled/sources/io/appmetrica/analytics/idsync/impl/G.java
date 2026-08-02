package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.m0;
import kotlin.collections.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f11842a;

    /* renamed from: b, reason: collision with root package name */
    public final F f11843b = new F();

    /* renamed from: c, reason: collision with root package name */
    public final String f11844c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final Map f11845d = n0.j(a());

    public G(ModulePreferences modulePreferences) {
        this.f11842a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.f11843b.toModel(this.f11842a.getString(this.f11844c, null));
        int a7 = m0.a(kotlin.collections.v.k(model, 10));
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).f11835a, obj);
        }
        return linkedHashMap;
    }
}
