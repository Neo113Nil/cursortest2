package defpackage;

import com.google.gson.Gson;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x4k implements v4k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ u4k c;

    public /* synthetic */ x4k(Object obj, u4k u4kVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = u4kVar;
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        int i = this.a;
        u4k u4kVar = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (u5kVar.a == ((Class) obj)) {
                    return u4kVar;
                }
                return null;
            case 1:
                Class<?> cls = u5kVar.a;
                if (((Class) obj).isAssignableFrom(cls)) {
                    return new ih0(this, cls);
                }
                return null;
            default:
                if (u5kVar.equals((u5k) obj)) {
                    return u4kVar;
                }
                return null;
        }
    }

    public String toString() {
        int i = this.a;
        u4k u4kVar = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + u4kVar + U3.j.e;
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + u4kVar + U3.j.e;
            default:
                return super.toString();
        }
    }
}
