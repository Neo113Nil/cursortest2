package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J$\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "canBind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "bind", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "HeaderViewHolder", "FooterViewHolder", "TextViewHolder", "ExpandableTextViewHolder", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$ExpandableTextViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$FooterViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$HeaderViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$TextViewHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CommentContentViewHolder {

    @NotNull
    private final View itemView;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$ExpandableTextViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "textAtomView", "Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "<init>", "(Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExpandableTextViewHolder extends CommentContentViewHolder {
        public static final int $stable = ExpandableTextAtomView.$stable;

        @NotNull
        private final ExpandableTextAtomView textAtomView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpandableTextViewHolder(@NotNull ExpandableTextAtomView textAtomView) {
            super(textAtomView, null);
            Intrinsics.checkNotNullParameter(textAtomView, "textAtomView");
            this.textAtomView = textAtomView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public void bind(@NotNull CommentV3VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            super.bind(item, actionHandler);
            CommentV3VO.Content.ExpandableTextVO expandableTextVO = item instanceof CommentV3VO.Content.ExpandableTextVO ? (CommentV3VO.Content.ExpandableTextVO) item : null;
            if (expandableTextVO != null) {
                ExpandableTextHolderKt.bind$default(this.textAtomView, expandableTextVO.getText(), null, 2, null);
            }
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public boolean canBind(@NotNull CommentV3VO.Content item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CommentV3VO.Content.ExpandableTextVO;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$FooterViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "footerView", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FooterViewHolder extends CommentContentViewHolder {

        @NotNull
        private final CommentFooterView footerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FooterViewHolder(@NotNull CommentFooterView footerView) {
            super(footerView, null);
            Intrinsics.checkNotNullParameter(footerView, "footerView");
            this.footerView = footerView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public void bind(@NotNull CommentV3VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            super.bind(item, actionHandler);
            CommentV3VO.Content.FooterVO footerVO = item instanceof CommentV3VO.Content.FooterVO ? (CommentV3VO.Content.FooterVO) item : null;
            if (footerVO != null) {
                this.footerView.bind(footerVO, actionHandler);
            }
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public boolean canBind(@NotNull CommentV3VO.Content item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CommentV3VO.Content.FooterVO;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$HeaderViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "headerView", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentHeaderView;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentHeaderView;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeaderViewHolder extends CommentContentViewHolder {

        @NotNull
        private final CommentHeaderView headerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull CommentHeaderView headerView) {
            super(headerView, null);
            Intrinsics.checkNotNullParameter(headerView, "headerView");
            this.headerView = headerView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public void bind(@NotNull CommentV3VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            super.bind(item, actionHandler);
            CommentV3VO.Content.HeaderVO headerVO = item instanceof CommentV3VO.Content.HeaderVO ? (CommentV3VO.Content.HeaderVO) item : null;
            if (headerVO != null) {
                this.headerView.bind(headerVO, actionHandler);
            }
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public boolean canBind(@NotNull CommentV3VO.Content item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CommentV3VO.Content.HeaderVO;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder$TextViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentContentViewHolder;", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextViewHolder extends CommentContentViewHolder {
        public static final int $stable = TextAtomV2View.$stable;

        @NotNull
        private final TextAtomV2View textAtomView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextViewHolder(@NotNull TextAtomV2View textAtomView) {
            super(textAtomView, null);
            Intrinsics.checkNotNullParameter(textAtomView, "textAtomView");
            this.textAtomView = textAtomView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public void bind(@NotNull CommentV3VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            super.bind(item, actionHandler);
            CommentV3VO.Content.TextVO textVO = item instanceof CommentV3VO.Content.TextVO ? (CommentV3VO.Content.TextVO) item : null;
            if (textVO != null) {
                TextHolderKt.bind$default(this.textAtomView, textVO.getText(), null, 2, null);
            }
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentContentViewHolder
        public boolean canBind(@NotNull CommentV3VO.Content item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof CommentV3VO.Content.TextVO;
        }
    }

    public /* synthetic */ CommentContentViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public void bind(@NotNull CommentV3VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.topMargin = UiExtKt.toPx(item.getTopPadding().getPx());
        marginLayoutParams.bottomMargin = UiExtKt.toPx(item.getBottomPadding().getPx());
        if (i11 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public abstract boolean canBind(@NotNull CommentV3VO.Content item);

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    private CommentContentViewHolder(View view) {
        this.itemView = view;
    }
}
