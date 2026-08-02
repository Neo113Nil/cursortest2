package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import z.C6900a;

/* loaded from: classes3.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f37900a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37901b = new C6900a();

    public interface a {
        Task start();
    }

    public Z(Executor executor) {
        this.f37900a = executor;
    }

    public static /* synthetic */ Task a(Z z10, String str, Task task) {
        synchronized (z10) {
            z10.f37901b.remove(str);
        }
        return task;
    }

    public synchronized Task b(final String str, a aVar) {
        Task task = (Task) this.f37901b.get(str);
        if (task != null) {
            Log.isLoggable("FirebaseMessaging", 3);
            return task;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Task continueWithTask = aVar.start().continueWithTask(this.f37900a, new Continuation() { // from class: com.google.firebase.messaging.Y
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Z.a(Z.this, str, task2);
            }
        });
        this.f37901b.put(str, continueWithTask);
        return continueWithTask;
    }
}
