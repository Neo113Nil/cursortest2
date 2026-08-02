package com.vk.libnative;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: NativeCore.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class NativeCore {
    public static final NativeCore a = new NativeCore();
    public static final ReentrantLock b;
    public static final Condition c;

    @Keep
    public static volatile Context context;
    public static final AtomicBoolean d;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        c = reentrantLock.newCondition();
        d = new AtomicBoolean(false);
    }
}
