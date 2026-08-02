package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$NetworkSignalInfo {

    @pmi0("signal")
    private final Signal signal;

    @pmi0("signal_ping")
    private final Integer signalPing;

    @pmi0("signal_strength")
    private final SignalStrength signalStrength;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Signal {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Signal[] $VALUES;

        @pmi0("CDMA")
        public static final Signal CDMA;

        @pmi0("CDMAEVDORev0")
        public static final Signal CDMAEVDOREV0;

        @pmi0("CDMAEVDORevA")
        public static final Signal CDMAEVDOREVA;

        @pmi0("CDMAEVDORevB")
        public static final Signal CDMAEVDOREVB;

        @pmi0("EDGE")
        public static final Signal EDGE;

        @pmi0("eHRPD")
        public static final Signal EHRPD;

        @pmi0("GPRS")
        public static final Signal GPRS;

        @pmi0("HSDPA")
        public static final Signal HSDPA;

        @pmi0("HSUPA")
        public static final Signal HSUPA;

        @pmi0("LTE")
        public static final Signal LTE;

        @pmi0("NR")
        public static final Signal NR;

        @pmi0(NativeAdContent.ViewTag.OTHER)
        public static final Signal OTHER;

        @pmi0(GrsBaseInfo.CountryCodeSource.UNKNOWN)
        public static final Signal UNKNOWN;

        @pmi0("WCDMA_UMTS")
        public static final Signal WCDMA_UMTS;

        @pmi0("WIFI")
        public static final Signal WIFI;

        static {
            Signal signal = new Signal(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = signal;
            Signal signal2 = new Signal(NativeAdContent.ViewTag.OTHER, 1);
            OTHER = signal2;
            Signal signal3 = new Signal("WIFI", 2);
            WIFI = signal3;
            Signal signal4 = new Signal("EDGE", 3);
            EDGE = signal4;
            Signal signal5 = new Signal("GPRS", 4);
            GPRS = signal5;
            Signal signal6 = new Signal("LTE", 5);
            LTE = signal6;
            Signal signal7 = new Signal("NR", 6);
            NR = signal7;
            Signal signal8 = new Signal("EHRPD", 7);
            EHRPD = signal8;
            Signal signal9 = new Signal("HSDPA", 8);
            HSDPA = signal9;
            Signal signal10 = new Signal("HSUPA", 9);
            HSUPA = signal10;
            Signal signal11 = new Signal("CDMA", 10);
            CDMA = signal11;
            Signal signal12 = new Signal("CDMAEVDOREV0", 11);
            CDMAEVDOREV0 = signal12;
            Signal signal13 = new Signal("CDMAEVDOREVA", 12);
            CDMAEVDOREVA = signal13;
            Signal signal14 = new Signal("CDMAEVDOREVB", 13);
            CDMAEVDOREVB = signal14;
            Signal signal15 = new Signal("WCDMA_UMTS", 14);
            WCDMA_UMTS = signal15;
            Signal[] signalArr = {signal, signal2, signal3, signal4, signal5, signal6, signal7, signal8, signal9, signal10, signal11, signal12, signal13, signal14, signal15};
            $VALUES = signalArr;
            $ENTRIES = new asp(signalArr);
        }

        private Signal(String str, int i) {
        }

        public static Signal valueOf(String str) {
            return (Signal) Enum.valueOf(Signal.class, str);
        }

        public static Signal[] values() {
            return (Signal[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public static final class SignalStrength {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SignalStrength[] $VALUES;
        public static final SignalStrength ACCEPTABLE_SIGNAL;
        public static final SignalStrength BAD_SIGNAL;
        public static final SignalStrength GOOD_SIGNAL;
        public static final SignalStrength IS_UNKNOWN;
        public static final SignalStrength NOT_AVAILABLE;
        public static final SignalStrength NO_SIGNAL;
        public static final SignalStrength VERY_GOOD_SIGNAL;
        private final int value;

        /* compiled from: SchemeStat.kt */
        public static final class Serializer implements uay<SignalStrength> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((SignalStrength) obj).value));
            }
        }

        static {
            SignalStrength signalStrength = new SignalStrength("NOT_AVAILABLE", 0, -1);
            NOT_AVAILABLE = signalStrength;
            SignalStrength signalStrength2 = new SignalStrength("IS_UNKNOWN", 1, 0);
            IS_UNKNOWN = signalStrength2;
            SignalStrength signalStrength3 = new SignalStrength("NO_SIGNAL", 2, 1);
            NO_SIGNAL = signalStrength3;
            SignalStrength signalStrength4 = new SignalStrength("BAD_SIGNAL", 3, 2);
            BAD_SIGNAL = signalStrength4;
            SignalStrength signalStrength5 = new SignalStrength("ACCEPTABLE_SIGNAL", 4, 3);
            ACCEPTABLE_SIGNAL = signalStrength5;
            SignalStrength signalStrength6 = new SignalStrength("GOOD_SIGNAL", 5, 4);
            GOOD_SIGNAL = signalStrength6;
            SignalStrength signalStrength7 = new SignalStrength("VERY_GOOD_SIGNAL", 6, 5);
            VERY_GOOD_SIGNAL = signalStrength7;
            SignalStrength[] signalStrengthArr = {signalStrength, signalStrength2, signalStrength3, signalStrength4, signalStrength5, signalStrength6, signalStrength7};
            $VALUES = signalStrengthArr;
            $ENTRIES = new asp(signalStrengthArr);
        }

        public SignalStrength(String str, int i, int i2) {
            this.value = i2;
        }

        public static SignalStrength valueOf(String str) {
            return (SignalStrength) Enum.valueOf(SignalStrength.class, str);
        }

        public static SignalStrength[] values() {
            return (SignalStrength[]) $VALUES.clone();
        }
    }

    public SchemeStat$NetworkSignalInfo(Signal signal, SignalStrength signalStrength, Integer num) {
        this.signal = signal;
        this.signalStrength = signalStrength;
        this.signalPing = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$NetworkSignalInfo)) {
            return false;
        }
        SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo = (SchemeStat$NetworkSignalInfo) obj;
        return this.signal == schemeStat$NetworkSignalInfo.signal && this.signalStrength == schemeStat$NetworkSignalInfo.signalStrength && epx.f(this.signalPing, schemeStat$NetworkSignalInfo.signalPing);
    }

    public final int hashCode() {
        int hashCode = this.signal.hashCode() * 31;
        SignalStrength signalStrength = this.signalStrength;
        int hashCode2 = (hashCode + (signalStrength == null ? 0 : signalStrength.hashCode())) * 31;
        Integer num = this.signalPing;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkSignalInfo(signal=");
        sb.append(this.signal);
        sb.append(", signalStrength=");
        sb.append(this.signalStrength);
        sb.append(", signalPing=");
        return uqi.b(sb, this.signalPing, ')');
    }

    public /* synthetic */ SchemeStat$NetworkSignalInfo(Signal signal, SignalStrength signalStrength, Integer num, int i, zcl zclVar) {
        this(signal, (i & 2) != 0 ? null : signalStrength, (i & 4) != 0 ? null : num);
    }
}
