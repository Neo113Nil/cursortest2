package defpackage;

import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzlj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uuo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzjl b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzlj e;

    public /* synthetic */ uuo(zzlj zzljVar, zzjl zzjlVar, long j, boolean z, int i) {
        this.a = i;
        this.b = zzjlVar;
        this.c = j;
        this.d = z;
        this.e = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.d;
        zzjl zzjlVar = this.b;
        zzlj zzljVar = this.e;
        switch (i) {
            case 0:
                zzljVar.q0(zzjlVar);
                zzljVar.g0(zzjlVar, j, z);
                break;
            default:
                zzljVar.q0(zzjlVar);
                zzljVar.g0(zzjlVar, j, z);
                break;
        }
    }
}
