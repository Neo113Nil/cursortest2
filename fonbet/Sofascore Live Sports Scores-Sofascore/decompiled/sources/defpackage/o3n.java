package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.auth.api.signin.internal.zbs;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o3n extends p3n {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void n(Api.AnyClient anyClient) {
        zbe zbeVar = (zbe) anyClient;
        zbs zbsVar = (zbs) zbeVar.getService();
        m3n m3nVar = new m3n(this, 1);
        GoogleSignInOptions googleSignInOptions = zbeVar.I;
        Parcel J = zbsVar.J();
        int i = zbc.a;
        J.writeStrongBinder(m3nVar);
        zbc.c(J, googleSignInOptions);
        zbsVar.S1(J, 103);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result e(Status status) {
        return status;
    }
}
