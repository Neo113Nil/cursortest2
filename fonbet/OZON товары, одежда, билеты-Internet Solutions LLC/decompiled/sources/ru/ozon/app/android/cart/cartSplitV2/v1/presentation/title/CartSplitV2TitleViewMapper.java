package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title;

import DR.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
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
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.decoration.CartSplitRoundedDecoration;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleVO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.DaggerCartSplitV2TitleWidgetComponent;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.feature.R$layout;
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;
import ru.ozon.app.android.cart.ui.thermometer.presentation.mapper.ThermometerMoleculeMapperKt;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\t\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u0013\u0010\t\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\t\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0017¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R6\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060(j\u0002`)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R<\u00107\u001a$\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000405j\b\u0012\u0004\u0012\u00020\u0004`60'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010-¨\u00069"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/di/CartSplitV2TitleWidgetComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;Ljava/lang/String;)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "", "widgetId", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;J)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO$Header$AdditionalAction;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "itemSeparatorConfig", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2TitleViewMapper extends WidgetViewMapper2<CartSplitV2TitleWidgetComponent, CartSplitV2DTO, CartSplitV2TitleVO> {
    private CartSplitV2DTO.SeparatorConfig itemSeparatorConfig;

    @NotNull
    private final Function2<CartSplitV2DTO, d, List<CartSplitV2TitleVO>> mapper = new CartSplitV2TitleViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_cart_split_v2_title;

    @NotNull
    private final Function2<View, ComposerReferences, k<CartSplitV2TitleVO>> holderProducer = new CartSplitV2TitleViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final CartSplitV2TitleVO toVO(CartSplitV2DTO cartSplitV2DTO, String str) {
        long hashCode = str.hashCode();
        CartSplitV2DTO.Header header = cartSplitV2DTO.getHeader();
        return new CartSplitV2TitleVO(hashCode, header != null ? toVO(header, hashCode) : null, cartSplitV2DTO.getItemSeparatorConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartSplitV2TitleWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerCartSplitV2TitleWidgetComponent.factory().create((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (CartComponentApi) c7475g.getComponent(CartComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CartSplitV2DTO) && ((CartSplitV2DTO) state).getHeader() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new CartSplitRoundedDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CartSplitV2TitleVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CartSplitV2DTO, d, List<CartSplitV2TitleVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @SuppressLint({"WidgetViewMapper2WithDaggerComponent"})
    @NotNull
    public C7473e<CartSplitV2TitleWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CartSplitV2TitleWidgetComponent.class), new a(storage, 12));
    }

    private final CartSplitV2TitleVO.Header toVO(CartSplitV2DTO.Header header, long j11) {
        ArrayList arrayList;
        TextAtom title = header.getTitle();
        TextAtom subtitle = header.getSubtitle();
        List<Badge> badges = header.getBadges();
        if (badges != null) {
            List<Badge> list = badges;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BadgeMapperKt.mapToDsBadge((Badge) it.next()));
            }
        } else {
            arrayList = null;
        }
        CartSplitV2DTO.Header.AdditionalAction additionalAction = header.getAdditionalAction();
        CartSplitV2TitleVO.Header.AdditionalAction vo = additionalAction != null ? toVO(additionalAction) : null;
        ThermometerMoleculeDTO thermometerMolecule = header.getThermometerMolecule();
        ThermometerMoleculeVO vo2 = thermometerMolecule != null ? ThermometerMoleculeMapperKt.toVO(thermometerMolecule, j11) : null;
        Boolean disableRounding = header.getDisableRounding();
        return new CartSplitV2TitleVO.Header(title, subtitle, arrayList, vo, vo2, disableRounding != null ? disableRounding.booleanValue() : false);
    }

    private final CartSplitV2TitleVO.Header.AdditionalAction toVO(CartSplitV2DTO.Header.AdditionalAction additionalAction) {
        return new CartSplitV2TitleVO.Header.AdditionalAction(additionalAction.getButton(), additionalAction.getTintColor());
    }
}
