package ru.ozon.app.android.geo.addressBookBar.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.addressBookBar.data.AddressBookBarDTO;
import ru.ozon.app.android.geo.addressBookBar.di.AddressBookBarComponent;
import ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarVO;
import ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarWidgetViewHolder;
import ru.ozon.app.android.geo.addressBookBar.presentation.view.AddressBookBarView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/AddressBookBarViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "component", "Lru/ozon/app/android/geo/addressBookBar/di/AddressBookBarComponent;", "<init>", "(Lru/ozon/app/android/geo/addressBookBar/di/AddressBookBarComponent;)V", "mapper", "Lru/ozon/app/android/geo/addressBookBar/mapper/AddressBookBarMapper;", "getMapper", "()Lru/ozon/app/android/geo/addressBookBar/mapper/AddressBookBarMapper;", "layout", "", "getLayout", "()Ljava/lang/Void;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarWidgetViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "createView", "parent", "Landroid/view/ViewGroup;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarViewMapper extends WidgetViewMapper<AddressBookBarDTO, AddressBookBarVO> {

    @NotNull
    private final AddressBookBarComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, AddressBookBarWidgetViewHolder> holderProducer;
    private final Void layout;

    public AddressBookBarViewMapper(@NotNull AddressBookBarComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new AddressBookBarViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AddressBookBarView addressBookBarView = new AddressBookBarView(context, null, 0, 0, 14, null);
        addressBookBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, UiExtKt.toPx(40)));
        return addressBookBarView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressBookBarVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressBookBarDTO, d, List<AddressBookBarVO>> getMapper() {
        return this.component.getAddressBookBarMapper();
    }
}
