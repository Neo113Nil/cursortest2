package s7;

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
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y2 extends z {

    /* renamed from: c, reason: collision with root package name */
    public final x2 f23256c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f23257d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f23258e;

    /* renamed from: f, reason: collision with root package name */
    public final u2 f23259f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f23260g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.j f23261h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23262i;
    public final u2 j;

    public y2(f1 f1Var) {
        super(f1Var);
        this.f23262i = new ArrayList();
        this.f23261h = new androidx.recyclerview.widget.j(f1Var.f22749k);
        this.f23256c = new x2(this);
        this.f23259f = new u2(this, f1Var, 0);
        this.j = new u2(this, f1Var, 1);
    }

    public final boolean A() {
        j();
        k();
        return this.f23257d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #57 {all -> 0x0480, blocks: (B:213:0x0470, B:236:0x0444, B:238:0x044a, B:239:0x044d, B:227:0x0491, B:355:0x037b, B:359:0x0385, B:360:0x0396), top: B:212:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #60 {all -> 0x0202, blocks: (B:183:0x01dd, B:186:0x01f1, B:188:0x01f6, B:197:0x021a, B:198:0x021d, B:195:0x0216, B:246:0x0223, B:249:0x0237, B:251:0x024f, B:254:0x0258, B:255:0x025b, B:257:0x0249, B:260:0x025f, B:263:0x0273, B:265:0x028b, B:270:0x0295, B:271:0x0298, B:268:0x0285, B:281:0x029c, B:289:0x02b0, B:291:0x02da, B:299:0x02e4, B:300:0x02e7, B:305:0x02d4, B:276:0x02f4, B:278:0x0301, B:352:0x0366), top: B:182:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0648  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(a0 a0Var, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        ArrayList arrayList;
        f1 f1Var;
        Context context;
        n0 n0Var;
        int i5;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i10;
        String str2;
        String str3;
        int i11;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i12;
        int i13;
        int i14;
        long j6;
        String str5;
        w wVar;
        Parcel obtain;
        zzbe zzbeVar;
        int i15;
        zzah zzahVar;
        zzpl zzplVar;
        int i16;
        int size;
        int i17;
        f1 f1Var2;
        n0 n0Var2;
        int i18;
        String str6;
        long j10;
        long j11;
        Context context2;
        kh.g gVar;
        long currentTimeMillis;
        AbstractSafeParcelable abstractSafeParcelable2 = abstractSafeParcelable;
        j();
        k();
        v();
        f1 f1Var3 = (f1) this.f3328a;
        f1Var3.getClass();
        Context context3 = f1Var3.f22740a;
        n0 n0Var3 = f1Var3.f22745f;
        q6.a aVar = f1Var3.f22749k;
        e eVar = f1Var3.f22743d;
        zzr zzrVar2 = zzrVar;
        int i19 = 100;
        int i20 = 0;
        for (int i21 = 100; i20 < 1001 && i19 == i21; i21 = 100) {
            ArrayList arrayList2 = new ArrayList();
            h0 o3 = f1Var3.o();
            int i22 = i21;
            String str7 = "entry";
            String str8 = "type";
            String str9 = "rowid";
            q6.a aVar2 = aVar;
            f1 f1Var4 = (f1) o3.f3328a;
            o3.j();
            int i23 = i20;
            if (o3.f22789d) {
                f1Var = f1Var3;
                context = context3;
                n0Var = n0Var3;
            } else {
                arrayList = new ArrayList();
                f1Var = f1Var3;
                if (((f1) o3.f3328a).f22740a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i24 = 5;
                    context = context3;
                    n0Var = n0Var3;
                    int i25 = 0;
                    int i26 = 5;
                    while (i25 < i24) {
                        try {
                            SQLiteDatabase p10 = o3.p();
                            if (p10 == null) {
                                try {
                                    try {
                                        o3.f22789d = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = p10;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    str = str9;
                                    i10 = i25;
                                    str3 = str7;
                                    sQLiteDatabase = p10;
                                    i11 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i26);
                                        i26 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i25 = i10 + 1;
                                        i24 = i11;
                                        str8 = str2;
                                        str7 = str3;
                                        str9 = str;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e7) {
                                    e = e7;
                                    str = str9;
                                    i10 = i25;
                                    str3 = str7;
                                    sQLiteDatabase = p10;
                                    i11 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    n0 n0Var4 = f1Var4.f22745f;
                                    f1.m(n0Var4);
                                    n0Var4.f22903f.b(e, "Error reading entries from local database");
                                    o3.f22789d = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i25 = i10 + 1;
                                    i24 = i11;
                                    str8 = str2;
                                    str7 = str3;
                                    str9 = str;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    str = str9;
                                    i10 = i25;
                                    str3 = str7;
                                    sQLiteDatabase = p10;
                                    i11 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    n0 n0Var5 = f1Var4.f22745f;
                                    f1.m(n0Var5);
                                    n0Var5.f22903f.b(e, "Error reading entries from local database");
                                    o3.f22789d = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i25 = i10 + 1;
                                    i24 = i11;
                                    str8 = str2;
                                    str7 = str3;
                                    str9 = str;
                                }
                            } else {
                                p10.beginTransaction();
                                try {
                                    cursor3 = p10.query("messages", new String[]{str9}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j12 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i10 = i25;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = p10;
                                                    i11 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i26);
                                                    i26 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteFullException e10) {
                                                    e = e10;
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = p10;
                                                    i11 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    n0 n0Var42 = f1Var4.f22745f;
                                                    f1.m(n0Var42);
                                                    n0Var42.f22903f.b(e, "Error reading entries from local database");
                                                    o3.f22789d = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteException e11) {
                                                    e = e11;
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = p10;
                                                    i11 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    n0 n0Var52 = f1Var4.f22745f;
                                                    f1.m(n0Var52);
                                                    n0Var52.f22903f.b(e, "Error reading entries from local database");
                                                    o3.f22789d = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                str = str9;
                                                str3 = str7;
                                                sQLiteDatabase = p10;
                                                i11 = 5;
                                                str2 = str8;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i26);
                                                        i26 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i25 = i10 + 1;
                                                        i24 = i11;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (SQLiteFullException e12) {
                                                        e = e12;
                                                        cursor2 = null;
                                                        n0 n0Var422 = f1Var4.f22745f;
                                                        f1.m(n0Var422);
                                                        n0Var422.f22903f.b(e, "Error reading entries from local database");
                                                        o3.f22789d = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i25 = i10 + 1;
                                                        i24 = i11;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        n0 n0Var522 = f1Var4.f22745f;
                                                        f1.m(n0Var522);
                                                        n0Var522.f22903f.b(e, "Error reading entries from local database");
                                                        o3.f22789d = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i25 = i10 + 1;
                                                        i24 = i11;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (Throwable th5) {
                                                        th = th5;
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
                                            i10 = i25;
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
                                            String[] strArr2 = {str9, str8, str7};
                                            e eVar2 = f1Var4.f22743d;
                                            w wVar2 = x.f23181c1;
                                            str = str9;
                                            try {
                                                try {
                                                    i12 = 4;
                                                    i13 = 3;
                                                    if (eVar2.t(null, wVar2)) {
                                                        i14 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str8, str7, "app_version", "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i11 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = p10;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i26);
                                                            i26 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i25 = i10 + 1;
                                                            i24 = i11;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                            i11 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = p10;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            n0 n0Var4222 = f1Var4.f22745f;
                                                            f1.m(n0Var4222);
                                                            n0Var4222.f22903f.b(e, "Error reading entries from local database");
                                                            o3.f22789d = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i25 = i10 + 1;
                                                            i24 = i11;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            i11 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = p10;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            n0 n0Var5222 = f1Var4.f22745f;
                                                            f1.m(n0Var5222);
                                                            n0Var5222.f22903f.b(e, "Error reading entries from local database");
                                                            o3.f22789d = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i25 = i10 + 1;
                                                            i24 = i11;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        }
                                                    } else {
                                                        i14 = 5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused5) {
                                                    str3 = str7;
                                                    sQLiteDatabase = p10;
                                                    str2 = str8;
                                                    i11 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i26);
                                                    i26 += 20;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i25 = i10 + 1;
                                                        i24 = i11;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                                try {
                                                    Cursor query = p10.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i22));
                                                    while (query.moveToNext()) {
                                                        try {
                                                            try {
                                                                try {
                                                                    j12 = query.getLong(0);
                                                                    try {
                                                                        int i27 = query.getInt(1);
                                                                        str2 = str8;
                                                                        try {
                                                                            byte[] blob = query.getBlob(2);
                                                                            str3 = str7;
                                                                            try {
                                                                                if (f1Var4.f22743d.t(null, wVar2)) {
                                                                                    try {
                                                                                        str5 = query.getString(i13);
                                                                                        cursor2 = query;
                                                                                        j6 = query.getLong(i12);
                                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                                        cursor2 = query;
                                                                                        sQLiteDatabase = p10;
                                                                                        i11 = 5;
                                                                                        SystemClock.sleep(i26);
                                                                                        i26 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i25 = i10 + 1;
                                                                                        i24 = i11;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteFullException e16) {
                                                                                        e = e16;
                                                                                        cursor2 = query;
                                                                                        sQLiteDatabase = p10;
                                                                                        i11 = 5;
                                                                                        n0 n0Var42222 = f1Var4.f22745f;
                                                                                        f1.m(n0Var42222);
                                                                                        n0Var42222.f22903f.b(e, "Error reading entries from local database");
                                                                                        o3.f22789d = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i25 = i10 + 1;
                                                                                        i24 = i11;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteException e17) {
                                                                                        e = e17;
                                                                                        cursor2 = query;
                                                                                        sQLiteDatabase = p10;
                                                                                        i11 = 5;
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        n0 n0Var52222 = f1Var4.f22745f;
                                                                                        f1.m(n0Var52222);
                                                                                        n0Var52222.f22903f.b(e, "Error reading entries from local database");
                                                                                        o3.f22789d = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i25 = i10 + 1;
                                                                                        i24 = i11;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    }
                                                                                } else {
                                                                                    cursor2 = query;
                                                                                    j6 = 0;
                                                                                    str5 = null;
                                                                                }
                                                                                if (i27 == 0) {
                                                                                    wVar = wVar2;
                                                                                    try {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    zzbg createFromParcel = zzbg.CREATOR.createFromParcel(obtain);
                                                                                                    if (createFromParcel != null) {
                                                                                                        arrayList.add(new g0(createFromParcel, str5, j6));
                                                                                                    }
                                                                                                } catch (h6.a unused7) {
                                                                                                    n0 n0Var6 = f1Var4.f22745f;
                                                                                                    f1.m(n0Var6);
                                                                                                    n0Var6.f22903f.a("Failed to load event from local database");
                                                                                                    obtain.recycle();
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            sQLiteDatabase = p10;
                                                                                            cursor = cursor2;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused8) {
                                                                                        sQLiteDatabase = p10;
                                                                                        i11 = 5;
                                                                                        SystemClock.sleep(i26);
                                                                                        i26 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i25 = i10 + 1;
                                                                                        i24 = i11;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteFullException e18) {
                                                                                        e = e18;
                                                                                        sQLiteDatabase = p10;
                                                                                        i11 = 5;
                                                                                        n0 n0Var422222 = f1Var4.f22745f;
                                                                                        f1.m(n0Var422222);
                                                                                        n0Var422222.f22903f.b(e, "Error reading entries from local database");
                                                                                        o3.f22789d = true;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i25 = i10 + 1;
                                                                                        i24 = i11;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteException e19) {
                                                                                        e = e19;
                                                                                        sQLiteDatabase = p10;
                                                                                        i11 = 5;
                                                                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                                                            sQLiteDatabase.endTransaction();
                                                                                        }
                                                                                        n0 n0Var522222 = f1Var4.f22745f;
                                                                                        f1.m(n0Var522222);
                                                                                        n0Var522222.f22903f.b(e, "Error reading entries from local database");
                                                                                        o3.f22789d = true;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i25 = i10 + 1;
                                                                                        i24 = i11;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    }
                                                                                } else {
                                                                                    wVar = wVar2;
                                                                                    if (i27 == 1) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (h6.a unused9) {
                                                                                            n0 n0Var7 = f1Var4.f22745f;
                                                                                            f1.m(n0Var7);
                                                                                            n0Var7.f22903f.a("Failed to load user property from local database");
                                                                                            obtain.recycle();
                                                                                            zzplVar = null;
                                                                                        }
                                                                                        if (zzplVar != null) {
                                                                                            arrayList.add(new g0(zzplVar, str5, j6));
                                                                                        }
                                                                                    } else if (i27 == 2) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                                            } catch (h6.a unused10) {
                                                                                                n0 n0Var8 = f1Var4.f22745f;
                                                                                                f1.m(n0Var8);
                                                                                                n0Var8.f22903f.a("Failed to load conditional user property from local database");
                                                                                                obtain.recycle();
                                                                                                zzahVar = null;
                                                                                            }
                                                                                            if (zzahVar != null) {
                                                                                                arrayList.add(new g0(zzahVar, str5, j6));
                                                                                            }
                                                                                        } finally {
                                                                                        }
                                                                                    } else if (i27 == 4) {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        zzbeVar = zzbe.CREATOR.createFromParcel(obtain);
                                                                                                    } catch (Throwable th7) {
                                                                                                        th = th7;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (h6.a unused11) {
                                                                                                    n0 n0Var9 = f1Var4.f22745f;
                                                                                                    f1.m(n0Var9);
                                                                                                    n0Var9.f22903f.a("Failed to load default event parameters from local database");
                                                                                                    obtain.recycle();
                                                                                                    zzbeVar = null;
                                                                                                    if (zzbeVar != null) {
                                                                                                    }
                                                                                                    i15 = 3;
                                                                                                    i13 = i15;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    query = cursor2;
                                                                                                    wVar2 = wVar;
                                                                                                    i12 = 4;
                                                                                                }
                                                                                            } catch (h6.a unused12) {
                                                                                            } catch (Throwable th8) {
                                                                                                th = th8;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused13) {
                                                                                            sQLiteDatabase = p10;
                                                                                            i11 = 5;
                                                                                            SystemClock.sleep(i26);
                                                                                            i26 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteFullException e20) {
                                                                                            e = e20;
                                                                                            sQLiteDatabase = p10;
                                                                                            i11 = 5;
                                                                                            n0 n0Var4222222 = f1Var4.f22745f;
                                                                                            f1.m(n0Var4222222);
                                                                                            n0Var4222222.f22903f.b(e, "Error reading entries from local database");
                                                                                            o3.f22789d = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteException e21) {
                                                                                            e = e21;
                                                                                            sQLiteDatabase = p10;
                                                                                            i11 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            n0 n0Var5222222 = f1Var4.f22745f;
                                                                                            f1.m(n0Var5222222);
                                                                                            n0Var5222222.f22903f.b(e, "Error reading entries from local database");
                                                                                            o3.f22789d = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                        try {
                                                                                            if (zzbeVar != null) {
                                                                                                arrayList.add(new g0(zzbeVar, str5, j6));
                                                                                            }
                                                                                            i15 = 3;
                                                                                            i13 = i15;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            query = cursor2;
                                                                                            wVar2 = wVar;
                                                                                            i12 = 4;
                                                                                        } catch (SQLiteDatabaseLockedException unused14) {
                                                                                            sQLiteDatabase = p10;
                                                                                            i11 = 5;
                                                                                            SystemClock.sleep(i26);
                                                                                            i26 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteFullException e22) {
                                                                                            e = e22;
                                                                                            sQLiteDatabase = p10;
                                                                                            i11 = 5;
                                                                                            n0 n0Var42222222 = f1Var4.f22745f;
                                                                                            f1.m(n0Var42222222);
                                                                                            n0Var42222222.f22903f.b(e, "Error reading entries from local database");
                                                                                            o3.f22789d = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteException e23) {
                                                                                            e = e23;
                                                                                            sQLiteDatabase = p10;
                                                                                            i11 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            n0 n0Var52222222 = f1Var4.f22745f;
                                                                                            f1.m(n0Var52222222);
                                                                                            n0Var52222222.f22903f.b(e, "Error reading entries from local database");
                                                                                            o3.f22789d = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i25 = i10 + 1;
                                                                                            i24 = i11;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                    } else {
                                                                                        i15 = 3;
                                                                                        if (i27 == 3) {
                                                                                            n0 n0Var10 = f1Var4.f22745f;
                                                                                            f1.m(n0Var10);
                                                                                            n0Var10.f22910n.a("Skipping app launch break");
                                                                                        } else {
                                                                                            n0 n0Var11 = f1Var4.f22745f;
                                                                                            f1.m(n0Var11);
                                                                                            n0Var11.f22903f.a("Unknown record type in local database");
                                                                                        }
                                                                                        i13 = i15;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        query = cursor2;
                                                                                        wVar2 = wVar;
                                                                                        i12 = 4;
                                                                                    }
                                                                                }
                                                                                i15 = 3;
                                                                                i13 = i15;
                                                                                str8 = str2;
                                                                                str7 = str3;
                                                                                query = cursor2;
                                                                                wVar2 = wVar;
                                                                                i12 = 4;
                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                cursor2 = query;
                                                                            } catch (SQLiteFullException e24) {
                                                                                e = e24;
                                                                                cursor2 = query;
                                                                            } catch (SQLiteException e25) {
                                                                                e = e25;
                                                                                cursor2 = query;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused16) {
                                                                            cursor2 = query;
                                                                            str3 = str7;
                                                                            sQLiteDatabase = p10;
                                                                            i11 = 5;
                                                                            SystemClock.sleep(i26);
                                                                            i26 += 20;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i25 = i10 + 1;
                                                                            i24 = i11;
                                                                            str8 = str2;
                                                                            str7 = str3;
                                                                            str9 = str;
                                                                        } catch (SQLiteFullException e26) {
                                                                            e = e26;
                                                                            cursor2 = query;
                                                                            str3 = str7;
                                                                            sQLiteDatabase = p10;
                                                                            i11 = 5;
                                                                            n0 n0Var422222222 = f1Var4.f22745f;
                                                                            f1.m(n0Var422222222);
                                                                            n0Var422222222.f22903f.b(e, "Error reading entries from local database");
                                                                            o3.f22789d = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i25 = i10 + 1;
                                                                            i24 = i11;
                                                                            str8 = str2;
                                                                            str7 = str3;
                                                                            str9 = str;
                                                                        } catch (SQLiteException e27) {
                                                                            e = e27;
                                                                            cursor2 = query;
                                                                            str3 = str7;
                                                                            sQLiteDatabase = p10;
                                                                            i11 = 5;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            n0 n0Var522222222 = f1Var4.f22745f;
                                                                            f1.m(n0Var522222222);
                                                                            n0Var522222222.f22903f.b(e, "Error reading entries from local database");
                                                                            o3.f22789d = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i25 = i10 + 1;
                                                                            i24 = i11;
                                                                            str8 = str2;
                                                                            str7 = str3;
                                                                            str9 = str;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused17) {
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                    } catch (SQLiteFullException e28) {
                                                                        e = e28;
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                    } catch (SQLiteException e29) {
                                                                        e = e29;
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursor2 = query;
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                } catch (SQLiteFullException e30) {
                                                                    e = e30;
                                                                    cursor2 = query;
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                } catch (SQLiteException e31) {
                                                                    e = e31;
                                                                    cursor2 = query;
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                cursor2 = query;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused19) {
                                                            cursor2 = query;
                                                            str2 = str8;
                                                            str3 = str7;
                                                        } catch (SQLiteFullException e32) {
                                                            e = e32;
                                                            cursor2 = query;
                                                            str2 = str8;
                                                            str3 = str7;
                                                        } catch (SQLiteException e33) {
                                                            e = e33;
                                                            cursor2 = query;
                                                            str2 = str8;
                                                            str3 = str7;
                                                        }
                                                    }
                                                    cursor2 = query;
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i5 = 0;
                                                    sQLiteDatabase = p10;
                                                } catch (SQLiteDatabaseLockedException unused20) {
                                                    str3 = str7;
                                                    sQLiteDatabase = p10;
                                                    str2 = str8;
                                                    i11 = i14;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i26);
                                                    i26 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                                        n0 n0Var12 = f1Var4.f22745f;
                                                        f1.m(n0Var12);
                                                        n0Var12.f22903f.a("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursor2.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    i11 = 5;
                                                    SystemClock.sleep(i26);
                                                    i26 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteFullException e34) {
                                                    e = e34;
                                                    i11 = 5;
                                                    n0 n0Var4222222222 = f1Var4.f22745f;
                                                    f1.m(n0Var4222222222);
                                                    n0Var4222222222.f22903f.b(e, "Error reading entries from local database");
                                                    o3.f22789d = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteException e35) {
                                                    e = e35;
                                                    i11 = 5;
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    n0 n0Var5222222222 = f1Var4.f22745f;
                                                    f1.m(n0Var5222222222);
                                                    n0Var5222222222.f22903f.b(e, "Error reading entries from local database");
                                                    o3.f22789d = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i25 = i10 + 1;
                                                    i24 = i11;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                            } catch (SQLiteFullException e36) {
                                                e = e36;
                                                str3 = str7;
                                                sQLiteDatabase = p10;
                                                str2 = str8;
                                                i11 = 5;
                                                cursor2 = null;
                                                n0 n0Var42222222222 = f1Var4.f22745f;
                                                f1.m(n0Var42222222222);
                                                n0Var42222222222.f22903f.b(e, "Error reading entries from local database");
                                                o3.f22789d = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i25 = i10 + 1;
                                                i24 = i11;
                                                str8 = str2;
                                                str7 = str3;
                                                str9 = str;
                                            } catch (SQLiteException e37) {
                                                e = e37;
                                                str3 = str7;
                                                sQLiteDatabase = p10;
                                                str2 = str8;
                                                i11 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                n0 n0Var52222222222 = f1Var4.f22745f;
                                                f1.m(n0Var52222222222);
                                                n0Var52222222222.f22903f.b(e, "Error reading entries from local database");
                                                o3.f22789d = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i25 = i10 + 1;
                                                i24 = i11;
                                                str8 = str2;
                                                str7 = str3;
                                                str9 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused22) {
                                            str = str9;
                                        } catch (SQLiteFullException e38) {
                                            e = e38;
                                            str = str9;
                                        } catch (SQLiteException e39) {
                                            e = e39;
                                            str = str9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        i10 = i25;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    str = str9;
                                    i10 = i25;
                                    str3 = str7;
                                    sQLiteDatabase = p10;
                                    i11 = 5;
                                    str2 = str8;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused23) {
                            str = str9;
                            i10 = i25;
                            str2 = str8;
                            str3 = str7;
                            i11 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e40) {
                            e = e40;
                            str = str9;
                            i10 = i25;
                            str2 = str8;
                            str3 = str7;
                            i11 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e41) {
                            e = e41;
                            str = str9;
                            i10 = i25;
                            str2 = str8;
                            str3 = str7;
                            i11 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th12) {
                            th = th12;
                            sQLiteDatabase = null;
                        }
                    }
                    i5 = 0;
                    n0 n0Var13 = f1Var4.f22745f;
                    f1.m(n0Var13);
                    n0Var13.f22906i.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    context = context3;
                    n0Var = n0Var3;
                    i5 = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i16 = arrayList.size();
                } else {
                    i16 = i5;
                }
                if (abstractSafeParcelable2 != null && i16 < i22) {
                    arrayList2.add(new g0(abstractSafeParcelable2, zzrVar2.f5822c, zzrVar2.j));
                }
                String str10 = null;
                boolean t3 = eVar.t(null, x.P0);
                size = arrayList2.size();
                i17 = i5;
                while (i17 < size) {
                    g0 g0Var = (g0) arrayList2.get(i17);
                    AbstractSafeParcelable abstractSafeParcelable3 = g0Var.f22776a;
                    w wVar3 = x.f23181c1;
                    if (eVar.t(str10, wVar3)) {
                        String str11 = g0Var.f22777b;
                        if (!TextUtils.isEmpty(str11)) {
                            zzrVar2 = new zzr(zzrVar2.f5820a, zzrVar2.f5821b, str11, g0Var.f22778c, zzrVar2.f5823d, zzrVar2.f5824e, zzrVar2.f5825f, zzrVar2.f5826g, zzrVar2.f5827h, zzrVar2.f5828i, zzrVar2.f5829k, zzrVar2.f5830l, zzrVar2.f5831m, zzrVar2.f5832n, zzrVar2.f5833o, zzrVar2.f5834p, zzrVar2.q, zzrVar2.f5835r, zzrVar2.f5836s, zzrVar2.f5837t, zzrVar2.f5838u, zzrVar2.f5839v, zzrVar2.f5840w, zzrVar2.f5841x, zzrVar2.f5842y, zzrVar2.f5843z, zzrVar2.A, zzrVar2.B, zzrVar2.C, zzrVar2.D, zzrVar2.E);
                        }
                    }
                    if (abstractSafeParcelable3 instanceof zzbg) {
                        if (t3) {
                            try {
                                aVar2.getClass();
                                long currentTimeMillis2 = System.currentTimeMillis();
                                try {
                                    aVar2.getClass();
                                    j11 = currentTimeMillis2;
                                    j10 = SystemClock.elapsedRealtime();
                                } catch (RemoteException e42) {
                                    e = e42;
                                    j11 = currentTimeMillis2;
                                    j10 = 0;
                                    f1Var2 = f1Var;
                                    context2 = context;
                                    n0Var2 = n0Var;
                                    i18 = i16;
                                    f1.m(n0Var2);
                                    n0Var2.f22903f.b(e, "Failed to send event to the service");
                                    if (t3) {
                                    }
                                    context = context2;
                                    str6 = null;
                                    i17++;
                                    f1Var = f1Var2;
                                    str10 = str6;
                                    i16 = i18;
                                    n0Var = n0Var2;
                                }
                            } catch (RemoteException e43) {
                                e = e43;
                                j10 = 0;
                                j11 = 0;
                            }
                        } else {
                            j10 = 0;
                            j11 = 0;
                        }
                        try {
                            try {
                                a0Var.q((zzbg) abstractSafeParcelable3, zzrVar2);
                            } catch (RemoteException e44) {
                                e = e44;
                                f1Var2 = f1Var;
                                context2 = context;
                                n0Var2 = n0Var;
                                i18 = i16;
                                f1.m(n0Var2);
                                n0Var2.f22903f.b(e, "Failed to send event to the service");
                                if (t3) {
                                    if (kh.g.f19113e == null) {
                                    }
                                    kh.g gVar2 = kh.g.f19113e;
                                    aVar2.getClass();
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    aVar2.getClass();
                                    gVar2.r(13, (int) (SystemClock.elapsedRealtime() - j10), j11, currentTimeMillis3);
                                }
                                context = context2;
                                str6 = null;
                                i17++;
                                f1Var = f1Var2;
                                str10 = str6;
                                i16 = i18;
                                n0Var = n0Var2;
                            }
                        } catch (RemoteException e45) {
                            e = e45;
                        }
                        if (t3) {
                            f1.m(n0Var);
                            n0Var2 = n0Var;
                            try {
                                n0Var2.f22910n.a("Logging telemetry for logEvent from database");
                                if (kh.g.f19113e == null) {
                                    try {
                                        f1Var2 = f1Var;
                                        context2 = context;
                                        try {
                                            kh.g.f19113e = new kh.g(context2, f1Var2);
                                        } catch (RemoteException e46) {
                                            e = e46;
                                            i18 = i16;
                                            f1.m(n0Var2);
                                            n0Var2.f22903f.b(e, "Failed to send event to the service");
                                            if (t3 && j11 != 0) {
                                                if (kh.g.f19113e == null) {
                                                    kh.g.f19113e = new kh.g(context2, f1Var2);
                                                }
                                                kh.g gVar22 = kh.g.f19113e;
                                                aVar2.getClass();
                                                long currentTimeMillis32 = System.currentTimeMillis();
                                                aVar2.getClass();
                                                gVar22.r(13, (int) (SystemClock.elapsedRealtime() - j10), j11, currentTimeMillis32);
                                            }
                                            context = context2;
                                            str6 = null;
                                            i17++;
                                            f1Var = f1Var2;
                                            str10 = str6;
                                            i16 = i18;
                                            n0Var = n0Var2;
                                        }
                                    } catch (RemoteException e47) {
                                        e = e47;
                                        f1Var2 = f1Var;
                                        context2 = context;
                                        i18 = i16;
                                        f1.m(n0Var2);
                                        n0Var2.f22903f.b(e, "Failed to send event to the service");
                                        if (t3) {
                                        }
                                        context = context2;
                                        str6 = null;
                                        i17++;
                                        f1Var = f1Var2;
                                        str10 = str6;
                                        i16 = i18;
                                        n0Var = n0Var2;
                                    }
                                } else {
                                    f1Var2 = f1Var;
                                    context2 = context;
                                }
                                gVar = kh.g.f19113e;
                                aVar2.getClass();
                                currentTimeMillis = System.currentTimeMillis();
                                aVar2.getClass();
                                i18 = i16;
                            } catch (RemoteException e48) {
                                e = e48;
                                i18 = i16;
                                f1Var2 = f1Var;
                                context2 = context;
                            }
                            try {
                                gVar.r(0, (int) (SystemClock.elapsedRealtime() - j10), j11, currentTimeMillis);
                            } catch (RemoteException e49) {
                                e = e49;
                                f1.m(n0Var2);
                                n0Var2.f22903f.b(e, "Failed to send event to the service");
                                if (t3) {
                                }
                                context = context2;
                                str6 = null;
                                i17++;
                                f1Var = f1Var2;
                                str10 = str6;
                                i16 = i18;
                                n0Var = n0Var2;
                            }
                            context = context2;
                        } else {
                            f1Var2 = f1Var;
                            n0Var2 = n0Var;
                            i18 = i16;
                        }
                    } else {
                        f1Var2 = f1Var;
                        n0Var2 = n0Var;
                        i18 = i16;
                        if (abstractSafeParcelable3 instanceof zzpl) {
                            try {
                                a0Var.x((zzpl) abstractSafeParcelable3, zzrVar2);
                            } catch (RemoteException e50) {
                                f1.m(n0Var2);
                                n0Var2.f22903f.b(e50, "Failed to send user property to the service");
                            }
                        } else if (abstractSafeParcelable3 instanceof zzah) {
                            try {
                                a0Var.h((zzah) abstractSafeParcelable3, zzrVar2);
                            } catch (RemoteException e51) {
                                f1.m(n0Var2);
                                n0Var2.f22903f.b(e51, "Failed to send conditional user property to the service");
                            }
                        } else {
                            str6 = null;
                            if (eVar.t(null, wVar3) && (abstractSafeParcelable3 instanceof zzbe)) {
                                try {
                                    a0Var.A(((zzbe) abstractSafeParcelable3).s0(), zzrVar2);
                                } catch (RemoteException e52) {
                                    f1.m(n0Var2);
                                    n0Var2.f22903f.b(e52, "Failed to send default event parameters to the service");
                                }
                            } else {
                                f1.m(n0Var2);
                                n0Var2.f22903f.a("Discarding data. Unrecognized parcel type.");
                            }
                            i17++;
                            f1Var = f1Var2;
                            str10 = str6;
                            i16 = i18;
                            n0Var = n0Var2;
                        }
                    }
                    str6 = null;
                    i17++;
                    f1Var = f1Var2;
                    str10 = str6;
                    i16 = i18;
                    n0Var = n0Var2;
                }
                i20 = i23 + 1;
                abstractSafeParcelable2 = abstractSafeParcelable;
                n0Var3 = n0Var;
                f1Var3 = f1Var;
                aVar = aVar2;
                context3 = context;
                i19 = i16;
            }
            i5 = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            if (abstractSafeParcelable2 != null) {
                arrayList2.add(new g0(abstractSafeParcelable2, zzrVar2.f5822c, zzrVar2.j));
            }
            String str102 = null;
            boolean t32 = eVar.t(null, x.P0);
            size = arrayList2.size();
            i17 = i5;
            while (i17 < size) {
            }
            i20 = i23 + 1;
            abstractSafeParcelable2 = abstractSafeParcelable;
            n0Var3 = n0Var;
            f1Var3 = f1Var;
            aVar = aVar2;
            context3 = context;
            i19 = i16;
        }
    }

    public final void C(zzah zzahVar) {
        boolean q;
        j();
        k();
        f1 f1Var = (f1) this.f3328a;
        f1Var.getClass();
        h0 o3 = f1Var.o();
        f1 f1Var2 = (f1) o3.f3328a;
        f1.k(f1Var2.f22748i);
        byte[] P = v3.P(zzahVar);
        if (P.length > 131072) {
            n0 n0Var = f1Var2.f22745f;
            f1.m(n0Var);
            n0Var.f22904g.a("Conditional user property too long for local database. Sending directly to service");
            q = false;
        } else {
            q = o3.q(2, P);
        }
        x(new s2(this, z(true), q, new zzah(zzahVar)));
    }

    @Override // s7.z
    public final boolean m() {
        return false;
    }

    public final void n(AtomicReference atomicReference) {
        j();
        k();
        x(new b6.i(this, atomicReference, z(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Bundle bundle) {
        boolean z5;
        boolean q;
        j();
        k();
        zzbe zzbeVar = new zzbe(bundle);
        v();
        f1 f1Var = (f1) this.f3328a;
        if (f1Var.f22743d.t(null, x.f23181c1)) {
            h0 o3 = f1Var.o();
            f1 f1Var2 = (f1) o3.f3328a;
            v3 v3Var = f1Var2.f22748i;
            n0 n0Var = f1Var2.f22745f;
            f1.k(v3Var);
            byte[] P = v3.P(zzbeVar);
            if (P == null) {
                f1.m(n0Var);
                n0Var.f22904g.a("Null default event parameters; not writing to database");
            } else if (P.length > 131072) {
                f1.m(n0Var);
                n0Var.f22904g.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                q = o3.q(4, P);
                if (q) {
                    z5 = true;
                    x(new b6.j(this, z(false), z5, zzbeVar, bundle));
                }
            }
            q = false;
            if (q) {
            }
        }
        z5 = false;
        x(new b6.j(this, z(false), z5, zzbeVar, bundle));
    }

    public final void p() {
        j();
        k();
        if (A()) {
            return;
        }
        if (q()) {
            this.f23256c.b();
            return;
        }
        f1 f1Var = (f1) this.f3328a;
        if (f1Var.f22743d.m()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = f1Var.f22740a.getPackageManager().queryIntentServices(new Intent().setClassName(f1Var.f22740a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(f1Var.f22740a, "com.google.android.gms.measurement.AppMeasurementService"));
        x2 x2Var = this.f23256c;
        y2 y2Var = x2Var.f23241c;
        y2Var.j();
        Context context = ((f1) y2Var.f3328a).f22740a;
        p6.a b10 = p6.a.b();
        synchronized (x2Var) {
            try {
                if (x2Var.f23239a) {
                    n0 n0Var2 = ((f1) x2Var.f23241c.f3328a).f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22910n.a("Connection attempt already in progress");
                } else {
                    y2 y2Var2 = x2Var.f23241c;
                    n0 n0Var3 = ((f1) y2Var2.f3328a).f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22910n.a("Using local app measurement service");
                    x2Var.f23239a = true;
                    b10.a(context, intent, y2Var2.f23256c, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        j();
        k();
        if (this.f23258e == null) {
            j();
            k();
            f1 f1Var = (f1) this.f3328a;
            v0 v0Var = f1Var.f22744e;
            f1.k(v0Var);
            v0Var.j();
            boolean z5 = false;
            Boolean valueOf = !v0Var.n().contains("use_service") ? null : Boolean.valueOf(v0Var.n().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                f0 r5 = ((f1) this.f3328a).r();
                r5.k();
                if (r5.f22736m != 1) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22910n.a("Checking service availability");
                    v3 v3Var = f1Var.f22748i;
                    f1.k(v3Var);
                    int b10 = c6.d.f3660b.b(((f1) v3Var.f3328a).f22740a, 12451000);
                    if (b10 != 0) {
                        if (b10 == 1) {
                            n0 n0Var2 = f1Var.f22745f;
                            f1.m(n0Var2);
                            n0Var2.f22910n.a("Service missing");
                        } else if (b10 != 2) {
                            if (b10 == 3) {
                                n0 n0Var3 = f1Var.f22745f;
                                f1.m(n0Var3);
                                n0Var3.f22906i.a("Service disabled");
                            } else if (b10 == 9) {
                                n0 n0Var4 = f1Var.f22745f;
                                f1.m(n0Var4);
                                n0Var4.f22906i.a("Service invalid");
                            } else if (b10 != 18) {
                                n0 n0Var5 = f1Var.f22745f;
                                f1.m(n0Var5);
                                n0Var5.f22906i.b(Integer.valueOf(b10), "Unexpected service status");
                            } else {
                                n0 n0Var6 = f1Var.f22745f;
                                f1.m(n0Var6);
                                n0Var6.f22906i.a("Service updating");
                            }
                            r2 = false;
                        } else {
                            n0 n0Var7 = f1Var.f22745f;
                            f1.m(n0Var7);
                            n0Var7.f22909m.a("Service container out of date");
                            v3 v3Var2 = f1Var.f22748i;
                            f1.k(v3Var2);
                            if (v3Var2.R() >= 17443) {
                                z5 = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z5 && f1Var.f22743d.m()) {
                            n0 n0Var8 = f1Var.f22745f;
                            f1.m(n0Var8);
                            n0Var8.f22903f.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            v0 v0Var2 = f1Var.f22744e;
                            f1.k(v0Var2);
                            v0Var2.j();
                            SharedPreferences.Editor edit = v0Var2.n().edit();
                            edit.putBoolean("use_service", z5);
                            edit.apply();
                        }
                        r2 = z5;
                    } else {
                        n0 n0Var9 = f1Var.f22745f;
                        f1.m(n0Var9);
                        n0Var9.f22910n.a("Service available");
                    }
                }
                z5 = true;
                if (z5) {
                }
                if (r2) {
                }
                r2 = z5;
            }
            this.f23258e = Boolean.valueOf(r2);
        }
        return this.f23258e.booleanValue();
    }

    public final void r() {
        j();
        k();
        x2 x2Var = this.f23256c;
        if (x2Var.f23240b != null && (x2Var.f23240b.q() || x2Var.f23240b.r())) {
            x2Var.f23240b.e();
        }
        x2Var.f23240b = null;
        try {
            p6.a.b().c(((f1) this.f3328a).f22740a, x2Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f23257d = null;
    }

    public final boolean s() {
        j();
        k();
        if (!q()) {
            return true;
        }
        v3 v3Var = ((f1) this.f3328a).f22748i;
        f1.k(v3Var);
        return v3Var.R() >= ((Integer) x.K0.a(null)).intValue();
    }

    public final boolean t() {
        j();
        k();
        if (!q()) {
            return true;
        }
        v3 v3Var = ((f1) this.f3328a).f22748i;
        f1.k(v3Var);
        return v3Var.R() >= 241200;
    }

    public final void u(ComponentName componentName) {
        j();
        if (this.f23257d != null) {
            this.f23257d = null;
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22910n.b(componentName, "Disconnected from device MeasurementService");
            j();
            p();
        }
    }

    public final void v() {
        ((f1) this.f3328a).getClass();
    }

    public final void w() {
        j();
        androidx.recyclerview.widget.j jVar = this.f23261h;
        ((q6.a) jVar.f2439c).getClass();
        jVar.f2438b = SystemClock.elapsedRealtime();
        ((f1) this.f3328a).getClass();
        this.f23259f.b(((Long) x.Z.a(null)).longValue());
    }

    public final void x(Runnable runnable) {
        j();
        if (A()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f23262i;
        long size = arrayList.size();
        f1 f1Var = (f1) this.f3328a;
        f1Var.getClass();
        if (size >= 1000) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.j.b(60000L);
            p();
        }
    }

    public final void y() {
        j();
        f1 f1Var = (f1) this.f3328a;
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        l0 l0Var = n0Var.f22910n;
        ArrayList arrayList = this.f23262i;
        l0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e7) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.b(e7, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.j.c();
    }

    public final zzr z(boolean z5) {
        long abs;
        Pair pair;
        f1 f1Var = (f1) this.f3328a;
        f1Var.getClass();
        f0 r5 = f1Var.r();
        String str = null;
        if (z5) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            f1 f1Var2 = (f1) n0Var.f3328a;
            v0 v0Var = f1Var2.f22744e;
            f1.k(v0Var);
            if (v0Var.f23126e != null) {
                v0 v0Var2 = f1Var2.f22744e;
                f1.k(v0Var2);
                g3.d dVar = v0Var2.f23126e;
                v0 v0Var3 = (v0) dVar.f9738e;
                v0Var3.j();
                v0Var3.j();
                long j = ((v0) dVar.f9738e).n().getLong((String) dVar.f9735b, 0L);
                if (j == 0) {
                    dVar.d();
                    abs = 0;
                } else {
                    ((f1) v0Var3.f3328a).f22749k.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j6 = dVar.f9734a;
                if (abs >= j6) {
                    if (abs > j6 + j6) {
                        dVar.d();
                    } else {
                        String string = v0Var3.n().getString((String) dVar.f9737d, null);
                        long j10 = v0Var3.n().getLong((String) dVar.f9736c, 0L);
                        dVar.d();
                        pair = (string == null || j10 <= 0) ? v0.f23123z : new Pair(string, Long.valueOf(j10));
                        if (pair != null && pair != v0.f23123z) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = d9.e.m(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = d9.e.m(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, StringUtils.PROCESS_POSTFIX_DELIMITER, str22);
                }
            }
        }
        return r5.n(str);
    }
}
