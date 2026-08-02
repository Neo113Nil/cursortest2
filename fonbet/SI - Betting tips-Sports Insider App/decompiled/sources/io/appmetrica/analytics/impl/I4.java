package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class I4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f12348a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f12349b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f12350c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f12351d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f12352e = "name";

    /* renamed from: f, reason: collision with root package name */
    public final String f12353f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f12354g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f12355h = "time";

    /* renamed from: i, reason: collision with root package name */
    public final String f12356i = "session_id";
    public final String j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f12357k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f12358l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f12359m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f12360n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final String f12361o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f12362p = "encrypting_mode";
    public final String q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f12363r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f12364s = AdRevenueConstants.SOURCE_KEY;

    /* renamed from: t, reason: collision with root package name */
    public final String f12365t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f12366u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final String f12367v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f12368w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C0146f7 f12369x = new C0146f7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0120e7 c0120e7) {
        Long l6;
        EnumC0047bb enumC0047bb;
        Long l10;
        Long l11;
        Long l12 = c0120e7.f13642a;
        if (l12 == null || l12.longValue() < 10000000000L || c0120e7.f13643b == null || (l6 = c0120e7.f13644c) == null || l6.longValue() < 0 || (enumC0047bb = c0120e7.f13645d) == null || enumC0047bb == EnumC0047bb.EVENT_TYPE_UNDEFINED || (l10 = c0120e7.f13646e) == null || l10.longValue() < 0 || (l11 = c0120e7.f13647f) == null || l11.longValue() < 0) {
            return false;
        }
        Long l13 = c0120e7.f13648g.f13568d;
        if (l13 != null && l13.longValue() < 0) {
            return false;
        }
        Integer num = c0120e7.f13648g.f13573i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.f12368w, null, null, null, null, null, null, String.valueOf(this.f12348a));
                while (cursor.moveToNext()) {
                    try {
                        C0120e7 a7 = a(cursor);
                        if (a7 != null && a(a7)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f12369x.fromModel(a7));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f12368w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f12368w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f12365t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.EnumC0327m9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0098da.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0120e7 a(Cursor cursor) {
        Vk vk;
        int i5;
        I8 i82;
        EnumC0327m9 enumC0327m9;
        int i10;
        int i11;
        int i12;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12356i)));
            int i13 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12357k));
            Vk vk2 = Vk.FOREGROUND;
            boolean z5 = true;
            try {
                if (i13 != 0) {
                    vk2 = Vk.BACKGROUND;
                    if (i13 != 1) {
                        vk = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12349b)));
                        EnumC0047bb a7 = EnumC0047bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f12354g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12350c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12355h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f12361o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f12352e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12353f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12351d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12358l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12359m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f12360n)));
                        i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12362p));
                        I8 i83 = I8.NONE;
                        if (i5 != 0) {
                            i83 = I8.AES_VALUE_ENCRYPTION;
                            if (i5 != 2) {
                                i83 = I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i5 != 1) {
                                    i82 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                                    i12 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12363r));
                                    EnumC0098da enumC0098da = EnumC0098da.FIRST_OCCURRENCE;
                                    if (i12 != 1) {
                                        enumC0098da = EnumC0098da.NON_FIRST_OCCURENCE;
                                        if (i12 != 2) {
                                            EnumC0098da enumC0098da2 = EnumC0098da.UNKNOWN;
                                            enumC0098da = enumC0098da2;
                                        }
                                    }
                                    EnumC0098da enumC0098da3 = enumC0098da;
                                    i11 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12364s));
                                    EnumC0327m9 enumC0327m92 = EnumC0327m9.NATIVE;
                                    if (i11 != 0) {
                                        enumC0327m92 = EnumC0327m9.JS;
                                        if (i11 != 1) {
                                            enumC0327m9 = null;
                                        }
                                    }
                                    enumC0327m9 = enumC0327m92;
                                }
                            }
                        }
                        i82 = i83;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                        i12 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12363r));
                        EnumC0098da enumC0098da4 = EnumC0098da.FIRST_OCCURRENCE;
                        if (i12 != 1) {
                        }
                        EnumC0098da enumC0098da32 = enumC0098da4;
                        i11 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12364s));
                        EnumC0327m9 enumC0327m922 = EnumC0327m9.NATIVE;
                        if (i11 != 0) {
                        }
                        enumC0327m9 = enumC0327m922;
                    }
                }
            } catch (Throwable unused) {
            }
            vk = vk2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12349b)));
            EnumC0047bb a72 = EnumC0047bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f12354g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12350c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12355h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f12361o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12352e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12353f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12351d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12358l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12359m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f12360n)));
            i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12362p));
            I8 i832 = I8.NONE;
            if (i5 != 0) {
            }
            i82 = i832;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
            i12 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12363r));
            EnumC0098da enumC0098da42 = EnumC0098da.FIRST_OCCURRENCE;
            if (i12 != 1) {
            }
            EnumC0098da enumC0098da322 = enumC0098da42;
            i11 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12364s));
            EnumC0327m9 enumC0327m9222 = EnumC0327m9.NATIVE;
            if (i11 != 0) {
            }
            enumC0327m9 = enumC0327m9222;
            z5 = false;
            Boolean valueOf9 = Boolean.valueOf(z5);
            try {
                i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12366u));
            } catch (Throwable unused2) {
                i10 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i10);
            int columnIndex = cursor.getColumnIndex(this.f12367v);
            return new C0120e7(valueOf, vk, valueOf22, a72, valueOf32, valueOf42, new C0095d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i82, string522, enumC0098da322, enumC0327m9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i10);
            int columnIndex2 = cursor.getColumnIndex(this.f12367v);
            return new C0120e7(valueOf, vk, valueOf22, a72, valueOf32, valueOf42, new C0095d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i82, string522, enumC0098da322, enumC0327m9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
