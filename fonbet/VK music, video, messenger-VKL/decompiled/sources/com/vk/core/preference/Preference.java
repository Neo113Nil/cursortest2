package com.vk.core.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.preference.single_pref.SinglePreferenceMigrationType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.LoopMode;
import defpackage.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.aqi;
import xsna.arm0;
import xsna.asp;
import xsna.bd00;
import xsna.bpn0;
import xsna.cqi;
import xsna.dgk;
import xsna.drm0;
import xsna.dz5;
import xsna.epx;
import xsna.gzs;
import xsna.hb8;
import xsna.im20;
import xsna.izs;
import xsna.j5g;
import xsna.jvj0;
import xsna.kvj0;
import xsna.ky6;
import xsna.m;
import xsna.n6j;
import xsna.nbr;
import xsna.nyc0;
import xsna.ov8;
import xsna.rcp;
import xsna.rxc0;
import xsna.sxc0;
import xsna.v1v;
import xsna.v2b0;
import xsna.wfl;
import xsna.y45;
import xsna.z410;
import xsna.zfl;
import xsna.zrp;

/* compiled from: Preference.kt */
/* loaded from: classes.dex */
public final class Preference {
    public static Context b;
    public static boolean e;
    public static volatile boolean k;
    public static volatile boolean l;
    public static volatile boolean m;
    public static final Preference a = new Preference();
    public static gzs<? extends ExecutorService> c = new aqi(5);
    public static final bpn0 d = new bpn0(new wfl(2));
    public static String f = "";
    public static izs<? super String, Boolean> g = new rxc0(0);
    public static int h = 9999;
    public static final sxc0 i = sxc0.a;
    public static final bpn0 j = new bpn0(new hb8(7));
    public static final ReentrantLock n = new ReentrantLock(true);
    public static final ReentrantReadWriteLock o = new ReentrantReadWriteLock(true);
    public static final bpn0 p = new bpn0(new y45(8));
    public static final bpn0 q = new bpn0(new zfl(5));
    public static final bpn0 r = new bpn0(new m(8));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Preference.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Boolean;
        public static final Type Float;
        public static final Type Number;
        public static final Type NumberArray;
        public static final Type String;
        public static final Type StringSet;

        static {
            Type type = new Type("String", 0);
            String = type;
            Type type2 = new Type("Boolean", 1);
            Boolean = type2;
            Type type3 = new Type("Number", 2);
            Number = type3;
            Type type4 = new Type("NumberArray", 3);
            NumberArray = type4;
            Type type5 = new Type("StringSet", 4);
            StringSet = type5;
            Type type6 = new Type("Float", 5);
            Float = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: Preference.kt */
    public static final class a extends g<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.preference.Preference.f
        public final Object get() {
            Boolean bool = (Boolean) this.c;
            return Boolean.valueOf(this.a.getBoolean(this.b, bool != null ? bool.booleanValue() : false));
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            this.a.edit().putBoolean(this.b, ((Boolean) obj).booleanValue()).apply();
        }
    }

    /* compiled from: Preference.kt */
    public static final class b<T extends Enum<T>> extends g<T> {
        public final Class<T> d;

        public b(SharedPreferences sharedPreferences, String str, LoopMode loopMode, Class cls) {
            super(sharedPreferences, str, loopMode);
            this.d = cls;
        }

