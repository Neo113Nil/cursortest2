package fZ;

import pf0.AbstractC8919b;
import pf0.i;

/* renamed from: fZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6488a extends i {

    /* renamed from: a, reason: collision with root package name */
    private final C1007a f63035a = new C1007a();

    /* renamed from: b, reason: collision with root package name */
    private boolean f63036b = true;

    /* renamed from: fZ.a$a, reason: collision with other inner class name */
    public static final class C1007a extends AbstractC8919b.c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8919b.AbstractC1361b.C1362b f63037a = AbstractC8919b.AbstractC1361b.C1362b.f80504b;

        /* renamed from: b, reason: collision with root package name */
        private final String f63038b = "2.5.6";

        C1007a() {
        }

        @Override // pf0.AbstractC8919b.c
        public final AbstractC8919b.AbstractC1361b getName() {
            return this.f63037a;
        }

        @Override // pf0.AbstractC8919b.c
        public final String getVersion() {
            return this.f63038b;
        }
    }

    C6488a() {
    }

    @Override // pf0.i
    public final AbstractC8919b getConsumer() {
        return this.f63035a;
    }

    @Override // pf0.i
    /* renamed from: isPerfMetricsEnabled */
    public final boolean getIsPerfMetricsEnabled() {
        return this.f63036b;
    }

    @Override // pf0.i
    public final void setPerfMetricsEnabled(boolean z11) {
        this.f63036b = z11;
    }
}
