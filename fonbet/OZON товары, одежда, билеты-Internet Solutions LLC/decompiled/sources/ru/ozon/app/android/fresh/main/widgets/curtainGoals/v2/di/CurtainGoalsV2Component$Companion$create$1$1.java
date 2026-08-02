package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Ts.C4048a;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.api.CurtainGoalsApi;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsV2Mapper;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/di/CurtainGoalsV2Component$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/di/CurtainGoalsV2Component;", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2Mapper;", "mapper", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsApi;", "getCurtainGoalsApi", "()Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/api/CurtainGoalsApi;", "curtainGoalsApi", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurtainGoalsV2Component$Companion$create$1$1 implements CurtainGoalsV2Component {
    final /* synthetic */ C7475g $storage;
    private final a<CurtainGoalsViewModel> viewModelProvider = new C4048a(this, 1);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CurtainGoalsV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    CurtainGoalsV2Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurtainGoalsViewModel viewModelProvider$lambda$0(CurtainGoalsV2Component$Companion$create$1$1 curtainGoalsV2Component$Companion$create$1$1) {
        return new CurtainGoalsViewModel(curtainGoalsV2Component$Companion$create$1$1.getCurtainGoalsApi());
    }

    public CurtainGoalsApi getCurtainGoalsApi() {
        Object create = ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getRetrofit().create(CurtainGoalsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (CurtainGoalsApi) create;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2Component
    public CurtainGoalsV2Mapper getMapper() {
        return (CurtainGoalsV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2Component
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2Component
    public a<CurtainGoalsViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
