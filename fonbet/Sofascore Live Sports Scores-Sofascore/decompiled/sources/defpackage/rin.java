package defpackage;

import com.google.android.gms.internal.ads.zzapj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rin implements Comparable {
    public final int a;
    public final zzapj b;

    public rin(int i, zzapj zzapjVar) {
        this.a = i;
        this.b = zzapjVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((rin) obj).a);
    }
}
