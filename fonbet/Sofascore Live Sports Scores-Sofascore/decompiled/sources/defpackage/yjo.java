package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yjo implements wcn, RemoteCall, zzdu {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ yjo(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
        sto stoVar = new sto((zzkk) this.a, (ListenerHolder) this.c);
        String str = (String) this.b;
        Parcel S1 = zzktVar.S1();
        S1.writeString(str);
        zzbn.c(S1, stoVar);
        zzktVar.Z1(S1, 28);
    }

    @Override // defpackage.wcn
    public Object zza() {
        return new zao((t3p) ((wcn) this.a).zza(), (rqn) ((wcn) this.b).zza(), ((qc4) ((mxn) this.c).b).b);
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzxz) obj).k(0, ((zzxy) this.a).a, (zzxf) this.b, (zzxk) this.c);
    }
}
