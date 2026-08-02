package defpackage;

import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzeqf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xtn implements zzcni {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcgn b;

    public /* synthetic */ xtn(zzcgn zzcgnVar, int i) {
        this.a = i;
        this.b = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public final void zza(boolean z, int i, String str, String str2) {
        int i2 = this.a;
        zzcgn zzcgnVar = this.b;
        switch (i2) {
            case 0:
                zzcgnVar.b();
                break;
            case 1:
                zzcgnVar.b();
                break;
            default:
                if (!z) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    fn0.s(i, "Image Web View failed to load. Error code: ", ", Description: ", str, sb);
                    zzcgnVar.zzd(new zzeqf(1, mz1.o(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    zzcgnVar.b();
                    break;
                }
        }
    }
}
