package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2953g implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C2953g f29024a = new C2953g();

    @Override // com.airbnb.lottie.parser.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        boolean z10 = cVar.B() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.p();
        }
        double nextDouble = cVar.nextDouble();
        double nextDouble2 = cVar.nextDouble();
        double nextDouble3 = cVar.nextDouble();
        double nextDouble4 = cVar.B() == c.b.NUMBER ? cVar.nextDouble() : 1.0d;
        if (z10) {
            cVar.n();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            if (nextDouble4 <= 1.0d) {
                nextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
