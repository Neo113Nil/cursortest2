package com.vk.superapp.api.analytics;

import com.ironsource.O6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.asp;
import xsna.c5g;
import xsna.dgn0;
import xsna.drm0;
import xsna.e43;
import xsna.izi0;
import xsna.j5g;
import xsna.mgn0;
import xsna.q2z;
import xsna.qhn0;
import xsna.rgn0;
import xsna.zrp;

/* compiled from: RegistrationStatParamsFactory.kt */
/* loaded from: classes11.dex */
public final class RegistrationStatParamsFactory {
    public static RegistrationStatFlowType a;
    public static volatile String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RegistrationStatParamsFactory.kt */
    /* loaded from: classes6.dex */
    public static final class AnalyticsFlowSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnalyticsFlowSource[] $VALUES;
        public static final AnalyticsFlowSource DEFAULT;
        public static final AnalyticsFlowSource DOUBTFUL_AUTH;
        public static final AnalyticsFlowSource MAIL_AUTHORIZATION_FLOW;
        public static final AnalyticsFlowSource MAIL_BUNCHES;
        public static final AnalyticsFlowSource MAIL_BUNCHES_FLOW;
        public static final AnalyticsFlowSource MAIL_BUNCHES_SOFT;
        public static final AnalyticsFlowSource MAIL_BUNCHES_SOFT_FLOW;
        public static final AnalyticsFlowSource MAIL_RESTORE_AUTHENTIFICATION_FLOW;
        public static final AnalyticsFlowSource MAIL_RESTORE_FLOW;
        public static final AnalyticsFlowSource MAIL_TWO_FACTORS_FLOW;
        public static final AnalyticsFlowSource MULTIACCOUNT;
        public static final AnalyticsFlowSource PROMO_MAIL_WHITE_BUNDLE;
        public static final AnalyticsFlowSource SILENT_AUTH_BY_LOGIN;
        private final String value;

        static {
            AnalyticsFlowSource analyticsFlowSource = new AnalyticsFlowSource("MULTIACCOUNT", 0, "multi_account");
            MULTIACCOUNT = analyticsFlowSource;
            AnalyticsFlowSource analyticsFlowSource2 = new AnalyticsFlowSource("SILENT_AUTH_BY_LOGIN", 1, "silent_auth_by_login");
            SILENT_AUTH_BY_LOGIN = analyticsFlowSource2;
            AnalyticsFlowSource analyticsFlowSource3 = new AnalyticsFlowSource("DOUBTFUL_AUTH", 2, "doubtful_auth");
            DOUBTFUL_AUTH = analyticsFlowSource3;
            AnalyticsFlowSource analyticsFlowSource4 = new AnalyticsFlowSource("MAIL_BUNCHES", 3, "mail_bunches_authentication_flow");
            MAIL_BUNCHES = analyticsFlowSource4;
            AnalyticsFlowSource analyticsFlowSource5 = new AnalyticsFlowSource("MAIL_BUNCHES_SOFT", 4, "mail_bunches_soft_authentication_flow");
            MAIL_BUNCHES_SOFT = analyticsFlowSource5;
            AnalyticsFlowSource analyticsFlowSource6 = new AnalyticsFlowSource("MAIL_RESTORE_FLOW", 5, "mail_restore_flow");
            MAIL_RESTORE_FLOW = analyticsFlowSource6;
            AnalyticsFlowSource analyticsFlowSource7 = new AnalyticsFlowSource("MAIL_RESTORE_AUTHENTIFICATION_FLOW", 6, "mail_restore_authentication_flow");
            MAIL_RESTORE_AUTHENTIFICATION_FLOW = analyticsFlowSource7;
            AnalyticsFlowSource analyticsFlowSource8 = new AnalyticsFlowSource("MAIL_AUTHORIZATION_FLOW", 7, "mail_authorization_flow");
            MAIL_AUTHORIZATION_FLOW = analyticsFlowSource8;
            AnalyticsFlowSource analyticsFlowSource9 = new AnalyticsFlowSource("MAIL_BUNCHES_SOFT_FLOW", 8, "mail_bunches_soft_flow");
            MAIL_BUNCHES_SOFT_FLOW = analyticsFlowSource9;
            AnalyticsFlowSource analyticsFlowSource10 = new AnalyticsFlowSource("MAIL_BUNCHES_FLOW", 9, "mail_bunches_flow");
            MAIL_BUNCHES_FLOW = analyticsFlowSource10;
            AnalyticsFlowSource analyticsFlowSource11 = new AnalyticsFlowSource("PROMO_MAIL_WHITE_BUNDLE", 10, "promo_mail_white_bundle");
            PROMO_MAIL_WHITE_BUNDLE = analyticsFlowSource11;
            AnalyticsFlowSource analyticsFlowSource12 = new AnalyticsFlowSource("MAIL_TWO_FACTORS_FLOW", 11, "mail_two_faсtors_flow");
            MAIL_TWO_FACTORS_FLOW = analyticsFlowSource12;
            AnalyticsFlowSource analyticsFlowSource13 = new AnalyticsFlowSource("DEFAULT", 12, null);
            DEFAULT = analyticsFlowSource13;
            AnalyticsFlowSource[] analyticsFlowSourceArr = {analyticsFlowSource, analyticsFlowSource2, analyticsFlowSource3, analyticsFlowSource4, analyticsFlowSource5, analyticsFlowSource6, analyticsFlowSource7, analyticsFlowSource8, analyticsFlowSource9, analyticsFlowSource10, analyticsFlowSource11, analyticsFlowSource12, analyticsFlowSource13};
            $VALUES = analyticsFlowSourceArr;
            $ENTRIES = new asp(analyticsFlowSourceArr);
        }

