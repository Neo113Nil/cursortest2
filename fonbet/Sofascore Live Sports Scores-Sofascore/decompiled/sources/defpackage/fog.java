package defpackage;

import android.graphics.Matrix;
import android.util.Xml;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fog {
    public ejg a;
    public smg b;
    public boolean c;
    public int d;
    public boolean e;
    public dog f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(omg omgVar, String str, String str2) {
        int i;
        int i2;
        amg amgVar;
        int i3;
        int i4;
        amg H;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int ordinal = cog.a(str).ordinal();
        g7h g7hVar = null;
        amg amgVar2 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        amg[] amgVarArr = null;
        String str3 = null;
        Boolean bool = null;
        g7hVar = null;
        g7hVar = null;
        if (ordinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                j12 j12Var = new j12(str2.substring(5));
                j12Var.Q();
                amg u = u(j12Var);
                j12Var.P();
                amg u2 = u(j12Var);
                j12Var.P();
                amg u3 = u(j12Var);
                j12Var.P();
                amg u4 = u(j12Var);
                j12Var.Q();
                if (j12Var.m(')') || j12Var.q()) {
                    g7hVar = new g7h(19, false);
                    g7hVar.b = u;
                    g7hVar.c = u2;
                    g7hVar.d = u3;
                    g7hVar.e = u4;
                }
            }
            omgVar.p = g7hVar;
            if (g7hVar != null) {
                omgVar.a |= 1048576;
                return;
            }
            return;
        }
        if (ordinal == 2) {
            omgVar.x = r(str2);
            omgVar.a |= 268435456;
            return;
        }
        if (ordinal == 4) {
            omgVar.K = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            omgVar.a |= 536870912;
        }
        try {
            if (ordinal == 5) {
                omgVar.k = n(str2);
                omgVar.a |= 4096;
                return;
            }
            if (ordinal == 8) {
                int i5 = !str2.equals("ltr") ? !str2.equals("rtl") ? 0 : 2 : 1;
                omgVar.I = i5;
                if (i5 != 0) {
                    omgVar.a |= 68719476736L;
                    return;
                }
                return;
            }
            if (ordinal == 35) {
                omgVar.y = r(str2);
                omgVar.a |= 1073741824;
                return;
            }
            if (ordinal == 40) {
                omgVar.j = v(str2);
                omgVar.a |= 2048;
                return;
            }
            if (ordinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                }
                omgVar.o = bool;
                if (bool != null) {
                    omgVar.a |= 524288;
                    return;
                }
                return;
            }
            if (ordinal == 78) {
                int i6 = !str2.equals("none") ? !str2.equals("non-scaling-stroke") ? 0 : 2 : 1;
                omgVar.L = i6;
                if (i6 != 0) {
                    omgVar.a |= 34359738368L;
                    return;
                }
                return;
            }
            slg slgVar = slg.a;
            if (ordinal == 58) {
                if (str2.equals("currentColor")) {
                    omgVar.z = slgVar;
                } else {
                    try {
                        omgVar.z = n(str2);
                    } catch (wng e) {
                        e.getMessage();
                        return;
                    }
                }
                omgVar.a |= 2147483648L;
                return;
            }
            if (ordinal == 59) {
                omgVar.A = v(str2);
                omgVar.a |= 4294967296L;
                return;
            }
            if (ordinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                omgVar.J = i;
                if (i != 0) {
                    omgVar.a |= 262144;
                    return;
                }
                return;
            }
            if (ordinal == 75) {
                switch (str2) {
                    case "line-through":
                        i2 = 4;
                        break;
                    case "underline":
                        i2 = 2;
                        break;
                    case "none":
                        i2 = 1;
                        break;
                    case "blink":
                        i2 = 5;
                        break;
                    case "overline":
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                omgVar.H = i2;
                if (i2 != 0) {
                    omgVar.a |= 131072;
                    return;
                }
                return;
            }
            switch (ordinal) {
                case 14:
                    if (str2.indexOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            omgVar.t = Boolean.valueOf(!str2.equals("none"));
                            omgVar.a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    xmg w = w(str2);
                    omgVar.b = w;
                    if (w != null) {
                        omgVar.a |= 1;
                        break;
                    }
                    break;
                case 16:
                    int i7 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    omgVar.D = i7;
                    if (i7 != 0) {
                        omgVar.a |= 2;
                        break;
                    }
                    break;
                case 17:
                    Float v = v(str2);
                    omgVar.c = v;
                    if (v != null) {
                        omgVar.a |= 4;
                        break;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        j12 j12Var2 = new j12(str2);
                        Integer num = null;
                        String str4 = null;
                        int i8 = 0;
                        while (true) {
                            String K = j12Var2.K('/', false);
                            j12Var2.Q();
                            if (K != null) {
                                if (num == null || i8 == 0) {
                                    if (!K.equals("normal") && (num != null || (num = (Integer) aog.a.get(K)) == null)) {
                                        if (i8 == 0) {
                                            switch (K) {
                                                case "oblique":
                                                    i8 = 3;
                                                    break;
                                                case "italic":
                                                    i8 = 2;
                                                    break;
                                                case "normal":
                                                    i8 = 1;
                                                    break;
                                                default:
                                                    i8 = 0;
                                                    break;
                                            }
                                            if (i8 != 0) {
                                                continue;
                                            }
                                        }
                                        if (str4 == null && K.equals("small-caps")) {
                                            str4 = K;
                                        }
                                    }
                                }
                                try {
                                    amgVar = (amg) zng.a.get(K);
                                    if (amgVar == null) {
                                        amgVar = s(K);
                                    }
                                } catch (wng unused) {
                                    amgVar = null;
                                }
                                if (j12Var2.m('/')) {
                                    j12Var2.Q();
                                    String J = j12Var2.J();
                                    if (J != null) {
                                        s(J);
                                    }
                                    j12Var2.Q();
                                }
                                if (!j12Var2.q()) {
                                    int i9 = j12Var2.b;
                                    j12Var2.b = j12Var2.c;
                                    str3 = ((String) j12Var2.d).substring(i9);
                                }
                                omgVar.l = q(str3);
                                omgVar.m = amgVar;
                                omgVar.n = Integer.valueOf(num == null ? 400 : num.intValue());
                                omgVar.G = i8 == 0 ? 1 : i8;
                                omgVar.a |= 122880;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 19:
                    ArrayList q = q(str2);
                    omgVar.l = q;
                    if (q != null) {
                        omgVar.a |= 8192;
                        break;
                    }
                    break;
                case 20:
                    try {
                        amg amgVar3 = (amg) zng.a.get(str2);
                        amgVar2 = amgVar3 == null ? s(str2) : amgVar3;
                    } catch (wng unused2) {
                    }
                    omgVar.m = amgVar2;
                    if (amgVar2 != null) {
                        omgVar.a |= 16384;
                        break;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) aog.a.get(str2);
                    omgVar.n = num2;
                    if (num2 != null) {
                        omgVar.a |= 32768;
                        break;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i3 = 3;
                            break;
                        case "italic":
                            i3 = 2;
                            break;
                        case "normal":
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    omgVar.G = i3;
                    if (i3 != 0) {
                        omgVar.a |= 65536;
                        break;
                    }
                    break;
                default:
                    switch (ordinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i4 = 2;
                                    break;
                                case "auto":
                                    i4 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i4 = 3;
                                    break;
                                default:
                                    i4 = 0;
                                    break;
                            }
                            omgVar.M = i4;
                            if (i4 != 0) {
                                omgVar.a |= 137438953472L;
                                break;
                            }
                            break;
                        case 28:
                            String r = r(str2);
                            omgVar.q = r;
                            omgVar.r = r;
                            omgVar.s = r;
                            omgVar.a |= 14680064;
                            break;
                        case 29:
                            omgVar.q = r(str2);
                            omgVar.a |= CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE;
                            break;
                        case 30:
                            omgVar.r = r(str2);
                            omgVar.a |= 4194304;
                            break;
                        case 31:
                            omgVar.s = r(str2);
                            omgVar.a |= 8388608;
                            break;
                        default:
                            switch (ordinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        omgVar.v = slgVar;
                                    } else {
                                        try {
                                            omgVar.v = n(str2);
                                        } catch (wng e2) {
                                            e2.getMessage();
                                            return;
                                        }
                                    }
                                    omgVar.a |= 67108864;
                                    break;
                                case 63:
                                    omgVar.w = v(str2);
                                    omgVar.a |= 134217728;
                                    break;
                                case 64:
                                    xmg w2 = w(str2);
                                    omgVar.d = w2;
                                    if (w2 != null) {
                                        omgVar.a |= 8;
                                        break;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        j12 j12Var3 = new j12(str2);
                                        j12Var3.Q();
                                        if (!j12Var3.q() && (H = j12Var3.H()) != null && !H.f()) {
                                            float f = H.a;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(H);
                                            while (true) {
                                                if (!j12Var3.q()) {
                                                    j12Var3.P();
                                                    amg H2 = j12Var3.H();
                                                    if (H2 != null && !H2.f()) {
                                                        arrayList.add(H2);
                                                        f += H2.a;
                                                    }
                                                } else if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                    amgVarArr = (amg[]) arrayList.toArray(new amg[arrayList.size()]);
                                                }
                                            }
                                        }
                                        omgVar.h = amgVarArr;
                                        if (amgVarArr != null) {
                                            omgVar.a |= 512;
                                            break;
                                        }
                                    } else {
                                        omgVar.h = null;
                                        omgVar.a |= 512;
                                        break;
                                    }
                                    break;
                                case 66:
                                    omgVar.i = s(str2);
                                    omgVar.a |= 1024;
                                    break;
                                case 67:
                                    int i10 = "butt".equals(str2) ? 1 : TeamOfTheWeekRoundsResponseKt.TOTW_ROUND.equals(str2) ? 2 : "square".equals(str2) ? 3 : 0;
                                    omgVar.E = i10;
                                    if (i10 != 0) {
                                        omgVar.a |= 64;
                                        break;
                                    }
                                    break;
                                case 68:
                                    int i11 = "miter".equals(str2) ? 1 : TeamOfTheWeekRoundsResponseKt.TOTW_ROUND.equals(str2) ? 2 : "bevel".equals(str2) ? 3 : 0;
                                    omgVar.F = i11;
                                    if (i11 != 0) {
                                        omgVar.a |= 128;
                                        break;
                                    }
                                    break;
                                case 69:
                                    omgVar.g = Float.valueOf(p(str2));
                                    omgVar.a |= 256;
                                    break;
                                case 70:
                                    Float v2 = v(str2);
                                    omgVar.e = v2;
                                    if (v2 != null) {
                                        omgVar.a |= 16;
                                        break;
                                    }
                                    break;
                                case 71:
                                    omgVar.f = s(str2);
                                    omgVar.a |= 32;
                                    break;
                                default:
                                    switch (ordinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                omgVar.B = slgVar;
                                            } else {
                                                try {
                                                    omgVar.B = n(str2);
                                                } catch (wng e3) {
                                                    e3.getMessage();
                                                    return;
                                                }
                                            }
                                            omgVar.a |= 8589934592L;
                                            break;
                                        case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                            omgVar.C = v(str2);
                                            omgVar.a |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    omgVar.u = Boolean.valueOf(str2.equals("visible"));
                                                    omgVar.a |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                            }
                    }
            }
        } catch (wng unused3) {
        }
    }

    public static int b(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = f % 360.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? me4.b(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? me4.b(4.0f, f3, f2 - f, f) : f;
    }

    public static void f(qmg qmgVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int e = ljg.e(attributes, i);
            if (e != 73) {
                switch (e) {
                    case 52:
                        j12 j12Var = new j12(trim);
                        HashSet hashSet = new HashSet();
                        while (!j12Var.q()) {
                            String J = j12Var.J();
                            if (J.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(J.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            j12Var.Q();
                        }
                        qmgVar.e(hashSet);
                        break;
                    case 53:
                        qmgVar.j(trim);
                        break;
                    case 54:
                        j12 j12Var2 = new j12(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!j12Var2.q()) {
                            hashSet2.add(j12Var2.J());
                            j12Var2.Q();
                        }
                        qmgVar.k(hashSet2);
                        break;
                    case 55:
                        ArrayList q = q(trim);
                        qmgVar.i(q != null ? new HashSet(q) : new HashSet(0));
                        break;
                }
            } else {
                j12 j12Var3 = new j12(trim);
                HashSet hashSet3 = new HashSet();
                while (!j12Var3.q()) {
                    String J2 = j12Var3.J();
                    int indexOf = J2.indexOf(45);
                    if (indexOf != -1) {
                        J2 = J2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(J2, "", "").getLanguage());
                    j12Var3.Q();
                }
                qmgVar.g(hashSet3);
            }
        }
    }

    public static void g(umg umgVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                umgVar.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if (BuildConfig.FLAVOR.equals(trim)) {
                    umgVar.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new wng(dmi.q("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    umgVar.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(vlg vlgVar, Attributes attributes) {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int e = ljg.e(attributes, i2);
            if (e == 23) {
                vlgVar.j = z(trim);
            } else if (e != 24) {
                if (e != 26) {
                    if (e == 60) {
                        if (trim != null) {
                            try {
                                if (trim.equals("pad")) {
                                    i = 1;
                                } else if (trim.equals("reflect")) {
                                    i = 2;
                                } else if (trim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    a70.p("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(trim));
                                }
                                vlgVar.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new wng(lnb.o("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                            }
                        } else {
                            yhk.s("Name is null");
                        }
                        i = 0;
                        vlgVar.k = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    vlgVar.l = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                vlgVar.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    ilg.i("Invalid value for attribute gradientUnits");
                    return;
                }
                vlgVar.i = Boolean.TRUE;
            }
        }
    }

    public static void i(jmg jmgVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (cog.a(attributes.getLocalName(i)) == cog.b) {
                j12 j12Var = new j12(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                j12Var.Q();
                while (!j12Var.q()) {
                    float G = j12Var.G();
                    if (Float.isNaN(G)) {
                        throw new wng(lnb.o("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    j12Var.P();
                    float G2 = j12Var.G();
                    if (Float.isNaN(G2)) {
                        throw new wng(lnb.o("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    j12Var.P();
                    arrayList.add(Float.valueOf(G));
                    arrayList.add(Float.valueOf(G2));
                }
                jmgVar.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    jmgVar.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(umg umgVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int e = ljg.e(attributes, i);
                if (e == 0) {
                    qd2 qd2Var = new qd2(trim);
                    ArrayList arrayList = null;
                    while (!qd2Var.q()) {
                        String J = qd2Var.J();
                        if (J != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(J);
                            qd2Var.Q();
                        }
                    }
                    umgVar.g = arrayList;
                } else if (e != 72) {
                    omg omgVar = umgVar.e;
                    if (omgVar == null) {
                        omgVar = new omg();
                        umgVar.e = omgVar;
                    }
                    C(omgVar, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    j12 j12Var = new j12(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String K = j12Var.K(':', false);
                        j12Var.Q();
                        if (!j12Var.m(':')) {
                            break;
                        }
                        j12Var.Q();
                        String K2 = j12Var.K(';', true);
                        if (K2 == null) {
                            break;
                        }
                        j12Var.Q();
                        if (j12Var.q() || j12Var.m(';')) {
                            omg omgVar2 = umgVar.f;
                            if (omgVar2 == null) {
                                omgVar2 = new omg();
                                umgVar.f = omgVar2;
                            }
                            C(omgVar2, K, K2);
                            j12Var.Q();
                        }
                    }
                }
            }
        }
    }

    public static void k(jng jngVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int e = ljg.e(attributes, i);
            if (e == 9) {
                jngVar.p = t(trim);
            } else if (e == 10) {
                jngVar.q = t(trim);
            } else if (e == 82) {
                jngVar.n = t(trim);
            } else if (e == 83) {
                jngVar.o = t(trim);
            }
        }
    }

    public static void l(ylg ylgVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (cog.a(attributes.getLocalName(i)) == cog.c) {
                ylgVar.l(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(ang angVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int e = ljg.e(attributes, i);
            if (e == 48) {
                x(angVar, trim);
            } else if (e != 80) {
                continue;
            } else {
                j12 j12Var = new j12(trim);
                j12Var.Q();
                float G = j12Var.G();
                j12Var.P();
                float G2 = j12Var.G();
                j12Var.P();
                float G3 = j12Var.G();
                j12Var.P();
                float G4 = j12Var.G();
                if (Float.isNaN(G) || Float.isNaN(G2) || Float.isNaN(G3) || Float.isNaN(G4)) {
                    ilg.i("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (G3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    ilg.i("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (G4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        ilg.i("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    angVar.o = new w0d(G, G2, G3, G4);
                }
            }
        }
    }

    public static rlg n(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            r5a r5aVar = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    r5aVar = new r5a(j2, i2);
                }
            }
            if (r5aVar == null) {
                throw new wng("Bad hex colour value: ".concat(str));
            }
            long j3 = r5aVar.b;
            int i3 = r5aVar.a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new rlg(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new rlg(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new wng("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new rlg((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new rlg((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            j12 j12Var = new j12(str.substring(startsWith ? 5 : 4));
            j12Var.Q();
            float G = j12Var.G();
            if (!Float.isNaN(G) && j12Var.m('%')) {
                G = (G * 256.0f) / 100.0f;
            }
            float l = j12Var.l(G);
            if (!Float.isNaN(l) && j12Var.m('%')) {
                l = (l * 256.0f) / 100.0f;
            }
            float l2 = j12Var.l(l);
            if (!Float.isNaN(l2) && j12Var.m('%')) {
                l2 = (l2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                j12Var.Q();
                if (Float.isNaN(l2) || !j12Var.m(')')) {
                    throw new wng("Bad rgb() colour value: ".concat(str));
                }
                return new rlg((b(G) << 16) | (-16777216) | (b(l) << 8) | b(l2));
            }
            float l3 = j12Var.l(l2);
            j12Var.Q();
            if (Float.isNaN(l3) || !j12Var.m(')')) {
                throw new wng("Bad rgba() colour value: ".concat(str));
            }
            return new rlg((b(l3 * 256.0f) << 24) | (b(G) << 16) | (b(l) << 8) | b(l2));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) yng.a.get(lowerCase);
            if (num != null) {
                return new rlg(num.intValue());
            }
            throw new wng("Invalid colour keyword: ".concat(lowerCase));
        }
        j12 j12Var2 = new j12(str.substring(startsWith2 ? 5 : 4));
        j12Var2.Q();
        float G2 = j12Var2.G();
        float l4 = j12Var2.l(G2);
        if (!Float.isNaN(l4)) {
            j12Var2.m('%');
        }
        float l5 = j12Var2.l(l4);
        if (!Float.isNaN(l5)) {
            j12Var2.m('%');
        }
        if (!startsWith2) {
            j12Var2.Q();
            if (Float.isNaN(l5) || !j12Var2.m(')')) {
                throw new wng("Bad hsl() colour value: ".concat(str));
            }
            return new rlg(d(G2, l4, l5) | (-16777216));
        }
        float l6 = j12Var2.l(l5);
        j12Var2.Q();
        if (Float.isNaN(l6) || !j12Var2.m(')')) {
            throw new wng("Bad hsla() colour value: ".concat(str));
        }
        return new rlg((b(l6 * 256.0f) << 24) | d(G2, l4, l5));
    }

    public static float o(int i, String str) {
        float a = new zid(0).a(0, i, str);
        if (Float.isNaN(a)) {
            throw new wng(dmi.q("Invalid float value: ", str));
        }
        return a;
    }

    public static float p(String str) {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        ilg.i("Invalid float value (empty string)");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static ArrayList q(String str) {
        j12 j12Var = new j12(str);
        ArrayList arrayList = null;
        do {
            String I = j12Var.I();
            if (I == null) {
                I = j12Var.K(',', true);
            }
            if (I == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(I);
            j12Var.P();
        } while (!j12Var.q());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static amg s(String str) {
        int i;
        if (str.length() == 0) {
            ilg.i("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            i = 9;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                i = ljg.y(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new wng("Invalid length unit specifier: ".concat(str));
            }
        } else {
            i = 1;
        }
        try {
            return new amg(o(length, str), i);
        } catch (NumberFormatException e) {
            throw new wng("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) {
        if (str.length() == 0) {
            ilg.i("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        j12 j12Var = new j12(str);
        j12Var.Q();
        while (!j12Var.q()) {
            float G = j12Var.G();
            if (Float.isNaN(G)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) j12Var.d;
                int i = j12Var.b;
                while (!j12Var.q() && !j12.B(str2.charAt(j12Var.b))) {
                    j12Var.b++;
                }
                String substring = str2.substring(i, j12Var.b);
                j12Var.b = i;
                sb.append(substring);
                throw new wng(sb.toString());
            }
            int L = j12Var.L();
            if (L == 0) {
                L = 1;
            }
            arrayList.add(new amg(G, L));
            j12Var.P();
        }
        return arrayList;
    }

    public static amg u(j12 j12Var) {
        return j12Var.o("auto") ? new amg(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : j12Var.H();
    }

    public static Float v(String str) {
        try {
            float p = p(str);
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (p >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = 1.0f;
                if (p > 1.0f) {
                }
                return Float.valueOf(p);
            }
            p = f;
            return Float.valueOf(p);
        } catch (wng unused) {
            return null;
        }
    }

    public static xmg w(String str) {
        boolean startsWith = str.startsWith("url(");
        xmg xmgVar = rlg.c;
        xmg xmgVar2 = slg.a;
        xmg xmgVar3 = null;
        if (!startsWith) {
            if (str.equals("none")) {
                return xmgVar;
            }
            if (str.equals("currentColor")) {
                return xmgVar2;
            }
            try {
                return n(str);
            } catch (wng unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new fmg(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals("none")) {
                if (trim2.equals("currentColor")) {
                    xmgVar = xmgVar2;
                } else {
                    try {
                        xmgVar = n(trim2);
                    } catch (wng unused2) {
                        xmgVar = null;
                    }
                }
            }
            xmgVar3 = xmgVar;
        }
        return new fmg(trim, xmgVar3);
    }

    public static void x(ymg ymgVar, String str) {
        int i;
        j12 j12Var = new j12(str);
        j12Var.Q();
        String J = j12Var.J();
        if ("defer".equals(J)) {
            j12Var.Q();
            J = j12Var.J();
        }
        e6f e6fVar = (e6f) xng.a.get(J);
        j12Var.Q();
        if (j12Var.q()) {
            i = 0;
        } else {
            String J2 = j12Var.J();
            J2.getClass();
            if (J2.equals("meet")) {
                i = 1;
            } else {
                if (!J2.equals("slice")) {
                    throw new wng("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        ymgVar.n = new f6f(e6fVar, i);
    }

    public static HashMap y(j12 j12Var) {
        HashMap hashMap = new HashMap();
        j12Var.Q();
        String K = j12Var.K(C4427z5.U, false);
        while (K != null) {
            j12Var.m(C4427z5.U);
            hashMap.put(K, j12Var.I());
            j12Var.Q();
            K = j12Var.K(C4427z5.U, false);
        }
        return hashMap;
    }

    public static Matrix z(String str) {
        Matrix matrix = new Matrix();
        j12 j12Var = new j12(str);
        j12Var.Q();
        while (!j12Var.q()) {
            String str2 = (String) j12Var.d;
            String str3 = null;
            if (!j12Var.q()) {
                int i = j12Var.b;
                int charAt = str2.charAt(i);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = j12Var.h();
                    }
                }
                int i2 = j12Var.b;
                while (j12.B(charAt)) {
                    charAt = j12Var.h();
                }
                if (charAt == 40) {
                    j12Var.b++;
                    str3 = str2.substring(i, i2);
                } else {
                    j12Var.b = i;
                }
            }
            if (str3 == null) {
                throw new wng("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str3) {
                case "matrix":
                    j12Var.Q();
                    float G = j12Var.G();
                    j12Var.P();
                    float G2 = j12Var.G();
                    j12Var.P();
                    float G3 = j12Var.G();
                    j12Var.P();
                    float G4 = j12Var.G();
                    j12Var.P();
                    float G5 = j12Var.G();
                    j12Var.P();
                    float G6 = j12Var.G();
                    j12Var.Q();
                    if (!Float.isNaN(G6) && j12Var.m(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{G, G3, G5, G2, G4, G6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                case "rotate":
                    j12Var.Q();
                    float G7 = j12Var.G();
                    float M = j12Var.M();
                    float M2 = j12Var.M();
                    j12Var.Q();
                    if (Float.isNaN(G7) || !j12Var.m(')')) {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(M)) {
                        matrix.preRotate(G7);
                        break;
                    } else if (!Float.isNaN(M2)) {
                        matrix.preRotate(G7, M, M2);
                        break;
                    } else {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    j12Var.Q();
                    float G8 = j12Var.G();
                    float M3 = j12Var.M();
                    j12Var.Q();
                    if (!Float.isNaN(G8) && j12Var.m(')')) {
                        if (!Float.isNaN(M3)) {
                            matrix.preScale(G8, M3);
                            break;
                        } else {
                            matrix.preScale(G8, G8);
                            break;
                        }
                    } else {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    j12Var.Q();
                    float G9 = j12Var.G();
                    j12Var.Q();
                    if (!Float.isNaN(G9) && j12Var.m(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(G9)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        break;
                    } else {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    j12Var.Q();
                    float G10 = j12Var.G();
                    j12Var.Q();
                    if (!Float.isNaN(G10) && j12Var.m(')')) {
                        matrix.preSkew(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.tan(Math.toRadians(G10)));
                        break;
                    } else {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    j12Var.Q();
                    float G11 = j12Var.G();
                    float M4 = j12Var.M();
                    j12Var.Q();
                    if (!Float.isNaN(G11) && j12Var.m(')')) {
                        if (!Float.isNaN(M4)) {
                            matrix.preTranslate(G11, M4);
                            break;
                        } else {
                            matrix.preTranslate(G11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        }
                    } else {
                        throw new wng("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new wng(lnb.o("Invalid transform list fn: ", str3, ")"));
            }
            if (j12Var.q()) {
                return matrix;
            }
            j12Var.P();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            bog bogVar = new bog(this);
            xMLReader.setContentHandler(bogVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", bogVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new wng("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new wng("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new wng("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                eog eogVar = new eog();
                eogVar.a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        newPullParser.getText();
                        j12 j12Var = new j12(newPullParser.getText());
                        String J = j12Var.J();
                        y(j12Var);
                        J.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            E(newPullParser.getNamespace(), newPullParser.getName(), name, eogVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            G(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            F(newPullParser.getText());
                        }
                    } else if (((pmg) this.a.c) == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            inputStream.reset();
                            A(inputStream);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
            } catch (IOException e) {
                throw new wng("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new wng("XML parser problem", e2);
        }
    }

    public final void D() {
        ejg ejgVar = new ejg(17, false);
        ejgVar.c = null;
        ejgVar.b = new zl1(1);
        ejgVar.d = new HashMap();
        this.a = ejgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0451, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05f4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x091e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0b2c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0d49, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0873 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(String str, String str2, String str3, Attributes attributes) {
        char c;
        float G;
        float f;
        float f2;
        float f3;
        float f4;
        char charAt;
        Object[] objArr;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            dog dogVar = (dog) dog.e.get(str2.length() > 0 ? str2 : str3);
            if (dogVar == null) {
                dogVar = dog.d;
            }
            int i = 77;
            byte b = 0;
            switch (dogVar.ordinal()) {
                case 0:
                    pmg pmgVar = new pmg();
                    pmgVar.a = this.a;
                    pmgVar.b = this.b;
                    g(pmgVar, attributes);
                    j(pmgVar, attributes);
                    f(pmgVar, attributes);
                    m(pmgVar, attributes);
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        String trim = attributes.getValue(i2).trim();
                        int e = ljg.e(attributes, i2);
                        if (e == 25) {
                            amg s = s(trim);
                            pmgVar.s = s;
                            if (s.f()) {
                                ilg.i("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (e != 79) {
                            switch (e) {
                                case 81:
                                    amg s2 = s(trim);
                                    pmgVar.r = s2;
                                    if (s2.f()) {
                                        ilg.i("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    pmgVar.p = s(trim);
                                    break;
                                case 83:
                                    pmgVar.q = s(trim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    smg smgVar = this.b;
                    if (smgVar == null) {
                        this.a.c = pmgVar;
                    } else {
                        smgVar.h(pmgVar);
                    }
                    this.b = pmgVar;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    xlg xlgVar = new xlg();
                    xlgVar.a = this.a;
                    xlgVar.b = this.b;
                    g(xlgVar, attributes);
                    j(xlgVar, attributes);
                    l(xlgVar, attributes);
                    f(xlgVar, attributes);
                    this.b.h(xlgVar);
                    this.b = xlgVar;
                    return;
                case 2:
                    smg smgVar2 = this.b;
                    if (smgVar2 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    plg plgVar = new plg();
                    plgVar.a = this.a;
                    plgVar.b = smgVar2;
                    g(plgVar, attributes);
                    j(plgVar, attributes);
                    l(plgVar, attributes);
                    f(plgVar, attributes);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String trim2 = attributes.getValue(i3).trim();
                        int e2 = ljg.e(attributes, i3);
                        if (e2 == 6) {
                            plgVar.o = s(trim2);
                        } else if (e2 == 7) {
                            plgVar.p = s(trim2);
                        } else if (e2 != 49) {
                            continue;
                        } else {
                            amg s3 = s(trim2);
                            plgVar.q = s3;
                            if (s3.f()) {
                                ilg.i("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.h(plgVar);
                    return;
                case 3:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qlg qlgVar = new qlg();
                    qlgVar.a = this.a;
                    qlgVar.b = this.b;
                    g(qlgVar, attributes);
                    j(qlgVar, attributes);
                    l(qlgVar, attributes);
                    f(qlgVar, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String trim3 = attributes.getValue(i4).trim();
                        if (ljg.e(attributes, i4) == 3) {
                            if ("objectBoundingBox".equals(trim3)) {
                                qlgVar.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim3)) {
                                    ilg.i("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                qlgVar.o = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.h(qlgVar);
                    this.b = qlgVar;
                    return;
                case 4:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tlg tlgVar = new tlg();
                    tlgVar.a = this.a;
                    tlgVar.b = this.b;
                    g(tlgVar, attributes);
                    j(tlgVar, attributes);
                    l(tlgVar, attributes);
                    this.b.h(tlgVar);
                    this.b = tlgVar;
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = dogVar;
                    return;
                case 6:
                    smg smgVar3 = this.b;
                    if (smgVar3 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ulg ulgVar = new ulg();
                    ulgVar.a = this.a;
                    ulgVar.b = smgVar3;
                    g(ulgVar, attributes);
                    j(ulgVar, attributes);
                    l(ulgVar, attributes);
                    f(ulgVar, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String trim4 = attributes.getValue(i5).trim();
                        int e3 = ljg.e(attributes, i5);
                        if (e3 == 6) {
                            ulgVar.o = s(trim4);
                        } else if (e3 == 7) {
                            ulgVar.p = s(trim4);
                        } else if (e3 == 56) {
                            amg s4 = s(trim4);
                            ulgVar.q = s4;
                            if (s4.f()) {
                                ilg.i("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (e3 != 57) {
                            continue;
                        } else {
                            amg s5 = s(trim4);
                            ulgVar.r = s5;
                            if (s5.f()) {
                                ilg.i("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.h(ulgVar);
                    return;
                case 8:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zlg zlgVar = new zlg();
                    zlgVar.a = this.a;
                    zlgVar.b = this.b;
                    g(zlgVar, attributes);
                    j(zlgVar, attributes);
                    l(zlgVar, attributes);
                    f(zlgVar, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String trim5 = attributes.getValue(i6).trim();
                        int e4 = ljg.e(attributes, i6);
                        if (e4 == 25) {
                            amg s6 = s(trim5);
                            zlgVar.s = s6;
                            if (s6.f()) {
                                ilg.i("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (e4 != 26) {
                            if (e4 != 48) {
                                switch (e4) {
                                    case 81:
                                        amg s7 = s(trim5);
                                        zlgVar.r = s7;
                                        if (s7.f()) {
                                            ilg.i("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                    case 82:
                                        zlgVar.p = s(trim5);
                                        break;
                                    case 83:
                                        zlgVar.q = s(trim5);
                                        break;
                                }
                            } else {
                                x(zlgVar, trim5);
                            }
                        } else if ("".equals(attributes.getURI(i6)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i6))) {
                            zlgVar.o = trim5;
                        }
                    }
                    this.b.h(zlgVar);
                    this.b = zlgVar;
                    return;
                case 9:
                    smg smgVar4 = this.b;
                    if (smgVar4 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    bmg bmgVar = new bmg();
                    bmgVar.a = this.a;
                    bmgVar.b = smgVar4;
                    g(bmgVar, attributes);
                    j(bmgVar, attributes);
                    l(bmgVar, attributes);
                    f(bmgVar, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String trim6 = attributes.getValue(i7).trim();
                        switch (ljg.e(attributes, i7)) {
                            case 84:
                                bmgVar.o = s(trim6);
                                break;
                            case 85:
                                bmgVar.p = s(trim6);
                                break;
                            case 86:
                                bmgVar.q = s(trim6);
                                break;
                            case 87:
                                bmgVar.r = s(trim6);
                                break;
                        }
                    }
                    this.b.h(bmgVar);
                    return;
                case 10:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    vmg vmgVar = new vmg();
                    vmgVar.a = this.a;
                    vmgVar.b = this.b;
                    g(vmgVar, attributes);
                    j(vmgVar, attributes);
                    h(vmgVar, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String trim7 = attributes.getValue(i8).trim();
                        switch (ljg.e(attributes, i8)) {
                            case 84:
                                vmgVar.m = s(trim7);
                                break;
                            case 85:
                                vmgVar.n = s(trim7);
                                break;
                            case 86:
                                vmgVar.o = s(trim7);
                                break;
                            case 87:
                                vmgVar.p = s(trim7);
                                break;
                        }
                    }
                    this.b.h(vmgVar);
                    this.b = vmgVar;
                    return;
                case 11:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    cmg cmgVar = new cmg();
                    cmgVar.a = this.a;
                    cmgVar.b = this.b;
                    g(cmgVar, attributes);
                    j(cmgVar, attributes);
                    f(cmgVar, attributes);
                    m(cmgVar, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String trim8 = attributes.getValue(i9).trim();
                        int e5 = ljg.e(attributes, i9);
                        if (e5 != 41) {
                            if (e5 == 50) {
                                cmgVar.q = s(trim8);
                            } else if (e5 != 51) {
                                switch (e5) {
                                    case 32:
                                        amg s8 = s(trim8);
                                        cmgVar.t = s8;
                                        if (s8.f()) {
                                            ilg.i("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        continue;
                                    case 33:
                                        if (!"strokeWidth".equals(trim8)) {
                                            if ("userSpaceOnUse".equals(trim8)) {
                                                cmgVar.p = true;
                                                break;
                                            } else {
                                                ilg.i("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                        } else {
                                            cmgVar.p = false;
                                            continue;
                                        }
                                    case 34:
                                        amg s9 = s(trim8);
                                        cmgVar.s = s9;
                                        if (s9.f()) {
                                            ilg.i("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                cmgVar.r = s(trim8);
                            }
                        } else if ("auto".equals(trim8)) {
                            cmgVar.u = Float.valueOf(Float.NaN);
                        } else {
                            cmgVar.u = Float.valueOf(p(trim8));
                        }
                    }
                    this.b.h(cmgVar);
                    this.b = cmgVar;
                    return;
                case 12:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    dmg dmgVar = new dmg();
                    dmgVar.a = this.a;
                    dmgVar.b = this.b;
                    g(dmgVar, attributes);
                    j(dmgVar, attributes);
                    f(dmgVar, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String trim9 = attributes.getValue(i10).trim();
                        int e6 = ljg.e(attributes, i10);
                        if (e6 == 25) {
                            amg s10 = s(trim9);
                            dmgVar.q = s10;
                            if (s10.f()) {
                                ilg.i("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (e6 != 36) {
                            if (e6 != 37) {
                                switch (e6) {
                                    case 81:
                                        amg s11 = s(trim9);
                                        dmgVar.p = s11;
                                        if (s11.f()) {
                                            ilg.i("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                    case 82:
                                        s(trim9);
                                        break;
                                    case 83:
                                        s(trim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(trim9)) {
                                dmgVar.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim9)) {
                                    ilg.i("Invalid value for attribute maskUnits");
                                    return;
                                }
                                dmgVar.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(trim9)) {
                            dmgVar.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(trim9)) {
                                ilg.i("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            dmgVar.o = Boolean.TRUE;
                        }
                    }
                    this.b.h(dmgVar);
                    this.b = dmgVar;
                    return;
                case 13:
                    smg smgVar5 = this.b;
                    if (smgVar5 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    gmg gmgVar = new gmg();
                    gmgVar.a = this.a;
                    gmgVar.b = smgVar5;
                    g(gmgVar, attributes);
                    j(gmgVar, attributes);
                    l(gmgVar, attributes);
                    f(gmgVar, attributes);
                    int i11 = 0;
                    while (i11 < attributes.getLength()) {
                        String trim10 = attributes.getValue(i11).trim();
                        int e7 = ljg.e(attributes, i11);
                        if (e7 == 13) {
                            j12 j12Var = new j12(trim10);
                            j12 j12Var2 = new j12(b, 4);
                            j12Var2.b = b;
                            j12Var2.c = b;
                            j12Var2.d = new byte[8];
                            j12Var2.e = new float[16];
                            if (!j12Var.q()) {
                                int intValue = j12Var.F().intValue();
                                int i12 = 109;
                                if (intValue == i || intValue == 109) {
                                    float f5 = 0.0f;
                                    float f6 = 0.0f;
                                    float f7 = 0.0f;
                                    float f8 = 0.0f;
                                    float f9 = 0.0f;
                                    float f10 = 0.0f;
                                    while (true) {
                                        j12Var.Q();
                                        switch (intValue) {
                                            case 65:
                                            case 97:
                                                float f11 = f7;
                                                c = 'a';
                                                float G2 = j12Var.G();
                                                float l = j12Var.l(G2);
                                                float l2 = j12Var.l(l);
                                                Boolean k = j12Var.k(Float.valueOf(l2));
                                                Boolean k2 = j12Var.k(k);
                                                if (k2 == null) {
                                                    G = Float.NaN;
                                                } else {
                                                    j12Var.P();
                                                    G = j12Var.G();
                                                }
                                                float l3 = j12Var.l(G);
                                                if (!Float.isNaN(l3) && G2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && l >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                    if (intValue == 97) {
                                                        G += f5;
                                                        l3 += f11;
                                                    }
                                                    float f12 = G;
                                                    float f13 = l3;
                                                    j12Var2.f(G2, l, l2, k.booleanValue(), k2.booleanValue(), f12, f13);
                                                    f5 = f12;
                                                    f6 = f5;
                                                    f7 = f13;
                                                    f8 = f7;
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                        break;
                                                    } else {
                                                        int i13 = j12Var.b;
                                                        if (i13 != j12Var.c && (((charAt = ((String) j12Var.d).charAt(i13)) >= c && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                            intValue = j12Var.F().intValue();
                                                        }
                                                        i12 = 109;
                                                    }
                                                }
                                                break;
                                            case 67:
                                            case 99:
                                                c = 'a';
                                                float G3 = j12Var.G();
                                                float l4 = j12Var.l(G3);
                                                float l5 = j12Var.l(l4);
                                                float l6 = j12Var.l(l5);
                                                float l7 = j12Var.l(l6);
                                                float l8 = j12Var.l(l7);
                                                if (Float.isNaN(l8)) {
                                                    break;
                                                } else {
                                                    if (intValue == 99) {
                                                        l7 += f5;
                                                        l8 += f7;
                                                        G3 += f5;
                                                        l4 += f7;
                                                        l5 += f5;
                                                        l6 += f7;
                                                    }
                                                    f = l8;
                                                    f2 = l7;
                                                    f3 = l6;
                                                    f4 = l5;
                                                    j12Var2.d(G3, l4, f4, f3, f2, f);
                                                    f6 = f4;
                                                    f8 = f3;
                                                    f5 = f2;
                                                    f7 = f;
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case 72:
                                            case 104:
                                                c = 'a';
                                                float G4 = j12Var.G();
                                                if (Float.isNaN(G4)) {
                                                    break;
                                                } else {
                                                    if (intValue == 104) {
                                                        G4 += f5;
                                                    }
                                                    f5 = G4;
                                                    j12Var2.g(f5, f7);
                                                    f6 = f5;
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                                            case 108:
                                                c = 'a';
                                                float G5 = j12Var.G();
                                                float l9 = j12Var.l(G5);
                                                if (Float.isNaN(l9)) {
                                                    break;
                                                } else {
                                                    if (intValue == 108) {
                                                        G5 += f5;
                                                        l9 += f7;
                                                    }
                                                    f5 = G5;
                                                    f7 = l9;
                                                    j12Var2.g(f5, f7);
                                                    f6 = f5;
                                                    f8 = f7;
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                            case 109:
                                                c = 'a';
                                                float G6 = j12Var.G();
                                                float l10 = j12Var.l(G6);
                                                if (Float.isNaN(l10)) {
                                                    break;
                                                } else {
                                                    if (intValue == i12 && j12Var2.b != 0) {
                                                        G6 += f5;
                                                        l10 += f7;
                                                    }
                                                    f5 = G6;
                                                    f7 = l10;
                                                    j12Var2.c(f5, f7);
                                                    f6 = f5;
                                                    f9 = f6;
                                                    f8 = f7;
                                                    f10 = f8;
                                                    intValue = intValue != i12 ? 76 : 108;
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case 81:
                                            case 113:
                                                c = 'a';
                                                f6 = j12Var.G();
                                                float l11 = j12Var.l(f6);
                                                float l12 = j12Var.l(l11);
                                                float l13 = j12Var.l(l12);
                                                if (Float.isNaN(l13)) {
                                                    break;
                                                } else {
                                                    if (intValue == 113) {
                                                        l12 += f5;
                                                        l13 += f7;
                                                        f6 += f5;
                                                        l11 += f7;
                                                    }
                                                    f5 = l12;
                                                    f7 = l13;
                                                    f8 = l11;
                                                    j12Var2.a(f6, f8, f5, f7);
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case 83:
                                            case INVALID_INDEX_URL_VALUE:
                                                float f14 = (f5 * 2.0f) - f6;
                                                float f15 = (2.0f * f7) - f8;
                                                float G7 = j12Var.G();
                                                f3 = j12Var.l(G7);
                                                float l14 = j12Var.l(f3);
                                                f = j12Var.l(l14);
                                                if (Float.isNaN(f)) {
                                                    break;
                                                } else {
                                                    if (intValue == 115) {
                                                        l14 += f5;
                                                        f += f7;
                                                        G7 += f5;
                                                        f3 += f7;
                                                    }
                                                    f2 = l14;
                                                    c = 'a';
                                                    f4 = G7;
                                                    j12Var2.d(f14, f15, f4, f3, f2, f);
                                                    f6 = f4;
                                                    f8 = f3;
                                                    f5 = f2;
                                                    f7 = f;
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case 84:
                                            case GZIP_ENCODE_ERROR_VALUE:
                                                f6 = (f5 * 2.0f) - f6;
                                                f8 = (2.0f * f7) - f8;
                                                float G8 = j12Var.G();
                                                float l15 = j12Var.l(G8);
                                                if (Float.isNaN(l15)) {
                                                    break;
                                                } else {
                                                    if (intValue == 116) {
                                                        G8 += f5;
                                                        l15 += f7;
                                                    }
                                                    f5 = G8;
                                                    f7 = l15;
                                                    j12Var2.a(f6, f8, f5, f7);
                                                    c = 'a';
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case 86:
                                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                float G9 = j12Var.G();
                                                if (Float.isNaN(G9)) {
                                                    break;
                                                } else {
                                                    if (intValue == 118) {
                                                        G9 += f7;
                                                    }
                                                    f7 = G9;
                                                    j12Var2.g(f5, f7);
                                                    f8 = f7;
                                                    c = 'a';
                                                    j12Var.P();
                                                    if (!j12Var.q()) {
                                                    }
                                                }
                                                break;
                                            case 90:
                                            case INVALID_ADS_ENDPOINT_VALUE:
                                                j12Var2.close();
                                                f5 = f9;
                                                f6 = f5;
                                                f7 = f10;
                                                f8 = f7;
                                                c = 'a';
                                                j12Var.P();
                                                if (!j12Var.q()) {
                                                }
                                                break;
                                        }
                                    }
                                }
                            }
                            gmgVar.o = j12Var2;
                        } else if (e7 == 43 && p(trim10) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            ilg.i("Invalid <path> element. pathLength cannot be negative");
                            return;
                        }
                        i11++;
                        i = 77;
                        b = 0;
                    }
                    this.b.h(gmgVar);
                    return;
                case 14:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    img imgVar = new img();
                    imgVar.a = this.a;
                    imgVar.b = this.b;
                    g(imgVar, attributes);
                    j(imgVar, attributes);
                    f(imgVar, attributes);
                    m(imgVar, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String trim11 = attributes.getValue(i14).trim();
                        int e8 = ljg.e(attributes, i14);
                        if (e8 == 25) {
                            amg s12 = s(trim11);
                            imgVar.v = s12;
                            if (s12.f()) {
                                ilg.i("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (e8 != 26) {
                            switch (e8) {
                                case 44:
                                    if (!"objectBoundingBox".equals(trim11)) {
                                        if ("userSpaceOnUse".equals(trim11)) {
                                            imgVar.q = Boolean.TRUE;
                                            break;
                                        } else {
                                            ilg.i("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                    } else {
                                        imgVar.q = Boolean.FALSE;
                                        break;
                                    }
                                case 45:
                                    imgVar.r = z(trim11);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(trim11)) {
                                        if ("userSpaceOnUse".equals(trim11)) {
                                            imgVar.p = Boolean.TRUE;
                                            break;
                                        } else {
                                            ilg.i("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                    } else {
                                        imgVar.p = Boolean.FALSE;
                                        break;
                                    }
                                default:
                                    switch (e8) {
                                        case 81:
                                            amg s13 = s(trim11);
                                            imgVar.u = s13;
                                            if (s13.f()) {
                                                ilg.i("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                        case 82:
                                            imgVar.s = s(trim11);
                                            break;
                                        case 83:
                                            imgVar.t = s(trim11);
                                            break;
                                    }
                            }
                        } else if ("".equals(attributes.getURI(i14)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i14))) {
                            imgVar.w = trim11;
                        }
                    }
                    this.b.h(imgVar);
                    this.b = imgVar;
                    return;
                case 15:
                    smg smgVar6 = this.b;
                    if (smgVar6 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    kmg kmgVar = new kmg();
                    kmgVar.a = this.a;
                    kmgVar.b = smgVar6;
                    g(kmgVar, attributes);
                    j(kmgVar, attributes);
                    l(kmgVar, attributes);
                    f(kmgVar, attributes);
                    i(kmgVar, attributes, "polygon");
                    this.b.h(kmgVar);
                    return;
                case 16:
                    smg smgVar7 = this.b;
                    if (smgVar7 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    jmg jmgVar = new jmg();
                    jmgVar.a = this.a;
                    jmgVar.b = smgVar7;
                    g(jmgVar, attributes);
                    j(jmgVar, attributes);
                    l(jmgVar, attributes);
                    f(jmgVar, attributes);
                    i(jmgVar, attributes, "polyline");
                    this.b.h(jmgVar);
                    return;
                case 17:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zmg zmgVar = new zmg();
                    zmgVar.a = this.a;
                    zmgVar.b = this.b;
                    g(zmgVar, attributes);
                    j(zmgVar, attributes);
                    h(zmgVar, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String trim12 = attributes.getValue(i15).trim();
                        int e9 = ljg.e(attributes, i15);
                        if (e9 == 6) {
                            zmgVar.m = s(trim12);
                        } else if (e9 == 7) {
                            zmgVar.n = s(trim12);
                        } else if (e9 == 11) {
                            zmgVar.p = s(trim12);
                        } else if (e9 == 12) {
                            zmgVar.q = s(trim12);
                        } else if (e9 != 49) {
                            continue;
                        } else {
                            amg s14 = s(trim12);
                            zmgVar.o = s14;
                            if (s14.f()) {
                                ilg.i("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.h(zmgVar);
                    this.b = zmgVar;
                    return;
                case 18:
                    smg smgVar8 = this.b;
                    if (smgVar8 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    lmg lmgVar = new lmg();
                    lmgVar.a = this.a;
                    lmgVar.b = smgVar8;
                    g(lmgVar, attributes);
                    j(lmgVar, attributes);
                    l(lmgVar, attributes);
                    f(lmgVar, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String trim13 = attributes.getValue(i16).trim();
                        int e10 = ljg.e(attributes, i16);
                        if (e10 == 25) {
                            amg s15 = s(trim13);
                            lmgVar.r = s15;
                            if (s15.f()) {
                                ilg.i("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (e10 == 56) {
                            amg s16 = s(trim13);
                            lmgVar.s = s16;
                            if (s16.f()) {
                                ilg.i("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (e10 != 57) {
                            switch (e10) {
                                case 81:
                                    amg s17 = s(trim13);
                                    lmgVar.q = s17;
                                    if (s17.f()) {
                                        ilg.i("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    lmgVar.o = s(trim13);
                                    break;
                                case 83:
                                    lmgVar.p = s(trim13);
                                    break;
                            }
                        } else {
                            amg s18 = s(trim13);
                            lmgVar.t = s18;
                            if (s18.f()) {
                                ilg.i("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.h(lmgVar);
                    return;
                case 19:
                    smg smgVar9 = this.b;
                    if (smgVar9 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mmg mmgVar = new mmg();
                    mmgVar.a = this.a;
                    mmgVar.b = smgVar9;
                    g(mmgVar, attributes);
                    j(mmgVar, attributes);
                    this.b.h(mmgVar);
                    this.b = mmgVar;
                    return;
                case 20:
                    smg smgVar10 = this.b;
                    if (smgVar10 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(smgVar10 instanceof vlg)) {
                        ilg.i("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    nmg nmgVar = new nmg();
                    nmgVar.a = this.a;
                    nmgVar.b = smgVar10;
                    g(nmgVar, attributes);
                    j(nmgVar, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String trim14 = attributes.getValue(i17).trim();
                        if (ljg.e(attributes, i17) == 39) {
                            if (trim14.length() == 0) {
                                ilg.i("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = trim14.length();
                            if (trim14.charAt(trim14.length() - 1) == '%') {
                                length--;
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            try {
                                float o = o(length, trim14);
                                float f16 = 100.0f;
                                if (objArr != false) {
                                    o /= 100.0f;
                                }
                                if (o < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f16 = 0.0f;
                                } else if (o <= 100.0f) {
                                    f16 = o;
                                }
                                nmgVar.h = Float.valueOf(f16);
                            } catch (NumberFormatException e11) {
                                throw new wng("Invalid offset value in <stop>: ".concat(trim14), e11);
                            }
                        }
                    }
                    this.b.h(nmgVar);
                    this.b = nmgVar;
                    return;
                case 21:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = Season.YEAR_ALL_TIME;
                    boolean z = true;
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String trim15 = attributes.getValue(i18).trim();
                        int e12 = ljg.e(attributes, i18);
                        if (e12 == 38) {
                            str4 = trim15;
                        } else if (e12 == 77) {
                            z = trim15.equals("text/css");
                        }
                    }
                    if (z) {
                        qd2 qd2Var = new qd2(str4);
                        qd2Var.Q();
                        Iterator it = pp4.h(qd2Var).iterator();
                        while (it.hasNext()) {
                            rd2 rd2Var = (rd2) it.next();
                            if (rd2Var == rd2.a || rd2Var == rd2.b) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    bng bngVar = new bng();
                    bngVar.a = this.a;
                    bngVar.b = this.b;
                    g(bngVar, attributes);
                    j(bngVar, attributes);
                    l(bngVar, attributes);
                    f(bngVar, attributes);
                    this.b.h(bngVar);
                    this.b = bngVar;
                    return;
                case 23:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    cng cngVar = new cng();
                    cngVar.a = this.a;
                    cngVar.b = this.b;
                    g(cngVar, attributes);
                    j(cngVar, attributes);
                    f(cngVar, attributes);
                    m(cngVar, attributes);
                    this.b.h(cngVar);
                    this.b = cngVar;
                    return;
                case 24:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    fng fngVar = new fng();
                    fngVar.a = this.a;
                    fngVar.b = this.b;
                    g(fngVar, attributes);
                    j(fngVar, attributes);
                    l(fngVar, attributes);
                    f(fngVar, attributes);
                    k(fngVar, attributes);
                    this.b.h(fngVar);
                    this.b = fngVar;
                    return;
                case 25:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ing ingVar = new ing();
                    ingVar.a = this.a;
                    ingVar.b = this.b;
                    g(ingVar, attributes);
                    j(ingVar, attributes);
                    f(ingVar, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String trim16 = attributes.getValue(i19).trim();
                        int e13 = ljg.e(attributes, i19);
                        if (e13 != 26) {
                            if (e13 == 61) {
                                ingVar.o = s(trim16);
                            }
                        } else if ("".equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19))) {
                            ingVar.n = trim16;
                        }
                    }
                    this.b.h(ingVar);
                    this.b = ingVar;
                    smg smgVar11 = ingVar.b;
                    if (smgVar11 instanceof fng) {
                        ingVar.p = (fng) smgVar11;
                        return;
                    } else {
                        ingVar.p = ((gng) smgVar11).d();
                        return;
                    }
                case 27:
                    smg smgVar12 = this.b;
                    if (smgVar12 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(smgVar12 instanceof hng)) {
                        ilg.i("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    dng dngVar = new dng();
                    dngVar.a = this.a;
                    dngVar.b = this.b;
                    g(dngVar, attributes);
                    j(dngVar, attributes);
                    f(dngVar, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String trim17 = attributes.getValue(i20).trim();
                        if (ljg.e(attributes, i20) == 26 && ("".equals(attributes.getURI(i20)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i20)))) {
                            dngVar.n = trim17;
                        }
                    }
                    this.b.h(dngVar);
                    smg smgVar13 = dngVar.b;
                    if (smgVar13 instanceof fng) {
                        dngVar.o = (fng) smgVar13;
                        return;
                    } else {
                        dngVar.o = ((gng) smgVar13).d();
                        return;
                    }
                case 28:
                    smg smgVar14 = this.b;
                    if (smgVar14 == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(smgVar14 instanceof hng)) {
                        ilg.i("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    eng engVar = new eng();
                    engVar.a = this.a;
                    engVar.b = this.b;
                    g(engVar, attributes);
                    j(engVar, attributes);
                    f(engVar, attributes);
                    k(engVar, attributes);
                    this.b.h(engVar);
                    this.b = engVar;
                    smg smgVar15 = engVar.b;
                    if (smgVar15 instanceof fng) {
                        engVar.r = (fng) smgVar15;
                        return;
                    } else {
                        engVar.r = ((gng) smgVar15).d();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    lng lngVar = new lng();
                    lngVar.a = this.a;
                    lngVar.b = this.b;
                    g(lngVar, attributes);
                    j(lngVar, attributes);
                    l(lngVar, attributes);
                    f(lngVar, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String trim18 = attributes.getValue(i21).trim();
                        int e14 = ljg.e(attributes, i21);
                        if (e14 == 25) {
                            amg s19 = s(trim18);
                            lngVar.s = s19;
                            if (s19.f()) {
                                ilg.i("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (e14 != 26) {
                            switch (e14) {
                                case 81:
                                    amg s20 = s(trim18);
                                    lngVar.r = s20;
                                    if (s20.f()) {
                                        ilg.i("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    lngVar.p = s(trim18);
                                    break;
                                case 83:
                                    lngVar.q = s(trim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i21)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i21))) {
                            lngVar.o = trim18;
                        }
                    }
                    this.b.h(lngVar);
                    this.b = lngVar;
                    return;
                case 30:
                    if (this.b == null) {
                        ilg.i("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mng mngVar = new mng();
                    mngVar.a = this.a;
                    mngVar.b = this.b;
                    g(mngVar, attributes);
                    f(mngVar, attributes);
                    m(mngVar, attributes);
                    this.b.h(mngVar);
                    this.b = mngVar;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(str.length());
                this.g = sb;
            }
            sb.append(str);
            return;
        }
        if (!this.h) {
            if (this.b instanceof hng) {
                a(str);
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(str.length());
                this.i = sb2;
            }
            sb2.append(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.g = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (!this.h) {
            if (this.b instanceof hng) {
                a(new String(cArr, i, i2));
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
        }
    }

    public final void a(String str) {
        rmg rmgVar = (rmg) this.b;
        int size = rmgVar.i.size();
        wmg wmgVar = size == 0 ? null : (wmg) rmgVar.i.get(size - 1);
        if (wmgVar instanceof kng) {
            kng kngVar = (kng) wmgVar;
            kngVar.c = mz1.o(new StringBuilder(), kngVar.c, str);
        } else {
            smg smgVar = this.b;
            kng kngVar2 = new kng();
            kngVar2.c = str;
            smgVar.h(kngVar2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            dog dogVar = (dog) dog.e.get(str2);
            if (dogVar == null) {
                dogVar = dog.d;
            }
            switch (dogVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((wmg) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        dog dogVar2 = this.f;
                        if (dogVar2 == dog.c) {
                            this.a.getClass();
                        } else if (dogVar2 == dog.a) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                        break;
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String sb2 = sb.toString();
                        pp4 pp4Var = new pp4(1);
                        ejg ejgVar = this.a;
                        qd2 qd2Var = new qd2(sb2);
                        qd2Var.Q();
                        ((zl1) ejgVar.b).h(pp4Var.j(qd2Var));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }
}
