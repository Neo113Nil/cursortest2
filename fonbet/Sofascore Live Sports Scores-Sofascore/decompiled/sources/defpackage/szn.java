package defpackage;

import com.google.android.gms.internal.ads.zzcyo;
import com.google.android.gms.internal.ads.zzdrb;
import com.google.android.gms.internal.ads.zzemq;
import com.google.android.gms.internal.ads.zzemr;
import com.google.android.gms.internal.ads.zzeow;
import com.google.android.gms.internal.ads.zzinv;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class szn implements zzcyo {
    public final Map a;
    public final Map b;
    public final Map c;
    public final zzinv d;
    public final zzdrb e;

    public szn(Map map, Map map2, Map map3, zzinv zzinvVar, zzdrb zzdrbVar) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = zzinvVar;
        this.e = zzdrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final zzemq a(int i, String str) {
        zzemq a;
        zzemq zzemqVar = (zzemq) this.a.get(str);
        if (zzemqVar != null) {
            return zzemqVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzeow zzeowVar = (zzeow) this.c.get(str);
            if (zzeowVar != null) {
                return new zzemr(zzeowVar, ahn.g);
            }
            a = (zzemq) this.b.get(str);
            if (a == null) {
                return null;
            }
        } else if (this.e.d == null || (a = ((zzcyo) this.d.zzb()).a(i, str)) == null) {
            return null;
        }
        return new zzemr(a, ahn.f);
    }
}
