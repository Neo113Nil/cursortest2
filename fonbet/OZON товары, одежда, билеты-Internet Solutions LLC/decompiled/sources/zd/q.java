package zd;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
final /* synthetic */ class q extends C7734p implements Function1<Constructor<?>, x> {

    /* renamed from: a, reason: collision with root package name */
    public static final q f108843a = new q(1);

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return N.b(x.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final x invoke(Constructor<?> constructor) {
        Constructor<?> p02 = constructor;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return new x(p02);
    }
}
