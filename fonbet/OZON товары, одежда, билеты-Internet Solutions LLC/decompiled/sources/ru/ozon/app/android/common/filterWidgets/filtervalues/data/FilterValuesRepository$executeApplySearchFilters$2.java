package ru.ozon.app.android.common.filterWidgets.filtervalues.data;

import Bc.r;
import Bc.w;
import io.reactivex.C;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.FilterValuesApi;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters.ApplySearchFiltersRequest;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters.ApplySearchFiltersResponse;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore.FilterValuesCellStore;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ApplyFiltersResults;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFiltersResults;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class FilterValuesRepository$executeApplySearchFilters$2 extends AbstractC7737t implements Function1<ApplySearchFiltersRequest, C<? extends ApplyFiltersResults>> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ FilterValuesRepository this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFiltersResults;", "kotlin.jvm.PlatformType", "response", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersResponse;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFiltersResults;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesRepository$executeApplySearchFilters$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ApplySearchFiltersResponse, ApplyFiltersResults> {
        final /* synthetic */ FilterValuesRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FilterValuesRepository filterValuesRepository) {
            super(1);
            this.this$0 = filterValuesRepository;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ApplyFiltersResults invoke(ApplySearchFiltersResponse response) {
            FilterValuesCellStore filterValuesCellStore;
            Intrinsics.checkNotNullParameter(response, "response");
            String url = response.getUrl();
            if (url == null) {
                url = "";
            }
            filterValuesCellStore = this.this$0.cellsStore;
            return new ApplyFiltersResults(filterValuesCellStore.getSelectedIds(), url);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesRepository$executeApplySearchFilters$2(FilterValuesRepository filterValuesRepository, String str) {
        super(1);
        this.this$0 = filterValuesRepository;
        this.$actionId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApplyFiltersResults invoke$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ApplyFiltersResults) function1.invoke(p02);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends ApplyFiltersResults> invoke(ApplySearchFiltersRequest it) {
        FilterValuesApi filterValuesApi;
        Intrinsics.checkNotNullParameter(it, "it");
        filterValuesApi = this.this$0.filterValuesApi;
        w j11 = filterValuesApi.applyFilters(this.$actionId, it).j(Mc.a.b());
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        return new r(j11, new o() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.data.a
            @Override // qc.o
            public final Object apply(Object obj) {
                ApplyFiltersResults invoke$lambda$0;
                invoke$lambda$0 = FilterValuesRepository$executeApplySearchFilters$2.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        });
    }
}
