package com.vk.auth.main;

import androidx.core.app.NotificationCompat;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.zrp;

/* compiled from: LibverifyFactorsForKazakhstan.kt */
/* loaded from: classes15.dex */
public final class LibverifyFactorsForKazakhstan {
    public final List<Factor> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LibverifyFactorsForKazakhstan.kt */
    public static final class Factor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Factor[] $VALUES;
        public static final Factor CALL;
        public static final Factor CALL_IN;
        public static final Factor CALL_UI;
        public static final a Companion;
        public static final Factor MOBILE_ID;
        public static final Factor PUSH;
        public static final Factor SMS;
        private final String factorName;

        /* compiled from: LibverifyFactorsForKazakhstan.kt */
        public static final class a {
        }

        static {
            Factor factor = new Factor("CALL_UI", 0, "call_ui");
            CALL_UI = factor;
            Factor factor2 = new Factor("CALL_IN", 1, "call_in");
            CALL_IN = factor2;
            Factor factor3 = new Factor("MOBILE_ID", 2, "mobile_id");
            MOBILE_ID = factor3;
            Factor factor4 = new Factor("SMS", 3, "sms");
            SMS = factor4;
            Factor factor5 = new Factor("CALL", 4, NotificationCompat.CATEGORY_CALL);
            CALL = factor5;
            Factor factor6 = new Factor("PUSH", 5, "push");
            PUSH = factor6;
            Factor[] factorArr = {factor, factor2, factor3, factor4, factor5, factor6};
            $VALUES = factorArr;
            $ENTRIES = new asp(factorArr);
            Companion = new a();
        }

        public Factor(String str, int i, String str2) {
            this.factorName = str2;
        }

        public static zrp<Factor> h() {
            return $ENTRIES;
        }

        public static Factor valueOf(String str) {
            return (Factor) Enum.valueOf(Factor.class, str);
        }

        public static Factor[] values() {
            return (Factor[]) $VALUES.clone();
        }

        public final String i() {
            return this.factorName;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibverifyFactorsForKazakhstan(List<? extends Factor> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LibverifyFactorsForKazakhstan) && epx.f(this.a, ((LibverifyFactorsForKazakhstan) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("LibverifyFactorsForKazakhstan(enabledFactors="), this.a);
    }
}
