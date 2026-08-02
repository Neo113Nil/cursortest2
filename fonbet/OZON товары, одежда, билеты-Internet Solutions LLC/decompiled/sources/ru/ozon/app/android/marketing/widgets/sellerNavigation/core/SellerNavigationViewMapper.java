package ru.ozon.app.android.marketing.widgets.sellerNavigation.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.F;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.H;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.data.SellerNavigationDTO;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.presentation.SellerNavigationVO;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.presentation.SellerNavigationViewHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/data/SellerNavigationDTO;", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationVO;", "<init>", "()V", "mapper", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "getPayload", "", "oldItem", "newItem", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerNavigationViewMapper extends WidgetViewMapper<SellerNavigationDTO, SellerNavigationVO> {

    @NotNull
    private final SellerNavigationMapper mapper = new SellerNavigationMapper();
    private final int layout = R$layout.widget_seller_navigation;

    @NotNull
    private final Function2<View, ComposerReferences, SellerNavigationViewHolder> holderProducer = SellerNavigationViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SellerNavigationVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerNavigationDTO, d, List<SellerNavigationVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull SellerNavigationVO oldItem, @NotNull SellerNavigationVO newItem) {
        boolean z11;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        boolean z12 = false;
        if (oldItem.getItems().size() == newItem.getItems().size()) {
            F w11 = C7714v.w(oldItem.getItems());
            SellerNavigationViewMapper$getPayload$1 transform = new SellerNavigationViewMapper$getPayload$1(newItem);
            Intrinsics.checkNotNullParameter(w11, "<this>");
            Intrinsics.checkNotNullParameter(transform, "transform");
            Iterator it = new H(w11, transform).iterator();
            loop0: while (true) {
                z11 = true;
                while (true) {
                    H.a aVar = (H.a) it;
                    if (!aVar.hasNext()) {
                        break loop0;
                    }
                    boolean booleanValue = ((Boolean) aVar.next()).booleanValue();
                    if (!z11 || !booleanValue) {
                        z11 = false;
                    }
                }
            }
            if (z11) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
