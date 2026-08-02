package io.sentry.android.replay;

import io.sentry.android.core.f0;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16070a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f16071b = new io.sentry.util.a();

    /* renamed from: c, reason: collision with root package name */
    public final f0 f16072c = new f0(1, this);

    /* renamed from: d, reason: collision with root package name */
    public final r f16073d = new r(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16070a.set(true);
        this.f16072c.clear();
    }
}
