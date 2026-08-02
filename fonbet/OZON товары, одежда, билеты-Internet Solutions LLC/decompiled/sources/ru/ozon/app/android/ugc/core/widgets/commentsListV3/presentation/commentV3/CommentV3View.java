package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b%\u0010&*\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;", "avatar", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindAvatar", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "createViewHolder", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "comment", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;Lkotlin/jvm/functions/Function1;)V", "", "items", "bindContent", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "LSc/j;", "Lru/ozon/uni/android/atom/icon/IconView;", "avatarIconDelegate", "LSc/j;", "contentContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "", "contentViewHolders", "Ljava/util/List;", "getAvatarIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "getAvatarIcon$delegate", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentV3View;)Ljava/lang/Object;", "avatarIcon", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentV3View extends LinearLayout {

    @NotNull
    private final InterfaceC4008j<IconView> avatarIconDelegate;
    private CommentV3VO comment;

    @NotNull
    private final LinearLayout contentContainer;

    @NotNull
    private final List<CommentContentViewHolder> contentViewHolders;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.avatarIconDelegate = LazyUtilsKt.unsafeLazy(new CommentV3View$avatarIconDelegate$1(context));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.commentContentContainer);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        addView(linearLayout);
        this.contentContainer = linearLayout;
        this.contentViewHolders = new ArrayList();
        setOrientation(0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(this, dimens.getDP_16(), 0, dimens.getDP_16(), 0, 10, null);
    }

    private final void bindAvatar(CommentV3VO.AvatarVO avatar, Function1<? super AtomAction, Unit> actionHandler) {
        if (avatar == null && !this.avatarIconDelegate.isInitialized()) {
            return;
        }
        if (getAvatarIcon().getParent() == null) {
            addView(getAvatarIcon(), 0);
        }
        IconHolderKt.bindOrGone$default(getAvatarIcon(), avatar != null ? avatar.getIcon() : null, null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(getAvatarIcon(), 0L, new CommentV3View$bindAvatar$1(this, actionHandler), 1, null);
    }

    private final CommentContentViewHolder createViewHolder(CommentV3VO.Content item) {
        if (item instanceof CommentV3VO.Content.HeaderVO) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new CommentContentViewHolder.HeaderViewHolder(new CommentHeaderView(context));
        }
        if (item instanceof CommentV3VO.Content.FooterVO) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new CommentContentViewHolder.FooterViewHolder(new CommentFooterView(context2));
        }
        if (item instanceof CommentV3VO.Content.TextVO) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return new CommentContentViewHolder.TextViewHolder(new TextAtomV2View(context3, null, 0, 6, null));
        }
        if (!(item instanceof CommentV3VO.Content.ExpandableTextVO)) {
            throw new o();
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        return new CommentContentViewHolder.ExpandableTextViewHolder(new ExpandableTextAtomView(context4, null, 0, 0, 14, null));
    }

    private final IconView getAvatarIcon() {
        return this.avatarIconDelegate.getValue();
    }

    public final void bind(@NotNull CommentV3VO comment, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.comment = comment;
        ViewExtKt.updatePadding$default(this, comment.getIsNested() ? Dimens.INSTANCE.getDP_56() : Dimens.INSTANCE.getDP_16(), 0, 0, 0, 14, null);
        bindAvatar(comment.getAvatar(), actionHandler);
        bindContent(comment.getItems(), actionHandler);
    }

    public final void bindContent(@NotNull List<? extends CommentV3VO.Content> items, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        View itemView;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        LinearLayout linearLayout = this.contentContainer;
        while (this.contentViewHolders.size() > items.size()) {
            CommentContentViewHolder commentContentViewHolder = (CommentContentViewHolder) C7714v.x0(this.contentViewHolders);
            if (commentContentViewHolder != null && (itemView = commentContentViewHolder.getItemView()) != null) {
                linearLayout.removeView(itemView);
            }
        }
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CommentV3VO.Content content = (CommentV3VO.Content) obj;
            if (i11 < this.contentViewHolders.size()) {
                CommentContentViewHolder commentContentViewHolder2 = this.contentViewHolders.get(i11);
                if (commentContentViewHolder2.canBind(content)) {
                    commentContentViewHolder2.bind(content, actionHandler);
                } else {
                    linearLayout.removeView(commentContentViewHolder2.getItemView());
                    CommentContentViewHolder createViewHolder = createViewHolder(content);
                    linearLayout.addView(createViewHolder.getItemView(), i11);
                    createViewHolder.bind(content, actionHandler);
                    this.contentViewHolders.set(i11, createViewHolder);
                }
            } else {
                CommentContentViewHolder createViewHolder2 = createViewHolder(content);
                linearLayout.addView(createViewHolder2.getItemView());
                createViewHolder2.bind(content, actionHandler);
                this.contentViewHolders.add(createViewHolder2);
            }
            i11 = i12;
        }
    }
}
