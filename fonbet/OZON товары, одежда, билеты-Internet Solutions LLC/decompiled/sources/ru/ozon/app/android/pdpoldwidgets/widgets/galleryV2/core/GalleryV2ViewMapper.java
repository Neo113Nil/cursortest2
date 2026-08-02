package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core;

import GZ.g;
import Ib.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data.GalleryV2DTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2ViewHolder;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2Wrapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Mapper;", "mapper", "LIb/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Mapper;LIb/a;LGZ/g;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Mapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Mapper;", "LIb/a;", "LGZ/g;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV2ViewMapper extends WidgetViewMapper<GalleryV2DTO, GalleryV2Wrapper> {

    @NotNull
    private final a<HandlersInhibitor> handlersInhibitor;

    @NotNull
    private final Function2<View, ComposerReferences, GalleryV2ViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final GalleryV2Mapper mapper;

    @NotNull
    private final g ozonRouter;

    public GalleryV2ViewMapper(@NotNull GalleryV2Mapper mapper, @NotNull a<HandlersInhibitor> handlersInhibitor, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.mapper = mapper;
        this.handlersInhibitor = handlersInhibitor;
        this.ozonRouter = ozonRouter;
        this.layout = R$layout.pdp_widget_product_gallery_v2;
        this.holderProducer = new GalleryV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<GalleryV2Wrapper>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<GalleryV2DTO, d, List<GalleryV2Wrapper>> getMapper() {
        return this.mapper;
    }
}
