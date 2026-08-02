package ru.ozon.app.android.pdp.view.photo360.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.view.photo360.data.Photo360ContentDataSet", f = "Photo360ContentDataSet.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "loadInitialState")
/* loaded from: classes13.dex */
final class Photo360ContentDataSet$loadInitialState$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Photo360ContentDataSet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ContentDataSet$loadInitialState$1(Photo360ContentDataSet photo360ContentDataSet, d<? super Photo360ContentDataSet$loadInitialState$1> dVar) {
        super(dVar);
        this.this$0 = photo360ContentDataSet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.loadInitialState(this);
    }
}
