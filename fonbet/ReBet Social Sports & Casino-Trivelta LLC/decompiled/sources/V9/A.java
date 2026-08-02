package V9;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class A implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        AbstractC3191o.m(activityTransition);
        AbstractC3191o.m(activityTransition2);
        int g10 = activityTransition.g();
        int g11 = activityTransition2.g();
        if (g10 != g11) {
            return g10 >= g11 ? 1 : -1;
        }
        int h10 = activityTransition.h();
        int h11 = activityTransition2.h();
        if (h10 == h11) {
            return 0;
        }
        return h10 < h11 ? -1 : 1;
    }
}
