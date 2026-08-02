package K4;

import com.bumptech.glide.load.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f6243a = new ArrayList();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f6244a;

        /* renamed from: b, reason: collision with root package name */
        public final m f6245b;

        public a(Class cls, m mVar) {
            this.f6244a = cls;
            this.f6245b = mVar;
        }

        public boolean a(Class cls) {
            return this.f6244a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, m mVar) {
        this.f6243a.add(new a(cls, mVar));
    }

    public synchronized m b(Class cls) {
        int size = this.f6243a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f6243a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f6245b;
            }
        }
        return null;
    }
}
