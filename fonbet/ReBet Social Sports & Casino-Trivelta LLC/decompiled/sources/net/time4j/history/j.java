package net.time4j.history;

import li.AbstractC5469c;
import oi.InterfaceC5913i;

/* loaded from: classes5.dex */
public enum j implements InterfaceC5913i {
    BC,
    AD,
    HISPANIC,
    BYZANTINE,
    AB_URBE_CONDITA;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$history$HistoricEra;

        static {
            int[] iArr = new int[j.values().length];
            $SwitchMap$net$time4j$history$HistoricEra = iArr;
            try {
                iArr[j.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$history$HistoricEra[j.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$history$HistoricEra[j.HISPANIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$history$HistoricEra[j.BYZANTINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$history$HistoricEra[j.AB_URBE_CONDITA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int a(int i10) {
        try {
            int i11 = a.$SwitchMap$net$time4j$history$HistoricEra[ordinal()];
            if (i11 == 1) {
                return AbstractC5469c.l(1, i10);
            }
            if (i11 == 2) {
                return i10;
            }
            if (i11 == 3) {
                return AbstractC5469c.l(i10, 38);
            }
            if (i11 == 4) {
                return AbstractC5469c.l(i10, 5508);
            }
            if (i11 == 5) {
                return AbstractC5469c.l(i10, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i10);
        }
    }

    public int b(j jVar, int i10) {
        int a10 = jVar.a(i10);
        try {
            int i11 = a.$SwitchMap$net$time4j$history$HistoricEra[ordinal()];
            if (i11 == 1) {
                return AbstractC5469c.l(1, a10);
            }
            if (i11 == 2) {
                return a10;
            }
            if (i11 == 3) {
                return AbstractC5469c.e(a10, 38);
            }
            if (i11 == 4) {
                return AbstractC5469c.e(a10, 5508);
            }
            if (i11 == 5) {
                return AbstractC5469c.e(a10, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i10);
        }
    }
}
