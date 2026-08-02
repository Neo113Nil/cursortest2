package io.sentry.config;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import androidx.appcompat.widget.c1;
import c1.u;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import e3.x;
import eg.c0;
import eg.l;
import f3.s;
import g6.v;
import hf.r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.f5;
import io.sentry.util.j;
import io.sentry.util.n;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j1.p;
import j1.q;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Pattern;
import k2.a0;
import k2.h0;
import k2.o0;
import k2.w;
import k2.y;
import k2.z;
import kotlin.Pair;
import kotlin.collections.m0;
import kotlin.collections.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okio.Segment;
import okio.Utf8;
import rh.g;
import s9.h;
import v.f;
import v9.i;
import xg.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Field f16287a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16288b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f16289c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f16290d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f16291e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f16292f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f16293g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f16294h;

    public a() {
        di.b level = di.b.f8385e;
        Intrinsics.checkNotNullParameter(level, "level");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A(int i5, String str, String str2) {
        try {
            switch (i.f24501a[f.d(i5)]) {
                case 1:
                case 2:
                    return (!r(str2, "")) & str.toLowerCase().contains(str2.toLowerCase());
                case 3:
                    return Pattern.compile("(^|[^a-zA-Z])(" + Pattern.quote(str2.toLowerCase()) + ")([^a-zA-Z]|$)").matcher(str.toLowerCase()).find() & (!r(str2, ""));
                case 4:
                    return str.endsWith(str2);
                case 5:
                case 6:
                    return r(str, str2);
                case 7:
                    if (Double.parseDouble(str) <= Double.parseDouble(str2)) {
                        return false;
                    }
                    break;
                case 8:
                    return Double.parseDouble(str) >= Double.parseDouble(str2);
                case 9:
                    if (Double.parseDouble(str) >= Double.parseDouble(str2)) {
                        return false;
                    }
                case 10:
                    if (Double.parseDouble(str) > Double.parseDouble(str2)) {
                        return false;
                    }
                case 11:
                    return str.startsWith(str2);
                default:
                    return false;
            }
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final String B(long j) {
        long j6 = j % 86400000;
        long j10 = j6 % 3600000;
        int i5 = (((int) (j / 86400000)) * 24) + ((int) (j6 / 3600000));
        int i10 = (int) (j10 / 60000);
        int i11 = (int) ((j10 % 60000) / 1000);
        StringBuilder sb2 = new StringBuilder();
        if (i5 < 10) {
            sb2.append(0);
        }
        sb2.append(i5);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (i10 < 10) {
            sb2.append(0);
        }
        sb2.append(i10);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (i11 < 10) {
            sb2.append(0);
        }
        sb2.append(i11);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final boolean C(Integer num) {
        return num != null && num.intValue() > 0;
    }

    public static final String D(int i5, long j) {
        if (j >= 0) {
            String l6 = Long.toString(j, CharsKt.checkRadix(i5));
            Intrinsics.checkNotNullExpressionValue(l6, "toString(...)");
            return l6;
        }
        long j6 = i5;
        long j10 = ((j >>> 1) / j6) << 1;
        long j11 = j - (j10 * j6);
        if (j11 >= j6) {
            j11 -= j6;
            j10++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l10 = Long.toString(j10, CharsKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(l10, "toString(...)");
        sb2.append(l10);
        String l11 = Long.toString(j11, CharsKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(l11, "toString(...)");
        sb2.append(l11);
        return sb2.toString();
    }

    public static int E(int i5) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i5) {
                return i11;
            }
        }
        return 1;
    }

    public static boolean F(byte b10) {
        return b10 > -65;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(w wVar, Function1 function1, Continuation frame) {
        if (wVar.k() && wVar.n() && wVar.l()) {
            return function1.invoke(frame);
        }
        if (frame.getContext().r(y.f18789a) == null) {
            return function1.invoke(frame);
        }
        a0 a0Var = null;
        androidx.lifecycle.c cVar = new androidx.lifecycle.c((Object) function1, (Continuation) (0 == true ? 1 : 0), 26);
        z zVar = (z) frame.getContext().r(z.f18790b);
        kotlin.coroutines.d dVar = zVar != null ? zVar.f18791a : null;
        if (dVar != null) {
            return c0.A(dVar, cVar, frame);
        }
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        try {
            a0 a0Var2 = wVar.f18782d;
            if (a0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
            } else {
                a0Var = a0Var2;
            }
            a0Var.execute(new b6.i(lVar, wVar, cVar, 6));
        } catch (RejectedExecutionException e7) {
            lVar.n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e7));
        }
        Object r5 = lVar.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q d(Context context) {
        ProviderInfo providerInfo;
        m0.d dVar;
        ApplicationInfo applicationInfo;
        y8.d cVar = Build.VERSION.SDK_INT >= 28 ? new j1.c() : new y8.d();
        PackageManager packageManager = context.getPackageManager();
        g.e(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] l6 = cVar.l(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : l6) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new m0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e7) {
                w0.a("emoji2.text.DefaultEmojiConfig", b5.ERROR, null, e7);
                w0.b(f5.FATAL, null, e7);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
            if (dVar != null) {
                return null;
            }
            return new q(new p(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }

    public static final id.p e(w db2, String[] tableNames, Function1 block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(block, "block");
        k2.i g10 = db2.g();
        String[] names = (String[]) Arrays.copyOf(tableNames, tableNames.length);
        g10.getClass();
        Intrinsics.checkNotNullParameter(names, "tables");
        o0 o0Var = g10.f18677b;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(names, "names");
        r rVar = new r();
        for (String str : names) {
            LinkedHashMap linkedHashMap = o0Var.f18739c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                rVar.addAll(set);
            } else {
                rVar.add(str);
            }
        }
        String[] strArr = (String[]) u0.a(rVar).toArray(new String[0]);
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = strArr[i5];
            LinkedHashMap linkedHashMap2 = o0Var.f18742f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i5] = num.intValue();
        }
        Pair pair = new Pair(strArr, iArr);
        String[] resolvedTableNames = (String[]) pair.f19192a;
        int[] tableIds = (int[]) pair.f19193b;
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return new id.p(hg.u0.e(new u(new h0(o0Var, tableIds, resolvedTableNames, null)), -1, gg.a.f10048a), db2, block, 1);
    }

    public static boolean g(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!g(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static SafeParcelable h(byte[] bArr, Parcelable.Creator creator) {
        v.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static ArrayList j(LinkedList linkedList) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            o w10 = xg.p.w();
            String simpleName = view.getClass().getSimpleName();
            w10.d();
            xg.p.r((xg.p) w10.f6816b, simpleName);
            String s8 = com.google.android.play.core.appupdate.b.s(view);
            if (!s8.isEmpty()) {
                w10.d();
                xg.p.p((xg.p) w10.f6816b, s8);
            }
            if (view.getTag() instanceof String) {
                String str = (String) view.getTag();
                w10.d();
                xg.p.q((xg.p) w10.f6816b, str);
            }
            arrayList.add((xg.p) w10.a());
        }
        return arrayList;
    }

    public static String k(androidx.datastore.preferences.protobuf.i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i5 = 0; i5 < iVar.size(); i5++) {
            byte a7 = iVar.a(i5);
            if (a7 == 34) {
                sb2.append("\\\"");
            } else if (a7 == 39) {
                sb2.append("\\'");
            } else if (a7 != 92) {
                switch (a7) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a7 >>> 6) & 3) + 48));
                            sb2.append((char) (((a7 >>> 3) & 7) + 48));
                            sb2.append((char) ((a7 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a7);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String l(h hVar) {
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i5 = 0; i5 < hVar.size(); i5++) {
            byte a7 = hVar.a(i5);
            if (a7 == 34) {
                sb2.append("\\\"");
            } else if (a7 == 39) {
                sb2.append("\\'");
            } else if (a7 != 92) {
                switch (a7) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a7 >>> 6) & 3) + 48));
                            sb2.append((char) (((a7 >>> 3) & 7) + 48));
                            sb2.append((char) ((a7 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a7);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void m(Object obj) {
        LongSparseArray longSparseArray;
        if (!f16290d) {
            try {
                f16289c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                w0.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            f16290d = true;
        }
        Class cls = f16289c;
        if (cls == null) {
            return;
        }
        if (!f16292f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f16291e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                w0.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
            }
            f16292f = true;
        }
        Field field = f16291e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e10) {
            w0.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static String n() {
        byte[] bArr = new byte[16];
        j.a().b(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | ByteCompanionObject.MIN_VALUE);
        long j = 0;
        long j6 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            j6 = (j6 << 8) | (bArr[i5] & 255);
        }
        for (int i10 = 8; i10 < 16; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        UUID uuid = new UUID(j6, j);
        char[] cArr = n.f17174a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, r3[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], r3[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], r3[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], r3[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], r3[(int) ((263882790666240L & leastSignificantBits) >>> 44)], r3[(int) ((16492674416640L & leastSignificantBits) >>> 40)], r3[(int) ((1030792151040L & leastSignificantBits) >>> 36)], r3[(int) ((64424509440L & leastSignificantBits) >>> 32)], r3[(int) ((4026531840L & leastSignificantBits) >>> 28)], r3[(int) ((251658240 & leastSignificantBits) >>> 24)], r3[(int) ((15728640 & leastSignificantBits) >>> 20)], r3[(int) ((983040 & leastSignificantBits) >>> 16)], r3[(int) ((61440 & leastSignificantBits) >>> 12)], r3[(int) ((3840 & leastSignificantBits) >>> 8)], r3[(int) ((240 & leastSignificantBits) >>> 4)], r3[(int) (15 & leastSignificantBits)]};
        n.a(cArr2, mostSignificantBits);
        char[] cArr3 = n.f17174a;
        return new String(cArr2);
    }

    public static final int o(int i5) {
        return (int) (i5 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final long p(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (q(connection) == 0) {
            return -1L;
        }
        s2.c r02 = connection.r0("SELECT last_insert_rowid()");
        try {
            r02.n0();
            long j = r02.getLong(0);
            u6.h.g(r02, null);
            return j;
        } finally {
        }
    }

    public static final int q(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        s2.c r02 = connection.r0("SELECT changes()");
        try {
            r02.n0();
            int i5 = (int) r02.getLong(0);
            u6.h.g(r02, null);
            return i5;
        } finally {
        }
    }

    public static boolean r(String str, String str2) {
        try {
            return Double.parseDouble(str) == Double.parseDouble(str2);
        } catch (NumberFormatException unused) {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final void t(Context context) {
        Map map;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        if (databasePath.exists()) {
            x.e().a(s.f9417a, "Migrating WorkDatabase to the no-backup directory");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "getDatabasePath(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
            String[] strArr = s.f9418b;
            int a7 = m0.a(strArr.length);
            if (a7 < 16) {
                a7 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, noBackupFilesDir);
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (linkedHashMap.isEmpty()) {
                map = m0.b(pair);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        x.e().h(s.f9417a, "Over-writing contents of " + file2);
                    }
                    x.e().a(s.f9417a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static final String u(long j) {
        Intrinsics.checkNotNullParameter("yyyy-MM-dd HH:mm", "dateFormat");
        String format = LocalDateTime.ofInstant(Instant.ofEpochSecond(j / 1000), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static byte[] v(long j, String str) {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(c1.n("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(c1.n("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(c1.n("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String w(File file) {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
            }
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append("\n");
                sb2.append(readLine2);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static final String x(int i5, String dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        String format = LocalDateTime.ofInstant(Instant.ofEpochSecond(i5), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(dateFormat));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final void y(View view, long j, Function1 onSafeClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onSafeClick, "onSafeClick");
        view.setOnClickListener(new xe.g(j, new a2.f(24, onSafeClick)));
    }

    public void f(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        s(di.b.f8381a, msg);
    }

    public abstract void i(di.b bVar, String str);

    public void s(di.b lvl, String msg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (di.b.f8385e.compareTo(lvl) <= 0) {
            i(lvl, msg);
        }
    }
}
