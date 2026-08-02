package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes9.dex */
public class TagManagerService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f57868a = 0;

    @Keep
    @KeepName
    public static void initialize(@RecentlyNonNull Context context) {
        zzbp.zze(context);
    }

    @Override // android.app.Service
    @RecentlyNonNull
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        return zzbp.zza(this);
    }
}
