package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: net.time4j.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class EnumC5714g implements InterfaceC5728v {
    private static final /* synthetic */ EnumC5714g[] $VALUES;
    private static final long[] FACTORS;

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5714g f58143a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5714g f58144b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5714g f58145c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5714g f58146d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC5714g f58147e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC5714g f58148f;

    /* renamed from: net.time4j.g$a */
    public enum a extends EnumC5714g {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // net.time4j.InterfaceC5729w
        public char a() {
            return 'H';
        }

        @Override // oi.w
        public double getLength() {
            return 3600.0d;
        }
    }

    static {
        a aVar = new a("HOURS", 0);
        f58143a = aVar;
        EnumC5714g enumC5714g = new EnumC5714g("MINUTES", 1) { // from class: net.time4j.g.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'M';
            }

            @Override // oi.w
            public double getLength() {
                return 60.0d;
            }
        };
        f58144b = enumC5714g;
        EnumC5714g enumC5714g2 = new EnumC5714g("SECONDS", 2) { // from class: net.time4j.g.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'S';
            }

            @Override // oi.w
            public double getLength() {
                return 1.0d;
            }
        };
        f58145c = enumC5714g2;
        EnumC5714g enumC5714g3 = new EnumC5714g("MILLIS", 3) { // from class: net.time4j.g.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return '3';
            }

            @Override // oi.w
            public double getLength() {
                return 0.001d;
            }
        };
        f58146d = enumC5714g3;
        EnumC5714g enumC5714g4 = new EnumC5714g("MICROS", 4) { // from class: net.time4j.g.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return '6';
            }

            @Override // oi.w
            public double getLength() {
                return 1.0E-6d;
            }
        };
        f58147e = enumC5714g4;
        EnumC5714g enumC5714g5 = new EnumC5714g("NANOS", 5) { // from class: net.time4j.g.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return '9';
            }

            @Override // oi.w
            public double getLength() {
                return 1.0E-9d;
            }
        };
        f58148f = enumC5714g5;
        $VALUES = new EnumC5714g[]{aVar, enumC5714g, enumC5714g2, enumC5714g3, enumC5714g4, enumC5714g5};
        FACTORS = new long[]{1, 60, 3600, 3600000, 3600000000L, 3600000000000L};
    }

    public EnumC5714g(String str, int i10) {
    }

    public static EnumC5714g valueOf(String str) {
        return (EnumC5714g) Enum.valueOf(EnumC5714g.class, str);
    }

    public static EnumC5714g[] values() {
        return (EnumC5714g[]) $VALUES.clone();
    }

    @Override // oi.w
    public boolean b() {
        return false;
    }

    public long c(oi.K k10, oi.K k11) {
        return k10.F(k11, this);
    }

    public /* synthetic */ EnumC5714g(String str, int i10, a aVar) {
        this(str, i10);
    }
}
