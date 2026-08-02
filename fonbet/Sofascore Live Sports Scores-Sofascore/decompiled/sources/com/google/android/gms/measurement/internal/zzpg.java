package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.app.Service;
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
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzagr;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgx;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.b1l;
import defpackage.bf3;
import defpackage.dh0;
import defpackage.dhn;
import defpackage.dno;
import defpackage.emn;
import defpackage.fjn;
import defpackage.h5o;
import defpackage.hkn;
import defpackage.iso;
import defpackage.lnb;
import defpackage.m1p;
import defpackage.mgo;
import defpackage.muo;
import defpackage.nwo;
import defpackage.o1p;
import defpackage.ohn;
import defpackage.ozo;
import defpackage.p0p;
import defpackage.pko;
import defpackage.pq7;
import defpackage.t9n;
import defpackage.ugn;
import defpackage.x6k;
import defpackage.xjo;
import defpackage.z1p;
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
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpg implements iso {
    public static volatile zzpg K;
    public final HashMap B;
    public final HashMap C;
    public final HashMap D;
    public zzlu F;
    public String G;
    public ozo H;
    public long I;
    public final zzht a;
    public final zzgz b;
    public hkn c;
    public pko d;
    public zzok e;
    public t9n f;
    public final zzpk g;
    public nwo h;
    public zznn i;
    public zzhk k;
    public final zzic l;
    public boolean n;
    public long o;
    public ArrayList p;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public FileLock w;
    public FileChannel x;
    public ArrayList y;
    public ArrayList z;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final LinkedList q = new LinkedList();
    public final HashMap E = new HashMap();
    public final muo J = new muo(this, 3);
    public long A = -1;
    public final zzou j = new zzou(this);

    public zzpg(zzph zzphVar) {
        this.l = zzic.r(zzphVar.a, null, null, null);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.S();
        this.g = zzpkVar;
        zzgz zzgzVar = new zzgz(this);
        zzgzVar.S();
        this.b = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.S();
        this.a = zzhtVar;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        d().Z(new dno(this, zzphVar));
    }

    public static zzpg C(Service service) {
        Preconditions.i(service.getApplicationContext());
        if (K == null) {
            synchronized (zzpg.class) {
                try {
                    if (K == null) {
                        K = new zzpg(new zzph(service));
                    }
                } finally {
                }
            }
        }
        return K;
    }

    public static final void D(zzhr zzhrVar, int i, String str) {
        List p = zzhrVar.p();
        for (int i2 = 0; i2 < p.size(); i2++) {
            if ("_err".equals(((zzhw) p.get(i2)).z())) {
                return;
            }
        }
        zzhv K2 = zzhw.K();
        K2.p("_err");
        K2.r(i);
        zzhw zzhwVar = (zzhw) K2.m();
        zzhv K3 = zzhw.K();
        K3.p("_ev");
        K3.q(str);
        zzhw zzhwVar2 = (zzhw) K3.m();
        zzhrVar.s(zzhwVar);
        zzhrVar.s(zzhwVar2);
    }

    public static final void E(zzhr zzhrVar, String str) {
        List p = zzhrVar.p();
        for (int i = 0; i < p.size(); i++) {
            if (str.equals(((zzhw) p.get(i)).z())) {
                zzhrVar.u(i);
                return;
            }
        }
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.b);
    }

    public static final void U(p0p p0pVar) {
        if (p0pVar == null) {
            a70.r("Upload Component not created");
        } else {
            if (p0pVar.d) {
                return;
            }
            a70.r("Component not initialized: ".concat(String.valueOf(p0pVar.getClass())));
        }
    }

    public static final Boolean V(zzr zzrVar) {
        Boolean bool = zzrVar.p;
        String str = zzrVar.C;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((zzji) b1l.i(str).b).ordinal();
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

    public final void A(xjo xjoVar) {
        dh0 dh0Var;
        dh0 dh0Var2;
        d().Q();
        if (TextUtils.isEmpty(xjoVar.H())) {
            String E = xjoVar.E();
            Preconditions.i(E);
            B(E, 204, null, null, null);
            return;
        }
        String E2 = xjoVar.E();
        Preconditions.i(E2);
        b().o.b(E2, "Fetching remote configuration");
        zzht zzhtVar = this.a;
        U(zzhtVar);
        com.google.android.gms.internal.measurement.zzgl c0 = zzhtVar.c0(E2);
        U(zzhtVar);
        zzhtVar.Q();
        String str = (String) zzhtVar.o.get(E2);
        if (c0 != null) {
            if (TextUtils.isEmpty(str)) {
                dh0Var2 = null;
            } else {
                dh0Var2 = new dh0(0);
                dh0Var2.put("If-Modified-Since", str);
            }
            U(zzhtVar);
            zzhtVar.Q();
            String str2 = (String) zzhtVar.p.get(E2);
            if (!TextUtils.isEmpty(str2)) {
                if (dh0Var2 == null) {
                    dh0Var2 = new dh0(0);
                }
                dh0Var2.put("If-None-Match", str2);
            }
            dh0Var = dh0Var2;
        } else {
            dh0Var = null;
        }
        this.t = true;
        zzgz zzgzVar = this.b;
        U(zzgzVar);
        fjn fjnVar = new fjn(this, 28);
        zzic zzicVar = (zzic) zzgzVar.b;
        zzgzVar.Q();
        zzgzVar.R();
        zzou zzouVar = zzgzVar.c.j;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) zzfy.f.a(null)).encodedAuthority((String) zzfy.g.a(null)).path("config/app/".concat(String.valueOf(xjoVar.H()))).appendQueryParameter(L6.H, "android");
        ((zzic) zzouVar.b).d.W();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.c0(new ugn(zzgzVar, xjoVar.E(), url, (byte[]) null, dh0Var, fjnVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(xjoVar.E()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x017f, B:26:0x0080, B:30:0x00e2, B:31:0x00ce, B:32:0x00e7, B:36:0x00fe, B:37:0x0114, B:39:0x012e, B:40:0x0149, B:42:0x0152, B:44:0x0158, B:45:0x015c, B:47:0x0165, B:49:0x0174, B:50:0x017c, B:51:0x013a, B:52:0x0105, B:54:0x010e), top: B:7:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x017f, B:26:0x0080, B:30:0x00e2, B:31:0x00ce, B:32:0x00e7, B:36:0x00fe, B:37:0x0114, B:39:0x012e, B:40:0x0149, B:42:0x0152, B:44:0x0158, B:45:0x015c, B:47:0x0165, B:49:0x0174, B:50:0x017c, B:51:0x013a, B:52:0x0105, B:54:0x010e), top: B:7:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x017f, B:26:0x0080, B:30:0x00e2, B:31:0x00ce, B:32:0x00e7, B:36:0x00fe, B:37:0x0114, B:39:0x012e, B:40:0x0149, B:42:0x0152, B:44:0x0158, B:45:0x015c, B:47:0x0165, B:49:0x0174, B:50:0x017c, B:51:0x013a, B:52:0x0105, B:54:0x010e), top: B:7:0x0045, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:8:0x0045, B:16:0x0063, B:17:0x017f, B:26:0x0080, B:30:0x00e2, B:31:0x00ce, B:32:0x00e7, B:36:0x00fe, B:37:0x0114, B:39:0x012e, B:40:0x0149, B:42:0x0152, B:44:0x0158, B:45:0x015c, B:47:0x0165, B:49:0x0174, B:50:0x017c, B:51:0x013a, B:52:0x0105, B:54:0x010e), top: B:7:0x0045, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzgz zzgzVar = this.b;
        d().Q();
        m0();
        Preconditions.f(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.t = false;
                O();
                throw th2;
            }
        }
        zzgs zzgsVar = b().o;
        Integer valueOf = Integer.valueOf(bArr.length);
        zzgsVar.b(valueOf, "onConfigFetched. Response size");
        if (f0().b0(null, zzfy.e1)) {
            zzpk zzpkVar = this.g;
            U(zzpkVar);
            zzpkVar.W(map);
        }
        hkn hknVar = this.c;
        U(hknVar);
        hknVar.E0();
        try {
            hkn hknVar2 = this.c;
            U(hknVar2);
            xjo U0 = hknVar2.U0(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (U0 == null) {
                    b().j.b(zzgu.U(str), "App does not exist in onConfigFetched. appId");
                } else {
                    zzht zzhtVar = this.a;
                    if (z || i == 404) {
                        k0();
                        String b0 = zzpk.b0("Last-Modified", map);
                        k0();
                        String b02 = zzpk.b0(Command.HTTP_HEADER_ETAG, map);
                        if (i != 404 && i != 304) {
                            U(zzhtVar);
                            zzhtVar.e0(str, b0, b02, bArr);
                            ((DefaultClock) f()).getClass();
                            U0.f(System.currentTimeMillis());
                            hkn hknVar3 = this.c;
                            U(hknVar3);
                            hknVar3.V0(U0, false);
                            if (i != 404) {
                                b().l.b(str, "Config not found. Using empty config. appId");
                            } else {
                                b().o.c(Integer.valueOf(i), valueOf, "Successfully fetched config. Got network response. code, size");
                            }
                            U(zzgzVar);
                            if (zzgzVar.U() || !M()) {
                                U(zzgzVar);
                                if (zzgzVar.U()) {
                                    hkn hknVar4 = this.c;
                                    U(hknVar4);
                                    if (hknVar4.W(U0.E())) {
                                        t(U0.E());
                                    }
                                }
                                N();
                            } else {
                                q();
                            }
                        }
                        U(zzhtVar);
                        if (zzhtVar.c0(str) == null) {
                            U(zzhtVar);
                            zzhtVar.e0(str, null, null, null);
                        }
                        ((DefaultClock) f()).getClass();
                        U0.f(System.currentTimeMillis());
                        hkn hknVar32 = this.c;
                        U(hknVar32);
                        hknVar32.V0(U0, false);
                        if (i != 404) {
                        }
                        U(zzgzVar);
                        if (zzgzVar.U()) {
                        }
                        U(zzgzVar);
                        if (zzgzVar.U()) {
                        }
                        N();
                    } else {
                        ((DefaultClock) f()).getClass();
                        U0.g(System.currentTimeMillis());
                        hkn hknVar5 = this.c;
                        U(hknVar5);
                        hknVar5.V0(U0, false);
                        b().o.c(Integer.valueOf(i), th, "Fetching config failed. code, error");
                        U(zzhtVar);
                        zzhtVar.Q();
                        zzhtVar.o.put(str, null);
                        zzhe zzheVar = this.i.j;
                        ((DefaultClock) f()).getClass();
                        zzheVar.b(System.currentTimeMillis());
                        if (i == 503 || i == 429) {
                            zzhe zzheVar2 = this.i.h;
                            ((DefaultClock) f()).getClass();
                            zzheVar2.b(System.currentTimeMillis());
                        }
                        N();
                    }
                }
                hkn hknVar6 = this.c;
                U(hknVar6);
                hknVar6.F0();
                this.t = false;
                O();
            }
            if (th == null) {
                z = true;
                if (U0 == null) {
                }
                hkn hknVar62 = this.c;
                U(hknVar62);
                hknVar62.F0();
                this.t = false;
                O();
            }
            z = false;
            if (U0 == null) {
            }
            hkn hknVar622 = this.c;
            U(hknVar622);
            hknVar622.F0();
            this.t = false;
            O();
        } finally {
            hkn hknVar7 = this.c;
            U(hknVar7);
            hknVar7.G0();
        }
    }

    public final int F(String str, ohn ohnVar) {
        zzji U;
        zzht zzhtVar = this.a;
        com.google.android.gms.internal.measurement.zzgf m0 = zzhtVar.m0(str);
        zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
        if (m0 == null) {
            ohnVar.j(zzjkVar, dhn.FAILSAFE);
            return 1;
        }
        hkn hknVar = this.c;
        U(hknVar);
        xjo U0 = hknVar.U0(str);
        if (U0 == null || ((zzji) b1l.i(U0.s()).b) != zzji.POLICY || (U = zzhtVar.U(str, zzjkVar)) == zzji.UNINITIALIZED) {
            ohnVar.j(zzjkVar, dhn.REMOTE_DEFAULT);
            if (zzhtVar.l0(str, zzjkVar)) {
                return 0;
            }
        } else {
            ohnVar.j(zzjkVar, dhn.REMOTE_ENFORCED_DEFAULT);
            if (U == zzji.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(zzhs zzhsVar) {
        Serializable i0;
        HashMap hashMap = new HashMap();
        k0();
        HashMap hashMap2 = new HashMap();
        for (zzhw zzhwVar : zzhsVar.A()) {
            if (zzhwVar.z().startsWith("gad_") && (i0 = zzpk.i0(zzhwVar)) != null) {
                hashMap2.put(zzhwVar.z(), i0);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void H() {
        d().Q();
        if (this.q.isEmpty()) {
            return;
        }
        ozo ozoVar = this.H;
        int i = 2;
        if (ozoVar == null) {
            ozo ozoVar2 = new ozo(this, this.l, i);
            this.H = ozoVar2;
            ozoVar = ozoVar2;
        }
        if (ozoVar.c != 0) {
            return;
        }
        ((DefaultClock) f()).getClass();
        long max = Math.max(0L, ((Integer) zzfy.A0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.I));
        b().o.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        ozo ozoVar3 = this.H;
        if (ozoVar3 == null) {
            ozo ozoVar4 = new ozo(this, this.l, i);
            this.H = ozoVar4;
            ozoVar3 = ozoVar4;
        }
        ozoVar3.b(max);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c6 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d5 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05d2 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05ee A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0603 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0526 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0306 A[Catch: all -> 0x011f, TRY_ENTER, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x039b A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f6 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x045e A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x048e A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ad A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b50 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0b9c A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0bbd A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c0 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022d A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0264 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0284 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0299 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d6 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x007a, B:14:0x00a6, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0742, B:25:0x0134, B:28:0x014a, B:30:0x0150, B:32:0x0156, B:34:0x0169, B:37:0x0176, B:39:0x0181, B:41:0x018f, B:43:0x0195, B:46:0x01a0, B:48:0x01ae, B:50:0x01c0, B:53:0x01de, B:55:0x01e4, B:57:0x01f4, B:59:0x0202, B:61:0x0212, B:63:0x021d, B:68:0x0220, B:70:0x022d, B:72:0x0237, B:73:0x0245, B:75:0x0264, B:77:0x026e, B:79:0x0284, B:80:0x028e, B:83:0x0299, B:84:0x02a3, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04c6, B:103:0x04c9, B:105:0x04d5, B:108:0x04e8, B:110:0x04f9, B:112:0x0505, B:114:0x05c5, B:116:0x05d2, B:118:0x05d8, B:120:0x05de, B:122:0x05ee, B:123:0x05f1, B:124:0x05fd, B:126:0x0603, B:127:0x060f, B:129:0x0615, B:131:0x0625, B:133:0x062f, B:134:0x0644, B:136:0x064a, B:137:0x0665, B:139:0x066b, B:141:0x0689, B:143:0x0696, B:145:0x06c3, B:146:0x069e, B:148:0x06ae, B:152:0x06cd, B:153:0x06ee, B:155:0x06f4, B:158:0x0707, B:163:0x0714, B:164:0x0718, B:166:0x071e, B:168:0x072e, B:174:0x0526, B:176:0x0536, B:179:0x0549, B:181:0x055b, B:183:0x0567, B:185:0x0574, B:188:0x0582, B:190:0x058c, B:192:0x0596, B:195:0x05a1, B:197:0x05a7, B:201:0x05b7, B:199:0x05c2, B:204:0x02fc, B:207:0x0306, B:209:0x0314, B:211:0x0365, B:212:0x0336, B:214:0x0344, B:220:0x036c, B:222:0x039b, B:223:0x03bf, B:225:0x03f6, B:226:0x03fc, B:229:0x0408, B:231:0x043d, B:232:0x0458, B:234:0x045e, B:236:0x046c, B:238:0x0480, B:239:0x0474, B:247:0x0487, B:250:0x048e, B:251:0x04ad, B:258:0x075f, B:260:0x0771, B:262:0x077a, B:264:0x07ac, B:265:0x0782, B:267:0x078b, B:269:0x0791, B:271:0x079d, B:273:0x07a7, B:280:0x07af, B:281:0x07bb, B:284:0x07c3, B:287:0x07d5, B:288:0x07e0, B:290:0x07e8, B:291:0x0815, B:293:0x0831, B:294:0x0844, B:296:0x0860, B:297:0x0873, B:298:0x088f, B:300:0x0895, B:302:0x08ad, B:303:0x08bb, B:305:0x08cb, B:307:0x08d9, B:310:0x08dc, B:312:0x0926, B:314:0x092c, B:315:0x0957, B:317:0x095f, B:318:0x097d, B:320:0x0983, B:321:0x0997, B:323:0x09ae, B:325:0x09c8, B:327:0x09da, B:329:0x09e4, B:330:0x09e7, B:332:0x0a42, B:333:0x0a55, B:336:0x0a5d, B:339:0x0a7c, B:341:0x0a95, B:343:0x0aaa, B:345:0x0aaf, B:347:0x0ab3, B:349:0x0ab7, B:351:0x0ac1, B:352:0x0aca, B:354:0x0ace, B:356:0x0ad4, B:357:0x0adf, B:358:0x0aed, B:361:0x0d4f, B:365:0x0af7, B:430:0x0b13, B:368:0x0b2e, B:370:0x0b50, B:371:0x0b58, B:373:0x0b5e, B:377:0x0b70, B:380:0x0b86, B:382:0x0b9c, B:383:0x0bbd, B:385:0x0bc9, B:387:0x0be1, B:388:0x0c22, B:393:0x0c3e, B:395:0x0c49, B:397:0x0c4d, B:399:0x0c51, B:401:0x0c55, B:402:0x0c61, B:403:0x0c66, B:405:0x0c6c, B:407:0x0c82, B:408:0x0c87, B:410:0x0d4c, B:412:0x0cc6, B:414:0x0ccc, B:417:0x0ce0, B:419:0x0cfc, B:420:0x0d03, B:422:0x0d40, B:423:0x0cd1, B:433:0x0b19, B:435:0x0d5b, B:437:0x0d69, B:438:0x0d7d, B:439:0x0d85, B:441:0x0d8b, B:444:0x0da4, B:446:0x0db6, B:447:0x0e67, B:449:0x0e6d, B:451:0x0e84, B:454:0x0e8f, B:456:0x0e99, B:458:0x0ebf, B:460:0x0ecf, B:461:0x0ed9, B:463:0x0ee7, B:464:0x0ef1, B:465:0x0efc, B:467:0x0f0e, B:470:0x0f15, B:471:0x0f56, B:472:0x0f24, B:474:0x0f32, B:475:0x0f3f, B:476:0x0f65, B:478:0x0f78, B:479:0x0f96, B:485:0x0f83, B:486:0x0dcf, B:488:0x0dd5, B:490:0x0de7, B:491:0x0dee, B:496:0x0e06, B:497:0x0e0d, B:499:0x0e58, B:500:0x0e5f, B:501:0x0e5c, B:502:0x0e0a, B:504:0x0deb, B:506:0x093c, B:508:0x0942, B:510:0x0948, B:511:0x0870, B:512:0x0841, B:513:0x07ee, B:515:0x07f4, B:519:0x0f9f), top: B:2:0x0019, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(long j, String str) {
        boolean z;
        int i;
        Long l;
        zzic zzicVar;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        zzic zzicVar3;
        xjo U0;
        Long l2;
        long parseLong;
        zzic zzicVar4;
        int i2;
        long j2;
        pq7 pq7Var;
        long y;
        String str2;
        String str3;
        int i3;
        String str4;
        zzal f0;
        zzfx zzfxVar;
        boolean g0;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        String str5;
        String str6;
        int i5;
        boolean z5;
        zzhv zzhvVar;
        com.google.android.gms.internal.measurement.zzic zzicVar5;
        int i6;
        int i7;
        int i8;
        String str7;
        String str8;
        int i9;
        int i10;
        int i11;
        String str9;
        long X;
        String str10;
        zzpg zzpgVar = this;
        String str11 = "1";
        String str12 = "_ai";
        String str13 = "purchase";
        String str14 = "items";
        Long l3 = 1L;
        zzpgVar.h0().E0();
        try {
            pq7 pq7Var2 = new pq7(zzpgVar);
            zzpgVar.h0().C0(str, j, zzpgVar.A, pq7Var2);
            pq7 pq7Var3 = pq7Var2;
            ArrayList arrayList = (ArrayList) pq7Var3.d;
            if (arrayList == null || arrayList.isEmpty()) {
                h0().F0();
                z = false;
            } else {
                com.google.android.gms.internal.measurement.zzic zzicVar6 = (com.google.android.gms.internal.measurement.zzic) ((zzid) pq7Var3.b).q();
                zzicVar6.k();
                ((zzid) zzicVar6.b).k0();
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                boolean z6 = false;
                zzhr zzhrVar = null;
                zzhr zzhrVar2 = null;
                boolean z7 = false;
                while (true) {
                    int size = ((ArrayList) pq7Var3.d).size();
                    i = i15;
                    l = l3;
                    zzicVar = zzpgVar.l;
                    zzicVar2 = zzicVar6;
                    int i16 = i12;
                    if (i14 >= size) {
                        break;
                    }
                    zzhr zzhrVar3 = (zzhr) ((zzhs) ((ArrayList) pq7Var3.d).get(i14)).q();
                    int i17 = i14;
                    if (zzpgVar.g0().f0(((zzid) pq7Var3.b).y(), zzhrVar3.v())) {
                        zzpgVar.b().j.c(zzgu.U(((zzid) pq7Var3.b).y()), zzicVar.j.a(zzhrVar3.v()), "Dropping blocked raw event. appId");
                        if (!str11.equals(zzpgVar.g0().zza(((zzid) pq7Var3.b).y(), "measurement.upload.blacklist_internal")) && !str11.equals(zzpgVar.g0().zza(((zzid) pq7Var3.b).y(), "measurement.upload.blacklist_public")) && !"_err".equals(zzhrVar3.v())) {
                            zzpgVar.l0();
                            zzpp.i0(zzpgVar.J, ((zzid) pq7Var3.b).y(), 11, "_ev", zzhrVar3.v(), 0);
                        }
                        str2 = str11;
                        str7 = str12;
                        str6 = str13;
                        str8 = str14;
                        i15 = i;
                        zzicVar5 = zzicVar2;
                        i9 = i17;
                        i8 = i13;
                        i6 = i16;
                    } else {
                        String v = zzhrVar3.v();
                        str2 = str11;
                        String str15 = str14;
                        if (v.equals(str13) || v.equals("_iap") || v.equals("ecommerce_purchase")) {
                            str3 = "_et";
                            i3 = i13;
                            str4 = "_fr";
                        } else {
                            i3 = i13;
                            str3 = "_et";
                            str4 = "_fr";
                            if (zzpgVar.f0().b0(null, zzfy.f1) && v.equals("in_app_purchase")) {
                            }
                            if (zzhrVar3.v().equals(zzlt.b(str12, zzjm.f, zzjm.a))) {
                                zzhrVar3.w(str12);
                                zzpgVar.b().o.a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(zzpgVar.b().W(), 5)) {
                                    for (int i18 = 0; i18 < zzhrVar3.q(); i18++) {
                                        if ("ad_platform".equals(zzhrVar3.r(i18).z()) && !zzhrVar3.r(i18).B().isEmpty() && InneractiveMediationNameConsts.ADMOB.equalsIgnoreCase(zzhrVar3.r(i18).B())) {
                                            zzpgVar.b().l.a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            f0 = zzpgVar.f0();
                            zzfxVar = zzfy.f1;
                            if (f0.b0(null, zzfxVar) && zzhrVar3.v().equals("in_app_purchase")) {
                                zzhrVar3.w("_iap");
                                zzpgVar.b().o.a("Renaming in_app_purchase to _iap");
                            }
                            g0 = zzpgVar.g0().g0(((zzid) pq7Var3.b).y(), zzhrVar3.v());
                            if (zzpgVar.f0().b0(null, zzfxVar) && "_iap".equals(zzhrVar3.v())) {
                                g0 = zzpgVar.y(zzhrVar3);
                                String y2 = ((zzid) pq7Var3.b).y();
                                if ("_iap".equals(zzhrVar3.v())) {
                                    zzpgVar.L(zzhrVar3, U3.i.X, y2);
                                    zzpgVar.L(zzhrVar3, "price", y2);
                                }
                                if (!"_iap".equals(zzhrVar3.v())) {
                                    ArrayList arrayList2 = new ArrayList(zzhrVar3.p());
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= arrayList2.size()) {
                                            zzhv K2 = zzhw.K();
                                            K2.p("quantity");
                                            K2.r(1L);
                                            zzhrVar3.s((zzhw) K2.m());
                                            break;
                                        }
                                        if ("quantity".equals(((zzhw) arrayList2.get(i19)).z())) {
                                            break;
                                        }
                                        i19++;
                                    }
                                }
                            }
                            if (!g0) {
                                zzpgVar.k0();
                                String v2 = zzhrVar3.v();
                                Preconditions.f(v2);
                                if (v2.hashCode() != 95027 || !v2.equals("_ui")) {
                                    str5 = str12;
                                    str6 = str13;
                                    z4 = false;
                                    if (z4) {
                                        zzpgVar.y(zzhrVar3);
                                    }
                                    if ("_e".equals(zzhrVar3.v())) {
                                        zzicVar5 = zzicVar2;
                                        i6 = i16;
                                        if ("_vs".equals(zzhrVar3.v())) {
                                            zzpgVar.k0();
                                            if (zzpk.a0((zzhs) zzhrVar3.m(), str3) == null) {
                                                if (zzhrVar != null && Math.abs(zzhrVar.x() - zzhrVar3.x()) <= 1000) {
                                                    zzhr zzhrVar4 = (zzhr) zzhrVar.clone();
                                                    if (zzpgVar.K(zzhrVar4, zzhrVar3)) {
                                                        i7 = i3;
                                                        zzicVar5.j0(i7, zzhrVar4);
                                                        zzhrVar = null;
                                                        zzhrVar2 = null;
                                                    }
                                                }
                                                i7 = i3;
                                                zzhrVar2 = zzhrVar3;
                                                i6 = i;
                                            }
                                            i7 = i3;
                                        } else {
                                            i7 = i3;
                                            if (("_f".equals(zzhrVar3.v()) || "_v".equals(zzhrVar3.v())) && ("_f".equals(zzhrVar3.v()) || "_v".equals(zzhrVar3.v()))) {
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 >= zzhrVar3.q()) {
                                                        break;
                                                    }
                                                    zzhw r = zzhrVar3.r(i20);
                                                    if ("_elt".equals(r.z())) {
                                                        zzhrVar3.z(r.D());
                                                        zzhrVar3.u(i20);
                                                        break;
                                                    }
                                                    i20++;
                                                }
                                            }
                                        }
                                        if (zzpgVar.f0().b0(null, zzfy.e1)) {
                                        }
                                        if (zzhrVar3.q() == 0) {
                                        }
                                        i9 = i17;
                                        ((ArrayList) pq7Var3.d).set(i9, (zzhs) zzhrVar3.m());
                                        zzicVar5.k0(zzhrVar3);
                                        i15 = i + 1;
                                    } else {
                                        zzpgVar.k0();
                                        if (zzpk.a0((zzhs) zzhrVar3.m(), str4) == null) {
                                            if (zzhrVar2 != null && Math.abs(zzhrVar2.x() - zzhrVar3.x()) <= 1000) {
                                                zzhr zzhrVar5 = (zzhr) zzhrVar2.clone();
                                                if (zzpgVar.K(zzhrVar3, zzhrVar5)) {
                                                    zzicVar5 = zzicVar2;
                                                    i6 = i16;
                                                    zzicVar5.j0(i6, zzhrVar5);
                                                    i7 = i3;
                                                    zzhrVar = null;
                                                    zzhrVar2 = null;
                                                    if (zzpgVar.f0().b0(null, zzfy.e1) && zzhrVar3.C() && !zzhrVar3.A()) {
                                                        X = zzpgVar.k0().X(zzhrVar3.D());
                                                        if (X != 0) {
                                                            zzhrVar3.B(X);
                                                        }
                                                        zzhrVar3.k();
                                                        ((zzhs) zzhrVar3.b).y(0L);
                                                    }
                                                    if (zzhrVar3.q() == 0) {
                                                        zzpgVar.k0();
                                                        Bundle Z = zzpk.Z(zzhrVar3.p());
                                                        int i21 = 0;
                                                        while (i21 < zzhrVar3.q()) {
                                                            zzhw r2 = zzhrVar3.r(i21);
                                                            String str16 = str15;
                                                            if (!r2.z().equals(str16) || r2.I().isEmpty()) {
                                                                i10 = i7;
                                                                i11 = i21;
                                                                str9 = str5;
                                                                if (!r2.z().equals(str16)) {
                                                                    zzpgVar.x(zzhrVar3.v(), (zzhv) r2.q(), Z, ((zzid) pq7Var3.b).y());
                                                                }
                                                            } else {
                                                                String y3 = ((zzid) pq7Var3.b).y();
                                                                zzaef I = r2.I();
                                                                Bundle[] bundleArr = new Bundle[I.size()];
                                                                i10 = i7;
                                                                int i22 = 0;
                                                                while (i22 < I.size()) {
                                                                    zzhw zzhwVar = (zzhw) I.get(i22);
                                                                    zzpgVar.k0();
                                                                    Bundle Z2 = zzpk.Z(zzhwVar.I());
                                                                    Iterator<E> it = zzhwVar.I().iterator();
                                                                    while (it.hasNext()) {
                                                                        zzpgVar.x(zzhrVar3.v(), (zzhv) ((zzhw) it.next()).q(), Z2, y3);
                                                                        i21 = i21;
                                                                        str5 = str5;
                                                                    }
                                                                    bundleArr[i22] = Z2;
                                                                    i22++;
                                                                    i21 = i21;
                                                                    str5 = str5;
                                                                }
                                                                i11 = i21;
                                                                str9 = str5;
                                                                Z.putParcelableArray(str16, bundleArr);
                                                            }
                                                            i21 = i11 + 1;
                                                            str15 = str16;
                                                            i7 = i10;
                                                            str5 = str9;
                                                        }
                                                        i8 = i7;
                                                        str7 = str5;
                                                        str8 = str15;
                                                        zzhrVar3.k();
                                                        ((zzhs) zzhrVar3.b).S();
                                                        zzpk k0 = zzpgVar.k0();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (String str17 : Z.keySet()) {
                                                            zzhv K3 = zzhw.K();
                                                            K3.p(str17);
                                                            Object obj = Z.get(str17);
                                                            if (obj != null) {
                                                                k0.o0(K3, obj);
                                                                arrayList3.add((zzhw) K3.m());
                                                            }
                                                        }
                                                        Iterator it2 = arrayList3.iterator();
                                                        while (it2.hasNext()) {
                                                            zzhrVar3.s((zzhw) it2.next());
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        str7 = str5;
                                                        str8 = str15;
                                                    }
                                                    i9 = i17;
                                                    ((ArrayList) pq7Var3.d).set(i9, (zzhs) zzhrVar3.m());
                                                    zzicVar5.k0(zzhrVar3);
                                                    i15 = i + 1;
                                                }
                                            }
                                            zzicVar5 = zzicVar2;
                                            i6 = i16;
                                            zzhrVar = zzhrVar3;
                                            i7 = i;
                                            if (zzpgVar.f0().b0(null, zzfy.e1)) {
                                                X = zzpgVar.k0().X(zzhrVar3.D());
                                                if (X != 0) {
                                                }
                                                zzhrVar3.k();
                                                ((zzhs) zzhrVar3.b).y(0L);
                                            }
                                            if (zzhrVar3.q() == 0) {
                                            }
                                            i9 = i17;
                                            ((ArrayList) pq7Var3.d).set(i9, (zzhs) zzhrVar3.m());
                                            zzicVar5.k0(zzhrVar3);
                                            i15 = i + 1;
                                        } else {
                                            zzicVar5 = zzicVar2;
                                            i6 = i16;
                                            i7 = i3;
                                            if (zzpgVar.f0().b0(null, zzfy.e1)) {
                                            }
                                            if (zzhrVar3.q() == 0) {
                                            }
                                            i9 = i17;
                                            ((ArrayList) pq7Var3.d).set(i9, (zzhs) zzhrVar3.m());
                                            zzicVar5.k0(zzhrVar3);
                                            i15 = i + 1;
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            z3 = false;
                            for (i4 = 0; i4 < zzhrVar3.q(); i4++) {
                                if ("_c".equals(zzhrVar3.r(i4).z())) {
                                    zzhv zzhvVar2 = (zzhv) zzhrVar3.r(i4).q();
                                    zzhvVar2.r(1L);
                                    zzhw zzhwVar2 = (zzhw) zzhvVar2.m();
                                    zzhrVar3.k();
                                    ((zzhs) zzhrVar3.b).P(i4, zzhwVar2);
                                    z2 = true;
                                } else if ("_r".equals(zzhrVar3.r(i4).z())) {
                                    zzhv zzhvVar3 = (zzhv) zzhrVar3.r(i4).q();
                                    zzhvVar3.r(1L);
                                    zzhw zzhwVar3 = (zzhw) zzhvVar3.m();
                                    zzhrVar3.k();
                                    ((zzhs) zzhrVar3.b).P(i4, zzhwVar3);
                                    z3 = true;
                                }
                            }
                            if (z2 && g0) {
                                z4 = g0;
                                zzpgVar.b().o.b(zzicVar.j.a(zzhrVar3.v()), "Marking event as conversion");
                                zzhv K4 = zzhw.K();
                                K4.p("_c");
                                str5 = str12;
                                str6 = str13;
                                K4.r(1L);
                                zzhrVar3.t(K4);
                            } else {
                                z4 = g0;
                                str5 = str12;
                                str6 = str13;
                            }
                            if (!z3) {
                                zzpgVar.b().o.b(zzicVar.j.a(zzhrVar3.v()), "Marking event as real-time");
                                zzhv K5 = zzhw.K();
                                K5.p("_r");
                                K5.r(1L);
                                zzhrVar3.t(K5);
                            }
                            if (zzpgVar.h0().W0(zzpgVar.g(), ((zzid) pq7Var3.b).y(), false, true, false, false).e > zzpgVar.f0().Z(((zzid) pq7Var3.b).y(), zzfy.p)) {
                                E(zzhrVar3, "_r");
                            } else {
                                z7 = true;
                            }
                            if (zzpp.Q0(zzhrVar3.v()) && z4 && zzpgVar.h0().W0(zzpgVar.g(), ((zzid) pq7Var3.b).y(), true, false, false, false).c > zzpgVar.f0().Z(((zzid) pq7Var3.b).y(), zzfy.o)) {
                                zzpgVar.b().j.b(zzgu.U(((zzid) pq7Var3.b).y()), "Too many conversions. Not logging as conversion. appId");
                                z5 = false;
                                zzhvVar = null;
                                int i23 = -1;
                                for (i5 = 0; i5 < zzhrVar3.q(); i5++) {
                                    zzhw r3 = zzhrVar3.r(i5);
                                    if ("_c".equals(r3.z())) {
                                        zzhvVar = (zzhv) r3.q();
                                        i23 = i5;
                                    } else if ("_err".equals(r3.z())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (zzhvVar != null) {
                                        zzhrVar3.u(i23);
                                    } else {
                                        zzhvVar = null;
                                    }
                                }
                                if (zzhvVar == null) {
                                    zzhv zzhvVar4 = (zzhv) zzhvVar.clone();
                                    zzhvVar4.p("_err");
                                    zzhvVar4.r(10L);
                                    zzhw zzhwVar4 = (zzhw) zzhvVar4.m();
                                    zzhrVar3.k();
                                    ((zzhs) zzhrVar3.b).P(i23, zzhwVar4);
                                } else {
                                    zzpgVar.b().g.b(zzgu.U(((zzid) pq7Var3.b).y()), "Did not find conversion parameter. appId");
                                }
                            }
                            if (z4) {
                            }
                            if ("_e".equals(zzhrVar3.v())) {
                            }
                        }
                        zzhv K6 = zzhw.K();
                        K6.p("_ct");
                        if (!z6) {
                            String y4 = ((zzid) pq7Var3.b).y();
                            if (zzpgVar.R(y4, str13) && zzpgVar.R(y4, "_iap") && zzpgVar.R(y4, "ecommerce_purchase")) {
                                str10 = "new";
                                K6.q(str10);
                                zzhrVar3.s((zzhw) K6.m());
                                z6 = true;
                                if (zzhrVar3.v().equals(zzlt.b(str12, zzjm.f, zzjm.a))) {
                                }
                                f0 = zzpgVar.f0();
                                zzfxVar = zzfy.f1;
                                if (f0.b0(null, zzfxVar)) {
                                    zzhrVar3.w("_iap");
                                    zzpgVar.b().o.a("Renaming in_app_purchase to _iap");
                                }
                                g0 = zzpgVar.g0().g0(((zzid) pq7Var3.b).y(), zzhrVar3.v());
                                if (zzpgVar.f0().b0(null, zzfxVar)) {
                                    g0 = zzpgVar.y(zzhrVar3);
                                    String y22 = ((zzid) pq7Var3.b).y();
                                    if ("_iap".equals(zzhrVar3.v())) {
                                    }
                                    if (!"_iap".equals(zzhrVar3.v())) {
                                    }
                                }
                                if (!g0) {
                                }
                                z2 = false;
                                z3 = false;
                                while (i4 < zzhrVar3.q()) {
                                }
                                if (z2) {
                                }
                                z4 = g0;
                                str5 = str12;
                                str6 = str13;
                                if (!z3) {
                                }
                                if (zzpgVar.h0().W0(zzpgVar.g(), ((zzid) pq7Var3.b).y(), false, true, false, false).e > zzpgVar.f0().Z(((zzid) pq7Var3.b).y(), zzfy.p)) {
                                }
                                if (zzpp.Q0(zzhrVar3.v())) {
                                    zzpgVar.b().j.b(zzgu.U(((zzid) pq7Var3.b).y()), "Too many conversions. Not logging as conversion. appId");
                                    z5 = false;
                                    zzhvVar = null;
                                    int i232 = -1;
                                    while (i5 < zzhrVar3.q()) {
                                    }
                                    if (z5) {
                                    }
                                    if (zzhvVar == null) {
                                    }
                                }
                                if (z4) {
                                }
                                if ("_e".equals(zzhrVar3.v())) {
                                }
                            }
                        }
                        str10 = "returning";
                        K6.q(str10);
                        zzhrVar3.s((zzhw) K6.m());
                        z6 = true;
                        if (zzhrVar3.v().equals(zzlt.b(str12, zzjm.f, zzjm.a))) {
                        }
                        f0 = zzpgVar.f0();
                        zzfxVar = zzfy.f1;
                        if (f0.b0(null, zzfxVar)) {
                        }
                        g0 = zzpgVar.g0().g0(((zzid) pq7Var3.b).y(), zzhrVar3.v());
                        if (zzpgVar.f0().b0(null, zzfxVar)) {
                        }
                        if (!g0) {
                        }
                        z2 = false;
                        z3 = false;
                        while (i4 < zzhrVar3.q()) {
                        }
                        if (z2) {
                        }
                        z4 = g0;
                        str5 = str12;
                        str6 = str13;
                        if (!z3) {
                        }
                        if (zzpgVar.h0().W0(zzpgVar.g(), ((zzid) pq7Var3.b).y(), false, true, false, false).e > zzpgVar.f0().Z(((zzid) pq7Var3.b).y(), zzfy.p)) {
                        }
                        if (zzpp.Q0(zzhrVar3.v())) {
                        }
                        if (z4) {
                        }
                        if ("_e".equals(zzhrVar3.v())) {
                        }
                    }
                    i14 = i9 + 1;
                    str13 = str6;
                    zzicVar6 = zzicVar5;
                    i12 = i6;
                    str14 = str8;
                    l3 = l;
                    i13 = i8;
                    str11 = str2;
                    str12 = str7;
                }
                int i24 = i;
                int i25 = 0;
                long j3 = 0;
                while (i25 < i24) {
                    zzhs e2 = ((zzid) zzicVar2.b).e2(i25);
                    if ("_e".equals(e2.D())) {
                        zzpgVar.k0();
                        if (zzpk.a0(e2, "_fr") != null) {
                            zzicVar2.l0(i25);
                            i24--;
                            i25--;
                            i25++;
                        }
                    }
                    zzpgVar.k0();
                    zzhw a0 = zzpk.a0(e2, "_et");
                    if (a0 != null) {
                        Long valueOf = a0.C() ? Long.valueOf(a0.D()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j3 += valueOf.longValue();
                        }
                    }
                    i25++;
                }
                zzpgVar.J(zzicVar2, j3, false);
                Iterator it3 = zzicVar2.h0().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((zzhs) it3.next()).D())) {
                        zzpgVar.h0().K0(zzicVar2.w(), "_se");
                        break;
                    }
                }
                if (zzpk.C0(zzicVar2, "_sid") >= 0) {
                    zzpgVar.J(zzicVar2, j3, true);
                } else {
                    int C0 = zzpk.C0(zzicVar2, "_se");
                    if (C0 >= 0) {
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).o0(C0);
                        zzpgVar.b().g.b(zzgu.U(((zzid) pq7Var3.b).y()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String y5 = ((zzid) pq7Var3.b).y();
                zzpgVar.d().Q();
                zzpgVar.m0();
                xjo U02 = zzpgVar.h0().U0(y5);
                if (U02 == null) {
                    zzpgVar.b().g.b(zzgu.U(y5), "Cannot fix consent fields without appInfo. appId");
                } else {
                    zzpgVar.m(U02, zzicVar2);
                }
                String y6 = ((zzid) pq7Var3.b).y();
                zzpgVar.d().Q();
                zzpgVar.m0();
                xjo U03 = zzpgVar.h0().U0(y6);
                if (U03 == null) {
                    zzpgVar.b().j.b(zzgu.U(y6), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    zzpgVar.n(U03, zzicVar2);
                }
                zzicVar2.k();
                ((zzid) zzicVar2.b).r0(Long.MAX_VALUE);
                zzicVar2.k();
                ((zzid) zzicVar2.b).s0(Long.MIN_VALUE);
                for (int i26 = 0; i26 < zzicVar2.i0(); i26++) {
                    zzhs e22 = ((zzid) zzicVar2.b).e2(i26);
                    if (e22.F() < ((zzid) zzicVar2.b).l2()) {
                        long F = e22.F();
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).r0(F);
                    }
                    if (e22.F() > ((zzid) zzicVar2.b).n2()) {
                        long F2 = e22.F();
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).s0(F2);
                    }
                }
                zzicVar2.X();
                zzjl zzjlVar = zzjl.c;
                zzjl j4 = zzpgVar.c(((zzid) pq7Var3.b).y()).j(zzjl.c(100, ((zzid) pq7Var3.b).E0()));
                zzjl z0 = zzpgVar.h0().z0(((zzid) pq7Var3.b).y());
                zzpgVar.h0().y0(((zzid) pq7Var3.b).y(), j4);
                zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                if (!j4.i(zzjkVar) && z0.i(zzjkVar)) {
                    zzpgVar.h0().I0(((zzid) pq7Var3.b).y());
                } else if (j4.i(zzjkVar) && !z0.i(zzjkVar)) {
                    zzpgVar.h0().J0(((zzid) pq7Var3.b).y());
                }
                zzjk zzjkVar2 = zzjk.AD_STORAGE;
                if (!j4.i(zzjkVar2)) {
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).J1();
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).L1();
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).c1();
                }
                if (!j4.i(zzjkVar)) {
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).N1();
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).j1();
                }
                zzaif.a();
                if (zzpgVar.f0().b0(((zzid) pq7Var3.b).y(), zzfy.O0)) {
                    zzpgVar.l0();
                    if (zzpp.s0((String) zzfy.q0.a(null), ((zzid) pq7Var3.b).y()) && zzpgVar.c(((zzid) pq7Var3.b).y()).i(zzjkVar2) && ((zzid) pq7Var3.b).J0()) {
                        zzpgVar.w(zzicVar2, pq7Var3);
                    }
                }
                zzicVar2.k();
                ((zzid) zzicVar2.b).V1();
                zzicVar2.U(zzpgVar.j0().U(zzicVar2.w(), zzicVar2.h0(), Collections.unmodifiableList(((zzid) zzicVar2.b).f2()), Long.valueOf(((zzid) zzicVar2.b).l2()), Long.valueOf(((zzid) zzicVar2.b).n2()), !j4.i(zzjkVar)));
                if (zzpgVar.f0().S(((zzid) pq7Var3.b).y())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom P0 = zzpgVar.l0().P0();
                    int i27 = 0;
                    while (i27 < zzicVar2.i0()) {
                        zzhr zzhrVar6 = (zzhr) ((zzid) zzicVar2.b).e2(i27).q();
                        if (zzhrVar6.v().equals("_ep")) {
                            zzpgVar.k0();
                            String str18 = (String) zzpk.c0((zzhs) zzhrVar6.m(), "_en");
                            emn emnVar = (emn) hashMap.get(str18);
                            if (emnVar == null) {
                                hkn h0 = zzpgVar.h0();
                                String y7 = ((zzid) pq7Var3.b).y();
                                Preconditions.i(str18);
                                emnVar = h0.q0("events", y7, str18);
                                if (emnVar != null) {
                                    hashMap.put(str18, emnVar);
                                }
                            }
                            if (emnVar == null || emnVar.i != null) {
                                l2 = l;
                            } else {
                                Long l4 = emnVar.j;
                                if (l4 != null && l4.longValue() > 1) {
                                    zzpgVar.k0();
                                    zzpk.Y(zzhrVar6, "_sr", l4);
                                }
                                Boolean bool = emnVar.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    zzpgVar.k0();
                                    l2 = l;
                                    zzpk.Y(zzhrVar6, "_efs", l2);
                                }
                                arrayList4.add((zzhs) zzhrVar6.m());
                            }
                            zzicVar2.j0(i27, zzhrVar6);
                            zzicVar4 = zzicVar;
                        } else {
                            l2 = l;
                            zzht g02 = zzpgVar.g0();
                            String y8 = ((zzid) pq7Var3.b).y();
                            String zza = g02.zza(y8, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza)) {
                                try {
                                    parseLong = Long.parseLong(zza);
                                } catch (NumberFormatException e) {
                                    ((zzic) g02.b).b().j.c(zzgu.U(y8), e, "Unable to parse timezone offset. appId");
                                }
                                l0();
                                long x = zzhrVar6.x();
                                long j5 = parseLong * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                                long j6 = (x + j5) / 86400000;
                                zzhs zzhsVar = (zzhs) zzhrVar6.m();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (zzhw zzhwVar5 : zzhsVar.A()) {
                                        zzicVar4 = zzicVar;
                                        if (!"_dbg".equals(zzhwVar5.z())) {
                                            zzicVar = zzicVar4;
                                        } else if (l2.equals(Long.valueOf(zzhwVar5.D()))) {
                                            i2 = 1;
                                            if (i2 > 0) {
                                            }
                                        } else {
                                            i2 = g0().i0(((zzid) pq7Var3.b).y(), zzhrVar6.v());
                                            if (i2 > 0) {
                                                b().j.c(zzhrVar6.v(), Integer.valueOf(i2), "Sample rate must be positive. event, rate");
                                                arrayList4.add((zzhs) zzhrVar6.m());
                                                zzicVar2.j0(i27, zzhrVar6);
                                            } else {
                                                emn emnVar2 = (emn) hashMap.get(zzhrVar6.v());
                                                if (emnVar2 == null) {
                                                    j2 = j5;
                                                    emnVar2 = h0().q0("events", ((zzid) pq7Var3.b).y(), zzhrVar6.v());
                                                    if (emnVar2 == null) {
                                                        b().j.c(((zzid) pq7Var3.b).y(), zzhrVar6.v(), "Event being bundled has no eventAggregate. appId, eventName");
                                                        emnVar2 = new emn(((zzid) pq7Var3.b).y(), zzhrVar6.v(), 1L, 1L, 1L, zzhrVar6.x(), 0L, null, null, null, null);
                                                    }
                                                } else {
                                                    j2 = j5;
                                                }
                                                k0();
                                                Long l5 = (Long) zzpk.c0((zzhs) zzhrVar6.m(), "_eid");
                                                boolean z8 = l5 != null;
                                                if (i2 == 1) {
                                                    arrayList4.add((zzhs) zzhrVar6.m());
                                                    if (z8 && (emnVar2.i != null || emnVar2.j != null || emnVar2.k != null)) {
                                                        hashMap.put(zzhrVar6.v(), emnVar2.b(null, null, null));
                                                    }
                                                    zzicVar2.j0(i27, zzhrVar6);
                                                } else {
                                                    if (P0.nextInt(i2) == 0) {
                                                        k0();
                                                        Long valueOf2 = Long.valueOf(i2);
                                                        zzpk.Y(zzhrVar6, "_sr", valueOf2);
                                                        arrayList4.add((zzhs) zzhrVar6.m());
                                                        if (z8) {
                                                            emnVar2 = emnVar2.b(null, null, valueOf2);
                                                        }
                                                        pq7Var = pq7Var3;
                                                        hashMap.put(zzhrVar6.v(), new emn(emnVar2.a, emnVar2.b, emnVar2.c, emnVar2.d, emnVar2.e, emnVar2.f, zzhrVar6.x(), Long.valueOf(j6), emnVar2.i, emnVar2.j, emnVar2.k));
                                                    } else {
                                                        pq7Var = pq7Var3;
                                                        Long l6 = emnVar2.h;
                                                        if (l6 != null) {
                                                            y = l6.longValue();
                                                        } else {
                                                            l0();
                                                            y = (j2 + zzhrVar6.y()) / 86400000;
                                                        }
                                                        if (y != j6) {
                                                            k0();
                                                            zzpk.Y(zzhrVar6, "_efs", l2);
                                                            k0();
                                                            Long valueOf3 = Long.valueOf(i2);
                                                            zzpk.Y(zzhrVar6, "_sr", valueOf3);
                                                            arrayList4.add((zzhs) zzhrVar6.m());
                                                            if (z8) {
                                                                emnVar2 = emnVar2.b(Boolean.TRUE, null, valueOf3);
                                                            }
                                                            hashMap.put(zzhrVar6.v(), new emn(emnVar2.a, emnVar2.b, emnVar2.c, emnVar2.d, emnVar2.e, emnVar2.f, zzhrVar6.x(), Long.valueOf(j6), emnVar2.i, emnVar2.j, emnVar2.k));
                                                        } else if (z8) {
                                                            hashMap.put(zzhrVar6.v(), emnVar2.b(null, l5, null));
                                                            zzicVar2.j0(i27, zzhrVar6);
                                                            i27++;
                                                            zzpgVar = this;
                                                            l = l2;
                                                            pq7Var3 = pq7Var;
                                                            zzicVar = zzicVar4;
                                                        }
                                                    }
                                                    zzicVar2.j0(i27, zzhrVar6);
                                                    i27++;
                                                    zzpgVar = this;
                                                    l = l2;
                                                    pq7Var3 = pq7Var;
                                                    zzicVar = zzicVar4;
                                                }
                                            }
                                        }
                                    }
                                }
                                zzicVar4 = zzicVar;
                                i2 = g0().i0(((zzid) pq7Var3.b).y(), zzhrVar6.v());
                                if (i2 > 0) {
                                }
                            }
                            parseLong = 0;
                            l0();
                            long x2 = zzhrVar6.x();
                            long j52 = parseLong * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                            long j62 = (x2 + j52) / 86400000;
                            zzhs zzhsVar2 = (zzhs) zzhrVar6.m();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            zzicVar4 = zzicVar;
                            i2 = g0().i0(((zzid) pq7Var3.b).y(), zzhrVar6.v());
                            if (i2 > 0) {
                            }
                        }
                        pq7Var = pq7Var3;
                        i27++;
                        zzpgVar = this;
                        l = l2;
                        pq7Var3 = pq7Var;
                        zzicVar = zzicVar4;
                    }
                    zzicVar3 = zzicVar;
                    pq7 pq7Var4 = pq7Var3;
                    if (arrayList4.size() < zzicVar2.i0()) {
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).k0();
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).j0(arrayList4);
                    }
                    Iterator it4 = hashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        h0().r0("events", (emn) ((Map.Entry) it4.next()).getValue());
                    }
                    pq7Var3 = pq7Var4;
                } else {
                    zzicVar3 = zzicVar;
                }
                String y9 = ((zzid) pq7Var3.b).y();
                xjo U04 = h0().U0(y9);
                if (U04 == null) {
                    b().g.b(zzgu.U(((zzid) pq7Var3.b).y()), "Bundling raw events w/o app info. appId");
                } else if (zzicVar2.i0() > 0) {
                    zzhz zzhzVar = U04.a.g;
                    zzic.m(zzhzVar);
                    zzhzVar.Q();
                    long j7 = U04.i;
                    if (j7 != 0) {
                        zzicVar2.p(j7);
                    } else {
                        zzicVar2.q();
                    }
                    zzhz zzhzVar2 = U04.a.g;
                    zzic.m(zzhzVar2);
                    zzhzVar2.Q();
                    long j8 = U04.h;
                    if (j8 != 0) {
                        j7 = j8;
                    }
                    if (j7 != 0) {
                        zzicVar2.o0(j7);
                    } else {
                        zzicVar2.p0();
                    }
                    U04.h(zzicVar2.i0());
                    zzhz zzhzVar3 = U04.a.g;
                    zzic.m(zzhzVar3);
                    zzhzVar3.Q();
                    int i28 = (int) U04.F;
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).t1(i28);
                    zzhz zzhzVar4 = U04.a.g;
                    zzic.m(zzhzVar4);
                    zzhzVar4.Q();
                    zzicVar2.F((int) U04.g);
                    U04.M(((zzid) zzicVar2.b).l2());
                    U04.N(((zzid) zzicVar2.b).n2());
                    String v3 = U04.v();
                    if (v3 != null) {
                        zzicVar2.P(v3);
                    } else {
                        zzicVar2.Q();
                    }
                    h0().V0(U04, false);
                }
                if (zzicVar2.i0() > 0) {
                    zzicVar3.getClass();
                    if (f0().b0(((zzid) pq7Var3.b).y(), zzfy.j1)) {
                        String w = zzicVar2.w();
                        if (!TextUtils.isEmpty(w) && (U0 = h0().U0(w)) != null) {
                            long a = ((DefaultClock) f()).a();
                            zzhz zzhzVar5 = U0.a.g;
                            zzic.m(zzhzVar5);
                            zzhzVar5.Q();
                            if (a - U0.J >= f0().Y(w, zzfy.B0)) {
                                List x0 = h0().x0("");
                                if (!x0.isEmpty()) {
                                    zzicVar2.k();
                                    ((zzid) zzicVar2.b).c2(x0);
                                }
                                List x02 = h0().x0(w);
                                if (!x02.isEmpty()) {
                                    zzicVar2.k();
                                    ((zzid) zzicVar2.b).c2(x02);
                                }
                                U0.u(a);
                                h0().V0(U0, false);
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.zzgl c0 = g0().c0(((zzid) pq7Var3.b).y());
                    if (c0 != null && c0.y()) {
                        long z9 = c0.z();
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).a1(z9);
                        h0().Z0((zzid) zzicVar2.m(), z7);
                    }
                    if (((zzid) pq7Var3.b).N().isEmpty()) {
                        zzicVar2.k();
                        ((zzid) zzicVar2.b).a1(-1L);
                    } else {
                        b().j.b(zzgu.U(((zzid) pq7Var3.b).y()), "Did not find measurement config or missing version info. appId");
                    }
                    h0().Z0((zzid) zzicVar2.m(), z7);
                }
                h0().g0((ArrayList) pq7Var3.c);
                hkn h02 = h0();
                try {
                    h02.H0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{y9, y9});
                } catch (SQLiteException e3) {
                    ((zzic) h02.b).b().g.c(zzgu.U(y9), e3, "Failed to remove unused event metadata. appId");
                }
                h0().F0();
                z = true;
            }
            h0().G0();
            return z;
        } catch (Throwable th) {
            h0().G0();
            throw th;
        }
    }

    public final void J(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z) {
        z1p z1pVar;
        String str = true != z ? "_lte" : "_se";
        hkn hknVar = this.c;
        U(hknVar);
        z1p M0 = hknVar.M0(zzicVar.w(), str);
        if (M0 != null) {
            Object obj = M0.e;
            String w = zzicVar.w();
            ((DefaultClock) f()).getClass();
            z1pVar = new z1p(w, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        } else {
            String w2 = zzicVar.w();
            ((DefaultClock) f()).getClass();
            z1pVar = new z1p(w2, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        }
        zzit J = zziu.J();
        J.k();
        ((zziu) J.b).L(str);
        ((DefaultClock) f()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        J.k();
        ((zziu) J.b).K(currentTimeMillis);
        Object obj2 = z1pVar.e;
        long longValue = ((Long) obj2).longValue();
        J.k();
        ((zziu) J.b).O(longValue);
        zziu zziuVar = (zziu) J.m();
        int C0 = zzpk.C0(zzicVar, str);
        if (C0 >= 0) {
            zzicVar.k();
            ((zzid) zzicVar.b).m0(C0, zziuVar);
        } else {
            zzicVar.k();
            ((zzid) zzicVar.b).n0(zziuVar);
        }
        if (j > 0) {
            hkn hknVar2 = this.c;
            U(hknVar2);
            hknVar2.L0(z1pVar);
            b().o.c(true != z ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(zzhr zzhrVar, zzhr zzhrVar2) {
        Preconditions.b("_e".equals(zzhrVar.v()));
        k0();
        zzhw a0 = zzpk.a0((zzhs) zzhrVar.m(), "_sc");
        String B = a0 == null ? null : a0.B();
        k0();
        zzhw a02 = zzpk.a0((zzhs) zzhrVar2.m(), "_pc");
        String B2 = a02 != null ? a02.B() : null;
        if (B2 == null || !B2.equals(B)) {
            return false;
        }
        Preconditions.b("_e".equals(zzhrVar.v()));
        k0();
        zzhw a03 = zzpk.a0((zzhs) zzhrVar.m(), "_et");
        if (a03 == null || !a03.C() || a03.D() <= 0) {
            return true;
        }
        long D = a03.D();
        k0();
        zzhw a04 = zzpk.a0((zzhs) zzhrVar2.m(), "_et");
        if (a04 != null && a04.D() > 0) {
            D += a04.D();
        }
        k0();
        zzpk.Y(zzhrVar2, "_et", Long.valueOf(D));
        k0();
        zzpk.Y(zzhrVar, "_fr", 1L);
        return true;
    }

    public final void L(zzhr zzhrVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(zzhrVar.p());
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzhw) arrayList.get(i)).z())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        double H = zzhrVar.r(i).H() * 1000000.0d;
        if (H == 0.0d) {
            H = zzhrVar.r(i).D() * 1000000.0d;
        }
        if (H > 9.223372036854776E18d || H < -9.223372036854776E18d) {
            b().j.c(zzgu.U(str2), Double.valueOf(H), lnb.o("Data lost. Purchase ", str, " is too big. appId"));
            return;
        }
        zzhrVar.u(i);
        zzhv K2 = zzhw.K();
        K2.p(str);
        K2.r(Math.round(H));
        zzhrVar.s((zzhw) K2.m());
    }

    public final boolean M() {
        d().Q();
        m0();
        hkn hknVar = this.c;
        U(hknVar);
        if (hknVar.m0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        hkn hknVar2 = this.c;
        U(hknVar2);
        return !TextUtils.isEmpty(hknVar2.Y());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        boolean z;
        long max;
        long max2;
        long j;
        int i;
        Integer num;
        int intValue;
        zzpk zzpkVar = this.g;
        d().Q();
        m0();
        if (this.o > 0) {
            ((DefaultClock) f()).getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.o);
            if (abs > 0) {
                b().o.b(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                i0().b();
                zzok zzokVar = this.e;
                U(zzokVar);
                zzokVar.U();
                return;
            }
            this.o = 0L;
        }
        if (!this.l.h() || !M()) {
            b().o.a("Nothing to upload or uploading impossible");
            i0().b();
            zzok zzokVar2 = this.e;
            U(zzokVar2);
            zzokVar2.U();
            return;
        }
        ((DefaultClock) f()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        f0();
        long max3 = Math.max(0L, ((Long) zzfy.O.a(null)).longValue());
        hkn hknVar = this.c;
        U(hknVar);
        if (hknVar.m0("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            hkn hknVar2 = this.c;
            U(hknVar2);
            if (hknVar2.m0("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z = false;
                if (z) {
                    f0();
                    max = Math.max(0L, ((Long) zzfy.H.a(null)).longValue());
                } else {
                    String U = f0().U("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(U) || ".none.".equals(U)) {
                        f0();
                        max = Math.max(0L, ((Long) zzfy.I.a(null)).longValue());
                    } else {
                        f0();
                        max = Math.max(0L, ((Long) zzfy.J.a(null)).longValue());
                    }
                }
                long a = this.i.i.a();
                long a2 = this.i.j.a();
                hkn hknVar3 = this.c;
                U(hknVar3);
                long n0 = hknVar3.n0("select max(bundle_end_timestamp) from queue", null, 0L);
                hkn hknVar4 = this.c;
                U(hknVar4);
                max2 = Math.max(n0, hknVar4.n0("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    j = 0;
                } else {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(a - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                    long j2 = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z && max4 > 0) {
                        j2 = Math.min(abs2, max4) + max;
                    }
                    U(zzpkVar);
                    j = !zzpkVar.y0(max4, max) ? max4 + max : j2;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i2 = 0;
                        while (true) {
                            f0();
                            i = 0;
                            if (i2 >= Math.min(20, Math.max(0, ((Integer) zzfy.Q.a(null)).intValue()))) {
                                j = 0;
                                break;
                            }
                            f0();
                            j += Math.max(0L, ((Long) zzfy.P.a(null)).longValue()) * (1 << i2);
                            if (j > abs4) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (j == 0) {
                            b().o.a("Next upload time is 0");
                            i0().b();
                            zzok zzokVar3 = this.e;
                            U(zzokVar3);
                            zzokVar3.U();
                            return;
                        }
                        zzgz zzgzVar = this.b;
                        U(zzgzVar);
                        if (!zzgzVar.U()) {
                            b().o.a("No network");
                            pko i0 = i0();
                            zzpg zzpgVar = (zzpg) i0.d;
                            zzpgVar.m0();
                            zzpgVar.d().Q();
                            if (!i0.b) {
                                zzpgVar.l.a.registerReceiver(i0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                zzgz zzgzVar2 = zzpgVar.b;
                                U(zzgzVar2);
                                i0.c = zzgzVar2.U();
                                zzpgVar.b().o.b(Boolean.valueOf(i0.c), "Registering connectivity change receiver. Network connected");
                                i0.b = true;
                            }
                            zzok zzokVar4 = this.e;
                            U(zzokVar4);
                            zzokVar4.U();
                            return;
                        }
                        long a3 = this.i.h.a();
                        f0();
                        long max5 = Math.max(0L, ((Long) zzfy.G.a(null)).longValue());
                        U(zzpkVar);
                        if (!zzpkVar.y0(a3, max5)) {
                            j = Math.max(j, a3 + max5);
                        }
                        i0().b();
                        ((DefaultClock) f()).getClass();
                        long currentTimeMillis2 = j - System.currentTimeMillis();
                        if (currentTimeMillis2 <= 0) {
                            f0();
                            currentTimeMillis2 = Math.max(0L, ((Long) zzfy.K.a(null)).longValue());
                            zzhe zzheVar = this.i.i;
                            ((DefaultClock) f()).getClass();
                            zzheVar.b(System.currentTimeMillis());
                        }
                        b().o.b(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                        zzok zzokVar5 = this.e;
                        U(zzokVar5);
                        zzokVar5.R();
                        zzic zzicVar = (zzic) zzokVar5.b;
                        zzicVar.getClass();
                        zzgu zzguVar = zzicVar.f;
                        Context context = zzicVar.a;
                        if (!zzpp.L0(context)) {
                            zzic.m(zzguVar);
                            zzguVar.n.a("Receiver not registered/enabled");
                        }
                        if (!zzpp.l0(context)) {
                            zzic.m(zzguVar);
                            zzguVar.n.a("Service not registered/enabled");
                        }
                        zzokVar5.U();
                        zzic.m(zzguVar);
                        zzguVar.o.b(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                        zzicVar.k.getClass();
                        SystemClock.elapsedRealtime();
                        if (currentTimeMillis2 < Math.max(0L, ((Long) zzfy.L.a(null)).longValue())) {
                            ozo ozoVar = zzokVar5.f;
                            if (ozoVar == null) {
                                ozo ozoVar2 = new ozo(zzokVar5, zzokVar5.c.l, 1);
                                zzokVar5.f = ozoVar2;
                                ozoVar = ozoVar2;
                            }
                            if (ozoVar.c == 0) {
                                ozo ozoVar3 = zzokVar5.f;
                                if (ozoVar3 == null) {
                                    ozo ozoVar4 = new ozo(zzokVar5, zzokVar5.c.l, 1);
                                    zzokVar5.f = ozoVar4;
                                    ozoVar3 = ozoVar4;
                                }
                                ozoVar3.b(currentTimeMillis2);
                            }
                        }
                        ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                        int W = zzokVar5.W();
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                        JobInfo build = new JobInfo.Builder(W, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                        Method method = zzcf.a;
                        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        Method method2 = zzcf.a;
                        if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                            jobScheduler.schedule(build);
                            return;
                        }
                        Method method3 = zzcf.b;
                        try {
                            if (method3 != null) {
                                try {
                                    num = (Integer) method3.invoke(UserHandle.class, null);
                                } catch (IllegalAccessException | InvocationTargetException unused) {
                                }
                                if (num != null) {
                                    intValue = num.intValue();
                                    return;
                                }
                            }
                            return;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            jobScheduler.schedule(build);
                            return;
                        }
                        intValue = i;
                    }
                }
                i = 0;
                if (j == 0) {
                }
            }
        }
        z = true;
        if (z) {
        }
        long a4 = this.i.i.a();
        long a22 = this.i.j.a();
        hkn hknVar32 = this.c;
        U(hknVar32);
        long n02 = hknVar32.n0("select max(bundle_end_timestamp) from queue", null, 0L);
        hkn hknVar42 = this.c;
        U(hknVar42);
        max2 = Math.max(n02, hknVar42.n0("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        i = 0;
        if (j == 0) {
        }
    }

    public final void O() {
        d().Q();
        if (this.t || this.u || this.v) {
            b().o.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v));
            return;
        }
        b().o.a("Stopping uploading service(s)");
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.p;
        Preconditions.i(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(xjo xjoVar) {
        try {
            long Q = xjoVar.Q();
            zzic zzicVar = this.l;
            if (Q != -2147483648L) {
                if (xjoVar.Q() == Wrappers.a(zzicVar.a).b(0, xjoVar.E()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.a(zzicVar.a).b(0, xjoVar.E()).versionName;
                String O = xjoVar.O();
                if (O != null && O.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final zzr Q(String str) {
        hkn hknVar = this.c;
        U(hknVar);
        xjo U0 = hknVar.U0(str);
        if (U0 != null) {
            zzic zzicVar = U0.a;
            if (!TextUtils.isEmpty(U0.O())) {
                Boolean P = P(U0);
                if (P != null && !P.booleanValue()) {
                    b().g.b(zzgu.U(str), "App version does not match; dropping. appId");
                    return null;
                }
                String H = U0.H();
                String O = U0.O();
                long Q = U0.Q();
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                String str2 = U0.l;
                zzhz zzhzVar2 = zzicVar.g;
                zzic.m(zzhzVar2);
                zzhzVar2.Q();
                long j = U0.m;
                zzhz zzhzVar3 = zzicVar.g;
                zzic.m(zzhzVar3);
                zzhzVar3.Q();
                long j2 = U0.n;
                zzhz zzhzVar4 = zzicVar.g;
                zzic.m(zzhzVar4);
                zzhzVar4.Q();
                boolean z = U0.o;
                String K2 = U0.K();
                zzhz zzhzVar5 = zzicVar.g;
                zzic.m(zzhzVar5);
                zzhzVar5.Q();
                boolean z2 = U0.p;
                Boolean x = U0.x();
                long b = U0.b();
                zzhz zzhzVar6 = zzicVar.g;
                zzic.m(zzhzVar6);
                zzhzVar6.Q();
                ArrayList arrayList = U0.s;
                String g = c(str).g();
                boolean z3 = U0.z();
                zzhz zzhzVar7 = zzicVar.g;
                zzic.m(zzhzVar7);
                zzhzVar7.Q();
                long j3 = U0.v;
                int i = c(str).b;
                String str3 = p0(str).b;
                zzhz zzhzVar8 = zzicVar.g;
                zzic.m(zzhzVar8);
                zzhzVar8.Q();
                int i2 = U0.x;
                zzhz zzhzVar9 = zzicVar.g;
                zzic.m(zzhzVar9);
                zzhzVar9.Q();
                return new zzr(str, H, O, Q, str2, j, j2, (String) null, z, false, K2, 0L, 0, z2, false, x, b, (List) arrayList, g, "", (String) null, z3, j3, i, str3, i2, U0.B, U0.D(), U0.s(), 0L, U0.t(), 0L);
            }
        }
        b().n.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        hkn hknVar = this.c;
        U(hknVar);
        emn q0 = hknVar.q0("events", str, str2);
        return q0 == null || q0.c < 1;
    }

    public final void W() {
        d().Q();
        m0();
        if (this.n) {
            return;
        }
        this.n = true;
        d().Q();
        FileLock fileLock = this.w;
        zzic zzicVar = this.l;
        if (fileLock == null || !fileLock.isValid()) {
            zzal zzalVar = ((zzic) this.c.b).d;
            File filesDir = zzicVar.a.getFilesDir();
            int i = zzcd.a;
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
                this.x = channel;
                FileLock tryLock = channel.tryLock();
                this.w = tryLock;
                if (tryLock == null) {
                    b().g.a("Storage concurrent data access panic");
                    return;
                }
                b().o.a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                b().g.b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                b().g.b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                b().j.b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            b().o.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.x;
        d().Q();
        int i2 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().g.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i2 = allocate.getInt();
                } else if (read != -1) {
                    b().j.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                b().g.b(e4, "Failed to read from channel");
            }
        }
        zzgi q = zzicVar.q();
        q.R();
        int i3 = q.f;
        d().Q();
        if (i2 > i3) {
            b().g.c(Integer.valueOf(i2), Integer.valueOf(i3), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i2 < i3) {
            FileChannel fileChannel2 = this.x;
            d().Q();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().g.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i3);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().g.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    b().o.c(Integer.valueOf(i2), Integer.valueOf(i3), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e5) {
                    b().g.b(e5, "Failed to write to channel");
                }
            }
            b().g.c(Integer.valueOf(i2), Integer.valueOf(i3), "Storage version upgrade failed. Previous, current version");
        }
    }

    public final void X(zzpl zzplVar, zzr zzrVar) {
        String str;
        long j;
        d().Q();
        m0();
        boolean T = T(zzrVar);
        String str2 = zzrVar.a;
        if (T) {
            if (!zzrVar.h) {
                d0(zzrVar);
                return;
            }
            zzpp l0 = l0();
            String str3 = zzplVar.b;
            int Z0 = l0.Z0(str3);
            muo muoVar = this.J;
            if (Z0 != 0) {
                l0();
                f0();
                String X = zzpp.X(24, str3, true);
                int length = str3 != null ? str3.length() : 0;
                l0();
                zzpp.i0(muoVar, zzrVar.a, Z0, "_ev", X, length);
                return;
            }
            int f0 = l0().f0(zzplVar.zza(), str3);
            if (f0 != 0) {
                l0();
                f0();
                String X2 = zzpp.X(24, str3, true);
                Object zza = zzplVar.zza();
                int length2 = (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : zza.toString().length();
                l0();
                zzpp.i0(muoVar, zzrVar.a, f0, "_ev", X2, length2);
                return;
            }
            Object g0 = l0().g0(zzplVar.zza(), str3);
            if (g0 != null) {
                if ("_sid".equals(str3)) {
                    long j2 = zzplVar.c;
                    String str4 = zzplVar.f;
                    Preconditions.i(str2);
                    hkn hknVar = this.c;
                    U(hknVar);
                    z1p M0 = hknVar.M0(str2, "_sno");
                    if (M0 != null) {
                        Object obj = M0.e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            X(new zzpl(j2, Long.valueOf(j + 1), "_sno", str4), zzrVar);
                        }
                    }
                    if (M0 != null) {
                        b().j.b(M0.e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    hkn hknVar2 = this.c;
                    U(hknVar2);
                    emn q0 = hknVar2.q0("events", str2, "_s");
                    if (q0 != null) {
                        zzgs zzgsVar = b().o;
                        str = "_sid";
                        long j3 = q0.c;
                        zzgsVar.b(Long.valueOf(j3), "Backfill the session number. Last used session number");
                        j = j3;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    X(new zzpl(j2, Long.valueOf(j + 1), "_sno", str4), zzrVar);
                } else {
                    str = "_sid";
                }
                Preconditions.i(str2);
                String str5 = zzplVar.f;
                Preconditions.i(str5);
                z1p z1pVar = new z1p(str2, str5, str3, zzplVar.c, g0);
                zzgs zzgsVar2 = b().o;
                zzic zzicVar = this.l;
                zzgn zzgnVar = zzicVar.j;
                String str6 = z1pVar.c;
                zzgsVar2.c(zzgnVar.c(str6), g0, "Setting user property");
                hkn hknVar3 = this.c;
                U(hknVar3);
                hknVar3.E0();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = z1pVar.e;
                    if (equals) {
                        hkn hknVar4 = this.c;
                        U(hknVar4);
                        z1p M02 = hknVar4.M0(str2, "_id");
                        if (M02 != null && !obj2.equals(M02.e)) {
                            hkn hknVar5 = this.c;
                            U(hknVar5);
                            hknVar5.K0(str2, "_lair");
                        }
                    }
                    d0(zzrVar);
                    hkn hknVar6 = this.c;
                    U(hknVar6);
                    boolean L0 = hknVar6.L0(z1pVar);
                    if (str.equals(str3)) {
                        zzpk zzpkVar = this.g;
                        U(zzpkVar);
                        String str7 = zzrVar.u;
                        long z0 = TextUtils.isEmpty(str7) ? 0L : zzpkVar.z0(str7.getBytes(StandardCharsets.UTF_8));
                        hkn hknVar7 = this.c;
                        U(hknVar7);
                        xjo U0 = hknVar7.U0(str2);
                        if (U0 != null) {
                            U0.B(z0);
                            if (U0.o()) {
                                hkn hknVar8 = this.c;
                                U(hknVar8);
                                hknVar8.V0(U0, false);
                            }
                        }
                    }
                    hkn hknVar9 = this.c;
                    U(hknVar9);
                    hknVar9.F0();
                    if (!L0) {
                        b().g.c(zzicVar.j.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        l0();
                        zzpp.i0(muoVar, str2, 9, null, null, 0);
                    }
                    hkn hknVar10 = this.c;
                    U(hknVar10);
                    hknVar10.G0();
                } catch (Throwable th) {
                    hkn hknVar11 = this.c;
                    U(hknVar11);
                    hknVar11.G0();
                    throw th;
                }
            }
        }
    }

    public final void Y(String str, zzr zzrVar) {
        d().Q();
        m0();
        boolean T = T(zzrVar);
        String str2 = zzrVar.a;
        if (T) {
            if (!zzrVar.h) {
                d0(zzrVar);
                return;
            }
            Boolean V = V(zzrVar);
            if ("_npa".equals(str) && V != null) {
                b().n.a("Falling back to manifest metadata value for ad personalization");
                ((DefaultClock) f()).getClass();
                X(new zzpl(System.currentTimeMillis(), Long.valueOf(true != V.booleanValue() ? 0L : 1L), "_npa", "auto"), zzrVar);
                return;
            }
            zzgs zzgsVar = b().n;
            zzic zzicVar = this.l;
            zzgsVar.b(zzicVar.j.c(str), "Removing user property");
            hkn hknVar = this.c;
            U(hknVar);
            hknVar.E0();
            try {
                d0(zzrVar);
                if ("_id".equals(str)) {
                    hkn hknVar2 = this.c;
                    U(hknVar2);
                    Preconditions.i(str2);
                    hknVar2.K0(str2, "_lair");
                }
                hkn hknVar3 = this.c;
                U(hknVar3);
                Preconditions.i(str2);
                hknVar3.K0(str2, str);
                hkn hknVar4 = this.c;
                U(hknVar4);
                hknVar4.F0();
                b().n.b(zzicVar.j.c(str), "User property removed");
                hkn hknVar5 = this.c;
                U(hknVar5);
                hknVar5.G0();
            } catch (Throwable th) {
                hkn hknVar6 = this.c;
                U(hknVar6);
                hknVar6.G0();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:79|80)|(2:82|(8:84|(3:86|(2:88|(1:90))(1:110)|109)(1:111)|91|(1:93)(1:108)|94|95|96|(4:98|(1:100)(1:104)|101|(1:103))))|112|95|96|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0382, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0383, code lost:
    
        b().g.c(com.google.android.gms.measurement.internal.zzgu.U(r3), r0, "Application info is null, first open report might be inaccurate. appId");
        r12 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0442 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0167 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x014f A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173 A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0395 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:31:0x00e0, B:33:0x00f0, B:37:0x0107, B:40:0x0117, B:42:0x0126, B:44:0x013b, B:46:0x0148, B:47:0x0153, B:50:0x015c, B:52:0x0173, B:55:0x018c, B:58:0x01b0, B:60:0x01c0, B:62:0x01d8, B:63:0x029c, B:65:0x02c8, B:66:0x02cb, B:68:0x02ec, B:73:0x03b4, B:74:0x03b7, B:75:0x0467, B:80:0x0303, B:82:0x0322, B:84:0x032a, B:86:0x0330, B:90:0x0343, B:91:0x0356, B:94:0x0362, B:96:0x0376, B:98:0x0395, B:100:0x039d, B:101:0x03a5, B:103:0x03ab, B:107:0x0383, B:110:0x034e, B:115:0x0310, B:116:0x01e8, B:118:0x0212, B:119:0x021e, B:121:0x0225, B:123:0x022b, B:125:0x0235, B:127:0x023b, B:129:0x0241, B:131:0x0247, B:133:0x024c, B:136:0x0265, B:141:0x0269, B:142:0x027a, B:143:0x0285, B:145:0x0290, B:146:0x03e2, B:148:0x0417, B:149:0x041a, B:150:0x0442, B:152:0x0449, B:153:0x0167, B:154:0x014f, B:155:0x0130, B:159:0x0138), top: B:30:0x00e0, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(zzr zzrVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        emn q0;
        boolean z;
        zzic zzicVar;
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        zzr zzrVar2;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j7;
        boolean z2;
        long j8;
        zzic zzicVar2 = this.l;
        d().Q();
        m0();
        Preconditions.i(zzrVar);
        boolean z3 = zzrVar.o;
        String str4 = zzrVar.a;
        Preconditions.f(str4);
        if (T(zzrVar)) {
            hkn hknVar = this.c;
            U(hknVar);
            xjo U0 = hknVar.U0(str4);
            if (U0 != null && TextUtils.isEmpty(U0.H()) && !TextUtils.isEmpty(zzrVar.b)) {
                U0.f(0L);
                hkn hknVar2 = this.c;
                U(hknVar2);
                hknVar2.V0(U0, false);
                zzht zzhtVar = this.a;
                U(zzhtVar);
                zzhtVar.Q();
                zzhtVar.j.remove(str4);
            }
            if (!zzrVar.h) {
                d0(zzrVar);
                return;
            }
            long j9 = zzrVar.l;
            zzal f0 = f0();
            zzfx zzfxVar = zzfy.e1;
            if (f0.b0(null, zzfxVar)) {
                j = j9;
                j2 = zzrVar.F;
            } else {
                j = j9;
                j2 = 0;
            }
            if (j == 0) {
                ((DefaultClock) f()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (f0().b0(null, zzfxVar)) {
                    ((DefaultClock) f()).getClass();
                    j8 = SystemClock.elapsedRealtime();
                } else {
                    j8 = 0;
                }
                j4 = currentTimeMillis;
                j3 = j8;
            } else {
                j3 = j2;
                j4 = j;
            }
            int i2 = zzrVar.m;
            if (i2 != 0 && i2 != 1) {
                b().j.c(zzgu.U(str4), Integer.valueOf(i2), "Incorrect app type, assuming installed app. appId, appType");
                i2 = 0;
            }
            hkn hknVar3 = this.c;
            U(hknVar3);
            hknVar3.E0();
            try {
                hkn hknVar4 = this.c;
                U(hknVar4);
                z1p M0 = hknVar4.M0(str4, "_npa");
                Boolean V = V(zzrVar);
                if (M0 != null) {
                    j5 = 1;
                    if (!"auto".equals(M0.b)) {
                        j6 = j4;
                        if (f0().b0(null, zzfy.W0)) {
                            i = i2;
                            c0(zzrVar, j6);
                        } else {
                            i = i2;
                            c0(zzrVar, zzrVar.D);
                        }
                        d0(zzrVar);
                        hkn hknVar5 = this.c;
                        if (i != 0) {
                            U(hknVar5);
                            q0 = hknVar5.q0("events", str4, "_f");
                            z = false;
                        } else {
                            U(hknVar5);
                            q0 = hknVar5.q0("events", str4, "_v");
                            z = true;
                        }
                        if (q0 != null) {
                            long j10 = ((j6 / 3600000) + j5) * 3600000;
                            if (z) {
                                Long valueOf = Long.valueOf(j10);
                                long j11 = j6;
                                X(new zzpl(j11, valueOf, "_fvt", "auto"), zzrVar);
                                d().Q();
                                m0();
                                Bundle bundle = new Bundle();
                                bundle.putLong("_c", 1L);
                                bundle.putLong("_r", 1L);
                                bundle.putLong("_et", 1L);
                                if (z3) {
                                    bundle.putLong("_dac", 1L);
                                }
                                ((DefaultClock) f()).getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                                i(new zzbh("_v", new zzbf(bundle), "auto", j11, j3), zzrVar);
                            } else {
                                Long valueOf2 = Long.valueOf(j10);
                                long j12 = j6;
                                X(new zzpl(j12, valueOf2, "_fot", "auto"), zzrVar);
                                d().Q();
                                zzhk zzhkVar = this.k;
                                Preconditions.i(zzhkVar);
                                zzic zzicVar3 = zzhkVar.a;
                                if (str4 == null || str4.isEmpty()) {
                                    zzicVar = zzicVar2;
                                    str = "_elt";
                                    str2 = str4;
                                    str3 = "_et";
                                    zzgu zzguVar = zzicVar3.f;
                                    zzic.m(zzguVar);
                                    zzguVar.k.a("Install Referrer Reporter was called with invalid app package name");
                                } else {
                                    str3 = "_et";
                                    zzhz zzhzVar = zzicVar3.g;
                                    zzgu zzguVar2 = zzicVar3.f;
                                    str = "_elt";
                                    Context context = zzicVar3.a;
                                    zzic.m(zzhzVar);
                                    zzhzVar.Q();
                                    if (zzhkVar.a()) {
                                        zzhj zzhjVar = new zzhj(zzhkVar, str4);
                                        zzhz zzhzVar2 = zzicVar3.g;
                                        zzic.m(zzhzVar2);
                                        zzhzVar2.Q();
                                        zzicVar = zzicVar2;
                                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                        str2 = str4;
                                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                        PackageManager packageManager = context.getPackageManager();
                                        if (packageManager == null) {
                                            zzic.m(zzguVar2);
                                            zzguVar2.k.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                        } else {
                                            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                zzic.m(zzguVar2);
                                                zzguVar2.m.a("Play Service for fetching Install Referrer is unavailable on device");
                                            } else {
                                                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                if (serviceInfo != null) {
                                                    String str5 = serviceInfo.packageName;
                                                    if (serviceInfo.name != null && "com.android.vending".equals(str5) && zzhkVar.a()) {
                                                        try {
                                                            boolean a = ConnectionTracker.b().a(context, new Intent(intent), zzhjVar, 1);
                                                            zzic.m(zzguVar2);
                                                            zzguVar2.o.b(a ? "available" : "not available", "Install Referrer Service is");
                                                        } catch (RuntimeException e) {
                                                            zzgu zzguVar3 = zzicVar3.f;
                                                            zzic.m(zzguVar3);
                                                            zzguVar3.g.b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                        }
                                                    } else {
                                                        zzic.m(zzguVar2);
                                                        zzguVar2.j.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        zzic.m(zzguVar2);
                                        zzguVar2.m.a("Install Referrer Reporter is not available");
                                        zzicVar = zzicVar2;
                                        str2 = str4;
                                    }
                                }
                                d().Q();
                                m0();
                                Bundle bundle2 = new Bundle();
                                long j13 = j5;
                                bundle2.putLong("_c", j13);
                                bundle2.putLong("_r", j13);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong(str3, j13);
                                if (z3) {
                                    bundle2.putLong("_dac", j13);
                                }
                                Preconditions.i(str2);
                                hkn hknVar6 = this.c;
                                U(hknVar6);
                                Preconditions.f(str2);
                                hknVar6.Q();
                                hknVar6.R();
                                String str6 = str2;
                                long e0 = hknVar6.e0(str6);
                                zzic zzicVar4 = zzicVar;
                                if (zzicVar4.a.getPackageManager() == null) {
                                    b().g.b(zzgu.U(str6), "PackageManager is null, first open report might be inaccurate. appId");
                                    zzrVar2 = zzrVar;
                                } else {
                                    try {
                                        packageInfo = Wrappers.a(zzicVar4.a).b(0, str6);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        b().g.c(zzgu.U(str6), e2, "Package info is null, first open report might be inaccurate. appId");
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        long j14 = packageInfo.firstInstallTime;
                                        if (j14 != 0) {
                                            if (j14 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!f0().b0(null, zzfy.I0)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (e0 == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z2 = false;
                                                    e0 = 0;
                                                }
                                                z2 = false;
                                            } else {
                                                applicationInfo = null;
                                                z2 = true;
                                            }
                                            zzrVar2 = zzrVar;
                                            X(new zzpl(j12, Long.valueOf(true != z2 ? 0L : 1L), "_fi", "auto"), zzrVar2);
                                            applicationInfo2 = Wrappers.a(zzicVar4.a).a(0, str6);
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    j7 = 1;
                                                    bundle2.putLong("_sys", 1L);
                                                } else {
                                                    j7 = 1;
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle2.putLong("_sysu", j7);
                                                }
                                            }
                                        }
                                    }
                                    zzrVar2 = zzrVar;
                                    applicationInfo = null;
                                    applicationInfo2 = Wrappers.a(zzicVar4.a).a(0, str6);
                                    if (applicationInfo2 != null) {
                                    }
                                }
                                long j15 = e0;
                                if (j15 >= 0) {
                                    bundle2.putLong("_pfo", j15);
                                }
                                ((DefaultClock) f()).getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                                i(new zzbh("_f", new zzbf(bundle2), "auto", j12, j3), zzrVar2);
                            }
                        } else {
                            long j16 = j6;
                            if (zzrVar.i) {
                                i(new zzbh("_cd", new zzbf(new Bundle()), "auto", j16, 0L), zzrVar);
                            }
                        }
                        hkn hknVar7 = this.c;
                        U(hknVar7);
                        hknVar7.F0();
                        hkn hknVar8 = this.c;
                        U(hknVar8);
                        hknVar8.G0();
                    }
                } else {
                    j5 = 1;
                }
                if (V != null) {
                    zzpl zzplVar = new zzpl(j4, Long.valueOf(true != V.booleanValue() ? 0L : j5), "_npa", "auto");
                    j6 = j4;
                    if (M0 == null || !M0.e.equals(zzplVar.d)) {
                        X(zzplVar, zzrVar);
                    }
                } else {
                    j6 = j4;
                    if (M0 != null) {
                        Y("_npa", zzrVar);
                    }
                }
                if (f0().b0(null, zzfy.W0)) {
                }
                d0(zzrVar);
                hkn hknVar52 = this.c;
                if (i != 0) {
                }
                if (q0 != null) {
                }
                hkn hknVar72 = this.c;
                U(hknVar72);
                hknVar72.F0();
                hkn hknVar82 = this.c;
                U(hknVar82);
                hknVar82.G0();
            } catch (Throwable th) {
                hkn hknVar9 = this.c;
                U(hknVar9);
                hknVar9.G0();
                throw th;
            }
        }
    }

    @Override // defpackage.iso
    public final zzae a() {
        return this.l.c;
    }

    public final void a0(zzah zzahVar, zzr zzrVar) {
        Preconditions.f(zzahVar.a);
        Preconditions.i(zzahVar.b);
        Preconditions.i(zzahVar.c);
        Preconditions.f(zzahVar.c.b);
        d().Q();
        m0();
        if (T(zzrVar)) {
            if (!zzrVar.h) {
                d0(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.e = false;
            hkn hknVar = this.c;
            U(hknVar);
            hknVar.E0();
            try {
                hkn hknVar2 = this.c;
                U(hknVar2);
                String str = zzahVar2.a;
                Preconditions.i(str);
                zzah Q0 = hknVar2.Q0(str, zzahVar2.c.b);
                zzic zzicVar = this.l;
                if (Q0 != null && !Q0.b.equals(zzahVar2.b)) {
                    b().j.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzicVar.j.c(zzahVar2.c.b), zzahVar2.b, Q0.b);
                }
                if (Q0 != null && Q0.e) {
                    zzahVar2.b = Q0.b;
                    zzahVar2.d = Q0.d;
                    zzahVar2.h = Q0.h;
                    zzahVar2.f = Q0.f;
                    zzahVar2.i = Q0.i;
                    zzahVar2.e = true;
                    zzpl zzplVar = zzahVar2.c;
                    zzahVar2.c = new zzpl(Q0.c.c, zzplVar.zza(), zzplVar.b, Q0.c.f);
                } else if (TextUtils.isEmpty(zzahVar2.f)) {
                    zzpl zzplVar2 = zzahVar2.c;
                    zzahVar2.c = new zzpl(zzahVar2.d, zzplVar2.zza(), zzplVar2.b, zzahVar2.c.f);
                    zzahVar2.e = true;
                    z = true;
                }
                if (zzahVar2.e) {
                    zzpl zzplVar3 = zzahVar2.c;
                    String str2 = zzahVar2.a;
                    Preconditions.i(str2);
                    String str3 = zzahVar2.b;
                    String str4 = zzplVar3.b;
                    long j = zzplVar3.c;
                    Object zza = zzplVar3.zza();
                    Preconditions.i(zza);
                    z1p z1pVar = new z1p(str2, str3, str4, j, zza);
                    Object obj = z1pVar.e;
                    String str5 = z1pVar.c;
                    hkn hknVar3 = this.c;
                    U(hknVar3);
                    if (hknVar3.L0(z1pVar)) {
                        b().n.d("User property updated immediately", zzahVar2.a, zzicVar.j.c(str5), obj);
                    } else {
                        b().g.d("(2)Too many active user properties, ignoring", zzgu.U(zzahVar2.a), zzicVar.j.c(str5), obj);
                    }
                    if (z && zzahVar2.i != null) {
                        l(new zzbh(zzahVar2.i, zzahVar2.d, 0L), zzrVar);
                    }
                }
                hkn hknVar4 = this.c;
                U(hknVar4);
                if (hknVar4.P0(zzahVar2)) {
                    b().n.d("Conditional property added", zzahVar2.a, zzicVar.j.c(zzahVar2.c.b), zzahVar2.c.zza());
                } else {
                    b().g.d("Too many conditional properties, ignoring", zzgu.U(zzahVar2.a), zzicVar.j.c(zzahVar2.c.b), zzahVar2.c.zza());
                }
                hkn hknVar5 = this.c;
                U(hknVar5);
                hknVar5.F0();
                hkn hknVar6 = this.c;
                U(hknVar6);
                hknVar6.G0();
            } catch (Throwable th) {
                hkn hknVar7 = this.c;
                U(hknVar7);
                hknVar7.G0();
                throw th;
            }
        }
    }

    @Override // defpackage.iso
    public final zzgu b() {
        zzic zzicVar = this.l;
        Preconditions.i(zzicVar);
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        return zzguVar;
    }

    public final void b0(zzah zzahVar, zzr zzrVar) {
        Preconditions.f(zzahVar.a);
        Preconditions.i(zzahVar.c);
        Preconditions.f(zzahVar.c.b);
        d().Q();
        m0();
        if (T(zzrVar)) {
            if (!zzrVar.h) {
                d0(zzrVar);
                return;
            }
            hkn hknVar = this.c;
            U(hknVar);
            hknVar.E0();
            try {
                d0(zzrVar);
                String str = zzahVar.a;
                Preconditions.i(str);
                hkn hknVar2 = this.c;
                U(hknVar2);
                zzah Q0 = hknVar2.Q0(str, zzahVar.c.b);
                zzic zzicVar = this.l;
                if (Q0 != null) {
                    b().n.c(zzahVar.a, zzicVar.j.c(zzahVar.c.b), "Removing conditional user property");
                    hkn hknVar3 = this.c;
                    U(hknVar3);
                    hknVar3.R0(str, zzahVar.c.b);
                    if (Q0.e) {
                        hkn hknVar4 = this.c;
                        U(hknVar4);
                        hknVar4.K0(str, zzahVar.c.b);
                    }
                    zzbh zzbhVar = zzahVar.k;
                    if (zzbhVar != null) {
                        zzbf zzbfVar = zzbhVar.b;
                        zzbh x0 = l0().x0(zzbhVar.a, zzbfVar != null ? zzbfVar.b1() : null, Q0.b, zzbhVar.d, zzbhVar.e, true);
                        Preconditions.i(x0);
                        l(x0, zzrVar);
                    }
                } else {
                    b().j.c(zzgu.U(zzahVar.a), zzicVar.j.c(zzahVar.c.b), "Conditional user property doesn't exist");
                }
                hkn hknVar5 = this.c;
                U(hknVar5);
                hknVar5.F0();
                hkn hknVar6 = this.c;
                U(hknVar6);
                hknVar6.G0();
            } catch (Throwable th) {
                hkn hknVar7 = this.c;
                U(hknVar7);
                hknVar7.G0();
                throw th;
            }
        }
    }

    public final zzjl c(String str) {
        zzjl zzjlVar = zzjl.c;
        d().Q();
        m0();
        HashMap hashMap = this.B;
        zzjl zzjlVar2 = (zzjl) hashMap.get(str);
        if (zzjlVar2 == null) {
            hkn hknVar = this.c;
            U(hknVar);
            zzjlVar2 = hknVar.k0(str);
            if (zzjlVar2 == null) {
                zzjlVar2 = zzjl.c;
            }
            d().Q();
            m0();
            hashMap.put(str, zzjlVar2);
            hkn hknVar2 = this.c;
            U(hknVar2);
            hknVar2.w0(str, zzjlVar2);
        }
        return zzjlVar2;
    }

    public final void c0(zzr zzrVar, long j) {
        hkn hknVar = this.c;
        U(hknVar);
        String str = zzrVar.a;
        Preconditions.i(str);
        xjo U0 = hknVar.U0(str);
        if (U0 != null) {
            l0();
            String str2 = zzrVar.b;
            String H = U0.H();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(H);
            if (!isEmpty && !isEmpty2) {
                Preconditions.i(str2);
                if (!str2.equals(H)) {
                    b().j.b(zzgu.U(U0.E()), "New GMP App Id passed in. Removing cached database data. appId");
                    hkn hknVar2 = this.c;
                    U(hknVar2);
                    zzic zzicVar = (zzic) hknVar2.b;
                    String E = U0.E();
                    hknVar2.R();
                    hknVar2.Q();
                    Preconditions.f(E);
                    try {
                        SQLiteDatabase H0 = hknVar2.H0();
                        String[] strArr = {E};
                        int delete = H0.delete("events", "app_id=?", strArr) + H0.delete("user_attributes", "app_id=?", strArr) + H0.delete("conditional_properties", "app_id=?", strArr) + H0.delete("apps", "app_id=?", strArr) + H0.delete("raw_events", "app_id=?", strArr) + H0.delete("raw_events_metadata", "app_id=?", strArr) + H0.delete("event_filters", "app_id=?", strArr) + H0.delete("property_filters", "app_id=?", strArr) + H0.delete("audience_filter_values", "app_id=?", strArr) + H0.delete("consent_settings", "app_id=?", strArr) + H0.delete("default_event_params", "app_id=?", strArr) + H0.delete("trigger_uris", "app_id=?", strArr) + H0.delete("diagnostic_signals", "app_id=?", strArr);
                        if (zzicVar.d.b0(null, zzfy.c1)) {
                            delete += H0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.o.c(E, Integer.valueOf(delete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.c(zzgu.U(E), e, "Error deleting application data. appId, error");
                    }
                    U0 = null;
                }
            }
        }
        if (U0 != null) {
            boolean z = (U0.Q() == -2147483648L || U0.Q() == zzrVar.j) ? false : true;
            String O = U0.O();
            if (z || ((U0.Q() != -2147483648L || O == null || O.equals(zzrVar.c)) ? false : true)) {
                zzbh zzbhVar = new zzbh("_au", new zzbf(bf3.f("_pv", O)), "auto", j, 0L);
                if (f0().b0(null, zzfy.X0)) {
                    i(zzbhVar, zzrVar);
                } else {
                    j(zzbhVar, zzrVar);
                }
            }
        }
    }

    @Override // defpackage.iso
    public final zzhz d() {
        zzic zzicVar = this.l;
        Preconditions.i(zzicVar);
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        return zzhzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xjo d0(zzr zzrVar) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        d().Q();
        m0();
        Preconditions.i(zzrVar);
        boolean z2 = zzrVar.n;
        String str5 = zzrVar.a;
        Preconditions.f(str5);
        String str6 = zzrVar.t;
        if (!str6.isEmpty()) {
            this.D.put(str5, new m1p(this, str6));
        }
        hkn hknVar = this.c;
        U(hknVar);
        xjo U0 = hknVar.U0(str5);
        zzjl j2 = c(str5).j(zzjl.c(100, zzrVar.s));
        String W = this.i.W(zzrVar, j2);
        boolean z3 = true;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
        if (U0 == null) {
            U0 = new xjo(this.l, str5);
            if (j2.i(zzjkVar2)) {
                U0.G(o(j2));
            }
            if (j2.i(zzjkVar)) {
                U0.J(W);
            }
        } else {
            zzic zzicVar = U0.a;
            if (j2.i(zzjkVar) && W != null) {
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                if (!W.equals(U0.e)) {
                    zzhz zzhzVar2 = zzicVar.g;
                    zzic.m(zzhzVar2);
                    zzhzVar2.Q();
                    boolean isEmpty = TextUtils.isEmpty(U0.e);
                    U0.J(W);
                    if (z2 && !"00000000-0000-0000-0000-000000000000".equals(this.i.U(zzrVar, j2).first) && !isEmpty) {
                        if (j2.i(zzjkVar2)) {
                            U0.G(o(j2));
                            z = false;
                        } else {
                            z = true;
                        }
                        hkn hknVar2 = this.c;
                        U(hknVar2);
                        if (hknVar2.M0(str5, "_id") != null) {
                            hkn hknVar3 = this.c;
                            U(hknVar3);
                            if (hknVar3.M0(str5, "_lair") == null) {
                                ((DefaultClock) f()).getClass();
                                z1p z1pVar = new z1p(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
                                hkn hknVar4 = this.c;
                                U(hknVar4);
                                hknVar4.L0(z1pVar);
                            }
                        }
                        zzic zzicVar2 = U0.a;
                        U0.I(zzrVar.b);
                        str = zzrVar.k;
                        if (!TextUtils.isEmpty(str)) {
                            U0.L(str);
                        }
                        j = zzrVar.e;
                        if (j != 0) {
                            U0.T(j);
                        }
                        str2 = zzrVar.c;
                        if (!TextUtils.isEmpty(str2)) {
                            U0.P(str2);
                        }
                        U0.R(zzrVar.j);
                        str3 = zzrVar.d;
                        if (str3 != null) {
                            U0.S(str3);
                        }
                        U0.a(zzrVar.f);
                        U0.d(zzrVar.h);
                        str4 = zzrVar.g;
                        if (!TextUtils.isEmpty(str4)) {
                            U0.w(str4);
                        }
                        zzhz zzhzVar3 = zzicVar2.g;
                        zzic.m(zzhzVar3);
                        zzhzVar3.Q();
                        U0.R |= U0.p == z2;
                        U0.p = z2;
                        Boolean bool = zzrVar.p;
                        zzhz zzhzVar4 = zzicVar2.g;
                        zzic.m(zzhzVar4);
                        zzhzVar4.Q();
                        U0.R |= !Objects.equals(U0.q, bool);
                        U0.q = bool;
                        U0.c(zzrVar.q);
                        String str7 = zzrVar.u;
                        zzhz zzhzVar5 = zzicVar2.g;
                        zzic.m(zzhzVar5);
                        zzhzVar5.Q();
                        U0.R |= !Objects.equals(U0.t, str7);
                        U0.t = str7;
                        zzahk zzahkVar = zzahk.b;
                        if (f0().b0(null, zzfy.L0)) {
                            if (f0().b0(null, zzfy.K0)) {
                                U0.y(null);
                            }
                        } else {
                            U0.y(zzrVar.r);
                        }
                        boolean z4 = zzrVar.v;
                        zzhz zzhzVar6 = zzicVar2.g;
                        zzic.m(zzhzVar6);
                        zzhzVar6.Q();
                        U0.R |= U0.u == z4;
                        U0.u = z4;
                        String str8 = zzrVar.B;
                        zzhz zzhzVar7 = zzicVar2.g;
                        zzic.m(zzhzVar7);
                        zzhzVar7.Q();
                        U0.R |= U0.C == str8;
                        U0.C = str8;
                        zzaif.a();
                        if (f0().b0(null, zzfy.O0)) {
                            int i = zzrVar.z;
                            zzhz zzhzVar8 = zzicVar2.g;
                            zzic.m(zzhzVar8);
                            zzhzVar8.Q();
                            U0.R |= U0.x != i;
                            U0.x = i;
                        }
                        U0.A(zzrVar.w);
                        String str9 = zzrVar.C;
                        zzhz zzhzVar9 = zzicVar2.g;
                        zzic.m(zzhzVar9);
                        zzhzVar9.Q();
                        U0.R |= U0.G == str9;
                        U0.G = str9;
                        int i2 = zzrVar.E;
                        zzhz zzhzVar10 = zzicVar2.g;
                        zzic.m(zzhzVar10);
                        zzhzVar10.Q();
                        U0.R |= U0.I != i2;
                        U0.I = i2;
                        if (!U0.o()) {
                            z3 = z;
                        } else if (!z) {
                            return U0;
                        }
                        hkn hknVar5 = this.c;
                        U(hknVar5);
                        hknVar5.V0(U0, z3);
                        return U0;
                    }
                    if (TextUtils.isEmpty(U0.F()) && j2.i(zzjkVar2)) {
                        U0.G(o(j2));
                    }
                }
            }
            if (TextUtils.isEmpty(U0.F()) && j2.i(zzjkVar2)) {
                U0.G(o(j2));
            }
        }
        z = false;
        zzic zzicVar22 = U0.a;
        U0.I(zzrVar.b);
        str = zzrVar.k;
        if (!TextUtils.isEmpty(str)) {
        }
        j = zzrVar.e;
        if (j != 0) {
        }
        str2 = zzrVar.c;
        if (!TextUtils.isEmpty(str2)) {
        }
        U0.R(zzrVar.j);
        str3 = zzrVar.d;
        if (str3 != null) {
        }
        U0.a(zzrVar.f);
        U0.d(zzrVar.h);
        str4 = zzrVar.g;
        if (!TextUtils.isEmpty(str4)) {
        }
        zzhz zzhzVar32 = zzicVar22.g;
        zzic.m(zzhzVar32);
        zzhzVar32.Q();
        U0.R |= U0.p == z2;
        U0.p = z2;
        Boolean bool2 = zzrVar.p;
        zzhz zzhzVar42 = zzicVar22.g;
        zzic.m(zzhzVar42);
        zzhzVar42.Q();
        U0.R |= !Objects.equals(U0.q, bool2);
        U0.q = bool2;
        U0.c(zzrVar.q);
        String str72 = zzrVar.u;
        zzhz zzhzVar52 = zzicVar22.g;
        zzic.m(zzhzVar52);
        zzhzVar52.Q();
        U0.R |= !Objects.equals(U0.t, str72);
        U0.t = str72;
        zzahk zzahkVar2 = zzahk.b;
        if (f0().b0(null, zzfy.L0)) {
        }
        boolean z42 = zzrVar.v;
        zzhz zzhzVar62 = zzicVar22.g;
        zzic.m(zzhzVar62);
        zzhzVar62.Q();
        U0.R |= U0.u == z42;
        U0.u = z42;
        String str82 = zzrVar.B;
        zzhz zzhzVar72 = zzicVar22.g;
        zzic.m(zzhzVar72);
        zzhzVar72.Q();
        U0.R |= U0.C == str82;
        U0.C = str82;
        zzaif.a();
        if (f0().b0(null, zzfy.O0)) {
        }
        U0.A(zzrVar.w);
        String str92 = zzrVar.C;
        zzhz zzhzVar92 = zzicVar22.g;
        zzic.m(zzhzVar92);
        zzhzVar92.Q();
        U0.R |= U0.G == str92;
        U0.G = str92;
        int i22 = zzrVar.E;
        zzhz zzhzVar102 = zzicVar22.g;
        zzic.m(zzhzVar102);
        zzhzVar102.Q();
        U0.R |= U0.I != i22;
        U0.I = i22;
        if (!U0.o()) {
        }
        hkn hknVar52 = this.c;
        U(hknVar52);
        hknVar52.V0(U0, z3);
        return U0;
    }

    @Override // defpackage.iso
    public final Context e() {
        return this.l.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List e0(Bundle bundle, zzr zzrVar) {
        int[] iArr;
        d().Q();
        zzaif.a();
        zzal f0 = f0();
        String str = zzrVar.a;
        if (!f0.b0(str, zzfy.O0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().g.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        hkn hknVar = this.c;
                        U(hknVar);
                        zzic zzicVar = (zzic) hknVar.b;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.f(str);
                        hknVar.Q();
                        hknVar.R();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e) {
                            e = e;
                            iArr = intArray;
                        }
                        try {
                            int delete = hknVar.H0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzgs zzgsVar = zzguVar.o;
                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(delete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            zzgsVar.d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzgu zzguVar2 = zzicVar.f;
                            zzic.m(zzguVar2);
                            zzguVar2.g.c(zzgu.U(str), e, "Error pruning trigger URIs. appId");
                            i++;
                            intArray = iArr;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        hkn hknVar2 = this.c;
        U(hknVar2);
        String str2 = zzrVar.a;
        Preconditions.f(str2);
        hknVar2.Q();
        hknVar2.R();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = hknVar2.H0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(cursor.getInt(2), cursor.getLong(1), string));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            zzgu zzguVar3 = ((zzic) hknVar2.b).f;
            zzic.m(zzguVar3);
            zzguVar3.g.c(zzgu.U(str2), e3, "Error querying trigger uris. appId");
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    @Override // defpackage.iso
    public final Clock f() {
        zzic zzicVar = this.l;
        Preconditions.i(zzicVar);
        return zzicVar.k;
    }

    public final zzal f0() {
        zzic zzicVar = this.l;
        Preconditions.i(zzicVar);
        return zzicVar.d;
    }

    public final long g() {
        ((DefaultClock) f()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zznn zznnVar = this.i;
        zznnVar.R();
        zznnVar.Q();
        zzhe zzheVar = zznnVar.k;
        long a = zzheVar.a();
        if (a == 0) {
            zzic.k(((zzic) zznnVar.b).i);
            a = r7.P0().nextInt(86400000) + 1;
            zzheVar.b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    public final zzht g0() {
        zzht zzhtVar = this.a;
        U(zzhtVar);
        return zzhtVar;
    }

    public final void h(zzbh zzbhVar, String str) {
        hkn hknVar = this.c;
        U(hknVar);
        xjo U0 = hknVar.U0(str);
        if (U0 != null) {
            zzic zzicVar = U0.a;
            if (!TextUtils.isEmpty(U0.O())) {
                Boolean P = P(U0);
                if (P == null) {
                    if (!"_ui".equals(zzbhVar.a)) {
                        b().j.b(zzgu.U(str), "Could not find package. appId");
                    }
                } else if (!P.booleanValue()) {
                    b().g.b(zzgu.U(str), "App version does not match; dropping event. appId");
                    return;
                }
                String H = U0.H();
                String O = U0.O();
                long Q = U0.Q();
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                String str2 = U0.l;
                zzhz zzhzVar2 = zzicVar.g;
                zzic.m(zzhzVar2);
                zzhzVar2.Q();
                long j = U0.m;
                zzhz zzhzVar3 = zzicVar.g;
                zzic.m(zzhzVar3);
                zzhzVar3.Q();
                long j2 = U0.n;
                zzhz zzhzVar4 = zzicVar.g;
                zzic.m(zzhzVar4);
                zzhzVar4.Q();
                boolean z = U0.o;
                String K2 = U0.K();
                zzhz zzhzVar5 = zzicVar.g;
                zzic.m(zzhzVar5);
                zzhzVar5.Q();
                boolean z2 = U0.p;
                Boolean x = U0.x();
                long b = U0.b();
                zzhz zzhzVar6 = zzicVar.g;
                zzic.m(zzhzVar6);
                zzhzVar6.Q();
                ArrayList arrayList = U0.s;
                String g = c(str).g();
                boolean z3 = U0.z();
                zzhz zzhzVar7 = zzicVar.g;
                zzic.m(zzhzVar7);
                zzhzVar7.Q();
                long j3 = U0.v;
                int i = c(str).b;
                String str3 = p0(str).b;
                zzhz zzhzVar8 = zzicVar.g;
                zzic.m(zzhzVar8);
                zzhzVar8.Q();
                int i2 = U0.x;
                zzhz zzhzVar9 = zzicVar.g;
                zzic.m(zzhzVar9);
                zzhzVar9.Q();
                i(zzbhVar, new zzr(str, H, O, Q, str2, j, j2, (String) null, z, false, K2, 0L, 0, z2, false, x, b, (List) arrayList, g, "", (String) null, z3, j3, i, str3, i2, U0.B, U0.D(), U0.s(), 0L, U0.t(), 0L));
                return;
            }
        }
        b().n.b(str, "No app data available; dropping event");
    }

    public final hkn h0() {
        hkn hknVar = this.c;
        U(hknVar);
        return hknVar;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:126), block:B:37:0x007d */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(zzbh zzbhVar, zzr zzrVar) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        zzbh b;
        zzbf zzbfVar;
        String str = zzrVar.a;
        Preconditions.f(str);
        zzgv a = zzgv.a(zzbhVar);
        Bundle bundle2 = a.e;
        zzpp l0 = l0();
        hkn hknVar = this.c;
        U(hknVar);
        zzic zzicVar = (zzic) hknVar.b;
        hknVar.Q();
        hknVar.R();
        Cursor cursor3 = null;
        try {
            try {
                cursor = hknVar.H0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.b(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    l0.d0(bundle2, bundle);
                    zzpp l02 = l0();
                    zzal f0 = f0();
                    f0.getClass();
                    l02.b0(a, Math.max(Math.min(f0.Z(str, zzfy.X), 100), 25));
                    b = a.b();
                    if (!f0().b0(null, zzfy.Z0)) {
                    }
                    j(b, zzrVar);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                zzhs zzhsVar = (zzhs) ((zzhr) zzpk.B0(zzhs.O(), cursor.getBlob(0))).m();
                hknVar.c.k0();
                bundle = zzpk.Z(zzhsVar.A());
                cursor.close();
            } catch (IOException e3) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.c(zzgu.U(str), e3, "Failed to retrieve default event parameters. appId");
            }
            l0.d0(bundle2, bundle);
            zzpp l022 = l0();
            zzal f02 = f0();
            f02.getClass();
            l022.b0(a, Math.max(Math.min(f02.Z(str, zzfy.X), 100), 25));
            b = a.b();
            if (!f0().b0(null, zzfy.Z0) && "_cmp".equals(b.a)) {
                zzbfVar = b.b;
                if ("referrer API v2".equals(zzbfVar.a.getString("_cis"))) {
                    String string = zzbfVar.a.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        X(new zzpl(b.d, string, "_lgclid", "auto"), zzrVar);
                    }
                }
            }
            j(b, zzrVar);
        }
        zzgu zzguVar3 = zzicVar.f;
        zzic.m(zzguVar3);
        zzguVar3.o.a("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        l0.d0(bundle2, bundle);
        zzpp l0222 = l0();
        zzal f022 = f0();
        f022.getClass();
        l0222.b0(a, Math.max(Math.min(f022.Z(str, zzfy.X), 100), 25));
        b = a.b();
        if (!f0().b0(null, zzfy.Z0)) {
            zzbfVar = b.b;
            if ("referrer API v2".equals(zzbfVar.a.getString("_cis"))) {
            }
        }
        j(b, zzrVar);
    }

    public final pko i0() {
        pko pkoVar = this.d;
        if (pkoVar != null) {
            return pkoVar;
        }
        a70.r("Network broadcast receiver not created");
        return null;
    }

    public final void j(zzbh zzbhVar, zzr zzrVar) {
        long j;
        List T0;
        zzic zzicVar;
        List T02;
        List<zzah> T03;
        long j2;
        String str;
        Preconditions.i(zzrVar);
        String str2 = zzrVar.a;
        Preconditions.f(str2);
        d().Q();
        m0();
        long j3 = zzbhVar.d;
        long j4 = zzbhVar.e;
        zzgv a = zzgv.a(zzbhVar);
        d().Q();
        zzlu zzluVar = this.F;
        if (zzluVar == null || (str = this.G) == null || !str.equals(str2)) {
            zzluVar = null;
        }
        zzpp.M0(zzluVar, a.e, false);
        zzbh b = a.b();
        k0();
        if (TextUtils.isEmpty(zzrVar.b)) {
            return;
        }
        if (!zzrVar.h) {
            d0(zzrVar);
            return;
        }
        List list = zzrVar.r;
        if (list != null) {
            String str3 = b.a;
            if (!list.contains(str3)) {
                b().n.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, b.c);
                return;
            }
            Bundle b1 = b.b.b1();
            j = j3;
            b1.putLong("ga_safelisted", 1L);
            b = new zzbh(str3, new zzbf(b1), b.c, b.d, b.e);
        } else {
            j = j3;
        }
        hkn hknVar = this.c;
        U(hknVar);
        hknVar.E0();
        try {
            String str4 = b.a;
            if ("_s".equals(str4)) {
                hkn hknVar2 = this.c;
                U(hknVar2);
                if (!hknVar2.f0(str2, "_s") && b.b.a.getLong("_sid") != 0) {
                    hkn hknVar3 = this.c;
                    U(hknVar3);
                    if (!hknVar3.f0(str2, "_f")) {
                        hkn hknVar4 = this.c;
                        U(hknVar4);
                        if (!hknVar4.f0(str2, "_v")) {
                            hkn hknVar5 = this.c;
                            U(hknVar5);
                            ((DefaultClock) f()).getClass();
                            hknVar5.j0(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(b, str2));
                        }
                    }
                    hkn hknVar6 = this.c;
                    U(hknVar6);
                    hknVar6.j0(str2, null, "_sid", k(b, str2));
                }
            }
            hkn hknVar7 = this.c;
            U(hknVar7);
            Preconditions.f(str2);
            hknVar7.Q();
            hknVar7.R();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                zzgu zzguVar = ((zzic) hknVar7.b).f;
                zzic.m(zzguVar);
                zzguVar.j.c(zzgu.U(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                T0 = Collections.EMPTY_LIST;
            } else {
                T0 = hknVar7.T0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = T0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                zzicVar = this.l;
                if (!hasNext) {
                    break;
                }
                zzah zzahVar = (zzah) it.next();
                if (zzahVar != null) {
                    b().o.d("User property timed out", zzahVar.a, zzicVar.j.c(zzahVar.c.b), zzahVar.c.zza());
                    zzbh zzbhVar2 = zzahVar.g;
                    if (zzbhVar2 != null) {
                        j2 = j;
                        l(new zzbh(zzbhVar2, j2, j4), zzrVar);
                    } else {
                        j2 = j;
                    }
                    hkn hknVar8 = this.c;
                    U(hknVar8);
                    hknVar8.R0(str2, zzahVar.c.b);
                    j = j2;
                }
            }
            long j5 = j;
            hkn hknVar9 = this.c;
            U(hknVar9);
            Preconditions.f(str2);
            hknVar9.Q();
            hknVar9.R();
            if (i < 0) {
                zzgu zzguVar2 = ((zzic) hknVar9.b).f;
                zzic.m(zzguVar2);
                zzguVar2.j.c(zzgu.U(str2), Long.valueOf(j5), "Invalid time querying expired conditional properties");
                T02 = Collections.EMPTY_LIST;
            } else {
                T02 = hknVar9.T0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j5)});
            }
            ArrayList arrayList = new ArrayList(T02.size());
            Iterator it2 = T02.iterator();
            while (it2.hasNext()) {
                zzah zzahVar2 = (zzah) it2.next();
                if (zzahVar2 != null) {
                    Iterator it3 = it2;
                    int i2 = i;
                    long j6 = j5;
                    b().o.d("User property expired", zzahVar2.a, zzicVar.j.c(zzahVar2.c.b), zzahVar2.c.zza());
                    hkn hknVar10 = this.c;
                    U(hknVar10);
                    hknVar10.K0(str2, zzahVar2.c.b);
                    zzbh zzbhVar3 = zzahVar2.k;
                    if (zzbhVar3 != null) {
                        arrayList.add(zzbhVar3);
                    }
                    hkn hknVar11 = this.c;
                    U(hknVar11);
                    hknVar11.R0(str2, zzahVar2.c.b);
                    it2 = it3;
                    i = i2;
                    j5 = j6;
                }
            }
            int i3 = i;
            long j7 = j5;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                long j8 = j7;
                l(new zzbh((zzbh) it4.next(), j8, j4), zzrVar);
                j7 = j8;
                j4 = j4;
            }
            long j9 = j4;
            long j10 = j7;
            hkn hknVar12 = this.c;
            U(hknVar12);
            Preconditions.f(str2);
            Preconditions.f(str4);
            hknVar12.Q();
            hknVar12.R();
            if (i3 < 0) {
                zzic zzicVar2 = (zzic) hknVar12.b;
                zzgu zzguVar3 = zzicVar2.f;
                zzic.m(zzguVar3);
                zzguVar3.j.d("Invalid time querying triggered conditional properties", zzgu.U(str2), zzicVar2.j.a(str4), Long.valueOf(j10));
                T03 = Collections.EMPTY_LIST;
            } else {
                T03 = hknVar12.T0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
            }
            ArrayList arrayList2 = new ArrayList(T03.size());
            for (zzah zzahVar3 : T03) {
                if (zzahVar3 != null) {
                    zzpl zzplVar = zzahVar3.c;
                    String str5 = zzahVar3.a;
                    Preconditions.i(str5);
                    long j11 = j10;
                    String str6 = zzahVar3.b;
                    String str7 = zzplVar.b;
                    Object zza = zzplVar.zza();
                    Preconditions.i(zza);
                    z1p z1pVar = new z1p(str5, str6, str7, j11, zza);
                    j10 = j11;
                    Object obj = z1pVar.e;
                    String str8 = z1pVar.c;
                    hkn hknVar13 = this.c;
                    U(hknVar13);
                    if (hknVar13.L0(z1pVar)) {
                        b().o.d("User property triggered", zzahVar3.a, zzicVar.j.c(str8), obj);
                    } else {
                        b().g.d("Too many active user properties, ignoring", zzgu.U(zzahVar3.a), zzicVar.j.c(str8), obj);
                    }
                    zzbh zzbhVar4 = zzahVar3.i;
                    if (zzbhVar4 != null) {
                        arrayList2.add(zzbhVar4);
                    }
                    zzahVar3.c = new zzpl(z1pVar);
                    zzahVar3.e = true;
                    hkn hknVar14 = this.c;
                    U(hknVar14);
                    hknVar14.P0(zzahVar3);
                }
            }
            l(b, zzrVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                long j12 = j9;
                l(new zzbh((zzbh) it5.next(), j10, j12), zzrVar);
                j9 = j12;
            }
            hkn hknVar15 = this.c;
            U(hknVar15);
            hknVar15.F0();
            hkn hknVar16 = this.c;
            U(hknVar16);
            hknVar16.G0();
        } catch (Throwable th) {
            hkn hknVar17 = this.c;
            U(hknVar17);
            hknVar17.G0();
            throw th;
        }
    }

    public final t9n j0() {
        t9n t9nVar = this.f;
        U(t9nVar);
        return t9nVar;
    }

    public final Bundle k(zzbh zzbhVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbhVar.b.a.getLong("_sid"));
        hkn hknVar = this.c;
        U(hknVar);
        z1p M0 = hknVar.M0(str, "_sno");
        if (M0 != null) {
            Object obj = M0.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final zzpk k0() {
        zzpk zzpkVar = this.g;
        U(zzpkVar);
        return zzpkVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:335|(2:337|(9:339|340|(1:342)(1:343)|54|(0)(0)|57|(0)(0)|63|64))|344|345|346|347|348|340|(0)(0)|54|(0)(0)|57|(0)(0)|63|64) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:(2:66|(3:68|(1:70)|71))|72|(2:74|(3:76|(1:78)|79))|80|81|(1:83)|84|(2:88|(1:90))|91|(3:92|93|94)|95|(1:97)|98|(2:100|(2:106|107)(1:105))(1:303)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)(1:302)|126|127|(2:129|(38:131|(1:135)|136|(1:138)(1:300)|139|(1:141)(15:271|(1:273)(1:299)|274|(1:276)(1:298)|277|(1:279)(1:297)|280|(1:282)(1:296)|283|(1:285)(1:295)|286|(1:288)(1:294)|289|(1:291)(1:293)|292)|142|(1:144)|145|(1:147)|148|(1:152)|153|(3:244|245|(2:247|(4:250|(1:252)|253|(2:259|(28:261|(1:263)(1:268)|264|(1:266)|267|156|(2:158|(1:160)(2:161|162))|163|(7:165|166|167|168|(1:170)|171|172)(1:243)|173|(1:177)|178|(1:180)|181|(6:184|(2:186|(5:188|(1:190)(1:197)|191|(2:193|194)(1:196)|195))|198|199|195|182)|200|201|202|203|204|(2:205|(2:207|(2:209|210)(1:224))(3:225|226|(1:231)(1:230)))|211|212|213|(1:215)(2:220|221)|216|217|218)))))|155|156|(0)|163|(0)(0)|173|(2:175|177)|178|(0)|181|(1:182)|200|201|202|203|204|(3:205|(0)(0)|224)|211|212|213|(0)(0)|216|217|218))|301|142|(0)|145|(0)|148|(2:150|152)|153|(0)|155|156|(0)|163|(0)(0)|173|(0)|178|(0)|181|(1:182)|200|201|202|203|204|(3:205|(0)(0)|224)|211|212|213|(0)(0)|216|217|218) */
    /* JADX WARN: Can't wrap try/catch for region: R(64:(2:66|(3:68|(1:70)|71))|72|(2:74|(3:76|(1:78)|79))|80|81|(1:83)|84|(2:88|(1:90))|91|92|93|94|95|(1:97)|98|(2:100|(2:106|107)(1:105))(1:303)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)(1:302)|126|127|(2:129|(38:131|(1:135)|136|(1:138)(1:300)|139|(1:141)(15:271|(1:273)(1:299)|274|(1:276)(1:298)|277|(1:279)(1:297)|280|(1:282)(1:296)|283|(1:285)(1:295)|286|(1:288)(1:294)|289|(1:291)(1:293)|292)|142|(1:144)|145|(1:147)|148|(1:152)|153|(3:244|245|(2:247|(4:250|(1:252)|253|(2:259|(28:261|(1:263)(1:268)|264|(1:266)|267|156|(2:158|(1:160)(2:161|162))|163|(7:165|166|167|168|(1:170)|171|172)(1:243)|173|(1:177)|178|(1:180)|181|(6:184|(2:186|(5:188|(1:190)(1:197)|191|(2:193|194)(1:196)|195))|198|199|195|182)|200|201|202|203|204|(2:205|(2:207|(2:209|210)(1:224))(3:225|226|(1:231)(1:230)))|211|212|213|(1:215)(2:220|221)|216|217|218)))))|155|156|(0)|163|(0)(0)|173|(2:175|177)|178|(0)|181|(1:182)|200|201|202|203|204|(3:205|(0)(0)|224)|211|212|213|(0)(0)|216|217|218))|301|142|(0)|145|(0)|148|(2:150|152)|153|(0)|155|156|(0)|163|(0)(0)|173|(0)|178|(0)|181|(1:182)|200|201|202|203|204|(3:205|(0)(0)|224)|211|212|213|(0)(0)|216|217|218) */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0b21, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0b28, code lost:
    
        ((com.google.android.gms.measurement.internal.zzic) r1.b).b().g.c(com.google.android.gms.measurement.internal.zzgu.U(r2.a), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0b3e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0b59, code lost:
    
        r3.b().g.c(com.google.android.gms.measurement.internal.zzgu.U(r6.w()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x02da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x02db, code lost:
    
        ((com.google.android.gms.measurement.internal.zzic) r10.b).b().g.c(com.google.android.gms.measurement.internal.zzgu.U(r11), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x075c A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:41:0x0196, B:44:0x01a5, B:46:0x01ad, B:49:0x01bc, B:54:0x0344, B:57:0x037c, B:59:0x03c3, B:61:0x03c8, B:62:0x03dd, B:66:0x03e8, B:68:0x0402, B:70:0x0408, B:71:0x041d, B:74:0x0439, B:78:0x0458, B:79:0x046d, B:80:0x0476, B:83:0x0493, B:84:0x04a7, B:86:0x04af, B:88:0x04b9, B:90:0x04bf, B:91:0x04c6, B:93:0x04d3, B:97:0x0516, B:98:0x0529, B:100:0x0558, B:103:0x0582, B:105:0x058c, B:107:0x05d2, B:108:0x05fb, B:110:0x0628, B:111:0x062b, B:113:0x0633, B:114:0x0636, B:116:0x063e, B:117:0x0641, B:119:0x0649, B:120:0x064c, B:122:0x0655, B:123:0x0659, B:125:0x0664, B:126:0x0670, B:129:0x06a1, B:131:0x06b3, B:135:0x06c9, B:139:0x06d7, B:142:0x0756, B:144:0x075c, B:145:0x075f, B:147:0x0775, B:148:0x077f, B:150:0x078c, B:152:0x0796, B:153:0x0799, B:252:0x07ce, B:271:0x06e0, B:274:0x06ee, B:277:0x06fd, B:280:0x070c, B:283:0x071b, B:286:0x072a, B:289:0x0737, B:292:0x0746, B:303:0x05ed, B:306:0x04fd, B:307:0x0356, B:308:0x0362, B:310:0x0368, B:313:0x0376, B:318:0x01da, B:321:0x01ec, B:323:0x0201, B:328:0x0219, B:331:0x0247, B:333:0x024d, B:335:0x025b, B:337:0x0269, B:339:0x027e, B:340:0x0303, B:342:0x030d, B:345:0x02af, B:347:0x02c8, B:348:0x02ee, B:351:0x02db, B:353:0x0225, B:355:0x0241), top: B:40:0x0196, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0775 A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:41:0x0196, B:44:0x01a5, B:46:0x01ad, B:49:0x01bc, B:54:0x0344, B:57:0x037c, B:59:0x03c3, B:61:0x03c8, B:62:0x03dd, B:66:0x03e8, B:68:0x0402, B:70:0x0408, B:71:0x041d, B:74:0x0439, B:78:0x0458, B:79:0x046d, B:80:0x0476, B:83:0x0493, B:84:0x04a7, B:86:0x04af, B:88:0x04b9, B:90:0x04bf, B:91:0x04c6, B:93:0x04d3, B:97:0x0516, B:98:0x0529, B:100:0x0558, B:103:0x0582, B:105:0x058c, B:107:0x05d2, B:108:0x05fb, B:110:0x0628, B:111:0x062b, B:113:0x0633, B:114:0x0636, B:116:0x063e, B:117:0x0641, B:119:0x0649, B:120:0x064c, B:122:0x0655, B:123:0x0659, B:125:0x0664, B:126:0x0670, B:129:0x06a1, B:131:0x06b3, B:135:0x06c9, B:139:0x06d7, B:142:0x0756, B:144:0x075c, B:145:0x075f, B:147:0x0775, B:148:0x077f, B:150:0x078c, B:152:0x0796, B:153:0x0799, B:252:0x07ce, B:271:0x06e0, B:274:0x06ee, B:277:0x06fd, B:280:0x070c, B:283:0x071b, B:286:0x072a, B:289:0x0737, B:292:0x0746, B:303:0x05ed, B:306:0x04fd, B:307:0x0356, B:308:0x0362, B:310:0x0368, B:313:0x0376, B:318:0x01da, B:321:0x01ec, B:323:0x0201, B:328:0x0219, B:331:0x0247, B:333:0x024d, B:335:0x025b, B:337:0x0269, B:339:0x027e, B:340:0x0303, B:342:0x030d, B:345:0x02af, B:347:0x02c8, B:348:0x02ee, B:351:0x02db, B:353:0x0225, B:355:0x0241), top: B:40:0x0196, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08a1 A[Catch: all -> 0x0833, TryCatch #1 {all -> 0x0833, blocks: (B:245:0x07ad, B:247:0x07b1, B:250:0x07c3, B:253:0x07d7, B:255:0x07e1, B:257:0x07ed, B:259:0x07f7, B:261:0x0805, B:263:0x081f, B:264:0x083a, B:266:0x0848, B:267:0x0851, B:156:0x085e, B:158:0x08a1, B:161:0x08ac, B:162:0x08b6, B:163:0x08b7, B:165:0x08c1), top: B:244:0x07ad }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x08c1 A[Catch: all -> 0x0833, TRY_LEAVE, TryCatch #1 {all -> 0x0833, blocks: (B:245:0x07ad, B:247:0x07b1, B:250:0x07c3, B:253:0x07d7, B:255:0x07e1, B:257:0x07ed, B:259:0x07f7, B:261:0x0805, B:263:0x081f, B:264:0x083a, B:266:0x0848, B:267:0x0851, B:156:0x085e, B:158:0x08a1, B:161:0x08ac, B:162:0x08b6, B:163:0x08b7, B:165:0x08c1), top: B:244:0x07ad }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x092c A[Catch: all -> 0x08eb, TryCatch #5 {all -> 0x08eb, blocks: (B:168:0x08c8, B:170:0x08df, B:172:0x08ee, B:173:0x0924, B:175:0x092c, B:177:0x0936, B:178:0x0940, B:180:0x094a, B:181:0x0954, B:182:0x095d, B:184:0x0963, B:186:0x09ad, B:188:0x09bf, B:191:0x09da, B:193:0x09ea, B:197:0x09ce, B:201:0x09fd, B:203:0x0a3f, B:204:0x0a4a, B:205:0x0a5c, B:207:0x0a62, B:211:0x0aa9, B:213:0x0afc, B:215:0x0b0d, B:216:0x0b6c, B:221:0x0b25, B:223:0x0b28, B:226:0x0a6f, B:228:0x0a95, B:234:0x0b41, B:235:0x0b58, B:238:0x0b59), top: B:167:0x08c8, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x094a A[Catch: all -> 0x08eb, TryCatch #5 {all -> 0x08eb, blocks: (B:168:0x08c8, B:170:0x08df, B:172:0x08ee, B:173:0x0924, B:175:0x092c, B:177:0x0936, B:178:0x0940, B:180:0x094a, B:181:0x0954, B:182:0x095d, B:184:0x0963, B:186:0x09ad, B:188:0x09bf, B:191:0x09da, B:193:0x09ea, B:197:0x09ce, B:201:0x09fd, B:203:0x0a3f, B:204:0x0a4a, B:205:0x0a5c, B:207:0x0a62, B:211:0x0aa9, B:213:0x0afc, B:215:0x0b0d, B:216:0x0b6c, B:221:0x0b25, B:223:0x0b28, B:226:0x0a6f, B:228:0x0a95, B:234:0x0b41, B:235:0x0b58, B:238:0x0b59), top: B:167:0x08c8, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0963 A[Catch: all -> 0x08eb, TryCatch #5 {all -> 0x08eb, blocks: (B:168:0x08c8, B:170:0x08df, B:172:0x08ee, B:173:0x0924, B:175:0x092c, B:177:0x0936, B:178:0x0940, B:180:0x094a, B:181:0x0954, B:182:0x095d, B:184:0x0963, B:186:0x09ad, B:188:0x09bf, B:191:0x09da, B:193:0x09ea, B:197:0x09ce, B:201:0x09fd, B:203:0x0a3f, B:204:0x0a4a, B:205:0x0a5c, B:207:0x0a62, B:211:0x0aa9, B:213:0x0afc, B:215:0x0b0d, B:216:0x0b6c, B:221:0x0b25, B:223:0x0b28, B:226:0x0a6f, B:228:0x0a95, B:234:0x0b41, B:235:0x0b58, B:238:0x0b59), top: B:167:0x08c8, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0a62 A[Catch: all -> 0x08eb, TryCatch #5 {all -> 0x08eb, blocks: (B:168:0x08c8, B:170:0x08df, B:172:0x08ee, B:173:0x0924, B:175:0x092c, B:177:0x0936, B:178:0x0940, B:180:0x094a, B:181:0x0954, B:182:0x095d, B:184:0x0963, B:186:0x09ad, B:188:0x09bf, B:191:0x09da, B:193:0x09ea, B:197:0x09ce, B:201:0x09fd, B:203:0x0a3f, B:204:0x0a4a, B:205:0x0a5c, B:207:0x0a62, B:211:0x0aa9, B:213:0x0afc, B:215:0x0b0d, B:216:0x0b6c, B:221:0x0b25, B:223:0x0b28, B:226:0x0a6f, B:228:0x0a95, B:234:0x0b41, B:235:0x0b58, B:238:0x0b59), top: B:167:0x08c8, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0b0d A[Catch: all -> 0x08eb, SQLiteException -> 0x0b21, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0b21, blocks: (B:213:0x0afc, B:215:0x0b0d), top: B:212:0x0afc, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a6f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0356 A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:41:0x0196, B:44:0x01a5, B:46:0x01ad, B:49:0x01bc, B:54:0x0344, B:57:0x037c, B:59:0x03c3, B:61:0x03c8, B:62:0x03dd, B:66:0x03e8, B:68:0x0402, B:70:0x0408, B:71:0x041d, B:74:0x0439, B:78:0x0458, B:79:0x046d, B:80:0x0476, B:83:0x0493, B:84:0x04a7, B:86:0x04af, B:88:0x04b9, B:90:0x04bf, B:91:0x04c6, B:93:0x04d3, B:97:0x0516, B:98:0x0529, B:100:0x0558, B:103:0x0582, B:105:0x058c, B:107:0x05d2, B:108:0x05fb, B:110:0x0628, B:111:0x062b, B:113:0x0633, B:114:0x0636, B:116:0x063e, B:117:0x0641, B:119:0x0649, B:120:0x064c, B:122:0x0655, B:123:0x0659, B:125:0x0664, B:126:0x0670, B:129:0x06a1, B:131:0x06b3, B:135:0x06c9, B:139:0x06d7, B:142:0x0756, B:144:0x075c, B:145:0x075f, B:147:0x0775, B:148:0x077f, B:150:0x078c, B:152:0x0796, B:153:0x0799, B:252:0x07ce, B:271:0x06e0, B:274:0x06ee, B:277:0x06fd, B:280:0x070c, B:283:0x071b, B:286:0x072a, B:289:0x0737, B:292:0x0746, B:303:0x05ed, B:306:0x04fd, B:307:0x0356, B:308:0x0362, B:310:0x0368, B:313:0x0376, B:318:0x01da, B:321:0x01ec, B:323:0x0201, B:328:0x0219, B:331:0x0247, B:333:0x024d, B:335:0x025b, B:337:0x0269, B:339:0x027e, B:340:0x0303, B:342:0x030d, B:345:0x02af, B:347:0x02c8, B:348:0x02ee, B:351:0x02db, B:353:0x0225, B:355:0x0241), top: B:40:0x0196, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x030d A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:41:0x0196, B:44:0x01a5, B:46:0x01ad, B:49:0x01bc, B:54:0x0344, B:57:0x037c, B:59:0x03c3, B:61:0x03c8, B:62:0x03dd, B:66:0x03e8, B:68:0x0402, B:70:0x0408, B:71:0x041d, B:74:0x0439, B:78:0x0458, B:79:0x046d, B:80:0x0476, B:83:0x0493, B:84:0x04a7, B:86:0x04af, B:88:0x04b9, B:90:0x04bf, B:91:0x04c6, B:93:0x04d3, B:97:0x0516, B:98:0x0529, B:100:0x0558, B:103:0x0582, B:105:0x058c, B:107:0x05d2, B:108:0x05fb, B:110:0x0628, B:111:0x062b, B:113:0x0633, B:114:0x0636, B:116:0x063e, B:117:0x0641, B:119:0x0649, B:120:0x064c, B:122:0x0655, B:123:0x0659, B:125:0x0664, B:126:0x0670, B:129:0x06a1, B:131:0x06b3, B:135:0x06c9, B:139:0x06d7, B:142:0x0756, B:144:0x075c, B:145:0x075f, B:147:0x0775, B:148:0x077f, B:150:0x078c, B:152:0x0796, B:153:0x0799, B:252:0x07ce, B:271:0x06e0, B:274:0x06ee, B:277:0x06fd, B:280:0x070c, B:283:0x071b, B:286:0x072a, B:289:0x0737, B:292:0x0746, B:303:0x05ed, B:306:0x04fd, B:307:0x0356, B:308:0x0362, B:310:0x0368, B:313:0x0376, B:318:0x01da, B:321:0x01ec, B:323:0x0201, B:328:0x0219, B:331:0x0247, B:333:0x024d, B:335:0x025b, B:337:0x0269, B:339:0x027e, B:340:0x0303, B:342:0x030d, B:345:0x02af, B:347:0x02c8, B:348:0x02ee, B:351:0x02db, B:353:0x0225, B:355:0x0241), top: B:40:0x0196, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03c3 A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:41:0x0196, B:44:0x01a5, B:46:0x01ad, B:49:0x01bc, B:54:0x0344, B:57:0x037c, B:59:0x03c3, B:61:0x03c8, B:62:0x03dd, B:66:0x03e8, B:68:0x0402, B:70:0x0408, B:71:0x041d, B:74:0x0439, B:78:0x0458, B:79:0x046d, B:80:0x0476, B:83:0x0493, B:84:0x04a7, B:86:0x04af, B:88:0x04b9, B:90:0x04bf, B:91:0x04c6, B:93:0x04d3, B:97:0x0516, B:98:0x0529, B:100:0x0558, B:103:0x0582, B:105:0x058c, B:107:0x05d2, B:108:0x05fb, B:110:0x0628, B:111:0x062b, B:113:0x0633, B:114:0x0636, B:116:0x063e, B:117:0x0641, B:119:0x0649, B:120:0x064c, B:122:0x0655, B:123:0x0659, B:125:0x0664, B:126:0x0670, B:129:0x06a1, B:131:0x06b3, B:135:0x06c9, B:139:0x06d7, B:142:0x0756, B:144:0x075c, B:145:0x075f, B:147:0x0775, B:148:0x077f, B:150:0x078c, B:152:0x0796, B:153:0x0799, B:252:0x07ce, B:271:0x06e0, B:274:0x06ee, B:277:0x06fd, B:280:0x070c, B:283:0x071b, B:286:0x072a, B:289:0x0737, B:292:0x0746, B:303:0x05ed, B:306:0x04fd, B:307:0x0356, B:308:0x0362, B:310:0x0368, B:313:0x0376, B:318:0x01da, B:321:0x01ec, B:323:0x0201, B:328:0x0219, B:331:0x0247, B:333:0x024d, B:335:0x025b, B:337:0x0269, B:339:0x027e, B:340:0x0303, B:342:0x030d, B:345:0x02af, B:347:0x02c8, B:348:0x02ee, B:351:0x02db, B:353:0x0225, B:355:0x0241), top: B:40:0x0196, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(zzbh zzbhVar, zzr zzrVar) {
        String str;
        zzpg zzpgVar;
        String str2;
        boolean z;
        long j;
        String str3;
        String str4;
        String str5;
        muo muoVar;
        String str6;
        zzbf zzbfVar;
        zzic zzicVar;
        z1p z1pVar;
        long j2;
        long intValue;
        long j3;
        zzbc zzbcVar;
        emn emnVar;
        String str7;
        String str8;
        String str9;
        String str10;
        long j4;
        zzjl j5;
        xjo U0;
        zzbc zzbcVar2;
        long j6;
        xjo U02;
        int i;
        List N0;
        int i2;
        hkn h0;
        zzid zzidVar;
        hkn h02;
        Iterator<String> it;
        ContentValues contentValues;
        String str11;
        long z0;
        List h03;
        z1p M0;
        Preconditions.i(zzrVar);
        boolean z2 = zzrVar.h;
        String str12 = zzrVar.a;
        Preconditions.f(str12);
        long nanoTime = System.nanoTime();
        d().Q();
        m0();
        k0();
        String str13 = zzrVar.b;
        if (TextUtils.isEmpty(str13)) {
            return;
        }
        if (!z2) {
            d0(zzrVar);
            return;
        }
        zzht g0 = g0();
        String str14 = zzbhVar.a;
        boolean f0 = g0.f0(str12, str14);
        zzic zzicVar2 = this.l;
        muo muoVar2 = this.J;
        if (f0) {
            b().j.c(zzgu.U(str12), zzicVar2.j.a(str14), "Dropping blocked event. appId");
            if (!"1".equals(g0().zza(str12, "measurement.upload.blacklist_internal")) && !"1".equals(g0().zza(str12, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str14)) {
                    return;
                }
                l0();
                zzpp.i0(muoVar2, str12, 11, "_ev", str14, 0);
                return;
            }
            xjo U03 = h0().U0(str12);
            if (U03 != null) {
                zzic zzicVar3 = U03.a;
                zzhz zzhzVar = zzicVar3.g;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                long j7 = U03.T;
                zzhz zzhzVar2 = zzicVar3.g;
                zzic.m(zzhzVar2);
                zzhzVar2.Q();
                long abs = Math.abs(((DefaultClock) f()).a() - Math.max(j7, U03.S));
                f0();
                if (abs > ((Long) zzfy.N.a(null)).longValue()) {
                    b().n.a("Fetching config for blocked app");
                    A(U03);
                    return;
                }
                return;
            }
            return;
        }
        zzgv a = zzgv.a(zzbhVar);
        zzpp l0 = l0();
        zzal f02 = f0();
        f02.getClass();
        l0.b0(a, Math.max(Math.min(f02.Z(str12, zzfy.X), 100), 25));
        int max = Math.max(Math.min(f0().Z(str12, zzfy.f0), 35), 10);
        Bundle bundle = a.e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str15 = (String) it2.next();
            Iterator it3 = it2;
            if ("items".equals(str15)) {
                l0().c0(bundle.getParcelableArray(str15), max);
            }
            it2 = it3;
        }
        zzbh b = a.b();
        zzbf zzbfVar2 = b.b;
        String str16 = b.a;
        if (Log.isLoggable(b().W(), 2)) {
            str = "_err";
            b().o.b(zzicVar2.j.d(b), "Logging event");
        } else {
            str = "_err";
        }
        h0().E0();
        try {
            d0(zzrVar);
            int i3 = 1;
            boolean z3 = "ecommerce_purchase".equals(str16) || "purchase".equals(str16) || "refund".equals(str16);
            if (!"_iap".equals(str16)) {
                if (!z3) {
                    str2 = MBridgeConstans.APP_ID;
                    str3 = "_fx";
                    z = z2;
                    zzbfVar = zzbfVar2;
                    str4 = str16;
                    str5 = str13;
                    muoVar = muoVar2;
                    str6 = str;
                    boolean Q0 = zzpp.Q0(str4);
                    String str17 = str4;
                    boolean equals = str6.equals(str17);
                    l0();
                    if (zzbfVar != null) {
                        j2 = 0;
                    } else {
                        Iterator<String> it4 = zzbfVar.a.keySet().iterator();
                        j2 = 0;
                        while (it4.hasNext()) {
                            if (zzbfVar.Y0(it4.next()) instanceof Parcelable[]) {
                                j2 += ((Parcelable[]) r5).length;
                            }
                        }
                    }
                    zzbf zzbfVar3 = zzbfVar;
                    zzar X0 = h0().X0(g(), str12, j2 + 1, true, Q0, false, equals, false, false, false);
                    long j8 = X0.b;
                    f0();
                    intValue = j8 - ((Integer) zzfy.l.a(null)).intValue();
                    if (intValue <= 0) {
                        if (intValue % 1000 == 1) {
                            b().g.c(zzgu.U(str12), Long.valueOf(X0.b), "Data loss. Too many events logged. appId, count");
                        }
                        h0().F0();
                    } else {
                        if (Q0) {
                            long j9 = X0.a;
                            f0();
                            long intValue2 = j9 - ((Integer) zzfy.n.a(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    b().g.c(zzgu.U(str12), Long.valueOf(X0.a), "Data loss. Too many public events logged. appId, count");
                                }
                                l0();
                                zzpp.i0(muoVar, str12, 16, "_ev", b.a, 0);
                                h0().F0();
                            }
                        }
                        if (equals) {
                            long max2 = X0.d - Math.max(0, Math.min(1000000, f0().Z(str12, zzfy.m)));
                            if (max2 > 0) {
                                if (max2 == 1) {
                                    b().g.c(zzgu.U(str12), Long.valueOf(X0.d), "Too many error events logged. appId, count");
                                }
                                h0().F0();
                            }
                        }
                        Bundle b1 = zzbfVar3.b1();
                        l0().h0(b1, "_o", b.c);
                        if (l0().v0(str12, zzrVar.B)) {
                            l0().h0(b1, "_dbg", 1L);
                            l0().h0(b1, "_r", 1L);
                        }
                        if ("_s".equals(str17) && (M0 = h0().M0(str12, "_sno")) != null) {
                            Object obj = M0.e;
                            if (obj instanceof Long) {
                                l0().h0(b1, "_sno", obj);
                            }
                        }
                        hkn h04 = h0();
                        Preconditions.f(str12);
                        h04.Q();
                        h04.R();
                        try {
                            j3 = h04.H0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str12, String.valueOf(Math.max(0, Math.min(1000000, ((zzic) h04.b).d.Z(str12, zzfy.q))))});
                        } catch (SQLiteException e) {
                            ((zzic) h04.b).b().g.c(zzgu.U(str12), e, "Error deleting over the limit events. appId");
                            j3 = 0;
                        }
                        if (j3 > 0) {
                            b().j.c(zzgu.U(str12), Long.valueOf(j3), "Data lost. Too many events stored on disk, deleted. appId");
                        }
                        zzic zzicVar4 = this.l;
                        zzbc zzbcVar3 = new zzbc(zzicVar4, b.c, str12, b.a, b.d, b.e, 0L, b1);
                        String str18 = str12;
                        hkn h05 = h0();
                        String str19 = zzbcVar3.b;
                        emn q0 = h05.q0("events", str18, str19);
                        if (q0 == null) {
                            long h06 = h0().h0(str18);
                            f0().getClass();
                            zzfx zzfxVar = zzfy.W;
                            if (h06 < Math.max(Math.min(r5.Z(str18, zzfxVar), 2000), 500) || !Q0 || l0().Y0(str19)) {
                                str18 = str18;
                                emnVar = new emn(str18, str19, 0L, 0L, 0L, zzbcVar3.d, 0L, null, null, null, null);
                                zzbcVar = zzbcVar3;
                            } else {
                                zzgs zzgsVar = b().g;
                                mgo U = zzgu.U(str18);
                                String a2 = zzicVar4.j.a(str19);
                                zzal f03 = f0();
                                f03.getClass();
                                zzgsVar.d("Too many event names used, ignoring event. appId, name, supported count", U, a2, Integer.valueOf(Math.max(Math.min(f03.Z(str18, zzfxVar), 2000), 500)));
                                l0();
                                zzpp.i0(muoVar, str18, 8, null, null, 0);
                            }
                        } else {
                            zzbc a3 = zzbcVar3.a(zzicVar4, q0.f);
                            emn a4 = q0.a(a3.d);
                            zzbcVar = a3;
                            emnVar = a4;
                        }
                        h0().r0("events", emnVar);
                        d().Q();
                        m0();
                        String str20 = zzbcVar.a;
                        Preconditions.f(str20);
                        Preconditions.b(str20.equals(str18));
                        com.google.android.gms.internal.measurement.zzic e0 = zzid.e0();
                        e0.G();
                        e0.r();
                        if (!TextUtils.isEmpty(str18)) {
                            e0.x(str18);
                        }
                        String str21 = zzrVar.d;
                        if (!TextUtils.isEmpty(str21)) {
                            e0.v(str21);
                        }
                        String str22 = zzrVar.c;
                        if (!TextUtils.isEmpty(str22)) {
                            e0.y(str22);
                        }
                        String str23 = zzrVar.u;
                        if (!TextUtils.isEmpty(str23)) {
                            e0.e0(str23);
                        }
                        long j10 = zzrVar.j;
                        if (j10 != -2147483648L) {
                            e0.W((int) j10);
                        }
                        long j11 = zzrVar.e;
                        e0.z(j11);
                        if (TextUtils.isEmpty(str5)) {
                            str7 = "raw_events";
                            str8 = str5;
                        } else {
                            str7 = "raw_events";
                            str8 = str5;
                            e0.R(str8);
                        }
                        Preconditions.i(str18);
                        String str24 = str23;
                        zzjl c = c(str18);
                        String str25 = zzrVar.s;
                        zzjl j12 = c.j(zzjl.c(100, str25));
                        e0.d0(j12.f());
                        zzaif.a();
                        boolean b0 = f0().b0(str18, zzfy.O0);
                        zzjk zzjkVar = zzjk.AD_STORAGE;
                        try {
                            if (b0) {
                                l0();
                                if (zzpp.s0((String) zzfy.q0.a(null), str18)) {
                                    e0.I(zzrVar.z);
                                    str9 = str8;
                                    str10 = str22;
                                    long j13 = zzrVar.A;
                                    if (!j12.i(zzjkVar) && j13 != 0) {
                                        j13 = (j13 & (-2)) | 32;
                                    }
                                    e0.g0(j13 == 1);
                                    if (j13 != 0) {
                                        com.google.android.gms.internal.measurement.zzhd F = com.google.android.gms.internal.measurement.zzhe.F();
                                        F.p((j13 & 1) != 0);
                                        F.q((j13 & 2) != 0);
                                        F.r((j13 & 4) != 0);
                                        F.s((j13 & 8) != 0);
                                        F.t((j13 & 16) != 0);
                                        F.u((j13 & 32) != 0);
                                        F.v((j13 & 64) != 0);
                                        e0.J((com.google.android.gms.internal.measurement.zzhe) F.m());
                                    }
                                    j4 = zzrVar.f;
                                    if (j4 != 0) {
                                        e0.E(j4);
                                    }
                                    long j14 = zzrVar.q;
                                    e0.b0(j14);
                                    String str26 = str10;
                                    if (f0().b0(null, zzfy.U0)) {
                                        f0();
                                        e0.O(zzagr.a());
                                    }
                                    if (f0().b0(null, zzfy.V0) && (h03 = g0().h0(str18)) != null) {
                                        e0.Y(h03);
                                    }
                                    j5 = c(str18).j(zzjl.c(100, str25));
                                    if (j5.i(zzjkVar)) {
                                        try {
                                            boolean z4 = zzrVar.n;
                                            if (z4) {
                                                Pair U2 = this.i.U(zzrVar, j5);
                                                if (!TextUtils.isEmpty((CharSequence) U2.first) && z4) {
                                                    e0.B((String) U2.first);
                                                    Object obj2 = U2.second;
                                                    if (obj2 != null) {
                                                        e0.C(((Boolean) obj2).booleanValue());
                                                    }
                                                    String str27 = str3;
                                                    if (!zzbcVar.b.equals(str27) && !((String) U2.first).equals("00000000-0000-0000-0000-000000000000") && (U0 = h0().U0(str18)) != null) {
                                                        zzhz zzhzVar3 = U0.a.g;
                                                        zzic.m(zzhzVar3);
                                                        zzhzVar3.Q();
                                                        if (U0.y) {
                                                            zzbcVar2 = zzbcVar;
                                                            u(str18, false, null, null);
                                                            Bundle bundle2 = new Bundle();
                                                            zzhz zzhzVar4 = U0.a.g;
                                                            zzic.m(zzhzVar4);
                                                            zzhzVar4.Q();
                                                            Long l = U0.z;
                                                            if (l != null) {
                                                                j6 = j14;
                                                                bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                            } else {
                                                                j6 = j14;
                                                            }
                                                            zzhz zzhzVar5 = U0.a.g;
                                                            zzic.m(zzhzVar5);
                                                            zzhzVar5.Q();
                                                            Long l2 = U0.A;
                                                            if (l2 != null) {
                                                                bundle2.putLong("_uwa", l2.longValue());
                                                            }
                                                            bundle2.putLong("_r", 1L);
                                                            muoVar.f(str18, bundle2, str27);
                                                            zzicVar4.p().S();
                                                            String str28 = Build.MODEL;
                                                            e0.s();
                                                            zzicVar4.p().S();
                                                            String str29 = Build.VERSION.RELEASE;
                                                            e0.k();
                                                            ((zzid) e0.b).y0(str29);
                                                            e0.u((int) zzicVar4.p().U());
                                                            e0.t(zzicVar4.p().V());
                                                            e0.f0(zzrVar.w);
                                                            if (zzicVar4.c()) {
                                                                e0.w();
                                                                if (!TextUtils.isEmpty(null)) {
                                                                    e0.k();
                                                                    ((zzid) e0.b).b1(null);
                                                                    throw null;
                                                                }
                                                            }
                                                            U02 = h0().U0(str18);
                                                            if (U02 == null) {
                                                                U02 = new xjo(zzicVar4, str18);
                                                                zzpgVar = this;
                                                                try {
                                                                    U02.G(zzpgVar.o(j5));
                                                                    U02.L(zzrVar.k);
                                                                    U02.I(str9);
                                                                    if (j5.i(zzjkVar)) {
                                                                        U02.J(zzpgVar.i.W(zzrVar, j5));
                                                                    }
                                                                    U02.e(0L);
                                                                    U02.M(0L);
                                                                    U02.N(0L);
                                                                    U02.P(str26);
                                                                    U02.R(j10);
                                                                    U02.S(str21);
                                                                    U02.T(j11);
                                                                    U02.a(j4);
                                                                    U02.d(z);
                                                                    U02.c(j6);
                                                                    i = 0;
                                                                    zzpgVar.h0().V0(U02, false);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    zzpgVar.h0().G0();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i = 0;
                                                                zzpgVar = this;
                                                            }
                                                            if (j5.i(zzjk.ANALYTICS_STORAGE) && !TextUtils.isEmpty(U02.F())) {
                                                                String F2 = U02.F();
                                                                Preconditions.i(F2);
                                                                e0.D(F2);
                                                            }
                                                            if (!TextUtils.isEmpty(U02.K())) {
                                                                String K2 = U02.K();
                                                                Preconditions.i(K2);
                                                                e0.V(K2);
                                                            }
                                                            N0 = zzpgVar.h0().N0(str18);
                                                            i2 = i;
                                                            while (i2 < N0.size()) {
                                                                zzit J = zziu.J();
                                                                String str30 = ((z1p) N0.get(i2)).c;
                                                                J.k();
                                                                ((zziu) J.b).L(str30);
                                                                long j15 = ((z1p) N0.get(i2)).d;
                                                                J.k();
                                                                ((zziu) J.b).K(j15);
                                                                zzpgVar.k0().n0(J, ((z1p) N0.get(i2)).e);
                                                                e0.m0(J);
                                                                if ("_sid".equals(((z1p) N0.get(i2)).c)) {
                                                                    zzhz zzhzVar6 = U02.a.g;
                                                                    zzic.m(zzhzVar6);
                                                                    zzhzVar6.Q();
                                                                    if (U02.w != 0) {
                                                                        zzpk k0 = zzpgVar.k0();
                                                                        if (TextUtils.isEmpty(str24)) {
                                                                            str11 = str24;
                                                                            z0 = 0;
                                                                        } else {
                                                                            str11 = str24;
                                                                            z0 = k0.z0(str11.getBytes(StandardCharsets.UTF_8));
                                                                        }
                                                                        zzhz zzhzVar7 = U02.a.g;
                                                                        zzic.m(zzhzVar7);
                                                                        zzhzVar7.Q();
                                                                        if (z0 != U02.w) {
                                                                            e0.k();
                                                                            ((zzid) e0.b).j1();
                                                                        }
                                                                        i2++;
                                                                        str24 = str11;
                                                                    }
                                                                }
                                                                str11 = str24;
                                                                i2++;
                                                                str24 = str11;
                                                            }
                                                            h0 = zzpgVar.h0();
                                                            zzidVar = (zzid) e0.m();
                                                            h0.Q();
                                                            h0.R();
                                                            Preconditions.f(zzidVar.y());
                                                            byte[] h = zzidVar.h();
                                                            long z02 = h0.c.k0().z0(h);
                                                            ContentValues contentValues2 = new ContentValues();
                                                            String str31 = str2;
                                                            contentValues2.put(str31, zzidVar.y());
                                                            contentValues2.put("metadata_fingerprint", Long.valueOf(z02));
                                                            contentValues2.put(TtmlNode.TAG_METADATA, h);
                                                            h0.H0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                            h02 = zzpgVar.h0();
                                                            zzbc zzbcVar4 = zzbcVar2;
                                                            it = zzbcVar4.g.a.keySet().iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    zzht g02 = zzpgVar.g0();
                                                                    String str32 = zzbcVar4.a;
                                                                    boolean g03 = g02.g0(str32, zzbcVar4.b);
                                                                    zzar W0 = zzpgVar.h0().W0(zzpgVar.g(), str32, false, false, false, false);
                                                                    if (!g03 || W0.e >= zzpgVar.f0().Z(str32, zzfy.p)) {
                                                                        i3 = i;
                                                                    }
                                                                } else if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            }
                                                            h02.Q();
                                                            h02.R();
                                                            String str33 = zzbcVar4.a;
                                                            Preconditions.f(str33);
                                                            byte[] h2 = h02.c.k0().q0(zzbcVar4).h();
                                                            contentValues = new ContentValues();
                                                            contentValues.put(str31, str33);
                                                            contentValues.put("name", zzbcVar4.b);
                                                            contentValues.put("timestamp", Long.valueOf(zzbcVar4.d));
                                                            contentValues.put("metadata_fingerprint", Long.valueOf(z02));
                                                            contentValues.put("data", h2);
                                                            contentValues.put("realtime", Integer.valueOf(i3));
                                                            contentValues.put("elapsed_time", Long.valueOf(zzbcVar4.e));
                                                            if (h02.H0().insert(str7, null, contentValues) == -1) {
                                                                ((zzic) h02.b).b().g.b(zzgu.U(str33), "Failed to insert raw event (got -1). appId");
                                                            } else {
                                                                zzpgVar.o = 0L;
                                                            }
                                                            zzpgVar.h0().F0();
                                                            zzpgVar.h0().G0();
                                                            zzpgVar.N();
                                                            zzpgVar.b().o.b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzpgVar = this;
                                            zzpgVar.h0().G0();
                                            throw th;
                                        }
                                    }
                                    zzbcVar2 = zzbcVar;
                                    j6 = j14;
                                    zzicVar4.p().S();
                                    String str282 = Build.MODEL;
                                    e0.s();
                                    zzicVar4.p().S();
                                    String str292 = Build.VERSION.RELEASE;
                                    e0.k();
                                    ((zzid) e0.b).y0(str292);
                                    e0.u((int) zzicVar4.p().U());
                                    e0.t(zzicVar4.p().V());
                                    e0.f0(zzrVar.w);
                                    if (zzicVar4.c()) {
                                    }
                                    U02 = h0().U0(str18);
                                    if (U02 == null) {
                                    }
                                    if (j5.i(zzjk.ANALYTICS_STORAGE)) {
                                        String F22 = U02.F();
                                        Preconditions.i(F22);
                                        e0.D(F22);
                                    }
                                    if (!TextUtils.isEmpty(U02.K())) {
                                    }
                                    N0 = zzpgVar.h0().N0(str18);
                                    i2 = i;
                                    while (i2 < N0.size()) {
                                    }
                                    h0 = zzpgVar.h0();
                                    zzidVar = (zzid) e0.m();
                                    h0.Q();
                                    h0.R();
                                    Preconditions.f(zzidVar.y());
                                    byte[] h3 = zzidVar.h();
                                    long z022 = h0.c.k0().z0(h3);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str312 = str2;
                                    contentValues22.put(str312, zzidVar.y());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(z022));
                                    contentValues22.put(TtmlNode.TAG_METADATA, h3);
                                    h0.H0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    h02 = zzpgVar.h0();
                                    zzbc zzbcVar42 = zzbcVar2;
                                    it = zzbcVar42.g.a.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                    }
                                    h02.Q();
                                    h02.R();
                                    String str332 = zzbcVar42.a;
                                    Preconditions.f(str332);
                                    byte[] h22 = h02.c.k0().q0(zzbcVar42).h();
                                    contentValues = new ContentValues();
                                    contentValues.put(str312, str332);
                                    contentValues.put("name", zzbcVar42.b);
                                    contentValues.put("timestamp", Long.valueOf(zzbcVar42.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(z022));
                                    contentValues.put("data", h22);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    contentValues.put("elapsed_time", Long.valueOf(zzbcVar42.e));
                                    if (h02.H0().insert(str7, null, contentValues) == -1) {
                                    }
                                    zzpgVar.h0().F0();
                                    zzpgVar.h0().G0();
                                    zzpgVar.N();
                                    zzpgVar.b().o.b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            h0.H0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                            h02 = zzpgVar.h0();
                            zzbc zzbcVar422 = zzbcVar2;
                            it = zzbcVar422.g.a.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            h02.Q();
                            h02.R();
                            String str3322 = zzbcVar422.a;
                            Preconditions.f(str3322);
                            byte[] h222 = h02.c.k0().q0(zzbcVar422).h();
                            contentValues = new ContentValues();
                            contentValues.put(str312, str3322);
                            contentValues.put("name", zzbcVar422.b);
                            contentValues.put("timestamp", Long.valueOf(zzbcVar422.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(z022));
                            contentValues.put("data", h222);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            contentValues.put("elapsed_time", Long.valueOf(zzbcVar422.e));
                            if (h02.H0().insert(str7, null, contentValues) == -1) {
                            }
                            zzpgVar.h0().F0();
                            zzpgVar.h0().G0();
                            zzpgVar.N();
                            zzpgVar.b().o.b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e2) {
                            ((zzic) h0.b).b().g.c(zzgu.U(zzidVar.y()), e2, "Error storing raw event metadata. appId");
                            throw e2;
                        }
                        str9 = str8;
                        str10 = str22;
                        j4 = zzrVar.f;
                        if (j4 != 0) {
                        }
                        long j142 = zzrVar.q;
                        e0.b0(j142);
                        String str262 = str10;
                        if (f0().b0(null, zzfy.U0)) {
                        }
                        if (f0().b0(null, zzfy.V0)) {
                            e0.Y(h03);
                        }
                        j5 = c(str18).j(zzjl.c(100, str25));
                        if (j5.i(zzjkVar)) {
                        }
                        zzbcVar2 = zzbcVar;
                        j6 = j142;
                        zzicVar4.p().S();
                        String str2822 = Build.MODEL;
                        e0.s();
                        zzicVar4.p().S();
                        String str2922 = Build.VERSION.RELEASE;
                        e0.k();
                        ((zzid) e0.b).y0(str2922);
                        e0.u((int) zzicVar4.p().U());
                        e0.t(zzicVar4.p().V());
                        e0.f0(zzrVar.w);
                        if (zzicVar4.c()) {
                        }
                        U02 = h0().U0(str18);
                        if (U02 == null) {
                        }
                        if (j5.i(zzjk.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(U02.K())) {
                        }
                        N0 = zzpgVar.h0().N0(str18);
                        i2 = i;
                        while (i2 < N0.size()) {
                        }
                        h0 = zzpgVar.h0();
                        zzidVar = (zzid) e0.m();
                        h0.Q();
                        h0.R();
                        Preconditions.f(zzidVar.y());
                        byte[] h32 = zzidVar.h();
                        long z0222 = h0.c.k0().z0(h32);
                        ContentValues contentValues222 = new ContentValues();
                        String str3122 = str2;
                        contentValues222.put(str3122, zzidVar.y());
                        contentValues222.put("metadata_fingerprint", Long.valueOf(z0222));
                        contentValues222.put(TtmlNode.TAG_METADATA, h32);
                    }
                    h0().G0();
                }
                z3 = true;
            }
            String a1 = zzbfVar2.a1();
            str2 = MBridgeConstans.APP_ID;
            Bundle bundle3 = zzbfVar2.a;
            if (z3) {
                double doubleValue = zzbfVar2.Z0().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    z = z2;
                    doubleValue = bundle3.getLong(U3.i.X) * 1000000.0d;
                } else {
                    z = z2;
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    b().j.c(zzgu.U(str12), Double.valueOf(doubleValue), "Data lost. Currency value is too big. appId");
                    h0().F0();
                    h0().G0();
                } else {
                    j = Math.round(doubleValue);
                    if ("refund".equals(str16)) {
                        j = -j;
                    }
                }
            } else {
                z = z2;
                j = bundle3.getLong(U3.i.X);
            }
            if (!TextUtils.isEmpty(a1)) {
                String upperCase = a1.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    z1p M02 = h0().M0(str12, concat);
                    if (M02 != null) {
                        Object obj3 = M02.e;
                        if (obj3 instanceof Long) {
                            String str34 = b.c;
                            long a5 = ((DefaultClock) f()).a();
                            Long valueOf = Long.valueOf(((Long) obj3).longValue() + j);
                            str4 = str16;
                            str3 = "_fx";
                            str5 = str13;
                            str6 = str;
                            zzicVar = zzicVar2;
                            zzbfVar = zzbfVar2;
                            z1pVar = new z1p(str12, str34, concat, a5, valueOf);
                            if (h0().L0(z1pVar)) {
                                b().g.d("Too many unique user properties are set. Ignoring user property. appId", zzgu.U(str12), zzicVar.j.c(z1pVar.c), z1pVar.e);
                                l0();
                                zzpp.i0(muoVar2, str12, 9, null, null, 0);
                                muoVar = muoVar2;
                            } else {
                                muoVar = muoVar2;
                            }
                            boolean Q02 = zzpp.Q0(str4);
                            String str172 = str4;
                            boolean equals2 = str6.equals(str172);
                            l0();
                            if (zzbfVar != null) {
                            }
                            zzbf zzbfVar32 = zzbfVar;
                            zzar X02 = h0().X0(g(), str12, j2 + 1, true, Q02, false, equals2, false, false, false);
                            long j82 = X02.b;
                            f0();
                            intValue = j82 - ((Integer) zzfy.l.a(null)).intValue();
                            if (intValue <= 0) {
                            }
                            h0().G0();
                        }
                    }
                    str3 = "_fx";
                    long j16 = j;
                    str4 = str16;
                    str5 = str13;
                    str6 = str;
                    zzicVar = zzicVar2;
                    zzbfVar = zzbfVar2;
                    hkn h07 = h0();
                    int Z = f0().Z(str12, zzfy.T) - 1;
                    Preconditions.f(str12);
                    h07.Q();
                    h07.R();
                    h07.H0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str12, str12, String.valueOf(Z)});
                    z1pVar = new z1p(str12, b.c, concat, ((DefaultClock) f()).a(), Long.valueOf(j16));
                    if (h0().L0(z1pVar)) {
                    }
                    boolean Q022 = zzpp.Q0(str4);
                    String str1722 = str4;
                    boolean equals22 = str6.equals(str1722);
                    l0();
                    if (zzbfVar != null) {
                    }
                    zzbf zzbfVar322 = zzbfVar;
                    zzar X022 = h0().X0(g(), str12, j2 + 1, true, Q022, false, equals22, false, false, false);
                    long j822 = X022.b;
                    f0();
                    intValue = j822 - ((Integer) zzfy.l.a(null)).intValue();
                    if (intValue <= 0) {
                    }
                    h0().G0();
                }
            }
            str3 = "_fx";
            str4 = str16;
            str5 = str13;
            muoVar = muoVar2;
            str6 = str;
            zzbfVar = zzbfVar2;
            boolean Q0222 = zzpp.Q0(str4);
            String str17222 = str4;
            boolean equals222 = str6.equals(str17222);
            l0();
            if (zzbfVar != null) {
            }
            zzbf zzbfVar3222 = zzbfVar;
            zzar X0222 = h0().X0(g(), str12, j2 + 1, true, Q0222, false, equals222, false, false, false);
            long j8222 = X0222.b;
            f0();
            intValue = j8222 - ((Integer) zzfy.l.a(null)).intValue();
            if (intValue <= 0) {
            }
            h0().G0();
        } catch (Throwable th3) {
            th = th3;
            zzpgVar = this;
            zzpgVar.h0().G0();
            throw th;
        }
    }

    public final zzpp l0() {
        zzic zzicVar = this.l;
        Preconditions.i(zzicVar);
        zzpp zzppVar = zzicVar.i;
        zzic.k(zzppVar);
        return zzppVar;
    }

    public final void m(xjo xjoVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        ohn ohnVar;
        zziu zziuVar;
        dhn dhnVar;
        d().Q();
        m0();
        String L0 = ((zzid) zzicVar.b).L0();
        EnumMap enumMap = new EnumMap(zzjk.class);
        int length = L0.length();
        int length2 = zzjk.values().length;
        dhn dhnVar2 = dhn.UNSET;
        int i = 0;
        if (length < length2 || L0.charAt(0) != '1') {
            ohnVar = new ohn();
        } else {
            zzjk[] values = zzjk.values();
            int length3 = values.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length3) {
                zzjk zzjkVar = values[i2];
                int i4 = i3 + 1;
                char charAt = L0.charAt(i3);
                dhn[] values2 = dhn.values();
                int length4 = values2.length;
                int i5 = i;
                while (true) {
                    if (i5 >= length4) {
                        dhnVar = dhnVar2;
                        break;
                    }
                    dhnVar = values2[i5];
                    if (dhnVar.a == charAt) {
                        break;
                    } else {
                        i5++;
                    }
                }
                enumMap.put((EnumMap) zzjkVar, (zzjk) dhnVar);
                i2++;
                i3 = i4;
                i = 0;
            }
            ohnVar = new ohn(enumMap);
        }
        String E = xjoVar.E();
        d().Q();
        m0();
        zzjl c = c(E);
        EnumMap enumMap2 = c.a;
        zzjk zzjkVar2 = zzjk.AD_STORAGE;
        zzji zzjiVar = (zzji) enumMap2.get(zzjkVar2);
        zzji zzjiVar2 = zzji.UNINITIALIZED;
        if (zzjiVar == null) {
            zzjiVar = zzjiVar2;
        }
        int i6 = c.b;
        int ordinal = zzjiVar.ordinal();
        dhn dhnVar3 = dhn.REMOTE_ENFORCED_DEFAULT;
        dhn dhnVar4 = dhn.FAILSAFE;
        if (ordinal == 1) {
            ohnVar.j(zzjkVar2, dhnVar3);
        } else if (ordinal == 2 || ordinal == 3) {
            ohnVar.i(zzjkVar2, i6);
        } else {
            ohnVar.j(zzjkVar2, dhnVar4);
        }
        zzjk zzjkVar3 = zzjk.ANALYTICS_STORAGE;
        zzji zzjiVar3 = (zzji) enumMap2.get(zzjkVar3);
        if (zzjiVar3 != null) {
            zzjiVar2 = zzjiVar3;
        }
        int ordinal2 = zzjiVar2.ordinal();
        if (ordinal2 == 1) {
            ohnVar.j(zzjkVar3, dhnVar3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            ohnVar.i(zzjkVar3, i6);
        } else {
            ohnVar.j(zzjkVar3, dhnVar4);
        }
        String E2 = xjoVar.E();
        d().Q();
        m0();
        zzba r0 = r0(E2, p0(E2), c(E2), ohnVar);
        String str = r0.d;
        Boolean bool = r0.c;
        Preconditions.i(bool);
        boolean booleanValue = bool.booleanValue();
        zzicVar.k();
        ((zzid) zzicVar.b).p1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            zzicVar.k();
            ((zzid) zzicVar.b).q1(str);
        }
        d().Q();
        m0();
        Iterator it = Collections.unmodifiableList(((zzid) zzicVar.b).f2()).iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (zziu) it.next();
                if ("_npa".equals(zziuVar.A())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            EnumMap enumMap3 = (EnumMap) ohnVar.b;
            zzjk zzjkVar4 = zzjk.AD_PERSONALIZATION;
            dhn dhnVar5 = (dhn) enumMap3.get(zzjkVar4);
            if (dhnVar5 == null) {
                dhnVar5 = dhnVar2;
            }
            if (dhnVar5 == dhnVar2) {
                hkn hknVar = this.c;
                U(hknVar);
                z1p M0 = hknVar.M0(xjoVar.E(), "_npa");
                dhn dhnVar6 = dhn.MANIFEST;
                dhn dhnVar7 = dhn.API;
                if (M0 != null) {
                    String str2 = M0.b;
                    if ("tcf".equals(str2)) {
                        ohnVar.j(zzjkVar4, dhn.TCF);
                    } else if ("app".equals(str2)) {
                        ohnVar.j(zzjkVar4, dhnVar7);
                    } else {
                        ohnVar.j(zzjkVar4, dhnVar6);
                    }
                } else {
                    Boolean x = xjoVar.x();
                    if (x == null || ((x.booleanValue() && zziuVar.E() != 1) || !(x.booleanValue() || zziuVar.E() == 0))) {
                        ohnVar.j(zzjkVar4, dhnVar7);
                    } else {
                        ohnVar.j(zzjkVar4, dhnVar6);
                    }
                }
            }
        } else {
            int F = F(xjoVar.E(), ohnVar);
            zzit J = zziu.J();
            J.k();
            ((zziu) J.b).L("_npa");
            ((DefaultClock) f()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            J.k();
            ((zziu) J.b).K(currentTimeMillis);
            J.k();
            ((zziu) J.b).O(F);
            zziu zziuVar2 = (zziu) J.m();
            zzicVar.k();
            ((zzid) zzicVar.b).n0(zziuVar2);
            b().o.c("non_personalized_ads(_npa)", Integer.valueOf(F), "Setting user property");
        }
        String ohnVar2 = ohnVar.toString();
        zzicVar.k();
        ((zzid) zzicVar.b).o1(ohnVar2);
        String E3 = xjoVar.E();
        zzht zzhtVar = this.a;
        zzhtVar.Q();
        zzhtVar.W(E3);
        com.google.android.gms.internal.measurement.zzgf m0 = zzhtVar.m0(E3);
        boolean z = m0 == null || !m0.B() || m0.C();
        List h0 = zzicVar.h0();
        for (int i7 = 0; i7 < h0.size(); i7++) {
            if ("_tcf".equals(((zzhs) h0.get(i7)).D())) {
                zzhr zzhrVar = (zzhr) ((zzhs) h0.get(i7)).q();
                List p = zzhrVar.p();
                int i8 = 0;
                while (true) {
                    if (i8 >= p.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((zzhw) p.get(i8)).z())) {
                        String B = ((zzhw) p.get(i8)).B();
                        if (z && B.length() > 4) {
                            char[] charArray = B.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i9 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9 | 1);
                            B = String.valueOf(charArray);
                        }
                        zzhv K2 = zzhw.K();
                        K2.p("_tcfd");
                        K2.q(B);
                        zzhrVar.k();
                        ((zzhs) zzhrVar.b).P(i8, (zzhw) K2.m());
                    } else {
                        i8++;
                    }
                }
                zzicVar.j0(i7, zzhrVar);
                return;
            }
        }
    }

    public final void m0() {
        if (this.m.get()) {
            return;
        }
        a70.r("UploadController is not initialized");
    }

    public final void n(xjo xjoVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        Serializable i0;
        d().Q();
        m0();
        zzgx e0 = zzha.e0();
        zzic zzicVar2 = xjoVar.a;
        zzhz zzhzVar = zzicVar2.g;
        zzic.m(zzhzVar);
        zzhzVar.Q();
        byte[] bArr = xjoVar.H;
        if (bArr != null) {
            try {
                e0 = (zzgx) zzpk.B0(e0, bArr);
            } catch (zzaeh unused) {
                b().j.b(zzgu.U(xjoVar.E()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = zzicVar.h0().iterator();
        while (it.hasNext()) {
            zzhs zzhsVar = (zzhs) it.next();
            if (zzhsVar.D().equals("_cmp")) {
                zzhw a0 = zzpk.a0(zzhsVar, "gclid");
                Serializable i02 = a0 == null ? null : zzpk.i0(a0);
                if (i02 == null) {
                    i02 = "";
                }
                String str = (String) i02;
                zzhw a02 = zzpk.a0(zzhsVar, "gbraid");
                Serializable i03 = a02 == null ? null : zzpk.i0(a02);
                if (i03 == null) {
                    i03 = "";
                }
                String str2 = (String) i03;
                zzhw a03 = zzpk.a0(zzhsVar, "gad_source");
                Serializable i04 = a03 == null ? null : zzpk.i0(a03);
                if (i04 == null) {
                    i04 = "";
                }
                String str3 = (String) i04;
                zzhw a04 = zzpk.a0(zzhsVar, "deep_link_url");
                Object i05 = a04 == null ? null : zzpk.i0(a04);
                String str4 = (String) (i05 != null ? i05 : "");
                String[] split = ((String) zzfy.b1.a(null)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                k0();
                HashMap hashMap = new HashMap();
                for (zzhw zzhwVar : zzhsVar.A()) {
                    Iterator it2 = it;
                    if (Arrays.asList(split).contains(zzhwVar.z()) && (i0 = zzpk.i0(zzhwVar)) != null) {
                        hashMap.put(zzhwVar.z(), i0);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!hashMap.isEmpty()) {
                    zzhw a05 = zzpk.a0(zzhsVar, "click_timestamp");
                    Object i06 = a05 == null ? null : zzpk.i0(a05);
                    long longValue = ((Long) (i06 != null ? i06 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhsVar.F();
                    }
                    long j = longValue;
                    zzhw a06 = zzpk.a0(zzhsVar, "_cis");
                    if ("referrer API v2".equals(a06 == null ? null : zzpk.i0(a06))) {
                        if (j > ((zzha) e0.b).b0()) {
                            if (str.isEmpty()) {
                                e0.k();
                                ((zzha) e0.b).B();
                            } else {
                                e0.k();
                                ((zzha) e0.b).A(str);
                            }
                            if (str2.isEmpty()) {
                                e0.k();
                                ((zzha) e0.b).D();
                            } else {
                                e0.k();
                                ((zzha) e0.b).C(str2);
                            }
                            if (str3.isEmpty()) {
                                e0.k();
                                ((zzha) e0.b).F();
                            } else {
                                e0.k();
                                ((zzha) e0.b).E(str3);
                            }
                            e0.k();
                            ((zzha) e0.b).G(j);
                            e0.k();
                            ((zzha) e0.b).I().clear();
                            HashMap G = G(zzhsVar);
                            e0.k();
                            ((zzha) e0.b).I().putAll(G);
                        }
                    } else if (j > ((zzha) e0.b).S()) {
                        if (str.isEmpty()) {
                            e0.k();
                            ((zzha) e0.b).h0();
                        } else {
                            e0.k();
                            ((zzha) e0.b).g0(str);
                        }
                        if (str2.isEmpty()) {
                            e0.k();
                            ((zzha) e0.b).j0();
                        } else {
                            e0.k();
                            ((zzha) e0.b).i0(str2);
                        }
                        if (str3.isEmpty()) {
                            e0.k();
                            ((zzha) e0.b).y();
                        } else {
                            e0.k();
                            ((zzha) e0.b).k0(str3);
                        }
                        if (f0().b0(null, zzfy.a1)) {
                            if (str4.isEmpty()) {
                                e0.k();
                                ((zzha) e0.b).K();
                            } else {
                                e0.k();
                                ((zzha) e0.b).J(str4);
                            }
                        }
                        e0.k();
                        ((zzha) e0.b).z(j);
                        e0.k();
                        ((zzha) e0.b).H().clear();
                        HashMap G2 = G(zzhsVar);
                        e0.k();
                        ((zzha) e0.b).H().putAll(G2);
                    }
                }
                it = it3;
            }
        }
        if (!((zzha) e0.m()).equals(zzha.f0())) {
            zzha zzhaVar = (zzha) e0.m();
            zzicVar.k();
            ((zzid) zzicVar.b).u1(zzhaVar);
        }
        byte[] h = ((zzha) e0.m()).h();
        zzhz zzhzVar2 = zzicVar2.g;
        zzic.m(zzhzVar2);
        zzhzVar2.Q();
        xjoVar.R |= xjoVar.H != h;
        xjoVar.H = h;
        if (xjoVar.o()) {
            hkn hknVar = this.c;
            U(hknVar);
            hknVar.V0(xjoVar, false);
        }
        if (f0().b0(null, zzfy.a1)) {
            for (int i = 0; i < zzicVar.i0(); i++) {
                zzhs e2 = ((zzid) zzicVar.b).e2(i);
                if ("_cmp".equals(e2.D())) {
                    zzhr zzhrVar = (zzhr) e2.q();
                    List p = zzhrVar.p();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= p.size()) {
                            break;
                        }
                        if ("deep_link_url".equals(((zzhw) p.get(i2)).z())) {
                            zzhrVar.u(i2);
                            zzicVar.j0(i, zzhrVar);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (f0().b0(null, zzfy.Z0)) {
            hkn hknVar2 = this.c;
            U(hknVar2);
            hknVar2.K0(xjoVar.E(), "_lgclid");
        }
    }

    public final void n0(zzr zzrVar) {
        d().Q();
        m0();
        String str = zzrVar.a;
        Preconditions.f(str);
        zzjl c = zzjl.c(zzrVar.x, zzrVar.s);
        c(str);
        b().o.c(str, c, "Setting storage consent for package");
        d().Q();
        m0();
        this.B.put(str, c);
        hkn hknVar = this.c;
        U(hknVar);
        hknVar.w0(str, c);
    }

    public final String o(zzjl zzjlVar) {
        if (!zzjlVar.i(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        l0().P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void o0(zzr zzrVar) {
        d().Q();
        m0();
        String str = zzrVar.a;
        Preconditions.f(str);
        zzba b = zzba.b(zzrVar.y);
        b().o.c(str, b, "Setting DMA consent for package");
        d().Q();
        m0();
        zzji a = zzba.c(100, q0(str)).a();
        this.C.put(str, b);
        hkn hknVar = this.c;
        U(hknVar);
        Preconditions.i(str);
        Preconditions.i(b);
        hknVar.Q();
        hknVar.R();
        zzjl k0 = hknVar.k0(str);
        zzjl zzjlVar = zzjl.c;
        if (k0 == zzjlVar) {
            hknVar.w0(str, zzjlVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("dma_consent_settings", b.b);
        hknVar.p0(contentValues);
        zzji a2 = zzba.c(100, q0(str)).a();
        d().Q();
        m0();
        zzji zzjiVar = zzji.GRANTED;
        zzji zzjiVar2 = zzji.DENIED;
        boolean z = a == zzjiVar2 && a2 == zzjiVar;
        boolean z2 = a == zzjiVar && a2 == zzjiVar2;
        if (z || z2) {
            b().o.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            hkn hknVar2 = this.c;
            U(hknVar2);
            if (hknVar2.W0(g(), str, false, false, false, false).f < f0().Z(str, zzfy.l0)) {
                bundle.putLong("_r", 1L);
                hkn hknVar3 = this.c;
                U(hknVar3);
                b().o.c(str, Long.valueOf(hknVar3.W0(g(), str, false, false, true, false).f), "_dcu realtime event count");
            }
            this.J.f(str, bundle, "_dcu");
        }
    }

    public final void p(ArrayList arrayList) {
        Preconditions.b(!arrayList.isEmpty());
        if (this.y != null) {
            b().g.a("Set uploading progress before finishing the previous upload");
        } else {
            this.y = new ArrayList(arrayList);
        }
    }

    public final zzba p0(String str) {
        d().Q();
        m0();
        HashMap hashMap = this.C;
        zzba zzbaVar = (zzba) hashMap.get(str);
        if (zzbaVar != null) {
            return zzbaVar;
        }
        hkn hknVar = this.c;
        U(hknVar);
        Preconditions.i(str);
        hknVar.Q();
        hknVar.R();
        zzba b = zzba.b(hknVar.o0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v13, types: [long] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        hkn hknVar;
        long longValue;
        SQLiteException e;
        d().Q();
        m0();
        this.v = true;
        try {
            zzic zzicVar = this.l;
            zzicVar.getClass();
            Boolean bool = zzicVar.o().f;
            if (bool == null) {
                b().j.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().g.a("Upload called in the client side when service should be used");
            } else if (this.o > 0) {
                N();
            } else {
                d().Q();
                if (this.y != null) {
                    b().o.a("Uploading requested multiple times");
                } else {
                    zzgz zzgzVar = this.b;
                    U(zzgzVar);
                    if (zzgzVar.U()) {
                        ((DefaultClock) f()).getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int Z = f0().Z(null, zzfy.h0);
                        f0();
                        long longValue2 = currentTimeMillis - ((Long) zzfy.e.a(null)).longValue();
                        for (int i = 0; i < Z && I(longValue2, null); i++) {
                        }
                        zzaif.a();
                        d().Q();
                        H();
                        long a = this.i.i.a();
                        if (a != 0) {
                            b().n.b(Long.valueOf(Math.abs(currentTimeMillis - a)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        hkn hknVar2 = this.c;
                        U(hknVar2);
                        String Y = hknVar2.Y();
                        long j = -1;
                        if (TextUtils.isEmpty(Y)) {
                            try {
                                this.A = -1L;
                                hknVar = this.c;
                                U(hknVar);
                                f0();
                                longValue = currentTimeMillis - ((Long) zzfy.e.a(null)).longValue();
                                hknVar.Q();
                                hknVar.R();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = hknVar.H0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        zzgu zzguVar = ((zzic) hknVar.b).f;
                                        zzic.m(zzguVar);
                                        zzguVar.o.a("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    zzgu zzguVar2 = ((zzic) hknVar.b).f;
                                    zzic.m(zzguVar2);
                                    zzguVar2.g.b(e, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                hkn hknVar3 = this.c;
                                U(hknVar3);
                                xjo U0 = hknVar3.U0(str);
                                if (U0 != null) {
                                    A(U0);
                                }
                            }
                        } else {
                            if (this.A == -1) {
                                hkn hknVar4 = this.c;
                                U(hknVar4);
                                try {
                                    try {
                                        cursor2 = hknVar4.H0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } catch (SQLiteException e4) {
                                        zzgu zzguVar3 = ((zzic) hknVar4.b).f;
                                        zzic.m(zzguVar3);
                                        zzguVar3.g.b(e4, "Error querying raw events");
                                    }
                                    cursor2.close();
                                    this.A = j;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            }
                            r(currentTimeMillis, Y);
                        }
                    } else {
                        b().o.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.v = false;
            O();
        } catch (Throwable th3) {
            this.v = false;
            O();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle q0(String str) {
        d().Q();
        m0();
        zzht zzhtVar = this.a;
        U(zzhtVar);
        if (zzhtVar.m0(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl c = c(str);
        Bundle bundle2 = new Bundle();
        Iterator it = c.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((zzji) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((zzjk) entry.getKey()).a, str2);
            }
        }
        bundle.putAll(bundle2);
        zzba r0 = r0(str, p0(str), c, new ohn());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : r0.e.entrySet()) {
            int ordinal2 = ((zzji) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((zzjk) entry2.getKey()).a, str3);
            }
        }
        Boolean bool = r0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = r0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        hkn hknVar = this.c;
        U(hknVar);
        z1p M0 = hknVar.M0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (M0 != null ? M0.e.equals(1L) : F(str, new ohn())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x021d, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07e2 A[EDGE_INSN: B:158:0x07e2->B:159:0x07e2 BREAK  A[LOOP:4: B:97:0x063b->B:126:0x07d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x063f  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v2, types: [com.google.android.gms.measurement.internal.zzic] */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24 */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v27, types: [com.google.android.gms.measurement.internal.zzic] */
    /* JADX WARN: Type inference failed for: r23v28 */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v33 */
    /* JADX WARN: Type inference failed for: r23v35 */
    /* JADX WARN: Type inference failed for: r23v44 */
    /* JADX WARN: Type inference failed for: r23v45 */
    /* JADX WARN: Type inference failed for: r23v46 */
    /* JADX WARN: Type inference failed for: r23v49 */
    /* JADX WARN: Type inference failed for: r23v50 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r4v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v76 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(long j, String str) {
        Cursor cursor;
        ?? r23;
        long j2;
        Cursor cursor2;
        List list;
        String str2;
        List<Pair> list2;
        List list3;
        zzjl c;
        zzjk zzjkVar;
        int i;
        List list4;
        com.google.android.gms.internal.measurement.zzhz F;
        int size;
        int i2;
        boolean i3;
        boolean b0;
        List list5;
        zzic zzicVar;
        boolean z;
        String str3;
        zzgz zzgzVar;
        String str4;
        zzot zzotVar;
        int i4;
        boolean z2;
        int i5;
        List list6;
        boolean z3;
        String str5;
        List list7;
        boolean isEmpty;
        ?? r14;
        zzic zzicVar2;
        List list8;
        Cursor cursor3;
        List list9;
        Iterator it;
        Iterator it2;
        int i6;
        int i7;
        ArrayList arrayList;
        String str6;
        String str7;
        SQLiteDatabase H0;
        String valueOf;
        hkn hknVar;
        byte[] byteArray;
        long j3;
        long j4;
        String str8 = str;
        int Z = f0().Z(str8, zzfy.h);
        int i8 = 0;
        int max = Math.max(0, f0().Z(str8, zzfy.i));
        hkn h0 = h0();
        zzic zzicVar3 = (zzic) h0.b;
        h0.Q();
        h0.R();
        int i9 = 1;
        Preconditions.b(Z > 0);
        ?? r11 = max > 0 ? 1 : 0;
        Preconditions.b(r11);
        Preconditions.f(str8);
        try {
        } catch (Throwable th) {
            th = th;
            cursor = r11;
        }
        try {
            try {
                H0 = h0.H0();
                j2 = -1;
            } catch (SQLiteException e) {
                e = e;
                r23 = zzicVar3;
                j2 = -1;
            }
            try {
                valueOf = String.valueOf(Z);
                cursor2 = H0.query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str8}, null, null, "rowid", valueOf);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    r23 = zzicVar3;
                }
            } catch (SQLiteException e3) {
                e = e3;
                r23 = zzicVar3;
                cursor2 = null;
                r23.b().g.c(zzgu.U(str8), e, "Error querying bundles. appId");
                list = Collections.EMPTY_LIST;
                str7 = r23;
                str6 = r23;
            }
            if (cursor2.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                String str9 = valueOf;
                while (true) {
                    long j5 = cursor2.getLong(i8);
                    try {
                        byte[] blob = cursor2.getBlob(i9);
                        zzpk k0 = h0.c.k0();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            hknVar = h0;
                            r23 = str9;
                            while (true) {
                                try {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    r23 = zzicVar3;
                                    try {
                                        try {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                            zzicVar3 = r23;
                                            r23 = r23;
                                        } catch (IOException e4) {
                                            e = e4;
                                            try {
                                                ((zzic) k0.b).b().g.b(e, "Failed to ungzip content");
                                                throw e;
                                            } catch (IOException e5) {
                                                e = e5;
                                                r23.b().g.c(zzgu.U(str8), e, "Failed to unzip queued bundle. appId");
                                                r23 = r23;
                                                if (cursor2.moveToNext()) {
                                                    break;
                                                }
                                                h0 = hknVar;
                                                zzicVar3 = r23;
                                                i8 = 0;
                                                i9 = 1;
                                                str9 = r23;
                                                cursor2.close();
                                                list2 = arrayList2;
                                                str2 = r23;
                                                if (list2.isEmpty()) {
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        r23.b().g.c(zzgu.U(str8), e, "Error querying bundles. appId");
                                        list = Collections.EMPTY_LIST;
                                        str7 = r23;
                                        str6 = r23;
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    r23 = zzicVar3;
                                    ((zzic) k0.b).b().g.b(e, "Failed to ungzip content");
                                    throw e;
                                }
                            }
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (IOException e8) {
                            e = e8;
                            hknVar = h0;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        hknVar = h0;
                        r23 = zzicVar3;
                    }
                    if (!arrayList2.isEmpty() && byteArray.length + i10 > max) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) zzpk.B0(zzid.e0(), byteArray);
                        if (!arrayList2.isEmpty()) {
                            zzid zzidVar = (zzid) ((Pair) arrayList2.get(0)).first;
                            zzid zzidVar2 = (zzid) zzicVar4.m();
                            if (!zzidVar.E0().equals(zzidVar2.E0()) || !zzidVar.L0().equals(zzidVar2.L0()) || zzidVar.N0() != zzidVar2.N0() || !zzidVar.P0().equals(zzidVar2.P0())) {
                                break;
                            }
                            Iterator it3 = zzidVar.f2().iterator();
                            Iterator it4 = r23;
                            while (true) {
                                if (!it3.hasNext()) {
                                    j3 = -1;
                                    r23 = it4;
                                    break;
                                }
                                zziu zziuVar = (zziu) it3.next();
                                Iterator it5 = it3;
                                if ("_npa".equals(zziuVar.A())) {
                                    j3 = zziuVar.E();
                                    r23 = it5;
                                    break;
                                } else {
                                    it3 = it5;
                                    it4 = it5;
                                }
                            }
                            Iterator it6 = zzidVar2.f2().iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    j4 = -1;
                                    break;
                                }
                                zziu zziuVar2 = (zziu) it6.next();
                                if ("_npa".equals(zziuVar2.A())) {
                                    j4 = zziuVar2.E();
                                    break;
                                }
                            }
                            if (j3 != j4) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            int i11 = cursor2.getInt(2);
                            zzicVar4.k();
                            ((zzid) zzicVar4.b).d1(i11);
                        }
                        i10 += byteArray.length;
                        arrayList2.add(Pair.create((zzid) zzicVar4.m(), Long.valueOf(j5)));
                    } catch (IOException e10) {
                        zzicVar3.b().g.c(zzgu.U(str8), e10, "Failed to merge queued bundle. appId");
                    }
                    r23 = zzicVar3;
                    if (cursor2.moveToNext() || i10 > max) {
                        break;
                        break;
                    }
                    h0 = hknVar;
                    zzicVar3 = r23;
                    i8 = 0;
                    i9 = 1;
                    str9 = r23;
                }
                cursor2.close();
                list2 = arrayList2;
                str2 = r23;
                if (list2.isEmpty()) {
                }
            } else {
                list = Collections.EMPTY_LIST;
                str7 = valueOf;
                cursor2.close();
                str6 = str7;
                list2 = list;
                str2 = str6;
                if (list2.isEmpty()) {
                    return;
                }
                zzahh zzahhVar = zzahh.b;
                zzal f0 = f0();
                zzfx zzfxVar = zzfy.c1;
                boolean b02 = f0.b0(null, zzfxVar);
                zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                if (b02) {
                    if (!f0().b0(null, zzfxVar)) {
                        list7 = list2;
                    } else if (c(str8).i(zzjkVar2) || !g0().V(str8)) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        hkn h02 = h0();
                        zzic zzicVar5 = (zzic) h02.b;
                        Preconditions.f(str8);
                        h02.Q();
                        h02.R();
                        ArrayList arrayList4 = new ArrayList();
                        try {
                            try {
                                try {
                                    SQLiteDatabase H02 = h02.H0();
                                    long a = ((DefaultClock) zzicVar5.f()).a();
                                    ?? query = H02.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str8, String.valueOf(a)}, null, null, "rowid", null);
                                    zzicVar2 = zzicVar5;
                                    try {
                                        try {
                                            if (query.moveToFirst()) {
                                                list8 = list2;
                                                while (true) {
                                                    try {
                                                        try {
                                                            arrayList4.add((zzhs) ((zzhr) zzpk.B0(zzhs.O(), query.getBlob(0))).m());
                                                            cursor3 = query;
                                                            arrayList = arrayList4;
                                                        } catch (SQLiteException e11) {
                                                            e = e11;
                                                            cursor3 = query;
                                                            zzicVar2.b().g.c(zzgu.U(str8), e, "Error flushing NO_DATA mode events. appId");
                                                            list9 = Collections.EMPTY_LIST;
                                                            if (cursor3 != null) {
                                                            }
                                                            it = list8.iterator();
                                                            boolean z4 = true;
                                                            while (it.hasNext()) {
                                                            }
                                                            list7 = arrayList3;
                                                            isEmpty = list7.isEmpty();
                                                            list3 = list7;
                                                            if (isEmpty) {
                                                            }
                                                            c = c(str8);
                                                            zzjkVar = zzjk.AD_STORAGE;
                                                            if (c.i(zzjkVar)) {
                                                            }
                                                            i = 0;
                                                            list4 = list3;
                                                            F = zzib.F();
                                                            size = list4.size();
                                                            ArrayList arrayList5 = new ArrayList(list4.size());
                                                            if (f0().R(str8)) {
                                                            }
                                                            boolean i12 = c(str8).i(zzjkVar);
                                                            i3 = c(str8).i(zzjkVar2);
                                                            b0 = f0().b0(str8, zzfy.M0);
                                                            zzou zzouVar = this.j;
                                                            zzot R = zzouVar.R(str8);
                                                            list5 = list4;
                                                            while (true) {
                                                                zzicVar = this.l;
                                                                if (i < size) {
                                                                }
                                                                i = r23 + 1;
                                                                size = i4;
                                                                i3 = z2;
                                                                list5 = list6;
                                                                i2 = i5;
                                                                b0 = z3;
                                                            }
                                                            if (((zzib) F.b).z() != 0) {
                                                            }
                                                        }
                                                    } catch (zzaeh e12) {
                                                        cursor3 = query;
                                                        try {
                                                            arrayList = arrayList4;
                                                            zzicVar2.b().l.c(zzgu.U(str8), e12, "Failed to parse stored NO_DATA mode event, appId");
                                                        } catch (SQLiteException e13) {
                                                            e = e13;
                                                            zzicVar2.b().g.c(zzgu.U(str8), e, "Error flushing NO_DATA mode events. appId");
                                                            list9 = Collections.EMPTY_LIST;
                                                            if (cursor3 != null) {
                                                            }
                                                            it = list8.iterator();
                                                            boolean z42 = true;
                                                            while (it.hasNext()) {
                                                            }
                                                            list7 = arrayList3;
                                                            isEmpty = list7.isEmpty();
                                                            list3 = list7;
                                                            if (isEmpty) {
                                                            }
                                                            c = c(str8);
                                                            zzjkVar = zzjk.AD_STORAGE;
                                                            if (c.i(zzjkVar)) {
                                                            }
                                                            i = 0;
                                                            list4 = list3;
                                                            F = zzib.F();
                                                            size = list4.size();
                                                            ArrayList arrayList52 = new ArrayList(list4.size());
                                                            if (f0().R(str8)) {
                                                            }
                                                            boolean i122 = c(str8).i(zzjkVar);
                                                            i3 = c(str8).i(zzjkVar2);
                                                            b0 = f0().b0(str8, zzfy.M0);
                                                            zzou zzouVar2 = this.j;
                                                            zzot R2 = zzouVar2.R(str8);
                                                            list5 = list4;
                                                            while (true) {
                                                                zzicVar = this.l;
                                                                if (i < size) {
                                                                }
                                                                i = r23 + 1;
                                                                size = i4;
                                                                i3 = z2;
                                                                list5 = list6;
                                                                i2 = i5;
                                                                b0 = z3;
                                                            }
                                                            if (((zzib) F.b).z() != 0) {
                                                            }
                                                        }
                                                    }
                                                    if (!cursor3.moveToNext()) {
                                                        break;
                                                    }
                                                    query = cursor3;
                                                    arrayList4 = arrayList;
                                                }
                                                cursor3.close();
                                                try {
                                                    int delete = H02.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str8, String.valueOf(a)});
                                                    zzgs zzgsVar = zzicVar2.b().o;
                                                    StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                                                    sb.append("Pruned ");
                                                    sb.append(delete);
                                                    sb.append(" NO_DATA mode events. appId");
                                                    zzgsVar.b(str8, sb.toString());
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    cursor3 = null;
                                                    zzicVar2.b().g.c(zzgu.U(str8), e, "Error flushing NO_DATA mode events. appId");
                                                    list9 = Collections.EMPTY_LIST;
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    it = list8.iterator();
                                                    boolean z422 = true;
                                                    while (it.hasNext()) {
                                                    }
                                                    list7 = arrayList3;
                                                    isEmpty = list7.isEmpty();
                                                    list3 = list7;
                                                    if (isEmpty) {
                                                    }
                                                    c = c(str8);
                                                    zzjkVar = zzjk.AD_STORAGE;
                                                    if (c.i(zzjkVar)) {
                                                    }
                                                    i = 0;
                                                    list4 = list3;
                                                    F = zzib.F();
                                                    size = list4.size();
                                                    ArrayList arrayList522 = new ArrayList(list4.size());
                                                    if (f0().R(str8)) {
                                                    }
                                                    boolean i1222 = c(str8).i(zzjkVar);
                                                    i3 = c(str8).i(zzjkVar2);
                                                    b0 = f0().b0(str8, zzfy.M0);
                                                    zzou zzouVar22 = this.j;
                                                    zzot R22 = zzouVar22.R(str8);
                                                    list5 = list4;
                                                    while (true) {
                                                        zzicVar = this.l;
                                                        if (i < size) {
                                                        }
                                                        i = r23 + 1;
                                                        size = i4;
                                                        i3 = z2;
                                                        list5 = list6;
                                                        i2 = i5;
                                                        b0 = z3;
                                                    }
                                                    if (((zzib) F.b).z() != 0) {
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList4;
                                                list8 = list2;
                                                query.close();
                                            }
                                            list9 = arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            str2 = query;
                                            r14 = str2;
                                            if (r14 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        cursor3 = query;
                                        list8 = list2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r14 = null;
                                    if (r14 != null) {
                                        r14.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e16) {
                                e = e16;
                                zzicVar2 = zzicVar5;
                                list8 = list2;
                            }
                            it = list8.iterator();
                            boolean z4222 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                com.google.android.gms.internal.measurement.zzic zzicVar6 = (com.google.android.gms.internal.measurement.zzic) ((zzid) pair.first).q();
                                if (z4222 && !list9.isEmpty()) {
                                    List h03 = zzicVar6.h0();
                                    zzicVar6.k();
                                    ((zzid) zzicVar6.b).k0();
                                    zzicVar6.k();
                                    ((zzid) zzicVar6.b).j0(list9);
                                    zzicVar6.k();
                                    ((zzid) zzicVar6.b).j0(h03);
                                    z4222 = false;
                                }
                                zzhh z5 = zzho.z();
                                com.google.android.gms.internal.measurement.zzgf m0 = g0().m0(str8);
                                ArrayList arrayList6 = new ArrayList();
                                if (m0 != null) {
                                    Iterator it7 = m0.y().iterator();
                                    while (it7.hasNext()) {
                                        zzfu zzfuVar = (zzfu) it7.next();
                                        Iterator it8 = it;
                                        com.google.android.gms.internal.measurement.zzhk y = com.google.android.gms.internal.measurement.zzhl.y();
                                        boolean z6 = z4222;
                                        int y2 = zzfuVar.y() - 1;
                                        List list10 = list9;
                                        if (y2 == 1) {
                                            it2 = it7;
                                            i6 = 3;
                                            i7 = 2;
                                        } else if (y2 != 2) {
                                            it2 = it7;
                                            i6 = 3;
                                            i7 = y2 != 3 ? y2 != 4 ? 1 : 5 : 4;
                                        } else {
                                            it2 = it7;
                                            i6 = 3;
                                            i7 = 3;
                                        }
                                        y.p(i7);
                                        int A = zzfuVar.A() - 1;
                                        if (A == 1) {
                                            i6 = 2;
                                        } else if (A != 2) {
                                            i6 = 1;
                                        }
                                        y.q(i6);
                                        arrayList6.add((com.google.android.gms.internal.measurement.zzhl) y.m());
                                        it = it8;
                                        list9 = list10;
                                        z4222 = z6;
                                        it7 = it2;
                                    }
                                }
                                Iterator it9 = it;
                                boolean z7 = z4222;
                                List list11 = list9;
                                z5.p(arrayList6);
                                zzicVar6.N(z5);
                                arrayList3.add(Pair.create((zzid) zzicVar6.m(), (Long) pair.second));
                                it = it9;
                                list9 = list11;
                                z4222 = z7;
                            }
                            list7 = arrayList3;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        List asList = Arrays.asList(((String) zzfy.d1.a(null)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
                        for (Pair pair2 : list2) {
                            try {
                                h0().Z(((Long) pair2.second).longValue());
                                for (zzhs zzhsVar : ((zzid) pair2.first).Z1()) {
                                    if (asList.contains(zzhsVar.D())) {
                                        if (zzhsVar.D().equals("_f") || zzhsVar.D().equals("_v")) {
                                            zzhr zzhrVar = (zzhr) zzhsVar.q();
                                            k0();
                                            zzpk.Y(zzhrVar, "_dac", 1L);
                                            zzhsVar = (zzhs) zzhrVar.m();
                                        }
                                        hkn h04 = h0();
                                        h04.Q();
                                        h04.R();
                                        Preconditions.f(str8);
                                        zzic zzicVar7 = (zzic) h04.b;
                                        zzicVar7.b().o.b(zzhsVar, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put(MBridgeConstans.APP_ID, str8);
                                        zzhs zzhsVar2 = zzhsVar;
                                        contentValues.put("name", zzhsVar2.D());
                                        contentValues.put("data", zzhsVar2.h());
                                        contentValues.put("timestamp_millis", Long.valueOf(zzhsVar2.F()));
                                        try {
                                            if (h04.H0().insert("no_data_mode_events", null, contentValues) == j2) {
                                                zzicVar7.b().g.b(zzgu.U(str8), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e17) {
                                            ((zzic) h04.b).b().g.c(zzgu.U(str8), e17, "Error storing NO_DATA mode event. appId");
                                        }
                                    }
                                }
                            } catch (SQLiteException unused) {
                                b().l.b(str8, "Failed handling NO_DATA mode bundles. appId");
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
                c = c(str8);
                zzjkVar = zzjk.AD_STORAGE;
                if (c.i(zzjkVar)) {
                    Iterator it10 = list3.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            str5 = null;
                            break;
                        }
                        zzid zzidVar3 = (zzid) ((Pair) it10.next()).first;
                        if (!zzidVar3.E().isEmpty()) {
                            str5 = zzidVar3.E();
                            break;
                        }
                    }
                    if (str5 != null) {
                        for (int i13 = 0; i13 < list3.size(); i13++) {
                            zzid zzidVar4 = (zzid) ((Pair) list3.get(i13)).first;
                            if (!zzidVar4.E().isEmpty() && !zzidVar4.E().equals(str5)) {
                                i = 0;
                                list4 = list3.subList(0, i13);
                                break;
                            }
                        }
                    }
                }
                i = 0;
                list4 = list3;
                F = zzib.F();
                size = list4.size();
                ArrayList arrayList5222 = new ArrayList(list4.size());
                i2 = (f0().R(str8) || !c(str8).i(zzjkVar)) ? i : 1;
                boolean i12222 = c(str8).i(zzjkVar);
                i3 = c(str8).i(zzjkVar2);
                b0 = f0().b0(str8, zzfy.M0);
                zzou zzouVar222 = this.j;
                zzot R222 = zzouVar222.R(str8);
                list5 = list4;
                while (true) {
                    zzicVar = this.l;
                    if (i < size) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzic zzicVar8 = (com.google.android.gms.internal.measurement.zzic) ((zzid) ((Pair) list5.get(i)).first).q();
                    int i14 = i;
                    arrayList5222.add((Long) ((Pair) list5.get(i)).second);
                    f0().W();
                    zzicVar8.A();
                    zzicVar8.k();
                    ((zzid) zzicVar8.b).p0(j);
                    zzicVar.getClass();
                    zzicVar8.S();
                    if (i2 == 0) {
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).c1();
                    }
                    if (!i12222) {
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).J1();
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).L1();
                    }
                    if (!i3) {
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).N1();
                    }
                    v(zzicVar8, str8);
                    if (!b0) {
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).j1();
                    }
                    if (!i3) {
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).V1();
                    }
                    String E = ((zzid) zzicVar8.b).E();
                    if (TextUtils.isEmpty(E)) {
                        i4 = size;
                    } else {
                        i4 = size;
                        if (!E.equals("00000000-0000-0000-0000-000000000000")) {
                            z2 = i3;
                            i5 = i2;
                            list6 = list5;
                            z3 = b0;
                            if (zzicVar8.i0() != 0) {
                                if (f0().b0(str8, zzfy.C0)) {
                                    zzicVar8.c0(k0().z0(((zzid) zzicVar8.m()).h()));
                                }
                                zzis zzisVar = R222.d;
                                if (zzisVar != null) {
                                    zzicVar8.K(zzisVar);
                                }
                                F.k();
                                ((zzib) F.b).I((zzid) zzicVar8.m());
                            }
                            i = i14 + 1;
                            size = i4;
                            i3 = z2;
                            list5 = list6;
                            i2 = i5;
                            b0 = z3;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(zzicVar8.h0());
                    Iterator it11 = arrayList7.iterator();
                    z2 = i3;
                    Long l = null;
                    Long l2 = null;
                    boolean z8 = false;
                    boolean z9 = false;
                    while (it11.hasNext()) {
                        int i15 = i2;
                        zzhs zzhsVar3 = (zzhs) it11.next();
                        List list12 = list5;
                        boolean z10 = b0;
                        if ("_fx".equals(zzhsVar3.D())) {
                            it11.remove();
                            list5 = list12;
                            i2 = i15;
                            b0 = z10;
                            z8 = true;
                        } else if ("_f".equals(zzhsVar3.D())) {
                            k0();
                            zzhw a0 = zzpk.a0(zzhsVar3, "_pfo");
                            if (a0 != null) {
                                l = Long.valueOf(a0.D());
                            }
                            k0();
                            zzhw a02 = zzpk.a0(zzhsVar3, "_uwa");
                            if (a02 != null) {
                                l2 = Long.valueOf(a02.D());
                            }
                            list5 = list12;
                            i2 = i15;
                            b0 = z10;
                        } else {
                            list5 = list12;
                            i2 = i15;
                            b0 = z10;
                        }
                        z9 = true;
                    }
                    i5 = i2;
                    list6 = list5;
                    z3 = b0;
                    if (z8) {
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).k0();
                        zzicVar8.k();
                        ((zzid) zzicVar8.b).j0(arrayList7);
                    }
                    if (z9) {
                        u(zzicVar8.w(), true, l, l2);
                    }
                    if (zzicVar8.i0() != 0) {
                    }
                    i = i14 + 1;
                    size = i4;
                    i3 = z2;
                    list5 = list6;
                    i2 = i5;
                    b0 = z3;
                }
                if (((zzib) F.b).z() != 0) {
                    p(arrayList5222);
                    z(false, 204, null, null, str8, Collections.EMPTY_LIST, null);
                    return;
                }
                zzib zzibVar = (zzib) F.m();
                ArrayList arrayList8 = new ArrayList();
                zzls zzlsVar = R222.c;
                boolean z11 = zzlsVar == zzls.SGTM_CLIENT;
                if (zzlsVar == zzls.SGTM) {
                    z = z11;
                } else {
                    if (!z11) {
                        str3 = null;
                        zzgzVar = this.b;
                        U(zzgzVar);
                        if (zzgzVar.U()) {
                            return;
                        }
                        String r0 = Log.isLoggable(b().W(), 2) ? k0().r0(zzibVar) : str3;
                        k0();
                        byte[] h = zzibVar.h();
                        p(arrayList5222);
                        this.i.j.b(j);
                        b().o.d("Uploading data. app, uncompressed size, data", str8, Integer.valueOf(h.length), r0);
                        this.u = true;
                        U(zzgzVar);
                        zzgzVar.V(str8, R222, zzibVar, new x6k((zzpg) this, str8, arrayList8));
                        return;
                    }
                    z = true;
                }
                Iterator it12 = ((zzib) F.m()).y().iterator();
                while (true) {
                    if (it12.hasNext()) {
                        if (((zzid) it12.next()).W()) {
                            str4 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str4 = null;
                        break;
                    }
                }
                zzib zzibVar2 = (zzib) F.m();
                d().Q();
                m0();
                com.google.android.gms.internal.measurement.zzhz G = zzib.G(zzibVar2);
                if (!TextUtils.isEmpty(str4)) {
                    G.k();
                    ((zzib) G.b).L(str4);
                }
                String d0 = g0().d0(str8);
                if (!TextUtils.isEmpty(d0)) {
                    G.q(d0);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it13 = zzibVar2.y().iterator();
                while (it13.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic f02 = zzid.f0((zzid) it13.next());
                    f02.k();
                    ((zzid) f02.b).c1();
                    arrayList9.add((zzid) f02.m());
                }
                G.k();
                ((zzib) G.b).K();
                G.k();
                ((zzib) G.b).J(arrayList9);
                b().o.b(TextUtils.isEmpty(str4) ? "null" : G.p(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                zzib zzibVar3 = (zzib) G.m();
                if (TextUtils.isEmpty(str4)) {
                    str3 = null;
                } else {
                    zzib zzibVar4 = (zzib) F.m();
                    d().Q();
                    m0();
                    com.google.android.gms.internal.measurement.zzhz F2 = zzib.F();
                    b().o.b(str4, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    F2.k();
                    ((zzib) F2.b).L(str4);
                    for (zzid zzidVar5 : zzibVar4.y()) {
                        com.google.android.gms.internal.measurement.zzic e0 = zzid.e0();
                        String X = zzidVar5.X();
                        e0.k();
                        ((zzid) e0.b).b1(X);
                        int U0 = zzidVar5.U0();
                        e0.k();
                        ((zzid) e0.b).t1(U0);
                        F2.k();
                        ((zzib) F2.b).I((zzid) e0.m());
                    }
                    zzib zzibVar5 = (zzib) F2.m();
                    String d02 = zzouVar222.c.g0().d0(str8);
                    boolean isEmpty2 = TextUtils.isEmpty(d02);
                    zzls zzlsVar2 = zzls.GOOGLE_SIGNAL;
                    zzls zzlsVar3 = zzls.GOOGLE_SIGNAL_PENDING;
                    if (isEmpty2) {
                        str3 = null;
                        String str10 = (String) zzfy.s.a(null);
                        if (z) {
                            zzlsVar2 = zzlsVar3;
                        }
                        zzotVar = new zzot(str10, Collections.EMPTY_MAP, zzlsVar2, null);
                    } else {
                        Uri parse = Uri.parse((String) zzfy.s.a(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        String authority = parse.getAuthority();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d02).length() + 1 + String.valueOf(authority).length());
                        sb2.append(d02);
                        sb2.append(".");
                        sb2.append(authority);
                        buildUpon.authority(sb2.toString());
                        String uri = buildUpon.build().toString();
                        if (z) {
                            zzlsVar2 = zzlsVar3;
                        }
                        str3 = null;
                        zzotVar = new zzot(uri, Collections.EMPTY_MAP, zzlsVar2, null);
                    }
                    arrayList8.add(Pair.create(zzibVar5, zzotVar));
                }
                if (z) {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar3.q();
                    for (int i16 = 0; i16 < zzibVar3.z(); i16++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar9 = (com.google.android.gms.internal.measurement.zzic) zzibVar3.A(i16).q();
                        zzicVar9.n0();
                        zzicVar9.L(j);
                        zzhzVar.k();
                        ((zzib) zzhzVar.b).H(i16, (zzid) zzicVar9.m());
                    }
                    arrayList8.add(Pair.create((zzib) zzhzVar.m(), R222));
                    p(arrayList5222);
                    z(false, 204, null, null, str, arrayList8, null);
                    if (s(str, R222.a)) {
                        b().o.b(str, "[sgtm] Sending sgtm batches available notification to app");
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        S(zzicVar.e(), intent);
                        return;
                    }
                    return;
                }
                str8 = str;
                zzibVar = zzibVar3;
                zzgzVar = this.b;
                U(zzgzVar);
                if (zzgzVar.U()) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzba r0(String str, zzba zzbaVar, zzjl zzjlVar, ohn ohnVar) {
        zzjk zzjkVar;
        zzji U;
        zzht zzhtVar = this.a;
        U(zzhtVar);
        com.google.android.gms.internal.measurement.zzgf m0 = zzhtVar.m0(str);
        int i = 90;
        zzji zzjiVar = zzji.DENIED;
        zzjk zzjkVar2 = zzjk.AD_USER_DATA;
        if (m0 == null) {
            if (zzbaVar.a() == zzjiVar) {
                i = zzbaVar.a;
                ohnVar.i(zzjkVar2, i);
            } else {
                ohnVar.j(zzjkVar2, dhn.FAILSAFE);
            }
            return new zzba(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        zzji a = zzbaVar.a();
        zzji zzjiVar2 = zzji.GRANTED;
        if (a == zzjiVar2 || a == zzjiVar) {
            i = zzbaVar.a;
            ohnVar.i(zzjkVar2, i);
        } else {
            zzji zzjiVar3 = zzji.POLICY;
            zzji zzjiVar4 = zzji.UNINITIALIZED;
            if (a != zzjiVar3 || (U = zzhtVar.U(str, zzjkVar2)) == zzjiVar4) {
                zzhtVar.Q();
                zzhtVar.W(str);
                com.google.android.gms.internal.measurement.zzgf m02 = zzhtVar.m0(str);
                if (m02 != null) {
                    for (zzfw zzfwVar : m02.z()) {
                        if (zzjkVar2 == zzht.b0(zzfwVar.y())) {
                            zzjkVar = zzht.b0(zzfwVar.z());
                            break;
                        }
                    }
                }
                zzjkVar = null;
                EnumMap enumMap = zzjlVar.a;
                zzjk zzjkVar3 = zzjk.AD_STORAGE;
                zzji zzjiVar5 = (zzji) enumMap.get(zzjkVar3);
                if (zzjiVar5 != null) {
                    zzjiVar4 = zzjiVar5;
                }
                boolean z = zzjiVar4 == zzjiVar2 || zzjiVar4 == zzjiVar;
                if (zzjkVar == zzjkVar3 && z) {
                    ohnVar.j(zzjkVar2, dhn.REMOTE_DELEGATION);
                    a = zzjiVar4;
                } else {
                    ohnVar.j(zzjkVar2, dhn.REMOTE_DEFAULT);
                    a = true != zzhtVar.l0(str, zzjkVar2) ? zzjiVar : zzjiVar2;
                }
            } else {
                ohnVar.j(zzjkVar2, dhn.REMOTE_ENFORCED_DEFAULT);
                a = U;
            }
        }
        zzhtVar.Q();
        zzhtVar.W(str);
        com.google.android.gms.internal.measurement.zzgf m03 = zzhtVar.m0(str);
        boolean z2 = m03 == null || !m03.B() || m03.C();
        U(zzhtVar);
        zzhtVar.Q();
        zzhtVar.W(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.zzgf m04 = zzhtVar.m0(str);
        if (m04 != null) {
            Iterator it = m04.A().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.zzgc) it.next()).y());
            }
        }
        if (a == zzjiVar || treeSet.isEmpty()) {
            return new zzba(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new zzba(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }

    public final boolean s(String str, String str2) {
        hkn hknVar = this.c;
        U(hknVar);
        xjo U0 = hknVar.U0(str);
        HashMap hashMap = this.E;
        if (U0 != null && l0().v0(str, U0.D())) {
            hashMap.remove(str2);
            return true;
        }
        o1p o1pVar = (o1p) hashMap.get(str2);
        if (o1pVar != null) {
            ((DefaultClock) o1pVar.a.f()).getClass();
            if (System.currentTimeMillis() < o1pVar.c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        d().Q();
        m0();
        this.v = true;
        try {
            zzic zzicVar = this.l;
            zzicVar.getClass();
            Boolean bool = zzicVar.o().f;
            if (bool == null) {
                b().j.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().g.a("Upload called in the client side when service should be used");
            } else if (this.o > 0) {
                N();
            } else {
                zzgz zzgzVar = this.b;
                U(zzgzVar);
                if (zzgzVar.U()) {
                    hkn hknVar = this.c;
                    U(hknVar);
                    if (hknVar.W(str)) {
                        hkn hknVar2 = this.c;
                        U(hknVar2);
                        Preconditions.f(str);
                        hknVar2.Q();
                        hknVar2.R();
                        List V = hknVar2.V(str, zzoo.Y0(zzls.GOOGLE_SIGNAL), 1);
                        zzpj zzpjVar = V.isEmpty() ? null : (zzpj) V.get(0);
                        if (zzpjVar != null) {
                            zzib zzibVar = zzpjVar.b;
                            b().o.d("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.e, zzpjVar.c);
                            byte[] h = zzibVar.h();
                            if (Log.isLoggable(b().W(), 2)) {
                                zzpk zzpkVar = this.g;
                                U(zzpkVar);
                                b().o.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(h.length), zzpkVar.r0(zzibVar));
                            }
                            zzot zzotVar = new zzot(zzpjVar.c, zzpjVar.d, zzpjVar.e, null);
                            this.u = true;
                            zzgz zzgzVar2 = this.b;
                            U(zzgzVar2);
                            zzgzVar2.V(str, zzotVar, zzibVar, new h5o(this, str, zzpjVar));
                        }
                    } else {
                        b().o.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    b().o.a("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.v = false;
            O();
        } catch (Throwable th) {
            this.v = false;
            O();
            throw th;
        }
    }

    public final void u(String str, boolean z, Long l, Long l2) {
        hkn hknVar = this.c;
        U(hknVar);
        xjo U0 = hknVar.U0(str);
        if (U0 != null) {
            zzic zzicVar = U0.a;
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Q();
            U0.R |= U0.y != z;
            U0.y = z;
            zzhz zzhzVar2 = zzicVar.g;
            zzic.m(zzhzVar2);
            zzhzVar2.Q();
            U0.R |= !Objects.equals(U0.z, l);
            U0.z = l;
            zzhz zzhzVar3 = zzicVar.g;
            zzic.m(zzhzVar3);
            zzhzVar3.Q();
            U0.R |= !Objects.equals(U0.A, l2);
            U0.A = l2;
            if (U0.o()) {
                hkn hknVar2 = this.c;
                U(hknVar2);
                hknVar2.V0(U0, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0121, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        int C0;
        int indexOf;
        zzht zzhtVar = this.a;
        U(zzhtVar);
        zzhtVar.Q();
        zzhtVar.W(str);
        dh0 dh0Var = zzhtVar.f;
        Set set = (Set) dh0Var.get(str);
        if (set != null) {
            zzicVar.k();
            ((zzid) zzicVar.b).k1(set);
        }
        U(zzhtVar);
        zzhtVar.Q();
        zzhtVar.W(str);
        if (dh0Var.get(str) != null && (((Set) dh0Var.get(str)).contains(Payload.DEVICE_MODEL) || ((Set) dh0Var.get(str)).contains("device_info"))) {
            zzicVar.k();
            ((zzid) zzicVar.b).A1();
        }
        U(zzhtVar);
        if (zzhtVar.j0(str)) {
            String t2 = ((zzid) zzicVar.b).t2();
            if (!TextUtils.isEmpty(t2) && (indexOf = t2.indexOf(".")) != -1) {
                String substring = t2.substring(0, indexOf);
                zzicVar.k();
                ((zzid) zzicVar.b).y0(substring);
            }
        }
        U(zzhtVar);
        zzhtVar.Q();
        zzhtVar.W(str);
        if (dh0Var.get(str) != null && ((Set) dh0Var.get(str)).contains("user_id") && (C0 = zzpk.C0(zzicVar, "_id")) != -1) {
            zzicVar.k();
            ((zzid) zzicVar.b).o0(C0);
        }
        U(zzhtVar);
        zzhtVar.Q();
        zzhtVar.W(str);
        if (dh0Var.get(str) != null && ((Set) dh0Var.get(str)).contains("google_signals")) {
            zzicVar.k();
            ((zzid) zzicVar.b).c1();
        }
        U(zzhtVar);
        if (zzhtVar.k0(str)) {
            zzicVar.k();
            ((zzid) zzicVar.b).N1();
            if (c(str).i(zzjk.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.D;
                m1p m1pVar = (m1p) hashMap.get(str);
                if (m1pVar != null) {
                    long Y = f0().Y(str, zzfy.j0) + m1pVar.b;
                    ((DefaultClock) f()).getClass();
                }
                m1pVar = new m1p(this, l0().N0());
                hashMap.put(str, m1pVar);
                String str2 = m1pVar.a;
                zzicVar.k();
                ((zzid) zzicVar.b).l1(str2);
            }
        }
        U(zzhtVar);
        zzhtVar.Q();
        zzhtVar.W(str);
        if (dh0Var.get(str) == null || !((Set) dh0Var.get(str)).contains("enhanced_user_id")) {
            return;
        }
        zzicVar.k();
        ((zzid) zzicVar.b).j1();
    }

    public final void w(com.google.android.gms.internal.measurement.zzic zzicVar, pq7 pq7Var) {
        String str;
        String str2;
        for (int i = 0; i < zzicVar.i0(); i++) {
            zzhr zzhrVar = (zzhr) ((zzid) zzicVar.b).e2(i).q();
            Iterator it = zzhrVar.p().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((zzhw) it.next()).z())) {
                    if (((zzid) pq7Var.b).Q0() >= f0().Z(((zzid) pq7Var.b).y(), zzfy.k0)) {
                        int Z = f0().Z(((zzid) pq7Var.b).y(), zzfy.x0);
                        LinkedList linkedList = this.q;
                        zzpk zzpkVar = this.g;
                        if (Z > 0) {
                            hkn hknVar = this.c;
                            U(hknVar);
                            if (hknVar.W0(g(), ((zzid) pq7Var.b).y(), false, false, false, true).g > Z) {
                                zzhv K2 = zzhw.K();
                                K2.p("_tnr");
                                K2.r(1L);
                                zzhrVar.s((zzhw) K2.m());
                            } else {
                                if (f0().b0(((zzid) pq7Var.b).y(), zzfy.Q0)) {
                                    str2 = l0().N0();
                                    zzhv K3 = zzhw.K();
                                    K3.p("_tu");
                                    K3.q(str2);
                                    zzhrVar.s((zzhw) K3.m());
                                } else {
                                    str2 = null;
                                }
                                zzhv K4 = zzhw.K();
                                K4.p("_tr");
                                K4.r(1L);
                                zzhrVar.s((zzhw) K4.m());
                                U(zzpkVar);
                                zzoh p0 = zzpkVar.p0(((zzid) pq7Var.b).y(), zzicVar, zzhrVar, str2);
                                if (p0 != null) {
                                    b().o.c(((zzid) pq7Var.b).y(), p0.a, "Generated trigger URI. appId, uri");
                                    hkn hknVar2 = this.c;
                                    U(hknVar2);
                                    hknVar2.l0(((zzid) pq7Var.b).y(), p0);
                                    if (!linkedList.contains(((zzid) pq7Var.b).y())) {
                                        linkedList.add(((zzid) pq7Var.b).y());
                                    }
                                }
                            }
                        } else {
                            if (f0().b0(((zzid) pq7Var.b).y(), zzfy.Q0)) {
                                str = l0().N0();
                                zzhv K5 = zzhw.K();
                                K5.p("_tu");
                                K5.q(str);
                                zzhrVar.s((zzhw) K5.m());
                            } else {
                                str = null;
                            }
                            zzhv K6 = zzhw.K();
                            K6.p("_tr");
                            K6.r(1L);
                            zzhrVar.s((zzhw) K6.m());
                            U(zzpkVar);
                            zzoh p02 = zzpkVar.p0(((zzid) pq7Var.b).y(), zzicVar, zzhrVar, str);
                            if (p02 != null) {
                                b().o.c(((zzid) pq7Var.b).y(), p02.a, "Generated trigger URI. appId, uri");
                                hkn hknVar3 = this.c;
                                U(hknVar3);
                                hknVar3.l0(((zzid) pq7Var.b).y(), p02);
                                if (!linkedList.contains(((zzid) pq7Var.b).y())) {
                                    linkedList.add(((zzid) pq7Var.b).y());
                                }
                            }
                        }
                    }
                    zzhs zzhsVar = (zzhs) zzhrVar.m();
                    zzicVar.k();
                    ((zzid) zzicVar.b).h0(i, zzhsVar);
                }
            }
        }
    }

    public final void x(String str, zzhv zzhvVar, Bundle bundle, String str2) {
        int V;
        List a = f0().b0(str2, zzfy.a1) ? CollectionUtils.a("_o", "_sn", "_sc", "_si", "deep_link_url") : CollectionUtils.a("_o", "_sn", "_sc", "_si");
        if (zzpp.u0(((zzhw) zzhvVar.b).z()) || zzpp.u0(str)) {
            V = f0().V(str2, true);
        } else {
            zzal f0 = f0();
            f0.getClass();
            V = Math.max(Math.min(f0.Z(str2, zzfy.g0), 500), 100);
        }
        long j = V;
        long codePointCount = ((zzhw) zzhvVar.b).B().codePointCount(0, ((zzhw) zzhvVar.b).B().length());
        l0();
        String z = ((zzhw) zzhvVar.b).z();
        f0();
        String X = zzpp.X(40, z, true);
        if (codePointCount <= j || a.contains(((zzhw) zzhvVar.b).z())) {
            return;
        }
        if ("_ev".equals(((zzhw) zzhvVar.b).z())) {
            l0();
            bundle.putString("_ev", zzpp.X(f0().V(str2, true), ((zzhw) zzhvVar.b).B(), true));
            return;
        }
        b().l.c(X, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", X);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(((zzhw) zzhvVar.b).z());
    }

    public final boolean y(zzhr zzhrVar) {
        ArrayList arrayList = new ArrayList(zzhrVar.p());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (U3.i.X.equals(((zzhw) arrayList.get(i3)).z())) {
                i = i3;
            } else if (InAppPurchaseMetaData.KEY_CURRENCY.equals(((zzhw) arrayList.get(i3)).z())) {
                i2 = i3;
            }
        }
        if (i == -1) {
            if (!f0().b0(null, zzfy.f1) || !"_iap".equals(zzhrVar.v())) {
                return true;
            }
            E(zzhrVar, "_c");
            D(zzhrVar, 18, U3.i.X);
            return false;
        }
        if (!((zzhw) arrayList.get(i)).C() && !((zzhw) arrayList.get(i)).G()) {
            b().l.a("Value must be specified with a numeric type.");
            zzhrVar.u(i);
            E(zzhrVar, "_c");
            D(zzhrVar, 18, U3.i.X);
            return false;
        }
        if (i2 != -1) {
            String B = ((zzhw) arrayList.get(i2)).B();
            if (B.length() == 3) {
                int i4 = 0;
                while (i4 < B.length()) {
                    int codePointAt = B.codePointAt(i4);
                    if (Character.isLetter(codePointAt)) {
                        i4 += Character.charCount(codePointAt);
                    }
                }
                return true;
            }
        }
        b().l.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
        zzhrVar.u(i);
        E(zzhrVar, "_c");
        D(zzhrVar, 19, InAppPurchaseMetaData.KEY_CURRENCY);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r20 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z, int i, Throwable th, byte[] bArr, String str, List list, Map map) {
        byte[] bArr2;
        zzls zzlsVar;
        int i2 = i;
        zzgz zzgzVar = this.b;
        d().Q();
        m0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.u = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        if (f0().b0(null, zzfy.e1)) {
            zzpk zzpkVar = this.g;
            U(zzpkVar);
            zzpkVar.W(map);
        }
        ArrayList<Long> arrayList = this.y;
        Preconditions.i(arrayList);
        this.y = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    b().l.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
                    zzhe zzheVar = this.i.j;
                    ((DefaultClock) f()).getClass();
                    zzheVar.b(System.currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        zzhe zzheVar2 = this.i.h;
                        ((DefaultClock) f()).getClass();
                        zzheVar2.b(System.currentTimeMillis());
                    }
                    hkn hknVar = this.c;
                    U(hknVar);
                    hknVar.b0(arrayList);
                    N();
                    this.u = false;
                    O();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                zzlsVar = zzls.SGTM_CLIENT;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                zzib zzibVar = (zzib) pair.first;
                zzot zzotVar = (zzot) pair.second;
                zzls zzlsVar2 = zzotVar.c;
                zzls zzlsVar3 = zzotVar.c;
                if (zzlsVar2 != zzlsVar) {
                    hkn hknVar2 = this.c;
                    U(hknVar2);
                    String str3 = zzotVar.a;
                    Map map2 = zzotVar.b;
                    if (map2 == null) {
                        map2 = Collections.EMPTY_MAP;
                    }
                    long U = hknVar2.U(str, zzibVar, str3, map2, zzlsVar3, null);
                    if (zzlsVar3 == zzls.GOOGLE_SIGNAL_PENDING && U != -1 && !zzibVar.C().isEmpty()) {
                        hashMap.put(zzibVar.C(), Long.valueOf(U));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                zzib zzibVar2 = (zzib) pair2.first;
                zzot zzotVar2 = (zzot) pair2.second;
                if (zzotVar2.c == zzlsVar) {
                    Long l = (Long) hashMap.get(zzibVar2.C());
                    hkn hknVar3 = this.c;
                    U(hknVar3);
                    zzls zzlsVar4 = zzlsVar;
                    String str4 = zzotVar2.a;
                    Map map3 = zzotVar2.b;
                    if (map3 == null) {
                        map3 = Collections.EMPTY_MAP;
                    }
                    hknVar3.U(str, zzibVar2, str4, map3, zzotVar2.c, l);
                    zzlsVar = zzlsVar4;
                }
            }
            hkn hknVar4 = this.c;
            U(hknVar4);
            List V = hknVar4.V(str, zzoo.Y0(zzlsVar), 1);
            if (!V.isEmpty()) {
                long j = ((zzpj) V.get(0)).f;
                ((DefaultClock) f()).getClass();
                if (System.currentTimeMillis() > ((Long) zzfy.F.a(null)).longValue() + j) {
                    b().j.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                }
            }
            for (Long l2 : arrayList) {
                try {
                    hkn hknVar5 = this.c;
                    U(hknVar5);
                    hknVar5.Z(l2.longValue());
                } catch (SQLiteException e) {
                    ArrayList arrayList2 = this.z;
                    if (arrayList2 == null || !arrayList2.contains(l2)) {
                        throw e;
                    }
                }
            }
            hkn hknVar6 = this.c;
            U(hknVar6);
            hknVar6.F0();
            hkn hknVar7 = this.c;
            U(hknVar7);
            hknVar7.G0();
            this.z = null;
            U(zzgzVar);
            if (zzgzVar.U()) {
                hkn hknVar8 = this.c;
                U(hknVar8);
                if (hknVar8.W(str)) {
                    t(str);
                    this.o = 0L;
                    this.u = false;
                    O();
                    return;
                }
            }
            U(zzgzVar);
            if (zzgzVar.U() && M()) {
                q();
            } else {
                this.A = -1L;
                N();
            }
            this.o = 0L;
            this.u = false;
            O();
            return;
        } catch (Throwable th3) {
            hkn hknVar9 = this.c;
            U(hknVar9);
            hknVar9.G0();
            throw th3;
        }
        zzgs zzgsVar = b().o;
        Integer valueOf = Integer.valueOf(i2);
        zzgsVar.c(valueOf, Boolean.valueOf(z), "Network upload successful with code, uploadAttempted");
        if (z) {
            try {
                zzhe zzheVar3 = this.i.i;
                ((DefaultClock) f()).getClass();
                zzheVar3.b(System.currentTimeMillis());
            } catch (SQLiteException e2) {
                b().g.b(e2, "Database error while trying to delete uploaded bundles");
                ((DefaultClock) f()).getClass();
                this.o = SystemClock.elapsedRealtime();
                b().o.b(Long.valueOf(this.o), "Disable upload, time");
            }
        }
        this.i.j.b(0L);
        N();
        if (z) {
            b().o.c(valueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
        } else {
            b().o.a("Purged empty bundles");
        }
        hkn hknVar10 = this.c;
        U(hknVar10);
        hknVar10.E0();
    }
}
