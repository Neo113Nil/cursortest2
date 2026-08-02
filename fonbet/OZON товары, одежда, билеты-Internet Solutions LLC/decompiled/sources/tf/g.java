package tf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import tf.h;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<j, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final g f99497b = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(j jVar) {
        h.a aVar;
        j entry = jVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        aVar = h.f99498c;
        return Boolean.valueOf(h.a.a(aVar, entry.a()));
    }
}
