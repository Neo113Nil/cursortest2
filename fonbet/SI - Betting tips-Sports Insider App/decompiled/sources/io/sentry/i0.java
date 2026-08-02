package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16488a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16488a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return new ArrayList();
            case 2:
                return io.sentry.android.core.internal.util.f.f15714c.a();
            default:
                return null;
        }
    }
}
