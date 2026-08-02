package V;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final J.a f12314a;

    /* renamed from: b, reason: collision with root package name */
    public final a f12315b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12316c;

    public f(J.a modifier, a coordinates, Object obj) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f12314a = modifier;
        this.f12315b = coordinates;
        this.f12316c = obj;
    }

    public final J.a a() {
        return this.f12314a;
    }

    public String toString() {
        return "ModifierInfo(" + this.f12314a + ", " + this.f12315b + ", " + this.f12316c + ')';
    }
}
