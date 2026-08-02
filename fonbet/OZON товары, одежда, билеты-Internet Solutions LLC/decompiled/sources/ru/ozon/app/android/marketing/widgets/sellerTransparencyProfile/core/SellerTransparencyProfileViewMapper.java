package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.core;

import CQ.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data.SellerTransparencyProfileDTO;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.DaggerSellerTransparencyProfileComponent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.SellerTransparencyProfileComponent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerTransparencyProfileVO;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rR6\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR<\u0010\u001f\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001dj\b\u0012\u0004\u0012\u00020\u0004`\u001e0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/core/SellerTransparencyProfileViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/di/SellerTransparencyProfileComponent;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerTransparencyProfileViewMapper extends WidgetViewMapper2<SellerTransparencyProfileComponent, SellerTransparencyProfileDTO, SellerTransparencyProfileVO> {

    @NotNull
    private final Function2<SellerTransparencyProfileDTO, d, List<SellerTransparencyProfileVO>> mapper = new SellerTransparencyProfileMapper();
    private final int layout = R$layout.widget_seller_transparency_profile;

    @NotNull
    private final Function2<View, ComposerReferences, k<SellerTransparencyProfileVO>> holderProducer = new SellerTransparencyProfileViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final SellerTransparencyProfileComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSellerTransparencyProfileComponent.factory().create((SwitchingButtonComponentApi) c7475g.getComponent(SwitchingButtonComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SellerTransparencyProfileVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerTransparencyProfileDTO, d, List<SellerTransparencyProfileVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerTransparencyProfileComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SellerTransparencyProfileComponent.class), new a(storage, 8));
    }
}
