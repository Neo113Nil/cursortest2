package com.inmobi.media;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4331u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.asf;
import defpackage.dsf;
import defpackage.f05;
import defpackage.fc6;
import defpackage.fsf;
import defpackage.jx1;
import defpackage.k13;
import defpackage.l31;
import defpackage.lu3;
import defpackage.mth;
import defpackage.mz1;
import defpackage.sq3;
import defpackage.t8m;
import defpackage.tub;
import defpackage.u8m;
import defpackage.v8m;
import defpackage.wv8;
import defpackage.y6a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.em, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3401em {
    public final AdConfig.VastVideoConfig a;
    public final Ml b;
    public final C3906y9 c;
    public int d;
    public boolean e;
    public String f;
    public String g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public String k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;

    public C3401em(AdConfig.VastVideoConfig vastVideoConfig, Ml ml, C3906y9 c3906y9) {
        vastVideoConfig.getClass();
        ml.getClass();
        this.a = vastVideoConfig;
        this.b = ml;
        this.c = c3906y9;
        this.f = "";
        this.g = "";
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = "";
        this.k = "";
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C3401em c3401em, XmlPullParser xmlPullParser, sq3 sq3Var) {
        C3350cm c3350cm;
        int i;
        asf asfVar;
        c3401em.getClass();
        if (sq3Var instanceof C3350cm) {
            c3350cm = (C3350cm) sq3Var;
            int i2 = c3350cm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3350cm.d = i2 - Integer.MIN_VALUE;
                Object obj = c3350cm.b;
                Object obj2 = lu3.a;
                i = c3350cm.d;
                if (i != 0) {
                    y6a.M(obj);
                    int i3 = c3401em.d + 1;
                    c3401em.d = i3;
                    if (i3 > c3401em.a.getMaxWrapperLimit()) {
                        throw new Sl((short) 1107);
                    }
                    asf asfVar2 = new asf();
                    Function1 c3376dm = new C3376dm(c3401em, null, asfVar2, xmlPullParser);
                    c3350cm.a = asfVar2;
                    c3350cm.d = 1;
                    if (c3401em.a(xmlPullParser, "Wrapper", c3376dm, c3350cm) == obj2) {
                        return obj2;
                    }
                    asfVar = asfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar = c3350cm.a;
                    y6a.M(obj);
                }
                if (asfVar.a) {
                    throw new Sl((short) 1121);
                }
                return Unit.a;
            }
        }
        c3350cm = new C3350cm(c3401em, sq3Var);
        Object obj3 = c3350cm.b;
        Object obj22 = lu3.a;
        i = c3350cm.d;
        if (i != 0) {
        }
        if (asfVar.a) {
        }
    }

    public static final Unit d(XmlPullParser xmlPullParser, C3401em c3401em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.c(name, "CompanionClickTracking")) {
            String b = Nl.b(c3401em.v(xmlPullParser));
            if (!Nl.a(b)) {
                b = null;
            }
            Je je = b != null ? new Je(b, "click") : null;
            if (je != null) {
                c3401em.m.add(je);
            }
        } else if (Intrinsics.c(name, "TrackingEvents")) {
            c3401em.m.addAll(c3401em.o(xmlPullParser));
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static final Unit e(XmlPullParser xmlPullParser, C3401em c3401em) {
        if (Intrinsics.c(xmlPullParser.getName(), "Companion")) {
            c3401em.q(xmlPullParser);
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.inmobi.media.em] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [rq3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList arrayList, sq3 sq3Var) {
        Ul ul;
        int i;
        ?? r3;
        try {
            if (sq3Var instanceof Ul) {
                ul = (Ul) sq3Var;
                int i2 = ul.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ul.d = i2 - Integer.MIN_VALUE;
                    Object obj = ul.b;
                    lu3 lu3Var = lu3.a;
                    i = ul.d;
                    r3 = 0;
                    if (i != 0) {
                        y6a.M(obj);
                        ul.a = arrayList;
                        ul.d = 1;
                        arrayList = arrayList;
                        if (a(str, ul) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r12 = ul.a;
                        y6a.M(obj);
                        arrayList = r12;
                    }
                    r3 = this.f;
                    return new Pl(r3, this.g, this.i, this.j, this.k, this.n, this.l);
                }
            }
            if (i != 0) {
            }
            r3 = this.f;
            return new Pl(r3, this.g, this.i, this.j, this.k, this.n, this.l);
        } catch (Sl e) {
            short s = e.a;
            HashMap f = tub.f(new Pair("[ERRORCODE]", String.valueOf((s == 1100 || s == 1102) ? 303 : (s == 1101 || s == 1124 || s == 1125 || s == 1103 || s == 1120 || s == 1121 || s == 1123 || s == 1122 || s == 1112 || s == 1109 || s == 1115 || s == 1116 || s == 1117) ? 101 : s == 1104 ? 100 : (s == 1105 || s == 1106) ? 900 : s == 1107 ? Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE : (s == 1108 || s == 1114) ? 300 : s == 1111 ? 201 : s == 1113 ? Sdk.SDKError.Reason.MRAID_ERROR_VALUE : s == 1118 ? 401 : s == 1119 ? 403 : 0)), new Pair("[ADSERVINGID]", this.g), new Pair("[UNIVERSALADID]", this.f));
            short s2 = e.a;
            if (s2 == 1102 || s2 == 1124) {
                Ml.a(f, CollectionsKt.w0(this.i, this.h), this.c);
            } else {
                Ml.a(f, this.i, this.c);
            }
            C3906y9 c3906y9 = this.c;
            arrayList.getClass();
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            for (String str2 : arrayList) {
                str2.getClass();
                for (Map.Entry entry : f.entrySet()) {
                    str2 = kotlin.text.c.r(str2, (String) entry.getKey(), (String) entry.getValue(), false);
                }
                arrayList2.add(str2);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                E3 e3 = E3.a;
                Rg rg = Rg.REGULAR;
                str3.getClass();
                rg.getClass();
                Ug.a(rg, new C3822v3(str3, c3906y9, r3));
            }
            throw e;
        }
        ul = new Ul(this, sq3Var);
        Object obj2 = ul.b;
        lu3 lu3Var2 = lu3.a;
        i = ul.d;
        r3 = 0;
    }

    public final Je b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String b = Nl.b(v(xmlPullParser));
        if (!Nl.a(b)) {
            return null;
        }
        if (Intrinsics.c(attributeValue, NotificationCompat.CATEGORY_PROGRESS)) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").f(attributeValue2) || new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").f(attributeValue2)) {
                return new W5(b, attributeValue2);
            }
            C3906y9 c3906y9 = this.c;
            if (c3906y9 != null) {
                c3906y9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
            }
        } else {
            if (AbstractC3427fm.a.contains(attributeValue)) {
                attributeValue.getClass();
                return new Je(b, attributeValue);
            }
            C3906y9 c3906y92 = this.c;
            if (c3906y92 != null) {
                c3906y92.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    public final void f(XmlPullParser xmlPullParser) {
        String b = Nl.b(v(xmlPullParser));
        if (b.length() == 0) {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 != null) {
                c3906y9.b("VastParser", "Vast Tracker Error: Impression");
                return;
            }
            return;
        }
        if (!Nl.a(b)) {
            b = null;
        }
        if (b == null) {
            return;
        }
        this.i.add(new Je(b, "Impression"));
    }

    public final void g(XmlPullParser xmlPullParser) {
        asf asfVar = new asf();
        a(xmlPullParser, "InLine", new u8m(xmlPullParser, this, asfVar, 0));
        if (!asfVar.a) {
            throw new Sl((short) 1122);
        }
    }

    public final void h(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fsf fsfVar = new fsf();
        a(xmlPullParser, "Companion", new l31(xmlPullParser, this, arrayList, fsfVar, arrayList2));
        if (!arrayList.isEmpty()) {
            this.n.add(new Ll(arrayList, arrayList2, this.m));
        } else {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 != null) {
                c3906y9.b("VastParser", "VAST Companion Error: No Companion resources found");
            }
        }
    }

    public final void i(XmlPullParser xmlPullParser) {
        dsf dsfVar = new dsf();
        a(xmlPullParser, "CompanionAds", new mth(12, xmlPullParser, this, dsfVar));
        int size = this.n.size();
        boolean z = this.e;
        if (size != 0) {
            if (z) {
                C3906y9 c3906y9 = this.c;
                if (c3906y9 != null) {
                    c3906y9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map a = Hk.a(this.b.a);
                a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1152);
                C3839vk c3839vk = C3839vk.a;
                C3839vk.b("VastParseEvent", a, EnumC3943zk.SDK);
                return;
            }
            return;
        }
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("[ERRORCODE]", String.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap, this.i, this.c);
            Map a2 = Hk.a(this.b.a);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1150);
            C3839vk c3839vk2 = C3839vk.a;
            C3839vk.b("VastParseEvent", a2, EnumC3943zk.SDK);
            return;
        }
        if (dsfVar.a > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("[ERRORCODE]", String.valueOf(600));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap2, this.i, this.c);
            Map a3 = Hk.a(this.b.a);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1151);
            C3839vk c3839vk3 = C3839vk.a;
            C3839vk.b("VastParseEvent", a3, EnumC3943zk.SDK);
        }
    }

    public final boolean j(XmlPullParser xmlPullParser) {
        asf asfVar = new asf();
        a(xmlPullParser, "Creative", new u8m(xmlPullParser, this, asfVar, 1));
        return asfVar.a;
    }

    public final void k(XmlPullParser xmlPullParser) {
        asf asfVar = new asf();
        asf asfVar2 = new asf();
        a(xmlPullParser, "Creatives", new v8m(xmlPullParser, asfVar, this, asfVar2));
        if (!asfVar.a) {
            throw new Sl((short) 1112);
        }
        if (!asfVar2.a) {
            throw new Sl((short) 1111);
        }
    }

    public final void l(XmlPullParser xmlPullParser) {
        asf asfVar = new asf();
        asf asfVar2 = new asf();
        a(xmlPullParser, "Linear", new v8m(xmlPullParser, this, asfVar, asfVar2));
        if (!asfVar.a) {
            throw new Sl((short) 1116);
        }
        if (!asfVar2.a) {
            throw new Sl((short) 1117);
        }
    }

    public final ArrayList m(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        asf asfVar = new asf();
        asf asfVar2 = new asf();
        a(xmlPullParser, "MediaFiles", new l31(xmlPullParser, this, asfVar2, asfVar, arrayList, 10));
        if (!asfVar2.a) {
            throw new Sl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new Sl((short) 1119);
        }
        if (asfVar.a) {
            Map a = Hk.a(this.b.a);
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1153);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("VastParseEvent", a, EnumC3943zk.SDK);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 == null) {
                return -1;
            }
            c3906y9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C3906y9 c3906y92 = this.c;
            if (c3906y92 == null) {
                return -1;
            }
            c3906y92.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "TrackingEvents", new mth(13, xmlPullParser, this, arrayList));
        return arrayList;
    }

    public final void p(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 != null) {
                c3906y9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        asf asfVar = new asf();
        fsf fsfVar = new fsf();
        fsfVar.a = "";
        fsf fsfVar2 = new fsf();
        ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "Verification", new f05(xmlPullParser, asfVar, this, fsfVar, fsfVar2, arrayList));
        if (!asfVar.a) {
            HashMap hashMap = new HashMap();
            hashMap.put("[REASON]", String.valueOf(2));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap, arrayList, this.c);
            return;
        }
        if (!Nl.a((String) fsfVar.a)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("[REASON]", String.valueOf(3));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            Ml.a(hashMap2, arrayList, this.c);
            return;
        }
        this.i.add(new Nf(attributeValue, (String) fsfVar2.a, (String) fsfVar.a));
        C3906y9 c3906y92 = this.c;
        if (c3906y92 != null) {
            c3906y92.a("VastParser", "OMID ADVerification URL : " + fsfVar.a);
        }
    }

    public final void q(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Companion", new t8m(xmlPullParser, this, 1));
    }

    public final void r(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "CompanionAds", new t8m(xmlPullParser, this, 2));
    }

    public final void s(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creative", new t8m(xmlPullParser, this, 5));
    }

    public final void t(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Creatives", new t8m(xmlPullParser, this, 0));
    }

    public final void u(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Linear", new t8m(xmlPullParser, this, 7));
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int n = n(xmlPullParser);
        if ((n == 4 || n == 5) && (text = xmlPullParser.getText()) != null && N3.a(text)) {
            return text;
        }
        return null;
    }

    public final void e(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extensions", new t8m(xmlPullParser, this, 3));
    }

    public static final Unit g(XmlPullParser xmlPullParser, C3401em c3401em) {
        if (Intrinsics.c(xmlPullParser.getName(), "Creative")) {
            c3401em.s(xmlPullParser);
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static final Unit f(XmlPullParser xmlPullParser, C3401em c3401em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.c(name, "Linear")) {
            c3401em.u(xmlPullParser);
        } else if (Intrinsics.c(name, "CompanionAds")) {
            c3401em.r(xmlPullParser);
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static final Unit h(XmlPullParser xmlPullParser, C3401em c3401em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.c(name, "TrackingEvents")) {
            c3401em.i.addAll(c3401em.o(xmlPullParser));
        } else if (Intrinsics.c(name, "VideoClicks")) {
            c3401em.a(xmlPullParser, false);
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public final void d(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extension", new t8m(xmlPullParser, this, 6));
    }

    public final void c(XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new t8m(xmlPullParser, this, 4));
    }

    public static final Unit c(XmlPullParser xmlPullParser, C3401em c3401em) {
        String str;
        if (Intrinsics.c(xmlPullParser.getName(), "Extension")) {
            try {
                str = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                str = "";
            }
            if (Intrinsics.c(str, "AdVerifications")) {
                c3401em.d(xmlPullParser);
            }
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static final Unit b(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2018804923) {
                if (hashCode != 1150879268) {
                    if (hashCode == 1539775849 && name.equals("UniversalAdId")) {
                        String v = c3401em.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        c3401em.f = v;
                    }
                } else if (name.equals("CompanionAds")) {
                    c3401em.i(xmlPullParser);
                }
            } else if (name.equals("Linear")) {
                asfVar.a = true;
                c3401em.l(xmlPullParser);
            }
            return Unit.a;
        }
        c3401em.getClass();
        w(xmlPullParser);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C3401em c3401em, XmlPullParser xmlPullParser, sq3 sq3Var) {
        Zl zl;
        int i;
        asf asfVar;
        asf asfVar2;
        c3401em.getClass();
        if (sq3Var instanceof Zl) {
            zl = (Zl) sq3Var;
            int i2 = zl.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zl.e = i2 - Integer.MIN_VALUE;
                Object obj = zl.c;
                Object obj2 = lu3.a;
                i = zl.e;
                if (i != 0) {
                    y6a.M(obj);
                    asf asfVar3 = new asf();
                    asf asfVar4 = new asf();
                    Function1 c3298am = new C3298am(xmlPullParser, c3401em, asfVar4, asfVar3, null);
                    zl.a = asfVar3;
                    zl.b = asfVar4;
                    zl.e = 1;
                    if (c3401em.a(xmlPullParser, "VAST", c3298am, zl) == obj2) {
                        return obj2;
                    }
                    asfVar = asfVar4;
                    asfVar2 = asfVar3;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar = zl.b;
                    asfVar2 = zl.a;
                    y6a.M(obj);
                }
                if (!asfVar2.a) {
                    return Unit.a;
                }
                if (asfVar.a) {
                    throw new Sl((short) 1124);
                }
                throw new Sl((short) 1102);
            }
        }
        zl = new Zl(c3401em, sq3Var);
        Object obj3 = zl.c;
        Object obj22 = lu3.a;
        i = zl.e;
        if (i != 0) {
        }
        if (!asfVar2.a) {
        }
    }

    public static final Unit b(XmlPullParser xmlPullParser, C3401em c3401em) {
        if (Intrinsics.c(xmlPullParser.getName(), "AdVerifications")) {
            c3401em.c(xmlPullParser);
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        C3324bm c3324bm;
        int i;
        try {
            if (sq3Var instanceof C3324bm) {
                c3324bm = (C3324bm) sq3Var;
                int i2 = c3324bm.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3324bm.c = i2 - Integer.MIN_VALUE;
                    Object obj = c3324bm.a;
                    lu3 lu3Var = lu3.a;
                    i = c3324bm.c;
                    if (i != 0) {
                        y6a.M(obj);
                        if (TextUtils.isEmpty(str)) {
                            C3906y9 c3906y9 = this.c;
                            if (c3906y9 != null) {
                                c3906y9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                            }
                            throw new Sl((short) 1100);
                        }
                        try {
                            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                            F5.a.getClass();
                            if (!F5.s()) {
                                newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                            }
                            XmlPullParser newPullParser = newInstance.newPullParser();
                            newPullParser.setInput(new StringReader(str));
                            c3324bm.c = 1;
                            if (a(newPullParser, c3324bm) == lu3Var) {
                                return lu3Var;
                            }
                        } catch (XmlPullParserException unused) {
                            C3906y9 c3906y92 = this.c;
                            if (c3906y92 != null) {
                                c3906y92.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                            }
                            throw new Sl((short) 1104);
                        } catch (Exception unused2) {
                            C3906y9 c3906y93 = this.c;
                            if (c3906y93 != null) {
                                c3906y93.b("VastParser", "VAST Schema validation error: (Exception)");
                            }
                            throw new Sl((short) 1105);
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    this = Unit.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            this = Unit.a;
            return this;
        } catch (Sl e) {
            C3906y9 c3906y94 = this.c;
            if (c3906y94 != null) {
                c3906y94.b("VastParser", "VAST Schema validation error: " + ((int) e.a));
            }
            throw e;
        } catch (Exception e2) {
            C3906y9 c3906y95 = this.c;
            if (c3906y95 != null) {
                String arrays = Arrays.toString(e2.getStackTrace());
                arrays.getClass();
                wv8.x("VAST Schema validation error: (Exception) ", arrays, c3906y95, "VastParser");
            }
            throw new Sl((short) 1106);
        }
        c3324bm = new C3324bm(this, sq3Var);
        Object obj2 = c3324bm.a;
        lu3 lu3Var2 = lu3.a;
        i = c3324bm.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3401em c3401em, XmlPullParser xmlPullParser, sq3 sq3Var) {
        Vl vl;
        int i;
        String str;
        asf asfVar;
        c3401em.getClass();
        if (sq3Var instanceof Vl) {
            vl = (Vl) sq3Var;
            int i2 = vl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vl.d = i2 - Integer.MIN_VALUE;
                Object obj = vl.b;
                Object obj2 = lu3.a;
                i = vl.d;
                if (i != 0) {
                    y6a.M(obj);
                    asf asfVar2 = new asf();
                    try {
                        str = xmlPullParser.getAttributeValue(null, "adType").toString();
                    } catch (Exception unused) {
                        str = "video";
                    }
                    if (Intrinsics.c(str, "video")) {
                        Function1 wl = new Wl(c3401em, null, asfVar2, xmlPullParser);
                        vl.a = asfVar2;
                        vl.d = 1;
                        if (c3401em.a(xmlPullParser, "Ad", wl, vl) == obj2) {
                            return obj2;
                        }
                        asfVar = asfVar2;
                    } else {
                        throw new Sl((short) 1125);
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar = vl.a;
                    y6a.M(obj);
                }
                if (!asfVar.a) {
                    return Unit.a;
                }
                throw new Sl((short) 1101);
            }
        }
        vl = new Vl(c3401em, sq3Var);
        Object obj3 = vl.b;
        Object obj22 = lu3.a;
        i = vl.d;
        if (i != 0) {
        }
        if (!asfVar.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(XmlPullParser xmlPullParser, sq3 sq3Var) {
        Xl xl;
        int i;
        asf asfVar;
        if (sq3Var instanceof Xl) {
            xl = (Xl) sq3Var;
            int i2 = xl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xl.d = i2 - Integer.MIN_VALUE;
                Object obj = xl.b;
                Object obj2 = lu3.a;
                i = xl.d;
                if (i != 0) {
                    y6a.M(obj);
                    asf asfVar2 = new asf();
                    Function1 yl = new Yl(this, null, asfVar2, xmlPullParser);
                    xl.a = asfVar2;
                    xl.d = 1;
                    if (a(xmlPullParser, "VAST", yl, xl) == obj2) {
                        return obj2;
                    }
                    asfVar = asfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar = xl.a;
                    y6a.M(obj);
                }
                if (!asfVar.a) {
                    return Unit.a;
                }
                throw new Sl((short) 1103);
            }
        }
        xl = new Xl(this, sq3Var);
        Object obj3 = xl.b;
        Object obj22 = lu3.a;
        i = xl.d;
        if (i != 0) {
        }
        if (!asfVar.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0063 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(XmlPullParser xmlPullParser, String str, Function1 function1, sq3 sq3Var) {
        Tl tl;
        int i;
        if (sq3Var instanceof Tl) {
            tl = (Tl) sq3Var;
            int i2 = tl.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tl.f = i2 - Integer.MIN_VALUE;
                Object obj = tl.d;
                lu3 lu3Var = lu3.a;
                i = tl.f;
                if (i != 0) {
                    y6a.M(obj);
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Function1 function12 = tl.c;
                str = tl.b;
                XmlPullParser xmlPullParser2 = tl.a;
                y6a.M(obj);
                function1 = function12;
                xmlPullParser = xmlPullParser2;
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1 || (xmlPullParser.getName() != null && Intrinsics.c(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3)) {
                    return Unit.a;
                }
                if (xmlPullParser.getEventType() == 2) {
                    tl.a = xmlPullParser;
                    tl.b = str;
                    tl.c = function1;
                    tl.f = 1;
                    if (function1.invoke(tl) == lu3Var) {
                        return lu3Var;
                    }
                }
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1) {
                    if (xmlPullParser.getEventType() == 2) {
                    }
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                }
                return Unit.a;
            }
        }
        tl = new Tl(this, sq3Var);
        Object obj2 = tl.d;
        lu3 lu3Var2 = lu3.a;
        i = tl.f;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar) {
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2077435339:
                    if (name.equals("AdVerifications")) {
                        c3401em.c(xmlPullParser);
                        break;
                    }
                    break;
                case -1692490108:
                    if (name.equals("Creatives")) {
                        asfVar.a = true;
                        c3401em.k(xmlPullParser);
                        break;
                    }
                    break;
                case -1499090620:
                    if (name.equals("AdServingId")) {
                        String v = c3401em.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        c3401em.g = v;
                        break;
                    }
                    break;
                case 67232232:
                    if (name.equals("Error")) {
                        Je a = c3401em.a("error", xmlPullParser);
                        if (a != null) {
                            c3401em.i.add(a);
                            break;
                        }
                    }
                    break;
                case 184043572:
                    if (name.equals("Extensions")) {
                        c3401em.e(xmlPullParser);
                        break;
                    }
                    break;
                case 2114088489:
                    if (name.equals("Impression")) {
                        c3401em.f(xmlPullParser);
                        break;
                    }
                    break;
            }
            return Unit.a;
        }
        c3401em.getClass();
        w(xmlPullParser);
        return Unit.a;
    }

    public static final Unit a(XmlPullParser xmlPullParser, asf asfVar, C3401em c3401em, asf asfVar2) {
        if (Intrinsics.c(xmlPullParser.getName(), "Creative")) {
            asfVar.a = true;
            if (c3401em.j(xmlPullParser)) {
                asfVar2.a = true;
            }
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar, asf asfVar2) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2049897434) {
                if (hashCode != -1927368268) {
                    if (hashCode != -385055469) {
                        if (hashCode == 611554000 && name.equals("TrackingEvents")) {
                            c3401em.i.addAll(c3401em.o(xmlPullParser));
                        }
                    } else if (name.equals("MediaFiles")) {
                        asfVar2.a = true;
                        c3401em.l.addAll(c3401em.m(xmlPullParser));
                    }
                } else if (name.equals("Duration")) {
                    c3401em.k = c3401em.a(xmlPullParser);
                    asfVar.a = true;
                }
            } else if (name.equals("VideoClicks")) {
                c3401em.a(xmlPullParser, true);
            }
            return Unit.a;
        }
        c3401em.getClass();
        w(xmlPullParser);
        return Unit.a;
    }

    public final String a(XmlPullParser xmlPullParser) {
        String v = v(xmlPullParser);
        if (v != null) {
            if (TextUtils.isEmpty(v) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").f(v)) {
                return v;
            }
        }
        C3906y9 c3906y9 = this.c;
        if (c3906y9 != null) {
            c3906y9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new Sl((short) 1115);
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em, dsf dsfVar) {
        int i;
        if (!Intrinsics.c(xmlPullParser.getName(), "Companion")) {
            c3401em.getClass();
            w(xmlPullParser);
            return Unit.a;
        }
        dsfVar.a++;
        int i2 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            attributeValue.getClass();
            i = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C3906y9 c3906y9 = c3401em.c;
            if (c3906y9 != null) {
                c3906y9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            attributeValue2.getClass();
            i2 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C3906y9 c3906y92 = c3401em.c;
            if (c3906y92 != null) {
                c3906y92.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i > 0 && i2 > 0) {
            c3401em.h(xmlPullParser);
            return Unit.a;
        }
        return Unit.a;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em, List list, fsf fsfVar, List list2) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -348198615) {
                if (hashCode != 611554000) {
                    if (hashCode != 676623548) {
                        if (hashCode == 1877773523 && name.equals("CompanionClickTracking")) {
                            String b = Nl.b(c3401em.v(xmlPullParser));
                            if (!Nl.a(b)) {
                                b = null;
                            }
                            Je je = b != null ? new Je(b, "click") : null;
                            if (je != null) {
                                list2.add(je);
                            }
                        }
                    } else if (name.equals("StaticResource")) {
                        c3401em.a(xmlPullParser, list);
                    }
                } else if (name.equals("TrackingEvents")) {
                    list2.addAll(c3401em.o(xmlPullParser));
                }
            } else if (name.equals("CompanionClickThrough")) {
                String b2 = Nl.b(c3401em.v(xmlPullParser));
                if (Nl.a(b2)) {
                    fsfVar.a = b2;
                } else {
                    C3906y9 c3906y9 = c3401em.c;
                    if (c3906y9 != null) {
                        wv8.x("Invalid ClickThrough URL: ", xmlPullParser.getText(), c3906y9, "VastParser");
                    }
                }
            }
            return Unit.a;
        }
        c3401em.getClass();
        w(xmlPullParser);
        return Unit.a;
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String b = Nl.b(v(xmlPullParser));
        if (!Nl.a(b)) {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 != null) {
                c3906y9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || StringsKt.R(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.a.getAllowedCompanionType();
        if (allowedCompanionType == null || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (kotlin.text.c.o((String) it.next(), attributeValue, true)) {
                    list.add(new Qi(b));
                    return;
                }
            }
        }
        C3906y9 c3906y92 = this.c;
        if (c3906y92 != null) {
            c3906y92.a("VastParser", "VAST Companion Error: Format not supported - ".concat(attributeValue));
        }
        this.e = true;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em, List list) {
        if (Intrinsics.c(xmlPullParser.getName(), "Tracking")) {
            Je b = c3401em.b(xmlPullParser);
            if (b != null) {
                list.add(b);
            }
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public final void a(XmlPullParser xmlPullParser, boolean z) {
        a(xmlPullParser, "VideoClicks", new jx1(xmlPullParser, z, this, 7));
    }

    public static final Unit a(XmlPullParser xmlPullParser, boolean z, C3401em c3401em) {
        String name = xmlPullParser.getName();
        if (Intrinsics.c(name, "ClickThrough")) {
            if (z) {
                String b = Nl.b(c3401em.v(xmlPullParser));
                if (Nl.a(b)) {
                    c3401em.j = b;
                }
            }
        } else if (Intrinsics.c(name, "ClickTracking")) {
            Je a = c3401em.a("click", xmlPullParser);
            if (a != null) {
                c3401em.i.add(a);
            }
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public final boolean a(int i, int i2, String str, String str2, int i3) {
        if (Nl.a(str) && i > 0 && i2 > 0) {
            if (this.a.getBitRate().getBitrate_mandatory() && i3 <= 0) {
                C3906y9 c3906y9 = this.c;
                if (c3906y9 != null) {
                    c3906y9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i3);
                }
                return false;
            }
            if (kotlin.text.c.o(str2, "Progressive", true)) {
                return true;
            }
            C3906y9 c3906y92 = this.c;
            if (c3906y92 != null) {
                wv8.x("VAST Schema Validation Error: Delivery type NULL or invalid - ", str2, c3906y92, "VastParser");
            }
            return false;
        }
        C3906y9 c3906y93 = this.c;
        if (c3906y93 != null) {
            StringBuilder q = mz1.q(i, "VAST Schema Validation Error: Invalid Media - ", str, " ", ", ");
            q.append(i2);
            c3906y93.b("VastParser", q.toString());
        }
        return false;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar, asf asfVar2, List list) {
        int i;
        int i2;
        List<String> allowedContentType;
        if (!Intrinsics.c(xmlPullParser.getName(), "MediaFile")) {
            c3401em.getClass();
            w(xmlPullParser);
            return Unit.a;
        }
        asfVar.a = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, C4331u.g);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        int i3 = 0;
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "bitrate");
            attributeValue3.getClass();
            i = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C3906y9 c3906y9 = c3401em.c;
            if (c3906y9 != null) {
                c3906y9.b("VastParser", "Invalid Value for BitRate.");
            }
            i = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            attributeValue4.getClass();
            i2 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C3906y9 c3906y92 = c3401em.c;
            if (c3906y92 != null) {
                c3906y92.b("VastParser", "Invalid Value for Media Width.");
            }
            i2 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            attributeValue5.getClass();
            i3 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C3906y9 c3906y93 = c3401em.c;
            if (c3906y93 != null) {
                c3906y93.b("VastParser", "Invalid Value for Media Height.");
            }
        }
        int i4 = i3;
        String b = Nl.b(c3401em.v(xmlPullParser));
        if (!c3401em.a(i2, i4, b, attributeValue, i)) {
            return Unit.a;
        }
        if (attributeValue2 != null && ((allowedContentType = c3401em.a.getAllowedContentType()) == null || !allowedContentType.isEmpty())) {
            Iterator<T> it = allowedContentType.iterator();
            while (it.hasNext()) {
                if (kotlin.text.c.o((String) it.next(), attributeValue2, true)) {
                    attributeValue.getClass();
                    list.add(new Ol(i2, i4, b, attributeValue, attributeValue2, i));
                    return Unit.a;
                }
            }
        }
        C3906y9 c3906y94 = c3401em.c;
        if (c3906y94 != null) {
            wv8.x("VAST Schema Validation Error: Media type Invalid - ", attributeValue2, c3906y94, "VastParser");
        }
        if (N3.a(attributeValue2)) {
            asfVar2.a = true;
        }
        return Unit.a;
    }

    public static final Unit a(XmlPullParser xmlPullParser, C3401em c3401em) {
        if (Intrinsics.c(xmlPullParser.getName(), "Verification")) {
            c3401em.p(xmlPullParser);
        } else {
            c3401em.getClass();
            w(xmlPullParser);
        }
        return Unit.a;
    }

    public static final Unit a(XmlPullParser xmlPullParser, asf asfVar, C3401em c3401em, fsf fsfVar, fsf fsfVar2, List list) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != 611554000) {
                if (hashCode != 1561251035) {
                    if (hashCode == 1749252741 && name.equals("VerificationParameters")) {
                        fsfVar2.a = Nl.b(c3401em.v(xmlPullParser));
                    }
                } else if (name.equals("JavaScriptResource")) {
                    if (asfVar.a) {
                        c3401em.getClass();
                        w(xmlPullParser);
                        return Unit.a;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
                    if (attributeValue != null && kotlin.text.c.v(attributeValue, CampaignEx.KEY_OMID, false)) {
                        asfVar.a = true;
                        fsfVar.a = Nl.b(c3401em.v(xmlPullParser));
                    }
                }
            } else if (name.equals("TrackingEvents")) {
                list.addAll(c3401em.o(xmlPullParser));
            }
            return Unit.a;
        }
        c3401em.getClass();
        w(xmlPullParser);
        return Unit.a;
    }

    public final Je a(String str, XmlPullParser xmlPullParser) {
        String b = Nl.b(v(xmlPullParser));
        if (!Nl.a(b)) {
            C3906y9 c3906y9 = this.c;
            if (c3906y9 == null) {
                return null;
            }
            c3906y9.b("VastParser", fc6.n("Vast Tracker Error: ", str, " ", b));
            return null;
        }
        return new Je(b, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, Function0 function0) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && Intrinsics.c(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                function0.invoke();
            }
            n(xmlPullParser);
        }
    }
}
