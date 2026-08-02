package defpackage;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d99 {
    public static final e5f b = new e5f("fire-global");
    public static final e5f c = new e5f("fire-count");
    public static final e5f d = new e5f("last-used-date");
    public final jda a;

    public d99(Context context, String str) {
        this.a = new jda(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static e5f c(p0d p0dVar, String str) {
        for (Map.Entry entry : p0dVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((e5f) entry.getKey()).a;
                        str2.getClass();
                        return new e5f(str2);
                    }
                }
            }
        }
        return null;
    }

    public static void d(p0d p0dVar, String str) {
        e5f c2 = c(p0dVar, str);
        if (c2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) kda.B(p0dVar, c2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            p0dVar.d(c2);
        } else {
            p0dVar.f(c2, hashSet);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b2 = b(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) td4.t0(g.a, new d17(this.a, null, 29))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new iu0(((e5f) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new yz(currentTimeMillis, 27));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(e5f e5fVar, long j) {
        if (b(((Long) this.a.b(e5fVar, -1L)).longValue()).equals(b(j))) {
            return false;
        }
        return true;
    }
}
