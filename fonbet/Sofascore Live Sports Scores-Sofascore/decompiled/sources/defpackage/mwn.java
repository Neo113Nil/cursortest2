package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzcut;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mwn implements zzbqh {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcut b;

    public /* synthetic */ mwn(zzcut zzcutVar, int i) {
        this.a = i;
        this.b = zzcutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        int i = this.a;
        zzcut zzcutVar = this.b;
        switch (i) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(zzcutVar.a)) {
                        zzcutVar.c.execute(new fsn(this, 11));
                        break;
                    }
                }
                break;
            default:
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(zzcutVar.a)) {
                        zzcutVar.c.execute(new fsn(this, 12));
                        break;
                    }
                }
                break;
        }
    }
}
