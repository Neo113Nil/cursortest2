package oe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationProviderImp", f = "LocationProviderImp.kt", l = {184}, m = "requestLocationUpdatesOneCall-IoAF18A")
/* loaded from: classes3.dex */
final class u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f78247d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f78248e;

    /* renamed from: f, reason: collision with root package name */
    int f78249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78248e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78247d = obj;
        this.f78249f |= LinearLayoutManager.INVALID_OFFSET;
        Object b11 = o.b(this.f78248e, this);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Sc.r.a(b11);
    }
}
