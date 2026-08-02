package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core;

import A00.a;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.di.StaticCouponListComponent;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListTearAnimationUpdate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListViewHolder;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.view.StaticCouponListView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\"\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/core/StaticCouponListViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/di/StaticCouponListComponent;", "component", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/di/StaticCouponListComponent;)V", "", "couponId", "", "needAnimateTear", "applyCouponById", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;JZ)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;)Ljava/lang/Object;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/di/StaticCouponListComponent;", "LPc/a;", "Lh20/a;", "viewModelWidgetProvider", "LPc/a;", "getViewModelWidgetProvider", "()LPc/a;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper;", "mapper", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListViewMapper extends WidgetViewMapper<StaticCouponListDTO, StaticCouponListVO> {

    @NotNull
    private final StaticCouponListComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, StaticCouponListViewHolder> holderProducer;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final Pc.a<? extends InterfaceC6786a> viewModelWidgetProvider;

    public StaticCouponListViewMapper(@NotNull StaticCouponListComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewModelWidgetProvider = component.getWidgetViewModel();
        this.supportedUpdates = C7714v.a0(StaticCouponListTearAnimationUpdate.class);
        this.holderProducer = new StaticCouponListViewMapper$holderProducer$1(this);
    }

    private final StaticCouponListVO applyCouponById(StaticCouponListVO staticCouponListVO, long j11, boolean z11) {
        List<StaticCouponListVO.ContentItem> content = staticCouponListVO.getContent();
        ArrayList arrayList = new ArrayList(C7714v.z(content, 10));
        for (Object obj : content) {
            if (obj instanceof StaticCouponListVO.ContentItem.Coupon) {
                StaticCouponListVO.ContentItem.Coupon coupon = (StaticCouponListVO.ContentItem.Coupon) obj;
                if (coupon.getId() == j11) {
                    obj = StaticCouponListVO.ContentItem.Coupon.copy$default(coupon, 0L, null, null, null, null, null, true, StaticCouponListVO.ContentItem.Coupon.Stub.copy$default(coupon.getStub(), true, null, null, null, null, null, 62, null), null, z11, 319, null);
                }
            }
            arrayList.add(obj);
        }
        return StaticCouponListVO.copy$default(staticCouponListVO, 0L, null, arrayList, null, 11, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        final float pxF = ResourceExtKt.toPxF(20, context2);
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        StaticCouponListView staticCouponListView = new StaticCouponListView(context3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        staticCouponListView.setLayoutParams(layoutParams);
        staticCouponListView.setClipToOutline(true);
        staticCouponListView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core.StaticCouponListViewMapper$createView$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), pxF);
            }
        });
        return staticCouponListView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<StaticCouponListVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.viewModelWidgetProvider;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<StaticCouponListDTO, d, List<StaticCouponListVO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull StaticCouponListVO oldItem, @NotNull StaticCouponListVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return this.component.getPayloadManager().getPayload(oldItem, newItem);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public StaticCouponListVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull StaticCouponListVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof StaticCouponListTearAnimationUpdate)) {
            return null;
        }
        StaticCouponListTearAnimationUpdate staticCouponListTearAnimationUpdate = (StaticCouponListTearAnimationUpdate) update;
        if (oldItem.getId() == staticCouponListTearAnimationUpdate.getWidgetId()) {
            return applyCouponById(oldItem, staticCouponListTearAnimationUpdate.getCouponId(), staticCouponListTearAnimationUpdate.getNeedAnimateTear());
        }
        return null;
    }
}
