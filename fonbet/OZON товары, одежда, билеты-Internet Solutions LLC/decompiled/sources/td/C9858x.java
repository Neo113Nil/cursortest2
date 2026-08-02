package td;

import kotlin.jvm.internal.Intrinsics;
import ne.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9858x<Type extends ne.h> extends n0<Type> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sd.f f99432a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Type f99433b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9858x(@NotNull Sd.f underlyingPropertyName, @NotNull Type underlyingType) {
        super(0);
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f99432a = underlyingPropertyName;
        this.f99433b = underlyingType;
    }

    @Override // td.n0
    public final boolean a(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.d(this.f99432a, name);
    }

    @NotNull
    public final Sd.f b() {
        return this.f99432a;
    }

    @NotNull
    public final Type c() {
        return this.f99433b;
    }

    @NotNull
    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f99432a + ", underlyingType=" + this.f99433b + ')';
    }
}
