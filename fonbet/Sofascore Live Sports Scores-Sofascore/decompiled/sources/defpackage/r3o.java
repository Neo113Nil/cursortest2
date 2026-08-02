package defpackage;

import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3o implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcbv b;

    public /* synthetic */ r3o(zzcbv zzcbvVar, int i) {
        this.a = i;
        this.b = zzcbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ddb zza(Object obj) {
        int i = this.a;
        zzcbv zzcbvVar = this.b;
        InputStream inputStream = (InputStream) obj;
        switch (i) {
            case 0:
                return zzhcy.a(new zzehq(inputStream, zzcbvVar));
            case 1:
                return zzhcy.a(new zzehq(inputStream, zzcbvVar));
            default:
                zzcbvVar.j = new String(zzham.a(inputStream), StandardCharsets.UTF_8);
                return zzhcy.a(zzcbvVar);
        }
    }
}
