package y1;

import Sc.o;
import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10822c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f105902a;

    /* renamed from: b, reason: collision with root package name */
    private final int f105903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10820a[] f105904c;

    /* renamed from: d, reason: collision with root package name */
    private int f105905d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final float[] f105906e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final float[] f105907f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f105908g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: y1.c$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Impulse;
        public static final a Lsq2;

        static {
            a aVar = new a("Lsq2", 0);
            Lsq2 = aVar;
            a aVar2 = new a("Impulse", 1);
            Impulse = aVar2;
            $VALUES = new a[]{aVar, aVar2};
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

    /* renamed from: y1.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105909a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105909a = iArr;
        }
    }

    public C10822c(a aVar) {
        this.f105902a = aVar;
        int i11 = b.f105909a[aVar.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            i12 = 3;
        }
        this.f105903b = i12;
        this.f105904c = new C10820a[20];
        this.f105906e = new float[20];
        this.f105907f = new float[20];
        this.f105908g = new float[3];
    }

    public final void a(float f7, long j11) {
        int i11 = (this.f105905d + 1) % 20;
        this.f105905d = i11;
        C10820a[] c10820aArr = this.f105904c;
        C10820a c10820a = c10820aArr[i11];
        if (c10820a == null) {
            c10820aArr[i11] = new C10820a(f7, j11);
        } else {
            c10820a.d(j11);
            c10820a.c(f7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b(float f7) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        float signum;
        float f11;
        float f12 = f7;
        if (f12 <= 0.0f) {
            A1.a.b("maximumVelocity should be a positive value. You specified=" + f12);
            throw null;
        }
        int i11 = this.f105905d;
        C10820a[] c10820aArr = this.f105904c;
        C10820a c10820a = c10820aArr[i11];
        if (c10820a != null) {
            int i12 = 0;
            C10820a c10820a2 = c10820a;
            while (true) {
                C10820a c10820a3 = c10820aArr[i11];
                aVar = this.f105902a;
                fArr = this.f105906e;
                fArr2 = this.f105907f;
                if (c10820a3 != null) {
                    float b11 = c10820a.b() - c10820a3.b();
                    float abs = Math.abs(c10820a3.b() - c10820a2.b());
                    C10820a c10820a4 = aVar != a.Lsq2 ? c10820a : c10820a3;
                    if (b11 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i12] = c10820a3.a();
                    fArr2[i12] = -b11;
                    if (i11 == 0) {
                        i11 = 20;
                    }
                    i11--;
                    i12++;
                    if (i12 >= 20) {
                        break;
                    }
                    c10820a2 = c10820a4;
                } else {
                    break;
                }
            }
            if (i12 >= this.f105903b) {
                int i13 = b.f105909a[aVar.ordinal()];
                if (i13 == 1) {
                    int i14 = i12 - 1;
                    float f13 = fArr2[i14];
                    float f14 = 0.0f;
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f15 = fArr2[i16];
                        if (f13 != f15) {
                            float f16 = (fArr[i15] - fArr[i16]) / (f13 - f15);
                            f14 += Math.abs(f16) * (f16 - (Math.signum(f14) * ((float) Math.sqrt(Math.abs(f14) * 2))));
                            if (i15 == i14) {
                                f14 *= 0.5f;
                            }
                        }
                        i15--;
                        f13 = f15;
                    }
                    signum = Math.signum(f14) * ((float) Math.sqrt(Math.abs(f14) * 2));
                } else {
                    if (i13 != 2) {
                        throw new o();
                    }
                    try {
                        float[] fArr3 = this.f105908g;
                        e.c(fArr2, fArr, i12, fArr3);
                        signum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        signum = 0.0f;
                    }
                }
                f11 = signum * 1000;
                if (f11 != 0.0f || Float.isNaN(f11)) {
                    return 0.0f;
                }
                if (f11 > 0.0f) {
                    f12 = -f12;
                    if (f11 >= f12) {
                        return f11;
                    }
                } else if (f11 <= f12) {
                    f12 = f11;
                }
                return f12;
            }
        }
        f11 = 0.0f;
        if (f11 != 0.0f) {
            return 0.0f;
        }
        if (f11 > 0.0f) {
        }
        return f12;
    }

    public final void c() {
        C7705l.x(r0, null, 0, this.f105904c.length);
        this.f105905d = 0;
    }
}
