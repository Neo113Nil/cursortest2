package i7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final j f48178a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f48179b;

    public m(j frameLoader, Date insertedTime) {
        Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
        Intrinsics.checkNotNullParameter(insertedTime, "insertedTime");
        this.f48178a = frameLoader;
        this.f48179b = insertedTime;
    }

    public final j a() {
        return this.f48178a;
    }

    public final Date b() {
        return this.f48179b;
    }
}
