package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import d3.AbstractC6069a;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes9.dex */
public abstract class GCoreWakefulBroadcastReceiver extends AbstractC6069a {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return AbstractC6069a.completeWakefulIntent(intent);
    }
}
