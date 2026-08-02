package oe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationProviderImp", f = "LocationProviderImp.kt", l = {50}, m = "requestCurrentLocation-IoAF18A")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f78238d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f78239e;

    /* renamed from: f, reason: collision with root package name */
    int f78240f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78239e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78238d = obj;
        this.f78240f |= LinearLayoutManager.INVALID_OFFSET;
        Object e11 = this.f78239e.e(this);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Sc.r.a(e11);
    }
}
