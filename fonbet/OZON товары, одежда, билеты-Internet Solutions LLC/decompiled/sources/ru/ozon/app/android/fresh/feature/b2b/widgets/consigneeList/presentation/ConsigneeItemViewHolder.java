package ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetConsigneeItemBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/presentation/ConsigneeItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/presentation/ConsigneeItemVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/presentation/ConsigneeItemVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onDetachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetConsigneeItemBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetConsigneeItemBinding;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConsigneeItemViewHolder extends k<ConsigneeItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetConsigneeItemBinding binding;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.presentation.ConsigneeItemViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
            invoke2(str, bundle);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(bundle, "<unused var>");
            InterfaceC7851b.a.a(ConsigneeItemViewHolder.this.references.getController(), null, null, null, null, 15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsigneeItemViewHolder(@NotNull ComposerReferences references, @NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        WidgetConsigneeItemBinding bind = WidgetConsigneeItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "consignee_added_refresh", new AnonymousClass1());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 != null) {
            c11.getParentFragmentManager().s("consignee_added_refresh");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ConsigneeItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetConsigneeItemBinding widgetConsigneeItemBinding = this.binding;
        TextAtomV2View name = widgetConsigneeItemBinding.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        TextHolderKt.bind$default(name, item.getName(), null, 2, null);
        IconButtonV3View iconButton = widgetConsigneeItemBinding.iconButton;
        Intrinsics.checkNotNullExpressionValue(iconButton, "iconButton");
        IconButtonV3HolderKt.bindOrGone(iconButton, item.getIconButton(), this.actionHandler);
        TextAtomV2View requisites = widgetConsigneeItemBinding.requisites;
        Intrinsics.checkNotNullExpressionValue(requisites, "requisites");
        TextHolderKt.bind$default(requisites, item.getRequisites(), null, 2, null);
        BadgeView badge = widgetConsigneeItemBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bind(badge, item.getBadge(), this.actionHandler);
        View separator = widgetConsigneeItemBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(item.getNeedBottomSeparator()));
    }
}
