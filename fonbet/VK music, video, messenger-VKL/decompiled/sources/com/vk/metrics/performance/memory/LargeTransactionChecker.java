package com.vk.metrics.performance.memory;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.log.L;
import com.vk.metrics.performance.memory.LargeTransactionChecker;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.asp;
import xsna.b40;
import xsna.brm0;
import xsna.c5g;
import xsna.cu2;
import xsna.ezm;
import xsna.g5g;
import xsna.j4q;
import xsna.j5g;
import xsna.ja0;
import xsna.on00;
import xsna.ow90;
import xsna.zrp;

/* compiled from: LargeTransactionChecker.kt */
/* loaded from: classes3.dex */
public final class LargeTransactionChecker {
    public final cu2 a;

    /* compiled from: LargeTransactionChecker.kt */
    public final class NewLargeV2TransactionException extends Throwable {
        public NewLargeV2TransactionException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LargeTransactionChecker.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ADD_ACTIVITY;
        public static final Type ADD_FRAGMENT;
        public static final Type NEW_INTENT;
        public static final Type REMOVE_ACTIVITY;
        public static final Type REMOVE_FRAGMENT;

        static {
            Type type = new Type("ADD_ACTIVITY", 0);
            ADD_ACTIVITY = type;
            Type type2 = new Type("REMOVE_ACTIVITY", 1);
            REMOVE_ACTIVITY = type2;
            Type type3 = new Type("ADD_FRAGMENT", 2);
            ADD_FRAGMENT = type3;
            Type type4 = new Type("REMOVE_FRAGMENT", 3);
            REMOVE_FRAGMENT = type4;
            Type type5 = new Type("NEW_INTENT", 4);
            NEW_INTENT = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
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

    /* compiled from: LargeTransactionChecker.kt */
    public static final class a {
        public static final int a(Object obj) {
            if (obj == null) {
                return 0;
            }
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeValue(obj);
                int dataSize = obtain.dataSize();
                obtain.recycle();
                return dataSize;
            } catch (Throwable unused) {
                obtain.recycle();
                return 0;
            }
        }
    }

    /* compiled from: LargeTransactionChecker.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final int c;
        public final ArrayList d = new ArrayList();

        public b(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }
    }

    /* compiled from: LargeTransactionChecker.kt */
    public static final class c {
        public static void d(StringBuilder sb, b bVar, int i) {
            sb.append(brm0.x(i, " ") + bVar.a + ':' + bVar.b + ':' + bVar.c + '\n');
            Iterator it = bVar.d.iterator();
            while (it.hasNext()) {
                d(sb, (b) it.next(), i + 2);
            }
        }

        public final void a(b bVar, Object obj, int i) {
            if (i < 8192 || (obj instanceof Boolean) || (obj instanceof Number)) {
                return;
            }
            if (obj instanceof String) {
                if (a.a(obj) > 8192) {
                    c(bVar, obj);
                    return;
                }
                return;
            }
            if (!(obj instanceof Bundle)) {
                if ((obj instanceof Serializable) || (obj instanceof Parcelable)) {
                    c(bVar, obj);
                    return;
                }
                return;
            }
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                it.remove();
                bundle2.remove(next);
                int a = a.a(bundle2);
                int i2 = i - a;
                Object obj2 = bundle.get(next);
                if (i2 >= 8192 && obj2 != null) {
                    b bVar2 = new b(next, obj2.getClass().getSimpleName(), i2);
                    bVar.d.add(bVar2);
                    a(bVar2, obj2, i2);
                }
                i = a;
            }
        }

