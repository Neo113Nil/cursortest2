package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders;

import CC.a;
import WZ.t;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.views.UniversalObjectItemAdultView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/holders/ObjectScrollAdultItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemAdultView;", "containerView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemAdultView;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "item", "navigateOrShowAdultDialog", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;)V", "onViewInVisibleBounds", "()V", "bind", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemAdultView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "", "maxTextHeight", "I", "getMaxTextHeight", "()I", "setMaxTextHeight", "(I)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObjectScrollAdultItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final UniversalObjectItemAdultView containerView;
    private UniversalObjectScrollVO.ObjectScrollNewItemVO item;
    private int maxTextHeight;

    @NotNull
    private final View.OnClickListener onClickListener;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ObjectScrollAdultItemViewHolder(@NotNull ComposerReferences refs, @NotNull AdultHandler adultHandler, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull UniversalObjectItemAdultView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.refs = refs;
        this.adultHandler = adultHandler;
        this.actionHandler = actionHandler;
        this.containerView = containerView;
        a aVar = new a(this, 2);
        this.onClickListener = aVar;
        containerView.setClickListener(aVar);
    }

    private final void navigateOrShowAdultDialog(final UniversalObjectScrollVO.ObjectScrollNewItemVO item) {
        if (item.getShouldBlur()) {
            AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, this.refs.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders.ObjectScrollAdultItemViewHolder$navigateOrShowAdultDialog$2
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    Function1 function1;
                    AtomAction action = UniversalObjectScrollVO.ObjectScrollNewItemVO.this.getAction();
                    if (action != null) {
                        function1 = this.actionHandler;
                        function1.invoke(action);
                    }
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, null, false, 12, null);
            return;
        }
        AtomAction action = item.getAction();
        if (action != null) {
            this.actionHandler.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$1(ObjectScrollAdultItemViewHolder objectScrollAdultItemViewHolder, View view) {
        UniversalObjectScrollVO.ObjectScrollNewItemVO objectScrollNewItemVO = objectScrollAdultItemViewHolder.item;
        if (objectScrollNewItemVO != null) {
            objectScrollAdultItemViewHolder.navigateOrShowAdultDialog(objectScrollNewItemVO);
        }
    }

    public final void bind(@NotNull UniversalObjectScrollVO.ObjectScrollNewItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        UniversalObjectItemAdultView universalObjectItemAdultView = this.containerView;
        universalObjectItemAdultView.bindTitleSubtitle(item.getTitle(), item.getSubtitle(), this.maxTextHeight);
        BadgeHolderKt.bindOrGone(universalObjectItemAdultView.getBadgeView(), item.getBadge(), this.actionHandler);
        universalObjectItemAdultView.bindImage(item);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        UniversalObjectScrollVO.ObjectScrollNewItemVO objectScrollNewItemVO = this.item;
        if (objectScrollNewItemVO == null || (tokenizedEvent = objectScrollNewItemVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    public final void setMaxTextHeight(int i11) {
        this.maxTextHeight = i11;
    }
}
