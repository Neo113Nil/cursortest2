package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class x53 {
    public static final List a;
    public static final ArrayList b;

    static {
        List j = b.j("image/jpeg", "image/png", "image/webp");
        a = j;
        b = CollectionsKt.w0(b.j("image/gif", "image/svg+xml"), j);
    }

    public static final int a(xkk xkkVar) {
        h5a rkkVar;
        String str;
        xkkVar.getClass();
        klk klkVar = xkkVar.e;
        String str2 = xkkVar.f;
        String str3 = xkkVar.g;
        String str4 = null;
        String str5 = klkVar != null ? klkVar.a : null;
        if (str5 == null || str5.length() == 0) {
            rkkVar = (str3 == null || str3.length() == 0) ? (str2 == null || str2.length() == 0) ? null : new rkk(str2) : new qkk(str3);
        } else {
            klkVar.getClass();
            rkkVar = new skk(klkVar.a, klkVar.b);
        }
        if (!(rkkVar instanceof skk)) {
            if (rkkVar instanceof qkk) {
                return 3;
            }
            if (rkkVar instanceof rkk) {
                return URLUtil.isValidUrl(((rkk) rkkVar).i) ? 4 : 5;
            }
            if (rkkVar == null) {
                return 5;
            }
            zzl.b();
            return 0;
        }
        skk skkVar = (skk) rkkVar;
        String b2 = b(skkVar);
        if (b2 != null) {
            str = b2.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        if (CollectionsKt.R(a, str)) {
            return 1;
        }
        String b3 = b(skkVar);
        if (b3 != null) {
            str4 = b3.toLowerCase(Locale.ROOT);
            str4.getClass();
        }
        return CollectionsKt.R(b, str4) ? 2 : 5;
    }

    public static final String b(skk skkVar) {
        String str = skkVar.j;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        String lowerCase2 = StringsKt.f0(skkVar.i, ".").toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        switch (lowerCase2.hashCode()) {
            case 105441:
                if (lowerCase2.equals("jpg")) {
                    return "image/jpeg";
                }
                return null;
            case 111145:
                if (lowerCase2.equals("png")) {
                    return "image/png";
                }
                return null;
            case 3268712:
                if (lowerCase2.equals("jpeg")) {
                    return "image/jpeg";
                }
                return null;
            case 3645340:
                if (lowerCase2.equals("webp")) {
                    return "image/webp";
                }
                return null;
            default:
                return null;
        }
    }
}
