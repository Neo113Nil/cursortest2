package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ihe implements zzhcv, RemoteCall {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ ihe(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return mz1.o(new StringBuilder("Phase('"), this.b, "')");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        int i = zzkk.l;
        juo juoVar = new juo(taskCompletionSource);
        zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
        Parcel S1 = zzktVar.S1();
        zzbn.c(S1, juoVar);
        S1.writeString(this.b);
        S1.writeString("");
        S1.writeString(null);
        zzktVar.Z1(S1, 11);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzt.zzh().d(this.b, th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
    }
}
