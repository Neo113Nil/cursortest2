package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.ProductsInBotApi;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button.BotConfirmButtonMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/di/ProductsInBotComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/di/ProductsInBotComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/ProductsInBotViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemMapper;", "botItemMapper$delegate", "LSc/j;", "getBotItemMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemMapper;", "botItemMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonMapper;", "botConfirmButtonMapper$delegate", "getBotConfirmButtonMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonMapper;", "botConfirmButtonMapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotComponent$Companion$create$1$1 implements ProductsInBotComponent {
    private final a<ProductsInBotViewModel> viewModelProvider;

    /* renamed from: botItemMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j botItemMapper = k.b(ProductsInBotComponent$Companion$create$1$1$botItemMapper$2.INSTANCE);

    /* renamed from: botConfirmButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j botConfirmButtonMapper = k.b(ProductsInBotComponent$Companion$create$1$1$botConfirmButtonMapper$2.INSTANCE);

    ProductsInBotComponent$Companion$create$1$1(C7475g c7475g) {
        this.viewModelProvider = new Gx.a(c7475g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductsInBotViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        Object create = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getRetrofit().create(ProductsInBotApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new ProductsInBotViewModel((ProductsInBotApi) create);
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent
    public BotConfirmButtonMapper getBotConfirmButtonMapper() {
        return (BotConfirmButtonMapper) this.botConfirmButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent
    public BotItemMapper getBotItemMapper() {
        return (BotItemMapper) this.botItemMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent
    public a<ProductsInBotViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
