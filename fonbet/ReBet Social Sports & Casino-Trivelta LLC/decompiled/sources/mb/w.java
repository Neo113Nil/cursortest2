package mb;

import wb.InterfaceC6736b;

/* loaded from: classes3.dex */
public class w implements InterfaceC6736b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f56490c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f56491a = f56490c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC6736b f56492b;

    public w(InterfaceC6736b interfaceC6736b) {
        this.f56492b = interfaceC6736b;
    }

    @Override // wb.InterfaceC6736b
    public Object get() {
        Object obj;
        Object obj2 = this.f56491a;
        Object obj3 = f56490c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f56491a;
                if (obj == obj3) {
                    obj = this.f56492b.get();
                    this.f56491a = obj;
                    this.f56492b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
