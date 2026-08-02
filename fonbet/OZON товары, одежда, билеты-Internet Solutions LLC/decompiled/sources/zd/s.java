package zd;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
final /* synthetic */ class s extends C7734p implements Function1<Field, C11093A> {

    /* renamed from: a, reason: collision with root package name */
    public static final s f108845a = new s(1);

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return N.b(C11093A.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11093A invoke(Field field) {
        Field p02 = field;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return new C11093A(p02);
    }
}
