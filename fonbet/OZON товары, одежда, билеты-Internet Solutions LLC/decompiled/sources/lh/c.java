package lh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Oj.e f73311a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ch.c f73312b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73313c;

    public c(@NotNull Oj.e backgroundWrapperPreset, @NotNull Ch.c smartLabelPreset, int i11) {
        Intrinsics.checkNotNullParameter(backgroundWrapperPreset, "backgroundWrapperPreset");
        Intrinsics.checkNotNullParameter(smartLabelPreset, "smartLabelPreset");
        this.f73311a = backgroundWrapperPreset;
        this.f73312b = smartLabelPreset;
        this.f73313c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f73311a, cVar.f73311a) && Intrinsics.d(this.f73312b, cVar.f73312b) && this.f73313c == cVar.f73313c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73313c) + ((this.f73312b.hashCode() + (this.f73311a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPreset(backgroundWrapperPreset=");
        sb2.append(this.f73311a);
        sb2.append(", smartLabelPreset=");
        sb2.append(this.f73312b);
        sb2.append(", minHeight=");
        return K00.b.e(this.f73313c, ")", sb2);
    }
}
