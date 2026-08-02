package org.maplibre.android.maps;

import Sf.a;
import androidx.collection.C5153w;

/* loaded from: classes10.dex */
class AnnotationContainer implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final NativeMap f79640a;

    /* renamed from: b, reason: collision with root package name */
    private final C5153w<a> f79641b;

    AnnotationContainer(NativeMap nativeMap, C5153w<a> c5153w) {
        this.f79640a = nativeMap;
        this.f79641b = c5153w;
    }

    public final a a(long j11) {
        return this.f79641b.b(j11);
    }
}
