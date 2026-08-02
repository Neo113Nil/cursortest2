package io.sentry.android.replay;

import hf0.AbstractC6947b;
import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67575a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f67575a) {
            case 0:
                return Vc.a.b(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            default:
                ((AbstractC6947b) ((Pair) obj).e()).getClass();
                ((AbstractC6947b) ((Pair) obj2).e()).getClass();
                return Vc.a.b(null, null);
        }
    }
}
