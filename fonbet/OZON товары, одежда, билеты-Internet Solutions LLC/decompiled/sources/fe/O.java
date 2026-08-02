package fe;

import Nd.b;
import Nd.p;
import Nd.r;
import je.L0;
import org.jetbrains.annotations.NotNull;
import td.EnumC9812C;
import td.EnumC9840f;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final O f63176a = new O();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63177a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f63178b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f63179c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f63180d;

        static {
            int[] iArr = new int[Nd.j.values().length];
            try {
                iArr[Nd.j.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Nd.j.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Nd.j.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Nd.j.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f63177a = iArr;
            int[] iArr2 = new int[EnumC9812C.values().length];
            try {
                iArr2[EnumC9812C.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC9812C.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC9812C.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC9812C.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Nd.w.values().length];
            try {
                iArr3[Nd.w.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Nd.w.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Nd.w.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Nd.w.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Nd.w.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Nd.w.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[b.c.values().length];
            try {
                iArr4[b.c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[b.c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[b.c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[b.c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[b.c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[b.c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[b.c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f63178b = iArr4;
            int[] iArr5 = new int[EnumC9840f.values().length];
            try {
                iArr5[EnumC9840f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC9840f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC9840f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC9840f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC9840f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[EnumC9840f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr6 = new int[r.c.values().length];
            try {
                iArr6[r.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[r.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[r.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f63179c = iArr6;
            int[] iArr7 = new int[p.b.c.values().length];
            try {
                iArr7[p.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[p.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[p.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[p.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f63180d = iArr7;
            int[] iArr8 = new int[L0.values().length];
            try {
                iArr8[L0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[L0.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[L0.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
        }
    }

    @NotNull
    public static EnumC9812C a(Nd.j jVar) {
        int i11 = jVar == null ? -1 : a.f63177a[jVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? EnumC9812C.FINAL : EnumC9812C.SEALED : EnumC9812C.ABSTRACT : EnumC9812C.OPEN : EnumC9812C.FINAL;
    }
}
