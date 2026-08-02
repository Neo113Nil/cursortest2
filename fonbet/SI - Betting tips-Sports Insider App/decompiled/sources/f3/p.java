package f3;

import android.text.TextUtils;
import e3.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends ci.c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f9405i = e3.x.g("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final v f9406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9407b;

    /* renamed from: c, reason: collision with root package name */
    public final e3.o f9408c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9409d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9410e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9411f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f9412g;

    /* renamed from: h, reason: collision with root package name */
    public e3.l f9413h;

    public p(v vVar, String str, e3.o oVar, List list, int i5) {
        this.f9406a = vVar;
        this.f9407b = str;
        this.f9408c = oVar;
        this.f9409d = list;
        this.f9410e = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (oVar == e3.o.f8551a && ((m0) list.get(i10)).f8546b.f20349u != LongCompanionObject.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((m0) list.get(i10)).f8545a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            this.f9410e.add(uuid);
            this.f9411f.add(uuid);
        }
    }

    public static HashSet r0(p pVar) {
        HashSet hashSet = new HashSet();
        pVar.getClass();
        return hashSet;
    }

    public final e3.l q0() {
        if (this.f9412g) {
            e3.x.e().h(f9405i, "Already enqueued work ids (" + TextUtils.join(", ", this.f9410e) + ")");
        } else {
            v vVar = this.f9406a;
            this.f9413h = a.a.t(vVar.f9427b.f8489p, "EnqueueRunnable_" + this.f9408c.name(), (k2.a0) vVar.f9429d.f6182a, new a2.q(12, this));
        }
        return this.f9413h;
    }
}
