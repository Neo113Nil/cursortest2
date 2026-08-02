package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2950d {
    public static List a(com.airbnb.lottie.parser.moshi.c cVar, float f10, C2940j c2940j, N n10) {
        return u.a(cVar, c2940j, f10, n10, false);
    }

    public static List b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, N n10) {
        return u.a(cVar, c2940j, 1.0f, n10, false);
    }

    public static F3.a c(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return new F3.a(b(cVar, c2940j, C2953g.f29024a));
    }

    public static F3.j d(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return new F3.j(a(cVar, com.airbnb.lottie.utils.z.e(), c2940j, C2955i.f29026a));
    }

    public static F3.b e(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return f(cVar, c2940j, true);
    }

    public static F3.b f(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, boolean z10) {
        return new F3.b(a(cVar, z10 ? com.airbnb.lottie.utils.z.e() : 1.0f, c2940j, C2958l.f29040a));
    }

    public static F3.c g(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, int i10) {
        return new F3.c(b(cVar, c2940j, new o(i10)));
    }

    public static F3.d h(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return new F3.d(b(cVar, c2940j, r.f29075a));
    }

    public static F3.f i(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return new F3.f(u.a(cVar, c2940j, com.airbnb.lottie.utils.z.e(), B.f29001a, true));
    }

    public static F3.g j(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return new F3.g(b(cVar, c2940j, G.f29006a));
    }

    public static F3.h k(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        return new F3.h(a(cVar, com.airbnb.lottie.utils.z.e(), c2940j, H.f29007a));
    }
}
