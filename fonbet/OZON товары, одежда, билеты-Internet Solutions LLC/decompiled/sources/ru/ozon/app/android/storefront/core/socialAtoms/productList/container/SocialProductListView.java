package ru.ozon.app.android.storefront.core.socialAtoms.productList.container;

import Vc.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponsContainerVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.service.ServiceVO;
import ru.ozon.app.android.uikit.view.recycler.decoration.EqualSpacingItemDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 =2\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r*\b\u0012\u0004\u0012\u00020\u001a0\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\r*\b\u0012\u0004\u0012\u00020\u001a0\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\r*\b\u0012\u0004\u0012\u00020\u001a0\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0012J5\u0010%\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u001e\u0010$\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!\u0012\u0004\u0012\u00020\u00170 ¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R0\u0010$\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!\u0012\u0004\u0012\u00020\u0017\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00105R@\u0010<\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0017\u0018\u00010 2\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0017\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isMoreThanOneItem", "()Z", "", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "list", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "mapToVo", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Pair;", "productsCount", "(Ljava/util/List;)Lkotlin/Pair;", "item", "", "onItemAttached", "(Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponVO;", "filterValidType", "filterUniqueId", "sortByType", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "productListDTO", "Lkotlin/Function1;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onOnProductShown", "setup", "(Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "targetView", "minimalWidth", "getAvailableRightWidthInList", "(Landroid/view/View;I)I", "horizontalPadding", "I", "getHorizontalPadding", "()I", "itemDivider", "getItemDivider", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListAdapter;", "productListAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListAdapter;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "onAction", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SocialProductListView extends RecyclerView {
    private final int horizontalPadding;
    private final int itemDivider;
    private Function1<? super Map<String, TokenizedTrackingInfo>, Unit> onOnProductShown;

    @NotNull
    private final SocialProductListAdapter productListAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialProductListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final List<CouponVO> filterUniqueId(List<CouponVO> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Integer.valueOf(((CouponVO) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<CouponVO> filterValidType(List<CouponVO> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CouponVO) obj).getType() != SocialProductListDTO.ProductListItemDTO.CouponDTO.CouponType.COUPON_TYPE_INVALID) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean isMoreThanOneItem() {
        return getChildCount() > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsVO] */
    private final List<ProductListItemVO> mapToVo(List<? extends SocialProductListDTO.ProductListItemDTO> list) {
        Pair<Integer, Integer> productsCount = productsCount(list);
        int intValue = productsCount.a().intValue();
        int intValue2 = productsCount.b().intValue();
        ViewSize viewSize = (intValue == 0 && intValue2 == 0) ? ViewSize.LARGE : ViewSize.SMALL;
        ViewSize viewSize2 = (intValue >= 2 || intValue2 >= 2) ? ViewSize.SMALL : ViewSize.LARGE;
        ArrayList arrayList = new ArrayList();
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            r5 = null;
            ServiceVO serviceVO = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof SocialProductListDTO.ProductListItemDTO.AllProductsDTO) {
                serviceVO = ProductListItemMapperKt.toVo((SocialProductListDTO.ProductListItemDTO.AllProductsDTO) next, viewSize);
            } else if (next instanceof SocialProductListDTO.ProductListItemDTO.ProductDTO) {
                serviceVO = ProductListItemMapperKt.toVo((SocialProductListDTO.ProductListItemDTO.ProductDTO) next, viewSize2);
            } else if (next instanceof SocialProductListDTO.ProductListItemDTO.ServiceDTO) {
                serviceVO = ProductListItemMapperKt.toVO((SocialProductListDTO.ProductListItemDTO.ServiceDTO) next, viewSize2);
            } else if (next instanceof SocialProductListDTO.ProductListItemDTO.CouponDTO) {
                arrayList.add(ProductListItemMapperKt.toVO((SocialProductListDTO.ProductListItemDTO.CouponDTO) next));
            }
            if (serviceVO != null) {
                arrayList2.add(serviceVO);
            }
        }
        ArrayList W02 = C7714v.W0(arrayList2);
        List<CouponVO> sortByType = sortByType(filterUniqueId(filterValidType(arrayList)));
        if (!sortByType.isEmpty()) {
            CouponVO couponVO = (CouponVO) C7714v.M(sortByType);
            W02.add(W02.size() > 0 ? 1 : 0, new CouponsContainerVO(sortByType, couponVO != null ? couponVO.getAction() : null, couponVO != null ? couponVO.getTrackingInfo() : null, null, null, 24, null));
        }
        return W02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemAttached(ProductListItemVO item) {
        Function1<? super Map<String, TokenizedTrackingInfo>, Unit> function1;
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null || (function1 = this.onOnProductShown) == null) {
            return;
        }
        function1.invoke(trackingInfo);
    }

    private final Pair<Integer, Integer> productsCount(List<? extends SocialProductListDTO.ProductListItemDTO> list) {
        int i11 = 0;
        int i12 = 0;
        for (SocialProductListDTO.ProductListItemDTO productListItemDTO : list) {
            if (productListItemDTO instanceof SocialProductListDTO.ProductListItemDTO.CouponDTO) {
                i11++;
            } else if ((productListItemDTO instanceof SocialProductListDTO.ProductListItemDTO.ServiceDTO) || (productListItemDTO instanceof SocialProductListDTO.ProductListItemDTO.ProductDTO)) {
                i12++;
            }
        }
        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private final List<CouponVO> sortByType(List<CouponVO> list) {
        return C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView$sortByType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(((CouponVO) t2).getType(), ((CouponVO) t11).getType());
            }
        }, list);
    }

    public int getAvailableRightWidthInList(@NotNull View targetView, int minimalWidth) {
        int i11;
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int measuredWidth = getMeasuredWidth() - (this.horizontalPadding * 2);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Intrinsics.f(childAt);
            if (!childAt.equals(targetView)) {
                measuredWidth -= childAt.getMeasuredWidth();
                i11 = this.itemDivider;
                if (i12 != 0) {
                    i11 *= 2;
                }
            } else if (isMoreThanOneItem()) {
                i11 = this.itemDivider;
            }
            measuredWidth -= i11;
        }
        return Math.max(minimalWidth, measuredWidth);
    }

    protected final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    protected final int getItemDivider() {
        return this.itemDivider;
    }

    public final Function1<AtomAction, Unit> getOnAction() {
        return this.productListAdapter.getOnAction();
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.productListAdapter.setOnAction(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setup(@NotNull SocialProductListDTO productListDTO, @NotNull Function1<? super Map<String, TokenizedTrackingInfo>, Unit> onOnProductShown) {
        Intrinsics.checkNotNullParameter(productListDTO, "productListDTO");
        Intrinsics.checkNotNullParameter(onOnProductShown, "onOnProductShown");
        this.onOnProductShown = onOnProductShown;
        Function1<AtomAction, Unit> onAction = getOnAction();
        if (onAction != null) {
            onAction.invoke(new AtomAction.ViewAction(productListDTO.getTrackingInfo(), null, 2, 0 == true ? 1 : 0));
        }
        this.productListAdapter.setup(K.f71697a);
        this.productListAdapter.setup(mapToVo(productListDTO.getItems()));
    }

    public /* synthetic */ SocialProductListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialProductListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16);
        this.horizontalPadding = px;
        int px2 = ResourceExtKt.toPx(4);
        this.itemDivider = px2;
        SocialProductListAdapter socialProductListAdapter = new SocialProductListAdapter(new SocialProductListView$productListAdapter$1(this));
        this.productListAdapter = socialProductListAdapter;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        addItemDecoration(new EqualSpacingItemDecoration(px2, false, 0, 6, null));
        setAdapter(socialProductListAdapter);
        setClipToPadding(false);
        RecyclerView.l itemAnimator = getItemAnimator();
        Intrinsics.g(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((C) itemAnimator).setSupportsChangeAnimations(false);
        ViewExtKt.updatePadding$default(this, px, 0, px, 0, 10, null);
    }
}
