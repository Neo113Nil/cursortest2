package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import x2.ExecutorC6789k;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3507n {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f38004c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static r0 f38005d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38006a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f38007b = new ExecutorC6789k();

    public C3507n(Context context) {
        this.f38006a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z10, Task task) {
        return (K9.n.e() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z10).continueWith(new ExecutorC6789k(), new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer valueOf;
                valueOf = Integer.valueOf(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHLIP);
                return valueOf;
            }
        }) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static Task e(Context context, Intent intent, boolean z10) {
        Log.isLoggable("FirebaseMessaging", 3);
        r0 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.d(intent).continueWith(new ExecutorC6789k(), new Continuation() { // from class: com.google.firebase.messaging.m
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return C3507n.c(task);
                }
            });
        }
        if (b0.b().e(context)) {
            m0.e(context, f10, intent);
        } else {
            f10.d(intent);
        }
        return Tasks.forResult(-1);
    }

    public static r0 f(Context context, String str) {
        r0 r0Var;
        synchronized (f38004c) {
            try {
                if (f38005d == null) {
                    f38005d = new r0(context, str);
                }
                r0Var = f38005d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0Var;
    }

    public Task g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f38006a, intent);
    }

    public Task h(final Context context, final Intent intent) {
        boolean z10 = K9.n.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(this.f38007b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(b0.b().g(context, intent));
                return valueOf;
            }
        }).continueWithTask(this.f38007b, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C3507n.a(context, intent, z11, task);
            }
        }) : e(context, intent, z11);
    }
}
