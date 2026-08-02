package ru.ozon.app.android.geo.addressEditDetailV2.mapper;

import Sc.InterfaceC4008j;
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
import ru.ozon.app.android.geo.addressEditDetailV2.data.AddressEditDetailV2DTO;
import ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent;
import ru.ozon.app.android.geo.addressEditDetailV2.presentation.AddressEditDetailV2VO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R2\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/mapper/AddressEditDetailV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addressEditDetailV2/data/AddressEditDetailV2DTO;", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;", "Lru/ozon/app/android/geo/addressEditDetailV2/di/AddressEditDetailV2WidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addressEditDetailV2/di/AddressEditDetailV2WidgetComponent;)V", "Lru/ozon/app/android/geo/addressEditDetailV2/di/AddressEditDetailV2WidgetComponent;", "Lru/ozon/app/android/geo/addressEditDetailV2/mapper/AddressEditDetailV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/geo/addressEditDetailV2/mapper/AddressEditDetailV2Mapper;", "mapper", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailV2ViewMapper extends WidgetViewMapper<AddressEditDetailV2DTO, AddressEditDetailV2VO> {

    @NotNull
    private final AddressEditDetailV2WidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressEditDetailV2VO>> holderProducer;
    private final int layout;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public AddressEditDetailV2ViewMapper(@NotNull AddressEditDetailV2WidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = Sc.k.b(AddressEditDetailV2ViewMapper$mapper$2.INSTANCE);
        this.layout = R$layout.widget_address_edit_detail;
        this.holderProducer = new AddressEditDetailV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditDetailV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressEditDetailV2DTO, d, List<AddressEditDetailV2VO>> getMapper() {
        return (AddressEditDetailV2Mapper) this.mapper.getValue();
    }
}
