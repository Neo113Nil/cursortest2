package com.my.tracker;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.l;
import com.my.tracker.obfuscated.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MyTrackerParams {
    final List a = new ArrayList();
    final Object b = new Object();
    volatile b3 c = b3.j;
    final Map d = new ConcurrentHashMap();
    volatile String e = null;
    volatile String f = null;
    volatile String g = null;
    volatile String h = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes14.dex */
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Map e;

        public a(String str, String str2, String str3, String str4, Map map) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = new HashMap(map);
        }
    }

    private static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    private static String b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public int getAge() {
        return this.c.a;
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return (String) this.d.get(str.toLowerCase(Locale.ROOT));
    }

    @Nullable
    public String getCustomUserId() {
        return b(this.c.g);
    }

    @Nullable
    public String[] getCustomUserIds() {
        return a(this.c.g);
    }

    @Nullable
    public String getEmail() {
        return b(this.c.e);
    }

    @Nullable
    public String[] getEmails() {
        return a(this.c.e);
    }

    public int getGender() {
        return this.c.b;
    }

    @Nullable
    public String getIcqId() {
        return b(this.c.f);
    }

    @Nullable
    public String[] getIcqIds() {
        return a(this.c.f);
    }

    @Nullable
    public String getLang() {
        return this.e;
    }

    @Nullable
    public String getMrgsAppId() {
        return this.f;
    }

    @Nullable
    public String getMrgsId() {
        return this.h;
    }

    @Nullable
    public String getMrgsUserId() {
        return this.g;
    }

    @Nullable
    public String getOkId() {
        return b(this.c.c);
    }

    @Nullable
    public String[] getOkIds() {
        return a(this.c.c);
    }

    @Nullable
    public String getPhone() {
        return b(this.c.h);
    }

    @Nullable
    public String[] getPhones() {
        return a(this.c.h);
    }

    @Nullable
    public String getVkConnectId() {
        return b(this.c.i);
    }

    @Nullable
    public String[] getVkConnectIds() {
        return a(this.c.i);
    }

    @Nullable
    public String getVkId() {
        return b(this.c.d);
    }

    @Nullable
    public String[] getVkIds() {
        return a(this.c.d);
    }

    @NonNull
    public MyTrackerParams setAge(int i) {
        synchronized (this.b) {
            try {
                if (this.c.a != i) {
                    b3 b3Var = new b3(i, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setCustomParam(@NonNull String str, @Nullable String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            this.d.remove(lowerCase);
            return this;
        }
        this.d.put(lowerCase, str2);
        return this;
    }

    @NonNull
    public MyTrackerParams setCustomUserId(@Nullable String str) {
        return setCustomUserIds(a(str));
    }

    @NonNull
    public MyTrackerParams setCustomUserIds(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.g, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, a2, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setEmail(@Nullable String str) {
        return setEmails(a(str));
    }

    @NonNull
    public MyTrackerParams setEmails(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.e, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, a2, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setGender(int i) {
        synchronized (this.b) {
            try {
                if (this.c.b != i) {
                    b3 b3Var = new b3(this.c.a, i, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setIcqId(@Nullable String str) {
        return setIcqIds(a(str));
    }

    @NonNull
    public MyTrackerParams setIcqIds(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.f, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, a2, this.c.g, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setLang(@Nullable String str) {
        this.e = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setMrgsAppId(@Nullable String str) {
        this.f = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setMrgsId(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setMrgsUserId(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NonNull
    public MyTrackerParams setOkId(@Nullable String str) {
        return setOkIds(a(str));
    }

    @NonNull
    public MyTrackerParams setOkIds(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.c, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, a2, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setPhone(@Nullable String str) {
        return setPhones(a(str));
    }

    @NonNull
    public MyTrackerParams setPhones(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.h, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, a2, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setVkConnectId(@Nullable String str) {
        return setVkConnectIds(a(str));
    }

    @NonNull
    public MyTrackerParams setVkConnectIds(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.i, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, a2);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @NonNull
    public MyTrackerParams setVkId(@Nullable String str) {
        return setVkIds(a(str));
    }

    @NonNull
    public MyTrackerParams setVkIds(@Nullable String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (l.a(this.c.d, strArr) != 0) {
                    b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, a2, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b3Var);
                    this.c = b3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    private static String[] a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void a(s sVar, s sVar2) {
        synchronized (this.b) {
            synchronized (this.a) {
                sVar.a(this.c);
                this.a.add(sVar2);
            }
        }
    }

    private void a(b3 b3Var) {
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(b3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a a() {
        return new a(this.f, this.g, this.h, this.e, this.d);
    }
}
