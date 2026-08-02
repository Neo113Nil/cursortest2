package defpackage;

import com.bytedance.sdk.component.utils.tsz;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzmb;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dx2 implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final /* synthetic */ Object c;

    public dx2(zzd zzdVar, long j) {
        this.a = 2;
        this.b = j;
        Objects.requireNonNull(zzdVar);
        this.c = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tsz tszVar;
        tsz tszVar2;
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                zl1 zl1Var = new zl1(3);
                ex2 ex2Var = (ex2) obj;
                ex2Var.x.x(zl1Var);
                long abs = Math.abs(j) / 1000000000;
                long abs2 = Math.abs(j) % 1000000000;
                StringBuilder sb = new StringBuilder("deadline exceeded after ");
                if (j < 0) {
                    sb.append('-');
                }
                sb.append(abs);
                Locale locale = Locale.US;
                sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
                sb.append("s. ");
                sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) ex2Var.w.a(cy2.a)) == null ? 0.0d : r2.longValue() / ex2.F)));
                sb.append(zl1Var);
                ex2Var.x.l(xei.h.b(sb.toString()));
                break;
            case 1:
                csm csmVar = (csm) obj;
                tszVar = csmVar.dax;
                if (tszVar != null) {
                    tszVar2 = csmVar.dax;
                    tszVar2.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    break;
                }
                break;
            case 2:
                ((zzd) obj).W(j);
                break;
            case 3:
                ((zzclx) obj).a.L(j, true);
                break;
            default:
                zzmb zzmbVar = (zzmb) obj;
                zzd zzdVar = ((zzic) zzmbVar.b).n;
                zzic.j(zzdVar);
                zzdVar.T(j);
                zzmbVar.f = null;
                break;
        }
    }

    public /* synthetic */ dx2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public dx2(zzmb zzmbVar, long j) {
        this.a = 4;
        this.b = j;
        Objects.requireNonNull(zzmbVar);
        this.c = zzmbVar;
    }
}
