package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes9.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, Intent intent, int i11) {
        return new zad(intent, activity, i11);
    }

    public static zag zac(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, Intent intent, int i11) {
        return new zae(intent, componentCallbacksC5392m, i11);
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment, Intent intent, int i11) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException e11) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e11);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
