package h5;

import android.content.Context;
import g5.C6627B;
import g5.S;
import java.util.UUID;

/* loaded from: classes8.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.work.impl.utils.futures.c f65013a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UUID f65014b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.work.h f65015c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f65016d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ z f65017e;

    y(z zVar, androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.h hVar, Context context) {
        this.f65017e = zVar;
        this.f65013a = cVar;
        this.f65014b = uuid;
        this.f65015c = hVar;
        this.f65016d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f65016d;
        androidx.work.h hVar = this.f65015c;
        z zVar = this.f65017e;
        androidx.work.impl.utils.futures.c cVar = this.f65013a;
        try {
            if (!cVar.isCancelled()) {
                String uuid = this.f65014b.toString();
                C6627B m11 = zVar.f65020c.m(uuid);
                if (m11 == null || m11.f63800b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                zVar.f65019b.j(uuid, hVar);
                context.startService(androidx.work.impl.foreground.b.c(context, S.a(m11), hVar));
            }
            cVar.j(null);
        } catch (Throwable th2) {
            cVar.l(th2);
        }
    }
}
