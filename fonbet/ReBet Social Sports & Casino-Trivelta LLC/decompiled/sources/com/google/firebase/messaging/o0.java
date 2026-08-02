package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r0;
import x2.ExecutorC6789k;

/* loaded from: classes3.dex */
public class o0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final a f38009a;

    public interface a {
        Task a(Intent intent);
    }

    public o0(a aVar) {
        this.f38009a = aVar;
    }

    public void b(final r0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        this.f38009a.a(aVar.f38022a).addOnCompleteListener(new ExecutorC6789k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.n0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                r0.a.this.d();
            }
        });
    }
}
