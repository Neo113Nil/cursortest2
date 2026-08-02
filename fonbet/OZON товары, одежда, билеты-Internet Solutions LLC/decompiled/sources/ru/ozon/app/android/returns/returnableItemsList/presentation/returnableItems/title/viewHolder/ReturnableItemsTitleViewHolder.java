package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewHolder;

import Ar.d;
import DN.a;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewObject.Title;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewObject.TitleVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/TitleVO;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleView;", "returnableItemsTitleView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "<init>", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;)V", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;", "subtitle", "", "bindSubtitle", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleView;Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/TitleVO;Ll20/d;)V", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleView;", "getReturnableItemsTitleView", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleView;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "getOneTimePostRefreshHandler", "()Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/TitleVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "titleClickListener", "Landroid/view/View$OnClickListener;", "subtitleClickListener", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemsTitleViewHolder extends k<TitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private TitleVO item;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReturnableItemsTitleView returnableItemsTitleView;

    @NotNull
    private final View.OnClickListener subtitleClickListener;

    @NotNull
    private final View.OnClickListener titleClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnableItemsTitleViewHolder(@NotNull ReturnableItemsTitleView returnableItemsTitleView, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler) {
        super(returnableItemsTitleView);
        Intrinsics.checkNotNullParameter(returnableItemsTitleView, "returnableItemsTitleView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        this.returnableItemsTitleView = returnableItemsTitleView;
        this.refs = refs;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReturnableItemsTitleViewHolder$actionHandler$1(oneTimePostRefreshHandler)).buildHandler();
        d dVar = new d(this, 15);
        this.titleClickListener = dVar;
        a aVar = new a(this, 12);
        this.subtitleClickListener = aVar;
        returnableItemsTitleView.getTitleTv().setOnClickListener(dVar);
        returnableItemsTitleView.getSubtitleTv().setOnClickListener(aVar);
        returnableItemsTitleView.getSubtitleIconIv().setOnClickListener(aVar);
    }

    private final void bindSubtitle(ReturnableItemsTitleView returnableItemsTitleView, Title title) {
        TextAtomHolderKt.bind$default(returnableItemsTitleView.getSubtitleTv(), title.getText(), null, 2, null);
        ImageViewExtKt.loadImageOrGone(returnableItemsTitleView.getSubtitleIconIv(), title.getIcon());
        AppCompatImageView subtitleIconIv = returnableItemsTitleView.getSubtitleIconIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = returnableItemsTitleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(subtitleIconIv, styleParser.parseColor(context, title.getText().getTextColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subtitleClickListener$lambda$2(ReturnableItemsTitleViewHolder returnableItemsTitleViewHolder, View view) {
        Title subtitle;
        AtomActionDTO action;
        AtomAction atomAction;
        TitleVO titleVO = returnableItemsTitleViewHolder.item;
        if (titleVO == null || (subtitle = titleVO.getSubtitle()) == null || (action = subtitle.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return;
        }
        returnableItemsTitleViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void titleClickListener$lambda$0(ReturnableItemsTitleViewHolder returnableItemsTitleViewHolder, View view) {
        Title title;
        AtomActionDTO action;
        AtomAction atomAction;
        TitleVO titleVO = returnableItemsTitleViewHolder.item;
        if (titleVO == null || (title = titleVO.getTitle()) == null || (action = title.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return;
        }
        returnableItemsTitleViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TitleVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        ReturnableItemsTitleView returnableItemsTitleView = this.returnableItemsTitleView;
        TextAtomHolderKt.bind$default(returnableItemsTitleView.getTitleTv(), item.getTitle().getText(), null, 2, null);
        bindSubtitle(returnableItemsTitleView, item.getSubtitle());
    }
}
