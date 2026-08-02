package ic;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends tg.j {

    /* renamed from: c, reason: collision with root package name */
    public static final r f11132c = new r(Reflection.getOrCreateKotlinClass(j.class));

    @Override // tg.j
    public final og.a e(tg.m element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return x.Companion.serializer();
    }
}
