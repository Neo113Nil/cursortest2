package com.vk.push.core.utils;

import java.util.concurrent.Executors;
import kotlin.Result;
import xsna.bdn;
import xsna.j3q;
import xsna.kq9;
import xsna.ovj;

/* compiled from: CoroutineExtensions.kt */
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt {
    public static final ovj getSingleThread(bdn bdnVar) {
        return new j3q(Executors.newSingleThreadExecutor());
    }

    public static final synchronized <T> void safeResume(kq9<? super T> kq9Var, T t) {
        synchronized (CoroutineExtensionsKt.class) {
            if (kq9Var.isActive()) {
                kq9Var.resumeWith(t);
            }
        }
    }

    public static final synchronized <T> void safeResumeWithException(kq9<? super T> kq9Var, Throwable th) {
        synchronized (CoroutineExtensionsKt.class) {
            if (kq9Var.isActive()) {
                kq9Var.resumeWith(new Result.Failure(th));
            }
        }
    }
}
