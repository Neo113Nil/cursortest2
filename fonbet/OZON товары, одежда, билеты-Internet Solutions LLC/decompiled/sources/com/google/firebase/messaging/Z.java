package com.google.firebase.messaging;

import C2.ExecutorC2715j;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.AbstractServiceC5929j;
import com.google.firebase.messaging.c0;

/* loaded from: classes.dex */
final class Z extends Binder {

    /* renamed from: e, reason: collision with root package name */
    private final AbstractServiceC5929j.a f59677e;

    Z(AbstractServiceC5929j.a aVar) {
        this.f59677e = aVar;
    }

    final void a(final c0.a aVar) {
        Task processIntent;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        processIntent = AbstractServiceC5929j.this.processIntent(aVar.f59706a);
        processIntent.addOnCompleteListener(new ExecutorC2715j(), new OnCompleteListener() { // from class: com.google.firebase.messaging.Y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                c0.a.this.b();
            }
        });
    }
}
