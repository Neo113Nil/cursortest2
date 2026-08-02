package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import xsna.cv90;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public final class zzm implements x2o0 {
    public final void createWallet(c cVar, Activity activity, int i) {
        cVar.a(new zzo(this, cVar, activity, i));
    }

    @Override // xsna.x2o0
    public final cv90<x2o0.b> getActiveWalletId(c cVar) {
        return cVar.a(new zzq(this, cVar));
    }

    public final cv90<Object> getEnvironment(c cVar) {
        return cVar.a(new zzw(this, cVar));
    }

    @Override // xsna.x2o0
    public final cv90<x2o0.c> getStableHardwareId(c cVar) {
        return cVar.a(new zzt(this, cVar));
    }

    @Override // xsna.x2o0
    public final cv90<x2o0.d> getTokenStatus(c cVar, int i, String str) {
        return cVar.a(new zzp(this, cVar, i, str));
    }

    @Override // xsna.x2o0
    public final void pushTokenize(c cVar, Activity activity, PushTokenizeRequest pushTokenizeRequest, int i) {
        cVar.a(new zzu(this, cVar, activity, i, pushTokenizeRequest));
    }

    public final cv90<Status> registerDataChangedListener(c cVar, x2o0.a aVar) {
        return cVar.a(new zzl(this, cVar, cVar.i(aVar)));
    }

    public final void requestDeleteToken(c cVar, Activity activity, String str, int i, int i2) {
        cVar.a(new zzs(this, cVar, activity, i2, i, str));
    }

    public final void requestSelectToken(c cVar, Activity activity, String str, int i, int i2) {
        cVar.a(new zzr(this, cVar, activity, i2, i, str));
    }

    public final void tokenize(c cVar, Activity activity, String str, int i, String str2, int i2, int i3) {
        cVar.a(new zzn(this, cVar, activity, i3, i, str, str2, i2));
    }
}
