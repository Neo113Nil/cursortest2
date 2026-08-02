package defpackage;

import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class two implements Runnable {
    public final /* synthetic */ zzlu a;
    public final /* synthetic */ zzlu b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzmb e;

    public two(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j, boolean z) {
        this.a = zzluVar;
        this.b = zzluVar2;
        this.c = j;
        this.d = z;
        this.e = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.W(this.a, this.b, this.c, this.d, null);
    }
}
