package org.chromium.net.httpflags;

import B0.A0;
import com.google.protobuf.ByteString;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.chromium.net.httpflags.FlagValue;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f78710a;

    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78711a;

        static {
            int[] iArr = new int[FlagValue.ConstrainedValue.a.values().length];
            f78711a = iArr;
            try {
                iArr[FlagValue.ConstrainedValue.a.BOOL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78711a[FlagValue.ConstrainedValue.a.INT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78711a[FlagValue.ConstrainedValue.a.FLOAT_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78711a[FlagValue.ConstrainedValue.a.STRING_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78711a[FlagValue.ConstrainedValue.a.BYTES_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78711a[FlagValue.ConstrainedValue.a.VALUE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(HashMap hashMap) {
        this.f78710a = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] c(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i11 = 0; i11 < countTokens; i11++) {
                iArr[i11] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e11) {
            throw new IllegalArgumentException(A0.b("Unable to parse HTTP flags version string: `", str, "`"), e11);
        }
    }

    public static c d(Flags flags, String str, String str2) {
        vf.c.c("Cronet ResolvedFlags#resolve");
        int[] c11 = c(str2);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, FlagValue> entry : flags.getFlagsMap().entrySet()) {
            try {
                b a11 = b.a(entry.getValue(), str, c11);
                if (a11 != null) {
                    hashMap.put(entry.getKey(), a11);
                }
            } catch (RuntimeException e11) {
                throw new IllegalArgumentException(A0.b("Unable to resolve HTTP flag `", entry.getKey(), "`"), e11);
            }
        }
        return new c(hashMap);
    }

    public final Map<String, b> b() {
        return Collections.unmodifiableMap(this.f78710a);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Serializable f78712a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes10.dex */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a BOOL;
            public static final a BYTES;
            public static final a FLOAT;
            public static final a INT;
            public static final a STRING;

            static {
                a aVar = new a("BOOL", 0);
                BOOL = aVar;
                a aVar2 = new a("INT", 1);
                INT = aVar2;
                a aVar3 = new a("FLOAT", 2);
                FLOAT = aVar3;
                a aVar4 = new a("STRING", 3);
                STRING = aVar4;
                a aVar5 = new a("BYTES", 4);
                BYTES = aVar5;
                $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
            }

            private a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public b(boolean z11) {
            this.f78712a = Boolean.valueOf(z11);
        }

        static b a(FlagValue flagValue, String str, int[] iArr) {
            loop0: for (FlagValue.ConstrainedValue constrainedValue : flagValue.getConstrainedValuesList()) {
                if (!constrainedValue.hasAppId() || constrainedValue.getAppId().equals(str)) {
                    if (constrainedValue.hasMinVersion()) {
                        int[] c11 = c.c(constrainedValue.getMinVersion());
                        int i11 = 0;
                        while (i11 < Math.max(iArr.length, c11.length)) {
                            int i12 = i11 < iArr.length ? iArr[i11] : 0;
                            int i13 = i11 < c11.length ? c11[i11] : 0;
                            if (i12 > i13) {
                                break loop0;
                            }
                            if (i12 < i13) {
                                break;
                            }
                            i11++;
                        }
                    }
                    FlagValue.ConstrainedValue.a valueCase = constrainedValue.getValueCase();
                    switch (a.f78711a[valueCase.ordinal()]) {
                        case 1:
                            return new b(constrainedValue.getBoolValue());
                        case 2:
                            return new b(constrainedValue.getIntValue());
                        case 3:
                            return new b(constrainedValue.getFloatValue());
                        case 4:
                            return new b(constrainedValue.getStringValue());
                        case 5:
                            return new b(constrainedValue.getBytesValue());
                        case 6:
                            return null;
                        default:
                            throw new IllegalArgumentException("Flag value uses unknown value type ".concat(String.valueOf(valueCase)));
                    }
                }
            }
            return null;
        }

        private void b(a aVar) {
            a h11 = h();
            if (aVar != h11) {
                throw new IllegalStateException(Sh.b.c("Attempted to access flag value as ", String.valueOf(aVar), ", but actual type is ", String.valueOf(h11)));
            }
        }

        public final boolean c() {
            b(a.BOOL);
            return ((Boolean) this.f78712a).booleanValue();
        }

        public final ByteString d() {
            b(a.BYTES);
            return (ByteString) this.f78712a;
        }

        public final float e() {
            b(a.FLOAT);
            return ((Float) this.f78712a).floatValue();
        }

        public final long f() {
            b(a.INT);
            return ((Long) this.f78712a).longValue();
        }

        public final String g() {
            b(a.STRING);
            return (String) this.f78712a;
        }

        public final a h() {
            Serializable serializable = this.f78712a;
            if (serializable instanceof Boolean) {
                return a.BOOL;
            }
            if (serializable instanceof Long) {
                return a.INT;
            }
            if (serializable instanceof Float) {
                return a.FLOAT;
            }
            if (serializable instanceof String) {
                return a.STRING;
            }
            if (serializable instanceof ByteString) {
                return a.BYTES;
            }
            throw new IllegalStateException("Unexpected flag value type: ".concat(serializable.getClass().getName()));
        }

        public final String toString() {
            return this.f78712a.toString();
        }

        public b(long j11) {
            this.f78712a = Long.valueOf(j11);
        }

        public b(float f7) {
            this.f78712a = Float.valueOf(f7);
        }

        public b(String str) {
            this.f78712a = str;
        }

        public b(ByteString byteString) {
            this.f78712a = byteString;
        }
    }
}
