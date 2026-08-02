package q3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.common.collect.A;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m3.C8059a;
import m3.N;
import o3.C8634a;
import o3.InterfaceC8635b;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, j> f81457a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f81458b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f81459c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f81460d = new SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    private c f81461e;

    /* renamed from: f, reason: collision with root package name */
    private c f81462f;

    private static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f81463e = {"id", "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8635b f81464a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<j> f81465b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private String f81466c;

        /* renamed from: d, reason: collision with root package name */
        private String f81467d;

        public a(InterfaceC8635b interfaceC8635b) {
            this.f81464a = interfaceC8635b;
        }

        private void i(SQLiteDatabase sQLiteDatabase, j jVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k.b(jVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(jVar.f81450a));
            contentValues.put("key", jVar.f81451b);
            contentValues.put("metadata", byteArray);
            String str = this.f81467d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        private void j(SQLiteDatabase sQLiteDatabase) throws C8634a {
            String str = this.f81466c;
            str.getClass();
            o3.d.b(sQLiteDatabase, 1, str, 1);
            String str2 = this.f81467d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f81467d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // q3.k.c
        public final void a(long j11) {
            String hexString = Long.toHexString(j11);
            this.f81466c = hexString;
            this.f81467d = Nk.a.b("ExoPlayerCacheIndex", hexString);
        }

        @Override // q3.k.c
        public final void b(HashMap<String, j> hashMap) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f81464a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    Iterator<j> it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f81465b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } catch (SQLException e11) {
                throw new C8634a(e11);
            }
        }

        @Override // q3.k.c
        public final void c(j jVar, boolean z11) {
            SparseArray<j> sparseArray = this.f81465b;
            int i11 = jVar.f81450a;
            if (z11) {
                sparseArray.delete(i11);
            } else {
                sparseArray.put(i11, null);
            }
        }

        @Override // q3.k.c
        public final boolean d() throws C8634a {
            try {
                SQLiteDatabase readableDatabase = this.f81464a.getReadableDatabase();
                String str = this.f81466c;
                str.getClass();
                return o3.d.a(readableDatabase, 1, str) != -1;
            } catch (SQLException e11) {
                throw new C8634a(e11);
            }
        }

        @Override // q3.k.c
        public final void e(HashMap<String, j> hashMap) throws IOException {
            SparseArray<j> sparseArray = this.f81465b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f81464a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    try {
                        j valueAt = sparseArray.valueAt(i11);
                        if (valueAt == null) {
                            int keyAt = sparseArray.keyAt(i11);
                            String str = this.f81467d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            i(writableDatabase, valueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e11) {
                throw new C8634a(e11);
            }
        }

        @Override // q3.k.c
        public final void f(j jVar) {
            this.f81465b.put(jVar.f81450a, jVar);
        }

        @Override // q3.k.c
        public final void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) throws IOException {
            InterfaceC8635b interfaceC8635b = this.f81464a;
            G10.a.h(this.f81465b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = interfaceC8635b.getReadableDatabase();
                String str = this.f81466c;
                str.getClass();
                if (o3.d.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = interfaceC8635b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        j(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                SQLiteDatabase readableDatabase2 = interfaceC8635b.getReadableDatabase();
                String str2 = this.f81467d;
                str2.getClass();
                Cursor query = readableDatabase2.query(str2, f81463e, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        int i11 = query.getInt(0);
                        String string = query.getString(1);
                        string.getClass();
                        hashMap.put(string, new j(i11, string, k.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                        sparseArray.put(i11, string);
                    } finally {
                    }
                }
                query.close();
            } catch (SQLiteException e11) {
                hashMap.clear();
                sparseArray.clear();
                throw new C8634a(e11);
            }
        }

        @Override // q3.k.c
        public final void h() throws C8634a {
            InterfaceC8635b interfaceC8635b = this.f81464a;
            String str = this.f81466c;
            str.getClass();
            try {
                String concat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = interfaceC8635b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i11 = o3.d.f77630a;
                    try {
                        if (N.e0(writableDatabase, "ExoPlayerVersions")) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e11) {
                        throw new C8634a(e11);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e12) {
                throw new C8634a(e12);
            }
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Cipher f81468a = null;

        /* renamed from: b, reason: collision with root package name */
        private final SecretKeySpec f81469b = null;

        /* renamed from: c, reason: collision with root package name */
        private final C8059a f81470c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f81471d;

        /* renamed from: e, reason: collision with root package name */
        private o f81472e;

        public b(File file) {
            this.f81470c = new C8059a(file);
        }

        private static int i(j jVar, int i11) {
            int hashCode = jVar.f81451b.hashCode() + (jVar.f81450a * 31);
            if (i11 < 2) {
                long c11 = jVar.d().c();
                return (hashCode * 31) + ((int) (c11 ^ (c11 >>> 32)));
            }
            return jVar.d().hashCode() + (hashCode * 31);
        }

        private static j j(int i11, DataInputStream dataInputStream) throws IOException {
            m a11;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i11 < 2) {
                long readLong = dataInputStream.readLong();
                l lVar = new l();
                l.c(lVar, readLong);
                a11 = m.f81475c.a(lVar);
            } else {
                a11 = k.a(dataInputStream);
            }
            return new j(readInt, readUTF, a11);
        }

        @Override // q3.k.c
        public final void a(long j11) {
        }

        @Override // q3.k.c
        public final void b(HashMap<String, j> hashMap) throws IOException {
            DataOutputStream dataOutputStream;
            C8059a c8059a = this.f81470c;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream e11 = c8059a.e();
                o oVar = this.f81472e;
                if (oVar == null) {
                    this.f81472e = new o(e11);
                } else {
                    oVar.c(e11);
                }
                dataOutputStream = new DataOutputStream(this.f81472e);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(hashMap.size());
                int i11 = 0;
                for (j jVar : hashMap.values()) {
                    dataOutputStream.writeInt(jVar.f81450a);
                    dataOutputStream.writeUTF(jVar.f81451b);
                    k.b(jVar.d(), dataOutputStream);
                    i11 += i(jVar, 2);
                }
                dataOutputStream.writeInt(i11);
                c8059a.b(dataOutputStream);
                int i12 = N.f74289a;
                this.f81471d = false;
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream2 = dataOutputStream;
                N.g(dataOutputStream2);
                throw th;
            }
        }

        @Override // q3.k.c
        public final void c(j jVar, boolean z11) {
            this.f81471d = true;
        }

        @Override // q3.k.c
        public final boolean d() {
            return this.f81470c.c();
        }

        @Override // q3.k.c
        public final void e(HashMap<String, j> hashMap) throws IOException {
            if (this.f81471d) {
                b(hashMap);
            }
        }

        @Override // q3.k.c
        public final void f(j jVar) {
            this.f81471d = true;
        }

        @Override // q3.k.c
        public final void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) {
            G10.a.h(!this.f81471d);
            C8059a c8059a = this.f81470c;
            if (c8059a.c()) {
                DataInputStream dataInputStream = null;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(c8059a.d());
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int readInt = dataInputStream2.readInt();
                        if (readInt >= 0 && readInt <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                Cipher cipher = this.f81468a;
                                if (cipher != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.f81469b;
                                        int i11 = N.f74289a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    } catch (InvalidAlgorithmParameterException e11) {
                                        e = e11;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e12) {
                                        e = e12;
                                        throw new IllegalStateException(e);
                                    }
                                }
                            }
                            int readInt2 = dataInputStream2.readInt();
                            int i12 = 0;
                            for (int i13 = 0; i13 < readInt2; i13++) {
                                j j11 = j(readInt, dataInputStream2);
                                String str = j11.f81451b;
                                hashMap.put(str, j11);
                                sparseArray.put(j11.f81450a, str);
                                i12 += i(j11, readInt);
                            }
                            int readInt3 = dataInputStream2.readInt();
                            boolean z11 = dataInputStream2.read() == -1;
                            if (readInt3 == i12 && z11) {
                                N.g(dataInputStream2);
                                return;
                            }
                        }
                        N.g(dataInputStream2);
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            N.g(dataInputStream);
                        }
                        hashMap.clear();
                        sparseArray.clear();
                        c8059a.a();
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            N.g(dataInputStream);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                }
                hashMap.clear();
                sparseArray.clear();
                c8059a.a();
            }
        }

        @Override // q3.k.c
        public final void h() {
            this.f81470c.a();
        }
    }

    private interface c {
        void a(long j11);

        void b(HashMap<String, j> hashMap) throws IOException;

        void c(j jVar, boolean z11);

        boolean d() throws IOException;

        void e(HashMap<String, j> hashMap) throws IOException;

        void f(j jVar);

        void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) throws IOException;

        void h() throws IOException;
    }

    public k(InterfaceC8635b interfaceC8635b, File file) {
        a aVar = interfaceC8635b != null ? new a(interfaceC8635b) : null;
        b bVar = new b(new File(file, "cached_content_index.exi"));
        if (aVar != null) {
            this.f81461e = aVar;
            this.f81462f = bVar;
        } else {
            int i11 = N.f74289a;
            this.f81461e = bVar;
            this.f81462f = aVar;
        }
    }

    static m a(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < readInt; i11++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(Ej.b.a(readInt2, "Invalid value size: "));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = N.f74291c;
            int i12 = 0;
            while (i12 != readInt2) {
                int i13 = i12 + min;
                bArr = Arrays.copyOf(bArr, i13);
                dataInputStream.readFully(bArr, i12, min);
                min = Math.min(readInt2 - i13, 10485760);
                i12 = i13;
            }
            hashMap.put(readUTF, bArr);
        }
        return new m(hashMap);
    }

    static void b(m mVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> b11 = mVar.b();
        dataOutputStream.writeInt(b11.size());
        for (Map.Entry<String, byte[]> entry : b11) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final void c(String str, l lVar) {
        j g10 = g(str);
        if (g10.b(lVar)) {
            this.f81461e.f(g10);
        }
    }

    public final j d(String str) {
        return this.f81457a.get(str);
    }

    public final Collection<j> e() {
        return Collections.unmodifiableCollection(this.f81457a.values());
    }

    public final String f(int i11) {
        return this.f81458b.get(i11);
    }

    public final j g(String str) {
        HashMap<String, j> hashMap = this.f81457a;
        j jVar = hashMap.get(str);
        if (jVar != null) {
            return jVar;
        }
        SparseArray<String> sparseArray = this.f81458b;
        int size = sparseArray.size();
        int i11 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i11 < size && i11 == sparseArray.keyAt(i11)) {
                i11++;
            }
            keyAt = i11;
        }
        j jVar2 = new j(keyAt, str, m.f81475c);
        hashMap.put(str, jVar2);
        sparseArray.put(keyAt, str);
        this.f81460d.put(keyAt, true);
        this.f81461e.f(jVar2);
        return jVar2;
    }

    public final void h(long j11) throws IOException {
        c cVar;
        c cVar2 = this.f81461e;
        cVar2.a(j11);
        c cVar3 = this.f81462f;
        if (cVar3 != null) {
            cVar3.a(j11);
        }
        boolean d11 = cVar2.d();
        SparseArray<String> sparseArray = this.f81458b;
        HashMap<String, j> hashMap = this.f81457a;
        if (d11 || (cVar = this.f81462f) == null || !cVar.d()) {
            cVar2.g(hashMap, sparseArray);
        } else {
            this.f81462f.g(hashMap, sparseArray);
            cVar2.b(hashMap);
        }
        c cVar4 = this.f81462f;
        if (cVar4 != null) {
            cVar4.h();
            this.f81462f = null;
        }
    }

    public final void i(String str) {
        HashMap<String, j> hashMap = this.f81457a;
        j jVar = hashMap.get(str);
        if (jVar != null && jVar.g() && jVar.i()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = this.f81460d;
            int i11 = jVar.f81450a;
            boolean z11 = sparseBooleanArray.get(i11);
            this.f81461e.c(jVar, z11);
            SparseArray<String> sparseArray = this.f81458b;
            if (z11) {
                sparseArray.remove(i11);
                sparseBooleanArray.delete(i11);
            } else {
                sparseArray.put(i11, null);
                this.f81459c.put(i11, true);
            }
        }
    }

    public final void j() {
        Iterator it = A.u(this.f81457a.keySet()).iterator();
        while (it.hasNext()) {
            i((String) it.next());
        }
    }

    public final void k() throws IOException {
        this.f81461e.e(this.f81457a);
        SparseBooleanArray sparseBooleanArray = this.f81459c;
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f81458b.remove(sparseBooleanArray.keyAt(i11));
        }
        sparseBooleanArray.clear();
        this.f81460d.clear();
    }
}
