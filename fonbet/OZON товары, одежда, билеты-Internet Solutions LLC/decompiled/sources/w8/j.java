package w8;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f103627a;

    public j(Context context, String str) {
        this.f103627a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j11 = this.f103627a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f103627a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f103627a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f103627a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized String d(long j11) {
        return new Date(j11).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f103627a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void g(String str) {
        try {
            String e11 = e(str);
            if (e11 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f103627a.getStringSet(e11, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f103627a.edit().remove(e11).commit();
            } else {
                this.f103627a.edit().putStringSet(e11, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void j(String str, String str2) {
        g(str2);
        HashSet hashSet = new HashSet(this.f103627a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f103627a.edit().putStringSet(str, hashSet).commit();
    }

    final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f103627a.edit();
            int i11 = 0;
            for (Map.Entry<String, ?> entry : this.f103627a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d11 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d11)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d11);
                        i11++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i11 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i11);
            }
            edit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f103627a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(k.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f103627a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    final synchronized void f() {
        String d11 = d(System.currentTimeMillis());
        this.f103627a.edit().putString("last-used-date", d11).commit();
        g(d11);
    }

    final synchronized boolean h(long j11) {
        if (!this.f103627a.contains("fire-global")) {
            this.f103627a.edit().putLong("fire-global", j11).commit();
            return true;
        }
        long j12 = this.f103627a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j12).equals(d(j11))) {
                return false;
            }
            this.f103627a.edit().putLong("fire-global", j11).commit();
            return true;
        }
    }

    final synchronized void i(long j11, String str) {
        String d11 = d(j11);
        if (this.f103627a.getString("last-used-date", "").equals(d11)) {
            String e11 = e(d11);
            if (e11 == null) {
                return;
            }
            if (e11.equals(str)) {
                return;
            }
            j(str, d11);
            return;
        }
        long j12 = this.f103627a.getLong("fire-count", 0L);
        if (j12 + 1 == 30) {
            a();
            j12 = this.f103627a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f103627a.getStringSet(str, new HashSet()));
        hashSet.add(d11);
        this.f103627a.edit().putStringSet(str, hashSet).putLong("fire-count", j12 + 1).putString("last-used-date", d11).commit();
    }
}
