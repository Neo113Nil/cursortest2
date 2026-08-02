package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzcij;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzno;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ysn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcix b;

    public /* synthetic */ ysn(zzcix zzcixVar, int i) {
        this.a = i;
        this.b = zzcixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcix zzcixVar = this.b;
        switch (i) {
            case 0:
                zzcht zzchtVar = zzcixVar.g;
                if (zzchtVar != null) {
                    zzchtVar.f();
                    break;
                }
                break;
            case 1:
                zzcht zzchtVar2 = zzcixVar.g;
                if (zzchtVar2 != null) {
                    zzchtVar2.m();
                    break;
                }
                break;
            case 2:
                zzcht zzchtVar3 = zzcixVar.g;
                if (zzchtVar3 != null) {
                    zzchtVar3.i();
                    break;
                }
                break;
            case 3:
                zzcht zzchtVar4 = zzcixVar.g;
                if (zzchtVar4 != null) {
                    zzchtVar4.g();
                    break;
                }
                break;
            case 4:
                zzcht zzchtVar5 = zzcixVar.g;
                if (zzchtVar5 != null) {
                    zzchtVar5.h();
                    break;
                }
                break;
            case 5:
                zzcht zzchtVar6 = zzcixVar.g;
                if (zzchtVar6 != null) {
                    zzchtVar6.e();
                    break;
                }
                break;
            case 6:
                zzcht zzchtVar7 = zzcixVar.g;
                if (zzchtVar7 != null) {
                    zzchtVar7.k();
                    break;
                }
                break;
            default:
                zzcij zzcijVar = zzcixVar.b;
                boolean z = zzcijVar.e;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f2 = z ? 0.0f : zzcijVar.f;
                if (zzcijVar.c) {
                    f = f2;
                }
                zzcku zzckuVar = zzcixVar.i;
                if (zzckuVar == null) {
                    int i2 = zze.zza;
                    zzo.zzi("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        zzno zznoVar = zzckuVar.i;
                        if (zznoVar != null) {
                            zznoVar.c.b();
                            zznoVar.b.b(f);
                            break;
                        }
                    } catch (IOException e) {
                        int i3 = zze.zza;
                        zzo.zzj("", e);
                        return;
                    }
                }
                break;
        }
    }
}
