package ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.presentation;

import ET.a;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.data.ToursBookInformerDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.data.ToursBookInformerMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.di.ToursBookInformerComponent;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/di/ToursBookInformerComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/data/ToursBookInformerDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerVO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerWidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/data/ToursBookInformerDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/data/ToursBookInformerMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/data/ToursBookInformerMapper;", "mapper", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursBookInformerViewMapper extends OverlayWidgetScreenViewItemMapper2<ToursBookInformerComponent, ToursBookInformerDTO, ToursBookInformerVO> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewGroupExtKt.inflate(parent, R$layout.widget_tours_book_informer);
    }

    private final ToursBookInformerMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ToursBookInformerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ToursBookInformerComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public ToursBookInformerWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ToursBookInformerWidgetViewHolder(container, new a(1));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ToursBookInformerVO> map(@NotNull ToursBookInformerDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
