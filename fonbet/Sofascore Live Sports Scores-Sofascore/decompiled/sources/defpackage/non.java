package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzgub;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class non implements zzgub {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ non(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                mon monVar = zzbqg.a;
                if (str2 == null) {
                    return str;
                }
                if (((Boolean) zzblg.f.c()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str).getHost();
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (!host.endsWith(strArr[i2])) {
                        }
                    }
                    return str;
                }
                String str3 = (String) zzblg.a.c();
                String str4 = (String) zzblg.b.c();
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replace(str3, str2);
                }
                if (TextUtils.isEmpty(str4)) {
                    return str;
                }
                Uri parse = Uri.parse(str);
                return TextUtils.isEmpty(parse.getQueryParameter(str4)) ? parse.buildUpon().appendQueryParameter(str4, str2).toString() : str;
            case 1:
                Throwable th = (Throwable) obj;
                mon monVar2 = zzbqg.a;
                if (((Boolean) zzblg.i.c()).booleanValue()) {
                    zzt.zzh().d("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new zzduc(str, (zzbmg) obj);
            default:
                Throwable th2 = (Throwable) obj;
                zzfcp zzfcpVar = zzfco.j;
                int i3 = zze.zza;
                zzo.zzf("Error calling adapter: ".concat(String.valueOf(str)));
                if (((Boolean) zzba.zzc().a(zzbjg.Re)).booleanValue()) {
                    zzt.zzh().e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                    return null;
                }
                zzt.zzh().d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                return null;
        }
    }
}
