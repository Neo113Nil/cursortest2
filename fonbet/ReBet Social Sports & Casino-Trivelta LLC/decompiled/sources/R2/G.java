package R2;

import Q2.AbstractC1508t;
import Q2.EnumC1497h;
import Y2.AbstractC1814e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public class G extends Q2.J {

    /* renamed from: j, reason: collision with root package name */
    public static final String f9941j = AbstractC1508t.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final Y f9942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9943b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1497h f9944c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9945d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9946e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9947f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9948g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9949h;

    /* renamed from: i, reason: collision with root package name */
    public Q2.x f9950i;

    public G(Y y10, List list) {
        this(y10, null, EnumC1497h.KEEP, list, null);
    }

    public static /* synthetic */ Unit a(G g10) {
        g10.getClass();
        AbstractC1814e.b(g10);
        return Unit.INSTANCE;
    }

    public static boolean j(G g10, Set set) {
        set.addAll(g10.d());
        Set m10 = m(g10);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (m10.contains((String) it.next())) {
                return true;
            }
        }
        List f10 = g10.f();
        if (f10 != null && !f10.isEmpty()) {
            Iterator it2 = f10.iterator();
            while (it2.hasNext()) {
                if (j((G) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(g10.d());
        return false;
    }

    public static Set m(G g10) {
        HashSet hashSet = new HashSet();
        List f10 = g10.f();
        if (f10 != null && !f10.isEmpty()) {
            Iterator it = f10.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((G) it.next()).d());
            }
        }
        return hashSet;
    }

    public Q2.x b() {
        if (this.f9949h) {
            AbstractC1508t.e().k(f9941j, "Already enqueued work ids (" + TextUtils.join(", ", this.f9946e) + ")");
        } else {
            this.f9950i = Q2.B.c(this.f9942a.f().n(), "EnqueueRunnable_" + c().name(), this.f9942a.t().c(), new Function0() { // from class: R2.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return G.a(G.this);
                }
            });
        }
        return this.f9950i;
    }

    public EnumC1497h c() {
        return this.f9944c;
    }

    public List d() {
        return this.f9946e;
    }

    public String e() {
        return this.f9943b;
    }

    public List f() {
        return this.f9948g;
    }

    public List g() {
        return this.f9945d;
    }

    public Y h() {
        return this.f9942a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f9949h;
    }

    public void l() {
        this.f9949h = true;
    }

    public G(Y y10, String str, EnumC1497h enumC1497h, List list) {
        this(y10, str, enumC1497h, list, null);
    }

    public G(Y y10, String str, EnumC1497h enumC1497h, List list, List list2) {
        this.f9942a = y10;
        this.f9943b = str;
        this.f9944c = enumC1497h;
        this.f9945d = list;
        this.f9948g = list2;
        this.f9946e = new ArrayList(list.size());
        this.f9947f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f9947f.addAll(((G) it.next()).f9947f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC1497h == EnumC1497h.REPLACE && ((Q2.M) list.get(i10)).d().getNextScheduleTimeOverride() != LongCompanionObject.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String b10 = ((Q2.M) list.get(i10)).b();
            this.f9946e.add(b10);
            this.f9947f.add(b10);
        }
    }
}
