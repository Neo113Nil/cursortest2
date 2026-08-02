package ef;

import We.C;
import We.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;

/* renamed from: ef.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6358h extends M {

    /* renamed from: a, reason: collision with root package name */
    private final String f62232a;

    /* renamed from: b, reason: collision with root package name */
    private final long f62233b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9683i f62234c;

    public C6358h(String str, long j11, @NotNull InterfaceC9683i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f62232a = str;
        this.f62233b = j11;
        this.f62234c = source;
    }

    @Override // We.M
    public final long contentLength() {
        return this.f62233b;
    }

    @Override // We.M
    public final C contentType() {
        String str = this.f62232a;
        if (str == null) {
            return null;
        }
        C.f33536g.getClass();
        return C.a.b(str);
    }

    @Override // We.M
    @NotNull
    public final InterfaceC9683i source() {
        return this.f62234c;
    }
}
