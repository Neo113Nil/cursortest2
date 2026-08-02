package defpackage;

import android.app.AppOpsManager;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.d;
import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzir;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.subscription.SubscriptionPriceBundle;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aik {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ aik(int i) {
        this.a = i;
    }

    public static final void A(mha mhaVar) {
        mhaVar.getClass();
        if (mhaVar instanceof p5h) {
            a70.r("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (mhaVar instanceof d7f) {
            a70.r("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (mhaVar instanceof zze) {
            a70.r("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static void B(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static int C(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, eq3.x(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final String D(yea yeaVar, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        yeaVar.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof ffa) {
                return ((ffa) annotation).discriminator();
            }
        }
        return yeaVar.a.i;
    }

    public static boolean E(wp4 wp4Var, Object obj) {
        Iterator it = wp4Var.entrySet().iterator();
        it.getClass();
        Iterator it2 = it;
        if (obj == null) {
            while (it2.hasNext()) {
                if (((Map.Entry) it2.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it2.hasNext()) {
            if (obj.equals(((Map.Entry) it2.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final List I(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TopPlayersStatisticsItem) obj).getPlayedEnough()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.L0(arrayList, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[EDGE_INSN: B:47:0x008b->B:31:0x008b BREAK  A[LOOP:0: B:9:0x0011->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List J(jga jgaVar, int i, int i2) {
        Pair pair;
        boolean z;
        if (i == i2) {
            return km5.a;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = jgaVar.a;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        pair = new Pair(treeMap, treeMap.keySet());
                        if (pair != null) {
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 != null) {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                        if (pair != null) {
                            break;
                        }
                        Map map = (Map) pair.a;
                        Iterator it = ((Iterable) pair.b).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i2 <= intValue && intValue < i) {
                                    Object obj = map.get(Integer.valueOf(intValue));
                                    obj.getClass();
                                    arrayList.add(obj);
                                    z = true;
                                    i = intValue;
                                    break;
                                    break;
                                }
                            } else if (i + 1 <= intValue && intValue <= i2) {
                                Object obj2 = map.get(Integer.valueOf(intValue));
                                obj2.getClass();
                                arrayList.add(obj2);
                                z = true;
                                i = intValue;
                                break;
                            }
                        }
                        z = false;
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = jgaVar.a;
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    public static Boolean K(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List L(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List M(String str, Map map) {
        List L = L(str, map);
        if (L == null) {
            return null;
        }
        for (int i = 0; i < L.size(); i++) {
            if (!(L.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", L.get(i), Integer.valueOf(i), L));
            }
        }
        return L;
    }

    public static Double N(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            sw9.n("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            sw9.n("value '%s' for key '%s' is not a double", new Object[]{obj, str});
            return null;
        }
    }

    public static Integer O(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                sw9.n("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                sw9.n("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
        }
        Double d2 = (Double) obj;
        int intValue = d2.intValue();
        if (intValue == d2.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d2);
    }

    public static Map P(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static final cvk Q(View view) {
        cvk cvkVar;
        Object tag = view.getTag(R.id.coil3_request_manager);
        cvk cvkVar2 = tag instanceof cvk ? (cvk) tag : null;
        if (cvkVar2 != null) {
            return cvkVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                cvkVar = tag2 instanceof cvk ? (cvk) tag2 : null;
                if (cvkVar == null) {
                    cvkVar = new cvk(view);
                    view.addOnAttachStateChangeListener(cvkVar);
                    view.setTag(R.id.coil3_request_manager, cvkVar);
                }
            } finally {
            }
        }
        return cvkVar;
    }

    public static String R(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long S(String str, Map map) {
        String R = R(str, map);
        if (R == null) {
            return null;
        }
        try {
            return Long.valueOf(d0(R));
        } catch (ParseException e) {
            is8.h(e);
            return null;
        }
    }

    public static List T(String str) {
        if (!new Regex("((-1|\\d+)_)*(\\d+|-1)").f(str)) {
            return null;
        }
        try {
            List Y = StringsKt.Y(str, new char[]{'_'});
            ArrayList arrayList = new ArrayList(k13.r(Y, 10));
            Iterator it = Y.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            return CollectionsKt.S0(CollectionsKt.V0(arrayList));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final int U(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] V(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean W(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final boolean X(hg4 hg4Var, int i, int i2) {
        hg4Var.getClass();
        if (i > i2 && hg4Var.l) {
            return false;
        }
        Set set = hg4Var.m;
        return hg4Var.k && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public static final void Y(snl snlVar, g6b g6bVar, String str) {
        snlVar.getClass();
        g6bVar.getClass();
        str.getClass();
        Z(snlVar, g6bVar.b() == e6b.e, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final void Z(snl snlVar, boolean z, String str, float f) {
        snlVar.getClass();
        str.getClass();
        if (z) {
            xnl xnlVar = (xnl) snlVar;
            xnlVar.b(xnlVar.a, "loadVideo", str, Float.valueOf(f));
        } else {
            xnl xnlVar2 = (xnl) snlVar;
            xnlVar2.b(xnlVar2.a, "cueVideo", str, Float.valueOf(f));
        }
    }

    public static final void a(rui ruiVar, Function1 function1, xtc xtcVar, int i, int i2, of3 of3Var, int i3) {
        int i4;
        int i5;
        xtc xtcVar2;
        Object obj;
        Function1 function12 = function1;
        int i6 = i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1865789460);
        int i7 = i3 | (av8Var.g(ruiVar) ? 4 : 2) | (av8Var.i(function12) ? 32 : 16) | 384 | (av8Var.e(i) ? a.o : 1024) | (av8Var.e(i6) ? 16384 : 8192);
        if (av8Var.T(i7 & 1, (i7 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar2 = utcVar;
            xtc f02 = l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            boolean z = true;
            boolean z2 = false;
            sha.a(0, 0, av8Var, ljg.g(av8Var, C2, f50Var3, 1.0f, true), oea.v(R.string.all_nba_teams, av8Var));
            gv9<oxh> gv9Var = ruiVar.a;
            for (oxh oxhVar : gv9Var) {
                int intValue = ((Number) oxhVar.a).intValue();
                Integer num = ruiVar.b;
                if (num != null && intValue == num.intValue()) {
                    boolean z3 = (i7 & 112) == 32 ? z : z2;
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    Object obj2 = O;
                    if (z3 || O == a99Var) {
                        uj8 uj8Var = new uj8(5, function12);
                        av8Var.n0(uj8Var);
                        obj2 = uj8Var;
                    }
                    utc utcVar3 = utcVar2;
                    boolean z4 = z;
                    r4a.j(gv9Var, oxhVar, (Function1) obj2, utcVar3, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 3072, 1008);
                    av8Var.s(z4);
                    gv9 gv9Var2 = ruiVar.c;
                    boolean i8 = av8Var.i(context) | ((i7 & 7168) == 2048 ? z4 ? 1 : 0 : false) | ((i7 & 57344) == 16384 ? z4 ? 1 : 0 : false);
                    Object O2 = av8Var.O();
                    if (i8 || O2 == a99Var) {
                        i4 = i;
                        i5 = i2;
                        hua huaVar = new hua(context, i4, i5, z4 ? 1 : 0);
                        av8Var.n0(huaVar);
                        obj = huaVar;
                    } else {
                        i4 = i;
                        i5 = i2;
                        obj = O2;
                    }
                    o(0, av8Var, gv9Var2, null, (Function1) obj);
                    av8Var.s(z4);
                    xtcVar2 = utcVar3;
                } else {
                    function12 = function1;
                    i6 = i6;
                    utcVar2 = utcVar2;
                    z2 = z2;
                    z = z;
                }
            }
            ogj.m("Collection contains no element matching the predicate.");
            return;
        }
        i4 = i;
        i5 = i6;
        av8Var.W();
        xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(ruiVar, function1, xtcVar2, i4, i5, i3);
        }
    }

    public static final void a0(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            rik o = rik.o();
            String[] strArr = mbl.a;
            o.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr2 = mbl.a;
            int c2 = sub.c(strArr2.length);
            if (c2 < 16) {
                c2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : tub.l(linkedHashMap, new Pair(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        rik o2 = rik.o();
                        String[] strArr3 = mbl.a;
                        file2.toString();
                        o2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    rik o3 = rik.o();
                    String[] strArr4 = mbl.a;
                    o3.getClass();
                }
            }
        }
    }

    public static final void b(String str, gv9 gv9Var, tc3 tc3Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var;
        boolean z;
        av8 av8Var2;
        boolean z2;
        Object obj;
        int i2;
        utc utcVar;
        float f;
        a99 a99Var;
        boolean z3;
        boolean z4;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-574743378);
        int i3 = i | (av8Var3.g(str) ? 4 : 2) | (av8Var3.g(gv9Var) ? 32 : 16) | (av8Var3.i(function1) ? a.o : 1024);
        if (av8Var3.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object O = av8Var3.O();
            a99 a99Var2 = nf3.a;
            Object obj2 = O;
            if (O == a99Var2) {
                e1d f2 = e.f(Boolean.FALSE);
                av8Var3.n0(f2);
                obj2 = f2;
            }
            e1d e1dVar = (e1d) obj2;
            boolean h = ((i3 & 112) == 32) | av8Var3.h(((Boolean) e1dVar.getValue()).booleanValue());
            Object O2 = av8Var3.O();
            if (h || O2 == a99Var2) {
                O2 = ((Boolean) e1dVar.getValue()).booleanValue() ? gv9Var : CollectionsKt.L0(gv9Var, 5);
                av8Var3.n0(O2);
            }
            List list = (List) O2;
            utc utcVar2 = utc.a;
            float f3 = 16.0f;
            boolean z5 = true;
            xtc f0 = l98.f0(n9e.q(wnn.A(gz8.x(bkh.d(utcVar2, 1.0f), null, null, 3), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var3), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a = t23.a(ww9.d, uxf.p, av8Var3, 48);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            boolean z6 = false;
            sha.a((i3 & 14) | 48, 0, av8Var3, l98.d0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), str);
            av8Var3.d0(1966232449);
            int i4 = 0;
            av8 av8Var4 = av8Var3;
            for (Object obj3 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                vw0 vw0Var = (vw0) obj3;
                tc3 H = yqo.H(-243712225, av8Var4, new op9(11, tc3Var, vw0Var));
                boolean i6 = ((i3 & 7168) == 2048 ? z5 : false) | av8Var4.i(vw0Var);
                Object O3 = av8Var4.O();
                Object obj4 = O3;
                if (i6 || O3 == a99Var2) {
                    ij8 ij8Var = new ij8(25, function1, vw0Var);
                    av8Var4.n0(ij8Var);
                    obj4 = ij8Var;
                }
                utc utcVar3 = utcVar2;
                float f4 = f3;
                a99 a99Var3 = a99Var2;
                cga.d(vw0Var, H, (Function0) obj4, null, av8Var4, 48);
                if (i4 < list.size() - 1) {
                    av8Var4.d0(1707081326);
                    i2 = i3;
                    utcVar = utcVar3;
                    a99Var = a99Var3;
                    f = f4;
                    z3 = false;
                    av8 av8Var5 = av8Var4;
                    z4 = false;
                    tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, lz.D(R.color.n_lv_4, av8Var4), 0L, av8Var5, l98.d0(utcVar3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                    av8Var4 = av8Var5;
                    av8Var4.s(false);
                } else {
                    i2 = i3;
                    utcVar = utcVar3;
                    f = f4;
                    a99Var = a99Var3;
                    z3 = false;
                    z4 = false;
                    av8Var4.d0(1707249501);
                    av8Var4.s(false);
                }
                z6 = z3;
                f3 = f;
                i4 = i5;
                utcVar2 = utcVar;
                a99Var2 = a99Var;
                z5 = true;
                i3 = i2;
                av8Var4 = av8Var4;
            }
            a99 a99Var4 = a99Var2;
            utc utcVar4 = utcVar2;
            float f5 = f3;
            boolean z7 = z6;
            av8Var4.s(z7);
            if (gv9Var.size() > 5) {
                av8Var4.d0(824188979);
                xtc A = wnn.A(l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.a(8.0f));
                Object O4 = av8Var4.O();
                if (O4 == a99Var4) {
                    z2 = true;
                    tra traVar = new tra(true ? 1 : 0, e1dVar);
                    av8Var4.n0(traVar);
                    obj = traVar;
                } else {
                    z2 = true;
                    obj = O4;
                }
                Function0 function0 = (Function0) obj;
                av8 av8Var6 = av8Var4;
                z = z2;
                xtc b0 = l98.b0(tol.y(A, false, false, false, 0L, null, function0, av8Var6, 31), 8.0f);
                l8g a2 = k8g.a(ww9.f, uxf.m, av8Var6, 54);
                int hashCode2 = Long.hashCode(av8Var6.T);
                aee m2 = av8Var6.m();
                xtc C2 = fqj.C(av8Var6, b0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var6.h0();
                if (av8Var6.S) {
                    av8Var6.l(zg3Var2);
                } else {
                    av8Var6.q0();
                }
                waa.K(av8Var6, a2, hf3.g);
                waa.K(av8Var6, m2, hf3.f);
                waa.K(av8Var6, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var6, hf3.k);
                waa.K(av8Var6, C2, hf3.d);
                String v = oea.v(((Boolean) e1dVar.getValue()).booleanValue() ? R.string.see_less : R.string.see_more, av8Var6);
                yf8 yf8Var = xth.a;
                udj.c(v, null, lz.D(R.color.primary_default, av8Var6), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var6, 0, 0, 131066);
                kq9.b(s6a.N(((Boolean) e1dVar.getValue()).booleanValue() ? R.drawable.ic_chevron_up_large_16 : R.drawable.ic_chevron_down_large_16, 6, av8Var6), null, bkh.l(l98.f0(utcVar4, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), f5), lz.D(R.color.primary_default, av8Var6), av8Var6, 432, 0);
                av8 av8Var7 = av8Var6;
                av8Var7.s(z);
                av8Var7.s(false);
                av8Var2 = av8Var7;
            } else {
                z = true;
                av8Var4.d0(825287402);
                av8Var4.s(z7);
                av8Var2 = av8Var4;
            }
            av8Var2.s(z);
            av8Var = av8Var2;
        } else {
            av8Var3.W();
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 3, str, gv9Var, tc3Var, function1);
        }
    }

    public static long b0(int i, long j) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = i9a.s(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - 1000000000);
            j++;
        }
        if (j >= -315576000000L && j <= 315576000000L) {
            long j3 = i;
            if (j3 >= -999999999 && j3 < 1000000000 && ((j >= 0 && i >= 0) || (j <= 0 && i <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j);
                long j4 = i;
                long j5 = nanos + j4;
                return (((j4 ^ nanos) > 0L ? 1 : ((j4 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j5) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static final void c(cn2 cn2Var, boolean z, int i, int i2, Function0 function0, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        eqf u;
        Function2 vm7Var;
        boolean z2;
        utc utcVar;
        kv1 kv1Var = uxf.q;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(592920613);
        int i4 = i3 | (av8Var.g(cn2Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i2) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192) | 196608;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            Integer num = cn2Var.a;
            Integer num2 = cn2Var.d;
            int intValue = num.intValue();
            String str = cn2Var.b;
            if (str == null) {
                u = av8Var.u();
                if (u != null) {
                    vm7Var = new x80(cn2Var, z, i, i2, function0, i3);
                    u.d = vm7Var;
                }
                return;
            }
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar2 = utc.a;
            xtc h = ljg.h(16.0f, wnn.A(bkh.d(utcVar2, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), 16.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var2 = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var2, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_leagues, 6, av8Var), null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            String v = oea.v(R.string.nba_champions, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            xtc f0 = l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            p8g p8gVar = p8g.a;
            xtc A = wnn.A(p8gVar.a(1.0f, utcVar2, true), o7g.a(8.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.A;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 8), av8Var, 0);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            td4.G(intValue, bkh.l(utcVar2, 40.0f), false, 0L, av8Var, 48, 12);
            xtc d0 = l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a5 = t23.a(p4hVar, kv1Var2, av8Var, 0);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C5 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var3);
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            udj.c(cn2Var.c, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            nq8.h(av8Var, bkh.p(utcVar2, 8.0f));
            if (num2 == null || cn2Var.e == null) {
                z2 = true;
                if (z) {
                    av8Var.d0(-115963224);
                    u23 a6 = t23.a(p4hVar, kv1Var, av8Var, 48);
                    int hashCode6 = Long.hashCode(av8Var.T);
                    aee m6 = av8Var.m();
                    xtc C6 = fqj.C(av8Var, utcVar2);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a6, f50Var);
                    waa.K(av8Var, m6, ff3Var);
                    bf3.s(hashCode6, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C6, f50Var3);
                    utcVar = utcVar2;
                    udj.c(oea.v(R.string.finals_mvp_award, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
                    udj.c(oea.v(R.string.coming_soon, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    utcVar = utcVar2;
                    av8Var.d0(-115330452);
                    av8Var.s(false);
                }
            } else {
                av8Var.d0(-117929120);
                xtc A2 = wnn.A(p8gVar.a(1.0f, utcVar2, true), o7g.a(8.0f));
                long D2 = lz.D(R.color.n_lv_4, av8Var);
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = mz1.e(av8Var);
                }
                wzc wzcVar2 = (wzc) O3;
                Object[] objArr2 = new Object[0];
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    O4 = o67.B;
                    av8Var.n0(O4);
                }
                xtc y2 = tol.y(A2, true, true, true, D2, wzcVar2, new u31((boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), context, cn2Var, i, i2), av8Var, 0);
                l8g a7 = k8g.a(ww9.c, lv1Var, av8Var, 54);
                int hashCode7 = Long.hashCode(av8Var.T);
                aee m7 = av8Var.m();
                xtc C7 = fqj.C(av8Var, y2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a7, f50Var);
                waa.K(av8Var, m7, ff3Var);
                bf3.s(hashCode7, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C7, f50Var3);
                z2 = true;
                xtc a8 = p8gVar.a(1.0f, utcVar2, true);
                u23 a9 = t23.a(p4hVar, kv1Var, av8Var, 48);
                int hashCode8 = Long.hashCode(av8Var.T);
                aee m8 = av8Var.m();
                xtc C8 = fqj.C(av8Var, a8);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a9, f50Var);
                waa.K(av8Var, m8, ff3Var);
                bf3.s(hashCode8, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C8, f50Var3);
                udj.c(cn2Var.e, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                utcVar = utcVar2;
                udj.c(oea.v(R.string.finals_mvp_award, av8Var), l98.c0(n9e.q(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.value, av8Var), o7g.a(20.0f)), 8.0f, 2.0f), lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                av8Var.s(true);
                td4.C(num2.intValue(), bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
                av8Var.s(true);
                av8Var.s(false);
            }
            av8Var.s(z2);
            av8Var.s(z2);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        u = av8Var.u();
        if (u != null) {
            vm7Var = new vm7(cn2Var, z, i, i2, function0, xtcVar2, i3);
            u.d = vm7Var;
        }
    }

    public static void c0(wcj wcjVar, z05 z05Var, aej aejVar, dma dmaVar, jdj jdjVar, boolean z, nnd nndVar) {
        long a;
        oqf oqfVar;
        if (z) {
            int v = nndVar.v(pej.f(wcjVar.b));
            String str = faj.a;
            if (v < aejVar.a.a.b.length()) {
                oqfVar = aejVar.b(v);
            } else if (v != 0) {
                oqfVar = aejVar.b(v - 1);
            } else {
                a = faj.a((dfj) z05Var.c, (kx4) z05Var.d, (sf8) z05Var.e, faj.a, 1);
                oqfVar = new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, (int) (new c7a(a).a & 4294967295L));
            }
            float f = oqfVar.b;
            float f2 = oqfVar.a;
            long P = dmaVar.P((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (P >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (P & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = oqfVar.c - f2;
            float f4 = oqfVar.d - f;
            oqf r = jca.r(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            if (Intrinsics.c((jdj) jdjVar.a.b.get(), jdjVar)) {
                jdjVar.b.f(r);
            }
        }
    }

    public static final void d(final vnb vnbVar, final boolean z, final int i, final int i2, final Function1 function1, final Function0 function0, final boolean z2, final xtc xtcVar, of3 of3Var, final int i3) {
        int i4;
        int i5;
        Function0 function02;
        xtc xtcVar2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1995303806);
        if ((i3 & 6) == 0) {
            i4 = (av8Var2.g(vnbVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var2.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 = i2;
            i4 |= av8Var2.e(i5) ? a.o : 1024;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= av8Var2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            function02 = function0;
            i4 |= av8Var2.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function02 = function0;
        }
        if ((1572864 & i3) == 0) {
            i4 |= av8Var2.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 8388608 : 4194304;
        } else {
            xtcVar2 = xtcVar;
        }
        int i6 = i4;
        if (av8Var2.T(i6 & 1, (4793491 & i6) != 4793490)) {
            boolean z3 = (57344 & i6) == 16384;
            Object O = av8Var2.O();
            if (z3 || O == nf3.a) {
                O = new l77(22, function1);
                av8Var2.n0(O);
            }
            final int i7 = i5;
            final Function0 function03 = function02;
            tc3 H = yqo.H(-1336557314, av8Var2, new ct8() { // from class: fua
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8;
                    int i9;
                    Function0 function04;
                    av8 av8Var3;
                    iua iuaVar = (iua) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    iuaVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(iuaVar) ? 4 : 2;
                    }
                    int i10 = 0;
                    av8 av8Var4 = (av8) of3Var2;
                    if (av8Var4.T(intValue & 1, (intValue & 19) != 18)) {
                        Context context = (Context) av8Var4.k(nz.b);
                        xtc e0 = l98.e0(hkg.u0(lz.J(bkh.c, jaa.L(av8Var4), null), hkg.o0(av8Var4), false, 14), 8.0f, 8.0f, 8.0f, 48.0f);
                        u23 a = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var4, 6);
                        int hashCode = Long.hashCode(av8Var4.T);
                        aee m = av8Var4.m();
                        xtc C = fqj.C(av8Var4, e0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var4.h0();
                        if (av8Var4.S) {
                            av8Var4.l(zg3Var);
                        } else {
                            av8Var4.q0();
                        }
                        waa.K(av8Var4, a, hf3.g);
                        waa.K(av8Var4, m, hf3.f);
                        waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var4, hf3.k);
                        waa.K(av8Var4, C, hf3.d);
                        cn2 cn2Var = iuaVar.a;
                        Function0 function05 = Function0.this;
                        int i11 = i;
                        int i12 = i7;
                        if (cn2Var == null) {
                            av8Var4.d0(-114088853);
                            av8Var4.s(false);
                            i8 = i11;
                            i9 = i12;
                            function04 = function05;
                            av8Var3 = av8Var4;
                        } else {
                            av8Var4.d0(-114088852);
                            aik.c(cn2Var, z, i11, i12, function05, null, av8Var4, 0);
                            i8 = i11;
                            i9 = i12;
                            function04 = function05;
                            av8Var3 = av8Var4;
                            av8Var3.s(false);
                        }
                        boolean isEmpty = iuaVar.b.isEmpty();
                        a99 a99Var = nf3.a;
                        if (isEmpty) {
                            av8Var3.d0(-113245094);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(-113696764);
                            String v = oea.v(R.string.conference_champions, av8Var3);
                            gv9 gv9Var = iuaVar.b;
                            tc3 tc3Var = k53.d;
                            boolean g = av8Var3.g(function04);
                            Object O2 = av8Var3.O();
                            if (g || O2 == a99Var) {
                                O2 = new ma0(9, function04);
                                av8Var3.n0(O2);
                            }
                            aik.b(v, gv9Var, tc3Var, (Function1) O2, av8Var3, 384);
                            av8Var3.s(false);
                        }
                        if (iuaVar.c.isEmpty()) {
                            av8Var3.d0(-111180742);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(-113128689);
                            String v2 = oea.v(R.string.individual_awards, av8Var3);
                            gv9 gv9Var2 = iuaVar.c;
                            tc3 tc3Var2 = k53.e;
                            boolean i13 = av8Var3.i(context) | av8Var3.e(i8) | av8Var3.e(i9);
                            Object O3 = av8Var3.O();
                            if (i13 || O3 == a99Var) {
                                O3 = new hua(context, i8, i9, i10);
                                av8Var3.n0(O3);
                            }
                            aik.b(v2, gv9Var2, tc3Var2, (Function1) O3, av8Var3, 384);
                            av8Var3.s(false);
                        }
                        if (iuaVar.d != null) {
                            av8Var3.d0(-111109318);
                            av8 av8Var5 = av8Var3;
                            aik.a(iuaVar.d, function1, null, i8, i9, av8Var5, 0);
                            av8Var3 = av8Var5;
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(-110880166);
                            av8Var3.s(false);
                        }
                        av8Var3.s(true);
                    } else {
                        av8Var4.W();
                    }
                    return Unit.a;
                }
            });
            int i8 = i6 >> 12;
            av8Var = av8Var2;
            ktm.s(vnbVar, (Function0) O, z2, xtcVar2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, H, av8Var, (i6 & 14) | 100663296 | (i8 & 896) | (i8 & 7168), 240);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: gua
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aik.d(vnb.this, z, i, i2, function1, function0, z2, xtcVar, (of3) obj, aba.K(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static long d0(String str) {
        boolean z;
        String str2;
        int i;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String h = wv8.h(1, 0, str);
        int indexOf = h.indexOf(46);
        if (indexOf != -1) {
            str2 = h.substring(indexOf + 1);
            h = h.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(h);
        if (str2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < 9; i2++) {
                i *= 10;
                if (i2 < str2.length()) {
                    if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i = (str2.charAt(i2) - '0') + i;
                }
            }
        }
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            parseLong = -parseLong;
            i = -i;
        }
        try {
            return b0(i, parseLong);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    public static final void e(nua nuaVar, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        nuaVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1530181167);
        int i3 = i | (av8Var.i(nuaVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            e1d x = rfo.x(nuaVar.f, av8Var, 0);
            e1d x2 = rfo.x(nuaVar.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            int i4 = nuaVar.m;
            int i5 = nuaVar.n;
            boolean i6 = av8Var.i(nuaVar);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                i2 = i5;
                s26 s26Var = new s26(1, nuaVar, nua.class, "onAction", "onAction(Lcom/sofascore/results/league/fragment/awards/LeagueAwardsAction;)V", 0, 23);
                av8Var.n0(s26Var);
                O = s26Var;
            } else {
                i2 = i5;
            }
            d(vnbVar, z, i4, i2, (Function1) ((KFunction) O), function0, ((Boolean) x2.getValue()).booleanValue(), xtcVar, av8Var, (i3 & 112) | ((i3 << 9) & 458752) | ((i3 << 12) & 29360128));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(nuaVar, z, function0, xtcVar, i, 11);
        }
    }

    public static float e0(boolean z) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        int freeMemory = maxMemory == 0 ? -1 : 100 - ((int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) * 100.0f) / maxMemory));
        if (freeMemory < 0) {
            return 1.0f;
        }
        if (freeMemory < 30) {
            return z ? 0.1f : 2.0f;
        }
        if (freeMemory < 60) {
            return z ? 0.5f : 1.5f;
        }
        return 1.0f;
    }

    public static final void f(xzd xzdVar, Function1 function1, final Function1 function12, final Function1 function13, of3 of3Var, int i) {
        final xzd xzdVar2 = xzdVar;
        xzdVar2.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2096241062);
        int i2 = i | (av8Var.g(xzdVar2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function13) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_P, av8Var), oyn.e);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a2 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            final int i3 = 1;
            xtc f0 = l98.f0(ljg.g(av8Var, C2, f50Var3, 1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            String string = context.getString(R.string.statistics);
            string.getClass();
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            final int i4 = 0;
            udj.c(string, f0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            xzdVar2 = xzdVar;
            av8Var = av8Var;
            yzd yzdVar = xzdVar2.b;
            boolean z = yzdVar == yzd.All;
            boolean i5 = ((i2 & 112) == 32) | av8Var.i(context) | av8Var.g(xzdVar2);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new vsc(6, function1, context, xzdVar2);
                av8Var.n0(O);
            }
            m(z, (Function1) O, av8Var, 0);
            av8Var.s(true);
            yzd yzdVar2 = yzd.PerCategory;
            boolean z2 = yzdVar == yzdVar2 && xzdVar2.d != null;
            tc3 H = yqo.H(1346644362, av8Var, new ct8() { // from class: vzd
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    a99 a99Var = nf3.a;
                    Function1 function14 = function12;
                    xzd xzdVar3 = xzdVar2;
                    r70 r70Var = (r70) obj;
                    of3 of3Var2 = (of3) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            r70Var.getClass();
                            gv9 gv9Var = xzdVar3.c;
                            mzd mzdVar = xzdVar3.d;
                            av8 av8Var2 = (av8) of3Var2;
                            boolean g = av8Var2.g(function14);
                            Object O2 = av8Var2.O();
                            if (g || O2 == a99Var) {
                                O2 = new uj8(22, function14);
                                av8Var2.n0(O2);
                            }
                            aik.k(gv9Var, mzdVar, (Function1) O2, av8Var2, 0);
                            break;
                        default:
                            r70Var.getClass();
                            pzd pzdVar = xzdVar3.g;
                            av8 av8Var3 = (av8) of3Var2;
                            if (pzdVar == null) {
                                av8Var3.d0(2022147424);
                                av8Var3.s(false);
                            } else {
                                av8Var3.d0(2022147425);
                                gv9 gv9Var2 = xzdVar3.f;
                                boolean g2 = av8Var3.g(function14);
                                Object O3 = av8Var3.O();
                                if (g2 || O3 == a99Var) {
                                    O3 = new uj8(21, function14);
                                    av8Var3.n0(O3);
                                }
                                aik.l(gv9Var2, pzdVar, (Function1) O3, av8Var3, 0);
                                av8Var3.s(false);
                            }
                            function14.invoke(xzdVar3.g);
                            break;
                    }
                    return Unit.a;
                }
            });
            x23 x23Var = x23.a;
            fz8.b(x23Var, z2, null, null, null, null, H, av8Var, 1572870, 30);
            fz8.b(x23Var, yzdVar == yzdVar2 && !xzdVar2.f.isEmpty(), null, null, null, null, yqo.H(-77063053, av8Var, new ct8() { // from class: vzd
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i3;
                    a99 a99Var = nf3.a;
                    Function1 function14 = function13;
                    xzd xzdVar3 = xzdVar2;
                    r70 r70Var = (r70) obj;
                    of3 of3Var2 = (of3) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            r70Var.getClass();
                            gv9 gv9Var = xzdVar3.c;
                            mzd mzdVar = xzdVar3.d;
                            av8 av8Var2 = (av8) of3Var2;
                            boolean g = av8Var2.g(function14);
                            Object O2 = av8Var2.O();
                            if (g || O2 == a99Var) {
                                O2 = new uj8(22, function14);
                                av8Var2.n0(O2);
                            }
                            aik.k(gv9Var, mzdVar, (Function1) O2, av8Var2, 0);
                            break;
                        default:
                            r70Var.getClass();
                            pzd pzdVar = xzdVar3.g;
                            av8 av8Var3 = (av8) of3Var2;
                            if (pzdVar == null) {
                                av8Var3.d0(2022147424);
                                av8Var3.s(false);
                            } else {
                                av8Var3.d0(2022147425);
                                gv9 gv9Var2 = xzdVar3.f;
                                boolean g2 = av8Var3.g(function14);
                                Object O3 = av8Var3.O();
                                if (g2 || O3 == a99Var) {
                                    O3 = new uj8(21, function14);
                                    av8Var3.n0(O3);
                                }
                                aik.l(gv9Var2, pzdVar, (Function1) O3, av8Var3, 0);
                                av8Var3.s(false);
                            }
                            function14.invoke(xzdVar3.g);
                            break;
                    }
                    return Unit.a;
                }
            }), av8Var, 1572870, 30);
            av8Var.s(true);
            Unit unit = Unit.a;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 6, xzdVar2, function1, function12, function13);
        }
    }

    public static final Object[] f0(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final g7f g(String str, d7f d7fVar) {
        str.getClass();
        if (StringsKt.R(str)) {
            a70.p("Blank serial names are prohibited");
            return null;
        }
        h7f.a(str);
        return new g7f(str, d7fVar);
    }

    public static final Object[] g0(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void h(int i, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-410336756);
        int i2 = i | 6;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            u23 a = t23.a(new ng0(24.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.error_already_subscribed_body, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            String v = oea.v(R.string.button_activate_free_month, av8Var);
            xtc d2 = bkh.d(utcVar, 1.0f);
            Object O = av8Var.O();
            if (O == nf3.a) {
                z = true;
                O = new wtf(1 == true ? 1 : 0);
                av8Var.n0(O);
            } else {
                z = true;
            }
            mha.h(v, (Function0) O, d2, null, null, false, false, false, 0L, 0, 0, av8Var, 197040, 0, 2008);
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i, 23);
        }
    }

    public static void h0() {
        BackupManager.dataChanged("com.sofascore.results");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(int i, int i2, of3 of3Var, final gv9 gv9Var, final Function1 function1) {
        int i3;
        final gv9 gv9Var2;
        final Function1 function12;
        av8 av8Var;
        zg3 zg3Var;
        long f;
        final int i4;
        Object obj;
        mv1 mv1Var = uxf.g;
        mv1 mv1Var2 = uxf.c;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(366846671);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Iterator it = gv9Var.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                } else if (((k7g) it.next()).a.getId() == i) {
                    break;
                } else {
                    i5++;
                }
            }
            final int i6 = i5;
            boolean z = i6 > 0;
            boolean z2 = i6 >= 0 && i6 < gv9Var.size() - 1;
            int i7 = i3 & 14;
            boolean z3 = i7 == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z3 || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it2 = gv9Var.iterator();
                while (it2.hasNext()) {
                    k7g k7gVar = (k7g) it2.next();
                    arrayList.add(new oxh(k7gVar.a, k7gVar.b, null, null, null, false, 252));
                }
                O = l6g.W(arrayList);
                av8Var2.n0(O);
            }
            gv9 gv9Var3 = (gv9) O;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z4 = z2;
            l8g a = k8g.a(ww9.b, uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc l = bkh.l(utcVar, 32.0f);
            if (z4) {
                zg3Var = zg3Var2;
                f = ljg.f(av8Var2, 758948574, R.color.bg_primary_tonal, av8Var2, false);
            } else {
                zg3Var = zg3Var2;
                f = ljg.f(av8Var2, 758949382, R.color.bg_primary_tonal_disabled, av8Var2, false);
            }
            xtc A = wnn.A(n9e.q(l, f, o7g.a(8.0f)), o7g.a(8.0f));
            int i8 = i3 & 896;
            boolean e = (i8 == 256) | (i7 == 4) | av8Var2.e(i6);
            Object O2 = av8Var2.O();
            if (e || O2 == a99Var) {
                i4 = 0;
                O2 = new Function0() { // from class: uxi
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i4;
                        int i10 = i6;
                        gv9 gv9Var4 = gv9Var;
                        Function1 function13 = function1;
                        switch (i9) {
                            case 0:
                                function13.invoke(Integer.valueOf(((k7g) gv9Var4.get(i10 + 1)).a.getId()));
                                break;
                            default:
                                function13.invoke(Integer.valueOf(((k7g) gv9Var4.get(i10 - 1)).a.getId()));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O2);
            } else {
                i4 = 0;
            }
            boolean z5 = i4;
            zg3 zg3Var3 = zg3Var;
            xtc b0 = l98.b0(tol.y(A, z4, false, false, 0L, null, (Function0) O2, av8Var2, 30), 4.0f);
            k1c c2 = e12.c(mv1Var2, z5);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, b0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            xtc l2 = bkh.l(utcVar, 16.0f);
            n12 n12Var = n12.a;
            kq9.b(s6a.N(R.drawable.ic_chevron_left_large_16, 6, av8Var2), null, n12Var.a(l2, mv1Var), z4 ? ljg.f(av8Var2, -1249686056, R.color.primary_default, av8Var2, z5) : ljg.f(av8Var2, -1249685249, R.color.action_primary_disabled, av8Var2, z5), av8Var2, 48, 0);
            av8Var2.s(true);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Iterator<E> it3 = gv9Var3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it3.next();
                    if (((TournamentRoundWrapper) ((oxh) obj).a).getId() == i) {
                        break;
                    }
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean z6 = i8 == 256 ? true : z5 ? 1 : 0;
            Object O3 = av8Var2.O();
            if (z6 || O3 == a99Var) {
                function12 = function1;
                O3 = new k1e(18, function12);
                av8Var2.n0(O3);
            } else {
                function12 = function1;
            }
            r4a.j(gv9Var3, oxhVar, (Function1) O3, null, null, false, l98.B(8.0f, 2), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 12582912, 888);
            av8Var = av8Var2;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            xtc A2 = wnn.A(n9e.q(bkh.l(utcVar, 32.0f), z ? ljg.f(av8Var, 758986686, R.color.bg_primary_tonal, av8Var, false) : ljg.f(av8Var, 758987494, R.color.bg_primary_tonal_disabled, av8Var, false), o7g.a(8.0f)), o7g.a(8.0f));
            boolean e2 = (i7 == 4) | (i8 == 256) | av8Var.e(i6);
            Object O4 = av8Var.O();
            if (e2 || O4 == a99Var) {
                gv9Var2 = gv9Var;
                final int i9 = 1;
                O4 = new Function0() { // from class: uxi
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i92 = i9;
                        int i10 = i6;
                        gv9 gv9Var4 = gv9Var2;
                        Function1 function13 = function12;
                        switch (i92) {
                            case 0:
                                function13.invoke(Integer.valueOf(((k7g) gv9Var4.get(i10 + 1)).a.getId()));
                                break;
                            default:
                                function13.invoke(Integer.valueOf(((k7g) gv9Var4.get(i10 - 1)).a.getId()));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O4);
            } else {
                gv9Var2 = gv9Var;
            }
            boolean z7 = z;
            xtc b02 = l98.b0(tol.y(A2, z7, false, false, 0L, null, (Function0) O4, av8Var, 30), 4.0f);
            k1c c3 = e12.c(mv1Var2, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b02);
            if3.k7.getClass();
            zg3 zg3Var4 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var4);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, hf3.g);
            waa.K(av8Var, m3, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C3, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, n12Var.a(bkh.l(utcVar, 16.0f), mv1Var), z7 ? ljg.f(av8Var, 733898913, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 733899720, R.color.action_primary_disabled, av8Var, false), av8Var, 48, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            gv9Var2 = gv9Var;
            function12 = function1;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(i, i2, gv9Var2, function12);
        }
    }

    public static final void i0(String str, kotlinx.serialization.json.b bVar) {
        bVar.getClass();
        throw new wfa("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + duf.a.getOrCreateKotlinClass(bVar.getClass()).getSimpleName() + '.', "Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final yll j(String str, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (StringsKt.R(str)) {
            a70.p("Blank serial names are prohibited");
            return null;
        }
        if (!str.equals(serialDescriptor.h())) {
            if (serialDescriptor.getKind() instanceof d7f) {
                h7f.a(str);
            }
            return new yll(str, serialDescriptor);
        }
        StringBuilder q = wt3.q("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        q.append(serialDescriptor.h());
        q.append(')');
        throw new IllegalArgumentException(q.toString().toString());
    }

    public static int j0(byte[] bArr, int i, tg0 tg0Var) {
        int q0 = q0(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            zzl.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - q0) {
            zzl.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            tg0Var.c = zzfp.b;
            return q0;
        }
        tg0Var.c = zzfp.s(q0, i2, bArr);
        return q0 + i2;
    }

    public static final void k(gv9 gv9Var, mzd mzdVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2115709607);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | (av8Var.e(mzdVar == null ? -1 : mzdVar.ordinal()) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    mzd mzdVar2 = (mzd) it.next();
                    String string = context.getString(mzdVar2.a);
                    string.getClass();
                    arrayList.add(new s1h(mzdVar2, string, true));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            mzd mzdVar3 = mzdVar == null ? (mzd) ((s1h) CollectionsKt.Y(gv9Var2)).a : mzdVar;
            xtc d2 = bkh.d(utc.a, 1.0f);
            boolean z2 = (i2 & 896) == 256;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new uj8(20, function1);
                av8Var.n0(O2);
            }
            l4a.a(gv9Var2, mzdVar3, (Function1) O2, d2, null, false, av8Var, 3072, 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(gv9Var, mzdVar, function1, i, 7);
        }
    }

    public static boolean k0(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static final void l(gv9 gv9Var, pzd pzdVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1654375);
        int i2 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.e(pzdVar.ordinal()) ? 32 : 16) | (av8Var2.i(function1) ? 256 : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var2.k(nz.b);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    pzd pzdVar2 = (pzd) it.next();
                    String string = context.getString(pzdVar2.a);
                    string.getClass();
                    Integer num = pzdVar2.c;
                    arrayList.add(new vt2(pzdVar2, string, false, num != null ? new tc3(1944809554, new wzd(num.intValue()), true) : null, null, null, null, 244));
                }
                O = l6g.W(arrayList);
                av8Var2.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            boolean z2 = (i2 & 896) == 256;
            Object O2 = av8Var2.O();
            if (z2 || O2 == a99Var) {
                O2 = new uj8(24, function1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            trh.a(gv9Var2, pzdVar, (Function1) O2, null, null, null, null, false, false, false, null, null, av8Var, i2 & 112, 4088);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(gv9Var, pzdVar, function1, i, 8);
        }
    }

    public static int l0(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static final void m(boolean z, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1804139811);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = l6g.K(new r1h("List", td3.a), new r1h("Graph", td3.b));
                av8Var.n0(O);
            }
            b7 b7Var = (b7) O;
            String str = z ? "List" : "Graph";
            xtc q = n9e.q(bkh.p(utc.a, 128.0f), lz.D(R.color.surface_P, av8Var), oyn.e);
            boolean z2 = (i2 & 112) == 32;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new uj8(23, function1);
                av8Var.n0(O2);
            }
            l4a.a(b7Var, str, (Function1) O2, q, null, false, av8Var, 6, 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new krc(z, function1, i, i3);
        }
    }

    public static int m0(qoo qooVar, int i, byte[] bArr, int i2, int i3, zzgu zzguVar, tg0 tg0Var) {
        Object zze = qooVar.zze();
        qoo qooVar2 = qooVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        tg0 tg0Var2 = tg0Var;
        int v0 = v0(zze, qooVar2, bArr2, i2, i4, tg0Var2);
        qooVar2.a(zze);
        tg0Var2.c = zze;
        zzguVar.add(zze);
        while (v0 < i4) {
            tg0 tg0Var3 = tg0Var2;
            int i5 = i4;
            int q0 = q0(bArr2, v0, tg0Var3);
            if (i != tg0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            qoo qooVar3 = qooVar2;
            Object zze2 = qooVar3.zze();
            v0 = v0(zze2, qooVar3, bArr3, q0, i5, tg0Var3);
            qooVar2 = qooVar3;
            bArr2 = bArr3;
            i4 = i5;
            tg0Var2 = tg0Var3;
            qooVar2.a(zze2);
            tg0Var2.c = zze2;
            zzguVar.add(zze2);
        }
        return v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x08dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final lki lkiVar, final boolean z, boolean z2, boolean z3, xtc xtcVar, boolean z4, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        int i2;
        boolean z5;
        Integer num;
        Integer valueOf;
        boolean h;
        Object O;
        boolean z6;
        long f;
        Object O2;
        boolean z7;
        e1d e1dVar;
        utc utcVar;
        znh znhVar;
        boolean z8;
        b7 b7Var;
        f50 f50Var;
        ry ryVar;
        f50 f50Var2;
        boolean z9;
        Function0 function0;
        float f2;
        ?? r7;
        char c2;
        int i3;
        ff3 ff3Var;
        av8 av8Var2;
        long f3;
        utc utcVar2;
        long j;
        av8 av8Var3;
        utc utcVar3;
        e1d e1dVar2;
        long j2;
        av8 av8Var4;
        float f4;
        bqh bqhVar;
        int i4;
        boolean z10;
        tc3 tc3Var;
        av8 av8Var5;
        jki jkiVar;
        float f5;
        long j3;
        bqh bqhVar2;
        long j4;
        av8 av8Var6;
        boolean z11;
        av8 av8Var7;
        av8 av8Var8;
        bqh bqhVar3;
        boolean z12;
        int i5;
        boolean h2;
        Object O3;
        float f6;
        Context context;
        int i6;
        boolean z13;
        int i7;
        int i8;
        Double valueOf2;
        float f7;
        av8 av8Var9;
        Double d2;
        long j5;
        iyf iyfVar;
        boolean z14;
        lkiVar.getClass();
        av8 av8Var10 = (av8) of3Var;
        av8Var10.f0(-1632695176);
        int i9 = i | (av8Var10.g(lkiVar) ? 4 : 2) | (av8Var10.h(z) ? 32 : 16) | (av8Var10.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var10.h(z3) ? a.o : 1024) | 24576 | (av8Var10.h(z4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var10.T(i9 & 1, (i9 & 74899) != 74898)) {
            utc utcVar4 = utc.a;
            Context context2 = (Context) av8Var10.k(nz.b);
            Object O4 = av8Var10.O();
            Object obj = nf3.a;
            if (O4 == obj) {
                O4 = e.f(Currency.getInstance(lkiVar.c.f));
                av8Var10.n0(O4);
            }
            e1d e1dVar3 = (e1d) O4;
            Object O5 = av8Var10.O();
            if (O5 == obj) {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency((Currency) e1dVar3.getValue());
                O5 = e.f(currencyInstance);
                av8Var10.n0(O5);
            }
            e1d e1dVar4 = (e1d) O5;
            boolean z15 = lkiVar.f == uv0.a && lkiVar.c.m != null;
            Object O6 = av8Var10.O();
            if (O6 == obj) {
                List S0 = CollectionsKt.S0(jki.g);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : S0) {
                    jki jkiVar2 = (jki) obj2;
                    if (z15) {
                        if (jkiVar2 != jki.e) {
                            arrayList.add(obj2);
                        }
                    } else if (jkiVar2 != jki.c) {
                        arrayList.add(obj2);
                    }
                }
                O6 = e.f(arrayList);
                av8Var10.n0(O6);
            }
            e1d e1dVar5 = (e1d) O6;
            Object O7 = av8Var10.O();
            Object obj3 = nf3.a;
            if (O7 == obj3) {
                O7 = e.f((!z15 || z) ? (z4 && lkiVar.a == eli.ADS && !z) ? jki.e : jki.d : jki.c);
                av8Var10.n0(O7);
            }
            e1d e1dVar6 = (e1d) O7;
            boolean g = av8Var10.g((List) e1dVar5.getValue());
            Object O8 = av8Var10.O();
            if (g || O8 == obj3) {
                jki jkiVar3 = (jki) e1dVar6.getValue();
                SubscriptionPriceBundle subscriptionPriceBundle = lkiVar.c;
                int ordinal = jkiVar3.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        Double d3 = subscriptionPriceBundle.c;
                        if (d3 != null) {
                            i2 = wzb.a(((d3.doubleValue() - subscriptionPriceBundle.b) / subscriptionPriceBundle.c.doubleValue()) * 100.0d);
                            O8 = e.c(i2);
                            av8Var10.n0(O8);
                        }
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return;
                        }
                        Double d4 = subscriptionPriceBundle.e;
                        Double d5 = subscriptionPriceBundle.d;
                        if (d4 != null && d5 != null) {
                            i2 = (int) (((d4.doubleValue() - d5.doubleValue()) / subscriptionPriceBundle.e.doubleValue()) * 100.0d);
                            O8 = e.c(i2);
                            av8Var10.n0(O8);
                        }
                    }
                }
                i2 = 0;
                O8 = e.c(i2);
                av8Var10.n0(O8);
            }
            znh znhVar2 = (znh) O8;
            boolean z16 = z3 && !z;
            jki jkiVar4 = (jki) e1dVar6.getValue();
            SubscriptionPriceBundle subscriptionPriceBundle2 = lkiVar.c;
            cu cuVar = subscriptionPriceBundle2.i;
            iyf iyfVar2 = subscriptionPriceBundle2.j;
            iyf iyfVar3 = subscriptionPriceBundle2.k;
            int ordinal2 = jkiVar4.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    switch (cuVar == null ? -1 : oki.a[cuVar.ordinal()]) {
                        case -1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            int i10 = iyfVar2 == null ? -1 : oki.b[iyfVar2.ordinal()];
                            if (i10 != -1) {
                                z14 = true;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3 && i10 != 4) {
                                            zzl.b();
                                            return;
                                        }
                                        z5 = false;
                                        break;
                                    }
                                    z5 = z14;
                                    break;
                                }
                                z5 = z14;
                            } else {
                                z5 = false;
                            }
                        case 0:
                        default:
                            zzl.b();
                            return;
                        case 1:
                        case 2:
                            z14 = true;
                            z5 = z14;
                            break;
                    }
                } else {
                    if (ordinal2 != 2) {
                        zzl.b();
                        return;
                    }
                    int i11 = iyfVar3 == null ? -1 : oki.b[iyfVar3.ordinal()];
                    if (i11 != -1) {
                        if (i11 != 1) {
                            if (i11 != 2 && i11 != 3) {
                                if (i11 != 4) {
                                    zzl.b();
                                    return;
                                }
                                z5 = false;
                            }
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                }
                if (!z5 && lkiVar.a == eli.AI) {
                    valueOf = Integer.valueOf(R.string.three_day_trial);
                } else if (z5 || lkiVar.a != eli.ADS) {
                    num = null;
                    h = av8Var10.h(z16);
                    O = av8Var10.O();
                    if (!h || O == obj3) {
                        O = z16 ? lkiVar.e : lkiVar.d;
                        av8Var10.n0(O);
                    }
                    gv9 gv9Var = (gv9) O;
                    if (z16) {
                        z6 = false;
                        f = ljg.f(av8Var10, -1356926874, R.color.on_color_primary, av8Var10, false);
                    } else {
                        z6 = false;
                        f = ljg.f(av8Var10, -1356926239, R.color.n_lv_1, av8Var10, false);
                    }
                    long f8 = z16 ? ljg.f(av8Var10, -1356924184, R.color.on_color_secondary, av8Var10, z6) : ljg.f(av8Var10, -1356923487, R.color.n_lv_3, av8Var10, z6);
                    long f9 = z16 ? ljg.f(av8Var10, -1356921402, R.color.on_color_primary, av8Var10, z6) : ljg.f(av8Var10, -1356920757, R.color.primary_default, av8Var10, z6);
                    O2 = av8Var10.O();
                    if (O2 == obj3) {
                        if (lkiVar.c.l != null) {
                            String string = context2.getString(R.string.first_six_months_discounted, ((NumberFormat) e1dVar4.getValue()).format(lkiVar.c.l.doubleValue()));
                            NumberFormat numberFormat = (NumberFormat) e1dVar4.getValue();
                            SubscriptionPriceBundle subscriptionPriceBundle3 = lkiVar.c;
                            Double d6 = subscriptionPriceBundle3.c;
                            O2 = l6g.K(string, context2.getString(R.string.after_six_months_renews, numberFormat.format(d6 != null ? d6.doubleValue() : subscriptionPriceBundle3.b)));
                        } else {
                            O2 = rlh.b;
                        }
                        av8Var10.n0(O2);
                    }
                    b7 b7Var2 = (b7) O2;
                    z7 = ((jki) e1dVar6.getValue()) != jki.e && lkiVar.a == eli.ADS && ((iyfVar = lkiVar.c.k) == iyf.d || iyfVar == iyf.c);
                    xtc A = wnn.A(utcVar4, o7g.a(16.0f));
                    k1c c3 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var10.T);
                    aee m = av8Var10.m();
                    xtc C = fqj.C(av8Var10, A);
                    if3.k7.getClass();
                    Function0 function02 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(function02);
                    } else {
                        av8Var10.q0();
                    }
                    f50 f50Var3 = hf3.g;
                    waa.K(av8Var10, c3, f50Var3);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var10, m, ff3Var2);
                    Integer valueOf3 = Integer.valueOf(hashCode);
                    f50 f50Var4 = hf3.j;
                    waa.K(av8Var10, valueOf3, f50Var4);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var10, ryVar2);
                    f50 f50Var5 = hf3.d;
                    waa.K(av8Var10, C, f50Var5);
                    n12 n12Var = n12.a;
                    if (z16) {
                        av8Var10.d0(1393416609);
                        utcVar = utcVar4;
                        e1dVar = e1dVar6;
                        znhVar = znhVar2;
                        z8 = z16;
                        b7Var = b7Var2;
                        function0 = function02;
                        ryVar = ryVar2;
                        f2 = 16.0f;
                        f50Var = f50Var5;
                        ff3Var = ff3Var2;
                        z9 = z5;
                        r7 = 0;
                        c2 = 4;
                        i3 = 2;
                        f50Var2 = f50Var4;
                        wkn.k(haa.t(2131232923, 0, av8Var10), null, n12Var.b(utc.a), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var10, 24632, 104);
                        av8 av8Var11 = av8Var10;
                        av8Var11.s(false);
                        av8Var2 = av8Var11;
                    } else {
                        e1dVar = e1dVar6;
                        utcVar = utcVar4;
                        znhVar = znhVar2;
                        z8 = z16;
                        b7Var = b7Var2;
                        f50Var = f50Var5;
                        ryVar = ryVar2;
                        f50Var2 = f50Var4;
                        z9 = z5;
                        function0 = function02;
                        f2 = 16.0f;
                        r7 = 0;
                        c2 = 4;
                        i3 = 2;
                        av8 av8Var12 = av8Var10;
                        ff3Var = ff3Var2;
                        av8Var12.d0(1393686960);
                        av8Var12.s(false);
                        av8Var2 = av8Var12;
                    }
                    utc utcVar5 = utc.a;
                    if (z8) {
                        av8Var2.d0(-1894701347);
                        av8Var2.s(r7);
                        f3 = r13.i;
                    } else {
                        f3 = ljg.f(av8Var2, -1894700801, R.color.surface_1, av8Var2, r7);
                    }
                    xtc b0 = l98.b0(n9e.q(utcVar5, f3, o7g.a(f2)), f2);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, r7);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var3);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var);
                    if (z8) {
                        av8Var2.d0(-2145954314);
                        yf8 yf8Var = xth.a;
                        dfj c4 = xth.c();
                        String upperCase = oea.v(R.string.world_cup_special, av8Var2).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        j = f;
                        utcVar2 = utcVar5;
                        av8 av8Var13 = av8Var2;
                        udj.c(upperCase, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c4, av8Var13, 0, 0, 131066);
                        av8 av8Var14 = av8Var13;
                        av8Var14.s(false);
                        av8Var3 = av8Var14;
                    } else {
                        utcVar2 = utcVar5;
                        j = f;
                        av8Var2.d0(-2145740538);
                        av8Var2.s(false);
                        av8Var3 = av8Var2;
                    }
                    xtc d7 = bkh.d(utcVar2, 1.0f);
                    long j6 = j;
                    lv1 lv1Var = uxf.m;
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var3, 48);
                    utcVar3 = utcVar2;
                    int hashCode3 = Long.hashCode(av8Var3.T);
                    aee m3 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, d7);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(function0);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a2, f50Var3);
                    waa.K(av8Var3, m3, ff3Var);
                    bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
                    goa g2 = ljg.g(av8Var3, C3, f50Var, 1.0f, true);
                    e1dVar2 = e1dVar;
                    final long j7 = j6;
                    final znh znhVar3 = znhVar;
                    final boolean z17 = z8;
                    tc3 H = yqo.H(2120431699, av8Var3, new ct8() { // from class: mki
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            of3 of3Var2 = (of3) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            ((kb8) obj4).getClass();
                            av8 av8Var15 = (av8) of3Var2;
                            if (av8Var15.T(intValue & 1, (intValue & 17) != 16)) {
                                yf8 yf8Var2 = xth.a;
                                dfj j8 = xth.j();
                                lki lkiVar2 = lki.this;
                                udj.c(oea.v(lkiVar2.b, av8Var15), null, j7, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j8, av8Var15, 0, 0, 131066);
                                znh znhVar4 = znhVar3;
                                if (znhVar4.h() == 0 || z || lkiVar2.a != eli.AI || z17) {
                                    av8Var15.d0(-597229841);
                                    av8Var15.s(false);
                                } else {
                                    av8Var15.d0(-597820577);
                                    udj.c(oea.w(R.string.percent_off, new Object[]{yid.r(znhVar4.h())}, av8Var15), l98.c0(n9e.q(l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.success, av8Var15), o7g.a(2.0f)), 6.0f, 2.0f), lz.D(R.color.surface_1, av8Var15), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.c(), av8Var15, 0, 0, 130040);
                                    av8Var15.s(false);
                                }
                            } else {
                                av8Var15.W();
                            }
                            return Unit.a;
                        }
                    });
                    av8 av8Var15 = av8Var3;
                    int i12 = i3;
                    s02.n(g2, null, null, lv1Var, 0, 0, H, av8Var15, 1575936, 54);
                    av8 av8Var16 = av8Var15;
                    if (z) {
                        j2 = f8;
                        av8Var16.d0(-1090024726);
                        av8Var16.s(false);
                        av8Var4 = av8Var16;
                    } else {
                        ljg.r(8.0f, -1091628635, av8Var16, av8Var16, utcVar3);
                        int ordinal3 = ((jki) e1dVar2.getValue()).ordinal();
                        if (ordinal3 == 0) {
                            SubscriptionPriceBundle subscriptionPriceBundle4 = lkiVar.c;
                            Double d8 = subscriptionPriceBundle4.c;
                            valueOf2 = Double.valueOf((d8 != null ? d8.doubleValue() : subscriptionPriceBundle4.b) * 6.0d);
                        } else if (ordinal3 == 1) {
                            valueOf2 = lkiVar.c.c;
                        } else {
                            if (ordinal3 != i12) {
                                zzl.b();
                                return;
                            }
                            valueOf2 = lkiVar.c.e;
                        }
                        if (valueOf2 == null || z) {
                            valueOf2 = null;
                        }
                        if (valueOf2 == null) {
                            av8Var16.d0(-1091138216);
                            av8Var16.s(false);
                            utcVar3 = utcVar3;
                            j2 = f8;
                            f7 = 8.0f;
                            av8Var9 = av8Var16;
                        } else {
                            av8Var16.d0(-1091138215);
                            String format = ((NumberFormat) e1dVar4.getValue()).format(valueOf2.doubleValue());
                            format.getClass();
                            yf8 yf8Var2 = xth.a;
                            utcVar3 = utcVar3;
                            f7 = 8.0f;
                            udj.c(format, null, f8, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.d(), 0L, 0L, null, null, 0L, v8j.d, 0, 0, 0L, null, null, 0, 16773119), av8Var16, 0, 0, 131066);
                            j2 = f8;
                            av8 av8Var17 = av8Var16;
                            Unit unit = Unit.a;
                            av8Var17.s(false);
                            av8Var9 = av8Var17;
                        }
                        xtc f0 = l98.f0(utcVar3, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                        NumberFormat numberFormat2 = (NumberFormat) e1dVar4.getValue();
                        int ordinal4 = ((jki) e1dVar2.getValue()).ordinal();
                        if (ordinal4 == 0) {
                            d2 = lkiVar.c.l;
                        } else if (ordinal4 == 1) {
                            d2 = Double.valueOf(lkiVar.c.b);
                        } else {
                            if (ordinal4 != i12) {
                                zzl.b();
                                return;
                            }
                            d2 = lkiVar.c.d;
                        }
                        String format2 = numberFormat2.format(d2);
                        format2.getClass();
                        yf8 yf8Var3 = xth.a;
                        dfj j8 = xth.j();
                        if (((jki) e1dVar2.getValue()) == jki.c) {
                            j5 = ljg.f(av8Var9, -35164220, R.color.success, av8Var9, false);
                        } else {
                            av8Var9.d0(-35163647);
                            av8Var9.s(false);
                            j5 = j7;
                        }
                        av8 av8Var18 = av8Var9;
                        udj.c(format2, f0, j5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j8, av8Var18, 48, 0, 131064);
                        av8 av8Var19 = av8Var18;
                        av8Var19.s(false);
                        av8Var4 = av8Var19;
                    }
                    av8Var4.s(true);
                    if (lkiVar.a == eli.AI || z15) {
                        f4 = 0.0f;
                        utc utcVar6 = utcVar3;
                        if (z) {
                            bqhVar = null;
                            i4 = 0;
                            av8Var4.d0(-2140655546);
                            av8Var4.s(false);
                            av8Var5 = av8Var4;
                        } else {
                            av8Var4.d0(-2142216210);
                            t3e t3eVar = new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            xtc d0 = l98.d0(l98.f0(bkh.d(utcVar6, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                            av8Var4.d0(762189310);
                            List<jki> list = (List) e1dVar5.getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                            for (jki jkiVar5 : list) {
                                String v = oea.v(jkiVar5.a, av8Var4);
                                hrh hrhVar = hrh.m;
                                if (jkiVar5.b != null) {
                                    av8Var4.d0(1274322490);
                                    tc3 H2 = yqo.H(312813092, av8Var4, new ef8(i12, jkiVar5, e1dVar2));
                                    av8Var4.s(false);
                                    tc3Var = H2;
                                } else {
                                    av8Var4.d0(1274866788);
                                    av8Var4.s(false);
                                    tc3Var = null;
                                }
                                arrayList2.add(new vt2(jkiVar5, v, false, null, tc3Var, hrhVar, null, 204));
                                i12 = 2;
                            }
                            av8Var4.s(false);
                            gv9 W = l6g.W(arrayList2);
                            jki jkiVar6 = (jki) e1dVar2.getValue();
                            Object O9 = av8Var4.O();
                            if (O9 == nf3.a) {
                                O9 = new eqh(3, e1dVar2);
                                av8Var4.n0(O9);
                            }
                            av8 av8Var20 = av8Var4;
                            trh.a(W, jkiVar6, (Function1) O9, d0, null, t3eVar, null, false, false, false, null, null, av8Var20, 200064, 4048);
                            av8 av8Var21 = av8Var20;
                            if (z7) {
                                av8Var21.d0(-2140815506);
                                context2.getClass();
                                SharedPreferences sharedPreferences = uic.j;
                                if (sharedPreferences == null) {
                                    Context applicationContext = context2.getApplicationContext();
                                    synchronized (uic.i) {
                                        sharedPreferences = a5f.d(applicationContext);
                                        uic.j = sharedPreferences;
                                    }
                                    sharedPreferences.getClass();
                                }
                                bqhVar = null;
                                z10 = 0;
                                qha.j(sharedPreferences.getLong("PREF_REMOVE_ADS_YEARLY_OFFER_LAST_SHOWN_TIMESTAMP", 0L), null, av8Var21, 0);
                                av8Var21.s(false);
                            } else {
                                bqhVar = null;
                                z10 = 0;
                                av8Var21.d0(-2140669434);
                                av8Var21.s(false);
                            }
                            av8Var21.s(z10);
                            av8Var5 = av8Var21;
                            i4 = z10;
                        }
                    } else {
                        av8Var4.d0(-2142569672);
                        xtc f02 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                        String v2 = oea.v(R.string.monthly_subscription, av8Var4);
                        yf8 yf8Var4 = xth.a;
                        av8 av8Var22 = av8Var4;
                        f4 = 0.0f;
                        udj.c(v2, f02, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var22, 48, 0, 131064);
                        av8 av8Var23 = av8Var22;
                        i4 = 0;
                        av8Var23.s(false);
                        bqhVar = null;
                        av8Var5 = av8Var23;
                    }
                    jkiVar = (jki) e1dVar2.getValue();
                    float f10 = 8.0f;
                    if (jkiVar == jki.c) {
                        av8Var5.d0(-2140568064);
                        ListIterator<Object> listIterator = b7Var.listIterator(i4);
                        av8 av8Var24 = av8Var5;
                        while (listIterator.hasNext()) {
                            String str = (String) listIterator.next();
                            str.getClass();
                            av8 av8Var25 = av8Var24;
                            long j9 = j7;
                            v9g.f(str, l98.d0(utc.a, f4, f10, 1), j9, f9, av8Var25, 48, 0);
                            bqhVar = bqhVar;
                            av8Var24 = av8Var25;
                            f10 = f10;
                            j7 = j9;
                        }
                        long j10 = j7;
                        f5 = f10;
                        j3 = j10;
                        bqhVar2 = bqhVar;
                        j4 = f9;
                        av8Var24.s(false);
                        av8Var6 = av8Var24;
                    } else {
                        f5 = 8.0f;
                        j3 = j7;
                        bqhVar2 = bqhVar;
                        j4 = f9;
                        av8Var5.d0(-2140206542);
                        Iterator<E> it = gv9Var.iterator();
                        av8 av8Var26 = av8Var5;
                        while (it.hasNext()) {
                            av8 av8Var27 = av8Var26;
                            v9g.f(((r9k) it.next()).a(av8Var26), l98.d0(utc.a, f4, 8.0f, 1), j3, j4, av8Var27, 48, 0);
                            av8Var26 = av8Var27;
                        }
                        av8Var26.s(false);
                        av8Var6 = av8Var26;
                    }
                    if (z7 || z) {
                        z11 = false;
                        av8Var6.d0(-2139462170);
                        av8Var6.s(false);
                        av8Var7 = av8Var6;
                    } else {
                        av8Var6.d0(-2139776417);
                        av8 av8Var28 = av8Var6;
                        v9g.f(oea.v(R.string.first_year_half_price_then_full, av8Var6), l98.d0(utc.a, f4, f5, 1), j3, j4, av8Var28, 48, 0);
                        av8 av8Var29 = av8Var28;
                        z11 = false;
                        av8Var29.s(false);
                        av8Var7 = av8Var29;
                    }
                    if (num == null) {
                        av8Var7.d0(-2139419515);
                        av8Var7.s(z11);
                        av8Var8 = av8Var7;
                    } else {
                        av8Var7.d0(-2139419514);
                        av8 av8Var30 = av8Var7;
                        v9g.f(oea.v(num.intValue(), av8Var7), l98.d0(utc.a, f4, f5, 1), j3, j4, av8Var30, 48, 0);
                        av8 av8Var31 = av8Var30;
                        Unit unit2 = Unit.a;
                        av8Var31.s(false);
                        av8Var8 = av8Var31;
                    }
                    utc utcVar7 = utc.a;
                    nq8.h(av8Var8, bkh.e(utcVar7, 16.0f));
                    if (z) {
                        av8Var8.d0(762283588);
                        bqh bqhVar4 = new bqh(s6a.N(R.drawable.ic_tv_channel_checkmark, 6, av8Var8), uxf.q);
                        av8Var8.s(false);
                        bqhVar3 = bqhVar4;
                    } else {
                        av8Var8.d0(-2138906527);
                        av8Var8.s(false);
                        bqhVar3 = bqhVar2;
                    }
                    xtc d9 = bkh.d(utcVar7, 1.0f);
                    if (z) {
                        i5 = R.string.button_subscribed;
                        z12 = z9;
                    } else {
                        z12 = z9;
                        i5 = z12 ? R.string.button_start_free_trial : R.string.button_subscribe_now;
                    }
                    String v3 = oea.v(i5, av8Var8);
                    boolean z18 = !z;
                    h2 = ((i9 & 14) == 4) | av8Var8.h(z12) | av8Var8.i(context2);
                    O3 = av8Var8.O();
                    if (!h2 || O3 == nf3.a) {
                        f6 = f4;
                        context = context2;
                        i6 = 2;
                        Object b93Var = new b93(lkiVar, z12, context, e1dVar2, 6);
                        av8Var8.n0(b93Var);
                        O3 = b93Var;
                    } else {
                        f6 = f4;
                        context = context2;
                        i6 = 2;
                    }
                    float f11 = f6;
                    av8 av8Var32 = av8Var8;
                    mha.h(v3, (Function0) O3, d9, null, bqhVar3, z18, false, false, 0L, 0, 0, av8Var32, 384, 0, 1992);
                    av8Var = av8Var32;
                    if (z) {
                        av8Var.d0(-2136299457);
                        av8Var.d0(762375541);
                        xtc d10 = bkh.d(l98.f0(utcVar7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
                        if (z2) {
                            long D = lz.D(R.color.n_lv_4, av8Var);
                            Object O10 = av8Var.O();
                            Object obj4 = nf3.a;
                            if (O10 == obj4) {
                                O10 = mz1.e(av8Var);
                            }
                            wzc wzcVar = (wzc) O10;
                            Object[] objArr = new Object[0];
                            Object O11 = av8Var.O();
                            if (O11 == obj4) {
                                O11 = nuh.e;
                                av8Var.n0(O11);
                            }
                            xtc y = tol.y(utcVar7, true, true, true, D, wzcVar, new he7((boh) o3a.N(objArr, (Function0) O11, av8Var, 48), context, i6), av8Var, 0);
                            av8Var = av8Var;
                            d10 = d10.z(y);
                        }
                        av8Var.s(false);
                        xtc d02 = l98.d0(d10, f11, 4.0f, 1);
                        String v4 = oea.v(z2 ? R.string.manage_subscription : R.string.manage_original_purchase_device, av8Var);
                        yf8 yf8Var5 = xth.a;
                        dfj b2 = xth.b();
                        if (z2) {
                            i7 = 762393487;
                            i8 = R.color.primary_default;
                            z13 = false;
                        } else {
                            z13 = false;
                            i7 = 762394277;
                            i8 = R.color.n_lv_3;
                        }
                        av8 av8Var33 = av8Var;
                        udj.c(v4, d02, ljg.f(av8Var, i7, i8, av8Var, z13), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, b2, av8Var33, 0, 0, 130040);
                        av8Var = av8Var33;
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-2135540794);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                } else {
                    valueOf = Integer.valueOf(R.string.seven_day_trial);
                }
                num = valueOf;
                h = av8Var10.h(z16);
                O = av8Var10.O();
                if (!h) {
                }
                O = z16 ? lkiVar.e : lkiVar.d;
                av8Var10.n0(O);
                gv9 gv9Var2 = (gv9) O;
                if (z16) {
                }
                long f82 = z16 ? ljg.f(av8Var10, -1356924184, R.color.on_color_secondary, av8Var10, z6) : ljg.f(av8Var10, -1356923487, R.color.n_lv_3, av8Var10, z6);
                long f92 = z16 ? ljg.f(av8Var10, -1356921402, R.color.on_color_primary, av8Var10, z6) : ljg.f(av8Var10, -1356920757, R.color.primary_default, av8Var10, z6);
                O2 = av8Var10.O();
                if (O2 == obj3) {
                }
                b7 b7Var22 = (b7) O2;
                if (((jki) e1dVar6.getValue()) != jki.e) {
                }
                xtc A2 = wnn.A(utcVar4, o7g.a(16.0f));
                k1c c32 = e12.c(uxf.c, false);
                int hashCode4 = Long.hashCode(av8Var10.T);
                aee m4 = av8Var10.m();
                xtc C4 = fqj.C(av8Var10, A2);
                if3.k7.getClass();
                Function0 function022 = hf3.b;
                av8Var10.h0();
                if (av8Var10.S) {
                }
                f50 f50Var32 = hf3.g;
                waa.K(av8Var10, c32, f50Var32);
                ff3 ff3Var22 = hf3.f;
                waa.K(av8Var10, m4, ff3Var22);
                Integer valueOf32 = Integer.valueOf(hashCode4);
                f50 f50Var42 = hf3.j;
                waa.K(av8Var10, valueOf32, f50Var42);
                ry ryVar22 = hf3.k;
                waa.J(av8Var10, ryVar22);
                f50 f50Var52 = hf3.d;
                waa.K(av8Var10, C4, f50Var52);
                n12 n12Var2 = n12.a;
                if (z16) {
                }
                utc utcVar52 = utc.a;
                if (z8) {
                }
                xtc b02 = l98.b0(n9e.q(utcVar52, f3, o7g.a(f2)), f2);
                u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, r7);
                int hashCode22 = Long.hashCode(av8Var2.T);
                aee m22 = av8Var2.m();
                xtc C22 = fqj.C(av8Var2, b02);
                av8Var2.h0();
                if (av8Var2.S) {
                }
                waa.K(av8Var2, a3, f50Var32);
                waa.K(av8Var2, m22, ff3Var);
                bf3.s(hashCode22, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C22, f50Var);
                if (z8) {
                }
                xtc d72 = bkh.d(utcVar2, 1.0f);
                long j62 = j;
                lv1 lv1Var2 = uxf.m;
                l8g a22 = k8g.a(ww9.b, lv1Var2, av8Var3, 48);
                utcVar3 = utcVar2;
                int hashCode32 = Long.hashCode(av8Var3.T);
                aee m32 = av8Var3.m();
                xtc C32 = fqj.C(av8Var3, d72);
                av8Var3.h0();
                if (av8Var3.S) {
                }
                waa.K(av8Var3, a22, f50Var32);
                waa.K(av8Var3, m32, ff3Var);
                bf3.s(hashCode32, av8Var3, f50Var2, av8Var3, ryVar);
                goa g22 = ljg.g(av8Var3, C32, f50Var, 1.0f, true);
                e1dVar2 = e1dVar;
                final long j72 = j62;
                final znh znhVar32 = znhVar;
                final boolean z172 = z8;
                tc3 H3 = yqo.H(2120431699, av8Var3, new ct8() { // from class: mki
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj42, Object obj5, Object obj6) {
                        of3 of3Var2 = (of3) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        ((kb8) obj42).getClass();
                        av8 av8Var152 = (av8) of3Var2;
                        if (av8Var152.T(intValue & 1, (intValue & 17) != 16)) {
                            yf8 yf8Var22 = xth.a;
                            dfj j82 = xth.j();
                            lki lkiVar2 = lki.this;
                            udj.c(oea.v(lkiVar2.b, av8Var152), null, j72, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j82, av8Var152, 0, 0, 131066);
                            znh znhVar4 = znhVar32;
                            if (znhVar4.h() == 0 || z || lkiVar2.a != eli.AI || z172) {
                                av8Var152.d0(-597229841);
                                av8Var152.s(false);
                            } else {
                                av8Var152.d0(-597820577);
                                udj.c(oea.w(R.string.percent_off, new Object[]{yid.r(znhVar4.h())}, av8Var152), l98.c0(n9e.q(l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.success, av8Var152), o7g.a(2.0f)), 6.0f, 2.0f), lz.D(R.color.surface_1, av8Var152), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.c(), av8Var152, 0, 0, 130040);
                                av8Var152.s(false);
                            }
                        } else {
                            av8Var152.W();
                        }
                        return Unit.a;
                    }
                });
                av8 av8Var152 = av8Var3;
                int i122 = i3;
                s02.n(g22, null, null, lv1Var2, 0, 0, H3, av8Var152, 1575936, 54);
                av8 av8Var162 = av8Var152;
                if (z) {
                }
                av8Var4.s(true);
                if (lkiVar.a == eli.AI) {
                }
                f4 = 0.0f;
                utc utcVar62 = utcVar3;
                if (z) {
                }
                jkiVar = (jki) e1dVar2.getValue();
                float f102 = 8.0f;
                if (jkiVar == jki.c) {
                }
                if (z7) {
                }
                z11 = false;
                av8Var6.d0(-2139462170);
                av8Var6.s(false);
                av8Var7 = av8Var6;
                if (num == null) {
                }
                utc utcVar72 = utc.a;
                nq8.h(av8Var8, bkh.e(utcVar72, 16.0f));
                if (z) {
                }
                xtc d92 = bkh.d(utcVar72, 1.0f);
                if (z) {
                }
                String v32 = oea.v(i5, av8Var8);
                boolean z182 = !z;
                h2 = ((i9 & 14) == 4) | av8Var8.h(z12) | av8Var8.i(context2);
                O3 = av8Var8.O();
                if (h2) {
                }
                f6 = f4;
                context = context2;
                i6 = 2;
                Object b93Var2 = new b93(lkiVar, z12, context, e1dVar2, 6);
                av8Var8.n0(b93Var2);
                O3 = b93Var2;
                float f112 = f6;
                av8 av8Var322 = av8Var8;
                mha.h(v32, (Function0) O3, d92, null, bqhVar3, z182, false, false, 0L, 0, 0, av8Var322, 384, 0, 1992);
                av8Var = av8Var322;
                if (z) {
                }
                av8Var.s(true);
                av8Var.s(true);
                xtcVar2 = utcVar;
            }
            z5 = false;
            if (!z5) {
            }
            if (z5) {
            }
            num = null;
            h = av8Var10.h(z16);
            O = av8Var10.O();
            if (!h) {
            }
            O = z16 ? lkiVar.e : lkiVar.d;
            av8Var10.n0(O);
            gv9 gv9Var22 = (gv9) O;
            if (z16) {
            }
            long f822 = z16 ? ljg.f(av8Var10, -1356924184, R.color.on_color_secondary, av8Var10, z6) : ljg.f(av8Var10, -1356923487, R.color.n_lv_3, av8Var10, z6);
            long f922 = z16 ? ljg.f(av8Var10, -1356921402, R.color.on_color_primary, av8Var10, z6) : ljg.f(av8Var10, -1356920757, R.color.primary_default, av8Var10, z6);
            O2 = av8Var10.O();
            if (O2 == obj3) {
            }
            b7 b7Var222 = (b7) O2;
            if (((jki) e1dVar6.getValue()) != jki.e) {
            }
            xtc A22 = wnn.A(utcVar4, o7g.a(16.0f));
            k1c c322 = e12.c(uxf.c, false);
            int hashCode42 = Long.hashCode(av8Var10.T);
            aee m42 = av8Var10.m();
            xtc C42 = fqj.C(av8Var10, A22);
            if3.k7.getClass();
            Function0 function0222 = hf3.b;
            av8Var10.h0();
            if (av8Var10.S) {
            }
            f50 f50Var322 = hf3.g;
            waa.K(av8Var10, c322, f50Var322);
            ff3 ff3Var222 = hf3.f;
            waa.K(av8Var10, m42, ff3Var222);
            Integer valueOf322 = Integer.valueOf(hashCode42);
            f50 f50Var422 = hf3.j;
            waa.K(av8Var10, valueOf322, f50Var422);
            ry ryVar222 = hf3.k;
            waa.J(av8Var10, ryVar222);
            f50 f50Var522 = hf3.d;
            waa.K(av8Var10, C42, f50Var522);
            n12 n12Var22 = n12.a;
            if (z16) {
            }
            utc utcVar522 = utc.a;
            if (z8) {
            }
            xtc b022 = l98.b0(n9e.q(utcVar522, f3, o7g.a(f2)), f2);
            u23 a32 = t23.a(ww9.d, uxf.o, av8Var2, r7);
            int hashCode222 = Long.hashCode(av8Var2.T);
            aee m222 = av8Var2.m();
            xtc C222 = fqj.C(av8Var2, b022);
            av8Var2.h0();
            if (av8Var2.S) {
            }
            waa.K(av8Var2, a32, f50Var322);
            waa.K(av8Var2, m222, ff3Var);
            bf3.s(hashCode222, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C222, f50Var);
            if (z8) {
            }
            xtc d722 = bkh.d(utcVar2, 1.0f);
            long j622 = j;
            lv1 lv1Var22 = uxf.m;
            l8g a222 = k8g.a(ww9.b, lv1Var22, av8Var3, 48);
            utcVar3 = utcVar2;
            int hashCode322 = Long.hashCode(av8Var3.T);
            aee m322 = av8Var3.m();
            xtc C322 = fqj.C(av8Var3, d722);
            av8Var3.h0();
            if (av8Var3.S) {
            }
            waa.K(av8Var3, a222, f50Var322);
            waa.K(av8Var3, m322, ff3Var);
            bf3.s(hashCode322, av8Var3, f50Var2, av8Var3, ryVar);
            goa g222 = ljg.g(av8Var3, C322, f50Var, 1.0f, true);
            e1dVar2 = e1dVar;
            final long j722 = j622;
            final znh znhVar322 = znhVar;
            final boolean z1722 = z8;
            tc3 H32 = yqo.H(2120431699, av8Var3, new ct8() { // from class: mki
                @Override // defpackage.ct8
                public final Object invoke(Object obj42, Object obj5, Object obj6) {
                    of3 of3Var2 = (of3) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    ((kb8) obj42).getClass();
                    av8 av8Var1522 = (av8) of3Var2;
                    if (av8Var1522.T(intValue & 1, (intValue & 17) != 16)) {
                        yf8 yf8Var22 = xth.a;
                        dfj j82 = xth.j();
                        lki lkiVar2 = lki.this;
                        udj.c(oea.v(lkiVar2.b, av8Var1522), null, j722, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j82, av8Var1522, 0, 0, 131066);
                        znh znhVar4 = znhVar322;
                        if (znhVar4.h() == 0 || z || lkiVar2.a != eli.AI || z1722) {
                            av8Var1522.d0(-597229841);
                            av8Var1522.s(false);
                        } else {
                            av8Var1522.d0(-597820577);
                            udj.c(oea.w(R.string.percent_off, new Object[]{yid.r(znhVar4.h())}, av8Var1522), l98.c0(n9e.q(l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.success, av8Var1522), o7g.a(2.0f)), 6.0f, 2.0f), lz.D(R.color.surface_1, av8Var1522), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.c(), av8Var1522, 0, 0, 130040);
                            av8Var1522.s(false);
                        }
                    } else {
                        av8Var1522.W();
                    }
                    return Unit.a;
                }
            });
            av8 av8Var1522 = av8Var3;
            int i1222 = i3;
            s02.n(g222, null, null, lv1Var22, 0, 0, H32, av8Var1522, 1575936, 54);
            av8 av8Var1622 = av8Var1522;
            if (z) {
            }
            av8Var4.s(true);
            if (lkiVar.a == eli.AI) {
            }
            f4 = 0.0f;
            utc utcVar622 = utcVar3;
            if (z) {
            }
            jkiVar = (jki) e1dVar2.getValue();
            float f1022 = 8.0f;
            if (jkiVar == jki.c) {
            }
            if (z7) {
            }
            z11 = false;
            av8Var6.d0(-2139462170);
            av8Var6.s(false);
            av8Var7 = av8Var6;
            if (num == null) {
            }
            utc utcVar722 = utc.a;
            nq8.h(av8Var8, bkh.e(utcVar722, 16.0f));
            if (z) {
            }
            xtc d922 = bkh.d(utcVar722, 1.0f);
            if (z) {
            }
            String v322 = oea.v(i5, av8Var8);
            boolean z1822 = !z;
            h2 = ((i9 & 14) == 4) | av8Var8.h(z12) | av8Var8.i(context2);
            O3 = av8Var8.O();
            if (h2) {
            }
            f6 = f4;
            context = context2;
            i6 = 2;
            Object b93Var22 = new b93(lkiVar, z12, context, e1dVar2, 6);
            av8Var8.n0(b93Var22);
            O3 = b93Var22;
            float f1122 = f6;
            av8 av8Var3222 = av8Var8;
            mha.h(v322, (Function0) O3, d922, null, bqhVar3, z1822, false, false, 0L, 0, 0, av8Var3222, 384, 0, 1992);
            av8Var = av8Var3222;
            if (z) {
            }
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var10;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nki(lkiVar, z, z2, z3, xtcVar2, z4, i);
        }
    }

    public static int n0(byte[] bArr, int i, zzgu zzguVar, tg0 tg0Var) {
        pfo pfoVar = (pfo) zzguVar;
        int q0 = q0(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            zzl.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - q0) {
            zzl.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + q0;
        while (q0 < i3) {
            q0 = q0(bArr, q0, tg0Var);
            pfoVar.g(tg0Var.a);
        }
        if (q0 == i3) {
            return q0;
        }
        zzl.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static final void o(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        xtc xtcVar2;
        utc utcVar;
        boolean z;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(681186019);
        int i2 = 32;
        int i3 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        boolean z2 = true;
        boolean z3 = false;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, -1103661856, gv9Var);
            int i4 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                unj unjVar = (unj) next;
                tc3 H = yqo.H(1814747070, av8Var, new yk1(i4, gv9Var));
                boolean z4 = (i3 & 112) == i2 ? z2 : z3;
                Object O = av8Var.O();
                if (z4 || O == nf3.a) {
                    O = new o34(9, function1);
                    av8Var.n0(O);
                }
                aba.f(unjVar, null, Sports.BASKETBALL, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function2) O, k53.f, av8Var, 100688304, 104);
                z3 = z3;
                utcVar2 = utcVar2;
                i4 = i5;
                i3 = i3;
                z2 = true;
                i2 = 32;
            }
            boolean z5 = z3;
            utc utcVar3 = utcVar2;
            av8Var.s(z5);
            if (gv9Var.size() > 5) {
                av8Var.d0(147045279);
                xtc c0 = l98.c0(utcVar3, 16.0f, 4.0f);
                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                kq9.b(s6a.N(R.drawable.ic_warning, 6, av8Var), null, bkh.l(utcVar3, 16.0f), lz.D(R.color.value, av8Var), av8Var, 432, 0);
                String v = oea.v(R.string.disclaimer_rank_tied, av8Var);
                yf8 yf8Var = xth.a;
                utcVar = utcVar3;
                udj.c(v, l98.f0(utcVar3, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                z = true;
                av8Var.s(true);
                av8Var.s(z5);
            } else {
                utcVar = utcVar3;
                z = true;
                av8Var.d0(147773717);
                av8Var.s(z5);
            }
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(gv9Var, function1, xtcVar2, i, 2);
        }
    }

    public static int o0(byte[] bArr, int i, tg0 tg0Var) {
        int q0 = q0(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            zzl.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            tg0Var.c = "";
            return q0;
        }
        int i3 = aso.a;
        int length = bArr.length;
        if ((((length - q0) - i2) | q0 | i2) < 0) {
            yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(q0), Integer.valueOf(i2)});
            return 0;
        }
        int i4 = q0 + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (q0 < i4) {
            byte b2 = bArr[q0];
            if (b2 < 0) {
                break;
            }
            q0++;
            cArr[i5] = (char) b2;
            i5++;
        }
        while (q0 < i4) {
            int i6 = q0 + 1;
            byte b3 = bArr[q0];
            if (b3 >= 0) {
                cArr[i5] = (char) b3;
                i5++;
                q0 = i6;
                while (q0 < i4) {
                    byte b4 = bArr[q0];
                    if (b4 >= 0) {
                        q0++;
                        cArr[i5] = (char) b4;
                        i5++;
                    }
                }
            } else {
                if (b3 >= -32) {
                    if (b3 >= -16) {
                        if (i6 >= i4 - 2) {
                            zzl.v("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b5 = bArr[i6];
                        int i7 = q0 + 3;
                        byte b6 = bArr[q0 + 2];
                        q0 += 4;
                        byte b7 = bArr[i7];
                        if (!v8a.J(b5)) {
                            if ((((b5 + 112) + (b3 << 28)) >> 30) == 0 && !v8a.J(b6) && !v8a.J(b7)) {
                                int i8 = ((b5 & 63) << 12) | ((b3 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                i5 += 2;
                            }
                        }
                        zzl.v("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        zzl.v("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = q0 + 2;
                    byte b8 = bArr[i6];
                    q0 += 3;
                    byte b9 = bArr[i10];
                    if (!v8a.J(b8)) {
                        if (b3 == -32) {
                            if (b8 >= -96) {
                                b3 = -32;
                            }
                        }
                        if (b3 == -19) {
                            if (b8 < -96) {
                                b3 = -19;
                            }
                        }
                        if (!v8a.J(b9)) {
                            cArr[i5] = (char) (((b8 & 63) << 6) | ((b3 & 15) << 12) | (b9 & 63));
                            i5 = i9;
                        }
                    }
                    zzl.v("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    zzl.v("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                q0 += 2;
                byte b10 = bArr[i6];
                if (b3 < -62 || v8a.J(b10)) {
                    zzl.v("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b10 & 63) | ((b3 & 31) << 6));
                i5 = i11;
            }
        }
        tg0Var.c = new String(cArr, 0, i5);
        return i4;
    }

    public static final void p(xxi xxiVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        av8 av8Var;
        boolean z;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        ff3 ff3Var;
        utc utcVar;
        zg3 zg3Var;
        xtc xtcVar3;
        f50 f50Var3;
        float f;
        boolean z2;
        float f2;
        xxiVar.getClass();
        nn6 nn6Var = xxiVar.k;
        String str = xxiVar.g;
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(472520147);
        int i4 = i | (av8Var2.g(xxiVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024) | (av8Var2.i(function02) ? 16384 : 8192) | (av8Var2.i(function03) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 = i4 | 1572864;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i4 | (av8Var2.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            utc utcVar2 = utc.a;
            if (i5 != 0) {
                xtcVar2 = utcVar2;
            }
            xtc f0 = l98.f0(bkh.d(xtcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            xtc xtcVar4 = xtcVar2;
            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var2, a, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var2, C, f50Var6);
            int i6 = i3;
            q(xxiVar, function1, xxiVar.i ? function0 : null, av8Var2, i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (xxiVar.h != null) {
                av8Var2.d0(-1299230068);
                tol.b(dh3.n.a(ema.a), yqo.H(628408482, av8Var2, new s5h(16, xxiVar, function12)), av8Var2, 56);
                z = false;
                av8Var2.s(false);
            } else {
                z = false;
                av8Var2.d0(-1297514683);
                av8Var2.s(false);
            }
            if (str.length() > 0) {
                av8Var2.d0(-1297440283);
                xtc d2 = bkh.d(l98.c0(utcVar2, 16.0f, 8.0f), 1.0f);
                yf8 yf8Var = xth.a;
                f50Var = f50Var5;
                ff3Var = ff3Var2;
                xtcVar3 = xtcVar4;
                f = 16.0f;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var2 = f50Var6;
                z = false;
                f50Var3 = f50Var4;
                zg3Var = zg3Var2;
                udj.c(str, d2, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 48, 24960, 109560);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var6;
                ff3Var = ff3Var2;
                utcVar = utcVar2;
                zg3Var = zg3Var2;
                xtcVar3 = xtcVar4;
                f50Var3 = f50Var4;
                f = 16.0f;
                av8Var.d0(-1297030587);
                av8Var.s(z);
            }
            if (xxiVar.j) {
                av8Var.d0(-1296954358);
                xtc d3 = bkh.d(l98.c0(utcVar, f, 8.0f), 1.0f);
                String v = oea.v(R.string.comments, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(v, d3, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 48, 24960, 110584);
                if (nn6Var == null) {
                    av8Var.d0(-1296547267);
                    av8Var.s(z);
                    f2 = 1.0f;
                } else {
                    av8Var.d0(-1296547266);
                    f2 = 1.0f;
                    j72.g(nn6Var, function03, bkh.d(l98.c0(utcVar, f, 4.0f), 1.0f), av8Var, ((i6 >> 12) & 112) | 384);
                    Unit unit = Unit.a;
                    av8Var.s(z);
                }
                xtc f3 = vxd.f(utcVar, f, av8Var, utcVar, f2);
                k1c c2 = e12.c(uxf.g, z);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var3);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var2);
                mha.h(oea.v(R.string.join_the_discussion, av8Var), function02, kda.O(utcVar, "team_of_the_round_join_discussion", av8Var), tqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i6 >> 9) & 112) | 3072, 0, 2032);
                z2 = true;
                av8Var.s(true);
                av8Var.s(z);
            } else {
                z2 = true;
                av8Var.d0(-1295698331);
                av8Var.s(z);
            }
            av8Var.s(z2);
            xtcVar2 = xtcVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc3(xxiVar, function1, function12, function0, function02, function03, xtcVar2, i, i2);
        }
    }

    public static int p0(int i, byte[] bArr, int i2, int i3, zzir zzirVar, tg0 tg0Var) {
        if ((i >>> 3) == 0) {
            zzl.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int t0 = t0(bArr, i2, tg0Var);
            zzirVar.c(i, Long.valueOf(tg0Var.b));
            return t0;
        }
        if (i4 == 1) {
            zzirVar.c(i, Long.valueOf(x0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int q0 = q0(bArr, i2, tg0Var);
            int i5 = tg0Var.a;
            if (i5 < 0) {
                zzl.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - q0) {
                zzl.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                zzirVar.c(i, zzfp.b);
            } else {
                zzirVar.c(i, zzfp.s(q0, i5, bArr));
            }
            return q0 + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzirVar.c(i, Integer.valueOf(l0(i2, bArr)));
                return i2 + 4;
            }
            zzl.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zzir b2 = zzir.b();
        int i7 = tg0Var.d + 1;
        tg0Var.d = i7;
        y0(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int q02 = q0(bArr, i2, tg0Var);
            int i9 = tg0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = q02;
                break;
            }
            i2 = p0(i9, bArr, q02, i3, b2, tg0Var);
            i8 = i9;
        }
        tg0Var.d--;
        if (i2 > i3 || i8 != i6) {
            zzl.v("Failed to parse the message.");
            return 0;
        }
        zzirVar.c(i, b2);
        return i2;
    }

    public static final void q(xxi xxiVar, Function1 function1, Function0 function0, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-316146571);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xxiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d2 = bkh.d(utcVar, 1.0f);
            int i3 = i2;
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            goa g = ljg.g(av8Var, C2, f50Var3, 1.0f, true);
            String str = xxiVar.e;
            gv9 gv9Var = xxiVar.c;
            yf8 yf8Var = xth.a;
            udj.c(str, g, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            xtc O = kda.O(bkh.l(utcVar, 24.0f), "team_of_the_round_share", av8Var);
            boolean z = function0 != null;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            a99 a99Var = nf3.a;
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = nuh.l;
                av8Var.n0(O3);
            }
            kq9.b(s6a.N(R.drawable.ic_menu_list_share, 6, av8Var), null, tol.y(O, z, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), function0, 14), av8Var, 0), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
            av8Var.s(true);
            if (xxiVar.f != null) {
                av8Var.d0(-1973073899);
                udj.c(xxiVar.f, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(-1972866013);
                av8Var.s(false);
            }
            TournamentRoundWrapper tournamentRoundWrapper = xxiVar.d;
            if (tournamentRoundWrapper == null || gv9Var.isEmpty()) {
                av8Var.d0(-1972550557);
                av8Var.s(false);
            } else {
                av8Var.d0(-1972742757);
                i(tournamentRoundWrapper.getId(), (i3 << 3) & 896, av8Var, gv9Var, function1);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(xxiVar, function1, function0, i, 8);
        }
    }

    public static int q0(byte[] bArr, int i, tg0 tg0Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return r0(b2, bArr, i2, tg0Var);
        }
        tg0Var.a = b2;
        return i2;
    }

    public static final void r(j22 j22Var, Context context, fmj fmjVar, String str, int i, boolean z) {
        String u;
        context.getClass();
        str.getClass();
        TextView textView = (TextView) j22Var.g;
        TextView textView2 = j22Var.f;
        LinearLayout linearLayout = (LinearLayout) j22Var.o;
        TextView textView3 = (TextView) j22Var.h;
        ImageView imageView = (ImageView) j22Var.k;
        TextView textView4 = (TextView) j22Var.i;
        Player player = fmjVar.a;
        Team team = fmjVar.b;
        textView.setText(tba.t(player));
        as9.l((ImageView) j22Var.n, player.getId(), null);
        jei jeiVar = fmjVar.d;
        String str2 = jeiVar.b;
        boolean c2 = Intrinsics.c(jeiVar.a, context.getString(R.string.average_sofascore_rating));
        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) j22Var.j;
        if (c2) {
            sofascoreRatingView.setVisibility(0);
            textView4.setVisibility(8);
            sofascoreRatingView.setRating(str2);
        } else {
            sofascoreRatingView.setVisibility(8);
            textView4.setVisibility(0);
            textView4.setText(str2);
        }
        if (!str.equals(Sports.HANDBALL) || team == null) {
            u = dti.u(context, player.getGender(), str, player.getPosition(), false);
        } else {
            u = tba.p(context, team);
        }
        textView3.setText(u);
        if (team != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(0);
            as9.o(imageView, team.getId());
        } else {
            CharSequence text = textView3.getText();
            text.getClass();
            if (StringsKt.R(text)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
            }
        }
        if (!z) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(String.valueOf(i + 1));
        j22Var.b.setBackgroundColor(context.getColor(R.color.surface_P));
    }

    public static int r0(int i, byte[] bArr, int i2, tg0 tg0Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b2 >= 0) {
            tg0Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            tg0Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            tg0Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            tg0Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tg0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static final void s(j22 j22Var, Context context, loj lojVar, int i, boolean z) {
        context.getClass();
        ImageView imageView = (ImageView) j22Var.n;
        TextView textView = j22Var.f;
        TextView textView2 = (TextView) j22Var.i;
        Player player = lojVar.a;
        as9.l(imageView, player.getId(), null);
        ((TextView) j22Var.g).setText(tba.t(player));
        ((LinearLayout) j22Var.o).setVisibility(8);
        ((LinearLayout) j22Var.l).setVisibility(0);
        ImageView imageView2 = (ImageView) j22Var.c;
        Event event = lojVar.b;
        as9.o(imageView2, Event.getHomeTeam$default(event, null, 1, null).getId());
        j22Var.e.setText(String.valueOf(Event.getHomeScore$default(event, null, 1, null).getDisplay()));
        j22Var.d.setText(String.valueOf(Event.getAwayScore$default(event, null, 1, null).getDisplay()));
        as9.o(j22Var.m, Event.getAwayTeam$default(event, null, 1, null).getId());
        jei jeiVar = lojVar.c;
        String str = jeiVar.b;
        boolean c2 = Intrinsics.c(jeiVar.a, context.getString(R.string.sofascore_rating));
        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) j22Var.q;
        if (c2) {
            sofascoreSmallRatingView.setVisibility(0);
            textView2.setVisibility(8);
            SofascoreSmallRatingView.l(sofascoreSmallRatingView, str);
        } else {
            sofascoreSmallRatingView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        if (!z) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(String.valueOf(i + 1));
        j22Var.b.setBackgroundColor(context.getColor(R.color.surface_P));
    }

    public static int s0(int i, byte[] bArr, int i2, int i3, zzgu zzguVar, tg0 tg0Var) {
        pfo pfoVar = (pfo) zzguVar;
        int q0 = q0(bArr, i2, tg0Var);
        pfoVar.g(tg0Var.a);
        while (q0 < i3) {
            int q02 = q0(bArr, q0, tg0Var);
            if (i != tg0Var.a) {
                break;
            }
            q0 = q0(bArr, q02, tg0Var);
            pfoVar.g(tg0Var.a);
        }
        return q0;
    }

    public static final void t(j22 j22Var, Context context, noj nojVar, int i, boolean z, boolean z2) {
        context.getClass();
        ImageView imageView = (ImageView) j22Var.n;
        ImageView imageView2 = (ImageView) j22Var.k;
        TextView textView = j22Var.f;
        TextView textView2 = (TextView) j22Var.h;
        TextView textView3 = (TextView) j22Var.i;
        Team team = nojVar.a;
        as9.o(imageView, team.getId());
        ((TextView) j22Var.g).setText(tba.p(context, team));
        ((LinearLayout) j22Var.o).setVisibility(0);
        jei jeiVar = nojVar.b;
        String str = jeiVar.b;
        boolean c2 = Intrinsics.c(jeiVar.a, context.getString(R.string.average_sofascore_rating));
        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) j22Var.j;
        if (c2) {
            sofascoreRatingView.setVisibility(0);
            textView3.setVisibility(8);
            sofascoreRatingView.setRating(dti.n(Double.parseDouble(str), 2));
        } else {
            sofascoreRatingView.setVisibility(8);
            textView3.setVisibility(0);
            textView3.setText(str);
        }
        if (z) {
            textView.setVisibility(0);
            textView.setText(String.valueOf(i + 1));
            j22Var.b.setBackgroundColor(context.getColor(R.color.surface_P));
        } else {
            textView.setVisibility(8);
        }
        Country country = team.getCountry();
        if (z2) {
            if ((country != null ? country.getAlpha2() : null) != null) {
                imageView2.setVisibility(0);
                textView2.setVisibility(0);
                as9.c(imageView2, country.getAlpha2(), false, null, 4);
                textView2.setText(tv3.c(context, country.getName()));
                return;
            }
        }
        imageView2.setVisibility(8);
        textView2.setVisibility(8);
    }

    public static int t0(byte[] bArr, int i, tg0 tg0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            tg0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        tg0Var.b = j2;
        return i3;
    }

    public static final m5h u(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (StringsKt.R(str)) {
            a70.p("Blank serial names are prohibited");
            return null;
        }
        vv2 vv2Var = new vv2(str);
        function1.invoke(vv2Var);
        return new m5h(str, nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
    }

    public static int u0(Object obj, qoo qooVar, byte[] bArr, int i, int i2, int i3, tg0 tg0Var) {
        int i4 = tg0Var.d + 1;
        tg0Var.d = i4;
        y0(i4);
        int r = ((d) qooVar).r(obj, bArr, i, i2, i3, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return r;
    }

    public static m5h v(String str, SerialDescriptor[] serialDescriptorArr) {
        if (StringsKt.R(str)) {
            a70.p("Blank serial names are prohibited");
            return null;
        }
        vv2 vv2Var = new vv2(str);
        Unit unit = Unit.a;
        return new m5h(str, nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
    }

    public static int v0(Object obj, qoo qooVar, byte[] bArr, int i, int i2, tg0 tg0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = r0(i4, bArr, i3, tg0Var);
            i4 = tg0Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            zzl.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = tg0Var.d + 1;
        tg0Var.d = i6;
        y0(i6);
        int i7 = i5 + i4;
        qooVar.e(obj, bArr, i5, i7, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return i7;
    }

    public static final m5h w(String str, mha mhaVar, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (StringsKt.R(str)) {
            a70.p("Blank serial names are prohibited");
            return null;
        }
        if (mhaVar.equals(nii.f)) {
            a70.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        vv2 vv2Var = new vv2(str);
        function1.invoke(vv2Var);
        return new m5h(str, mhaVar, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
    }

    public static int w0(int i, byte[] bArr, int i2, int i3, tg0 tg0Var) {
        if ((i >>> 3) == 0) {
            zzl.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return t0(bArr, i2, tg0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return q0(bArr, i2, tg0Var) + tg0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            zzl.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = tg0Var.d + 1;
        tg0Var.d = i6;
        y0(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = q0(bArr, i2, tg0Var);
            i7 = tg0Var.a;
            if (i7 == i5) {
                break;
            }
            i2 = w0(i7, bArr, i2, i3, tg0Var);
        }
        tg0Var.d--;
        if (i2 <= i3 && i7 == i5) {
            return i2;
        }
        zzl.v("Failed to parse the message.");
        return 0;
    }

    public static m5h x(String str, mha mhaVar, SerialDescriptor[] serialDescriptorArr) {
        if (StringsKt.R(str)) {
            a70.p("Blank serial names are prohibited");
            return null;
        }
        if (mhaVar.equals(nii.f)) {
            a70.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        vv2 vv2Var = new vv2(str);
        Unit unit = Unit.a;
        return new m5h(str, mhaVar, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
    }

    public static long x0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int y(int i) {
        if (i < 3) {
            yqo.w(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void y0(int i) {
        if (i < 100) {
            return;
        }
        zzl.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static final void z(yea yeaVar, KSerializer kSerializer, KSerializer kSerializer2, String str) {
        SerialDescriptor descriptor = kSerializer2.getDescriptor();
        descriptor.getClass();
        yeaVar.getClass();
        hz8.Q(yeaVar, descriptor);
        if (s9a.m(descriptor).contains(str)) {
            String h = kSerializer.getDescriptor().h();
            String h2 = kSerializer2.getDescriptor().h();
            throw new wfa(mz1.o(mz1.s("Class '", h2, "' cannot be serialized ", (yeaVar.a.k == sv2.b && Intrinsics.c(h, h2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : dmi.j('\'', "as base class '", h), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String F(int i, int i2, byte[] bArr) {
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b2 = bArr[i];
                    if (b2 < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b3 = bArr[i];
                            if (b3 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b3;
                                while (i5 < i3) {
                                    byte b4 = bArr[i5];
                                    if (b4 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b4;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b3 < -32) {
                                if (i5 >= i3) {
                                    throw naa.d();
                                }
                                i += 2;
                                byte b5 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b3 < -62 || yfa.t(b5)) {
                                    throw naa.d();
                                }
                                cArr[i4] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b3 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw naa.d();
                                    }
                                    byte b6 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!yfa.t(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !yfa.t(b7) && !yfa.t(b8)) {
                                            int i10 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw naa.d();
                                }
                                if (i5 >= i3 - 1) {
                                    throw naa.d();
                                }
                                int i11 = i + 2;
                                byte b9 = bArr[i5];
                                i += 3;
                                byte b10 = bArr[i11];
                                int i12 = i4 + 1;
                                if (yfa.t(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || yfa.t(b10)))) {
                                    throw naa.d();
                                }
                                cArr[i4] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b2;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = w7a.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw naa.d();
                }
                return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        long j;
        long j2;
        int i4;
        char charAt2;
        char c2 = 2048;
        char c3 = 57343;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i5 = i2 + i;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + i;
                    if (i7 < i5 && (charAt = str.charAt(i6)) < 128) {
                        bArr[i7] = (byte) charAt;
                        i6++;
                    }
                    if (i6 != length) {
                        return i + length;
                    }
                    int i8 = i + i6;
                    while (i6 < length) {
                        char charAt3 = str.charAt(i6);
                        if (charAt3 < 128 && i8 < i5) {
                            bArr[i8] = (byte) charAt3;
                            i8++;
                        } else if (charAt3 < 2048 && i8 <= i5 - 2) {
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                            i8 += 2;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else {
                            if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i5 - 3) {
                                if (i8 > i5 - 4) {
                                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                        throw new dik(i6, length);
                                    }
                                    ogj.d(charAt3, i8);
                                    return 0;
                                }
                                int i10 = i6 + 1;
                                if (i10 != str.length()) {
                                    char charAt4 = str.charAt(i10);
                                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i8 + 3;
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i8 += 4;
                                        bArr[i11] = (byte) ((codePoint & 63) | 128);
                                        i6 = i10;
                                    } else {
                                        i6 = i10;
                                    }
                                }
                                throw new dik(i6 - 1, length);
                            }
                            bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                            int i12 = i8 + 2;
                            bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i8 += 3;
                            bArr[i12] = (byte) ((charAt3 & '?') | 128);
                        }
                        i6++;
                    }
                    return i8;
                }
                if (i6 != length) {
                }
                break;
            default:
                long j3 = i;
                long j4 = i2 + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i13 = 0;
                    while (true) {
                        j = 1;
                        if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                            vck.j(bArr, (byte) charAt2, j3);
                            i13++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i13 != length2) {
                        while (i13 < length2) {
                            char charAt5 = str.charAt(i13);
                            if (charAt5 < 128 && j3 < j4) {
                                vck.j(bArr, (byte) charAt5, j3);
                                j2 = j;
                                j3 += j;
                            } else if (charAt5 >= c2 || j3 > j4 - 2) {
                                j2 = j;
                                if ((charAt5 < 55296 || c3 < charAt5) && j3 <= j4 - 3) {
                                    vck.j(bArr, (byte) ((charAt5 >>> '\f') | 480), j3);
                                    long j5 = j3 + 2;
                                    vck.j(bArr, (byte) (((charAt5 >>> 6) & 63) | 128), j3 + j2);
                                    j3 += 3;
                                    vck.j(bArr, (byte) ((charAt5 & '?') | 128), j5);
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i14 = i13 + 1;
                                        if (i14 != length2) {
                                            char charAt6 = str.charAt(i14);
                                            if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                vck.j(bArr, (byte) ((codePoint2 >>> 18) | 240), j3);
                                                vck.j(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j3 + j2);
                                                long j6 = j3 + 3;
                                                vck.j(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), j3 + 2);
                                                j3 += 4;
                                                vck.j(bArr, (byte) ((codePoint2 & 63) | 128), j6);
                                                i13 = i14;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                        throw new dik(i13 - 1, length2);
                                    }
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i4 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i4)))) {
                                        throw new dik(i13, length2);
                                    }
                                    zzl.d(charAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                vck.j(bArr, (byte) ((charAt5 >>> 6) | 960), j3);
                                j3 += 2;
                                vck.j(bArr, (byte) ((charAt5 & '?') | 128), j7);
                            }
                            i13++;
                            j = j2;
                            c2 = 2048;
                            c3 = 57343;
                        }
                    }
                    return (int) j3;
                }
                yhk.f(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }
}
