package defpackage;

import android.app.Application;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class etl {
    public static final a b = new a(null);
    public final Application a = BlazeSDK.INSTANCE.getApplication$blazesdk_release();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static yq4 a(k4m k4mVar) {
        int ordinal = k4mVar.b.ordinal();
        if (ordinal == 0) {
            vq4 vq4Var = new vq4();
            vq4Var.b(2000, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2000, 2000);
            vq4Var.c();
            return vq4Var.a();
        }
        if (ordinal == 1) {
            vq4 vq4Var2 = new vq4();
            vq4Var2.b(2000, 60000, 1000, 2000);
            vq4Var2.c();
            z1a.E(!vq4Var2.o);
            yq4.a(1000, 0, "backBufferDurationMs", "0");
            vq4Var2.m = 1000;
            vq4Var2.n = true;
            return vq4Var2.a();
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        vq4 vq4Var3 = new vq4();
        vq4Var3.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 60000, TTAdConstant.STYLE_SIZE_RADIO_3_2, 2500);
        vq4Var3.c();
        z1a.E(!vq4Var3.o);
        yq4.a(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION, 0, "backBufferDurationMs", "0");
        vq4Var3.m = UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION;
        vq4Var3.n = true;
        return vq4Var3.a();
    }

    public final BlazeVideoManager b(k4m k4mVar, ExoPlayer exoPlayer, iz2 iz2Var) {
        try {
            if (exoPlayer != null) {
                return new BlazeVideoManager(exoPlayer, iz2Var);
            }
            Application application = this.a;
            if (application == null) {
                return null;
            }
            yq4 a2 = a(k4mVar);
            wf6 wf6Var = new wf6(application);
            d0h d0hVar = k4mVar.c;
            z1a.E(!wf6Var.p);
            d0hVar.getClass();
            wf6Var.i = d0hVar;
            z1a.E(!wf6Var.p);
            wf6Var.e = new uf6(a2, 0);
            z1a.E(!wf6Var.p);
            wf6Var.h = true;
            z1a.E(!wf6Var.p);
            wf6Var.l = 100L;
            z1a.E(!wf6Var.p);
            wf6Var.k = 100L;
            zr4 zr4Var = new zr4(application);
            zr4Var.c = true;
            z1a.E(!wf6Var.p);
            wf6Var.b = new uf6(zr4Var, 2);
            vg6 a3 = wf6Var.a();
            if (k4mVar.a) {
                a3.setRepeatMode(1);
            } else {
                a3.j0();
                if (!a3.Q) {
                    a3.Q = true;
                    a3.l.h.b(23, 1, 0).b();
                }
            }
            return new BlazeVideoManager(a3, iz2Var);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
    }
}
