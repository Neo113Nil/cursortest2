package ie0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProviderFactory", f = "GeoProviderFactory.kt", l = {242}, m = "setProvider")
/* loaded from: classes7.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f66313d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7064a f66314e;

    /* renamed from: f, reason: collision with root package name */
    int f66315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C7064a c7064a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66314e = c7064a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object o11;
        this.f66313d = obj;
        this.f66315f |= LinearLayoutManager.INVALID_OFFSET;
        o11 = this.f66314e.o(null, this, null);
        return o11;
    }
}
