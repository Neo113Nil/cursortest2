package je;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7360E extends K0 implements ne.e {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Y f69827b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Y f69828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7360E(@NotNull Y lowerBound, @NotNull Y upperBound) {
        super(0);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.f69827b = lowerBound;
        this.f69828c = upperBound;
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return O0().F0();
    }

    @Override // je.N
    @NotNull
    public o0 G0() {
        return O0().G0();
    }

    @Override // je.N
    @NotNull
    public final s0 H0() {
        return O0().H0();
    }

    @Override // je.N
    public boolean I0() {
        return O0().I0();
    }

    @NotNull
    public abstract Y O0();

    @NotNull
    public final Y P0() {
        return this.f69827b;
    }

    @NotNull
    public final Y Q0() {
        return this.f69828c;
    }

    @NotNull
    public abstract String R0(@NotNull Ud.u uVar, @NotNull Ud.u uVar2);

    @Override // je.N
    @NotNull
    public ce.l p() {
        return O0().p();
    }

    @NotNull
    public String toString() {
        return Ud.n.f27604c.h0(this);
    }
}
