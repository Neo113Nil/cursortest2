package Q8;

import com.giphy.sdk.core.models.enums.RenditionType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final RenditionType f9545a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9546b;

    /* renamed from: c, reason: collision with root package name */
    public final c f9547c;

    public f(RenditionType type, boolean z10, c actionIfLoaded) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(actionIfLoaded, "actionIfLoaded");
        this.f9545a = type;
        this.f9546b = z10;
        this.f9547c = actionIfLoaded;
    }

    public final c a() {
        return this.f9547c;
    }

    public final RenditionType b() {
        return this.f9545a;
    }
}
