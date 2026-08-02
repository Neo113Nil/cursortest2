package io.sentry.android.ndk;

import io.sentry.C7141f;
import io.sentry.cache.l;
import io.sentry.protocol.E;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f67403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f67404c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f67402a = i11;
        this.f67403b = obj;
        this.f67404c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67402a) {
            case 0:
                f.s((f) this.f67403b, (C7141f) this.f67404c);
                break;
            case 1:
                ((l) this.f67403b).K((E) this.f67404c, "user.json");
                break;
            default:
                NetworkChangeNotifierAutoDetect.a((NetworkChangeNotifierAutoDetect) this.f67403b, (Runnable) this.f67404c);
                break;
        }
    }
}
