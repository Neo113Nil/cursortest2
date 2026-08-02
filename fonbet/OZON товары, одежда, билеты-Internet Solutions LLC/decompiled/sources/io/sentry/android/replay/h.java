package io.sentry.android.replay;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class h<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return Vc.a.b(Long.valueOf(((k) t2).c()), Long.valueOf(((k) t11).c()));
    }
}
