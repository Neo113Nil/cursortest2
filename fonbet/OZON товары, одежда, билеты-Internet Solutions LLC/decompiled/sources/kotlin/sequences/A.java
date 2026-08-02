package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class A extends C7735q implements Function1<Iterable<Object>, Iterator<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f71868a = new A();

    A() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        Iterable<Object> p02 = iterable;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.iterator();
    }
}
