package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzdgv;
import com.google.android.gms.internal.ads.zzflo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z3o implements zzdgv {
    public final Context a;
    public final zzcer b;

    public z3o(Context context, zzcer zzcerVar) {
        this.a = context;
        this.b = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
        String str = zzfloVar.b.b.e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcer zzcerVar = this.b;
        Context context = this.a;
        zzcerVar.getClass();
        if (((Boolean) zzba.zzc().a(zzbjg.h1)).booleanValue() && zzcerVar.a(context) && zzcer.g(context)) {
            synchronized (zzcerVar.j) {
            }
        }
        zzcerVar.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
    }
}
