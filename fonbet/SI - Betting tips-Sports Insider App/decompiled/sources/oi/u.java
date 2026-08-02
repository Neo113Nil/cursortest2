package oi;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21342a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f21343b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21344c;

    public u(Object obj, Method method, ArrayList arrayList) {
        this.f21342a = obj;
        this.f21343b = method;
        this.f21344c = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", r3.c.class.getName(), this.f21343b.getName(), this.f21344c);
    }
}
