package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import androidx.core.app.n;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvideNotificationManagerFactory implements e<n> {
    public static n provideNotificationManager(Context context) {
        n provideNotificationManager = OzonPushModule.INSTANCE.provideNotificationManager(context);
        j.d(provideNotificationManager);
        return provideNotificationManager;
    }
}
