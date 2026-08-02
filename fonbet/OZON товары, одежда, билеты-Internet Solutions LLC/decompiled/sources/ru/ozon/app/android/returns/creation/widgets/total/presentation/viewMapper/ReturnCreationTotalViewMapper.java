package ru.ozon.app.android.returns.creation.widgets.total.presentation.viewMapper;

import Wh.C4877a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationTotalBinding;
import ru.ozon.app.android.returns.creation.widgets.total.data.TotalDTO;
import ru.ozon.app.android.returns.creation.widgets.total.di.ReturnCreationTotalComponent;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewHolder.ReturnCreationTotalViewHolder;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewObject.TotalVO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewMapper/ReturnCreationTotalViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/returns/creation/widgets/total/di/ReturnCreationTotalComponent;", "Lru/ozon/app/android/returns/creation/widgets/total/data/TotalDTO;", "Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/TotalVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/returns/creation/widgets/total/data/TotalDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationTotalViewMapper extends OverlayWidgetScreenViewItemMapper2<ReturnCreationTotalComponent, TotalDTO, TotalVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(ReturnCreationTotalBinding returnCreationTotalBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout constraintLayout = returnCreationTotalBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TotalVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ReturnCreationTotalBinding inflate = ReturnCreationTotalBinding.inflate(LayoutInflater.from(container.L()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ReturnCreationTotalViewHolder(inflate, container, component().getCustomActionHandlersFactory(), new C4877a(inflate, 1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReturnCreationTotalComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReturnCreationTotalComponent.INSTANCE.create(ComposerWidgetComponentStorageKt.getContext(storage));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TotalVO> map(@NotNull TotalDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
