package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import A00.a;
import B90.C2618u;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import nD.C8463a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/di/CartButtonQuantWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewMapper$Subscription;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Subscription", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscribeQuantViewMapper extends OverlayWidgetScreenViewItemMapper2<CartButtonQuantWidgetComponent, CartButtonQuantDto, SubscribeQuantVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<Subscription>> supportedUpdates = C7714v.a0(Subscription.class);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewMapper$Subscription;", "LA00/a$J$a;", "", "isSubscribed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Subscription implements a.J.InterfaceC0007a {
        private final boolean isSubscribed;

        public Subscription(boolean z11) {
            this.isSubscribed = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Subscription) && this.isSubscribed == ((Subscription) other).isSubscribed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSubscribed);
        }

        /* renamed from: isSubscribed, reason: from getter */
        public final boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        @NotNull
        public String toString() {
            return C2618u.g("Subscription(isSubscribed=", ")", this.isSubscribed);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SubscribeQuantView(context, null, 0, 6, null);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        CartButtonQuantDto cartButtonQuantDto = state instanceof CartButtonQuantDto ? (CartButtonQuantDto) state : null;
        return (cartButtonQuantDto != null ? cartButtonQuantDto.getConfiguration() : null) instanceof CartButtonQuantDto.Configuration.SubscribeData;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<SubscribeQuantVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new SubscribeCartQuantOverlayViewHolder(container, (SubscribeQuantViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SubscribeQuantViewModel subscribeQuantViewModel = SubscribeQuantViewMapper.this.component().getSubscribeQuantViewModel();
                Intrinsics.g(subscribeQuantViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return subscribeQuantViewModel;
            }
        }).a(SubscribeQuantViewModel.class), component().getComposerNavigator(), new C8463a(0));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<Subscription>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartButtonQuantWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartButtonQuantWidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public SubscribeQuantVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SubscribeQuantVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof Subscription ? SubscribeQuantVO.copy$default(oldItem, 0L, 0L, ((Subscription) update).getIsSubscribed(), null, null, null, null, false, null, null, 1019, null) : oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SubscribeQuantVO> map(@NotNull CartButtonQuantDto state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getSubscribeMapper().invoke(state, info);
    }
}
