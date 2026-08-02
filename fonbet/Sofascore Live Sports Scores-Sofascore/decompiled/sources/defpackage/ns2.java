package defpackage;

import com.ironsource.L6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ns2 {
    public static final Map a = tub.h(new Pair("en", "great-britain"), new Pair(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "germany"), new Pair("it", "italy"), new Pair("fr", "france"), new Pair("tr", "turkey"), new Pair("es", "spain"), new Pair("pt", "portugal"), new Pair("ru", "russia"));
    public static final ArrayList b;
    public static final ArrayList c;
    public static final ArrayList d;

    static {
        yea yeaVar = j58.a;
        List a2 = j58.a();
        ArrayList arrayList = new ArrayList(k13.r(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(Locale.forLanguageTag((String) it.next()));
        }
        b = arrayList;
        yea yeaVar2 = j58.a;
        LinkedHashSet d0 = CollectionsKt.d0(j58.a(), a.keySet());
        ArrayList arrayList2 = new ArrayList(k13.r(d0, 10));
        Iterator it2 = d0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Locale.forLanguageTag((String) it2.next()));
        }
        c = arrayList2;
        d = b.l(Locale.forLanguageTag("af"), Locale.forLanguageTag("sq"), Locale.forLanguageTag("am"), Locale.forLanguageTag("ar"), Locale.forLanguageTag("hy"), Locale.forLanguageTag("az"), Locale.forLanguageTag("eu"), Locale.forLanguageTag("be"), Locale.forLanguageTag("bn"), Locale.forLanguageTag("bs"), Locale.forLanguageTag("bg"), Locale.forLanguageTag(DownloadCommon.DOWNLOAD_REPORT_CANCEL), Locale.forLanguageTag("ceb"), Locale.forLanguageTag("ny"), Locale.forLanguageTag("zh"), Locale.forLanguageTag("co"), Locale.forLanguageTag("hr"), Locale.forLanguageTag("cs"), Locale.forLanguageTag("da"), Locale.forLanguageTag("nl"), Locale.forLanguageTag("en"), Locale.forLanguageTag("eo"), Locale.forLanguageTag("et"), Locale.forLanguageTag("tl"), Locale.forLanguageTag("fi"), Locale.forLanguageTag("fr"), Locale.forLanguageTag("fy"), Locale.forLanguageTag("gl"), Locale.forLanguageTag("ka"), Locale.forLanguageTag(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR), Locale.forLanguageTag("el"), Locale.forLanguageTag("gu"), Locale.forLanguageTag(DownloadCommon.DOWNLOAD_REPORT_HOST), Locale.forLanguageTag("ha"), Locale.forLanguageTag("haw"), Locale.forLanguageTag("iw"), Locale.forLanguageTag("hi"), Locale.forLanguageTag("hmn"), Locale.forLanguageTag("hu"), Locale.forLanguageTag("is"), Locale.forLanguageTag("ig"), Locale.forLanguageTag("id"), Locale.forLanguageTag("ga"), Locale.forLanguageTag("it"), Locale.forLanguageTag("ja"), Locale.forLanguageTag("jw"), Locale.forLanguageTag("kn"), Locale.forLanguageTag("kk"), Locale.forLanguageTag("km"), Locale.forLanguageTag("ko"), Locale.forLanguageTag("ku"), Locale.forLanguageTag("ky"), Locale.forLanguageTag("lo"), Locale.forLanguageTag("la"), Locale.forLanguageTag("lv"), Locale.forLanguageTag("lt"), Locale.forLanguageTag("lb"), Locale.forLanguageTag("mk"), Locale.forLanguageTag("mg"), Locale.forLanguageTag("ms"), Locale.forLanguageTag("ml"), Locale.forLanguageTag(L6.b1), Locale.forLanguageTag("mi"), Locale.forLanguageTag("mr"), Locale.forLanguageTag("mn"), Locale.forLanguageTag("my"), Locale.forLanguageTag("ne"), Locale.forLanguageTag("no"), Locale.forLanguageTag("ps"), Locale.forLanguageTag("fa"), Locale.forLanguageTag("pl"), Locale.forLanguageTag("pt"), Locale.forLanguageTag("ro"), Locale.forLanguageTag("ru"), Locale.forLanguageTag("sm"), Locale.forLanguageTag("gd"), Locale.forLanguageTag("sr"), Locale.forLanguageTag("st"), Locale.forLanguageTag("sn"), Locale.forLanguageTag(L6.z0), Locale.forLanguageTag("si"), Locale.forLanguageTag("sk"), Locale.forLanguageTag("sl"), Locale.forLanguageTag("so"), Locale.forLanguageTag("es"), Locale.forLanguageTag("su"), Locale.forLanguageTag("sw"), Locale.forLanguageTag("sv"), Locale.forLanguageTag("tg"), Locale.forLanguageTag("ta"), Locale.forLanguageTag("te"), Locale.forLanguageTag("th"), Locale.forLanguageTag("tr"), Locale.forLanguageTag("uk"), Locale.forLanguageTag("ur"), Locale.forLanguageTag("uz"), Locale.forLanguageTag("vi"), Locale.forLanguageTag("cy"), Locale.forLanguageTag("xh"), Locale.forLanguageTag("yi"), Locale.forLanguageTag("yo"), Locale.forLanguageTag("zu"));
    }
}
