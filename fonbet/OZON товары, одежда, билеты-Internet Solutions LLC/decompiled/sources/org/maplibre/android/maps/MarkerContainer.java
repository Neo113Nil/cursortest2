package org.maplibre.android.maps;

import Sf.a;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import java.util.ArrayList;
import org.maplibre.android.annotations.Marker;

/* loaded from: classes10.dex */
class MarkerContainer implements Markers {

    /* renamed from: a, reason: collision with root package name */
    private final NativeMap f79805a;

    /* renamed from: b, reason: collision with root package name */
    private final C5153w<a> f79806b;

    /* renamed from: c, reason: collision with root package name */
    private final IconManager f79807c;

    MarkerContainer(NativeMap nativeMap, C5153w<a> c5153w, IconManager iconManager) {
        this.f79805a = nativeMap;
        this.f79806b = c5153w;
        this.f79807c = iconManager;
    }

    @NonNull
    public final ArrayList a(@NonNull RectF rectF) {
        NativeMap nativeMap = this.f79805a;
        long[] D11 = nativeMap.D(nativeMap.N(rectF));
        ArrayList arrayList = new ArrayList(D11.length);
        for (long j11 : D11) {
            arrayList.add(Long.valueOf(j11));
        }
        ArrayList arrayList2 = new ArrayList(D11.length);
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        while (true) {
            C5153w<a> c5153w = this.f79806b;
            if (i11 >= c5153w.h()) {
                break;
            }
            arrayList3.add(c5153w.b(c5153w.e(i11)));
            i11++;
        }
        int size = arrayList3.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) arrayList3.get(i12);
            if ((aVar instanceof Marker) && arrayList.contains(Long.valueOf(aVar.a()))) {
                arrayList2.add((Marker) aVar);
            }
        }
        return new ArrayList(arrayList2);
    }

    public final void b() {
        this.f79807c.a();
        C5153w<a> c5153w = this.f79806b;
        int h11 = c5153w.h();
        for (int i11 = 0; i11 < h11; i11++) {
            a b11 = c5153w.b(i11);
            if (b11 instanceof Marker) {
                Marker marker = (Marker) b11;
                long a11 = b11.a();
                NativeMap nativeMap = this.f79805a;
                nativeMap.e(a11);
                marker.b(nativeMap.K(marker));
            }
        }
    }
}
