package com.google.android.gms.measurement.internal;

import E9.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3321o2 extends AbstractC3225c2 {
    private static final String[] zza = {PublisherMetadata.APP_VERSION, "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    public final C3305m2 f34194c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34195d;

    public C3321o2(C3298l3 c3298l3) {
        super(c3298l3);
        Context d10 = this.f33578a.d();
        this.f33578a.w();
        this.f34194c = new C3305m2(this, d10, "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return false;
    }

    public final void o() {
        int delete;
        h();
        try {
            SQLiteDatabase w10 = w();
            if (w10 == null || (delete = w10.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f33578a.a().w().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f33578a.a().o().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean p(zzbg zzbgVar) {
        Parcel obtain = Parcel.obtain();
        E.a(zzbgVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(0, marshall);
        }
        this.f33578a.a().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(zzpl zzplVar) {
        Parcel obtain = Parcel.obtain();
        Y6.a(zzplVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(1, marshall);
        }
        this.f33578a.a().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(zzah zzahVar) {
        C3298l3 c3298l3 = this.f33578a;
        byte[] T10 = c3298l3.C().T(zzahVar);
        if (T10.length <= 131072) {
            return z(2, T10);
        }
        c3298l3.a().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(zzbe zzbeVar) {
        C3298l3 c3298l3 = this.f33578a;
        byte[] T10 = c3298l3.C().T(zzbeVar);
        if (T10 == null) {
            c3298l3.a().p().a("Null default event parameters; not writing to database");
            return false;
        }
        if (T10.length <= 131072) {
            return z(4, T10);
        }
        c3298l3.a().p().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0218 A[Catch: SQLiteDatabaseLockedException -> 0x0121, SQLiteException -> 0x01f5, SQLiteFullException -> 0x01f8, all -> 0x036a, TryCatch #6 {all -> 0x036a, blocks: (B:75:0x00de, B:77:0x00e4, B:80:0x00f7, B:82:0x00fd, B:169:0x0134, B:178:0x014c, B:180:0x0151, B:46:0x032f, B:48:0x0335, B:40:0x0338, B:19:0x035a, B:31:0x0376, B:188:0x0186, B:189:0x0189, B:192:0x0182, B:87:0x019c, B:90:0x01b0, B:96:0x01cb, B:99:0x01d4, B:100:0x01d7, B:102:0x01c5, B:105:0x01db, B:113:0x01f1, B:115:0x0218, B:126:0x0222, B:127:0x0225, B:124:0x0212, B:136:0x022b, B:144:0x023f, B:146:0x0264, B:156:0x026e, B:157:0x0271, B:154:0x025e, B:164:0x0276, B:166:0x0286, B:211:0x02c5, B:213:0x02e2, B:214:0x02f1), top: B:45:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0264 A[Catch: SQLiteException -> 0x0243, SQLiteFullException -> 0x0246, SQLiteDatabaseLockedException -> 0x0359, all -> 0x036a, TryCatch #6 {all -> 0x036a, blocks: (B:75:0x00de, B:77:0x00e4, B:80:0x00f7, B:82:0x00fd, B:169:0x0134, B:178:0x014c, B:180:0x0151, B:46:0x032f, B:48:0x0335, B:40:0x0338, B:19:0x035a, B:31:0x0376, B:188:0x0186, B:189:0x0189, B:192:0x0182, B:87:0x019c, B:90:0x01b0, B:96:0x01cb, B:99:0x01d4, B:100:0x01d7, B:102:0x01c5, B:105:0x01db, B:113:0x01f1, B:115:0x0218, B:126:0x0222, B:127:0x0225, B:124:0x0212, B:136:0x022b, B:144:0x023f, B:146:0x0264, B:156:0x026e, B:157:0x0271, B:154:0x025e, B:164:0x0276, B:166:0x0286, B:211:0x02c5, B:213:0x02e2, B:214:0x02f1), top: B:45:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List t(int i10) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        String str;
        String str2;
        String str3;
        int i11;
        Cursor cursor2;
        Cursor cursor3;
        long j10;
        String str4;
        String[] strArr;
        long j11;
        String str5;
        Parcel obtain;
        C3298l3 c3298l3;
        int i12;
        int i13;
        zzbe zzbeVar;
        zzah zzahVar;
        zzpl zzplVar;
        String str6 = "entry";
        String str7 = "type";
        String str8 = "rowid";
        h();
        ?? r62 = 0;
        if (this.f34195d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!x()) {
            return arrayList;
        }
        int i14 = 0;
        int i15 = 5;
        int i16 = 0;
        for (int i17 = 5; i16 < i17; i17 = 5) {
            try {
                sQLiteDatabase = w();
                try {
                    if (sQLiteDatabase == null) {
                        this.f34195d = true;
                        return r62;
                    }
                    try {
                        sQLiteDatabase.beginTransaction();
                        try {
                            cursor3 = sQLiteDatabase.query("messages", new String[]{str8}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j12 = -1;
                                if (cursor3.moveToFirst()) {
                                    j10 = cursor3.getLong(i14);
                                    cursor3.close();
                                } else {
                                    cursor3.close();
                                    j10 = -1;
                                }
                                if (j10 != -1) {
                                    String[] strArr2 = new String[1];
                                    strArr2[i14] = String.valueOf(j10);
                                    str4 = "rowid<?";
                                    strArr = strArr2;
                                } else {
                                    str4 = r62;
                                    strArr = str4;
                                }
                                String[] strArr3 = {str8, str7, str6};
                                C3298l3 c3298l32 = this.f33578a;
                                C3286k w10 = c3298l32.w();
                                int i18 = 1;
                                Z1 z12 = AbstractC3209a2.f33860c1;
                                boolean H10 = w10.H(r62, z12);
                                int i19 = 4;
                                int i20 = 3;
                                int i21 = 2;
                                if (H10) {
                                    strArr3 = new String[i17];
                                    strArr3[i14] = str8;
                                    strArr3[1] = str7;
                                    strArr3[2] = str6;
                                    strArr3[3] = PublisherMetadata.APP_VERSION;
                                    strArr3[4] = "app_version_int";
                                }
                                String[] strArr4 = strArr3;
                                C3298l3 c3298l33 = c3298l32;
                                cursor2 = sQLiteDatabase.query("messages", strArr4, str4, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursor2.moveToNext()) {
                                    try {
                                        j12 = cursor2.getLong(i14);
                                        int i22 = cursor2.getInt(i18);
                                        byte[] blob = cursor2.getBlob(i21);
                                        try {
                                            if (c3298l33.w().H(null, z12)) {
                                                str5 = cursor2.getString(i20);
                                                j11 = cursor2.getLong(i19);
                                            } else {
                                                j11 = 0;
                                                str5 = null;
                                            }
                                            String str9 = str6;
                                            long j13 = j11;
                                            str2 = str7;
                                            if (i22 == 0) {
                                                try {
                                                    obtain = Parcel.obtain();
                                                    c3298l3 = c3298l33;
                                                    try {
                                                        str3 = str8;
                                                        try {
                                                            try {
                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                obtain.setDataPosition(0);
                                                                zzbg createFromParcel = zzbg.CREATOR.createFromParcel(obtain);
                                                                try {
                                                                    if (createFromParcel != null) {
                                                                        arrayList.add(new C3313n2(createFromParcel, str5, j13));
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str9;
                                                                    i11 = 0;
                                                                    SystemClock.sleep(i15);
                                                                    i15 += 20;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i16++;
                                                                        i14 = i11;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        r62 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i16++;
                                                                    i14 = i11;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    r62 = 0;
                                                                } catch (SQLiteFullException e10) {
                                                                    e = e10;
                                                                    str = str9;
                                                                    i11 = 0;
                                                                    this.f33578a.a().o().b("Error reading entries from local database", e);
                                                                    this.f34195d = true;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i16++;
                                                                        i14 = i11;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        r62 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i16++;
                                                                    i14 = i11;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    r62 = 0;
                                                                } catch (SQLiteException e11) {
                                                                    e = e11;
                                                                    str = str9;
                                                                    i11 = 0;
                                                                    if (sQLiteDatabase != null) {
                                                                        try {
                                                                            if (sQLiteDatabase.inTransaction()) {
                                                                                sQLiteDatabase.endTransaction();
                                                                            }
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
                                                                    }
                                                                    this.f33578a.a().o().b("Error reading entries from local database", e);
                                                                    this.f34195d = true;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i16++;
                                                                        i14 = i11;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        r62 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i16++;
                                                                    i14 = i11;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    r62 = 0;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                throw th;
                                                            }
                                                        } catch (a.C0068a unused2) {
                                                            this.f33578a.a().o().a("Failed to load event from local database");
                                                            obtain.recycle();
                                                            str = str9;
                                                            i13 = 2;
                                                            i12 = 3;
                                                            i11 = 0;
                                                            i20 = i12;
                                                            i14 = i11;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            i18 = 1;
                                                            i19 = 4;
                                                            i21 = i13;
                                                            c3298l33 = c3298l3;
                                                        }
                                                    } catch (a.C0068a unused3) {
                                                        str3 = str8;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str8;
                                                } catch (SQLiteFullException e12) {
                                                    e = e12;
                                                    str3 = str8;
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    str3 = str8;
                                                }
                                            } else {
                                                c3298l3 = c3298l33;
                                                str3 = str8;
                                                if (i22 == 1) {
                                                    obtain = Parcel.obtain();
                                                    try {
                                                        try {
                                                            obtain.unmarshall(blob, 0, blob.length);
                                                            obtain.setDataPosition(0);
                                                            zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                        } finally {
                                                            obtain.recycle();
                                                        }
                                                    } catch (a.C0068a unused5) {
                                                        this.f33578a.a().o().a("Failed to load user property from local database");
                                                        obtain.recycle();
                                                        zzplVar = null;
                                                    }
                                                    if (zzplVar != null) {
                                                        arrayList.add(new C3313n2(zzplVar, str5, j13));
                                                    }
                                                } else {
                                                    i13 = 2;
                                                    if (i22 == 2) {
                                                        obtain = Parcel.obtain();
                                                        try {
                                                            str = str9;
                                                            try {
                                                                try {
                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                    obtain.setDataPosition(0);
                                                                    zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                } catch (a.C0068a unused6) {
                                                                    this.f33578a.a().o().a("Failed to load conditional user property from local database");
                                                                    obtain.recycle();
                                                                    zzahVar = null;
                                                                    if (zzahVar != null) {
                                                                    }
                                                                    i12 = 3;
                                                                    i11 = 0;
                                                                    i20 = i12;
                                                                    i14 = i11;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                    str8 = str3;
                                                                    i18 = 1;
                                                                    i19 = 4;
                                                                    i21 = i13;
                                                                    c3298l33 = c3298l3;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                throw th;
                                                            }
                                                        } catch (a.C0068a unused7) {
                                                            str = str9;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            str = str9;
                                                        }
                                                        try {
                                                            if (zzahVar != null) {
                                                                arrayList.add(new C3313n2(zzahVar, str5, j13));
                                                            }
                                                            i12 = 3;
                                                            i11 = 0;
                                                            i20 = i12;
                                                            i14 = i11;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            i18 = 1;
                                                            i19 = 4;
                                                            i21 = i13;
                                                            c3298l33 = c3298l3;
                                                        } catch (SQLiteDatabaseLockedException unused8) {
                                                            i11 = 0;
                                                            SystemClock.sleep(i15);
                                                            i15 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16++;
                                                            i14 = i11;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            r62 = 0;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                            i11 = 0;
                                                            this.f33578a.a().o().b("Error reading entries from local database", e);
                                                            this.f34195d = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16++;
                                                            i14 = i11;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            r62 = 0;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            i11 = 0;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            this.f33578a.a().o().b("Error reading entries from local database", e);
                                                            this.f34195d = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16++;
                                                            i14 = i11;
                                                            str6 = str;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            r62 = 0;
                                                        }
                                                    } else {
                                                        str = str9;
                                                        if (i22 == 4) {
                                                            obtain = Parcel.obtain();
                                                            try {
                                                                i11 = 0;
                                                                try {
                                                                    try {
                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                        obtain.setDataPosition(0);
                                                                        zzbeVar = zzbe.CREATOR.createFromParcel(obtain);
                                                                    } catch (a.C0068a unused9) {
                                                                        this.f33578a.a().o().a("Failed to load default event parameters from local database");
                                                                        obtain.recycle();
                                                                        zzbeVar = null;
                                                                        if (zzbeVar != null) {
                                                                        }
                                                                        i12 = 3;
                                                                        i20 = i12;
                                                                        i14 = i11;
                                                                        str6 = str;
                                                                        str7 = str2;
                                                                        str8 = str3;
                                                                        i18 = 1;
                                                                        i19 = 4;
                                                                        i21 = i13;
                                                                        c3298l33 = c3298l3;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    throw th;
                                                                }
                                                            } catch (a.C0068a unused10) {
                                                                i11 = 0;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                            }
                                                            try {
                                                                if (zzbeVar != null) {
                                                                    arrayList.add(new C3313n2(zzbeVar, str5, j13));
                                                                }
                                                                i12 = 3;
                                                            } catch (SQLiteDatabaseLockedException unused11) {
                                                                SystemClock.sleep(i15);
                                                                i15 += 20;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i16++;
                                                                i14 = i11;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                r62 = 0;
                                                            } catch (SQLiteFullException e16) {
                                                                e = e16;
                                                                this.f33578a.a().o().b("Error reading entries from local database", e);
                                                                this.f34195d = true;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i16++;
                                                                i14 = i11;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                r62 = 0;
                                                            } catch (SQLiteException e17) {
                                                                e = e17;
                                                                if (sQLiteDatabase != null) {
                                                                }
                                                                this.f33578a.a().o().b("Error reading entries from local database", e);
                                                                this.f34195d = true;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i16++;
                                                                i14 = i11;
                                                                str6 = str;
                                                                str7 = str2;
                                                                str8 = str3;
                                                                r62 = 0;
                                                            }
                                                        } else {
                                                            i12 = 3;
                                                            i11 = 0;
                                                            if (i22 == 3) {
                                                                this.f33578a.a().w().a("Skipping app launch break");
                                                            } else {
                                                                this.f33578a.a().o().a("Unknown record type in local database");
                                                            }
                                                        }
                                                        i20 = i12;
                                                        i14 = i11;
                                                        str6 = str;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        i18 = 1;
                                                        i19 = 4;
                                                        i21 = i13;
                                                        c3298l33 = c3298l3;
                                                    }
                                                }
                                            }
                                            str = str9;
                                            i13 = 2;
                                            i12 = 3;
                                            i11 = 0;
                                            i20 = i12;
                                            i14 = i11;
                                            str6 = str;
                                            str7 = str2;
                                            str8 = str3;
                                            i18 = 1;
                                            i19 = 4;
                                            i21 = i13;
                                            c3298l33 = c3298l3;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str6;
                                            str2 = str7;
                                            str3 = str8;
                                        } catch (SQLiteFullException e18) {
                                            e = e18;
                                            str = str6;
                                            str2 = str7;
                                            str3 = str8;
                                        } catch (SQLiteException e19) {
                                            e = e19;
                                            str = str6;
                                            str2 = str7;
                                            str3 = str8;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str6;
                                        str2 = str7;
                                        str3 = str8;
                                        i11 = i14;
                                    } catch (SQLiteFullException e20) {
                                        e = e20;
                                        str = str6;
                                        str2 = str7;
                                        str3 = str8;
                                        i11 = i14;
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        str = str6;
                                        str2 = str7;
                                        str3 = str8;
                                        i11 = i14;
                                    }
                                }
                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                    this.f33578a.a().o().a("Fewer entries removed from local database than expected");
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                cursor2.close();
                                sQLiteDatabase.close();
                                return arrayList;
                            } catch (Throwable th9) {
                                th = th9;
                                str = str6;
                                str2 = str7;
                                str3 = str8;
                                i11 = i14;
                                if (cursor3 != null) {
                                    try {
                                        cursor3.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursor2 = null;
                                        SystemClock.sleep(i15);
                                        i15 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i16++;
                                        i14 = i11;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                        r62 = 0;
                                    } catch (SQLiteFullException e22) {
                                        e = e22;
                                        cursor2 = null;
                                        this.f33578a.a().o().b("Error reading entries from local database", e);
                                        this.f34195d = true;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i16++;
                                        i14 = i11;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                        r62 = 0;
                                    } catch (SQLiteException e23) {
                                        e = e23;
                                        cursor2 = null;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.f33578a.a().o().b("Error reading entries from local database", e);
                                        this.f34195d = true;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i16++;
                                        i14 = i11;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                        r62 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            str = str6;
                            str2 = str7;
                            str3 = str8;
                            i11 = i14;
                            cursor3 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        i11 = i14;
                    } catch (SQLiteFullException e24) {
                        e = e24;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        i11 = i14;
                    } catch (SQLiteException e25) {
                        e = e25;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        i11 = i14;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    cursor = null;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str6;
                str2 = str7;
                str3 = str8;
                i11 = i14;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e26) {
                e = e26;
                str = str6;
                str2 = str7;
                str3 = str8;
                i11 = i14;
                sQLiteDatabase = null;
            } catch (SQLiteException e27) {
                e = e27;
                str = str6;
                str2 = str7;
                str3 = str8;
                i11 = i14;
                sQLiteDatabase = null;
            } catch (Throwable th12) {
                th = th12;
                cursor = null;
                sQLiteDatabase = null;
            }
        }
        this.f33578a.a().r().a("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean u() {
        return z(3, new byte[0]);
    }

    public final boolean v() {
        h();
        if (!this.f34195d && x()) {
            int i10 = 5;
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    this.f33578a.a().r().a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase w10 = w();
                            if (w10 != null) {
                                w10.beginTransaction();
                                w10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                w10.setTransactionSuccessful();
                                w10.endTransaction();
                                w10.close();
                                return true;
                            }
                            this.f34195d = true;
                        } catch (SQLiteFullException e10) {
                            this.f33578a.a().o().b("Error deleting app launch break from local database", e10);
                            this.f34195d = true;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteException e11) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        this.f33578a.a().o().b("Error deleting app launch break from local database", e11);
                        this.f34195d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i11++;
            }
        }
        return false;
    }

    public final SQLiteDatabase w() {
        if (this.f34195d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f34194c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f34195d = true;
        return null;
    }

    public final boolean x() {
        C3298l3 c3298l3 = this.f33578a;
        Context d10 = c3298l3.d();
        c3298l3.w();
        return d10.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        boolean z11;
        Cursor cursor;
        h();
        boolean z12 = false;
        z12 = false;
        if (!this.f34195d) {
            C3298l3 c3298l3 = this.f33578a;
            C3286k w10 = c3298l3.w();
            Z1 z13 = AbstractC3209a2.f33860c1;
            Cursor cursor2 = null;
            zzr o10 = w10.H(null, z13) ? this.f33578a.L().o(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (c3298l3.w().H(null, z13) && o10 != null) {
                contentValues.put(PublisherMetadata.APP_VERSION, o10.f34464c);
                contentValues.put("app_version_int", Long.valueOf(o10.f34471j));
            }
            c3298l3.w();
            int i11 = 0;
            int i12 = 5;
            for (int i13 = 5; i11 < i13; i13 = 5) {
                try {
                    sQLiteDatabase = w();
                    if (sQLiteDatabase == null) {
                        this.f34195d = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j10 = 0;
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        j10 = cursor.getLong(z12 ? 1 : 0);
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z10 = z12 ? 1 : 0;
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    z10 = z12 ? 1 : 0;
                                    this.f33578a.a().o().b("Error writing entry; local database full", e);
                                    this.f34195d = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.f33578a.a().o().b("Error writing entry to local database", e);
                                    this.f34195d = z11;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z12 = z10;
                                }
                            }
                            if (j10 >= 100000) {
                                c3298l3.a().o().a("Data loss, local db full");
                                long j11 = 100001 - j10;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j11)});
                                if (delete != j11) {
                                    C3376v2 o11 = c3298l3.a().o();
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i12);
                                            i12 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i11++;
                                                z12 = z10;
                                            }
                                            sQLiteDatabase.close();
                                            i11++;
                                            z12 = z10;
                                        }
                                        try {
                                            o11.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(delete), Long.valueOf(j11 - delete));
                                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            sQLiteDatabase.close();
                                            return z11;
                                        } catch (SQLiteFullException e12) {
                                            e = e12;
                                            this.f33578a.a().o().b("Error writing entry; local database full", e);
                                            this.f34195d = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i11++;
                                                z12 = z10;
                                            }
                                            sQLiteDatabase.close();
                                            i11++;
                                            z12 = z10;
                                        } catch (SQLiteException e13) {
                                            e = e13;
                                            if (sQLiteDatabase != null) {
                                                try {
                                                    if (sQLiteDatabase.inTransaction()) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cursor2 = cursor;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            this.f33578a.a().o().b("Error writing entry to local database", e);
                                            this.f34195d = z11;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i11++;
                                                z12 = z10;
                                            }
                                            sQLiteDatabase.close();
                                            i11++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteFullException e14) {
                                        e = e14;
                                        this.f33578a.a().o().b("Error writing entry; local database full", e);
                                        this.f34195d = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z12 = z10;
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        z11 = true;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.f33578a.a().o().b("Error writing entry to local database", e);
                                        this.f34195d = z11;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z12 = z10;
                                    }
                                }
                            }
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            z10 = z12 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e17) {
                            e = e17;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursor = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e19) {
                    e = e19;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabase = null;
                }
            }
            boolean z14 = z12 ? 1 : 0;
            this.f33578a.a().w().a("Failed to write entry to local database");
            return z14;
        }
        return z12;
    }
}
