package od;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f78061a = new l();

    @Override // od.h
    @NotNull
    public final List<Type> a() {
        return K.f71697a;
    }

    @Override // od.h
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // od.h
    public final Object call(@NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // od.h
    @NotNull
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }
}
