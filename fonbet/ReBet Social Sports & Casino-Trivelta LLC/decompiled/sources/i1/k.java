package i1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.common.collect.E;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import e1.C4135b;
import e1.Z;
import g1.AbstractC4317d;
import g1.C4314a;
import g1.InterfaceC4315b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f47973a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f47974b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f47975c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f47976d;

    /* renamed from: e, reason: collision with root package name */
    public c f47977e;

    /* renamed from: f, reason: collision with root package name */
    public c f47978f;

    public static final class a implements c {
        private static final String[] COLUMNS = {StackTraceHelper.ID_KEY, "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4315b f47979a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f47980b = new SparseArray();

        /* renamed from: c, reason: collision with root package name */
        public String f47981c;

        /* renamed from: d, reason: collision with root package name */
        public String f47982d;

        public a(InterfaceC4315b interfaceC4315b) {
            this.f47979a = interfaceC4315b;
        }

        public static void j(InterfaceC4315b interfaceC4315b, String str) {
            try {
                String n10 = n(str);
                SQLiteDatabase writableDatabase = interfaceC4315b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC4317d.c(writableDatabase, 1, str);
                    l(writableDatabase, n10);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new C4314a(e10);
            }
        }

        public static void l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // i1.k.c
        public boolean a() {
            try {
                return AbstractC4317d.b(this.f47979a.getReadableDatabase(), 1, (String) AbstractC4134a.e(this.f47981c)) != -1;
            } catch (SQLException e10) {
                throw new C4314a(e10);
            }
        }

        @Override // i1.k.c
        public void b(HashMap hashMap) {
            if (this.f47980b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f47979a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f47980b.size(); i10++) {
                    try {
                        j jVar = (j) this.f47980b.valueAt(i10);
                        if (jVar == null) {
                            k(writableDatabase, this.f47980b.keyAt(i10));
                        } else {
                            i(writableDatabase, jVar);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f47980b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new C4314a(e10);
            }
        }

        @Override // i1.k.c
        public void c(long j10) {
            String hexString = Long.toHexString(j10);
            this.f47981c = hexString;
            this.f47982d = n(hexString);
        }

        @Override // i1.k.c
        public void d(j jVar) {
            this.f47980b.put(jVar.f47966a, jVar);
        }

        @Override // i1.k.c
        public void e(HashMap hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.f47979a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, (j) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f47980b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } catch (SQLException e10) {
                throw new C4314a(e10);
            }
        }

        @Override // i1.k.c
        public void f(j jVar, boolean z10) {
            if (z10) {
                this.f47980b.delete(jVar.f47966a);
            } else {
                this.f47980b.put(jVar.f47966a, null);
            }
        }

        @Override // i1.k.c
        public void g(HashMap hashMap, SparseArray sparseArray) {
            AbstractC4134a.g(this.f47980b.size() == 0);
            try {
                if (AbstractC4317d.b(this.f47979a.getReadableDatabase(), 1, (String) AbstractC4134a.e(this.f47981c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f47979a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor m10 = m();
                while (m10.moveToNext()) {
                    try {
                        j jVar = new j(m10.getInt(0), (String) AbstractC4134a.e(m10.getString(1)), k.o(new DataInputStream(new ByteArrayInputStream(m10.getBlob(2)))));
                        hashMap.put(jVar.f47967b, jVar);
                        sparseArray.put(jVar.f47966a, jVar.f47967b);
                    } finally {
                    }
                }
                m10.close();
            } catch (SQLiteException e10) {
                hashMap.clear();
                sparseArray.clear();
                throw new C4314a(e10);
            }
        }

        @Override // i1.k.c
        public void h() {
            j(this.f47979a, (String) AbstractC4134a.e(this.f47981c));
        }

        public final void i(SQLiteDatabase sQLiteDatabase, j jVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k.r(jVar.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(StackTraceHelper.ID_KEY, Integer.valueOf(jVar.f47966a));
            contentValues.put("key", jVar.f47967b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) AbstractC4134a.e(this.f47982d), null, contentValues);
        }

        public final void k(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) AbstractC4134a.e(this.f47982d), "id = ?", new String[]{Integer.toString(i10)});
        }

        public final Cursor m() {
            return this.f47979a.getReadableDatabase().query((String) AbstractC4134a.e(this.f47982d), COLUMNS, null, null, null, null, null);
        }

        public final void o(SQLiteDatabase sQLiteDatabase) {
            AbstractC4317d.d(sQLiteDatabase, 1, (String) AbstractC4134a.e(this.f47981c), 1);
            l(sQLiteDatabase, (String) AbstractC4134a.e(this.f47982d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f47982d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public interface c {
        boolean a();

        void b(HashMap hashMap);

        void c(long j10);

        void d(j jVar);

        void e(HashMap hashMap);

        void f(j jVar, boolean z10);

        void g(HashMap hashMap, SparseArray sparseArray);

        void h();
    }

    public k(InterfaceC4315b interfaceC4315b, File file, byte[] bArr, boolean z10, boolean z11) {
        AbstractC4134a.g((interfaceC4315b == null && file == null) ? false : true);
        this.f47973a = new HashMap();
        this.f47974b = new SparseArray();
        this.f47975c = new SparseBooleanArray();
        this.f47976d = new SparseBooleanArray();
        a aVar = interfaceC4315b != null ? new a(interfaceC4315b) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : null;
        if (aVar == null || (bVar != null && z11)) {
            this.f47977e = (c) Z.i(bVar);
            this.f47978f = aVar;
        } else {
            this.f47977e = aVar;
            this.f47978f = bVar;
        }
    }

    public static int j(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean m(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public static n o(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException("Invalid value size: " + readInt2);
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = Z.EMPTY_BYTE_ARRAY;
            int i11 = 0;
            while (i11 != readInt2) {
                int i12 = i11 + min;
                bArr = Arrays.copyOf(bArr, i12);
                dataInputStream.readFully(bArr, i11, min);
                min = Math.min(readInt2 - i12, 10485760);
                i11 = i12;
            }
            hashMap.put(readUTF, bArr);
        }
        return new n(hashMap);
    }

    public static void r(n nVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry> h10 = nVar.h();
        dataOutputStream.writeInt(h10.size());
        for (Map.Entry entry : h10) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final j c(String str) {
        int j10 = j(this.f47974b);
        j jVar = new j(j10, str);
        this.f47973a.put(str, jVar);
        this.f47974b.put(j10, str);
        this.f47976d.put(j10, true);
        this.f47977e.d(jVar);
        return jVar;
    }

    public void d(String str, m mVar) {
        j k10 = k(str);
        if (k10.b(mVar)) {
            this.f47977e.d(k10);
        }
    }

    public int e(String str) {
        return k(str).f47966a;
    }

    public j f(String str) {
        return (j) this.f47973a.get(str);
    }

    public Collection g() {
        return Collections.unmodifiableCollection(this.f47973a.values());
    }

    public l h(String str) {
        j f10 = f(str);
        return f10 != null ? f10.c() : n.f47992c;
    }

    public String i(int i10) {
        return (String) this.f47974b.get(i10);
    }

    public j k(String str) {
        j jVar = (j) this.f47973a.get(str);
        return jVar == null ? c(str) : jVar;
    }

    public void l(long j10) {
        c cVar;
        this.f47977e.c(j10);
        c cVar2 = this.f47978f;
        if (cVar2 != null) {
            cVar2.c(j10);
        }
        if (this.f47977e.a() || (cVar = this.f47978f) == null || !cVar.a()) {
            this.f47977e.g(this.f47973a, this.f47974b);
        } else {
            this.f47978f.g(this.f47973a, this.f47974b);
            this.f47977e.e(this.f47973a);
        }
        c cVar3 = this.f47978f;
        if (cVar3 != null) {
            cVar3.h();
            this.f47978f = null;
        }
    }

    public void n(String str) {
        j jVar = (j) this.f47973a.get(str);
        if (jVar != null && jVar.f() && jVar.h()) {
            this.f47973a.remove(str);
            int i10 = jVar.f47966a;
            boolean z10 = this.f47976d.get(i10);
            this.f47977e.f(jVar, z10);
            if (z10) {
                this.f47974b.remove(i10);
                this.f47976d.delete(i10);
            } else {
                this.f47974b.put(i10, null);
                this.f47975c.put(i10, true);
            }
        }
    }

    public void p() {
        m0 it = E.m(this.f47973a.keySet()).iterator();
        while (it.hasNext()) {
            n((String) it.next());
        }
    }

    public void q() {
        this.f47977e.b(this.f47973a);
        int size = this.f47975c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f47974b.remove(this.f47975c.keyAt(i10));
        }
        this.f47975c.clear();
        this.f47976d.clear();
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f47983a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f47984b;

        /* renamed from: c, reason: collision with root package name */
        public final SecretKeySpec f47985c;

        /* renamed from: d, reason: collision with root package name */
        public final SecureRandom f47986d;

        /* renamed from: e, reason: collision with root package name */
        public final C4135b f47987e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f47988f;

        /* renamed from: g, reason: collision with root package name */
        public q f47989g;

        public b(File file, byte[] bArr, boolean z10) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            AbstractC4134a.g((bArr == null && z10) ? false : true);
            if (bArr != null) {
                AbstractC4134a.a(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                AbstractC4134a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f47983a = z10;
            this.f47984b = cipher;
            this.f47985c = secretKeySpec;
            this.f47986d = z10 ? new SecureRandom() : null;
            this.f47987e = new C4135b(file);
        }

        @Override // i1.k.c
        public boolean a() {
            return this.f47987e.c();
        }

        @Override // i1.k.c
        public void b(HashMap hashMap) {
            if (this.f47988f) {
                e(hashMap);
            }
        }

        @Override // i1.k.c
        public void d(j jVar) {
            this.f47988f = true;
        }

        @Override // i1.k.c
        public void e(HashMap hashMap) {
            m(hashMap);
            this.f47988f = false;
        }

        @Override // i1.k.c
        public void f(j jVar, boolean z10) {
            this.f47988f = true;
        }

        @Override // i1.k.c
        public void g(HashMap hashMap, SparseArray sparseArray) {
            AbstractC4134a.g(!this.f47988f);
            if (k(hashMap, sparseArray)) {
                return;
            }
            hashMap.clear();
            sparseArray.clear();
            this.f47987e.a();
        }

        @Override // i1.k.c
        public void h() {
            this.f47987e.a();
        }

        public final int i(j jVar, int i10) {
            int i11;
            int hashCode;
            int hashCode2 = (jVar.f47966a * 31) + jVar.f47967b.hashCode();
            if (i10 < 2) {
                long b10 = l.b(jVar.c());
                i11 = hashCode2 * 31;
                hashCode = (int) (b10 ^ (b10 >>> 32));
            } else {
                i11 = hashCode2 * 31;
                hashCode = jVar.c().hashCode();
            }
            return i11 + hashCode;
        }

        public final j j(int i10, DataInputStream dataInputStream) {
            n o10;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i10 < 2) {
                long readLong = dataInputStream.readLong();
                m mVar = new m();
                m.g(mVar, readLong);
                o10 = n.f47992c.g(mVar);
            } else {
                o10 = k.o(dataInputStream);
            }
            return new j(readInt, readUTF, o10);
        }

        public final boolean k(HashMap hashMap, SparseArray sparseArray) {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.f47987e.c()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f47987e.d());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f47984b == null) {
                            Z.m(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.f47984b.init(2, (Key) Z.i(this.f47985c), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f47984b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f47983a) {
                        this.f47988f = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i10 = 0;
                    for (int i11 = 0; i11 < readInt2; i11++) {
                        j j10 = j(readInt, dataInputStream);
                        hashMap.put(j10.f47967b, j10);
                        sparseArray.put(j10.f47966a, j10.f47967b);
                        i10 += i(j10, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z10 = dataInputStream.read() == -1;
                    if (readInt3 == i10 && z10) {
                        Z.m(dataInputStream);
                        return true;
                    }
                    Z.m(dataInputStream);
                    return false;
                }
                Z.m(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    Z.m(dataInputStream2);
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    Z.m(dataInputStream2);
                }
                throw th;
            }
        }

        public final void l(j jVar, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(jVar.f47966a);
            dataOutputStream.writeUTF(jVar.f47967b);
            k.r(jVar.c(), dataOutputStream);
        }

        public final void m(HashMap hashMap) {
            q qVar;
            DataOutputStream dataOutputStream;
            Closeable closeable = null;
            try {
                OutputStream f10 = this.f47987e.f();
                q qVar2 = this.f47989g;
                if (qVar2 == null) {
                    this.f47989g = new q(f10);
                } else {
                    qVar2.d(f10);
                }
                qVar = this.f47989g;
                dataOutputStream = new DataOutputStream(qVar);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.f47983a ? 1 : 0);
                if (this.f47983a) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) Z.i(this.f47986d)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) Z.i(this.f47984b)).init(1, (Key) Z.i(this.f47985c), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(qVar, this.f47984b));
                    } catch (InvalidAlgorithmParameterException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                int i10 = 0;
                for (j jVar : hashMap.values()) {
                    l(jVar, dataOutputStream);
                    i10 += i(jVar, 2);
                }
                dataOutputStream.writeInt(i10);
                this.f47987e.b(dataOutputStream);
                Z.m(null);
            } catch (Throwable th3) {
                th = th3;
                closeable = dataOutputStream;
                Z.m(closeable);
                throw th;
            }
        }

        @Override // i1.k.c
        public void c(long j10) {
        }
    }
}
