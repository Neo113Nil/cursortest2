package defpackage;

import com.blaze.blazesdk.analytics.AnalyticsTrackLocal;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c1n implements Callable {
    public final /* synthetic */ AnalyticsTrackLocal[] a;
    public final /* synthetic */ jx0 b;

    public c1n(jx0 jx0Var, AnalyticsTrackLocal[] analyticsTrackLocalArr) {
        this.b = jx0Var;
        this.a = analyticsTrackLocalArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        jx0 jx0Var = this.b;
        k6g k6gVar = jx0Var.a;
        k6g k6gVar2 = jx0Var.a;
        k6gVar.beginTransaction();
        try {
            xbb B = jx0Var.b.B(this.a);
            k6gVar2.setTransactionSuccessful();
            return B;
        } finally {
            k6gVar2.endTransaction();
        }
    }
}
