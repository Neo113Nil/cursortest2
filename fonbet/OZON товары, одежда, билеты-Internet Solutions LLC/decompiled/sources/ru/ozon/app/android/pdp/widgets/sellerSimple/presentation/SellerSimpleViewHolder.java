package ru.ozon.app.android.pdp.widgets.sellerSimple.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.databinding.PdpWidgetSellerSimpleBinding;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerSimple/presentation/SellerSimpleViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/sellerSimple/presentation/SellerSimpleVo;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerSimpleBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "orEmpty", "(Lru/ozon/uni/atoms/data/avatar/Avatar;)Lru/ozon/uni/atoms/data/avatar/Avatar;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/sellerSimple/presentation/SellerSimpleVo;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSimpleViewHolder extends BindingWidgetViewHolder<SellerSimpleVo, PdpWidgetSellerSimpleBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.sellerSimple.presentation.SellerSimpleViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetSellerSimpleBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetSellerSimpleBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerSimpleBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetSellerSimpleBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetSellerSimpleBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerSimpleViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.containerView = containerView;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Avatar orEmpty(Avatar avatar) {
        return avatar == null ? new Avatar(null, null, null, Avatar.Theme.THEME_TYPE_LARGE, null, null, null, 113, null) : avatar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerSimpleVo item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        binding(new SellerSimpleViewHolder$bind$1$1(item, this, item));
    }
}
