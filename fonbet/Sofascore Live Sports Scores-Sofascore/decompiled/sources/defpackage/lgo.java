package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.internal.ads.zzgtl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lgo {
    public static final zzgtj c = new zzgtj("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final u53 a;
    public final String b;

    public lgo(Context context) {
        if (zzgtl.a(context)) {
            this.a = new u53(context.getApplicationContext(), c, d);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(zzgsw zzgswVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        c.c(str, new Object[0]);
        dgo dgoVar = new dgo();
        byte b = (byte) (dgoVar.e | 1);
        dgoVar.c = 0;
        dgoVar.a = 8160;
        dgoVar.e = (byte) (((byte) (b | 2)) | 1);
        zzgswVar.zza(dgoVar.a());
        return false;
    }

    public final void a(ggo ggoVar, zzgsw zzgswVar, int i) {
        u53 u53Var = this.a;
        if (u53Var == null) {
            c.c("error: %s", "Play Store not found.");
        } else if (c(zzgswVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(ggoVar.a, ggoVar.b))) {
            u53Var.g(new wjn(24, u53Var, new g6n(this, ggoVar, i, zzgswVar, 3)));
        }
    }
}
