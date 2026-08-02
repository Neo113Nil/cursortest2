package y1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25624a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.j f25625b;

    /* renamed from: c, reason: collision with root package name */
    public final b2.e f25626c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f25627d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25628e;

    /* renamed from: f, reason: collision with root package name */
    public final ge.d f25629f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25630g;

    /* renamed from: h, reason: collision with root package name */
    public final gf.t f25631h;

    public r(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25624a = context;
        this.f25625b = new b2.j(this, new n(this, 0));
        this.f25626c = new b2.e(context, (char) 0);
        Iterator it = bg.n.b(new ub.b(6), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f25627d = (Activity) obj;
        this.f25629f = new ge.d(this);
        this.f25630g = true;
        u0 u0Var = this.f25625b.f3001r;
        u0Var.a(new e0(u0Var));
        this.f25625b.f3001r.a(new c(this.f25624a));
        this.f25631h = gf.k.b(new n(this, 1));
    }

    public final void a(q listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        b2.j jVar = this.f25625b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        jVar.f2999o.add(listener);
        kotlin.collections.l lVar = jVar.f2991f;
        if (lVar.isEmpty()) {
            return;
        }
        l lVar2 = (l) lVar.last();
        r rVar = jVar.f2986a;
        b0 b0Var = lVar2.f25583b;
        lVar2.f25589h.a();
        listener.a(rVar, b0Var);
    }

    public final int b() {
        kotlin.collections.l lVar = this.f25625b.f2991f;
        int i5 = 0;
        if (lVar != null && lVar.isEmpty()) {
            return 0;
        }
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            if (!(((l) it.next()).f25583b instanceof d0) && (i5 = i5 + 1) < 0) {
                kotlin.collections.u.i();
                throw null;
            }
        }
        return i5;
    }

    public final l c() {
        Object obj;
        Iterator it = CollectionsKt.P(this.f25625b.f2991f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = bg.n.a(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((l) obj).f25583b instanceof d0)) {
                break;
            }
        }
        return (l) obj;
    }

    public final void d(c0 directions) {
        int i5;
        i0 i0Var;
        Bundle source;
        Intrinsics.checkNotNullParameter(directions, "directions");
        int a7 = directions.a();
        Bundle from = directions.getArguments();
        b2.j jVar = this.f25625b;
        b0 b0Var = jVar.f2991f.isEmpty() ? jVar.f2988c : ((l) jVar.f2991f.last()).f25583b;
        if (b0Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        h d10 = b0Var.d(a7);
        if (d10 != null) {
            i0Var = d10.f25551b;
            i5 = d10.f25550a;
            Bundle from2 = d10.f25552c;
            if (from2 != null) {
                kotlin.collections.n0.c().getClass();
                source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(from2, "from");
                source.putAll(from2);
            } else {
                source = null;
            }
        } else {
            i5 = a7;
            i0Var = null;
            source = null;
        }
        if (from != null) {
            if (source == null) {
                kotlin.collections.n0.c().getClass();
                source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source, "source");
            }
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        if (i5 == 0 && i0Var != null) {
            boolean z5 = i0Var.f25565d;
            int i10 = i0Var.f25564c;
            if (i10 != -1) {
                if (i10 == -1 || !jVar.l(i10, z5, false)) {
                    return;
                }
                jVar.b();
                return;
            }
        }
        if (i5 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        b0 c2 = jVar.c(i5, null);
        if (c2 != null) {
            jVar.k(c2, source, i0Var);
            return;
        }
        int i11 = b0.f25532f;
        b2.e eVar = this.f25626c;
        String a10 = z.a(eVar, i5);
        if (d10 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + a10 + " cannot be found from the current destination " + b0Var);
        }
        StringBuilder p10 = d9.e.p("Navigation destination ", a10, " referenced from action ");
        p10.append(z.a(eVar, a7));
        p10.append(" cannot be found from the current destination ");
        p10.append(b0Var);
        throw new IllegalArgumentException(p10.toString().toString());
    }

    public final boolean e() {
        Bundle from;
        Intent intent;
        int b10 = b();
        b2.j jVar = this.f25625b;
        if (b10 != 1) {
            if (!jVar.f2991f.isEmpty()) {
                b0 f6 = jVar.f();
                Intrinsics.checkNotNull(f6);
                if (jVar.l(f6.f25534b.f3017e, true, false) && jVar.b()) {
                    return true;
                }
            }
            return false;
        }
        Activity activity = this.f25627d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            b0 f10 = jVar.f();
            Intrinsics.checkNotNull(f10);
            int i5 = f10.f25534b.f3017e;
            for (d0 d0Var = f10.f25535c; d0Var != null; d0Var = d0Var.f25535c) {
                b2.m mVar = d0Var.f25534b;
                if (d0Var.f25543g.f3078a != i5) {
                    kotlin.collections.n0.c().getClass();
                    Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (activity != null) {
                        Intrinsics.checkNotNull(activity);
                        if (activity.getIntent() != null) {
                            Intrinsics.checkNotNull(activity);
                            if (activity.getIntent().getData() != null) {
                                Intrinsics.checkNotNull(activity);
                                Intent value = activity.getIntent();
                                Intrinsics.checkNotNullExpressionValue(value, "getIntent(...)");
                                Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkIntent", "key");
                                Intrinsics.checkNotNullParameter(value, "value");
                                source.putParcelable("android-support-nav:controller:deepLinkIntent", value);
                                d0 i10 = jVar.i();
                                Intrinsics.checkNotNull(activity);
                                Intent intent2 = activity.getIntent();
                                Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                                Intrinsics.checkNotNullParameter(intent2, "intent");
                                a0 j = i10.j(new kh.g(intent2.getData(), intent2.getAction(), intent2.getType(), 14), i10);
                                if ((j != null ? j.f25525b : null) != null && (from = j.f25524a.a(j.f25525b)) != null) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    source.putAll(from);
                                }
                            }
                        }
                    }
                    c4.d dVar = new c4.d(this);
                    int i11 = mVar.f3017e;
                    ArrayList arrayList = (ArrayList) dVar.f3577b;
                    arrayList.clear();
                    arrayList.add(new y(i11, null));
                    if (((d0) dVar.f3581f) != null) {
                        dVar.r();
                    }
                    ((Intent) dVar.f3580e).putExtra("android-support-nav:controller:deepLinkExtras", source);
                    dVar.f().b();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i5 = mVar.f3017e;
            }
            return false;
        }
        if (!this.f25628e) {
            return false;
        }
        Intrinsics.checkNotNull(activity);
        Intent value2 = activity.getIntent();
        Bundle extras2 = value2.getExtras();
        Intrinsics.checkNotNull(extras2);
        int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
        Intrinsics.checkNotNull(intArray);
        ArrayList A = kotlin.collections.p.A(intArray);
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (A.size() < 2) {
            return false;
        }
        int intValue = ((Number) kotlin.collections.z.s(A)).intValue();
        if (parcelableArrayList != null) {
        }
        d0 g10 = jVar.g();
        Intrinsics.checkNotNullParameter(g10, "<this>");
        b0 d10 = b2.j.d(intValue, g10, null, false);
        if (d10 instanceof d0) {
            int i12 = d0.f25542h;
            intValue = y4.a.t((d0) d10).f25534b.f3017e;
        }
        b0 f11 = jVar.f();
        if (f11 == null || intValue != f11.f25534b.f3017e) {
            return false;
        }
        c4.d dVar2 = new c4.d(this);
        kotlin.collections.n0.c().getClass();
        Bundle source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source2, "source");
        Intrinsics.checkNotNull(value2);
        Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkIntent", "key");
        Intrinsics.checkNotNullParameter(value2, "value");
        source2.putParcelable("android-support-nav:controller:deepLinkIntent", value2);
        Bundle from2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
        if (from2 != null) {
            Intrinsics.checkNotNullParameter(from2, "from");
            source2.putAll(from2);
        }
        ((Intent) dVar2.f3580e).putExtra("android-support-nav:controller:deepLinkExtras", source2);
        Iterator it = A.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            ((ArrayList) dVar2.f3577b).add(new y(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i13) : null));
            if (((d0) dVar2.f3581f) != null) {
                dVar2.r();
            }
            i13 = i14;
        }
        dVar2.f().b();
        activity.finish();
        return true;
    }
}
