package w0;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10387c {

    /* renamed from: a, reason: collision with root package name */
    private final long f103253a;

    private /* synthetic */ C10387c(long j11) {
        this.f103253a = j11;
    }

    public static final /* synthetic */ C10387c a(long j11) {
        return new C10387c(j11);
    }

    public final /* synthetic */ long b() {
        return this.f103253a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10387c) {
            return this.f103253a == ((C10387c) obj).f103253a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f103253a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f103253a + ')';
    }
}
