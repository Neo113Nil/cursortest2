package Yf;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.r;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.facebook.react.devsupport.StackTraceHelper;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.Locale;
import m.AbstractActivityC5481c;
import ne.j;
import od.u;
import rd.C6218a;

/* loaded from: classes4.dex */
public abstract class c extends AbstractActivityC5481c {

    /* renamed from: f, reason: collision with root package name */
    public F0 f14236f = null;

    public class a implements J {
        public a() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            c cVar = c.this;
            cVar.f14236f = f02;
            cVar.E(f02);
            return new F0.a().b(F0.p.g(), f02.f(F0.p.g())).a();
        }
    }

    private void B() {
        Locale defaultSystemLocale;
        try {
            String languageOrNull = LiveChatUtil.getLanguageOrNull();
            Configuration configuration = new Configuration();
            if (languageOrNull == null || languageOrNull.trim().isEmpty()) {
                defaultSystemLocale = LiveChatUtil.getDefaultSystemLocale();
            } else {
                if (!languageOrNull.equalsIgnoreCase("zh_TW") && !languageOrNull.equalsIgnoreCase("zh_tw")) {
                    defaultSystemLocale = languageOrNull.equalsIgnoreCase(StackTraceHelper.ID_KEY) ? new Locale("in") : new Locale(languageOrNull);
                    Locale.setDefault(defaultSystemLocale);
                }
                defaultSystemLocale = new Locale("zh", "TW");
                Locale.setDefault(defaultSystemLocale);
            }
            configuration.locale = defaultSystemLocale;
            configuration.setLocale(defaultSystemLocale);
            configuration.setLayoutDirection(defaultSystemLocale);
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public void A() {
        r.a(this);
        ViewGroup D10 = D();
        if (D10 != null) {
            AbstractC2082d0.x0(D10, new a());
        }
    }

    public void C() {
        SharedPreferences M10 = C6218a.M();
        if (M10 == null || !M10.getBoolean("SYNC_WITH_OS", true)) {
            setTheme(ZohoSalesIQ.getTheme());
            return;
        }
        int i10 = getResources().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            setTheme(u.f61164j);
        } else {
            if (i10 != 32) {
                return;
            }
            setTheme(u.f61163i);
        }
    }

    public ViewGroup D() {
        return null;
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        B();
        C();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onPause() {
        super.onPause();
        rd.b.p(false);
        Q.f44447F.J(false);
        j.q0();
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onResume() {
        super.onResume();
        rd.b.p(true);
    }

    public void E(F0 f02) {
    }
}
