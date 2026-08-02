package io.sentry.android.replay.capture;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class t<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return Vc.a.b(Long.valueOf(((io.sentry.rrweb.b) t2).e()), Long.valueOf(((io.sentry.rrweb.b) t11).e()));
    }
}
