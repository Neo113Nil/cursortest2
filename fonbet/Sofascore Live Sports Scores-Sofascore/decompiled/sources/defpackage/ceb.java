package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sofascore.model.LiveActionWidgetProvider;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ceb {
    public static final Set a = ph0.a0(new String[]{"en", "hr", "it", "es", "pt", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "fr", "pl", "hu", "da", "tr", "ru", "nl", "id", "el", "sv", "zh", "sr", "sl", "ro", "no", "hi", "cs", "sk", "bn", "ar", "az", "en-us", "pt-pt", "es-la", "bg", "ja", "ko", "vi", "uk", "th", "fi"});
    public static final Set b = ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_WILL_CONTINUE});

    public static boolean a(Context context, Event event) {
        boolean z;
        Object u2gVar;
        SharedPreferences d;
        context.getClass();
        if (bea.b) {
            z = true;
        } else {
            try {
                z = WebView.getCurrentWebViewPackage() != null;
                bea.b = z;
            } catch (Exception unused) {
                z = false;
            }
        }
        if (!z || y05.a(context)) {
            return false;
        }
        Set set = wyh.a;
        String sportSlug = event.getSportSlug();
        sportSlug.getClass();
        if (!wyh.u.contains(sportSlug)) {
            return false;
        }
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        nxf[] nxfVarArr = nxf.a;
        String g = f.g("live_action_widget_enabled_sports");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(new xg0(uhi.a, 0)), g);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a2 = w2g.a(u2gVar);
            if (a2 != null) {
                s38.a().c(a2);
            }
            if (!(u2gVar instanceof u2g)) {
                obj = u2gVar;
            }
        }
        List list = (List) obj;
        if (list == null) {
            list = km5.a;
        }
        if (!list.contains(event.getSportSlug())) {
            return false;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        return sharedPreferences.getBoolean("DEV_MODE_FORCE_LIVE_ACTION_WIDGET", false) || b.contains(event.getStatusType());
    }

    public static String b(Event event) {
        if (!Intrinsics.c(event.getSportSlug(), Sports.FOOTBALL)) {
            return LiveActionWidgetProvider.SPORTRADAR;
        }
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        nxf[] nxfVarArr = nxf.a;
        return f.g("live_action_widget_football_provider");
    }
}
