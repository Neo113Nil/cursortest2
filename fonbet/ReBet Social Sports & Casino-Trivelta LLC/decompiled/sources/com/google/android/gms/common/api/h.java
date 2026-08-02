package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class h {

    public interface a {
        void a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract l await(long j10, TimeUnit timeUnit);
}
