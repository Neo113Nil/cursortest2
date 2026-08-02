package org.maplibre.android.offline;

import Le0.q;
import Z.f;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;

/* loaded from: classes10.dex */
public final class b implements OfflineManager.FileSourceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ OfflineManager f79977a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f79978b;

    b(OfflineManager offlineManager, q qVar) {
        this.f79977a = offlineManager;
        this.f79978b = qVar;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(final String message) {
        FileSource fileSource;
        Handler handler;
        Intrinsics.checkNotNullParameter(message, "message");
        final OfflineManager offlineManager = this.f79977a;
        fileSource = offlineManager.f79968a;
        fileSource.activate();
        handler = offlineManager.f79969b;
        final q qVar = this.f79978b;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.a
            @Override // java.lang.Runnable
            public final void run() {
                FileSource fileSource2;
                fileSource2 = OfflineManager.this.f79968a;
                fileSource2.deactivate();
                qVar.onError(message);
            }
        });
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        Handler handler;
        OfflineManager offlineManager = this.f79977a;
        handler = offlineManager.f79969b;
        handler.post(new f(3, offlineManager, this.f79978b));
    }
}
