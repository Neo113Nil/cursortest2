package r6;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9179e {

    /* renamed from: c, reason: collision with root package name */
    public static final C9179e f82934c = new C9179e(a.none, null);

    /* renamed from: d, reason: collision with root package name */
    public static final C9179e f82935d = new C9179e(a.xMidYMid, b.meet);

    /* renamed from: a, reason: collision with root package name */
    private a f82936a;

    /* renamed from: b, reason: collision with root package name */
    private b f82937b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.e$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a none;
        public static final a xMaxYMax;
        public static final a xMaxYMid;
        public static final a xMaxYMin;
        public static final a xMidYMax;
        public static final a xMidYMid;
        public static final a xMidYMin;
        public static final a xMinYMax;
        public static final a xMinYMid;
        public static final a xMinYMin;

        static {
            a aVar = new a(DevicePublicKeyStringDef.NONE, 0);
            none = aVar;
            a aVar2 = new a("xMinYMin", 1);
            xMinYMin = aVar2;
            a aVar3 = new a("xMidYMin", 2);
            xMidYMin = aVar3;
            a aVar4 = new a("xMaxYMin", 3);
            xMaxYMin = aVar4;
            a aVar5 = new a("xMinYMid", 4);
            xMinYMid = aVar5;
            a aVar6 = new a("xMidYMid", 5);
            xMidYMid = aVar6;
            a aVar7 = new a("xMaxYMid", 6);
            xMaxYMid = aVar7;
            a aVar8 = new a("xMinYMax", 7);
            xMinYMax = aVar8;
            a aVar9 = new a("xMidYMax", 8);
            xMidYMax = aVar9;
            a aVar10 = new a("xMaxYMax", 9);
            xMaxYMax = aVar10;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.e$b */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b meet;
        public static final b slice;

        static {
            b bVar = new b("meet", 0);
            meet = bVar;
            b bVar2 = new b("slice", 1);
            slice = bVar2;
            $VALUES = new b[]{bVar, bVar2};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    C9179e(a aVar, b bVar) {
        this.f82936a = aVar;
        this.f82937b = bVar;
    }

    public final a a() {
        return this.f82936a;
    }

    public final b b() {
        return this.f82937b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9179e.class != obj.getClass()) {
            return false;
        }
        C9179e c9179e = (C9179e) obj;
        return this.f82936a == c9179e.f82936a && this.f82937b == c9179e.f82937b;
    }

    public final String toString() {
        return this.f82936a + " " + this.f82937b;
    }
}
