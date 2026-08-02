package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wyn extends f5o {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ zzez g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyn(zzez zzezVar, Bundle bundle, int i) {
        super(zzezVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = bundle;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            default:
                this.f = bundle;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                break;
        }
    }

    @Override // defpackage.f5o
    public final void a() {
        switch (this.e) {
            case 0:
                zzcp zzcpVar = this.g.g;
                Preconditions.i(zzcpVar);
                zzcpVar.setConditionalUserProperty(this.f, this.a);
                break;
            default:
                zzcp zzcpVar2 = this.g.g;
                Preconditions.i(zzcpVar2);
                zzcpVar2.setConsentThirdParty(this.f, this.a);
                break;
        }
    }
}
