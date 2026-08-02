package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzpg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m1p {
    public final String a;
    public final long b;

    public m1p(zzpg zzpgVar, String str) {
        this.a = str;
        ((DefaultClock) zzpgVar.f()).getClass();
        this.b = SystemClock.elapsedRealtime();
    }
}
