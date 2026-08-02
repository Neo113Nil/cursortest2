package o8;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f21095a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21096b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f21097c;

    /* renamed from: d, reason: collision with root package name */
    public int f21098d;

    /* renamed from: e, reason: collision with root package name */
    public int f21099e;

    /* renamed from: f, reason: collision with root package name */
    public d f21100f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f21101g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f21096b = hashSet;
        this.f21097c = new HashSet();
        this.f21098d = 0;
        this.f21099e = 0;
        this.f21101g = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            io.sentry.config.a.b(cls2, "Null interface");
            this.f21096b.add(p.a(cls2));
        }
    }

    public final void a(h hVar) {
        if (this.f21096b.contains(hVar.f21122a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f21097c.add(hVar);
    }

    public final b b() {
        if (this.f21100f != null) {
            return new b(this.f21095a, new HashSet(this.f21096b), new HashSet(this.f21097c), this.f21098d, this.f21099e, this.f21100f, this.f21101g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i5) {
        if (!(this.f21098d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f21098d = i5;
    }

    public a(p pVar, p[] pVarArr) {
        HashSet hashSet = new HashSet();
        this.f21096b = hashSet;
        this.f21097c = new HashSet();
        this.f21098d = 0;
        this.f21099e = 0;
        this.f21101g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            io.sentry.config.a.b(pVar2, "Null interface");
        }
        Collections.addAll(this.f21096b, pVarArr);
    }
}
