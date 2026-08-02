package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.android.gms.internal.ads.zzacr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fxh implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public fxh(zzacr zzacrVar, Runnable runnable) {
        this.a = 1;
        this.b = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                dwd dwdVar = hu4.j;
                ((hu4) obj).e();
                break;
        }
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                dwd dwdVar = hu4.j;
                ((hu4) obj).e();
                break;
        }
    }

    public /* synthetic */ fxh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
