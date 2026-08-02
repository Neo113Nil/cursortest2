package zd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class z extends AbstractC11106h implements Jd.m {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Enum<?> f108852b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Sd.f fVar, @NotNull Enum<?> value) {
        super(fVar);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f108852b = value;
    }

    @Override // Jd.m
    public final Sd.b d() {
        Class<?> cls = this.f108852b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        Intrinsics.f(cls);
        return C11104f.a(cls);
    }

    @Override // Jd.m
    public final Sd.f e() {
        return Sd.f.f(this.f108852b.name());
    }
}
