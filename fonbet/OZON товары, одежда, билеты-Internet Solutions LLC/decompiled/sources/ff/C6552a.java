package ff;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.G;

/* renamed from: ff.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6552a {

    /* renamed from: a, reason: collision with root package name */
    private long f63368a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final G f63369b;

    public C6552a(@NotNull G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f63369b = source;
        this.f63368a = 262144;
    }

    @NotNull
    public final String a() {
        String s11 = this.f63369b.s(this.f63368a);
        this.f63368a -= s11.length();
        return s11;
    }
}
