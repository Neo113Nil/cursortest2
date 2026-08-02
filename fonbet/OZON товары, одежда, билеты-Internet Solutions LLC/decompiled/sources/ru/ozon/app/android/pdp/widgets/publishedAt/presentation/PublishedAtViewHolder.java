package ru.ozon.app.android.pdp.widgets.publishedAt.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.texts.TextAtomWithIconHolderKt;
import ru.ozon.app.android.pdp.databinding.PdpWidgetPublishedAtBinding;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/publishedAt/presentation/PublishedAtViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/publishedAt/presentation/PublishedAtVO;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetPublishedAtBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/publishedAt/presentation/PublishedAtVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublishedAtViewHolder extends BindingWidgetViewHolder<PublishedAtVO, PdpWidgetPublishedAtBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.publishedAt.presentation.PublishedAtViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetPublishedAtBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetPublishedAtBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetPublishedAtBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetPublishedAtBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetPublishedAtBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishedAtViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PublishedAtVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomWithIconView publishedAtTav = getBinding().publishedAtTav;
        Intrinsics.checkNotNullExpressionValue(publishedAtTav, "publishedAtTav");
        TextAtomWithIconHolderKt.bindOrGone$default(publishedAtTav, item.getText(), null, 2, null);
    }
}
