package com.bumptech.glide.util;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f30143a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f30144b = new b();

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.w(runnable);
        }
    }

    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f30144b;
    }

    public static Executor b() {
        return f30143a;
    }
}
