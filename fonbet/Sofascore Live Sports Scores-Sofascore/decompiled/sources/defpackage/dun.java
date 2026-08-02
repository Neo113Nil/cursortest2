package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzdsm;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dun implements zzbqh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dun(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void a(Object obj, Map map) {
        switch (this.a) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("height");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(str);
                        n nVar = (n) this.b;
                        synchronized (nVar) {
                            try {
                                if (nVar.H != parseInt) {
                                    nVar.H = parseInt;
                                    nVar.requestLayout();
                                }
                            } finally {
                            }
                        }
                        return;
                    } catch (Exception e) {
                        int i = zze.zza;
                        zzo.zzj("Exception occurred while getting webview content height", e);
                        return;
                    }
                }
                return;
            default:
                ((zzdsm) this.b).b.d(map);
                return;
        }
    }
}
