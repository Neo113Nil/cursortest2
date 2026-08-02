package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzceh;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcey;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class urn extends zzces {
    public final Clock b;
    public final zzinv c;
    public final zzinv d;
    public final zzinv e;

    public urn(Context context, Clock clock, zzj zzjVar, zzcer zzcerVar) {
        this.b = clock;
        zzinx a = zzinx.a(context);
        zzinx a2 = zzinx.a(zzjVar);
        this.c = zzinv.a(new zzceh(a, a2));
        zzinx a3 = zzinx.a(clock);
        zzinv a4 = zzinv.a(new zzcej(a3, a2, zzinx.a(zzcerVar)));
        this.d = a4;
        this.e = zzinv.a(new zzcey(a, new zzcel(a4, a3)));
    }

    @Override // com.google.android.gms.internal.ads.zzces
    public final zzcek a() {
        return new zzcek(this.b, (trn) this.d.zzb());
    }
}
