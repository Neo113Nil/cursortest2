package ru.ozon.app.android.favorites.accesscontrol.presentation.users;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.accesscontrol.presentation.ChangeAccessControlDelegate;
import ru.ozon.app.android.favorites.feature.databinding.WidgetAccessControlUserBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/accesscontrol/presentation/ChangeAccessControlDelegate;", "changeAccessControlDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/accesscontrol/presentation/ChangeAccessControlDelegate;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/ChangeAccessControlDelegate;", "Lru/ozon/app/android/favorites/feature/databinding/WidgetAccessControlUserBinding;", "binding", "Lru/ozon/app/android/favorites/feature/databinding/WidgetAccessControlUserBinding;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccessControlUserWidgetViewHolder extends k<AccessControlUserVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAccessControlUserBinding binding;

    @NotNull
    private final ChangeAccessControlDelegate changeAccessControlDelegate;

    @NotNull
    private final View containerView;
    private AccessControlUserVO item;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessControlUserWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull ChangeAccessControlDelegate changeAccessControlDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(changeAccessControlDelegate, "changeAccessControlDelegate");
        this.containerView = containerView;
        this.refs = refs;
        this.changeAccessControlDelegate = changeAccessControlDelegate;
        WidgetAccessControlUserBinding bind = WidgetAccessControlUserBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new AccessControlUserWidgetViewHolder$actionHandler$1(this)).customAnalyticHandler(AccessControlUserWidgetViewHolder$actionHandler$2.INSTANCE).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AccessControlUserVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.binding.userAvatarView.bind(C7714v.a0(item.getUser()));
        this.binding.userNameTAV.setText(item.getName());
        this.binding.userNameTAV.setSingleLine(true);
        this.binding.atomHolder.setOnAction(this.actionHandler);
        SingleAtom atomHolder = this.binding.atomHolder;
        Intrinsics.checkNotNullExpressionValue(atomHolder, "atomHolder");
        ContainerExtKt.bindOrGone$default(atomHolder, item.getAtom(), false, 2, null);
    }
}
