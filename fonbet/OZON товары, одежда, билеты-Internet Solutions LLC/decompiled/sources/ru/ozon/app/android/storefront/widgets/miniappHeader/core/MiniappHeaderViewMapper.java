package ru.ozon.app.android.storefront.widgets.miniappHeader.core;

import B0.C2454a;
import android.content.Context;
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
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.storefront.navBar.views.MiniappHeaderView;
import ru.ozon.app.android.storefront.widgets.miniappHeader.data.MiniappHeaderDTO;
import ru.ozon.app.android.storefront.widgets.miniappHeader.di.MiniappHeaderComponent;
import ru.ozon.app.android.storefront.widgets.miniappHeader.presentation.MiniappHeaderVO;
import ru.ozon.app.android.storefront.widgets.miniappHeader.presentation.MiniappHeaderViewHolder;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/miniappHeader/core/MiniappHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/di/MiniappHeaderComponent;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/data/MiniappHeaderDTO;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/core/MiniappHeaderMapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/miniappHeader/core/MiniappHeaderMapper;", "mapper", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MiniappHeaderViewMapper extends WidgetViewMapper2<MiniappHeaderComponent, MiniappHeaderDTO, MiniappHeaderVO> {

    @NotNull
    private final Function2<View, ComposerReferences, MiniappHeaderViewHolder> holderProducer = new MiniappHeaderViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
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
            if (Intrinsics.d((String) obj, "miniappHeader")) {
                break;
            }
        }
        MiniappHeaderView miniappHeaderView = obj != null ? (MiniappHeaderView) q.f64554a.i(N.b(MiniappHeaderView.class), parent.getContext()) : null;
        if (miniappHeaderView != null) {
            return miniappHeaderView;
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new MiniappHeaderView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, MiniappHeaderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<MiniappHeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return MiniappHeaderComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public MiniappHeaderMapper getMapper() {
        return component().getMiniappHeaderMapper();
    }
}
