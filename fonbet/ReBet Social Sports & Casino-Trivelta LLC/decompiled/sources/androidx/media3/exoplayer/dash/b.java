package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.I;
import e1.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p1.C6032b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21013a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f21014b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f21015c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f21016d;

    public b() {
        this(new Random());
    }

    public static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) Z.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    public static int d(C6032b c6032b, C6032b c6032b2) {
        int compare = Integer.compare(c6032b.f62898c, c6032b2.f62898c);
        return compare != 0 ? compare : c6032b.f62897b.compareTo(c6032b2.f62897b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((C6032b) list.get(i10)).f62898c));
        }
        return hashSet.size();
    }

    public static void h(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final List c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f21013a);
        h(elapsedRealtime, this.f21014b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6032b c6032b = (C6032b) list.get(i10);
            if (!this.f21013a.containsKey(c6032b.f62897b) && !this.f21014b.containsKey(Integer.valueOf(c6032b.f62898c))) {
                arrayList.add(c6032b);
            }
        }
        return arrayList;
    }

    public void e(C6032b c6032b, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(c6032b.f62897b, elapsedRealtime, this.f21013a);
        int i10 = c6032b.f62898c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f21014b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(((C6032b) c10.get(i10)).f62898c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f21013a.clear();
        this.f21014b.clear();
        this.f21015c.clear();
    }

    public C6032b j(List list) {
        List c10 = c(list);
        if (c10.size() < 2) {
            return (C6032b) I.e(c10, null);
        }
        Collections.sort(c10, new Comparator() { // from class: androidx.media3.exoplayer.dash.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d10;
                d10 = b.d((C6032b) obj, (C6032b) obj2);
                return d10;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((C6032b) c10.get(0)).f62898c;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            C6032b c6032b = (C6032b) c10.get(i11);
            if (i10 == c6032b.f62898c) {
                arrayList.add(new Pair(c6032b.f62897b, Integer.valueOf(c6032b.f62899d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (C6032b) c10.get(0);
            }
        }
        C6032b c6032b2 = (C6032b) this.f21015c.get(arrayList);
        if (c6032b2 != null) {
            return c6032b2;
        }
        C6032b k10 = k(c10.subList(0, arrayList.size()));
        this.f21015c.put(arrayList, k10);
        return k10;
    }

    public final C6032b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((C6032b) list.get(i11)).f62899d;
        }
        int nextInt = this.f21016d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C6032b c6032b = (C6032b) list.get(i13);
            i12 += c6032b.f62899d;
            if (nextInt < i12) {
                return c6032b;
            }
        }
        return (C6032b) I.f(list);
    }

    public b(Random random) {
        this.f21015c = new HashMap();
        this.f21016d = random;
        this.f21013a = new HashMap();
        this.f21014b = new HashMap();
    }
}
