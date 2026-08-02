package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.R$drawable;
import ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.EmptyGalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3EmptyStateViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV3.utils.GalleryV3ItemsDetectorExt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR2\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R,\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3EmptyStateViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/EmptyGalleryV3VO;", "Lru/ozon/app/android/pdp/widgets/galleryV3/utils/GalleryV3ItemsDetectorExt;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Landroid/view/ViewGroup;", "parent", "Landroid/widget/ImageView;", "createView", "(Landroid/view/ViewGroup;)Landroid/widget/ImageView;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3EmptyStateViewHolder;", "holderProducer", "getHolderProducer", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV3EmptyStateViewMapper extends WidgetViewMapper2 implements GalleryV3ItemsDetectorExt {
    private final Integer layout;

    @NotNull
    private final Function2<GalleryV3DTO, d, List<EmptyGalleryV3VO>> mapper = GalleryV3EmptyStateViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, GalleryV3EmptyStateViewHolder> holderProducer = GalleryV3EmptyStateViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        GalleryV3DTO galleryV3DTO = state instanceof GalleryV3DTO ? (GalleryV3DTO) state : null;
        if (galleryV3DTO != null) {
            return isEmpty(galleryV3DTO);
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, GalleryV3EmptyStateViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<GalleryV3DTO, d, List<EmptyGalleryV3VO>> getMapper() {
        return this.mapper;
    }

    public boolean isEmpty(@NotNull GalleryV3DTO galleryV3DTO) {
        return GalleryV3ItemsDetectorExt.DefaultImpls.isEmpty(this, galleryV3DTO);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ImageView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ImageView imageView = new ImageView(parent.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, UiExtKt.toPx(312)));
        ViewExtKt.updatePadding$default(imageView, 0, UiExtKt.toPx(16), 0, 0, 13, null);
        imageView.setImageResource(R$drawable.ic_gallery_placeholder);
        return imageView;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
