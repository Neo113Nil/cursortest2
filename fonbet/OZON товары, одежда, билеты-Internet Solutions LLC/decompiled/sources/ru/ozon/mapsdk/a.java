package ru.ozon.mapsdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import we0.w;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.OzonMapView", f = "OzonMapView.kt", l = {321, 331}, m = "initMap")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    OzonMapView f97547d;

    /* renamed from: e, reason: collision with root package name */
    String f97548e;

    /* renamed from: f, reason: collision with root package name */
    w f97549f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f97550g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97551h;

    /* renamed from: i, reason: collision with root package name */
    int f97552i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(OzonMapView ozonMapView, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97551h = ozonMapView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97550g = obj;
        this.f97552i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97551h.i(null, null, null, null, this);
    }
}
