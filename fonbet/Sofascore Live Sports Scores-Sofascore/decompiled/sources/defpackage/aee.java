package defpackage;

import androidx.compose.runtime.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aee extends cee implements wg3 {
    public static final aee g = new aee(v0k.e, 0);

    @Override // defpackage.cee, defpackage.b5, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof d) {
            return super.containsKey((d) obj);
        }
        return false;
    }

    @Override // defpackage.b5, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jkk) {
            return super.containsValue((jkk) obj);
        }
        return false;
    }

    @Override // defpackage.cee
    public final gee g() {
        zde zdeVar = new zde(this);
        zdeVar.g = this;
        return zdeVar;
    }

    @Override // defpackage.cee, defpackage.b5, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof d) {
            return (jkk) super.get((d) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof d) ? obj2 : (jkk) super.getOrDefault((d) obj, (jkk) obj2);
    }

    @Override // defpackage.cee
    public final gee h() {
        zde zdeVar = new zde(this);
        zdeVar.g = this;
        return zdeVar;
    }

    public final aee j(d dVar, jkk jkkVar) {
        yz1 u = this.d.u(dVar.hashCode(), dVar, jkkVar, 0);
        return u == null ? this : new aee((v0k) u.c, this.e + u.b);
    }
}
