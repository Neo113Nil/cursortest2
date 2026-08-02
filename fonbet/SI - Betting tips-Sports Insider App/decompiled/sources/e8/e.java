package e8;

import com.google.android.gms.internal.measurement.u5;
import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements d, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final u5 f8774a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f8775b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object f8776c;

    public e(u5 u5Var) {
        this.f8774a = u5Var;
    }

    @Override // e8.d
    public final Object get() {
        if (!this.f8775b) {
            synchronized (this) {
                try {
                    if (!this.f8775b) {
                        Object obj = this.f8774a.get();
                        this.f8776c = obj;
                        this.f8775b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8776c;
    }

    public final String toString() {
        Object obj;
        if (this.f8775b) {
            String valueOf = String.valueOf(this.f8776c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f8774a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
