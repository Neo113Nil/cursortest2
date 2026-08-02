package ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.returnableItemsList.data.dto.PaginationMobileDTO;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewObject.PaginationMobileVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR2\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/returns/returnableItemsList/di/ReturnableItemsListComponent;", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/PaginationMobileDTO;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewObject/PaginationMobileVO;", "<init>", "()V", "LA00/a;", "event", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "collectEvents", "(LA00/a;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileMapper;", "getMapper", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileMapper;", "mapper", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaginationMobileViewMapper extends WidgetViewMapper2<ReturnableItemsListComponent, PaginationMobileDTO, PaginationMobileVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<PaginationMobileVO>> holderProducer = new PaginationMobileViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final void collectEvents(a event, ComposerReferences refs) {
        if (Intrinsics.d(event, a.C2370k.f211a)) {
            refs.getController().l(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReturnableItemsListComponent widgetComponent$lambda$0(C7475g c7475g) {
        return ReturnableItemsListComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof PaginationMobileDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new PaginationMobileView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PaginationMobileVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReturnableItemsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ReturnableItemsListComponent.class), new DR.a(storage, 15));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public PaginationMobileMapper getMapper() {
        return component().getPaginationMobileMapper();
    }
}
