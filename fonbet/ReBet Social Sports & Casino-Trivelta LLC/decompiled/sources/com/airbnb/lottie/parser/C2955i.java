package com.airbnb.lottie.parser;

import E3.b;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2955i implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C2955i f29026a = new C2955i();

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29027b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.airbnb.lottie.parser.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E3.b a(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.m();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (cVar.hasNext()) {
            switch (cVar.U(f29027b)) {
                case 0:
                    str = cVar.M0();
                    break;
                case 1:
                    str2 = cVar.M0();
                    break;
                case 2:
                    f11 = (float) cVar.nextDouble();
                    break;
                case 3:
                    int nextInt = cVar.nextInt();
                    aVar2 = b.a.CENTER;
                    if (nextInt <= aVar2.ordinal() && nextInt >= 0) {
                        aVar2 = b.a.values()[nextInt];
                        break;
                    }
                    break;
                case 4:
                    i10 = cVar.nextInt();
                    break;
                case 5:
                    f12 = (float) cVar.nextDouble();
                    break;
                case 6:
                    f13 = (float) cVar.nextDouble();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.nextDouble();
                    break;
                case 10:
                    z10 = cVar.k();
                    break;
                case 11:
                    cVar.p();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.n();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.p();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.n();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.w0();
                    cVar.C();
                    break;
            }
        }
        cVar.t();
        return new E3.b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}
