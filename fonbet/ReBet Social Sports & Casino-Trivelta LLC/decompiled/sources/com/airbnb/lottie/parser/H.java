package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final H f29007a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f29008b = c.a.a("c", "v", com.google.android.material.shape.i.f35755A, "o");

    @Override // com.airbnb.lottie.parser.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.o a(com.airbnb.lottie.parser.moshi.c cVar, float f10) {
        if (cVar.B() == c.b.BEGIN_ARRAY) {
            cVar.p();
        }
        cVar.m();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29008b);
            if (U10 == 0) {
                z10 = cVar.k();
            } else if (U10 == 1) {
                list = s.f(cVar, f10);
            } else if (U10 == 2) {
                list2 = s.f(cVar, f10);
            } else if (U10 != 3) {
                cVar.w0();
                cVar.C();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.t();
        if (cVar.B() == c.b.END_ARRAY) {
            cVar.n();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new com.airbnb.lottie.model.content.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) list.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new E3.a(com.airbnb.lottie.utils.l.a((PointF) list.get(i11), (PointF) list3.get(i11)), com.airbnb.lottie.utils.l.a(pointF2, (PointF) list2.get(i10)), pointF2));
        }
        if (z10) {
            PointF pointF3 = (PointF) list.get(0);
            int i12 = size - 1;
            arrayList.add(new E3.a(com.airbnb.lottie.utils.l.a((PointF) list.get(i12), (PointF) list3.get(i12)), com.airbnb.lottie.utils.l.a(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.o(pointF, z10, arrayList);
    }
}
