package androidx.compose.ui.input.pointer.util;

import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.nuk;
import xsna.s200;
import xsna.uzw;
import xsna.zrp;

/* compiled from: VelocityTracker.kt */
/* loaded from: classes11.dex */
public final class VelocityTracker1D {
    public final boolean a;
    public final Strategy b;
    public final int c;
    public final nuk[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VelocityTracker.kt */
    public static final class Strategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Impulse;
        public static final Strategy Lsq2;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            Lsq2 = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            Impulse = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            $VALUES = strategyArr;
            $ENTRIES = new asp(strategyArr);
        }

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    /* compiled from: VelocityTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        this.a = z;
        this.b = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = a.$EnumSwitchMapping$0[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        this.c = i2;
        this.d = new nuk[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        nuk[] nukVarArr = this.d;
        nuk nukVar = nukVarArr[i];
        if (nukVar != null) {
            nukVar.a = j;
            nukVar.b = f;
        } else {
            nuk nukVar2 = new nuk();
            nukVar2.a = j;
            nukVar2.b = f;
            nukVarArr[i] = nukVar2;
        }
    }

    public final float b(float f) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float signum;
        float f3 = f;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uzw.b("maximumVelocity should be a positive value. You specified=" + f3);
        }
        int i2 = this.e;
        nuk[] nukVarArr = this.d;
        nuk nukVar = nukVarArr[i2];
        if (nukVar == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            nuk nukVar2 = nukVar;
            while (true) {
                nuk nukVar3 = nukVarArr[i2];
                boolean z2 = this.a;
                strategy = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (nukVar3 != null) {
                    long j = nukVar.a;
                    f2 = f4;
                    int i4 = i2;
                    long j2 = nukVar3.a;
                    float f5 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - nukVar2.a);
                    nukVar2 = (strategy == Strategy.Lsq2 || z) ? nukVar3 : nukVar;
                    if (f5 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = nukVar3.b;
                    fArr2[i3] = -f5;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f4 = f2;
                } else {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.c) {
                int i5 = a.$EnumSwitchMapping$0[strategy.ordinal()];
                if (i5 == i) {
                    int i6 = i3 - i;
                    float f6 = fArr2[i6];
                    int i7 = i6;
                    float f7 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f8 = fArr2[i8];
                        if (f6 != f8) {
                            float f9 = (z ? -fArr[i8] : fArr[i7] - fArr[i8]) / (f6 - f8);
                            f7 += Math.abs(f9) * (f9 - (Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2))));
                            if (i7 == i6) {
                                f7 *= 0.5f;
                            }
                        }
                        i7--;
                        f6 = f8;
                    }
                    signum = Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2));
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        float[] fArr3 = this.h;
                        s200.I(i3, fArr2, fArr, fArr3);
                        signum = fArr3[i];
                    } catch (IllegalArgumentException unused) {
                        signum = f2;
                    }
                }
                f4 = signum * 1000;
            } else {
                f4 = f2;
            }
        }
        if (f4 == f2 || Float.isNaN(f4)) {
            return f2;
        }
        if (f4 <= f2) {
            f3 = -f3;
            if (f4 >= f3) {
                return f4;
            }
        } else if (f4 <= f3) {
            f3 = f4;
        }
        return f3;
    }

    public VelocityTracker1D() {
        this(true, Strategy.Impulse);
    }
}
