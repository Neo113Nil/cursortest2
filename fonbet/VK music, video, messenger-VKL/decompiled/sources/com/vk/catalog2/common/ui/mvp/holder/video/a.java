package com.vk.catalog2.common.ui.mvp.holder.video;

import io.reactivex.rxjava3.core.w;
import java.util.concurrent.TimeUnit;
import xsna.bh10;
import xsna.d2c0;
import xsna.gyo0;
import xsna.h0t0;
import xsna.qc00;
import xsna.skj0;
import xsna.ttz;
import xsna.wb7;

/* compiled from: VideoOfflineRetryCoordinator.kt */
/* loaded from: classes16.dex */
public final class a {
    public final C0510a a;
    public final wb7 b;
    public final h0t0 c;
    public boolean f;
    public boolean g;
    public final b d = new b();
    public final ttz e = new ttz(new skj0(this, 14));
    public final ttz h = new ttz(new gyo0(this, 8));

    /* compiled from: VideoOfflineRetryCoordinator.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.holder.video.a$a, reason: collision with other inner class name */
    public static final class C0510a {
        public final boolean a;
        public final qc00 b;
        public final d2c0 c;
        public final long d;
        public final w e;

        public C0510a(boolean z, qc00 qc00Var, d2c0 d2c0Var, long j, w wVar) {
            this.a = z;
            this.b = qc00Var;
            this.c = d2c0Var;
            this.d = j;
            this.e = wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0510a)) {
                return false;
            }
            C0510a c0510a = (C0510a) obj;
            return this.a == c0510a.a && this.b.equals(c0510a.b) && this.c.equals(c0510a.c) && this.d == c0510a.d && this.e.equals(c0510a.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + bh10.a((this.c.hashCode() + ((this.b.hashCode() + bh10.a(Boolean.hashCode(this.a) * 31, 31, 15L)) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            return "Config(isOfflinePlaceholderScopeCatalog=" + this.a + ", offlinePlaceholderTimeoutSeconds=15, isOfflineRefinementEnabled=" + this.b + ", isSlowNetworkSnackbarEnabled=" + this.c + ", slowNetworkTimeoutSeconds=" + this.d + ", mainScheduler=" + this.e + ')';
        }
    }

    public a(C0510a c0510a, wb7 wb7Var, h0t0 h0t0Var) {
        this.a = c0510a;
        this.b = wb7Var;
        this.c = h0t0Var;
    }

    public final boolean a() {
        C0510a c0510a = this.a;
        if (!((Boolean) c0510a.b.invoke()).booleanValue() || !c0510a.a) {
            return false;
        }
        this.c.getClass();
        return false;
    }

    public final void b() {
        C0510a c0510a = this.a;
        if (!((Boolean) c0510a.c.invoke()).booleanValue() || this.f) {
            return;
        }
        this.e.b(TimeUnit.SECONDS.toMillis(c0510a.d));
    }
}
