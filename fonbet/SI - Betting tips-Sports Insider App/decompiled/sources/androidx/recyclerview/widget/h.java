package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final g f2401h = new g();

    /* renamed from: a, reason: collision with root package name */
    public final c f2402a;

    /* renamed from: b, reason: collision with root package name */
    public final l2 f2403b;

    /* renamed from: e, reason: collision with root package name */
    public List f2406e;

    /* renamed from: g, reason: collision with root package name */
    public int f2408g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f2405d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f2407f = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public final g f2404c = f2401h;

    public h(c cVar, l2 l2Var) {
        this.f2402a = cVar;
        this.f2403b = l2Var;
    }

    public final void a() {
        Iterator it = this.f2405d.iterator();
        while (it.hasNext()) {
            te.q qVar = ((n0) it.next()).f2485a;
        }
    }
}
