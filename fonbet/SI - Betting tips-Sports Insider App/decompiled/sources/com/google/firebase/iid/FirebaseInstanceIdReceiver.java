package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b6.a;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.l;
import io.sentry.android.core.w0;
import java.util.concurrent.ExecutionException;
import m4.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends a {
    @Override // b6.a
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) d5.a(new l(context).b(cloudMessage.f4437a))).intValue();
        } catch (InterruptedException | ExecutionException e7) {
            w0.e("FirebaseMessaging", "Failed to send message to service.", e7);
            return 500;
        }
    }

    @Override // b6.a
    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (g.x(putExtras)) {
            g.t(putExtras.getExtras(), "_nd");
        }
    }
}
