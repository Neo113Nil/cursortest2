package com.iab.omid.library.adsbynimbus.utils;

import android.text.TextUtils;
import com.iab.omid.library.adsbynimbus.Omid;
import com.iab.omid.library.adsbynimbus.adsession.CreativeType;
import com.iab.omid.library.adsbynimbus.adsession.ImpressionType;
import com.iab.omid.library.adsbynimbus.adsession.Owner;
import defpackage.a70;

/* loaded from: classes4.dex */
public class g {
    public static void a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            a70.p("Impression owner is none");
            return;
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            a70.p("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            a70.p("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void b(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.i()) {
            a70.r("AdSession is finished");
        }
    }

    public static void c(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.l()) {
            a70.r("AdSession is started");
        }
    }

    private static void d(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.l()) {
            return;
        }
        a70.r("AdSession is not started");
    }

    public static void e(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.j()) {
            return;
        }
        a70.r("Impression event is not expected from the Native AdSession");
    }

    public static void f(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.k()) {
            return;
        }
        a70.r("Cannot create MediaEvents for JavaScript AdSession");
    }

    public static void g(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.d().c() == null) {
            return;
        }
        a70.r("AdEvents already exists for AdSession");
    }

    public static void h(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        if (aVar.d().d() == null) {
            return;
        }
        a70.r("MediaEvents already exists for AdSession");
    }

    public static void a() {
        if (Omid.isActive()) {
            return;
        }
        a70.r("Method called before OM SDK activation");
    }

    public static void a(com.iab.omid.library.adsbynimbus.adsession.a aVar) {
        d(aVar);
        b(aVar);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a70.p(str);
    }

    public static void a(String str, int i, String str2) {
        if (str.length() <= i) {
            return;
        }
        a70.p(str2);
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            a70.p(str2);
        }
    }
}
