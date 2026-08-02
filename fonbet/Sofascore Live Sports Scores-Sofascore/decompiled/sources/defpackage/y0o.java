package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y0o extends f5o {
    public final /* synthetic */ int e;
    public final /* synthetic */ zzcm f;
    public final /* synthetic */ zzez g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0o(zzez zzezVar, zzcm zzcmVar, int i) {
        super(zzezVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            case 2:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            case 3:
            case 4:
            default:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                break;
            case 5:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
        }
    }

    @Override // defpackage.f5o
    public final void a() {
        switch (this.e) {
            case 0:
                zzcp zzcpVar = this.g.g;
                Preconditions.i(zzcpVar);
                zzcpVar.getGmpAppId(this.f);
                break;
            case 1:
                zzcp zzcpVar2 = this.g.g;
                Preconditions.i(zzcpVar2);
                zzcpVar2.getCachedAppInstanceId(this.f);
                break;
            case 2:
                zzcp zzcpVar3 = this.g.g;
                Preconditions.i(zzcpVar3);
                zzcpVar3.generateEventId(this.f);
                break;
            case 3:
                zzcp zzcpVar4 = this.g.g;
                Preconditions.i(zzcpVar4);
                zzcpVar4.getCurrentScreenName(this.f);
                break;
            case 4:
                zzcp zzcpVar5 = this.g.g;
                Preconditions.i(zzcpVar5);
                zzcpVar5.getCurrentScreenClass(this.f);
                break;
            default:
                zzcp zzcpVar6 = this.g.g;
                Preconditions.i(zzcpVar6);
                zzcpVar6.getAppInstanceId(this.f);
                break;
        }
    }

    @Override // defpackage.f5o
    public final void b() {
        int i = this.e;
        zzcm zzcmVar = this.f;
        switch (i) {
            case 0:
                zzcmVar.F(null);
                break;
            case 1:
                zzcmVar.F(null);
                break;
            case 2:
                zzcmVar.F(null);
                break;
            case 3:
                zzcmVar.F(null);
                break;
            case 4:
                zzcmVar.F(null);
                break;
            default:
                zzcmVar.F(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0o(zzez zzezVar, zzcm zzcmVar, int i, boolean z) {
        super(zzezVar, true);
        this.e = i;
        this.f = zzcmVar;
        this.g = zzezVar;
    }
}
