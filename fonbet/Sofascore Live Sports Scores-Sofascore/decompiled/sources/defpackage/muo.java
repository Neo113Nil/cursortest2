package defpackage;

import android.app.ActivityManager;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zziv;
import com.google.android.gms.internal.consent_sdk.zzpa;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzqs;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpg;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class muo implements cj0, wcn, p9p, dfp {
    public final /* synthetic */ int a;
    public final Object b;

    public muo(zzpv zzpvVar) {
        this.a = 4;
        Charset charset = zzqs.a;
        this.b = zzpvVar;
        zzpvVar.a = this;
    }

    @Override // defpackage.dfp
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((dfp[]) this.b)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dfp
    public zfp b(Class cls) {
        for (int i = 0; i < 2; i++) {
            dfp dfpVar = ((dfp[]) this.b)[i];
            if (dfpVar.a(cls)) {
                return dfpVar.b(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.p9p
    public void c(int i, zziv zzivVar, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, zzivVar.i, j, i2);
    }

    @Override // defpackage.cj0
    public ddb call() {
        v1k v1kVar = new v1k((Callable) this.b);
        f35.a.execute(v1kVar);
        return v1kVar;
    }

    @Override // defpackage.p9p
    public void d(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.p9p
    public void e(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void f(String str, Bundle bundle, String str2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zzlj zzljVar = (zzlj) obj;
                if (!TextUtils.isEmpty(str)) {
                    a70.r("Unexpected call on client side");
                    break;
                } else {
                    zzljVar.U("auto", bundle, "_err");
                    break;
                }
            default:
                zzpg zzpgVar = (zzpg) obj;
                if (!TextUtils.isEmpty(str)) {
                    zzpgVar.d().Z(new n2(this, str, str2, bundle, 18));
                    break;
                } else {
                    zzic zzicVar = zzpgVar.l;
                    if (zzicVar != null) {
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.g.b(str2, "AppId not known when logging event");
                        break;
                    }
                }
                break;
        }
    }

    public void h(long j, long j2) {
        zzoc zzocVar = (zzoc) this.b;
        zzocVar.Q();
        zzocVar.U();
        zzic zzicVar = (zzic) zzocVar.b;
        lmo lmoVar = zzicVar.e;
        zzic.k(lmoVar);
        if (lmoVar.Z(j)) {
            zzic.k(lmoVar);
            lmoVar.m.b(true);
            zzicVar.q().V();
        }
        zzic.k(lmoVar);
        lmoVar.q.b(j);
        if (lmoVar.m.a()) {
            i(j, j2);
        }
    }

    public void i(long j, long j2) {
        zzoc zzocVar = (zzoc) this.b;
        zzocVar.Q();
        zzic zzicVar = (zzic) zzocVar.b;
        if (zzicVar.c()) {
            lmo lmoVar = zzicVar.e;
            zzic.k(lmoVar);
            lmoVar.q.b(j);
            zzicVar.k.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.b0(j, valueOf, "auto", "_sid");
            zzic.k(lmoVar);
            lmoVar.r.b(j3);
            lmoVar.m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            zzic.l(zzljVar);
            zzljVar.Y(j, j2, bundle, "auto", "_s");
            String a = lmoVar.w.a();
            if (TextUtils.isEmpty(a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a);
            zzic.l(zzljVar);
            zzljVar.Y(j, j2, bundle2, "auto", "_ssr");
        }
    }

    public void j(int i, Object obj, g5p g5pVar) {
        zzpv zzpvVar = (zzpv) this.b;
        zzpa zzpaVar = (zzpa) obj;
        zzpvVar.v(i, 2);
        zzpvVar.x(zzpaVar.c(g5pVar));
        g5pVar.e(zzpaVar, this);
    }

    @Override // defpackage.p9p
    /* renamed from: zza, reason: collision with other method in class */
    public void mo905zza() {
        long j;
        switch (this.a) {
            case 2:
                zzoc zzocVar = (zzoc) this.b;
                zzocVar.Q();
                zzic zzicVar = (zzic) zzocVar.b;
                lmo lmoVar = zzicVar.e;
                zzic.k(lmoVar);
                DefaultClock defaultClock = zzicVar.k;
                defaultClock.getClass();
                if (lmoVar.Z(System.currentTimeMillis())) {
                    lmo lmoVar2 = zzicVar.e;
                    zzic.k(lmoVar2);
                    lmoVar2.m.b(true);
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.o.a("Detected application was in foreground");
                        defaultClock.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (zzicVar.d.b0(null, zzfy.e1)) {
                            defaultClock.getClass();
                            j = SystemClock.elapsedRealtime();
                        } else {
                            j = 0;
                        }
                        i(currentTimeMillis, j);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ muo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void g() {
    }

    @Override // defpackage.p9p
    public void zze() {
    }

    @Override // defpackage.p9p
    public void zzf() {
    }

    @Override // defpackage.p9p
    public void zzg() {
    }

    @Override // defpackage.wcn
    public Object zza() {
        return new h6p(((qc4) ((mxn) this.b).b).b);
    }
}
