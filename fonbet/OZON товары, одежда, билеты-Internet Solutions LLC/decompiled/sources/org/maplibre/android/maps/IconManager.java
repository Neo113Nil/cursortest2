package org.maplibre.android.maps;

import Sf.b;
import android.graphics.Bitmap;
import java.util.HashMap;

/* loaded from: classes10.dex */
class IconManager {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f79670a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private NativeMap f79671b;

    IconManager(NativeMap nativeMap) {
        this.f79671b = nativeMap;
    }

    final void a() {
        for (b bVar : this.f79670a.keySet()) {
            Bitmap a11 = bVar.a();
            this.f79671b.g(a11.getWidth(), a11.getHeight(), bVar.b(), bVar.c());
        }
    }
}
