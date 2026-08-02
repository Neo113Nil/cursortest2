package co.nstant.in.cbor.decoder;

import g3.C4319a;
import g3.C4320b;
import h3.C4446o;
import h3.C4449r;
import h3.EnumC4447p;
import h3.EnumC4450s;
import java.io.InputStream;

/* loaded from: classes.dex */
public class i extends co.nstant.in.cbor.decoder.a {

    /* renamed from: d, reason: collision with root package name */
    public final e f27897d;

    /* renamed from: e, reason: collision with root package name */
    public final h f27898e;

    /* renamed from: f, reason: collision with root package name */
    public final d f27899f;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$co$nstant$in$cbor$model$SimpleValueType;
        static final /* synthetic */ int[] $SwitchMap$co$nstant$in$cbor$model$SpecialType;

        static {
            int[] iArr = new int[EnumC4450s.values().length];
            $SwitchMap$co$nstant$in$cbor$model$SpecialType = iArr;
            try {
                iArr[EnumC4450s.BREAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.SIMPLE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.IEEE_754_HALF_PRECISION_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.IEEE_754_SINGLE_PRECISION_FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.IEEE_754_DOUBLE_PRECISION_FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.SIMPLE_VALUE_NEXT_BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.UNALLOCATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC4447p.values().length];
            $SwitchMap$co$nstant$in$cbor$model$SimpleValueType = iArr2;
            try {
                iArr2[EnumC4447p.FALSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SimpleValueType[EnumC4447p.TRUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SimpleValueType[EnumC4447p.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SimpleValueType[EnumC4447p.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SimpleValueType[EnumC4447p.UNALLOCATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$SimpleValueType[EnumC4447p.RESERVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public i(C4319a c4319a, InputStream inputStream) {
        super(c4319a, inputStream);
        this.f27897d = new e(c4319a, inputStream);
        this.f27898e = new h(c4319a, inputStream);
        this.f27899f = new d(c4319a, inputStream);
    }

    public C4449r g(int i10) {
        switch (a.$SwitchMap$co$nstant$in$cbor$model$SpecialType[EnumC4450s.a(i10).ordinal()]) {
            case 1:
                return C4449r.f47680d;
            case 2:
                int i11 = a.$SwitchMap$co$nstant$in$cbor$model$SimpleValueType[EnumC4447p.b(i10).ordinal()];
                if (i11 == 1) {
                    return C4446o.f47667g;
                }
                if (i11 == 2) {
                    return C4446o.f47668h;
                }
                if (i11 == 3) {
                    return C4446o.f47669i;
                }
                if (i11 == 4) {
                    return C4446o.f47670j;
                }
                if (i11 == 5) {
                    return new C4446o(i10 & 31);
                }
                throw new C4320b("Not implemented");
            case 3:
                return this.f27897d.g(i10);
            case 4:
                return this.f27898e.g(i10);
            case 5:
                return this.f27899f.g(i10);
            case 6:
                return new C4446o(e());
            default:
                throw new C4320b("Not implemented");
        }
    }
}
