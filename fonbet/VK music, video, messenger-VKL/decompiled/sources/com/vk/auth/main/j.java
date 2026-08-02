package com.vk.auth.main;

import android.content.Context;
import com.ironsource.X3;
import com.vk.auth.main.AuthStatSender;
import com.vk.core.preference.Preference;
import com.vk.device.store.AppStore;
import com.vk.metrics.eventtracking.Event;
import com.vk.socialgraph.SocialStatSender;
import com.vkontakte.android.data.b;
import xsna.dy2;
import xsna.e43;
import xsna.el3;
import xsna.ky6;
import xsna.o25;

/* compiled from: VkStatSender.kt */
/* loaded from: classes.dex */
public final class j implements AuthStatSender, SocialStatSender {

    /* compiled from: VkStatSender.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthStatSender.Screen.values().length];
            try {
                iArr[AuthStatSender.Screen.PHONE_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthStatSender.Screen.LOGIN_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthStatSender.Screen.EXCHANGE_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthStatSender.Screen.CHOOSE_METHOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static AuthStatSender.Status j(AuthStatSender.Screen screen) {
        int i = a.$EnumSwitchMapping$0[screen.ordinal()];
        if (i == 1 || i == 2) {
            return AuthStatSender.Status.LOGIN;
        }
        if (i == 3) {
            return AuthStatSender.Status.EXCHANGE_LOGIN;
        }
        if (i != 4) {
            return null;
        }
        return AuthStatSender.Status.DEFAULT;
    }

    public static void l(AuthStatSender.Screen screen, AuthStatSender.Status status, String str, AuthStatSender.Element element) {
        n(screen.h(), status.h(), str, element != null ? element.h() : null);
    }

    public static void m(SocialStatSender.Screen screen, SocialStatSender.Status status, String str, SocialStatSender.Element element) {
        n(screen.h(), status.h(), str, element != null ? element.h() : null);
    }

    public static void n(String str, String str2, String str3, String str4) {
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.h();
        aVar.i("StatlogTracker");
        aVar.g("registration_page_event");
        aVar.c("page", str);
        aVar.c("status", str2);
        aVar.c("action", str3);
        if (str4 != null) {
            aVar.c("element", str4);
        }
        com.vk.metrics.eventtracking.b.a.k(aVar.e());
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void a(AuthStatSender.Screen screen) {
        l(screen, AuthStatSender.Status.REGISTRATION, "done", null);
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void b(AuthStatSender.Screen screen) {
        AuthStatSender.Status j = j(screen);
        if (j != null) {
            l(screen, j, X3.g.e, null);
        }
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void c(AuthStatSender.Screen screen, AuthStatSender.Status status, AuthStatSender.Element element) {
        l(screen, status, "click", element);
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void d(AuthStatSender.Screen screen) {
        l(screen, AuthStatSender.Status.DEFAULT, "done", null);
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void e(AuthStatSender.Screen screen) {
        l(screen, AuthStatSender.Status.DEFAULT, X3.g.e, null);
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void f(AuthStatSender.Screen screen) {
        AuthStatSender.Status j = j(screen);
        if (j != null) {
            l(screen, j, "done", null);
        }
        ky6 j2 = Preference.j();
        if (j2.getBoolean("is_first_auth", true)) {
            ky6.a aVar = (ky6.a) j2.edit();
            aVar.putBoolean("is_first_auth", false);
            aVar.a();
            Context context = e43.a;
            if (dy2.g(context != null ? context : null, AppStore.HUAWEI)) {
                b.d dVar = new b.d("huawei_store_installation");
                dVar.b(o25.a().c(), "user_id");
                dVar.e();
            }
        }
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void g(AuthStatSender.Screen screen) {
        l(screen, AuthStatSender.Status.REGISTRATION, X3.g.e, null);
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void h(AuthStatSender.Screen screen) {
        l(screen, AuthStatSender.Status.SEX, X3.g.e, null);
    }

    @Override // com.vk.auth.main.AuthStatSender
    public final void i(AuthStatSender.Screen screen) {
        l(screen, AuthStatSender.Status.SEX, "done", null);
    }

    public final void k(SocialStatSender.Screen screen, SocialStatSender.Status status) {
        m(screen, status, "done", null);
    }
}
