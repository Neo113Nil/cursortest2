package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.apf;
import xsna.asp;
import xsna.bpn0;
import xsna.epx;
import xsna.ogs;
import xsna.sgd0;
import xsna.sin0;
import xsna.tin0;
import xsna.zrp;

/* compiled from: FrameworkSQLiteOpenHelper.android.kt */
/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements tin0 {
    public final Context b;
    public final String c;
    public final tin0.a d;
    public final boolean e;
    public final boolean f;
    public final bpn0 g = new bpn0(new apf(this, 2));
    public boolean h;

    /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final /* synthetic */ int i = 0;
        public final Context b;
        public final a c;
        public final tin0.a d;
        public final boolean e;
        public boolean f;
        public final sgd0 g;
        public boolean h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        /* loaded from: classes12.dex */
        public static final class CallbackName {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CallbackName[] $VALUES;
            public static final CallbackName ON_CONFIGURE;
            public static final CallbackName ON_CREATE;
            public static final CallbackName ON_DOWNGRADE;
            public static final CallbackName ON_OPEN;
            public static final CallbackName ON_UPGRADE;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                ON_CONFIGURE = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                ON_CREATE = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                ON_UPGRADE = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                ON_DOWNGRADE = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                ON_OPEN = callbackName5;
                CallbackName[] callbackNameArr = {callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
                $VALUES = callbackNameArr;
                $ENTRIES = new asp(callbackNameArr);
            }

            public CallbackName() {
                throw null;
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) $VALUES.clone();
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        public static final class a extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            public a(CallbackName callbackName, Throwable th) {
                super(th);
                this.callbackName = callbackName;
                this.cause = th;
            }

            public final CallbackName d() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        /* loaded from: classes12.dex */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OpenHelper(Context context, String str, final a aVar, final tin0.a aVar2, boolean z) {
            super(context, str, null, aVar2.a, new DatabaseErrorHandler(aVar2, aVar) { // from class: xsna.pgs
                public final /* synthetic */ FrameworkSQLiteOpenHelper.a a;

                {
                    this.a = aVar;
                }

                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i2 = FrameworkSQLiteOpenHelper.OpenHelper.i;
                    FrameworkSQLiteOpenHelper.a aVar3 = this.a;
                    ogs ogsVar = aVar3.a;
                    if (ogsVar == null || !epx.f(ogsVar.b, sQLiteDatabase)) {
                        ogsVar = new ogs(sQLiteDatabase);
                        aVar3.a = ogsVar;
                    }
                    tin0.a.b(ogsVar);
                }
            });
            this.b = context;
            this.c = aVar;
            this.d = aVar2;
            this.e = z;
            this.g = new sgd0(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        public final sin0 b(boolean z) {
            sgd0 sgd0Var = this.g;
            try {
                sgd0Var.a((this.h || getDatabaseName() == null) ? false : true);
                this.f = false;
                SQLiteDatabase h = h(z);
                if (!this.f) {
                    ogs c = c(h);
                    sgd0Var.b();
                    return c;
                }
                close();
                sin0 b2 = b(z);
                sgd0Var.b();
                return b2;
            } catch (Throwable th) {
                sgd0Var.b();
                throw th;
            }
        }

        public final ogs c(SQLiteDatabase sQLiteDatabase) {
            a aVar = this.c;
            ogs ogsVar = aVar.a;
            if (ogsVar != null && epx.f(ogsVar.b, sQLiteDatabase)) {
                return ogsVar;
            }
            ogs ogsVar2 = new ogs(sQLiteDatabase);
            aVar.a = ogsVar2;
            return ogsVar2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            sgd0 sgd0Var = this.g;
            try {
                sgd0Var.a(sgd0Var.a);
                super.close();
                this.c.a = null;
                this.h = false;
            } finally {
                sgd0Var.b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v9, types: [android.database.sqlite.SQLiteDatabase] */
        public final SQLiteDatabase h(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.h;
            Context context = this.b;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                return z != 0 ? getWritableDatabase() : getReadableDatabase();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    z = z != 0 ? getWritableDatabase() : getReadableDatabase();
                    return z;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i2 = b.$EnumSwitchMapping$0[aVar.d().ordinal()];
                        if (i2 == 1) {
                            throw cause;
                        }
                        if (i2 == 2) {
                            throw cause;
                        }
                        if (i2 == 3) {
                            throw cause;
                        }
                        if (i2 == 4) {
                            throw cause;
                        }
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.e) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return z != 0 ? getWritableDatabase() : getReadableDatabase();
                    } catch (a e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            boolean z = this.f;
            tin0.a aVar = this.d;
            if (!z && aVar.a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                c(sQLiteDatabase);
                aVar.getClass();
            } catch (Throwable th) {
                throw new a(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                this.d.c(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f = true;
            try {
                this.d.d(c(sQLiteDatabase), i2, i3);
            } catch (Throwable th) {
                throw new a(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f) {
                try {
                    this.d.e(c(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(CallbackName.ON_OPEN, th);
                }
            }
            this.h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f = true;
            try {
                this.d.f(c(sQLiteDatabase), i2, i3);
            } catch (Throwable th) {
                throw new a(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
    public static final class a {
        public ogs a = null;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, tin0.a aVar, boolean z, boolean z2) {
        this.b = context;
        this.c = str;
        this.d = aVar;
        this.e = z;
        this.f = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bpn0 bpn0Var = this.g;
        if (bpn0Var.isInitialized()) {
            ((OpenHelper) bpn0Var.getValue()).close();
        }
    }

    @Override // xsna.tin0
    public final String getDatabaseName() {
        return this.c;
    }

    @Override // xsna.tin0
    public final sin0 getWritableDatabase() {
        return ((OpenHelper) this.g.getValue()).b(true);
    }

    @Override // xsna.tin0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        bpn0 bpn0Var = this.g;
        if (bpn0Var.isInitialized()) {
            ((OpenHelper) bpn0Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.h = z;
    }
}
