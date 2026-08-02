package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Dc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12141a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12142b;

    public Dc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f12141a.put(obj, obj2);
    }

    public Dc(HashMap hashMap, Object obj) {
        this.f12141a = hashMap;
        this.f12142b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f12141a.get(obj);
        return obj2 == null ? this.f12142b : obj2;
    }
}
