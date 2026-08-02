package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Pc.a;
import a00.h;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import oO.C8674a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.flags.IsBonusExpirationRemainderComposeEnabled;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.di.BonusExpirationRemainderComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.view.BonusExpirationRemainderView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/di/BonusExpirationRemainderComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/di/BonusExpirationRemainderComponent;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/di/BonusExpirationRemainderComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderViewMapper extends r<BonusExpirationRemainderDTO, BonusExpirationRemainderVI> {

    @NotNull
    private final BonusExpirationRemainderComponent component;

    @NotNull
    private final r.a viewType;

    public BonusExpirationRemainderViewMapper(@NotNull BonusExpirationRemainderComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BonusExpirationRemainderView bonusExpirationRemainderView = new BonusExpirationRemainderView(context);
        bonusExpirationRemainderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        bonusExpirationRemainderView.setVisibility(8);
        return bonusExpirationRemainderView;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof BonusExpirationRemainderDTO) && !this.component.getFeatureChecker().isEnabled(IsBonusExpirationRemainderComposeEnabled.INSTANCE);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<BonusExpirationRemainderVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        C8674a c8674a = new C8674a();
        h a02 = container.a0();
        final a<BonusExpirationRemainderViewModel> viewModelProvider = this.component.getViewModelProvider();
        w0 a11 = new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel = (BonusExpirationRemainderViewModel) a.this.get();
                Intrinsics.g(bonusExpirationRemainderViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return bonusExpirationRemainderViewModel;
            }
        }).a(BonusExpirationRemainderViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new BonusExpirationRemainderWidgetViewHolder(container, c8674a, (BonusExpirationRemainderViewModel) a11);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<BonusExpirationRemainderVI> map(@NotNull BonusExpirationRemainderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
