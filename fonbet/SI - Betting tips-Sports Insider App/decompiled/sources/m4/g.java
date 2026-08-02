package m4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.n4;
import androidx.appcompat.widget.p4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import eg.c0;
import eg.i0;
import eg.x;
import gg.t;
import gg.u;
import gg.v;
import gg.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.a3;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.b6;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static long f20373a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f20374b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f20375c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f20376d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final u0.f A(CharSequence charSequence, String type) {
        Intrinsics.checkNotNullParameter(type, "errorType");
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new u0.g(charSequence);
                }
                break;
            case -408155724:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new u0.h(charSequence);
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new u0.e(1, charSequence);
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new u0.d(charSequence);
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new u0.i(charSequence);
                }
                break;
            case 1594095913:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new u0.e(2, charSequence);
                }
                break;
        }
        if (!z.o(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new u0.e(charSequence, type);
        }
        int i5 = u0.e.f24008c;
        String obj = charSequence != null ? charSequence.toString() : null;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            if (!z.o(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new y0.a();
            }
            int i10 = u0.e.f24008c;
            return ci.c.l(type, obj);
        } catch (y0.a unused) {
            return new u0.e(obj, type);
        }
    }

    public static String B(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final ExecutorService a(boolean z5) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new e3.d(z5));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
        return newFixedThreadPool;
    }

    public static final String b(Object[] objArr, int i5, int i10, kotlin.collections.h hVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i5 + i11];
            if (obj == hVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final void c(int i5, StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i10 = 0; i10 < i5; i10++) {
            builder.append("?");
            if (i10 < i5 - 1) {
                builder.append(StringUtils.COMMA);
            }
        }
    }

    public static final Object d(Task task, mf.c cVar) {
        eg.r a7 = c0.a();
        a7.J(new a2.j(10));
        int i5 = 0;
        task.f(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(2, new cc.a(a7, i5)));
        task.d(new cc.b(a7, i5));
        Object m6 = a7.m(cVar);
        lf.a aVar = lf.a.f20034a;
        return m6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(w wVar, Function0 function0, mf.c cVar) {
        t frame;
        int i5;
        try {
            if (cVar instanceof t) {
                frame = (t) cVar;
                int i10 = frame.f10102c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    frame.f10102c = i10 - Integer.MIN_VALUE;
                    Object obj = frame.f10101b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = frame.f10102c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        if (frame.getContext().r(x.f9237b) != wVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        frame.f10100a = function0;
                        frame.f10102c = 1;
                        eg.l lVar = new eg.l(1, lf.d.b(frame));
                        lVar.s();
                        ((v) wVar).l0(new u(0, lVar));
                        Object r5 = lVar.r();
                        if (r5 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (r5 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = frame.f10100a;
                        h8.b.B(obj);
                    }
                    function0.invoke();
                    return Unit.f19194a;
                }
            }
            if (i5 != 0) {
            }
            function0.invoke();
            return Unit.f19194a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
        frame = new t(cVar);
        Object obj2 = frame.f10101b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = frame.f10102c;
    }

    public static boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            h8.g.c();
            h8.g c2 = h8.g.c();
            c2.a();
            Context context = c2.f10401a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static int h(PorterDuff.Mode mode) {
        switch (u9.h.f24106a[mode.ordinal()]) {
            case 1:
                return 26;
            case 2:
                return 9;
            case 3:
                return 30;
            case 4:
                return 13;
            case 5:
                return 28;
            case 6:
                return 11;
            case 7:
                return 29;
            case 8:
                return 12;
            case 9:
                return 27;
            case 10:
                return 10;
            case 11:
                return 31;
            case 12:
                return 7;
            case 13:
                return 17;
            case 14:
                return 20;
            case 15:
                return 25;
            case 16:
                return 2;
            case 17:
                return 21;
            default:
                return 3;
        }
    }

    public static final m3.j j(m3.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new m3.j(oVar.f20331a, oVar.f20348t);
    }

    public static Set k() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static void l(b6 b6Var) {
        if (b6Var.getProfilingTracesDirPath() != null) {
            return;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            b6Var.setProfilingTracesDirPath(file.getAbsolutePath());
        } else {
            throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
        }
    }

    public static final Object m(g1.a aVar, g1.c key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object c2 = aVar.c(key);
        return c2 == null ? serializable : c2;
    }

    public static void n(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean o(Context context) {
        y4.a.C(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static char p(int i5) {
        switch (i5 / 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static char q(int i5) {
        switch (i5 % 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT >= 29) {
            return z2.a.c();
        }
        try {
            if (f20374b == null) {
                f20373a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f20374b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f20374b.invoke(null, Long.valueOf(f20373a))).booleanValue();
        } catch (Exception e7) {
            n("isTagEnabled", e7);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Intent intent) {
        int parseInt;
        int i5;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (x(intent)) {
            t(intent.getExtras(), "_nr");
        }
        int i10 = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : g()) {
            b5.f fVar = (b5.f) FirebaseMessaging.f6060m.get();
            if (fVar == null) {
                w0.d("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            g9.d dVar = null;
            r4 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            w0.m("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i5 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            h8.g c2 = h8.g.c();
                            try {
                                Object obj2 = b9.d.f3099m;
                                string = (String) d5.a(((b9.d) c2.b(b9.e.class)).d());
                            } catch (InterruptedException e7) {
                                e = e7;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e9) {
                            e = e9;
                        }
                    }
                    String str4 = string;
                    h8.g c8 = h8.g.c();
                    c8.a();
                    String packageName = c8.f10401a.getPackageName();
                    g9.b bVar = !h9.c.x(extras) ? g9.b.DISPLAY_NOTIFICATION : g9.b.DATA_MESSAGE;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i10 = 5;
                        } else if (objArr == 1) {
                            i10 = 10;
                        }
                        int i11 = i10;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str5 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str3 = string4;
                        }
                        String str6 = str3 != null ? str3 : "";
                        String string5 = extras.getString("collapse_key");
                        String str7 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str8 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str9 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e10) {
                                w0.n("FirebaseMessaging", "error parsing project number", e10);
                            }
                            dVar = new g9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i5, str6, str8, str9);
                        }
                        h8.g c10 = h8.g.c();
                        h8.i iVar = c10.f10403c;
                        c10.a();
                        str = iVar.f10419e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e11) {
                                w0.n("FirebaseMessaging", "error parsing sender ID", e11);
                            }
                            dVar = new g9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i5, str6, str8, str9);
                        }
                        c10.a();
                        str2 = iVar.f10416b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e12) {
                                        w0.n("FirebaseMessaging", "error parsing app ID", e12);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e13) {
                                w0.n("FirebaseMessaging", "error parsing app ID", e13);
                            }
                        }
                        dVar = new g9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i5, str6, str8, str9);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    } else {
                        objArr = 1;
                    }
                    if (objArr == 2) {
                    }
                    int i112 = i10;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str3 = string4;
                    }
                    if (str3 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    h8.g c102 = h8.g.c();
                    h8.i iVar2 = c102.f10403c;
                    c102.a();
                    str = iVar2.f10419e;
                    if (str != null) {
                    }
                    c102.a();
                    str2 = iVar2.f10416b;
                    if (str2.startsWith("1:")) {
                    }
                    dVar = new g9.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i112, i5, str6, str8, str9);
                }
                i5 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str42 = string;
                h8.g c82 = h8.g.c();
                c82.a();
                String packageName2 = c82.f10401a.getPackageName();
                g9.b bVar2 = !h9.c.x(extras) ? g9.b.DISPLAY_NOTIFICATION : g9.b.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i1122 = i10;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str3 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                h8.g c1022 = h8.g.c();
                h8.i iVar22 = c1022.f10403c;
                c1022.a();
                str = iVar22.f10419e;
                if (str != null) {
                }
                c1022.a();
                str2 = iVar22.f10416b;
                if (str2.startsWith("1:")) {
                }
                dVar = new g9.d(parseLong > 0 ? parseLong : 0L, str5, str42, bVar2, packageName2, str7, i1122, i5, str6, str8, str9);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((e5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new b5.c("proto"), new com.google.firebase.messaging.k(3)).o(new b5.a(new g9.e(dVar), new b5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            } catch (RuntimeException e14) {
                w0.n("FirebaseMessaging", "Failed to send big query analytics payload.", e14);
            }
        }
    }

    public static void t(Bundle bundle, String str) {
        try {
            h8.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e7) {
                    w0.n("FirebaseMessaging", "Error while parsing timestamp in GCM event", e7);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e9) {
                    w0.n("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e9);
                }
            }
            String str2 = h9.c.x(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            l8.b bVar = (l8.b) h8.g.c().b(l8.b.class);
            if (bVar != null) {
                ((l8.c) bVar).a("fcm", str, bundle2);
            } else {
                w0.m("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            w0.d("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final void u(int i5, int i10, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i5 < i10) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i5] = null;
            i5++;
        }
    }

    public static void v(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            n4.a(view, charSequence);
            return;
        }
        p4 p4Var = p4.f872k;
        if (p4Var != null && p4Var.f874a == view) {
            p4.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p4(view, charSequence);
            return;
        }
        p4 p4Var2 = p4.f873l;
        if (p4Var2 != null && p4Var2.f874a == view) {
            p4Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static boolean w(b6 b6Var, b6 b6Var2, boolean z5) {
        boolean z7 = io.sentry.util.h.f17164a;
        if (!z7 && (b6Var2.getVersionDetector() instanceof a3)) {
            b6Var2.setVersionDetector(new io.sentry.t(b6Var2, 1));
        }
        if (!b6Var2.getVersionDetector().a()) {
            return !z5 || b6Var == null || b6Var2.isForceInit() || b6Var.getInitPriority().ordinal() <= b6Var2.getInitPriority().ordinal();
        }
        b6Var2.getLogger().h(b5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(c1.n("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z7 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }

    public static boolean x(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int y(int i5) {
        return (int) (Integer.rotateLeft((int) (i5 * (-862048943)), 15) * 461845907);
    }

    public static final void z(Function2 function2, eg.a aVar, eg.a aVar2) {
        try {
            Continuation b10 = lf.d.b(lf.d.a(function2, aVar, aVar2));
            gf.o oVar = gf.q.f10031a;
            jg.h.f(Unit.f19194a, b10);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof i0) {
                th = ((i0) th).f9179a;
            }
            gf.o oVar2 = gf.q.f10031a;
            aVar2.resumeWith(h8.b.h(th));
            throw th;
        }
    }

    public abstract String f(byte[] bArr, int i5, int i10);

    public abstract int i(String str, byte[] bArr, int i5, int i10);
}
