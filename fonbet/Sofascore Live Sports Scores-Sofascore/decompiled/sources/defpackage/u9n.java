package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u9n implements wcn {
    public static final Object c = new Object();
    public volatile wcn a;
    public volatile Object b;

    public static wcn a(wcn wcnVar) {
        if (wcnVar instanceof u9n) {
            return wcnVar;
        }
        u9n u9nVar = new u9n();
        u9nVar.b = c;
        u9nVar.a = wcnVar;
        return u9nVar;
    }

    @Override // defpackage.wcn
    public final Object zza() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.zza();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
