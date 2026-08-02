package H6;

import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public SoftReference f4829a = null;

    /* renamed from: b, reason: collision with root package name */
    public SoftReference f4830b = null;

    /* renamed from: c, reason: collision with root package name */
    public SoftReference f4831c = null;

    public void a() {
        SoftReference softReference = this.f4829a;
        if (softReference != null) {
            softReference.clear();
            this.f4829a = null;
        }
        SoftReference softReference2 = this.f4830b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f4830b = null;
        }
        SoftReference softReference3 = this.f4831c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f4831c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f4829a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f4829a = new SoftReference(obj);
        this.f4830b = new SoftReference(obj);
        this.f4831c = new SoftReference(obj);
    }
}
