package com.vk.registration.funnels;

import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.frf0;
import xsna.gzs;
import xsna.o7r;
import xsna.ozl;
import xsna.qro0;
import xsna.s3q0;
import xsna.y8q;

/* compiled from: RegistrationFunnel.kt */
@ozl
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    /* compiled from: RegistrationFunnel.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final a a = new a();

        public static void a() {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.l(SchemeStatSak$EventScreen.AUTH_PASSWORD, new ArrayList());
        }

        public static ArrayList b() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SOURCE, "", "", "alert_no_available_factors"));
            return arrayList;
        }

        public static ArrayList c() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SOURCE, "", "", "primary_factor_choice"));
            return arrayList;
        }

        public static void d(SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem, VkEmailForwardingConfig vkEmailForwardingConfig) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.AUTH_PASSWORD;
            ArrayList arrayList = new ArrayList();
            if (schemeStatSak$RegistrationFieldItem != null) {
                arrayList.add(schemeStatSak$RegistrationFieldItem);
            }
            o7r.a(arrayList, vkEmailForwardingConfig);
            s3q0 s3q0Var = s3q0.a;
            frf0.l(schemeStatSak$EventScreen, arrayList);
        }

        public static /* synthetic */ void e(a aVar, VkEmailForwardingConfig vkEmailForwardingConfig) {
            aVar.getClass();
            d(null, vkEmailForwardingConfig);
        }
    }

    /* compiled from: RegistrationFunnel.kt */
    /* renamed from: com.vk.registration.funnels.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1760b {
        public static void a(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$TypeRegistrationItem.EventType eventType, Long l, ArrayList arrayList, String str) {
            frf0.a(eventType, arrayList, l, schemeStatSak$EventScreen, null, null, str, 176);
        }
    }

    /* compiled from: RegistrationFunnel.kt */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStatSak$EventScreen.values().length];
            try {
                iArr[SchemeStatSak$EventScreen.QR_CODE_ASK_CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStatSak$EventScreen.ENTRY_ASK_CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemeStatSak$EventScreen.QR_CODE_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SchemeStatSak$EventScreen.QR_CODE_DISPLAY_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SchemeStatSak$EventScreen.QR_CODE_DEVICE_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(gzs gzsVar) {
        qro0.c(new y8q(2, gzsVar));
    }

    public static ArrayList b(String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, String str2, boolean z) {
        return h(str, g(schemeStatSak$EventScreen), str2, z);
    }

    public static /* synthetic */ ArrayList c(b bVar, String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            schemeStatSak$EventScreen = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        bVar.getClass();
        return b(str, schemeStatSak$EventScreen, str2, z);
    }

    public static SchemeStatSak$RegistrationFieldItem d(SchemeStatSak$RegistrationFieldItem.Name name, String str) {
        return new SchemeStatSak$RegistrationFieldItem(name, "", "", str);
    }

    public static ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.FROM;
        a.getClass();
        arrayList.add(d(name, "continue_reg_from_web"));
        arrayList.add(d(SchemeStatSak$RegistrationFieldItem.Name.UNIQUE_SESSION_ID, str));
        return arrayList;
    }

    public static SchemeStatSak$RegistrationFieldItem f(SchemeStatSak$RegistrationFieldItem.Name name) {
        Object obj = null;
        Iterator<T> it = frf0.g.a(frf0.a.Ab(), null, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((SchemeStatSak$RegistrationFieldItem) next).a() == name) {
                obj = next;
                break;
            }
        }
        return (SchemeStatSak$RegistrationFieldItem) obj;
    }

    public static SchemeStatSak$RegistrationFieldItem.Name g(SchemeStatSak$EventScreen schemeStatSak$EventScreen) {
        int i = schemeStatSak$EventScreen == null ? -1 : c.$EnumSwitchMapping$0[schemeStatSak$EventScreen.ordinal()];
        return (i == 1 || i == 3 || i == 4 || i == 5) ? SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID : SchemeStatSak$RegistrationFieldItem.Name.AUTH_CODE_ID;
    }

    public static ArrayList h(String str, SchemeStatSak$RegistrationFieldItem.Name name, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        b bVar = a;
        if (str != null) {
            bVar.getClass();
            arrayList.add(d(name, str));
        }
        if (str2 != null) {
            SchemeStatSak$RegistrationFieldItem.Name name2 = SchemeStatSak$RegistrationFieldItem.Name.APP_ID;
            bVar.getClass();
            arrayList.add(d(name2, str2));
        }
        if (z) {
            SchemeStatSak$RegistrationFieldItem.Name name3 = SchemeStatSak$RegistrationFieldItem.Name.AVAILABLE_MULTIACC_SELECTOR;
            bVar.getClass();
            arrayList.add(d(name3, ""));
        }
        return arrayList;
    }

    public static void i(SchemeStatSak$TypeRegistrationItem.Error error) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OK_REGISTRATION_ERROR, null, null, null, error, null, null, 238);
    }

    public static void j() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AVAILABLE_AUTH_WITHOUT_PASSWORD, null, null, null, null, null, null, 254);
    }

    public static void k(String str) {
        ArrayList arrayList;
        if (str != null) {
            arrayList = new ArrayList();
            SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.CALLIN_ERROR_TEXT;
            a.getClass();
            d(name, str);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_CALLIN_ENTRY_ERROR, arrayList2, null, null, null, null, null, 252);
    }

    public static void l() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHOOSE_ENTER_BY_MAIL_PASS, null, null, null, null, null, null, 254);
    }

    public static void m() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.GOOGLE_PHONE_HINT_NOTHING_FOUND, null, null, null, null, null, null, 254);
    }

    public static void n() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.GOOGLE_PHONE_HINT_SKIP, null, null, null, null, null, null, 254);
    }

    public static void o(Long l, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.LOGOUT_REASON;
        a.getClass();
        arrayList.add(d(name, str));
        SchemeStatSak$RegistrationFieldItem.Name name2 = SchemeStatSak$RegistrationFieldItem.Name.METHOD_NAME;
        if (str2 == null) {
            str2 = "";
        }
        arrayList.add(d(name2, str2));
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.FULL_LOGOUT, arrayList, l, null, null, null, null, 248);
    }

    public static void p() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_NO_AVAILABLE_FACTORS, null, null, null, null, null, null, 254);
    }

    public static void q(String str, boolean z) {
        SchemeStatSak$RegistrationFieldItem d = d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_SOURCE, z ? "external_camera" : "internal_camera");
        SchemeStatSak$RegistrationFieldItem d2 = d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.CAMERA_SOURCE_FOR_QR_CODE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d2);
        arrayList.add(d);
        s3q0 s3q0Var = s3q0.a;
        frf0.a(eventType, arrayList, null, null, null, null, null, 252);
    }

    public static void r() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.SCANNER_TAB;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.SOURCE, "", "", "alert_qr_code_open_scanner"));
        s3q0 s3q0Var = s3q0.a;
        frf0.a(eventType, arrayList, null, null, null, null, null, 252);
    }

    public static void s() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.REGISTRATION_START, null, null, null, null, null, null, 254);
    }

    public static void t(b bVar) {
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_LOADING_FAILED;
        frf0.m(null, false);
        frf0.j(eventType, null, null, null, null, 248);
    }

    public static void u(String str) {
        SchemeStatSak$RegistrationFieldItem d = d(SchemeStatSak$RegistrationFieldItem.Name.SELECT_COUNTRY_NAME, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SELECT_COUNTRY_DONE, arrayList, null, null, null, null, null, 252);
    }

    public static void v() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ERROR_USER_IS_TOO_YOUNG, null, null, null, null, null, null, 254);
    }

    public static void w() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.USER_NOT_FOUND, null, null, null, null, null, null, 254);
    }

    public static void x() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VERIFY_BY_ANOTHER_WAY_TAP, null, null, null, null, null, null, 254);
    }

    public static void y() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.FORGOT_PASSWORD, null, null, null, null, null, null, 254);
    }

    public static void z(b bVar, final SchemeStatSak$EventScreen schemeStatSak$EventScreen, ArrayList arrayList, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, SchemeStatSak$TypeRegistrationItem.Error error, int i) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            schemeStatSak$EventScreen2 = null;
        }
        boolean z = (i & 8) == 0;
        final SchemeStatSak$TypeRegistrationItem.Error error2 = (i & 16) != 0 ? null : error;
        bVar.getClass();
        final ArrayList arrayList2 = arrayList;
        final SchemeStatSak$EventScreen schemeStatSak$EventScreen3 = schemeStatSak$EventScreen2;
        final boolean z2 = z;
        qro0.c(new gzs() { // from class: xsna.rqf0
            @Override // xsna.gzs
            public final Object invoke() {
                frf0.f(SchemeStatSak$EventScreen.this, schemeStatSak$EventScreen, arrayList2, z2, error2, null, 32);
                return s3q0.a;
            }
        });
    }
}
