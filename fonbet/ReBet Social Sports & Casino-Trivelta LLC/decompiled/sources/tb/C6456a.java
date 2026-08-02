package tb;

import mb.AbstractC5573C;

/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6456a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f65807a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f65808b;

    public C6456a(Class cls, Object obj) {
        this.f65807a = (Class) AbstractC5573C.b(cls);
        this.f65808b = AbstractC5573C.b(obj);
    }

    public Object a() {
        return this.f65808b;
    }

    public Class b() {
        return this.f65807a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f65807a, this.f65808b);
    }
}
