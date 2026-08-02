package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ue8 implements zzhcv, zzdjm, RemoteCall {
    public static final ue8 c;
    public static final ue8 d;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new ue8("FLAT", i);
        d = new ue8("HALF_OPENED", i);
    }

    public /* synthetic */ ue8(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static ue8 a(nkk nkkVar) {
        String str;
        nkkVar.F(2);
        int s = nkkVar.s();
        int i = s >> 1;
        int i2 = 1;
        int s2 = ((nkkVar.s() >> 3) & 31) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(".0");
        sb.append(i);
        return new ue8(me4.g(s2, s2 >= 10 ? "." : ".0", sb), i2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
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
        zzktVar.Z1(S1, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzt.zzh().e(this.b, th);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzdmi) obj).zze(this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
    }
}
