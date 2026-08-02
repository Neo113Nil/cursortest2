package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel", f = "HotelsMapInfoV4ViewModel.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "syncPolygonsState")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$syncPolygonsState$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$syncPolygonsState$1(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, d<? super HotelsMapInfoV4ViewModel$syncPolygonsState$1> dVar) {
        super(dVar);
        this.this$0 = hotelsMapInfoV4ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object syncPolygonsState;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        syncPolygonsState = this.this$0.syncPolygonsState(null, this);
        return syncPolygonsState;
    }
}
