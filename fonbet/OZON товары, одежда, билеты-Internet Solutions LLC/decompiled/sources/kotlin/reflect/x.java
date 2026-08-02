package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class x extends C7735q implements Function1<Class<?>, Class<?>> {

    /* renamed from: a, reason: collision with root package name */
    public static final x f71863a = new x();

    x() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(Class<?> cls) {
        Class<?> p02 = cls;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.getComponentType();
    }
}
