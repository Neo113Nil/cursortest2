package defpackage;

import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzx;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ueo implements zzgub {
    public static final /* synthetic */ ueo b = new ueo(0);
    public static final /* synthetic */ ueo c = new ueo(1);
    public static final /* synthetic */ ueo d = new ueo(2);
    public static final /* synthetic */ ueo e = new ueo(3);
    public static final /* synthetic */ ueo f = new ueo(4);
    public static final /* synthetic */ ueo g = new ueo(5);
    public final /* synthetic */ int a;

    public /* synthetic */ ueo(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return zeo.a(5);
            case 2:
                zzx zzxVar = (zzx) obj;
                int i = zzv.R;
                String str = zzxVar.a;
                String str2 = zzxVar.b;
                return wt3.m(str, ": ", new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str2);
            case 3:
                zzagh zzaghVar = (zzagh) obj;
                zzaghVar.getClass();
                return zzaghVar.getClass().getSimpleName();
            case 4:
                return zzgxm.x(zzgym.b(((zzxm) obj).zzn().b, g));
            default:
                zzzr zzzrVar = zzzr.d;
                return Integer.valueOf(((zzbg) obj).c);
        }
    }
}
