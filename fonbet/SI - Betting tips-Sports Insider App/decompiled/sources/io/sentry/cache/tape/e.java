package io.sentry.cache.tape;

import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e implements Iterable, Closeable {
    public abstract void c(Object obj);

    public void clear() {
        t(size());
    }

    public abstract int size();

    public abstract void t(int i5);
}
