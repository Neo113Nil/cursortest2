package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzans;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzdek;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhx;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.ads.zzxb;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w00 implements nf8, zzgvc, zzdjm {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ w00(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 2:
                return zzcj.a(context);
            default:
                int i2 = zzjw.l;
                new zzagd();
                new zzhx(context);
                new zzans();
                zzxb zzxbVar = new zzxb();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.clear();
                hashMap2.clear();
                return zzxbVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzdek) obj).M(this.b);
    }
}
