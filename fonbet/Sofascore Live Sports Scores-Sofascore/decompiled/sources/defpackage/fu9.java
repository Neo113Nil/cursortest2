package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fu9 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final eu9 j;
    public boolean k;

    public fu9(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? r13.i : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        eu9 eu9Var = new eu9(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        this.j = eu9Var;
        arrayList.add(eu9Var);
    }

    public static void a(fu9 fu9Var, ArrayList arrayList, pvh pvhVar) {
        if (fu9Var.k) {
            r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((eu9) mz1.h(fu9Var.i, 1)).j.add(new mmk("", arrayList, 0, pvhVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public final ImageVector b() {
        if (this.k) {
            r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                eu9 eu9Var = this.j;
                ImageVector imageVector = new ImageVector(this.a, this.b, this.c, this.d, this.e, new imk(eu9Var.a, eu9Var.b, eu9Var.c, eu9Var.d, eu9Var.e, eu9Var.f, eu9Var.g, eu9Var.h, eu9Var.i, eu9Var.j), this.f, this.g, this.h);
                this.k = true;
                return imageVector;
            }
            if (this.k) {
                r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            eu9 eu9Var2 = (eu9) arrayList.remove(arrayList.size() - 1);
            ((eu9) mz1.h(arrayList, 1)).j.add(new imk(eu9Var2.a, eu9Var2.b, eu9Var2.c, eu9Var2.d, eu9Var2.e, eu9Var2.f, eu9Var2.g, eu9Var2.h, eu9Var2.i, eu9Var2.j));
        }
    }
}
