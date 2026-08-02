package com.google.android.play.agesignals;

import android.content.Context;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes8.dex */
public class AgeSignalsManagerFactory {
    private AgeSignalsManagerFactory() {
    }

    public static AgeSignalsManager create(Context context) {
        return new zzb(new zzg(context));
    }
}
