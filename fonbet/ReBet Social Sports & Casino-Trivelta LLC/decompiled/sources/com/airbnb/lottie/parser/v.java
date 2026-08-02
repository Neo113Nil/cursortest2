package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.moshi.c;
import com.twilio.voice.EventKeys;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29082a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", C4527h.f48087o, EventKeys.IP, "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29083b = c.a.a(W9.d.f13160a, "a");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29084c = c.a.a("ty", "nm");

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[e.b.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.airbnb.lottie.model.layer.e a(C2940j c2940j) {
        Rect b10 = c2940j.b();
        List list = Collections.EMPTY_LIST;
        return new com.airbnb.lottie.model.layer.e(list, c2940j, "__container", -1L, e.a.PRE_COMP, -1L, null, list, new F3.n(), 0, 0, 0, 0.0f, 0.0f, b10.width(), b10.height(), null, null, list, e.b.NONE, null, false, null, null, com.airbnb.lottie.model.content.h.NORMAL);
    }

    public static com.airbnb.lottie.model.layer.e b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        Float f10;
        boolean z10;
        float f11;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e.b bVar = e.b.NONE;
        com.airbnb.lottie.model.content.h hVar = com.airbnb.lottie.model.content.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.m();
        boolean z11 = false;
        e.b bVar2 = bVar;
        com.airbnb.lottie.model.content.h hVar2 = hVar;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        String str = null;
        F3.j jVar = null;
        F3.k kVar = null;
        F3.b bVar3 = null;
        com.airbnb.lottie.model.content.a aVar = null;
        C2956j c2956j = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        long j11 = -1;
        float f17 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        F3.n nVar = null;
        e.a aVar2 = null;
        boolean z13 = false;
        while (cVar.hasNext()) {
            switch (cVar.U(f29082a)) {
                case 0:
                    str2 = cVar.M0();
                    z11 = false;
                    break;
                case 1:
                    j10 = cVar.nextInt();
                    z11 = false;
                    break;
                case 2:
                    str = cVar.M0();
                    z11 = false;
                    break;
                case 3:
                    f11 = f17;
                    int nextInt = cVar.nextInt();
                    aVar2 = e.a.UNKNOWN;
                    if (nextInt < aVar2.ordinal()) {
                        aVar2 = e.a.values()[nextInt];
                    }
                    f17 = f11;
                    z11 = false;
                    break;
                case 4:
                    j11 = cVar.nextInt();
                    z11 = false;
                    break;
                case 5:
                    i10 = (int) (cVar.nextInt() * com.airbnb.lottie.utils.z.e());
                    z11 = false;
                    break;
                case 6:
                    i11 = (int) (cVar.nextInt() * com.airbnb.lottie.utils.z.e());
                    z11 = false;
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.M0());
                    z11 = false;
                    break;
                case 8:
                    nVar = AbstractC2949c.h(cVar, c2940j);
                    z11 = false;
                    break;
                case 9:
                    f11 = f17;
                    int nextInt2 = cVar.nextInt();
                    if (nextInt2 >= e.b.values().length) {
                        c2940j.a("Unsupported matte type: " + nextInt2);
                    } else {
                        bVar2 = e.b.values()[nextInt2];
                        int i13 = a.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[bVar2.ordinal()];
                        if (i13 == 1) {
                            c2940j.a("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            c2940j.a("Unsupported matte type: Luma Inverted");
                        }
                        c2940j.r(1);
                    }
                    f17 = f11;
                    z11 = false;
                    break;
                case 10:
                    f11 = f17;
                    cVar.p();
                    while (cVar.hasNext()) {
                        arrayList.add(x.a(cVar, c2940j));
                    }
                    c2940j.r(arrayList.size());
                    cVar.n();
                    f17 = f11;
                    z11 = false;
                    break;
                case 11:
                    f11 = f17;
                    cVar.p();
                    while (cVar.hasNext()) {
                        com.airbnb.lottie.model.content.c a10 = AbstractC2954h.a(cVar, c2940j);
                        if (a10 != null) {
                            arrayList2.add(a10);
                        }
                    }
                    cVar.n();
                    f17 = f11;
                    z11 = false;
                    break;
                case 12:
                    f11 = f17;
                    cVar.m();
                    while (cVar.hasNext()) {
                        int U10 = cVar.U(f29083b);
                        if (U10 == 0) {
                            jVar = AbstractC2950d.d(cVar, c2940j);
                        } else if (U10 != 1) {
                            cVar.w0();
                            cVar.C();
                        } else {
                            cVar.p();
                            if (cVar.hasNext()) {
                                kVar = AbstractC2948b.a(cVar, c2940j);
                            }
                            while (cVar.hasNext()) {
                                cVar.C();
                            }
                            cVar.n();
                        }
                    }
                    cVar.t();
                    f17 = f11;
                    z11 = false;
                    break;
                case 13:
                    f11 = f17;
                    cVar.p();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.m();
                        while (cVar.hasNext()) {
                            int U11 = cVar.U(f29084c);
                            if (U11 == 0) {
                                int nextInt3 = cVar.nextInt();
                                if (nextInt3 == 29) {
                                    aVar = AbstractC2951e.b(cVar, c2940j);
                                } else if (nextInt3 == 25) {
                                    c2956j = new C2957k().b(cVar, c2940j);
                                }
                            } else if (U11 != 1) {
                                cVar.w0();
                                cVar.C();
                            } else {
                                arrayList3.add(cVar.M0());
                            }
                        }
                        cVar.t();
                    }
                    cVar.n();
                    c2940j.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    f17 = f11;
                    z11 = false;
                    break;
                case 14:
                    f17 = (float) cVar.nextDouble();
                    z11 = false;
                    break;
                case 15:
                    f16 = (float) cVar.nextDouble();
                    z11 = false;
                    break;
                case 16:
                    f11 = f17;
                    f14 = (float) (cVar.nextDouble() * com.airbnb.lottie.utils.z.e());
                    f17 = f11;
                    z11 = false;
                    break;
                case 17:
                    f11 = f17;
                    f15 = (float) (cVar.nextDouble() * com.airbnb.lottie.utils.z.e());
                    f17 = f11;
                    z11 = false;
                    break;
                case 18:
                    f12 = (float) cVar.nextDouble();
                    break;
                case 19:
                    f13 = (float) cVar.nextDouble();
                    break;
                case 20:
                    bVar3 = AbstractC2950d.f(cVar, c2940j, z11);
                    break;
                case 21:
                    str3 = cVar.M0();
                    break;
                case 22:
                    z12 = cVar.k();
                    break;
                case 23:
                    if (cVar.nextInt() != 1) {
                        z13 = z11;
                        break;
                    } else {
                        z13 = true;
                        break;
                    }
                case 24:
                    int nextInt4 = cVar.nextInt();
                    if (nextInt4 < com.airbnb.lottie.model.content.h.values().length) {
                        hVar2 = com.airbnb.lottie.model.content.h.values()[nextInt4];
                        break;
                    } else {
                        c2940j.a("Unsupported Blend Mode: " + nextInt4);
                        hVar2 = com.airbnb.lottie.model.content.h.NORMAL;
                        break;
                    }
                default:
                    cVar.w0();
                    cVar.C();
                    f11 = f17;
                    f17 = f11;
                    z11 = false;
                    break;
            }
        }
        float f18 = f17;
        cVar.t();
        ArrayList arrayList4 = new ArrayList();
        if (f12 > 0.0f) {
            z10 = z13;
            f10 = valueOf;
            arrayList4.add(new G3.a(c2940j, valueOf, valueOf, null, 0.0f, Float.valueOf(f12)));
        } else {
            f10 = valueOf;
            z10 = z13;
        }
        if (f13 <= 0.0f) {
            f13 = c2940j.f();
        }
        arrayList4.add(new G3.a(c2940j, valueOf2, valueOf2, null, f12, Float.valueOf(f13)));
        arrayList4.add(new G3.a(c2940j, f10, f10, null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            c2940j.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new F3.n();
            }
            nVar.p(z10);
        }
        return new com.airbnb.lottie.model.layer.e(arrayList2, c2940j, str2, j10, aVar2, j11, str, arrayList, nVar, i10, i11, i12, f18, f16, f14, f15, jVar, kVar, arrayList4, bVar2, bVar3, z12, aVar, c2956j, hVar2);
    }
}
