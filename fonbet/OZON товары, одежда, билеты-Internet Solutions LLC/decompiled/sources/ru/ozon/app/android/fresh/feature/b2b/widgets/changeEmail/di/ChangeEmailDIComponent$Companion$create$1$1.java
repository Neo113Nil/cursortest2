package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ChangeEmailRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/di/ChangeEmailDIComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/di/ChangeEmailDIComponent;", "Lretrofit2/Retrofit;", "retrofit$delegate", "LSc/j;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailMapper;", "mapper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailRepository;", "changeEmailRepository$delegate", "getChangeEmailRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailRepository;", "changeEmailRepository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel;", "changeEmailViewModel$delegate", "getChangeEmailViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel;", "changeEmailViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailDIComponent$Companion$create$1$1 implements ChangeEmailDIComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j retrofit;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ChangeEmailDIComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: changeEmailRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j changeEmailRepository = k.b(new ChangeEmailDIComponent$Companion$create$1$1$changeEmailRepository$2(this));

    /* renamed from: changeEmailViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j changeEmailViewModel = k.b(new ChangeEmailDIComponent$Companion$create$1$1$changeEmailViewModel$2(this));

    ChangeEmailDIComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.retrofit = k.b(new ChangeEmailDIComponent$Companion$create$1$1$retrofit$2(c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit getRetrofit() {
        return (Retrofit) this.retrofit.getValue();
    }

    public ChangeEmailRepository getChangeEmailRepository() {
        return (ChangeEmailRepository) this.changeEmailRepository.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.di.ChangeEmailDIComponent
    public ChangeEmailViewModel getChangeEmailViewModel() {
        return (ChangeEmailViewModel) this.changeEmailViewModel.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.di.ChangeEmailDIComponent
    public ChangeEmailMapper getMapper() {
        return (ChangeEmailMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.di.ChangeEmailDIComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
