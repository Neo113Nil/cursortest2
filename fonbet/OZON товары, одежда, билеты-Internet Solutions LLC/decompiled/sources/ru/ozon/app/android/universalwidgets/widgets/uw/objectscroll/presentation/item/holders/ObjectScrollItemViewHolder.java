package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders;

import CD.a;
import WZ.t;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.views.UniversalObjectItemView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/holders/ObjectScrollItemViewHolder;", "Ljk0/j;", "Ljk0/n;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemView;", "containerView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemView;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "item", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "", "maxTextHeight", "I", "getMaxTextHeight", "()I", "setMaxTextHeight", "(I)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObjectScrollItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final UniversalObjectItemView containerView;
    private UniversalObjectScrollVO.ObjectScrollNewItemVO item;
    private int maxTextHeight;

    @NotNull
    private final View.OnClickListener onClickListener;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ObjectScrollItemViewHolder(@NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull UniversalObjectItemView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.refs = refs;
        this.actionHandler = actionHandler;
        this.containerView = containerView;
        a aVar = new a(this, 2);
        this.onClickListener = aVar;
        containerView.setClickListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$1(ObjectScrollItemViewHolder objectScrollItemViewHolder, View view) {
        AtomAction action;
        UniversalObjectScrollVO.ObjectScrollNewItemVO objectScrollNewItemVO = objectScrollItemViewHolder.item;
        if (objectScrollNewItemVO == null || (action = objectScrollNewItemVO.getAction()) == null) {
            return;
        }
        objectScrollItemViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull UniversalObjectScrollVO.ObjectScrollNewItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        UniversalObjectItemView universalObjectItemView = this.containerView;
        universalObjectItemView.bindTitleSubtitle(item.getTitle(), item.getSubtitle(), this.maxTextHeight);
        BadgeHolderKt.bindOrGone(universalObjectItemView.getBadgeView(), item.getBadge(), this.actionHandler);
        this.containerView.bindImage(item.getImage(), item.getIsAdditionalInsetsNeeded());
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
