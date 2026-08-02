package ru.ozon.app.android.travel.data.storage.offline;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl", f = "OfflineTravelStorageImpl.kt", l = {88, Logger.NONE}, m = "saveWidgetsState")
/* loaded from: classes2.dex */
final class OfflineTravelStorageImpl$saveWidgetsState$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$saveWidgetsState$1(OfflineTravelStorageImpl offlineTravelStorageImpl, d<? super OfflineTravelStorageImpl$saveWidgetsState$1> dVar) {
        super(dVar);
        this.this$0 = offlineTravelStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.saveWidgetsState(null, this);
    }
}
