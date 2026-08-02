package ub;

import L0.f;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.measurement.internal.W6;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final f.a f66253b = L0.i.f("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final f.a f66254c = L0.i.f("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final f.a f66255d = L0.i.g("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.datastorage.c f66256a;

    public u(Context context, String str) {
        this.f66256a = new com.google.firebase.datastorage.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ Unit a(long j10, L0.c cVar) {
        cVar.k(f66253b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit b(u uVar, String str, String str2, f.a aVar, L0.c cVar) {
        uVar.getClass();
        f.a aVar2 = f66255d;
        if (((String) com.google.firebase.datastorage.d.a(cVar, aVar2, "")).equals(str)) {
            f.a i10 = uVar.i(cVar, str);
            if (i10 == null || i10.a().equals(str2)) {
                return null;
            }
            uVar.q(cVar, aVar, str);
            return null;
        }
        f.a aVar3 = f66254c;
        long longValue = ((Long) com.google.firebase.datastorage.d.a(cVar, aVar3, 0L)).longValue();
        if (longValue + 1 == 30) {
            longValue = uVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) com.google.firebase.datastorage.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.k(aVar, hashSet);
        cVar.k(aVar3, Long.valueOf(longValue + 1));
        cVar.k(aVar2, str);
        return null;
    }

    public static /* synthetic */ Unit c(u uVar, L0.c cVar) {
        Set a10;
        uVar.getClass();
        long j10 = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a aVar = (f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String h10 = uVar.h(System.currentTimeMillis());
                if (set.contains(h10)) {
                    a10 = W6.a(new Object[]{h10});
                    cVar.k(aVar, a10);
                    j10++;
                } else {
                    cVar.j(aVar);
                }
            }
        }
        if (j10 == 0) {
            cVar.j(f66254c);
            return null;
        }
        cVar.k(f66254c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(u uVar, String str, L0.c cVar) {
        uVar.getClass();
        cVar.k(f66255d, str);
        uVar.l(cVar, str);
        return null;
    }

    public final synchronized long e(L0.c cVar) {
        long j10;
        try {
            long longValue = ((Long) com.google.firebase.datastorage.d.a(cVar, f66254c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = ((f.a) entry.getKey()).a();
                        hashSet = set;
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            cVar.k(L0.i.h(str), hashSet2);
            j10 = longValue - 1;
            cVar.k(f66254c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public synchronized void f() {
        this.f66256a.g(new Function1() { // from class: ub.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.c(u.this, (L0.c) obj);
            }
        });
    }

    public synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String h10 = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f66256a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(h10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(v.a(((f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String h(long j10) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
        }
        instant = new Date(j10).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    public final synchronized f.a i(L0.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return L0.i.h(((f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    public synchronized void k() {
        final String h10 = h(System.currentTimeMillis());
        this.f66256a.g(new Function1() { // from class: ub.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.d(u.this, h10, (L0.c) obj);
            }
        });
    }

    public final synchronized void l(L0.c cVar, String str) {
        try {
            f.a i10 = i(cVar, str);
            if (i10 == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) com.google.firebase.datastorage.d.a(cVar, i10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.j(i10);
            } else {
                cVar.k(i10, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean m(long j10) {
        return n(f66253b, j10);
    }

    public synchronized boolean n(f.a aVar, long j10) {
        if (j(((Long) this.f66256a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f66256a.k(aVar, Long.valueOf(j10));
        return true;
    }

    public synchronized void o(long j10, final String str) {
        final String h10 = h(j10);
        final f.a h11 = L0.i.h(str);
        this.f66256a.g(new Function1() { // from class: ub.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.b(u.this, h10, str, h11, (L0.c) obj);
            }
        });
    }

    public synchronized void p(final long j10) {
        this.f66256a.g(new Function1() { // from class: ub.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.a(j10, (L0.c) obj);
            }
        });
    }

    public final synchronized void q(L0.c cVar, f.a aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) com.google.firebase.datastorage.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.k(aVar, hashSet);
    }
}
