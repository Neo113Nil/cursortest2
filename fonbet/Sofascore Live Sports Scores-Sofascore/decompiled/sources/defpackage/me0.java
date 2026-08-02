package defpackage;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class me0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace a;

    public me0(AppStartTrace appStartTrace) {
        this.a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.a.t++;
    }
}
