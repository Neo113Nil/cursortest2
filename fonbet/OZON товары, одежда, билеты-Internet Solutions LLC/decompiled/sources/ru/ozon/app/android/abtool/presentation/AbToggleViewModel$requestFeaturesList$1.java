package ru.ozon.app.android.abtool.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel", f = "AbToggleViewModel.kt", l = {149, 148}, m = "requestFeaturesList")
/* loaded from: classes11.dex */
final class AbToggleViewModel$requestFeaturesList$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbToggleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleViewModel$requestFeaturesList$1(AbToggleViewModel abToggleViewModel, d<? super AbToggleViewModel$requestFeaturesList$1> dVar) {
        super(dVar);
        this.this$0 = abToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object requestFeaturesList;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        requestFeaturesList = this.this$0.requestFeaturesList(null, this);
        return requestFeaturesList;
    }
}
