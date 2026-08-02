package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.view.q0;
import androidx.core.view.z0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.ActivityTransition;
import g6.v;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i f1246b = new i(17);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f1247c = new i(19);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1248a;

    public /* synthetic */ i(int i5) {
        this.f1248a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1248a) {
            case 0:
                WeakHashMap weakHashMap = z0.f1413a;
                float g10 = q0.g((View) obj);
                float g11 = q0.g((View) obj2);
                if (g10 > g11) {
                    return -1;
                }
                return g10 < g11 ? 1 : 0;
            case 1:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 2:
                return ((c3.c) obj).f3520b - ((c3.c) obj2).f3520b;
            case 3:
                return jf.a.a(Integer.valueOf(((v4.d) obj2).b()), Integer.valueOf(((v4.d) obj).b()));
            case 4:
                ((v4.c) obj2).getClass();
                ((v4.c) obj).getClass();
                return jf.a.a(0, 0);
            case 5:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 6:
                return jf.a.a(Long.valueOf(((ja.c) obj2).f18389b * 1000), Long.valueOf(((ja.c) obj).f18389b * 1000));
            case 7:
                return jf.a.a(Long.valueOf(((io.sentry.android.replay.k) obj).f16062b), Long.valueOf(((io.sentry.android.replay.k) obj2).f16062b));
            case 8:
                return jf.a.a(Long.valueOf(((io.sentry.rrweb.b) obj).f17005b), Long.valueOf(((io.sentry.rrweb.b) obj2).f17005b));
            case 9:
                return jf.a.a(Long.valueOf(((io.sentry.rrweb.b) obj).f17005b), Long.valueOf(((io.sentry.rrweb.b) obj2).f17005b));
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 11:
                return jf.a.a(Long.valueOf(((ka.a) obj2).f18947c * 1000), Long.valueOf(((ka.a) obj).f18947c * 1000));
            case 12:
                return jf.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 13:
                return jf.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 14:
                return jf.a.a(((p2.h) obj).f21476a, ((p2.h) obj2).f21476a);
            case 15:
                return jf.a.a(((p2.j) obj).f21488a, ((p2.j) obj2).f21488a);
            case 16:
                ActivityTransition activityTransition = (ActivityTransition) obj;
                ActivityTransition activityTransition2 = (ActivityTransition) obj2;
                v.h(activityTransition);
                v.h(activityTransition2);
                int i5 = activityTransition.f5671a;
                int i10 = activityTransition2.f5671a;
                if (i5 == i10) {
                    int i11 = activityTransition.f5672b;
                    int i12 = activityTransition2.f5672b;
                    if (i11 == i12) {
                        return 0;
                    }
                    if (i11 >= i12) {
                        return 1;
                    }
                } else if (i5 >= i10) {
                    return 1;
                }
                return -1;
            case 17:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 18:
                return ((v.g) obj).f24369b - ((v.g) obj2).f24369b;
            case 19:
                return ((Scope) obj).f4460b.compareTo(((Scope) obj2).f4460b);
            case 20:
                return ((Scope) obj).f4460b.compareTo(((Scope) obj2).f4460b);
            default:
                return jf.a.a(Integer.valueOf(((nc.a) obj).getId()), Integer.valueOf(((nc.a) obj2).getId()));
        }
    }
}
