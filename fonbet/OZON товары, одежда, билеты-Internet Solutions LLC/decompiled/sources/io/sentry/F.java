package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final /* synthetic */ class F implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return InetAddress.getLocalHost();
    }
}
