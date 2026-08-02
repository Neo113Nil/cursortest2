package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfm;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h7o {
    public Object a;
    public int b;
    public int c;
    public long d;
    public boolean e;
    public long f;
    public final /* synthetic */ zzfd g;

    public h7o(zzfd zzfdVar) {
        this.g = zzfdVar;
    }

    public final void a() {
        zzfd zzfdVar = this.g;
        cwo cwoVar = zzfdVar.a;
        zzea zzeaVar = zzfdVar.e;
        if (!cwoVar.a()) {
            if (this.e) {
                zzeaVar.d(2);
            }
            this.e = false;
            return;
        }
        zzbf zzq = cwoVar.zzq();
        Object f = zzq.g() ? null : zzq.f(cwoVar.q());
        int w = cwoVar.w();
        int x = cwoVar.x();
        long s = cwoVar.s();
        if (f != null && w == -1) {
            zzq.o(f, zzfdVar.d);
            s -= zzfm.t(0L);
            w = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e && Objects.equals(f, this.a) && w == this.b && x == this.c && s == this.d) {
            if (elapsedRealtime - this.f >= 2147483647L) {
                zzfdVar.c.g(new zzfe(2, Integer.MAX_VALUE));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.a = f;
        this.b = w;
        this.c = x;
        this.d = s;
        zzeaVar.d(2);
        zzeaVar.e(2, Integer.MAX_VALUE);
    }
}
