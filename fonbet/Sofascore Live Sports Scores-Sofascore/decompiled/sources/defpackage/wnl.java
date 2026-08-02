package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wnl {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public wnl() {
        new AtomicLong(0L);
    }

    @JavascriptInterface
    public final void sendBooleanValue(long j, boolean z) {
        this.a.post(new og4(this, j, z));
    }
}
