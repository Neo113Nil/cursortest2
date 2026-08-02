package f3;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StatFs;
import android.webkit.MimeTypeMap;
import androidx.appcompat.app.v0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c1.q0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import eg.m0;
import eg.u1;
import gh.o0;
import io.sentry.ILogger;
import io.sentry.b2;
import io.sentry.b6;
import io.sentry.h4;
import j$.time.Instant;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import okio.FileSystem;
import okio.Path;
import sg.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x implements rg.b, rg.a {
    public static void B0(Parcel parcel, int i5) {
        parcel.setDataPosition(parcel.dataPosition() + z0(parcel, i5));
    }

    public static CopyOnWriteArrayList D0(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static Pair E0() {
        try {
            ea.a aVar = (ea.a) y3.m(ea.a.class, null, 6);
            String c2 = aVar.c();
            if (c2 == null) {
                c2 = aVar.d();
            }
            return new Pair("userId", c2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(File file, Function1 function1, mf.c cVar) {
        q0 q0Var;
        int i5;
        try {
            if (cVar instanceof q0) {
                q0Var = (q0) cVar;
                int i10 = q0Var.f3469c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    q0Var.f3469c = i10 - Integer.MIN_VALUE;
                    Object obj = q0Var.f3468b;
                    Object obj2 = lf.a.f20034a;
                    i5 = q0Var.f3469c;
                    if (i5 == 0) {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        File file2 = q0Var.f3467a;
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                    q0Var.f3467a = file;
                    q0Var.f3469c = 1;
                    Object invoke = function1.invoke(q0Var);
                    return invoke == obj2 ? obj2 : invoke;
                }
            }
            if (i5 == 0) {
            }
        } catch (IOException cause) {
            if (cause instanceof c1.b) {
                throw cause;
            }
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(cause, "cause");
            if (!file.exists()) {
                throw com.google.android.play.core.appupdate.b.d(file, cause);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw com.google.android.play.core.appupdate.b.d(file, cause);
                    }
                    throw com.google.android.play.core.appupdate.b.d(file, cause);
                }
                if (file.canWrite()) {
                    throw com.google.android.play.core.appupdate.b.d(file, cause);
                }
                throw com.google.android.play.core.appupdate.b.d(file, cause);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw com.google.android.play.core.appupdate.b.d(file, cause);
                }
                throw com.google.android.play.core.appupdate.b.d(file, cause);
            }
            if (file.canWrite()) {
                throw com.google.android.play.core.appupdate.b.d(file, cause);
            }
            throw com.google.android.play.core.appupdate.b.d(file, cause);
        }
        q0Var = new q0(cVar);
        Object obj3 = q0Var.f3468b;
        Object obj22 = lf.a.f20034a;
        i5 = q0Var.f3469c;
    }

    public static int F0(Parcel parcel) {
        int readInt = parcel.readInt();
        int z0 = z0(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new h6.a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i5 = z0 + dataPosition;
        if (i5 >= dataPosition && i5 <= parcel.dataSize()) {
            return i5;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i5).length());
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i5);
        throw new h6.a(sb2.toString(), parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = i0(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean G(int i5, Rect rect, Rect rect2, Rect rect3) {
        boolean H = H(i5, rect, rect2);
        if (H(i5, rect, rect3) || !H) {
            return false;
        }
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static void G0(Parcel parcel, int i5, int i10) {
        int z0 = z0(parcel, i5);
        if (z0 == i10) {
            return;
        }
        String hexString = Integer.toHexString(z0);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(z0).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(z0);
        throw new h6.a(d9.e.m(sb2, " (0x", hexString, ")"), parcel);
    }

    public static boolean H(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static int H0(int i5) {
        return (i5 >>> 1) ^ (-(i5 & 1));
    }

    public static void I0(Parcel parcel, int i5, int i10) {
        if (i5 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i5);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i5).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(i5);
        throw new h6.a(d9.e.m(sb2, " (0x", hexString, ")"), parcel);
    }

    public static final boolean J(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !Intrinsics.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!J((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!kotlin.collections.n.b((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static long J0(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static final int K(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i5 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i5 = (i5 * 31) + (obj instanceof Bundle ? K((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i5;
    }

    public static BigDecimal L(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + z0);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle M(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + z0);
        return readBundle;
    }

    public static byte[] N(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + z0);
        return createByteArray;
    }

    public static int[] O(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + z0);
        return createIntArray;
    }

    public static Parcelable P(Parcel parcel, int i5, Parcelable.Creator creator) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + z0);
        return parcelable;
    }

    public static v0 R(Object obj, Long l6, boolean z5, io.sentry.util.network.e eVar, List list, io.sentry.clientreport.a aVar) {
        LinkedHashMap e7;
        io.sentry.util.network.b d10 = z5 ? eVar.d(obj) : null;
        switch (aVar.f16276a) {
            case 1:
                gh.i0 req = (gh.i0) obj;
                Intrinsics.checkNotNullParameter(req, "req");
                e7 = io.sentry.okhttp.g.e(req.f10208c);
                break;
            default:
                o0 resp = (o0) obj;
                Intrinsics.checkNotNullParameter(resp, "resp");
                e7 = io.sentry.okhttp.g.e(resp.f10278f);
                break;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        for (Map.Entry entry : e7.entrySet()) {
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new v0(l6, d10, linkedHashMap, 22);
    }

    public static String S(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + z0);
        return readString;
    }

    public static String[] T(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + z0);
        return createStringArray;
    }

    public static ArrayList U(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + z0);
        return createStringArrayList;
    }

    public static Object[] V(Parcel parcel, int i5, Parcelable.Creator creator) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + z0);
        return createTypedArray;
    }

    public static ArrayList W(Parcel parcel, int i5, Parcelable.Creator creator) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + z0);
        return createTypedArrayList;
    }

    public static final v X(Context p02, e3.c p12) {
        k2.s i5;
        Intrinsics.checkNotNullParameter(p02, "context");
        Intrinsics.checkNotNullParameter(p12, "configuration");
        ExecutorService executorService = p12.f8477c;
        com.google.firebase.messaging.x p22 = new com.google.firebase.messaging.x();
        p22.f6184c = new Handler(Looper.getMainLooper());
        p22.f6185d = new e5.p(1, p22);
        k2.a0 a0Var = new k2.a0(executorService, 1);
        p22.f6182a = a0Var;
        p22.f6183b = eg.c0.l(a0Var);
        Context context = p02.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        k2.a0 executor = (k2.a0) p22.f6182a;
        Intrinsics.checkNotNullExpressionValue(executor, "getSerialTaskExecutor(...)");
        e3.l clock = p12.f8478d;
        boolean z5 = p02.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        Intrinsics.checkNotNullParameter(clock, "clock");
        int i10 = 0;
        if (z5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            i5 = new k2.s(context, WorkDatabase.class, null);
            i5.f18763i = true;
        } else {
            i5 = h8.b.i(context, WorkDatabase.class, "androidx.work.workdb");
            i5.f18762h = new q(context, i10);
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (i5.f18771s != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        i5.f18760f = executor;
        a callback = new a(clock);
        Intrinsics.checkNotNullParameter(callback, "callback");
        i5.f18758d.add(callback);
        i5.a(d.f9340h);
        i5.a(new g(context, 2, 3));
        i5.a(d.f9341i);
        i5.a(d.j);
        i5.a(new g(context, 5, 6));
        i5.a(d.f9342k);
        i5.a(d.f9343l);
        i5.a(d.f9344m);
        i5.a(new g(context));
        i5.a(new g(context, 10, 11));
        i5.a(d.f9336d);
        i5.a(d.f9337e);
        i5.a(d.f9338f);
        i5.a(d.f9339g);
        i5.a(new g(context, 21, 22));
        i5.f18769p = false;
        i5.q = true;
        i5.f18770r = true;
        WorkDatabase p32 = (WorkDatabase) i5.b();
        Context applicationContext = p02.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        c4.d p42 = new c4.d(applicationContext, p22);
        f p52 = new f(p02.getApplicationContext(), p12, p22, p32);
        w schedulersCreator = w.f9435a;
        Intrinsics.checkNotNullParameter(p02, "context");
        Intrinsics.checkNotNullParameter(p12, "configuration");
        Intrinsics.checkNotNullParameter(p22, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(p32, "workDatabase");
        Intrinsics.checkNotNullParameter(p42, "trackers");
        Intrinsics.checkNotNullParameter(p52, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        schedulersCreator.getClass();
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        Intrinsics.checkNotNullParameter(p32, "p3");
        Intrinsics.checkNotNullParameter(p42, "p4");
        Intrinsics.checkNotNullParameter(p52, "p5");
        String str = j.f9376a;
        h3.c cVar = new h3.c(p02, p32, p12);
        n3.k.a(p02, SystemJobService.class, true);
        e3.x.e().a(j.f9376a, "Created SystemJobScheduler and enabled SystemJobService");
        Intrinsics.checkNotNullExpressionValue(cVar, "createBestAvailableBackgroundScheduler(...)");
        return new v(p02.getApplicationContext(), p12, p22, p32, kotlin.collections.u.f(cVar, new g3.c(p02, p12, p42, p52, new l1.a(p52, p22), p22)), p52, p42);
    }

    public static boolean Z(h4 h4Var, String str, b2 b2Var, ILogger iLogger) {
        int i5;
        int i10;
        int i11;
        i5 = 8;
        i10 = 2;
        i11 = 0;
        switch (str) {
            case "debug_meta":
                h4Var.f16467n = (io.sentry.protocol.d) b2Var.f0(iLogger, new io.sentry.clientreport.b(i5));
                return true;
            case "server_name":
                h4Var.f16464k = b2Var.i0();
                return true;
            case "contexts":
                h4Var.f16456b.l(io.sentry.clientreport.b.c(b2Var, iLogger));
                return true;
            case "environment":
                h4Var.f16461g = b2Var.i0();
                return true;
            case "breadcrumbs":
                h4Var.f16466m = b2Var.R(iLogger, new io.sentry.d(i11));
                return true;
            case "sdk":
                h4Var.f16457c = (io.sentry.protocol.t) b2Var.f0(iLogger, new io.sentry.clientreport.b(21));
                return true;
            case "dist":
                h4Var.f16465l = b2Var.i0();
                return true;
            case "tags":
                h4Var.f16459e = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                return true;
            case "user":
                h4Var.f16463i = (io.sentry.protocol.i0) b2Var.f0(iLogger, new io.sentry.protocol.c0(i10));
                return true;
            case "extra":
                h4Var.f16468o = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                return true;
            case "event_id":
                h4Var.f16455a = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(23));
                return true;
            case "release":
                h4Var.f16460f = b2Var.i0();
                return true;
            case "request":
                h4Var.f16458d = (io.sentry.protocol.p) b2Var.f0(iLogger, new io.sentry.clientreport.b(19));
                return true;
            case "platform":
                h4Var.f16462h = b2Var.i0();
                return true;
            default:
                return false;
        }
    }

    public static final void a0(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        hf.e b10 = kotlin.collections.t.b();
        s2.c r02 = connection.r0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (r02.n0()) {
            try {
                b10.add(r02.V(0));
            } finally {
            }
        }
        Unit unit = Unit.f19194a;
        u6.h.g(r02, null);
        ListIterator listIterator = kotlin.collections.t.a(b10).listIterator(0);
        while (true) {
            hf.b bVar = (hf.b) listIterator;
            if (!bVar.hasNext()) {
                return;
            }
            String str = (String) bVar.next();
            if (kotlin.text.z.o(str, "room_fts_content_sync_", false)) {
                h8.b.l(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static void b0(Parcel parcel, int i5) {
        if (parcel.dataPosition() != i5) {
            throw new h6.a(r4.k.o(new StringBuilder(String.valueOf(i5).length() + 26), "Overread allowed size end=", i5), parcel);
        }
    }

    public static final CoroutineContext c0(k2.w wVar, mf.c cVar) {
        k2.z zVar = (k2.z) cVar.getContext().r(k2.z.f18790b);
        jg.d dVar = null;
        CoroutineContext coroutineContext = zVar != null ? zVar.f18791a : null;
        if (!wVar.k()) {
            jg.d dVar2 = wVar.f18779a;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            } else {
                dVar = dVar2;
            }
            CoroutineContext coroutineContext2 = dVar.f18494a;
            if (coroutineContext == null) {
                coroutineContext = kotlin.coroutines.g.f19227a;
            }
            return coroutineContext2.t(coroutineContext);
        }
        if (coroutineContext != null) {
            jg.d dVar3 = wVar.f18779a;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            } else {
                dVar = dVar3;
            }
            return dVar.f18494a.t(coroutineContext);
        }
        jg.d dVar4 = wVar.f18779a;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        } else {
            dVar = dVar4;
        }
        return dVar.f18494a;
    }

    public static String d0(String str) {
        if (StringsKt.H(str)) {
            return null;
        }
        String X = StringsKt.X(StringsKt.X(str, '#'), '?');
        String V = StringsKt.V('.', StringsKt.V('/', X, X), "");
        if (StringsKt.H(V)) {
            return null;
        }
        String lowerCase = V.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = (String) v4.m.f24427a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static sb.j e0() {
        return (sb.j) y3.m(sb.j.class, null, 6);
    }

    public static u2.c f0(r7.a refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        u2.c cVar = (u2.c) refHolder.f22318b;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.areEqual(cVar.f24021a, sqLiteDatabase)) {
                return cVar;
            }
        }
        u2.c cVar2 = new u2.c(sqLiteDatabase);
        refHolder.f22318b = cVar2;
        return cVar2;
    }

    public static boolean h0(int i5, Rect rect, Rect rect2) {
        if (i5 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i5 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i5 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i5 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static int i0(int i5, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i5 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i5 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i5 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static int j0(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static c4.v k0(Context context, SSLContext sSLContext, X509TrustManager x509TrustManager) {
        int length;
        int i5;
        File file;
        int F;
        Intrinsics.checkNotNullParameter(context, "context");
        CoroutineContext t3 = MyApp.f6830c.f18494a.t(new eg.y("Coil"));
        FileSystem fileSystem = FileSystem.SYSTEM;
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        Intrinsics.checkNotNullParameter(cacheDir, "<this>");
        Intrinsics.checkNotNullParameter("coil_cache", "relative");
        File relative = new File("coil_cache");
        Intrinsics.checkNotNullParameter(cacheDir, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        Intrinsics.checkNotNullParameter(relative, "<this>");
        String path = relative.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        char c2 = File.separatorChar;
        int i10 = 0;
        int i11 = 4;
        int F2 = StringsKt.F(path, c2, 0, false, 4);
        int i12 = 1;
        if (F2 != 0) {
            if (F2 <= 0 || path.charAt(F2 - 1) != ':') {
                length = (F2 == -1 && StringsKt.C(path, ':')) ? path.length() : 0;
            }
            length = F2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c2 || (F = StringsKt.F(path, c2, 2, false, 4)) < 0) {
            length = 1;
        } else {
            F2 = StringsKt.F(path, c2, F + 1, false, 4);
            if (F2 < 0) {
                length = path.length();
            }
            length = F2 + 1;
        }
        if (!(length > 0)) {
            String file2 = cacheDir.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
            if ((file2.length() == 0) || StringsKt.C(file2, c2)) {
                file = new File(file2 + relative);
            } else {
                file = new File(file2 + c2 + relative);
            }
            relative = file;
        }
        Path path2 = Path.Companion.get$default(Path.INSTANCE, relative, false, 1, (Object) null);
        if (path2 == null) {
            throw new IllegalStateException("directory == null");
        }
        long j = 10485760;
        try {
            File file3 = path2.toFile();
            file3.mkdir();
            StatFs statFs = new StatFs(file3.getAbsolutePath());
            j = zf.j.b((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
        } catch (Exception unused) {
        }
        e4.h hVar = new e4.h(j, t3, fileSystem, path2);
        com.android.billingclient.api.l0 l0Var = new com.android.billingclient.api.l0((byte) 0, 5);
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            i5 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused2) {
            i5 = 256;
        }
        l4.c cVar = new l4.c(new l4.e((long) (0.15d * i5 * b6.MAX_EVENT_SIZE_BYTES), l0Var), l0Var);
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(context);
        q4.f a7 = q4.f.a((q4.f) a0Var.f681c, t3, t3, t3, null, 16369);
        a0Var.f681c = a7;
        q4.b bVar = q4.b.f21930c;
        q4.f a10 = q4.f.a(a7, null, null, null, null, 16351);
        a0Var.f681c = a10;
        a0Var.f683e = new gf.e(hVar);
        q4.f a11 = q4.f.a(a10, null, null, null, null, 16367);
        a0Var.f681c = a11;
        a0Var.f682d = new gf.e(cVar);
        a0Var.f681c = q4.f.a(a11, null, null, null, null, 16319);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new c4.c(new g4.g(i12), i10));
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            arrayList5.add(new c4.c(new g4.a(), i10));
        } else {
            arrayList5.add(new c4.c(new g4.g(i10), i10));
        }
        if (i13 <= 29 && sSLContext != null && x509TrustManager != null) {
            gh.f0 f0Var = new gh.f0();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            f0Var.a(socketFactory, x509TrustManager);
            arrayList4.add(new a2.l(i12, new m4.j(new me.a(i11, new gh.g0(f0Var))), Reflection.getOrCreateKotlinClass(c4.b0.class)));
        }
        a0Var.f684f = new c4.e(ci.c.a0(arrayList), ci.c.a0(arrayList2), ci.c.a0(arrayList3), ci.c.a0(arrayList4), ci.c.a0(arrayList5));
        return a0Var.o();
    }

    public static void l0(Context context, String str, vf.a aVar, Pair... params) {
        boolean z5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Map params2 = n0.h(kotlin.collections.p.q(params));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params2, "params");
        String J = CollectionsKt.J(params2.entrySet(), "", null, null, new f1.a(20), 30);
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNull(packageManager);
        try {
            packageManager.getPackageInfo("org.telegram.messenger", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            try {
                packageManager.getPackageInfo("org.thunderdog.challegram", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                z5 = false;
            }
        }
        z5 = true;
        StringBuilder sb2 = new StringBuilder("tg://resolve?domain=");
        sb2.append(str == null ? "sport_insider_ref_bot" : str);
        sb2.append("&start=");
        sb2.append(J);
        Uri parse = Uri.parse(sb2.toString());
        StringBuilder sb3 = new StringBuilder("https://t.me/");
        if (str == null) {
            str = "sport_insider_ref_bot";
        }
        sb3.append(str);
        sb3.append("?start=");
        sb3.append(J);
        Uri parse2 = Uri.parse(sb3.toString());
        if (!z5) {
            parse = parse2;
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            aVar.invoke(0, J, null);
        } catch (Exception e7) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", parse2);
                if (!(context instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                context.startActivity(intent2);
                aVar.invoke(1, J, e7);
                Unit unit = Unit.f19194a;
            } catch (Exception e9) {
                aVar.invoke(-1, J, e9);
                Unit unit2 = Unit.f19194a;
            }
        }
    }

    public static androidx.transition.n0 m0(String statusLine) {
        gh.h0 h0Var;
        int i5;
        String str;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        if (kotlin.text.z.o(statusLine, "HTTP/1.", false)) {
            i5 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                h0Var = gh.h0.f10198c;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                h0Var = gh.h0.f10199d;
            }
        } else if (kotlin.text.z.o(statusLine, "ICY ", false)) {
            h0Var = gh.h0.f10198c;
            i5 = 4;
        } else {
            if (!kotlin.text.z.o(statusLine, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            h0Var = gh.h0.f10199d;
            i5 = 12;
        }
        int i10 = i5 + 3;
        if (statusLine.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i5, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Integer intOrNull = StringsKt.toIntOrNull(substring);
        if (intOrNull == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = intOrNull.intValue();
        if (statusLine.length() <= i10) {
            str = "";
        } else {
            if (statusLine.charAt(i10) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i5 + 4);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return new androidx.transition.n0(h0Var, intValue, str);
    }

    public static final Object n0(k2.w db2, boolean z5, boolean z7, Function1 block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db2.a();
        ThreadLocal threadLocal = db2.f18787i;
        if (db2.k() && !db2.l()) {
            CoroutineContext coroutineContext = (CoroutineContext) threadLocal.get();
            if ((coroutineContext != null ? (k2.z) coroutineContext.r(k2.z.f18790b) : null) != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        CoroutineContext coroutineContext2 = (CoroutineContext) threadLocal.get();
        if (coroutineContext2 == null) {
            coroutineContext2 = kotlin.coroutines.g.f19227a;
        }
        return k2.x.A(new p2.d(coroutineContext2, db2, z7, z5, block, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o0(k2.w wVar, boolean z5, Function1 function1, mf.c cVar) {
        p2.e eVar;
        int i5;
        if (cVar instanceof p2.e) {
            eVar = (p2.e) cVar;
            int i10 = eVar.f21471e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f21471e = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f21470d;
                Object obj2 = lf.a.f20034a;
                i5 = eVar.f21471e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (wVar.k() && wVar.n() && wVar.l()) {
                        id.i iVar = new id.i(wVar, (Continuation) null, function1, z5);
                        eVar.f21471e = 1;
                        Object s8 = wVar.s(z5, iVar, eVar);
                        if (s8 != obj2) {
                            return s8;
                        }
                    } else {
                        eVar.f21467a = wVar;
                        eVar.f21468b = function1;
                        eVar.f21469c = z5;
                        eVar.f21471e = 2;
                        obj = c0(wVar, eVar);
                    }
                }
                if (i5 == 1) {
                    h8.b.B(obj);
                    return obj;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                z5 = eVar.f21469c;
                function1 = eVar.f21468b;
                wVar = eVar.f21467a;
                h8.b.B(obj);
                hd.g gVar = new hd.g(wVar, (Continuation) null, function1, z5);
                eVar.f21467a = null;
                eVar.f21468b = null;
                eVar.f21471e = 3;
                Object A = eg.c0.A((CoroutineContext) obj, gVar, eVar);
                return A != obj2 ? obj2 : A;
            }
        }
        eVar = new p2.e(cVar);
        Object obj3 = eVar.f21470d;
        Object obj22 = lf.a.f20034a;
        i5 = eVar.f21471e;
        if (i5 != 0) {
        }
        hd.g gVar2 = new hd.g(wVar, (Continuation) null, function1, z5);
        eVar.f21467a = null;
        eVar.f21468b = null;
        eVar.f21471e = 3;
        Object A2 = eg.c0.A((CoroutineContext) obj3, gVar2, eVar);
        if (A2 != obj22) {
        }
    }

    public static f1.b p0(String name, h9.c cVar, q8.a aVar, int i5) {
        if ((i5 & 2) != 0) {
            cVar = null;
        }
        Function1 produceMigrations = aVar;
        if ((i5 & 4) != 0) {
            produceMigrations = new f1.a(0);
        }
        lg.e eVar = m0.f9201a;
        lg.d dVar = lg.d.f20063c;
        u1 d10 = eg.c0.d();
        dVar.getClass();
        jg.d scope = eg.c0.b(kotlin.coroutines.e.c(dVar, d10));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new f1.b(name, cVar, produceMigrations, scope);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (da.r.c() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (da.r.d() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (da.r.c() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q0(Integer num, String str) {
        boolean z5 = true;
        switch (str.hashCode()) {
            case -1737938649:
                if (str.equals("userCancelPayDiamondAction")) {
                    if (!da.r.c()) {
                        if (da.r.f()) {
                            break;
                        }
                    }
                }
                z5 = false;
                break;
            case -1727739926:
                if (str.equals("userCancelPayPremiumAction")) {
                    if (!da.r.f()) {
                        break;
                    }
                }
                z5 = false;
                break;
            case -1006868763:
                if (str.equals("userCancelPayLiveAction")) {
                    z5 = da.r.e();
                    break;
                }
                z5 = false;
                break;
            case -815689149:
                if (str.equals("userCancelPayExpressAction")) {
                    if (!da.r.d()) {
                        break;
                    }
                }
                z5 = false;
                break;
            default:
                z5 = false;
                break;
        }
        if (z5) {
            return;
        }
        jd.a aVar = new jd.a();
        Continuation continuation = null;
        Context context = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).f25901a;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction(str);
        if (num != null && num.intValue() > 0) {
            intent.putExtra("idPrediction", num.intValue());
        }
        aVar.d((int) Instant.now().getEpochSecond(), "Warning Push", "Warning notice", "Warning notice", jd.a.b(context, intent), ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).g(R.string.app_name), ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).g(R.string.The_payment_operation_has_not_been_completed), context, true, true, null, 0, null);
        eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new androidx.lifecycle.o(num, str, new cd.d(), continuation, 4), 2);
    }

    public static boolean r0(Parcel parcel, int i5) {
        G0(parcel, i5, 4);
        return parcel.readInt() != 0;
    }

    public static Double s0(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        if (z0 == 0) {
            return null;
        }
        I0(parcel, z0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float t0(Parcel parcel, int i5) {
        G0(parcel, i5, 4);
        return parcel.readFloat();
    }

    public static IBinder u0(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (z0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + z0);
        return readStrongBinder;
    }

    public static int v0(Parcel parcel, int i5) {
        G0(parcel, i5, 4);
        return parcel.readInt();
    }

    public static Integer w0(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        if (z0 == 0) {
            return null;
        }
        I0(parcel, z0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x0(Parcel parcel, int i5) {
        G0(parcel, i5, 8);
        return parcel.readLong();
    }

    public static Long y0(Parcel parcel, int i5) {
        int z0 = z0(parcel, i5);
        if (z0 == 0) {
            return null;
        }
        I0(parcel, z0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int z0(Parcel parcel, int i5) {
        return (i5 & (-65536)) != -65536 ? (char) (i5 >> 16) : parcel.readInt();
    }

    public Object A0(Continuation continuation) {
        lg.e eVar = m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new ab.a(this, null, 1), continuation);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    @Override // rg.b
    public abstract byte B();

    @Override // rg.b
    public abstract short C();

    public Object C0(Continuation continuation) {
        lg.e eVar = m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new ab.a(this, null, 2), continuation);
    }

    @Override // rg.b
    public float D() {
        Y();
        throw null;
    }

    @Override // rg.b
    public double E() {
        Y();
        throw null;
    }

    public abstract void I(s2.c cVar, Object obj);

    public abstract String Q();

    public void Y() {
        throw new og.f(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // rg.b
    public Object a(og.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.a(this);
    }

    @Override // rg.a
    public long b(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return v();
    }

    @Override // rg.b
    public boolean c() {
        Y();
        throw null;
    }

    @Override // rg.b
    public char d() {
        Y();
        throw null;
    }

    @Override // rg.a
    public char e(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return d();
    }

    @Override // rg.a
    public byte f(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return B();
    }

    @Override // rg.a
    public void g(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public void g0(s2.a connection, Object obj) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (obj == null) {
            return;
        }
        s2.c r02 = connection.r0(Q());
        try {
            I(r02, obj);
            r02.n0();
            u6.h.g(r02, null);
        } finally {
        }
    }

    @Override // rg.a
    public boolean h(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return c();
    }

    @Override // rg.b
    public rg.b i(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // rg.a
    public rg.b k(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return i(descriptor.i(i5));
    }

    @Override // rg.b
    public abstract int l();

    @Override // rg.a
    public int m(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return l();
    }

    @Override // rg.a
    public String o(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return s();
    }

    @Override // rg.a
    public double p(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E();
    }

    @Override // rg.a
    public float q(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return D();
    }

    @Override // rg.b
    public int r(qg.g enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Y();
        throw null;
    }

    @Override // rg.b
    public String s() {
        Y();
        throw null;
    }

    @Override // rg.a
    public short t(w0 descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return C();
    }

    @Override // rg.a
    public Object u(qg.g descriptor, int i5, og.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return a(deserializer);
    }

    @Override // rg.b
    public abstract long v();

    @Override // rg.b
    public rg.a w(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // rg.b
    public boolean x() {
        return true;
    }

    @Override // rg.a
    public Object y(qg.g descriptor, int i5, og.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.d().c() && !x()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return a(deserializer);
    }
}
