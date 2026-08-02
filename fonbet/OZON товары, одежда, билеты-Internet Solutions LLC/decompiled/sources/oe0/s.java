package oe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationProviderImp", f = "LocationProviderImp.kt", l = {90, 95}, m = "requestCurrentLocationRaw-IoAF18A")
/* loaded from: classes3.dex */
final class s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f78241d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f78242e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f78243f;

    /* renamed from: g, reason: collision with root package name */
    int f78244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78243f = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78242e = obj;
        this.f78244g |= LinearLayoutManager.INVALID_OFFSET;
        Object f7 = this.f78243f.f(this);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Sc.r.a(f7);
    }
}
