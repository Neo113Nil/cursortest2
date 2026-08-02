package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5940v implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5941w f59742a;

    public /* synthetic */ C5940v(C5941w c5941w) {
        this.f59742a = c5941w;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        this.f59742a.getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
