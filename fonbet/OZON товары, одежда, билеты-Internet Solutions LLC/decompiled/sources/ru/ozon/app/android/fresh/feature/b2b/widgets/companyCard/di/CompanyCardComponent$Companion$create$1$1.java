package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CompanyCardRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/di/CompanyCardComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/di/CompanyCardComponent;", "Lretrofit2/Retrofit;", "retrofit$delegate", "LSc/j;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit", "LVg/d;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardRepository;", "companyCardRepository$delegate", "getCompanyCardRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardRepository;", "companyCardRepository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel;", "companyCardViewModel$delegate", "getCompanyCardViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardViewModel;", "companyCardViewModel", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompanyCardComponent$Companion$create$1$1 implements CompanyCardComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: companyCardRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j companyCardRepository = k.b(new CompanyCardComponent$Companion$create$1$1$companyCardRepository$2(this));

    /* renamed from: companyCardViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j companyCardViewModel = k.b(new CompanyCardComponent$Companion$create$1$1$companyCardViewModel$2(this));

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j retrofit;

    CompanyCardComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.retrofit = k.b(new CompanyCardComponent$Companion$create$1$1$retrofit$2(c7475g));
        this.customActionHandlersStoreFactory = k.b(new CompanyCardComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit getRetrofit() {
        return (Retrofit) this.retrofit.getValue();
    }

    public CompanyCardRepository getCompanyCardRepository() {
        return (CompanyCardRepository) this.companyCardRepository.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.di.CompanyCardComponent
    public CompanyCardViewModel getCompanyCardViewModel() {
        return (CompanyCardViewModel) this.companyCardViewModel.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.di.CompanyCardComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }
}
