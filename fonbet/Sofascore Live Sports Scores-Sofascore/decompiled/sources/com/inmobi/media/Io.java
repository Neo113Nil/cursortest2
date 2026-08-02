package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.dmi;
import defpackage.lu3;
import defpackage.qij;
import defpackage.sq3;
import defpackage.wba;
import defpackage.y6a;
import defpackage.zu4;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Io {
    public static final Io a = new Io();
    public static final Cb b = new Cb();
    public static final Bo c;

    static {
        Context context = AbstractC3424fj.a;
        c = context != null ? new Bo(context, a()) : null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|(3:8|9|(2:11|(2:13|(14:15|16|17|18|19|(3:40|41|(11:(2:46|47)|54|55|56|57|58|59|60|61|62|63))|21|(1:23)|24|25|26|27|28|29)(2:87|88))(8:89|90|91|92|(1:94)|95|(11:98|19|(0)|21|(0)|24|25|26|27|28|29)|97))(3:99|100|101))(2:110|(1:(2:149|150)(1:151))(8:114|115|116|(3:118|119|120)(1:142)|(1:135)|(1:125)|126|(3:(1:129)|130|131)(3:132|(1:134)|97)))|102|103|(2:105|97)|92|(0)|95|(0)|97))|152|6|(0)(0)|102|103|(0)|92|(0)|95|(0)|97|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0327, code lost:
    
        ((com.inmobi.media.C3906y9) r2).a("WebResourceHandler", defpackage.dmi.q("Timeout occurred for url: ", r1), r0);
        r6 = r6;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x030b, code lost:
    
        ((com.inmobi.media.C3906y9) r2).a("WebResourceHandler", defpackage.dmi.q("Unhandled exception occurred: ", r0.getMessage()), r0);
        r6 = r6;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0226, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        r4 = r17;
        r8 = r18;
        r7 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0231, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0232, code lost:
    
        r4 = r17;
        r8 = r18;
        r7 = r19;
        r3 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02b2 A[Catch: Exception -> 0x02e3, qij -> 0x02e5, TryCatch #18 {qij -> 0x02e5, Exception -> 0x02e3, blocks: (B:62:0x026e, B:23:0x02b2, B:24:0x02d2), top: B:19:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce A[Catch: qij -> 0x0226, Exception -> 0x0231, TryCatch #5 {qij -> 0x0226, blocks: (B:46:0x0213, B:47:0x021f, B:92:0x01ca, B:94:0x01ce, B:95:0x01e0, B:103:0x0193), top: B:102:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.inmobi.media.Cb] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.inmobi.media.Bo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.inmobi.media.x9] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.inmobi.media.x9] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, InterfaceC3880x9 interfaceC3880x9, sq3 sq3Var) {
        Fo fo;
        lu3 lu3Var;
        ?? r10;
        Object obj;
        String str2;
        Object obj2;
        long currentTimeMillis;
        String str3;
        Object obj3;
        ?? r8;
        ?? r7;
        String str4;
        Object a2;
        Object U;
        Map map;
        InterfaceC3880x9 interfaceC3880x92;
        String str5;
        InterfaceC3317bf interfaceC3317bf;
        Cb cb;
        String str6;
        String str7;
        boolean z;
        Map map2;
        long j;
        ?? r1 = str;
        C3906y9 c3906y9 = interfaceC3880x9;
        String str8 = "onFailedResponse: ";
        ?? r6 = "Found in cache: ";
        if (sq3Var instanceof Fo) {
            Fo fo2 = (Fo) sq3Var;
            int i = fo2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo2.i = i - Integer.MIN_VALUE;
                fo = fo2;
                Object obj4 = fo.g;
                lu3Var = lu3.a;
                r10 = fo.i;
                if (r10 == 0) {
                    try {
                        try {
                        } catch (qij e) {
                            e = e;
                            r8 = "ResourceCacheMiss";
                            str8 = Payload.LATENCY;
                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                            j = r1;
                            c3906y9 = "mimeType is ";
                            r1 = r10;
                            r6 = r6;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r8 = "ResourceCacheMiss";
                        str8 = Payload.LATENCY;
                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                        c3906y9 = "mimeType is ";
                        r7 = "networkType";
                        currentTimeMillis = r1;
                        r6.put(obj3, new Short((short) 2195));
                        map2 = r6;
                        z = r7;
                        str7 = r8;
                        if (c3906y9 != 0) {
                        }
                        map2.put(z, F5.o());
                        map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                        C3839vk c3839vk = C3839vk.a;
                        C3839vk.b(str7, map2, EnumC3943zk.SDK);
                        return null;
                    }
                    if (r10 != 1) {
                        if (r10 == 2) {
                            long j2 = fo.f;
                            String str9 = fo.d;
                            Map map3 = fo.c;
                            InterfaceC3880x9 interfaceC3880x93 = fo.b;
                            String str10 = fo.a;
                            y6a.M(obj4);
                            str3 = "onFailedResponse: ";
                            str2 = "ResourceCacheMiss";
                            obj2 = "networkType";
                            str4 = Payload.LATENCY;
                            str8 = str9;
                            currentTimeMillis = j2;
                            interfaceC3880x92 = interfaceC3880x93;
                            str5 = str10;
                            U = obj4;
                            obj = IronSourceConstants.EVENTS_ERROR_CODE;
                            map = map3;
                            interfaceC3317bf = (InterfaceC3317bf) U;
                            if (interfaceC3880x92 != null) {
                                ((C3906y9) interfaceC3880x92).c("WebResourceHandler", "Response received for url: " + str5);
                            }
                            cb = b;
                            fo.a = str5;
                            fo.b = interfaceC3880x92;
                            fo.c = map;
                            fo.d = str8;
                            fo.e = interfaceC3317bf;
                            fo.f = currentTimeMillis;
                            r7 = 3;
                            fo.i = 3;
                            if (cb.a(str5, fo) != lu3Var) {
                                str6 = str8;
                                r1 = str5;
                                c3906y9 = interfaceC3880x92;
                                r6 = map;
                                r8 = fo;
                                if (interfaceC3317bf != null) {
                                }
                                r8 = str2;
                                r7 = obj2;
                                str8 = str4;
                                if (c3906y9 != 0) {
                                }
                                obj3 = obj;
                                r6.put(obj3, new Short((short) 2194));
                                map2 = r6;
                                z = r7;
                                str7 = r8;
                                map2.put(z, F5.o());
                                map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                                C3839vk c3839vk2 = C3839vk.a;
                                C3839vk.b(str7, map2, EnumC3943zk.SDK);
                                return null;
                            }
                            return lu3Var;
                        }
                        if (r10 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j3 = fo.f;
                        interfaceC3317bf = fo.e;
                        str6 = fo.d;
                        Map map4 = fo.c;
                        InterfaceC3880x9 interfaceC3880x94 = fo.b;
                        String str11 = fo.a;
                        try {
                            y6a.M(obj4);
                            str3 = "onFailedResponse: ";
                            str2 = "ResourceCacheMiss";
                            obj2 = "networkType";
                            str4 = Payload.LATENCY;
                            obj = IronSourceConstants.EVENTS_ERROR_CODE;
                            currentTimeMillis = j3;
                            c3906y9 = interfaceC3880x94;
                            r1 = str11;
                            r6 = map4;
                            r7 = interfaceC3880x94;
                            r8 = str11;
                            try {
                                if (interfaceC3317bf != null) {
                                    try {
                                        try {
                                            if (Fl.a(interfaceC3317bf) && interfaceC3317bf.d().r(Charsets.UTF_8).length() > 0) {
                                                if (c3906y9 != 0) {
                                                    c3906y9.c("WebResourceHandler", "onSuccessfulResponse: " + r1);
                                                }
                                                str8 = str4;
                                                try {
                                                    r6.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                                                    r6.put("size", new Long(interfaceC3317bf.b().c / 1024));
                                                    r7 = obj2;
                                                    try {
                                                        r6.put(r7, F5.o());
                                                        C3839vk c3839vk3 = C3839vk.a;
                                                        C3839vk.b(str2, r6, EnumC3943zk.SDK);
                                                        IntRange intRange = AbstractC3446gf.a;
                                                        return N3.a(new ByteArrayInputStream(interfaceC3317bf.d().v()), str6);
                                                    } catch (qij e3) {
                                                        e = e3;
                                                        r8 = str2;
                                                        obj3 = obj;
                                                        r6.put(obj3, new Short((short) 2193));
                                                        map2 = r6;
                                                        z = r7;
                                                        str7 = r8;
                                                        if (c3906y9 != 0) {
                                                        }
                                                        map2.put(z, F5.o());
                                                        map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                                                        C3839vk c3839vk22 = C3839vk.a;
                                                        C3839vk.b(str7, map2, EnumC3943zk.SDK);
                                                        return null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        r8 = str2;
                                                        obj3 = obj;
                                                        r6.put(obj3, new Short((short) 2195));
                                                        map2 = r6;
                                                        z = r7;
                                                        str7 = r8;
                                                        if (c3906y9 != 0) {
                                                        }
                                                        map2.put(z, F5.o());
                                                        map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                                                        C3839vk c3839vk222 = C3839vk.a;
                                                        C3839vk.b(str7, map2, EnumC3943zk.SDK);
                                                        return null;
                                                    }
                                                } catch (qij e5) {
                                                    e = e5;
                                                    r8 = str2;
                                                    r7 = obj2;
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    r8 = str2;
                                                    r7 = obj2;
                                                }
                                            }
                                        } catch (qij e7) {
                                            e = e7;
                                            r8 = str2;
                                            r7 = obj2;
                                            str8 = str4;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        r8 = str2;
                                        r7 = obj2;
                                        str8 = str4;
                                    }
                                }
                                r8 = str2;
                                r7 = obj2;
                                str8 = str4;
                                if (c3906y9 != 0) {
                                    c3906y9.b("WebResourceHandler", str3 + r1 + " " + interfaceC3317bf);
                                }
                                obj3 = obj;
                            } catch (qij e9) {
                                e = e9;
                            } catch (Exception e10) {
                                e = e10;
                            }
                        } catch (qij e11) {
                            e = e11;
                            str8 = Payload.LATENCY;
                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                            j = j3;
                            c3906y9 = interfaceC3880x94;
                            r1 = str11;
                            r8 = "ResourceCacheMiss";
                            r6 = map4;
                            r7 = "networkType";
                            currentTimeMillis = j;
                            r6.put(obj3, new Short((short) 2193));
                            map2 = r6;
                            z = r7;
                            str7 = r8;
                            if (c3906y9 != 0) {
                            }
                            map2.put(z, F5.o());
                            map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                            C3839vk c3839vk2222 = C3839vk.a;
                            C3839vk.b(str7, map2, EnumC3943zk.SDK);
                            return null;
                        }
                        try {
                            r6.put(obj3, new Short((short) 2194));
                            map2 = r6;
                            z = r7;
                            str7 = r8;
                        } catch (qij e12) {
                            e = e12;
                            r6.put(obj3, new Short((short) 2193));
                            map2 = r6;
                            z = r7;
                            str7 = r8;
                            if (c3906y9 != 0) {
                            }
                            map2.put(z, F5.o());
                            map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                            C3839vk c3839vk22222 = C3839vk.a;
                            C3839vk.b(str7, map2, EnumC3943zk.SDK);
                            return null;
                        } catch (Exception e13) {
                            e = e13;
                            r6.put(obj3, new Short((short) 2195));
                            map2 = r6;
                            z = r7;
                            str7 = r8;
                            if (c3906y9 != 0) {
                            }
                            map2.put(z, F5.o());
                            map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                            C3839vk c3839vk222222 = C3839vk.a;
                            C3839vk.b(str7, map2, EnumC3943zk.SDK);
                            return null;
                        }
                        map2.put(z, F5.o());
                        map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                        C3839vk c3839vk2222222 = C3839vk.a;
                        C3839vk.b(str7, map2, EnumC3943zk.SDK);
                        return null;
                    }
                    long j4 = fo.f;
                    String str12 = fo.d;
                    Map map5 = fo.c;
                    InterfaceC3880x9 interfaceC3880x95 = fo.b;
                    String str13 = fo.a;
                    y6a.M(obj4);
                    str3 = "onFailedResponse: ";
                    str2 = "ResourceCacheMiss";
                    obj2 = "networkType";
                    str4 = Payload.LATENCY;
                    str8 = str12;
                    currentTimeMillis = j4;
                    c3906y9 = interfaceC3880x95;
                    r1 = str13;
                    a2 = obj4;
                    obj = IronSourceConstants.EVENTS_ERROR_CODE;
                    r6 = map5;
                } else {
                    y6a.M(obj4);
                    ?? r0 = c;
                    if (r0 == 0 || r0.a == null) {
                        if (c3906y9 == 0) {
                            return null;
                        }
                        ((C3906y9) c3906y9).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + r0 + " for URL: " + r1);
                        return null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    obj = IronSourceConstants.EVENTS_ERROR_CODE;
                    linkedHashMap.put("url", r1);
                    str2 = "ResourceCacheMiss";
                    obj2 = "networkType";
                    currentTimeMillis = System.currentTimeMillis();
                    str3 = "onFailedResponse: ";
                    try {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(r1);
                        if (N3.a(fileExtensionFromUrl)) {
                            str4 = Payload.LATENCY;
                            try {
                                str8 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                            } catch (qij e14) {
                                e = e14;
                                obj3 = obj;
                                r8 = str2;
                                r7 = obj2;
                                str8 = str4;
                                r6 = linkedHashMap;
                                r6.put(obj3, new Short((short) 2193));
                                map2 = r6;
                                z = r7;
                                str7 = r8;
                                if (c3906y9 != 0) {
                                }
                                map2.put(z, F5.o());
                                map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                                C3839vk c3839vk22222222 = C3839vk.a;
                                C3839vk.b(str7, map2, EnumC3943zk.SDK);
                                return null;
                            } catch (Exception e15) {
                                e = e15;
                                obj3 = obj;
                                r8 = str2;
                                r7 = obj2;
                                str8 = str4;
                                r6 = linkedHashMap;
                                r6.put(obj3, new Short((short) 2195));
                                map2 = r6;
                                z = r7;
                                str7 = r8;
                                if (c3906y9 != 0) {
                                }
                                map2.put(z, F5.o());
                                map2.put(str8, new Long(System.currentTimeMillis() - currentTimeMillis));
                                C3839vk c3839vk222222222 = C3839vk.a;
                                C3839vk.b(str7, map2, EnumC3943zk.SDK);
                                return null;
                            }
                        } else {
                            str4 = Payload.LATENCY;
                            str8 = null;
                        }
                        if (str8 == null || str8.length() == 0) {
                            str8 = "text/html";
                        }
                        if (c3906y9 != 0) {
                            ((C3906y9) c3906y9).a("WebResourceHandler", "mimeType is " + str8 + " for " + r1);
                        }
                        InputStream a3 = r0.a(r1, c3906y9);
                        if (a3 != null) {
                            if (c3906y9 != 0) {
                                ((C3906y9) c3906y9).a("WebResourceHandler", "Found in cache: " + r1);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("url", r1);
                            C3839vk c3839vk4 = C3839vk.a;
                            C3839vk.b("ResourceCacheHit", linkedHashMap2, EnumC3943zk.SDK);
                            return N3.a(a3, str8);
                        }
                        ?? r02 = b;
                        Go go = new Go(r1, c3906y9, null);
                        fo.a = r1;
                        fo.b = c3906y9;
                        fo.c = linkedHashMap;
                        fo.d = str8;
                        fo.f = currentTimeMillis;
                        fo.i = 1;
                        a2 = r02.a(r1, go, fo);
                        if (a2 != lu3Var) {
                            r6 = linkedHashMap;
                            r1 = r1;
                            c3906y9 = c3906y9;
                        }
                        return lu3Var;
                    } catch (qij e16) {
                        e = e16;
                        str8 = Payload.LATENCY;
                        obj3 = obj;
                        r8 = str2;
                        r7 = obj2;
                    } catch (Exception e17) {
                        e = e17;
                        str8 = Payload.LATENCY;
                        obj3 = obj;
                        r8 = str2;
                        r7 = obj2;
                    }
                }
                Ho ho = new Ho(c3906y9, r1, (zu4) a2, null);
                fo.a = r1;
                fo.b = c3906y9;
                fo.c = r6;
                fo.d = str8;
                fo.f = currentTimeMillis;
                fo.i = 2;
                U = wba.U(Math.max(1, a().getMaxRetries()) * a().getTimeout(), ho, fo);
                str5 = r1;
                interfaceC3880x92 = c3906y9;
                map = r6;
                if (U == lu3Var) {
                    return lu3Var;
                }
                interfaceC3317bf = (InterfaceC3317bf) U;
                if (interfaceC3880x92 != null) {
                }
                cb = b;
                fo.a = str5;
                fo.b = interfaceC3880x92;
                fo.c = map;
                fo.d = str8;
                fo.e = interfaceC3317bf;
                fo.f = currentTimeMillis;
                r7 = 3;
                fo.i = 3;
                if (cb.a(str5, fo) != lu3Var) {
                }
                return lu3Var;
            }
        }
        fo = new Fo(this, sq3Var);
        Object obj42 = fo.g;
        lu3Var = lu3.a;
        r10 = fo.i;
        if (r10 == 0) {
        }
        Ho ho2 = new Ho(c3906y9, r1, (zu4) a2, null);
        fo.a = r1;
        fo.b = c3906y9;
        fo.c = r6;
        fo.d = str8;
        fo.f = currentTimeMillis;
        fo.i = 2;
        U = wba.U(Math.max(1, a().getMaxRetries()) * a().getTimeout(), ho2, fo);
        str5 = r1;
        interfaceC3880x92 = c3906y9;
        map = r6;
        if (U == lu3Var) {
        }
        interfaceC3317bf = (InterfaceC3317bf) U;
        if (interfaceC3880x92 != null) {
        }
        cb = b;
        fo.a = str5;
        fo.b = interfaceC3880x92;
        fo.c = map;
        fo.d = str8;
        fo.e = interfaceC3317bf;
        fo.f = currentTimeMillis;
        r7 = 3;
        fo.i = 3;
        if (cb.a(str5, fo) != lu3Var) {
        }
        return lu3Var;
    }

    public static AdConfig.WebAssetCacheConfig a() {
        return ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getWebAssetCache();
    }

    public static zu4 a(String str, InterfaceC3880x9 interfaceC3880x9) {
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("WebResourceHandler", dmi.q("downloadResourceFile(): ", str));
        }
        return ((F9) Ve.d.getValue()).a(new Xe(str, null, new Ok(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new Vi(500L, a().getMaxRetries()), false, 42));
    }
}
