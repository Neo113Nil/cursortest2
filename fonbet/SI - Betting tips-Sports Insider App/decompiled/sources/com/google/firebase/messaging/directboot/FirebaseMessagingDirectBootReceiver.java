package com.google.firebase.messaging.directboot;

import android.content.Context;
import b6.a;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.l;
import io.sentry.android.core.w0;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class FirebaseMessagingDirectBootReceiver extends a {
    @Override // b6.a
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) d5.a(new l(context).b(cloudMessage.f4437a))).intValue();
        } catch (InterruptedException | ExecutionException e7) {
            w0.e("FCM", "Failed to send message to service.", e7);
            return 500;
        }
    }
}
