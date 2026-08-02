package D2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.crypto.tink.aead.AbstractC3446a;
import com.google.crypto.tink.integration.android.a;
import com.google.crypto.tink.l;
import com.google.crypto.tink.m;
import com.google.crypto.tink.n;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import z.C6901b;

/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2491a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2492b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final String f2493c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2494d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.crypto.tink.a f2495e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.crypto.tink.e f2496f;

    /* renamed from: D2.a$a, reason: collision with other inner class name */
    public static final class SharedPreferencesEditorC0048a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final a f2497a;

        /* renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f2498b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f2500d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final List f2499c = new CopyOnWriteArrayList();

        public SharedPreferencesEditorC0048a(a aVar, SharedPreferences.Editor editor) {
            this.f2497a = aVar;
            this.f2498b = editor;
        }

        public final void a() {
            if (this.f2500d.getAndSet(false)) {
                for (String str : this.f2497a.getAll().keySet()) {
                    if (!this.f2499c.contains(str) && !this.f2497a.g(str)) {
                        this.f2498b.remove(this.f2497a.d(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f2498b.apply();
            b();
            this.f2499c.clear();
        }

        public final void b() {
            Iterator it = this.f2497a.f2492b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f2499c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f2497a, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.f2497a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f2499c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair e10 = this.f2497a.e(str, bArr);
                this.f2498b.putString((String) e10.first, (String) e10.second);
            } catch (GeneralSecurityException e11) {
                throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f2500d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f2498b.commit();
            } finally {
                b();
                this.f2499c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(b.BOOLEAN.c());
            allocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(b.FLOAT.c());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(b.INT.c());
            allocate.putInt(i10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(b.LONG.c());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(b.STRING.c());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new C6901b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(b.STRING_SET.c());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f2497a.g(str)) {
                this.f2498b.remove(this.f2497a.d(str));
                this.f2499c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    public enum b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: a, reason: collision with root package name */
        public final int f2507a;

        b(int i10) {
            this.f2507a = i10;
        }

        public static b b(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int c() {
            return this.f2507a;
        }
    }

    public enum c {
        AES256_SIV("AES256_SIV");


        /* renamed from: a, reason: collision with root package name */
        public final String f2509a;

        c(String str) {
            this.f2509a = str;
        }

        public l b() {
            return m.a(this.f2509a);
        }
    }

    public enum d {
        AES256_GCM("AES256_GCM");


        /* renamed from: a, reason: collision with root package name */
        public final String f2511a;

        d(String str) {
            this.f2511a = str;
        }

        public l b() {
            return m.a(this.f2511a);
        }
    }

    public a(String str, String str2, SharedPreferences sharedPreferences, com.google.crypto.tink.a aVar, com.google.crypto.tink.e eVar) {
        this.f2493c = str;
        this.f2491a = sharedPreferences;
        this.f2494d = str2;
        this.f2495e = aVar;
        this.f2496f = eVar;
    }

    public static SharedPreferences a(Context context, String str, D2.c cVar, c cVar2, d dVar) {
        return b(str, cVar.a(), context, cVar2, dVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, c cVar, d dVar) {
        Ya.b.a();
        AbstractC3446a.b();
        Context applicationContext = context.getApplicationContext();
        n d10 = new a.b().l(cVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n d11 = new a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (com.google.crypto.tink.a) d11.k(com.google.crypto.tink.a.class), (com.google.crypto.tink.e) d10.k(com.google.crypto.tink.e.class));
    }

    public String c(String str) {
        try {
            String str2 = new String(this.f2496f.b(cb.e.a(str, 0), this.f2493c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f2491a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return cb.e.d(this.f2496f.a(str.getBytes(StandardCharsets.UTF_8), this.f2493c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    public Pair e(String str, byte[] bArr) {
        String d10 = d(str);
        return new Pair(d10, cb.e.d(this.f2495e.a(bArr, d10.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0048a(this, this.f2491a.edit());
    }

    public final Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d10 = d(str);
            String string = this.f2491a.getString(d10, null);
            if (string == null) {
                return null;
            }
            byte[] a10 = cb.e.a(string, 0);
            com.google.crypto.tink.a aVar = this.f2495e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a10, d10.getBytes(charset)));
            wrap.position(0);
            int i10 = wrap.getInt();
            b b10 = b.b(i10);
            if (b10 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            int ordinal = b10.ordinal();
            if (ordinal == 0) {
                int i11 = wrap.getInt();
                ByteBuffer slice = wrap.slice();
                wrap.limit(i11);
                String charBuffer = charset.decode(slice).toString();
                if (charBuffer.equals("__NULL__")) {
                    return null;
                }
                return charBuffer;
            }
            if (ordinal == 1) {
                C6901b c6901b = new C6901b();
                while (wrap.hasRemaining()) {
                    int i12 = wrap.getInt();
                    ByteBuffer slice2 = wrap.slice();
                    slice2.limit(i12);
                    wrap.position(wrap.position() + i12);
                    c6901b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                }
                if (c6901b.size() == 1 && "__NULL__".equals(c6901b.k(0))) {
                    return null;
                }
                return c6901b;
            }
            if (ordinal == 2) {
                return Integer.valueOf(wrap.getInt());
            }
            if (ordinal == 3) {
                return Long.valueOf(wrap.getLong());
            }
            if (ordinal == 4) {
                return Float.valueOf(wrap.getFloat());
            }
            if (ordinal == 5) {
                return Boolean.valueOf(wrap.get() != 0);
            }
            throw new SecurityException("Unhandled type for encrypted pref value: " + b10);
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f2491a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c10 = c(entry.getKey());
                hashMap.put(c10, f(c10));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object f10 = f(str);
        return f10 instanceof Boolean ? ((Boolean) f10).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object f11 = f(str);
        return f11 instanceof Float ? ((Float) f11).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object f10 = f(str);
        return f10 instanceof Integer ? ((Integer) f10).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object f10 = f(str);
        return f10 instanceof Long ? ((Long) f10).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f10 = f(str);
        return f10 instanceof String ? (String) f10 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object f10 = f(str);
        Set c6901b = f10 instanceof Set ? (Set) f10 : new C6901b();
        return c6901b.size() > 0 ? c6901b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2492b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2492b.remove(onSharedPreferenceChangeListener);
    }
}
