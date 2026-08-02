package com.airbnb.lottie.parser;

import android.graphics.Rect;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.moshi.c;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import i3.C4527h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z.C6907h;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29085a = c.a.a("w", C4527h.f48087o, EventKeys.IP, "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static c.a f29086b = c.a.a(StackTraceHelper.ID_KEY, "layers", "w", C4527h.f48087o, "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29087c = c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    public static final c.a f29088d = c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0044. Please report as an issue. */
    public static C2940j a(com.airbnb.lottie.parser.moshi.c cVar) {
        float f10;
        com.airbnb.lottie.parser.moshi.c cVar2 = cVar;
        float e10 = com.airbnb.lottie.utils.z.e();
        C6907h c6907h = new C6907h();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        z.s sVar = new z.s();
        C2940j c2940j = new C2940j();
        cVar2.m();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (cVar2.hasNext()) {
            switch (cVar2.U(f29085a)) {
                case 0:
                    f10 = e10;
                    i11 = (int) cVar.nextDouble();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 1:
                    f10 = e10;
                    i10 = (int) cVar.nextDouble();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 2:
                    f10 = e10;
                    f11 = (float) cVar.nextDouble();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 3:
                    f10 = e10;
                    f12 = ((float) cVar.nextDouble()) - 0.01f;
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 4:
                    f10 = e10;
                    f13 = (float) cVar.nextDouble();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 5:
                    String[] split = cVar2.M0().split("\\.");
                    if (!com.airbnb.lottie.utils.z.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c2940j.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    cVar2 = cVar;
                    break;
                case 6:
                    e(cVar2, c2940j, arrayList, c6907h);
                    cVar2 = cVar;
                    break;
                case 7:
                    b(cVar2, c2940j, hashMap, hashMap2);
                    cVar2 = cVar;
                    break;
                case 8:
                    d(cVar2, hashMap3);
                    cVar2 = cVar;
                    break;
                case 9:
                    c(cVar2, c2940j, sVar);
                    cVar2 = cVar;
                    break;
                case 10:
                    f(cVar2, arrayList2);
                    cVar2 = cVar;
                    break;
                default:
                    cVar2.w0();
                    cVar2.C();
                    cVar2 = cVar;
                    break;
            }
        }
        float f14 = e10;
        c2940j.s(new Rect(0, 0, (int) (i11 * f14), (int) (i10 * f14)), f11, f12, f13, arrayList, c6907h, hashMap, hashMap2, com.airbnb.lottie.utils.z.e(), sVar, hashMap3, arrayList2, i11, i10);
        return c2940j;
    }

    public static void b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, Map map, Map map2) {
        cVar.p();
        while (cVar.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C6907h c6907h = new C6907h();
            cVar.m();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.hasNext()) {
                int U10 = cVar.U(f29086b);
                if (U10 == 0) {
                    str = cVar.M0();
                } else if (U10 == 1) {
                    cVar.p();
                    while (cVar.hasNext()) {
                        com.airbnb.lottie.model.layer.e b10 = v.b(cVar, c2940j);
                        c6907h.g(b10.e(), b10);
                        arrayList.add(b10);
                    }
                    cVar.n();
                } else if (U10 == 2) {
                    i10 = cVar.nextInt();
                } else if (U10 == 3) {
                    i11 = cVar.nextInt();
                } else if (U10 == 4) {
                    str2 = cVar.M0();
                } else if (U10 != 5) {
                    cVar.w0();
                    cVar.C();
                } else {
                    str3 = cVar.M0();
                }
            }
            cVar.t();
            if (str2 != null) {
                com.airbnb.lottie.N n10 = new com.airbnb.lottie.N(i10, i11, str, str2, str3);
                map2.put(n10.e(), n10);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.n();
    }

    public static void c(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, z.s sVar) {
        cVar.p();
        while (cVar.hasNext()) {
            E3.d a10 = AbstractC2959m.a(cVar, c2940j);
            sVar.i(a10.hashCode(), a10);
        }
        cVar.n();
    }

    public static void d(com.airbnb.lottie.parser.moshi.c cVar, Map map) {
        cVar.m();
        while (cVar.hasNext()) {
            if (cVar.U(f29087c) != 0) {
                cVar.w0();
                cVar.C();
            } else {
                cVar.p();
                while (cVar.hasNext()) {
                    E3.c a10 = AbstractC2960n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.n();
            }
        }
        cVar.t();
    }

    public static void e(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, List list, C6907h c6907h) {
        cVar.p();
        int i10 = 0;
        while (cVar.hasNext()) {
            com.airbnb.lottie.model.layer.e b10 = v.b(cVar, c2940j);
            if (b10.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(b10);
            c6907h.g(b10.e(), b10);
            if (i10 > 4) {
                com.airbnb.lottie.utils.g.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.n();
    }

    public static void f(com.airbnb.lottie.parser.moshi.c cVar, List list) {
        cVar.p();
        while (cVar.hasNext()) {
            cVar.m();
            float f10 = 0.0f;
            String str = null;
            float f11 = 0.0f;
            while (cVar.hasNext()) {
                int U10 = cVar.U(f29088d);
                if (U10 == 0) {
                    str = cVar.M0();
                } else if (U10 == 1) {
                    f10 = (float) cVar.nextDouble();
                } else if (U10 != 2) {
                    cVar.w0();
                    cVar.C();
                } else {
                    f11 = (float) cVar.nextDouble();
                }
            }
            cVar.t();
            list.add(new E3.h(str, f10, f11));
        }
        cVar.n();
    }
}
