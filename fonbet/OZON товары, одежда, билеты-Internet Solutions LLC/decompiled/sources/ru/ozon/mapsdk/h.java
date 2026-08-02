package ru.ozon.mapsdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.OzonMapView", f = "OzonMapView.kt", l = {482}, m = "internalInitMap")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    OzonMapView f97566d;

    /* renamed from: e, reason: collision with root package name */
    GeoProviderConfig f97567e;

    /* renamed from: f, reason: collision with root package name */
    String f97568f;

    /* renamed from: g, reason: collision with root package name */
    long f97569g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f97570h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97571i;

    /* renamed from: j, reason: collision with root package name */
    int f97572j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(OzonMapView ozonMapView, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97571i = ozonMapView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object n11;
        this.f97570h = obj;
        this.f97572j |= LinearLayoutManager.INVALID_OFFSET;
        n11 = this.f97571i.n(null, null, null, null, this);
        return n11;
    }
}
