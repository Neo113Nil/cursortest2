package B4;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface n {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.g f750a;

        /* renamed from: b, reason: collision with root package name */
        public final List f751b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f752c;

        public a(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.data.d dVar) {
            this(gVar, Collections.EMPTY_LIST, dVar);
        }

        public a(com.bumptech.glide.load.g gVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f750a = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.d(gVar);
            this.f751b = (List) com.bumptech.glide.util.k.d(list);
            this.f752c = (com.bumptech.glide.load.data.d) com.bumptech.glide.util.k.d(dVar);
        }
    }

    boolean a(Object obj);

    a b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar);
}
