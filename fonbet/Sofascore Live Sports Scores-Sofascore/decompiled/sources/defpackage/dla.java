package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.icu.util.ULocale;
import android.os.Build;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sofascore.results.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class dla {
    public static final List a = b.j("en", "en-us", "fr", "it", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "es", "es-la", DownloadCommon.DOWNLOAD_REPORT_CANCEL, "pt", "pt-pt", "nl", "no", "sv", "da", "id", "zh", "ar");
    public static final List b = b.j("en", "en-us", "fr", "es", "es-la", "pt", "pt-pt", "zh", "ru");
    public static final List c = b.j("en", "en-us", "es", "es-la");
    public static ULocale[] d = new ULocale[0];
    public static volatile String e;

    public static String a() {
        Locale forLanguageTag;
        String str = e;
        if (str != null) {
            return str;
        }
        Locale b2 = kb0.b().b(0);
        if (b2 == null) {
            b2 = Locale.getDefault();
        }
        ULocale forLocale = ULocale.forLocale(b2);
        ULocale uLocale = null;
        ULocale acceptLanguage = ULocale.acceptLanguage(new ULocale[]{forLocale}, d, (boolean[]) null);
        if (acceptLanguage != null) {
            String script = ULocale.addLikelySubtags(acceptLanguage).getScript();
            script.getClass();
            forLocale.getClass();
            String script2 = ULocale.addLikelySubtags(forLocale).getScript();
            script2.getClass();
            if (script.equals(script2)) {
                uLocale = acceptLanguage;
            }
        }
        if (uLocale == null || (forLanguageTag = uLocale.toLocale()) == null) {
            forLanguageTag = Locale.forLanguageTag("en");
        }
        forLanguageTag.getClass();
        String h = h(j(forLanguageTag));
        e = h;
        return h;
    }

    public static String b(Context context) {
        Locale b2 = kb0.b().b(0);
        if (b2 == null) {
            b2 = e(context);
        }
        String language = b2.getLanguage();
        language.getClass();
        return language;
    }

    public static ArrayList c(Context context) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        XmlResourceParser xml = context.getResources().getXml(R.xml.config_locales);
        xml.getClass();
        while (xml.getEventType() != 1) {
            try {
                if (xml.getEventType() == 2 && Intrinsics.c(xml.getName(), "locale") && xml.getAttributeCount() > 0 && Intrinsics.c(xml.getAttributeName(0), "name")) {
                    arrayList.add(xml.getAttributeValue(0));
                }
                xml.next();
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (XmlPullParserException e3) {
                e3.printStackTrace();
            }
        }
        return arrayList;
    }

    public static final Locale d() {
        Locale forLanguageTag = Intrinsics.c(Locale.getDefault().getLanguage(), new Locale("ar").getLanguage()) ? Locale.forLanguageTag("ar-u-nu-latn") : Locale.getDefault();
        forLanguageTag.getClass();
        return forLanguageTag;
    }

    public static Locale e(Context context) {
        Locale b2;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            b2 = Resources.getSystem().getConfiguration().getLocales().get(0);
        } else {
            fib fibVar = fib.b;
            if (i >= 33) {
                Object systemService = context.getSystemService("locale");
                if (systemService != null) {
                    fibVar = fib.d(z9.w(systemService));
                }
            } else {
                fibVar = fib.a(Resources.getSystem().getConfiguration().getLocales().toLanguageTags());
            }
            b2 = fibVar.b(0);
        }
        if (b2 != null) {
            return b2;
        }
        Locale locale = Locale.getDefault();
        locale.getClass();
        return locale;
    }

    public static String f(String str) {
        str.getClass();
        return str.equals("b+es+419") ? "es-419" : str;
    }

    public static void g(fib fibVar) {
        fibVar.getClass();
        n5h n5hVar = kb0.a;
        if (Build.VERSION.SDK_INT >= 33) {
            Object c2 = kb0.c();
            if (c2 != null) {
                jb0.b(c2, ib0.a(fibVar.c()));
            }
        } else if (!fibVar.equals(kb0.c)) {
            synchronized (kb0.h) {
                kb0.c = fibVar;
                kb0.a();
            }
        }
        e = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String h(String str) {
        switch (str.hashCode()) {
            case -1295825987:
                return !str.equals("es-419") ? str : "es-la";
            case 3365:
                if (str.equals("in")) {
                    return "id";
                }
                break;
            case 3374:
                if (str.equals("iw")) {
                    return "he";
                }
                break;
            case 3508:
                if (str.equals("nb")) {
                    return "no";
                }
                break;
            case 3588:
                if (str.equals("pt")) {
                    return "pt-pt";
                }
                break;
            case 96599167:
                if (str.equals("en-gb")) {
                    return "en";
                }
                break;
            case 96748077:
                if (str.equals("es-es")) {
                    return "es";
                }
                break;
            case 106936505:
                if (str.equals("pt-br")) {
                    return "pt";
                }
                break;
            case 115814250:
                if (str.equals("zh-cn")) {
                    return "zh";
                }
                break;
        }
    }

    public static String i(Number number) {
        number.getClass();
        return String.format(d(), "%,d", Arrays.copyOf(new Object[]{Long.valueOf(number.longValue())}, 1));
    }

    public static String j(Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        country.getClass();
        if (StringsKt.R(country)) {
            country = null;
        }
        if (country != null) {
            sb.append("-".concat(country));
        }
        String lowerCase = sb.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
