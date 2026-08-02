package com.appsonair.appsync.services;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/appsonair/appsync/services/Debounce;", "", "()V", "DEBOUNCE_DELAY_MS", "", "currentTime", "handler", "Landroid/os/Handler;", "lastCallTime", "debounce", "", "action", "Lkotlin/Function0;", "appSync_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Debounce {
    private static final long DEBOUNCE_DELAY_MS = 300;
    private static long currentTime;
    private static long lastCallTime;

    @NotNull
    public static final Debounce INSTANCE = new Debounce();

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    private Debounce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: debounce$lambda-0, reason: not valid java name */
    public static final void m62debounce$lambda0(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
        lastCallTime = System.currentTimeMillis();
    }

    public final void debounce(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        long currentTimeMillis = System.currentTimeMillis();
        currentTime = currentTimeMillis;
        if (currentTimeMillis - lastCallTime > DEBOUNCE_DELAY_MS) {
            Handler handler2 = handler;
            handler2.removeCallbacksAndMessages(null);
            handler2.postDelayed(new Runnable() { // from class: com.appsonair.appsync.services.b
                @Override // java.lang.Runnable
                public final void run() {
                    Debounce.m62debounce$lambda0(Function0.this);
                }
            }, DEBOUNCE_DELAY_MS);
        }
    }
}
