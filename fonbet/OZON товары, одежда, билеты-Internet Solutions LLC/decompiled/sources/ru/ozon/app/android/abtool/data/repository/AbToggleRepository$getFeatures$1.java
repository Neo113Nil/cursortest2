package ru.ozon.app.android.abtool.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.repository.AbToggleRepository", f = "AbToggleRepository.kt", l = {28}, m = "getFeatures")
/* loaded from: classes11.dex */
final class AbToggleRepository$getFeatures$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbToggleRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleRepository$getFeatures$1(AbToggleRepository abToggleRepository, d<? super AbToggleRepository$getFeatures$1> dVar) {
        super(dVar);
        this.this$0 = abToggleRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getFeatures(null, this);
    }
}
