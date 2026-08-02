package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzg;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c0 extends zzg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c f32684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(AbstractC3179c abstractC3179c, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC3179c);
        this.f32684a = abstractC3179c;
    }

    public static final void a(Message message) {
        d0 d0Var = (d0) message.obj;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC3179c abstractC3179c = this.f32684a;
        if (abstractC3179c.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !abstractC3179c.enableLocalFallback()) || message.what == 5)) && !abstractC3179c.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            abstractC3179c.zzn(new ConnectionResult(message.arg2));
            if (abstractC3179c.zzg() && !abstractC3179c.zzo()) {
                abstractC3179c.zzd(3, null);
                return;
            }
            ConnectionResult zzm = abstractC3179c.zzm() != null ? abstractC3179c.zzm() : new ConnectionResult(8);
            abstractC3179c.zzc.a(zzm);
            abstractC3179c.onConnectionFailed(zzm);
            return;
        }
        if (i11 == 5) {
            ConnectionResult zzm2 = abstractC3179c.zzm() != null ? abstractC3179c.zzm() : new ConnectionResult(8);
            abstractC3179c.zzc.a(zzm2);
            abstractC3179c.onConnectionFailed(zzm2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC3179c.zzc.a(connectionResult);
            abstractC3179c.onConnectionFailed(connectionResult);
            return;
        }
        if (i11 == 6) {
            abstractC3179c.zzd(5, null);
            if (abstractC3179c.zzk() != null) {
                abstractC3179c.zzk().i(message.arg2);
            }
            abstractC3179c.onConnectionSuspended(message.arg2);
            abstractC3179c.zze(5, 1, null);
            return;
        }
        if (i11 == 2 && !abstractC3179c.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((d0) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
