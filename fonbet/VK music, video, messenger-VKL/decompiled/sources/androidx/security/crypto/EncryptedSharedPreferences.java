package androidx.security.crypto;

import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.crypto.tink.KeyTemplate;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.GenericDeclaration;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.b51;
import xsna.f61;
import xsna.fo8;
import xsna.g61;
import xsna.hey;
import xsna.i5m;
import xsna.j46;
import xsna.p61;
import xsna.q61;
import xsna.xlg0;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    public final SharedPreferences a;
    public final ArrayList b = new ArrayList();
    public final String c;
    public final b51 d;
    public final i5m e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class PrefKeyEncryptionScheme {
        private static final /* synthetic */ PrefKeyEncryptionScheme[] $VALUES;
        public static final PrefKeyEncryptionScheme AES256_SIV;
        private final KeyTemplate mDeterministicAeadKeyTemplate;

        static {
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            p61.b s = p61.s();
            s.l();
            p61.q((p61) s.c);
            p61 j = s.j();
            hey.b[] bVarArr = {new q61(i5m.class)};
            HashMap hashMap = new HashMap();
            hey.b bVar = bVarArr[0];
            Class<PrimitiveT> cls = bVar.a;
            if (hashMap.containsKey(cls)) {
                throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls, bVar);
            GenericDeclaration genericDeclaration = bVarArr[0].a;
            Collections.unmodifiableMap(hashMap);
            PrefKeyEncryptionScheme prefKeyEncryptionScheme = new PrefKeyEncryptionScheme(KeyTemplate.a("type.googleapis.com/google.crypto.tink.AesSivKey", j.toByteArray(), outputPrefixType));
            AES256_SIV = prefKeyEncryptionScheme;
            $VALUES = new PrefKeyEncryptionScheme[]{prefKeyEncryptionScheme};
        }

        public PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        public static PrefKeyEncryptionScheme valueOf(String str) {
            return (PrefKeyEncryptionScheme) Enum.valueOf(PrefKeyEncryptionScheme.class, str);
        }

        public static PrefKeyEncryptionScheme[] values() {
            return (PrefKeyEncryptionScheme[]) $VALUES.clone();
        }

        public final KeyTemplate h() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class PrefValueEncryptionScheme {
        private static final /* synthetic */ PrefValueEncryptionScheme[] $VALUES;
        public static final PrefValueEncryptionScheme AES256_GCM;
        private final KeyTemplate mAeadKeyTemplate;

        static {
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            f61.b s = f61.s();
            s.l();
            f61.q((f61) s.c);
            f61 j = s.j();
            hey.b[] bVarArr = {new g61(b51.class)};
            HashMap hashMap = new HashMap();
            hey.b bVar = bVarArr[0];
            Class<PrimitiveT> cls = bVar.a;
            if (hashMap.containsKey(cls)) {
                throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls, bVar);
            GenericDeclaration genericDeclaration = bVarArr[0].a;
            Collections.unmodifiableMap(hashMap);
            PrefValueEncryptionScheme prefValueEncryptionScheme = new PrefValueEncryptionScheme(KeyTemplate.a("type.googleapis.com/google.crypto.tink.AesGcmKey", j.toByteArray(), outputPrefixType));
            AES256_GCM = prefValueEncryptionScheme;
            $VALUES = new PrefValueEncryptionScheme[]{prefValueEncryptionScheme};
        }

        public PrefValueEncryptionScheme(KeyTemplate keyTemplate) {
            this.mAeadKeyTemplate = keyTemplate;
        }

        public static PrefValueEncryptionScheme valueOf(String str) {
            return (PrefValueEncryptionScheme) Enum.valueOf(PrefValueEncryptionScheme.class, str);
        }

        public static PrefValueEncryptionScheme[] values() {
            return (PrefValueEncryptionScheme[]) $VALUES.clone();
        }

        public final KeyTemplate h() {
            return this.mAeadKeyTemplate;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes12.dex */
    public static final class b implements SharedPreferences.Editor {
        public final EncryptedSharedPreferences a;
        public final SharedPreferences.Editor b;
        public final AtomicBoolean d = new AtomicBoolean(false);
        public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

        public b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.a = encryptedSharedPreferences;
            this.b = editor;
        }

        public final void a() {
            if (this.d.getAndSet(false)) {
                EncryptedSharedPreferences encryptedSharedPreferences = this.a;
                for (String str : ((HashMap) encryptedSharedPreferences.getAll()).keySet()) {
                    if (!this.c.contains(str) && !EncryptedSharedPreferences.c(str)) {
                        this.b.remove(encryptedSharedPreferences.a(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.b.apply();
            b();
            this.c.clear();
        }

        public final void b() {
            EncryptedSharedPreferences encryptedSharedPreferences = this.a;
            Iterator it = encryptedSharedPreferences.b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(encryptedSharedPreferences, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.c(str)) {
                throw new SecurityException(fo8.a(str, " is a reserved key for the encryption keyset."));
            }
            this.c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a = encryptedSharedPreferences.a(str);
                try {
                    Pair pair = new Pair(a, new String(j46.b(encryptedSharedPreferences.d.a(bArr, a.getBytes(StandardCharsets.UTF_8))), C.ASCII_NAME));
                    this.b.putString((String) pair.first, (String) pair.second);
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putBoolean(@Nullable String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.h());
            allocate.put(z ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putFloat(@Nullable String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.h());
            allocate.putFloat(f);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putInt(@Nullable String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.h());
            allocate.putInt(i);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putLong(@Nullable String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.h());
            allocate.putLong(j);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putString(@Nullable String str, @Nullable String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.h());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putStringSet(@Nullable String str, @Nullable Set<String> set) {
            Set<String> set2 = set;
            if (set == null) {
                ArraySet arraySet = new ArraySet();
                arraySet.add("__NULL__");
                set2 = arraySet;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator<String> it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.h());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor remove(@Nullable String str) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.c(str)) {
                throw new SecurityException(fo8.a(str, " is a reserved key for the encryption keyset."));
            }
            this.b.remove(encryptedSharedPreferences.a(str));
            this.c.remove(str);
            return this;
        }
    }

    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        c(int i) {
            this.mId = i;
        }

        public final int h() {
            return this.mId;
        }
    }

    public EncryptedSharedPreferences(@NonNull String str, @NonNull SharedPreferences sharedPreferences, @NonNull b51 b51Var, @NonNull i5m i5mVar) {
        this.c = str;
        this.a = sharedPreferences;
        this.d = b51Var;
        this.e = i5mVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(j46.b(this.e.b(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes())), C.ASCII_NAME);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    public final Object b(String str) {
        if (c(str)) {
            throw new SecurityException(fo8.a(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String a2 = a(str);
            String string = this.a.getString(a2, null);
            if (string != null) {
                byte[] a3 = j46.a(string);
                b51 b51Var = this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(b51Var.b(a3, a2.getBytes(charset)));
                wrap.position(0);
                int i = wrap.getInt();
                switch (a.a[(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : c.BOOLEAN : c.FLOAT : c.LONG : c.INT : c.STRING_SET : c.STRING).ordinal()]) {
                    case 1:
                        int i2 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i2);
                        String charBuffer = charset.decode(slice).toString();
                        if (!charBuffer.equals("__NULL__")) {
                            return charBuffer;
                        }
                        break;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        return Boolean.valueOf(wrap.get() != 0);
                    case 6:
                        ArraySet arraySet = new ArraySet();
                        while (wrap.hasRemaining()) {
                            int i3 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i3);
                            wrap.position(wrap.position() + i3);
                            arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                            return arraySet;
                        }
                        break;
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(@Nullable String str) {
        if (c(str)) {
            throw new SecurityException(fo8.a(str, " is a reserved key for the encryption keyset."));
        }
        return this.a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public final SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.e.a(j46.a(entry.getKey()), this.c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, b(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(@Nullable String str, boolean z) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Boolean)) ? z : ((Boolean) b2).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(@Nullable String str, float f) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Float)) ? f : ((Float) b2).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(@Nullable String str, int i) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Integer)) ? i : ((Integer) b2).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(@Nullable String str, long j) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Long)) ? j : ((Long) b2).longValue();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(@Nullable String str, @Nullable String str2) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof String)) ? str2 : (String) b2;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(@Nullable String str, @Nullable Set<String> set) {
        Object b2 = b(str);
        Set<String> arraySet = b2 instanceof Set ? (Set) b2 : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
