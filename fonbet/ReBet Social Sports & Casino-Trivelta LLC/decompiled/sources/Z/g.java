package Z;

import kotlin.Function;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g extends Lambda implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final g f14419d = new g();

    public g() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a invoke(a aVar, a childValue) {
        String b10;
        Function a10;
        Intrinsics.checkNotNullParameter(childValue, "childValue");
        if (aVar == null || (b10 = aVar.b()) == null) {
            b10 = childValue.b();
        }
        if (aVar == null || (a10 = aVar.a()) == null) {
            a10 = childValue.a();
        }
        return new a(b10, a10);
    }
}
