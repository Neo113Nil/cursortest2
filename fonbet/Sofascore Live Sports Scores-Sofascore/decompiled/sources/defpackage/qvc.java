package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qvc implements pvc {
    public final Context a;
    public ad2 b;
    public final xnh c = e.b(1.0f);
    public g9i d;

    public qvc(Context context) {
        this.a = context;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // defpackage.pvc
    public final float m() {
        rq3 rq3Var;
        ddi ddiVar;
        if (this.d == null) {
            Context context = this.a;
            x0d x0dVar = qal.a;
            synchronized (x0dVar) {
                try {
                    Object g = x0dVar.g(context);
                    rq3Var = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        g62 g2 = ml4.g(-1, 6, null);
                        g = un0.K(new pog(new ts2(contentResolver, uriFor, new p84(g2, o1j.u(Looper.getMainLooper())), g2, context, (rq3) null)), s9a.k(), new uci(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        x0dVar.m(context, g);
                    }
                    ddiVar = (ddi) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.i(((Number) ddiVar.getValue()).floatValue());
            ad2 ad2Var = this.b;
            if (ad2Var == null) {
                a70.r("MotionDurationScale scale factor requested before recomposer loop start");
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            this.d = xw3.L(ad2Var, null, null, new gjb(ddiVar, this, rq3Var, 12), 3);
        }
        return this.c.h();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }
}
