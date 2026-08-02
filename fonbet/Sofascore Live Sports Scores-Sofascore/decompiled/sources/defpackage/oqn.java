package defpackage;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oqn extends zzbny {
    public final /* synthetic */ zzbzg a;

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void l3(zzbnm zzbnmVar) {
        zzbzh zzbzhVar;
        zzbzg zzbzgVar = this.a;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = zzbzgVar.a;
        synchronized (zzbzgVar) {
            zzbzhVar = zzbzgVar.c;
            if (zzbzhVar == null) {
                zzbzhVar = new zzbzh(zzbnmVar);
                zzbzgVar.c = zzbzhVar;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzbzhVar);
    }
}
