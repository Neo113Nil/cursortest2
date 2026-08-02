package ru.ozon.app.android.partpayment.formpage.data.autocomplete;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000b\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteDTO$Value;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteDTO;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MaskAutocompleteRepository$getAutocompleteSuggest$1$1 extends AbstractC7737t implements Function1<MaskAutocompleteDTO, List<? extends MaskAutocompleteDTO.Value>> {
    public static final MaskAutocompleteRepository$getAutocompleteSuggest$1$1 INSTANCE = new MaskAutocompleteRepository$getAutocompleteSuggest$1$1();

    MaskAutocompleteRepository$getAutocompleteSuggest$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<MaskAutocompleteDTO.Value> invoke(MaskAutocompleteDTO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFieldValues();
    }
}
