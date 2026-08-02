package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.AdditionalServicesTotalVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"additionalServicesTotalAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$ServiceItem;", "services_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServicesTotalAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AdditionalServicesTotalVO.ServiceItem>> additionalServicesTotalAdapterDelegate() {
        return new DslViewBindingListAdapterDelegate(AdditionalServicesTotalAdapterDelegateKt$additionalServicesTotalAdapterDelegate$1.INSTANCE, AdditionalServicesTotalAdapterDelegateKt$additionalServicesTotalAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, AdditionalServicesTotalAdapterDelegateKt$additionalServicesTotalAdapterDelegate$2.INSTANCE, AdditionalServicesTotalAdapterDelegateKt$additionalServicesTotalAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
