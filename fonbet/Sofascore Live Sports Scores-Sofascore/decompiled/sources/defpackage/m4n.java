package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzaa;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.cast.zzad;
import com.google.android.gms.internal.cast.zzae;
import com.google.android.gms.internal.cast.zzj;
import com.google.android.gms.internal.cast.zzt;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m4n {
    public static final Logger v = new Logger("SessionFlowSummary", null);
    public static final String w = "22.2.0";
    public static long x = System.currentTimeMillis();
    public final zzj f;
    public final String g;
    public final long h;
    public final long i;
    public CastSession j;
    public String k;
    public String l;
    public zzt m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public int u;
    public final nsa a = new nsa(5);
    public final List b = w1l.n();
    public final List c = w1l.n();
    public final List d = w1l.n();
    public final Map e = Collections.synchronizedMap(new HashMap());
    public int t = 0;

    public m4n(zzj zzjVar, String str) {
        this.f = zzjVar;
        this.g = str;
        DefaultClock.a.getClass();
        this.h = System.currentTimeMillis();
        long j = x;
        x = 1 + j;
        this.i = j;
    }

    public final void a(CastSession castSession) {
        if (castSession == null) {
            b(2);
            return;
        }
        CastDevice j = castSession.j();
        if (j == null) {
            b(3);
            return;
        }
        this.j = castSession;
        String str = this.l;
        String str2 = j.l;
        if (str != null) {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            b(5);
            return;
        }
        this.l = str2;
        this.n = j.e;
        this.t = j.a1();
        zzaa Z0 = j.Z0();
        if (Z0 != null) {
            this.o = Z0.d;
            this.p = Z0.e;
            this.q = Z0.f;
            this.r = Z0.g;
            this.s = Z0.h;
        }
        castSession.i();
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        zzae zzaeVar = (zzae) map.get(valueOf);
        if (zzaeVar == null) {
            zzae zzaeVar2 = new zzae(new zzad(i));
            zzaeVar2.c = this.h;
            map.put(valueOf, zzaeVar2);
        } else {
            zzaeVar.d.incrementAndGet();
            DefaultClock.a.getClass();
            zzaeVar.b = System.currentTimeMillis();
        }
    }
}
