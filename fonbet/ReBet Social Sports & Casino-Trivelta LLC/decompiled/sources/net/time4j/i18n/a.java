package net.time4j.i18n;

import com.plaid.internal.EnumC3631g;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.format.k;
import net.time4j.format.o;
import net.time4j.format.p;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f58242a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f58243b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f58244c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f58245d;

    /* renamed from: net.time4j.i18n.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0846a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$NumberType;

        static {
            int[] iArr = new int[k.values().length];
            $SwitchMap$net$time4j$format$NumberType = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$NumberType[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b extends p {

        /* renamed from: g, reason: collision with root package name */
        public final int f58246g;

        public /* synthetic */ b(int i10, C0846a c0846a) {
            this(i10);
        }

        public b(int i10) {
            this.f58246g = i10;
        }
    }

    public static class c extends p {

        /* renamed from: g, reason: collision with root package name */
        public final int f58247g;

        public /* synthetic */ c(int i10, C0846a c0846a) {
            this(i10);
        }

        public c(int i10) {
            this.f58247g = i10;
        }
    }

    static {
        HashMap hashMap = new HashMap(EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        f58242a = hashMap;
        int i10 = 0;
        C0846a c0846a = null;
        f58243b = new b(i10, c0846a);
        HashMap hashMap2 = new HashMap();
        b(hashMap2, "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt", -1);
        b(hashMap2, "lo ms my nqo root sah ses sg th to vi wo yo zh", -1);
        b(hashMap2, "pt_PT", 0);
        b(hashMap2, "am as bn fa gu hi kn zu", 1);
        b(hashMap2, "ff fr hy kab pt", 1);
        b(hashMap2, "si", 1);
        b(hashMap2, "ak bh guw ln mg nso pa ti wa", 1);
        b(hashMap2, "tzm", 2);
        b(hashMap2, "is", 3);
        b(hashMap2, "mk", 4);
        b(hashMap2, "ceb fil tl", 5);
        b(hashMap2, "lv prg", 6);
        b(hashMap2, "lag ksh", 7);
        b(hashMap2, "iu naq se sma smi smj smn sms", 8);
        b(hashMap2, "shi", 9);
        b(hashMap2, "mo ro", 10);
        b(hashMap2, "bs hr sh sr", 11);
        b(hashMap2, "gd", 12);
        b(hashMap2, "sl", 13);
        b(hashMap2, "he iw", 14);
        b(hashMap2, "cs sk", 15);
        b(hashMap2, "pl", 16);
        b(hashMap2, "be", 17);
        b(hashMap2, "lt", 18);
        b(hashMap2, "mt", 19);
        b(hashMap2, "ru uk", 17);
        b(hashMap2, "br", 20);
        b(hashMap2, "ga", 21);
        b(hashMap2, "gv", 22);
        b(hashMap2, "ar", 23);
        b(hashMap2, "cy", 24);
        b(hashMap2, "dsb hsb", 25);
        b(hashMap2, "kw", 26);
        hashMap.putAll(hashMap2);
        HashMap hashMap3 = new HashMap(EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        f58244c = hashMap3;
        f58245d = new c(i10, c0846a);
        HashMap hashMap4 = new HashMap();
        c(hashMap4, "sv", 1);
        c(hashMap4, "fil fr ga hy lo mo ms ro tl vi", 2);
        c(hashMap4, "hu", 3);
        c(hashMap4, "ne", 4);
        c(hashMap4, "kk", 5);
        c(hashMap4, "it sc scn", 6);
        c(hashMap4, "ka", 7);
        c(hashMap4, "sq", 8);
        c(hashMap4, "en", 9);
        c(hashMap4, "mr", 10);
        c(hashMap4, "ca", 11);
        c(hashMap4, "mk", 12);
        c(hashMap4, "az", 13);
        c(hashMap4, "gu hi", 14);
        c(hashMap4, "as bn", 15);
        c(hashMap4, "cy", 16);
        c(hashMap4, "be", 17);
        c(hashMap4, "uk", 18);
        c(hashMap4, "tk", 19);
        c(hashMap4, "or", 20);
        c(hashMap4, "gd", 21);
        c(hashMap4, "kw", 22);
        hashMap3.putAll(hashMap4);
    }

    public static void b(Map map, String str, int i10) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new b(i10, null));
        }
    }

    public static void c(Map map, String str, int i10) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new c(i10, null));
        }
    }

    @Override // net.time4j.format.o
    public p a(Locale locale, k kVar) {
        Map map;
        p pVar;
        p pVar2;
        int i10 = C0846a.$SwitchMap$net$time4j$format$NumberType[kVar.ordinal()];
        if (i10 == 1) {
            map = f58242a;
            pVar = f58243b;
        } else {
            if (i10 != 2) {
                throw new UnsupportedOperationException(kVar.name());
            }
            map = f58244c;
            pVar = f58245d;
        }
        String country = locale.getCountry();
        if (country.isEmpty()) {
            pVar2 = null;
        } else {
            pVar2 = (p) map.get(locale.getLanguage() + '_' + country);
        }
        if (pVar2 == null) {
            pVar2 = (p) map.get(locale.getLanguage());
        }
        return pVar2 == null ? pVar : pVar2;
    }
}
