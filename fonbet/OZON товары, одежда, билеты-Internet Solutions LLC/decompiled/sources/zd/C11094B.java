package zd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.B, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11094B extends AbstractC11106h implements Jd.o {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f108800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11094B(Sd.f fVar, @NotNull Object value) {
        super(fVar);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f108800b = value;
    }

    @Override // Jd.o
    @NotNull
    public final Object getValue() {
        return this.f108800b;
    }
}
