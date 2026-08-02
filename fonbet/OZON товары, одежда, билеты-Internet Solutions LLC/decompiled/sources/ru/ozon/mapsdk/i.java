package ru.ozon.mapsdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.OzonMapView", f = "OzonMapView.kt", l = {549, 590, 601}, m = "prepareMap")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    OzonMapView f97573d;

    /* renamed from: e, reason: collision with root package name */
    ve0.b f97574e;

    /* renamed from: f, reason: collision with root package name */
    Function1 f97575f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f97576g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97577h;

    /* renamed from: i, reason: collision with root package name */
    int f97578i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(OzonMapView ozonMapView, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97577h = ozonMapView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object o11;
        this.f97576g = obj;
        this.f97578i |= LinearLayoutManager.INVALID_OFFSET;
        o11 = this.f97577h.o(null, null, this);
        return o11;
    }
}
