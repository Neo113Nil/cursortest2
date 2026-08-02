package com.vk.instantjobs.services;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: JobsForegroundServiceController.kt */
/* loaded from: classes.dex */
public final class a {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final CopyOnWriteArrayList<InterfaceC1189a> b = new CopyOnWriteArrayList<>();

    /* compiled from: JobsForegroundServiceController.kt */
    /* renamed from: com.vk.instantjobs.services.a$a, reason: collision with other inner class name */
    public interface InterfaceC1189a {
        void a(boolean z);
    }
}
