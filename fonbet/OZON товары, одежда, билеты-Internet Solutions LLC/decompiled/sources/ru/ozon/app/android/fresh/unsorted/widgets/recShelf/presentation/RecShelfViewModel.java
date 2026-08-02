package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import He.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfApi;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.utils.RecShelfKeys;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/RecShelfApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/RecShelfApi;)V", "", "", "", "params", "miniapp", "", "requestRecs", "(Ljava/util/Map;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/RecShelfApi;", "LAe/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;", "_widgetUpdates", "LAe/w0;", "LAe/h;", "widgetUpdates", "LAe/h;", "getWidgetUpdates", "()LAe/h;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecShelfViewModel extends w0 {

    @NotNull
    private final Ae.w0<RecShelfState> _widgetUpdates;

    @NotNull
    private final RecShelfApi api;

    @NotNull
    private final InterfaceC2395h<RecShelfState> widgetUpdates;

    public RecShelfViewModel(@NotNull RecShelfApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        C0 b11 = E0.b(1, Integer.MAX_VALUE, null, 4);
        this._widgetUpdates = b11;
        this.widgetUpdates = C2399j.a(b11);
    }

    @NotNull
    public final InterfaceC2395h<RecShelfState> getWidgetUpdates() {
        return this.widgetUpdates;
    }

    public final void requestRecs(@NotNull Map<String, ? extends Object> params, @NotNull String miniapp) {
        Object obj;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(miniapp, "miniapp");
        Object obj2 = params.get(RecShelfKeys.GET_REC_SHELF_SKU_PARAMETER.getKey());
        if (obj2 == null || (obj = params.get(RecShelfKeys.GET_REC_SHELF_SHELF_ID_PARAMETER.getKey())) == null) {
            return;
        }
        Object obj3 = params.get(RecShelfKeys.GET_REC_SHELF_DELIVERY_SCHEME.getKey());
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new RecShelfViewModel$requestRecs$1(this, miniapp, obj2, obj3, obj, null), 2);
    }
}
