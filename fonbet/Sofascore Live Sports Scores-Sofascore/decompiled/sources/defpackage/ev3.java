package defpackage;

import com.sofascore.results.country.CountryListBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ev3 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CountryListBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev3(CountryListBottomSheet countryListBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = countryListBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        CountryListBottomSheet countryListBottomSheet = this.j;
        switch (i) {
            case 0:
                return countryListBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return countryListBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return countryListBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
