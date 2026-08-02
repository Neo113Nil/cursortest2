package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kxf implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z) {
        DefaultClock defaultClock = lxf.j;
        synchronized (lxf.class) {
            Iterator it = lxf.l.values().iterator();
            while (it.hasNext()) {
                ((e58) it.next()).h(z);
            }
        }
    }
}
