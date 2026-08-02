package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.C5132a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f59617a;

    /* renamed from: b, reason: collision with root package name */
    private final C5132a f59618b = new C5132a();

    J(ExecutorService executorService) {
        this.f59617a = executorService;
    }

    public static /* synthetic */ void a(J j11, String str, Task task) {
        synchronized (j11) {
            j11.f59618b.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized Task b(final String str, r rVar) {
        Task onSuccessTask;
        Task task = (Task) this.f59618b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        onSuccessTask = r6.f59601d.b().onSuccessTask(r6.f59605h, new SuccessContinuation() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.a(FirebaseMessaging.this, r2, r3, (String) obj);
            }
        });
        Task continueWithTask = onSuccessTask.continueWithTask(this.f59617a, new Continuation() { // from class: com.google.firebase.messaging.I
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                J.a(J.this, str, task2);
                return task2;
            }
        });
        this.f59618b.put(str, continueWithTask);
        return continueWithTask;
    }
}
