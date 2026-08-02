package com.google.android.gms.measurement.internal;

import ai.verisoul.sdk.helpers.session.SessionData;
import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
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
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.react.modules.dialog.AlertFragment;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgx;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzjr;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kotlin.time.DurationKt;
import z.C6900a;

/* loaded from: classes2.dex */
public final class S6 implements Q3 {

    /* renamed from: K, reason: collision with root package name */
    public static volatile S6 f33624K;

    /* renamed from: A, reason: collision with root package name */
    public long f33625A;

    /* renamed from: B, reason: collision with root package name */
    public final Map f33626B;

    /* renamed from: C, reason: collision with root package name */
    public final Map f33627C;

    /* renamed from: D, reason: collision with root package name */
    public final Map f33628D;

    /* renamed from: F, reason: collision with root package name */
    public C3268h5 f33630F;

    /* renamed from: G, reason: collision with root package name */
    public String f33631G;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC3381w f33632H;

    /* renamed from: I, reason: collision with root package name */
    public long f33633I;

    /* renamed from: a, reason: collision with root package name */
    public final Y2 f33635a;

    /* renamed from: b, reason: collision with root package name */
    public final C2 f33636b;

    /* renamed from: c, reason: collision with root package name */
    public C3357t f33637c;

    /* renamed from: d, reason: collision with root package name */
    public F2 f33638d;

    /* renamed from: e, reason: collision with root package name */
    public C3404y6 f33639e;

    /* renamed from: f, reason: collision with root package name */
    public C3238e f33640f;

    /* renamed from: g, reason: collision with root package name */
    public final X6 f33641g;

    /* renamed from: h, reason: collision with root package name */
    public C3228c5 f33642h;

    /* renamed from: i, reason: collision with root package name */
    public C3221b6 f33643i;

    /* renamed from: j, reason: collision with root package name */
    public final F6 f33644j;

    /* renamed from: k, reason: collision with root package name */
    public O2 f33645k;

    /* renamed from: l, reason: collision with root package name */
    public final C3298l3 f33646l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33648n;

    /* renamed from: o, reason: collision with root package name */
    public long f33649o;

    /* renamed from: p, reason: collision with root package name */
    public List f33650p;

    /* renamed from: r, reason: collision with root package name */
    public int f33652r;

    /* renamed from: s, reason: collision with root package name */
    public int f33653s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33654t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33655u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33656v;

    /* renamed from: w, reason: collision with root package name */
    public FileLock f33657w;

    /* renamed from: x, reason: collision with root package name */
    public FileChannel f33658x;

    /* renamed from: y, reason: collision with root package name */
    public List f33659y;

    /* renamed from: z, reason: collision with root package name */
    public List f33660z;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f33647m = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final Deque f33651q = new LinkedList();

    /* renamed from: E, reason: collision with root package name */
    public final Map f33629E = new HashMap();

    /* renamed from: J, reason: collision with root package name */
    public final a7 f33634J = new N6(this);

    public S6(T6 t62, C3298l3 c3298l3) {
        AbstractC3191o.m(t62);
        this.f33646l = C3298l3.O(t62.f33672a, null, null);
        this.f33625A = -1L;
        this.f33644j = new F6(this);
        X6 x62 = new X6(this);
        x62.k();
        this.f33641g = x62;
        C2 c22 = new C2(this);
        c22.k();
        this.f33636b = c22;
        Y2 y22 = new Y2(this);
        y22.k();
        this.f33635a = y22;
        this.f33626B = new HashMap();
        this.f33627C = new HashMap();
        this.f33628D = new HashMap();
        b().t(new G6(this, t62));
    }

    public static S6 F(Context context) {
        AbstractC3191o.m(context);
        AbstractC3191o.m(context.getApplicationContext());
        if (f33624K == null) {
            synchronized (S6.class) {
                try {
                    if (f33624K == null) {
                        f33624K = new S6((T6) AbstractC3191o.m(new T6(context)), null);
                    }
                } finally {
                }
            }
        }
        return f33624K;
    }

    public static final void G(zzhr zzhrVar, int i10, String str) {
        List zza = zzhrVar.zza();
        for (int i11 = 0; i11 < zza.size(); i11++) {
            if ("_err".equals(((zzhw) zza.get(i11)).zzb())) {
                return;
            }
        }
        zzhv zzn = zzhw.zzn();
        zzn.zzb("_err");
        zzn.zzf(i10);
        zzhw zzhwVar = (zzhw) zzn.zzbc();
        zzhv zzn2 = zzhw.zzn();
        zzn2.zzb("_ev");
        zzn2.zzd(str);
        zzhw zzhwVar2 = (zzhw) zzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    public static final void H(zzhr zzhrVar, String str) {
        List zza = zzhrVar.zza();
        for (int i10 = 0; i10 < zza.size(); i10++) {
            if (str.equals(((zzhw) zza.get(i10)).zzb())) {
                zzhrVar.zzj(i10);
                return;
            }
        }
    }

    public static String Q(Map map, String str) {
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

    public static void W(Context context, Intent intent) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle);
    }

