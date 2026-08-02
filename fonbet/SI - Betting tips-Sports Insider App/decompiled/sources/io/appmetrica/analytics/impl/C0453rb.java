package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453rb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0478sb f14553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453rb(C0478sb c0478sb, String str) {
        super(str);
        this.f14553a = c0478sb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f14553a.f14623a) {
            C0478sb.a(this.f14553a);
            this.f14553a.f14627e = true;
            this.f14553a.f14623a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f14553a.f14624b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f14553a.f14624b);
                this.f14553a.f14624b.clear();
            }
            if (hashMap.size() > 0) {
                C0478sb.a(this.f14553a, hashMap);
                hashMap.clear();
            }
        }
    }
}
