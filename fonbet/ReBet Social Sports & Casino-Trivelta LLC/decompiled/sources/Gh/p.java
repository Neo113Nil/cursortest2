package Gh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p extends k {

    /* renamed from: a, reason: collision with root package name */
    public final g f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4166b;

    @Nullable
    private final g[] coordinates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g[] gVarArr, g center, double d10) {
        super(null);
        Intrinsics.checkNotNullParameter(center, "center");
        this.coordinates = gVarArr;
        this.f4165a = center;
        this.f4166b = d10;
    }

    public final g a() {
        return this.f4165a;
    }

    public final g[] b() {
        return this.coordinates;
    }

    public final double c() {
        return this.f4166b;
    }
}
