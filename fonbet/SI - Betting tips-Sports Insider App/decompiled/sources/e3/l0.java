package e3;

import android.os.Build;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8539a;

    /* renamed from: b, reason: collision with root package name */
    public UUID f8540b;

    /* renamed from: c, reason: collision with root package name */
    public m3.o f8541c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f8542d;

    public l0(Class workerClass) {
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        this.f8540b = randomUUID;
        String id2 = this.f8540b.toString();
        Intrinsics.checkNotNullExpressionValue(id2, "toString(...)");
        String workerClassName_ = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(workerClassName_, "getName(...)");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
        this.f8541c = new m3.o(id2, (i0) null, workerClassName_, (String) null, (j) null, (j) null, 0L, 0L, 0L, (f) null, 0, (a) null, 0L, 0L, 0L, 0L, false, (f0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String name = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String[] elements = {name};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.m0.a(1));
        kotlin.collections.p.x(elements, linkedHashSet);
        this.f8542d = linkedHashSet;
    }

    public final l0 a(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f8542d.add(tag);
        return d();
    }

    public final m0 b() {
        List split$default;
        m0 c2 = c();
        f fVar = this.f8541c.j;
        boolean z5 = (Build.VERSION.SDK_INT >= 24 && fVar.b()) || fVar.f8510e || fVar.f8508c || fVar.f8509d;
        m3.o oVar = this.f8541c;
        if (oVar.q) {
            if (z5) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (oVar.f20337g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = oVar.f20352x;
        if (str == null) {
            split$default = StringsKt__StringsKt.split$default(oVar.f20333c, new String[]{"."}, false, 0, 6, null);
            String str2 = split$default.size() == 1 ? (String) split$default.get(0) : (String) CollectionsKt.K(split$default);
            if (str2.length() > 127) {
                str2 = kotlin.text.d0.z(127, str2);
            }
            oVar.f20352x = str2;
        } else if (str.length() > 127) {
            this.f8541c.f20352x = kotlin.text.d0.z(127, str);
        }
        UUID id2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(id2, "randomUUID(...)");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f8540b = id2;
        String newId = id2.toString();
        Intrinsics.checkNotNullExpressionValue(newId, "toString(...)");
        m3.o other = this.f8541c;
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f8541c = new m3.o(newId, other.f20332b, other.f20333c, other.f20334d, new j(other.f20335e), new j(other.f20336f), other.f20337g, other.f20338h, other.f20339i, new f(other.j), other.f20340k, other.f20341l, other.f20342m, other.f20343n, other.f20344o, other.f20345p, other.q, other.f20346r, other.f20347s, other.f20349u, other.f20350v, other.f20351w, other.f20352x, other.f20353y, 524288);
        return c2;
    }

    public abstract m0 c();

    public abstract l0 d();

    public final l0 e(a backoffPolicy, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f8539a = true;
        m3.o oVar = this.f8541c;
        oVar.f20341l = backoffPolicy;
        oVar.d(timeUnit.toMillis(j));
        return d();
    }

    public final l0 f(f constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f8541c.j = constraints;
        return d();
    }

    public final l0 g(long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f8541c.f20337g = timeUnit.toMillis(j);
        if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.f8541c.f20337g) {
            return d();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final l0 h(j inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f8541c.f20335e = inputData;
        return d();
    }
}
