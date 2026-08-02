package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0012\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001b\u0010+\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b'\u0010(*\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH;", "holders", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "newButtons", "", "isRight", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "updateButtons", "(Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function2;)V", "", "getInsertIndex", "(Z)I", "Lru/ozon/uni/atoms/data/AtomDTO;", "dto", "createViewHolder", "(Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lkotlin/Function1;", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;Lkotlin/jvm/functions/Function1;)V", "LSc/j;", "Landroid/view/View;", "alignmentSeparatorDelegate", "LSc/j;", "leftControlHolders", "Ljava/util/List;", "rightControlHolders", "getAlignmentSeparator", "()Landroid/view/View;", "getAlignmentSeparator$delegate", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView;)Ljava/lang/Object;", "alignmentSeparator", "CommentFooterControlVH", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentFooterView extends LinearLayout {

    @NotNull
    private final InterfaceC4008j<View> alignmentSeparatorDelegate;

    @NotNull
    private final List<CommentFooterControlVH> leftControlHolders;

    @NotNull
    private final List<CommentFooterControlVH> rightControlHolders;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J>\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0001\u0003\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "detector", "Landroid/view/GestureDetector;", "isSingleTap", "", "currentLongTapAction", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "dto", "Lru/ozon/uni/atoms/data/AtomDTO;", "bind", "", "index", "", "isRight", "longTapAction", "actionHandler", "Lkotlin/Function1;", "resetVisualState", "IconButtonViewHolder", "ButtonViewHolder", "BadgeViewHolder", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH$BadgeViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH$ButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH$IconButtonViewHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CommentFooterControlVH {
        private AtomAction currentLongTapAction;
        private GestureDetector detector;
        private boolean isSingleTap;

        @NotNull
        private final View itemView;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH$BadgeViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "bind", "", "dto", "Lru/ozon/uni/atoms/data/AtomDTO;", "index", "", "isRight", "", "longTapAction", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "canBind", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BadgeViewHolder extends CommentFooterControlVH {
            public static final int $stable = BadgeView.$stable;

            @NotNull
            private final BadgeView badgeView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BadgeViewHolder(@NotNull BadgeView badgeView) {
                super(badgeView, null);
                Intrinsics.checkNotNullParameter(badgeView, "badgeView");
                this.badgeView = badgeView;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
            
                if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L39;
             */
            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView.CommentFooterControlVH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void bind(@NotNull AtomDTO dto, int index, boolean isRight, AtomAction longTapAction, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                super.bind(dto, index, isRight, longTapAction, actionHandler);
                if (dto instanceof BadgeDTO) {
                    BadgeView badgeView = this.badgeView;
                    ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i11 = marginLayoutParams.leftMargin;
                        int i12 = marginLayoutParams.topMargin;
                        int i13 = marginLayoutParams.rightMargin;
                        int i14 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart((index != 0 || isRight) ? Dimens.INSTANCE.getDP_4() : 0);
                        if (i11 == marginLayoutParams.leftMargin) {
                            ViewGroup.LayoutParams layoutParams2 = badgeView.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams3 = badgeView.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams4 = badgeView.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                }
                            }
                        }
                        badgeView.setLayoutParams(marginLayoutParams);
                    }
                    BadgeHolderKt.bind(this.badgeView, (BadgeDTO) dto, actionHandler);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView.CommentFooterControlVH
            public boolean canBind(@NotNull AtomDTO dto) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto instanceof BadgeDTO;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH$ButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;)V", "bind", "", "dto", "Lru/ozon/uni/atoms/data/AtomDTO;", "index", "", "isRight", "", "longTapAction", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "canBind", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ButtonViewHolder extends CommentFooterControlVH {
            public static final int $stable = ButtonV3View.$stable;

            @NotNull
            private final ButtonV3View button;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonViewHolder(@NotNull ButtonV3View button) {
                super(button, null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
            
                if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L39;
             */
            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView.CommentFooterControlVH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void bind(@NotNull AtomDTO dto, int index, boolean isRight, AtomAction longTapAction, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
                String backgroundColor;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                super.bind(dto, index, isRight, longTapAction, actionHandler);
                if (dto instanceof ButtonV3DTO) {
                    ButtonV3View buttonV3View = this.button;
                    ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i11 = marginLayoutParams.leftMargin;
                        int i12 = marginLayoutParams.topMargin;
                        int i13 = marginLayoutParams.rightMargin;
                        int i14 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart((index != 0 || isRight) ? Dimens.INSTANCE.getDP_4() : 0);
                        if (i11 == marginLayoutParams.leftMargin) {
                            ViewGroup.LayoutParams layoutParams2 = buttonV3View.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams3 = buttonV3View.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams4 = buttonV3View.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                }
                            }
                        }
                        buttonV3View.setLayoutParams(marginLayoutParams);
                    }
                    ButtonV3DTO buttonV3DTO = (ButtonV3DTO) dto;
                    ButtonV3HolderKt.bind(this.button, buttonV3DTO, actionHandler);
                    if (!Intrinsics.d(buttonV3DTO.isDisabled(), Boolean.TRUE) || (backgroundColor = buttonV3DTO.getBackgroundColor()) == null) {
                        return;
                    }
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = this.button.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer parseColor = styleParser.parseColor(context, backgroundColor);
                    if (parseColor != null) {
                        this.button.setBackColor(new Color.Solid(parseColor.intValue()));
                    }
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView.CommentFooterControlVH
            public boolean canBind(@NotNull AtomDTO dto) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto instanceof ButtonV3DTO;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH$IconButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentFooterView$CommentFooterControlVH;", "iconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;)V", "bind", "", "dto", "Lru/ozon/uni/atoms/data/AtomDTO;", "index", "", "isRight", "", "longTapAction", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "canBind", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconButtonViewHolder extends CommentFooterControlVH {
            public static final int $stable = IconButtonV3View.$stable;

            @NotNull
            private final IconButtonV3View iconButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconButtonViewHolder(@NotNull IconButtonV3View iconButton) {
                super(iconButton, null);
                Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                this.iconButton = iconButton;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
            
                if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L39;
             */
            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView.CommentFooterControlVH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void bind(@NotNull AtomDTO dto, int index, boolean isRight, AtomAction longTapAction, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
                String backgroundColor;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                super.bind(dto, index, isRight, longTapAction, actionHandler);
                if (dto instanceof IconButtonV3DTO) {
                    IconButtonV3View iconButtonV3View = this.iconButton;
                    ViewGroup.LayoutParams layoutParams = iconButtonV3View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i11 = marginLayoutParams.leftMargin;
                        int i12 = marginLayoutParams.topMargin;
                        int i13 = marginLayoutParams.rightMargin;
                        int i14 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart((index != 0 || isRight) ? Dimens.INSTANCE.getDP_4() : 0);
                        if (i11 == marginLayoutParams.leftMargin) {
                            ViewGroup.LayoutParams layoutParams2 = iconButtonV3View.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams3 = iconButtonV3View.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams4 = iconButtonV3View.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                }
                            }
                        }
                        iconButtonV3View.setLayoutParams(marginLayoutParams);
                    }
                    IconButtonV3DTO iconButtonV3DTO = (IconButtonV3DTO) dto;
                    IconButtonV3HolderKt.bind(this.iconButton, iconButtonV3DTO, actionHandler);
                    if (!Intrinsics.d(iconButtonV3DTO.isDisabled(), Boolean.TRUE) || (backgroundColor = iconButtonV3DTO.getBackgroundColor()) == null) {
                        return;
                    }
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = this.iconButton.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer parseColor = styleParser.parseColor(context, backgroundColor);
                    if (parseColor != null) {
                        this.iconButton.setBackColor(new Color.Solid(parseColor.intValue()));
                    }
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView.CommentFooterControlVH
            public boolean canBind(@NotNull AtomDTO dto) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto instanceof IconButtonV3DTO;
            }
        }

        public /* synthetic */ CommentFooterControlVH(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bind$lambda$0(CommentFooterControlVH commentFooterControlVH, View view, MotionEvent motionEvent) {
            GestureDetector gestureDetector = commentFooterControlVH.detector;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            if (!commentFooterControlVH.isSingleTap) {
                return true;
            }
            commentFooterControlVH.isSingleTap = false;
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void resetVisualState() {
            this.itemView.setPressed(false);
            this.itemView.setForeground(null);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public void bind(@NotNull AtomDTO dto, int index, boolean isRight, AtomAction longTapAction, @NotNull final Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.currentLongTapAction = longTapAction;
            if (longTapAction == null) {
                this.itemView.setOnTouchListener(null);
            } else {
                this.detector = new GestureDetector(this.itemView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentFooterView$CommentFooterControlVH$bind$1
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public void onLongPress(MotionEvent e11) {
                        AtomAction atomAction;
                        Intrinsics.checkNotNullParameter(e11, "e");
                        atomAction = CommentFooterView.CommentFooterControlVH.this.currentLongTapAction;
                        if (atomAction != null) {
                            actionHandler.invoke(atomAction);
                        }
                        CommentFooterView.CommentFooterControlVH.this.resetVisualState();
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public boolean onSingleTapUp(MotionEvent e11) {
                        Intrinsics.checkNotNullParameter(e11, "e");
                        CommentFooterView.CommentFooterControlVH.this.isSingleTap = true;
                        return true;
                    }
                });
                this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: JU.a
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean bind$lambda$0;
                        bind$lambda$0 = CommentFooterView.CommentFooterControlVH.bind$lambda$0(CommentFooterView.CommentFooterControlVH.this, view, motionEvent);
                        return bind$lambda$0;
                    }
                });
            }
        }

        public abstract boolean canBind(@NotNull AtomDTO dto);

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }

        private CommentFooterControlVH(View view) {
            this.itemView = view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.alignmentSeparatorDelegate = LazyUtilsKt.unsafeLazy(new CommentFooterView$alignmentSeparatorDelegate$1(context));
        this.leftControlHolders = new ArrayList();
        this.rightControlHolders = new ArrayList();
        setOrientation(0);
        setGravity(16);
    }

    private final CommentFooterControlVH createViewHolder(AtomDTO dto) {
        if (dto instanceof IconButtonV3DTO) {
            IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), getContext());
            if (iconButtonV3View == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
            }
            return new CommentFooterControlVH.IconButtonViewHolder(iconButtonV3View);
        }
        if (dto instanceof ButtonV3DTO) {
            ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), getContext());
            if (buttonV3View == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
            }
            return new CommentFooterControlVH.ButtonViewHolder(buttonV3View);
        }
        if (!(dto instanceof BadgeDTO)) {
            throw new IllegalArgumentException("invalid button type");
        }
        BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), getContext());
        if (badgeView == null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            badgeView = new BadgeView(context3, null, 0, 0, 14, null);
        }
        return new CommentFooterControlVH.BadgeViewHolder(badgeView);
    }

    private final View getAlignmentSeparator() {
        return this.alignmentSeparatorDelegate.getValue();
    }

    private final int getInsertIndex(boolean isRight) {
        return (isRight || !this.alignmentSeparatorDelegate.isInitialized()) ? getChildCount() : indexOfChild(getAlignmentSeparator());
    }

    private final void updateButtons(List<CommentFooterControlVH> holders, List<CommentV3DTO.Control> newButtons, boolean isRight, Function2<? super Boolean, ? super AtomAction, Unit> actionHandler) {
        AtomDTO normal;
        boolean z11;
        View itemView;
        if (newButtons == null) {
            newButtons = K.f71697a;
        }
        while (holders.size() > newButtons.size()) {
            CommentFooterControlVH commentFooterControlVH = (CommentFooterControlVH) C7714v.x0(holders);
            if (commentFooterControlVH != null && (itemView = commentFooterControlVH.getItemView()) != null) {
                removeView(itemView);
            }
        }
        int i11 = 0;
        for (Object obj : newButtons) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CommentV3DTO.Control control = (CommentV3DTO.Control) obj;
            if (!control.isSelected() || (normal = control.getSelected()) == null) {
                normal = control.getNormal();
            }
            AtomActionDTO longTapAction = control.getLongTapAction();
            AtomAction atomAction = longTapAction != null ? AtomActionMapperKt.toAtomAction(longTapAction, control.getLongTapTracking()) : null;
            if (i11 < holders.size()) {
                CommentFooterControlVH commentFooterControlVH2 = holders.get(i11);
                if (commentFooterControlVH2.canBind(normal)) {
                    z11 = isRight;
                    commentFooterControlVH2.bind(normal, i11, z11, atomAction, new CommentFooterView$updateButtons$2$1(actionHandler, control));
                } else {
                    z11 = isRight;
                    removeView(commentFooterControlVH2.getItemView());
                    CommentFooterControlVH createViewHolder = createViewHolder(normal);
                    addView(createViewHolder.getItemView(), getInsertIndex(z11));
                    commentFooterControlVH2.bind(normal, i11, z11, atomAction, new CommentFooterView$updateButtons$2$2(actionHandler, control));
                    holders.set(i11, createViewHolder);
                }
            } else {
                z11 = isRight;
                CommentFooterControlVH createViewHolder2 = createViewHolder(normal);
                addView(createViewHolder2.getItemView(), getInsertIndex(z11));
                createViewHolder2.bind(normal, i11, z11, atomAction, new CommentFooterView$updateButtons$2$3(actionHandler, control));
                holders.add(createViewHolder2);
            }
            isRight = z11;
            i11 = i12;
        }
    }

    public final void bind(@NotNull CommentV3VO.Content.FooterVO footer, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (CollectionsExtKt.isNotNullOrEmpty(footer.getRightControls()) && indexOfChild(getAlignmentSeparator()) == -1) {
            addView(getAlignmentSeparator(), this.leftControlHolders.size());
        }
        CommentFooterView$bind$onAction$1 commentFooterView$bind$onAction$1 = new CommentFooterView$bind$onAction$1(this, actionHandler);
        updateButtons(this.leftControlHolders, footer.getLeftControls(), false, commentFooterView$bind$onAction$1);
        updateButtons(this.rightControlHolders, footer.getRightControls(), true, commentFooterView$bind$onAction$1);
    }
}
