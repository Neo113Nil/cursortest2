package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kro implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ zzjd d;

    public /* synthetic */ kro(zzjd zzjdVar, zzr zzrVar, Bundle bundle, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = bundle;
        this.d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        zzr zzrVar = this.b;
        zzjd zzjdVar = this.d;
        switch (i) {
            case 0:
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                return zzpgVar.e0(bundle, zzrVar);
            default:
                zzpg zzpgVar2 = zzjdVar.a;
                zzpgVar2.W();
                return zzpgVar2.e0(bundle, zzrVar);
        }
    }
}
