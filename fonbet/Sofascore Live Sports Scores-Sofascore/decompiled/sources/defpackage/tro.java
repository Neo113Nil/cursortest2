package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.internal.zzak;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class tro implements RemoteCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzn b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ tro(zzn zznVar, String[] strArr, int i) {
        this.a = i;
        this.b = zznVar;
        this.c = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        int i = this.a;
        String[] strArr = this.c;
        zzn zznVar = this.b;
        zzo zzoVar = (zzo) anyClient;
        switch (i) {
            case 0:
                cbo cboVar = new cbo(zznVar, taskCompletionSource);
                zzak zzakVar = (zzak) zzoVar.getService();
                zzoVar.getContext();
                ApiMetadata a = zzff.a();
                Parcel J = zzakVar.J();
                zzc.c(J, cboVar);
                J.writeStringArray(strArr);
                zzc.b(J, a);
                zzakVar.l2(J, 5);
                break;
            case 1:
                cbo cboVar2 = new cbo(zznVar, taskCompletionSource, 1);
                zzak zzakVar2 = (zzak) zzoVar.getService();
                zzoVar.getContext();
                ApiMetadata a2 = zzff.a();
                Parcel J2 = zzakVar2.J();
                zzc.c(J2, cboVar2);
                J2.writeStringArray(strArr);
                zzc.b(J2, a2);
                zzakVar2.l2(J2, 6);
                break;
            default:
                cbo cboVar3 = new cbo(zznVar, taskCompletionSource, 2);
                zzak zzakVar3 = (zzak) zzoVar.getService();
                zzoVar.getContext();
                ApiMetadata a3 = zzff.a();
                Parcel J3 = zzakVar3.J();
                zzc.c(J3, cboVar3);
                J3.writeStringArray(strArr);
                zzc.b(J3, a3);
                zzakVar3.l2(J3, 7);
                break;
        }
    }
}
