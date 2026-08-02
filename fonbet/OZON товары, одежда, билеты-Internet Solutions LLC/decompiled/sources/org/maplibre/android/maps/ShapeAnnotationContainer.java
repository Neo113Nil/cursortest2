package org.maplibre.android.maps;

import Sf.a;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import java.util.ArrayList;

/* loaded from: classes10.dex */
class ShapeAnnotationContainer implements ShapeAnnotations {

    /* renamed from: a, reason: collision with root package name */
    private final NativeMap f79819a;

    /* renamed from: b, reason: collision with root package name */
    private final C5153w<a> f79820b;

    ShapeAnnotationContainer(NativeMap nativeMap, C5153w<a> c5153w) {
        this.f79819a = nativeMap;
        this.f79820b = c5153w;
    }

    @NonNull
    public final ArrayList a(@NonNull RectF rectF) {
        NativeMap nativeMap = this.f79819a;
        long[] R11 = nativeMap.R(nativeMap.N(rectF));
        ArrayList arrayList = new ArrayList();
        for (long j11 : R11) {
            a b11 = this.f79820b.b(j11);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        return arrayList;
    }
}
