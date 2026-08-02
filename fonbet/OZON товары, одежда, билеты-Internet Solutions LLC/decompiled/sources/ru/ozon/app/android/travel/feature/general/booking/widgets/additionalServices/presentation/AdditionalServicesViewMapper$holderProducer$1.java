package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import a00.h;
import a00.j;
import android.view.View;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.di.AdditionalServicesComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.view.AdditionalServicesView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesWidgetViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AdditionalServicesViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AdditionalServicesWidgetViewHolder> {
    final /* synthetic */ AdditionalServicesViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewMapper$holderProducer$1(AdditionalServicesViewMapper additionalServicesViewMapper) {
        super(2);
        this.this$0 = additionalServicesViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AdditionalServicesWidgetViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        h viewModelOwnerProvider = composerReferences.getViewModelOwnerProvider();
        return new AdditionalServicesWidgetViewHolder((AdditionalServicesView) view, composerReferences, (AdditionalServicesViewModel) ((w0) j.a(viewModelOwnerProvider.a(), N.b(AdditionalServicesViewModel.class), new C(this.this$0.component()) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewMapper$holderProducer$1.1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((AdditionalServicesComponent) this.receiver).getViewModel();
            }
        }).getValue()), this.this$0.component().getTokenizedAnalytics());
    }
}
