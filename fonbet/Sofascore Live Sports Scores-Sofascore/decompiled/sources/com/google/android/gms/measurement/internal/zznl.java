package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.am0;
import defpackage.dbo;
import defpackage.jgo;
import defpackage.lmo;
import defpackage.nod;
import defpackage.sxo;
import defpackage.wt3;
import defpackage.yao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznl extends yao {
    public final zznf d;
    public zzgb e;
    public volatile Boolean f;
    public final sxo g;
    public ScheduledExecutorService h;
    public final am0 i;
    public final ArrayList j;
    public final sxo k;

    public zznl(zzic zzicVar) {
        super(zzicVar);
        this.j = new ArrayList();
        this.i = new am0(zzicVar.k);
        this.d = new zznf(this);
        this.g = new sxo(this, zzicVar, 0);
        this.k = new sxo(this, zzicVar, 1);
    }

    @Override // defpackage.yao
    public final boolean T() {
        return false;
    }

    public final void U(AtomicReference atomicReference) {
        Q();
        R();
        e0(new jgo(this, atomicReference, g0(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Bundle bundle) {
        boolean z;
        boolean X;
        Q();
        R();
        zzbf zzbfVar = new zzbf(bundle);
        c0();
        zzic zzicVar = (zzic) this.b;
        if (zzicVar.d.b0(null, zzfy.W0)) {
            zzgl n = zzicVar.n();
            zzic zzicVar2 = (zzic) n.b;
            zzpp zzppVar = zzicVar2.i;
            zzgu zzguVar = zzicVar2.f;
            zzic.k(zzppVar);
            byte[] z0 = zzpp.z0(zzbfVar);
            if (z0 == null) {
                zzic.m(zzguVar);
                zzguVar.h.a("Null default event parameters; not writing to database");
            } else if (z0.length > 131072) {
                zzic.m(zzguVar);
                zzguVar.h.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                X = n.X(4, z0);
                if (X) {
                    z = true;
                    e0(new dbo(this, g0(false), z, zzbfVar, bundle));
                }
            }
            X = false;
            if (X) {
            }
        }
        z = false;
        e0(new dbo(this, g0(false), z, zzbfVar, bundle));
    }

    public final void W() {
        Q();
        R();
        if (h0()) {
            return;
        }
        if (X()) {
            zznf zznfVar = this.d;
            zznl zznlVar = zznfVar.c;
            zznlVar.Q();
            Context context = ((zzic) zznlVar.b).a;
            synchronized (zznfVar) {
                try {
                    if (zznfVar.a) {
                        zzgu zzguVar = ((zzic) zznfVar.c.b).f;
                        zzic.m(zzguVar);
                        zzguVar.o.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (zznfVar.b != null && (zznfVar.b.isConnecting() || zznfVar.b.isConnected())) {
                            zzgu zzguVar2 = ((zzic) zznfVar.c.b).f;
                            zzic.m(zzguVar2);
                            zzguVar2.o.a("Already awaiting connection attempt");
                            return;
                        }
                        zznfVar.b = new zzgo(93, context, Looper.getMainLooper(), zznfVar, zznfVar);
                        zzgu zzguVar3 = ((zzic) zznfVar.c.b).f;
                        zzic.m(zzguVar3);
                        zzguVar3.o.a("Connecting to remote service");
                        zznfVar.a = true;
                        Preconditions.i(zznfVar.b);
                        zznfVar.b.checkAvailabilityAndConnect();
                        return;
                    }
                } finally {
                }
            }
        }
        zzic zzicVar = (zzic) this.b;
        if (zzicVar.d.T()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zzicVar.a.getPackageManager().queryIntentServices(new Intent().setClassName(zzicVar.a, "com.google.android.gms.measurement.AppMeasurementService"), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzgu zzguVar4 = zzicVar.f;
            zzic.m(zzguVar4);
            zzguVar4.g.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zzicVar.a, "com.google.android.gms.measurement.AppMeasurementService"));
        zznf zznfVar2 = this.d;
        zznl zznlVar2 = zznfVar2.c;
        zznlVar2.Q();
        Context context2 = ((zzic) zznlVar2.b).a;
        ConnectionTracker b = ConnectionTracker.b();
        synchronized (zznfVar2) {
            try {
                boolean z = zznfVar2.a;
                zznl zznlVar3 = zznfVar2.c;
                zzic zzicVar2 = (zzic) zznlVar3.b;
                if (z) {
                    zzgu zzguVar5 = zzicVar2.f;
                    zzic.m(zzguVar5);
                    zzguVar5.o.a("Connection attempt already in progress");
                } else {
                    zzgu zzguVar6 = zzicVar2.f;
                    zzic.m(zzguVar6);
                    zzguVar6.o.a("Using local app measurement service");
                    zznfVar2.a = true;
                    b.a(context2, intent, zznlVar3.d, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        Q();
        R();
        if (this.f == null) {
            Q();
            R();
            zzic zzicVar = (zzic) this.b;
            lmo lmoVar = zzicVar.e;
            zzic.k(lmoVar);
            lmoVar.Q();
            boolean z = false;
            Boolean valueOf = !lmoVar.U().contains("use_service") ? null : Boolean.valueOf(lmoVar.U().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                zzgi q = ((zzic) this.b).q();
                q.R();
                if (q.o != 1) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.o.a("Checking service availability");
                    zzpp zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    int b = GoogleApiAvailabilityLight.b.b(((zzic) zzppVar.b).a, 12451000);
                    if (b != 0) {
                        if (b == 1) {
                            zzgu zzguVar2 = zzicVar.f;
                            zzic.m(zzguVar2);
                            zzguVar2.o.a("Service missing");
                        } else if (b != 2) {
                            if (b != 3) {
                                zzgu zzguVar3 = zzicVar.f;
                                if (b == 9) {
                                    zzic.m(zzguVar3);
                                    zzguVar3.j.a("Service invalid");
                                } else if (b != 18) {
                                    zzic.m(zzguVar3);
                                    zzguVar3.j.b(Integer.valueOf(b), "Unexpected service status");
                                } else {
                                    zzic.m(zzguVar3);
                                    zzguVar3.j.a("Service updating");
                                }
                            } else {
                                zzgu zzguVar4 = zzicVar.f;
                                zzic.m(zzguVar4);
                                zzguVar4.j.a("Service disabled");
                            }
                            r2 = false;
                        } else {
                            zzgu zzguVar5 = zzicVar.f;
                            zzic.m(zzguVar5);
                            zzguVar5.n.a("Service container out of date");
                            zzpp zzppVar2 = zzicVar.i;
                            zzic.k(zzppVar2);
                            if (zzppVar2.B0() >= 17443) {
                                z = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z && zzicVar.d.T()) {
                            zzgu zzguVar6 = zzicVar.f;
                            zzic.m(zzguVar6);
                            zzguVar6.g.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            lmo lmoVar2 = zzicVar.e;
                            zzic.k(lmoVar2);
                            lmoVar2.Q();
                            SharedPreferences.Editor edit = lmoVar2.U().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r2 = z;
                    } else {
                        zzgu zzguVar7 = zzicVar.f;
                        zzic.m(zzguVar7);
                        zzguVar7.o.a("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r2) {
                }
                r2 = z;
            }
            this.f = Boolean.valueOf(r2);
        }
        return this.f.booleanValue();
    }

    public final void Y() {
        Q();
        R();
        zznf zznfVar = this.d;
        if (zznfVar.b != null && (zznfVar.b.isConnected() || zznfVar.b.isConnecting())) {
            zznfVar.b.disconnect();
        }
        zznfVar.b = null;
        try {
            ConnectionTracker.b().c(((zzic) this.b).a, zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.e = null;
    }

    public final boolean Z() {
        Q();
        R();
        if (!X()) {
            return true;
        }
        zzpp zzppVar = ((zzic) this.b).i;
        zzic.k(zzppVar);
        return zzppVar.B0() >= ((Integer) zzfy.J0.a(null)).intValue();
    }

    public final boolean a0() {
        Q();
        R();
        if (!X()) {
            return true;
        }
        zzpp zzppVar = ((zzic) this.b).i;
        zzic.k(zzppVar);
        return zzppVar.B0() >= 241200;
    }

    public final void b0(ComponentName componentName) {
        Q();
        if (this.e != null) {
            this.e = null;
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.o.b(componentName, "Disconnected from device MeasurementService");
            Q();
            W();
        }
    }

    public final void c0() {
        ((zzic) this.b).getClass();
    }

    public final void d0() {
        Q();
        am0 am0Var = this.i;
        am0Var.b = ((Clock) am0Var.c).elapsedRealtime();
        zzal zzalVar = ((zzic) this.b).d;
        this.g.b(((Long) zzfy.Y.a(null)).longValue());
    }

    public final void e0(Runnable runnable) {
        Q();
        if (h0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.j;
        long size = arrayList.size();
        zzic zzicVar = (zzic) this.b;
        zzal zzalVar = zzicVar.d;
        if (size >= 1000) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.k.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            W();
        }
    }

    public final void f0() {
        Q();
        zzic zzicVar = (zzic) this.b;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.o;
        ArrayList arrayList = this.j;
        zzgsVar.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.k.c();
    }

    public final zzr g0(boolean z) {
        long abs;
        Pair pair;
        zzic zzicVar = (zzic) this.b;
        zzicVar.getClass();
        zzgi q = zzicVar.q();
        String str = null;
        if (z) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzic zzicVar2 = (zzic) zzguVar.b;
            lmo lmoVar = zzicVar2.e;
            zzic.k(lmoVar);
            if (lmoVar.f != null) {
                lmo lmoVar2 = zzicVar2.e;
                zzic.k(lmoVar2);
                zzhf zzhfVar = lmoVar2.f;
                lmo lmoVar3 = zzhfVar.b;
                lmoVar3.Q();
                lmoVar3.Q();
                long j = zzhfVar.b.U().getLong("health_monitor:start", 0L);
                if (j == 0) {
                    zzhfVar.a();
                    abs = 0;
                } else {
                    ((zzic) lmoVar3.b).k.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = zzhfVar.a;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        zzhfVar.a();
                    } else {
                        String string = lmoVar3.U().getString("health_monitor:value", null);
                        long j3 = lmoVar3.U().getLong("health_monitor:count", 0L);
                        zzhfVar.a();
                        pair = (string == null || j3 <= 0) ? lmo.A : new Pair(string, Long.valueOf(j3));
                        if (pair != null && pair != lmo.A) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = wt3.m(valueOf, ":", new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = wt3.m(valueOf2, ":", new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), str22);
                }
            }
        }
        return q.U(str);
    }

    public final boolean h0() {
        Q();
        R();
        return this.e != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0439 A[Catch: all -> 0x0475, TRY_ENTER, TryCatch #48 {all -> 0x0475, blocks: (B:196:0x0465, B:219:0x0439, B:221:0x043f, B:222:0x0442, B:210:0x0486, B:340:0x0370, B:344:0x037a, B:345:0x038b), top: B:195:0x0465 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02d4 A[Catch: all -> 0x01fc, SQLiteException -> 0x02ae, SQLiteDatabaseLockedException -> 0x02b3, SQLiteFullException -> 0x02b7, TryCatch #56 {all -> 0x01fc, blocks: (B:167:0x01d7, B:170:0x01eb, B:172:0x01f0, B:180:0x0214, B:181:0x0217, B:178:0x0210, B:229:0x021d, B:232:0x0231, B:234:0x0249, B:237:0x0252, B:238:0x0255, B:240:0x0243, B:243:0x0259, B:246:0x026d, B:248:0x0285, B:253:0x028f, B:254:0x0292, B:251:0x027f, B:264:0x0296, B:272:0x02aa, B:274:0x02d4, B:284:0x02de, B:285:0x02e1, B:290:0x02ce, B:259:0x02f0, B:261:0x02fb, B:337:0x035b), top: B:166:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0596 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0626  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        ArrayList arrayList;
        zzic zzicVar;
        Context context;
        zzgu zzguVar;
        int i;
        SQLiteDatabase sQLiteDatabase;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i4;
        Cursor cursor4;
        zzfx zzfxVar;
        long j2;
        String str5;
        Parcel obtain;
        zzbf zzbfVar;
        int i5;
        zzah zzahVar;
        zzpl zzplVar;
        int i6;
        int size;
        int i7;
        int i8;
        zzfx zzfxVar2;
        zzic zzicVar2;
        Context context2;
        zzgu zzguVar2;
        long j3;
        long j4;
        Q();
        R();
        c0();
        zzic zzicVar3 = (zzic) this.b;
        zzal zzalVar = zzicVar3.d;
        Context context3 = zzicVar3.a;
        zzal zzalVar2 = zzicVar3.d;
        zzgu zzguVar3 = zzicVar3.f;
        DefaultClock defaultClock = zzicVar3.k;
        int i9 = 100;
        zzr zzrVar2 = zzrVar;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && i11 == i9; i11 = i6) {
            ArrayList arrayList2 = new ArrayList();
            zzgl n = zzicVar3.n();
            String str6 = "entry";
            int i12 = i9;
            String str7 = "type";
            String str8 = "rowid";
            DefaultClock defaultClock2 = defaultClock;
            zzic zzicVar4 = (zzic) n.b;
            n.Q();
            int i13 = i10;
            if (n.e) {
                zzicVar = zzicVar3;
                context = context3;
                zzguVar = zzguVar3;
            } else {
                arrayList = new ArrayList();
                zzicVar = zzicVar3;
                if (((zzic) n.b).a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i14 = 5;
                    context = context3;
                    zzguVar = zzguVar3;
                    int i15 = 0;
                    int i16 = 5;
                    while (i15 < i14) {
                        try {
                            SQLiteDatabase W = n.W();
                            if (W == null) {
                                try {
                                    try {
                                        n.e = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = W;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    i2 = i15;
                                    str = str8;
                                    str3 = str6;
                                    sQLiteDatabase = W;
                                    i3 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i16);
                                        i16 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i15 = i2 + 1;
                                        i14 = i3;
                                        str7 = str2;
                                        str6 = str3;
                                        str8 = str;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    i2 = i15;
                                    str = str8;
                                    str3 = str6;
                                    sQLiteDatabase = W;
                                    i3 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    zzgu zzguVar4 = zzicVar4.f;
                                    zzic.m(zzguVar4);
                                    zzguVar4.g.b(e, "Error reading entries from local database");
                                    n.e = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i15 = i2 + 1;
                                    i14 = i3;
                                    str7 = str2;
                                    str6 = str3;
                                    str8 = str;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    i2 = i15;
                                    str = str8;
                                    str3 = str6;
                                    sQLiteDatabase = W;
                                    i3 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    zzgu zzguVar5 = zzicVar4.f;
                                    zzic.m(zzguVar5);
                                    zzguVar5.g.b(e, "Error reading entries from local database");
                                    n.e = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i15 = i2 + 1;
                                    i14 = i3;
                                    str7 = str2;
                                    str6 = str3;
                                    str8 = str;
                                }
                            } else {
                                W.beginTransaction();
                                try {
                                    cursor3 = W.query("messages", new String[]{str8}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j5 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i2 = i15;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str = str8;
                                                    str3 = str6;
                                                    sQLiteDatabase = W;
                                                    i3 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i16);
                                                    i16 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    str = str8;
                                                    str3 = str6;
                                                    sQLiteDatabase = W;
                                                    i3 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    zzgu zzguVar42 = zzicVar4.f;
                                                    zzic.m(zzguVar42);
                                                    zzguVar42.g.b(e, "Error reading entries from local database");
                                                    n.e = true;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i15 = i2 + 1;
                                                        i14 = i3;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    str = str8;
                                                    str3 = str6;
                                                    sQLiteDatabase = W;
                                                    i3 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    zzgu zzguVar52 = zzicVar4.f;
                                                    zzic.m(zzguVar52);
                                                    zzguVar52.g.b(e, "Error reading entries from local database");
                                                    n.e = true;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i15 = i2 + 1;
                                                        i14 = i3;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str = str8;
                                                str3 = str6;
                                                sQLiteDatabase = W;
                                                i3 = 5;
                                                str2 = str7;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i16);
                                                        i16 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i15 = i2 + 1;
                                                        i14 = i3;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        cursor2 = null;
                                                        zzgu zzguVar422 = zzicVar4.f;
                                                        zzic.m(zzguVar422);
                                                        zzguVar422.g.b(e, "Error reading entries from local database");
                                                        n.e = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i15 = i2 + 1;
                                                        i14 = i3;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        zzgu zzguVar522 = zzicVar4.f;
                                                        zzic.m(zzguVar522);
                                                        zzguVar522.g.b(e, "Error reading entries from local database");
                                                        n.e = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i15 = i2 + 1;
                                                        i14 = i3;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i2 = i15;
                                            cursor3.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        try {
                                            String[] strArr2 = {str8, str7, str6};
                                            zzal zzalVar3 = zzicVar4.d;
                                            zzfx zzfxVar3 = zzfy.W0;
                                            str = str8;
                                            try {
                                                try {
                                                    int i17 = 4;
                                                    int i18 = 3;
                                                    if (zzalVar3.b0(null, zzfxVar3)) {
                                                        i4 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str7, str6, "app_version", "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i3 = 5;
                                                            str3 = str6;
                                                            sQLiteDatabase = W;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i16);
                                                            i16 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i15 = i2 + 1;
                                                            i14 = i3;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            i3 = 5;
                                                            str3 = str6;
                                                            sQLiteDatabase = W;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            zzgu zzguVar4222 = zzicVar4.f;
                                                            zzic.m(zzguVar4222);
                                                            zzguVar4222.g.b(e, "Error reading entries from local database");
                                                            n.e = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i15 = i2 + 1;
                                                            i14 = i3;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        } catch (SQLiteException e8) {
                                                            e = e8;
                                                            i3 = 5;
                                                            str3 = str6;
                                                            sQLiteDatabase = W;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            zzgu zzguVar5222 = zzicVar4.f;
                                                            zzic.m(zzguVar5222);
                                                            zzguVar5222.g.b(e, "Error reading entries from local database");
                                                            n.e = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i15 = i2 + 1;
                                                            i14 = i3;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        }
                                                    } else {
                                                        i4 = 5;
                                                    }
                                                    try {
                                                        Cursor query = W.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i12));
                                                        while (query.moveToNext()) {
                                                            try {
                                                                try {
                                                                    try {
                                                                        j5 = query.getLong(0);
                                                                        try {
                                                                            int i19 = query.getInt(1);
                                                                            str2 = str7;
                                                                            try {
                                                                                byte[] blob = query.getBlob(2);
                                                                                str3 = str6;
                                                                                try {
                                                                                    if (zzicVar4.d.b0(null, zzfxVar3)) {
                                                                                        try {
                                                                                            str5 = query.getString(i18);
                                                                                            cursor4 = query;
                                                                                            zzfxVar = zzfxVar3;
                                                                                            j2 = query.getLong(i17);
                                                                                        } catch (SQLiteDatabaseLockedException unused5) {
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = W;
                                                                                            i3 = 5;
                                                                                            SystemClock.sleep(i16);
                                                                                            i16 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i15 = i2 + 1;
                                                                                            i14 = i3;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteFullException e9) {
                                                                                            e = e9;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = W;
                                                                                            i3 = 5;
                                                                                            zzgu zzguVar42222 = zzicVar4.f;
                                                                                            zzic.m(zzguVar42222);
                                                                                            zzguVar42222.g.b(e, "Error reading entries from local database");
                                                                                            n.e = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i15 = i2 + 1;
                                                                                            i14 = i3;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteException e10) {
                                                                                            e = e10;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = W;
                                                                                            i3 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            zzgu zzguVar52222 = zzicVar4.f;
                                                                                            zzic.m(zzguVar52222);
                                                                                            zzguVar52222.g.b(e, "Error reading entries from local database");
                                                                                            n.e = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i15 = i2 + 1;
                                                                                            i14 = i3;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        }
                                                                                    } else {
                                                                                        cursor4 = query;
                                                                                        zzfxVar = zzfxVar3;
                                                                                        j2 = 0;
                                                                                        str5 = null;
                                                                                    }
                                                                                    if (i19 == 0) {
                                                                                        cursor2 = cursor4;
                                                                                        try {
                                                                                            try {
                                                                                                obtain = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        zzbh createFromParcel = zzbh.CREATOR.createFromParcel(obtain);
                                                                                                        if (createFromParcel != null) {
                                                                                                            arrayList.add(new zzgk(createFromParcel, str5, j2));
                                                                                                        }
                                                                                                    } catch (SafeParcelReader.ParseException unused6) {
                                                                                                        zzgu zzguVar6 = zzicVar4.f;
                                                                                                        zzic.m(zzguVar6);
                                                                                                        zzguVar6.g.a("Failed to load event from local database");
                                                                                                        obtain.recycle();
                                                                                                    }
                                                                                                } finally {
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                sQLiteDatabase = W;
                                                                                                cursor = cursor2;
                                                                                                if (cursor != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase != null) {
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused7) {
                                                                                            sQLiteDatabase = W;
                                                                                            i3 = 5;
                                                                                            SystemClock.sleep(i16);
                                                                                            i16 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i15 = i2 + 1;
                                                                                            i14 = i3;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteFullException e11) {
                                                                                            e = e11;
                                                                                            sQLiteDatabase = W;
                                                                                            i3 = 5;
                                                                                            zzgu zzguVar422222 = zzicVar4.f;
                                                                                            zzic.m(zzguVar422222);
                                                                                            zzguVar422222.g.b(e, "Error reading entries from local database");
                                                                                            n.e = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i15 = i2 + 1;
                                                                                            i14 = i3;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteException e12) {
                                                                                            e = e12;
                                                                                            sQLiteDatabase = W;
                                                                                            i3 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.endTransaction();
                                                                                            }
                                                                                            zzgu zzguVar522222 = zzicVar4.f;
                                                                                            zzic.m(zzguVar522222);
                                                                                            zzguVar522222.g.b(e, "Error reading entries from local database");
                                                                                            n.e = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i15 = i2 + 1;
                                                                                            i14 = i3;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        }
                                                                                    } else {
                                                                                        cursor2 = cursor4;
                                                                                        if (i19 == 1) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                                                                } finally {
                                                                                                }
                                                                                            } catch (SafeParcelReader.ParseException unused8) {
                                                                                                zzgu zzguVar7 = zzicVar4.f;
                                                                                                zzic.m(zzguVar7);
                                                                                                zzguVar7.g.a("Failed to load user property from local database");
                                                                                                obtain.recycle();
                                                                                                zzplVar = null;
                                                                                            }
                                                                                            if (zzplVar != null) {
                                                                                                arrayList.add(new zzgk(zzplVar, str5, j2));
                                                                                            }
                                                                                        } else if (i19 == 2) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                                                } catch (SafeParcelReader.ParseException unused9) {
                                                                                                    zzgu zzguVar8 = zzicVar4.f;
                                                                                                    zzic.m(zzguVar8);
                                                                                                    zzguVar8.g.a("Failed to load conditional user property from local database");
                                                                                                    obtain.recycle();
                                                                                                    zzahVar = null;
                                                                                                }
                                                                                                if (zzahVar != null) {
                                                                                                    arrayList.add(new zzgk(zzahVar, str5, j2));
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } else {
                                                                                            if (i19 == 4) {
                                                                                                try {
                                                                                                    obtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                                obtain.setDataPosition(0);
                                                                                                                zzbfVar = zzbf.CREATOR.createFromParcel(obtain);
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SafeParcelReader.ParseException unused10) {
                                                                                                            zzgu zzguVar9 = zzicVar4.f;
                                                                                                            zzic.m(zzguVar9);
                                                                                                            zzguVar9.g.a("Failed to load default event parameters from local database");
                                                                                                            obtain.recycle();
                                                                                                            zzbfVar = null;
                                                                                                            if (zzbfVar != null) {
                                                                                                            }
                                                                                                            i5 = 3;
                                                                                                            i18 = i5;
                                                                                                            str7 = str2;
                                                                                                            str6 = str3;
                                                                                                            zzfxVar3 = zzfxVar;
                                                                                                            query = cursor2;
                                                                                                            i17 = 4;
                                                                                                        }
                                                                                                    } catch (SafeParcelReader.ParseException unused11) {
                                                                                                    } catch (Throwable th7) {
                                                                                                        th = th7;
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused12) {
                                                                                                    sQLiteDatabase = W;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i16);
                                                                                                    i16 += 20;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i15 = i2 + 1;
                                                                                                    i14 = i3;
                                                                                                    str7 = str2;
                                                                                                    str6 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteFullException e13) {
                                                                                                    e = e13;
                                                                                                    sQLiteDatabase = W;
                                                                                                    i3 = 5;
                                                                                                    zzgu zzguVar4222222 = zzicVar4.f;
                                                                                                    zzic.m(zzguVar4222222);
                                                                                                    zzguVar4222222.g.b(e, "Error reading entries from local database");
                                                                                                    n.e = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i15 = i2 + 1;
                                                                                                    i14 = i3;
                                                                                                    str7 = str2;
                                                                                                    str6 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteException e14) {
                                                                                                    e = e14;
                                                                                                    sQLiteDatabase = W;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabase != null) {
                                                                                                    }
                                                                                                    zzgu zzguVar5222222 = zzicVar4.f;
                                                                                                    zzic.m(zzguVar5222222);
                                                                                                    zzguVar5222222.g.b(e, "Error reading entries from local database");
                                                                                                    n.e = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i15 = i2 + 1;
                                                                                                    i14 = i3;
                                                                                                    str7 = str2;
                                                                                                    str6 = str3;
                                                                                                    str8 = str;
                                                                                                }
                                                                                                try {
                                                                                                    if (zzbfVar != null) {
                                                                                                        arrayList.add(new zzgk(zzbfVar, str5, j2));
                                                                                                    }
                                                                                                    i5 = 3;
                                                                                                } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                    sQLiteDatabase = W;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i16);
                                                                                                    i16 += 20;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i15 = i2 + 1;
                                                                                                    i14 = i3;
                                                                                                    str7 = str2;
                                                                                                    str6 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteFullException e15) {
                                                                                                    e = e15;
                                                                                                    sQLiteDatabase = W;
                                                                                                    i3 = 5;
                                                                                                    zzgu zzguVar42222222 = zzicVar4.f;
                                                                                                    zzic.m(zzguVar42222222);
                                                                                                    zzguVar42222222.g.b(e, "Error reading entries from local database");
                                                                                                    n.e = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i15 = i2 + 1;
                                                                                                    i14 = i3;
                                                                                                    str7 = str2;
                                                                                                    str6 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteException e16) {
                                                                                                    e = e16;
                                                                                                    sQLiteDatabase = W;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabase != null) {
                                                                                                    }
                                                                                                    zzgu zzguVar52222222 = zzicVar4.f;
                                                                                                    zzic.m(zzguVar52222222);
                                                                                                    zzguVar52222222.g.b(e, "Error reading entries from local database");
                                                                                                    n.e = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i15 = i2 + 1;
                                                                                                    i14 = i3;
                                                                                                    str7 = str2;
                                                                                                    str6 = str3;
                                                                                                    str8 = str;
                                                                                                }
                                                                                            } else {
                                                                                                zzgu zzguVar10 = zzicVar4.f;
                                                                                                i5 = 3;
                                                                                                if (i19 == 3) {
                                                                                                    zzic.m(zzguVar10);
                                                                                                    zzguVar10.o.a("Skipping app launch break");
                                                                                                } else {
                                                                                                    zzic.m(zzguVar10);
                                                                                                    zzguVar10.g.a("Unknown record type in local database");
                                                                                                }
                                                                                            }
                                                                                            i18 = i5;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            zzfxVar3 = zzfxVar;
                                                                                            query = cursor2;
                                                                                            i17 = 4;
                                                                                        }
                                                                                    }
                                                                                    i5 = 3;
                                                                                    i18 = i5;
                                                                                    str7 = str2;
                                                                                    str6 = str3;
                                                                                    zzfxVar3 = zzfxVar;
                                                                                    query = cursor2;
                                                                                    i17 = 4;
                                                                                } catch (SQLiteDatabaseLockedException unused14) {
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteFullException e17) {
                                                                                    e = e17;
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteException e18) {
                                                                                    e = e18;
                                                                                    cursor2 = query;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                cursor2 = query;
                                                                                str3 = str6;
                                                                                sQLiteDatabase = W;
                                                                                i3 = 5;
                                                                                SystemClock.sleep(i16);
                                                                                i16 += 20;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i15 = i2 + 1;
                                                                                i14 = i3;
                                                                                str7 = str2;
                                                                                str6 = str3;
                                                                                str8 = str;
                                                                            } catch (SQLiteFullException e19) {
                                                                                e = e19;
                                                                                cursor2 = query;
                                                                                str3 = str6;
                                                                                sQLiteDatabase = W;
                                                                                i3 = 5;
                                                                                zzgu zzguVar422222222 = zzicVar4.f;
                                                                                zzic.m(zzguVar422222222);
                                                                                zzguVar422222222.g.b(e, "Error reading entries from local database");
                                                                                n.e = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i15 = i2 + 1;
                                                                                i14 = i3;
                                                                                str7 = str2;
                                                                                str6 = str3;
                                                                                str8 = str;
                                                                            } catch (SQLiteException e20) {
                                                                                e = e20;
                                                                                cursor2 = query;
                                                                                str3 = str6;
                                                                                sQLiteDatabase = W;
                                                                                i3 = 5;
                                                                                if (sQLiteDatabase != null) {
                                                                                }
                                                                                zzgu zzguVar522222222 = zzicVar4.f;
                                                                                zzic.m(zzguVar522222222);
                                                                                zzguVar522222222.g.b(e, "Error reading entries from local database");
                                                                                n.e = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i15 = i2 + 1;
                                                                                i14 = i3;
                                                                                str7 = str2;
                                                                                str6 = str3;
                                                                                str8 = str;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused16) {
                                                                            cursor2 = query;
                                                                            str2 = str7;
                                                                        } catch (SQLiteFullException e21) {
                                                                            e = e21;
                                                                            cursor2 = query;
                                                                            str2 = str7;
                                                                        } catch (SQLiteException e22) {
                                                                            e = e22;
                                                                            cursor2 = query;
                                                                            str2 = str7;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused17) {
                                                                        cursor2 = query;
                                                                        str2 = str7;
                                                                        str3 = str6;
                                                                    } catch (SQLiteFullException e23) {
                                                                        e = e23;
                                                                        cursor2 = query;
                                                                        str2 = str7;
                                                                        str3 = str6;
                                                                    } catch (SQLiteException e24) {
                                                                        e = e24;
                                                                        cursor2 = query;
                                                                        str2 = str7;
                                                                        str3 = str6;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    cursor2 = query;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused18) {
                                                                cursor2 = query;
                                                                str2 = str7;
                                                                str3 = str6;
                                                            } catch (SQLiteFullException e25) {
                                                                e = e25;
                                                                cursor2 = query;
                                                                str2 = str7;
                                                                str3 = str6;
                                                            } catch (SQLiteException e26) {
                                                                e = e26;
                                                                cursor2 = query;
                                                                str2 = str7;
                                                                str3 = str6;
                                                            }
                                                        }
                                                        cursor2 = query;
                                                        str2 = str7;
                                                        str3 = str6;
                                                        i = 0;
                                                        sQLiteDatabase = W;
                                                    } catch (SQLiteDatabaseLockedException unused19) {
                                                        str3 = str6;
                                                        sQLiteDatabase = W;
                                                        str2 = str7;
                                                        i3 = i4;
                                                        cursor2 = null;
                                                        SystemClock.sleep(i16);
                                                        i16 += 20;
                                                        if (cursor2 != null) {
                                                            cursor2.close();
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                            i15 = i2 + 1;
                                                            i14 = i3;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        }
                                                        sQLiteDatabase.close();
                                                        i15 = i2 + 1;
                                                        i14 = i3;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused20) {
                                                    str3 = str6;
                                                    sQLiteDatabase = W;
                                                    str2 = str7;
                                                    i3 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i16);
                                                    i16 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                }
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList.size()) {
                                                        zzgu zzguVar11 = zzicVar4.f;
                                                        zzic.m(zzguVar11);
                                                        zzguVar11.g.a("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursor2.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    i3 = 5;
                                                    SystemClock.sleep(i16);
                                                    i16 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteFullException e27) {
                                                    e = e27;
                                                    i3 = 5;
                                                    zzgu zzguVar4222222222 = zzicVar4.f;
                                                    zzic.m(zzguVar4222222222);
                                                    zzguVar4222222222.g.b(e, "Error reading entries from local database");
                                                    n.e = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteException e28) {
                                                    e = e28;
                                                    i3 = 5;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    zzgu zzguVar5222222222 = zzicVar4.f;
                                                    zzic.m(zzguVar5222222222);
                                                    zzguVar5222222222.g.b(e, "Error reading entries from local database");
                                                    n.e = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i15 = i2 + 1;
                                                    i14 = i3;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                }
                                            } catch (SQLiteFullException e29) {
                                                e = e29;
                                                str3 = str6;
                                                sQLiteDatabase = W;
                                                str2 = str7;
                                                i3 = 5;
                                                cursor2 = null;
                                                zzgu zzguVar42222222222 = zzicVar4.f;
                                                zzic.m(zzguVar42222222222);
                                                zzguVar42222222222.g.b(e, "Error reading entries from local database");
                                                n.e = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i15 = i2 + 1;
                                                i14 = i3;
                                                str7 = str2;
                                                str6 = str3;
                                                str8 = str;
                                            } catch (SQLiteException e30) {
                                                e = e30;
                                                str3 = str6;
                                                sQLiteDatabase = W;
                                                str2 = str7;
                                                i3 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                zzgu zzguVar52222222222 = zzicVar4.f;
                                                zzic.m(zzguVar52222222222);
                                                zzguVar52222222222.g.b(e, "Error reading entries from local database");
                                                n.e = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i15 = i2 + 1;
                                                i14 = i3;
                                                str7 = str2;
                                                str6 = str3;
                                                str8 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused22) {
                                            str = str8;
                                        } catch (SQLiteFullException e31) {
                                            e = e31;
                                            str = str8;
                                        } catch (SQLiteException e32) {
                                            e = e32;
                                            str = str8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i2 = i15;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    i2 = i15;
                                    str = str8;
                                    str3 = str6;
                                    sQLiteDatabase = W;
                                    i3 = 5;
                                    str2 = str7;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused23) {
                            i2 = i15;
                            str = str8;
                            str2 = str7;
                            str3 = str6;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e33) {
                            e = e33;
                            i2 = i15;
                            str = str8;
                            str2 = str7;
                            str3 = str6;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e34) {
                            e = e34;
                            i2 = i15;
                            str = str8;
                            str2 = str7;
                            str3 = str6;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLiteDatabase = null;
                        }
                    }
                    i = 0;
                    zzgu zzguVar12 = zzicVar4.f;
                    zzic.m(zzguVar12);
                    zzguVar12.j.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    context = context3;
                    zzguVar = zzguVar3;
                    i = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i6 = arrayList.size();
                } else {
                    i6 = i;
                }
                if (abstractSafeParcelable != null && i6 < i12) {
                    arrayList2.add(new zzgk(abstractSafeParcelable, zzrVar2.c, zzrVar2.j));
                }
                size = arrayList2.size();
                i7 = i;
                while (i7 < size) {
                    zzgk zzgkVar = (zzgk) arrayList2.get(i7);
                    AbstractSafeParcelable abstractSafeParcelable2 = zzgkVar.a;
                    zzfx zzfxVar4 = zzfy.W0;
                    if (zzalVar2.b0(null, zzfxVar4)) {
                        String str9 = zzgkVar.b;
                        if (!TextUtils.isEmpty(str9)) {
                            zzfxVar2 = zzfxVar4;
                            i8 = i6;
                            zzrVar2 = new zzr(zzrVar2.a, zzrVar2.b, str9, zzgkVar.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.g, zzrVar2.h, zzrVar2.i, zzrVar2.k, zzrVar2.l, zzrVar2.m, zzrVar2.n, zzrVar2.o, zzrVar2.p, zzrVar2.q, zzrVar2.r, zzrVar2.s, zzrVar2.t, zzrVar2.u, zzrVar2.v, zzrVar2.w, zzrVar2.x, zzrVar2.y, zzrVar2.z, zzrVar2.A, zzrVar2.B, zzrVar2.C, zzrVar2.D, zzrVar2.E, zzrVar2.F);
                            if (abstractSafeParcelable2 instanceof zzbh) {
                                zzicVar2 = zzicVar;
                                context2 = context;
                                zzguVar2 = zzguVar;
                                if (abstractSafeParcelable2 instanceof zzpl) {
                                    try {
                                        zzgbVar.j1((zzpl) abstractSafeParcelable2, zzrVar2);
                                    } catch (RemoteException e35) {
                                        zzic.m(zzguVar2);
                                        zzguVar2.g.b(e35, "Failed to send user property to the service");
                                    }
                                } else if (abstractSafeParcelable2 instanceof zzah) {
                                    try {
                                        zzgbVar.P((zzah) abstractSafeParcelable2, zzrVar2);
                                    } catch (RemoteException e36) {
                                        zzic.m(zzguVar2);
                                        zzguVar2.g.b(e36, "Failed to send conditional user property to the service");
                                    }
                                } else {
                                    if (zzalVar2.b0(null, zzfxVar2) && (abstractSafeParcelable2 instanceof zzbf)) {
                                        try {
                                            zzgbVar.x3(((zzbf) abstractSafeParcelable2).b1(), zzrVar2);
                                        } catch (RemoteException e37) {
                                            zzic.m(zzguVar2);
                                            zzguVar2.g.b(e37, "Failed to send default event parameters to the service");
                                        }
                                    } else {
                                        zzic.m(zzguVar2);
                                        zzguVar2.g.a("Discarding data. Unrecognized parcel type.");
                                    }
                                    i7++;
                                    zzguVar = zzguVar2;
                                    zzicVar = zzicVar2;
                                    context = context2;
                                    i6 = i8;
                                }
                            } else {
                                try {
                                    defaultClock2.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    try {
                                        defaultClock2.getClass();
                                        j3 = SystemClock.elapsedRealtime();
                                        try {
                                            try {
                                                zzgbVar.o4((zzbh) abstractSafeParcelable2, zzrVar2);
                                                zzic.m(zzguVar);
                                                zzguVar2 = zzguVar;
                                                try {
                                                    zzguVar2.o.a("Logging telemetry for logEvent from database");
                                                    zzgq zzgqVar = zzgq.d;
                                                    if (zzgqVar == null) {
                                                        zzicVar2 = zzicVar;
                                                        context2 = context;
                                                        try {
                                                            zzgqVar = new zzgq(context2, zzicVar2);
                                                            zzgq.d = zzgqVar;
                                                        } catch (RemoteException e38) {
                                                            e = e38;
                                                            j4 = currentTimeMillis;
                                                            zzic.m(zzguVar2);
                                                            zzguVar2.g.b(e, "Failed to send event to the service");
                                                            if (j4 != 0) {
                                                                zzgq zzgqVar2 = zzgq.d;
                                                                if (zzgqVar2 == null) {
                                                                    zzgqVar2 = new zzgq(context2, zzicVar2);
                                                                    zzgq.d = zzgqVar2;
                                                                }
                                                                defaultClock2.getClass();
                                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                                defaultClock2.getClass();
                                                                zzgqVar2.a(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis2);
                                                            }
                                                            i7++;
                                                            zzguVar = zzguVar2;
                                                            zzicVar = zzicVar2;
                                                            context = context2;
                                                            i6 = i8;
                                                        }
                                                    } else {
                                                        zzicVar2 = zzicVar;
                                                        context2 = context;
                                                    }
                                                    zzgq zzgqVar3 = zzgqVar;
                                                    defaultClock2.getClass();
                                                    long currentTimeMillis3 = System.currentTimeMillis();
                                                    defaultClock2.getClass();
                                                    zzgqVar3.a(0, (int) (SystemClock.elapsedRealtime() - j3), currentTimeMillis, currentTimeMillis3);
                                                } catch (RemoteException e39) {
                                                    e = e39;
                                                    zzicVar2 = zzicVar;
                                                    context2 = context;
                                                }
                                            } catch (RemoteException e40) {
                                                e = e40;
                                                zzicVar2 = zzicVar;
                                                context2 = context;
                                                zzguVar2 = zzguVar;
                                                j4 = currentTimeMillis;
                                                zzic.m(zzguVar2);
                                                zzguVar2.g.b(e, "Failed to send event to the service");
                                                if (j4 != 0) {
                                                }
                                                i7++;
                                                zzguVar = zzguVar2;
                                                zzicVar = zzicVar2;
                                                context = context2;
                                                i6 = i8;
                                            }
                                        } catch (RemoteException e41) {
                                            e = e41;
                                        }
                                    } catch (RemoteException e42) {
                                        e = e42;
                                        zzicVar2 = zzicVar;
                                        context2 = context;
                                        zzguVar2 = zzguVar;
                                        j3 = 0;
                                    }
                                } catch (RemoteException e43) {
                                    e = e43;
                                    zzicVar2 = zzicVar;
                                    context2 = context;
                                    zzguVar2 = zzguVar;
                                    j3 = 0;
                                    j4 = 0;
                                }
                            }
                            i7++;
                            zzguVar = zzguVar2;
                            zzicVar = zzicVar2;
                            context = context2;
                            i6 = i8;
                        }
                    }
                    i8 = i6;
                    zzfxVar2 = zzfxVar4;
                    if (abstractSafeParcelable2 instanceof zzbh) {
                    }
                    i7++;
                    zzguVar = zzguVar2;
                    zzicVar = zzicVar2;
                    context = context2;
                    i6 = i8;
                }
                zzguVar3 = zzguVar;
                zzicVar3 = zzicVar;
                context3 = context;
                defaultClock = defaultClock2;
                i9 = 100;
                i10 = i13 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            if (abstractSafeParcelable != null) {
                arrayList2.add(new zzgk(abstractSafeParcelable, zzrVar2.c, zzrVar2.j));
            }
            size = arrayList2.size();
            i7 = i;
            while (i7 < size) {
            }
            zzguVar3 = zzguVar;
            zzicVar3 = zzicVar;
            context3 = context;
            defaultClock = defaultClock2;
            i9 = 100;
            i10 = i13 + 1;
        }
    }

    public final void j0(zzah zzahVar) {
        boolean X;
        Q();
        R();
        zzic zzicVar = (zzic) this.b;
        zzicVar.getClass();
        zzgl n = zzicVar.n();
        zzic zzicVar2 = (zzic) n.b;
        zzic.k(zzicVar2.i);
        byte[] z0 = zzpp.z0(zzahVar);
        if (z0.length > 131072) {
            zzgu zzguVar = zzicVar2.f;
            zzic.m(zzguVar);
            zzguVar.h.a("Conditional user property too long for local database. Sending directly to service");
            X = false;
        } else {
            X = n.X(2, z0);
        }
        e0(new nod(this, g0(true), X, new zzah(zzahVar)));
    }
}
