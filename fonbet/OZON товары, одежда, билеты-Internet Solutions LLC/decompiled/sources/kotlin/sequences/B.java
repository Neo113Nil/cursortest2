package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class B extends C7735q implements Function1<Sequence<Object>, Iterator<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final B f71869a = new B();

    B() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<Object> invoke(Sequence<Object> sequence) {
        Sequence<Object> p02 = sequence;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.iterator();
    }
}
