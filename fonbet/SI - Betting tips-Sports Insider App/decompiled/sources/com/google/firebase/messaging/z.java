package com.google.firebase.messaging;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6190a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Context f6191b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6192c;

    public /* synthetic */ z() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        a0 a0Var = (a0) this.f6192c;
        if (a0Var != null) {
            Context context = a0Var.f6091c.f6063b;
            this.f6191b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f6190a) {
            case 0:
                a0 a0Var = (a0) this.f6192c;
                if (a0Var != null && a0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    a0 a0Var2 = (a0) this.f6192c;
                    a0Var2.f6091c.getClass();
                    FirebaseMessaging.b(a0Var2, 0L);
                    Context context2 = this.f6191b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f6192c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    l1.a aVar = (l1.a) this.f6192c;
                    e6.n nVar = (e6.n) ((g8.a) aVar.f19315c).f9887c;
                    nVar.f8729c.set(null);
                    com.google.android.gms.internal.measurement.h0 h0Var = nVar.f8733g.f8705n;
                    h0Var.sendMessage(h0Var.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) aVar.f19314b;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context3 = this.f6191b;
                            if (context3 != null) {
                                context3.unregisterReceiver(this);
                            }
                            this.f6191b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public z(l1.a aVar) {
        this.f6192c = aVar;
    }
}
