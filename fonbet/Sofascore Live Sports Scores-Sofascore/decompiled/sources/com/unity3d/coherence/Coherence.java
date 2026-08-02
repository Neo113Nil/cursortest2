package com.unity3d.coherence;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import defpackage.wv8;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
final class Coherence {
    public static final Set c;
    public static final Set d;
    public final Context a;
    public final SharedPreferences b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("android.provider.Settings$Global");
        hashSet.add("android.provider.Settings$Secure");
        hashSet.add("android.provider.Settings$System");
        c = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(Arrays.asList("getInt", "getString", "getFloat", "getLong"));
        d = Collections.unmodifiableSet(hashSet2);
    }

    public Coherence(Context context, SharedPreferences sharedPreferences) {
        this.a = context;
        this.b = sharedPreferences;
    }

    public static String a(String str) {
        int i;
        char charAt;
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf < indexOf) {
            return null;
        }
        String trim = str.substring(indexOf + 1, lastIndexOf).trim();
        if (trim.length() < 2 || !trim.startsWith("\"") || !trim.endsWith("\"")) {
            return null;
        }
        String h = wv8.h(1, 1, trim);
        StringBuilder sb = new StringBuilder(h.length());
        int i2 = 0;
        while (i2 < h.length()) {
            char charAt2 = h.charAt(i2);
            if (charAt2 == '\\' && (i = i2 + 1) < h.length() && ((charAt = h.charAt(i)) == '\"' || charAt == '\\')) {
                sb.append(charAt);
                i2 = i;
            } else {
                sb.append(charAt2);
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00c0, code lost:
    
        if (r14 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0102, code lost:
    
        if (r14 == null) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str) {
        int i;
        Class<?> cls;
        if (str != null && !str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                i = 1;
                if (i2 >= str.length()) {
                    break;
                }
                char charAt = str.charAt(i2);
                if (z) {
                    sb.append(charAt);
                    z = false;
                } else if (z2) {
                    if (charAt == '\\') {
                        z = true;
                    } else if (charAt == '\"') {
                        z2 = false;
                    }
                    sb.append(charAt);
                } else if (charAt == '\"') {
                    sb.append(charAt);
                    z2 = true;
                } else if (charAt == '(') {
                    i3++;
                    sb.append(charAt);
                } else if (charAt == ')') {
                    if (i3 > 0) {
                        i3--;
                    }
                    sb.append(charAt);
                } else if (charAt == '.' && i3 == 0) {
                    if (sb.length() > 0) {
                        arrayList.add(sb.toString());
                    }
                    sb.setLength(0);
                } else {
                    sb.append(charAt);
                }
                i2++;
            }
            if (sb.length() > 0) {
                arrayList.add(sb.toString());
            }
            if (!arrayList.isEmpty() && arrayList.size() <= 32) {
                String str2 = (String) arrayList.get(0);
                boolean equals = "context".equals(str2);
                Context context = this.a;
                if (equals) {
                    cls = context;
                } else if (!str2.startsWith("stickyIntent(")) {
                    int size = arrayList.size();
                    while (true) {
                        if (size < 1) {
                            cls = null;
                            i = -1;
                            break;
                        }
                        if (((String) arrayList.get(size - 1)).indexOf(40) == -1) {
                            StringBuilder sb2 = new StringBuilder();
                            for (int i4 = 0; i4 < size; i4++) {
                                if (i4 > 0) {
                                    sb2.append('.');
                                }
                                sb2.append((String) arrayList.get(i4));
                            }
                            try {
                                i = size;
                                cls = Class.forName(sb2.toString());
                                break;
                            } catch (ClassNotFoundException unused) {
                                continue;
                            }
                        }
                        size--;
                    }
                } else {
                    String a = a(str2);
                    if (a != null) {
                        try {
                            cls = context.registerReceiver(null, new IntentFilter(a));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                while (i < arrayList.size()) {
                    if (cls != null) {
                        String str3 = (String) arrayList.get(i);
                        int indexOf = str3.indexOf(40);
                        if (indexOf == -1) {
                            boolean z3 = cls instanceof Class;
                            Class<?> cls2 = z3 ? cls : cls.getClass();
                            if (z3) {
                                cls = null;
                            }
                            try {
                                try {
                                    cls = cls2.getField(str3).get(cls);
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                                }
                            } catch (NoSuchFieldException unused4) {
                                cls = cls2.getMethod(str3, null).invoke(cls, null);
                            }
                            i++;
                        } else {
                            String substring = str3.substring(0, indexOf);
                            String a2 = a(str3);
                            if (a2 != null) {
                                boolean z4 = cls instanceof Class;
                                Class<?> cls3 = z4 ? cls : cls.getClass();
                                if (z4) {
                                    cls = null;
                                }
                                cls = (cls == null && c.contains(cls3.getName()) && d.contains(substring)) ? cls3.getMethod(substring, ContentResolver.class, String.class).invoke(null, context.getContentResolver(), a2) : cls3.getMethod(substring, String.class).invoke(cls, a2);
                                i++;
                            }
                            cls = null;
                            i++;
                        }
                    }
                }
                return cls;
            }
        }
        return null;
    }

    public String generateUuid() {
        return UUID.randomUUID().toString();
    }

    public String kvGet(String str) {
        return this.b.getString(str, null);
    }

    public boolean kvSet(String str, String str2) {
        this.b.edit().putString(str, str2).apply();
        return true;
    }

    public Boolean reflectBool(String str) {
        Object b = b(str);
        if (b instanceof Boolean) {
            return (Boolean) b;
        }
        return null;
    }

    public Long reflectInt(String str) {
        Object b = b(str);
        if (b instanceof Number) {
            return Long.valueOf(((Number) b).longValue());
        }
        return null;
    }

    public String reflectString(String str) {
        Object b = b(str);
        if (b instanceof String) {
            return (String) b;
        }
        return null;
    }
}
