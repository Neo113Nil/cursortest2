package o8;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21102a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f21103b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f21104c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21106e;

    /* renamed from: f, reason: collision with root package name */
    public final d f21107f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f21108g;

    public b(String str, Set set, Set set2, int i5, int i10, d dVar, Set set3) {
        this.f21102a = str;
        this.f21103b = DesugarCollections.unmodifiableSet(set);
        this.f21104c = DesugarCollections.unmodifiableSet(set2);
        this.f21105d = i5;
        this.f21106e = i10;
        this.f21107f = dVar;
        this.f21108g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static a b(p pVar) {
        return new a(pVar, new p[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            io.sentry.config.a.b(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new io.sentry.android.core.internal.gestures.c(13, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f21103b.toArray()) + ">{" + this.f21105d + ", type=" + this.f21106e + ", deps=" + Arrays.toString(this.f21104c.toArray()) + "}";
    }
}
