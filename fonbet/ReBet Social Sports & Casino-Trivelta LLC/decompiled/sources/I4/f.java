package I4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f5345a = new ArrayList();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f5346a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f5347b;

        /* renamed from: c, reason: collision with root package name */
        public final e f5348c;

        public a(Class cls, Class cls2, e eVar) {
            this.f5346a = cls;
            this.f5347b = cls2;
            this.f5348c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f5346a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f5347b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f5345a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f5348c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f5345a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f5347b)) {
                arrayList.add(aVar.f5347b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f5345a.add(new a(cls, cls2, eVar));
    }
}
