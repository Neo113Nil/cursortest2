package t;

import java.util.HashMap;
import java.util.Map;
import t.C6375b;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6374a extends C6375b {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f64954e = new HashMap();

    @Override // t.C6375b
    public C6375b.c b(Object obj) {
        return (C6375b.c) this.f64954e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f64954e.containsKey(obj);
    }

    @Override // t.C6375b
    public Object g(Object obj, Object obj2) {
        C6375b.c b10 = b(obj);
        if (b10 != null) {
            return b10.f64960b;
        }
        this.f64954e.put(obj, f(obj, obj2));
        return null;
    }

    @Override // t.C6375b
    public Object h(Object obj) {
        Object h10 = super.h(obj);
        this.f64954e.remove(obj);
        return h10;
    }

    public Map.Entry i(Object obj) {
        if (contains(obj)) {
            return ((C6375b.c) this.f64954e.get(obj)).f64962d;
        }
        return null;
    }
}
