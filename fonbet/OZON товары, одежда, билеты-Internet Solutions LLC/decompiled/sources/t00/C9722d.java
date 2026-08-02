package t00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import p00.InterfaceC8826b;

/* renamed from: t00.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9722d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C8829e f98961a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98962b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f98963c;

    public C9722d(C8829e c8829e, @NotNull String value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98961a = c8829e;
        this.f98962b = value;
        this.f98963c = z11;
    }

    public static C9722d a(C9722d c9722d, boolean z11) {
        String value = c9722d.f98962b;
        Intrinsics.checkNotNullParameter(value, "value");
        return new C9722d(c9722d.f98961a, value, z11);
    }

    public final InterfaceC8826b<T> b() {
        return this.f98961a;
    }

    public final boolean c() {
        return this.f98963c;
    }

    @NotNull
    public final T d() {
        return (T) this.f98962b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9722d)) {
            return false;
        }
        C9722d c9722d = (C9722d) obj;
        return Intrinsics.d(this.f98961a, c9722d.f98961a) && this.f98962b.equals(c9722d.f98962b) && this.f98963c == c9722d.f98963c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98963c) + ((this.f98962b.hashCode() + ((this.f98961a == null ? 0 : 2129397193) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitFlagState(flagInfo=");
        sb2.append(this.f98961a);
        sb2.append(", value=");
        sb2.append((Object) this.f98962b);
        sb2.append(", shouldReloadApp=");
        return Pk0.a.a(")", sb2, this.f98963c);
    }
}
