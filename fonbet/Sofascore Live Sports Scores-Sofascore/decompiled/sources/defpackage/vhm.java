package defpackage;

import com.blaze.blazesdk.analytics.AnalyticsDoNotTrackLocal;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vhm implements Callable {
    public final /* synthetic */ AnalyticsDoNotTrackLocal[] a;
    public final /* synthetic */ dnm b;

    public vhm(dnm dnmVar, AnalyticsDoNotTrackLocal[] analyticsDoNotTrackLocalArr) {
        this.b = dnmVar;
        this.a = analyticsDoNotTrackLocalArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        dnm dnmVar = this.b;
        k6g k6gVar = dnmVar.a;
        k6g k6gVar2 = dnmVar.a;
        k6gVar.beginTransaction();
        try {
            xbb B = dnmVar.b.B(this.a);
            k6gVar2.setTransactionSuccessful();
            return B;
        } finally {
            k6gVar2.endTransaction();
        }
    }
}
