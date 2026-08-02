package defpackage;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kzn extends f5o {
    public final /* synthetic */ int e;
    public final /* synthetic */ zzez f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzn(zzez zzezVar, Boolean bool) {
        super(zzezVar, true);
        this.e = 0;
        this.g = bool;
        Objects.requireNonNull(zzezVar);
        this.f = zzezVar;
    }

    @Override // defpackage.f5o
    public final void a() {
        switch (this.e) {
            case 0:
                zzcp zzcpVar = this.f.g;
                Preconditions.i(zzcpVar);
                zzcpVar.setMeasurementEnabled(((Boolean) this.g).booleanValue(), this.a);
                break;
            case 1:
                zzcp zzcpVar2 = this.f.g;
                Preconditions.i(zzcpVar2);
                zzcpVar2.retrieveAndUploadBatches(new i0o(this, (jyo) this.g));
                break;
            case 2:
                zzcp zzcpVar3 = this.f.g;
                Preconditions.i(zzcpVar3);
                zzcpVar3.setSgtmDebugInfo((Intent) this.g);
                break;
            default:
                zzcp zzcpVar4 = this.f.g;
                Preconditions.i(zzcpVar4);
                zzcpVar4.registerOnMeasurementEventListener((p5o) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kzn(zzez zzezVar, Object obj, int i) {
        super(zzezVar, true);
        this.e = i;
        this.g = obj;
        this.f = zzezVar;
    }
}
