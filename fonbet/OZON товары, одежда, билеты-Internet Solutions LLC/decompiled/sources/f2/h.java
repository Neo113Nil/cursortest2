package f2;

import java.util.Arrays;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f62478a;

    /* renamed from: e, reason: collision with root package name */
    public float f62482e;

    /* renamed from: i, reason: collision with root package name */
    a f62486i;

    /* renamed from: b, reason: collision with root package name */
    public int f62479b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f62480c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f62481d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62483f = false;

    /* renamed from: g, reason: collision with root package name */
    float[] f62484g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    float[] f62485h = new float[9];

    /* renamed from: j, reason: collision with root package name */
    C6402b[] f62487j = new C6402b[16];

    /* renamed from: k, reason: collision with root package name */
    int f62488k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f62489l = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CONSTANT;
        public static final a ERROR;
        public static final a SLACK;
        public static final a UNKNOWN;
        public static final a UNRESTRICTED;

        static {
            a aVar = new a("UNRESTRICTED", 0);
            UNRESTRICTED = aVar;
            a aVar2 = new a("CONSTANT", 1);
            CONSTANT = aVar2;
            a aVar3 = new a("SLACK", 2);
            SLACK = aVar3;
            a aVar4 = new a("ERROR", 3);
            ERROR = aVar4;
            a aVar5 = new a(FraudMonInfo.UNKNOWN, 4);
            UNKNOWN = aVar5;
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

    public h(a aVar) {
        this.f62486i = aVar;
    }

    public final void a(C6402b c6402b) {
        int i11 = 0;
        while (true) {
            int i12 = this.f62488k;
            if (i11 >= i12) {
                C6402b[] c6402bArr = this.f62487j;
                if (i12 >= c6402bArr.length) {
                    this.f62487j = (C6402b[]) Arrays.copyOf(c6402bArr, c6402bArr.length * 2);
                }
                C6402b[] c6402bArr2 = this.f62487j;
                int i13 = this.f62488k;
                c6402bArr2[i13] = c6402b;
                this.f62488k = i13 + 1;
                return;
            }
            if (this.f62487j[i11] == c6402b) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void b(C6402b c6402b) {
        int i11 = this.f62488k;
        int i12 = 0;
        while (i12 < i11) {
            if (this.f62487j[i12] == c6402b) {
                while (i12 < i11 - 1) {
                    C6402b[] c6402bArr = this.f62487j;
                    int i13 = i12 + 1;
                    c6402bArr[i12] = c6402bArr[i13];
                    i12 = i13;
                }
                this.f62488k--;
                return;
            }
            i12++;
        }
    }

    public final void c() {
        this.f62486i = a.UNKNOWN;
        this.f62481d = 0;
        this.f62479b = -1;
        this.f62480c = -1;
        this.f62482e = 0.0f;
        this.f62483f = false;
        int i11 = this.f62488k;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f62487j[i12] = null;
        }
        this.f62488k = 0;
        this.f62489l = 0;
        this.f62478a = false;
        Arrays.fill(this.f62485h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return this.f62479b - hVar.f62479b;
    }

    public final void d(C6404d c6404d, float f7) {
        this.f62482e = f7;
        this.f62483f = true;
        int i11 = this.f62488k;
        this.f62480c = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f62487j[i12].k(c6404d, this, false);
        }
        this.f62488k = 0;
    }

    public final void e(C6404d c6404d, C6402b c6402b) {
        int i11 = this.f62488k;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f62487j[i12].l(c6404d, c6402b, false);
        }
        this.f62488k = 0;
    }

    public final String toString() {
        return "" + this.f62479b;
    }
}
