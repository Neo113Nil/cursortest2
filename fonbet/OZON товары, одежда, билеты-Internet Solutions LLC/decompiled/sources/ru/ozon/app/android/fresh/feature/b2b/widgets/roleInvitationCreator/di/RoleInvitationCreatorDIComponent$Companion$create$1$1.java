package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.RoleInvitationCreatorApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.RoleInvitationCreatorRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton.RoleInvitationCreatorSubmitMapper;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/di/RoleInvitationCreatorDIComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/di/RoleInvitationCreatorDIComponent;", "Lretrofit2/Retrofit;", "retrofit$delegate", "LSc/j;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorApi;", "api$delegate", "getApi", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorApi;", "api", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorRepository;", "repository$delegate", "getRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorRepository;", "repository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;", "viewModel", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentMapper;", "getContentMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentMapper;", "contentMapper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/submitButton/RoleInvitationCreatorSubmitMapper;", "getSubmitMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/submitButton/RoleInvitationCreatorSubmitMapper;", "submitMapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoleInvitationCreatorDIComponent$Companion$create$1$1 implements RoleInvitationCreatorDIComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j retrofit;

    /* renamed from: api$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j api = k.b(new RoleInvitationCreatorDIComponent$Companion$create$1$1$api$2(this));

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j repository = k.b(new RoleInvitationCreatorDIComponent$Companion$create$1$1$repository$2(this));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new RoleInvitationCreatorDIComponent$Companion$create$1$1$viewModel$2(this));

    RoleInvitationCreatorDIComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.retrofit = k.b(new RoleInvitationCreatorDIComponent$Companion$create$1$1$retrofit$2(c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoleInvitationCreatorApi getApi() {
        return (RoleInvitationCreatorApi) this.api.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoleInvitationCreatorRepository getRepository() {
        return (RoleInvitationCreatorRepository) this.repository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit getRetrofit() {
        return (Retrofit) this.retrofit.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.di.RoleInvitationCreatorDIComponent
    public RoleInvitationCreatorContentMapper getContentMapper() {
        return new RoleInvitationCreatorContentMapper();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.di.RoleInvitationCreatorDIComponent
    public RoleInvitationCreatorSubmitMapper getSubmitMapper() {
        return new RoleInvitationCreatorSubmitMapper();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.di.RoleInvitationCreatorDIComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.di.RoleInvitationCreatorDIComponent
    public RoleInvitationCreatorViewModel getViewModel() {
        return (RoleInvitationCreatorViewModel) this.viewModel.getValue();
    }
}
