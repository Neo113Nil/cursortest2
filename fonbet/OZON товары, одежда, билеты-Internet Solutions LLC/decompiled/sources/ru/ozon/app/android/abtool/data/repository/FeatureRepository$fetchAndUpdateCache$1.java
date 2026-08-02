package ru.ozon.app.android.abtool.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.repository.FeatureRepository", f = "FeatureRepository.kt", l = {177, 177}, m = "fetchAndUpdateCache")
/* loaded from: classes11.dex */
final class FeatureRepository$fetchAndUpdateCache$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureRepository$fetchAndUpdateCache$1(FeatureRepository featureRepository, d<? super FeatureRepository$fetchAndUpdateCache$1> dVar) {
        super(dVar);
        this.this$0 = featureRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.fetchAndUpdateCache(this);
    }
}
