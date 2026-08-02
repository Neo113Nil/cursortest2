package defpackage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x5o extends f5o {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ gt7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5o(gt7 gt7Var, Activity activity, int i) {
        super((zzez) gt7Var.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity;
                this.g = gt7Var;
                super((zzez) gt7Var.b, true);
                break;
            case 2:
                this.f = activity;
                this.g = gt7Var;
                super((zzez) gt7Var.b, true);
                break;
            case 3:
                this.f = activity;
                this.g = gt7Var;
                super((zzez) gt7Var.b, true);
                break;
            case 4:
                this.f = activity;
                this.g = gt7Var;
                super((zzez) gt7Var.b, true);
                break;
            default:
                this.f = activity;
                this.g = gt7Var;
                break;
        }
    }

    @Override // defpackage.f5o
    public final void a() {
        switch (this.e) {
            case 0:
                zzcp zzcpVar = ((zzez) this.g.b).g;
                Preconditions.i(zzcpVar);
                zzcpVar.onActivityStartedByScionActivityInfo(zzdd.Y0(this.f), this.b);
                break;
            case 1:
                zzcp zzcpVar2 = ((zzez) this.g.b).g;
                Preconditions.i(zzcpVar2);
                zzcpVar2.onActivityResumedByScionActivityInfo(zzdd.Y0(this.f), this.b);
                break;
            case 2:
                zzcp zzcpVar3 = ((zzez) this.g.b).g;
                Preconditions.i(zzcpVar3);
                zzcpVar3.onActivityPausedByScionActivityInfo(zzdd.Y0(this.f), this.b);
                break;
            case 3:
                zzcp zzcpVar4 = ((zzez) this.g.b).g;
                Preconditions.i(zzcpVar4);
                zzcpVar4.onActivityStoppedByScionActivityInfo(zzdd.Y0(this.f), this.b);
                break;
            default:
                zzcp zzcpVar5 = ((zzez) this.g.b).g;
                Preconditions.i(zzcpVar5);
                zzcpVar5.onActivityDestroyedByScionActivityInfo(zzdd.Y0(this.f), this.b);
                break;
        }
    }
}
