package ru.ozon.app.android.abtool.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.repository.AbVariantsRepository", f = "AbVariantsRepository.kt", l = {23}, m = "getAbVariantsIds")
/* loaded from: classes6.dex */
final class AbVariantsRepository$getAbVariantsIds$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbVariantsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbVariantsRepository$getAbVariantsIds$1(AbVariantsRepository abVariantsRepository, d<? super AbVariantsRepository$getAbVariantsIds$1> dVar) {
        super(dVar);
        this.this$0 = abVariantsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getAbVariantsIds(this);
    }
}
