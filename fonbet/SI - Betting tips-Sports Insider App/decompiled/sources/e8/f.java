package e8;

import com.google.android.gms.internal.measurement.u5;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public volatile u5 f8777a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f8778b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8779c;

    @Override // e8.d
    public final Object get() {
        if (!this.f8778b) {
            synchronized (this) {
                try {
                    if (!this.f8778b) {
                        u5 u5Var = this.f8777a;
                        Objects.requireNonNull(u5Var);
                        Object obj = u5Var.get();
                        this.f8779c = obj;
                        this.f8778b = true;
                        this.f8777a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8779c;
    }

    public final String toString() {
        Object obj = this.f8777a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f8779c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
