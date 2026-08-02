package io.sentry;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16536a;

    /* renamed from: b, reason: collision with root package name */
    public int f16537b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r5) {
        switch (this.f16536a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SentryHostnameCache-");
                int i5 = this.f16537b;
                this.f16537b = i5 + 1;
                sb2.append(i5);
                Thread thread = new Thread(r5, sb2.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb3 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i10 = this.f16537b;
                this.f16537b = i10 + 1;
                sb3.append(i10);
                Thread thread2 = new Thread(r5, sb3.toString());
                thread2.setDaemon(true);
                return thread2;
            case 2:
                Intrinsics.checkNotNullParameter(r5, "r");
                StringBuilder sb4 = new StringBuilder("SentryReplayIntegration-");
                int i11 = this.f16537b;
                this.f16537b = i11 + 1;
                sb4.append(i11);
                Thread thread3 = new Thread(r5, sb4.toString());
                thread3.setDaemon(true);
                return thread3;
            case 3:
                Intrinsics.checkNotNullParameter(r5, "r");
                StringBuilder sb5 = new StringBuilder("SentryReplayPersister-");
                int i12 = this.f16537b;
                this.f16537b = i12 + 1;
                sb5.append(i12);
                Thread thread4 = new Thread(r5, sb5.toString());
                thread4.setDaemon(true);
                return thread4;
            default:
                StringBuilder sb6 = new StringBuilder("SentryAsyncConnection-");
                int i13 = this.f16537b;
                this.f16537b = i13 + 1;
                sb6.append(i13);
                Thread thread5 = new Thread(r5, sb6.toString());
                thread5.setDaemon(true);
                return thread5;
        }
    }
}
