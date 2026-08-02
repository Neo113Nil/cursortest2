package com.google.firebase.iid;

import D9.AbstractC1133a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3507n;
import com.google.firebase.messaging.M;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1133a {
    public static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // D9.AbstractC1133a
    public int b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new C3507n(context).g(cloudMessage.g()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
        }
    }

    @Override // D9.AbstractC1133a
    public void c(Context context, Bundle bundle) {
        Intent f10 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (M.E(f10)) {
            M.v(f10);
        }
    }
}
