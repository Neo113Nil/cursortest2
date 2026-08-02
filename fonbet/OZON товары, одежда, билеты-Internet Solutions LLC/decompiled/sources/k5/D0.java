package k5;

import android.os.Build;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class D0<T extends Serializable> {

    /* renamed from: d, reason: collision with root package name */
    private static final HashSet f70523d = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Mm0.e f70524c;

    D0(@NonNull Mm0.e eVar) {
        this.f70524c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v() throws C7502c2 {
        InterfaceC7542m2 interfaceC7542m2 = (InterfaceC7542m2) this;
        Iterator it = interfaceC7542m2.r().iterator();
        while (it.hasNext()) {
            EnumC7578w enumC7578w = (EnumC7578w) it.next();
            if (!Gf.d.l(interfaceC7542m2.b(), enumC7578w.a())) {
                throw new C7502c2(enumC7578w);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f70524c == ((D0) obj).f70524c;
    }

    public final int hashCode() {
        return this.f70524c.hashCode();
    }

    @NonNull
    protected abstract T s() throws D1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() throws P2 {
        Iterator it = ((O0) this).q().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            HashSet hashSet = f70523d;
            if (!hashSet.contains(str)) {
                try {
                    Class.forName(str);
                    hashSet.add(str);
                } catch (ClassNotFoundException | VerifyError unused) {
                    throw new P2(B0.A0.b("External dependency '", str, "' does not exists in the project"));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T u() throws Mm0.a, D1 {
        try {
            if (this instanceof O0) {
                t();
            }
            if (this instanceof InterfaceC7542m2) {
                v();
            }
            if (this instanceof InterfaceC7580w1) {
                int z11 = ((InterfaceC7580w1) this).z();
                int i11 = Build.VERSION.SDK_INT;
                if (z11 < i11) {
                    throw new P2("this SDK version (" + i11 + ") is not supported parameter '" + this.f70524c.name() + "'");
                }
            }
            return (T) s();
        } catch (D1 e11) {
            throw e11;
        } catch (Throwable th2) {
            throw new Mm0.a("Unknown caught exception", th2);
        }
    }

    @NonNull
    public final Mm0.e x() {
        return this.f70524c;
    }
}
