package ie0;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.wallet.WalletConstants;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient", f = "GeoProxyClient.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 364}, m = "getDisallowedCountries")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f66316d;

    /* renamed from: e, reason: collision with root package name */
    ae0.i f66317e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f66318f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ g f66319g;

    /* renamed from: h, reason: collision with root package name */
    int f66320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66319g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f66318f = obj;
        this.f66320h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f66319g.d(this);
    }
}
