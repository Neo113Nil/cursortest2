package androidx.dynamicanimation.animation;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.app.q;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Random;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1770a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1771b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f1770a) {
            case 0:
                ((Runnable) this.f1771b).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? i2.g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new q((Context) this.f1771b, 1), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ c(Runnable runnable) {
        this.f1771b = runnable;
    }
}
