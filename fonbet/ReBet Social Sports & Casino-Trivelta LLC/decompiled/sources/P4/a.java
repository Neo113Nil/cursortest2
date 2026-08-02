package P4;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import x0.C6776e;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8808a = new C0175a();

    public class b implements d {
        @Override // P4.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    public class c implements g {
        @Override // P4.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object create();
    }

    public static final class e implements InterfaceC6775d {

        /* renamed from: a, reason: collision with root package name */
        public final d f8809a;

        /* renamed from: b, reason: collision with root package name */
        public final g f8810b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC6775d f8811c;

        public e(InterfaceC6775d interfaceC6775d, d dVar, g gVar) {
            this.f8811c = interfaceC6775d;
            this.f8809a = dVar;
            this.f8810b = gVar;
        }

        @Override // x0.InterfaceC6775d
        public Object acquire() {
            Object acquire = this.f8811c.acquire();
            if (acquire == null) {
                acquire = this.f8809a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    acquire.getClass().toString();
                }
            }
            if (acquire instanceof f) {
                ((f) acquire).d().b(false);
            }
            return acquire;
        }

        @Override // x0.InterfaceC6775d
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).d().b(true);
            }
            this.f8810b.a(obj);
            return this.f8811c.release(obj);
        }
    }

    public interface f {
        P4.c d();
    }

    public interface g {
        void a(Object obj);
    }

    public static InterfaceC6775d a(InterfaceC6775d interfaceC6775d, d dVar) {
        return b(interfaceC6775d, dVar, c());
    }

    public static InterfaceC6775d b(InterfaceC6775d interfaceC6775d, d dVar, g gVar) {
        return new e(interfaceC6775d, dVar, gVar);
    }

    public static g c() {
        return f8808a;
    }

    public static InterfaceC6775d d(int i10, d dVar) {
        return a(new C6776e(i10), dVar);
    }

    public static InterfaceC6775d e() {
        return f(20);
    }

    public static InterfaceC6775d f(int i10) {
        return b(new C6776e(i10), new b(), new c());
    }

    /* renamed from: P4.a$a, reason: collision with other inner class name */
    public class C0175a implements g {
        @Override // P4.a.g
        public void a(Object obj) {
        }
    }
}
