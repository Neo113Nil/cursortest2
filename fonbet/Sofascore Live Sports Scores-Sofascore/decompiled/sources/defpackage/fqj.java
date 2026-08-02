package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.DecimalFormatSymbols;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fqj implements uqg {
    public static final tc3 a = new tc3(933455794, new ed3(18), false);
    public static final tc3 b = new tc3(-254975192, new ed3(19), false);
    public static final tc3 c = new tc3(2066110439, new ed3(20), false);
    public static final tc3 d = new tc3(-1893703290, new ed3(21), false);
    public static final tc3 e = new tc3(1474698239, new ud3(13), false);
    public static final inb f = new inb(27);
    public static final v9f g = new v9f(0);
    public static final u8f h = new u8f(4);
    public static final wkf i = new wkf(23);
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    public static final String A(Cursor cursor, String str) {
        try {
            if (cursor.isNull(cursor.getColumnIndexOrThrow(str))) {
                return null;
            }
            return cursor.getString(cursor.getColumnIndexOrThrow(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final xtc B(of3 of3Var, xtc xtcVar) {
        if (xtcVar.f(ry.L)) {
            return xtcVar;
        }
        av8 av8Var = (av8) of3Var;
        av8Var.e0(1219399079);
        xtc xtcVar2 = (xtc) xtcVar.a(utc.a, new z2(av8Var, 5));
        av8Var.s(false);
        return xtcVar2;
    }

    public static final xtc C(of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(439770924);
        xtc B = B(av8Var, xtcVar);
        av8Var.s(false);
        return B;
    }

    public static void D(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final void E(esa esaVar, String str, int i2, gv9 gv9Var) {
        esaVar.f(str.concat("_title"), "SectionTitle", new tc3(-2090696638, new h66(i2, 2), true));
        int i3 = 0;
        esaVar.a(gv9Var.size(), new zi(5, new tk1(str, i3), gv9Var), new uk1(i3, gv9Var), new tc3(2039820996, new aj(3, gv9Var, gv9Var), true));
    }

    public static final xtc F(op3 op3Var, njh njhVar, of3 of3Var) {
        xtc A;
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-363477779);
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        xtc s = bkh.s(bkh.c, 3);
        xtc xtcVar = utc.a;
        if (njhVar == null) {
            A = null;
        } else {
            long j2 = njhVar.a;
            av8Var.d0(-1859173400);
            boolean g2 = av8Var.g(kx4Var) | av8Var.f(j2);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new y64(kx4Var, op3Var, j2);
                av8Var.n0(O);
            }
            av8Var.s(false);
            A = s9a.A(xtcVar, (ct8) O);
        }
        if (A != null) {
            xtcVar = A;
        }
        xtc z = s.z(xtcVar);
        av8Var.s(false);
        return z;
    }

    public static y3g G(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        kfj kfjVar = obj2 != null ? (kfj) kfj.i.k(obj2) : null;
        obj3.getClass();
        return new y3g(kfjVar, (z9k) h.k(obj3));
    }

    public static List H(lpg lpgVar, y3g y3gVar) {
        List list;
        kfj kfjVar = (kfj) ((eoh) ((e1d) y3gVar.c)).getValue();
        if (kfjVar != null) {
            Integer valueOf = Integer.valueOf(kfjVar.a);
            String str = kfjVar.b;
            String str2 = kfjVar.c;
            long j2 = kfjVar.d;
            int i2 = pej.c;
            Integer valueOf2 = Integer.valueOf((int) (j2 >> 32));
            Integer valueOf3 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = kfjVar.e;
            list = b.j(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (4294967295L & j3)), Long.valueOf(kfjVar.f));
        } else {
            list = null;
        }
        return b.j(list, h.g(lpgVar, (z9k) y3gVar.b));
    }

    public static final boolean I(mk5 mk5Var) {
        if (mk5Var instanceof qk5) {
            return true;
        }
        if (!(mk5Var instanceof yk5)) {
            return false;
        }
        ArrayList arrayList = ((yk5) mk5Var).c;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (I((mk5) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static byte[] J(sb2 sb2Var) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = sb2Var.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return p(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j2 = min * (min < 4096 ? 4 : 2);
            min = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (sb2Var.read() == -1) {
            return p(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    /* JADX WARN: Type inference failed for: r0v69, types: [d15[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r9v6, types: [d15[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(Context context, Executor executor, x9f x9fVar, boolean z) {
        boolean z2;
        ?? r7;
        Serializable serializable;
        d15[] d15VarArr;
        d15[] d15VarArr2;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        z05 z05Var;
        String str;
        String str2;
        FileInputStream b2;
        boolean z8;
        boolean z9;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z9 = readLong == packageInfo.lastUpdateTime;
                            if (z9) {
                                x9fVar.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z9) {
                        context.getPackageName();
                        vbf.c(context, false);
                        return;
                    }
                }
                z9 = false;
                if (z9) {
                }
            }
            context.getPackageName();
            byte[] bArr2 = tgj.g;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            z05 z05Var2 = new z05(assets, executor, x9fVar, name, file2);
            byte[] bArr3 = (byte[]) z05Var2.d;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        z05Var2.c(4, null);
                    }
                    z05Var2.a = true;
                    try {
                        try {
                            r7 = z05Var2.b(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            x9fVar.a(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            d15VarArr = (d15[]) z05Var2.h;
                            if (d15VarArr != null) {
                            }
                            x9f x9fVar2 = (x9f) z05Var2.c;
                            d15VarArr2 = (d15[]) z05Var2.h;
                            byte[] bArr4 = (byte[]) z05Var2.d;
                            boolean z10 = r7;
                            z10 = r7;
                            if (d15VarArr2 != null) {
                            }
                            bArr = (byte[]) z05Var2.e;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z8 = z5;
                            vbf.c(context, (z6 || !z) ? false : z8);
                        } catch (IOException e3) {
                            x9fVar.a(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            d15VarArr = (d15[]) z05Var2.h;
                            if (d15VarArr != null) {
                            }
                            x9f x9fVar22 = (x9f) z05Var2.c;
                            d15VarArr2 = (d15[]) z05Var2.h;
                            byte[] bArr42 = (byte[]) z05Var2.d;
                            boolean z102 = r7;
                            z102 = r7;
                            if (d15VarArr2 != null) {
                            }
                            bArr = (byte[]) z05Var2.e;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z8 = z5;
                            vbf.c(context, (z6 || !z) ? false : z8);
                        }
                        if (r7 != 0) {
                            try {
                            } catch (IOException e4) {
                                x9fVar.a(7, e4);
                                try {
                                    r7.close();
                                } catch (IOException e5) {
                                    x9fVar.a(7, e5);
                                }
                                serializable = null;
                                z05Var2.h = serializable;
                                d15VarArr = (d15[]) z05Var2.h;
                                if (d15VarArr != null) {
                                }
                                x9f x9fVar222 = (x9f) z05Var2.c;
                                d15VarArr2 = (d15[]) z05Var2.h;
                                byte[] bArr422 = (byte[]) z05Var2.d;
                                boolean z1022 = r7;
                                z1022 = r7;
                                if (d15VarArr2 != null) {
                                }
                                bArr = (byte[]) z05Var2.e;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z8 = z5;
                                vbf.c(context, (z6 || !z) ? false : z8);
                            } catch (IllegalStateException e6) {
                                x9fVar.a(8, e6);
                                r7.close();
                                serializable = null;
                                z05Var2.h = serializable;
                                d15VarArr = (d15[]) z05Var2.h;
                                if (d15VarArr != null) {
                                }
                                x9f x9fVar2222 = (x9f) z05Var2.c;
                                d15VarArr2 = (d15[]) z05Var2.h;
                                byte[] bArr4222 = (byte[]) z05Var2.d;
                                boolean z10222 = r7;
                                z10222 = r7;
                                if (d15VarArr2 != null) {
                                }
                                bArr = (byte[]) z05Var2.e;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z8 = z5;
                                vbf.c(context, (z6 || !z) ? false : z8);
                            }
                            if (!Arrays.equals(bArr2, zm2.C(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            ?? X = tgj.X(r7, zm2.C(r7, 4), (String) z05Var2.g);
                            try {
                                r7.close();
                                serializable = X;
                            } catch (IOException e7) {
                                x9fVar.a(7, e7);
                                serializable = X;
                            }
                            z05Var2.h = serializable;
                        }
                        d15VarArr = (d15[]) z05Var2.h;
                        if (d15VarArr != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                b2 = z05Var2.b(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                x9fVar.a(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                x9fVar.a(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                z05Var2.h = null;
                                x9fVar.a(8, e10);
                                str = r7;
                            }
                            if (b2 == null) {
                                try {
                                    if (!Arrays.equals(tgj.h, zm2.C(b2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] C = zm2.C(b2, 4);
                                    z05Var2.h = tgj.U(b2, C, bArr3, d15VarArr);
                                    b2.close();
                                    z05Var = z05Var2;
                                    r7 = C;
                                    if (z05Var != null) {
                                        z05Var2 = z05Var;
                                    }
                                } finally {
                                }
                            } else {
                                if (b2 != null) {
                                    b2.close();
                                    str = str2;
                                }
                                z05Var = null;
                                r7 = str;
                                if (z05Var != null) {
                                }
                            }
                        }
                        x9f x9fVar22222 = (x9f) z05Var2.c;
                        d15VarArr2 = (d15[]) z05Var2.h;
                        byte[] bArr42222 = (byte[]) z05Var2.d;
                        boolean z102222 = r7;
                        z102222 = r7;
                        if (d15VarArr2 != null && bArr42222 != null) {
                            r72 = z05Var2.a;
                            if (r72 != 0) {
                                a70.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                x9fVar22222.a(7, e11);
                                z7 = r72;
                            } catch (IllegalStateException e12) {
                                x9fVar22222.a(8, e12);
                                z7 = r72;
                            }
                            if (tgj.c0(r72, bArr42222, d15VarArr2)) {
                                z05Var2.e = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                z05Var2.h = null;
                                z102222 = z7;
                            } else {
                                x9fVar22222.a(5, null);
                                z05Var2.h = null;
                                r72.close();
                                z102222 = r72;
                            }
                        }
                        bArr = (byte[]) z05Var2.e;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!z05Var2.a) {
                                    a70.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) z05Var2.f);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                z05Var2.c(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                z05Var2.e = null;
                                                                                z05Var2.h = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        z05Var2.c(6, e);
                                        z3 = z102222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z8 = z5;
                                        vbf.c(context, (z6 || !z) ? false : z8);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z05Var2.c(7, e);
                                        z3 = z102222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z8 = z5;
                                        vbf.c(context, (z6 || !z) ? false : z8);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    z102222 = true;
                                    z05Var2.c(6, e);
                                    z3 = z102222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z8 = z5;
                                    vbf.c(context, (z6 || !z) ? false : z8);
                                } catch (IOException e16) {
                                    e = e16;
                                    z102222 = true;
                                    z05Var2.c(7, e);
                                    z3 = z102222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z8 = z5;
                                    vbf.c(context, (z6 || !z) ? false : z8);
                                }
                            } finally {
                                z05Var2.e = null;
                                z05Var2.h = null;
                            }
                        }
                        if (z4) {
                            D(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z8 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            z05Var2.c(4, null);
                        }
                        z05Var2.a = true;
                        r7 = z05Var2.b(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        d15VarArr = (d15[]) z05Var2.h;
                        if (d15VarArr != null) {
                            str2 = "dexopt/baseline.profm";
                            b2 = z05Var2.b(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (b2 == null) {
                            }
                        }
                        x9f x9fVar222222 = (x9f) z05Var2.c;
                        d15VarArr2 = (d15[]) z05Var2.h;
                        byte[] bArr422222 = (byte[]) z05Var2.d;
                        boolean z1022222 = r7;
                        z1022222 = r7;
                        if (d15VarArr2 != null) {
                            r72 = z05Var2.a;
                            if (r72 != 0) {
                            }
                        }
                        bArr = (byte[]) z05Var2.e;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z8 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        z05Var2.c(4, null);
                    }
                }
                vbf.c(context, (z6 || !z) ? false : z8);
            }
            z05Var2.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z8 = z2;
            vbf.c(context, (z6 || !z) ? false : z8);
        } catch (PackageManager.NameNotFoundException e17) {
            x9fVar.a(7, e17);
            vbf.c(context, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        if (r2 == r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final dfj dfjVar, final long j2, xtc xtcVar, p7j p7jVar, of3 of3Var, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        p7j p7jVar2;
        av8 av8Var;
        final xtc xtcVar3;
        eqf u;
        a99 a99Var;
        str.getClass();
        dfjVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1263846705);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(dfjVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                p7jVar2 = p7jVar;
                i4 |= av8Var2.g(p7jVar2) ? 16384 : 8192;
                if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
                    if (i6 != 0) {
                        xtcVar2 = utc.a;
                    }
                    p7j p7jVar3 = i5 != 0 ? null : p7jVar2;
                    int i7 = i4 & 14;
                    int i8 = i4 & 112;
                    boolean z = (i7 == 4) | (i8 == 32);
                    Object O = av8Var2.O();
                    a99 a99Var2 = nf3.a;
                    if (z || O == a99Var2) {
                        O = e.b(lfj.c(dfjVar.a.b));
                        av8Var2.n0(O);
                    }
                    xnh xnhVar = (xnh) O;
                    boolean z2 = (i7 == 4) | (i8 == 32);
                    Object O2 = av8Var2.O();
                    if (z2 || O2 == a99Var2) {
                        O2 = e.f(Boolean.FALSE);
                        av8Var2.n0(O2);
                    }
                    e1d e1dVar = (e1d) O2;
                    int i9 = i4;
                    xtc xtcVar4 = xtcVar2;
                    dfj a2 = dfj.a(dfjVar, 0L, v8a.E(4294967296L, xnhVar.h()), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213);
                    boolean g2 = av8Var2.g(e1dVar);
                    Object O3 = av8Var2.O();
                    if (g2) {
                        a99Var = a99Var2;
                    } else {
                        a99Var = a99Var2;
                    }
                    O3 = new w30(1, e1dVar);
                    av8Var2.n0(O3);
                    xtc Z = td4.Z(xtcVar4, (Function1) O3);
                    boolean g3 = av8Var2.g(xnhVar) | av8Var2.g(e1dVar);
                    Object O4 = av8Var2.O();
                    if (g3 || O4 == a99Var) {
                        O4 = new s1(10, xnhVar, e1dVar);
                        av8Var2.n0(O4);
                    }
                    p7jVar2 = p7jVar3;
                    av8Var = av8Var2;
                    udj.c(str, Z, j2, null, 0L, null, 0L, null, p7jVar2, 0L, 0, false, 0, 0, (Function1) O4, a2, av8Var, i9 & 910, ((i9 >> 12) & 14) | 3072, 56312);
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                }
                final p7j p7jVar4 = p7jVar2;
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: ur0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            fqj.a(str, dfjVar, j2, xtcVar3, p7jVar4, (of3) obj, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            p7jVar2 = p7jVar;
            if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            }
            final p7j p7jVar42 = p7jVar2;
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        p7jVar2 = p7jVar;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
        }
        final p7j p7jVar422 = p7jVar2;
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(boolean z, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-583118350);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.g(gv9Var2) ? 256 : 128) | (av8Var.g(gv9Var3) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc z2 = lz.J(utc.a, jaa.L(av8Var), null).z(bkh.c);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new c30(gv9Var, gv9Var2, z, gv9Var3, 1);
                av8Var.n0(O);
            }
            v8a.a(z2, null, C, null, null, null, false, null, (Function1) O, av8Var, 384, 506);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(z, gv9Var, gv9Var2, gv9Var3, i2, 1);
        }
    }

    public static final void c(ct5 ct5Var, of3 of3Var, int i2) {
        ct5Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-643217080);
        int i3 = (av8Var.i(ct5Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            e1d x = rfo.x(ct5Var.g, av8Var, 0);
            b(((vk1) x.getValue()).a, ((vk1) x.getValue()).b, ((vk1) x.getValue()).c, ((vk1) x.getValue()).d, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(ct5Var, i2, 21);
        }
    }

    public static final void d(Pair pair, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1933214562);
        int i3 = (av8Var.g(pair) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            sk1 sk1Var = (sk1) pair.a;
            sk1 sk1Var2 = (sk1) pair.b;
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            o(sk1Var, true, av8Var, 390);
            o(sk1Var2, false, av8Var, 390);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(pair, xtcVar, i2, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0164, code lost:
    
        if (r14 == r10) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(km kmVar, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        Context context;
        String str;
        e1d e1dVar;
        utc utcVar;
        boh bohVar;
        u6b u6bVar;
        a99 a99Var;
        int i3;
        boolean z;
        utc utcVar2;
        boolean z2;
        a99 a99Var2;
        boolean z3;
        gv9 gv9Var;
        a99 a99Var3;
        hm hmVar = kmVar.c;
        gv9 gv9Var2 = kmVar.b;
        p4h p4hVar = ww9.d;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(43979677);
        int i4 = i2 | (av8Var.i(kmVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            u6b u6bVar2 = (u6b) av8Var.k(mhb.a);
            Context context2 = (Context) av8Var.k(nz.b);
            String str2 = kmVar.i;
            boolean z4 = (gv9Var2 == null || kmVar.d == null) ? false : true;
            jm jmVar = jm.PREMATCH;
            jm jmVar2 = jm.HALFTIME;
            List<jm> j2 = b.j(jmVar, jmVar2);
            Object O = av8Var.O();
            boolean z5 = z4;
            a99 a99Var4 = nf3.a;
            if (O == a99Var4) {
                if (z5 && Intrinsics.c(str2, StatusKt.STATUS_IN_PROGRESS)) {
                    jmVar = jmVar2;
                }
                O = e.f(jmVar);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var4) {
                O2 = e.d(System.currentTimeMillis());
                av8Var.n0(O2);
            }
            boh bohVar2 = (boh) O2;
            u23 a2 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar3 = utc.a;
            xtc C = C(av8Var, utcVar3);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z5) {
                av8Var.d0(-1168949992);
                xtc q = n9e.q(bkh.d(utcVar3, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
                av8Var.d0(-1838818249);
                ArrayList arrayList = new ArrayList(k13.r(j2, 10));
                for (jm jmVar3 : j2) {
                    arrayList.add(new vt2(jmVar3, oea.v(jmVar3.a, av8Var), false, null, null, hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                }
                av8Var.s(false);
                gv9 W = l6g.W(arrayList);
                jm jmVar4 = (jm) e1dVar2.getValue();
                boolean i5 = av8Var.i(context2);
                Object O3 = av8Var.O();
                if (i5) {
                    a99Var3 = a99Var4;
                } else {
                    a99Var3 = a99Var4;
                }
                O3 = new fa(23, context2, bohVar2, e1dVar2);
                av8Var.n0(O3);
                i3 = i4;
                e1dVar = e1dVar2;
                a99Var = a99Var3;
                bohVar = bohVar2;
                u6bVar = u6bVar2;
                str = str2;
                utcVar = utcVar3;
                context = context2;
                z = false;
                trh.a(W, jmVar4, (Function1) O3, q, null, null, null, false, false, false, null, null, av8Var, 0, 4080);
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 13, lz.D(R.color.n_lv_4, av8Var), 0L, av8Var, null);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                context = context2;
                str = str2;
                e1dVar = e1dVar2;
                utcVar = utcVar3;
                bohVar = bohVar2;
                u6bVar = u6bVar2;
                a99Var = a99Var4;
                i3 = i4;
                z = false;
                av8Var.d0(-1168055301);
                av8Var.s(false);
            }
            utc utcVar4 = utcVar;
            xtc u0 = hkg.u0(utcVar4, hkg.o0(av8Var), z, 14);
            u23 a3 = t23.a(p4hVar, uxf.p, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = C(av8Var, u0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m3, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            jm jmVar5 = (jm) e1dVar.getValue();
            jm jmVar6 = jm.HALFTIME;
            boolean z6 = jmVar5 == jmVar6 ? true : z;
            gv9 gv9Var3 = z6 ? gv9Var2 : kmVar.a;
            r9k r9kVar = z6 ? kmVar.m : kmVar.l;
            if (gv9Var3 != null) {
                av8Var.d0(-113008780);
                utcVar2 = utcVar4;
                z2 = z;
                gvd.e(hmVar, kmVar.d, r9kVar, ((jm) e1dVar.getValue()) == jmVar6 ? kmVar.k : kmVar.j, ((jm) e1dVar.getValue()) == jmVar6 ? true : z, kmVar.e, kmVar.f, l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, 0);
                gv9<gv9> gv9Var4 = hmVar.g;
                if (gv9Var4 != null && ((jm) e1dVar.getValue()) != jmVar6 && !gv9Var4.isEmpty()) {
                    if (!gv9Var4.isEmpty()) {
                        for (gv9 gv9Var5 : gv9Var4) {
                            gv9 gv9Var6 = (gv9) CollectionsKt.firstOrNull(gv9Var4);
                            if (gv9Var6 != null && gv9Var5.size() == gv9Var6.size()) {
                            }
                        }
                    }
                    gv9Var = gv9Var4;
                    if (gv9Var != null) {
                        av8Var.d0(-112061390);
                        av8Var.s(z2);
                    } else {
                        av8Var.d0(-112061389);
                        fkf.c(kmVar.g, kmVar.h, gv9Var, l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, 0);
                        Unit unit = Unit.a;
                        av8Var.s(z2);
                    }
                    s9a.d(l6g.W(gv9Var3), l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, z2 ? 1 : 0);
                    av8Var.s(z2);
                }
                gv9Var = null;
                if (gv9Var != null) {
                }
                s9a.d(l6g.W(gv9Var3), l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, z2 ? 1 : 0);
                av8Var.s(z2);
            } else {
                utcVar2 = utcVar4;
                z2 = z;
                av8Var.d0(-111474063);
                av8Var.s(z2);
            }
            if (Intrinsics.c(str, StatusKt.STATUS_FINISHED)) {
                av8Var.d0(-1527612480);
                Object O4 = av8Var.O();
                a99Var2 = a99Var;
                if (O4 == a99Var2) {
                    O4 = new qz4(28);
                    av8Var.n0(O4);
                }
                CharSequence charSequence = (CharSequence) n9e.x(context, (Function1) O4);
                boolean z7 = (charSequence == null || charSequence.length() == 0) ? true : z2;
                av8Var.s(z2);
                z3 = z7;
            } else {
                a99Var2 = a99Var;
                av8Var.d0(-111345387);
                av8Var.s(z2);
                z3 = z2;
            }
            if (z3) {
                av8Var.d0(-111293085);
                l6g.g((i3 >> 3) & 14, av8Var, l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), function0);
                av8Var.s(z2);
            } else {
                av8Var.d0(-111081231);
                av8Var.s(z2);
            }
            xtc f0 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            utc utcVar5 = utcVar2;
            yf8 yf8Var = xth.a;
            av8 av8Var2 = av8Var;
            udj.c(oea.v(R.string.ai_insights_betting_disclaimer, av8Var), f0, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, f6a.N(xth.g()), av8Var2, 48, 0, 130040);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
            u6b u6bVar3 = u6bVar;
            boolean i6 = av8Var.i(context) | av8Var.i(u6bVar3);
            Object O5 = av8Var.O();
            if (i6 || O5 == a99Var2) {
                l50 l50Var = new l50(u6bVar3, context, bohVar, e1dVar, 11);
                av8Var.n0(l50Var);
                O5 = l50Var;
            }
            hz8.d(u6bVar3, (Function1) O5, av8Var);
            xtcVar2 = utcVar5;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(kmVar, function0, xtcVar2, i2, 22);
        }
    }

    public static final void f(gv9 gv9Var, int i2, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1709468114);
        int i4 = i3 | (av8Var.i(gv9Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            View view = (View) av8Var.k(nz.f);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            qug o0 = hkg.o0(av8Var);
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(2114624324, av8Var, new v17(i2, o0, view, (e1d) O, gv9Var, z)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(i2, i3, 6, gv9Var, xtcVar, z);
        }
    }

    public static final void h(FantasyNewsArticle fantasyNewsArticle, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-842258219);
        int i3 = i2 | (av8Var.i(fantasyNewsArticle) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc q = n9e.q(wnn.A(bkh.e(bkh.d(xtcVar, 1.0f), 112.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            boolean i5 = ((i3 & 112) == 32) | av8Var.i(fantasyNewsArticle);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new f87(function1, fantasyNewsArticle, i4);
                av8Var.n0(O);
            }
            xtc b0 = l98.b0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String imageUrl = fantasyNewsArticle.getImageUrl();
            String title = fantasyNewsArticle.getTitle();
            utc utcVar = utc.a;
            haa.a(imageUrl, title, bkh.m(utcVar, 144.0f, 80.0f), null, null, av8Var, 384, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            goa d2 = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            goa g2 = ljg.g(av8Var, C2, f50Var3, 1.0f, true);
            String title2 = fantasyNewsArticle.getTitle();
            yf8 yf8Var = xth.a;
            udj.c(title2, g2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.l(), av8Var, 0, 384, 126968);
            av8Var = av8Var;
            String P = m6k.P(fantasyNewsArticle, context);
            if (P == null) {
                av8Var.d0(-837693352);
                av8Var.s(false);
            } else {
                av8Var.d0(-837693351);
                nq8.h(av8Var, bkh.e(utcVar, 4.0f));
                udj.c(P, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new g87(fantasyNewsArticle, function1, xtcVar, i2, 1);
        }
    }

    public static final void i(uk7 uk7Var, xtc xtcVar, boolean z, of3 of3Var, int i2) {
        boolean z2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2105115539);
        int i4 = i2 | (av8Var.g(uk7Var) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            q9k q9kVar = uk7Var.a;
            Integer num = uk7Var.d;
            Integer num2 = uk7Var.c;
            String upperCase = q9kVar.a(av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            if (z) {
                av8Var.d0(979071843);
                ry ryVar = ry.v;
                boolean z3 = (i4 & 14) == 4;
                Object O = av8Var.O();
                if (z3 || O == nf3.a) {
                    O = new x16(uk7Var, 21);
                    av8Var.n0(O);
                }
                td4.b((Function1) O, null, ryVar, null, null, av8Var, 0, 26);
                z2 = false;
                av8Var.s(false);
                i3 = R.color.n_lv_1;
            } else {
                z2 = false;
                av8Var.d0(979450074);
                String str = uk7Var.b;
                dfj i5 = xth.i();
                long D = lz.D(R.color.n_lv_1, av8Var);
                p7j p7jVar = new p7j(3);
                i3 = R.color.n_lv_1;
                udj.c(str, null, D, null, 0L, null, 0L, null, p7jVar, 0L, 2, false, 1, 0, null, i5, av8Var, 0, 24960, 109562);
                av8Var = av8Var;
                av8Var.s(false);
            }
            if (num2 == null || num == null) {
                av8Var.d0(980069733);
                av8Var.s(z2);
            } else {
                av8Var.d0(979793616);
                av8 av8Var2 = av8Var;
                udj.c(oea.w(R.string.x_of_n, new Object[]{num2, num}, av8Var), null, lz.D(i3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 110586);
                av8Var = av8Var2;
                av8Var.s(z2);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(uk7Var, xtcVar, z, i2);
        }
    }

    public static final void j(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(843836767);
        int i3 = 4;
        int i4 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            xtc h2 = ljg.h(8.0f, fz8.Y(bkh.d(xtcVar, 1.0f), n9a.b), lz.D(R.color.surface_2, av8Var), 8.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = C(av8Var, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, 1729047860, gv9Var);
            int i5 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                uk7 uk7Var = (uk7) next;
                boolean z = uk7Var.e;
                utc utcVar = utc.a;
                i(uk7Var, fn0.e(1.0f, bkh.c(utcVar, 1.0f), true), z, av8Var, 0);
                if (i5 != gv9Var.size() - 1) {
                    av8Var.d0(-880112025);
                    tz9.r(0.5f, 390, 10, 0L, 0L, av8Var, l98.c0(bkh.c(utcVar, 1.0f), 4.0f, 12.0f));
                    av8Var.s(false);
                } else {
                    av8Var.d0(-879885756);
                    av8Var.s(false);
                }
                i5 = i6;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j73(gv9Var, xtcVar, i2, i3);
        }
    }

    public static final void l(final int i2, final int i3, final double d2, final xtc xtcVar, of3 of3Var, final int i4) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-183181614);
        int i5 = i4 | (av8Var.e(i2) ? 4 : 2) | (av8Var.e(i3) ? 32 : 16) | (av8Var.c(d2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String infinity = i2 == Integer.MAX_VALUE ? DecimalFormatSymbols.getInstance().getInfinity() : String.valueOf(i2);
            infinity.getClass();
            String v = oea.v(R.string.free_transfers, av8Var);
            Locale locale = Locale.ROOT;
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            z8e.i(infinity, upperCase, p8gVar.a(1.0f, utcVar, true), 0L, null, null, false, false, av8Var, 0, 248);
            context.getClass();
            String valueOf = String.valueOf(i3);
            valueOf.getClass();
            String string = context.getString(R.string.n_points, valueOf);
            string.getClass();
            long f2 = i3 < 0 ? ljg.f(av8Var, 1754806072, R.color.error, av8Var, false) : ljg.f(av8Var, 1754806583, R.color.n_lv_1, av8Var, false);
            String upperCase2 = oea.v(R.string.fantasy_transfer_points_fee, av8Var).toUpperCase(locale);
            upperCase2.getClass();
            z8e.i(string, upperCase2, p8gVar.a(1.0f, utcVar, true), f2, null, null, false, false, av8Var, 0, 240);
            Locale d3 = dla.d();
            Set set = o84.a;
            String format = String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Double.valueOf(d2)}, 2));
            long f3 = d2 < 0.0d ? ljg.f(av8Var, 1754816088, R.color.error, av8Var, false) : ljg.f(av8Var, 1754816599, R.color.n_lv_1, av8Var, false);
            String upperCase3 = oea.v(R.string.bank, av8Var).toUpperCase(locale);
            upperCase3.getClass();
            z8e.i(format, upperCase3, p8gVar.a(1.0f, utcVar, true), f3, null, null, false, false, av8Var, 0, 240);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i2, i3, d2, xtcVar, i4) { // from class: nn7
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ double c;
                public final /* synthetic */ xtc d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(3073);
                    fqj.l(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(sk8 sk8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        tc3 tc3Var;
        int i4;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-132167179);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(sk8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = 0;
        int i7 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i8 = sk8Var.g;
            x43 x43Var = sk8Var.s;
            String str = sk8Var.h;
            String str2 = sk8Var.i;
            boolean z = sk8Var.e;
            tc3 H = yqo.H(-288496497, av8Var2, new ok8(sk8Var, i6));
            tc3 H2 = yqo.H(-2099341803, av8Var2, new ok8(sk8Var, i7));
            tc3 H3 = yqo.H(1327698131, av8Var2, new ok8(sk8Var, i5));
            int i9 = i3 & 112;
            boolean i10 = (i9 == 32) | av8Var2.i(sk8Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i10 || O == a99Var) {
                tc3Var = H3;
                i4 = 0;
                O = new pk8(function1, sk8Var, i4);
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i4 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i9 == 32) {
                i4 = 1;
            }
            int i11 = i4 | (av8Var2.i(sk8Var) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i11 != 0 || O2 == a99Var) {
                O2 = new pk8(function1, sk8Var, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i8, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i3 & 896) | 1600512, (i3 << 15) & 3670016, 62624);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qk8(sk8Var, function1, xtcVar, i2, 0);
        }
    }

    public static final void n(int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1257244356);
        if (i2 == 0 && av8Var.D()) {
            av8Var.W();
        } else {
            int i3 = er9.b;
            av8Var.e0(-1115894518);
            av8Var.e0(1886828752);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            int i4 = 0;
            if (av8Var.S) {
                av8Var.l(new ptj(i4, 15));
            } else {
                av8Var.q0();
            }
            ljg.t(av8Var, true, false, false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tdj(i2);
        }
    }

    public static final void o(sk1 sk1Var, boolean z, of3 of3Var, int i2) {
        ema emaVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(156073330);
        int i3 = (av8Var.g(sk1Var) ? 32 : 16) | i2;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            if (sk1Var == null) {
                av8Var.d0(-1868843515);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                av8Var.s(false);
            } else {
                av8Var.d0(-1868713935);
                if (z) {
                    emaVar = hkg.c0(context) ? null : ema.a;
                    if (emaVar == null) {
                        emaVar = ema.b;
                    }
                } else {
                    emaVar = hkg.c0(context) ? null : ema.b;
                    if (emaVar == null) {
                        emaVar = ema.a;
                    }
                }
                tol.b(dh3.n.a(emaVar), yqo.H(2098554326, av8Var, new vn6(13, context, sk1Var)), av8Var, 56);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(i2, i4, sk1Var, z);
        }
    }

    public static byte[] p(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final xtc q(xtc xtcVar, ct8 ct8Var) {
        return xtcVar.z(new mf3(ct8Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (defpackage.ktm.u(r9, r1, kotlin.jvm.internal.Intrinsics.c(r7, r2) ? r0.getWidth() : defpackage.l.e(r7.a, r8), kotlin.jvm.internal.Intrinsics.c(r7, r2) ? r0.getHeight() : defpackage.l.e(r7.b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap r(Drawable drawable, Bitmap.Config config, jjh jjhVar, int i2, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    jjh jjhVar2 = jjh.c;
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = l.a;
        boolean z2 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? mutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? mutate.getIntrinsicHeight() : bitmap.getHeight();
        int i3 = intrinsicHeight > 0 ? intrinsicHeight : 512;
        jjh jjhVar3 = jjh.c;
        double u = ktm.u(intrinsicWidth, i3, Intrinsics.c(jjhVar, jjhVar3) ? intrinsicWidth : l.e(jjhVar.a, i2), Intrinsics.c(jjhVar, jjhVar3) ? i3 : l.e(jjhVar.b, i2), i2);
        int a2 = wzb.a(intrinsicWidth * u);
        int a3 = wzb.a(u * i3);
        if (config == null || config == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, a3, config);
        createBitmap.getClass();
        Rect bounds = mutate.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        mutate.setBounds(0, 0, a2, a3);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static void s(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        is8.e(fc6.k(file, "Unable to create parent directories of "));
    }

    public static final boolean t(Context context, s5k s5kVar, String str) {
        SharedPreferences d2;
        yea yeaVar = j58.a;
        AnalystOfferRemoteConfig c2 = j58.c();
        if (c2 != null) {
            if (!Intrinsics.c(c2.getOfferId(), str)) {
                c2 = null;
            }
            if (c2 != null) {
                DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences = d2;
                }
                Long valueOf = sharedPreferences.getBoolean("DEV_MODE_FORCE_DEVICE_TIME", false) ? Long.valueOf(System.currentTimeMillis() / 1000) : xe6.c().b();
                ia0 ia0Var = ia0.q;
                long longValue = ((Number) n9e.x(ok3.p(), new s1(7, c2, str))).longValue();
                if (s5kVar != s5k.d || longValue != 0) {
                    LocalDate plusDays = vxd.o(Instant.ofEpochMilli(longValue)).plusDays(c2.getOfferLength() - 1);
                    LocalTime localTime = LocalTime.MAX;
                    long epochSecond = plusDays.atTime(localTime).atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
                    long epochSecond2 = LocalDate.parse(c2.getStartDate(), ofPattern).atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
                    if (longValue == 0) {
                        epochSecond = LocalDate.parse(c2.getEndDate(), ofPattern).atTime(localTime).atZone(ZoneId.systemDefault()).toEpochSecond();
                    }
                    long longValue2 = valueOf.longValue();
                    if (epochSecond2 <= longValue2 && longValue2 <= epochSecond) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String u(int i2) {
        return lnb.k(i2, "activity with result code: ", " indicating not RESULT_OK");
    }

    public static w69 v(SSLSession sSLSession) {
        List list;
        sSLSession.getClass();
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            a70.r("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            is8.e("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        tu2 s = tu2.b.s(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            a70.r("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            is8.e("tlsVersion == NONE");
            return null;
        }
        ljj.b.getClass();
        ljj a2 = ubf.a(protocol);
        try {
            list = yol.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            list = km5.a;
        }
        return new w69(a2, s, yol.k(sSLSession.getLocalCertificates()), new el2(list, 2));
    }

    public static final Object w(nt9 nt9Var, sl6 sl6Var) {
        Object obj = nt9Var.v.a.get(sl6Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = nt9Var.x.n.a.get(sl6Var);
        return obj2 == null ? sl6Var.a : obj2;
    }

    public static final Object x(tvd tvdVar, sl6 sl6Var) {
        Object obj = tvdVar.j.a.get(sl6Var);
        return obj == null ? sl6Var.a : obj;
    }

    public static final Integer y(Cursor cursor, String str) {
        try {
            return Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Integer z(Cursor cursor, String str) {
        Integer y = y(cursor, str);
        if (y != null && y.intValue() == -1) {
            return null;
        }
        return y;
    }
}
