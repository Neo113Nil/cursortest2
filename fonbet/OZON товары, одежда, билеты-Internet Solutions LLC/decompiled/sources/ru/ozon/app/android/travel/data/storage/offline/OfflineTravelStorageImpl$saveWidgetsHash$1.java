package ru.ozon.app.android.travel.data.storage.offline;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl", f = "OfflineTravelStorageImpl.kt", l = {53}, m = "saveWidgetsHash")
/* loaded from: classes2.dex */
final class OfflineTravelStorageImpl$saveWidgetsHash$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$saveWidgetsHash$1(OfflineTravelStorageImpl offlineTravelStorageImpl, d<? super OfflineTravelStorageImpl$saveWidgetsHash$1> dVar) {
        super(dVar);
        this.this$0 = offlineTravelStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.saveWidgetsHash(null, this);
    }
}
