package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcsl;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class awn implements zzcsl {
    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        if (!((Boolean) zzba.zzc().a(zzbjg.ac)).booleanValue() || hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzt.zzh().g().zzy(Boolean.parseBoolean(str));
    }
}
