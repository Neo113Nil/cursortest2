package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import cp.a;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data.TotalStickyV3DTO;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonDTO;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewMapper;", "Lc20/r;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/di/TotalStickyV3Component;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/di/TotalStickyV3Component;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/di/TotalStickyV3Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3StateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV3ViewMapper extends r<TotalStickyV3DTO, TotalStickyV3VO> {

    @NotNull
    private final TotalStickyV3Component component;

    @NotNull
    private final List<Class<TotalStickyV3StateUpdate>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public TotalStickyV3ViewMapper(@NotNull TotalStickyV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(TotalStickyV3StateUpdate.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new TotalStickyV3View(context, null, 0, 6, null);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TotalStickyV3VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new TotalStickyV3ViewHolder(this.component.getGetReferrerValueController(), container, (TotalStickyV3ViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalStickyV3Component totalStickyV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalStickyV3Component = TotalStickyV3ViewMapper.this.component;
                TotalStickyV3ViewModel viewModel = totalStickyV3Component.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(TotalStickyV3ViewModel.class), this.component.getTokenizedAnalytics(), (TotalVisibilityViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalStickyV3Component totalStickyV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalStickyV3Component = TotalStickyV3ViewMapper.this.component;
                TotalVisibilityViewModel totalVisibilityViewModel = totalStickyV3Component.getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class), (CreateAndPayViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewMapper$createHolder$$inlined$viewModel$3
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalStickyV3Component totalStickyV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalStickyV3Component = TotalStickyV3ViewMapper.this.component;
                CreateAndPayViewModel createAndPayViewModel = totalStickyV3Component.getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), this.component.getAppType(), this.component.getCustomActionHandlersStoreFactory(), new a(), this.component.getAsyncCartViewModelProvider().get(container.b0(), this.component.getComposerWidgetComponentStorage()));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<TotalStickyV3StateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public TotalStickyV3VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TotalStickyV3VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof TotalStickyV3StateUpdate)) {
            return null;
        }
        TotalStickyV3DTO updatedDTO = ((TotalStickyV3StateUpdate) update).getUpdatedDTO();
        CellDTO additionalInfo = updatedDTO.getAdditionalInfo();
        TotalButtonDTO totalButton = updatedDTO.getTotalButton();
        Boolean showRoundedHeader = updatedDTO.getShowRoundedHeader();
        return TotalStickyV3VO.copy$default(oldItem, 0L, additionalInfo, totalButton, showRoundedHeader != null ? showRoundedHeader.booleanValue() : false, null, null, null, 113, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TotalStickyV3VO> map(@NotNull TotalStickyV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
