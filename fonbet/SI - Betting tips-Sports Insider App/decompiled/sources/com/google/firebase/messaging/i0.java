package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final h9.c f6141a;

    public i0(h9.c cVar) {
        this.f6141a = cVar;
    }

    public final void a(j0 j0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        h.access$000((h) this.f6141a.f10430b, j0Var.f6145a).b(new o.a(1), new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(8, j0Var));
    }
}
