package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.UpdateHotelsManager", f = "UpdateHotelsManager.kt", l = {69, 81}, m = "downloadCards")
/* loaded from: classes4.dex */
final class UpdateHotelsManager$downloadCards$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateHotelsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateHotelsManager$downloadCards$1(UpdateHotelsManager updateHotelsManager, d<? super UpdateHotelsManager$downloadCards$1> dVar) {
        super(dVar);
        this.this$0 = updateHotelsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.downloadCards(null, null, null, null, null, null, this);
    }
}