        public AnalyticsFlowSource(String str, int i, String str2) {
            this.value = str2;
        }

        public static AnalyticsFlowSource valueOf(String str) {
            return (AnalyticsFlowSource) Enum.valueOf(AnalyticsFlowSource.class, str);
        }

        public static AnalyticsFlowSource[] values() {
            return (AnalyticsFlowSource[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: RegistrationStatParamsFactory.kt */
    public static final class a {
        public static void a(AnalyticsFlowSource analyticsFlowSource) {
            String str = RegistrationStatParamsFactory.b;
            if (str == null || drm0.N(str)) {
                str = null;
            }
            RegistrationStatParamsFactory.b = j5g.g0(izi0.m(str, analyticsFlowSource.h()), StringUtils.COMMA, null, null, 0, null, 62);
        }
    }

    public static ArrayList a() {
        mgn0 mgn0Var = dgn0.a;
        mgn0 mgn0Var2 = dgn0.a;
        if (mgn0Var2 == null) {
            mgn0Var2 = null;
        }
        mgn0Var2.getClass();
        Pair pair = new Pair("service_group", null);
        Pair pair2 = new Pair("flow_source", b);
        Pair pair3 = new Pair("flow_entry_points", null);
        mgn0 mgn0Var3 = dgn0.a;
        if (mgn0Var3 == null) {
            mgn0Var3 = null;
        }
        Pair pair4 = new Pair("sak_version", mgn0Var3.g);
        Pair pair5 = new Pair("external_device_id", (String) dgn0.b().B.getValue());
        RegistrationStatFlowType registrationStatFlowType = a;
        ArrayList o = e43.o(pair, pair2, pair3, pair4, pair5, new Pair("flow_type", registrationStatFlowType != null ? registrationStatFlowType.h() : null), new Pair("parent_app_id", null), new Pair("auth_app_id", null), new Pair("provider_app_id", null));
        mgn0 mgn0Var4 = dgn0.a;
        if (mgn0Var4 == null) {
            mgn0Var4 = null;
        }
        qhn0 qhn0Var = mgn0Var4.h;
        List list = qhn0Var != null ? (List) qhn0Var.a.getValue() : null;
        if (list != null) {
            List<rgn0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (rgn0 rgn0Var : list2) {
                rgn0Var.getClass();
                q2z.a(O6.X0, rgn0Var.getDeviceId(), arrayList);
            }
            o.addAll(arrayList);
        }
        return o;
    }
}
