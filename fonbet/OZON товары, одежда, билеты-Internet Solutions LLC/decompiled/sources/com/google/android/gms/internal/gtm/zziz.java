package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zziz {
    private final Context zza;

    public zziz(Context context) {
        this.zza = context;
    }

    public final String[] zza() throws IOException {
        return this.zza.getAssets().list("");
    }

    public final String[] zzb(String str) throws IOException {
        return this.zza.getAssets().list("containers");
    }
}
