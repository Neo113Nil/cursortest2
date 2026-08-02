package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.parser.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2959m {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29041a = c.a.a("ch", "size", "w", "style", "fFamily", EventKeys.DATA);

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29042b = c.a.a("shapes");

    public static E3.d a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        ArrayList arrayList = new ArrayList();
        cVar.m();
        double d10 = 0.0d;
        String str = null;
        String str2 = null;
        char c10 = 0;
        double d11 = 0.0d;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29041a);
            if (U10 == 0) {
                c10 = cVar.M0().charAt(0);
            } else if (U10 == 1) {
                d11 = cVar.nextDouble();
            } else if (U10 == 2) {
                d10 = cVar.nextDouble();
            } else if (U10 == 3) {
                str = cVar.M0();
            } else if (U10 == 4) {
                str2 = cVar.M0();
            } else if (U10 != 5) {
                cVar.w0();
                cVar.C();
            } else {
                cVar.m();
                while (cVar.hasNext()) {
                    if (cVar.U(f29042b) != 0) {
                        cVar.w0();
                        cVar.C();
                    } else {
                        cVar.p();
                        while (cVar.hasNext()) {
                            arrayList.add((com.airbnb.lottie.model.content.q) AbstractC2954h.a(cVar, c2940j));
                        }
                        cVar.n();
                    }
                }
                cVar.t();
            }
        }
        cVar.t();
        return new E3.d(arrayList, c10, d11, d10, str, str2);
    }
}
