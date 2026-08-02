package L7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7084a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7085b;

    public f(boolean z10, boolean z11) {
        this.f7084a = z10;
        this.f7085b = z11;
    }

    public final boolean a() {
        return this.f7084a;
    }

    public final boolean b() {
        return this.f7085b;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
