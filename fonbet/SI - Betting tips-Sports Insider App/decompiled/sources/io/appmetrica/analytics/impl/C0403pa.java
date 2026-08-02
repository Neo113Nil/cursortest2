package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403pa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14468a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14469b;

    public C0403pa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f14468a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f14468a.toString();
    }

    public C0403pa(boolean z5) {
        this.f14468a = new HashMap();
        this.f14469b = z5;
    }
}
