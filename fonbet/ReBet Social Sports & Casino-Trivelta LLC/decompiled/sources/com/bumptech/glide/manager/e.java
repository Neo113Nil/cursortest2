package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.b;
import l0.AbstractC5338c;

/* loaded from: classes2.dex */
public class e implements c {
    @Override // com.bumptech.glide.manager.c
    public b a(Context context, b.a aVar) {
        boolean z10 = AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z10 ? new d(context, aVar) : new m();
    }
}
