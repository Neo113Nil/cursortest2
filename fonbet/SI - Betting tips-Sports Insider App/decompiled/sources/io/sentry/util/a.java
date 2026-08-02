package io.sentry.util;

import io.sentry.r;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    public final r a() {
        lock();
        return new r(1, this);
    }
}
