package ru.ozon.app.android.fresh.feature.entry.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.entry.data.OzonFreshTabConfigRepository", f = "OzonFreshTabConfigRepository.kt", l = {20}, m = "getTabConfig")
/* loaded from: classes12.dex */
final class OzonFreshTabConfigRepository$getTabConfig$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OzonFreshTabConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonFreshTabConfigRepository$getTabConfig$1(OzonFreshTabConfigRepository ozonFreshTabConfigRepository, d<? super OzonFreshTabConfigRepository$getTabConfig$1> dVar) {
        super(dVar);
        this.this$0 = ozonFreshTabConfigRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getTabConfig(this);
    }
}
