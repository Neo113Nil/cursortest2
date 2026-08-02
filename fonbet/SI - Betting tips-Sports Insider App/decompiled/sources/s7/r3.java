package s7;

import android.app.AlarmManager;
import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r3 implements m1 {
    public static volatile r3 K;
    public final HashMap B;
    public final HashMap C;
    public final HashMap D;
    public l2 F;
    public String G;
    public e3 H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f22987a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f22988b;

    /* renamed from: c, reason: collision with root package name */
    public j f22989c;

    /* renamed from: d, reason: collision with root package name */
    public t0 f22990d;

    /* renamed from: e, reason: collision with root package name */
    public j3 f22991e;

    /* renamed from: f, reason: collision with root package name */
    public c f22992f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f22993g;

    /* renamed from: h, reason: collision with root package name */
    public r0 f22994h;

    /* renamed from: i, reason: collision with root package name */
    public a3 f22995i;

    /* renamed from: k, reason: collision with root package name */
    public x0 f22996k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f22997l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22999n;

    /* renamed from: o, reason: collision with root package name */
    public long f23000o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f23001p;

    /* renamed from: r, reason: collision with root package name */
    public int f23002r;

    /* renamed from: s, reason: collision with root package name */
    public int f23003s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23004t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23005u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23006v;

    /* renamed from: w, reason: collision with root package name */
    public FileLock f23007w;

    /* renamed from: x, reason: collision with root package name */
    public FileChannel f23008x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f23009y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f23010z;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f22998m = new AtomicBoolean(false);
    public final LinkedList q = new LinkedList();
    public final HashMap E = new HashMap();
    public final o3 J = new o3(this);
    public long A = -1;
    public final n3 j = new n3(this);

    public r3(b2.e eVar) {
        this.f22997l = f1.s(eVar.f2968a, null, null);
        r0 r0Var = new r0(this, 2);
        r0Var.l();
        this.f22993g = r0Var;
        r0 r0Var2 = new r0(this, 0);
        r0Var2.l();
        this.f22988b = r0Var2;
        z0 z0Var = new z0(this);
        z0Var.l();
        this.f22987a = z0Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        b().s(new androidx.core.widget.b(this, eVar));
    }

    public static r3 C(Context context) {
        g6.v.h(context);
        g6.v.h(context.getApplicationContext());
        if (K == null) {
            synchronized (r3.class) {
                try {
                    if (K == null) {
                        K = new r3(new b2.e(context, 5));
                    }
                } finally {
                }
            }
        }
        return K;
    }

    public static final void D(com.google.android.gms.internal.measurement.z2 z2Var, int i5, String str) {
        List i10 = z2Var.i();
        for (int i11 = 0; i11 < i10.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.d3) i10.get(i11)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
        B.i("_err");
        B.k(i5);
        com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) B.f();
        com.google.android.gms.internal.measurement.c3 B2 = com.google.android.gms.internal.measurement.d3.B();
        B2.i("_ev");
        B2.j(str);
        com.google.android.gms.internal.measurement.d3 d3Var2 = (com.google.android.gms.internal.measurement.d3) B2.f();
        z2Var.l(d3Var);
        z2Var.l(d3Var2);
    }

    public static final void E(com.google.android.gms.internal.measurement.z2 z2Var, String str) {
        List i5 = z2Var.i();
        for (int i10 = 0; i10 < i5.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.d3) i5.get(i10)).q())) {
                z2Var.n(i10);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.f5821b);
    }

    public static final void U(l3 l3Var) {
        if (l3Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!l3Var.f22877c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(l3Var.getClass())));
        }
    }

    public static final Boolean V(zzr zzrVar) {
        Boolean bool = zzrVar.f5834p;
        String str = zzrVar.C;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((n1) r7.a.n(str).f22318b).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(String str, int i5, Throwable th2, byte[] bArr, Map map) {
        boolean z5;
        r0 r0Var = this.f22988b;
        b().j();
        l0();
        g6.v.e(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.f23004t = false;
                O();
                throw th3;
            }
        }
        l0 l0Var = a().f22910n;
        Integer valueOf = Integer.valueOf(bArr.length);
        l0Var.b(valueOf, "onConfigFetched. Response size");
        j jVar = this.f22989c;
        U(jVar);
        jVar.V();
        try {
            j jVar2 = this.f22989c;
            U(jVar2);
            s0 l02 = jVar2.l0(str);
            if (i5 != 200 && i5 != 204) {
                if (i5 == 304) {
                    i5 = 304;
                }
                z5 = false;
                if (l02 == null) {
                    a().f22906i.b(n0.r(str), "App does not exist in onConfigFetched. appId");
                } else {
                    z0 z0Var = this.f22987a;
                    if (z5 || i5 == 404) {
                        String M = M("Last-Modified", map);
                        String M2 = M("ETag", map);
                        if (i5 != 404 && i5 != 304) {
                            U(z0Var);
                            z0Var.x(str, M, M2, bArr);
                            f().getClass();
                            l02.f(System.currentTimeMillis());
                            j jVar3 = this.f22989c;
                            U(jVar3);
                            jVar3.m0(l02, false);
                            if (i5 != 404) {
                                a().f22907k.b(str, "Config not found. Using empty config. appId");
                            } else {
                                a().f22910n.c(Integer.valueOf(i5), valueOf, "Successfully fetched config. Got network response. code, size");
                            }
                            U(r0Var);
                            if (r0Var.D() || !L()) {
                                U(r0Var);
                                if (r0Var.D()) {
                                    j jVar4 = this.f22989c;
                                    U(jVar4);
                                    if (jVar4.p(l02.D())) {
                                        t(l02.D());
                                    }
                                }
                                N();
                            } else {
                                q();
                            }
                        }
                        U(z0Var);
                        if (z0Var.v(str) == null) {
                            U(z0Var);
                            z0Var.x(str, null, null, null);
                        }
                        f().getClass();
                        l02.f(System.currentTimeMillis());
                        j jVar32 = this.f22989c;
                        U(jVar32);
                        jVar32.m0(l02, false);
                        if (i5 != 404) {
                        }
                        U(r0Var);
                        if (r0Var.D()) {
                        }
                        U(r0Var);
                        if (r0Var.D()) {
                        }
                        N();
                    } else {
                        f().getClass();
                        l02.g(System.currentTimeMillis());
                        j jVar5 = this.f22989c;
                        U(jVar5);
                        jVar5.m0(l02, false);
                        a().f22910n.c(Integer.valueOf(i5), th2, "Fetching config failed. code, error");
                        U(z0Var);
                        z0Var.j();
                        z0Var.f23272m.put(str, null);
                        io.sentry.android.core.s sVar = this.f22995i.f22648i;
                        f().getClass();
                        sVar.b(System.currentTimeMillis());
                        if (i5 == 503 || i5 == 429) {
                            io.sentry.android.core.s sVar2 = this.f22995i.f22646g;
                            f().getClass();
                            sVar2.b(System.currentTimeMillis());
                        }
                        N();
                    }
                }
                j jVar6 = this.f22989c;
                U(jVar6);
                jVar6.W();
                this.f23004t = false;
                O();
            }
            if (th2 == null) {
                z5 = true;
                if (l02 == null) {
                }
                j jVar62 = this.f22989c;
                U(jVar62);
                jVar62.W();
                this.f23004t = false;
                O();
            }
            z5 = false;
            if (l02 == null) {
            }
            j jVar622 = this.f22989c;
            U(jVar622);
            jVar622.W();
            this.f23004t = false;
            O();
        } finally {
            j jVar7 = this.f22989c;
            U(jVar7);
            jVar7.X();
        }
    }

    public final void B() {
        b().j();
        l0();
        if (this.f22999n) {
            return;
        }
        this.f22999n = true;
        b().j();
        FileLock fileLock = this.f23007w;
        f1 f1Var = this.f22997l;
        if (fileLock == null || !fileLock.isValid()) {
            ((f1) this.f22989c.f3328a).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(f1Var.f22740a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f23008x = channel;
                FileLock tryLock = channel.tryLock();
                this.f23007w = tryLock;
                if (tryLock == null) {
                    a().f22903f.a("Storage concurrent data access panic");
                    return;
                }
                a().f22910n.a("Storage concurrent access okay");
            } catch (FileNotFoundException e7) {
                a().f22903f.b(e7, "Failed to acquire storage lock");
                return;
            } catch (IOException e9) {
                a().f22903f.b(e9, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e10) {
                a().f22906i.b(e10, "Storage lock already acquired");
                return;
            }
        } else {
            a().f22910n.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f23008x;
        b().j();
        int i5 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().f22903f.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i5 = allocate.getInt();
                } else if (read != -1) {
                    a().f22906i.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e11) {
                a().f22903f.b(e11, "Failed to read from channel");
            }
        }
        f0 r5 = f1Var.r();
        r5.k();
        int i10 = r5.f22729e;
        b().j();
        if (i5 > i10) {
            a().f22903f.c(Integer.valueOf(i5), Integer.valueOf(i10), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i5 < i10) {
            FileChannel fileChannel2 = this.f23008x;
            b().j();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().f22903f.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i10);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().f22903f.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().f22910n.c(Integer.valueOf(i5), Integer.valueOf(i10), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e12) {
                    a().f22903f.b(e12, "Failed to write to channel");
                }
            }
            a().f22903f.c(Integer.valueOf(i5), Integer.valueOf(i10), "Storage version upgrade failed. Previous, current version");
        }
    }

    public final int F(String str, r7.a aVar) {
        n1 n9;
        z0 z0Var = this.f22987a;
        com.google.android.gms.internal.measurement.z1 E = z0Var.E(str);
        p1 p1Var = p1.AD_PERSONALIZATION;
        if (E == null) {
            aVar.p(p1Var, f.FAILSAFE);
            return 1;
        }
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str);
        if (l02 == null || ((n1) r7.a.n(l02.s()).f22318b) != n1.POLICY || (n9 = z0Var.n(str, p1Var)) == n1.UNINITIALIZED) {
            aVar.p(p1Var, f.REMOTE_DEFAULT);
            if (z0Var.D(str, p1Var)) {
                return 0;
            }
        } else {
            aVar.p(p1Var, f.REMOTE_ENFORCED_DEFAULT);
            if (n9 == n1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(com.google.android.gms.internal.measurement.a3 a3Var) {
        Serializable y5;
        HashMap hashMap = new HashMap();
        j0();
        HashMap hashMap2 = new HashMap();
        for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
            if (d3Var.q().startsWith("gad_") && (y5 = r0.y(d3Var)) != null) {
                hashMap2.put(d3Var.q(), y5);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void H() {
        b().j();
        if (this.q.isEmpty()) {
            return;
        }
        if (this.H == null) {
            this.H = new e3(this, this.f22997l, 2);
        }
        if (this.H.f22840c != 0) {
            return;
        }
        f().getClass();
        long max = Math.max(0L, ((Integer) x.C0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.I));
        a().f22910n.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        if (this.H == null) {
            this.H = new e3(this, this.f22997l, 2);
        }
        this.H.b(max);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(3:8|9|(4:11|12|(4:14|(1:21)|22|23)(29:25|26|(23:33|34|(2:36|(3:38|(4:41|(2:47|48)|49|39)|53))|54|55|(3:57|58|(9:246|(11:114|(5:118|(2:120|121)(2:123|(2:125|126)(1:127))|122|116|115)|128|129|(2:225|(3:230|(1:232)(2:234|(3:236|(3:239|(1:241)(1:242)|237)|243)(0))|233)(1:229))(1:131)|132|(2:134|(2:(2:139|(2:141|142))|190)(3:191|192|193))(2:194|(4:196|(2:(2:201|(2:203|142))|204)|192|193)(3:205|(2:216|(2:217|(2:219|(2:222|223)(1:221))(1:224)))(0)|193))|143|(9:145|(4:148|(2:165|(2:167|168)(1:169))(5:152|(5:155|(2:158|156)|159|160|153)|161|162|163)|164|146)|170|171|(4:174|(3:176|177|178)(1:180)|179|172)|181|182|(2:185|183)|186)(1:189)|187|188)|244|132|(0)(0)|143|(0)(0)|187|188))(1:247)|62|(3:63|64|(3:66|(2:68|69)(2:71|(2:73|74)(2:75|76))|70)(1:77))|78|(1:81)|(1:83)|84|(1:86)(1:245)|87|(5:92|(4:95|(2:97|98)(2:100|(2:102|103)(1:104))|99|93)|105|(1:(1:108)(1:109))|(1:111)(1:112))|(0)|244|132|(0)(0)|143|(0)(0)|187|188)|248|(2:250|(24:256|257|34|(0)|54|55|(0)(0)|62|(4:63|64|(0)(0)|70)|78|(1:81)|(0)|84|(0)(0)|87|(6:90|92|(1:93)|105|(0)|(0)(0))|(0)|244|132|(0)(0)|143|(0)(0)|187|188))|258|257|34|(0)|54|55|(0)(0)|62|(4:63|64|(0)(0)|70)|78|(0)|(0)|84|(0)(0)|87|(0)|(0)|244|132|(0)(0)|143|(0)(0)|187|188)|24)(1:259))|260|(5:262|(2:264|(3:266|267|268))|269|(1:282)(3:271|(1:273)(1:281)|(2:277|278))|268)|283|284|(3:285|286|(1:516)(2:288|(2:290|291)(1:515)))|292|(1:294)(2:512|(1:514))|295|(1:297)(1:511)|298|(1:300)(1:510)|301|(6:304|(1:306)|307|(2:309|310)(1:312)|311|302)|313|314|(2:505|(1:509))(1:318)|319|(1:321)|322|(1:324)|325|(2:327|(1:333))|334|(8:336|(8:340|341|(4:343|(2:345|(1:347))|(1:368)(5:351|(1:355)|356|(1:366)(1:360)|361)|362)(8:369|(7:432|433|372|(3:374|(3:377|(3:380|381|(3:383|384|(1:386)(6:387|(1:391)|392|(1:394)(1:428)|395|(3:397|(1:405)|406)(5:407|(3:409|(1:411)|412)(4:415|(1:417)(1:427)|418|(3:420|(1:422)|423)(2:424|(1:426)))|413|414|365)))(2:429|(0)(0)))(1:379)|375)|430)|431|384|(0)(0))|371|372|(0)|431|384|(0)(0))|363|364|365|338|337)|437|438|(1:440)|441|(2:444|442)|445)(1:504)|446|(1:448)(2:485|(20:487|(1:489)(1:503)|490|(1:492)(1:502)|493|(1:495)(1:501)|496|(1:498)(1:500)|499|450|(5:452|(2:457|458)|459|(1:461)(1:462)|458)|463|(3:(2:467|468)(1:470)|469|464)|471|472|(1:474)|475|476|477|478))|449|450|(0)|463|(1:464)|471|472|(0)|475|476|477|478) */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0f21, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0f22, code lost:
    
        ((s7.f1) r2.f3328a).a().n().c(s7.n0.r(r1), r0, "Failed to remove unused event metadata. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0b19 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b65 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0b88 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0e34 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0ef2 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025c A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02cd A[EDGE_INSN: B:77:0x02cd->B:78:0x02cd BREAK  A[LOOP:2: B:63:0x0252->B:70:0x02c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ff A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035c A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0713, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:183:0x06ed, B:185:0x06f3, B:187:0x06ff, B:194:0x0538, B:196:0x0546, B:199:0x0557, B:201:0x0568, B:203:0x0574, B:205:0x0583, B:207:0x0592, B:210:0x059e, B:212:0x05a8, B:214:0x05b2, B:217:0x05bd, B:219:0x05c3, B:223:0x05d3, B:221:0x05de, B:225:0x0471, B:227:0x047d, B:229:0x0489, B:233:0x04cd, B:234:0x04a5, B:237:0x04b7, B:239:0x04bd, B:241:0x04c7, B:248:0x0154, B:250:0x0161, B:252:0x016f, B:254:0x0175, B:257:0x0180, B:262:0x072c, B:264:0x073e, B:266:0x0747, B:268:0x0777, B:269:0x074f, B:271:0x0758, B:273:0x075e, B:275:0x076a, B:277:0x0772, B:284:0x077a, B:285:0x0786, B:288:0x078e, B:291:0x07a0, B:292:0x07ab, B:294:0x07b3, B:295:0x07e2, B:297:0x07fe, B:298:0x0813, B:300:0x082f, B:301:0x0844, B:302:0x0860, B:304:0x0866, B:306:0x087e, B:307:0x088c, B:309:0x089c, B:311:0x08aa, B:314:0x08ad, B:316:0x08f7, B:318:0x08fd, B:319:0x0928, B:321:0x0930, B:322:0x094e, B:324:0x0954, B:325:0x0968, B:327:0x097f, B:329:0x0990, B:331:0x09a2, B:333:0x09ac, B:334:0x09af, B:336:0x0a0a, B:337:0x0a1d, B:340:0x0a25, B:343:0x0a44, B:345:0x0a5d, B:347:0x0a72, B:349:0x0a77, B:351:0x0a7b, B:353:0x0a7f, B:355:0x0a89, B:356:0x0a92, B:358:0x0a96, B:360:0x0a9c, B:361:0x0aa7, B:362:0x0ab5, B:365:0x0d1c, B:369:0x0abe, B:433:0x0adc, B:372:0x0af9, B:374:0x0b19, B:375:0x0b21, B:377:0x0b27, B:381:0x0b39, B:384:0x0b4f, B:386:0x0b65, B:387:0x0b88, B:389:0x0b94, B:391:0x0baa, B:392:0x0bea, B:397:0x0c06, B:399:0x0c11, B:401:0x0c15, B:403:0x0c19, B:405:0x0c1d, B:406:0x0c29, B:407:0x0c2e, B:409:0x0c34, B:411:0x0c4c, B:412:0x0c51, B:413:0x0d19, B:415:0x0c90, B:417:0x0c95, B:420:0x0ca9, B:422:0x0cc8, B:423:0x0ccf, B:426:0x0d0d, B:427:0x0c9a, B:436:0x0ae2, B:438:0x0d27, B:440:0x0d34, B:441:0x0d48, B:442:0x0d50, B:444:0x0d56, B:446:0x0d6c, B:448:0x0d7e, B:450:0x0e2e, B:452:0x0e34, B:454:0x0e49, B:457:0x0e50, B:458:0x0e93, B:459:0x0e5f, B:461:0x0e6d, B:462:0x0e7a, B:463:0x0ea2, B:464:0x0ebb, B:467:0x0ec3, B:469:0x0ec8, B:472:0x0ed8, B:474:0x0ef2, B:475:0x0f0f, B:477:0x0f17, B:478:0x0f37, B:484:0x0f22, B:485:0x0d9a, B:487:0x0da0, B:489:0x0db0, B:490:0x0db7, B:495:0x0dcd, B:496:0x0dd4, B:498:0x0e1f, B:499:0x0e26, B:500:0x0e23, B:501:0x0dd1, B:503:0x0db4, B:505:0x090d, B:507:0x0913, B:509:0x0919, B:510:0x0841, B:511:0x0810, B:512:0x07b9, B:514:0x07bf, B:518:0x0f40), top: B:2:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(long j, String str) {
        boolean z5;
        int i5;
        Long l6;
        f1 f1Var;
        long j6;
        int i10;
        ArrayList arrayList;
        int i11;
        int delete;
        Long l10;
        long j10;
        long parseLong;
        long j11;
        int i12;
        HashMap hashMap;
        long q;
        Long l11;
        String str2;
        int i13;
        String str3;
        boolean z7;
        boolean z10;
        com.google.android.gms.internal.measurement.h3 h3Var;
        String str4;
        String str5;
        int i14;
        String str6;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        int i18;
        boolean z13;
        com.google.android.gms.internal.measurement.c3 c3Var;
        com.google.android.gms.internal.measurement.h3 h3Var2;
        r3 r3Var = this;
        String str7 = "1";
        String str8 = "_ai";
        String str9 = "purchase";
        String str10 = "items";
        Long l12 = 1L;
        r3Var.g0().V();
        try {
            g3.d dVar = new g3.d(r3Var);
            r3Var.g0().R(str, j, r3Var.A, dVar);
            ArrayList arrayList2 = (ArrayList) dVar.f9737d;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                g0().W();
                z5 = false;
            } else {
                com.google.android.gms.internal.measurement.h3 h3Var3 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).i();
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).a0();
                int i19 = -1;
                int i20 = -1;
                int i21 = 0;
                int i22 = 0;
                boolean z14 = false;
                boolean z15 = false;
                com.google.android.gms.internal.measurement.z2 z2Var = null;
                com.google.android.gms.internal.measurement.z2 z2Var2 = null;
                while (true) {
                    int size = ((ArrayList) dVar.f9737d).size();
                    i5 = i22;
                    l6 = l12;
                    f1Var = r3Var.f22997l;
                    if (i21 >= size) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.z2 z2Var3 = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.a3) ((ArrayList) dVar.f9737d).get(i21)).i();
                    int i23 = i21;
                    String str11 = str10;
                    if (r3Var.f0().y(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var3.o())) {
                        r3Var.a().o().c(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), f1Var.n().a(z2Var3.o()), "Dropping blocked raw event. appId");
                        if (!str7.equals(r3Var.f0().d(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), "measurement.upload.blacklist_internal")) && !str7.equals(r3Var.f0().d(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), "measurement.upload.blacklist_public")) && !"_err".equals(z2Var3.o())) {
                            r3Var.k0();
                            v3.z(r3Var.J, ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), 11, "_ev", z2Var3.o(), 0);
                        }
                        str2 = str7;
                        str5 = str8;
                        str4 = str9;
                        i22 = i5;
                        i15 = i23;
                        str6 = str11;
                    } else {
                        String o3 = z2Var3.o();
                        str2 = str7;
                        if (!o3.equals(str9) && !o3.equals("_iap") && !o3.equals("ecommerce_purchase")) {
                            i13 = i19;
                            if (z2Var3.o().equals(r1.g(str8, r1.f22977c, r1.f22975a))) {
                                z2Var3.b();
                                ((com.google.android.gms.internal.measurement.a3) z2Var3.f5041b).F(str8);
                                r3Var.a().q().a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(r3Var.a().t(), 5)) {
                                    for (int i24 = 0; i24 < z2Var3.j(); i24++) {
                                        if ("ad_platform".equals(z2Var3.k(i24).q()) && !z2Var3.k(i24).s().isEmpty() && "admob".equalsIgnoreCase(z2Var3.k(i24).s())) {
                                            r3Var.a().f22907k.a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            z7 = r3Var.f0().z(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var3.o());
                            if (z7) {
                                z10 = z7;
                            } else {
                                r3Var.j0();
                                String o4 = z2Var3.o();
                                g6.v.e(o4);
                                z10 = z7;
                                if (o4.hashCode() != 95027 || !o4.equals("_ui")) {
                                    str5 = str8;
                                    str4 = str9;
                                    h3Var = h3Var3;
                                    z10 = false;
                                    if (z10) {
                                        ArrayList arrayList3 = new ArrayList(z2Var3.i());
                                        int i25 = -1;
                                        int i26 = -1;
                                        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                                            if ("value".equals(((com.google.android.gms.internal.measurement.d3) arrayList3.get(i27)).q())) {
                                                i25 = i27;
                                            } else if ("currency".equals(((com.google.android.gms.internal.measurement.d3) arrayList3.get(i27)).q())) {
                                                i26 = i27;
                                            }
                                        }
                                        if (i25 != -1) {
                                            if (((com.google.android.gms.internal.measurement.d3) arrayList3.get(i25)).t() || ((com.google.android.gms.internal.measurement.d3) arrayList3.get(i25)).x()) {
                                                if (i26 != -1) {
                                                    String s8 = ((com.google.android.gms.internal.measurement.d3) arrayList3.get(i26)).s();
                                                    if (s8.length() == 3) {
                                                        int i28 = 0;
                                                        while (i28 < s8.length()) {
                                                            int codePointAt = s8.codePointAt(i28);
                                                            if (Character.isLetter(codePointAt)) {
                                                                i28 += Character.charCount(codePointAt);
                                                            }
                                                        }
                                                    }
                                                }
                                                r3Var.a().f22907k.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                z2Var3.n(i25);
                                                E(z2Var3, "_c");
                                                D(z2Var3, 19, "currency");
                                                break;
                                            }
                                            r3Var.a().f22907k.a("Value must be specified with a numeric type.");
                                            z2Var3.n(i25);
                                            E(z2Var3, "_c");
                                            D(z2Var3, 18, "value");
                                        }
                                        if ("_e".equals(z2Var3.o())) {
                                            r3Var.j0();
                                            if (r0.r((com.google.android.gms.internal.measurement.a3) z2Var3.f(), "_fr") == null) {
                                                if (z2Var2 != null && Math.abs(z2Var2.p() - z2Var3.p()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.z2 z2Var4 = (com.google.android.gms.internal.measurement.z2) z2Var2.clone();
                                                    if (r3Var.K(z2Var3, z2Var4)) {
                                                        h3Var3 = h3Var;
                                                        h3Var3.X(i20, z2Var4);
                                                        i19 = i13;
                                                        z2Var = null;
                                                        z2Var2 = null;
                                                    }
                                                }
                                                h3Var3 = h3Var;
                                                z2Var = z2Var3;
                                                i19 = i5;
                                            } else {
                                                h3Var3 = h3Var;
                                                i14 = i13;
                                                i19 = i14;
                                            }
                                        } else {
                                            h3Var3 = h3Var;
                                            if ("_vs".equals(z2Var3.o())) {
                                                r3Var.j0();
                                                if (r0.r((com.google.android.gms.internal.measurement.a3) z2Var3.f(), "_et") == null) {
                                                    if (z2Var != null && Math.abs(z2Var.p() - z2Var3.p()) <= 1000) {
                                                        com.google.android.gms.internal.measurement.z2 z2Var5 = (com.google.android.gms.internal.measurement.z2) z2Var.clone();
                                                        if (r3Var.K(z2Var5, z2Var3)) {
                                                            int i29 = i13;
                                                            h3Var3.X(i29, z2Var5);
                                                            i19 = i29;
                                                            z2Var = null;
                                                            z2Var2 = null;
                                                        }
                                                    }
                                                    i19 = i13;
                                                    z2Var2 = z2Var3;
                                                    i20 = i5;
                                                }
                                                i14 = i13;
                                                i19 = i14;
                                            } else {
                                                i14 = i13;
                                                if (r3Var.e0().t(null, x.f23200k1) && (("_f".equals(z2Var3.o()) || "_v".equals(z2Var3.o())) && ("_f".equals(z2Var3.o()) || "_v".equals(z2Var3.o())))) {
                                                    int i30 = 0;
                                                    while (true) {
                                                        if (i30 >= z2Var3.j()) {
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.d3 k6 = z2Var3.k(i30);
                                                        if ("_elt".equals(k6.q())) {
                                                            z2Var3.r(k6.u());
                                                            z2Var3.n(i30);
                                                            break;
                                                        }
                                                        i30++;
                                                    }
                                                }
                                                i19 = i14;
                                            }
                                        }
                                        if (z2Var3.j() != 0) {
                                            r3Var.j0();
                                            Bundle q3 = r0.q(z2Var3.i());
                                            int i31 = 0;
                                            while (i31 < z2Var3.j()) {
                                                com.google.android.gms.internal.measurement.d3 k9 = z2Var3.k(i31);
                                                String str12 = str11;
                                                if (!k9.q().equals(str12) || k9.z().isEmpty()) {
                                                    i16 = i31;
                                                    if (!k9.q().equals(str12)) {
                                                        r3Var.x(z2Var3.o(), (com.google.android.gms.internal.measurement.c3) k9.i(), q3, ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                                                    }
                                                } else {
                                                    String p10 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                                                    List z16 = k9.z();
                                                    Bundle[] bundleArr = new Bundle[z16.size()];
                                                    int i32 = 0;
                                                    while (i32 < z16.size()) {
                                                        com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) z16.get(i32);
                                                        r3Var.j0();
                                                        Bundle q10 = r0.q(d3Var.z());
                                                        Iterator it = d3Var.z().iterator();
                                                        while (it.hasNext()) {
                                                            r3Var.x(z2Var3.o(), (com.google.android.gms.internal.measurement.c3) ((com.google.android.gms.internal.measurement.d3) it.next()).i(), q10, p10);
                                                            i31 = i31;
                                                            z16 = z16;
                                                        }
                                                        bundleArr[i32] = q10;
                                                        i32++;
                                                        i31 = i31;
                                                        z16 = z16;
                                                    }
                                                    i16 = i31;
                                                    q3.putParcelableArray(str12, bundleArr);
                                                }
                                                i31 = i16 + 1;
                                                str11 = str12;
                                            }
                                            str6 = str11;
                                            z2Var3.b();
                                            ((com.google.android.gms.internal.measurement.a3) z2Var3.f5041b).D();
                                            r0 j0 = r3Var.j0();
                                            ArrayList arrayList4 = new ArrayList();
                                            for (String str13 : q3.keySet()) {
                                                com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
                                                B.i(str13);
                                                Object obj = q3.get(str13);
                                                if (obj != null) {
                                                    j0.J(B, obj);
                                                    arrayList4.add((com.google.android.gms.internal.measurement.d3) B.f());
                                                }
                                            }
                                            Iterator it2 = arrayList4.iterator();
                                            while (it2.hasNext()) {
                                                z2Var3.l((com.google.android.gms.internal.measurement.d3) it2.next());
                                            }
                                        } else {
                                            str6 = str11;
                                        }
                                        i15 = i23;
                                        ((ArrayList) dVar.f9737d).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var3.f());
                                        h3Var3.Y(z2Var3);
                                        i22 = i5 + 1;
                                    }
                                    if ("_e".equals(z2Var3.o())) {
                                    }
                                    if (z2Var3.j() != 0) {
                                    }
                                    i15 = i23;
                                    ((ArrayList) dVar.f9737d).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var3.f());
                                    h3Var3.Y(z2Var3);
                                    i22 = i5 + 1;
                                }
                            }
                            str5 = str8;
                            i17 = 0;
                            z11 = false;
                            z12 = false;
                            while (true) {
                                str4 = str9;
                                if (i17 >= z2Var3.j()) {
                                    break;
                                }
                                if ("_c".equals(z2Var3.k(i17).q())) {
                                    com.google.android.gms.internal.measurement.c3 c3Var2 = (com.google.android.gms.internal.measurement.c3) z2Var3.k(i17).i();
                                    h3Var2 = h3Var3;
                                    c3Var2.k(1L);
                                    com.google.android.gms.internal.measurement.d3 d3Var2 = (com.google.android.gms.internal.measurement.d3) c3Var2.f();
                                    z2Var3.b();
                                    ((com.google.android.gms.internal.measurement.a3) z2Var3.f5041b).A(i17, d3Var2);
                                    z11 = true;
                                } else {
                                    h3Var2 = h3Var3;
                                    if ("_r".equals(z2Var3.k(i17).q())) {
                                        com.google.android.gms.internal.measurement.c3 c3Var3 = (com.google.android.gms.internal.measurement.c3) z2Var3.k(i17).i();
                                        c3Var3.k(1L);
                                        com.google.android.gms.internal.measurement.d3 d3Var3 = (com.google.android.gms.internal.measurement.d3) c3Var3.f();
                                        z2Var3.b();
                                        ((com.google.android.gms.internal.measurement.a3) z2Var3.f5041b).A(i17, d3Var3);
                                        z12 = true;
                                        z11 = z11;
                                    }
                                }
                                i17++;
                                str9 = str4;
                                h3Var3 = h3Var2;
                            }
                            h3Var = h3Var3;
                            if (!z11 && z10) {
                                r3Var.a().q().b(f1Var.n().a(z2Var3.o()), "Marking event as conversion");
                                com.google.android.gms.internal.measurement.c3 B2 = com.google.android.gms.internal.measurement.d3.B();
                                B2.i("_c");
                                B2.k(1L);
                                z2Var3.m(B2);
                            }
                            if (!z12) {
                                r3Var.a().q().b(f1Var.n().a(z2Var3.o()), "Marking event as real-time");
                                com.google.android.gms.internal.measurement.c3 B3 = com.google.android.gms.internal.measurement.d3.B();
                                B3.i("_r");
                                B3.k(1L);
                                z2Var3.m(B3);
                            }
                            if (r3Var.g0().n0(r3Var.g(), ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), false, true, false, false).f22773e > r3Var.e0().r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.f23210p)) {
                                E(z2Var3, "_r");
                            } else {
                                z15 = true;
                            }
                            if (v3.j0(z2Var3.o()) && z10 && r3Var.g0().n0(r3Var.g(), ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), true, false, false, false).f22771c > r3Var.e0().r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.f23208o)) {
                                r3Var.a().o().b(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), "Too many conversions. Not logging as conversion. appId");
                                z13 = false;
                                c3Var = null;
                                int i33 = -1;
                                for (i18 = 0; i18 < z2Var3.j(); i18++) {
                                    com.google.android.gms.internal.measurement.d3 k10 = z2Var3.k(i18);
                                    if ("_c".equals(k10.q())) {
                                        c3Var = (com.google.android.gms.internal.measurement.c3) k10.i();
                                        i33 = i18;
                                    } else if ("_err".equals(k10.q())) {
                                        z13 = true;
                                    }
                                }
                                if (z13) {
                                    if (c3Var != null) {
                                        z2Var3.n(i33);
                                    } else {
                                        c3Var = null;
                                    }
                                }
                                if (c3Var == null) {
                                    com.google.android.gms.internal.measurement.c3 c3Var4 = (com.google.android.gms.internal.measurement.c3) c3Var.clone();
                                    c3Var4.i("_err");
                                    c3Var4.k(10L);
                                    com.google.android.gms.internal.measurement.d3 d3Var4 = (com.google.android.gms.internal.measurement.d3) c3Var4.f();
                                    z2Var3.b();
                                    ((com.google.android.gms.internal.measurement.a3) z2Var3.f5041b).A(i33, d3Var4);
                                } else {
                                    r3Var.a().n().b(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), "Did not find conversion parameter. appId");
                                }
                            }
                            if (z10) {
                            }
                            if ("_e".equals(z2Var3.o())) {
                            }
                            if (z2Var3.j() != 0) {
                            }
                            i15 = i23;
                            ((ArrayList) dVar.f9737d).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var3.f());
                            h3Var3.Y(z2Var3);
                            i22 = i5 + 1;
                        }
                        com.google.android.gms.internal.measurement.c3 B4 = com.google.android.gms.internal.measurement.d3.B();
                        i13 = i19;
                        B4.i("_ct");
                        if (!z14) {
                            String p11 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                            if (r3Var.R(p11, str9) && r3Var.R(p11, "_iap") && r3Var.R(p11, "ecommerce_purchase")) {
                                str3 = "new";
                                B4.j(str3);
                                z2Var3.l((com.google.android.gms.internal.measurement.d3) B4.f());
                                z14 = true;
                                if (z2Var3.o().equals(r1.g(str8, r1.f22977c, r1.f22975a))) {
                                }
                                z7 = r3Var.f0().z(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var3.o());
                                if (z7) {
                                }
                                str5 = str8;
                                i17 = 0;
                                z11 = false;
                                z12 = false;
                                while (true) {
                                    str4 = str9;
                                    if (i17 >= z2Var3.j()) {
                                    }
                                    i17++;
                                    str9 = str4;
                                    h3Var3 = h3Var2;
                                }
                                h3Var = h3Var3;
                                if (!z11) {
                                    r3Var.a().q().b(f1Var.n().a(z2Var3.o()), "Marking event as conversion");
                                    com.google.android.gms.internal.measurement.c3 B22 = com.google.android.gms.internal.measurement.d3.B();
                                    B22.i("_c");
                                    B22.k(1L);
                                    z2Var3.m(B22);
                                }
                                if (!z12) {
                                }
                                if (r3Var.g0().n0(r3Var.g(), ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), false, true, false, false).f22773e > r3Var.e0().r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.f23210p)) {
                                }
                                if (v3.j0(z2Var3.o())) {
                                    r3Var.a().o().b(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), "Too many conversions. Not logging as conversion. appId");
                                    z13 = false;
                                    c3Var = null;
                                    int i332 = -1;
                                    while (i18 < z2Var3.j()) {
                                    }
                                    if (z13) {
                                    }
                                    if (c3Var == null) {
                                    }
                                }
                                if (z10) {
                                }
                                if ("_e".equals(z2Var3.o())) {
                                }
                                if (z2Var3.j() != 0) {
                                }
                                i15 = i23;
                                ((ArrayList) dVar.f9737d).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var3.f());
                                h3Var3.Y(z2Var3);
                                i22 = i5 + 1;
                            }
                        }
                        str3 = "returning";
                        B4.j(str3);
                        z2Var3.l((com.google.android.gms.internal.measurement.d3) B4.f());
                        z14 = true;
                        if (z2Var3.o().equals(r1.g(str8, r1.f22977c, r1.f22975a))) {
                        }
                        z7 = r3Var.f0().z(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var3.o());
                        if (z7) {
                        }
                        str5 = str8;
                        i17 = 0;
                        z11 = false;
                        z12 = false;
                        while (true) {
                            str4 = str9;
                            if (i17 >= z2Var3.j()) {
                            }
                            i17++;
                            str9 = str4;
                            h3Var3 = h3Var2;
                        }
                        h3Var = h3Var3;
                        if (!z11) {
                        }
                        if (!z12) {
                        }
                        if (r3Var.g0().n0(r3Var.g(), ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), false, true, false, false).f22773e > r3Var.e0().r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.f23210p)) {
                        }
                        if (v3.j0(z2Var3.o())) {
                        }
                        if (z10) {
                        }
                        if ("_e".equals(z2Var3.o())) {
                        }
                        if (z2Var3.j() != 0) {
                        }
                        i15 = i23;
                        ((ArrayList) dVar.f9737d).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var3.f());
                        h3Var3.Y(z2Var3);
                        i22 = i5 + 1;
                    }
                    i21 = i15 + 1;
                    str10 = str6;
                    l12 = l6;
                    str7 = str2;
                    str8 = str5;
                    str9 = str4;
                }
                long j12 = 0;
                long j13 = 0;
                int i34 = i5;
                int i35 = 0;
                while (i35 < i34) {
                    com.google.android.gms.internal.measurement.a3 T1 = ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).T1(i35);
                    if ("_e".equals(T1.s())) {
                        r3Var.j0();
                        if (r0.r(T1, "_fr") != null) {
                            h3Var3.Z(i35);
                            i34--;
                            i35--;
                            i35++;
                        }
                    }
                    r3Var.j0();
                    com.google.android.gms.internal.measurement.d3 r5 = r0.r(T1, "_et");
                    if (r5 != null) {
                        Long valueOf = r5.t() ? Long.valueOf(r5.u()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j13 += valueOf.longValue();
                        }
                    }
                    i35++;
                }
                r3Var.J(h3Var3, j13, false);
                Iterator it3 = h3Var3.V().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.a3) it3.next()).s())) {
                        r3Var.g0().b0(h3Var3.p(), "_se");
                        break;
                    }
                }
                if (r0.X(h3Var3, "_sid") >= 0) {
                    r3Var.J(h3Var3, j13, true);
                } else {
                    int X = r0.X(h3Var3, "_se");
                    if (X >= 0) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).e0(X);
                        r3Var.a().n().b(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String p12 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                r3Var.b().j();
                r3Var.l0();
                s0 l02 = r3Var.g0().l0(p12);
                if (l02 == null) {
                    r3Var.a().n().b(n0.r(p12), "Cannot fix consent fields without appInfo. appId");
                } else {
                    r3Var.m(l02, h3Var3);
                }
                String p13 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                r3Var.b().j();
                r3Var.l0();
                s0 l03 = r3Var.g0().l0(p13);
                if (l03 == null) {
                    r3Var.a().o().b(n0.r(p13), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    r3Var.n(l03, h3Var3);
                }
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).h0(LongCompanionObject.MAX_VALUE);
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).i0(Long.MIN_VALUE);
                for (int i36 = 0; i36 < h3Var3.W(); i36++) {
                    com.google.android.gms.internal.measurement.a3 T12 = ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).T1(i36);
                    if (T12.u() < ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).a2()) {
                        long u10 = T12.u();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).h0(u10);
                    }
                    if (T12.u() > ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).c2()) {
                        long u11 = T12.u();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).i0(u11);
                    }
                }
                h3Var3.N();
                q1 q1Var = q1.f22964c;
                q1 j14 = r3Var.d(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()).j(q1.c(100, ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).u0()));
                q1 O = r3Var.g0().O(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                r3Var.g0().N(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), j14);
                p1 p1Var = p1.ANALYTICS_STORAGE;
                if (!j14.i(p1Var) && O.i(p1Var)) {
                    r3Var.g0().Z(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                } else if (j14.i(p1Var) && !O.i(p1Var)) {
                    r3Var.g0().a0(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                }
                p1 p1Var2 = p1.AD_STORAGE;
                if (!j14.i(p1Var2)) {
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).z1();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).B1();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).S0();
                }
                if (!j14.i(p1Var)) {
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).D1();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).Z0();
                }
                o8.a();
                if (r3Var.e0().t(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.Q0)) {
                    r3Var.k0();
                    if (v3.H(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()) && r3Var.d(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()).i(p1Var2) && ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).z0()) {
                        r3Var.w(h3Var3, dVar);
                    }
                }
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).L1();
                h3Var3.K(r3Var.i0().n(h3Var3.p(), h3Var3.V(), DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).U1()), Long.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).a2()), Long.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).c2()), !j14.i(p1Var)));
                if (r3Var.e0().l(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p())) {
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom i02 = r3Var.k0().i0();
                    int i37 = 0;
                    while (i37 < h3Var3.W()) {
                        com.google.android.gms.internal.measurement.z2 z2Var6 = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).T1(i37).i();
                        if (z2Var6.o().equals("_ep")) {
                            r3Var.j0();
                            String str14 = (String) r0.s((com.google.android.gms.internal.measurement.a3) z2Var6.f(), "_en");
                            n nVar = (n) hashMap2.get(str14);
                            if (nVar == null) {
                                j g02 = r3Var.g0();
                                String p14 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                                g6.v.h(str14);
                                nVar = g02.H("events", p14, str14);
                                if (nVar != null) {
                                    hashMap2.put(str14, nVar);
                                }
                            }
                            if (nVar == null || nVar.f22898i != null) {
                                l10 = l6;
                            } else {
                                Long l13 = nVar.j;
                                if (l13 != null && l13.longValue() > 1) {
                                    r3Var.j0();
                                    r0.p(z2Var6, "_sr", l13);
                                }
                                Boolean bool = nVar.f22899k;
                                if (bool == null || !bool.booleanValue()) {
                                    l10 = l6;
                                } else {
                                    r3Var.j0();
                                    l10 = l6;
                                    r0.p(z2Var6, "_efs", l10);
                                }
                                arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.f());
                            }
                            h3Var3.X(i37, z2Var6);
                            j10 = j12;
                        } else {
                            l10 = l6;
                            z0 f02 = r3Var.f0();
                            j10 = j12;
                            String p15 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                            String d10 = f02.d(p15, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(d10)) {
                                try {
                                    parseLong = Long.parseLong(d10);
                                } catch (NumberFormatException e7) {
                                    ((f1) f02.f3328a).a().o().c(n0.r(p15), e7, "Unable to parse timezone offset. appId");
                                }
                                r3Var.k0();
                                long j15 = parseLong * 60000;
                                long p16 = (z2Var6.p() + j15) / 86400000;
                                com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) z2Var6.f();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (com.google.android.gms.internal.measurement.d3 d3Var5 : a3Var.p()) {
                                        j11 = j15;
                                        if (!"_dbg".equals(d3Var5.q())) {
                                            j15 = j11;
                                        } else if (l10.equals(Long.valueOf(d3Var5.u()))) {
                                            i12 = 1;
                                            if (i12 > 0) {
                                            }
                                        } else {
                                            i12 = f0().A(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var6.o());
                                            if (i12 > 0) {
                                                a().o().c(z2Var6.o(), Integer.valueOf(i12), "Sample rate must be positive. event, rate");
                                                arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.f());
                                                h3Var3.X(i37, z2Var6);
                                            } else {
                                                n nVar2 = (n) hashMap2.get(z2Var6.o());
                                                if (nVar2 == null && (nVar2 = g0().H("events", ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var6.o())) == null) {
                                                    a().o().c(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var6.o(), "Event being bundled has no eventAggregate. appId, eventName");
                                                    nVar2 = new n(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var6.o(), 1L, 1L, 1L, z2Var6.p(), 0L, null, null, null, null);
                                                }
                                                j0();
                                                Long l14 = (Long) r0.s((com.google.android.gms.internal.measurement.a3) z2Var6.f(), "_eid");
                                                boolean z17 = l14 != null;
                                                if (i12 == 1) {
                                                    arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.f());
                                                    if (z17 && (nVar2.f22898i != null || nVar2.j != null || nVar2.f22899k != null)) {
                                                        hashMap2.put(z2Var6.o(), nVar2.b(null, null, null));
                                                    }
                                                    h3Var3.X(i37, z2Var6);
                                                } else {
                                                    if (i02.nextInt(i12) == 0) {
                                                        j0();
                                                        HashMap hashMap3 = hashMap2;
                                                        Long valueOf2 = Long.valueOf(i12);
                                                        r0.p(z2Var6, "_sr", valueOf2);
                                                        arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.f());
                                                        if (z17) {
                                                            nVar2 = nVar2.b(null, valueOf2, null);
                                                        }
                                                        hashMap = hashMap3;
                                                        hashMap.put(z2Var6.o(), new n(nVar2.f22890a, nVar2.f22891b, nVar2.f22892c, nVar2.f22893d, nVar2.f22894e, nVar2.f22895f, z2Var6.p(), Long.valueOf(p16), nVar2.f22898i, nVar2.j, nVar2.f22899k));
                                                        l11 = l10;
                                                    } else {
                                                        hashMap = hashMap2;
                                                        Long l15 = nVar2.f22897h;
                                                        if (l15 != null) {
                                                            q = l15.longValue();
                                                        } else {
                                                            k0();
                                                            q = (j11 + z2Var6.q()) / 86400000;
                                                        }
                                                        if (q != p16) {
                                                            j0();
                                                            r0.p(z2Var6, "_efs", l10);
                                                            j0();
                                                            l11 = l10;
                                                            Long valueOf3 = Long.valueOf(i12);
                                                            r0.p(z2Var6, "_sr", valueOf3);
                                                            arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.f());
                                                            if (z17) {
                                                                nVar2 = nVar2.b(null, valueOf3, Boolean.TRUE);
                                                            }
                                                            hashMap.put(z2Var6.o(), new n(nVar2.f22890a, nVar2.f22891b, nVar2.f22892c, nVar2.f22893d, nVar2.f22894e, nVar2.f22895f, z2Var6.p(), Long.valueOf(p16), nVar2.f22898i, nVar2.j, nVar2.f22899k));
                                                        } else {
                                                            l11 = l10;
                                                            if (z17) {
                                                                hashMap.put(z2Var6.o(), nVar2.b(l14, null, null));
                                                            }
                                                        }
                                                    }
                                                    h3Var3.X(i37, z2Var6);
                                                    i37++;
                                                    r3Var = this;
                                                    l6 = l11;
                                                    hashMap2 = hashMap;
                                                    j12 = j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j15;
                                i12 = f0().A(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var6.o());
                                if (i12 > 0) {
                                }
                            }
                            parseLong = j10;
                            r3Var.k0();
                            long j152 = parseLong * 60000;
                            long p162 = (z2Var6.p() + j152) / 86400000;
                            com.google.android.gms.internal.measurement.a3 a3Var2 = (com.google.android.gms.internal.measurement.a3) z2Var6.f();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            j11 = j152;
                            i12 = f0().A(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), z2Var6.o());
                            if (i12 > 0) {
                            }
                        }
                        hashMap = hashMap2;
                        l11 = l10;
                        i37++;
                        r3Var = this;
                        l6 = l11;
                        hashMap2 = hashMap;
                        j12 = j10;
                    }
                    j6 = j12;
                    HashMap hashMap4 = hashMap2;
                    if (arrayList5.size() < h3Var3.W()) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).a0();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).Z(arrayList5);
                    }
                    Iterator it4 = hashMap4.entrySet().iterator();
                    while (it4.hasNext()) {
                        g0().I("events", (n) ((Map.Entry) it4.next()).getValue());
                    }
                } else {
                    j6 = 0;
                }
                String p17 = ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p();
                s0 l04 = g0().l0(p17);
                if (l04 == null) {
                    a().n().b(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), "Bundling raw events w/o app info. appId");
                } else if (h3Var3.W() > 0) {
                    d1 d1Var = l04.f23026a.f22746g;
                    f1.m(d1Var);
                    d1Var.j();
                    long j16 = l04.f23034i;
                    if (j16 != j6) {
                        h3Var3.i(j16);
                    } else {
                        h3Var3.j();
                    }
                    d1 d1Var2 = l04.f23026a.f22746g;
                    f1.m(d1Var2);
                    d1Var2.j();
                    long j17 = l04.f23033h;
                    if (j17 != j6) {
                        j16 = j17;
                    }
                    if (j16 != j6) {
                        h3Var3.c0(j16);
                    } else {
                        h3Var3.d0();
                    }
                    l04.h(h3Var3.W());
                    d1 d1Var3 = l04.f23026a.f22746g;
                    f1.m(d1Var3);
                    d1Var3.j();
                    int i38 = (int) l04.F;
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).j1(i38);
                    d1 d1Var4 = l04.f23026a.f22746g;
                    f1.m(d1Var4);
                    d1Var4.j();
                    h3Var3.y((int) l04.f23032g);
                    l04.L(((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).a2());
                    l04.M(((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).c2());
                    String u12 = l04.u();
                    if (u12 != null) {
                        h3Var3.G(u12);
                    } else {
                        h3Var3.H();
                    }
                    i10 = 0;
                    g0().m0(l04, false);
                    if (h3Var3.W() > 0) {
                        f1Var.getClass();
                        com.google.android.gms.internal.measurement.e2 v5 = f0().v(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                        if (v5 != null && v5.p()) {
                            long q11 = v5.q();
                            h3Var3.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).Q0(q11);
                            g0().q0((com.google.android.gms.internal.measurement.i3) h3Var3.f(), z15);
                        }
                        if (((com.google.android.gms.internal.measurement.i3) dVar.f9735b).E().isEmpty()) {
                            h3Var3.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).Q0(-1L);
                        } else {
                            a().o().b(n0.r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p()), "Did not find measurement config or missing version info. appId");
                        }
                        g0().q0((com.google.android.gms.internal.measurement.i3) h3Var3.f(), z15);
                    }
                    j g03 = g0();
                    arrayList = (ArrayList) dVar.f9736c;
                    g6.v.h(arrayList);
                    g03.j();
                    g03.k();
                    StringBuilder sb2 = new StringBuilder("rowid in (");
                    for (i11 = i10; i11 < arrayList.size(); i11++) {
                        if (i11 != 0) {
                            sb2.append(StringUtils.COMMA);
                        }
                        sb2.append(((Long) arrayList.get(i11)).longValue());
                    }
                    sb2.append(")");
                    delete = g03.Y().delete("raw_events", sb2.toString(), null);
                    if (delete != arrayList.size()) {
                        ((f1) g03.f3328a).a().n().c(Integer.valueOf(delete), Integer.valueOf(arrayList.size()), "Deleted fewer rows from raw events table than expected");
                    }
                    j g04 = g0();
                    g04.Y().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{p17, p17});
                    g0().W();
                    z5 = true;
                }
                i10 = 0;
                if (h3Var3.W() > 0) {
                }
                j g032 = g0();
                arrayList = (ArrayList) dVar.f9736c;
                g6.v.h(arrayList);
                g032.j();
                g032.k();
                StringBuilder sb22 = new StringBuilder("rowid in (");
                while (i11 < arrayList.size()) {
                }
                sb22.append(")");
                delete = g032.Y().delete("raw_events", sb22.toString(), null);
                if (delete != arrayList.size()) {
                }
                j g042 = g0();
                g042.Y().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{p17, p17});
                g0().W();
                z5 = true;
            }
            g0().X();
            return z5;
        } catch (Throwable th2) {
            g0().X();
            throw th2;
        }
    }

    public final void J(com.google.android.gms.internal.measurement.h3 h3Var, long j, boolean z5) {
        t3 t3Var;
        Object obj;
        String str = true != z5 ? "_lte" : "_se";
        j jVar = this.f22989c;
        U(jVar);
        t3 d02 = jVar.d0(h3Var.p(), str);
        if (d02 == null || (obj = d02.f23098e) == null) {
            String p10 = h3Var.p();
            f().getClass();
            t3Var = new t3(p10, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String p11 = h3Var.p();
            f().getClass();
            t3Var = new t3(p11, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.google.android.gms.internal.measurement.q3 A = com.google.android.gms.internal.measurement.r3.A();
        A.b();
        ((com.google.android.gms.internal.measurement.r3) A.f5041b).C(str);
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A.b();
        ((com.google.android.gms.internal.measurement.r3) A.f5041b).B(currentTimeMillis);
        Object obj2 = t3Var.f23098e;
        long longValue = ((Long) obj2).longValue();
        A.b();
        ((com.google.android.gms.internal.measurement.r3) A.f5041b).F(longValue);
        com.google.android.gms.internal.measurement.r3 r3Var = (com.google.android.gms.internal.measurement.r3) A.f();
        int X = r0.X(h3Var, str);
        if (X >= 0) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).c0(X, r3Var);
        } else {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).d0(r3Var);
        }
        if (j > 0) {
            j jVar2 = this.f22989c;
            U(jVar2);
            jVar2.c0(t3Var);
            a().f22910n.c(true != z5 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(com.google.android.gms.internal.measurement.z2 z2Var, com.google.android.gms.internal.measurement.z2 z2Var2) {
        g6.v.b("_e".equals(z2Var.o()));
        j0();
        com.google.android.gms.internal.measurement.d3 r5 = r0.r((com.google.android.gms.internal.measurement.a3) z2Var.f(), "_sc");
        String s8 = r5 == null ? null : r5.s();
        j0();
        com.google.android.gms.internal.measurement.d3 r6 = r0.r((com.google.android.gms.internal.measurement.a3) z2Var2.f(), "_pc");
        String s10 = r6 != null ? r6.s() : null;
        if (s10 == null || !s10.equals(s8)) {
            return false;
        }
        g6.v.b("_e".equals(z2Var.o()));
        j0();
        com.google.android.gms.internal.measurement.d3 r10 = r0.r((com.google.android.gms.internal.measurement.a3) z2Var.f(), "_et");
        if (r10 == null || !r10.t() || r10.u() <= 0) {
            return true;
        }
        long u10 = r10.u();
        j0();
        com.google.android.gms.internal.measurement.d3 r11 = r0.r((com.google.android.gms.internal.measurement.a3) z2Var2.f(), "_et");
        if (r11 != null && r11.u() > 0) {
            u10 += r11.u();
        }
        j0();
        r0.p(z2Var2, "_et", Long.valueOf(u10));
        j0();
        r0.p(z2Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        b().j();
        l0();
        j jVar = this.f22989c;
        U(jVar);
        if (jVar.T("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        j jVar2 = this.f22989c;
        U(jVar2);
        return !TextUtils.isEmpty(jVar2.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        boolean z5;
        long max;
        long max2;
        long j;
        Integer num;
        int intValue;
        r0 r0Var = this.f22993g;
        b().j();
        l0();
        if (this.f23000o > 0) {
            f().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.f23000o);
            if (abs > 0) {
                a().f22910n.b(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                h0().a();
                j3 j3Var = this.f22991e;
                U(j3Var);
                j3Var.n();
                return;
            }
            this.f23000o = 0L;
        }
        if (!this.f22997l.h() || !L()) {
            a().f22910n.a("Nothing to upload or uploading impossible");
            h0().a();
            j3 j3Var2 = this.f22991e;
            U(j3Var2);
            j3Var2.n();
            return;
        }
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        e0();
        long max3 = Math.max(0L, ((Long) x.P.a(null)).longValue());
        j jVar = this.f22989c;
        U(jVar);
        if (jVar.T("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            j jVar2 = this.f22989c;
            U(jVar2);
            if (jVar2.T("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z5 = false;
                if (z5) {
                    e0();
                    max = Math.max(0L, ((Long) x.I.a(null)).longValue());
                } else {
                    String n9 = e0().n("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(n9) || ".none.".equals(n9)) {
                        e0();
                        max = Math.max(0L, ((Long) x.J.a(null)).longValue());
                    } else {
                        e0();
                        max = Math.max(0L, ((Long) x.K.a(null)).longValue());
                    }
                }
                long a7 = this.f22995i.f22647h.a();
                long a10 = this.f22995i.f22648i.a();
                j jVar3 = this.f22989c;
                U(jVar3);
                long U = jVar3.U("select max(bundle_end_timestamp) from queue", null, 0L);
                j jVar4 = this.f22989c;
                U(jVar4);
                max2 = Math.max(U, jVar4.U("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(a7 - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(a10 - currentTimeMillis);
                    long j6 = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z5 && max4 > 0) {
                        j6 = Math.min(abs2, max4) + max;
                    }
                    U(r0Var);
                    j = !r0Var.T(max4, max) ? max4 + max : j6;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i5 = 0;
                        while (true) {
                            e0();
                            if (i5 >= Math.min(20, Math.max(0, ((Integer) x.R.a(null)).intValue()))) {
                                break;
                            }
                            e0();
                            j += Math.max(0L, ((Long) x.Q.a(null)).longValue()) * (1 << i5);
                            if (j > abs4) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    if (j == 0) {
                        a().f22910n.a("Next upload time is 0");
                        h0().a();
                        j3 j3Var3 = this.f22991e;
                        U(j3Var3);
                        j3Var3.n();
                        return;
                    }
                    r0 r0Var2 = this.f22988b;
                    U(r0Var2);
                    if (!r0Var2.D()) {
                        a().f22910n.a("No network");
                        t0 h02 = h0();
                        r3 r3Var = h02.f23086a;
                        r3Var.l0();
                        r3Var.b().j();
                        if (!h02.f23087b) {
                            r3Var.f22997l.f22740a.registerReceiver(h02, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            r0 r0Var3 = r3Var.f22988b;
                            U(r0Var3);
                            h02.f23088c = r0Var3.D();
                            r3Var.a().f22910n.b(Boolean.valueOf(h02.f23088c), "Registering connectivity change receiver. Network connected");
                            h02.f23087b = true;
                        }
                        j3 j3Var4 = this.f22991e;
                        U(j3Var4);
                        j3Var4.n();
                        return;
                    }
                    long a11 = this.f22995i.f22646g.a();
                    e0();
                    long max5 = Math.max(0L, ((Long) x.G.a(null)).longValue());
                    U(r0Var);
                    if (!r0Var.T(a11, max5)) {
                        j = Math.max(j, a11 + max5);
                    }
                    h0().a();
                    f().getClass();
                    long currentTimeMillis2 = j - System.currentTimeMillis();
                    if (currentTimeMillis2 <= 0) {
                        e0();
                        currentTimeMillis2 = Math.max(0L, ((Long) x.L.a(null)).longValue());
                        io.sentry.android.core.s sVar = this.f22995i.f22647h;
                        f().getClass();
                        sVar.b(System.currentTimeMillis());
                    }
                    a().f22910n.b(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                    j3 j3Var5 = this.f22991e;
                    U(j3Var5);
                    j3Var5.k();
                    f1 f1Var = (f1) j3Var5.f3328a;
                    f1Var.getClass();
                    n0 n0Var = f1Var.f22745f;
                    Context context = f1Var.f22740a;
                    if (!v3.b0(context)) {
                        f1.m(n0Var);
                        n0Var.f22909m.a("Receiver not registered/enabled");
                    }
                    if (!v3.C(context)) {
                        f1.m(n0Var);
                        n0Var.f22909m.a("Service not registered/enabled");
                    }
                    j3Var5.n();
                    f1.m(n0Var);
                    n0Var.f22910n.b(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                    f1Var.f22749k.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime() + currentTimeMillis2;
                    if (currentTimeMillis2 < Math.max(0L, ((Long) x.M.a(null)).longValue()) && j3Var5.o().f22840c == 0) {
                        j3Var5.o().b(currentTimeMillis2);
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        AlarmManager alarmManager = j3Var5.f22834d;
                        if (alarmManager != null) {
                            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) x.H.a(null)).longValue(), currentTimeMillis2), j3Var5.r());
                            return;
                        }
                        return;
                    }
                    ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                    int q = j3Var5.q();
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                    JobInfo build = new JobInfo.Builder(q, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                    Method method = com.google.android.gms.internal.measurement.g0.f5050a;
                    JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                    jobScheduler.getClass();
                    Method method2 = com.google.android.gms.internal.measurement.g0.f5050a;
                    if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                        jobScheduler.schedule(build);
                        return;
                    }
                    Method method3 = com.google.android.gms.internal.measurement.g0.f5051b;
                    try {
                        if (method3 != null) {
                            try {
                                num = (Integer) method3.invoke(UserHandle.class, null);
                            } catch (IllegalAccessException | InvocationTargetException e7) {
                                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                    io.sentry.android.core.w0.e("JobSchedulerCompat", "myUserId invocation illegal", e7);
                                }
                            }
                            if (num != null) {
                                intValue = num.intValue();
                                return;
                            }
                        }
                        return;
                    } catch (IllegalAccessException | InvocationTargetException e9) {
                        io.sentry.android.core.w0.e("UploadAlarm", "error calling scheduleAsPackage", e9);
                        jobScheduler.schedule(build);
                        return;
                    }
                    intValue = 0;
                }
                j = 0;
                if (j == 0) {
                }
            }
        }
        z5 = true;
        if (z5) {
        }
        long a72 = this.f22995i.f22647h.a();
        long a102 = this.f22995i.f22648i.a();
        j jVar32 = this.f22989c;
        U(jVar32);
        long U2 = jVar32.U("select max(bundle_end_timestamp) from queue", null, 0L);
        j jVar42 = this.f22989c;
        U(jVar42);
        max2 = Math.max(U2, jVar42.U("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        j = 0;
        if (j == 0) {
        }
    }

    public final void O() {
        b().j();
        if (this.f23004t || this.f23005u || this.f23006v) {
            a().f22910n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f23004t), Boolean.valueOf(this.f23005u), Boolean.valueOf(this.f23006v));
            return;
        }
        a().f22910n.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f23001p;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.f23001p;
        g6.v.h(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(s0 s0Var) {
        try {
            long P = s0Var.P();
            f1 f1Var = this.f22997l;
            if (P != -2147483648L) {
                if (s0Var.P() == s6.c.a(f1Var.f22740a).b(0, s0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = s6.c.a(f1Var.f22740a).b(0, s0Var.D()).versionName;
                String N = s0Var.N();
                if (N != null && N.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final zzr Q(String str) {
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str);
        if (l02 != null) {
            f1 f1Var = l02.f23026a;
            if (!TextUtils.isEmpty(l02.N())) {
                Boolean P = P(l02);
                if (P != null && !P.booleanValue()) {
                    a().f22903f.b(n0.r(str), "App version does not match; dropping. appId");
                    return null;
                }
                String G = l02.G();
                String N = l02.N();
                long P2 = l02.P();
                d1 d1Var = f1Var.f22746g;
                f1.m(d1Var);
                d1Var.j();
                String str2 = l02.f23036l;
                d1 d1Var2 = f1Var.f22746g;
                f1.m(d1Var2);
                d1Var2.j();
                long j = l02.f23037m;
                d1 d1Var3 = f1Var.f22746g;
                f1.m(d1Var3);
                d1Var3.j();
                long j6 = l02.f23038n;
                d1 d1Var4 = f1Var.f22746g;
                f1.m(d1Var4);
                d1Var4.j();
                boolean z5 = l02.f23039o;
                String J = l02.J();
                d1 d1Var5 = f1Var.f22746g;
                f1.m(d1Var5);
                d1Var5.j();
                boolean z7 = l02.f23040p;
                Boolean w10 = l02.w();
                long b10 = l02.b();
                d1 d1Var6 = f1Var.f22746g;
                f1.m(d1Var6);
                d1Var6.j();
                ArrayList arrayList = l02.f23042s;
                String g10 = d(str).g();
                boolean y5 = l02.y();
                d1 d1Var7 = f1Var.f22746g;
                f1.m(d1Var7);
                d1Var7.j();
                long j10 = l02.f23045v;
                int i5 = d(str).f22966b;
                String str3 = o0(str).f22862b;
                d1 d1Var8 = f1Var.f22746g;
                f1.m(d1Var8);
                d1Var8.j();
                int i10 = l02.f23047x;
                d1 d1Var9 = f1Var.f22746g;
                f1.m(d1Var9);
                d1Var9.j();
                return new zzr(str, G, N, P2, str2, j, j6, (String) null, z5, false, J, 0L, 0, z7, false, w10, b10, (List) arrayList, g10, "", (String) null, y5, j10, i5, str3, i10, l02.B, l02.C(), l02.s(), 0L, l02.t());
            }
        }
        a().f22909m.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        j jVar = this.f22989c;
        U(jVar);
        n H = jVar.H("events", str, str2);
        return H == null || H.f22892c < 1;
    }

    public final void W(zzpl zzplVar, zzr zzrVar) {
        String str;
        long j;
        b().j();
        l0();
        boolean T = T(zzrVar);
        String str2 = zzrVar.f5820a;
        if (T) {
            if (!zzrVar.f5827h) {
                c0(zzrVar);
                return;
            }
            v3 k0 = k0();
            String str3 = zzplVar.f5814b;
            int q02 = k0.q0(str3);
            o3 o3Var = this.J;
            if (q02 != 0) {
                k0();
                e0();
                String o3 = v3.o(str3, 24, true);
                int length = str3 != null ? str3.length() : 0;
                k0();
                v3.z(o3Var, zzrVar.f5820a, q02, "_ev", o3, length);
                return;
            }
            int w10 = k0().w(zzplVar.c(), str3);
            if (w10 != 0) {
                k0();
                e0();
                String o4 = v3.o(str3, 24, true);
                Object c2 = zzplVar.c();
                int length2 = (c2 == null || !((c2 instanceof String) || (c2 instanceof CharSequence))) ? 0 : c2.toString().length();
                k0();
                v3.z(o3Var, zzrVar.f5820a, w10, "_ev", o4, length2);
                return;
            }
            Object x10 = k0().x(zzplVar.c(), str3);
            if (x10 != null) {
                if ("_sid".equals(str3)) {
                    long j6 = zzplVar.f5815c;
                    String str4 = zzplVar.f5818f;
                    g6.v.h(str2);
                    j jVar = this.f22989c;
                    U(jVar);
                    t3 d02 = jVar.d0(str2, "_sno");
                    if (d02 != null) {
                        Object obj = d02.f23098e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            W(new zzpl(j6, Long.valueOf(j + 1), "_sno", str4), zzrVar);
                        }
                    }
                    if (d02 != null) {
                        a().f22906i.b(d02.f23098e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    j jVar2 = this.f22989c;
                    U(jVar2);
                    n H = jVar2.H("events", str2, "_s");
                    if (H != null) {
                        l0 l0Var = a().f22910n;
                        str = "_sid";
                        long j10 = H.f22892c;
                        l0Var.b(Long.valueOf(j10), "Backfill the session number. Last used session number");
                        j = j10;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    W(new zzpl(j6, Long.valueOf(j + 1), "_sno", str4), zzrVar);
                } else {
                    str = "_sid";
                }
                g6.v.h(str2);
                String str5 = zzplVar.f5818f;
                g6.v.h(str5);
                t3 t3Var = new t3(str2, str5, str3, zzplVar.f5815c, x10);
                l0 l0Var2 = a().f22910n;
                f1 f1Var = this.f22997l;
                i0 i0Var = f1Var.j;
                String str6 = t3Var.f23096c;
                l0Var2.c(i0Var.c(str6), x10, "Setting user property");
                j jVar3 = this.f22989c;
                U(jVar3);
                jVar3.V();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = t3Var.f23098e;
                    if (equals) {
                        j jVar4 = this.f22989c;
                        U(jVar4);
                        t3 d03 = jVar4.d0(str2, "_id");
                        if (d03 != null && !obj2.equals(d03.f23098e)) {
                            j jVar5 = this.f22989c;
                            U(jVar5);
                            jVar5.b0(str2, "_lair");
                        }
                    }
                    c0(zzrVar);
                    j jVar6 = this.f22989c;
                    U(jVar6);
                    boolean c02 = jVar6.c0(t3Var);
                    if (str.equals(str3)) {
                        r0 r0Var = this.f22993g;
                        U(r0Var);
                        String str7 = zzrVar.f5838u;
                        long U = TextUtils.isEmpty(str7) ? 0L : r0Var.U(str7.getBytes(Charset.forName("UTF-8")));
                        j jVar7 = this.f22989c;
                        U(jVar7);
                        s0 l02 = jVar7.l0(str2);
                        if (l02 != null) {
                            l02.A(U);
                            if (l02.o()) {
                                j jVar8 = this.f22989c;
                                U(jVar8);
                                jVar8.m0(l02, false);
                            }
                        }
                    }
                    j jVar9 = this.f22989c;
                    U(jVar9);
                    jVar9.W();
                    if (!c02) {
                        a().f22903f.c(f1Var.j.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        k0();
                        v3.z(o3Var, str2, 9, null, null, 0);
                    }
                    j jVar10 = this.f22989c;
                    U(jVar10);
                    jVar10.X();
                } catch (Throwable th2) {
                    j jVar11 = this.f22989c;
                    U(jVar11);
                    jVar11.X();
                    throw th2;
                }
            }
        }
    }

    public final void X(String str, zzr zzrVar) {
        b().j();
        l0();
        boolean T = T(zzrVar);
        String str2 = zzrVar.f5820a;
        if (T) {
            if (!zzrVar.f5827h) {
                c0(zzrVar);
                return;
            }
            Boolean V = V(zzrVar);
            if ("_npa".equals(str) && V != null) {
                a().f22909m.a("Falling back to manifest metadata value for ad personalization");
                f().getClass();
                W(new zzpl(System.currentTimeMillis(), Long.valueOf(true != V.booleanValue() ? 0L : 1L), "_npa", "auto"), zzrVar);
                return;
            }
            l0 l0Var = a().f22909m;
            f1 f1Var = this.f22997l;
            l0Var.b(f1Var.j.c(str), "Removing user property");
            j jVar = this.f22989c;
            U(jVar);
            jVar.V();
            try {
                c0(zzrVar);
                if ("_id".equals(str)) {
                    j jVar2 = this.f22989c;
                    U(jVar2);
                    g6.v.h(str2);
                    jVar2.b0(str2, "_lair");
                }
                j jVar3 = this.f22989c;
                U(jVar3);
                g6.v.h(str2);
                jVar3.b0(str2, str);
                j jVar4 = this.f22989c;
                U(jVar4);
                jVar4.W();
                a().f22909m.b(f1Var.j.c(str), "User property removed");
                j jVar5 = this.f22989c;
                U(jVar5);
                jVar5.X();
            } catch (Throwable th2) {
                j jVar6 = this.f22989c;
                U(jVar6);
                jVar6.X();
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:76|77|78|(2:80|(8:82|(3:84|(2:86|(1:88))(1:108)|107)(1:109)|89|(1:91)(1:106)|92|93|94|(4:96|(1:98)(1:102)|99|(1:101))))|110|93|94|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x034c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x034d, code lost:
    
        r2.a().f22903f.c(s7.n0.r(r3), r0, "Application info is null, first open report might be inaccurate. appId");
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0422 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x012c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0114 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028f A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:120:0x0177, B:122:0x0185, B:55:0x0264, B:57:0x028f, B:58:0x0292, B:128:0x01ad, B:130:0x01d5, B:131:0x01e6, B:133:0x01ed, B:135:0x01f3, B:137:0x01fd, B:139:0x0203, B:141:0x0209, B:143:0x020f, B:145:0x0214, B:148:0x022d, B:153:0x0231, B:154:0x0242, B:155:0x024d, B:54:0x0258), top: B:119:0x0177, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b5 A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037e A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038e A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035f A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.zzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [s7.r3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [s7.r3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(zzr zzrVar) {
        t3 d02;
        Boolean V;
        long j;
        long j6;
        int i5;
        n H;
        boolean z5;
        String str;
        f1 f1Var;
        String str2;
        long x10;
        f1 f1Var2;
        PackageInfo packageInfo;
        zzr zzrVar2;
        ApplicationInfo applicationInfo;
        long j10;
        boolean z7;
        r3 r3Var = zzrVar;
        f1 f1Var3 = this.f22997l;
        b().j();
        l0();
        g6.v.h(r3Var);
        boolean z10 = r3Var.f5833o;
        String str3 = r3Var.f5820a;
        g6.v.e(str3);
        if (!T(r3Var)) {
            return;
        }
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str3);
        if (l02 != null && TextUtils.isEmpty(l02.G()) && !TextUtils.isEmpty(r3Var.f5821b)) {
            l02.f(0L);
            j jVar2 = this.f22989c;
            U(jVar2);
            jVar2.m0(l02, false);
            z0 z0Var = this.f22987a;
            U(z0Var);
            z0Var.j();
            z0Var.f23268h.remove(str3);
        }
        if (!r3Var.f5827h) {
            c0(zzrVar);
            return;
        }
        long j11 = r3Var.f5830l;
        if (j11 == 0) {
            f().getClass();
            j11 = System.currentTimeMillis();
        }
        long j12 = j11;
        int i10 = r3Var.f5831m;
        if (i10 != 0 && i10 != 1) {
            a().f22906i.c(n0.r(str3), Integer.valueOf(i10), "Incorrect app type, assuming installed app. appId, appType");
            i10 = 0;
        }
        j jVar3 = this.f22989c;
        U(jVar3);
        jVar3.V();
        try {
            j jVar4 = this.f22989c;
            U(jVar4);
            d02 = jVar4.d0(str3, "_npa");
            V = V(r3Var);
        } catch (Throwable th2) {
            th = th2;
            r3Var = this;
        }
        try {
            if (d02 != null) {
                j = 1;
                if (!"auto".equals(d02.f23095b)) {
                    j6 = j12;
                    if (e0().t(null, x.f23181c1)) {
                        i5 = i10;
                        b0(r3Var, j6);
                    } else {
                        i5 = i10;
                        b0(r3Var, r3Var.D);
                    }
                    c0(zzrVar);
                    if (i5 != 0) {
                        j jVar5 = this.f22989c;
                        U(jVar5);
                        H = jVar5.H("events", str3, "_f");
                        z5 = false;
                    } else {
                        j jVar6 = this.f22989c;
                        U(jVar6);
                        H = jVar6.H("events", str3, "_v");
                        z5 = true;
                    }
                    if (H != null) {
                        long j13 = ((j6 / 3600000) + j) * 3600000;
                        if (z5) {
                            r3 r3Var2 = this;
                            Long valueOf = Long.valueOf(j13);
                            long j14 = j6;
                            r3Var2.W(new zzpl(j14, valueOf, "_fvt", "auto"), r3Var);
                            r3Var2.b().j();
                            r3Var2.l0();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z10) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (r3Var2.e0().t(null, x.f23200k1)) {
                                r3Var2.f().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            r3Var2.i(new zzbg("_v", new zzbe(bundle), "auto", j14), r3Var);
                            r3Var = r3Var2;
                        } else {
                            Long valueOf2 = Long.valueOf(j13);
                            long j15 = j6;
                            W(new zzpl(j15, valueOf2, "_fot", "auto"), r3Var);
                            b().j();
                            x0 x0Var = this.f22996k;
                            g6.v.h(x0Var);
                            f1 f1Var4 = x0Var.f23230b;
                            if (str3 != null) {
                                try {
                                    if (!str3.isEmpty()) {
                                        str = "_elt";
                                        d1 d1Var = f1Var4.f22746g;
                                        Context context = f1Var4.f22740a;
                                        n0 n0Var = f1Var4.f22745f;
                                        f1.m(d1Var);
                                        d1Var.j();
                                        if (x0Var.a()) {
                                            f1Var = f1Var3;
                                            ca.a aVar = new ca.a(x0Var, str3);
                                            d1 d1Var2 = f1Var4.f22746g;
                                            f1.m(d1Var2);
                                            d1Var2.j();
                                            str2 = str3;
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                f1.m(n0Var);
                                                n0Var.j.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                    f1.m(n0Var);
                                                    n0Var.f22908l.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str4 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str4) && x0Var.a()) {
                                                            try {
                                                                boolean a7 = p6.a.b().a(context, new Intent(intent), aVar, 1);
                                                                f1.m(n0Var);
                                                                n0Var.f22910n.b(a7 ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e7) {
                                                                n0 n0Var2 = f1Var4.f22745f;
                                                                f1.m(n0Var2);
                                                                n0Var2.f22903f.b(e7.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            f1.m(n0Var);
                                                            n0Var.f22906i.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            f1.m(n0Var);
                                            n0Var.f22908l.a("Install Referrer Reporter is not available");
                                            f1Var = f1Var3;
                                            str2 = str3;
                                        }
                                        b().j();
                                        l0();
                                        Bundle bundle2 = new Bundle();
                                        long j16 = j;
                                        bundle2.putLong("_c", j16);
                                        bundle2.putLong("_r", j16);
                                        bundle2.putLong("_uwa", 0L);
                                        bundle2.putLong("_pfo", 0L);
                                        bundle2.putLong("_sys", 0L);
                                        bundle2.putLong("_sysu", 0L);
                                        bundle2.putLong("_et", j16);
                                        if (z10) {
                                            bundle2.putLong("_dac", j16);
                                        }
                                        g6.v.h(str2);
                                        r3Var = this;
                                        j jVar7 = r3Var.f22989c;
                                        U(jVar7);
                                        g6.v.e(str2);
                                        jVar7.j();
                                        jVar7.k();
                                        String str5 = str2;
                                        x10 = jVar7.x(str5);
                                        f1Var2 = f1Var;
                                        if (f1Var2.f22740a.getPackageManager() != null) {
                                            r3Var.a().f22903f.b(n0.r(str5), "PackageManager is null, first open report might be inaccurate. appId");
                                            zzrVar2 = zzrVar;
                                        } else {
                                            try {
                                                packageInfo = s6.c.a(f1Var2.f22740a).b(0, str5);
                                            } catch (PackageManager.NameNotFoundException e9) {
                                                r3Var.a().f22903f.c(n0.r(str5), e9, "Package info is null, first open report might be inaccurate. appId");
                                                packageInfo = null;
                                            }
                                            if (packageInfo != null) {
                                                long j17 = packageInfo.firstInstallTime;
                                                if (j17 != 0) {
                                                    if (j17 != packageInfo.lastUpdateTime) {
                                                        if (!r3Var.e0().t(null, x.J0)) {
                                                            bundle2.putLong("_uwa", 1L);
                                                        } else if (x10 == 0) {
                                                            bundle2.putLong("_uwa", 1L);
                                                            z7 = false;
                                                            x10 = 0;
                                                        }
                                                        z7 = false;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    zzrVar2 = zzrVar;
                                                    r3Var.W(new zzpl(j15, Long.valueOf(true != z7 ? 0L : 1L), "_fi", "auto"), zzrVar2);
                                                    applicationInfo = s6.c.a(f1Var2.f22740a).a(0, str5);
                                                    if (applicationInfo != null) {
                                                        if ((applicationInfo.flags & 1) != 0) {
                                                            j10 = 1;
                                                            bundle2.putLong("_sys", 1L);
                                                        } else {
                                                            j10 = 1;
                                                        }
                                                        if ((applicationInfo.flags & 128) != 0) {
                                                            bundle2.putLong("_sysu", j10);
                                                        }
                                                    }
                                                }
                                            }
                                            zzrVar2 = zzrVar;
                                            applicationInfo = s6.c.a(f1Var2.f22740a).a(0, str5);
                                            if (applicationInfo != null) {
                                            }
                                        }
                                        if (x10 >= 0) {
                                            bundle2.putLong("_pfo", x10);
                                        }
                                        if (r3Var.e0().t(null, x.f23200k1)) {
                                            r3Var.f().getClass();
                                            bundle2.putLong(str, System.currentTimeMillis());
                                        }
                                        r3Var.i(new zzbg("_f", new zzbe(bundle2), "auto", j15), zzrVar2);
                                        r3Var = r3Var;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r3Var = this;
                                    j jVar8 = r3Var.f22989c;
                                    U(jVar8);
                                    jVar8.X();
                                    throw th;
                                }
                            }
                            f1Var = f1Var3;
                            str = "_elt";
                            str2 = str3;
                            n0 n0Var3 = f1Var4.f22745f;
                            f1.m(n0Var3);
                            n0Var3.j.a("Install Referrer Reporter was called with invalid app package name");
                            b().j();
                            l0();
                            Bundle bundle22 = new Bundle();
                            long j162 = j;
                            bundle22.putLong("_c", j162);
                            bundle22.putLong("_r", j162);
                            bundle22.putLong("_uwa", 0L);
                            bundle22.putLong("_pfo", 0L);
                            bundle22.putLong("_sys", 0L);
                            bundle22.putLong("_sysu", 0L);
                            bundle22.putLong("_et", j162);
                            if (z10) {
                            }
                            g6.v.h(str2);
                            r3Var = this;
                            j jVar72 = r3Var.f22989c;
                            U(jVar72);
                            g6.v.e(str2);
                            jVar72.j();
                            jVar72.k();
                            String str52 = str2;
                            x10 = jVar72.x(str52);
                            f1Var2 = f1Var;
                            if (f1Var2.f22740a.getPackageManager() != null) {
                            }
                            if (x10 >= 0) {
                            }
                            if (r3Var.e0().t(null, x.f23200k1)) {
                            }
                            r3Var.i(new zzbg("_f", new zzbe(bundle22), "auto", j15), zzrVar2);
                            r3Var = r3Var;
                        }
                    } else {
                        long j18 = j6;
                        r3 r3Var3 = this;
                        boolean z11 = r3Var.f5828i;
                        r3Var = r3Var3;
                        if (z11) {
                            r3Var3.i(new zzbg("_cd", new zzbe(new Bundle()), "auto", j18), r3Var);
                            r3Var = r3Var3;
                        }
                    }
                    j jVar9 = r3Var.f22989c;
                    U(jVar9);
                    jVar9.W();
                    j jVar10 = r3Var.f22989c;
                    U(jVar10);
                    jVar10.X();
                    return;
                }
            } else {
                j = 1;
            }
            if (H != null) {
            }
            j jVar92 = r3Var.f22989c;
            U(jVar92);
            jVar92.W();
            j jVar102 = r3Var.f22989c;
            U(jVar102);
            jVar102.X();
            return;
        } catch (Throwable th4) {
            th = th4;
            j jVar82 = r3Var.f22989c;
            U(jVar82);
            jVar82.X();
            throw th;
        }
        if (V != null) {
            zzpl zzplVar = new zzpl(j12, Long.valueOf(true != V.booleanValue() ? 0L : j), "_npa", "auto");
            j6 = j12;
            if (d02 == null || !d02.f23098e.equals(zzplVar.f5816d)) {
                W(zzplVar, r3Var);
            }
        } else {
            j6 = j12;
            if (d02 != null) {
                X("_npa", r3Var);
            }
        }
        if (e0().t(null, x.f23181c1)) {
        }
        c0(zzrVar);
        if (i5 != 0) {
        }
    }

    public final void Z(zzah zzahVar, zzr zzrVar) {
        zzbg zzbgVar;
        g6.v.e(zzahVar.f5785a);
        g6.v.h(zzahVar.f5786b);
        g6.v.h(zzahVar.f5787c);
        g6.v.e(zzahVar.f5787c.f5814b);
        b().j();
        l0();
        if (T(zzrVar)) {
            if (!zzrVar.f5827h) {
                c0(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z5 = false;
            zzahVar2.f5789e = false;
            j jVar = this.f22989c;
            U(jVar);
            jVar.V();
            try {
                j jVar2 = this.f22989c;
                U(jVar2);
                String str = zzahVar2.f5785a;
                g6.v.h(str);
                zzah h02 = jVar2.h0(str, zzahVar2.f5787c.f5814b);
                f1 f1Var = this.f22997l;
                if (h02 != null && !h02.f5786b.equals(zzahVar2.f5786b)) {
                    a().f22906i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", f1Var.j.c(zzahVar2.f5787c.f5814b), zzahVar2.f5786b, h02.f5786b);
                }
                if (h02 != null && h02.f5789e) {
                    zzahVar2.f5786b = h02.f5786b;
                    zzahVar2.f5788d = h02.f5788d;
                    zzahVar2.f5792h = h02.f5792h;
                    zzahVar2.f5790f = h02.f5790f;
                    zzahVar2.f5793i = h02.f5793i;
                    zzahVar2.f5789e = true;
                    zzpl zzplVar = zzahVar2.f5787c;
                    zzahVar2.f5787c = new zzpl(h02.f5787c.f5815c, zzplVar.c(), zzplVar.f5814b, h02.f5787c.f5818f);
                } else if (TextUtils.isEmpty(zzahVar2.f5790f)) {
                    zzpl zzplVar2 = zzahVar2.f5787c;
                    zzahVar2.f5787c = new zzpl(zzahVar2.f5788d, zzplVar2.c(), zzplVar2.f5814b, zzahVar2.f5787c.f5818f);
                    zzahVar2.f5789e = true;
                    z5 = true;
                }
                if (zzahVar2.f5789e) {
                    zzpl zzplVar3 = zzahVar2.f5787c;
                    String str2 = zzahVar2.f5785a;
                    g6.v.h(str2);
                    String str3 = zzahVar2.f5786b;
                    String str4 = zzplVar3.f5814b;
                    long j = zzplVar3.f5815c;
                    Object c2 = zzplVar3.c();
                    g6.v.h(c2);
                    t3 t3Var = new t3(str2, str3, str4, j, c2);
                    Object obj = t3Var.f23098e;
                    String str5 = t3Var.f23096c;
                    j jVar3 = this.f22989c;
                    U(jVar3);
                    if (jVar3.c0(t3Var)) {
                        a().f22909m.d("User property updated immediately", zzahVar2.f5785a, f1Var.j.c(str5), obj);
                    } else {
                        a().f22903f.d("(2)Too many active user properties, ignoring", n0.r(zzahVar2.f5785a), f1Var.j.c(str5), obj);
                    }
                    if (z5 && (zzbgVar = zzahVar2.f5793i) != null) {
                        l(new zzbg(zzbgVar, zzahVar2.f5788d), zzrVar);
                    }
                }
                j jVar4 = this.f22989c;
                U(jVar4);
                if (jVar4.g0(zzahVar2)) {
                    a().f22909m.d("Conditional property added", zzahVar2.f5785a, f1Var.j.c(zzahVar2.f5787c.f5814b), zzahVar2.f5787c.c());
                } else {
                    a().f22903f.d("Too many conditional properties, ignoring", n0.r(zzahVar2.f5785a), f1Var.j.c(zzahVar2.f5787c.f5814b), zzahVar2.f5787c.c());
                }
                j jVar5 = this.f22989c;
                U(jVar5);
                jVar5.W();
                j jVar6 = this.f22989c;
                U(jVar6);
                jVar6.X();
            } catch (Throwable th2) {
                j jVar7 = this.f22989c;
                U(jVar7);
                jVar7.X();
                throw th2;
            }
        }
    }

    @Override // s7.m1
    public final n0 a() {
        f1 f1Var = this.f22997l;
        g6.v.h(f1Var);
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        return n0Var;
    }

    public final void a0(zzah zzahVar, zzr zzrVar) {
        g6.v.e(zzahVar.f5785a);
        g6.v.h(zzahVar.f5787c);
        g6.v.e(zzahVar.f5787c.f5814b);
        b().j();
        l0();
        if (T(zzrVar)) {
            if (!zzrVar.f5827h) {
                c0(zzrVar);
                return;
            }
            j jVar = this.f22989c;
            U(jVar);
            jVar.V();
            try {
                c0(zzrVar);
                String str = zzahVar.f5785a;
                g6.v.h(str);
                j jVar2 = this.f22989c;
                U(jVar2);
                zzah h02 = jVar2.h0(str, zzahVar.f5787c.f5814b);
                f1 f1Var = this.f22997l;
                if (h02 != null) {
                    a().f22909m.c(zzahVar.f5785a, f1Var.j.c(zzahVar.f5787c.f5814b), "Removing conditional user property");
                    j jVar3 = this.f22989c;
                    U(jVar3);
                    jVar3.i0(str, zzahVar.f5787c.f5814b);
                    if (h02.f5789e) {
                        j jVar4 = this.f22989c;
                        U(jVar4);
                        jVar4.b0(str, zzahVar.f5787c.f5814b);
                    }
                    zzbg zzbgVar = zzahVar.f5794k;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.f5798b;
                        zzbg N = k0().N(zzbgVar.f5797a, zzbeVar != null ? zzbeVar.s0() : null, h02.f5786b, zzbgVar.f5800d, true);
                        g6.v.h(N);
                        l(N, zzrVar);
                    }
                } else {
                    a().f22906i.c(n0.r(zzahVar.f5785a), f1Var.j.c(zzahVar.f5787c.f5814b), "Conditional user property doesn't exist");
                }
                j jVar5 = this.f22989c;
                U(jVar5);
                jVar5.W();
                j jVar6 = this.f22989c;
                U(jVar6);
                jVar6.X();
            } catch (Throwable th2) {
                j jVar7 = this.f22989c;
                U(jVar7);
                jVar7.X();
                throw th2;
            }
        }
    }

    @Override // s7.m1
    public final d1 b() {
        f1 f1Var = this.f22997l;
        g6.v.h(f1Var);
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        return d1Var;
    }

    public final void b0(zzr zzrVar, long j) {
        j jVar = this.f22989c;
        U(jVar);
        String str = zzrVar.f5820a;
        g6.v.h(str);
        s0 l02 = jVar.l0(str);
        if (l02 != null) {
            k0();
            String str2 = zzrVar.f5821b;
            String G = l02.G();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(G);
            if (!isEmpty && !isEmpty2) {
                g6.v.h(str2);
                if (!str2.equals(G)) {
                    a().f22906i.b(n0.r(l02.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    j jVar2 = this.f22989c;
                    U(jVar2);
                    f1 f1Var = (f1) jVar2.f3328a;
                    String D = l02.D();
                    jVar2.k();
                    jVar2.j();
                    g6.v.e(D);
                    try {
                        SQLiteDatabase Y = jVar2.Y();
                        String[] strArr = {D};
                        int delete = Y.delete("events", "app_id=?", strArr) + Y.delete("user_attributes", "app_id=?", strArr) + Y.delete("conditional_properties", "app_id=?", strArr) + Y.delete("apps", "app_id=?", strArr) + Y.delete("raw_events", "app_id=?", strArr) + Y.delete("raw_events_metadata", "app_id=?", strArr) + Y.delete("event_filters", "app_id=?", strArr) + Y.delete("property_filters", "app_id=?", strArr) + Y.delete("audience_filter_values", "app_id=?", strArr) + Y.delete("consent_settings", "app_id=?", strArr) + Y.delete("default_event_params", "app_id=?", strArr) + Y.delete("trigger_uris", "app_id=?", strArr);
                        if (f1Var.f22743d.t(null, x.f23197i1)) {
                            delete += Y.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            n0 n0Var = f1Var.f22745f;
                            f1.m(n0Var);
                            n0Var.f22910n.c(D, Integer.valueOf(delete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e7) {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.c(n0.r(D), e7, "Error deleting application data. appId, error");
                    }
                    l02 = null;
                }
            }
        }
        if (l02 != null) {
            boolean z5 = (l02.P() == -2147483648L || l02.P() == zzrVar.j) ? false : true;
            String N = l02.N();
            if (z5 || ((l02.P() != -2147483648L || N == null || N.equals(zzrVar.f5822c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", N);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j);
                if (e0().t(null, x.d1)) {
                    i(zzbgVar, zzrVar);
                } else {
                    j(zzbgVar, zzrVar);
                }
            }
        }
    }

    @Override // s7.m1
    public final md.o c() {
        return this.f22997l.f22742c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 c0(zzr zzrVar) {
        boolean z5;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        b().j();
        l0();
        g6.v.h(zzrVar);
        boolean z7 = zzrVar.f5832n;
        String str5 = zzrVar.f5820a;
        g6.v.e(str5);
        String str6 = zzrVar.f5837t;
        if (!str6.isEmpty()) {
            this.D.put(str5, new p3(this, str6));
        }
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str5);
        q1 j6 = d(str5).j(q1.c(100, zzrVar.f5836s));
        p1 p1Var = p1.AD_STORAGE;
        String o3 = j6.i(p1Var) ? this.f22995i.o(str5, z7) : "";
        boolean z10 = true;
        p1 p1Var2 = p1.ANALYTICS_STORAGE;
        if (l02 == null) {
            l02 = new s0(this.f22997l, str5);
            if (j6.i(p1Var2)) {
                l02.F(o(j6));
            }
            if (j6.i(p1Var)) {
                l02.I(o3);
            }
        } else {
            f1 f1Var = l02.f23026a;
            if (j6.i(p1Var) && o3 != null) {
                d1 d1Var = f1Var.f22746g;
                f1.m(d1Var);
                d1Var.j();
                if (!o3.equals(l02.f23030e)) {
                    d1 d1Var2 = f1Var.f22746g;
                    f1.m(d1Var2);
                    d1Var2.j();
                    boolean isEmpty = TextUtils.isEmpty(l02.f23030e);
                    l02.I(o3);
                    if (z7) {
                        a3 a3Var = this.f22995i;
                        a3Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((j6.i(p1Var) ? a3Var.n(str5) : new Pair("", Boolean.FALSE)).first) && !isEmpty) {
                            if (j6.i(p1Var2)) {
                                l02.F(o(j6));
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            j jVar2 = this.f22989c;
                            U(jVar2);
                            if (jVar2.d0(str5, "_id") != null) {
                                j jVar3 = this.f22989c;
                                U(jVar3);
                                if (jVar3.d0(str5, "_lair") == null) {
                                    f().getClass();
                                    t3 t3Var = new t3(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    j jVar4 = this.f22989c;
                                    U(jVar4);
                                    jVar4.c0(t3Var);
                                }
                            }
                            f1 f1Var2 = l02.f23026a;
                            l02.H(zzrVar.f5821b);
                            str = zzrVar.f5829k;
                            if (!TextUtils.isEmpty(str)) {
                                l02.K(str);
                            }
                            j = zzrVar.f5824e;
                            if (j != 0) {
                                l02.S(j);
                            }
                            str2 = zzrVar.f5822c;
                            if (!TextUtils.isEmpty(str2)) {
                                l02.O(str2);
                            }
                            l02.Q(zzrVar.j);
                            str3 = zzrVar.f5823d;
                            if (str3 != null) {
                                l02.R(str3);
                            }
                            l02.a(zzrVar.f5825f);
                            l02.d(zzrVar.f5827h);
                            str4 = zzrVar.f5826g;
                            if (!TextUtils.isEmpty(str4)) {
                                l02.v(str4);
                            }
                            d1 d1Var3 = f1Var2.f22746g;
                            f1.m(d1Var3);
                            d1Var3.j();
                            l02.Q |= l02.f23040p == z7;
                            l02.f23040p = z7;
                            Boolean bool = zzrVar.f5834p;
                            d1 d1Var4 = f1Var2.f22746g;
                            f1.m(d1Var4);
                            d1Var4.j();
                            l02.Q |= !Objects.equals(l02.q, bool);
                            l02.q = bool;
                            l02.c(zzrVar.q);
                            String str7 = zzrVar.f5838u;
                            d1 d1Var5 = f1Var2.f22746g;
                            f1.m(d1Var5);
                            d1Var5.j();
                            l02.Q |= !Objects.equals(l02.f23043t, str7);
                            l02.f23043t = str7;
                            q7 q7Var = q7.f5204b;
                            if (e0().t(null, x.M0)) {
                                if (e0().t(null, x.L0)) {
                                    l02.x(null);
                                }
                            } else {
                                l02.x(zzrVar.f5835r);
                            }
                            boolean z11 = zzrVar.f5839v;
                            d1 d1Var6 = f1Var2.f22746g;
                            f1.m(d1Var6);
                            d1Var6.j();
                            l02.Q |= l02.f23044u == z11;
                            l02.f23044u = z11;
                            String str8 = zzrVar.B;
                            d1 d1Var7 = f1Var2.f22746g;
                            f1.m(d1Var7);
                            d1Var7.j();
                            l02.Q |= l02.C == str8;
                            l02.C = str8;
                            o8.a();
                            if (e0().t(null, x.Q0)) {
                                int i5 = zzrVar.f5843z;
                                d1 d1Var8 = f1Var2.f22746g;
                                f1.m(d1Var8);
                                d1Var8.j();
                                l02.Q |= l02.f23047x != i5;
                                l02.f23047x = i5;
                            }
                            l02.z(zzrVar.f5840w);
                            String str9 = zzrVar.C;
                            d1 d1Var9 = f1Var2.f22746g;
                            f1.m(d1Var9);
                            d1Var9.j();
                            l02.Q |= l02.G == str9;
                            l02.G = str9;
                            int i10 = zzrVar.E;
                            d1 d1Var10 = f1Var2.f22746g;
                            f1.m(d1Var10);
                            d1Var10.j();
                            l02.Q |= l02.I != i10;
                            l02.I = i10;
                            if (!l02.o()) {
                                z10 = z5;
                            } else if (!z5) {
                                return l02;
                            }
                            j jVar5 = this.f22989c;
                            U(jVar5);
                            jVar5.m0(l02, z10);
                            return l02;
                        }
                    }
                    if (TextUtils.isEmpty(l02.E()) && j6.i(p1Var2)) {
                        l02.F(o(j6));
                    }
                }
            }
            if (TextUtils.isEmpty(l02.E()) && j6.i(p1Var2)) {
                l02.F(o(j6));
            }
        }
        z5 = false;
        f1 f1Var22 = l02.f23026a;
        l02.H(zzrVar.f5821b);
        str = zzrVar.f5829k;
        if (!TextUtils.isEmpty(str)) {
        }
        j = zzrVar.f5824e;
        if (j != 0) {
        }
        str2 = zzrVar.f5822c;
        if (!TextUtils.isEmpty(str2)) {
        }
        l02.Q(zzrVar.j);
        str3 = zzrVar.f5823d;
        if (str3 != null) {
        }
        l02.a(zzrVar.f5825f);
        l02.d(zzrVar.f5827h);
        str4 = zzrVar.f5826g;
        if (!TextUtils.isEmpty(str4)) {
        }
        d1 d1Var32 = f1Var22.f22746g;
        f1.m(d1Var32);
        d1Var32.j();
        l02.Q |= l02.f23040p == z7;
        l02.f23040p = z7;
        Boolean bool2 = zzrVar.f5834p;
        d1 d1Var42 = f1Var22.f22746g;
        f1.m(d1Var42);
        d1Var42.j();
        l02.Q |= !Objects.equals(l02.q, bool2);
        l02.q = bool2;
        l02.c(zzrVar.q);
        String str72 = zzrVar.f5838u;
        d1 d1Var52 = f1Var22.f22746g;
        f1.m(d1Var52);
        d1Var52.j();
        l02.Q |= !Objects.equals(l02.f23043t, str72);
        l02.f23043t = str72;
        q7 q7Var2 = q7.f5204b;
        if (e0().t(null, x.M0)) {
        }
        boolean z112 = zzrVar.f5839v;
        d1 d1Var62 = f1Var22.f22746g;
        f1.m(d1Var62);
        d1Var62.j();
        l02.Q |= l02.f23044u == z112;
        l02.f23044u = z112;
        String str82 = zzrVar.B;
        d1 d1Var72 = f1Var22.f22746g;
        f1.m(d1Var72);
        d1Var72.j();
        l02.Q |= l02.C == str82;
        l02.C = str82;
        o8.a();
        if (e0().t(null, x.Q0)) {
        }
        l02.z(zzrVar.f5840w);
        String str92 = zzrVar.C;
        d1 d1Var92 = f1Var22.f22746g;
        f1.m(d1Var92);
        d1Var92.j();
        l02.Q |= l02.G == str92;
        l02.G = str92;
        int i102 = zzrVar.E;
        d1 d1Var102 = f1Var22.f22746g;
        f1.m(d1Var102);
        d1Var102.j();
        l02.Q |= l02.I != i102;
        l02.I = i102;
        if (!l02.o()) {
        }
        j jVar52 = this.f22989c;
        U(jVar52);
        jVar52.m0(l02, z10);
        return l02;
    }

    public final q1 d(String str) {
        q1 q1Var = q1.f22964c;
        b().j();
        l0();
        HashMap hashMap = this.B;
        q1 q1Var2 = (q1) hashMap.get(str);
        if (q1Var2 == null) {
            j jVar = this.f22989c;
            U(jVar);
            q1Var2 = jVar.C(str);
            if (q1Var2 == null) {
                q1Var2 = q1.f22964c;
            }
            b().j();
            l0();
            hashMap.put(str, q1Var2);
            j jVar2 = this.f22989c;
            U(jVar2);
            jVar2.E(str, q1Var2);
        }
        return q1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, zzr zzrVar) {
        int[] iArr;
        b().j();
        o8.a();
        e e0 = e0();
        String str = zzrVar.f5820a;
        if (!e0.t(str, x.Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().f22903f.a("Uri sources and timestamps do not match");
                } else {
                    int i5 = 0;
                    while (i5 < intArray.length) {
                        j jVar = this.f22989c;
                        U(jVar);
                        f1 f1Var = (f1) jVar.f3328a;
                        int i10 = intArray[i5];
                        long j = longArray[i5];
                        g6.v.e(str);
                        jVar.j();
                        jVar.k();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e7) {
                            e = e7;
                            iArr = intArray;
                        }
                        try {
                            int delete = jVar.Y().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j)});
                            n0 n0Var = f1Var.f22745f;
                            f1.m(n0Var);
                            l0 l0Var = n0Var.f22910n;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(delete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            l0Var.d(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j));
                        } catch (SQLiteException e9) {
                            e = e9;
                            n0 n0Var2 = f1Var.f22745f;
                            f1.m(n0Var2);
                            n0Var2.f22903f.c(n0.r(str), e, "Error pruning trigger URIs. appId");
                            i5++;
                            intArray = iArr;
                        }
                        i5++;
                        intArray = iArr;
                    }
                }
            }
        }
        j jVar2 = this.f22989c;
        U(jVar2);
        String str2 = zzrVar.f5820a;
        g6.v.e(str2);
        jVar2.j();
        jVar2.k();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = jVar2.Y().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", AdRevenueConstants.SOURCE_KEY}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (SQLiteException e10) {
            n0 n0Var3 = ((f1) jVar2.f3328a).f22745f;
            f1.m(n0Var3);
            n0Var3.f22903f.c(n0.r(str2), e10, "Error querying trigger uris. appId");
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    @Override // s7.m1
    public final Context e() {
        return this.f22997l.f22740a;
    }

    public final e e0() {
        f1 f1Var = this.f22997l;
        g6.v.h(f1Var);
        return f1Var.f22743d;
    }

    @Override // s7.m1
    public final q6.a f() {
        f1 f1Var = this.f22997l;
        g6.v.h(f1Var);
        return f1Var.f22749k;
    }

    public final z0 f0() {
        z0 z0Var = this.f22987a;
        U(z0Var);
        return z0Var;
    }

    public final long g() {
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        a3 a3Var = this.f22995i;
        a3Var.k();
        a3Var.j();
        io.sentry.android.core.s sVar = a3Var.j;
        long a7 = sVar.a();
        if (a7 == 0) {
            f1.k(((f1) a3Var.f3328a).f22748i);
            a7 = r2.i0().nextInt(86400000) + 1;
            sVar.b(a7);
        }
        return ((((currentTimeMillis + a7) / 1000) / 60) / 60) / 24;
    }

    public final j g0() {
        j jVar = this.f22989c;
        U(jVar);
        return jVar;
    }

    public final void h(zzbg zzbgVar, String str) {
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str);
        if (l02 != null) {
            f1 f1Var = l02.f23026a;
            if (!TextUtils.isEmpty(l02.N())) {
                Boolean P = P(l02);
                if (P == null) {
                    if (!"_ui".equals(zzbgVar.f5797a)) {
                        a().f22906i.b(n0.r(str), "Could not find package. appId");
                    }
                } else if (!P.booleanValue()) {
                    a().f22903f.b(n0.r(str), "App version does not match; dropping event. appId");
                    return;
                }
                String G = l02.G();
                String N = l02.N();
                long P2 = l02.P();
                d1 d1Var = f1Var.f22746g;
                f1.m(d1Var);
                d1Var.j();
                String str2 = l02.f23036l;
                d1 d1Var2 = f1Var.f22746g;
                f1.m(d1Var2);
                d1Var2.j();
                long j = l02.f23037m;
                d1 d1Var3 = f1Var.f22746g;
                f1.m(d1Var3);
                d1Var3.j();
                long j6 = l02.f23038n;
                d1 d1Var4 = f1Var.f22746g;
                f1.m(d1Var4);
                d1Var4.j();
                boolean z5 = l02.f23039o;
                String J = l02.J();
                d1 d1Var5 = f1Var.f22746g;
                f1.m(d1Var5);
                d1Var5.j();
                boolean z7 = l02.f23040p;
                Boolean w10 = l02.w();
                long b10 = l02.b();
                d1 d1Var6 = f1Var.f22746g;
                f1.m(d1Var6);
                d1Var6.j();
                ArrayList arrayList = l02.f23042s;
                String g10 = d(str).g();
                boolean y5 = l02.y();
                d1 d1Var7 = f1Var.f22746g;
                f1.m(d1Var7);
                d1Var7.j();
                long j10 = l02.f23045v;
                int i5 = d(str).f22966b;
                String str3 = o0(str).f22862b;
                d1 d1Var8 = f1Var.f22746g;
                f1.m(d1Var8);
                d1Var8.j();
                int i10 = l02.f23047x;
                d1 d1Var9 = f1Var.f22746g;
                f1.m(d1Var9);
                d1Var9.j();
                i(zzbgVar, new zzr(str, G, N, P2, str2, j, j6, (String) null, z5, false, J, 0L, 0, z7, false, w10, b10, (List) arrayList, g10, "", (String) null, y5, j10, i5, str3, i10, l02.B, l02.C(), l02.s(), 0L, l02.t()));
                return;
            }
        }
        a().f22909m.b(str, "No app data available; dropping event");
    }

    public final t0 h0() {
        t0 t0Var = this.f22990d;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:37:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(zzbg zzbgVar, zzr zzrVar) {
        Throwable th2;
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        zzbg c2;
        zzbe zzbeVar;
        String str = zzrVar.f5820a;
        g6.v.e(str);
        o0 b10 = o0.b(zzbgVar);
        Bundle bundle2 = (Bundle) b10.f22924e;
        v3 k0 = k0();
        j jVar = this.f22989c;
        U(jVar);
        f1 f1Var = (f1) jVar.f3328a;
        jVar.j();
        jVar.k();
        Cursor cursor3 = null;
        try {
            try {
                cursor = jVar.Y().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e7) {
                    e = e7;
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.b(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    k0.u(bundle2, bundle);
                    v3 k02 = k0();
                    e e0 = e0();
                    e0.getClass();
                    k02.s(b10, Math.max(Math.min(e0.r(str, x.Y), 100), 25));
                    c2 = b10.c();
                    if (!e0().t(null, x.f23191g1)) {
                    }
                    j(c2, zzrVar);
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th2;
                }
                cursor3.close();
                throw th2;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) r0.W(com.google.android.gms.internal.measurement.a3.z(), cursor.getBlob(0))).f();
                jVar.f22859b.j0();
                bundle = r0.q(a3Var.p());
                cursor.close();
            } catch (IOException e10) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.c(n0.r(str), e10, "Failed to retrieve default event parameters. appId");
            }
            k0.u(bundle2, bundle);
            v3 k022 = k0();
            e e02 = e0();
            e02.getClass();
            k022.s(b10, Math.max(Math.min(e02.r(str, x.Y), 100), 25));
            c2 = b10.c();
            if (!e0().t(null, x.f23191g1) && "_cmp".equals(c2.f5797a)) {
                zzbeVar = c2.f5798b;
                if ("referrer API v2".equals(zzbeVar.f5796a.getString("_cis"))) {
                    String string = zzbeVar.f5796a.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        W(new zzpl(c2.f5800d, string, "_lgclid", "auto"), zzrVar);
                    }
                }
            }
            j(c2, zzrVar);
        }
        n0 n0Var3 = f1Var.f22745f;
        f1.m(n0Var3);
        n0Var3.f22910n.a("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        k0.u(bundle2, bundle);
        v3 k0222 = k0();
        e e022 = e0();
        e022.getClass();
        k0222.s(b10, Math.max(Math.min(e022.r(str, x.Y), 100), 25));
        c2 = b10.c();
        if (!e0().t(null, x.f23191g1)) {
            zzbeVar = c2.f5798b;
            if ("referrer API v2".equals(zzbeVar.f5796a.getString("_cis"))) {
            }
        }
        j(c2, zzrVar);
    }

    public final c i0() {
        c cVar = this.f22992f;
        U(cVar);
        return cVar;
    }

    public final void j(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List k0;
        f1 f1Var;
        List k02;
        List<zzah> k03;
        String str;
        g6.v.h(zzrVar);
        String str2 = zzrVar.f5820a;
        g6.v.e(str2);
        b().j();
        l0();
        long j = zzbgVar.f5800d;
        o0 b10 = o0.b(zzbgVar);
        b().j();
        v3.c0((this.F == null || (str = this.G) == null || !str.equals(str2)) ? null : this.F, (Bundle) b10.f22924e, false);
        zzbg c2 = b10.c();
        j0();
        if (TextUtils.isEmpty(zzrVar.f5821b)) {
            return;
        }
        if (!zzrVar.f5827h) {
            c0(zzrVar);
            return;
        }
        List list = zzrVar.f5835r;
        if (list != null) {
            String str3 = c2.f5797a;
            if (!list.contains(str3)) {
                a().f22909m.d("Dropping non-safelisted event. appId, event name, origin", str2, c2.f5797a, c2.f5799c);
                return;
            } else {
                Bundle s02 = c2.f5798b.s0();
                s02.putLong("ga_safelisted", 1L);
                zzbgVar2 = new zzbg(str3, new zzbe(s02), c2.f5799c, c2.f5800d);
            }
        } else {
            zzbgVar2 = c2;
        }
        j jVar = this.f22989c;
        U(jVar);
        jVar.V();
        try {
            String str4 = zzbgVar2.f5797a;
            if ("_s".equals(str4)) {
                j jVar2 = this.f22989c;
                U(jVar2);
                if (!jVar2.y(str2, "_s") && zzbgVar2.f5798b.f5796a.getLong("_sid") != 0) {
                    j jVar3 = this.f22989c;
                    U(jVar3);
                    if (!jVar3.y(str2, "_f")) {
                        j jVar4 = this.f22989c;
                        U(jVar4);
                        if (!jVar4.y(str2, "_v")) {
                            j jVar5 = this.f22989c;
                            U(jVar5);
                            f().getClass();
                            jVar5.B(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(zzbgVar2, str2));
                        }
                    }
                    j jVar6 = this.f22989c;
                    U(jVar6);
                    jVar6.B(str2, null, "_sid", k(zzbgVar2, str2));
                }
            }
            j jVar7 = this.f22989c;
            U(jVar7);
            g6.v.e(str2);
            jVar7.j();
            jVar7.k();
            if (j < 0) {
                n0 n0Var = ((f1) jVar7.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22906i.c(n0.r(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                k0 = Collections.EMPTY_LIST;
            } else {
                k0 = jVar7.k0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = k0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                f1Var = this.f22997l;
                if (!hasNext) {
                    break;
                }
                zzah zzahVar = (zzah) it.next();
                if (zzahVar != null) {
                    a().f22910n.d("User property timed out", zzahVar.f5785a, f1Var.j.c(zzahVar.f5787c.f5814b), zzahVar.f5787c.c());
                    zzbg zzbgVar3 = zzahVar.f5791g;
                    if (zzbgVar3 != null) {
                        l(new zzbg(zzbgVar3, j), zzrVar);
                    }
                    j jVar8 = this.f22989c;
                    U(jVar8);
                    jVar8.i0(str2, zzahVar.f5787c.f5814b);
                }
            }
            j jVar9 = this.f22989c;
            U(jVar9);
            g6.v.e(str2);
            jVar9.j();
            jVar9.k();
            if (j < 0) {
                n0 n0Var2 = ((f1) jVar9.f3328a).f22745f;
                f1.m(n0Var2);
                n0Var2.f22906i.c(n0.r(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                k02 = Collections.EMPTY_LIST;
            } else {
                k02 = jVar9.k0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(k02.size());
            Iterator it2 = k02.iterator();
            while (it2.hasNext()) {
                zzah zzahVar2 = (zzah) it2.next();
                if (zzahVar2 != null) {
                    Iterator it3 = it2;
                    a().f22910n.d("User property expired", zzahVar2.f5785a, f1Var.j.c(zzahVar2.f5787c.f5814b), zzahVar2.f5787c.c());
                    j jVar10 = this.f22989c;
                    U(jVar10);
                    jVar10.b0(str2, zzahVar2.f5787c.f5814b);
                    zzbg zzbgVar4 = zzahVar2.f5794k;
                    if (zzbgVar4 != null) {
                        arrayList.add(zzbgVar4);
                    }
                    j jVar11 = this.f22989c;
                    U(jVar11);
                    jVar11.i0(str2, zzahVar2.f5787c.f5814b);
                    it2 = it3;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                l(new zzbg((zzbg) it4.next(), j), zzrVar);
            }
            j jVar12 = this.f22989c;
            U(jVar12);
            g6.v.e(str2);
            g6.v.e(str4);
            jVar12.j();
            jVar12.k();
            if (j < 0) {
                f1 f1Var2 = (f1) jVar12.f3328a;
                n0 n0Var3 = f1Var2.f22745f;
                f1.m(n0Var3);
                n0Var3.f22906i.d("Invalid time querying triggered conditional properties", n0.r(str2), f1Var2.j.a(str4), Long.valueOf(j));
                k03 = Collections.EMPTY_LIST;
            } else {
                k03 = jVar12.k0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(k03.size());
            for (zzah zzahVar3 : k03) {
                if (zzahVar3 != null) {
                    zzpl zzplVar = zzahVar3.f5787c;
                    String str5 = zzahVar3.f5785a;
                    g6.v.h(str5);
                    String str6 = zzahVar3.f5786b;
                    String str7 = zzplVar.f5814b;
                    Object c8 = zzplVar.c();
                    g6.v.h(c8);
                    t3 t3Var = new t3(str5, str6, str7, j, c8);
                    Object obj = t3Var.f23098e;
                    String str8 = t3Var.f23096c;
                    j jVar13 = this.f22989c;
                    U(jVar13);
                    if (jVar13.c0(t3Var)) {
                        a().f22910n.d("User property triggered", zzahVar3.f5785a, f1Var.j.c(str8), obj);
                    } else {
                        a().f22903f.d("Too many active user properties, ignoring", n0.r(zzahVar3.f5785a), f1Var.j.c(str8), obj);
                    }
                    zzbg zzbgVar5 = zzahVar3.f5793i;
                    if (zzbgVar5 != null) {
                        arrayList2.add(zzbgVar5);
                    }
                    zzahVar3.f5787c = new zzpl(t3Var);
                    zzahVar3.f5789e = true;
                    j jVar14 = this.f22989c;
                    U(jVar14);
                    jVar14.g0(zzahVar3);
                }
            }
            l(zzbgVar2, zzrVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                l(new zzbg((zzbg) it5.next(), j), zzrVar);
            }
            j jVar15 = this.f22989c;
            U(jVar15);
            jVar15.W();
            j jVar16 = this.f22989c;
            U(jVar16);
            jVar16.X();
        } catch (Throwable th2) {
            j jVar17 = this.f22989c;
            U(jVar17);
            jVar17.X();
            throw th2;
        }
    }

    public final r0 j0() {
        r0 r0Var = this.f22993g;
        U(r0Var);
        return r0Var;
    }

    public final Bundle k(zzbg zzbgVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.f5798b.f5796a.getLong("_sid"));
        j jVar = this.f22989c;
        U(jVar);
        t3 d02 = jVar.d0(str, "_sno");
        if (d02 != null) {
            Object obj = d02.f23098e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final v3 k0() {
        f1 f1Var = this.f22997l;
        g6.v.h(f1Var);
        v3 v3Var = f1Var.f22748i;
        f1.k(v3Var);
        return v3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:146|(42:148|(1:152)|153|(1:155)(1:349)|156|(1:158)(15:320|(1:322)(1:348)|323|(1:325)(1:347)|326|(1:328)(1:346)|329|(1:331)(1:345)|332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)(1:342)|341)|159|(1:161)|162|(1:164)(1:319)|(1:318)(34:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:309))(1:311))(1:315)|310)(2:316|317))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:305)|197|(4:199|(1:201)|202|(2:208|(29:210|(1:212)(1:304)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:303)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:285))(3:286|287|(1:292)(1:291)))|271|272|273|274|(1:276)(2:281|282)|277|278|279))))|308|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279))|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:391|(2:393|(12:395|396|397|(8:399|58|(0)(0)|61|62|(0)(0)|68|69)|57|58|(0)(0)|61|62|(0)(0)|68|69))|400|401|402|403|404|396|397|(0)|57|58|(0)(0)|61|62|(0)(0)|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:(2:71|(3:73|(1:75)|76))|77|(2:79|(3:81|(1:83)|84))|85|86|(1:88)|89|(2:93|(1:95))|96|(2:102|(2:104|105))|108|(3:109|110|111)|112|(1:114)|115|(2:117|(2:121|122)(1:120))(1:356)|123|124|(1:126)|127|(1:129)(1:355)|130|(1:132)(1:354)|133|(1:135)(1:353)|136|(1:138)(1:352)|139|140|(1:142)(1:351)|143|144|(13:(2:146|(42:148|(1:152)|153|(1:155)(1:349)|156|(1:158)(15:320|(1:322)(1:348)|323|(1:325)(1:347)|326|(1:328)(1:346)|329|(1:331)(1:345)|332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)(1:342)|341)|159|(1:161)|162|(1:164)(1:319)|(1:318)(34:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:309))(1:311))(1:315)|310)(2:316|317))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:305)|197|(4:199|(1:201)|202|(2:208|(29:210|(1:212)(1:304)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:303)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:285))(3:286|287|(1:292)(1:291)))|271|272|273|274|(1:276)(2:281|282)|277|278|279))))|308|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279))|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|350|159|(0)|162|(0)(0)|(1:166)|318|184|(0)|187|(0)|190|(0)|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262) */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0c42, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0c49, code lost:
    
        ((s7.f1) r1.f3328a).a().n().c(s7.n0.r((java.lang.String) r3.f19129d), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0c63, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0c80, code lost:
    
        r5.a().n().c(s7.n0.r(r4.p()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02fe, code lost:
    
        ((s7.f1) r10.f3328a).a().n().c(s7.n0.r(r13), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07c0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07ea A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0890 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08a0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08c4 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08dc A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09b6 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09d6 A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a47 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a65 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a7e A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b84 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c2c A[Catch: all -> 0x0a04, SQLiteException -> 0x0c42, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c42, blocks: (B:274:0x0c1b, B:276:0x0c2c), top: B:273:0x0c1b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08c9 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ed A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(zzbg zzbgVar, zzr zzrVar) {
        r3 r3Var;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        t3 t3Var;
        t3 t3Var2;
        o3 o3Var;
        long j6;
        long intValue;
        long j10;
        n a7;
        String str6;
        String str7;
        String str8;
        long j11;
        String str9;
        long j12;
        Map b10;
        String str10;
        ArrayList arrayList;
        q1 j13;
        String str11;
        s0 l02;
        int i5;
        List e0;
        int i10;
        j g02;
        com.google.android.gms.internal.measurement.i3 i3Var;
        j g03;
        Iterator<String> it;
        int i11;
        ContentValues contentValues;
        String str12;
        long U;
        Pair n9;
        s0 l03;
        t3 d02;
        g6.v.h(zzrVar);
        boolean z5 = zzrVar.f5832n;
        long j14 = zzrVar.q;
        long j15 = zzrVar.f5825f;
        String str13 = zzrVar.f5836s;
        long j16 = zzrVar.f5824e;
        long j17 = zzrVar.j;
        String str14 = zzrVar.f5838u;
        String str15 = zzrVar.f5822c;
        String str16 = zzrVar.f5823d;
        long j18 = j15;
        boolean z7 = zzrVar.f5827h;
        String str17 = zzrVar.f5820a;
        g6.v.e(str17);
        long nanoTime = System.nanoTime();
        b().j();
        l0();
        j0();
        String str18 = zzrVar.f5821b;
        if (TextUtils.isEmpty(str18)) {
            return;
        }
        if (!z7) {
            c0(zzrVar);
            return;
        }
        z0 f02 = f0();
        String str19 = zzbgVar.f5797a;
        boolean y5 = f02.y(str17, str19);
        f1 f1Var = this.f22997l;
        o3 o3Var2 = this.J;
        if (y5) {
            a().o().c(n0.r(str17), f1Var.n().a(str19), "Dropping blocked event. appId");
            if (!"1".equals(f0().d(str17, "measurement.upload.blacklist_internal")) && !"1".equals(f0().d(str17, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str19)) {
                    return;
                }
                k0();
                v3.z(o3Var2, str17, 11, "_ev", str19, 0);
                return;
            }
            s0 l04 = g0().l0(str17);
            if (l04 != null) {
                f1 f1Var2 = l04.f23026a;
                d1 d1Var = f1Var2.f22746g;
                f1.m(d1Var);
                d1Var.j();
                long j19 = l04.S;
                d1 d1Var2 = f1Var2.f22746g;
                f1.m(d1Var2);
                d1Var2.j();
                long max = Math.max(j19, l04.R);
                f().getClass();
                long abs = Math.abs(System.currentTimeMillis() - max);
                e0();
                if (abs > ((Long) x.O.a(null)).longValue()) {
                    a().p().a("Fetching config for blocked app");
                    z(l04);
                    return;
                }
                return;
            }
            return;
        }
        o0 b11 = o0.b(zzbgVar);
        v3 k0 = k0();
        e e02 = e0();
        e02.getClass();
        k0.s(b11, Math.max(Math.min(e02.r(str17, x.Y), 100), 25));
        int max2 = Math.max(Math.min(e0().r(str17, x.f23193h0), 35), 10);
        Bundle bundle = (Bundle) b11.f22924e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str20 = (String) it2.next();
            if ("items".equals(str20)) {
                k0().t(bundle.getParcelableArray(str20), max2);
            }
        }
        zzbg c2 = b11.c();
        zzbe zzbeVar = c2.f5798b;
        String str21 = c2.f5797a;
        if (Log.isLoggable(a().t(), 2)) {
            a().q().b(f1Var.n().d(c2), "Logging event");
        }
        g0().V();
        try {
            c0(zzrVar);
            boolean z10 = "ecommerce_purchase".equals(str21) || "purchase".equals(str21) || "refund".equals(str21);
            if (!"_iap".equals(str21)) {
                if (!z10) {
                    str3 = str16;
                    str4 = "events";
                    str = str14;
                    str5 = str17;
                    str2 = str15;
                    o3Var = o3Var2;
                    boolean j0 = v3.j0(str21);
                    boolean equals = "_err".equals(str21);
                    k0();
                    if (zzbeVar == null) {
                        j6 = 0;
                    } else {
                        Iterator<String> it3 = zzbeVar.f5796a.keySet().iterator();
                        j6 = 0;
                        while (it3.hasNext()) {
                            if (zzbeVar.c(it3.next()) instanceof Parcelable[]) {
                                j6 += ((Parcelable[]) r6).length;
                            }
                        }
                    }
                    String str22 = str5;
                    g o02 = g0().o0(g(), str22, j6 + 1, true, j0, false, equals, false, false, false);
                    long j20 = o02.f22770b;
                    e0();
                    intValue = j20 - ((Integer) x.f23201l.a(null)).intValue();
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            a().n().c(n0.r(str22), Long.valueOf(o02.f22770b), "Data loss. Too many events logged. appId, count");
                        }
                        g0().W();
                    } else {
                        if (j0) {
                            long j21 = o02.f22769a;
                            e0();
                            long intValue2 = j21 - ((Integer) x.f23206n.a(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    a().n().c(n0.r(str22), Long.valueOf(o02.f22769a), "Data loss. Too many public events logged. appId, count");
                                }
                                k0();
                                v3.z(o3Var, str22, 16, "_ev", c2.f5797a, 0);
                                g0().W();
                            }
                        }
                        String str23 = str22;
                        if (equals) {
                            long max3 = o02.f22772d - Math.max(0, Math.min(1000000, e0().r(str23, x.f23204m)));
                            if (max3 > 0) {
                                if (max3 == 1) {
                                    a().n().c(n0.r(str23), Long.valueOf(o02.f22772d), "Too many error events logged. appId, count");
                                }
                                g0().W();
                            }
                        }
                        Bundle s02 = zzbeVar.s0();
                        v3 k02 = k0();
                        String str24 = c2.f5799c;
                        k02.y(s02, "_o", str24);
                        if (k0().L(str23, zzrVar.B)) {
                            k0().y(s02, "_dbg", 1L);
                            k0().y(s02, "_r", 1L);
                        }
                        if ("_s".equals(str21) && (d02 = g0().d0(str23, "_sno")) != null) {
                            Object obj = d02.f23098e;
                            if (obj instanceof Long) {
                                k0().y(s02, "_sno", obj);
                            }
                        }
                        if (e0().t(null, x.Y0) && Objects.equals(str24, "am") && str21.equals("_ai")) {
                            Object obj2 = s02.get("value");
                            if (obj2 instanceof String) {
                                try {
                                    double parseDouble = Double.parseDouble((String) obj2);
                                    s02.remove("value");
                                    s02.putDouble("value", parseDouble);
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        j g04 = g0();
                        g6.v.e(str23);
                        g04.j();
                        g04.k();
                        try {
                            j10 = g04.Y().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str23, String.valueOf(Math.max(0, Math.min(1000000, ((f1) g04.f3328a).f22743d.r(str23, x.q))))});
                        } catch (SQLiteException e7) {
                            ((f1) g04.f3328a).a().n().c(n0.r(str23), e7, "Error deleting over the limit events. appId");
                            j10 = 0;
                        }
                        if (j10 > 0) {
                            a().o().c(n0.r(str23), Long.valueOf(j10), "Data lost. Too many events stored on disk, deleted. appId");
                        }
                        f1 f1Var3 = this.f22997l;
                        kh.l lVar = new kh.l(f1Var3, c2.f5799c, str23, c2.f5797a, c2.f5800d, 0L, s02);
                        j g05 = g0();
                        String str25 = (String) lVar.f19130e;
                        String str26 = str4;
                        n H = g05.H(str26, str23, str25);
                        if (H == null) {
                            long z11 = g0().z(str23);
                            e0().getClass();
                            w wVar = x.X;
                            o3 o3Var3 = o3Var;
                            if (z11 < Math.max(Math.min(r4.r(str23, wVar), 2000), 500) || !j0) {
                                o3Var = o3Var3;
                                a7 = new n(str23, str25, 0L, 0L, 0L, lVar.f19127b, 0L, null, null, null, null);
                                str23 = str23;
                            } else {
                                l0 n10 = a().n();
                                m0 r5 = n0.r(str23);
                                String a10 = f1Var3.n().a(str25);
                                e e03 = e0();
                                e03.getClass();
                                n10.d("Too many event names used, ignoring event. appId, name, supported count", r5, a10, Integer.valueOf(Math.max(Math.min(e03.r(str23, wVar), 2000), 500)));
                                k0();
                                v3.z(o3Var3, str23, 8, null, null, 0);
                            }
                        } else {
                            lVar = lVar.e(f1Var3, H.f22895f);
                            a7 = H.a(lVar.f19127b);
                        }
                        kh.l lVar2 = lVar;
                        g0().I(str26, a7);
                        b().j();
                        l0();
                        String str27 = (String) lVar2.f19129d;
                        g6.v.e(str27);
                        g6.v.b(str27.equals(str23));
                        com.google.android.gms.internal.measurement.h3 U2 = com.google.android.gms.internal.measurement.i3.U();
                        U2.z();
                        U2.k();
                        if (!TextUtils.isEmpty(str23)) {
                            U2.q(str23);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str6 = str3;
                        } else {
                            str6 = str3;
                            U2.o(str6);
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str7 = str2;
                        } else {
                            str7 = str2;
                            U2.r(str7);
                        }
                        if (TextUtils.isEmpty(str)) {
                            str8 = str;
                        } else {
                            str8 = str;
                            U2.S(str8);
                        }
                        if (j17 != -2147483648L) {
                            j11 = j17;
                            U2.M((int) j11);
                        } else {
                            j11 = j17;
                        }
                        String str28 = str6;
                        U2.s(j16);
                        if (TextUtils.isEmpty(str18)) {
                            str9 = str18;
                        } else {
                            str9 = str18;
                            U2.I(str9);
                        }
                        g6.v.h(str23);
                        String str29 = str8;
                        q1 j22 = d(str23).j(q1.c(100, str13));
                        U2.R(j22.f());
                        o8.a();
                        boolean t3 = e0().t(str23, x.Q0);
                        p1 p1Var = p1.AD_STORAGE;
                        try {
                            if (t3) {
                                k0();
                                if (v3.H(str23)) {
                                    U2.A(zzrVar.f5843z);
                                    j12 = j11;
                                    long j23 = zzrVar.A;
                                    if (!j22.i(p1Var) && j23 != 0) {
                                        j23 = (j23 & (-2)) | 32;
                                    }
                                    U2.U(j23 == 1);
                                    if (j23 != 0) {
                                        com.google.android.gms.internal.measurement.p2 w10 = com.google.android.gms.internal.measurement.q2.w();
                                        w10.i((j23 & 1) != 0);
                                        w10.j((j23 & 2) != 0);
                                        w10.k((j23 & 4) != 0);
                                        w10.l((j23 & 8) != 0);
                                        w10.m((j23 & 16) != 0);
                                        w10.n((j23 & 32) != 0);
                                        w10.o((j23 & 64) != 0);
                                        U2.B((com.google.android.gms.internal.measurement.q2) w10.f());
                                    }
                                    if (j18 != 0) {
                                        U2.x(j18);
                                        j18 = j18;
                                    }
                                    U2.P(j14);
                                    r0 j02 = j0();
                                    d4 a11 = d4.a(j02.f22859b.f22997l.e().getContentResolver(), k4.a(), e6.z.f8770c);
                                    b10 = a11 != null ? Collections.EMPTY_MAP : a11.b();
                                    if (b10 == null && !b10.isEmpty()) {
                                        arrayList = new ArrayList();
                                        int intValue3 = ((Integer) x.f23190g0.a(null)).intValue();
                                        Iterator it4 = b10.entrySet().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                str10 = str7;
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) it4.next();
                                            Iterator it5 = it4;
                                            str10 = str7;
                                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                                try {
                                                    int parseInt = Integer.parseInt((String) entry.getValue());
                                                    if (parseInt != 0) {
                                                        arrayList.add(Integer.valueOf(parseInt));
                                                        if (arrayList.size() >= intValue3) {
                                                            ((f1) j02.f3328a).a().o().b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                            break;
                                                        }
                                                        continue;
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (NumberFormatException e9) {
                                                    ((f1) j02.f3328a).a().o().b(e9, "Experiment ID NumberFormatException");
                                                }
                                            }
                                            it4 = it5;
                                            str7 = str10;
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                            U2.O(arrayList);
                                        }
                                        if (e0().t(null, x.f23178b1)) {
                                            U2.E();
                                        }
                                        j13 = d(str23).j(q1.c(100, str13));
                                        if (j13.i(p1Var) && z5) {
                                            try {
                                                a3 a3Var = this.f22995i;
                                                a3Var.getClass();
                                                n9 = !j13.i(p1Var) ? a3Var.n(str23) : new Pair("", Boolean.FALSE);
                                                if (!TextUtils.isEmpty((CharSequence) n9.first)) {
                                                    U2.u((String) n9.first);
                                                    Object obj3 = n9.second;
                                                    if (obj3 != null) {
                                                        U2.v(((Boolean) obj3).booleanValue());
                                                    }
                                                    if (!((String) lVar2.f19130e).equals("_fx") && !((String) n9.first).equals("00000000-0000-0000-0000-000000000000") && (l03 = g0().l0(str23)) != null) {
                                                        d1 d1Var3 = l03.f23026a.f22746g;
                                                        f1.m(d1Var3);
                                                        d1Var3.j();
                                                        if (l03.f23048y) {
                                                            u(str23, false, null, null);
                                                            Bundle bundle2 = new Bundle();
                                                            d1 d1Var4 = l03.f23026a.f22746g;
                                                            f1.m(d1Var4);
                                                            d1Var4.j();
                                                            Long l6 = l03.f23049z;
                                                            if (l6 != null) {
                                                                str11 = str9;
                                                                bundle2.putLong("_pfo", Math.max(0L, l6.longValue()));
                                                            } else {
                                                                str11 = str9;
                                                            }
                                                            d1 d1Var5 = l03.f23026a.f22746g;
                                                            f1.m(d1Var5);
                                                            d1Var5.j();
                                                            Long l10 = l03.A;
                                                            if (l10 != null) {
                                                                bundle2.putLong("_uwa", l10.longValue());
                                                            }
                                                            bundle2.putLong("_r", 1L);
                                                            o3Var.a(str23, "_fx", bundle2);
                                                            f1Var.q().l();
                                                            String str30 = Build.MODEL;
                                                            U2.l();
                                                            f1Var.q().l();
                                                            String str31 = Build.VERSION.RELEASE;
                                                            U2.b();
                                                            ((com.google.android.gms.internal.measurement.i3) U2.f5041b).o0(str31);
                                                            U2.n((int) f1Var.q().n());
                                                            U2.m(f1Var.q().o());
                                                            U2.T(zzrVar.f5840w);
                                                            if (f1Var.d()) {
                                                                U2.p();
                                                                if (!TextUtils.isEmpty(null)) {
                                                                    U2.b();
                                                                    ((com.google.android.gms.internal.measurement.i3) U2.f5041b).R0(null);
                                                                    throw null;
                                                                }
                                                            }
                                                            l02 = g0().l0(str23);
                                                            if (l02 != null) {
                                                                l02 = new s0(f1Var, str23);
                                                                r3Var = this;
                                                                try {
                                                                    l02.F(r3Var.o(j13));
                                                                    l02.K(zzrVar.f5829k);
                                                                    l02.H(str11);
                                                                    if (j13.i(p1Var)) {
                                                                        l02.I(r3Var.f22995i.o(str23, z5));
                                                                    }
                                                                    l02.e(0L);
                                                                    l02.L(0L);
                                                                    l02.M(0L);
                                                                    l02.O(str10);
                                                                    l02.Q(j12);
                                                                    l02.R(str28);
                                                                    l02.S(j16);
                                                                    l02.a(j18);
                                                                    l02.d(z7);
                                                                    l02.c(j14);
                                                                    i5 = 0;
                                                                    r3Var.g0().m0(l02, false);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    r3Var.g0().X();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i5 = 0;
                                                                r3Var = this;
                                                            }
                                                            if (j13.i(p1.ANALYTICS_STORAGE) && !TextUtils.isEmpty(l02.E())) {
                                                                String E = l02.E();
                                                                g6.v.h(E);
                                                                U2.w(E);
                                                            }
                                                            if (!TextUtils.isEmpty(l02.J())) {
                                                                String J = l02.J();
                                                                g6.v.h(J);
                                                                U2.L(J);
                                                            }
                                                            e0 = r3Var.g0().e0(str23);
                                                            i10 = i5;
                                                            while (i10 < e0.size()) {
                                                                com.google.android.gms.internal.measurement.q3 A = com.google.android.gms.internal.measurement.r3.A();
                                                                String str32 = ((t3) e0.get(i10)).f23096c;
                                                                A.b();
                                                                ((com.google.android.gms.internal.measurement.r3) A.f5041b).C(str32);
                                                                long j24 = ((t3) e0.get(i10)).f23097d;
                                                                A.b();
                                                                ((com.google.android.gms.internal.measurement.r3) A.f5041b).B(j24);
                                                                r3Var.j0().H(A, ((t3) e0.get(i10)).f23098e);
                                                                U2.a0(A);
                                                                if ("_sid".equals(((t3) e0.get(i10)).f23096c)) {
                                                                    d1 d1Var6 = l02.f23026a.f22746g;
                                                                    f1.m(d1Var6);
                                                                    d1Var6.j();
                                                                    if (l02.f23046w != 0) {
                                                                        r0 j03 = r3Var.j0();
                                                                        if (TextUtils.isEmpty(str29)) {
                                                                            str12 = str29;
                                                                            U = 0;
                                                                        } else {
                                                                            str12 = str29;
                                                                            U = j03.U(str12.getBytes(Charset.forName("UTF-8")));
                                                                        }
                                                                        d1 d1Var7 = l02.f23026a.f22746g;
                                                                        f1.m(d1Var7);
                                                                        d1Var7.j();
                                                                        if (U != l02.f23046w) {
                                                                            U2.b();
                                                                            ((com.google.android.gms.internal.measurement.i3) U2.f5041b).Z0();
                                                                        }
                                                                        i10++;
                                                                        str29 = str12;
                                                                    }
                                                                }
                                                                str12 = str29;
                                                                i10++;
                                                                str29 = str12;
                                                            }
                                                            g02 = r3Var.g0();
                                                            i3Var = (com.google.android.gms.internal.measurement.i3) U2.f();
                                                            g02.j();
                                                            g02.k();
                                                            g6.v.e(i3Var.p());
                                                            byte[] a12 = i3Var.a();
                                                            long U3 = g02.f22859b.j0().U(a12);
                                                            ContentValues contentValues2 = new ContentValues();
                                                            contentValues2.put(CommonUrlParts.APP_ID, i3Var.p());
                                                            contentValues2.put("metadata_fingerprint", Long.valueOf(U3));
                                                            contentValues2.put("metadata", a12);
                                                            g02.Y().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                            g03 = r3Var.g0();
                                                            zzbe zzbeVar2 = (zzbe) lVar2.f19132g;
                                                            Objects.requireNonNull(zzbeVar2);
                                                            it = zzbeVar2.f5796a.keySet().iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    z0 f03 = r3Var.f0();
                                                                    String str33 = (String) lVar2.f19129d;
                                                                    boolean z12 = f03.z(str33, (String) lVar2.f19130e);
                                                                    g n02 = r3Var.g0().n0(r3Var.g(), str33, false, false, false, false);
                                                                    if (!z12 || n02.f22773e >= r3Var.e0().r(str33, x.f23210p)) {
                                                                        i11 = i5;
                                                                    }
                                                                } else if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            }
                                                            i11 = 1;
                                                            g03.j();
                                                            g03.k();
                                                            String str34 = (String) lVar2.f19129d;
                                                            g6.v.e(str34);
                                                            byte[] a13 = g03.f22859b.j0().L(lVar2).a();
                                                            contentValues = new ContentValues();
                                                            contentValues.put(CommonUrlParts.APP_ID, str34);
                                                            contentValues.put("name", (String) lVar2.f19130e);
                                                            contentValues.put("timestamp", Long.valueOf(lVar2.f19127b));
                                                            contentValues.put("metadata_fingerprint", Long.valueOf(U3));
                                                            contentValues.put("data", a13);
                                                            contentValues.put("realtime", Integer.valueOf(i11));
                                                            if (g03.Y().insert("raw_events", null, contentValues) != -1) {
                                                                ((f1) g03.f3328a).a().n().b(n0.r(str34), "Failed to insert raw event (got -1). appId");
                                                            } else {
                                                                r3Var.f23000o = 0L;
                                                            }
                                                            r3Var.g0().W();
                                                            r3Var.g0().X();
                                                            r3Var.N();
                                                            r3Var.a().q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                            return;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3Var = this;
                                                r3Var.g0().X();
                                                throw th;
                                            }
                                        }
                                        str11 = str9;
                                        f1Var.q().l();
                                        String str302 = Build.MODEL;
                                        U2.l();
                                        f1Var.q().l();
                                        String str312 = Build.VERSION.RELEASE;
                                        U2.b();
                                        ((com.google.android.gms.internal.measurement.i3) U2.f5041b).o0(str312);
                                        U2.n((int) f1Var.q().n());
                                        U2.m(f1Var.q().o());
                                        U2.T(zzrVar.f5840w);
                                        if (f1Var.d()) {
                                        }
                                        l02 = g0().l0(str23);
                                        if (l02 != null) {
                                        }
                                        if (j13.i(p1.ANALYTICS_STORAGE)) {
                                            String E2 = l02.E();
                                            g6.v.h(E2);
                                            U2.w(E2);
                                        }
                                        if (!TextUtils.isEmpty(l02.J())) {
                                        }
                                        e0 = r3Var.g0().e0(str23);
                                        i10 = i5;
                                        while (i10 < e0.size()) {
                                        }
                                        g02 = r3Var.g0();
                                        i3Var = (com.google.android.gms.internal.measurement.i3) U2.f();
                                        g02.j();
                                        g02.k();
                                        g6.v.e(i3Var.p());
                                        byte[] a122 = i3Var.a();
                                        long U32 = g02.f22859b.j0().U(a122);
                                        ContentValues contentValues22 = new ContentValues();
                                        contentValues22.put(CommonUrlParts.APP_ID, i3Var.p());
                                        contentValues22.put("metadata_fingerprint", Long.valueOf(U32));
                                        contentValues22.put("metadata", a122);
                                        g02.Y().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                        g03 = r3Var.g0();
                                        zzbe zzbeVar22 = (zzbe) lVar2.f19132g;
                                        Objects.requireNonNull(zzbeVar22);
                                        it = zzbeVar22.f5796a.keySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                            }
                                        }
                                        i11 = 1;
                                        g03.j();
                                        g03.k();
                                        String str342 = (String) lVar2.f19129d;
                                        g6.v.e(str342);
                                        byte[] a132 = g03.f22859b.j0().L(lVar2).a();
                                        contentValues = new ContentValues();
                                        contentValues.put(CommonUrlParts.APP_ID, str342);
                                        contentValues.put("name", (String) lVar2.f19130e);
                                        contentValues.put("timestamp", Long.valueOf(lVar2.f19127b));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(U32));
                                        contentValues.put("data", a132);
                                        contentValues.put("realtime", Integer.valueOf(i11));
                                        if (g03.Y().insert("raw_events", null, contentValues) != -1) {
                                        }
                                        r3Var.g0().W();
                                        r3Var.g0().X();
                                        r3Var.N();
                                        r3Var.a().q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                    str10 = str7;
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                    if (e0().t(null, x.f23178b1)) {
                                    }
                                    j13 = d(str23).j(q1.c(100, str13));
                                    if (j13.i(p1Var)) {
                                        a3 a3Var2 = this.f22995i;
                                        a3Var2.getClass();
                                        if (!j13.i(p1Var)) {
                                        }
                                        if (!TextUtils.isEmpty((CharSequence) n9.first)) {
                                        }
                                    }
                                    str11 = str9;
                                    f1Var.q().l();
                                    String str3022 = Build.MODEL;
                                    U2.l();
                                    f1Var.q().l();
                                    String str3122 = Build.VERSION.RELEASE;
                                    U2.b();
                                    ((com.google.android.gms.internal.measurement.i3) U2.f5041b).o0(str3122);
                                    U2.n((int) f1Var.q().n());
                                    U2.m(f1Var.q().o());
                                    U2.T(zzrVar.f5840w);
                                    if (f1Var.d()) {
                                    }
                                    l02 = g0().l0(str23);
                                    if (l02 != null) {
                                    }
                                    if (j13.i(p1.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(l02.J())) {
                                    }
                                    e0 = r3Var.g0().e0(str23);
                                    i10 = i5;
                                    while (i10 < e0.size()) {
                                    }
                                    g02 = r3Var.g0();
                                    i3Var = (com.google.android.gms.internal.measurement.i3) U2.f();
                                    g02.j();
                                    g02.k();
                                    g6.v.e(i3Var.p());
                                    byte[] a1222 = i3Var.a();
                                    long U322 = g02.f22859b.j0().U(a1222);
                                    ContentValues contentValues222 = new ContentValues();
                                    contentValues222.put(CommonUrlParts.APP_ID, i3Var.p());
                                    contentValues222.put("metadata_fingerprint", Long.valueOf(U322));
                                    contentValues222.put("metadata", a1222);
                                    g02.Y().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                    g03 = r3Var.g0();
                                    zzbe zzbeVar222 = (zzbe) lVar2.f19132g;
                                    Objects.requireNonNull(zzbeVar222);
                                    it = zzbeVar222.f5796a.keySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    i11 = 1;
                                    g03.j();
                                    g03.k();
                                    String str3422 = (String) lVar2.f19129d;
                                    g6.v.e(str3422);
                                    byte[] a1322 = g03.f22859b.j0().L(lVar2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put(CommonUrlParts.APP_ID, str3422);
                                    contentValues.put("name", (String) lVar2.f19130e);
                                    contentValues.put("timestamp", Long.valueOf(lVar2.f19127b));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(U322));
                                    contentValues.put("data", a1322);
                                    contentValues.put("realtime", Integer.valueOf(i11));
                                    if (g03.Y().insert("raw_events", null, contentValues) != -1) {
                                    }
                                    r3Var.g0().W();
                                    r3Var.g0().X();
                                    r3Var.N();
                                    r3Var.a().q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            g02.Y().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                            g03 = r3Var.g0();
                            zzbe zzbeVar2222 = (zzbe) lVar2.f19132g;
                            Objects.requireNonNull(zzbeVar2222);
                            it = zzbeVar2222.f5796a.keySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            i11 = 1;
                            g03.j();
                            g03.k();
                            String str34222 = (String) lVar2.f19129d;
                            g6.v.e(str34222);
                            byte[] a13222 = g03.f22859b.j0().L(lVar2).a();
                            contentValues = new ContentValues();
                            contentValues.put(CommonUrlParts.APP_ID, str34222);
                            contentValues.put("name", (String) lVar2.f19130e);
                            contentValues.put("timestamp", Long.valueOf(lVar2.f19127b));
                            contentValues.put("metadata_fingerprint", Long.valueOf(U322));
                            contentValues.put("data", a13222);
                            contentValues.put("realtime", Integer.valueOf(i11));
                            if (g03.Y().insert("raw_events", null, contentValues) != -1) {
                            }
                            r3Var.g0().W();
                            r3Var.g0().X();
                            r3Var.N();
                            r3Var.a().q().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e10) {
                            ((f1) g02.f3328a).a().n().c(n0.r(i3Var.p()), e10, "Error storing raw event metadata. appId");
                            throw e10;
                        }
                        j12 = j11;
                        if (j18 != 0) {
                        }
                        U2.P(j14);
                        r0 j022 = j0();
                        d4 a112 = d4.a(j022.f22859b.f22997l.e().getContentResolver(), k4.a(), e6.z.f8770c);
                        if (a112 != null) {
                        }
                        if (b10 == null) {
                        }
                        str10 = str7;
                        arrayList = null;
                        if (arrayList != null) {
                        }
                        if (e0().t(null, x.f23178b1)) {
                        }
                        j13 = d(str23).j(q1.c(100, str13));
                        if (j13.i(p1Var)) {
                        }
                        str11 = str9;
                        f1Var.q().l();
                        String str30222 = Build.MODEL;
                        U2.l();
                        f1Var.q().l();
                        String str31222 = Build.VERSION.RELEASE;
                        U2.b();
                        ((com.google.android.gms.internal.measurement.i3) U2.f5041b).o0(str31222);
                        U2.n((int) f1Var.q().n());
                        U2.m(f1Var.q().o());
                        U2.T(zzrVar.f5840w);
                        if (f1Var.d()) {
                        }
                        l02 = g0().l0(str23);
                        if (l02 != null) {
                        }
                        if (j13.i(p1.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(l02.J())) {
                        }
                        e0 = r3Var.g0().e0(str23);
                        i10 = i5;
                        while (i10 < e0.size()) {
                        }
                        g02 = r3Var.g0();
                        i3Var = (com.google.android.gms.internal.measurement.i3) U2.f();
                        g02.j();
                        g02.k();
                        g6.v.e(i3Var.p());
                        byte[] a12222 = i3Var.a();
                        long U3222 = g02.f22859b.j0().U(a12222);
                        ContentValues contentValues2222 = new ContentValues();
                        contentValues2222.put(CommonUrlParts.APP_ID, i3Var.p());
                        contentValues2222.put("metadata_fingerprint", Long.valueOf(U3222));
                        contentValues2222.put("metadata", a12222);
                    }
                    g0().X();
                }
                z10 = true;
            }
            str = str14;
            str2 = str15;
            String o03 = zzbeVar.o0();
            str3 = str16;
            Bundle bundle3 = zzbeVar.f5796a;
            if (z10) {
                double doubleValue = zzbeVar.l0().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    str4 = "events";
                    doubleValue = bundle3.getLong("value") * 1000000.0d;
                } else {
                    str4 = "events";
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    a().o().c(n0.r(str17), Double.valueOf(doubleValue), "Data lost. Currency value is too big. appId");
                    g0().W();
                    g0().X();
                } else {
                    j = Math.round(doubleValue);
                    if ("refund".equals(str21)) {
                        j = -j;
                    }
                }
            } else {
                str4 = "events";
                j = bundle3.getLong("value");
            }
            if (!TextUtils.isEmpty(o03)) {
                String upperCase = o03.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    t3 d03 = g0().d0(str17, concat);
                    if (d03 != null) {
                        Object obj4 = d03.f23098e;
                        if (obj4 instanceof Long) {
                            long longValue = ((Long) obj4).longValue();
                            String str35 = c2.f5799c;
                            f().getClass();
                            t3Var = new t3(str17, str35, concat, System.currentTimeMillis(), Long.valueOf(longValue + j));
                            str5 = str17;
                            t3Var2 = t3Var;
                            if (!g0().c0(t3Var2)) {
                                a().n().d("Too many unique user properties are set. Ignoring user property. appId", n0.r(str5), f1Var.n().c(t3Var2.f23096c), t3Var2.f23098e);
                                k0();
                                v3.z(o3Var2, str5, 9, null, null, 0);
                                o3Var = o3Var2;
                                boolean j04 = v3.j0(str21);
                                boolean equals2 = "_err".equals(str21);
                                k0();
                                if (zzbeVar == null) {
                                }
                                String str222 = str5;
                                g o022 = g0().o0(g(), str222, j6 + 1, true, j04, false, equals2, false, false, false);
                                long j202 = o022.f22770b;
                                e0();
                                intValue = j202 - ((Integer) x.f23201l.a(null)).intValue();
                                if (intValue > 0) {
                                }
                                g0().X();
                            }
                            o3Var = o3Var2;
                            boolean j042 = v3.j0(str21);
                            boolean equals22 = "_err".equals(str21);
                            k0();
                            if (zzbeVar == null) {
                            }
                            String str2222 = str5;
                            g o0222 = g0().o0(g(), str2222, j6 + 1, true, j042, false, equals22, false, false, false);
                            long j2022 = o0222.f22770b;
                            e0();
                            intValue = j2022 - ((Integer) x.f23201l.a(null)).intValue();
                            if (intValue > 0) {
                            }
                            g0().X();
                        }
                    }
                    j g06 = g0();
                    int r6 = e0().r(str17, x.U) - 1;
                    g6.v.e(str17);
                    g06.j();
                    g06.k();
                    g06.Y().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str17, str17, String.valueOf(r6)});
                    String str36 = c2.f5799c;
                    f().getClass();
                    str5 = str17;
                    t3Var = new t3(str5, str36, concat, System.currentTimeMillis(), Long.valueOf(j));
                    t3Var2 = t3Var;
                    if (!g0().c0(t3Var2)) {
                    }
                    o3Var = o3Var2;
                    boolean j0422 = v3.j0(str21);
                    boolean equals222 = "_err".equals(str21);
                    k0();
                    if (zzbeVar == null) {
                    }
                    String str22222 = str5;
                    g o02222 = g0().o0(g(), str22222, j6 + 1, true, j0422, false, equals222, false, false, false);
                    long j20222 = o02222.f22770b;
                    e0();
                    intValue = j20222 - ((Integer) x.f23201l.a(null)).intValue();
                    if (intValue > 0) {
                    }
                    g0().X();
                }
            }
            str5 = str17;
            o3Var = o3Var2;
            boolean j04222 = v3.j0(str21);
            boolean equals2222 = "_err".equals(str21);
            k0();
            if (zzbeVar == null) {
            }
            String str222222 = str5;
            g o022222 = g0().o0(g(), str222222, j6 + 1, true, j04222, false, equals2222, false, false, false);
            long j202222 = o022222.f22770b;
            e0();
            intValue = j202222 - ((Integer) x.f23201l.a(null)).intValue();
            if (intValue > 0) {
            }
            g0().X();
        } catch (Throwable th4) {
            th = th4;
            r3Var = this;
        }
    }

    public final void l0() {
        if (!this.f22998m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void m(s0 s0Var, com.google.android.gms.internal.measurement.h3 h3Var) {
        r7.a aVar;
        com.google.android.gms.internal.measurement.r3 r3Var;
        f fVar;
        b().j();
        l0();
        String B0 = ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).B0();
        EnumMap enumMap = new EnumMap(p1.class);
        int length = B0.length();
        int length2 = p1.values().length;
        f fVar2 = f.UNSET;
        int i5 = 0;
        if (length < length2 || B0.charAt(0) != '1') {
            aVar = new r7.a(3);
        } else {
            p1[] values = p1.values();
            int length3 = values.length;
            int i10 = 0;
            int i11 = 1;
            while (i10 < length3) {
                p1 p1Var = values[i10];
                int i12 = i11 + 1;
                char charAt = B0.charAt(i11);
                f[] values2 = f.values();
                int length4 = values2.length;
                int i13 = i5;
                while (true) {
                    if (i13 >= length4) {
                        fVar = fVar2;
                        break;
                    }
                    fVar = values2[i13];
                    if (fVar.f22726a == charAt) {
                        break;
                    } else {
                        i13++;
                    }
                }
                enumMap.put((EnumMap) p1Var, (p1) fVar);
                i10++;
                i11 = i12;
                i5 = 0;
            }
            aVar = new r7.a(enumMap);
        }
        String D = s0Var.D();
        b().j();
        l0();
        q1 d10 = d(D);
        EnumMap enumMap2 = d10.f22965a;
        p1 p1Var2 = p1.AD_STORAGE;
        n1 n1Var = (n1) enumMap2.get(p1Var2);
        n1 n1Var2 = n1.UNINITIALIZED;
        if (n1Var == null) {
            n1Var = n1Var2;
        }
        int i14 = d10.f22966b;
        int ordinal = n1Var.ordinal();
        f fVar3 = f.REMOTE_ENFORCED_DEFAULT;
        f fVar4 = f.FAILSAFE;
        if (ordinal == 1) {
            aVar.p(p1Var2, fVar3);
        } else if (ordinal == 2 || ordinal == 3) {
            aVar.m(p1Var2, i14);
        } else {
            aVar.p(p1Var2, fVar4);
        }
        p1 p1Var3 = p1.ANALYTICS_STORAGE;
        n1 n1Var3 = (n1) enumMap2.get(p1Var3);
        if (n1Var3 != null) {
            n1Var2 = n1Var3;
        }
        int ordinal2 = n1Var2.ordinal();
        if (ordinal2 == 1) {
            aVar.p(p1Var3, fVar3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            aVar.m(p1Var3, i14);
        } else {
            aVar.p(p1Var3, fVar4);
        }
        String D2 = s0Var.D();
        b().j();
        l0();
        l q02 = q0(D2, o0(D2), d(D2), aVar);
        String str = q02.f22864d;
        Boolean bool = q02.f22863c;
        g6.v.h(bool);
        boolean booleanValue = bool.booleanValue();
        h3Var.b();
        ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).f1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).g1(str);
        }
        b().j();
        l0();
        Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                r3Var = (com.google.android.gms.internal.measurement.r3) it.next();
                if ("_npa".equals(r3Var.r())) {
                    break;
                }
            } else {
                r3Var = null;
                break;
            }
        }
        if (r3Var != null) {
            EnumMap enumMap3 = (EnumMap) aVar.f22318b;
            p1 p1Var4 = p1.AD_PERSONALIZATION;
            f fVar5 = (f) enumMap3.get(p1Var4);
            if (fVar5 == null) {
                fVar5 = fVar2;
            }
            if (fVar5 == fVar2) {
                j jVar = this.f22989c;
                U(jVar);
                t3 d02 = jVar.d0(s0Var.D(), "_npa");
                f fVar6 = f.MANIFEST;
                f fVar7 = f.API;
                if (d02 != null) {
                    String str2 = d02.f23095b;
                    if ("tcf".equals(str2)) {
                        aVar.p(p1Var4, f.TCF);
                    } else if ("app".equals(str2)) {
                        aVar.p(p1Var4, fVar7);
                    } else {
                        aVar.p(p1Var4, fVar6);
                    }
                } else {
                    Boolean w10 = s0Var.w();
                    if (w10 == null || ((w10.booleanValue() && r3Var.v() != 1) || !(w10.booleanValue() || r3Var.v() == 0))) {
                        aVar.p(p1Var4, fVar7);
                    } else {
                        aVar.p(p1Var4, fVar6);
                    }
                }
            }
        } else {
            int F = F(s0Var.D(), aVar);
            com.google.android.gms.internal.measurement.q3 A = com.google.android.gms.internal.measurement.r3.A();
            A.b();
            ((com.google.android.gms.internal.measurement.r3) A.f5041b).C("_npa");
            f().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            A.b();
            ((com.google.android.gms.internal.measurement.r3) A.f5041b).B(currentTimeMillis);
            A.b();
            ((com.google.android.gms.internal.measurement.r3) A.f5041b).F(F);
            com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) A.f();
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).d0(r3Var2);
            a().f22910n.c("non_personalized_ads(_npa)", Integer.valueOf(F), "Setting user property");
        }
        String aVar2 = aVar.toString();
        h3Var.b();
        ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).e1(aVar2);
        String D3 = s0Var.D();
        z0 z0Var = this.f22987a;
        z0Var.j();
        z0Var.p(D3);
        com.google.android.gms.internal.measurement.z1 E = z0Var.E(D3);
        boolean z5 = E == null || !E.s() || E.t();
        List V = h3Var.V();
        for (int i15 = 0; i15 < V.size(); i15++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.a3) V.get(i15)).s())) {
                com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.a3) V.get(i15)).i();
                List i16 = z2Var.i();
                int i17 = 0;
                while (true) {
                    if (i17 >= i16.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.d3) i16.get(i17)).q())) {
                        String s8 = ((com.google.android.gms.internal.measurement.d3) i16.get(i17)).s();
                        if (z5 && s8.length() > 4) {
                            char[] charArray = s8.toCharArray();
                            int i18 = 1;
                            while (true) {
                                if (i18 >= 64) {
                                    i18 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18)) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18 | 1);
                            s8 = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
                        B.i("_tcfd");
                        B.j(s8);
                        z2Var.b();
                        ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).A(i17, (com.google.android.gms.internal.measurement.d3) B.f());
                    } else {
                        i17++;
                    }
                }
                h3Var.X(i15, z2Var);
                return;
            }
        }
    }

    public final void m0(zzr zzrVar) {
        b().j();
        l0();
        String str = zzrVar.f5820a;
        g6.v.e(str);
        q1 c2 = q1.c(zzrVar.f5841x, zzrVar.f5836s);
        d(str);
        a().f22910n.c(str, c2, "Setting storage consent for package");
        b().j();
        l0();
        this.B.put(str, c2);
        j jVar = this.f22989c;
        U(jVar);
        jVar.E(str, c2);
    }

    public final void n(s0 s0Var, com.google.android.gms.internal.measurement.h3 h3Var) {
        Serializable y5;
        b().j();
        l0();
        com.google.android.gms.internal.measurement.k2 O = com.google.android.gms.internal.measurement.n2.O();
        f1 f1Var = s0Var.f23026a;
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.j();
        byte[] bArr = s0Var.H;
        if (bArr != null) {
            try {
                O = (com.google.android.gms.internal.measurement.k2) r0.W(O, bArr);
            } catch (p5 unused) {
                a().f22906i.b(n0.r(s0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = h3Var.V().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) it.next();
            if (a3Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.d3 r5 = r0.r(a3Var, "gclid");
                Serializable y10 = r5 == null ? null : r0.y(r5);
                if (y10 == null) {
                    y10 = "";
                }
                String str = (String) y10;
                com.google.android.gms.internal.measurement.d3 r6 = r0.r(a3Var, "gbraid");
                Serializable y11 = r6 == null ? null : r0.y(r6);
                if (y11 == null) {
                    y11 = "";
                }
                String str2 = (String) y11;
                com.google.android.gms.internal.measurement.d3 r10 = r0.r(a3Var, "gad_source");
                Object y12 = r10 == null ? null : r0.y(r10);
                String str3 = (String) (y12 != null ? y12 : "");
                String[] split = ((String) x.f23194h1.a(null)).split(StringUtils.COMMA);
                j0();
                HashMap hashMap = new HashMap();
                for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
                    if (Arrays.asList(split).contains(d3Var.q()) && (y5 = r0.y(d3Var)) != null) {
                        hashMap.put(d3Var.q(), y5);
                    }
                }
                if (!hashMap.isEmpty()) {
                    com.google.android.gms.internal.measurement.d3 r11 = r0.r(a3Var, "click_timestamp");
                    Object y13 = r11 == null ? null : r0.y(r11);
                    long longValue = ((Long) (y13 != null ? y13 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = a3Var.u();
                    }
                    com.google.android.gms.internal.measurement.d3 r12 = r0.r(a3Var, "_cis");
                    if ("referrer API v2".equals(r12 != null ? r0.y(r12) : null)) {
                        if (longValue > ((com.google.android.gms.internal.measurement.n2) O.f5041b).N()) {
                            if (str.isEmpty()) {
                                O.b();
                                ((com.google.android.gms.internal.measurement.n2) O.f5041b).q();
                            } else {
                                O.b();
                                ((com.google.android.gms.internal.measurement.n2) O.f5041b).p(str);
                            }
                            if (str2.isEmpty()) {
                                O.b();
                                ((com.google.android.gms.internal.measurement.n2) O.f5041b).s();
                            } else {
                                O.b();
                                ((com.google.android.gms.internal.measurement.n2) O.f5041b).r(str2);
                            }
                            if (str3.isEmpty()) {
                                O.b();
                                ((com.google.android.gms.internal.measurement.n2) O.f5041b).u();
                            } else {
                                O.b();
                                ((com.google.android.gms.internal.measurement.n2) O.f5041b).t(str3);
                            }
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).v(longValue);
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).x().clear();
                            HashMap G = G(a3Var);
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).x().putAll(G);
                        }
                    } else if (longValue > ((com.google.android.gms.internal.measurement.n2) O.f5041b).F()) {
                        if (str.isEmpty()) {
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).R();
                        } else {
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).Q(str);
                        }
                        if (str2.isEmpty()) {
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).T();
                        } else {
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).S(str2);
                        }
                        if (str3.isEmpty()) {
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).V();
                        } else {
                            O.b();
                            ((com.google.android.gms.internal.measurement.n2) O.f5041b).U(str3);
                        }
                        O.b();
                        ((com.google.android.gms.internal.measurement.n2) O.f5041b).W(longValue);
                        O.b();
                        ((com.google.android.gms.internal.measurement.n2) O.f5041b).w().clear();
                        HashMap G2 = G(a3Var);
                        O.b();
                        ((com.google.android.gms.internal.measurement.n2) O.f5041b).w().putAll(G2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.n2) O.f()).equals(com.google.android.gms.internal.measurement.n2.P())) {
            com.google.android.gms.internal.measurement.n2 n2Var = (com.google.android.gms.internal.measurement.n2) O.f();
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).k1(n2Var);
        }
        byte[] a7 = ((com.google.android.gms.internal.measurement.n2) O.f()).a();
        d1 d1Var2 = f1Var.f22746g;
        f1.m(d1Var2);
        d1Var2.j();
        s0Var.Q |= s0Var.H != a7;
        s0Var.H = a7;
        if (s0Var.o()) {
            j jVar = this.f22989c;
            U(jVar);
            jVar.m0(s0Var, false);
        }
        if (e0().t(null, x.f23191g1)) {
            j jVar2 = this.f22989c;
            U(jVar2);
            jVar2.b0(s0Var.D(), "_lgclid");
        }
    }

    public final void n0(zzr zzrVar) {
        b().j();
        l0();
        String str = zzrVar.f5820a;
        g6.v.e(str);
        l b10 = l.b(zzrVar.f5842y);
        a().f22910n.c(str, b10, "Setting DMA consent for package");
        b().j();
        l0();
        n1 a7 = l.c(100, p0(str)).a();
        this.C.put(str, b10);
        j jVar = this.f22989c;
        U(jVar);
        g6.v.h(str);
        g6.v.h(b10);
        jVar.j();
        jVar.k();
        q1 C = jVar.C(str);
        q1 q1Var = q1.f22964c;
        if (C == q1Var) {
            jVar.E(str, q1Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("dma_consent_settings", b10.f22862b);
        jVar.G(contentValues);
        n1 a10 = l.c(100, p0(str)).a();
        b().j();
        l0();
        n1 n1Var = n1.GRANTED;
        n1 n1Var2 = n1.DENIED;
        boolean z5 = a7 == n1Var2 && a10 == n1Var;
        boolean z7 = a7 == n1Var && a10 == n1Var2;
        if (z5 || z7) {
            a().f22910n.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            j jVar2 = this.f22989c;
            U(jVar2);
            if (jVar2.n0(g(), str, false, false, false, false).f22774f < e0().r(str, x.f23207n0)) {
                bundle.putLong("_r", 1L);
                j jVar3 = this.f22989c;
                U(jVar3);
                a().f22910n.c(str, Long.valueOf(jVar3.n0(g(), str, false, false, true, false).f22774f), "_dcu realtime event count");
            }
            this.J.a(str, "_dcu", bundle);
        }
    }

    public final String o(q1 q1Var) {
        if (!q1Var.i(p1.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().i0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final l o0(String str) {
        b().j();
        l0();
        HashMap hashMap = this.C;
        l lVar = (l) hashMap.get(str);
        if (lVar != null) {
            return lVar;
        }
        j jVar = this.f22989c;
        U(jVar);
        g6.v.h(str);
        jVar.j();
        jVar.k();
        l b10 = l.b(jVar.F("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b10);
        return b10;
    }

    public final void p(ArrayList arrayList) {
        g6.v.b(!arrayList.isEmpty());
        if (this.f23009y != null) {
            a().f22903f.a("Set uploading progress before finishing the previous upload");
        } else {
            this.f23009y = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle p0(String str) {
        b().j();
        l0();
        z0 z0Var = this.f22987a;
        U(z0Var);
        if (z0Var.E(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        q1 d10 = d(str);
        Bundle bundle2 = new Bundle();
        Iterator it = d10.f22965a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((n1) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((p1) entry.getKey()).f22944a, str2);
            }
        }
        bundle.putAll(bundle2);
        l q02 = q0(str, o0(str), d10, new r7.a(3));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : q02.f22865e.entrySet()) {
            int ordinal2 = ((n1) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((p1) entry2.getKey()).f22944a, str3);
            }
        }
        Boolean bool = q02.f22863c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = q02.f22864d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        j jVar = this.f22989c;
        U(jVar);
        t3 d02 = jVar.d0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (d02 != null ? d02.f23098e.equals(1L) : F(str, new r7.a(3))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [s7.r3] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        j jVar;
        long longValue;
        SQLiteException e7;
        b().j();
        l0();
        this.f23006v = true;
        try {
            f1 f1Var = this.f22997l;
            f1Var.getClass();
            Boolean bool = f1Var.p().f23258e;
            if (bool == null) {
                a().f22906i.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().f22903f.a("Upload called in the client side when service should be used");
            } else if (this.f23000o > 0) {
                N();
            } else {
                b().j();
                if (this.f23009y != null) {
                    a().f22910n.a("Uploading requested multiple times");
                } else {
                    r0 r0Var = this.f22988b;
                    U(r0Var);
                    if (r0Var.D()) {
                        f().getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int r5 = e0().r(null, x.j0);
                        e0();
                        long longValue2 = currentTimeMillis - ((Long) x.f23184e.a(null)).longValue();
                        for (int i5 = 0; i5 < r5 && I(longValue2, null); i5++) {
                        }
                        o8.a();
                        b().j();
                        H();
                        long a7 = this.f22995i.f22647h.a();
                        if (a7 != 0) {
                            a().f22909m.b(Long.valueOf(Math.abs(currentTimeMillis - a7)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        j jVar2 = this.f22989c;
                        U(jVar2);
                        String r6 = jVar2.r();
                        long j = -1;
                        if (TextUtils.isEmpty(r6)) {
                            try {
                                this.A = -1L;
                                jVar = this.f22989c;
                                U(jVar);
                                e0();
                                longValue = currentTimeMillis - ((Long) x.f23184e.a(null)).longValue();
                                jVar.j();
                                jVar.k();
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = jVar.Y().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        n0 n0Var = ((f1) jVar.f3328a).f22745f;
                                        f1.m(n0Var);
                                        n0Var.f22910n.a("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e9) {
                                    e7 = e9;
                                    n0 n0Var2 = ((f1) jVar.f3328a).f22745f;
                                    f1.m(n0Var2);
                                    n0Var2.f22903f.b(e7, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e10) {
                                e7 = e10;
                                currentTimeMillis = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                j jVar3 = this.f22989c;
                                U(jVar3);
                                s0 l02 = jVar3.l0(str);
                                if (l02 != null) {
                                    z(l02);
                                }
                            }
                        } else {
                            if (this.A == -1) {
                                j jVar4 = this.f22989c;
                                U(jVar4);
                                try {
                                    try {
                                        cursor2 = jVar4.Y().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } finally {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (SQLiteException e11) {
                                    n0 n0Var3 = ((f1) jVar4.f3328a).f22745f;
                                    f1.m(n0Var3);
                                    n0Var3.f22903f.b(e11, "Error querying raw events");
                                }
                                cursor2.close();
                                this.A = j;
                            }
                            r(currentTimeMillis, r6);
                        }
                    } else {
                        a().f22910n.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.f23006v = false;
            O();
        } catch (Throwable th4) {
            this.f23006v = false;
            O();
            throw th4;
        }
    }

    public final l q0(String str, l lVar, q1 q1Var, r7.a aVar) {
        p1 p1Var;
        n1 n9;
        z0 z0Var = this.f22987a;
        U(z0Var);
        com.google.android.gms.internal.measurement.z1 E = z0Var.E(str);
        int i5 = 90;
        n1 n1Var = n1.DENIED;
        p1 p1Var2 = p1.AD_USER_DATA;
        if (E == null) {
            if (lVar.a() == n1Var) {
                i5 = lVar.f22861a;
                aVar.m(p1Var2, i5);
            } else {
                aVar.p(p1Var2, f.FAILSAFE);
            }
            return new l(Boolean.FALSE, i5, Boolean.TRUE, "-");
        }
        n1 a7 = lVar.a();
        n1 n1Var2 = n1.GRANTED;
        if (a7 == n1Var2 || a7 == n1Var) {
            i5 = lVar.f22861a;
            aVar.m(p1Var2, i5);
        } else {
            n1 n1Var3 = n1.POLICY;
            n1 n1Var4 = n1.UNINITIALIZED;
            if (a7 != n1Var3 || (n9 = z0Var.n(str, p1Var2)) == n1Var4) {
                z0Var.j();
                z0Var.p(str);
                com.google.android.gms.internal.measurement.z1 E2 = z0Var.E(str);
                if (E2 != null) {
                    for (com.google.android.gms.internal.measurement.x1 x1Var : E2.q()) {
                        if (p1Var2 == z0.u(x1Var.p())) {
                            p1Var = z0.u(x1Var.q());
                            break;
                        }
                    }
                }
                p1Var = null;
                EnumMap enumMap = q1Var.f22965a;
                p1 p1Var3 = p1.AD_STORAGE;
                n1 n1Var5 = (n1) enumMap.get(p1Var3);
                if (n1Var5 != null) {
                    n1Var4 = n1Var5;
                }
                boolean z5 = n1Var4 == n1Var2 || n1Var4 == n1Var;
                if (p1Var == p1Var3 && z5) {
                    aVar.p(p1Var2, f.REMOTE_DELEGATION);
                    a7 = n1Var4;
                } else {
                    aVar.p(p1Var2, f.REMOTE_DEFAULT);
                    a7 = true != z0Var.D(str, p1Var2) ? n1Var : n1Var2;
                }
            } else {
                aVar.p(p1Var2, f.REMOTE_ENFORCED_DEFAULT);
                a7 = n9;
            }
        }
        z0Var.j();
        z0Var.p(str);
        com.google.android.gms.internal.measurement.z1 E3 = z0Var.E(str);
        boolean z7 = E3 == null || !E3.s() || E3.t();
        U(z0Var);
        z0Var.j();
        z0Var.p(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.z1 E4 = z0Var.E(str);
        if (E4 != null) {
            Iterator it = E4.r().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.y1) it.next()).p());
            }
        }
        if (a7 == n1Var || treeSet.isEmpty()) {
            return new l(Boolean.FALSE, i5, Boolean.valueOf(z7), "-");
        }
        return new l(Boolean.TRUE, i5, Boolean.valueOf(z7), z7 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x0225, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07f7 A[EDGE_INSN: B:158:0x07f7->B:159:0x07f7 BREAK  A[LOOP:4: B:97:0x064e->B:126:0x07e9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0652  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(long j, String str) {
        Cursor cursor;
        f1 f1Var;
        long j6;
        Cursor cursor2;
        List list;
        List<Pair> list2;
        List list3;
        q1 d10;
        p1 p1Var;
        int i5;
        List list4;
        com.google.android.gms.internal.measurement.f3 w10;
        int size;
        int i10;
        boolean i11;
        boolean t3;
        List list5;
        f1 f1Var2;
        boolean z5;
        Object obj;
        r0 r0Var;
        String str2;
        m3 m3Var;
        int i12;
        boolean z7;
        int i13;
        List list6;
        boolean z10;
        String str3;
        List list7;
        boolean isEmpty;
        Cursor cursor3;
        f1 f1Var3;
        List list8;
        Cursor cursor4;
        List list9;
        Iterator it;
        Iterator it2;
        int i14;
        int i15;
        SQLiteDatabase Y;
        long currentTimeMillis;
        Cursor query;
        ArrayList arrayList;
        j jVar;
        byte[] byteArray;
        long j10;
        long j11;
        String str4 = str;
        int r5 = e0().r(str4, x.f23192h);
        int i16 = 0;
        int max = Math.max(0, e0().r(str4, x.f23195i));
        j g02 = g0();
        f1 f1Var4 = (f1) g02.f3328a;
        g02.j();
        g02.k();
        int i17 = 1;
        g6.v.b(r5 > 0);
        ?? r11 = max > 0 ? 1 : 0;
        g6.v.b(r11);
        g6.v.e(str4);
        try {
            try {
                try {
                    j6 = -1;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e7) {
                e = e7;
                f1Var = f1Var4;
                j6 = -1;
            }
            try {
                cursor2 = g02.Y().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str4}, null, null, "rowid", String.valueOf(r5));
                try {
                } catch (SQLiteException e9) {
                    e = e9;
                    f1Var = f1Var4;
                }
            } catch (SQLiteException e10) {
                e = e10;
                f1Var = f1Var4;
                cursor2 = null;
                f1Var.a().n().c(n0.r(str4), e, "Error querying bundles. appId");
                list = Collections.EMPTY_LIST;
            }
            if (cursor2.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                int i18 = 0;
                while (true) {
                    long j12 = cursor2.getLong(i16);
                    try {
                        byte[] blob = cursor2.getBlob(i17);
                        r0 j0 = g02.f22859b.j0();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                            jVar = g02;
                            while (true) {
                                try {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    f1Var = f1Var4;
                                    try {
                                        try {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                            f1Var4 = f1Var;
                                        } catch (IOException e11) {
                                            e = e11;
                                            try {
                                                ((f1) j0.f3328a).a().n().b(e, "Failed to ungzip content");
                                                throw e;
                                            } catch (IOException e12) {
                                                e = e12;
                                                f1Var.a().n().c(n0.r(str4), e, "Failed to unzip queued bundle. appId");
                                                if (cursor2.moveToNext()) {
                                                    break;
                                                }
                                                g02 = jVar;
                                                f1Var4 = f1Var;
                                                i16 = 0;
                                                i17 = 1;
                                                cursor2.close();
                                                list2 = arrayList2;
                                                if (list2.isEmpty()) {
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        f1Var.a().n().c(n0.r(str4), e, "Error querying bundles. appId");
                                        list = Collections.EMPTY_LIST;
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    f1Var = f1Var4;
                                    ((f1) j0.f3328a).a().n().b(e, "Failed to ungzip content");
                                    throw e;
                                }
                            }
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (IOException e15) {
                            e = e15;
                            jVar = g02;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        jVar = g02;
                        f1Var = f1Var4;
                    }
                    if (!arrayList2.isEmpty() && byteArray.length + i18 > max) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) r0.W(com.google.android.gms.internal.measurement.i3.U(), byteArray);
                        if (!arrayList2.isEmpty()) {
                            com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) ((Pair) arrayList2.get(0)).first;
                            com.google.android.gms.internal.measurement.i3 i3Var2 = (com.google.android.gms.internal.measurement.i3) h3Var.f();
                            if (!i3Var.u0().equals(i3Var2.u0()) || !i3Var.B0().equals(i3Var2.B0()) || i3Var.D0() != i3Var2.D0() || !i3Var.F0().equals(i3Var2.F0())) {
                                break;
                            }
                            Iterator it3 = i3Var.U1().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j10 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.r3 r3Var = (com.google.android.gms.internal.measurement.r3) it3.next();
                                Iterator it4 = it3;
                                if ("_npa".equals(r3Var.r())) {
                                    j10 = r3Var.v();
                                    break;
                                }
                                it3 = it4;
                            }
                            Iterator it5 = i3Var2.U1().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    j11 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) it5.next();
                                if ("_npa".equals(r3Var2.r())) {
                                    j11 = r3Var2.v();
                                    break;
                                }
                            }
                            if (j10 != j11) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            int i19 = cursor2.getInt(2);
                            h3Var.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).T0(i19);
                        }
                        i18 += byteArray.length;
                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var.f(), Long.valueOf(j12)));
                    } catch (IOException e17) {
                        f1Var4.a().n().c(n0.r(str4), e17, "Failed to merge queued bundle. appId");
                    }
                    f1Var = f1Var4;
                    if (cursor2.moveToNext() || i18 > max) {
                        break;
                        break;
                    }
                    g02 = jVar;
                    f1Var4 = f1Var;
                    i16 = 0;
                    i17 = 1;
                }
                cursor2.close();
                list2 = arrayList2;
                if (list2.isEmpty()) {
                }
            } else {
                list = Collections.EMPTY_LIST;
                cursor2.close();
                list2 = list;
                if (list2.isEmpty()) {
                    return;
                }
                n7 n7Var = n7.f5150b;
                e e0 = e0();
                w wVar = x.f23197i1;
                boolean t5 = e0.t(null, wVar);
                p1 p1Var2 = p1.ANALYTICS_STORAGE;
                if (t5) {
                    if (!e0().t(null, wVar)) {
                        list7 = list2;
                    } else if (d(str4).i(p1Var2) || !f0().o(str4)) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        j g03 = g0();
                        f1 f1Var5 = (f1) g03.f3328a;
                        g6.v.e(str4);
                        g03.j();
                        g03.k();
                        ArrayList arrayList4 = new ArrayList();
                        try {
                            try {
                                Y = g03.Y();
                                f1Var5.f().getClass();
                                currentTimeMillis = System.currentTimeMillis();
                                query = Y.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                f1Var3 = f1Var5;
                            } catch (SQLiteException e18) {
                                e = e18;
                                f1Var3 = f1Var5;
                                list8 = list2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor3 = null;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                        try {
                            try {
                                if (query.moveToFirst()) {
                                    list8 = list2;
                                    while (true) {
                                        try {
                                            try {
                                                arrayList4.add((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) r0.W(com.google.android.gms.internal.measurement.a3.z(), query.getBlob(0))).f());
                                                cursor4 = query;
                                                arrayList = arrayList4;
                                            } catch (SQLiteException e19) {
                                                e = e19;
                                                cursor4 = query;
                                                f1Var3.a().n().c(n0.r(str4), e, "Error flushing NO_DATA mode events. appId");
                                                list9 = Collections.EMPTY_LIST;
                                                if (cursor4 != null) {
                                                }
                                                it = list8.iterator();
                                                boolean z11 = true;
                                                while (it.hasNext()) {
                                                }
                                                list7 = arrayList3;
                                                isEmpty = list7.isEmpty();
                                                list3 = list7;
                                                if (isEmpty) {
                                                }
                                                d10 = d(str4);
                                                p1Var = p1.AD_STORAGE;
                                                if (d10.i(p1Var)) {
                                                }
                                                i5 = 0;
                                                list4 = list3;
                                                w10 = com.google.android.gms.internal.measurement.g3.w();
                                                size = list4.size();
                                                ArrayList arrayList5 = new ArrayList(list4.size());
                                                if (e0().k(str4)) {
                                                }
                                                boolean i20 = d(str4).i(p1Var);
                                                i11 = d(str4).i(p1Var2);
                                                t3 = e0().t(str4, x.N0);
                                                n3 n3Var = this.j;
                                                m3 k6 = n3Var.k(str4);
                                                list5 = list4;
                                                while (true) {
                                                    f1Var2 = this.f22997l;
                                                    if (i5 < size) {
                                                    }
                                                    i5 = r23 + 1;
                                                    size = i12;
                                                    i11 = z7;
                                                    list5 = list6;
                                                    i10 = i13;
                                                    t3 = z10;
                                                }
                                                if (((com.google.android.gms.internal.measurement.g3) w10.f5041b).q() != 0) {
                                                }
                                            }
                                        } catch (p5 e20) {
                                            cursor4 = query;
                                            try {
                                                try {
                                                    arrayList = arrayList4;
                                                    f1Var3.a().f22907k.c(n0.r(str4), e20, "Failed to parse stored NO_DATA mode event, appId");
                                                } catch (SQLiteException e21) {
                                                    e = e21;
                                                    f1Var3.a().n().c(n0.r(str4), e, "Error flushing NO_DATA mode events. appId");
                                                    list9 = Collections.EMPTY_LIST;
                                                    if (cursor4 != null) {
                                                    }
                                                    it = list8.iterator();
                                                    boolean z112 = true;
                                                    while (it.hasNext()) {
                                                    }
                                                    list7 = arrayList3;
                                                    isEmpty = list7.isEmpty();
                                                    list3 = list7;
                                                    if (isEmpty) {
                                                    }
                                                    d10 = d(str4);
                                                    p1Var = p1.AD_STORAGE;
                                                    if (d10.i(p1Var)) {
                                                    }
                                                    i5 = 0;
                                                    list4 = list3;
                                                    w10 = com.google.android.gms.internal.measurement.g3.w();
                                                    size = list4.size();
                                                    ArrayList arrayList52 = new ArrayList(list4.size());
                                                    if (e0().k(str4)) {
                                                    }
                                                    boolean i202 = d(str4).i(p1Var);
                                                    i11 = d(str4).i(p1Var2);
                                                    t3 = e0().t(str4, x.N0);
                                                    n3 n3Var2 = this.j;
                                                    m3 k62 = n3Var2.k(str4);
                                                    list5 = list4;
                                                    while (true) {
                                                        f1Var2 = this.f22997l;
                                                        if (i5 < size) {
                                                        }
                                                        i5 = r23 + 1;
                                                        size = i12;
                                                        i11 = z7;
                                                        list5 = list6;
                                                        i10 = i13;
                                                        t3 = z10;
                                                    }
                                                    if (((com.google.android.gms.internal.measurement.g3) w10.f5041b).q() != 0) {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                cursor3 = cursor4;
                                                if (cursor3 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!cursor4.moveToNext()) {
                                            break;
                                        }
                                        query = cursor4;
                                        arrayList4 = arrayList;
                                    }
                                    cursor4.close();
                                    try {
                                        int delete = Y.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)});
                                        l0 q = f1Var3.a().q();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 34);
                                        sb2.append("Pruned ");
                                        sb2.append(delete);
                                        sb2.append(" NO_DATA mode events. appId");
                                        q.b(str4, sb2.toString());
                                    } catch (SQLiteException e22) {
                                        e = e22;
                                        cursor4 = null;
                                        f1Var3.a().n().c(n0.r(str4), e, "Error flushing NO_DATA mode events. appId");
                                        list9 = Collections.EMPTY_LIST;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        it = list8.iterator();
                                        boolean z1122 = true;
                                        while (it.hasNext()) {
                                        }
                                        list7 = arrayList3;
                                        isEmpty = list7.isEmpty();
                                        list3 = list7;
                                        if (isEmpty) {
                                        }
                                        d10 = d(str4);
                                        p1Var = p1.AD_STORAGE;
                                        if (d10.i(p1Var)) {
                                        }
                                        i5 = 0;
                                        list4 = list3;
                                        w10 = com.google.android.gms.internal.measurement.g3.w();
                                        size = list4.size();
                                        ArrayList arrayList522 = new ArrayList(list4.size());
                                        if (e0().k(str4)) {
                                        }
                                        boolean i2022 = d(str4).i(p1Var);
                                        i11 = d(str4).i(p1Var2);
                                        t3 = e0().t(str4, x.N0);
                                        n3 n3Var22 = this.j;
                                        m3 k622 = n3Var22.k(str4);
                                        list5 = list4;
                                        while (true) {
                                            f1Var2 = this.f22997l;
                                            if (i5 < size) {
                                            }
                                            i5 = r23 + 1;
                                            size = i12;
                                            i11 = z7;
                                            list5 = list6;
                                            i10 = i13;
                                            t3 = z10;
                                        }
                                        if (((com.google.android.gms.internal.measurement.g3) w10.f5041b).q() != 0) {
                                        }
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    list8 = list2;
                                    query.close();
                                }
                                list9 = arrayList;
                            } catch (SQLiteException e23) {
                                e = e23;
                                cursor4 = query;
                                list8 = list2;
                            }
                            it = list8.iterator();
                            boolean z11222 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                com.google.android.gms.internal.measurement.h3 h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair.first).i();
                                if (z11222 && !list9.isEmpty()) {
                                    List V = h3Var2.V();
                                    h3Var2.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3Var2.f5041b).a0();
                                    h3Var2.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3Var2.f5041b).Z(list9);
                                    h3Var2.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3Var2.f5041b).Z(V);
                                    z11222 = false;
                                }
                                com.google.android.gms.internal.measurement.t2 q3 = com.google.android.gms.internal.measurement.w2.q();
                                com.google.android.gms.internal.measurement.z1 E = f0().E(str4);
                                ArrayList arrayList6 = new ArrayList();
                                if (E != null) {
                                    Iterator it6 = E.p().iterator();
                                    while (it6.hasNext()) {
                                        com.google.android.gms.internal.measurement.w1 w1Var = (com.google.android.gms.internal.measurement.w1) it6.next();
                                        Iterator it7 = it;
                                        com.google.android.gms.internal.measurement.u2 p10 = com.google.android.gms.internal.measurement.v2.p();
                                        boolean z12 = z11222;
                                        int p11 = w1Var.p() - 1;
                                        List list10 = list9;
                                        if (p11 == 1) {
                                            it2 = it6;
                                            i14 = 3;
                                            i15 = 2;
                                        } else if (p11 != 2) {
                                            it2 = it6;
                                            i14 = 3;
                                            i15 = p11 != 3 ? p11 != 4 ? 1 : 5 : 4;
                                        } else {
                                            it2 = it6;
                                            i14 = 3;
                                            i15 = 3;
                                        }
                                        p10.i(i15);
                                        int r6 = w1Var.r() - 1;
                                        if (r6 == 1) {
                                            i14 = 2;
                                        } else if (r6 != 2) {
                                            i14 = 1;
                                        }
                                        p10.j(i14);
                                        arrayList6.add((com.google.android.gms.internal.measurement.v2) p10.f());
                                        it = it7;
                                        list9 = list10;
                                        z11222 = z12;
                                        it6 = it2;
                                    }
                                }
                                Iterator it8 = it;
                                boolean z13 = z11222;
                                List list11 = list9;
                                q3.i(arrayList6);
                                h3Var2.F(q3);
                                arrayList3.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.f(), (Long) pair.second));
                                it = it8;
                                list9 = list11;
                                z11222 = z13;
                            }
                            list7 = arrayList3;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor4 = query;
                            cursor3 = cursor4;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        List asList = Arrays.asList(((String) x.f23198j1.a(null)).split(StringUtils.COMMA));
                        for (Pair pair2 : list2) {
                            try {
                                g0().s(((Long) pair2.second).longValue());
                                for (com.google.android.gms.internal.measurement.a3 a3Var : ((com.google.android.gms.internal.measurement.i3) pair2.first).P1()) {
                                    if (asList.contains(a3Var.s())) {
                                        if (a3Var.s().equals("_f") || a3Var.s().equals("_v")) {
                                            com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) a3Var.i();
                                            j0();
                                            r0.p(z2Var, "_dac", 1L);
                                            a3Var = (com.google.android.gms.internal.measurement.a3) z2Var.f();
                                        }
                                        j g04 = g0();
                                        g04.j();
                                        g04.k();
                                        g6.v.e(str4);
                                        f1 f1Var6 = (f1) g04.f3328a;
                                        f1Var6.a().q().b(a3Var, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put(CommonUrlParts.APP_ID, str4);
                                        com.google.android.gms.internal.measurement.a3 a3Var2 = a3Var;
                                        contentValues.put("name", a3Var2.s());
                                        contentValues.put("data", a3Var2.a());
                                        contentValues.put("timestamp_millis", Long.valueOf(a3Var2.u()));
                                        try {
                                            if (g04.Y().insert("no_data_mode_events", null, contentValues) == j6) {
                                                f1Var6.a().n().b(n0.r(str4), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e24) {
                                            ((f1) g04.f3328a).a().n().c(n0.r(str4), e24, "Error storing NO_DATA mode event. appId");
                                        }
                                    }
                                }
                            } catch (SQLiteException unused) {
                                a().f22907k.b(str4, "Failed handling NO_DATA mode bundles. appId");
                            }
                        }
                        list7 = Collections.EMPTY_LIST;
                    }
                    isEmpty = list7.isEmpty();
                    list3 = list7;
                    if (isEmpty) {
                        return;
                    }
                } else {
                    list3 = list2;
                }
                d10 = d(str4);
                p1Var = p1.AD_STORAGE;
                if (d10.i(p1Var)) {
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            str3 = null;
                            break;
                        }
                        com.google.android.gms.internal.measurement.i3 i3Var3 = (com.google.android.gms.internal.measurement.i3) ((Pair) it9.next()).first;
                        if (!i3Var3.v().isEmpty()) {
                            str3 = i3Var3.v();
                            break;
                        }
                    }
                    if (str3 != null) {
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            com.google.android.gms.internal.measurement.i3 i3Var4 = (com.google.android.gms.internal.measurement.i3) ((Pair) list3.get(i21)).first;
                            if (!i3Var4.v().isEmpty() && !i3Var4.v().equals(str3)) {
                                i5 = 0;
                                list4 = list3.subList(0, i21);
                                break;
                            }
                        }
                    }
                }
                i5 = 0;
                list4 = list3;
                w10 = com.google.android.gms.internal.measurement.g3.w();
                size = list4.size();
                ArrayList arrayList5222 = new ArrayList(list4.size());
                i10 = (e0().k(str4) || !d(str4).i(p1Var)) ? i5 : 1;
                boolean i20222 = d(str4).i(p1Var);
                i11 = d(str4).i(p1Var2);
                t3 = e0().t(str4, x.N0);
                n3 n3Var222 = this.j;
                m3 k6222 = n3Var222.k(str4);
                list5 = list4;
                while (true) {
                    f1Var2 = this.f22997l;
                    if (i5 < size) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.h3 h3Var3 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) ((Pair) list5.get(i5)).first).i();
                    int i22 = i5;
                    arrayList5222.add((Long) ((Pair) list5.get(i5)).second);
                    e0().o();
                    h3Var3.t();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).f0(j);
                    f1Var2.getClass();
                    h3Var3.J();
                    if (i10 == 0) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).S0();
                    }
                    if (!i20222) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).z1();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).B1();
                    }
                    if (!i11) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).D1();
                    }
                    v(h3Var3, str4);
                    if (!t3) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).Z0();
                    }
                    if (!i11) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).L1();
                    }
                    String v5 = ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).v();
                    if (TextUtils.isEmpty(v5)) {
                        i12 = size;
                    } else {
                        i12 = size;
                        if (!v5.equals("00000000-0000-0000-0000-000000000000")) {
                            z7 = i11;
                            i13 = i10;
                            list6 = list5;
                            z10 = t3;
                            if (h3Var3.W() != 0) {
                                if (e0().t(str4, x.D0)) {
                                    h3Var3.Q(j0().U(((com.google.android.gms.internal.measurement.i3) h3Var3.f()).a()));
                                }
                                com.google.android.gms.internal.measurement.p3 b10 = k6222.b();
                                if (b10 != null) {
                                    h3Var3.C(b10);
                                }
                                w10.b();
                                ((com.google.android.gms.internal.measurement.g3) w10.f5041b).z((com.google.android.gms.internal.measurement.i3) h3Var3.f());
                            }
                            i5 = i22 + 1;
                            size = i12;
                            i11 = z7;
                            list5 = list6;
                            i10 = i13;
                            t3 = z10;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(h3Var3.V());
                    Iterator it10 = arrayList7.iterator();
                    z7 = i11;
                    Long l6 = null;
                    Long l10 = null;
                    boolean z14 = false;
                    boolean z15 = false;
                    while (it10.hasNext()) {
                        int i23 = i10;
                        com.google.android.gms.internal.measurement.a3 a3Var3 = (com.google.android.gms.internal.measurement.a3) it10.next();
                        List list12 = list5;
                        boolean z16 = t3;
                        if ("_fx".equals(a3Var3.s())) {
                            it10.remove();
                            list5 = list12;
                            i10 = i23;
                            t3 = z16;
                            z14 = true;
                        } else if ("_f".equals(a3Var3.s())) {
                            j0();
                            com.google.android.gms.internal.measurement.d3 r10 = r0.r(a3Var3, "_pfo");
                            if (r10 != null) {
                                l6 = Long.valueOf(r10.u());
                            }
                            j0();
                            com.google.android.gms.internal.measurement.d3 r12 = r0.r(a3Var3, "_uwa");
                            if (r12 != null) {
                                l10 = Long.valueOf(r12.u());
                            }
                            list5 = list12;
                            i10 = i23;
                            t3 = z16;
                        } else {
                            list5 = list12;
                            i10 = i23;
                            t3 = z16;
                        }
                        z15 = true;
                    }
                    i13 = i10;
                    list6 = list5;
                    z10 = t3;
                    if (z14) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).a0();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.f5041b).Z(arrayList7);
                    }
                    if (z15) {
                        u(h3Var3.p(), true, l6, l10);
                    }
                    if (h3Var3.W() != 0) {
                    }
                    i5 = i22 + 1;
                    size = i12;
                    i11 = z7;
                    list5 = list6;
                    i10 = i13;
                    t3 = z10;
                }
                if (((com.google.android.gms.internal.measurement.g3) w10.f5041b).q() != 0) {
                    p(arrayList5222);
                    y(false, 204, null, null, str4, Collections.EMPTY_LIST);
                    return;
                }
                com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) w10.f();
                ArrayList arrayList8 = new ArrayList();
                k2 k2Var = k6222.f22888c;
                boolean z17 = k2Var == k2.SGTM_CLIENT;
                if (k2Var == k2.SGTM) {
                    z5 = z17;
                } else {
                    if (!z17) {
                        obj = null;
                        r0Var = this.f22988b;
                        U(r0Var);
                        if (r0Var.D()) {
                            return;
                        }
                        Object M = Log.isLoggable(a().t(), 2) ? j0().M(g3Var) : obj;
                        j0();
                        byte[] a7 = g3Var.a();
                        p(arrayList5222);
                        this.f22995i.f22648i.b(j);
                        a().q().d("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(a7.length), M);
                        this.f23005u = true;
                        U(r0Var);
                        r0Var.I(str4, k6222, g3Var, new kh.g(this, str4, (Object) arrayList8, 5));
                        return;
                    }
                    z5 = true;
                }
                Iterator it11 = ((com.google.android.gms.internal.measurement.g3) w10.f()).p().iterator();
                while (true) {
                    if (it11.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.i3) it11.next()).N()) {
                            str2 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                com.google.android.gms.internal.measurement.g3 g3Var2 = (com.google.android.gms.internal.measurement.g3) w10.f();
                b().j();
                l0();
                com.google.android.gms.internal.measurement.f3 x10 = com.google.android.gms.internal.measurement.g3.x(g3Var2);
                if (!TextUtils.isEmpty(str2)) {
                    x10.b();
                    ((com.google.android.gms.internal.measurement.g3) x10.f5041b).C(str2);
                }
                String w11 = f0().w(str4);
                if (!TextUtils.isEmpty(w11)) {
                    x10.j(w11);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it12 = g3Var2.p().iterator();
                while (it12.hasNext()) {
                    com.google.android.gms.internal.measurement.h3 V2 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it12.next());
                    V2.b();
                    ((com.google.android.gms.internal.measurement.i3) V2.f5041b).S0();
                    arrayList9.add((com.google.android.gms.internal.measurement.i3) V2.f());
                }
                x10.b();
                ((com.google.android.gms.internal.measurement.g3) x10.f5041b).B();
                x10.b();
                ((com.google.android.gms.internal.measurement.g3) x10.f5041b).A(arrayList9);
                a().q().b(TextUtils.isEmpty(str2) ? "null" : x10.i(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                com.google.android.gms.internal.measurement.g3 g3Var3 = (com.google.android.gms.internal.measurement.g3) x10.f();
                if (TextUtils.isEmpty(str2)) {
                    obj = null;
                } else {
                    com.google.android.gms.internal.measurement.g3 g3Var4 = (com.google.android.gms.internal.measurement.g3) w10.f();
                    b().j();
                    l0();
                    com.google.android.gms.internal.measurement.f3 w12 = com.google.android.gms.internal.measurement.g3.w();
                    a().q().b(str2, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    w12.b();
                    ((com.google.android.gms.internal.measurement.g3) w12.f5041b).C(str2);
                    for (com.google.android.gms.internal.measurement.i3 i3Var5 : g3Var4.p()) {
                        com.google.android.gms.internal.measurement.h3 U = com.google.android.gms.internal.measurement.i3.U();
                        String O = i3Var5.O();
                        U.b();
                        ((com.google.android.gms.internal.measurement.i3) U.f5041b).R0(O);
                        int K0 = i3Var5.K0();
                        U.b();
                        ((com.google.android.gms.internal.measurement.i3) U.f5041b).j1(K0);
                        w12.b();
                        ((com.google.android.gms.internal.measurement.g3) w12.f5041b).z((com.google.android.gms.internal.measurement.i3) U.f());
                    }
                    com.google.android.gms.internal.measurement.g3 g3Var5 = (com.google.android.gms.internal.measurement.g3) w12.f();
                    String w13 = n3Var222.f22859b.f0().w(str4);
                    boolean isEmpty2 = TextUtils.isEmpty(w13);
                    k2 k2Var2 = k2.GOOGLE_SIGNAL;
                    k2 k2Var3 = k2.GOOGLE_SIGNAL_PENDING;
                    if (isEmpty2) {
                        obj = null;
                        String str5 = (String) x.f23215s.a(null);
                        if (z5) {
                            k2Var2 = k2Var3;
                        }
                        m3Var = new m3(str5, Collections.EMPTY_MAP, k2Var2, null);
                    } else {
                        Uri parse = Uri.parse((String) x.f23215s.a(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        String authority = parse.getAuthority();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(w13).length() + 1 + String.valueOf(authority).length());
                        sb3.append(w13);
                        sb3.append(".");
                        sb3.append(authority);
                        buildUpon.authority(sb3.toString());
                        String uri = buildUpon.build().toString();
                        if (z5) {
                            k2Var2 = k2Var3;
                        }
                        obj = null;
                        m3Var = new m3(uri, Collections.EMPTY_MAP, k2Var2, null);
                    }
                    arrayList8.add(Pair.create(g3Var5, m3Var));
                }
                if (z5) {
                    com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) g3Var3.i();
                    for (int i24 = 0; i24 < g3Var3.q(); i24++) {
                        com.google.android.gms.internal.measurement.h3 h3Var4 = (com.google.android.gms.internal.measurement.h3) g3Var3.r(i24).i();
                        h3Var4.b0();
                        h3Var4.D(j);
                        f3Var.b();
                        ((com.google.android.gms.internal.measurement.g3) f3Var.f5041b).y(i24, (com.google.android.gms.internal.measurement.i3) h3Var4.f());
                    }
                    arrayList8.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.f(), k6222));
                    p(arrayList5222);
                    y(false, 204, null, null, str, arrayList8);
                    if (s(str, k6222.a())) {
                        a().q().b(str, "[sgtm] Sending sgtm batches available notification to app");
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        S(f1Var2.e(), intent);
                        return;
                    }
                    return;
                }
                str4 = str;
                g3Var = g3Var3;
                r0Var = this.f22988b;
                U(r0Var);
                if (r0Var.D()) {
                }
            }
        } catch (Throwable th6) {
            th = th6;
            cursor = r11;
        }
    }

    public final boolean s(String str, String str2) {
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str);
        HashMap hashMap = this.E;
        if (l02 != null && k0().L(str, l02.C())) {
            hashMap.remove(str2);
            return true;
        }
        q3 q3Var = (q3) hashMap.get(str2);
        if (q3Var != null) {
            q3Var.f22968a.f().getClass();
            if (System.currentTimeMillis() < q3Var.f22970c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        b().j();
        l0();
        this.f23006v = true;
        try {
            f1 f1Var = this.f22997l;
            f1Var.getClass();
            Boolean bool = f1Var.p().f23258e;
            if (bool == null) {
                a().f22906i.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().f22903f.a("Upload called in the client side when service should be used");
            } else if (this.f23000o > 0) {
                N();
            } else {
                r0 r0Var = this.f22988b;
                U(r0Var);
                if (r0Var.D()) {
                    j jVar = this.f22989c;
                    U(jVar);
                    if (jVar.p(str)) {
                        j jVar2 = this.f22989c;
                        U(jVar2);
                        g6.v.e(str);
                        jVar2.j();
                        jVar2.k();
                        List o3 = jVar2.o(str, zzoo.c(k2.GOOGLE_SIGNAL), 1);
                        s3 s3Var = o3.isEmpty() ? null : (s3) o3.get(0);
                        if (s3Var != null) {
                            com.google.android.gms.internal.measurement.g3 g3Var = s3Var.f23063b;
                            a().f22910n.d("[sgtm] Uploading data from upload queue. appId, type, url", str, s3Var.f23066e, s3Var.f23064c);
                            byte[] a7 = g3Var.a();
                            if (Log.isLoggable(a().t(), 2)) {
                                r0 r0Var2 = this.f22993g;
                                U(r0Var2);
                                a().f22910n.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(a7.length), r0Var2.M(g3Var));
                            }
                            m3 m3Var = new m3(s3Var.f23064c, s3Var.f23065d, s3Var.f23066e, null);
                            this.f23005u = true;
                            r0 r0Var3 = this.f22988b;
                            U(r0Var3);
                            r0Var3.I(str, m3Var, g3Var, new kh.g(this, str, (Object) s3Var, 6));
                        }
                    } else {
                        a().f22910n.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().f22910n.a("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.f23006v = false;
            O();
        } catch (Throwable th2) {
            this.f23006v = false;
            O();
            throw th2;
        }
    }

    public final void u(String str, boolean z5, Long l6, Long l10) {
        j jVar = this.f22989c;
        U(jVar);
        s0 l02 = jVar.l0(str);
        if (l02 != null) {
            f1 f1Var = l02.f23026a;
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.j();
            l02.Q |= l02.f23048y != z5;
            l02.f23048y = z5;
            d1 d1Var2 = f1Var.f22746g;
            f1.m(d1Var2);
            d1Var2.j();
            l02.Q |= !Objects.equals(l02.f23049z, l6);
            l02.f23049z = l6;
            d1 d1Var3 = f1Var.f22746g;
            f1.m(d1Var3);
            d1Var3.j();
            l02.Q |= !Objects.equals(l02.A, l10);
            l02.A = l10;
            if (l02.o()) {
                j jVar2 = this.f22989c;
                U(jVar2);
                jVar2.m0(l02, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(com.google.android.gms.internal.measurement.h3 h3Var, String str) {
        int X;
        int indexOf;
        z0 z0Var = this.f22987a;
        U(z0Var);
        z0Var.j();
        z0Var.p(str);
        s.e eVar = z0Var.f23265e;
        Set set = (Set) eVar.get(str);
        if (set != null) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).a1(set);
        }
        U(z0Var);
        z0Var.j();
        z0Var.p(str);
        if (eVar.get(str) != null && (((Set) eVar.get(str)).contains("device_model") || ((Set) eVar.get(str)).contains("device_info"))) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).q1();
        }
        U(z0Var);
        if (z0Var.B(str)) {
            String i22 = ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).i2();
            if (!TextUtils.isEmpty(i22) && (indexOf = i22.indexOf(".")) != -1) {
                String substring = i22.substring(0, indexOf);
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).o0(substring);
            }
        }
        U(z0Var);
        z0Var.j();
        z0Var.p(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("user_id") && (X = r0.X(h3Var, "_id")) != -1) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).e0(X);
        }
        U(z0Var);
        z0Var.j();
        z0Var.p(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("google_signals")) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).S0();
        }
        U(z0Var);
        if (z0Var.C(str)) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).D1();
            if (d(str).i(p1.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.D;
                p3 p3Var = (p3) hashMap.get(str);
                if (p3Var != null) {
                    long q = e0().q(str, x.f23202l0) + p3Var.f22953b;
                    f().getClass();
                }
                p3Var = new p3(this, k0().d0());
                hashMap.put(str, p3Var);
                String str2 = p3Var.f22952a;
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).b1(str2);
            }
        }
        U(z0Var);
        z0Var.j();
        z0Var.p(str);
        if (eVar.get(str) == null || !((Set) eVar.get(str)).contains("enhanced_user_id")) {
            return;
        }
        h3Var.b();
        ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).Z0();
    }

    public final void w(com.google.android.gms.internal.measurement.h3 h3Var, g3.d dVar) {
        String str;
        String str2;
        for (int i5 = 0; i5 < h3Var.W(); i5++) {
            com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).T1(i5).i();
            Iterator it = z2Var.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.d3) it.next()).q())) {
                    if (((com.google.android.gms.internal.measurement.i3) dVar.f9735b).G0() >= e0().r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.f23205m0)) {
                        int r5 = e0().r(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.z0);
                        LinkedList linkedList = this.q;
                        r0 r0Var = this.f22993g;
                        if (r5 > 0) {
                            j jVar = this.f22989c;
                            U(jVar);
                            if (jVar.n0(g(), ((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), false, false, false, true).f22775g > r5) {
                                com.google.android.gms.internal.measurement.c3 B = com.google.android.gms.internal.measurement.d3.B();
                                B.i("_tnr");
                                B.k(1L);
                                z2Var.l((com.google.android.gms.internal.measurement.d3) B.f());
                            } else {
                                if (e0().t(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.S0)) {
                                    str2 = k0().d0();
                                    com.google.android.gms.internal.measurement.c3 B2 = com.google.android.gms.internal.measurement.d3.B();
                                    B2.i("_tu");
                                    B2.j(str2);
                                    z2Var.l((com.google.android.gms.internal.measurement.d3) B2.f());
                                } else {
                                    str2 = null;
                                }
                                com.google.android.gms.internal.measurement.c3 B3 = com.google.android.gms.internal.measurement.d3.B();
                                B3.i("_tr");
                                B3.k(1L);
                                z2Var.l((com.google.android.gms.internal.measurement.d3) B3.f());
                                U(r0Var);
                                zzoh K2 = r0Var.K(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), h3Var, z2Var, str2);
                                if (K2 != null) {
                                    a().f22910n.c(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), K2.f5801a, "Generated trigger URI. appId, uri");
                                    j jVar2 = this.f22989c;
                                    U(jVar2);
                                    jVar2.D(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), K2);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                                    }
                                }
                            }
                        } else {
                            if (e0().t(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), x.S0)) {
                                str = k0().d0();
                                com.google.android.gms.internal.measurement.c3 B4 = com.google.android.gms.internal.measurement.d3.B();
                                B4.i("_tu");
                                B4.j(str);
                                z2Var.l((com.google.android.gms.internal.measurement.d3) B4.f());
                            } else {
                                str = null;
                            }
                            com.google.android.gms.internal.measurement.c3 B5 = com.google.android.gms.internal.measurement.d3.B();
                            B5.i("_tr");
                            B5.k(1L);
                            z2Var.l((com.google.android.gms.internal.measurement.d3) B5.f());
                            U(r0Var);
                            zzoh K3 = r0Var.K(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), h3Var, z2Var, str);
                            if (K3 != null) {
                                a().f22910n.c(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), K3.f5801a, "Generated trigger URI. appId, uri");
                                j jVar3 = this.f22989c;
                                U(jVar3);
                                jVar3.D(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p(), K3);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.i3) dVar.f9735b).p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) z2Var.f();
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).X(i5, a3Var);
                }
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.c3 c3Var, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (v3.J(((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).q()) || v3.J(str)) {
            e e0 = e0();
            e0.getClass();
            max = Math.max(Math.max(Math.min(e0.r(str2, x.f23196i0), 500), 100), 256);
        } else {
            e e02 = e0();
            e02.getClass();
            max = Math.max(Math.min(e02.r(str2, x.f23196i0), 500), 100);
        }
        long j = max;
        long codePointCount = ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).s().codePointCount(0, ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).s().length());
        k0();
        String q = ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).q();
        e0();
        String o3 = v3.o(q, 40, true);
        if (codePointCount <= j || unmodifiableList.contains(((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).q())) {
            k0();
            String s8 = ((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).s();
            e e03 = e0();
            e03.getClass();
            bundle.putString("_ev", v3.o(s8, Math.max(Math.max(Math.min(e03.r(str2, x.f23196i0), 500), 100), 256), true));
            return;
        }
        a().f22907k.c(o3, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", o3);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.d3) c3Var.f5041b).q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r20 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z5, int i5, Throwable th2, byte[] bArr, String str, List list) {
        byte[] bArr2;
        k2 k2Var;
        int i10 = i5;
        r0 r0Var = this.f22988b;
        b().j();
        l0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th3) {
                this.f23005u = false;
                O();
                throw th3;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList<Long> arrayList = this.f23009y;
        g6.v.h(arrayList);
        this.f23009y = null;
        try {
            if (z5) {
                if (i10 != 200) {
                    if (i10 == 204) {
                        i10 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    a().f22907k.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th2, str2.substring(0, Math.min(32, str2.length())));
                    io.sentry.android.core.s sVar = this.f22995i.f22648i;
                    f().getClass();
                    sVar.b(System.currentTimeMillis());
                    if (i10 == 503 || i10 == 429) {
                        io.sentry.android.core.s sVar2 = this.f22995i.f22646g;
                        f().getClass();
                        sVar2.b(System.currentTimeMillis());
                    }
                    j jVar = this.f22989c;
                    U(jVar);
                    jVar.u(arrayList);
                    N();
                    this.f23005u = false;
                    O();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                k2Var = k2.SGTM_CLIENT;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) pair.first;
                m3 m3Var = (m3) pair.second;
                k2 k2Var2 = m3Var.f22888c;
                k2 k2Var3 = m3Var.f22888c;
                if (k2Var2 != k2Var) {
                    j jVar2 = this.f22989c;
                    U(jVar2);
                    String str3 = m3Var.f22886a;
                    Map map = m3Var.f22887b;
                    if (map == null) {
                        map = Collections.EMPTY_MAP;
                    }
                    long n9 = jVar2.n(str, g3Var, str3, map, k2Var3, null);
                    if (k2Var3 == k2.GOOGLE_SIGNAL_PENDING && n9 != -1 && !g3Var.t().isEmpty()) {
                        hashMap.put(g3Var.t(), Long.valueOf(n9));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                com.google.android.gms.internal.measurement.g3 g3Var2 = (com.google.android.gms.internal.measurement.g3) pair2.first;
                m3 m3Var2 = (m3) pair2.second;
                if (m3Var2.f22888c == k2Var) {
                    Long l6 = (Long) hashMap.get(g3Var2.t());
                    j jVar3 = this.f22989c;
                    U(jVar3);
                    k2 k2Var4 = k2Var;
                    String str4 = m3Var2.f22886a;
                    Map map2 = m3Var2.f22887b;
                    if (map2 == null) {
                        map2 = Collections.EMPTY_MAP;
                    }
                    jVar3.n(str, g3Var2, str4, map2, m3Var2.f22888c, l6);
                    k2Var = k2Var4;
                }
            }
            j jVar4 = this.f22989c;
            U(jVar4);
            List o3 = jVar4.o(str, zzoo.c(k2Var), 1);
            if (!o3.isEmpty()) {
                long j = ((s3) o3.get(0)).f23067f;
                f().getClass();
                if (System.currentTimeMillis() > ((Long) x.F.a(null)).longValue() + j) {
                    a().f22906i.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                }
            }
            for (Long l10 : arrayList) {
                try {
                    j jVar5 = this.f22989c;
                    U(jVar5);
                    jVar5.s(l10.longValue());
                } catch (SQLiteException e7) {
                    ArrayList arrayList2 = this.f23010z;
                    if (arrayList2 == null || !arrayList2.contains(l10)) {
                        throw e7;
                    }
                }
            }
            j jVar6 = this.f22989c;
            U(jVar6);
            jVar6.W();
            j jVar7 = this.f22989c;
            U(jVar7);
            jVar7.X();
            this.f23010z = null;
            U(r0Var);
            if (r0Var.D()) {
                j jVar8 = this.f22989c;
                U(jVar8);
                if (jVar8.p(str)) {
                    t(str);
                    this.f23000o = 0L;
                    this.f23005u = false;
                    O();
                    return;
                }
            }
            U(r0Var);
            if (r0Var.D() && L()) {
                q();
            } else {
                this.A = -1L;
                N();
            }
            this.f23000o = 0L;
            this.f23005u = false;
            O();
            return;
        } catch (Throwable th4) {
            j jVar9 = this.f22989c;
            U(jVar9);
            jVar9.X();
            throw th4;
        }
        l0 l0Var = a().f22910n;
        Integer valueOf = Integer.valueOf(i10);
        l0Var.c(valueOf, Boolean.valueOf(z5), "Network upload successful with code, uploadAttempted");
        if (z5) {
            try {
                io.sentry.android.core.s sVar3 = this.f22995i.f22647h;
                f().getClass();
                sVar3.b(System.currentTimeMillis());
            } catch (SQLiteException e9) {
                a().f22903f.b(e9, "Database error while trying to delete uploaded bundles");
                f().getClass();
                this.f23000o = SystemClock.elapsedRealtime();
                a().f22910n.b(Long.valueOf(this.f23000o), "Disable upload, time");
            }
        }
        this.f22995i.f22648i.b(0L);
        N();
        if (z5) {
            a().f22910n.c(valueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
        } else {
            a().f22910n.a("Purged empty bundles");
        }
        j jVar10 = this.f22989c;
        U(jVar10);
        jVar10.V();
    }

    public final void z(s0 s0Var) {
        s.e eVar;
        s.e eVar2;
        b().j();
        if (TextUtils.isEmpty(s0Var.G())) {
            String D = s0Var.D();
            g6.v.h(D);
            A(D, 204, null, null, null);
            return;
        }
        String D2 = s0Var.D();
        g6.v.h(D2);
        a().f22910n.b(D2, "Fetching remote configuration");
        z0 z0Var = this.f22987a;
        U(z0Var);
        com.google.android.gms.internal.measurement.e2 v5 = z0Var.v(D2);
        U(z0Var);
        z0Var.j();
        String str = (String) z0Var.f23272m.get(D2);
        if (v5 != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new s.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            U(z0Var);
            z0Var.j();
            String str2 = (String) z0Var.f23273n.get(D2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new s.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.f23004t = true;
        r0 r0Var = this.f22988b;
        U(r0Var);
        o3 o3Var = new o3(this);
        f1 f1Var = (f1) r0Var.f3328a;
        r0Var.j();
        r0Var.k();
        n3 n3Var = r0Var.f22859b.j;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) x.f23186f.a(null)).encodedAuthority((String) x.f23189g.a(null)).path("config/app/".concat(String.valueOf(s0Var.G()))).appendQueryParameter("platform", ConstantDeviceInfo.APP_PLATFORM);
        ((f1) n3Var.f3328a).f22743d.o();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", CommonUrlParts.Values.FALSE_INTEGER);
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.v(new q0(r0Var, s0Var.D(), url, (byte[]) null, eVar, o3Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(s0Var.D()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }
}
