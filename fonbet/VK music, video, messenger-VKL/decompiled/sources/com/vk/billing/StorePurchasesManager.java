package com.vk.billing;

import android.app.Activity;
import android.content.Context;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Map;
import xsna.ang;
import xsna.asp;
import xsna.gt8;
import xsna.mge0;
import xsna.nge0;
import xsna.qge0;
import xsna.zrp;

/* compiled from: StorePurchasesManager.kt */
/* loaded from: classes.dex */
public interface StorePurchasesManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StorePurchasesManager.kt */
    /* loaded from: classes15.dex */
    public static final class BillingAvailabilityStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BillingAvailabilityStatus[] $VALUES;
        public static final BillingAvailabilityStatus NOT_AUTHORIZED;
        public static final BillingAvailabilityStatus NOT_AVAILABLE;
        public static final BillingAvailabilityStatus NOT_INSTALLED;
        public static final BillingAvailabilityStatus READY;

        static {
            BillingAvailabilityStatus billingAvailabilityStatus = new BillingAvailabilityStatus("READY", 0);
            READY = billingAvailabilityStatus;
            BillingAvailabilityStatus billingAvailabilityStatus2 = new BillingAvailabilityStatus("NOT_AUTHORIZED", 1);
            NOT_AUTHORIZED = billingAvailabilityStatus2;
            BillingAvailabilityStatus billingAvailabilityStatus3 = new BillingAvailabilityStatus("NOT_INSTALLED", 2);
            NOT_INSTALLED = billingAvailabilityStatus3;
            BillingAvailabilityStatus billingAvailabilityStatus4 = new BillingAvailabilityStatus("NOT_AVAILABLE", 3);
            NOT_AVAILABLE = billingAvailabilityStatus4;
            BillingAvailabilityStatus[] billingAvailabilityStatusArr = {billingAvailabilityStatus, billingAvailabilityStatus2, billingAvailabilityStatus3, billingAvailabilityStatus4};
            $VALUES = billingAvailabilityStatusArr;
            $ENTRIES = new asp(billingAvailabilityStatusArr);
        }

        public BillingAvailabilityStatus() {
            throw null;
        }

        public static BillingAvailabilityStatus valueOf(String str) {
            return (BillingAvailabilityStatus) Enum.valueOf(BillingAvailabilityStatus.class, str);
        }

        public static BillingAvailabilityStatus[] values() {
            return (BillingAvailabilityStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StorePurchasesManager.kt */
    /* loaded from: classes15.dex */
    public static final class ProrationMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProrationMode[] $VALUES;
        public static final ProrationMode DEFERRED;
        public static final ProrationMode IMMEDIATE_AND_CHARGE_FULL_PRICE;
        public static final ProrationMode IMMEDIATE_AND_CHARGE_PRORATED_PRICE;
        public static final ProrationMode IMMEDIATE_WITHOUT_PRORATION;
        public static final ProrationMode IMMEDIATE_WITH_TIME_PRORATION;
        public static final ProrationMode UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY;

        static {
            ProrationMode prorationMode = new ProrationMode("UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY", 0);
            UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = prorationMode;
            ProrationMode prorationMode2 = new ProrationMode("IMMEDIATE_WITH_TIME_PRORATION", 1);
            IMMEDIATE_WITH_TIME_PRORATION = prorationMode2;
            ProrationMode prorationMode3 = new ProrationMode("IMMEDIATE_AND_CHARGE_PRORATED_PRICE", 2);
            IMMEDIATE_AND_CHARGE_PRORATED_PRICE = prorationMode3;
            ProrationMode prorationMode4 = new ProrationMode("IMMEDIATE_WITHOUT_PRORATION", 3);
            IMMEDIATE_WITHOUT_PRORATION = prorationMode4;
            ProrationMode prorationMode5 = new ProrationMode("DEFERRED", 4);
            DEFERRED = prorationMode5;
            ProrationMode prorationMode6 = new ProrationMode("IMMEDIATE_AND_CHARGE_FULL_PRICE", 5);
            IMMEDIATE_AND_CHARGE_FULL_PRICE = prorationMode6;
            ProrationMode[] prorationModeArr = {prorationMode, prorationMode2, prorationMode3, prorationMode4, prorationMode5, prorationMode6};
            $VALUES = prorationModeArr;
            $ENTRIES = new asp(prorationModeArr);
        }

        public ProrationMode() {
            throw null;
        }

        public static ProrationMode valueOf(String str) {
            return (ProrationMode) Enum.valueOf(ProrationMode.class, str);
        }

        public static ProrationMode[] values() {
            return (ProrationMode[]) $VALUES.clone();
        }
    }

    void b();

    q c(Context context);

    qge0 d(Activity activity, a aVar, mge0 mge0Var);

    <D extends mge0> void e(Map<String, ? extends D> map, b bVar);

    qge0 f(Activity activity, a aVar, mge0 mge0Var);

    qge0 g(Activity activity, ArrayList arrayList, ang.a aVar);

    <D extends mge0> void h(Map<String, ? extends D> map, b bVar);

    qge0 l(Activity activity, mge0 mge0Var, ProrationMode prorationMode, gt8 gt8Var);

    String m();

    /* compiled from: StorePurchasesManager.kt */
    /* loaded from: classes15.dex */
    public interface a<D extends mge0> {
        void c(D d, nge0 nge0Var);

        void d(D d);

        default void a() {
        }

        default void b() {
        }
    }

    /* compiled from: StorePurchasesManager.kt */
    /* loaded from: classes15.dex */
    public interface b {
        void c(mge0 mge0Var);

        default void a() {
        }

        default void b() {
        }

        default void d(int i) {
        }
    }
}
