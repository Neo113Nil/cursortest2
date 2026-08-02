package ru.ozon.app.android.marketing.widgets.stickyLadder.core;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;
import ru.ozon.app.android.marketing.widgets.stickyLadder.core.StickyLadderViewMapper;
import ru.ozon.app.android.marketing.widgets.stickyLadder.data.StickyLadderDTO;
import ru.ozon.app.android.marketing.widgets.stickyLadder.di.StickyLadderComponent;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderVO;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderView;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderViewHolder;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/core/StickyLadderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/di/StickyLadderComponent;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/data/StickyLadderDTO;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/marketing/widgets/stickyLadder/data/StickyLadderDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;)Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/core/StickyLadderUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyLadderViewMapper extends OverlayWidgetScreenViewItemMapper2<StickyLadderComponent, StickyLadderDTO, StickyLadderVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<StickyLadderUpdate>> supportedUpdates = C7714v.a0(StickyLadderUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new StickyLadderView(context);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyLadderVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new StickyLadderViewHolder(container, (StickyLadderAsyncViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.stickyLadder.core.StickyLadderViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                StickyLadderAsyncViewModel stickyLadderAsyncViewModel = StickyLadderViewMapper.this.component().getStickyLadderAsyncViewModel();
                Intrinsics.g(stickyLadderAsyncViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return stickyLadderAsyncViewModel;
            }
        }).a(StickyLadderAsyncViewModel.class), (SellerActionPreviewProgressLadderViewModel) new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.stickyLadder.core.StickyLadderViewMapper$createHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SellerActionPreviewProgressLadderViewModel sellerActionPreviewProgressLadderViewModel = StickyLadderViewMapper.this.component().getSellerActionPreviewProgressLadderViewModel();
                Intrinsics.g(sellerActionPreviewProgressLadderViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sellerActionPreviewProgressLadderViewModel;
            }
        }).a(SellerActionPreviewProgressLadderViewModel.class), new InterfaceC6068e() { // from class: jA.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$0;
                createHolder$lambda$0 = StickyLadderViewMapper.createHolder$lambda$0((LinearLayout) viewGroup);
                return createHolder$lambda$0;
            }
        });
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<StickyLadderUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyLadderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return StickyLadderComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public StickyLadderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull StickyLadderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof StickyLadderUpdate) {
            return ((StickyLadderUpdate) update).getVo();
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyLadderVO> map(@NotNull StickyLadderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(state.mapToVo(info.d().hashCode(), info.c().a()));
    }
}
