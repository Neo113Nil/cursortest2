package fe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.d0;

/* renamed from: fe.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6530i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pd.c f63211a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Nd.b f63212b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Pd.a f63213c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d0 f63214d;

    public C6530i(@NotNull Pd.c nameResolver, @NotNull Nd.b classProto, @NotNull Pd.a metadataVersion, @NotNull d0 sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f63211a = nameResolver;
        this.f63212b = classProto;
        this.f63213c = metadataVersion;
        this.f63214d = sourceElement;
    }

    @NotNull
    public final Pd.c a() {
        return this.f63211a;
    }

    @NotNull
    public final Nd.b b() {
        return this.f63212b;
    }

    @NotNull
    public final Pd.a c() {
        return this.f63213c;
    }

    @NotNull
    public final d0 d() {
        return this.f63214d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6530i)) {
            return false;
        }
        C6530i c6530i = (C6530i) obj;
        return Intrinsics.d(this.f63211a, c6530i.f63211a) && Intrinsics.d(this.f63212b, c6530i.f63212b) && Intrinsics.d(this.f63213c, c6530i.f63213c) && Intrinsics.d(this.f63214d, c6530i.f63214d);
    }

    public final int hashCode() {
        return this.f63214d.hashCode() + ((this.f63213c.hashCode() + ((this.f63212b.hashCode() + (this.f63211a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ClassData(nameResolver=" + this.f63211a + ", classProto=" + this.f63212b + ", metadataVersion=" + this.f63213c + ", sourceElement=" + this.f63214d + ')';
    }
}
