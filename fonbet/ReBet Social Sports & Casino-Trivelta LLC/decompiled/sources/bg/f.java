package bg;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.facebook.react.devsupport.StackTraceHelper;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class f extends Fragment {
    public void d0() {
        Locale locale;
        try {
            String languageOrNull = LiveChatUtil.getLanguageOrNull();
            Configuration configuration = new Configuration();
            if (languageOrNull == null || languageOrNull.trim().isEmpty()) {
                LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
                locale = locales.isEmpty() ? Resources.getSystem().getConfiguration().locale : locales.get(0);
            } else {
                if (!languageOrNull.equalsIgnoreCase("zh_TW") && !languageOrNull.equalsIgnoreCase("zh_tw")) {
                    locale = languageOrNull.equalsIgnoreCase(StackTraceHelper.ID_KEY) ? new Locale("in") : new Locale(languageOrNull);
                    Locale.setDefault(locale);
                }
                locale = new Locale("zh", "TW");
                Locale.setDefault(locale);
            }
            configuration.locale = locale;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public boolean e0(MenuItem menuItem) {
        return false;
    }

    public boolean f0(MenuItem menuItem) {
        return false;
    }

    public abstract boolean onBackPressed();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        d0();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        d0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (ZohoLiveChat.getApplicationManager() == null || ZohoLiveChat.getApplicationManager().p() == null) {
            return;
        }
        ZohoLiveChat.getApplicationManager().p().postDelayed(new Runnable() { // from class: bg.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.d0();
            }
        }, 1000L);
    }
}
