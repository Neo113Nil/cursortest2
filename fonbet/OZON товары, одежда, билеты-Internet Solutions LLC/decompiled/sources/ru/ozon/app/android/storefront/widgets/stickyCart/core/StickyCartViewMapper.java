package ru.ozon.app.android.storefront.widgets.stickyCart.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.t;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.storefront.widgets.stickyCart.core.StickyCartViewMapper;
import ru.ozon.app.android.storefront.widgets.stickyCart.data.StickyCartDTO;
import ru.ozon.app.android.storefront.widgets.stickyCart.di.StickyCartWidgetComponent;
import ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartOverlayViewHolder;
import ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartVO;
import ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/stickyCart/core/StickyCartViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/widgets/stickyCart/di/StickyCartWidgetComponent;", "Lru/ozon/app/android/storefront/widgets/stickyCart/data/StickyCartDTO;", "Lru/ozon/app/android/storefront/widgets/stickyCart/presenatation/StickyCartVO;", "<init>", "()V", "Ll10/t;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "findBottomNavigationAnimationControllerOrNull", "(Ll10/t;)Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/stickyCart/data/StickyCartDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/storefront/widgets/stickyCart/core/StickyCartMapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/stickyCart/core/StickyCartMapper;", "mapper", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyCartViewMapper extends OverlayWidgetScreenViewItemMapper2<StickyCartWidgetComponent, StickyCartDTO, StickyCartVO> {
    private static final int rightBottomMargin = ResourceExtKt.toPx(12);

    @NotNull
    private final r.a viewType = r.a.MULTIPLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        int i11 = rightBottomMargin;
        layoutParams.rightMargin = i11;
        layoutParams.bottomMargin = i11;
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StickyCartView stickyCartView = new StickyCartView(context, null, 0, 6, null);
        stickyCartView.setLayoutParams(layoutParams);
        return stickyCartView;
    }

    private final BottomNavigationAnimationController findBottomNavigationAnimationControllerOrNull(t tVar) {
        ComponentCallbacksC5392m parentFragment;
        ComponentCallbacksC5392m b11 = tVar.b();
        InterfaceC5431s parentFragment2 = (b11 == null || (parentFragment = b11.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
        if (parentFragment2 instanceof BottomNavigationAnimationController) {
            return (BottomNavigationAnimationController) parentFragment2;
        }
        return null;
    }

    private final StickyCartMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyCartVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        BottomNavigationAnimationController findBottomNavigationAnimationControllerOrNull = findBottomNavigationAnimationControllerOrNull(container.K());
        if (findBottomNavigationAnimationControllerOrNull != null) {
            return new StickyCartOverlayViewHolder(container, component().getCartService(), findBottomNavigationAnimationControllerOrNull, new InterfaceC6068e() { // from class: ML.a
                @Override // d20.InterfaceC6068e
                public final View create(ViewGroup viewGroup) {
                    View createHolder$lambda$2;
                    createHolder$lambda$2 = StickyCartViewMapper.createHolder$lambda$2((LinearLayout) viewGroup);
                    return createHolder$lambda$2;
                }
            });
        }
        AbstractC6065b.INSTANCE.getClass();
        return AbstractC6065b.Companion.a();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyCartWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return StickyCartWidgetComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyCartVO> map(@NotNull StickyCartDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
