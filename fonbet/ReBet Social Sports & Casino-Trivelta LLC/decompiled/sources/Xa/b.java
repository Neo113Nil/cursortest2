package Xa;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f13667a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f13668b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Xa.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0280b {
        private static final /* synthetic */ EnumC0280b[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0280b f13669a;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0280b f13670b;

        /* renamed from: Xa.b$b$a */
        public enum a extends EnumC0280b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // Xa.b.EnumC0280b
            public boolean a() {
                return !b.c();
            }
        }

        /* renamed from: Xa.b$b$b, reason: collision with other inner class name */
        public enum C0281b extends EnumC0280b {
            public C0281b(String str, int i10) {
                super(str, i10);
            }

            @Override // Xa.b.EnumC0280b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f13669a = aVar;
            C0281b c0281b = new C0281b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f13670b = c0281b;
            $VALUES = new EnumC0280b[]{aVar, c0281b};
        }

        public EnumC0280b(String str, int i10) {
        }

        public static EnumC0280b valueOf(String str) {
            return (EnumC0280b) Enum.valueOf(EnumC0280b.class, str);
        }

        public static EnumC0280b[] values() {
            return (EnumC0280b[]) $VALUES.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f13667a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return Xa.a.a() || f13668b.get();
    }
}