        public final void b(b bVar, Object obj) {
            Field declaredField = obj.getClass().getDeclaredField("mActive");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (list != null) {
                for (Object obj3 : list) {
                    if (obj3 != null) {
                        Field declaredField2 = obj3.getClass().getDeclaredField("mSavedFragmentState");
                        declaredField2.setAccessible(true);
                        Object obj4 = declaredField2.get(obj3);
                        Bundle bundle = obj4 instanceof Bundle ? (Bundle) obj4 : null;
                        int a = a.a(bundle);
                        if (a >= 8192 && bundle != null) {
                            Field declaredField3 = obj3.getClass().getDeclaredField("mClassName");
                            declaredField3.setAccessible(true);
                            Object obj5 = declaredField3.get(obj3);
                            String str = obj5 instanceof String ? (String) obj5 : null;
                            if (str == null) {
                                str = DeviceInfo.STR_TYPE_UNKNOWN;
                            }
                            b bVar2 = new b(str, str, a);
                            bVar.d.add(bVar2);
                            a(bVar2, bundle, a);
                        }
                    }
                }
            }
        }

        public final void c(b bVar, Object obj) {
            try {
                if (obj.getClass().getName().equals("androidx.fragment.app.FragmentManagerState")) {
                    b(bVar, obj);
                    return;
                }
                for (Field field : obj.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Object obj2 = field.get(this);
                    int a = a.a(obj2);
                    if (obj2 != null) {
                        b bVar2 = new b(name, obj2.getClass().getSimpleName(), a);
                        bVar.d.add(bVar2);
                        if (a >= 8192) {
                            a(bVar2, obj2, a);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.e(LargeTransactionChecker.class.getSimpleName(), th.getMessage(), th);
            }
        }
    }

    /* compiled from: LargeTransactionChecker.kt */
    public static final class d extends FragmentManager.m {
        public final e a;
        public final WeakHashMap<Fragment, Bundle> b = new WeakHashMap<>();

        public d(e eVar) {
            this.a = eVar;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void h(Bundle bundle, Fragment fragment) {
            this.b.put(fragment, bundle);
            this.a.f(Type.ADD_FRAGMENT, bundle, fragment.getClass().getSimpleName());
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void j(Fragment fragment) {
            Bundle remove = this.b.remove(fragment);
            this.a.f(Type.REMOVE_FRAGMENT, remove, fragment.getClass().getSimpleName());
        }
    }

    /* compiled from: LargeTransactionChecker.kt */
    public final class e extends ja0 {
        public final d b = new d(this);
        public final WeakHashMap<Activity, Bundle> c = new WeakHashMap<>();

        public e() {
        }

        public final NewLargeV2TransactionException e(int i, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Pair pair) {
            StringBuilder sb = new StringBuilder();
            sb.append("TotalSize:" + i + '\n');
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(new Pair((String) entry.getKey(), Integer.valueOf(a.a((Bundle) entry.getValue()))));
            }
            g5g.y(arrayList2, arrayList);
            ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                arrayList3.add(new Pair((String) entry2.getKey(), Integer.valueOf(a.a((Bundle) entry2.getValue()))));
            }
            g5g.y(arrayList3, arrayList);
            if (pair != null) {
                arrayList.add(pair);
            }
            if (arrayList.size() > 1) {
                g5g.L(arrayList, new j4q(2));
            }
            sb.append(j5g.g0(arrayList, "\n", null, null, 0, new b40(21), 30));
            return LargeTransactionChecker.this.new NewLargeV2TransactionException(sb.toString());
        }

        public final void f(Type type, Bundle bundle, String str) {
            String str2;
            final LargeTransactionChecker largeTransactionChecker = LargeTransactionChecker.this;
            cu2 cu2Var = largeTransactionChecker.a;
            if (bundle != null) {
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                d dVar = this.b;
                Iterator<Map.Entry<Fragment, Bundle>> it = dVar.b.entrySet().iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += a.a(it.next().getValue());
                }
                WeakHashMap<Activity, Bundle> weakHashMap = this.c;
                Iterator<Map.Entry<Activity, Bundle>> it2 = weakHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    i += a.a(it2.next().getValue());
                }
                ref$IntRef.element = i;
                boolean z = i == 0;
                boolean z2 = Type.REMOVE_ACTIVITY == type || Type.REMOVE_FRAGMENT == type;
                if (z2) {
                    ref$IntRef.element = a.a(bundle) + i;
                }
                if (ref$IntRef.element > 131072) {
                    str2 = str;
                    ((ExecutorService) cu2Var.invoke()).execute(new ezm(str2, bundle, ref$IntRef, type, new Bundle(bundle), 1));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(type.name());
                    sb.append(" totalSize=");
                    sb.append(ref$IntRef.element);
                    sb.append(" - ");
                    str2 = str;
                    sb.append(str2);
                    L.e(sb.toString());
                }
                if (z && z2) {
                    L.e("Empty! No saved data.");
                }
                if (ref$IntRef.element > 393216) {
                    final Bundle bundle2 = new Bundle(bundle);
                    Set<Map.Entry<Activity, Bundle>> entrySet = weakHashMap.entrySet();
                    int e = on00.e(c5g.u(entrySet, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    Iterator<T> it3 = entrySet.iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        Pair pair = new Pair(entry.getKey().getClass().getSimpleName(), new Bundle((Bundle) entry.getValue()));
                        linkedHashMap.put(pair.i(), pair.j());
                    }
                    Set<Map.Entry<Fragment, Bundle>> entrySet2 = dVar.b.entrySet();
                    int e2 = on00.e(c5g.u(entrySet2, 10));
                    final LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                    Iterator<T> it4 = entrySet2.iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        Pair pair2 = new Pair(entry2.getKey().getClass().getSimpleName(), new Bundle((Bundle) entry2.getValue()));
                        linkedHashMap2.put(pair2.i(), pair2.j());
                    }
                    final String str3 = str2;
                    final boolean z3 = z2;
                    ((ExecutorService) cu2Var.invoke()).execute(new Runnable(z3, this, ref$IntRef, linkedHashMap, linkedHashMap2, str3, bundle2, largeTransactionChecker) { // from class: xsna.tly
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ LargeTransactionChecker.e c;
                        public final /* synthetic */ Ref$IntRef d;
                        public final /* synthetic */ LinkedHashMap e;
                        public final /* synthetic */ LinkedHashMap f;
                        public final /* synthetic */ String g;
                        public final /* synthetic */ Bundle h;

                        @Override // java.lang.Runnable
                        public final void run() {
                            LargeTransactionChecker.NewLargeV2TransactionException e3;
                            boolean z4 = this.b;
                            LargeTransactionChecker.e eVar = this.c;
                            Ref$IntRef ref$IntRef2 = this.d;
                            LinkedHashMap linkedHashMap3 = this.e;
                            LinkedHashMap linkedHashMap4 = this.f;
                            if (z4) {
                                e3 = eVar.e(ref$IntRef2.element, linkedHashMap3, linkedHashMap4, new Pair(this.g, Integer.valueOf(LargeTransactionChecker.a.a(this.h))));
                            } else {
                                e3 = eVar.e(ref$IntRef2.element, linkedHashMap3, linkedHashMap4, null);
                            }
                            ow90 ow90Var = ow90.a;
                            L.l("ERROR: <<<==== LARGE TRANSACTION ====>>>");
                            com.vk.metrics.eventtracking.b.a.a(e3);
                        }
                    });
                }
            }
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().c0(this.b, true);
            }
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().r0(this.b);
            }
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.c.put(activity, bundle);
            f(Type.ADD_ACTIVITY, bundle, activity.getClass().getSimpleName());
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            f(Type.REMOVE_ACTIVITY, this.c.remove(activity), activity.getClass().getSimpleName());
        }
    }

    public LargeTransactionChecker(Context context, cu2 cu2Var) {
        ow90 ow90Var = ow90.a;
        this.a = cu2Var;
        e eVar = new e();
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(eVar);
        }
    }
}
