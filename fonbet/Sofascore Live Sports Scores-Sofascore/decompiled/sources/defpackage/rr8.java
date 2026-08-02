package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rr8 implements dni {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final joa d;
    public static final joa e;
    public final SQLiteDatabase a;

    static {
        ysa ysaVar = ysa.b;
        d = ypa.a(ysaVar, new zl8(5));
        e = ypa.a(ysaVar, new zl8(6));
    }

    public rr8(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.dni
    public final void A() {
        this.a.beginTransaction();
    }

    @Override // defpackage.dni
    public final Cursor A0(String str) {
        return B(new y3g(str, (Object[]) null));
    }

    @Override // defpackage.dni
    public final Cursor B(hni hniVar) {
        hniVar.getClass();
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new qr8(new jw5(hniVar, 6), 1), hniVar.h(), c, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.dni
    public final void D() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.dni
    public final long D0(String str, int i, ContentValues contentValues) {
        return this.a.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // defpackage.dni
    public final void E(String str) {
        this.a.execSQL(str);
    }

    @Override // defpackage.dni
    public final boolean N() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // defpackage.dni
    public final boolean N0() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.dni
    public final void O() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.dni
    public final void P(String str, Object[] objArr) {
        this.a.execSQL(str, objArr);
    }

    @Override // defpackage.dni
    public final void Q() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.dni
    public final void U() {
        this.a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.dni
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.dni
    public final mni o0(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.a.compileStatement(str);
        compileStatement.getClass();
        return new zr8(compileStatement);
    }

    @Override // defpackage.dni
    public final void s0() {
        joa joaVar = e;
        if (((Method) joaVar.getValue()) != null) {
            joa joaVar2 = d;
            if (((Method) joaVar2.getValue()) != null) {
                Method method = (Method) joaVar.getValue();
                method.getClass();
                Method method2 = (Method) joaVar2.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.a, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    a70.r("Required value was null.");
                    return;
                }
            }
        }
        A();
    }

    @Override // defpackage.dni
    public final Cursor w0(hni hniVar, CancellationSignal cancellationSignal) {
        hniVar.getClass();
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new qr8(hniVar, 0), hniVar.h(), c, null, cancellationSignal);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.dni
    public final int x0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2 = 0;
        if (contentValues.size() == 0) {
            a70.p("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[i]);
        sb.append(str);
        sb.append(" SET ");
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? BlazeDataSourcePersonalizedType.STRING_SEPARATOR : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        mni o0 = o0(sb.toString());
        v8a.k(o0, objArr2);
        return ((zr8) o0).b.executeUpdateDelete();
    }

    @Override // defpackage.dni
    public final boolean y() {
        return this.a.inTransaction();
    }
}
