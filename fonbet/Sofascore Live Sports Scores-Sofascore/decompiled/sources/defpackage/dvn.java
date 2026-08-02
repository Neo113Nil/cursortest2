package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzebx;
import com.google.android.gms.internal.ads.zzebz;
import com.google.android.gms.internal.ads.zzecb;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dvn implements zzecb {
    public final Context a;
    public final zzbri b;
    public final uun c;
    public final dvn d = this;
    public final zzinv e;

    public dvn(uun uunVar, Context context, zzbri zzbriVar) {
        this.c = uunVar;
        this.a = context;
        this.b = zzbriVar;
        this.e = zzinv.a(new zzebz(zzinx.a(this), new zzebx(zzinx.a(zzbriVar))));
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final qpn zzc() {
        return new qpn(this.c, this.d);
    }
}
