package defpackage;

import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.zzyf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ecp extends zzyf {
    public final /* synthetic */ int b;

    public /* synthetic */ ecp(int i) {
        this.b = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzyf
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new h();
            case 1:
                return new i();
            case 2:
                return new cep();
            default:
                return new j();
        }
    }
}