    public static final boolean X(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.f34463b);
    }

    public static final D6 Y(D6 d62) {
        if (d62 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (d62.i()) {
            return d62;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d62.getClass())));
    }

    public static final Boolean Z(zzr zzrVar) {
        Boolean bool = zzrVar.f34477p;
        String str = zzrVar.f34459C;
        if (!TextUtils.isEmpty(str)) {
            S3 a10 = C3208a1.c(str).a();
            S3 s32 = S3.UNINITIALIZED;
            int ordinal = a10.ordinal();
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r21 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(boolean z10, int i10, Throwable th2, byte[] bArr, String str, List list) {
        byte[] bArr2;
        int i11 = i10;
        b().h();
        O0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th3) {
                this.f33655u = false;
                S();
                throw th3;
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) AbstractC3191o.m(this.f33659y);
        this.f33659y = null;
        try {
            if (z10) {
                if (i11 != 200) {
                    if (i11 == 204) {
                        i11 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    a().t().d("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th2, str2.substring(0, Math.min(32, str2.length())));
                    this.f33643i.f33940i.b(e().a());
                    if (i11 == 503 || i11 == 429) {
                        this.f33643i.f33938g.b(e().a());
                    }
                    F0().v(list2);
                    R();
                    this.f33655u = false;
                    S();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                zzib zzibVar = (zzib) pair.first;
                E6 e62 = (E6) pair.second;
                if (e62.c() != EnumC3252f5.SGTM_CLIENT) {
                    long m10 = F0().m(str, zzibVar, e62.a(), e62.b(), e62.c(), null);
                    if (e62.c() == EnumC3252f5.GOOGLE_SIGNAL_PENDING && m10 != -1 && !zzibVar.zze().isEmpty()) {
                        hashMap.put(zzibVar.zze(), Long.valueOf(m10));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                zzib zzibVar2 = (zzib) pair2.first;
                E6 e63 = (E6) pair2.second;
                if (e63.c() == EnumC3252f5.SGTM_CLIENT) {
                    F0().m(str, zzibVar2, e63.a(), e63.b(), e63.c(), (Long) hashMap.get(zzibVar2.zze()));
                }
            }
            List o10 = F0().o(str, zzoo.g(EnumC3252f5.SGTM_CLIENT), 1);
            if (!o10.isEmpty()) {
                long g10 = ((V6) o10.get(0)).g();
                if (e().a() > ((Long) AbstractC3209a2.f33810F.b(null)).longValue() + g10) {
                    a().r().c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(g10));
                }
            }
            for (Long l10 : list2) {
                try {
                    F0().t(l10.longValue());
                } catch (SQLiteException e10) {
                    List list3 = this.f33660z;
                    if (list3 == null || !list3.contains(l10)) {
                        throw e10;
                    }
                }
            }
            F0().s0();
            F0().t0();
            this.f33660z = null;
            if (E0().m() && F0().p(str)) {
                u(str);
            } else if (E0().m() && P()) {
                r();
            } else {
                this.f33625A = -1L;
                R();
            }
            this.f33649o = 0L;
            this.f33655u = false;
            S();
            return;
        } catch (Throwable th4) {
            F0().t0();
            throw th4;
        }
        C3376v2 w10 = a().w();
        Integer valueOf = Integer.valueOf(i11);
        w10.c("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z10));
        if (z10) {
            try {
                this.f33643i.f33939h.b(e().a());
            } catch (SQLiteException e11) {
                a().o().b("Database error while trying to delete uploaded bundles", e11);
                this.f33649o = e().b();
                a().w().b("Disable upload, time", Long.valueOf(this.f33649o));
            }
        }
        this.f33643i.f33940i.b(0L);
        R();
        if (z10) {
            a().w().c("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            a().w().a("Purged empty bundles");
        }
        F0().r0();
    }

    public final void A0() {
        b().h();
        F0().u();
        C3357t F02 = F0();
        F02.h();
        F02.j();
        if (F02.a0()) {
            Z1 z12 = AbstractC3209a2.f33909w0;
            if (((Long) z12.b(null)).longValue() != 0) {
                SQLiteDatabase u02 = F02.u0();
                C3298l3 c3298l3 = F02.f33578a;
                int delete = u02.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(c3298l3.e().a()), String.valueOf(z12.b(null))});
                if (delete > 0) {
                    c3298l3.a().w().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.f33643i.f33939h.a() == 0) {
            this.f33643i.f33939h.b(e().a());
        }
        R();
    }

    public final void B(D2 d22) {
        b().h();
        if (TextUtils.isEmpty(d22.r0())) {
            C((String) AbstractC3191o.m(d22.o0()), 204, null, null, null);
            return;
        }
        String str = (String) AbstractC3191o.m(d22.o0());
        a().w().b("Fetching remote configuration", str);
        zzgl w10 = D0().w(str);
        String y10 = D0().y(str);
        C6900a c6900a = null;
        if (w10 != null) {
            if (!TextUtils.isEmpty(y10)) {
                c6900a = new C6900a();
                c6900a.put("If-Modified-Since", y10);
            }
            String z10 = D0().z(str);
            if (!TextUtils.isEmpty(z10)) {
                if (c6900a == null) {
                    c6900a = new C6900a();
                }
                c6900a.put("If-None-Match", z10);
            }
        }
        this.f33654t = true;
        E0().o(d22, c6900a, new InterfaceC3408z2() { // from class: com.google.android.gms.measurement.internal.R6
            @Override // com.google.android.gms.measurement.internal.InterfaceC3408z2
            public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr, Map map) {
                S6.this.C(str2, i10, th2, bArr, map);
            }
        });
    }

    public final C3286k B0() {
        return ((C3298l3) AbstractC3191o.m(this.f33646l)).w();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        boolean z10;
        b().h();
        O0();
        AbstractC3191o.g(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.f33654t = false;
                S();
                throw th3;
            }
        }
        C3376v2 w10 = a().w();
        Integer valueOf = Integer.valueOf(bArr.length);
        w10.b("onConfigFetched. Response size", valueOf);
        F0().r0();
        try {
            D2 J02 = F0().J0(str);
            if (i10 != 200 && i10 != 204) {
                if (i10 == 304) {
                    i10 = 304;
                }
                z10 = false;
                if (J02 == null) {
                    a().r().b("App does not exist in onConfigFetched. appId", C3392x2.x(str));
                } else {
                    if (!z10 && i10 != 404) {
                        J02.k(e().a());
                        F0().K0(J02, false, false);
                        a().w().c("Fetching config failed. code, error", Integer.valueOf(i10), th2);
                        D0().A(str);
                        this.f33643i.f33940i.b(e().a());
                        if (i10 == 503 || i10 == 429) {
                            this.f33643i.f33938g.b(e().a());
                        }
                        R();
                    }
                    String Q10 = Q(map, "Last-Modified");
                    String Q11 = Q(map, "ETag");
                    if (i10 != 404 && i10 != 304) {
                        D0().C(str, bArr, Q10, Q11);
                        J02.i(e().a());
                        F0().K0(J02, false, false);
                        if (i10 != 404) {
                            a().t().b("Config not found. Using empty config. appId", str);
                        } else {
                            a().w().c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), valueOf);
                        }
                        if (!E0().m() && P()) {
                            r();
                        } else if (E0().m() || !F0().p(J02.o0())) {
                            R();
                        } else {
                            u(J02.o0());
                        }
                    }
                    if (D0().w(str) == null) {
                        D0().C(str, null, null, null);
                    }
                    J02.i(e().a());
                    F0().K0(J02, false, false);
                    if (i10 != 404) {
                    }
                    if (!E0().m()) {
                    }
                    if (E0().m()) {
                    }
                    R();
                }
                F0().s0();
                F0().t0();
                this.f33654t = false;
                S();
            }
            if (th2 == null) {
                z10 = true;
                if (J02 == null) {
                }
                F0().s0();
                F0().t0();
                this.f33654t = false;
                S();
            }
            z10 = false;
            if (J02 == null) {
            }
            F0().s0();
            F0().t0();
            this.f33654t = false;
            S();
        } catch (Throwable th4) {
            F0().t0();
            throw th4;
        }
    }

    public final F6 C0() {
        return this.f33644j;
    }

    public final void D(Runnable runnable) {
        b().h();
        if (this.f33650p == null) {
            this.f33650p = new ArrayList();
        }
        this.f33650p.add(runnable);
    }

    public final Y2 D0() {
        Y2 y22 = this.f33635a;
        Y(y22);
        return y22;
    }

    public final void E() {
        b().h();
        O0();
        if (this.f33648n) {
            return;
        }
        this.f33648n = true;
        if (a0()) {
            FileChannel fileChannel = this.f33658x;
            b().h();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                a().o().a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i10 = allocate.getInt();
                    } else if (read != -1) {
                        a().r().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e10) {
                    a().o().b("Failed to read from channel", e10);
                }
            }
            int t10 = this.f33646l.L().t();
            b().h();
            if (i10 > t10) {
                a().o().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t10));
                return;
            }
            if (i10 < t10) {
                FileChannel fileChannel2 = this.f33658x;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    a().o().a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(t10);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            a().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        a().w().c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t10));
                        return;
                    } catch (IOException e11) {
                        a().o().b("Failed to write to channel", e11);
                    }
                }
                a().o().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t10));
            }
        }
    }

    public final C2 E0() {
        C2 c22 = this.f33636b;
        Y(c22);
        return c22;
    }

    public final C3357t F0() {
        C3357t c3357t = this.f33637c;
        Y(c3357t);
        return c3357t;
    }

    public final F2 G0() {
        F2 f22 = this.f33638d;
        if (f22 != null) {
            return f22;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final C3404y6 H0() {
        C3404y6 c3404y6 = this.f33639e;
        Y(c3404y6);
        return c3404y6;
    }

    public final int I(String str, C3302m c3302m) {
        U3 u32;
        S3 m10;
        Y2 y22 = this.f33635a;
        if (y22.R(str) == null) {
            c3302m.c(U3.AD_PERSONALIZATION, EnumC3294l.FAILSAFE);
            return 1;
        }
        D2 J02 = F0().J0(str);
        if (J02 != null && C3208a1.c(J02.I()).a() == S3.POLICY && (m10 = y22.m(str, (u32 = U3.AD_PERSONALIZATION))) != S3.UNINITIALIZED) {
            c3302m.c(u32, EnumC3294l.REMOTE_ENFORCED_DEFAULT);
            return m10 == S3.GRANTED ? 0 : 1;
        }
        U3 u33 = U3.AD_PERSONALIZATION;
        c3302m.c(u33, EnumC3294l.REMOTE_DEFAULT);
        return y22.P(str, u33) ? 0 : 1;
    }

    public final C3238e I0() {
        C3238e c3238e = this.f33640f;
        Y(c3238e);
        return c3238e;
    }

    public final Map J(zzhs zzhsVar) {
        HashMap hashMap = new HashMap();
        K0();
        for (Map.Entry entry : X6.t(zzhsVar, "gad_").entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final C3228c5 J0() {
        C3228c5 c3228c5 = this.f33642h;
        Y(c3228c5);
        return c3228c5;
    }

    public final AbstractC3381w K() {
        if (this.f33632H == null) {
            this.f33632H = new J6(this, this.f33646l);
        }
        return this.f33632H;
    }

    public final X6 K0() {
        X6 x62 = this.f33641g;
        Y(x62);
        return x62;
    }

    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void v0() {
        b().h();
        if (this.f33651q.isEmpty() || K().c()) {
            return;
        }
        long max = Math.max(0L, ((Integer) AbstractC3209a2.f33805C0.b(null)).intValue() - (e().b() - this.f33633I));
        a().w().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        K().b(max);
    }

    public final C3221b6 L0() {
        return this.f33643i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean M(java.lang.String r44, long r45) {
        /*
            Method dump skipped, instructions count: 3599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.S6.M(java.lang.String, long):boolean");
    }

    public final C3337q2 M0() {
        return this.f33646l.D();
    }

    public final void N(zzic zzicVar, long j10, boolean z10) {
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        Z6 B02 = F0().B0(zzicVar.zzK(), str);
        Z6 z62 = (B02 == null || (obj = B02.f33794e) == null) ? new Z6(zzicVar.zzK(), "auto", str, e().a(), Long.valueOf(j10)) : new Z6(zzicVar.zzK(), "auto", str, e().a(), Long.valueOf(((Long) obj).longValue() + j10));
        zzit zzm = zziu.zzm();
        zzm.zzb(str);
        zzm.zza(e().a());
        Object obj2 = z62.f33794e;
        zzm.zze(((Long) obj2).longValue());
        zziu zziuVar = (zziu) zzm.zzbc();
        int X10 = X6.X(zzicVar, str);
        if (X10 >= 0) {
            zzicVar.zzn(X10, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j10 > 0) {
            F0().A0(z62);
            a().w().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final b7 N0() {
        return ((C3298l3) AbstractC3191o.m(this.f33646l)).C();
    }

    public final boolean O(zzhr zzhrVar, zzhr zzhrVar2) {
        AbstractC3191o.a("_e".equals(zzhrVar.zzk()));
        K0();
        zzhw r10 = X6.r((zzhs) zzhrVar.zzbc(), "_sc");
        String zzd = r10 == null ? null : r10.zzd();
        K0();
        zzhw r11 = X6.r((zzhs) zzhrVar2.zzbc(), "_pc");
        String zzd2 = r11 != null ? r11.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        AbstractC3191o.a("_e".equals(zzhrVar.zzk()));
        K0();
        zzhw r12 = X6.r((zzhs) zzhrVar.zzbc(), "_et");
        if (r12 == null || !r12.zze() || r12.zzf() <= 0) {
            return true;
        }
        long zzf = r12.zzf();
        K0();
        zzhw r13 = X6.r((zzhs) zzhrVar2.zzbc(), "_et");
        if (r13 != null && r13.zzf() > 0) {
            zzf += r13.zzf();
        }
        K0();
        X6.o(zzhrVar2, "_et", Long.valueOf(zzf));
        K0();
        X6.o(zzhrVar, "_fr", 1L);
        return true;
    }

    public final void O0() {
        if (!this.f33647m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final boolean P() {
        b().h();
        O0();
        return F0().B() || !TextUtils.isEmpty(F0().r());
    }

    public final void P0(zzr zzrVar) {
        b().h();
        O0();
        String str = zzrVar.f34462a;
        AbstractC3191o.g(str);
        V3 f10 = V3.f(zzrVar.f34480s, zzrVar.f34485x);
        g(str);
        a().w().c("Setting storage consent for package", str, f10);
        f(str, f10);
    }

    public final void Q0(zzr zzrVar) {
        b().h();
        O0();
        String str = zzrVar.f34462a;
        AbstractC3191o.g(str);
        C3389x g10 = C3389x.g(zzrVar.f34486y);
        a().w().c("Setting DMA consent for package", str, g10);
        b().h();
        O0();
        S3 c10 = C3389x.h(S0(str), 100).c();
        this.f33627C.put(str, g10);
        F0().V(str, g10);
        S3 c11 = C3389x.h(S0(str), 100).c();
        b().h();
        O0();
        S3 s32 = S3.DENIED;
        boolean z10 = c10 == s32 && c11 == S3.GRANTED;
        boolean z11 = c10 == S3.GRANTED && c11 == s32;
        if (z10 || z11) {
            a().w().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (F0().L0(h(), str, false, false, false, false, false, false, false).f34211f < B0().E(str, AbstractC3209a2.f33891n0)) {
                bundle.putLong("_r", 1L);
                a().w().c("_dcu realtime event count", str, Long.valueOf(F0().L0(h(), str, false, false, false, false, false, true, false).f34211f));
            }
            this.f33634J.a(str, "_dcu", bundle);
        }
    }

    public final void R() {
        long max;
        long j10;
        b().h();
        O0();
        if (this.f33649o > 0) {
            long abs = 3600000 - Math.abs(e().b() - this.f33649o);
            if (abs > 0) {
                a().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                G0().b();
                H0().n();
                return;
            }
            this.f33649o = 0L;
        }
        if (!this.f33646l.m() || !P()) {
            a().w().a("Nothing to upload or uploading impossible");
            G0().b();
            H0().n();
            return;
        }
        long a10 = e().a();
        B0();
        long max2 = Math.max(0L, ((Long) AbstractC3209a2.f33830P.b(null)).longValue());
        boolean z10 = true;
        if (!F0().D() && !F0().s()) {
            z10 = false;
        }
        if (z10) {
            String i10 = B0().i();
            if (TextUtils.isEmpty(i10) || ".none.".equals(i10)) {
                B0();
                max = Math.max(0L, ((Long) AbstractC3209a2.f33818J.b(null)).longValue());
            } else {
                B0();
                max = Math.max(0L, ((Long) AbstractC3209a2.f33820K.b(null)).longValue());
            }
        } else {
            B0();
            max = Math.max(0L, ((Long) AbstractC3209a2.f33816I.b(null)).longValue());
        }
        long a11 = this.f33643i.f33939h.a();
        long a12 = this.f33643i.f33940i.a();
        long j11 = 0;
        boolean z11 = z10;
        long max3 = Math.max(F0().y(), F0().A());
        if (max3 == 0) {
            j10 = 0;
        } else {
            long abs2 = a10 - Math.abs(max3 - a10);
            long abs3 = a10 - Math.abs(a11 - a10);
            long abs4 = a10 - Math.abs(a12 - a10);
            j10 = max2 + abs2;
            long max4 = Math.max(abs3, abs4);
            if (z11 && max4 > 0) {
                j10 = Math.min(abs2, max4) + max;
            }
            if (!K0().S(max4, max)) {
                j10 = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i11 = 0;
                while (true) {
                    B0();
                    if (i11 >= Math.min(20, Math.max(0, ((Integer) AbstractC3209a2.f33834R.b(null)).intValue()))) {
                        j10 = 0;
                        break;
                    }
                    B0();
                    j10 += Math.max(j11, ((Long) AbstractC3209a2.f33832Q.b(null)).longValue()) * (1 << i11);
                    if (j10 > abs4) {
                        break;
                    }
                    i11++;
                    j11 = 0;
                }
            }
            j11 = 0;
        }
        if (j10 == j11) {
            a().w().a("Next upload time is 0");
            G0().b();
            H0().n();
            return;
        }
        if (!E0().m()) {
            a().w().a("No network");
            G0().a();
            H0().n();
            return;
        }
        long a13 = this.f33643i.f33938g.a();
        B0();
        long max5 = Math.max(0L, ((Long) AbstractC3209a2.f33812G.b(null)).longValue());
        if (!K0().S(a13, max5)) {
            j10 = Math.max(j10, a13 + max5);
        }
        G0().b();
        long a14 = j10 - e().a();
        if (a14 <= 0) {
            B0();
            a14 = Math.max(0L, ((Long) AbstractC3209a2.f33822L.b(null)).longValue());
            this.f33643i.f33939h.b(e().a());
        }
        a().w().b("Upload scheduled in approximately ms", Long.valueOf(a14));
        H0().m(a14);
    }

    public final C3389x R0(String str) {
        b().h();
        O0();
        Map map = this.f33627C;
        C3389x c3389x = (C3389x) map.get(str);
        if (c3389x != null) {
            return c3389x;
        }
        C3389x U10 = F0().U(str);
        map.put(str, U10);
        return U10;
    }

    public final void S() {
        b().h();
        if (this.f33654t || this.f33655u || this.f33656v) {
            a().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f33654t), Boolean.valueOf(this.f33655u), Boolean.valueOf(this.f33656v));
            return;
        }
        a().w().a("Stopping uploading service(s)");
        List list = this.f33650p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) AbstractC3191o.m(this.f33650p)).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle S0(String str) {
        b().h();
        O0();
        if (D0().R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        V3 g10 = g(str);
        bundle.putAll(g10.n());
        bundle.putAll(T0(str, R0(str), g10, new C3302m()).f());
        Z6 B02 = F0().B0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (B02 != null ? B02.f33794e.equals(1L) : I(str, new C3302m())) ? "granted" : "denied");
        return bundle;
    }

    public final Boolean T(D2 d22) {
        try {
            if (d22.F0() != -2147483648L) {
                if (d22.F0() == M9.e.a(this.f33646l.d()).e(d22.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = M9.e.a(this.f33646l.d()).e(d22.o0(), 0).versionName;
                String D02 = d22.D0();
                if (D02 != null && D02.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final C3389x T0(String str, C3389x c3389x, V3 v32, C3302m c3302m) {
        S3 s32;
        int i10 = 90;
        if (D0().R(str) == null) {
            if (c3389x.c() == S3.DENIED) {
                i10 = c3389x.b();
                c3302m.b(U3.AD_USER_DATA, i10);
            } else {
                c3302m.c(U3.AD_USER_DATA, EnumC3294l.FAILSAFE);
            }
            return new C3389x(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        S3 c10 = c3389x.c();
        S3 s33 = S3.GRANTED;
        if (c10 == s33 || c10 == (s32 = S3.DENIED)) {
            i10 = c3389x.b();
            c3302m.b(U3.AD_USER_DATA, i10);
        } else {
            if (c10 == S3.POLICY) {
                Y2 y22 = this.f33635a;
                U3 u32 = U3.AD_USER_DATA;
                S3 m10 = y22.m(str, u32);
                if (m10 != S3.UNINITIALIZED) {
                    c3302m.c(u32, EnumC3294l.REMOTE_ENFORCED_DEFAULT);
                    c10 = m10;
                }
            }
            Y2 y23 = this.f33635a;
            U3 u33 = U3.AD_USER_DATA;
            U3 Q10 = y23.Q(str, u33);
            S3 p10 = v32.p();
            boolean z10 = p10 == s33 || p10 == s32;
            if (Q10 == U3.AD_STORAGE && z10) {
                c3302m.c(u33, EnumC3294l.REMOTE_DELEGATION);
                c10 = p10;
            } else {
                c3302m.c(u33, EnumC3294l.REMOTE_DEFAULT);
                c10 = true != y23.P(str, u33) ? s32 : s33;
            }
        }
        boolean S10 = this.f33635a.S(str);
        SortedSet T10 = D0().T(str);
        if (c10 == S3.DENIED || T10.isEmpty()) {
            return new C3389x(Boolean.FALSE, i10, Boolean.valueOf(S10), "-");
        }
        return new C3389x(Boolean.TRUE, i10, Boolean.valueOf(S10), S10 ? TextUtils.join("", T10) : "");
    }

    public final zzr U(String str) {
        D2 J02 = F0().J0(str);
        if (J02 == null || TextUtils.isEmpty(J02.D0())) {
            a().v().b("No app data available; dropping", str);
            return null;
        }
        Boolean T10 = T(J02);
        if (T10 == null || T10.booleanValue()) {
            return new zzr(str, J02.r0(), J02.D0(), J02.F0(), J02.H0(), J02.J0(), J02.L0(), (String) null, J02.d(), false, J02.x0(), 0L, 0, J02.P(), false, J02.R(), J02.b(), J02.T(), g(str).l(), "", (String) null, J02.V(), J02.X(), g(str).b(), R0(str).e(), J02.b0(), J02.j0(), J02.l0(), J02.I(), 0L, J02.M());
        }
        a().o().b("App version does not match; dropping. appId", C3392x2.x(str));
        return null;
    }

    public final boolean V(String str, String str2) {
        B v02 = F0().v0(str, str2);
        return v02 == null || v02.f33285c < 1;
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final C3392x2 a() {
        return ((C3298l3) AbstractC3191o.m(this.f33646l)).a();
    }

    public final boolean a0() {
        b().h();
        FileLock fileLock = this.f33657w;
        if (fileLock != null && fileLock.isValid()) {
            a().w().a("Storage concurrent access okay");
            return true;
        }
        this.f33637c.f33578a.w();
        File filesDir = this.f33646l.d().getFilesDir();
        zzbv.zza();
        int i10 = zzca.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f33658x = channel;
            FileLock tryLock = channel.tryLock();
            this.f33657w = tryLock;
            if (tryLock != null) {
                a().w().a("Storage concurrent access okay");
                return true;
            }
            a().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            a().o().b("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            a().o().b("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            a().r().b("Storage lock already acquired", e12);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final C3234d3 b() {
        return ((C3298l3) AbstractC3191o.m(this.f33646l)).b();
    }

    public final void b0(zzr zzrVar) {
        if (this.f33659y != null) {
            ArrayList arrayList = new ArrayList();
            this.f33660z = arrayList;
            arrayList.addAll(this.f33659y);
        }
        C3357t F02 = F0();
        String str = (String) AbstractC3191o.m(zzrVar.f34462a);
        AbstractC3191o.g(str);
        F02.h();
        F02.j();
        try {
            SQLiteDatabase u02 = F02.u0();
            String[] strArr = {str};
            int delete = u02.delete("apps", "app_id=?", strArr) + u02.delete("events", "app_id=?", strArr) + u02.delete("events_snapshot", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("queue", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("main_event_params", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr) + u02.delete("upload_queue", "app_id=?", strArr);
            zzpo.zza();
            C3298l3 c3298l3 = F02.f33578a;
            if (c3298l3.w().H(null, AbstractC3209a2.f33878i1)) {
                delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (delete > 0) {
                c3298l3.a().w().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            F02.f33578a.a().o().c("Error resetting analytics data. appId, error", C3392x2.x(str), e10);
        }
        if (zzrVar.f34469h) {
            h0(zzrVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final C3246f c() {
        return this.f33646l.c();
    }

    public final void c0(zzpl zzplVar, zzr zzrVar) {
        Z6 B02;
        long j10;
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            b7 N02 = N0();
            String str = zzplVar.f34451b;
            int y02 = N02.y0(str);
            if (y02 != 0) {
                b7 N03 = N0();
                B0();
                N0().B(this.f33634J, zzrVar.f34462a, y02, "_ev", N03.q(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int y10 = N0().y(str, zzplVar.g());
            if (y10 != 0) {
                b7 N04 = N0();
                B0();
                String q10 = N04.q(str, 24, true);
                Object g10 = zzplVar.g();
                if (g10 != null && ((g10 instanceof String) || (g10 instanceof CharSequence))) {
                    r13 = g10.toString().length();
                }
                N0().B(this.f33634J, zzrVar.f34462a, y10, "_ev", q10, r13);
                return;
            }
            Object z10 = N0().z(str, zzplVar.g());
            if (z10 != null) {
                if ("_sid".equals(str)) {
                    long j11 = zzplVar.f34452c;
                    String str2 = zzplVar.f34455f;
                    String str3 = (String) AbstractC3191o.m(zzrVar.f34462a);
                    Z6 B03 = F0().B0(str3, "_sno");
                    if (B03 != null) {
                        Object obj = B03.f33794e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            c0(new zzpl("_sno", j11, Long.valueOf(j10 + 1), str2), zzrVar);
                        }
                    }
                    if (B03 != null) {
                        a().r().b("Retrieved last session number from database does not contain a valid (long) value", B03.f33794e);
                    }
                    B v02 = F0().v0(str3, "_s");
                    if (v02 != null) {
                        C3376v2 w10 = a().w();
                        long j12 = v02.f33285c;
                        w10.b("Backfill the session number. Last used session number", Long.valueOf(j12));
                        j10 = j12;
                    } else {
                        j10 = 0;
                    }
                    c0(new zzpl("_sno", j11, Long.valueOf(j10 + 1), str2), zzrVar);
                }
                String str4 = zzrVar.f34462a;
                Z6 z62 = new Z6((String) AbstractC3191o.m(str4), (String) AbstractC3191o.m(zzplVar.f34455f), str, zzplVar.f34452c, z10);
                C3376v2 w11 = a().w();
                C3298l3 c3298l3 = this.f33646l;
                String str5 = z62.f33792c;
                w11.c("Setting user property", c3298l3.D().c(str5), z10);
                F0().r0();
                try {
                    if ("_id".equals(str5) && (B02 = F0().B0(str4, "_id")) != null && !z62.f33794e.equals(B02.f33794e)) {
                        F0().z0(str4, "_lair");
                    }
                    o0(zzrVar);
                    boolean A02 = F0().A0(z62);
                    if ("_sid".equals(str)) {
                        long U10 = K0().U(zzrVar.f34482u);
                        D2 J02 = F0().J0(str4);
                        if (J02 != null) {
                            J02.a0(U10);
                            if (J02.A()) {
                                F0().K0(J02, false, false);
                            }
                        }
                    }
                    F0().s0();
                    if (!A02) {
                        a().o().c("Too many unique user properties are set. Ignoring user property", c3298l3.D().c(str5), z62.f33794e);
                        N0().B(this.f33634J, str4, 9, null, null, 0);
                    }
                    F0().t0();
                } catch (Throwable th2) {
                    F0().t0();
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final Context d() {
        return this.f33646l.d();
    }

    public final void d0(String str, zzr zzrVar) {
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            Boolean Z10 = Z(zzrVar);
            if ("_npa".equals(str) && Z10 != null) {
                a().v().a("Falling back to manifest metadata value for ad personalization");
                c0(new zzpl("_npa", e().a(), Long.valueOf(true != Z10.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            C3376v2 v10 = a().v();
            C3298l3 c3298l3 = this.f33646l;
            v10.b("Removing user property", c3298l3.D().c(str));
            F0().r0();
            try {
                o0(zzrVar);
                if ("_id".equals(str)) {
                    F0().z0((String) AbstractC3191o.m(zzrVar.f34462a), "_lair");
                }
                F0().z0((String) AbstractC3191o.m(zzrVar.f34462a), str);
                F0().s0();
                a().v().b("User property removed", c3298l3.D().c(str));
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final K9.e e() {
        return ((C3298l3) AbstractC3191o.m(this.f33646l)).e();
    }

    public final void e0() {
        this.f33652r++;
    }

    public final void f(String str, V3 v32) {
        b().h();
        O0();
        this.f33626B.put(str, v32);
        F0().L(str, v32);
    }

    public final void f0() {
        this.f33653s++;
    }

    public final V3 g(String str) {
        V3 v32 = V3.f33699c;
        b().h();
        O0();
        V3 v33 = (V3) this.f33626B.get(str);
        if (v33 == null) {
            v33 = F0().J(str);
            if (v33 == null) {
                v33 = V3.f33699c;
            }
            f(str, v33);
        }
        return v33;
    }

    public final C3298l3 g0() {
        return this.f33646l;
    }

    public final long h() {
        long a10 = e().a();
        C3221b6 c3221b6 = this.f33643i;
        c3221b6.j();
        c3221b6.h();
        I2 i22 = c3221b6.f33941j;
        long a11 = i22.a();
        if (a11 == 0) {
            a11 = c3221b6.f33578a.C().q0().nextInt(SessionData.EXPIRATION_TIME) + 1;
            i22.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c0, code lost:
    
        if (true == r12.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c2, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c7, code lost:
    
        r15 = new com.google.android.gms.measurement.internal.zzpl("_npa", r17, java.lang.Long.valueOf(r23), "auto");
        r24 = 1;
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00da, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00e4, code lost:
    
        if (r11.f33794e.equals(r15.f34453d) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e6, code lost:
    
        c0(r15, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c5, code lost:
    
        r23 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x040b A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011a A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0106 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x0161, B:46:0x016b, B:48:0x017a, B:49:0x0256, B:51:0x0282, B:52:0x0285, B:54:0x02ad, B:58:0x0370, B:59:0x0373, B:61:0x0380, B:62:0x038d, B:63:0x042b, B:68:0x02c2, B:70:0x02e5, B:72:0x02ed, B:74:0x02f3, B:78:0x0306, B:80:0x0316, B:83:0x0322, B:85:0x030f, B:88:0x032e, B:90:0x0353, B:92:0x0359, B:93:0x0361, B:95:0x0367, B:99:0x033f, B:102:0x02d1, B:103:0x018b, B:105:0x01b6, B:106:0x01c5, B:108:0x01cc, B:110:0x01d2, B:112:0x01dc, B:114:0x01e2, B:116:0x01e8, B:118:0x01ee, B:120:0x01f3, B:123:0x0213, B:128:0x0217, B:129:0x022b, B:130:0x0239, B:132:0x0247, B:133:0x03a4, B:135:0x03da, B:136:0x03dd, B:138:0x03ea, B:139:0x03f5, B:140:0x040b, B:142:0x0411, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(zzr zzrVar) {
        long j10;
        long j11;
        B v02;
        boolean z10;
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j12;
        boolean z11;
        b().h();
        O0();
        AbstractC3191o.m(zzrVar);
        String str2 = zzrVar.f34462a;
        AbstractC3191o.g(str2);
        if (X(zzrVar)) {
            D2 J02 = F0().J0(str2);
            if (J02 != null && TextUtils.isEmpty(J02.r0()) && !TextUtils.isEmpty(zzrVar.f34463b)) {
                J02.i(0L);
                F0().K0(J02, false, false);
                D0().B(str2);
            }
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            long j13 = zzrVar.f34473l;
            if (j13 == 0) {
                j13 = e().a();
            }
            long j14 = j13;
            int i10 = zzrVar.f34474m;
            if (i10 != 0 && i10 != 1) {
                a().r().c("Incorrect app type, assuming installed app. appId, appType", C3392x2.x(str2), Integer.valueOf(i10));
                i10 = 0;
            }
            F0().r0();
            try {
                Z6 B02 = F0().B0(str2, "_npa");
                Boolean Z10 = Z(zzrVar);
                if (B02 != null && !"auto".equals(B02.f33791b)) {
                    j10 = j14;
                    j11 = 1;
                    if (B0().H(null, AbstractC3209a2.f33860c1)) {
                        n0(zzrVar, j10);
                    } else {
                        n0(zzrVar, zzrVar.f34460D);
                    }
                    o0(zzrVar);
                    if (i10 != 0) {
                        v02 = F0().v0(str2, "_f");
                        z10 = false;
                    } else {
                        v02 = F0().v0(str2, "_v");
                        z10 = true;
                    }
                    if (v02 != null) {
                        long j15 = ((j10 / 3600000) + j11) * 3600000;
                        if (z10) {
                            long j16 = j10;
                            c0(new zzpl("_fvt", j16, Long.valueOf(j15), "auto"), zzrVar);
                            b().h();
                            O0();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (zzrVar.f34476o) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (B0().H(null, AbstractC3209a2.f33884k1)) {
                                bundle.putLong("_elt", e().a());
                            }
                            j(new zzbg("_v", new zzbe(bundle), "auto", j16), zzrVar);
                        } else {
                            Long valueOf = Long.valueOf(j15);
                            long j17 = j10;
                            c0(new zzpl("_fot", j17, valueOf, "auto"), zzrVar);
                            b().h();
                            O2 o22 = (O2) AbstractC3191o.m(this.f33645k);
                            if (str2 == null || str2.isEmpty()) {
                                str = "_elt";
                                o22.f33577a.a().s().a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                C3298l3 c3298l3 = o22.f33577a;
                                c3298l3.b().h();
                                if (o22.a()) {
                                    N2 n22 = new N2(o22, str2);
                                    c3298l3.b().h();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    str = "_elt";
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = c3298l3.d().getPackageManager();
                                    if (packageManager == null) {
                                        c3298l3.a().s().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            c3298l3.a().u().a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str3 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str3) && o22.a()) {
                                                    try {
                                                        c3298l3.a().w().b("Install Referrer Service is", J9.b.b().a(c3298l3.d(), new Intent(intent), n22, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e10) {
                                                        o22.f33577a.a().o().b("Exception occurred while binding to Install Referrer Service", e10.getMessage());
                                                    }
                                                } else {
                                                    c3298l3.a().r().a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c3298l3.a().u().a("Install Referrer Reporter is not available");
                                    str = "_elt";
                                }
                            }
                            b().h();
                            O0();
                            Bundle bundle2 = new Bundle();
                            long j18 = j11;
                            bundle2.putLong("_c", j18);
                            bundle2.putLong("_r", j18);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j18);
                            if (zzrVar.f34476o) {
                                bundle2.putLong("_dac", j18);
                            }
                            String str4 = (String) AbstractC3191o.m(zzrVar.f34462a);
                            C3357t F02 = F0();
                            AbstractC3191o.g(str4);
                            F02.h();
                            F02.j();
                            long z12 = F02.z(str4, "first_open_count");
                            C3298l3 c3298l32 = this.f33646l;
                            if (c3298l32.d().getPackageManager() == null) {
                                a().o().b("PackageManager is null, first open report might be inaccurate. appId", C3392x2.x(str4));
                            } else {
                                try {
                                    packageInfo = M9.e.a(c3298l32.d()).e(str4, 0);
                                } catch (PackageManager.NameNotFoundException e11) {
                                    a().o().c("Package info is null, first open report might be inaccurate. appId", C3392x2.x(str4), e11);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j19 = packageInfo.firstInstallTime;
                                    if (j19 != 0) {
                                        if (j19 != packageInfo.lastUpdateTime) {
                                            if (!B0().H(null, AbstractC3209a2.f33819J0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (z12 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z12 = 0;
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        c0(new zzpl("_fi", j17, Long.valueOf(true != z11 ? 0L : 1L), "auto"), zzrVar);
                                    }
                                }
                                try {
                                    applicationInfo = M9.e.a(this.f33646l.d()).c(str4, 0);
                                } catch (PackageManager.NameNotFoundException e12) {
                                    a().o().c("Application info is null, first open report might be inaccurate. appId", C3392x2.x(str4), e12);
                                    applicationInfo = null;
                                }
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        j12 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j12 = 1;
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j12);
                                    }
                                }
                            }
                            if (z12 >= 0) {
                                bundle2.putLong("_pfo", z12);
                            }
                            if (B0().H(null, AbstractC3209a2.f33884k1)) {
                                bundle2.putLong(str, e().a());
                            }
                            j(new zzbg("_f", new zzbe(bundle2), "auto", j17), zzrVar);
                        }
                    } else {
                        long j20 = j10;
                        if (zzrVar.f34470i) {
                            j(new zzbg("_cd", new zzbe(new Bundle()), "auto", j20), zzrVar);
                        }
                    }
                    F0().s0();
                    F0().t0();
                }
                j10 = j14;
                j11 = 1;
                if (B02 != null) {
                    d0("_npa", zzrVar);
                }
                if (B0().H(null, AbstractC3209a2.f33860c1)) {
                }
                o0(zzrVar);
                if (i10 != 0) {
                }
                if (v02 != null) {
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final void i(zzbg zzbgVar, String str) {
        D2 J02 = F0().J0(str);
        if (J02 == null || TextUtils.isEmpty(J02.D0())) {
            a().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean T10 = T(J02);
        if (T10 == null) {
            if (!"_ui".equals(zzbgVar.f34435a)) {
                a().r().b("Could not find package. appId", C3392x2.x(str));
            }
        } else if (!T10.booleanValue()) {
            a().o().b("App version does not match; dropping event. appId", C3392x2.x(str));
            return;
        }
        j(zzbgVar, new zzr(str, J02.r0(), J02.D0(), J02.F0(), J02.H0(), J02.J0(), J02.L0(), (String) null, J02.d(), false, J02.x0(), 0L, 0, J02.P(), false, J02.R(), J02.b(), J02.T(), g(str).l(), "", (String) null, J02.V(), J02.X(), g(str).b(), R0(str).e(), J02.b0(), J02.j0(), J02.l0(), J02.I(), 0L, J02.M()));
    }

    public final void i0(zzr zzrVar) {
        b().h();
        O0();
        AbstractC3191o.m(zzrVar);
        String str = zzrVar.f34462a;
        AbstractC3191o.g(str);
        int i10 = 0;
        if (B0().H(null, AbstractC3209a2.f33801A0)) {
            long a10 = e().a();
            int E10 = B0().E(null, AbstractC3209a2.f33880j0);
            B0();
            long n10 = a10 - C3286k.n();
            while (i10 < E10 && M(null, n10)) {
                i10++;
            }
        } else {
            B0();
            long p10 = C3286k.p();
            while (i10 < p10 && M(str, 0L)) {
                i10++;
            }
        }
        if (B0().H(null, AbstractC3209a2.f33803B0)) {
            b().h();
            v0();
        }
        if (this.f33644j.j(str, zzin.zzb(zzrVar.f34461E))) {
            a().w().b("[sgtm] Going background, trigger client side upload. appId", str);
            s(str, e().a());
        }
    }

    public final void j(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.f34462a;
        AbstractC3191o.g(str);
        C3400y2 a10 = C3400y2.a(zzbgVar);
        N0().w(a10.f34397d, F0().G(str));
        N0().u(a10, B0().w(str));
        zzbg b10 = a10.b();
        if (!B0().H(null, AbstractC3209a2.f33872g1) && "_cmp".equals(b10.f34435a)) {
            zzbe zzbeVar = b10.f34436b;
            if ("referrer API v2".equals(zzbeVar.j("_cis"))) {
                String j10 = zzbeVar.j("gclid");
                if (!TextUtils.isEmpty(j10)) {
                    c0(new zzpl("_lgclid", b10.f34438d, j10, "auto"), zzrVar);
                }
            }
        }
        k(b10, zzrVar);
    }

    public final void j0(zzah zzahVar) {
        zzr U10 = U((String) AbstractC3191o.m(zzahVar.f34422a));
        if (U10 != null) {
            k0(zzahVar, U10);
        }
    }

    public final void k(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> I02;
        List<zzah> I03;
        List<zzah> I04;
        String str;
        AbstractC3191o.m(zzrVar);
        String str2 = zzrVar.f34462a;
        AbstractC3191o.g(str2);
        b().h();
        O0();
        long j10 = zzbgVar.f34438d;
        C3400y2 a10 = C3400y2.a(zzbgVar);
        b().h();
        b7.k0((this.f33630F == null || (str = this.f33631G) == null || !str.equals(str2)) ? null : this.f33630F, a10.f34397d, false);
        zzbg b10 = a10.b();
        K0();
        if (X6.p(b10, zzrVar)) {
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            List list = zzrVar.f34479r;
            if (list != null) {
                String str3 = b10.f34435a;
                if (!list.contains(str3)) {
                    a().v().d("Dropping non-safelisted event. appId, event name, origin", str2, b10.f34435a, b10.f34437c);
                    return;
                } else {
                    Bundle l10 = b10.f34436b.l();
                    l10.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(l10), b10.f34437c, b10.f34438d);
                }
            } else {
                zzbgVar2 = b10;
            }
            F0().r0();
            try {
                String str4 = zzbgVar2.f34435a;
                if ("_s".equals(str4) && !F0().C(str2, "_s") && zzbgVar2.f34436b.h("_sid").longValue() != 0) {
                    if (!F0().C(str2, "_f") && !F0().C(str2, "_v")) {
                        F0().I(str2, Long.valueOf(e().a() - 15000), "_sid", l(str2, zzbgVar2));
                    }
                    F0().I(str2, null, "_sid", l(str2, zzbgVar2));
                }
                C3357t F02 = F0();
                AbstractC3191o.g(str2);
                F02.h();
                F02.j();
                if (j10 < 0) {
                    F02.f33578a.a().r().c("Invalid time querying timed out conditional properties", C3392x2.x(str2), Long.valueOf(j10));
                    I02 = Collections.EMPTY_LIST;
                } else {
                    I02 = F02.I0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (zzah zzahVar : I02) {
                    if (zzahVar != null) {
                        a().w().d("User property timed out", zzahVar.f34422a, this.f33646l.D().c(zzahVar.f34424c.f34451b), zzahVar.f34424c.g());
                        zzbg zzbgVar3 = zzahVar.f34428g;
                        if (zzbgVar3 != null) {
                            m(new zzbg(zzbgVar3, j10), zzrVar);
                        }
                        F0().G0(str2, zzahVar.f34424c.f34451b);
                    }
                }
                C3357t F03 = F0();
                AbstractC3191o.g(str2);
                F03.h();
                F03.j();
                if (j10 < 0) {
                    F03.f33578a.a().r().c("Invalid time querying expired conditional properties", C3392x2.x(str2), Long.valueOf(j10));
                    I03 = Collections.EMPTY_LIST;
                } else {
                    I03 = F03.I0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(I03.size());
                for (zzah zzahVar2 : I03) {
                    if (zzahVar2 != null) {
                        a().w().d("User property expired", zzahVar2.f34422a, this.f33646l.D().c(zzahVar2.f34424c.f34451b), zzahVar2.f34424c.g());
                        F0().z0(str2, zzahVar2.f34424c.f34451b);
                        zzbg zzbgVar4 = zzahVar2.f34432k;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        F0().G0(str2, zzahVar2.f34424c.f34451b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m(new zzbg((zzbg) it.next(), j10), zzrVar);
                }
                C3357t F04 = F0();
                AbstractC3191o.g(str2);
                AbstractC3191o.g(str4);
                F04.h();
                F04.j();
                if (j10 < 0) {
                    C3298l3 c3298l3 = F04.f33578a;
                    c3298l3.a().r().d("Invalid time querying triggered conditional properties", C3392x2.x(str2), c3298l3.D().a(str4), Long.valueOf(j10));
                    I04 = Collections.EMPTY_LIST;
                } else {
                    I04 = F04.I0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(I04.size());
                for (zzah zzahVar3 : I04) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.f34424c;
                        Z6 z62 = new Z6((String) AbstractC3191o.m(zzahVar3.f34422a), zzahVar3.f34423b, zzplVar.f34451b, j10, AbstractC3191o.m(zzplVar.g()));
                        if (F0().A0(z62)) {
                            a().w().d("User property triggered", zzahVar3.f34422a, this.f33646l.D().c(z62.f33792c), z62.f33794e);
                        } else {
                            a().o().d("Too many active user properties, ignoring", C3392x2.x(zzahVar3.f34422a), this.f33646l.D().c(z62.f33792c), z62.f33794e);
                        }
                        zzbg zzbgVar5 = zzahVar3.f34430i;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.f34424c = new zzpl(z62);
                        zzahVar3.f34426e = true;
                        F0().E0(zzahVar3);
                    }
                }
                m(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    m(new zzbg((zzbg) it2.next(), j10), zzrVar);
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final void k0(zzah zzahVar, zzr zzrVar) {
        AbstractC3191o.m(zzahVar);
        AbstractC3191o.g(zzahVar.f34422a);
        AbstractC3191o.m(zzahVar.f34423b);
        AbstractC3191o.m(zzahVar.f34424c);
        AbstractC3191o.g(zzahVar.f34424c.f34451b);
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z10 = false;
            zzahVar2.f34426e = false;
            F0().r0();
            try {
                zzah F02 = F0().F0((String) AbstractC3191o.m(zzahVar2.f34422a), zzahVar2.f34424c.f34451b);
                if (F02 != null && !F02.f34423b.equals(zzahVar2.f34423b)) {
                    a().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f33646l.D().c(zzahVar2.f34424c.f34451b), zzahVar2.f34423b, F02.f34423b);
                }
                if (F02 != null && F02.f34426e) {
                    zzahVar2.f34423b = F02.f34423b;
                    zzahVar2.f34425d = F02.f34425d;
                    zzahVar2.f34429h = F02.f34429h;
                    zzahVar2.f34427f = F02.f34427f;
                    zzahVar2.f34430i = F02.f34430i;
                    zzahVar2.f34426e = true;
                    zzpl zzplVar = zzahVar2.f34424c;
                    zzahVar2.f34424c = new zzpl(zzplVar.f34451b, F02.f34424c.f34452c, zzplVar.g(), F02.f34424c.f34455f);
                } else if (TextUtils.isEmpty(zzahVar2.f34427f)) {
                    zzpl zzplVar2 = zzahVar2.f34424c;
                    zzahVar2.f34424c = new zzpl(zzplVar2.f34451b, zzahVar2.f34425d, zzplVar2.g(), zzahVar2.f34424c.f34455f);
                    zzahVar2.f34426e = true;
                    z10 = true;
                }
                if (zzahVar2.f34426e) {
                    zzpl zzplVar3 = zzahVar2.f34424c;
                    Z6 z62 = new Z6((String) AbstractC3191o.m(zzahVar2.f34422a), zzahVar2.f34423b, zzplVar3.f34451b, zzplVar3.f34452c, AbstractC3191o.m(zzplVar3.g()));
                    if (F0().A0(z62)) {
                        a().v().d("User property updated immediately", zzahVar2.f34422a, this.f33646l.D().c(z62.f33792c), z62.f33794e);
                    } else {
                        a().o().d("(2)Too many active user properties, ignoring", C3392x2.x(zzahVar2.f34422a), this.f33646l.D().c(z62.f33792c), z62.f33794e);
                    }
                    if (z10 && zzahVar2.f34430i != null) {
                        m(new zzbg(zzahVar2.f34430i, zzahVar2.f34425d), zzrVar);
                    }
                }
                if (F0().E0(zzahVar2)) {
                    a().v().d("Conditional property added", zzahVar2.f34422a, this.f33646l.D().c(zzahVar2.f34424c.f34451b), zzahVar2.f34424c.g());
                } else {
                    a().o().d("Too many conditional properties, ignoring", C3392x2.x(zzahVar2.f34422a), this.f33646l.D().c(zzahVar2.f34424c.f34451b), zzahVar2.f34424c.g());
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final Bundle l(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.f34436b.h("_sid").longValue());
        Z6 B02 = F0().B0(str, "_sno");
        if (B02 != null) {
            Object obj = B02.f33794e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final void l0(zzah zzahVar) {
        zzr U10 = U((String) AbstractC3191o.m(zzahVar.f34422a));
        if (U10 != null) {
            m0(zzahVar, U10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:358|(2:360|(10:362|363|364|(1:366)|58|(0)(0)|61|(0)(0)|67|68))|367|368|369|370|371|363|364|(0)|58|(0)(0)|61|(0)(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(65:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))(1:330)|84|85|(1:87)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|(3:108|109|110)|111|(1:113)|114|(2:116|(1:120)(1:119))(1:326)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(6:143|(1:147)|148|(1:150)(1:183)|151|(1:153)(15:154|(1:156)(1:182)|157|(1:159)(1:181)|160|(1:162)(1:180)|163|(1:165)(1:179)|166|(1:168)(1:178)|169|(1:171)(1:177)|172|(1:174)(1:176)|175))|184|(1:186)|187|(1:189)(1:325)|(34:193|(4:196|(3:198|199|(3:201|202|(3:204|205|207)(1:316))(1:318))(1:322)|317|194)|323|208|(1:210)|(1:212)|213|(1:215)|216|(2:220|(4:222|(1:224)|225|(28:233|(1:235)(1:314)|236|(1:238)|239|240|(2:242|(1:244))|245|(3:247|(1:249)|250)(1:313)|251|(1:255)|256|(1:258)|259|(4:262|(2:268|269)|270|260)|274|275|276|277|278|(2:279|(2:281|(1:283)(1:298))(3:299|300|(1:305)(1:304)))|285|286|287|(1:289)(2:294|295)|290|291|292)))|315|240|(0)|245|(0)(0)|251|(2:253|255)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|285|286|287|(0)(0)|290|291|292)|324|(0)|213|(0)|216|(3:218|220|(0))|315|240|(0)|245|(0)(0)|251|(0)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|285|286|287|(0)(0)|290|291|292) */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0a32, code lost:
    
        r30 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0ae5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0aec, code lost:
    
        r2.f33578a.a().o().c("Error storing raw event. appId", com.google.android.gms.measurement.internal.C3392x2.x(r3.f33261a), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0b02, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0b1d, code lost:
    
        a().o().c("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.C3392x2.x(r8.zzK()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x028a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x028b, code lost:
    
        r12.f33578a.a().o().c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.C3392x2.x(r10), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07af A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07bf A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07f6 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08ae A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08c5 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x092c A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x094d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0969 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a28 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ad1 A[Catch: all -> 0x0176, SQLiteException -> 0x0ae5, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0ae5, blocks: (B:287:0x0ac0, B:289:0x0ad1), top: B:286:0x0ac0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a35 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02c5 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f2, B:61:0x0325, B:63:0x0366, B:65:0x036b, B:66:0x0382, B:70:0x038d, B:72:0x03a6, B:74:0x03ab, B:75:0x03c2, B:78:0x03e4, B:82:0x0407, B:83:0x041e, B:84:0x042a, B:87:0x0447, B:88:0x045b, B:90:0x0463, B:92:0x046f, B:94:0x0475, B:95:0x047c, B:97:0x0489, B:99:0x0491, B:101:0x0499, B:104:0x04a1, B:107:0x04ad, B:109:0x04ba, B:113:0x04fc, B:114:0x0511, B:116:0x0533, B:119:0x054a, B:120:0x0585, B:121:0x05b0, B:123:0x05e8, B:124:0x05eb, B:126:0x05f3, B:127:0x05f6, B:129:0x05fe, B:130:0x0601, B:132:0x0609, B:133:0x060c, B:135:0x0615, B:136:0x0619, B:138:0x0626, B:139:0x0629, B:141:0x0655, B:143:0x065f, B:147:0x0674, B:151:0x0680, B:154:0x0689, B:157:0x0696, B:160:0x06a4, B:163:0x06b2, B:166:0x06c0, B:169:0x06ce, B:172:0x06d9, B:175:0x06e6, B:184:0x06f2, B:186:0x06f8, B:187:0x06fb, B:189:0x071e, B:191:0x0727, B:193:0x0730, B:194:0x074a, B:196:0x0750, B:199:0x0764, B:202:0x0770, B:205:0x077d, B:320:0x0796, B:208:0x07a6, B:212:0x07af, B:213:0x07b2, B:215:0x07bf, B:216:0x07c4, B:218:0x07e2, B:220:0x07e6, B:222:0x07f6, B:224:0x0801, B:225:0x080a, B:227:0x0814, B:229:0x0820, B:231:0x082a, B:233:0x0830, B:235:0x083f, B:236:0x0855, B:238:0x085b, B:239:0x0864, B:240:0x0872, B:242:0x08ae, B:244:0x08b8, B:245:0x08bb, B:247:0x08c5, B:249:0x08e1, B:250:0x08ec, B:251:0x0924, B:253:0x092c, B:255:0x0936, B:256:0x0943, B:258:0x094d, B:259:0x095a, B:260:0x0963, B:262:0x0969, B:264:0x09a5, B:266:0x09af, B:268:0x09c1, B:275:0x09c7, B:277:0x0a0c, B:278:0x0a17, B:279:0x0a22, B:281:0x0a28, B:285:0x0a75, B:287:0x0ac0, B:289:0x0ad1, B:290:0x0b32, B:295:0x0ae9, B:297:0x0aec, B:300:0x0a35, B:302:0x0a61, B:308:0x0b05, B:309:0x0b1c, B:312:0x0b1d, B:325:0x0721, B:326:0x05a2, B:329:0x04e3, B:331:0x0306, B:332:0x030d, B:334:0x0313, B:337:0x031f, B:342:0x0191, B:344:0x019d, B:346:0x01b2, B:351:0x01d2, B:354:0x0208, B:356:0x020e, B:358:0x021c, B:360:0x022a, B:362:0x0236, B:364:0x02bb, B:366:0x02c5, B:368:0x025f, B:370:0x0278, B:371:0x029e, B:374:0x028b, B:375:0x01de, B:377:0x01fc), top: B:42:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038b  */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(zzbg zzbgVar, zzr zzrVar) {
        String str;
        String str2;
        long longValue;
        zzbg zzbgVar2;
        Z6 z62;
        Z6 z63;
        zzbe zzbeVar;
        long j10;
        long p10;
        long j11;
        ?? r52;
        long j12;
        A a10;
        B b10;
        ArrayList arrayList;
        String str3;
        V3 s10;
        U3 u32;
        String str4;
        U3 u33;
        C3298l3 c3298l3;
        D2 J02;
        int i10;
        List C02;
        int i11;
        C3357t F02;
        zzid zzidVar;
        C3357t F03;
        C c10;
        int i12;
        ContentValues contentValues;
        Pair m10;
        D2 J03;
        Z6 B02;
        AbstractC3191o.m(zzrVar);
        String str5 = zzrVar.f34462a;
        AbstractC3191o.g(str5);
        long nanoTime = System.nanoTime();
        b().h();
        O0();
        K0();
        if (X6.p(zzbgVar, zzrVar)) {
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            Y2 D02 = D0();
            String str6 = zzbgVar.f34435a;
            if (D02.D(str5, str6)) {
                a().r().c("Dropping blocked event. appId", C3392x2.x(str5), this.f33646l.D().a(str6));
                if (!D0().H(str5) && !D0().I(str5)) {
                    if ("_err".equals(str6)) {
                        return;
                    }
                    N0().B(this.f33634J, str5, 11, "_ev", str6, 0);
                    return;
                }
                D2 J04 = F0().J0(str5);
                if (J04 != null) {
                    long abs = Math.abs(e().a() - Math.max(J04.j(), J04.h()));
                    B0();
                    if (abs > ((Long) AbstractC3209a2.f33828O.b(null)).longValue()) {
                        a().v().a("Fetching config for blocked app");
                        B(J04);
                        return;
                    }
                    return;
                }
                return;
            }
            C3400y2 a11 = C3400y2.a(zzbgVar);
            N0().u(a11, B0().w(str5));
            int F10 = B0().F(str5, AbstractC3209a2.f33874h0, 10, 35);
            Bundle bundle = a11.f34397d;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (AlertFragment.ARG_ITEMS.equals(str7)) {
                    N0().v(bundle.getParcelableArray(str7), F10);
                }
            }
            zzbg b11 = a11.b();
            if (Log.isLoggable(a().z(), 2)) {
                a().w().b("Logging event", this.f33646l.D().d(b11));
            }
            F0().r0();
            try {
                o0(zzrVar);
                String str8 = b11.f34435a;
                boolean z10 = "ecommerce_purchase".equals(str8) || "purchase".equals(str8) || "refund".equals(str8);
                if (!"_iap".equals(str8)) {
                    if (!z10) {
                        str = PublisherMetadata.APP_ID;
                        str2 = "_fx";
                        zzbgVar2 = b11;
                        String str9 = zzbgVar2.f34435a;
                        boolean r02 = b7.r0(str9);
                        boolean equals = "_err".equals(str9);
                        N0();
                        zzbeVar = zzbgVar2.f34436b;
                        if (zzbeVar != null) {
                            j10 = 0;
                        } else {
                            C c11 = new C(zzbeVar);
                            j10 = 0;
                            while (c11.hasNext()) {
                                if (zzbeVar.g(c11.next()) instanceof Parcelable[]) {
                                    j10 += ((Parcelable[]) r11).length;
                                }
                            }
                        }
                        String str10 = str5;
                        zzbg zzbgVar3 = zzbgVar2;
                        C3326p M02 = F0().M0(h(), str10, j10 + 1, true, r02, false, equals, false, false, false);
                        long j13 = M02.f34207b;
                        B0();
                        p10 = j13 - C3286k.p();
                        if (p10 <= 0) {
                            if (p10 % 1000 == 1) {
                                a().o().c("Data loss. Too many events logged. appId, count", C3392x2.x(str10), Long.valueOf(M02.f34207b));
                            }
                            F0().s0();
                        } else {
                            if (r02) {
                                long j14 = M02.f34206a;
                                B0();
                                long intValue = j14 - ((Integer) AbstractC3209a2.f33890n.b(null)).intValue();
                                if (intValue > 0) {
                                    if (intValue % 1000 == 1) {
                                        a().o().c("Data loss. Too many public events logged. appId, count", C3392x2.x(str10), Long.valueOf(M02.f34206a));
                                    }
                                    N0().B(this.f33634J, str10, 16, "_ev", zzbgVar3.f34435a, 0);
                                    F0().s0();
                                }
                            }
                            if (equals) {
                                j11 = 1;
                                r52 = 0;
                                long max = M02.f34209d - Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, B0().E(zzrVar.f34462a, AbstractC3209a2.f33888m)));
                                if (max > 0) {
                                    if (max == 1) {
                                        a().o().c("Too many error events logged. appId, count", C3392x2.x(str10), Long.valueOf(M02.f34209d));
                                    }
                                    F0().s0();
                                }
                            } else {
                                j11 = 1;
                                r52 = 0;
                            }
                            Bundle l10 = zzbeVar.l();
                            b7 N02 = N0();
                            String str11 = zzbgVar3.f34437c;
                            N02.A(l10, "_o", str11);
                            if (N0().P(str10, zzrVar.f34458B)) {
                                b7 N03 = N0();
                                Long valueOf = Long.valueOf(j11);
                                N03.A(l10, "_dbg", valueOf);
                                N0().A(l10, "_r", valueOf);
                            }
                            if ("_s".equals(str9) && (B02 = F0().B0(zzrVar.f34462a, "_sno")) != null) {
                                Object obj = B02.f33794e;
                                if (obj instanceof Long) {
                                    N0().A(l10, "_sno", obj);
                                }
                            }
                            if (B0().H(null, AbstractC3209a2.f33849Y0) && Objects.equals(str11, "am") && Objects.equals(str9, "_ai")) {
                                Object obj2 = l10.get(EventKeys.VALUE_KEY);
                                if (obj2 instanceof String) {
                                    try {
                                        double parseDouble = Double.parseDouble((String) obj2);
                                        l10.remove(EventKeys.VALUE_KEY);
                                        l10.putDouble(EventKeys.VALUE_KEY, parseDouble);
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            C3357t F04 = F0();
                            AbstractC3191o.g(str10);
                            F04.h();
                            F04.j();
                            try {
                                j12 = F04.u0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str10, String.valueOf(Math.max((int) r52, Math.min(DurationKt.NANOS_IN_MILLIS, F04.f33578a.w().E(str10, AbstractC3209a2.f33896q))))});
                            } catch (SQLiteException e10) {
                                F04.f33578a.a().o().c("Error deleting over the limit events. appId", C3392x2.x(str10), e10);
                                j12 = 0;
                            }
                            if (j12 > 0) {
                                a().r().c("Data lost. Too many events stored on disk, deleted. appId", C3392x2.x(str10), Long.valueOf(j12));
                            }
                            C3298l3 c3298l32 = this.f33646l;
                            A a12 = new A(c3298l32, zzbgVar3.f34437c, str10, zzbgVar3.f34435a, zzbgVar3.f34438d, 0L, l10);
                            C3357t F05 = F0();
                            String str12 = a12.f33262b;
                            B v02 = F05.v0(str10, str12);
                            if (v02 != null) {
                                A a13 = a12.a(c3298l32, v02.f33288f);
                                B a14 = v02.a(a13.f33264d);
                                a10 = a13;
                                b10 = a14;
                            } else if (F0().E(str10) < B0().z(str10) || !r02) {
                                b10 = new B(str10, str12, 0L, 0L, 0L, a12.f33264d, 0L, null, null, null, null);
                                a10 = a12;
                            } else {
                                a().o().d("Too many event names used, ignoring event. appId, name, supported count", C3392x2.x(str10), c3298l32.D().a(str12), Integer.valueOf(B0().z(str10)));
                                N0().B(this.f33634J, str10, 8, null, null, 0);
                            }
                            F0().w0(b10);
                            b().h();
                            O0();
                            AbstractC3191o.m(a10);
                            AbstractC3191o.m(zzrVar);
                            String str13 = a10.f33261a;
                            AbstractC3191o.g(str13);
                            String str14 = zzrVar.f34462a;
                            AbstractC3191o.a(str13.equals(str14));
                            zzic zzaE = zzid.zzaE();
                            zzaE.zza(1);
                            zzaE.zzC(Constants.PLATFORM_ANDROID);
                            if (!TextUtils.isEmpty(str14)) {
                                zzaE.zzL(str14);
                            }
                            String str15 = zzrVar.f34465d;
                            if (!TextUtils.isEmpty(str15)) {
                                zzaE.zzJ(str15);
                            }
                            String str16 = zzrVar.f34464c;
                            if (!TextUtils.isEmpty(str16)) {
                                zzaE.zzM(str16);
                            }
                            String str17 = zzrVar.f34482u;
                            if (!TextUtils.isEmpty(str17)) {
                                zzaE.zzau(str17);
                            }
                            long j15 = zzrVar.f34471j;
                            if (j15 != -2147483648L) {
                                zzaE.zzaj((int) j15);
                            }
                            zzaE.zzN(zzrVar.f34466e);
                            String str18 = zzrVar.f34463b;
                            if (!TextUtils.isEmpty(str18)) {
                                zzaE.zzad(str18);
                            }
                            V3 s11 = g((String) AbstractC3191o.m(str14)).s(V3.f(zzrVar.f34480s, 100));
                            zzaE.zzat(s11.k());
                            zzqp.zza();
                            if (B0().H(str14, AbstractC3209a2.f33833Q0) && N0().L(str14)) {
                                zzaE.zzaH(zzrVar.f34487z);
                                long j16 = zzrVar.f34457A;
                                if (!s11.o(U3.AD_STORAGE) && j16 != 0) {
                                    j16 = (j16 & (-2)) | 32;
                                }
                                zzaE.zzaz(j16 == j11 ? true : r52);
                                if (j16 != 0) {
                                    zzhd zzh = zzhe.zzh();
                                    zzh.zza((j16 & j11) != 0 ? true : r52);
                                    zzh.zzb((j16 & 2) != 0 ? true : r52);
                                    zzh.zzc((j16 & 4) != 0 ? true : r52);
                                    zzh.zzd((j16 & 8) != 0 ? true : r52);
                                    zzh.zze((j16 & 16) != 0 ? true : r52);
                                    zzh.zzf((32 & j16) != 0 ? true : r52);
                                    zzh.zzg((j16 & 64) != 0 ? true : r52);
                                    zzaE.zzaI((zzhe) zzh.zzbc());
                                }
                            }
                            long j17 = zzrVar.f34467f;
                            if (j17 != 0) {
                                zzaE.zzY(j17);
                            }
                            zzaE.zzar(zzrVar.f34478q);
                            X6 K02 = K0();
                            zzjr zza = zzjr.zza(K02.f34418b.f33646l.d().getContentResolver(), zzkb.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.W1
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzkm.zzc();
                                }
                            });
                            Map zzb = zza == null ? Collections.EMPTY_MAP : zza.zzb();
                            try {
                                if (zzb != null && !zzb.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue2 = ((Integer) AbstractC3209a2.f33871g0.b(null)).intValue();
                                    for (Map.Entry entry : zzb.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue2) {
                                                        K02.f33578a.a().r().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e11) {
                                                K02.f33578a.a().r().b("Experiment ID NumberFormatException", e11);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    if (arrayList != null) {
                                        zzaE.zzaq(arrayList);
                                    }
                                    if (B0().H(null, AbstractC3209a2.f33857b1)) {
                                        zzaE.zzaP("");
                                    }
                                    str3 = zzrVar.f34462a;
                                    s10 = g((String) AbstractC3191o.m(str3)).s(V3.f(zzrVar.f34480s, 100));
                                    u32 = U3.AD_STORAGE;
                                    if (s10.o(u32) && zzrVar.f34475n) {
                                        m10 = this.f33643i.m(str3, s10);
                                        if (!TextUtils.isEmpty((CharSequence) m10.first)) {
                                            zzaE.zzQ((String) m10.first);
                                            Object obj3 = m10.second;
                                            if (obj3 != null) {
                                                zzaE.zzT(((Boolean) obj3).booleanValue());
                                            }
                                            String str19 = str2;
                                            if (!a10.f33262b.equals(str19) && !((String) m10.first).equals("00000000-0000-0000-0000-000000000000") && (J03 = F0().J0(str3)) != null && J03.d0()) {
                                                w(str3, r52, null, null);
                                                Bundle bundle2 = new Bundle();
                                                Long f02 = J03.f0();
                                                if (f02 != null) {
                                                    str4 = "raw_events";
                                                    long longValue2 = f02.longValue();
                                                    u33 = u32;
                                                    bundle2.putLong("_pfo", Math.max(0L, longValue2));
                                                } else {
                                                    str4 = "raw_events";
                                                    u33 = u32;
                                                }
                                                Long h02 = J03.h0();
                                                if (h02 != null) {
                                                    bundle2.putLong("_uwa", h02.longValue());
                                                }
                                                bundle2.putLong("_r", j11);
                                                this.f33634J.a(str3, str19, bundle2);
                                                c3298l3 = this.f33646l;
                                                c3298l3.K().l();
                                                zzaE.zzF(Build.MODEL);
                                                c3298l3.K().l();
                                                zzaE.zzE(Build.VERSION.RELEASE);
                                                zzaE.zzI((int) c3298l3.K().o());
                                                zzaE.zzH(c3298l3.K().p());
                                                zzaE.zzay(zzrVar.f34484w);
                                                if (c3298l3.g()) {
                                                    zzaE.zzK();
                                                    if (!TextUtils.isEmpty(null)) {
                                                        zzaE.zzam(null);
                                                    }
                                                }
                                                J02 = F0().J0(str3);
                                                if (J02 == null) {
                                                    J02 = new D2(c3298l3, str3);
                                                    J02.q0(p(s10));
                                                    J02.y0(zzrVar.f34472k);
                                                    J02.s0(zzrVar.f34463b);
                                                    if (s10.o(u33)) {
                                                        J02.w0(this.f33643i.o(str3, zzrVar.f34475n));
                                                    }
                                                    J02.f(0L);
                                                    J02.A0(0L);
                                                    J02.C0(0L);
                                                    J02.E0(zzrVar.f34464c);
                                                    J02.G0(zzrVar.f34471j);
                                                    J02.I0(zzrVar.f34465d);
                                                    J02.K0(zzrVar.f34466e);
                                                    J02.a(zzrVar.f34467f);
                                                    J02.e(zzrVar.f34469h);
                                                    J02.c(zzrVar.f34478q);
                                                    i10 = 0;
                                                    F0().K0(J02, false, false);
                                                } else {
                                                    i10 = 0;
                                                }
                                                if (s10.o(U3.ANALYTICS_STORAGE) && !TextUtils.isEmpty(J02.p0())) {
                                                    zzaE.zzW((String) AbstractC3191o.m(J02.p0()));
                                                }
                                                if (!TextUtils.isEmpty(J02.x0())) {
                                                    zzaE.zzah((String) AbstractC3191o.m(J02.x0()));
                                                }
                                                C02 = F0().C0(str3);
                                                for (i11 = i10; i11 < C02.size(); i11++) {
                                                    zzit zzm = zziu.zzm();
                                                    zzm.zzb(((Z6) C02.get(i11)).f33792c);
                                                    zzm.zza(((Z6) C02.get(i11)).f33793d);
                                                    K0().G(zzm, ((Z6) C02.get(i11)).f33794e);
                                                    zzaE.zzp(zzm);
                                                    if ("_sid".equals(((Z6) C02.get(i11)).f33792c) && J02.Z() != 0 && K0().U(zzrVar.f34482u) != J02.Z()) {
                                                        zzaE.zzav();
                                                    }
                                                }
                                                F02 = F0();
                                                zzidVar = (zzid) zzaE.zzbc();
                                                F02.h();
                                                F02.j();
                                                AbstractC3191o.m(zzidVar);
                                                AbstractC3191o.g(zzidVar.zzA());
                                                byte[] zzcc = zzidVar.zzcc();
                                                long T10 = F02.f34418b.K0().T(zzcc);
                                                ContentValues contentValues2 = new ContentValues();
                                                String str20 = str;
                                                contentValues2.put(str20, zzidVar.zzA());
                                                contentValues2.put("metadata_fingerprint", Long.valueOf(T10));
                                                contentValues2.put("metadata", zzcc);
                                                F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                F03 = F0();
                                                c10 = new C(a10.f33266f);
                                                while (true) {
                                                    if (c10.hasNext()) {
                                                        if ("_r".equals(c10.next())) {
                                                            break;
                                                        }
                                                    } else {
                                                        Y2 D03 = D0();
                                                        String str21 = a10.f33261a;
                                                        boolean E10 = D03.E(str21, a10.f33262b);
                                                        C3326p L02 = F0().L0(h(), str21, false, false, false, false, false, false, false);
                                                        if (!E10 || L02.f34210e >= B0().E(str21, AbstractC3209a2.f33894p)) {
                                                            i12 = i10;
                                                        }
                                                    }
                                                }
                                                F03.h();
                                                F03.j();
                                                AbstractC3191o.m(a10);
                                                String str22 = a10.f33261a;
                                                AbstractC3191o.g(str22);
                                                byte[] zzcc2 = F03.f34418b.K0().J(a10).zzcc();
                                                contentValues = new ContentValues();
                                                contentValues.put(str20, str22);
                                                contentValues.put("name", a10.f33262b);
                                                contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(a10.f33264d));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(T10));
                                                contentValues.put(EventKeys.DATA, zzcc2);
                                                contentValues.put("realtime", Integer.valueOf(i12));
                                                if (F03.u0().insert(str4, null, contentValues) == -1) {
                                                    F03.f33578a.a().o().b("Failed to insert raw event (got -1). appId", C3392x2.x(str22));
                                                } else {
                                                    this.f33649o = 0L;
                                                }
                                                F0().s0();
                                                F0().t0();
                                                R();
                                                a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                                return;
                                            }
                                        }
                                    }
                                    str4 = "raw_events";
                                    u33 = u32;
                                    c3298l3 = this.f33646l;
                                    c3298l3.K().l();
                                    zzaE.zzF(Build.MODEL);
                                    c3298l3.K().l();
                                    zzaE.zzE(Build.VERSION.RELEASE);
                                    zzaE.zzI((int) c3298l3.K().o());
                                    zzaE.zzH(c3298l3.K().p());
                                    zzaE.zzay(zzrVar.f34484w);
                                    if (c3298l3.g()) {
                                    }
                                    J02 = F0().J0(str3);
                                    if (J02 == null) {
                                    }
                                    if (s10.o(U3.ANALYTICS_STORAGE)) {
                                        zzaE.zzW((String) AbstractC3191o.m(J02.p0()));
                                    }
                                    if (!TextUtils.isEmpty(J02.x0())) {
                                    }
                                    C02 = F0().C0(str3);
                                    while (i11 < C02.size()) {
                                    }
                                    F02 = F0();
                                    zzidVar = (zzid) zzaE.zzbc();
                                    F02.h();
                                    F02.j();
                                    AbstractC3191o.m(zzidVar);
                                    AbstractC3191o.g(zzidVar.zzA());
                                    byte[] zzcc3 = zzidVar.zzcc();
                                    long T102 = F02.f34418b.K0().T(zzcc3);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str202 = str;
                                    contentValues22.put(str202, zzidVar.zzA());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(T102));
                                    contentValues22.put("metadata", zzcc3);
                                    F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    F03 = F0();
                                    c10 = new C(a10.f33266f);
                                    while (true) {
                                        if (c10.hasNext()) {
                                        }
                                    }
                                    F03.h();
                                    F03.j();
                                    AbstractC3191o.m(a10);
                                    String str222 = a10.f33261a;
                                    AbstractC3191o.g(str222);
                                    byte[] zzcc22 = F03.f34418b.K0().J(a10).zzcc();
                                    contentValues = new ContentValues();
                                    contentValues.put(str202, str222);
                                    contentValues.put("name", a10.f33262b);
                                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(a10.f33264d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(T102));
                                    contentValues.put(EventKeys.DATA, zzcc22);
                                    contentValues.put("realtime", Integer.valueOf(i12));
                                    if (F03.u0().insert(str4, null, contentValues) == -1) {
                                    }
                                    F0().s0();
                                    F0().t0();
                                    R();
                                    a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                }
                                F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                F03 = F0();
                                c10 = new C(a10.f33266f);
                                while (true) {
                                    if (c10.hasNext()) {
                                    }
                                }
                                F03.h();
                                F03.j();
                                AbstractC3191o.m(a10);
                                String str2222 = a10.f33261a;
                                AbstractC3191o.g(str2222);
                                byte[] zzcc222 = F03.f34418b.K0().J(a10).zzcc();
                                contentValues = new ContentValues();
                                contentValues.put(str202, str2222);
                                contentValues.put("name", a10.f33262b);
                                contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(a10.f33264d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(T102));
                                contentValues.put(EventKeys.DATA, zzcc222);
                                contentValues.put("realtime", Integer.valueOf(i12));
                                if (F03.u0().insert(str4, null, contentValues) == -1) {
                                }
                                F0().s0();
                                F0().t0();
                                R();
                                a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                return;
                            } catch (SQLiteException e12) {
                                F02.f33578a.a().o().c("Error storing raw event metadata. appId", C3392x2.x(zzidVar.zzA()), e12);
                                throw e12;
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            if (B0().H(null, AbstractC3209a2.f33857b1)) {
                            }
                            str3 = zzrVar.f34462a;
                            s10 = g((String) AbstractC3191o.m(str3)).s(V3.f(zzrVar.f34480s, 100));
                            u32 = U3.AD_STORAGE;
                            if (s10.o(u32)) {
                                m10 = this.f33643i.m(str3, s10);
                                if (!TextUtils.isEmpty((CharSequence) m10.first)) {
                                }
                            }
                            str4 = "raw_events";
                            u33 = u32;
                            c3298l3 = this.f33646l;
                            c3298l3.K().l();
                            zzaE.zzF(Build.MODEL);
                            c3298l3.K().l();
                            zzaE.zzE(Build.VERSION.RELEASE);
                            zzaE.zzI((int) c3298l3.K().o());
                            zzaE.zzH(c3298l3.K().p());
                            zzaE.zzay(zzrVar.f34484w);
                            if (c3298l3.g()) {
                            }
                            J02 = F0().J0(str3);
                            if (J02 == null) {
                            }
                            if (s10.o(U3.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(J02.x0())) {
                            }
                            C02 = F0().C0(str3);
                            while (i11 < C02.size()) {
                            }
                            F02 = F0();
                            zzidVar = (zzid) zzaE.zzbc();
                            F02.h();
                            F02.j();
                            AbstractC3191o.m(zzidVar);
                            AbstractC3191o.g(zzidVar.zzA());
                            byte[] zzcc32 = zzidVar.zzcc();
                            long T1022 = F02.f34418b.K0().T(zzcc32);
                            ContentValues contentValues222 = new ContentValues();
                            String str2022 = str;
                            contentValues222.put(str2022, zzidVar.zzA());
                            contentValues222.put("metadata_fingerprint", Long.valueOf(T1022));
                            contentValues222.put("metadata", zzcc32);
                        }
                        F0().t0();
                    }
                    z10 = true;
                }
                zzbe zzbeVar2 = b11.f34436b;
                String j18 = zzbeVar2.j("currency");
                if (z10) {
                    double doubleValue = zzbeVar2.i(EventKeys.VALUE_KEY).doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        Long h10 = zzbeVar2.h(EventKeys.VALUE_KEY);
                        str = PublisherMetadata.APP_ID;
                        str2 = "_fx";
                        doubleValue = h10.longValue() * 1000000.0d;
                    } else {
                        str = PublisherMetadata.APP_ID;
                        str2 = "_fx";
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        a().r().c("Data lost. Currency value is too big. appId", C3392x2.x(str5), Double.valueOf(doubleValue));
                        F0().s0();
                        F0().t0();
                    } else {
                        longValue = Math.round(doubleValue);
                        if ("refund".equals(str8)) {
                            longValue = -longValue;
                        }
                    }
                } else {
                    str = PublisherMetadata.APP_ID;
                    str2 = "_fx";
                    longValue = zzbeVar2.h(EventKeys.VALUE_KEY).longValue();
                }
                if (!TextUtils.isEmpty(j18)) {
                    String upperCase = j18.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(upperCase);
                        Z6 B03 = F0().B0(str5, concat);
                        if (B03 != null) {
                            Object obj4 = B03.f33794e;
                            if (obj4 instanceof Long) {
                                zzbgVar2 = b11;
                                z62 = new Z6(str5, b11.f34437c, concat, e().a(), Long.valueOf(((Long) obj4).longValue() + longValue));
                                str5 = str5;
                                z63 = z62;
                                if (!F0().A0(z63)) {
                                    a().o().d("Too many unique user properties are set. Ignoring user property. appId", C3392x2.x(str5), this.f33646l.D().c(z63.f33792c), z63.f33794e);
                                    N0().B(this.f33634J, str5, 9, null, null, 0);
                                }
                                String str92 = zzbgVar2.f34435a;
                                boolean r022 = b7.r0(str92);
                                boolean equals2 = "_err".equals(str92);
                                N0();
                                zzbeVar = zzbgVar2.f34436b;
                                if (zzbeVar != null) {
                                }
                                String str102 = str5;
                                zzbg zzbgVar32 = zzbgVar2;
                                C3326p M022 = F0().M0(h(), str102, j10 + 1, true, r022, false, equals2, false, false, false);
                                long j132 = M022.f34207b;
                                B0();
                                p10 = j132 - C3286k.p();
                                if (p10 <= 0) {
                                }
                                F0().t0();
                            }
                        }
                        C3357t F06 = F0();
                        int E11 = B0().E(str5, AbstractC3209a2.f33840U) - 1;
                        AbstractC3191o.g(str5);
                        F06.h();
                        F06.j();
                        F06.u0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str5, str5, String.valueOf(E11)});
                        zzbgVar2 = b11;
                        z62 = new Z6(str5, b11.f34437c, concat, e().a(), Long.valueOf(longValue));
                        str5 = str5;
                        z63 = z62;
                        if (!F0().A0(z63)) {
                        }
                        String str922 = zzbgVar2.f34435a;
                        boolean r0222 = b7.r0(str922);
                        boolean equals22 = "_err".equals(str922);
                        N0();
                        zzbeVar = zzbgVar2.f34436b;
                        if (zzbeVar != null) {
                        }
                        String str1022 = str5;
                        zzbg zzbgVar322 = zzbgVar2;
                        C3326p M0222 = F0().M0(h(), str1022, j10 + 1, true, r0222, false, equals22, false, false, false);
                        long j1322 = M0222.f34207b;
                        B0();
                        p10 = j1322 - C3286k.p();
                        if (p10 <= 0) {
                        }
                        F0().t0();
                    }
                }
                zzbgVar2 = b11;
                String str9222 = zzbgVar2.f34435a;
                boolean r02222 = b7.r0(str9222);
                boolean equals222 = "_err".equals(str9222);
                N0();
                zzbeVar = zzbgVar2.f34436b;
                if (zzbeVar != null) {
                }
                String str10222 = str5;
                zzbg zzbgVar3222 = zzbgVar2;
                C3326p M02222 = F0().M0(h(), str10222, j10 + 1, true, r02222, false, equals222, false, false, false);
                long j13222 = M02222.f34207b;
                B0();
                p10 = j13222 - C3286k.p();
                if (p10 <= 0) {
                }
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final void m0(zzah zzahVar, zzr zzrVar) {
        AbstractC3191o.m(zzahVar);
        AbstractC3191o.g(zzahVar.f34422a);
        AbstractC3191o.m(zzahVar.f34424c);
        AbstractC3191o.g(zzahVar.f34424c.f34451b);
        b().h();
        O0();
        if (X(zzrVar)) {
            if (!zzrVar.f34469h) {
                o0(zzrVar);
                return;
            }
            F0().r0();
            try {
                o0(zzrVar);
                String str = (String) AbstractC3191o.m(zzahVar.f34422a);
                zzah F02 = F0().F0(str, zzahVar.f34424c.f34451b);
                if (F02 != null) {
                    a().v().c("Removing conditional user property", zzahVar.f34422a, this.f33646l.D().c(zzahVar.f34424c.f34451b));
                    F0().G0(str, zzahVar.f34424c.f34451b);
                    if (F02.f34426e) {
                        F0().z0(str, zzahVar.f34424c.f34451b);
                    }
                    zzbg zzbgVar = zzahVar.f34432k;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.f34436b;
                        m((zzbg) AbstractC3191o.m(N0().R(str, ((zzbg) AbstractC3191o.m(zzbgVar)).f34435a, zzbeVar != null ? zzbeVar.l() : null, F02.f34423b, zzbgVar.f34438d, true, true)), zzrVar);
                    }
                } else {
                    a().r().c("Conditional user property doesn't exist", C3392x2.x(zzahVar.f34422a), this.f33646l.D().c(zzahVar.f34424c.f34451b));
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    public final void n(D2 d22, zzic zzicVar) {
        zziu zziuVar;
        b().h();
        O0();
        C3302m d10 = C3302m.d(zzicVar.zzaA());
        String o02 = d22.o0();
        b().h();
        O0();
        V3 g10 = g(o02);
        S3 s32 = S3.UNINITIALIZED;
        int ordinal = g10.p().ordinal();
        if (ordinal == 1) {
            d10.c(U3.AD_STORAGE, EnumC3294l.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            d10.b(U3.AD_STORAGE, g10.b());
        } else {
            d10.c(U3.AD_STORAGE, EnumC3294l.FAILSAFE);
        }
        int ordinal2 = g10.q().ordinal();
        if (ordinal2 == 1) {
            d10.c(U3.ANALYTICS_STORAGE, EnumC3294l.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            d10.b(U3.ANALYTICS_STORAGE, g10.b());
        } else {
            d10.c(U3.ANALYTICS_STORAGE, EnumC3294l.FAILSAFE);
        }
        String o03 = d22.o0();
        b().h();
        O0();
        C3389x T02 = T0(o03, R0(o03), g(o03), d10);
        zzicVar.zzaD(((Boolean) AbstractC3191o.m(T02.j())).booleanValue());
        if (!TextUtils.isEmpty(T02.k())) {
            zzicVar.zzaF(T02.k());
        }
        b().h();
        O0();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            U3 u32 = U3.AD_PERSONALIZATION;
            if (d10.a(u32) == EnumC3294l.UNSET) {
                Z6 B02 = F0().B0(d22.o0(), "_npa");
                if (B02 != null) {
                    String str = B02.f33791b;
                    if ("tcf".equals(str)) {
                        d10.c(u32, EnumC3294l.TCF);
                    } else if ("app".equals(str)) {
                        d10.c(u32, EnumC3294l.API);
                    } else {
                        d10.c(u32, EnumC3294l.MANIFEST);
                    }
                } else {
                    Boolean R10 = d22.R();
                    if (R10 == null || ((R10.booleanValue() && zziuVar.zzg() != 1) || !(R10.booleanValue() || zziuVar.zzg() == 0))) {
                        d10.c(u32, EnumC3294l.API);
                    } else {
                        d10.c(u32, EnumC3294l.MANIFEST);
                    }
                }
            }
        } else {
            int I10 = I(d22.o0(), d10);
            zzit zzm = zziu.zzm();
            zzm.zzb("_npa");
            zzm.zza(e().a());
            zzm.zze(I10);
            zzicVar.zzo((zziu) zzm.zzbc());
            a().w().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I10));
        }
        zzicVar.zzaB(d10.toString());
        boolean S10 = this.f33635a.S(d22.o0());
        List zzb = zzicVar.zzb();
        int i10 = 0;
        for (int i11 = 0; i11 < zzb.size(); i11++) {
            if ("_tcf".equals(((zzhs) zzb.get(i11)).zzd())) {
                zzhr zzhrVar = (zzhr) ((zzhs) zzb.get(i11)).zzcl();
                List zza = zzhrVar.zza();
                int i12 = 0;
                while (true) {
                    if (i12 >= zza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((zzhw) zza.get(i12)).zzb())) {
                        String zzd = ((zzhw) zza.get(i12)).zzd();
                        if (S10 && zzd.length() > 4) {
                            char[] charArray = zzd.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i10 = i13;
                                    break;
                                }
                                i13++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            zzd = String.valueOf(charArray);
                        }
                        zzhv zzn = zzhw.zzn();
                        zzn.zzb("_tcfd");
                        zzn.zzd(zzd);
                        zzhrVar.zze(i12, zzn);
                    } else {
                        i12++;
                    }
                }
                zzicVar.zzf(i11, zzhrVar);
                return;
            }
        }
    }

    public final void n0(zzr zzrVar, long j10) {
        D2 J02 = F0().J0((String) AbstractC3191o.m(zzrVar.f34462a));
        if (J02 != null && N0().p(zzrVar.f34463b, J02.r0())) {
            a().r().b("New GMP App Id passed in. Removing cached database data. appId", C3392x2.x(J02.o0()));
            C3357t F02 = F0();
            String o02 = J02.o0();
            F02.j();
            F02.h();
            AbstractC3191o.g(o02);
            try {
                SQLiteDatabase u02 = F02.u0();
                String[] strArr = {o02};
                int delete = u02.delete("events", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("apps", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("event_filters", "app_id=?", strArr) + u02.delete("property_filters", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("consent_settings", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr);
                zzpo.zza();
                C3298l3 c3298l3 = F02.f33578a;
                if (c3298l3.w().H(null, AbstractC3209a2.f33878i1)) {
                    delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    c3298l3.a().w().c("Deleted application data. app, records", o02, Integer.valueOf(delete));
                }
            } catch (SQLiteException e10) {
                F02.f33578a.a().o().c("Error deleting application data. appId, error", C3392x2.x(o02), e10);
            }
            J02 = null;
        }
        if (J02 != null) {
            boolean z10 = (J02.F0() == -2147483648L || J02.F0() == zzrVar.f34471j) ? false : true;
            String D02 = J02.D0();
            if (z10 || ((J02.F0() != -2147483648L || D02 == null || D02.equals(zzrVar.f34464c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", D02);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j10);
                if (B0().H(null, AbstractC3209a2.f33863d1)) {
                    j(zzbgVar, zzrVar);
                } else {
                    k(zzbgVar, zzrVar);
                }
            }
        }
    }

    public final void o(D2 d22, zzic zzicVar) {
        b().h();
        O0();
        zzgx zzr = zzha.zzr();
        byte[] K10 = d22.K();
        if (K10 != null) {
            try {
                zzr = (zzgx) X6.W(zzr, K10);
            } catch (zzmr unused) {
                a().r().b("Failed to parse locally stored ad campaign info. appId", C3392x2.x(d22.o0()));
            }
        }
        for (zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals("_cmp")) {
                String str = (String) X6.v(zzhsVar, "gclid", "");
                String str2 = (String) X6.v(zzhsVar, "gbraid", "");
                String str3 = (String) X6.v(zzhsVar, "gad_source", "");
                String[] split = ((String) AbstractC3209a2.f33875h1.b(null)).split(",");
                K0();
                if (!X6.s(zzhsVar, split).isEmpty()) {
                    long longValue = ((Long) X6.v(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(X6.u(zzhsVar, "_cis"))) {
                        if (longValue > zzr.zzo()) {
                            if (str.isEmpty()) {
                                zzr.zzj();
                            } else {
                                zzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzr.zzl();
                            } else {
                                zzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzr.zzn();
                            } else {
                                zzr.zzm(str3);
                            }
                            zzr.zzp(longValue);
                            zzr.zzs();
                            zzr.zzt(J(zzhsVar));
                        }
                    } else if (longValue > zzr.zzg()) {
                        if (str.isEmpty()) {
                            zzr.zzb();
                        } else {
                            zzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzr.zzd();
                        } else {
                            zzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzr.zzf();
                        } else {
                            zzr.zze(str3);
                        }
                        zzr.zzh(longValue);
                        zzr.zzq();
                        zzr.zzr(J(zzhsVar));
                    }
                }
            }
        }
        if (!((zzha) zzr.zzbc()).equals(zzha.zzs())) {
            zzicVar.zzaM((zzha) zzr.zzbc());
        }
        d22.J(((zzha) zzr.zzbc()).zzcc());
        if (d22.A()) {
            F0().K0(d22, false, false);
        }
        if (B0().H(null, AbstractC3209a2.f33872g1)) {
            F0().z0(d22.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D2 o0(zzr zzrVar) {
        boolean z10;
        String str;
        long j10;
        String str2;
        String str3;
        String str4;
        b().h();
        O0();
        AbstractC3191o.m(zzrVar);
        String str5 = zzrVar.f34462a;
        AbstractC3191o.g(str5);
        String str6 = zzrVar.f34481t;
        byte[] bArr = null;
        if (!str6.isEmpty()) {
            this.f33628D.put(str5, new P6(this, str6, bArr));
        }
        D2 J02 = F0().J0(str5);
        V3 s10 = g(str5).s(V3.f(zzrVar.f34480s, 100));
        U3 u32 = U3.AD_STORAGE;
        String o10 = s10.o(u32) ? this.f33643i.o(str5, zzrVar.f34475n) : "";
        boolean z11 = true;
        if (J02 == null) {
            D2 d22 = new D2(this.f33646l, str5);
            if (s10.o(U3.ANALYTICS_STORAGE)) {
                d22.q0(p(s10));
            }
            if (s10.o(u32)) {
                d22.w0(o10);
            }
            J02 = d22;
        } else if (s10.o(u32) && o10 != null && !o10.equals(J02.v0())) {
            boolean isEmpty = TextUtils.isEmpty(J02.v0());
            J02.w0(o10);
            if (zzrVar.f34475n && !"00000000-0000-0000-0000-000000000000".equals(this.f33643i.m(str5, s10).first) && !isEmpty) {
                if (s10.o(U3.ANALYTICS_STORAGE)) {
                    J02.q0(p(s10));
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (F0().B0(str5, "_id") != null && F0().B0(str5, "_lair") == null) {
                    F0().A0(new Z6(str5, "auto", "_lair", e().a(), 1L));
                }
                J02.s0(zzrVar.f34463b);
                str = zzrVar.f34472k;
                if (!TextUtils.isEmpty(str)) {
                    J02.y0(str);
                }
                j10 = zzrVar.f34466e;
                if (j10 != 0) {
                    J02.K0(j10);
                }
                str2 = zzrVar.f34464c;
                if (!TextUtils.isEmpty(str2)) {
                    J02.E0(str2);
                }
                J02.G0(zzrVar.f34471j);
                str3 = zzrVar.f34465d;
                if (str3 != null) {
                    J02.I0(str3);
                }
                J02.a(zzrVar.f34467f);
                J02.e(zzrVar.f34469h);
                str4 = zzrVar.f34468g;
                if (!TextUtils.isEmpty(str4)) {
                    J02.O(str4);
                }
                J02.Q(zzrVar.f34475n);
                J02.S(zzrVar.f34477p);
                J02.c(zzrVar.f34478q);
                J02.u0(zzrVar.f34482u);
                zzpr.zza();
                if (B0().H(null, AbstractC3209a2.f33825M0)) {
                    zzpr.zza();
                    if (B0().H(null, AbstractC3209a2.f33823L0)) {
                        J02.U(null);
                    }
                } else {
                    J02.U(zzrVar.f34479r);
                }
                J02.W(zzrVar.f34483v);
                J02.m0(zzrVar.f34458B);
                zzqp.zza();
                if (B0().H(null, AbstractC3209a2.f33833Q0)) {
                    J02.c0(zzrVar.f34487z);
                }
                J02.Y(zzrVar.f34484w);
                J02.H(zzrVar.f34459C);
                J02.L(zzrVar.f34461E);
                if (!J02.A()) {
                    z11 = z10;
                } else if (!z10) {
                    return J02;
                }
                F0().K0(J02, z11, false);
                return J02;
            }
            if (TextUtils.isEmpty(J02.p0()) && s10.o(U3.ANALYTICS_STORAGE)) {
                J02.q0(p(s10));
            }
        } else if (TextUtils.isEmpty(J02.p0()) && s10.o(U3.ANALYTICS_STORAGE)) {
            J02.q0(p(s10));
        }
        z10 = false;
        J02.s0(zzrVar.f34463b);
        str = zzrVar.f34472k;
        if (!TextUtils.isEmpty(str)) {
        }
        j10 = zzrVar.f34466e;
        if (j10 != 0) {
        }
        str2 = zzrVar.f34464c;
        if (!TextUtils.isEmpty(str2)) {
        }
        J02.G0(zzrVar.f34471j);
        str3 = zzrVar.f34465d;
        if (str3 != null) {
        }
        J02.a(zzrVar.f34467f);
        J02.e(zzrVar.f34469h);
        str4 = zzrVar.f34468g;
        if (!TextUtils.isEmpty(str4)) {
        }
        J02.Q(zzrVar.f34475n);
        J02.S(zzrVar.f34477p);
        J02.c(zzrVar.f34478q);
        J02.u0(zzrVar.f34482u);
        zzpr.zza();
        if (B0().H(null, AbstractC3209a2.f33825M0)) {
        }
        J02.W(zzrVar.f34483v);
        J02.m0(zzrVar.f34458B);
        zzqp.zza();
        if (B0().H(null, AbstractC3209a2.f33833Q0)) {
        }
        J02.Y(zzrVar.f34484w);
        J02.H(zzrVar.f34459C);
        J02.L(zzrVar.f34461E);
        if (!J02.A()) {
        }
        F0().K0(J02, z11, false);
        return J02;
    }

    public final String p(V3 v32) {
        if (!v32.o(U3.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        N0().q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String p0(zzr zzrVar) {
        try {
            return (String) b().r(new K6(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a().o().c("Failed to get app instance id. appId", C3392x2.x(zzrVar.f34462a), e10);
            return null;
        }
    }

    public final void q(List list) {
        AbstractC3191o.a(!list.isEmpty());
        if (this.f33659y != null) {
            a().o().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f33659y = new ArrayList(list);
        }
    }

    public final List q0(zzr zzrVar, Bundle bundle) {
        b().h();
        zzqp.zza();
        C3286k B02 = B0();
        String str = zzrVar.f34462a;
        if (!B02.H(str, AbstractC3209a2.f33833Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().o().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C3357t F02 = F0();
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        AbstractC3191o.g(str);
                        F02.h();
                        F02.j();
                        try {
                            int delete = F02.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            C3376v2 w10 = F02.f33578a.a().w();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(delete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            w10.d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            F02.f33578a.a().o().c("Error pruning trigger URIs. appId", C3392x2.x(str), e10);
                        }
                    }
                }
            }
        }
        C3357t F03 = F0();
        String str2 = zzrVar.f34462a;
        AbstractC3191o.g(str2);
        F03.h();
        F03.j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = F03.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e11) {
                F03.f33578a.a().o().c("Error querying trigger uris. appId", C3392x2.x(str2), e11);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        if (r1 == 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.S6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        C3357t F02;
        long n10;
        SQLiteException e10;
        D2 J02;
        b().h();
        O0();
        this.f33656v = true;
        try {
            C3298l3 c3298l3 = this.f33646l;
            c3298l3.c();
            Boolean x10 = c3298l3.J().x();
            if (x10 == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (x10.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f33649o > 0) {
                R();
            } else {
                b().h();
                if (this.f33659y != null) {
                    a().w().a("Uploading requested multiple times");
                } else if (E0().m()) {
                    ?? a10 = e().a();
                    Cursor cursor = null;
                    r7 = null;
                    Cursor cursor2 = null;
                    r7 = null;
                    r7 = null;
                    String str = null;
                    int E10 = B0().E(null, AbstractC3209a2.f33880j0);
                    B0();
                    long n11 = a10 - C3286k.n();
                    for (int i10 = 0; i10 < E10 && M(null, n11); i10++) {
                    }
                    zzqp.zza();
                    b().h();
                    v0();
                    long a11 = this.f33643i.f33939h.a();
                    if (a11 != 0) {
                        a().v().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a10 - a11)));
                    }
                    String r10 = F0().r();
                    long j10 = -1;
                    if (TextUtils.isEmpty(r10)) {
                        try {
                            this.f33625A = -1L;
                            F02 = F0();
                            B0();
                            n10 = a10 - C3286k.n();
                            F02.h();
                            F02.j();
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = a10;
                        }
                        try {
                            a10 = F02.u0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(n10)});
                            try {
                                if (a10.moveToFirst()) {
                                    str = a10.getString(0);
                                } else {
                                    F02.f33578a.a().w().a("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e11) {
                                e10 = e11;
                                a10 = a10;
                                F02.f33578a.a().o().b("Error selecting expired configs", e10);
                            }
                        } catch (SQLiteException e12) {
                            e10 = e12;
                            a10 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor == null) {
                                throw th;
                            }
                            throw th;
                        }
                        a10.close();
                        if (!TextUtils.isEmpty(str) && (J02 = F0().J0(str)) != null) {
                            B(J02);
                        }
                    } else {
                        if (this.f33625A == -1) {
                            C3357t F03 = F0();
                            try {
                                try {
                                    cursor2 = F03.u0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor2.moveToFirst()) {
                                        j10 = cursor2.getLong(0);
                                    }
                                } catch (SQLiteException e13) {
                                    F03.f33578a.a().o().b("Error querying raw events", e13);
                                }
                                cursor2.close();
                                this.f33625A = j10;
                            } finally {
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                            }
                        }
                        s(r10, a10);
                    }
                } else {
                    a().w().a("Network not connected, ignoring upload request");
                    R();
                }
            }
            this.f33656v = false;
            S();
        } catch (Throwable th4) {
            this.f33656v = false;
            S();
            throw th4;
        }
    }

    public final void r0(String str, zzaf zzafVar) {
        b().h();
        O0();
        C3357t F02 = F0();
        long j10 = zzafVar.f34419a;
        V6 n10 = F02.n(j10);
        if (n10 == null) {
            a().r().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j10));
            return;
        }
        String e10 = n10.e();
        if (zzafVar.f34420b != EnumC3244e5.SUCCESS.zza()) {
            if (zzafVar.f34420b == EnumC3244e5.BACKOFF.zza()) {
                Map map = this.f33629E;
                Q6 q62 = (Q6) map.get(e10);
                if (q62 == null) {
                    q62 = new Q6(this);
                    map.put(e10, q62);
                } else {
                    q62.a();
                }
                a().w().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, e10, Long.valueOf((q62.c() - e().a()) / 1000));
            }
            C3357t F03 = F0();
            Long valueOf = Long.valueOf(zzafVar.f34419a);
            F03.w(valueOf);
            a().w().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
            return;
        }
        Map map2 = this.f33629E;
        if (map2.containsKey(e10)) {
            map2.remove(e10);
        }
        C3357t F04 = F0();
        Long valueOf2 = Long.valueOf(j10);
        F04.q(valueOf2);
        a().w().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
        long j11 = zzafVar.f34421c;
        if (j11 > 0) {
            C3357t F05 = F0();
            F05.h();
            F05.j();
            Long valueOf3 = Long.valueOf(j11);
            AbstractC3191o.m(valueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(EnumC3252f5.GOOGLE_SIGNAL.zza()));
            C3298l3 c3298l3 = F05.f33578a;
            contentValues.put("creation_timestamp", Long.valueOf(c3298l3.e().a()));
            try {
                if (F05.u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(EnumC3252f5.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    c3298l3.a().r().c("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                }
                a().w().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.f34421c));
                u(str);
            } catch (SQLiteException e11) {
                F05.f33578a.a().o().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e11);
                throw e11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0484, code lost:
    
        if (r23 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x022a, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a05  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(String str, long j10) {
        long j11;
        Cursor cursor;
        Cursor cursor2;
        List list;
        List<Pair> list2;
        boolean z10;
        Object obj;
        String str2;
        E6 e62;
        boolean z11;
        List list3;
        boolean z12;
        int i10;
        String str3;
        List list4;
        Cursor cursor3;
        Cursor cursor4;
        Iterator it;
        List list5;
        int i11;
        int i12;
        SQLiteDatabase u02;
        long a10;
        Cursor query;
        Cursor cursor5;
        byte[] blob;
        X6 K02;
        zzid zzidVar;
        long j12;
        long j13;
        long j14;
        int E10 = B0().E(str, AbstractC3209a2.f33873h);
        int i13 = 0;
        int max = Math.max(0, B0().E(str, AbstractC3209a2.f33876i));
        C3357t F02 = F0();
        F02.h();
        F02.j();
        int i14 = 1;
        AbstractC3191o.a(E10 > 0);
        AbstractC3191o.a(max > 0);
        AbstractC3191o.g(str);
        try {
            try {
                j11 = -1;
                try {
                    cursor2 = F02.u0().query("queue", new String[]{"rowid", EventKeys.DATA, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(E10));
                    try {
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor5 = cursor2;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor5 = cursor2;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursor2 = null;
                    try {
                        F02.f33578a.a().o().c("Error querying bundles. appId", C3392x2.x(str), e);
                        list = Collections.EMPTY_LIST;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } catch (SQLiteException e12) {
            e = e12;
            j11 = -1;
        }
        if (cursor2.moveToFirst()) {
            list2 = new ArrayList();
            int i15 = 0;
            while (true) {
                long j15 = cursor2.getLong(i13);
                try {
                    blob = cursor2.getBlob(i14);
                    K02 = F02.f34418b.K0();
                } catch (IOException e13) {
                    e = e13;
                    cursor5 = cursor2;
                }
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        cursor5 = cursor2;
                        try {
                            try {
                                byteArrayOutputStream.write(bArr, 0, read);
                                cursor2 = cursor5;
                            } catch (IOException e14) {
                                e = e14;
                                try {
                                    K02.f33578a.a().o().b("Failed to ungzip content", e);
                                    throw e;
                                } catch (IOException e15) {
                                    e = e15;
                                    F02.f33578a.a().o().c("Failed to unzip queued bundle. appId", C3392x2.x(str), e);
                                    if (cursor5.moveToNext()) {
                                        break;
                                    }
                                    cursor2 = cursor5;
                                    i13 = 0;
                                    i14 = 1;
                                    cursor5.close();
                                    if (list2.isEmpty()) {
                                    }
                                }
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            cursor2 = cursor5;
                            F02.f33578a.a().o().c("Error querying bundles. appId", C3392x2.x(str), e);
                            list = Collections.EMPTY_LIST;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor = cursor5;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (!list2.isEmpty() && byteArray.length + i15 > max) {
                        break;
                    }
                    try {
                        zzic zzicVar = (zzic) X6.W(zzid.zzaE(), byteArray);
                        if (!list2.isEmpty()) {
                            zzid zzidVar2 = (zzid) ((Pair) list2.get(0)).first;
                            zzid zzidVar3 = (zzid) zzicVar.zzbc();
                            if (!zzidVar2.zzaf().equals(zzidVar3.zzaf()) || !zzidVar2.zzam().equals(zzidVar3.zzam()) || zzidVar2.zzao() != zzidVar3.zzao() || !zzidVar2.zzaq().equals(zzidVar3.zzaq())) {
                                break;
                            }
                            Iterator it2 = zzidVar2.zzf().iterator();
                            while (true) {
                                Iterator it3 = it2;
                                if (!it2.hasNext()) {
                                    zzidVar = zzidVar3;
                                    j12 = -1;
                                    break;
                                }
                                zziu zziuVar = (zziu) it3.next();
                                zzidVar = zzidVar3;
                                if ("_npa".equals(zziuVar.zzc())) {
                                    j12 = zziuVar.zzg();
                                    break;
                                } else {
                                    it2 = it3;
                                    zzidVar3 = zzidVar;
                                }
                            }
                            Iterator it4 = zzidVar.zzf().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    j13 = j12;
                                    j14 = -1;
                                    break;
                                }
                                zziu zziuVar2 = (zziu) it4.next();
                                j13 = j12;
                                if ("_npa".equals(zziuVar2.zzc())) {
                                    j14 = zziuVar2.zzg();
                                    break;
                                }
                                j12 = j13;
                            }
                            if (j13 != j14) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            zzicVar.zzao(cursor2.getInt(2));
                        }
                        i15 += byteArray.length;
                        list2.add(Pair.create((zzid) zzicVar.zzbc(), Long.valueOf(j15)));
                    } catch (IOException e17) {
                        F02.f33578a.a().o().c("Failed to merge queued bundle. appId", C3392x2.x(str), e17);
                    }
                    cursor5 = cursor2;
                    if (cursor5.moveToNext() || i15 > max) {
                        break;
                        break;
                    } else {
                        cursor2 = cursor5;
                        i13 = 0;
                        i14 = 1;
                    }
                } catch (IOException e18) {
                    e = e18;
                    cursor5 = cursor2;
                }
            }
            cursor5 = cursor2;
            cursor5.close();
            if (list2.isEmpty()) {
            }
        } else {
            list = Collections.EMPTY_LIST;
            cursor2.close();
            list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            zzpo.zza();
            C3286k B02 = B0();
            Z1 z13 = AbstractC3209a2.f33878i1;
            if (B02.H(null, z13)) {
                zzpo.zza();
                if (B0().H(null, z13)) {
                    if (g(str).o(U3.ANALYTICS_STORAGE) || !D0().n(str)) {
                        ArrayList arrayList = new ArrayList(list2.size());
                        C3357t F03 = F0();
                        AbstractC3191o.g(str);
                        F03.h();
                        F03.j();
                        List arrayList2 = new ArrayList();
                        try {
                            try {
                                u02 = F03.u0();
                                a10 = F03.f33578a.e().a();
                                query = u02.query("no_data_mode_events", new String[]{EventKeys.DATA}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(a10)}, null, null, "rowid", null);
                                list4 = list2;
                            } catch (Throwable th6) {
                                th = th6;
                                cursor3 = null;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                            try {
                            } catch (SQLiteException e19) {
                                e = e19;
                                cursor4 = query;
                            } catch (Throwable th7) {
                                th = th7;
                                cursor4 = query;
                                cursor3 = cursor4;
                                if (cursor3 != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e20) {
                            e = e20;
                            list4 = list2;
                        }
                        if (query.moveToFirst()) {
                            while (true) {
                                try {
                                    arrayList2.add((zzhs) ((zzhr) X6.W(zzhs.zzk(), query.getBlob(0))).zzbc());
                                    cursor4 = query;
                                } catch (zzmr e21) {
                                    cursor4 = query;
                                    try {
                                        try {
                                            F03.f33578a.a().t().c("Failed to parse stored NO_DATA mode event, appId", C3392x2.x(str), e21);
                                        } catch (SQLiteException e22) {
                                            e = e22;
                                            F03.f33578a.a().o().c("Error flushing NO_DATA mode events. appId", C3392x2.x(str), e);
                                            arrayList2 = Collections.EMPTY_LIST;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor3 = cursor4;
                                        if (cursor3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!cursor4.moveToNext()) {
                                    break;
                                } else {
                                    query = cursor4;
                                }
                            }
                            cursor4.close();
                            try {
                                int delete = u02.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(a10)});
                                C3376v2 w10 = F03.f33578a.a().w();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 34);
                                sb2.append("Pruned ");
                                sb2.append(delete);
                                sb2.append(" NO_DATA mode events. appId");
                                w10.b(sb2.toString(), str);
                            } catch (SQLiteException e23) {
                                e = e23;
                                cursor4 = null;
                                F03.f33578a.a().o().c("Error flushing NO_DATA mode events. appId", C3392x2.x(str), e);
                                arrayList2 = Collections.EMPTY_LIST;
                            }
                            it = list4.iterator();
                            boolean z14 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                zzic zzicVar2 = (zzic) ((zzid) pair.first).zzcl();
                                if (z14 && !arrayList2.isEmpty()) {
                                    List zzb = zzicVar2.zzb();
                                    zzicVar2.zzi();
                                    zzicVar2.zzh(arrayList2);
                                    zzicVar2.zzh(zzb);
                                    z14 = false;
                                }
                                zzhh zzb2 = zzho.zzb();
                                zzgf R10 = D0().R(str);
                                ArrayList arrayList3 = new ArrayList();
                                if (R10 != null) {
                                    for (zzfu zzfuVar : R10.zza()) {
                                        zzhk zza = zzhl.zza();
                                        int zzb3 = zzfuVar.zzb();
                                        S3 s32 = S3.UNINITIALIZED;
                                        Iterator it5 = it;
                                        int i16 = zzb3 - 1;
                                        boolean z15 = z14;
                                        if (i16 == 1) {
                                            list5 = arrayList2;
                                            i11 = 3;
                                            i12 = 2;
                                        } else if (i16 != 2) {
                                            list5 = arrayList2;
                                            i11 = 3;
                                            i12 = i16 != 3 ? i16 != 4 ? 1 : 5 : 4;
                                        } else {
                                            list5 = arrayList2;
                                            i11 = 3;
                                            i12 = 3;
                                        }
                                        zza.zza(i12);
                                        int zzd = zzfuVar.zzd() - 1;
                                        if (zzd == 1) {
                                            i11 = 2;
                                        } else if (zzd != 2) {
                                            i11 = 1;
                                        }
                                        zza.zzb(i11);
                                        arrayList3.add((zzhl) zza.zzbc());
                                        z14 = z15;
                                        it = it5;
                                        arrayList2 = list5;
                                    }
                                }
                                Iterator it6 = it;
                                boolean z16 = z14;
                                List list6 = arrayList2;
                                zzb2.zza(arrayList3);
                                zzicVar2.zzaQ(zzb2);
                                arrayList.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair.second));
                                z14 = z16;
                                it = it6;
                                arrayList2 = list6;
                            }
                            list2 = arrayList;
                        } else {
                            cursor4 = query;
                            cursor4.close();
                            it = list4.iterator();
                            boolean z142 = true;
                            while (it.hasNext()) {
                            }
                            list2 = arrayList;
                        }
                    } else {
                        List asList = Arrays.asList(((String) AbstractC3209a2.f33881j1.b(null)).split(","));
                        for (Pair pair2 : list2) {
                            try {
                                F0().t(((Long) pair2.second).longValue());
                                for (zzhs zzhsVar : ((zzid) pair2.first).zzc()) {
                                    if (asList.contains(zzhsVar.zzd())) {
                                        if (zzhsVar.zzd().equals("_f") || zzhsVar.zzd().equals("_v")) {
                                            zzhr zzhrVar = (zzhr) zzhsVar.zzcl();
                                            K0();
                                            X6.o(zzhrVar, "_dac", 1L);
                                            zzhsVar = (zzhs) zzhrVar.zzbc();
                                        }
                                        C3357t F04 = F0();
                                        F04.h();
                                        F04.j();
                                        AbstractC3191o.m(zzhsVar);
                                        AbstractC3191o.g(str);
                                        C3298l3 c3298l3 = F04.f33578a;
                                        c3298l3.a().w().b("Caching events in NO_DATA mode", zzhsVar);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put(PublisherMetadata.APP_ID, str);
                                        contentValues.put("name", zzhsVar.zzd());
                                        contentValues.put(EventKeys.DATA, zzhsVar.zzcc());
                                        contentValues.put("timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                        try {
                                            if (F04.u0().insert("no_data_mode_events", null, contentValues) == j11) {
                                                c3298l3.a().o().b("Failed to insert NO_DATA mode event (got -1). appId", C3392x2.x(str));
                                            }
                                        } catch (SQLiteException e24) {
                                            F04.f33578a.a().o().c("Error storing NO_DATA mode event. appId", C3392x2.x(str), e24);
                                        }
                                    }
                                }
                            } catch (SQLiteException unused) {
                                a().t().b("Failed handling NO_DATA mode bundles. appId", str);
                            }
                        }
                        list2 = Collections.EMPTY_LIST;
                    }
                }
                if (list2.isEmpty()) {
                    return;
                }
            }
            V3 g10 = g(str);
            U3 u32 = U3.AD_STORAGE;
            if (g10.o(u32)) {
                Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        str3 = null;
                        break;
                    }
                    zzid zzidVar4 = (zzid) ((Pair) it7.next()).first;
                    if (!zzidVar4.zzG().isEmpty()) {
                        str3 = zzidVar4.zzG();
                        break;
                    }
                }
                if (str3 != null) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= list2.size()) {
                            break;
                        }
                        zzid zzidVar5 = (zzid) ((Pair) list2.get(i17)).first;
                        if (!zzidVar5.zzG().isEmpty() && !zzidVar5.zzG().equals(str3)) {
                            list2 = list2.subList(0, i17);
                            break;
                        }
                        i17++;
                    }
                }
            }
            zzhz zzh = zzib.zzh();
            int size = list2.size();
            List arrayList4 = new ArrayList(list2.size());
            boolean z17 = B0().k(str) && g(str).o(u32);
            boolean o10 = g(str).o(u32);
            boolean o11 = g(str).o(U3.ANALYTICS_STORAGE);
            zzrb.zza();
            boolean H10 = B0().H(str, AbstractC3209a2.f33827N0);
            F6 f62 = this.f33644j;
            E6 i18 = f62.i(str);
            int i19 = 0;
            while (i19 < size) {
                boolean z18 = o10;
                zzic zzicVar3 = (zzic) ((zzid) ((Pair) list2.get(i19)).first).zzcl();
                int i20 = size;
                arrayList4.add((Long) ((Pair) list2.get(i19)).second);
                B0().A();
                boolean z19 = z17;
                boolean z20 = o11;
                zzicVar3.zzO(133005L);
                zzicVar3.zzs(j10);
                this.f33646l.c();
                zzicVar3.zzae(false);
                if (!z19) {
                    zzicVar3.zzan();
                }
                if (!z18) {
                    zzicVar3.zzR();
                    zzicVar3.zzU();
                }
                if (!z20) {
                    zzicVar3.zzX();
                }
                x(str, zzicVar3);
                if (!H10) {
                    zzicVar3.zzav();
                }
                if (!z20) {
                    zzicVar3.zzag();
                }
                String zzP = zzicVar3.zzP();
                if (TextUtils.isEmpty(zzP) || zzP.equals("00000000-0000-0000-0000-000000000000")) {
                    ArrayList arrayList5 = new ArrayList(zzicVar3.zzb());
                    Iterator it8 = arrayList5.iterator();
                    z11 = z19;
                    Long l10 = null;
                    Long l11 = null;
                    boolean z21 = false;
                    boolean z22 = false;
                    while (it8.hasNext()) {
                        List list7 = list2;
                        zzhs zzhsVar2 = (zzhs) it8.next();
                        boolean z23 = H10;
                        int i21 = i19;
                        if ("_fx".equals(zzhsVar2.zzd())) {
                            it8.remove();
                            H10 = z23;
                            list2 = list7;
                            i19 = i21;
                            z21 = true;
                        } else if ("_f".equals(zzhsVar2.zzd())) {
                            K0();
                            zzhw r10 = X6.r(zzhsVar2, "_pfo");
                            if (r10 != null) {
                                l10 = Long.valueOf(r10.zzf());
                            }
                            K0();
                            zzhw r11 = X6.r(zzhsVar2, "_uwa");
                            if (r11 != null) {
                                l11 = Long.valueOf(r11.zzf());
                            }
                            H10 = z23;
                            list2 = list7;
                            i19 = i21;
                        } else {
                            H10 = z23;
                            list2 = list7;
                            i19 = i21;
                        }
                        z22 = true;
                    }
                    list3 = list2;
                    z12 = H10;
                    i10 = i19;
                    if (z21) {
                        zzicVar3.zzi();
                        zzicVar3.zzh(arrayList5);
                    }
                    if (z22) {
                        w(zzicVar3.zzK(), true, l10, l11);
                    }
                } else {
                    z11 = z19;
                    list3 = list2;
                    z12 = H10;
                    i10 = i19;
                }
                if (zzicVar3.zzc() != 0) {
                    if (B0().H(str, AbstractC3209a2.f33807D0)) {
                        zzicVar3.zzas(K0().T(((zzid) zzicVar3.zzbc()).zzcc()));
                    }
                    zzis d10 = i18.d();
                    if (d10 != null) {
                        zzicVar3.zzaN(d10);
                    }
                    zzh.zze(zzicVar3);
                }
                i19 = i10 + 1;
                o11 = z20;
                o10 = z18;
                size = i20;
                z17 = z11;
                H10 = z12;
                list2 = list3;
            }
            if (zzh.zzb() == 0) {
                q(arrayList4);
                A(false, 204, null, null, str, Collections.EMPTY_LIST);
                return;
            }
            zzib zzibVar = (zzib) zzh.zzbc();
            List arrayList6 = new ArrayList();
            boolean z24 = i18.c() == EnumC3252f5.SGTM_CLIENT;
            if (i18.c() == EnumC3252f5.SGTM) {
                z10 = z24;
            } else {
                if (!z24) {
                    obj = null;
                    if (E0().m()) {
                        return;
                    }
                    if (Log.isLoggable(a().z(), 2)) {
                        obj = K0().K(zzibVar);
                    }
                    K0();
                    byte[] zzcc = zzibVar.zzcc();
                    q(arrayList4);
                    this.f33643i.f33940i.b(j10);
                    a().w().d("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcc.length), obj);
                    this.f33655u = true;
                    E0().n(str, i18, zzibVar, new H6(this, str, arrayList6));
                    return;
                }
                z10 = true;
            }
            Iterator it9 = ((zzib) zzh.zzbc()).zza().iterator();
            while (true) {
                if (it9.hasNext()) {
                    if (((zzid) it9.next()).zzY()) {
                        str2 = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            zzib zzibVar2 = (zzib) zzh.zzbc();
            b().h();
            O0();
            zzhz zzi = zzib.zzi(zzibVar2);
            if (!TextUtils.isEmpty(str2)) {
                zzi.zzi(str2);
            }
            String x10 = D0().x(str);
            if (!TextUtils.isEmpty(x10)) {
                zzi.zzj(x10);
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it10 = zzibVar2.zza().iterator();
            while (it10.hasNext()) {
                zzic zzaF = zzid.zzaF((zzid) it10.next());
                zzaF.zzan();
                arrayList7.add((zzid) zzaF.zzbc());
            }
            zzi.zzg();
            zzi.zzf(arrayList7);
            a().w().b("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str2) ? "null" : zzi.zzh());
            zzib zzibVar3 = (zzib) zzi.zzbc();
            if (TextUtils.isEmpty(str2)) {
                obj = null;
            } else {
                zzib zzibVar4 = (zzib) zzh.zzbc();
                b().h();
                O0();
                zzhz zzh2 = zzib.zzh();
                a().w().b("[sgtm] Processing Google Signal, sgtmJoinId:", str2);
                zzh2.zzi(str2);
                for (zzid zzidVar6 : zzibVar4.zza()) {
                    zzic zzaE = zzid.zzaE();
                    zzaE.zzam(zzidVar6.zzZ());
                    zzaE.zzaJ(zzidVar6.zzav());
                    zzh2.zze(zzaE);
                }
                zzib zzibVar5 = (zzib) zzh2.zzbc();
                String x11 = f62.f34418b.D0().x(str);
                if (TextUtils.isEmpty(x11)) {
                    obj = null;
                    e62 = new E6((String) AbstractC3209a2.f33900s.b(null), Collections.EMPTY_MAP, z10 ? EnumC3252f5.GOOGLE_SIGNAL_PENDING : EnumC3252f5.GOOGLE_SIGNAL, null);
                } else {
                    Uri parse = Uri.parse((String) AbstractC3209a2.f33900s.b(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    String authority = parse.getAuthority();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(x11).length() + 1 + String.valueOf(authority).length());
                    sb3.append(x11);
                    sb3.append(".");
                    sb3.append(authority);
                    buildUpon.authority(sb3.toString());
                    obj = null;
                    e62 = new E6(buildUpon.build().toString(), Collections.EMPTY_MAP, z10 ? EnumC3252f5.GOOGLE_SIGNAL_PENDING : EnumC3252f5.GOOGLE_SIGNAL, null);
                }
                arrayList6.add(Pair.create(zzibVar5, e62));
            }
            if (z10) {
                zzhz zzhzVar = (zzhz) zzibVar3.zzcl();
                for (int i22 = 0; i22 < zzibVar3.zzb(); i22++) {
                    zzic zzicVar4 = (zzic) zzibVar3.zzc(i22).zzcl();
                    zzicVar4.zzt();
                    zzicVar4.zzaO(j10);
                    zzhzVar.zzd(i22, zzicVar4);
                }
                arrayList6.add(Pair.create((zzib) zzhzVar.zzbc(), i18));
                q(arrayList4);
                A(false, 204, null, null, str, arrayList6);
                if (t(str, i18.a())) {
                    a().w().b("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    W(this.f33646l.d(), intent);
                    return;
                }
                return;
            }
            zzibVar = zzibVar3;
            if (E0().m()) {
            }
        }
    }

    public final void s0(boolean z10) {
        R();
    }

    public final boolean t(String str, String str2) {
        D2 J02 = F0().J0(str);
        if (J02 != null && N0().P(str, J02.l0())) {
            this.f33629E.remove(str2);
            return true;
        }
        Q6 q62 = (Q6) this.f33629E.get(str2);
        if (q62 == null) {
            return true;
        }
        return q62.b();
    }

    public final void t0(String str, C3268h5 c3268h5) {
        b().h();
        String str2 = this.f33631G;
        if (str2 == null || str2.equals(str) || c3268h5 != null) {
            this.f33631G = str;
            this.f33630F = c3268h5;
        }
    }

    public final void u(String str) {
        zzib d10;
        b().h();
        O0();
        this.f33656v = true;
        try {
            C3298l3 c3298l3 = this.f33646l;
            c3298l3.c();
            Boolean x10 = c3298l3.J().x();
            if (x10 == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (x10.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f33649o > 0) {
                R();
            } else if (!E0().m()) {
                a().w().a("Network not connected, ignoring upload request");
                R();
            } else if (F0().p(str)) {
                C3357t F02 = F0();
                AbstractC3191o.g(str);
                F02.h();
                F02.j();
                List o10 = F02.o(str, zzoo.g(EnumC3252f5.GOOGLE_SIGNAL), 1);
                V6 v62 = o10.isEmpty() ? null : (V6) o10.get(0);
                if (v62 != null && (d10 = v62.d()) != null) {
                    a().w().d("[sgtm] Uploading data from upload queue. appId, type, url", str, v62.f(), v62.e());
                    byte[] zzcc = d10.zzcc();
                    if (Log.isLoggable(a().z(), 2)) {
                        a().w().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcc.length), K0().K(d10));
                    }
                    E6 a10 = v62.a();
                    this.f33655u = true;
                    E0().n(str, a10, d10, new I6(this, str, v62));
                }
            } else {
                a().w().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f33656v = false;
            S();
        } catch (Throwable th2) {
            this.f33656v = false;
            S();
            throw th2;
        }
    }

    public final /* synthetic */ void u0(T6 t62) {
        b().h();
        this.f33645k = new O2(this);
        C3357t c3357t = new C3357t(this);
        c3357t.k();
        this.f33637c = c3357t;
        B0().t((InterfaceC3278j) AbstractC3191o.m(this.f33635a));
        C3221b6 c3221b6 = new C3221b6(this);
        c3221b6.k();
        this.f33643i = c3221b6;
        C3238e c3238e = new C3238e(this);
        c3238e.k();
        this.f33640f = c3238e;
        C3228c5 c3228c5 = new C3228c5(this);
        c3228c5.k();
        this.f33642h = c3228c5;
        C3404y6 c3404y6 = new C3404y6(this);
        c3404y6.k();
        this.f33639e = c3404y6;
        this.f33638d = new F2(this);
        if (this.f33652r != this.f33653s) {
            a().o().c("Not all upload components initialized", Integer.valueOf(this.f33652r), Integer.valueOf(this.f33653s));
        }
        this.f33647m.set(true);
        a().w().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(String str, int i10, Throwable th2, byte[] bArr, V6 v62) {
        b().h();
        O0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.f33655u = false;
                S();
                throw th3;
            }
        }
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str2.substring(0, Math.min(32, str2.length()));
            C3376v2 t10 = a().t();
            Integer valueOf = Integer.valueOf(i10);
            if (th2 == null) {
                th2 = substring;
            }
            t10.d("Network upload failed. Will retry later. appId, status, error", str, valueOf, th2);
            F0().w(Long.valueOf(v62.c()));
            R();
            this.f33655u = false;
            S();
        }
        if (th2 == null) {
            F0().q(Long.valueOf(v62.c()));
            a().w().c("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i10));
            if (E0().m() && F0().p(str)) {
                u(str);
            } else {
                R();
            }
            this.f33655u = false;
            S();
        }
        String str22 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str22.substring(0, Math.min(32, str22.length()));
        C3376v2 t102 = a().t();
        Integer valueOf2 = Integer.valueOf(i10);
        if (th2 == null) {
        }
        t102.d("Network upload failed. Will retry later. appId, status, error", str, valueOf2, th2);
        F0().w(Long.valueOf(v62.c()));
        R();
        this.f33655u = false;
        S();
    }

    public final void w(String str, boolean z10, Long l10, Long l11) {
        D2 J02 = F0().J0(str);
        if (J02 != null) {
            J02.e0(z10);
            J02.g0(l10);
            J02.i0(l11);
            if (J02.A()) {
                F0().K0(J02, false, false);
            }
        }
    }

    public final void x(String str, zzic zzicVar) {
        int X10;
        int indexOf;
        Set F10 = D0().F(str);
        if (F10 != null) {
            zzicVar.zzaw(F10);
        }
        if (D0().J(str)) {
            zzicVar.zzG();
        }
        if (D0().K(str)) {
            String zzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzicVar.zzE(zzD.substring(0, indexOf));
            }
        }
        if (D0().L(str) && (X10 = X6.X(zzicVar, "_id")) != -1) {
            zzicVar.zzr(X10);
        }
        if (D0().M(str)) {
            zzicVar.zzan();
        }
        if (D0().N(str)) {
            zzicVar.zzX();
            if (g(str).o(U3.ANALYTICS_STORAGE)) {
                Map map = this.f33628D;
                P6 p62 = (P6) map.get(str);
                if (p62 == null || p62.f33594b + B0().D(str, AbstractC3209a2.f33886l0) < e().b()) {
                    p62 = new P6(this, (byte[]) null);
                    map.put(str, p62);
                }
                zzicVar.zzax(p62.f33593a);
            }
        }
        if (D0().O(str)) {
            zzicVar.zzav();
        }
    }

    public final /* synthetic */ C3298l3 x0() {
        return this.f33646l;
    }

    public final void y(zzic zzicVar, O6 o62) {
        for (int i10 = 0; i10 < zzicVar.zzc(); i10++) {
            zzhr zzhrVar = (zzhr) zzicVar.zzd(i10).zzcl();
            Iterator it = zzhrVar.zza().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((zzhw) it.next()).zzb())) {
                    if (o62.f33582a.zzar() >= B0().E(o62.f33582a.zzA(), AbstractC3209a2.f33889m0)) {
                        int E10 = B0().E(o62.f33582a.zzA(), AbstractC3209a2.f33915z0);
                        String str = null;
                        if (E10 <= 0) {
                            if (B0().H(o62.f33582a.zzA(), AbstractC3209a2.f33837S0)) {
                                str = N0().l0();
                                zzhv zzn = zzhw.zzn();
                                zzn.zzb("_tu");
                                zzn.zzd(str);
                                zzhrVar.zzf((zzhw) zzn.zzbc());
                            }
                            zzhv zzn2 = zzhw.zzn();
                            zzn2.zzb("_tr");
                            zzn2.zzf(1L);
                            zzhrVar.zzf((zzhw) zzn2.zzbc());
                            zzoh I10 = K0().I(o62.f33582a.zzA(), zzicVar, zzhrVar, str);
                            if (I10 != null) {
                                a().w().c("Generated trigger URI. appId, uri", o62.f33582a.zzA(), I10.f34439a);
                                F0().K(o62.f33582a.zzA(), I10);
                                Deque deque = this.f33651q;
                                if (!deque.contains(o62.f33582a.zzA())) {
                                    deque.add(o62.f33582a.zzA());
                                }
                            }
                        } else if (F0().L0(h(), o62.f33582a.zzA(), false, false, false, false, false, false, true).f34212g > E10) {
                            zzhv zzn3 = zzhw.zzn();
                            zzn3.zzb("_tnr");
                            zzn3.zzf(1L);
                            zzhrVar.zzf((zzhw) zzn3.zzbc());
                        } else {
                            if (B0().H(o62.f33582a.zzA(), AbstractC3209a2.f33837S0)) {
                                str = N0().l0();
                                zzhv zzn4 = zzhw.zzn();
                                zzn4.zzb("_tu");
                                zzn4.zzd(str);
                                zzhrVar.zzf((zzhw) zzn4.zzbc());
                            }
                            zzhv zzn5 = zzhw.zzn();
                            zzn5.zzb("_tr");
                            zzn5.zzf(1L);
                            zzhrVar.zzf((zzhw) zzn5.zzbc());
                            zzoh I11 = K0().I(o62.f33582a.zzA(), zzicVar, zzhrVar, str);
                            if (I11 != null) {
                                a().w().c("Generated trigger URI. appId, uri", o62.f33582a.zzA(), I11.f34439a);
                                F0().K(o62.f33582a.zzA(), I11);
                                Deque deque2 = this.f33651q;
                                if (!deque2.contains(o62.f33582a.zzA())) {
                                    deque2.add(o62.f33582a.zzA());
                                }
                            }
                        }
                    }
                    zzicVar.zze(i10, (zzhs) zzhrVar.zzbc());
                }
            }
        }
    }

    public final /* synthetic */ Deque y0() {
        return this.f33651q;
    }

    public final void z(String str, zzhv zzhvVar, Bundle bundle, String str2) {
        List b10 = K9.f.b("_o", "_sn", "_sc", "_si");
        long y10 = (b7.N(zzhvVar.zza()) || b7.N(str)) ? B0().y(str2, true) : B0().x(str2, true);
        long codePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        b7 N02 = N0();
        String zza = zzhvVar.zza();
        B0();
        String q10 = N02.q(zza, 40, true);
        if (codePointCount <= y10 || b10.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", N0().q(zzhvVar.zzc(), B0().y(str2, true), true));
            return;
        }
        a().t().c("Param value is too long; discarded. Name, value length", q10, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", q10);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    public final /* synthetic */ void z0(long j10) {
        this.f33633I = j10;
    }
}
