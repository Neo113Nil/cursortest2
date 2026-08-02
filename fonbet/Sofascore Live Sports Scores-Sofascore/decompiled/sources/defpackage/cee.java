package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class cee extends b5 implements Map, eia {
    public static final cee f = new cee(v0k.e, 0);
    public final v0k d;
    public final int e;

    public cee(v0k v0kVar, int i) {
        this.d = v0kVar;
        this.e = i;
    }

    @Override // defpackage.b5
    public final Set a() {
        return new pee(this, 0);
    }

    @Override // defpackage.b5
    public final Set c() {
        return new pee(this, 1);
    }

    @Override // defpackage.b5, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.b5
    public final int d() {
        return this.e;
    }

    @Override // defpackage.b5
    public final Collection e() {
        return new a5(this, 3);
    }

    public gee g() {
        return new gee(this);
    }

    @Override // defpackage.b5, java.util.Map
    public Object get(Object obj) {
        return this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public /* bridge */ gee h() {
        return g();
    }

    public final cee i(Object obj, qbb qbbVar) {
        yz1 u = this.d.u(obj != null ? obj.hashCode() : 0, obj, qbbVar, 0);
        return u == null ? this : new cee((v0k) u.c, this.e + u.b);
    }
}
