package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ry8 {
    public static ye4 f;
    public final Context a;
    public final AppWidgetManager b;
    public final mqi c = ypa.b(new hv7(this, 5));
    public static final my8 d = new my8();
    public static final dg4 e = q5a.M("GlanceAppWidgetManager", null, null, null, 14);
    public static final e5f g = new e5f("list::Providers");

    public ry8(Context context) {
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Class cls, sq3 sq3Var) {
        py8 py8Var;
        int i;
        String canonicalName;
        if (sq3Var instanceof py8) {
            py8Var = (py8) sq3Var;
            int i2 = py8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                py8Var.v = i2 - Integer.MIN_VALUE;
                Object obj = py8Var.t;
                lu3 lu3Var = lu3.a;
                i = py8Var.v;
                if (i != 0) {
                    y6a.M(obj);
                    py8Var.r = this;
                    py8Var.s = cls;
                    py8Var.v = 1;
                    obj = b(py8Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cls = py8Var.s;
                    this = py8Var.r;
                    y6a.M(obj);
                }
                ny8 ny8Var = (ny8) obj;
                canonicalName = cls.getCanonicalName();
                if (canonicalName != null) {
                    a70.p("no canonical provider name");
                    return null;
                }
                List list = (List) ny8Var.b.get(canonicalName);
                if (list == null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int[] appWidgetIds = this.b.getAppWidgetIds((ComponentName) it.next());
                    ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
                    for (int i3 : appWidgetIds) {
                        arrayList2.add(new re0(i3));
                    }
                    o13.v(arrayList2, arrayList);
                }
                return arrayList;
            }
        }
        py8Var = new py8(this, sq3Var);
        Object obj2 = py8Var.t;
        lu3 lu3Var2 = lu3.a;
        i = py8Var.v;
        if (i != 0) {
        }
        ny8 ny8Var2 = (ny8) obj2;
        canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        qy8 qy8Var;
        Object obj;
        int i;
        e5f e5fVar;
        ry8 ry8Var;
        p0d p0dVar;
        Set<String> set;
        if (sq3Var instanceof qy8) {
            qy8Var = (qy8) sq3Var;
            int i2 = qy8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qy8Var.v = i2 - Integer.MIN_VALUE;
                obj = qy8Var.t;
                lu3 lu3Var = lu3.a;
                i = qy8Var.v;
                my8 my8Var = d;
                e5fVar = g;
                int i3 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    z88 data = ((ye4) this.c.getValue()).getData();
                    qy8Var.r = this;
                    qy8Var.s = this;
                    qy8Var.v = 1;
                    obj = rd0.y(data, qy8Var);
                    if (obj != lu3Var) {
                        ry8Var = this;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = qy8Var.r;
                    y6a.M(obj);
                    p0dVar = (p0d) obj;
                    String packageName = this.a.getPackageName();
                    set = (Set) p0dVar.c(e5fVar);
                    if (set == null) {
                        lm5 lm5Var = lm5.a;
                        lm5Var.getClass();
                        return new ny8(lm5Var, lm5Var);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str : set) {
                        ComponentName componentName = new ComponentName(packageName, str);
                        KProperty[] kPropertyArr = my8.a;
                        my8Var.getClass();
                        String str2 = (String) p0dVar.c(my8.a(str));
                        Pair pair = str2 == null ? null : new Pair(componentName, str2);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    Map o = tub.o(arrayList);
                    Set<Map.Entry> entrySet = o.entrySet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : entrySet) {
                        String str3 = (String) entry.getValue();
                        Object obj2 = linkedHashMap.get(str3);
                        if (obj2 == null) {
                            obj2 = wv8.n(linkedHashMap, str3);
                        }
                        ((List) obj2).add((ComponentName) entry.getKey());
                    }
                    return new ny8(o, linkedHashMap);
                }
                this = qy8Var.s;
                ry8Var = qy8Var.r;
                y6a.M(obj);
                if (((p0d) obj).c(e5fVar) == null) {
                    obj = null;
                }
                p0dVar = (p0d) obj;
                if (p0dVar == null) {
                    qy8Var.r = this;
                    qy8Var.s = null;
                    qy8Var.v = 2;
                    List<AppWidgetProviderInfo> installedProviders = ry8Var.b.getInstalledProviders();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : installedProviders) {
                        if (Intrinsics.c(((AppWidgetProviderInfo) obj3).provider.getPackageName(), ry8Var.a.getPackageName())) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) it.next();
                        KProperty[] kPropertyArr2 = my8.a;
                        my8Var.getClass();
                        Object newInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                        sy8 sy8Var = newInstance instanceof sy8 ? (sy8) newInstance : null;
                        if (sy8Var != null) {
                            arrayList3.add(sy8Var);
                        }
                    }
                    obj = ((ye4) ry8Var.c.getValue()).a(new zf4(arrayList3, rq3Var, i3), qy8Var);
                }
                String packageName2 = this.a.getPackageName();
                set = (Set) p0dVar.c(e5fVar);
                if (set == null) {
                }
            }
        }
        qy8Var = new qy8(this, sq3Var);
        obj = qy8Var.t;
        lu3 lu3Var2 = lu3.a;
        i = qy8Var.v;
        my8 my8Var2 = d;
        e5fVar = g;
        int i32 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        if (((p0d) obj).c(e5fVar) == null) {
        }
        p0dVar = (p0d) obj;
        if (p0dVar == null) {
        }
        String packageName22 = this.a.getPackageName();
        set = (Set) p0dVar.c(e5fVar);
        if (set == null) {
        }
    }

    public final Object c(sy8 sy8Var, t01 t01Var, yp7 yp7Var) {
        KProperty[] kPropertyArr = my8.a;
        d.getClass();
        String canonicalName = sy8Var.getClass().getCanonicalName();
        rq3 rq3Var = null;
        if (canonicalName == null) {
            a70.p("no receiver name");
            return null;
        }
        String canonicalName2 = t01Var.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object a = ((ye4) this.c.getValue()).a(new bg4(1, canonicalName, canonicalName2, rq3Var), yp7Var);
            return a == lu3.a ? a : Unit.a;
        }
        a70.p("no provider name");
        return null;
    }
}
