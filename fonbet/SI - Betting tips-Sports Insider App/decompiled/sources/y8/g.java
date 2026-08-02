package y8;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.measurement.d5;
import eg.c0;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oe.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g1.c f25731b = d5.C("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final g1.c f25732c = d5.C("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final g1.c f25733d;

    /* renamed from: a, reason: collision with root package name */
    public final q8.b f25734a;

    static {
        Intrinsics.checkNotNullParameter("last-used-date", "name");
        f25733d = new g1.c("last-used-date");
    }

    public g(Context context, String str) {
        this.f25734a = new q8.b(context, c1.m("FirebaseHeartBeat", str));
    }

    public final synchronized long a(g1.a aVar) {
        long j;
        try {
            long longValue = ((Long) m4.g.m(aVar, f25732c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : aVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = ((g1.c) entry.getKey()).f9707a;
                        hashSet = set;
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            g1.c key = d5.W(str);
            Intrinsics.checkNotNullParameter(key, "key");
            aVar.f(key, hashSet2);
            j = longValue - 1;
            aVar.e(f25732c, Long.valueOf(j));
        } catch (Throwable th2) {
            throw th2;
        }
        return j;
    }

    public final synchronized void b() {
        this.f25734a.a(new a2.f(26, this));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String d10 = d(System.currentTimeMillis());
            q8.b bVar = this.f25734a;
            bVar.getClass();
            for (Map.Entry entry : ((Map) c0.w(kotlin.coroutines.g.f19227a, new androidx.lifecycle.b(bVar, (Continuation) null, 21))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((g1.c) entry.getKey()).f9707a, new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized g1.c e(g1.a aVar, String str) {
        for (Map.Entry entry : aVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return d5.W(((g1.c) entry.getKey()).f9707a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j6) {
        return d(j).equals(d(j6));
    }

    public final synchronized void g() {
        this.f25734a.a(new fg.d(20, this, d(System.currentTimeMillis())));
    }

    public final synchronized void h(g1.a aVar, String str) {
        try {
            g1.c key = e(aVar, str);
            if (key == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) m4.g.m(aVar, key, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                aVar.d(key);
            } else {
                Intrinsics.checkNotNullParameter(key, "key");
                aVar.f(key, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean i(long j) {
        return j(f25731b, j);
    }

    public final synchronized boolean j(g1.c key, long j) {
        q8.b bVar = this.f25734a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Continuation continuation = null;
        j jVar = new j(bVar, key, continuation, 14);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
        if (f(((Long) c0.w(gVar, jVar)).longValue(), j)) {
            return false;
        }
        q8.b bVar2 = this.f25734a;
        Long valueOf = Long.valueOf(j);
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return true;
    }

    public final synchronized void k(long j, String str) {
        try {
            try {
                String d10 = d(j);
                g1.c W = d5.W(str);
                this.f25734a.a(new b2.f(3, this, d10, str, W));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void l(long j) {
        this.f25734a.a(new hg.j(j, 2));
    }
}
