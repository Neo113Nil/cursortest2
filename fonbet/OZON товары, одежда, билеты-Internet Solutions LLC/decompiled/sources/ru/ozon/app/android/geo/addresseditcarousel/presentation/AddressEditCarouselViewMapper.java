package ru.ozon.app.android.geo.addresseditcarousel.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.addresseditcarousel.data.AddressEditCarouselDTO;
import ru.ozon.app.android.geo.addresseditcarousel.di.AddressEditCarouselWidgetComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR2\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R2\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO;", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO;", "Lru/ozon/app/android/geo/addresseditcarousel/di/AddressEditCarouselWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addresseditcarousel/di/AddressEditCarouselWidgetComponent;)V", "Lru/ozon/app/android/geo/addresseditcarousel/di/AddressEditCarouselWidgetComponent;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditCarouselViewMapper extends WidgetViewMapper<AddressEditCarouselDTO, AddressEditCarouselVO> {

    @NotNull
    private final AddressEditCarouselWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressEditCarouselVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<AddressEditCarouselDTO, d, List<AddressEditCarouselVO>> mapper;

    public AddressEditCarouselViewMapper(@NotNull AddressEditCarouselWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = AddressEditCarouselViewMapper$mapper$1.INSTANCE;
        this.layout = R$layout.widget_address_edit_carousel;
        this.holderProducer = new AddressEditCarouselViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditCarouselVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressEditCarouselDTO, d, List<AddressEditCarouselVO>> getMapper() {
        return this.mapper;
    }
}
