package ru.ozon.app.android.geo.addressBookBarV2.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.addressBookBarV2.data.AddressBookBarV2DTO;
import ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarV2VO;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.RightLeftTitlesCellV2View;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/core/AddressBookBarV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addressBookBarV2/data/AddressBookBarV2DTO;", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarV2VO;", "component", "Lru/ozon/app/android/geo/addressBookBarV2/di/AddressBookBarV2Component;", "<init>", "(Lru/ozon/app/android/geo/addressBookBarV2/di/AddressBookBarV2Component;)V", "mapper", "Lru/ozon/app/android/geo/addressBookBarV2/core/AddressBookBarV2Mapper;", "getMapper", "()Lru/ozon/app/android/geo/addressBookBarV2/core/AddressBookBarV2Mapper;", "layout", "", "getLayout", "()Ljava/lang/Void;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarWidgetV2ViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "createView", "parent", "Landroid/view/ViewGroup;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressBookBarV2ViewMapper extends WidgetViewMapper<AddressBookBarV2DTO, AddressBookBarV2VO> {

    @NotNull
    private final AddressBookBarV2Component component;

    @NotNull
    private final Function2<View, ComposerReferences, AddressBookBarWidgetV2ViewHolder> holderProducer;
    private final Void layout;

    public AddressBookBarV2ViewMapper(@NotNull AddressBookBarV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new AddressBookBarV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RightLeftTitlesCellV2View rightLeftTitlesCellV2View = (RightLeftTitlesCellV2View) q.f64554a.i(N.b(RightLeftTitlesCellV2View.class), parent.getContext());
        if (rightLeftTitlesCellV2View != null) {
            return rightLeftTitlesCellV2View;
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new RightLeftTitlesCellV2View(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressBookBarV2VO>> mo614getHolderProducer() {
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
    public Function2<AddressBookBarV2DTO, d, List<AddressBookBarV2VO>> getMapper() {
        return this.component.getMapper();
    }
}
