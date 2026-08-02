package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzfuo;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.location.ActivityTransition;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v4n implements Comparator {
    public static final /* synthetic */ v4n b = new v4n(0);
    public static final /* synthetic */ v4n c = new v4n(1);
    public static final /* synthetic */ v4n d = new v4n(2);
    public static final /* synthetic */ v4n e = new v4n(3);
    public static final /* synthetic */ v4n f = new v4n(5);
    public static final /* synthetic */ v4n g = new v4n(6);
    public static final /* synthetic */ v4n h = new v4n(8);
    public static final /* synthetic */ v4n i = new v4n(9);
    public static final /* synthetic */ v4n j = new v4n(10);
    public static final /* synthetic */ v4n k = new v4n(11);
    public static final /* synthetic */ v4n l = new v4n(12);
    public static final /* synthetic */ v4n m = new v4n(18);
    public static final /* synthetic */ v4n n = new v4n(23);
    public static final /* synthetic */ v4n o = new v4n(24);
    public static final /* synthetic */ v4n p = new v4n(26);
    public final /* synthetic */ int a;

    public /* synthetic */ v4n(int i2) {
        this.a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int i2 = 0;
        switch (this.a) {
            case 0:
                List list = (List) obj2;
                List list2 = (List) obj;
                return hio.f(o6n.b((o6n) Collections.max(list2, h), (o6n) Collections.max(list, d))).b(list2.size(), list.size()).a((o6n) Collections.max(list2, e), (o6n) Collections.max(list, f), g).e();
            case 1:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                gio gioVar = zzabc.k;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 2:
                return o6n.b((o6n) obj, (o6n) obj2);
            case 3:
                return o6n.c((o6n) obj, (o6n) obj2);
            case 4:
                int a = x5n.a(obj);
                int a2 = x5n.a(obj2);
                if (a != a2) {
                    return wt3.a(a, a2);
                }
                int C = wt3.C(a);
                if (C == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (C == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (C == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (C == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 5:
                return o6n.c((o6n) obj, (o6n) obj2);
            case 6:
                return o6n.c((o6n) obj, (o6n) obj2);
            case 7:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 8:
                return o6n.b((o6n) obj, (o6n) obj2);
            case 9:
                return Float.compare(((o8n) obj).c, ((o8n) obj2).c);
            case 10:
                return ((o8n) obj).a - ((o8n) obj2).a;
            case 11:
                return Integer.compare(((pin) obj).a.b, ((pin) obj2).a.b);
            case 12:
                return Long.compare(((zzapk) obj).b, ((zzapk) obj2).b);
            case 13:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 14:
                zzawe zzaweVar = (zzawe) obj;
                zzawe zzaweVar2 = (zzawe) obj2;
                int i3 = 0;
                while (true) {
                    length = zzaweVar.a.length;
                    if (i2 < length && i3 < zzaweVar2.a.length) {
                        int compare = Integer.compare(zzawe.f(zzaweVar.b(i2)), zzawe.f(zzaweVar2.b(i3)));
                        if (compare != 0) {
                            return compare;
                        }
                        i2++;
                        i3++;
                    }
                }
                return Integer.compare(length, zzaweVar2.a.length);
            case 15:
                zzbgo zzbgoVar = (zzbgo) obj;
                zzbgo zzbgoVar2 = (zzbgo) obj2;
                int i4 = zzbgoVar.c - zzbgoVar2.c;
                return i4 != 0 ? i4 : Long.compare(zzbgoVar.a, zzbgoVar2.a);
            case 16:
                int b2 = x5n.b(obj);
                int b3 = x5n.b(obj2);
                if (b2 != b3) {
                    return wt3.a(b2, b3);
                }
                int C2 = wt3.C(b2);
                if (C2 == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (C2 == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (C2 == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (C2 == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 17:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 18:
                zzfuo zzfuoVar = (zzfuo) obj2;
                zzfuo zzfuoVar2 = (zzfuo) obj;
                int compare2 = Double.compare(zzfuoVar.e, zzfuoVar2.e);
                return compare2 == 0 ? Long.compare(zzfuoVar2.b, zzfuoVar.b) : compare2;
            case 19:
                ActivityTransition activityTransition = (ActivityTransition) obj;
                ActivityTransition activityTransition2 = (ActivityTransition) obj2;
                Preconditions.i(activityTransition);
                Preconditions.i(activityTransition2);
                int i5 = activityTransition.a;
                int i6 = activityTransition2.a;
                if (i5 == i6) {
                    int i7 = activityTransition.b;
                    int i8 = activityTransition2.b;
                    if (i7 == i8) {
                        return 0;
                    }
                    if (i7 < i8) {
                        return -1;
                    }
                } else if (i5 < i6) {
                    return -1;
                }
                return 1;
            case 20:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 21:
                int a3 = ceo.a(obj);
                int a4 = ceo.a(obj2);
                if (a3 != a4) {
                    return wt3.a(a3, a4);
                }
                int C3 = wt3.C(a3);
                if (C3 == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (C3 == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (C3 == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (C3 == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 22:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 23:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 24:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 25:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((zzv) obj2).j - ((zzv) obj).j;
        }
    }
}
