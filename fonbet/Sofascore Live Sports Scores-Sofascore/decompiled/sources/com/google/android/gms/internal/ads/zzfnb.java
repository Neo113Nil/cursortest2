package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfnb {
    public static Task a;
    public static AppSetIdClient b;
    public static final Object c = new Object();

    public static void a(Context context, boolean z) {
        synchronized (c) {
            try {
                if (b == null) {
                    b = AppSet.getClient(context);
                }
                Task task = a;
                if (task == null || ((task.isComplete() && !a.isSuccessful()) || (z && a.isComplete()))) {
                    try {
                        AppSetIdClient appSetIdClient = b;
                        Preconditions.j(appSetIdClient, "the appSetIdClient shouldn't be null");
                        a = appSetIdClient.getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31);
                        sb.append("Failed to get app set ID info: ");
                        sb.append(message);
                        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                        a = Tasks.forException(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
