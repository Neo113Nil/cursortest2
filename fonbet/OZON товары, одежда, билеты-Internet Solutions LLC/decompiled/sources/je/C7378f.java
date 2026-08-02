package je;

import java.util.AbstractCollection;
import java.util.Iterator;
import je.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7378f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractCollection f69879a;

    /* renamed from: b, reason: collision with root package name */
    private final r0 f69880b;

    /* renamed from: c, reason: collision with root package name */
    private final ne.m f69881c;

    /* renamed from: d, reason: collision with root package name */
    private final ne.h f69882d;

    public C7378f(AbstractCollection abstractCollection, r0 r0Var, ne.m mVar, ne.h hVar) {
        this.f69879a = abstractCollection;
        this.f69880b = r0Var;
        this.f69881c = mVar;
        this.f69882d = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r0.a runForkingPoint = (r0.a) obj;
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        Iterator it = this.f69879a.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new C7380g(this.f69880b, this.f69881c, (ne.h) it.next(), this.f69882d));
        }
        return Unit.f71690a;
    }
}
