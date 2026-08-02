package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007f extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f11864a;

    public C0007f(h hVar) {
        this.f11864a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f11864a.f11871f && (idSyncConfig = this.f11864a.f11870e) != null) {
            this.f11864a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f11864a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f11869d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f11864a;
                IHandlerExecutor iHandlerExecutor = hVar2.f11868c;
                C0007f c0007f = hVar2.f11872g;
                if (c0007f == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
                    c0007f = null;
                }
                iHandlerExecutor.executeDelayed(c0007f, this.f11864a.f11867b);
            }
        }
    }
}
