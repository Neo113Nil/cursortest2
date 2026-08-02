package defpackage;

import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zznt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wid implements xid, zzeb {
    public final Object a;

    public /* synthetic */ wid(zznr zznrVar, Object obj, long j) {
        this.a = obj;
    }

    @Override // defpackage.xid
    public String e() {
        return lnb.p(new StringBuilder("attempted to overwrite the existing value '"), this.a, '\'');
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zznt) obj).zzo();
    }

    public wid(Object obj) {
        this.a = obj;
    }
}
