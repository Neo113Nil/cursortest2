package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel", f = "AdditionalServicesViewModel.kt", l = {366}, m = "fetchWithJobsMap")
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$fetchWithJobsMap$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$fetchWithJobsMap$1(AdditionalServicesViewModel additionalServicesViewModel, d<? super AdditionalServicesViewModel$fetchWithJobsMap$1> dVar) {
        super(dVar);
        this.this$0 = additionalServicesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchWithJobsMap;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fetchWithJobsMap = this.this$0.fetchWithJobsMap(null, null, null, null, this);
        return fetchWithJobsMap;
    }
}
