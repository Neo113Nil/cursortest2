package io.sentry.android.ndk;

import io.sentry.AbstractC7221x1;
import io.sentry.cache.l;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67411a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC7221x1 f67412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f67413c;

    public /* synthetic */ e(f fVar, String str) {
        this.f67412b = fVar;
        this.f67413c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67411a) {
            case 0:
                f.r((f) this.f67412b, (String) this.f67413c);
                break;
            default:
                ((l) this.f67412b).K((List) this.f67413c, "fingerprint.json");
                break;
        }
    }

    public /* synthetic */ e(l lVar, List list) {
        this.f67412b = lVar;
        this.f67413c = list;
    }
}
