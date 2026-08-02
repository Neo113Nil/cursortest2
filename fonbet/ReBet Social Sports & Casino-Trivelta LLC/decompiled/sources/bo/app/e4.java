package bo.app;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes.dex */
public final class e4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((id) obj).f25572b), Long.valueOf(((id) obj2).f25572b));
    }
}
