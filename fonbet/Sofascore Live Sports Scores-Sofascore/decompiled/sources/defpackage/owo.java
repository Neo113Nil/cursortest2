package defpackage;

import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzqm;
import com.ironsource.Ua;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class owo implements tmi {
    public final /* synthetic */ int a;
    public final /* synthetic */ tmi b;

    public /* synthetic */ owo(tmi tmiVar, int i) {
        this.a = i;
        this.b = tmiVar;
    }

    @Override // defpackage.tmi
    public final Object get() {
        int i = this.a;
        tmi tmiVar = this.b;
        switch (i) {
            case 0:
                Object obj = zzlk.j;
                return (zzqm) ((kvd) tmiVar.get()).i();
            default:
                lvc lvcVar = (lvc) tmiVar.get();
                lvcVar.getClass();
                v1k v1kVar = new v1k(msg.h);
                return new jvc(v1kVar, lvcVar.b.schedule(v1kVar, Ua.s, TimeUnit.MILLISECONDS));
        }
    }
}
