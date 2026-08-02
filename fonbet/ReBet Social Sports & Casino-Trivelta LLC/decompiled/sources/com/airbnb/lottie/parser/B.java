package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes.dex */
public class B implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final B f29001a = new B();

    @Override // com.airbnb.lottie.parser.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        c.b B10 = cVar.B();
        if (B10 == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (B10 == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (B10 == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
            while (cVar.hasNext()) {
                cVar.C();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + B10);
    }
}
