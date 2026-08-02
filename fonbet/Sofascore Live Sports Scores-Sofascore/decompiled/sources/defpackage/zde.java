package defpackage;

import androidx.compose.runtime.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zde extends gee {
    public aee g;

    @Override // defpackage.gee, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof d) {
            return super.containsKey((d) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jkk) {
            return super.containsValue((jkk) obj);
        }
        return false;
    }

    @Override // defpackage.gee, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.gee
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aee g() {
        v0k v0kVar = this.c;
        aee aeeVar = this.g;
        if (v0kVar != aeeVar.d) {
            this.b = new ug5();
            aeeVar = new aee(this.c, this.f);
        }
        this.g = aeeVar;
        return aeeVar;
    }

    @Override // defpackage.gee, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof d) {
            return (jkk) super.remove((d) obj);
        }
        return null;
    }
}
