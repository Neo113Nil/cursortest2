package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class d8 {
    private static final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    private static final Random b = new Random(System.currentTimeMillis());

    public static void a(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, w7 w7Var, int i, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        Set a2 = a(v7Var, lVar);
        if (CollectionUtils.isEmpty(a2)) {
            return;
        }
        a(a2, w7Var, lVar);
    }

    public static boolean b(r7 r7Var) {
        e8 p1;
        List g;
        return (r7Var == null || (p1 = r7Var.p1()) == null || (g = p1.g()) == null || g.isEmpty()) ? false : true;
    }

    public static w7 c(r7 r7Var) {
        if (b(r7Var) || a(r7Var)) {
            return null;
        }
        return w7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(r7 r7Var) {
        u7 g1;
        z7 e;
        if (r7Var == null || (g1 = r7Var.g1()) == null || (e = g1.e()) == null) {
            return false;
        }
        return e.c() != null || StringUtils.isValidString(e.b());
    }

    public static boolean b(q8 q8Var) {
        if (q8Var != null) {
            return q8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f) != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j, Uri uri, w7 w7Var, com.applovin.impl.sdk.l lVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(w7Var.b());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                lVar.E().a("VastUtils", th);
                return null;
            }
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j) {
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j);
            long minutes = timeUnit.toMinutes(j);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.l lVar) {
        a(set, -1L, (Uri) null, w7.UNSPECIFIED, lVar);
    }

    public static void a(Set set, w7 w7Var, com.applovin.impl.sdk.l lVar) {
        a(set, -1L, (Uri) null, w7Var, lVar);
    }

    public static void a(Set set, long j, Uri uri, w7 w7Var, com.applovin.impl.sdk.l lVar) {
        if (lVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b8 b8Var = (b8) it.next();
                long j2 = j;
                Uri uri2 = uri;
                w7 w7Var2 = w7Var;
                com.applovin.impl.sdk.l lVar2 = lVar;
                Uri a2 = a(b8Var.c(), j2, uri2, w7Var2, lVar2);
                if (a2 != null) {
                    lVar2.h0().a(com.applovin.impl.sdk.network.d.b().d(a2.toString()).a(false).b(b8Var.d()).a(), false);
                }
                j = j2;
                uri = uri2;
                w7Var = w7Var2;
                lVar = lVar2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(q8 q8Var, Map map, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List<q8> a2;
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (q8Var == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        q8 c = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
        if (c == null || (a2 = c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) == null) {
            return;
        }
        for (q8 q8Var2 : a2) {
            String str = (String) q8Var2.a().get("event");
            if (StringUtils.isValidString(str)) {
                b8 a3 = b8.a(q8Var2, v7Var, lVar);
                if (a3 != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(a3);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(a3);
                        map.put(str, hashSet);
                    }
                }
            } else {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastUtils", "Could not find event for tracking node = " + q8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b8 a2 = b8.a((q8) it.next(), v7Var, lVar);
            if (a2 != null) {
                set.add(a2);
            }
        }
    }

    public static boolean a(q8 q8Var) {
        if (q8Var != null) {
            return q8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e) != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(v7 v7Var) {
        q8 b2;
        if (v7Var != null) {
            List a2 = v7Var.a();
            int size = v7Var.a().size();
            if (size <= 0 || (b2 = ((q8) a2.get(size - 1)).b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g)) == null) {
                return null;
            }
            return b2.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(q8 q8Var, String str, String str2) {
        q8 c = q8Var.c(str);
        if (c != null) {
            String d = c.d();
            if (StringUtils.isValidString(d)) {
                return d;
            }
        }
        return str2;
    }

    private static Set a(v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List a2;
        if (v7Var == null) {
            return null;
        }
        List<q8> a3 = v7Var.a();
        HashSet hashSet = new HashSet(a3.size());
        for (q8 q8Var : a3) {
            q8 b2 = q8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f);
            if (b2 == null) {
                b2 = q8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e);
            }
            if (b2 != null) {
                a2 = b2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
            } else {
                a2 = q8Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
            }
            hashSet = a(hashSet, a2, v7Var, lVar);
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b8 a2 = b8.a((q8) it.next(), v7Var, lVar);
                if (a2 != null) {
                    hashSet.add(a2);
                }
            }
        }
        return hashSet;
    }
}
