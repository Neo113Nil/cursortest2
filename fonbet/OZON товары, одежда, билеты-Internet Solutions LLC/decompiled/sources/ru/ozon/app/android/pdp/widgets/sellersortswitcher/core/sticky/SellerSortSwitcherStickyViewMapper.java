package ru.ozon.app.android.pdp.widgets.sellersortswitcher.core.sticky;

import A00.a;
import B90.C2618u;
import c20.r;
import d20.AbstractC6065b;
import java.lang.ref.WeakReference;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.data.SellerSortSwitcherDTO;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.di.SellerSortSwitcherComponent;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyVO;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyView;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky.SellerSortSwitcherStickyViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/core/sticky/SellerSortSwitcherStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/di/SellerSortSwitcherComponent;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/sellersortswitcher/data/SellerSortSwitcherDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;)Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/core/sticky/SellerSortSwitcherStickyViewMapper$VisibilityUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "VisibilityUpdateKey", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SellerSortSwitcherStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<SellerSortSwitcherComponent, SellerSortSwitcherDTO, SellerSortSwitcherStickyVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<VisibilityUpdateKey>> supportedUpdates = C7714v.a0(VisibilityUpdateKey.class);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/core/sticky/SellerSortSwitcherStickyViewMapper$VisibilityUpdateKey;", "LA00/a$J$a;", "", "isVisible", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VisibilityUpdateKey implements a.J.InterfaceC0007a {
        private final boolean isVisible;

        public VisibilityUpdateKey(boolean z11) {
            this.isVisible = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VisibilityUpdateKey) && this.isVisible == ((VisibilityUpdateKey) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        /* renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return C2618u.g("VisibilityUpdateKey(isVisible=", ")", this.isVisible);
        }
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        SellerSortSwitcherDTO sellerSortSwitcherDTO = state instanceof SellerSortSwitcherDTO ? (SellerSortSwitcherDTO) state : null;
        return (sellerSortSwitcherDTO != null ? sellerSortSwitcherDTO.getProduct() : null) != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<SellerSortSwitcherStickyVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new SellerSortSwitcherStickyViewHolder(container, new WeakReference(new SellerSortSwitcherStickyView(container.Z(), ViewGroupExtKt.inflate(container.Z(), R$layout.widget_seller_sort_switcher_sticky), new SellerSortSwitcherStickyViewMapper$createHolder$1(container))));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<VisibilityUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerSortSwitcherComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SellerSortSwitcherComponent.INSTANCE.create();
    }

    @Override // c20.r, I00.d
    public SellerSortSwitcherStickyVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SellerSortSwitcherStickyVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        VisibilityUpdateKey visibilityUpdateKey = update instanceof VisibilityUpdateKey ? (VisibilityUpdateKey) update : null;
        if (visibilityUpdateKey != null) {
            return SellerSortSwitcherStickyVO.copy$default(oldItem, 0L, null, null, visibilityUpdateKey.getIsVisible(), 7, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SellerSortSwitcherStickyVO> map(@NotNull SellerSortSwitcherDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getSellerSortSwitcherStickyMapper().invoke(state, info);
    }
}