        @Override // com.vk.core.preference.Preference.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T get() {
            SharedPreferences sharedPreferences = this.a;
            String str = this.b;
            boolean contains = sharedPreferences.contains(str);
            T t = this.c;
            if (!contains) {
                return (T) t;
            }
            try {
                return (T) Enum.valueOf(this.d, sharedPreferences.getString(str, null));
            } catch (Exception e) {
                Log.e(Preference.a.getClass().getSimpleName(), "error! can't get value " + e);
                return (T) t;
            }
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            this.a.edit().putString(this.b, ((Enum) obj).name()).apply();
        }
    }

    /* compiled from: Preference.kt */
    /* loaded from: classes17.dex */
    public static final class c extends g<Float> {
        public c(SharedPreferences sharedPreferences, String str, Float f) {
            super(sharedPreferences, str, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.preference.Preference.f
        public final Object get() {
            Float f = (Float) this.c;
            return Float.valueOf(this.a.getFloat(this.b, f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            this.a.edit().putFloat(this.b, ((Float) obj).floatValue()).apply();
        }
    }

    /* compiled from: Preference.kt */
    public static final class d extends g<Long[]> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.preference.Preference.f
        public final Object get() {
            Collection collection;
            String string = this.a.getString(this.b, "");
            if (TextUtils.isEmpty(string)) {
                return (Long[]) this.c;
            }
            List a = n6j.a(0, StringUtils.COMMA, string);
            if (!a.isEmpty()) {
                ListIterator listIterator = a.listIterator(a.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            int length = strArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                lArr[i] = Long.valueOf(Long.parseLong(strArr[i]));
            }
            return lArr;
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            Long[] lArr = (Long[]) obj;
            String str = this.b;
            SharedPreferences sharedPreferences = this.a;
            if (lArr == null || lArr.length == 0) {
                sharedPreferences.edit().putString(str, "").apply();
            } else {
                sharedPreferences.edit().putString(str, TextUtils.join(StringUtils.COMMA, lArr)).apply();
            }
        }
    }

    /* compiled from: Preference.kt */
    public static final class e extends g<Long> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.preference.Preference.f
        public final Object get() {
            String str = this.b;
            SharedPreferences sharedPreferences = this.a;
            try {
                Long l = (Long) this.c;
                return Long.valueOf(sharedPreferences.getLong(str, l != null ? l.longValue() : 0L));
            } catch (Exception unused) {
                sharedPreferences.edit().remove(str).apply();
                return 0L;
            }
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            Long l = (Long) obj;
            String str = this.b;
            SharedPreferences sharedPreferences = this.a;
            try {
                sharedPreferences.edit().putLong(str, l.longValue()).apply();
            } catch (Exception unused) {
                sharedPreferences.edit().remove(str).apply();
                sharedPreferences.edit().putLong(str, l.longValue()).apply();
            }
        }
    }

    /* compiled from: Preference.kt */
    public interface f<T> {
        void a();

        T get();

        void set(T t);
    }

    /* compiled from: Preference.kt */
    public static abstract class g<T> implements f<T> {
        public final SharedPreferences a;
        public final String b;
        public final T c;

        public g(SharedPreferences sharedPreferences, String str, T t) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = t;
        }

        @Override // com.vk.core.preference.Preference.f
        public final void a() {
            T t = this.c;
            if (t == null || this.a.contains(this.b)) {
                return;
            }
            set(t);
        }
    }

    /* compiled from: Preference.kt */
    public static final class h<T> implements f<T> {
        public final g a;
        public final v2b0 b;

        public h(g gVar, v2b0 v2b0Var) {
            this.a = gVar;
            this.b = v2b0Var;
        }

        @Override // com.vk.core.preference.Preference.f
        public final void a() {
            this.a.a();
        }

        @Override // com.vk.core.preference.Preference.f
        public final T get() {
            this.b.invoke(Preference$PreferenceUsingLogger$IOType.Read);
            return this.a.get();
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(T t) {
            this.b.invoke(Preference$PreferenceUsingLogger$IOType.Write);
            this.a.set(t);
        }
    }

    /* compiled from: Preference.kt */
    public static final class i extends g<Set<? extends String>> {
        @Override // com.vk.core.preference.Preference.f
        public final Object get() {
            return this.a.getStringSet(this.b, (Set) this.c);
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            this.a.edit().putStringSet(this.b, (Set) obj).apply();
        }
    }

    /* compiled from: Preference.kt */
    public static final class j extends g<String> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.preference.Preference.f
        public final Object get() {
            return this.a.getString(this.b, (String) this.c);
        }

        @Override // com.vk.core.preference.Preference.f
        public final void set(Object obj) {
            this.a.edit().putString(this.b, (String) obj).apply();
        }
    }

    /* compiled from: Preference.kt */
    public static final /* synthetic */ class k {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.StringSet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.NumberArray.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.Float.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    public static List A(Context context, im20 im20Var) {
        ?? arrayList;
        if (m) {
            return dz5.L(new kvj0(false, SinglePreferenceMigrationType.TO_SINGLE, 0L, (Integer) null, false, 16));
        }
        List singletonList = im20Var.b ? Collections.singletonList(new bd00(context, im20Var, 1)) : Collections.singletonList(new rcp(1, context, im20Var));
        jvj0 jvj0Var = new jvj0();
        jvj0Var.a.addAll(singletonList);
        if (jvj0Var.c) {
            arrayList = Collections.singletonList(jvj0Var.b);
        } else {
            jvj0Var.c = true;
            arrayList = new ArrayList();
            Iterator it = jvj0Var.a.iterator();
            while (it.hasNext()) {
                try {
                    nyc0 nyc0Var = (nyc0) ((gzs) it.next()).invoke();
                    if (nyc0Var.a()) {
                        arrayList.add(nyc0Var.c());
                    }
                } catch (Exception e2) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{cqi.b(e2, new StringBuilder("Migration failed "))});
                    }
                    arrayList = dz5.L(new kvj0(false, SinglePreferenceMigrationType.TO_SINGLE, 0L, (Integer) null, false, 56));
                }
            }
        }
        kvj0 y = dz5.y(arrayList);
        m = y != null ? y.d : false;
        return arrayList;
    }

    public static final void B(String str) {
        SharedPreferences.Editor clear;
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType = Preference$PreferenceUsingLogger$IOType.Write;
        a.getClass();
        i.getClass();
        SharedPreferences.Editor edit = f(str).edit();
        if (edit == null || (clear = edit.clear()) == null) {
            return;
        }
        clear.apply();
    }

    public static final void C(String str, String str2) {
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType = Preference$PreferenceUsingLogger$IOType.Write;
        a.getClass();
        i.getClass();
        SharedPreferences f2 = f(str);
        if (f2.contains(str2)) {
            f2.edit().remove(str2).apply();
        }
    }

    public static final void D(izs izsVar, boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        if (!z && (edit = l().edit()) != null && (clear = edit.clear()) != null) {
            clear.apply();
        }
        new String();
        Preference preference = a;
        preference.getClass();
        Context context = b;
        if (context == null) {
            context = null;
        }
        String str = context.getApplicationInfo().packageName;
        preference.getClass();
        File[] listFiles = q().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String n2 = nbr.n(file);
                L.e("vk-preference", "remove preference " + file.getName() + " - " + n2);
                if ((n2.length() == 0 || !((Boolean) izsVar.invoke(n2)).booleanValue()) && file.isFile() && (TextUtils.isEmpty(str) || !drm0.D(file.getName(), str, false))) {
                    SharedPreferences sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) j.getValue()).get(n2);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().clear().apply();
                    }
                    file.delete();
                }
            }
        }
    }

    public static void E(long j2, boolean z) {
        if (x()) {
            D(new dgk(k0.a(j2, "-"), 3), z);
        } else {
            D(new z410(12), z);
        }
    }

    public static final void F(long j2, String str, String str2) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            long b2 = b(a);
            z(str, str2, Type.Number, null).set(Long.valueOf(j2));
            a(b2);
        } finally {
            readLock.unlock();
        }
    }

    public static final <T extends Enum<T>> void G(String str, String str2, Class<T> cls, T t) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            long b2 = b(a);
            b y = y(cls, str, str2);
            y.a.edit().putString(y.b, t.name()).apply();
            a(b2);
        } finally {
            readLock.unlock();
        }
    }

    public static final void H(String str, String str2, String str3) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            long b2 = b(a);
            z(str, str2, Type.String, null).set(str3);
            a(b2);
        } finally {
            readLock.unlock();
        }
    }

    public static final void I(String str, String str2, boolean z) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            long b2 = b(a);
            z(str, str2, Type.Boolean, null).set(Boolean.valueOf(z));
            a(b2);
        } finally {
            readLock.unlock();
        }
    }

    public static final void J(String str, String str2, Long[] lArr) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            long b2 = b(a);
            z(str, str2, Type.NumberArray, null).set(lArr);
            a(b2);
        } finally {
            readLock.unlock();
        }
    }

    public static final void K(Set set, String str, String str2) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            long b2 = b(a);
            z(str, str2, Type.StringSet, null).set(set);
            a(b2);
        } finally {
            readLock.unlock();
        }
    }

    public static void L(Preference preference, boolean z, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 4) == 0;
        preference.getClass();
        if (z && !k) {
            k = true;
            l = z2;
        }
        if (z3) {
            k = false;
            l = false;
        }
    }

    public static String M(String str, String str2) {
        return (!x() || g.invoke(str).booleanValue()) ? str : v1v.a('-', str, str2);
    }

    public static long a(long j2) {
        if (j2 < 0) {
            return -1L;
        }
        if (j2 > 0) {
            if (System.currentTimeMillis() - j2 > 64) {
                a.getClass();
            }
            return 0L;
        }
        if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            return System.currentTimeMillis();
        }
        return -1L;
    }

    public static /* synthetic */ long b(Preference preference) {
        preference.getClass();
        return a(0L);
    }

    public static h c(SharedPreferences sharedPreferences, Type type, String str, String str2, Object obj) {
        g aVar;
        switch (k.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                aVar = new a(sharedPreferences, str2, obj instanceof Boolean ? (Boolean) obj : null);
                break;
            case 2:
                aVar = new e(sharedPreferences, str2, obj instanceof Long ? (Long) obj : null);
                break;
            case 3:
                aVar = new j(sharedPreferences, str2, obj instanceof String ? (String) obj : null);
                break;
            case 4:
                aVar = new i(sharedPreferences, str2, obj instanceof Set ? (Set) obj : null);
                break;
            case 5:
                aVar = new d(sharedPreferences, str2, obj instanceof Long[] ? (Long[]) obj : null);
                break;
            case 6:
                aVar = new c(sharedPreferences, str2, obj instanceof Float ? (Float) obj : null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new h(aVar, new v2b0(str, str2));
    }

    public static final boolean d(String str, String str2, boolean z) {
        Type type = Type.Boolean;
        Boolean valueOf = Boolean.valueOf(z);
        a.getClass();
        Boolean bool = (Boolean) z(str, str2, type, valueOf).get();
        return bool != null ? bool.booleanValue() : z;
    }

    public static final SharedPreferences e(long j2, String str) {
        String valueOf = String.valueOf(j2);
        Preference preference = a;
        preference.getClass();
        return p(preference, M(str, valueOf));
    }

    public static final SharedPreferences f(String str) {
        String str2 = f;
        Preference preference = a;
        preference.getClass();
        return p(preference, M(str, str2));
    }

    public static final SharedPreferences g(Context context) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            a.getClass();
            w(context);
            return o(context, 0, k(context));
        } finally {
            readLock.unlock();
        }
    }

    public static final SharedPreferences h(Context context, int i2, String str) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            a.getClass();
            w(context);
            return o(context, i2, str);
        } finally {
            readLock.unlock();
        }
    }

    public static final SharedPreferences i() {
        a.getClass();
        return (SharedPreferences) r.getValue();
    }

    public static final ky6 j() {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            a.getClass();
            return (ky6) p.getValue();
        } finally {
            readLock.unlock();
        }
    }

    public static String k(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static final SharedPreferences l() {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            a.getClass();
            return (SharedPreferences) q.getValue();
        } finally {
            readLock.unlock();
        }
    }

    public static final long m(long j2, String str, String str2) {
        Type type = Type.Number;
        Long valueOf = Long.valueOf(j2);
        a.getClass();
        Long l2 = (Long) z(str, str2, type, valueOf).get();
        return l2 != null ? l2.longValue() : j2;
    }

    public static Long[] n(String str, String str2) {
        Long[] lArr = new Long[0];
        Type type = Type.NumberArray;
        a.getClass();
        Long[] lArr2 = (Long[]) z(str, str2, type, lArr).get();
        return lArr2 == null ? lArr : lArr2;
    }

    public static SharedPreferences o(final Context context, final int i2, final String str) {
        if (str == null) {
            str = "___null_prefs___";
        }
        final String k2 = k(context);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) j.getValue();
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            final bpn0 bpn0Var = new bpn0(new ov8(1, context, str));
            final bpn0 bpn0Var2 = new bpn0(new gzs() { // from class: xsna.pxc0
                @Override // xsna.gzs
                public final Object invoke() {
                    return context.getSharedPreferences(str, i2);
                }
            });
            ky6 ky6Var = new ky6(new gzs() { // from class: xsna.qxc0
                @Override // xsna.gzs
                public final Object invoke() {
                    String str2 = str;
                    String str3 = k2;
                    bpn0 bpn0Var3 = bpn0Var;
                    bpn0 bpn0Var4 = bpn0Var2;
                    return str2.equals(str3) ? Preference.l ? (SharedPreferences) bpn0Var3.getValue() : (SharedPreferences) bpn0Var4.getValue() : Preference.k ? (SharedPreferences) bpn0Var3.getValue() : (SharedPreferences) bpn0Var4.getValue();
                }
            }, n, c);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, ky6Var);
            obj = putIfAbsent == null ? ky6Var : putIfAbsent;
        }
        return (SharedPreferences) obj;
    }

    public static SharedPreferences p(Preference preference, String str) {
        preference.getClass();
        Context context = b;
        if (context == null) {
            context = null;
        }
        preference.getClass();
        return o(context, 0, str);
    }

    public static File q() {
        Context context = b;
        if (context == null) {
            context = null;
        }
        return new File(context.getApplicationInfo().dataDir, "shared_prefs");
    }

    public static SharedPreferences r(Context context, String str) {
        int max;
        Integer num = null;
        if (str != null && (max = Math.max(drm0.P(str, '-', 0, 6), drm0.P(str, '_', 0, 6))) != -1) {
            num = arm0.m(10, str.substring(max + 1));
        }
        StringBuilder sb = new StringBuilder("single_file_pref");
        if (num != null) {
            sb.append("-" + num.intValue());
        }
        return context.getSharedPreferences(sb.toString(), 0);
    }

    public static final String s(String str, String str2, String str3) {
        Type type = Type.String;
        a.getClass();
        String str4 = (String) z(str, str2, type, str3).get();
        return str4 == null ? str3 : str4;
    }

    public static final Set u(Set set, String str, String str2) {
        Type type = Type.StringSet;
        a.getClass();
        Set set2 = (Set) z(str, str2, type, set).get();
        return set2 == null ? set : set2;
    }

    public static final boolean v(String str, String str2) {
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType = Preference$PreferenceUsingLogger$IOType.Write;
        a.getClass();
        i.getClass();
        return f(str).contains(str2);
    }

    public static void w(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            Preference preference = a;
            preference.getClass();
            if (b == null) {
                b = applicationContext;
            }
            L(preference, false, false, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (j().getBoolean("multi_account_migration_completed", false) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x() {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            boolean z = false;
            if (f.length() > 0) {
                if (!e) {
                }
                z = true;
            }
            return z;
        } finally {
            readLock.unlock();
        }
    }

    public static b y(Class cls, String str, String str2) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            return new b(f(str), str2, null, cls);
        } finally {
            readLock.unlock();
        }
    }

    public static h z(String str, String str2, Type type, Object obj) {
        ReentrantReadWriteLock.ReadLock readLock = o.readLock();
        readLock.lock();
        try {
            Preference preference = a;
            SharedPreferences f2 = f(str);
            preference.getClass();
            return c(f2, type, str, str2, obj);
        } finally {
            readLock.unlock();
        }
    }
}
