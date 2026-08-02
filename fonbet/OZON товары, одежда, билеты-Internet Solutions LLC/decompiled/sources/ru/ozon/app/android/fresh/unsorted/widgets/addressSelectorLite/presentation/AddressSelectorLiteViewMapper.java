package ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation;

import B0.C2454a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.data.AddressSelectorLiteDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.di.AddressSelectorLiteComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R<\u0010\u001a\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0018j\b\u0012\u0004\u0012\u00020\u0004`\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/di/AddressSelectorLiteComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/data/AddressSelectorLiteDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layoutRes", "I", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteMapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressSelectorLiteViewMapper extends WidgetViewMapper2<AddressSelectorLiteComponent, AddressSelectorLiteDTO, AddressSelectorLiteVO> {
    private final int layoutRes = R$layout.widget_address_selector_lite;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressSelectorLiteVO>> holderProducer = new AddressSelectorLiteViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Object obj;
        Intrinsics.checkNotNullParameter(parent, "parent");
        List m11 = h.m(component().getFeatureService().getStringKey(CategoryMainPageFreshPreCreateWidgetsNewConfiguration.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d((String) obj, "addressSelectorLite")) {
                break;
            }
        }
        View h11 = obj != null ? q.f64554a.h(this.layoutRes) : null;
        return h11 == null ? LayoutInflater.from(parent.getContext()).inflate(this.layoutRes, parent, false) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressSelectorLiteVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddressSelectorLiteComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AddressSelectorLiteComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AddressSelectorLiteMapper getMapper() {
        return component().getMapper();
    }
}
