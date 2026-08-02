package org.maplibre.android.utils;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f79998a;

    public static void a(@NonNull String str) {
        Boolean bool = f79998a;
        if (bool == null) {
            throw new IllegalStateException("ThreadUtils isn't correctly initialised");
        }
        if (bool.booleanValue() && Looper.myLooper() != Looper.getMainLooper()) {
            throw new Wf.a(str.concat(" interactions should happen on the UI thread."));
        }
    }

    public static void b(@NonNull Context context) {
        f79998a = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
    }
}
